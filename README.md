# SpringBootOne
Simple Spring Boot with a REST API


Prerequisite
------------

- JDK 21 : https://download.java.net/java/GA/jdk22.0.1/c7ec1332f7bb44aeba2eb341ae18aca4/8/GPL/openjdk-22.0.1_windows-x64_bin.zip
- Docker: https://www.docker.com/products/docker-desktop/


.\gradlew clean build


docker-compose down --remove-orphans

docker-compose down -v

docker-compose up --build



PGAdmin: http://localhost/browser/

db (host)

root

root


App url: http://localhost:8089/



SELECT id, balance, branch, name FROM public.customer;

INSERT INTO customer (id,name,branch,balance) VALUES ('1','ram','ayodya','100');

INSERT INTO customer (id,name,branch,balance) VALUES ('2','sita','midhila','200.0');	
