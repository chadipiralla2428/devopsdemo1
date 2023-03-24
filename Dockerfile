FROM openjdk:8
ADD target/decopsdemo1-0.0.1-SNAPSHOT.jar apps.jar
ENTRYPOINT ["java","-jar","apps.jar"]