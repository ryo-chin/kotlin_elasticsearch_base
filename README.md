# Usages
## setup middleware
### run sqs, mysql, elasticsearch container
```shell
$ cd docker
$ docker-compose up -d
$ docker-compose start
```
### create sqs data
run SetupTest#setupSqs

## create docker image
create by [Jib](https://github.com/GoogleContainerTools/jib)
```shell
$ ./gradlew jibDockerBuild
```
or create by Dockerfile
```shell
$ ./gradlew jar
$ docker build -t hakiba/kotlin_elasticsearch_base . --no-cache
```

## run docker iamge
```shell
$ docker run --network docker_default hakiba/kotlin_elasticsearch_base
```
