FROM eclipse-temurin:17-jre-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} balance-service.jar
ENTRYPOINT ["java","-jar","/balance-service.jar"]