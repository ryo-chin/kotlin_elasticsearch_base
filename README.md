# Setup
## Docker Container
Build sqs, mysql, elasticsearch container and start.
```shell
$ cd docker
$ docker-compose up -d
$ docker-compose start
```
## SQS 
Create sqs data.
run SetupTest#setupSqs

## JOOQ
Create JOOQ class.
```shell
$ ./gradlew generateTablesJooqSchemaSource
```

# Application
## create Docker image
Create by [Jib](https://github.com/GoogleContainerTools/jib)
```shell
$ ./gradlew jibDockerBuild

# if you want set buildMode (default: local-jib)
$ ./gradlew -Dbuild.mode={buildMode} jibDockerBuild
```
or create by Dockerfile
```shell
$ ./gradlew jar
$ docker build -t hakiba/kotlin_elasticsearch_base . --no-cache
```

## run Docker iamge
```shell
$ docker run --network docker_default hakiba/kotlin_elasticsearch_base
```
