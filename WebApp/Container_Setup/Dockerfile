FROM tomcat:latest
WORKDIR /usr/local/tomcat/webapps
ADD maven-0.0.1-SNAPSHOT.war .
COPY server.xml /usr/local/tomcat/conf/
COPY keystore.jks /usr/local/tomcat/temp/
CMD ["catalina.sh","run"]