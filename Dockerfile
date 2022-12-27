FROM majiajue/jdk1.8
MAINTAINER emaaristimuno
COPY target/PorfolioJPL.jar PorfolioJPL.jar
ENTRYPOINT ["java","-jar","/PorfolioJPL.jar"]
