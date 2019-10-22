# JAVA 11
ARG BASE_IMAGE=openjdk:11-slim
ARG MONGODB_HOST=mongodb
ARG MONGODB_PORT=27017

FROM $BASE_IMAGE
ENV MONGODB_HOST=$MONGODB_HOST
ENV MONGODB_PORT=$MONGODB_PORT

# copy JAR into image
COPY target/*.jar ./app.jar
# http ports
EXPOSE 8080
#set root user
USER root
# Run

CMD java -Duser.timezone=Europe/Berlin -XX:+UseSerialGC -Xss512k -XX:MaxRAM=100m -jar ./app.jar --spring.data.mongodb.host:${MONGODB_HOST} --spring.data.mongodb.port:${MONGODB_PORT}
