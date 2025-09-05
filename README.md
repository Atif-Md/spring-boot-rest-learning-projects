# Spring Boot REST Learning Projects

![Java](https://img.shields.io/badge/Java-17+-blue) ![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen) ![Maven](https://img.shields.io/badge/Maven-3.x-red)

This repository contains a collection of hands-on **Spring Boot RESTful Web Service projects**. Each project demonstrates core concepts of building and consuming REST APIs using Spring Boot, covering topics from **CRUD operations** to **inter-service communication** with `RestTemplate`.

## 📂 Projects Included
- BootRestProj01-FirstApp → Basic Spring Boot REST setup
- BootRestProj02-SecondApp → Simple REST endpoints
- BootRestProj03-SendingJsonDataResponse → Sending JSON responses
- BootRestProj04-SendingComplexJsonDataResponse → Complex JSON response handling
- BootRestProj05-SendingXMLDataAsResponse → Returning XML data
- BootRestProj06-SendingJsonDataWithRequest → Handling JSON in request body
- BootRestProj07-SendingXmlDataWithRequest → Handling XML in request body
- BootRestProj08-ConvertingJsonComplexDataToJavaObject → JSON → Java object mapping
- BootRestProj09-RequestParam → Using @RequestParam in REST APIs
- BootRestProj11-PathVariables → Using @PathVariable in REST APIs
- BootRestProj12-MiniProject-APIDevelopment → Mini REST API project
- BootRestProj13-API-ProviderApp → REST API provider app
- BootRestProj13-ConsumerApp → REST API consumer app (using RestTemplate)
- BootRestProj14-ConsumerApp-RestTemplate → Advanced consumer app with RestTemplate
- BootRestProjAssignment → Assignment-based practice
- BootRestProjAssignment-MiniProjConsumerApp → Mini project consumer assignment

## 🚀 Features Covered
- REST API design with Spring Boot
- CRUD operations with REST
- Handling JSON and XML data
- Request mapping: @GetMapping, @PostMapping, @PutMapping, @DeleteMapping
- Using Path Variables and Request Parameters
- Object mapping with Jackson
- Provider-Consumer pattern using RestTemplate
- Practice assignments for real-world REST use cases

## 🛠️ Tech Stack
- Java 17+
- Spring Boot 3.x
- Maven
- RestTemplate
- Jackson / JAXB

## ▶️ Getting Started
1. Clone the repo:

   ```git clone https://github.com/<Atif-Md>/spring-boot-rest-learning-projects.git```

2. Import into Eclipse/IntelliJ as a Maven project.
3. Run any project using:

   ```mvn spring-boot:run```
5. Access APIs via:

   ```http://localhost:8080/<endpoint>```

## 🔗 Provider–Consumer Communication Flow
sequenceDiagram
    participant Client as Client
    participant Consumer as ConsumerApp (RestTemplate)
    participant Provider as ProviderApp (REST API)
    participant DB as Database
    Client->>Consumer: Sends request
    Consumer->>Provider: Calls REST endpoint (GET/POST/PUT/DELETE)
    Provider->>DB: Fetch/Save data
    DB-->>Provider: Returns data
    Provider-->>Consumer: Returns JSON/XML response
    Consumer-->>Client: Sends processed response

## 📘 Learning Goal
This repository is created as part of my learning journey to master REST API development with Spring Boot, starting from fundamentals to mini projects simulating real-world provider-consumer communication.
