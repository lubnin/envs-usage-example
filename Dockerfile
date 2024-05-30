FROM maven:3.9.7-eclipse-temurin-22 AS build

WORKDIR /app

COPY ./pom.xml ./pom.xml
COPY ./src ./src

RUN mvn clean package -DskipTests

FROM eclipse-temurin:22

WORKDIR /app
COPY --from=build /app/target/envs-usage-example-1.0-jar-with-dependencies.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]
