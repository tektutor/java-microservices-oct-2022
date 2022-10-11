FROM ubuntu:18.04
MAINTAINER Jeganathan Swaminathan <jegan@tektutor.org>

RUN apt update && apt install -y default-jdk
COPY hello.jar /hello.jar

CMD ["java","-jar", "/hello.jar"]
