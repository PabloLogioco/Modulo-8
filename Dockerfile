FROM majiajue/jdk1.8
MAINTAINER emaaristimuno
COPY target/SpringBoot_5-0.0.1-SNAPSHOT.jar SpringBoot_5-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/SpringBoot_5-0.0.1-SNAPSHOT.jar"]
