FROM openjdk

ADD kubernetes-springboot-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8099

RUN bash -c 'touch /app.jar'

ENTRYPOINT ["java","-jar","app.jar"]