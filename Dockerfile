FROM adoptopenjdk/openjdk11:latest
COPY . /project
WORKDIR /project
RUN chmod +x mvnw \
    && ./mvnw --version \
    && ./mvnw clean package \
    && cp ./target/demo1-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
