FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

# Copy the built JAR file from your Maven build
COPY payflow/target/payflow-*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
