FROM eclipse-temurin:21-jre

WORKDIR /app

COPY java-app/app.jar app.jar

ENV APP_ENV=development

ENTRYPOINT ["java", "-jar", "app.jar"]