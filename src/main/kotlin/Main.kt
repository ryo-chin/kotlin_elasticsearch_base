
import com.amazonaws.auth.AWSStaticCredentialsProvider
import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.client.builder.AwsClientBuilder
import com.amazonaws.services.sqs.AmazonSQSClientBuilder
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
    println("Target UserIdList: $userIdList")

    // build DB Context
    val properties = Properties().apply { load(ClassLoader.getSystemClassLoader().getResourceAsStream("application.properties")) }
    val context = DSL.using(
        properties.getProperty("db.url"),
        properties.getProperty("db.user"),
        properties.getProperty("db.password"))
    // select from mysql
    val userList :List<User> = context
        .selectFrom(USERS)
        .where(USERS.ID.`in`(userIdList))
        .fetch()
        .map { User(it[USERS.ID], it[USERS.NAME]) }
    println("Target UserList: $userList")

    // bulk elasticsearch
    val client = RestHighLevelClient(
        RestClient.builder(
            HttpHost("localhost", 9200, "http"),
            HttpHost("localhost", 9300, "http")
        )
    )
    val indexRequests = userList.map { IndexRequest("user", "doc", it.id.toString()).source(it.toMap()) }
    val request = BulkRequest().apply { add(indexRequests) }
    val response = client.bulk(request, RequestOptions.DEFAULT)
    println("complete bulk: status ${response.status()}")
    client.close()
}

data class User(
    val id: Int,
    val name: String
) {
    fun toMap() : Map<String, Any> = mapOf("id" to id, "name" to name)
}