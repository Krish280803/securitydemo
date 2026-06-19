# 🔐 JWT Authentication & Authorization System

A secure REST API built using Spring Boot, Spring Security, JWT, MySQL, JPA, Swagger OpenAPI, SLF4J, and Logback.

---

##  Project Overview

This project demonstrates Authentication and Authorization using JSON Web Tokens (JWT). Users can register, login, generate JWT tokens, and access protected endpoints based on their roles.

---

##  Features

* User Registration
* User Login
* JWT Token Generation
* JWT Authentication Filter
* Role-Based Authorization
* Admin and User Access Control
* Swagger API Documentation
* Global Exception Handling
* MySQL Database Integration
* Logging with SLF4J and Logback

---

##  Technologies Used

* Java 17
* Spring Boot 3.5
* Spring Security
* Spring Data JPA
* JWT (JSON Web Token)
* MySQL
* Maven
* Swagger OpenAPI
* SLF4J
* Logback

---

##  Project Structure

```text
src/main/java/com/securitydemo

├── config
│   ├── JwtAuthenticationEntryPoint
│   ├── JwtAuthenticationFilter
│   ├── OpenApiConfig
│   └── SecurityConfig
│
├── controller
│   ├── AdminController
│   ├── AuthController
│   └── UserController
│
├── dto
│   ├── ApiResponse
│   ├── AuthRequest
│   └── AuthResponse
│
├── entity
│   ├── Role
│   └── User
│
├── exception
│   ├── GlobalExceptionHandler
│   ├── ResourceNotFoundException
│   ├── UnauthorizedException
│   └── UserAlreadyExistsException
│
├── repository
│   └── UserRepository
│
├── service
│   ├── AuthService
│   ├── CustomUserDetailsService
│   └── JwtService
│
└── SecuritydemoApplication
```

---

##  Authentication Flow

```text
User Registration
       ↓
User Login
       ↓
JWT Token Generated
       ↓
Token Sent in Authorization Header
       ↓
Protected APIs Accessed
```

---

##  Database Setup

Create database:

```sql
CREATE DATABASE securitydb;
```

Update application.properties:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/securitydb
spring.datasource.username=root
spring.datasource.password=Root@12345

spring.jpa.hibernate.ddl-auto=update

server.port=8081
```

---

##  Running the Application

Clone Repository:

```bash
git clone https://github.com/Krish280803/securitydemo.git
```

Navigate to Project:

```bash
cd securitydemo
```

Run Application:

```bash
mvn spring-boot:run
```

Application URL:

```text
http://localhost:8081
```

---

## 📖 Swagger API Documentation

Swagger UI:

```text
http://localhost:8081/swagger-ui/index.html
```

OpenAPI JSON:

```text
http://localhost:8081/v3/api-docs
```

---

##  Register User

Endpoint:

```http
POST /auth/register
```

Request Body:

```json
{
  "username": "srikrishna",
  "password": "user123",
  "role": "ROLE_USER"
}
```

---

##  Login

Endpoint:

```http
POST /auth/login
```

Request Body:

```json
{
  "username": "srikrishna",
  "password": "user123"
}
```

Response:

```json
{
  "token": "JWT_TOKEN"
}
```

---

##  Admin Endpoint

```http
GET /admin/home
```

Access:

```text
ROLE_ADMIN only
```

---

##  User Endpoint

```http
GET /user/home
```

Access:

```text
ROLE_USER and ROLE_ADMIN
```


## JWT Authorization Header

```http
Authorization: Bearer <JWT_TOKEN>
```



##  Logging

This project uses:

* SLF4J
* Logback

for application logging and debugging.



##  Testing

The APIs can be tested using:

* Swagger UI
* Postman
* REST Client



## Author

**SriKrishna Kulkarni**

GitHub: [https://github.com/Krish280803](https://github.com/Krish280803)



## 📄 License

This project is developed for learning and educational purposes.
