# B1 - Spring Framework Notes

## Introduction to Spring Framework

The **Spring Framework** is one of the most popular frameworks used for building Java applications, especially **enterprise applications** and **web applications**.

It provides ready-made tools, libraries, and features that make Java development **faster, easier, and more organized**.

### Features

* Open-source Java framework
* Used for developing:

  * Web Applications
  * Enterprise Applications
  * REST APIs
  * Microservices
  * Cloud-based Applications

Spring reduces the complexity of Java programming by providing features such as:

* Dependency Injection (DI)
* Inversion of Control (IoC)
* Database Connectivity
* Transaction Management
* Security
* MVC Architecture

---

# Core Concepts of Spring

## 1. Dependency Injection (DI)

Dependency Injection is a design pattern in which Spring provides the required objects (dependencies) to a class automatically.

### Benefits

* Loose Coupling
* Easier Testing
* Better Code Maintainability

---

## 2. Inversion of Control (IoC)

In IoC, the control of object creation and management is transferred from the programmer to the Spring Container.

### Benefits

* Better Modularity
* Reduced Complexity
* Easier Dependency Management

---

# Spring Architecture

## Spring Core

* Provides DI and IoC features.
* Foundation module of Spring Framework.

## Spring MVC

* Used for Web Applications and REST APIs.
* Follows the Model-View-Controller (MVC) architecture.

## Spring JDBC

* Simplifies Database Operations.
* Reduces Boilerplate JDBC Code.

## Spring ORM

* Integrates with Hibernate and JPA.
* Simplifies Object Relational Mapping.

## Spring Security

* Provides Authentication and Authorization.
* Supports JWT-based Security.

---

# Spring Boot

Most modern Spring applications use **Spring Boot**.

Spring Boot simplifies Spring development by providing:

* Auto Configuration
* Embedded Servers (Tomcat)
* Starter Dependencies
* Faster Application Development
* Minimal Configuration

---

# MVC Architecture

## View

* User Interface (UI)
* HTML Templates
* Thymeleaf Pages

## Model

* Services
* Business Logic
* Data Processing

## Controller

* Request Handling
* Request Processing
* Sending Responses

---

# Difference Between Spring Framework and Spring Boot

| Spring Framework              | Spring Boot            |
| ----------------------------- | ---------------------- |
| Requires manual configuration | Auto configuration     |
| More setup required           | Less setup required    |
| No embedded server            | Embedded Tomcat server |
| Slower development            | Faster development     |

---

# Common Spring Annotations

## @Component

* Creates a Spring Bean.
* Used for generic Spring-managed components.

## @Autowired

* Automatically injects dependencies.

## @Controller

* Defines an MVC Controller.

## @RestController

* Defines a REST API Controller.
* Returns JSON/XML responses directly.

## @Service

* Represents the Service Layer.
* Contains Business Logic.

## @Repository

* Represents the Database Layer.
* Used for Database Operations.

## @SpringBootApplication

Main annotation for Spring Boot applications.

Combines:

* @Configuration
* @EnableAutoConfiguration
* @ComponentScan

---

# Full Stack Java Project

## Technologies Used

### 1. Spring MVC

* Handles Web Requests and Responses.
* Follows MVC Architecture.
* Acts as a bridge between Frontend and Backend.

### 2. Spring ORM

* Provides integration with Hibernate and JPA.
* Simplifies Database Operations.
* Maps Java Objects to Database Tables.

### 3. Thymeleaf

* Server-side Java Template Engine.
* Creates Dynamic HTML Pages.
* Integrates seamlessly with Spring Boot.

### 4. MySQL Database

* Stores Application Data.
* Used for CRUD Operations.
* Connected using Spring Data JPA or Hibernate.

### 5. Spring Data JPA

* Provides Repository Interfaces.
* Reduces Database Coding.
* Works with Hibernate ORM.

### 6. Spring Security

* Authentication and Authorization.
* Login and Registration Security.
* Role-Based Access Control.

---

# Layers of Full Stack Java Project

## Controller Layer

* Receives User Requests.
* Calls Service Layer.
* Returns Response or View.

```java
@Controller
public class StudentController {
}
```

## Service Layer

* Contains Business Logic.
* Processes Data.
* Communicates with Repository Layer.

```java
@Service
public class StudentService {
}
```

## Repository Layer

* Handles Database Operations.
* Uses Spring Data JPA.

```java
@Repository
public interface StudentRepository
extends JpaRepository<Student, Integer> {
}
```

## Entity Layer

* Represents Database Tables.

```java
@Entity
public class Student {
}
```

---

# Complete Project Flow

```text
User
 ↓
HTML + CSS + Thymeleaf
 ↓
Controller
 ↓
Service
 ↓
Repository (JPA)
 ↓
Hibernate ORM
 ↓
MySQL Database
```

---

# Spring Boot Dependencies

## Spring Web

* Provides Spring MVC.
* Embedded Tomcat Server.

## Spring DevTools

* Automatic Restart.
* Faster Development.

## Spring Data JPA

* Database Operations.
* Hibernate Integration.

## MySQL Driver

* Connects Java Application with MySQL.

## Thymeleaf

* Dynamic HTML Pages.

## Spring Security

* Authentication and Authorization.

## Lombok (Optional)

* Reduces Boilerplate Code.
* Generates Getters, Setters, and Constructors Automatically.

---

# Common Folder Structure

```text
src/main/java
│
├── controller
│     └── StudentController.java
│
├── service
│     └── StudentService.java
│
├── repository
│     └── StudentRepository.java
│
├── entity
│     └── Student.java
│
└── SmsApplication.java

src/main/resources
│
├── templates
│     └── student.html
│
├── static
│     ├── css
│     ├── js
│     └── images
│
└── application.properties
```

---

# Main File

### Required Imports

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
```

### @SpringBootApplication

* Main Annotation used in Spring Boot Applications.
* Scans Spring Components Automatically.
* Configures the Application.

### SpringApplication

* Class provided by Spring Boot.
* Used to start the Spring Application.

### run()

* Static Method used to launch the Application.

Performs:

1. Application Startup
2. Bean Container Creation
3. Auto Configuration
4. Embedded Server Startup

---

# Application Startup Process

```text
1. main() Method Executes
        ↓
2. SpringApplication.run()
        ↓
3. Spring Container Created
        ↓
4. Component Scanning Starts
        ↓
5. Beans Created & Injected
        ↓
6. Auto Configuration Applied
        ↓
7. Embedded Tomcat Starts
        ↓
8. Application Ready
```



---

### Why Spring MVC
Why in SPRING MVC....We created interface for Model & Repository?
1) We have to follows an imp OOPs Principle.
2) Loose Coupling :
   depends on Interface, not implementation.
   aple Implementation Possible
   You can create many implementation of same interface.
3) Easier Testing  --> 
   * Interface help during unit testing. 
   * Interface used heavily in Spring Boot.
4) Spring uses dependencies injections. 
      * spring prefers interface bcz it creates proxy obj dynamically
      * So . spring works efficiently with inertface and proxies
5) Better Arch :
      * Spring app follows layerd arch.
 ```text
   Layer            Interface           Implementation
 1 Service          StudentService      StudentImpl
 2 Repository       Student Repository  Spring provides implementation
   ```
```

---
# Summary

Spring Framework is a powerful Java framework that simplifies enterprise application development through Dependency Injection (DI), Inversion of Control (IoC), MVC Architecture, Security, and Database Integration.

Spring Boot further simplifies development by providing Auto Configuration, Embedded Servers, and Starter Dependencies, enabling rapid application development with minimal configuration.
