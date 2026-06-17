# 🎓 Student Management System

A web-based Student Management System built using **Spring Boot**, **Spring MVC**, **Thymeleaf**, **Hibernate/JPA**, and **MySQL**. This application allows administrators to manage student records efficiently through a clean and user-friendly interface.

## 🚀 Features

- ➕ Add new students
- 📋 View all student records
- ✏️ Update existing student information
- ❌ Delete student records
- 📧 Store student email information
- 🗄️ MySQL database integration
- 🌐 Responsive and user-friendly UI

## 🛠️ Tech Stack

### Backend
- Java
- Spring Boot
- Spring MVC
- Spring Data JPA (Hibernate)

### Frontend
- HTML5
- CSS3
- Bootstrap
- Thymeleaf

### Database
- MySQL

### Build Tool
- Maven

## 📂 Project Structure

```text
src
├── main
│   ├── java
│   │   ├── Controller
│   │   ├── Service
│   │   ├── Repository
│   │   ├── Entity
│   │   └── StudentManagementSystemApplication
│   ├── resources
│   │   ├── templates
│   │   ├── static
│   │   └── application.properties
```

## ⚙️ Installation & Setup

### Prerequisites

- Java 17 or later
- Maven
- MySQL Server
- IDE (IntelliJ IDEA / Eclipse / VS Code)

### Clone Repository

```bash
git clone https://github.com/RishikeshPalkar/Students-Management-System.git
cd Students-Management-System
```

### Configure Database

Create a MySQL database:

```sql
CREATE DATABASE student_management_system;
```

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_management_system
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Run Application

Using Maven:

```bash
mvn spring-boot:run
```

Or run the main class:

```java
StudentManagementSystemApplication.java
```

## 📸 Application Modules

### Dashboard
- View all registered students.

### Add Student
- Register a new student.

### Update Student
- Edit existing student details.

### Delete Student
- Remove student records from the database.

### Search Student
- Find students quickly using search functionality.

## 📊 Student Information Stored

| Field | Description |
|---------|------------|
| ID | Unique Student ID |
| First Name | Student's First Name |
| Last Name | Student's Last Name |
| Email | Student Email Address |

## 🎯 Learning Outcomes

This project demonstrates:

- Spring Boot application development
- MVC Architecture
- CRUD Operations
- Database Connectivity with MySQL
- JPA/Hibernate ORM
- Thymeleaf Templating
- Maven Project Management

## Future Enhancements

- Student Login System
- Authentication & Authorization
- Attendance Management
- Course Management
- Pagination & Sorting
- REST API Integration
- Docker Deployment

## 👨‍💻 Author

**Rishikesh Palkar**

- GitHub: https://github.com/RishikeshPalkar
- College: YCCE, Nagpur
- Branch: Computer Science Engineering

## 📄 License

This project is developed for educational and learning purposes.
Feel free to fork, modify, and enhance it.

---

⭐ If you found this project helpful, don't forget to give it a star!
