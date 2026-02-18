# 🍃 Spring Boot CRUD Application

A full-stack CRUD (Create, Read, Update, Delete) application built with Spring Boot, demonstrating RESTful API development with JPA/Hibernate for database operations.

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![Java](https://img.shields.io/badge/Java-17+-orange)
![Maven](https://img.shields.io/badge/Maven-3.8+-blue)
![License](https://img.shields.io/badge/License-MIT-yellow)

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technologies](#technologies)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [API Endpoints](#api-endpoints)
- [Database Configuration](#database-configuration)
- [Usage Examples](#usage-examples)
- [Testing](#testing)
- [Contributing](#contributing)

## 🎯 Overview

This project is a RESTful web service that implements CRUD operations using Spring Boot. It provides a complete backend solution for managing entities with persistent storage, following best practices and industry standards.

## ✨ Features

- ✅ **Create** - Add new records to the database
- 📖 **Read** - Retrieve single or multiple records
- ✏️ **Update** - Modify existing records
- 🗑️ **Delete** - Remove records from the database
- 🔍 **Search & Filter** - Advanced querying capabilities
- ✔️ **Validation** - Input validation using Bean Validation
- 🛡️ **Exception Handling** - Global exception handling mechanism
- 📊 **Database Integration** - JPA/Hibernate for ORM
- 🔄 **RESTful APIs** - Clean and intuitive API design
- 📝 **Logging** - Comprehensive logging with SLF4J
- 🧪 **Testing** - Unit and integration tests

## 🛠️ Technologies

**Backend:**
- Java 17+
- Spring Boot 3.x
- Spring Data JPA
- Spring Web
- Hibernate
- Maven

**Database:**
- MySQL / PostgreSQL / H2 (configurable)

**Tools:**
- Postman (API testing)
- Lombok (reducing boilerplate code)
- ModelMapper (object mapping)

## 📦 Prerequisites

Before running this application, make sure you have:

- **JDK 17** or higher installed
- **Maven 3.8+** installed
- **MySQL** or **PostgreSQL** database server (or use H2 in-memory database)
- **IDE** (IntelliJ IDEA, Eclipse, or VS Code)
- **Postman** or similar tool for API testing (optional)

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/SaiVardhanKallempudi/springboot-crud-app.git
cd springboot-crud-app
```

### 2. Configure Database

Update `src/main/resources/application.properties`:

**For MySQL:**
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

**For H2 (In-Memory Database):**
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

### 3. Build the Project

```bash
mvn clean install
```

### 4. Run the Application

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## 📁 Project Structure

```
springboot-crud-app/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── crud/
│   │   │               ├── CrudApplication.java
│   │   │               ├── controller/
│   │   │               │   └── EntityController.java
│   │   │               ├── model/
│   │   │               │   └── Entity.java
│   │   │               ├── repository/
│   │   │               │   └── EntityRepository.java
│   │   │               ├── service/
│   │   │               │   ├── EntityService.java
│   │   │               │   └── EntityServiceImpl.java
│   │   │               ├── dto/
│   │   │               │   └── EntityDTO.java
│   │   │               └── exception/
│   │   │                   ├── GlobalExceptionHandler.java
│   │   │                   └── ResourceNotFoundException.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── crud/
│                       ├── controller/
│                       ├── service/
│                       └── repository/
│
├── pom.xml
└── README.md
```

## 🔌 API Endpoints

### Base URL: `http://localhost:8080/api`

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/entities` | Get all entities |
| GET | `/entities/{id}` | Get entity by ID |
| POST | `/entities` | Create a new entity |
| PUT | `/entities/{id}` | Update entity by ID |
| DELETE | `/entities/{id}` | Delete entity by ID |

## 📡 Usage Examples

### 1. Create a New Record (POST)

**Request:**
```bash
curl -X POST http://localhost:8080/api/entities \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Sample Entity",
    "description": "This is a sample description",
    "status": "ACTIVE"
  }'
```

**Response:**
```json
{
  "id": 1,
  "name": "Sample Entity",
  "description": "This is a sample description",
  "status": "ACTIVE",
  "createdAt": "2026-02-18T10:30:00",
  "updatedAt": "2026-02-18T10:30:00"
}
```

### 2. Get All Records (GET)

**Request:**
```bash
curl -X GET http://localhost:8080/api/entities
```

**Response:**
```json
[
  {
    "id": 1,
    "name": "Sample Entity",
    "description": "This is a sample description",
    "status": "ACTIVE",
    "createdAt": "2026-02-18T10:30:00",
    "updatedAt": "2026-02-18T10:30:00"
  },
  {
    "id": 2,
    "name": "Another Entity",
    "description": "Another description",
    "status": "INACTIVE",
    "createdAt": "2026-02-18T11:00:00",
    "updatedAt": "2026-02-18T11:00:00"
  }
]
```

### 3. Get Single Record by ID (GET)

**Request:**
```bash
curl -X GET http://localhost:8080/api/entities/1
```

**Response:**
```json
{
  "id": 1,
  "name": "Sample Entity",
  "description": "This is a sample description",
  "status": "ACTIVE",
  "createdAt": "2026-02-18T10:30:00",
  "updatedAt": "2026-02-18T10:30:00"
}
```

### 4. Update a Record (PUT)

**Request:**
```bash
curl -X PUT http://localhost:8080/api/entities/1 \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Updated Entity",
    "description": "Updated description",
    "status": "INACTIVE"
  }'
```

**Response:**
```json
{
  "id": 1,
  "name": "Updated Entity",
  "description": "Updated description",
  "status": "INACTIVE",
  "createdAt": "2026-02-18T10:30:00",
  "updatedAt": "2026-02-18T14:30:00"
}
```

### 5. Delete a Record (DELETE)

**Request:**
```bash
curl -X DELETE http://localhost:8080/api/entities/1
```

**Response:**
```json
{
  "message": "Entity deleted successfully"
}
```

## 🗄️ Database Configuration

### Sample Entity Schema

```sql
CREATE TABLE entity (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(50),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
```

### JPA Entity Example

```java
@Entity
@Table(name = "entity")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Entity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 100)
    private String name;
    
    @Column(length = 500)
    private String description;
    
    @Enumerated(EnumType.STRING)
    private Status status;
    
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;
    
    @LastModifiedDate
    private LocalDateTime updatedAt;
}
```

## 🧪 Testing

### Run All Tests

```bash
mvn test
```

### Run Specific Test Class

```bash
mvn test -Dtest=EntityControllerTest
```

### Test Coverage

Generate test coverage report:

```bash
mvn clean test jacoco:report
```

## 🔧 Configuration Properties

### Common Application Properties

```properties
# Server Configuration
server.port=8080
server.servlet.context-path=/api

# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/crud_db
spring.datasource.username=root
spring.datasource.password=password

# JPA/Hibernate Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

# Logging Configuration
logging.level.root=INFO
logging.level.com.example.crud=DEBUG
logging.file.name=logs/application.log

# Jackson Configuration
spring.jackson.serialization.write-dates-as-timestamps=false
spring.jackson.time-zone=UTC
```

## 📚 Additional Features

### Pagination & Sorting

```java
@GetMapping("/entities")
public Page<Entity> getAllEntities(
    @RequestParam(defaultValue = "0") int page,
    @RequestParam(defaultValue = "10") int size,
    @RequestParam(defaultValue = "id") String sortBy) {
    
    Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
    return entityService.findAll(pageable);
}
```

### Search Functionality

```java
@GetMapping("/entities/search")
public List<Entity> searchEntities(@RequestParam String keyword) {
    return entityService.searchByNameOrDescription(keyword);
}
```

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👤 Author

**Sai Vardhan Kallempudi**
- GitHub: [@SaiVardhanKallempudi](https://github.com/SaiVardhanKallempudi)
- LinkedIn: [Your LinkedIn Profile](https://linkedin.com/in/yourprofile)

## 🙏 Acknowledgments

- Spring Boot Documentation
- Baeldung Spring Tutorials
- Spring Data JPA Reference

## 📞 Support

For support, email your.email@example.com or create an issue in the repository.

---

⭐ **Star this repository** if you find it helpful!

**Happy Coding!** 🚀