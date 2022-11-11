FROM openjdk:8-jdk-alpine
MAINTAINER Rafli <raflialfiannilofar@gmail.com>
RUN mkdir -p /app
WORKDIR /app

COPY Main.java /app

#compile file java
RUN javac Main.java

#running java
CMD ["java","Main"]
