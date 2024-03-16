FROM openjdk:17
VOLUME /tmp
EXPOSE 8083
COPY target/customerservice-0.0.1-SNAPSHOT.jar customerservice.jar
ENTRYPOINT ["java","-jar","/customerservice.jar"]