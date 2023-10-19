## Tools
To implement the  URL Lookup Service, I have selected following Tools

- Spring Boot framework for REST Microservice
- Embedded Tomcat with SpringBoot framework
- JUnit Test SpringBoot Test - MockMvc, SpringRunner etc

## Environment Setup

## Development Environment used: macOS 12.2.1



## Install IntelliJIDEA IntelliJ IDEA 2021.3.2 (Ultimate Edition).[Student Edition]

	- Import the the Spring Boot REST Microservice Application as Maven Project 
		File -> Import -> Maven Project -> pom.xml
    -  This service external dependency. You can add it with:
        <dependency>
            <groupId>com.google.guava</groupId>
            <artifactId>guava</artifactId>
            <version>31.0.1-jre</version>
        </dependency>
	
	- Wait for all dependencies to be downloaded and resolved

## Run the following SpringBootApplication as Java Application
	com.java.app.urlLookup.UrlLookupApplication
    You can run from terminal: "./mvnw spring-boot:run"

    - Refer application, properties file under src/main/resources folder

	server.port=8080
	- Embedded tomcat will be running locally on 8080

## Download Insomnia, Postman or Google Browser to verify the REST APIS

## REST API GUIDE


Parameterized URLs
===============================

For parameterized URls
POST:http://localhost:8080/api/params
Body Params: JSON List

Response Sample:
{
"/products?brand=123": "/Adidas/",
"/products?tag=5678": "/Boat--Shoes/"
}


Pretty URLs
============================

For pretty URls:

Request: POST:http://localhost:8080/api/params

Body Params: JSON List

Response Sample:

{
"/products?brand=123": "/Adidas/",
"/products?tag=5678": "/Boat--Shoes/"
}

==============================

===================================================
