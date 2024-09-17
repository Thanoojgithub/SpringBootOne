# SpringBootOne
Simple Spring Boot with a REST API


Prerequisite
------------

- JDK 21 : https://download.java.net/java/GA/jdk21.0.2/f2283984656d49d69e91c558476027ac/13/GPL/openjdk-21.0.2_windows-x64_bin.zip
- Docker: https://www.docker.com/products/docker-desktop/


Steps
-----

* .\gradlew clean build
* docker-compose down --remove-orphans
* docker-compose down -v
* docker-compose up --build



PGAdmin: http://localhost/browser/

`db (host)
root
root`

* SELECT id, balance, branch, name FROM public.customer;
* INSERT INTO customer (id,name,branch,balance) VALUES ('1','ram','ayodya','100');
* INSERT INTO customer (id,name,branch,balance) VALUES ('2','sita','midhila','200.0');

![image](https://github.com/user-attachments/assets/531584ac-83d2-4511-869c-f497f755c81a)


App url: http://localhost:8089/

![image](https://github.com/user-attachments/assets/58b08b62-8484-4c15-9634-272c5e12dea9)

