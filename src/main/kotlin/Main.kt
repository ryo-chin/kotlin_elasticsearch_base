
import com.amazonaws.auth.AWSStaticCredentialsProvider
import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.client.builder.AwsClientBuilder
import com.amazonaws.services.sqs.AmazonSQS
import com.amazonaws.services.sqs.AmazonSQSClientBuilder
import com.amazonaws.services.sqs.model.*
import jooq.kotlin_elastic_db.Tables.USERS
import org.apache.http.HttpHost
import org.elasticsearch.action.bulk.BulkRequest
import org.elasticsearch.action.index.IndexRequest
import org.elasticsearch.client.RequestOptions
import org.elasticsearch.client.RestClient
import org.elasticsearch.client.RestHighLevelClient
import org.jooq.impl.DSL
import java.util.*


fun main(args: Array<String>) {
    // build sqs client
    val sqsHost = "kotlin-elastic-sqs"
    val endpoint = "http://$sqsHost:9324"
    val queueName = "user"
    val queueUrl = "$endpoint/queue/$queueName"
    val sqs = prepareSQSClient(endpoint)

    // build DB Context
    val properties = Properties().apply { load(ClassLoader.getSystemClassLoader().getResourceAsStream("application.properties")) }
    val context = DSL.using(
        properties.getProperty("db.url"),
        properties.getProperty("db.user"),
        properties.getProperty("db.password"))

    // build Elasticsearch Client
    val esHost = "kotlin-elastic-es"
    val client = RestHighLevelClient(
        RestClient.builder(
            HttpHost(esHost, 9200, "http"),
            HttpHost(esHost, 9300, "http")
        )
    )

    val targetUserIdMap = mutableMapOf<String, String>()
    try {
        // dequeue from sqs
        var receivedAllId = false
        while(!receivedAllId) {
            // receive messages
            val request = ReceiveMessageRequest(queueUrl).apply {
                maxNumberOfMessages = 10
                // To prevent reference from other processes
                visibilityTimeout = 60
                // For long polling (prevent empty response)
                // ref. https://docs.aws.amazon.com/ja_jp/AWSSimpleQueueService/latest/SQSDeveloperGuide/working-with-messages.html#setting-up-long-polling
                waitTimeSeconds = 20
            }
            val receiveResult = sqs.receiveMessage(request)

            // store id
            targetUserIdMap.putAll(receiveResult.messages.associate { it.messageId to it.body })

            // delete message
            val deleteEntryList = receiveResult.messages.map { DeleteMessageBatchRequestEntry(it.messageId, it.receiptHandle) }
            val deleteRequest = DeleteMessageBatchRequest(queueUrl, deleteEntryList)
            sqs.deleteMessageBatch(deleteRequest)

            // check: received all id
            receivedAllId = receiveResult.messages.isEmpty()
        }
        println("Target UserId: ${targetUserIdMap.values}")
        if (targetUserIdMap.isEmpty()) {
            println("Skip index, because target data does not exist.")
            return
        }

        // select from mysql
        val userIdList = targetUserIdMap.values.map { Integer.valueOf(it) }
        val userList = context
            .selectFrom(USERS)
            .where(USERS.ID.`in`(userIdList))
            .fetch()
            .map { User(
                it[USERS.ID],
                it[USERS.LAST_NAME],
                it[USERS.FIRST_NAME],
                it[USERS.GENDER],
                it[USERS.PHONE_NUMBER],
                it[USERS.EMAIL],
                it[USERS.PASSWORD]) }
            .toList()
        println("Target UserList: $userList")

        // bulk elasticsearch
        val indexRequests = userList.map { IndexRequest("user", "doc", it.id.toString()).source(it.toMap())}
        val request = BulkRequest().apply { add(indexRequests) }
        val response = client.bulk(request, RequestOptions.DEFAULT)
        println("complete bulk: status ${response.status()}")
    } catch (e: RuntimeException) {
        if (targetUserIdMap.isEmpty()) {
            return
        }
        // recovery target id
        val requestEntryList = targetUserIdMap.map { SendMessageBatchRequestEntry(it.key, it.value) }
        val request = SendMessageBatchRequest(endpoint, requestEntryList)
        sqs.sendMessageBatch(request)
    } finally {
        client.close()
    }
}

fun prepareSQSClient(endpoint: String): AmazonSQS {
    val region = "elasticmq"
    val accessKey = "x"
    val secretKey = "x"
    return AmazonSQSClientBuilder.standard()
        .withCredentials(AWSStaticCredentialsProvider(BasicAWSCredentials(accessKey, secretKey)))
        .withEndpointConfiguration(AwsClientBuilder.EndpointConfiguration(endpoint, region))
        .build()
}

data class User(
    val id: Int,
    val lastName: String,
    val firstName: String,
    val gender: String,
    val phoneNumber: String,
    val email: String,
    val password: String
) {
    fun toMap() : Map<String, Any> = mapOf(
        "id" to id,
        "lastName" to lastName,
        "firstName" to firstName,
        "gender" to gender,
        "phoneNumber" to phoneNumber,
        "email" to email,
        "password" to password)
}