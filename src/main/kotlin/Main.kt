
import com.amazonaws.auth.AWSStaticCredentialsProvider
import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.client.builder.AwsClientBuilder
import com.amazonaws.services.sqs.AmazonSQSClientBuilder
import jooq.kotlin_elastic_db.Tables.USERS
import org.jooq.impl.DSL
import java.util.*


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
    val userIdList = sqs.receiveMessage(sqs.getQueueUrl("user").queueUrl).messages.map { Integer.parseInt(it.body) }
    println("Target User: $userIdList")

    // build DB Context
    val properties = Properties()
    properties.load(Properties::class.java.getResourceAsStream("/application.properties"))
    val context = DSL.using(
        properties.getProperty("db.url"),
        properties.getProperty("db.user"),
        properties.getProperty("db.password"))
    // select from mysql
    val userList = context
        .selectFrom(USERS)
        .where(USERS.ID.`in`(userIdList))
        .toList()
    println("Target User: $userList")

    // index elasticsearch
}