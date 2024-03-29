#FROM openjdk:8-jdk
#VOLUME /tmp
#ADD target/GcpSpringDemo-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]



## Use an official Maven image as the base image
#FROM maven:3.8.4-openjdk-11-slim AS build
## Set the working directory in the container
#WORKDIR /app
## Copy the pom.xml and the project files to the container
#COPY pom.xml .
#COPY src ./src
## Build the application using Maven
#RUN mvn clean install -DskipTests
## Use an official OpenJDK image as the base image
#FROM openjdk:11-jre-slim
## Set the working directory in the container
#WORKDIR /app
## Copy the built JAR file from the previous stage to the container
#COPY --from=build /app/target/GcpSpringDemo-0.0.1.jar ./my-application.jar
## Set the command to run the application
#CMD ["java", "-jar", "./my-application.jar"]


FROM maven:3.8.4-openjdk-17-slim AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean install -DskipTests

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/GcpSpringDemo-0.0.1.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]