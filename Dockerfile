FROM majiajue/jdk1.8
MAINTAINER emaaristimuno
COPY target/SpringBoot_5.jar SpringBoot_5.jar
ENTRYPOINT ["java","-jar","/SpringBoot_5.jar"]
