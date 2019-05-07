FROM maven as builder
MAINTAINER Li Shangjin <li.shangjin@icloud.com>

WORKDIR /app
COPY . .
RUN mvn clean package -Dmaven.test.skip=true
RUN mv ./target/*.jar ./app.jar



FROM openjdk:8-jre-alpine
WORKDIR /home/admin
COPY --from=builder /app/app.jar app.jar


CMD java -jar app.jar
EXPOSE 80