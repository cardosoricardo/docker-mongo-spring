FROM java:8
COPY ["target/connectdocker-0.0.1-SNAPSHOT.jar", "/root/"]
WORKDIR /root
EXPOSE 8080
CMD java -jar connectdocker-0.0.1-SNAPSHOT.jar