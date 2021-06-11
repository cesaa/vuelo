FROM openjdk:12
MAINTAINER usrdocker
USER root
ENV JAVA_HOME=/usr/java/openjdk-12
ENV TZ=America/Mexico_City
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "app.jar", "--server.port=443"]