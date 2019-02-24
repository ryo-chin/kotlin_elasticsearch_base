
import com.amazonaws.services.sqs.AmazonSQS
import com.amazonaws.services.sqs.model.DeleteMessageBatchRequest
import com.amazonaws.services.sqs.model.DeleteMessageBatchRequestEntry
import com.amazonaws.services.sqs.model.ReceiveMessageRequest
import org.junit.Assert
import org.junit.Test
import kotlin.random.Random

class SetupTest {

    @Test
    fun setupSqs() {
        val queueName = "user"
        val endpoint = "http://localhost:9324"
        val sqs = prepareSQSClient(endpoint)

        // initialize queue (if it exists, delete)
        if (sqs.getQueueUrl("user").queueUrl != null) {
            println("delete queue: $queueName")
            sqs.deleteQueue("$endpoint/queue/$queueName")
        }
        println("create queue: $queueName")
        sqs.createQueue(queueName)

        // send 1000 random id (1 ~ 10000)
        println("send message")
        List(1000) { Random.nextInt(1, 10000) }.forEach {
            sqs.sendMessage("$endpoint/queue/$queueName", it.toString())
        }
        println("send message complete")
    }

    @Test
    fun receiveAllMessageFromSqs() {
        val queueName = "user"
        val endpoint = "http://localhost:9324"
        val queueUrl = "$endpoint/queue/$queueName"
        val sqs = prepareSQSClient(endpoint)
        setupSqs()

        // check before message count
        val beforeMessageCount = fetchMessageCount(sqs, queueUrl)
        println("Before message count: $beforeMessageCount")

        val userIdList = mutableListOf<Int>()
        val userIdSet = mutableSetOf<Int>()
        var receivedAllId = false
        while(!receivedAllId) {
            // receive messages
            val receiveMessageResult = sqs.receiveMessage(
                ReceiveMessageRequest(queueUrl).apply {
                    maxNumberOfMessages = 10
                    // To prevent reference from other processes
                    visibilityTimeout = 60
                    // For long polling (prevent empty response)
                    // ref. https://docs.aws.amazon.com/ja_jp/AWSSimpleQueueService/latest/SQSDeveloperGuide/working-with-messages.html#setting-up-long-polling
                    waitTimeSeconds = 20
                }
            )
            val receivedMessages = receiveMessageResult.messages
            val receivedIdList = receivedMessages.map { Integer.parseInt(it.body) }
            println("@@@@ Receive result")
            println(receivedMessages)

            // store id
            userIdList.addAll(receivedIdList)
            userIdSet.addAll(receivedIdList)

            // delete message
            val deleteMessageBatchResult = sqs.deleteMessageBatch(
                DeleteMessageBatchRequest(
                    queueUrl,
                    receivedMessages.map { DeleteMessageBatchRequestEntry(it.messageId, it.receiptHandle) }
                )
            )
            println("@@@@ Delete result")
            println("success: ${deleteMessageBatchResult.successful}")
            println("failed: ${deleteMessageBatchResult.failed}")

            // check: received all id
            receivedAllId = receivedIdList.isEmpty()
            println("received id count: ${userIdList.size}")
            println("received unique id count: ${userIdSet.size}")
            println("receivedAllId? $receivedAllId")
        }
        println("Target UserIdList(total count: ${userIdList.size}): $userIdList")

        // Assert all message were received
        val afterMessageCount = fetchMessageCount(sqs, queueUrl)
        val receivedMessageCount = userIdList.size
        Assert.assertEquals(0, afterMessageCount)
        Assert.assertEquals(beforeMessageCount, receivedMessageCount)
    }

    private fun fetchMessageCount(sqs: AmazonSQS, queueUrl: String): Int {
        val messageCountKey = "ApproximateNumberOfMessages"
        return sqs.getQueueAttributes(
            queueUrl,
            listOf(messageCountKey)
        ).attributes[messageCountKey].runCatching { Integer.valueOf(this) }.getOrThrow()
    }
}
