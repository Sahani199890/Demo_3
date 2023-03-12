# Deployment Of Project through Termius
### Requirements
* IntelliJIDEA
* ServerPort: 8080 (use: localhost:8080)
* Java version: 17
* Everything is present in the pom.xml (no need to download any library)
* Aws account to deploy project 
* Termius to perform deployment process
### Steps to run the Project
* Download the source code and import in intellijIDEA.
* Go to localhost:8080/
* Put specific end_points besides the port accordingly to run the project to access and modify the data
* Download jar file of the project and push on GitHub
* Aws EC2 is needed to deploy project on it to get public IP address
* Termius is where I wrote few commands and deployed project, and it helped me access the project from any place
# Dependencies
## Validation
* Bean Validation with Hibernate validator.
## H2 Database
* Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint. Supports embedded and server modes as well as a browser based console application.
## Spring Web
* Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
## Spring Boot DevTools
* Provides fast application restarts, LiveReload, and configurations for enhanced development experience.
## Spring Data JPA
* Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.
## Lombok
* Java annotation library which helps to reduce boilerplate code.
## Swagger
* Helps user to ease access data in HTML format

# Working
* Write code and download the jar file of the project and store it in computer memory
* Go to Aws and through EC2 we get IP address and key-pair or password which will be used in Termius for opening an instance
* Go to Termius use the IP address and key_pair to create an instance and write commands in such as creating database where our inputs are saved
* change IP address to give asses to the people not only for local users but also for others adn deploy project from the Termius as we use jar 
* I have added swagger to get access my database.