FROM openjdk:17-jdk AS build

COPY target/estoque-0.0.1-SNAPSHOT.jar /app/app.jar

CMD ["java", "-jar", "/app/app.jar"]