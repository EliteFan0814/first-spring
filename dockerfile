FROM adoptopenjdk/openjdk11:latest

WORKDIR /app

COPY target/spring-test-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

CMD ["java", "-jar","spring-test-0.0.1-SNAPSHOT.jar"]