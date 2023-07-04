FROM openjdk:8
EXPOSE 8081
ADD target/example-service example-service.jar
ENTRYPOINT ["java","-jar","/example-service.jar"]