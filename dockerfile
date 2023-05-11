FROM amazoncorretto:17
MAINTAINER DanteFresco 
COPY target/FrescoD-0.0.1-SNAPSHOT.jar  FrescoD.jar
ENTRYPOINT ["java","-jar","FrescoD.jar"]
ADD 