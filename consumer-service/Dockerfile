FROM openjdk:8-jre
MAINTAINER Qianli Ma "ma.ql@qq.com"
ADD target/consumer-service-1.0-SNAPSHOT.jar /consumer-service.jar
ENTRYPOINT ["java","-jar","/consumer-service.jar"]
EXPOSE 9000