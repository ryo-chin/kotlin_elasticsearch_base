
import com.amazonaws.auth.AWSStaticCredentialsProvider
import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.client.builder.AwsClientBuilder
import com.amazonaws.services.sqs.AmazonSQSClientBuilder



fun main(args: Array<String>) {
    // build sqs client
    val endpoint = "http://localhost:9324"
    val region = "elasticmq"
    val accessKey = "x"
    val secretKey = "x"
    val sqs = AmazonSQSClientBuilder.standard()
        .withCredentials(AWSStaticCredentialsProvider(BasicAWSCredentials(accessKey, secretKey)))
        .withEndpointConfiguration(AwsClientBuilder.EndpointConfiguration(endpoint, region))
        .build()

    // deque from sqs
    val receiveMessage = sqs.receiveMessage(sqs.getQueueUrl("user").queueUrl)
    println("print ReceiveMessages")
    receiveMessage.messages.forEach { println("UserId: ${it.body}") }
}