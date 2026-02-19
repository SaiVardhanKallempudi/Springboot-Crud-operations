<div align="center">

# 🍃 Spring Boot CRUD Operations Masterclass

### *A Complete Guide to Building RESTful APIs with Spring Boot*

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.0-brightgreen?style=for-the-badge&logo=spring-boot)
![Java](https://img.shields.io/badge/Java-17+-orange?style=for-the-badge&logo=java)
![Maven](https://img.shields.io/badge/Maven-3.8+-C71A36?style=for-the-badge&logo=apache-maven)
![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)

**[Features](#-features) • [Quick Start](#-quick-start) • [API Documentation](#-api-documentation) • [Learning Resources](#-learning-resources) • [Interview Questions](#-interview-questions)**

---

</div>

## 📖 Table of Contents

- [🎯 Overview](#-overview)
- [✨ Features](#-features)
- [🏗️ Architecture](#️-architecture)
- [🛠️ Technologies Stack](#️-technologies-stack)
- [📋 Prerequisites](#-prerequisites)
- [🚀 Quick Start](#-quick-start)
- [📁 Project Structure](#-project-structure)
- [🔌 API Documentation](#-api-documentation)
- [💾 Database Configuration](#-database-configuration)
- [🎨 Code Examples](#-code-examples)
- [🧪 Testing](#-testing)
- [📚 Learning Resources](#-learning-resources)
- [❓ CRUD Operations Interview Questions](#-crud-operations-interview-questions)
- [🎓 Advanced Concepts](#-advanced-concepts)
- [🔐 Security](#-security)
- [🚨 Error Handling](#-error-handling)
- [📊 Monitoring & Logging](#-monitoring--logging)
- [🤝 Contributing](#-contributing)

---

## 🎯 Overview

<div align="center">

### *Enterprise-Grade Spring Boot Application*

This project demonstrates professional-level **CRUD (Create, Read, Update, Delete)** operations using **Spring Boot**, showcasing industry best practices, clean architecture, and production-ready code.

**Perfect for:**
- 🎓 Learning Spring Boot fundamentals
- 💼 Interview preparation
- 🏢 Enterprise application development
- 📚 Understanding RESTful API design

</div>

---

## ✨ Features

### Core Functionality
| Feature | Description |
|---------|-------------|
| ✅ **Create** | Add new records with validation |
| 📖 **Read** | Retrieve single/multiple records with pagination |
| ✏️ **Update** | Modify existing records (full/partial updates) |
🗑️ **Delete** | Remove records with soft/hard delete options |

### Advanced Features
```
✨ RESTful API Design          🔍 Advanced Search & Filtering
✔️ Bean Validation             📄 Pagination & Sorting
🛡️ Global Exception Handling   🔄 Entity-DTO Mapping
📊 JPA/Hibernate Integration   🧪 Comprehensive Testing
📝 API Documentation (Swagger) 🔐 Security Implementation
🎯 Custom Queries              📈 Performance Optimization
🌐 CORS Configuration          🔔 Event Listeners
💾 Database Versioning         🐳 Docker Support
```

---

## 🏗️ Architecture

```
┌─────────────────────────────────────────────────────────┐
│                     CLIENT LAYER                        │
│         (Postman, Browser, Mobile App, etc.)            │
└────────────────────┬────────────────────────────────────┘
                     │ HTTP Requests
                     ▼
┌─────────────────────────────────────────────────────────┐
│                  CONTROLLER LAYER                       │
│        (@RestController - Handle HTTP Requests)         │
└────────────────────┬────────────────────────────────────┘
                     │
                     ▼
┌─────────────────────────────────────────────────────────┐
│                   SERVICE LAYER                         │
│           (@Service - Business Logic)                   │
└────────────────────┬────────────────────────────────────┘
                     │
                     ▼
┌─────────────────────────────────────────────────────────┐
│                 REPOSITORY LAYER                        │
│        (@Repository - Data Access with JPA)             │
└────────────────────┬────────────────────────────────────┘
                     │
                     ▼
┌─────────────────────────────────────────────────────────┐
│                   DATABASE LAYER                        │
│          (MySQL, PostgreSQL, MongoDB, etc.)             │
└─────────────────────────────────────────────────────────┘
```

---

## 🛠️ Technologies Stack

### Backend Framework
```yaml
Spring Boot: 3.2.0
  ├── Spring Web (REST APIs)
  ├── Spring Data JPA (Database Operations)
  ├── Spring Validation (Input Validation)
  ├── Spring Security (Authentication & Authorization)
  ├── Spring Actuator (Monitoring)
  └── Spring DevTools (Hot Reload)
```

### Database
```yaml
Primary: MySQL 8.0
Alternatives:
  ├── PostgreSQL 15
  ├── H2 Database (Testing)
  ├── MongoDB (NoSQL)
  └── Oracle Database
```

### Build & Dependencies
```yaml
Build Tool: Maven 3.8+
Java Version: 17 LTS
Dependencies:
  ├── Lombok (Reduce Boilerplate)
  ├── ModelMapper (Object Mapping)
  ├── Swagger/OpenAPI (API Documentation)
  ├── JUnit 5 (Testing)
  ├── Mockito (Mocking)
  └── Docker (Containerization)
```

---

## 📋 Prerequisites

### Required Software

| Tool | Version | Download Link |
|------|---------|---------------|
| ☕ Java JDK | 17+ | [Download](https://www.oracle.com/java/technologies/downloads/) |
| 🏗️ Maven | 3.8+ | [Download](https://maven.apache.org/download.cgi) |
| 🐬 MySQL | 8.0+ | [Download](https://dev.mysql.com/downloads/) |
| 🔧 IDE | Latest | [IntelliJ IDEA](https://www.jetbrains.com/idea/) / [Eclipse](https://www.eclipse.org/) |
| 📮 Postman | Latest | [Download](https://www.postman.com/downloads/) |
| 🐳 Docker | Latest (Optional) | [Download](https://www.docker.com/products/docker-desktop) |

### Knowledge Prerequisites
```
✓ Basic Java programming
✓ Object-Oriented Programming concepts
✓ Basic SQL knowledge
✓ Understanding of HTTP methods (GET, POST, PUT, DELETE)
✓ JSON format familiarity
```

---

## 🚀 Quick Start

### Step 1: Clone the Repository

```bash
# Clone the project
git clone https://github.com/SaiVardhanKallempudi/springboot-crud-operations.git

# Navigate to project directory
cd springboot-crud-operations
```

### Step 2: Setup Database

```sql
-- Create database
CREATE DATABASE crud_database;

-- Create user (optional)
CREATE USER 'springuser'@'localhost' IDENTIFIED BY 'password123';
GRANT ALL PRIVILEGES ON crud_database.* TO 'springuser'@'localhost';
FLUSH PRIVILEGES;
```

### Step 3: Configure Application

Edit `src/main/resources/application.properties`:

```properties
# ========================================
# SERVER CONFIGURATION
# ========================================
server.port=8080
server.servlet.context-path=/api/v1

# ========================================
# DATABASE CONFIGURATION
# ========================================
spring.datasource.url=jdbc:mysql://localhost:3306/crud_database
spring.datasource.username=springuser
spring.datasource.password=password123
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# ========================================
# JPA/HIBERNATE CONFIGURATION
# ========================================
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

# ========================================
# LOGGING CONFIGURATION
# ========================================
logging.level.root=INFO
logging.level.com.example.crud=DEBUG
logging.pattern.console=%d{yyyy-MM-dd HH:mm:ss} - %msg%n

# ========================================
# SWAGGER/OPENAPI CONFIGURATION
# ========================================
springdoc.api-docs.path=/api-docs
springdoc.swagger-ui.path=/swagger-ui.html
```

### Step 4: Build & Run

```bash
# Clean and build the project
mvn clean install

# Run the application
mvn spring-boot:run

# Alternative: Run JAR file
java -jar target/crud-operations-0.0.1-SNAPSHOT.jar
```

### Step 5: Verify Installation

```bash
# Check if application is running
curl http://localhost:8080/api/v1/health

# Access Swagger UI
# Open browser: http://localhost:8080/swagger-ui.html
```

---

## 📁 Project Structure

```
springboot-crud-operations/
│
├── 📂 src/
│   ├── 📂 main/
│   │   ├── 📂 java/com/example/crud/
│   │   │   ├── 📄 CrudApplication.java                 # Main Application Class
│   │   │   │
│   │   │   ├── 📂 controller/                          # REST Controllers
│   │   │   │   ├── EmployeeController.java
│   │   │   │   └── DepartmentController.java
│   │   │   │
│   │   │   ├── 📂 service/                             # Business Logic
│   │   │   ��   ├── EmployeeService.java               # Interface
│   │   │   │   └── EmployeeServiceImpl.java           # Implementation
│   │   │   │
│   │   │   ├── 📂 repository/                          # Data Access Layer
│   │   │   │   ├── EmployeeRepository.java
│   │   │   │   └── DepartmentRepository.java
│   │   │   │
│   │   │   ├── 📂 model/                               # Entity Classes
│   │   │   │   ├── Employee.java
│   │   │   │   └── Department.java
│   │   │   │
│   │   │   ├── 📂 dto/                                 # Data Transfer Objects
│   │   │   │   ├── EmployeeDTO.java
│   │   │   │   ├── EmployeeRequestDTO.java
│   │   │   │   └── EmployeeResponseDTO.java
│   │   │   │
│   │   │   ├── 📂 exception/                           # Exception Handling
│   │   │   │   ├── GlobalExceptionHandler.java
│   │   │   │   ├── ResourceNotFoundException.java
│   │   │   │   ├── BadRequestException.java
│   │   │   │   └── ErrorResponse.java
│   │   │   │
│   │   │   ├── 📂 config/                              # Configuration Classes
│   │   │   │   ├── SwaggerConfig.java
│   │   │   │   ├── CorsConfig.java
│   │   │   │   └── ModelMapperConfig.java
│   │   │   │
│   │   │   ├── 📂 validator/                           # Custom Validators
│   │   │   │   └── EmailValidator.java
│   │   │   │
│   │   │   └── 📂 util/                                # Utility Classes
│   │   │       └── ResponseBuilder.java
│   │   │
│   │   └── 📂 resources/
│   │       ├── 📄 application.properties               # App Configuration
│   │       ├── 📄 application-dev.properties           # Dev Profile
│   │       ├── 📄 application-prod.properties          # Production Profile
│   │       └── 📂 static/                              # Static Resources
│   │
│   └── 📂 test/                                        # Test Cases
│       └── 📂 java/com/example/crud/
│           ├── EmployeeControllerTest.java
│           ├── EmployeeServiceTest.java
│           └── EmployeeRepositoryTest.java
│
├── 📂 docker/
│   ├── 📄 Dockerfile
│   └── 📄 docker-compose.yml
│
├── 📄 pom.xml                                          # Maven Dependencies
├── 📄 README.md                                        # Project Documentation
├── 📄 .gitignore
└── 📄 LICENSE
```

---

## 🔌 API Documentation

### Base URL
```
http://localhost:8080/api/v1
```

### 🎯 Employee Endpoints

<table>
<thead>
<tr>
<th>Method</th>
<th>Endpoint</th>
<th>Description</th>
<th>Status Code</th>
</tr>
</thead>
<tbody>
<tr>
<td><code>GET</code></td>
<td><code>/employees</code></td>
<td>Get all employees (with pagination)</td>
<td>200 OK</td>
</tr>
<tr>
<td><code>GET</code></td>
<td><code>/employees/{id}</code></td>
<td>Get employee by ID</td>
<td>200 OK</td>
</tr>
<tr>
<td><code>POST</code></td>
<td><code>/employees</code></td>
<td>Create new employee</td>
<td>201 Created</td>
</tr>
<tr>
<td><code>PUT</code></td>
<td><code>/employees/{id}</code></td>
<td>Update employee</td>
<td>200 OK</td>
</tr>
<tr>
<td><code>PATCH</code></td>
<td><code>/employees/{id}</code></td>
<td>Partial update</td>
<td>200 OK</td>
</tr>
<tr>
<td><code>DELETE</code></td>
<td><code>/employees/{id}</code></td>
<td>Delete employee</td>
<td>204 No Content</td>
</tr>
<tr>
<td><code>GET</code></td>
<td><code>/employees/search</code></td>
<td>Search employees</td>
<td>200 OK</td>
</tr>
</tbody>
</table>

---

## 💾 Database Configuration

### Entity Design Example

```java
@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "First name is required")
    @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
    @Column(name = "first_name", nullable = false)
    private String firstName;
    
    @NotBlank(message = "Last name is required")
    @Size(min = 2, max = 50)
    @Column(name = "last_name", nullable = false)
    private String lastName;
    
    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is required")
    @Column(unique = true, nullable = false)
    private String email;
    
    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^\\d{10}$", message = "Phone number must be 10 digits")
    private String phone;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "employment_status")
    private EmploymentStatus status;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;
    
    @Column(nullable = false)
    private Double salary;
    
    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;
    
    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    
    @Version
    private Long version; // For optimistic locking
}
```

### Database Schema

```sql
CREATE TABLE employees (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone VARCHAR(15) NOT NULL,
    employment_status ENUM('ACTIVE', 'INACTIVE', 'ON_LEAVE') DEFAULT 'ACTIVE',
    department_id BIGINT,
    salary DECIMAL(10, 2) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    version BIGINT DEFAULT 0,
    FOREIGN KEY (department_id) REFERENCES departments(id) ON DELETE SET NULL,
    INDEX idx_email (email),
    INDEX idx_status (employment_status)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
```

---

## 🎨 Code Examples

### 1️⃣ Controller Layer

```java
@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
@Slf4j
@Tag(name = "Employee Management", description = "APIs for managing employees")
public class EmployeeController {
    
    private final EmployeeService employeeService;
    
    /**
     * CREATE - Add new employee
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Create a new employee", description = "Creates a new employee record")
    public ResponseEntity<EmployeeResponseDTO> createEmployee(
            @Valid @RequestBody EmployeeRequestDTO request) {
        
        log.info("Creating new employee: {}", request.getEmail());
        EmployeeResponseDTO response = employeeService.createEmployee(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    
    /**
     * READ - Get all employees with pagination
     */
    @GetMapping
    @Operation(summary = "Get all employees", description = "Retrieves paginated list of employees")
    public ResponseEntity<Page<EmployeeResponseDTO>> getAllEmployees(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "ASC") String sortDir) {
        
        log.info("Fetching employees - page: {}, size: {}", page, size);
        
        Sort sort = sortDir.equalsIgnoreCase("ASC") 
            ? Sort.by(sortBy).ascending() 
            : Sort.by(sortBy).descending();
            
        Pageable pageable = PageRequest.of(page, size, sort);
        Page<EmployeeResponseDTO> employees = employeeService.getAllEmployees(pageable);
        
        return ResponseEntity.ok(employees);
    }
    
    /**
     * READ - Get employee by ID
     */
    @GetMapping("/{id}")
    @Operation(summary = "Get employee by ID", description = "Retrieves employee details by ID")
    public ResponseEntity<EmployeeResponseDTO> getEmployeeById(
            @PathVariable @Min(1) Long id) {
        
        log.info("Fetching employee with ID: {}", id);
        EmployeeResponseDTO employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }
    
    /**
     * UPDATE - Update employee
     */
    @PutMapping("/{id}")
    @Operation(summary = "Update employee", description = "Updates existing employee")
    public ResponseEntity<EmployeeResponseDTO> updateEmployee(
            @PathVariable Long id,
            @Valid @RequestBody EmployeeRequestDTO request) {
        
        log.info("Updating employee with ID: {}", id);
        EmployeeResponseDTO updated = employeeService.updateEmployee(id, request);
        return ResponseEntity.ok(updated);
    }
    
    /**
     * DELETE - Remove employee
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "Delete employee", description = "Deletes employee by ID")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        log.info("Deleting employee with ID: {}", id);
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }
    
    /**
     * SEARCH - Search employees
     */
    @GetMapping("/search")
    @Operation(summary = "Search employees", description = "Search employees by keyword")
    public ResponseEntity<List<EmployeeResponseDTO>> searchEmployees(
            @RequestParam String keyword) {
        
        log.info("Searching employees with keyword: {}", keyword);
        List<EmployeeResponseDTO> results = employeeService.searchEmployees(keyword);
        return ResponseEntity.ok(results);
    }
}
```

### 2️⃣ Service Layer

```java
@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;
    
    @Override
    public EmployeeResponseDTO createEmployee(EmployeeRequestDTO request) {
        // Check if email already exists
        if (employeeRepository.existsByEmail(request.getEmail())) {
            throw new BadRequestException("Employee with email " + request.getEmail() + " already exists");
        }
        
        Employee employee = modelMapper.map(request, Employee.class);
        employee.setCreatedAt(LocalDateTime.now());
        employee.setStatus(EmploymentStatus.ACTIVE);
        
        Employee saved = employeeRepository.save(employee);
        log.info("Employee created successfully with ID: {}", saved.getId());
        
        return modelMapper.map(saved, EmployeeResponseDTO.class);
    }
    
    @Override
    @Transactional(readOnly = true)
    public Page<EmployeeResponseDTO> getAllEmployees(Pageable pageable) {
        Page<Employee> employees = employeeRepository.findAll(pageable);
        return employees.map(emp -> modelMapper.map(emp, EmployeeResponseDTO.class));
    }
    
    @Override
    @Transactional(readOnly = true)
    public EmployeeResponseDTO getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Employee not found with ID: " + id));
        
        return modelMapper.map(employee, EmployeeResponseDTO.class);
    }
    
    @Override
    public EmployeeResponseDTO updateEmployee(Long id, EmployeeRequestDTO request) {
        Employee existing = employeeRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Employee not found with ID: " + id));
        
        // Update fields
        existing.setFirstName(request.getFirstName());
        existing.setLastName(request.getLastName());
        existing.setEmail(request.getEmail());
        existing.setPhone(request.getPhone());
        existing.setSalary(request.getSalary());
        existing.setUpdatedAt(LocalDateTime.now());
        
        Employee updated = employeeRepository.save(existing);
        log.info("Employee updated successfully with ID: {}", id);
        
        return modelMapper.map(updated, EmployeeResponseDTO.class);
    }
    
    @Override
    public void deleteEmployee(Long id) {
        if (!employeeRepository.existsById(id)) {
            throw new ResourceNotFoundException("Employee not found with ID: " + id);
        }
        
        employeeRepository.deleteById(id);
        log.info("Employee deleted successfully with ID: {}", id);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<EmployeeResponseDTO> searchEmployees(String keyword) {
        List<Employee> employees = employeeRepository.searchByKeyword(keyword);
        return employees.stream()
            .map(emp -> modelMapper.map(emp, EmployeeResponseDTO.class))
            .collect(Collectors.toList());
    }
}
```

### 3️⃣ Repository Layer

```java
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
    // Custom query methods
    Optional<Employee> findByEmail(String email);
    
    boolean existsByEmail(String email);
    
    List<Employee> findByStatus(EmploymentStatus status);
    
    List<Employee> findByDepartmentId(Long departmentId);
    
    // Using @Query annotation
    @Query("SELECT e FROM Employee e WHERE " +
           "LOWER(e.firstName) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
           "LOWER(e.lastName) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
           "LOWER(e.email) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Employee> searchByKeyword(@Param("keyword") String keyword);
    
    // Native query
    @Query(value = "SELECT * FROM employees WHERE salary BETWEEN :minSalary AND :maxSalary", 
           nativeQuery = true)
    List<Employee> findBySalaryRange(@Param("minSalary") Double minSalary, 
                                     @Param("maxSalary") Double maxSalary);
    
    // Pagination with custom query
    @Query("SELECT e FROM Employee e WHERE e.status = :status")
    Page<Employee> findByStatus(@Param("status") EmploymentStatus status, Pageable pageable);
}
```

### 4️⃣ Global Exception Handler

```java
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFoundException(
            ResourceNotFoundException ex, WebRequest request) {
        
        log.error("Resource not found: {}", ex.getMessage());
        
        ErrorResponse error = ErrorResponse.builder()
            .timestamp(LocalDateTime.now())
            .status(HttpStatus.NOT_FOUND.value())
            .error("Not Found")
            .message(ex.getMessage())
            .path(request.getDescription(false).replace("uri=", ""))
            .build();
        
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
    
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ErrorResponse> handleBadRequestException(
            BadRequestException ex, WebRequest request) {
        
        log.error("Bad request: {}", ex.getMessage());
        
        ErrorResponse error = ErrorResponse.builder()
            .timestamp(LocalDateTime.now())
            .status(HttpStatus.BAD_REQUEST.value())
            .error("Bad Request")
            .message(ex.getMessage())
            .path(request.getDescription(false).replace("uri=", ""))
            .build();
        
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, Object>> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        
        Map<String, Object> response = new HashMap<>();
        response.put("timestamp", LocalDateTime.now());
        response.put("status", HttpStatus.BAD_REQUEST.value());
        response.put("error", "Validation Failed");
        response.put("errors", errors);
        
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGlobalException(
            Exception ex, WebRequest request) {
        
        log.error("Internal server error: {}", ex.getMessage(), ex);
        
        ErrorResponse error = ErrorResponse.builder()
            .timestamp(LocalDateTime.now())
            .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
            .error("Internal Server Error")
            .message("An unexpected error occurred")
            .path(request.getDescription(false).replace("uri=", ""))
            .build();
        
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
```

---

## 🧪 Testing

### Unit Test Example

```java
@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {
    
    @Mock
    private EmployeeRepository employeeRepository;
    
    @Mock
    private ModelMapper modelMapper;
    
    @InjectMocks
    private EmployeeServiceImpl employeeService;
    
    @Test
    @DisplayName("Should create employee successfully")
    void testCreateEmployee() {
        // Arrange
        EmployeeRequestDTO request = new EmployeeRequestDTO();
        request.setFirstName("John");
        request.setLastName("Doe");
        request.setEmail("john.doe@example.com");
        
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setFirstName("John");
        
        when(employeeRepository.existsByEmail(anyString())).thenReturn(false);
        when(modelMapper.map(request, Employee.class)).thenReturn(employee);
        when(employeeRepository.save(any(Employee.class))).thenReturn(employee);
        when(modelMapper.map(employee, EmployeeResponseDTO.class))
            .thenReturn(new EmployeeResponseDTO());
        
        // Act
        EmployeeResponseDTO result = employeeService.createEmployee(request);
        
        // Assert
        assertNotNull(result);
        verify(employeeRepository).save(any(Employee.class));
    }
    
    @Test
    @DisplayName("Should throw exception when employee not found")
    void testGetEmployeeById_NotFound() {
        // Arrange
        Long id = 999L;
        when(employeeRepository.findById(id)).thenReturn(Optional.empty());
        
        // Act & Assert
        assertThrows(ResourceNotFoundException.class, () -> {
            employeeService.getEmployeeById(id);
        });
    }
}
```

### Integration Test Example

```java
@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeControllerIntegrationTest {
    
    @Autowired
    private MockMvc mockMvc;
    
    @Autowired
    private ObjectMapper objectMapper;
    
    @Test
    @Order(1)
    @DisplayName("Should create employee")
    void testCreateEmployee() throws Exception {
        EmployeeRequestDTO request = new EmployeeRequestDTO();
        request.setFirstName("Jane");
        request.setLastName("Smith");
        request.setEmail("jane.smith@example.com");
        request.setPhone("1234567890");
        request.setSalary(50000.0);
        
        mockMvc.perform(post("/api/v1/employees")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.firstName").value("Jane"))
                .andExpect(jsonPath("$.email").value("jane.smith@example.com"));
    }
    
    @Test
    @Order(2)
    @DisplayName("Should get all employees")
    void testGetAllEmployees() throws Exception {
        mockMvc.perform(get("/api/v1/employees")
                .param("page", "0")
                .param("size", "10"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.content").isArray());
    }
}
```

---

## 📚 Learning Resources

### 🎓 Official Documentation

| Resource | Link | Description |
|----------|------|-------------|
| 📘 Spring Boot Docs | [Link](https://spring.io/projects/spring-boot) | Official Spring Boot documentation |
| 📗 Spring Data JPA | [Link](https://spring.io/projects/spring-data-jpa) | Spring Data JPA reference |
| 📙 Spring REST Docs | [Link](https://spring.io/guides/gs/rest-service/) | Building REST services guide |
| 📕 Hibernate ORM | [Link](https://hibernate.org/orm/documentation/) | Hibernate documentation |

### 📺 Video Tutorials

```
🎥 YouTube Channels:
├── Amigoscode - Spring Boot Full Course
├── Java Brains - Spring Boot Microservices
├── Telusko - Spring Framework Tutorial
├── Programming Techie - Spring Boot Projects
└── Daily Code Buffer - Advanced Spring Boot

🎬 Recommended Courses:
├── Udemy: Spring & Hibernate for Beginners
├── Coursera: Spring Framework Specialization
├── Pluralsight: Spring Boot Fundamentals
└── LinkedIn Learning: Spring Boot Essential Training
```

### 📖 Books

```
1. 📚 "Spring Boot in Action" - Craig Walls
2. 📚 "Spring Microservices in Action" - John Carnell
3. 📚 "Pro Spring Boot 2" - Felipe Gutierrez
4. 📚 "Learning Spring Boot 3.0" - Greg L. Turnquist
5. 📚 "Spring Boot: Up and Running" - Mark Heckler
```

### 🌐 Online Platforms

| Platform | URL | Features |
|----------|-----|----------|
| 🔗 Baeldung | [baeldung.com](https://www.baeldung.com) | Comprehensive Spring tutorials |
| 🔗 Spring.io Guides | [spring.io/guides](https://spring.io/guides) | Official getting started guides |
| 🔗 JavaTpoint | [javatpoint.com](https://www.javatpoint.com/spring-boot-tutorial) | Step-by-step tutorials |
| 🔗 GeeksforGeeks | [geeksforgeeks.org](https://www.geeksforgeeks.org/spring-boot/) | Concept explanations |

### 💻 Practice Platforms

```
✅ LeetCode - System Design
✅ HackerRank - Java & Spring
✅ CodeChef - Backend Development
✅ GitHub - Open Source Projects
✅ Stack Overflow - Problem Solving
```

---

## ❓ CRUD Operations Interview Questions

### 🔰 Beginner Level

<details>
<summary><b>1. What is CRUD and why is it important?</b></summary>

**Answer:**
CRUD stands for Create, Read, Update, and Delete - the four basic operations for persistent storage.

- **Create**: Insert new records (HTTP POST)
- **Read**: Retrieve existing records (HTTP GET)
- **Update**: Modify existing records (HTTP PUT/PATCH)
- **Delete**: Remove records (HTTP DELETE)

**Importance:**
- Forms the foundation of database interactions
- Essential for building any data-driven application
- Standardizes data manipulation operations
- Maps directly to HTTP methods in REST APIs
</details>

<details>
<summary><b>2. What is Spring Boot and its advantages?</b></summary>

**Answer:**
Spring Boot is an opinionated framework built on top of Spring Framework for creating standalone, production-ready applications.

**Advantages:**
- ✅ Auto-configuration reduces boilerplate code
- ✅ Embedded servers (Tomcat, Jetty, Undertow)
- ✅ Starter dependencies for quick setup
- ✅ Production-ready features (actuator, metrics)
- ✅ No XML configuration required
- ✅ Easy microservices development
- ✅ Faster development cycle
</details>

<details>
<summary><b>3. Explain the difference between @RestController and @Controller</b></summary>

**Answer:**

| @Controller | @RestController |
|-------------|-----------------|
| Returns view names | Returns data (JSON/XML) |
| Used in MVC applications | Used in REST APIs |
| Requires @ResponseBody on methods | Combines @Controller + @ResponseBody |
| ViewResolver resolves view names | No view resolution |

```java
// @Controller example
@Controller
public class WebController {
    @GetMapping("/page")
    public String getPage() {
        return "viewName"; // Returns view
    }
}

// @RestController example
@RestController
public class ApiController {
    @GetMapping("/data")
    public Data getData() {
        return new Data(); // Returns JSON
    }
}
```
</details>

<details>
<summary><b>4. What is JPA and Hibernate?</b></summary>

**Answer:**

**JPA (Java Persistence API):**
- Specification for ORM in Java
- Defines how to map Java objects to database tables
- Provides standard annotations (@Entity, @Table, @Id, etc.)

**Hibernate:**
- Implementation of JPA specification
- Most popular ORM framework
- Provides additional features beyond JPA
- Handles database operations automatically

**Relationship:**
```
JPA (Interface/Specification)
    ↓
Hibernate (Implementation)
    ↓
Database (MySQL, PostgreSQL, etc.)
```
</details>

<details>
<summary><b>5. Explain @Entity, @Table, and @Id annotations</b></summary>

**Answer:**

```java
@Entity  // Marks class as JPA entity
@Table(name = "employees")  // Maps to database table
public class Employee {
    
    @Id  // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increment
    private Long id;
    
    @Column(name = "first_name", nullable = false)
    private String firstName;
}
```

- **@Entity**: Tells JPA this class represents a database table
- **@Table**: Specifies table name (optional if class name matches table)
- **@Id**: Marks the primary key field
- **@GeneratedValue**: Configures how ID is generated
</details>

### 🔶 Intermediate Level

<details>
<summary><b>6. Difference between PUT and PATCH methods?</b></summary>

**Answer:**

| PUT | PATCH |
|-----|-------|
| Full update | Partial update |
| Replaces entire resource | Updates specific fields |
| Idempotent | Idempotent |
| Requires all fields | Requires only changed fields |

```java
// PUT - Full update
@PutMapping("/{id}")
public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
    // Replace entire employee
    return service.fullUpdate(id, employee);
}

// PATCH - Partial update
@PatchMapping("/{id}")
public Employee patchEmployee(@PathVariable Long id, @RequestBody Map<String, Object> updates) {
    // Update only provided fields
    return service.partialUpdate(id, updates);
}
```
</details>

<details>
<summary><b>7. What is the difference between @RequestParam and @PathVariable?</b></summary>

**Answer:**

```java
// @PathVariable - URL path segment
@GetMapping("/employees/{id}")
public Employee getById(@PathVariable Long id) {
    // URL: /employees/123
    // id = 123
}

// @RequestParam - Query parameter
@GetMapping("/employees")
public List<Employee> search(@RequestParam String name) {
    // URL: /employees?name=John
    // name = "John"
}

// Combined
@GetMapping("/departments/{deptId}/employees")
public List<Employee> getEmployees(
    @PathVariable Long deptId,
    @RequestParam(defaultValue = "0") int page) {
    // URL: /departments/5/employees?page=2
}
```
</details>

<details>
<summary><b>8. Explain the service layer pattern</b></summary>

**Answer:**

**Purpose:**
- Separates business logic from controllers
- Promotes code reusability
- Makes testing easier
- Follows Single Responsibility Principle

**Architecture:**
```
Controller → Service Interface → Service Implementation → Repository
```

**Example:**
```java
// Interface
public interface EmployeeService {
    EmployeeDTO createEmployee(EmployeeDTO dto);
    EmployeeDTO getEmployeeById(Long id);
}

// Implementation
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    
    @Autowired
    private EmployeeRepository repository;
    
    @Override
    public EmployeeDTO createEmployee(EmployeeDTO dto) {
        // Business logic here
        Employee entity = convertToEntity(dto);
        Employee saved = repository.save(entity);
        return convertToDTO(saved);
    }
}
```
</details>

<details>
<summary><b>9. What is the purpose of DTOs (Data Transfer Objects)?</b></summary>

**Answer:**

**Benefits:**
- ✅ Decouples API from database schema
- ✅ Controls what data is exposed
- ✅ Reduces network payload
- ✅ Adds validation layer
- ✅ Prevents circular references

**Example:**
```java
// Entity (Database)
@Entity
public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private String password; // Sensitive!
    private Department department;
}

// DTO (API Response)
@Data
public class EmployeeResponseDTO {
    private Long id;
    private String fullName; // Combined field
    private String departmentName; // Flattened
    // No password exposed!
}
```
</details>

<details>
<summary><b>10. How do you implement pagination in Spring Boot?</b></summary>

**Answer:**

```java
// Controller
@GetMapping
public ResponseEntity<Page<EmployeeDTO>> getEmployees(
    @RequestParam(defaultValue = "0") int page,
    @RequestParam(defaultValue = "10") int size,
    @RequestParam(defaultValue = "id") String sortBy,
    @RequestParam(defaultValue = "ASC") String direction) {
    
    Sort sort = direction.equals("DESC") 
        ? Sort.by(sortBy).descending() 
        : Sort.by(sortBy).ascending();
    
    Pageable pageable = PageRequest.of(page, size, sort);
    Page<EmployeeDTO> employees = service.findAll(pageable);
    
    return ResponseEntity.ok(employees);
}

// Service
public Page<EmployeeDTO> findAll(Pageable pageable) {
    Page<Employee> employees = repository.findAll(pageable);
    return employees.map(this::convertToDTO);
}

// Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Inherits pagination methods
}

// Response
{
  "content": [...],
  "totalElements": 100,
  "totalPages": 10,
  "size": 10,
  "number": 0,
  "first": true,
  "last": false
}
```
</details>

### 🔴 Advanced Level

<details>
<summary><b>11. Explain transaction management in Spring Boot</b></summary>

**Answer:**

**@Transactional Annotation:**
- Ensures database operations are atomic
- Automatic rollback on exceptions
- Can be applied at class or method level

**ACID Properties:**
- **A**tomicity: All or nothing
- **C**onsistency: Valid state transitions
- **I**solation: Concurrent transaction handling
- **D**urability: Persisted changes

```java
@Service
public class BankService {
    
    @Autowired
    private AccountRepository accountRepo;
    
    @Transactional
    public void transferMoney(Long fromId, Long toId, Double amount) {
        Account from = accountRepo.findById(fromId).orElseThrow();
        Account to = accountRepo.findById(toId).orElseThrow();
        
        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);
        
        accountRepo.save(from);
        accountRepo.save(to);
        
        // If exception occurs here, both saves are rolled back
    }
    
    @Transactional(readOnly = true)  // Optimization for read operations
    public Account getAccount(Long id) {
        return accountRepo.findById(id).orElseThrow();
    }
    
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void criticalOperation() {
        // Highest isolation level
    }
}
```

**Propagation Types:**
```java
@Transactional(propagation = Propagation.REQUIRED)  // Default
@Transactional(propagation = Propagation.REQUIRES_NEW)  // New transaction
@Transactional(propagation = Propagation.NESTED)  // Savepoint
```
</details>

<details>
<summary><b>12. What are N+1 query problems and how to solve them?</b></summary>

**Answer:**

**Problem:**
```java
// Bad: N+1 queries
List<Department> departments = deptRepo.findAll(); // 1 query
for (Department dept : departments) {
    List<Employee> employees = dept.getEmployees(); // N queries!
}
```

**Solutions:**

**1. EAGER Fetching:**
```java
@Entity
public class Department {
    @OneToMany(fetch = FetchType.EAGER)
    private List<Employee> employees;
}
```

**2. JOIN FETCH:**
```java
@Query("SELECT d FROM Department d JOIN FETCH d.employees")
List<Department> findAllWithEmployees();
```

**3. Entity Graph:**
```java
@EntityGraph(attributePaths = {"employees"})
@Query("SELECT d FROM Department d")
List<Department> findAllWithEmployees();
```

**4. Batch Fetching:**
```java
@Entity
@BatchSize(size = 10)
public class Department {
    @OneToMany
    private List<Employee> employees;
}
```
</details>

<details>
<summary><b>13. How do you handle soft delete vs hard delete?</b></summary>

**Answer:**

**Hard Delete:**
Permanently removes record from database.

```java
@DeleteMapping("/{id}")
public void hardDelete(@PathVariable Long id) {
    repository.deleteById(id);
}
```

**Soft Delete:**
Marks record as deleted without removing it.

```java
@Entity
@SQLDelete(sql = "UPDATE employee SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
public class Employee {
    @Id
    private Long id;
    
    private boolean deleted = false;
    
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}

// Service
public void softDelete(Long id) {
    Employee employee = repository.findById(id).orElseThrow();
    employee.setDeleted(true);
    employee.setDeletedAt(LocalDateTime.now());
    repository.save(employee);
}

// Find including deleted
@Query("SELECT e FROM Employee e WHERE e.id = :id")
Optional<Employee> findByIdIncludingDeleted(@Param("id") Long id);
```

**Comparison:**

| Feature | Hard Delete | Soft Delete |
|---------|-------------|-------------|
| Data Recovery | ❌ No | ✅ Yes |
| Audit Trail | ❌ Lost | ✅ Maintained |
| Storage | ✅ Efficient | ❌ Grows over time |
| Complexity | ✅ Simple | ❌ More complex |
</details>

<details>
<summary><b>14. Explain caching in Spring Boot</b></summary>

**Answer:**

**Setup:**
```java
@SpringBootApplication
@EnableCaching
public class Application {
    // ...
}
```

**Implementation:**
```java
@Service
public class EmployeeService {
    
    @Cacheable(value = "employees", key = "#id")
    public Employee getById(Long id) {
        // Cached after first call
        return repository.findById(id).orElseThrow();
    }
    
    @CachePut(value = "employees", key = "#employee.id")
    public Employee update(Employee employee) {
        // Updates cache
        return repository.save(employee);
    }
    
    @CacheEvict(value = "employees", key = "#id")
    public void delete(Long id) {
        // Removes from cache
        repository.deleteById(id);
    }
    
    @CacheEvict(value = "employees", allEntries = true)
    public void deleteAll() {
        // Clears entire cache
        repository.deleteAll();
    }
}
```

**Cache Configuration:**
```java
@Configuration
public class CacheConfig {
    
    @Bean
    public CacheManager cacheManager() {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        cacheManager.setCaches(Arrays.asList(
            new ConcurrentMapCache("employees"),
            new ConcurrentMapCache("departments")
        ));
        return cacheManager;
    }
}
```

**Redis Cache:**
```properties
spring.cache.type=redis
spring.redis.host=localhost
spring.redis.port=6379
```
</details>

<details>
<summary><b>15. How do you implement validation in Spring Boot?</b></summary>

**Answer:**

**1. Bean Validation Annotations:**
```java
@Data
public class EmployeeRequestDTO {
    
    @NotBlank(message = "First name is required")
    @Size(min = 2, max = 50, message = "First name must be between 2-50 characters")
    private String firstName;
    
    @NotNull(message = "Email cannot be null")
    @Email(message = "Email should be valid")
    private String email;
    
    @Pattern(regexp = "^\\d{10}$", message = "Phone number must be 10 digits")
    private String phone;
    
    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 65, message = "Age must not exceed 65")
    private Integer age;
    
    @DecimalMin(value = "0.0", inclusive = false, message = "Salary must be positive")
    private Double salary;
    
    @Past(message = "Date of birth must be in the past")
    private LocalDate dateOfBirth;
    
    @Future(message = "Joining date must be in future")
    private LocalDate joiningDate;
}
```

**2. Controller Validation:**
```java
@RestController
public class EmployeeController {
    
    @PostMapping
    public ResponseEntity<Employee> create(@Valid @RequestBody EmployeeRequestDTO request) {
        // @Valid triggers validation
        return ResponseEntity.ok(service.create(request));
    }
}
```

**3. Custom Validator:**
```java
// Annotation
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AgeValidator.class)
public @interface ValidAge {
    String message() default "Invalid age";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

// Validator Implementation
public class AgeValidator implements ConstraintValidator<ValidAge, Integer> {
    
    @Override
    public boolean isValid(Integer age, ConstraintValidatorContext context) {
        return age != null && age >= 18 && age <= 65;
    }
}

// Usage
@Data
public class Employee {
    @ValidAge
    private Integer age;
}
```

**4. Programmatic Validation:**
```java
@Service
public class EmployeeService {
    
    @Autowired
    private Validator validator;
    
    public void validateEmployee(Employee employee) {
        Set<ConstraintViolation<Employee>> violations = validator.validate(employee);
        
        if (!violations.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (ConstraintViolation<Employee> violation : violations) {
                sb.append(violation.getMessage()).append("\n");
            }
            throw new ValidationException(sb.toString());
        }
    }
}
```
</details>

---

## 🎓 Advanced Concepts

### 🔐 Security Implementation

```java
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeHttpRequests()
                .requestMatchers("/api/public/**").permitAll()
                .requestMatchers("/api/admin/**").hasRole("ADMIN")
                .anyRequest().authenticated()
            .and()
            .httpBasic();
        
        return http.build();
    }
    
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
```

### 🔍 Custom Queries

```java
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
    // Method name query
    List<Employee> findByFirstNameAndLastName(String firstName, String lastName);
    
    // @Query with JPQL
    @Query("SELECT e FROM Employee e WHERE e.salary > :salary")
    List<Employee> findHighEarners(@Param("salary") Double salary);
    
    // Native query
    @Query(value = "SELECT * FROM employees WHERE YEAR(created_at) = :year", 
           nativeQuery = true)
    List<Employee> findByYear(@Param("year") int year);
    
    // Projection
    @Query("SELECT new com.example.dto.EmployeeSummary(e.id, e.firstName, e.lastName) " +
           "FROM Employee e")
    List<EmployeeSummary> findAllSummaries();
}
```

### 📊 Monitoring with Actuator

```xml
<!-- pom.xml -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

```properties
# application.properties
management.endpoints.web.exposure.include=*
management.endpoint.health.show-details=always
```

**Endpoints:**
- `/actuator/health` - Application health
- `/actuator/metrics` - Application metrics
- `/actuator/env` - Environment properties
- `/actuator/loggers` - Logger configuration

---

## 🐳 Docker Support

### Dockerfile

```dockerfile
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
```

### docker-compose.yml

```yaml
version: '3.8'

services:
  mysql:
    image: mysql:8.0
    container_name: mysql-db
    environment:
      MYSQL_ROOT_PASSWORD: root
      MYSQL_DATABASE: crud_database
    ports:
      - "3306:3306"
    volumes:
      - mysql-data:/var/lib/mysql

  app:
    build: .
    container_name: springboot-app
    depends_on:
      - mysql
    ports:
      - "8080:8080"
    environment:
      SPRING_DATASOURCE_URL: jdbc:mysql://mysql:3306/crud_database
      SPRING_DATASOURCE_USERNAME: root
      SPRING_DATASOURCE_PASSWORD: root

volumes:
  mysql-data:
```

**Commands:**
```bash
# Build and run
docker-compose up --build

# Stop
docker-compose down

# View logs
docker-compose logs -f app
```

---

## 🤝 Contributing

We welcome contributions! Please follow these guidelines:

### Contribution Process

1. **Fork the repository**
2. **Create a feature branch**
   ```bash
   git checkout -b feature/AmazingFeature
   ```
3. **Commit your changes**
   ```bash
   git commit -m 'Add some AmazingFeature'
   ```
4. **Push to the branch**
   ```bash
   git push origin feature/AmazingFeature
   ```
5. **Open a Pull Request**

### Code Standards

- Follow Java naming conventions
- Write meaningful commit messages
- Add unit tests for new features
- Update documentation
- Follow REST API best practices

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

```
MIT License

Copyright (c) 2026 Sai Vardhan Kallempudi

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction...
```

---

## 👤 Author

<div align="center">

### **Sai Vardhan Kallempudi**

[![GitHub](https://img.shields.io/badge/GitHub-SaiVardhanKallempudi-181717?style=for-the-badge&logo=github)](https://github.com/SaiVardhanKallempudi)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-0077B5?style=for-the-badge&logo=linkedin)](https://linkedin.com/in/yourprofile)
[![Email](https://img.shields.io/badge/Email-Contact-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:your.email@example.com)

</div>

---

## 🙏 Acknowledgments

- **Spring Team** - For the amazing framework
- **Baeldung** - Excellent tutorials and guides
- **Stack Overflow Community** - Problem-solving assistance
- **GitHub** - Platform for collaboration
- **All Contributors** - Thank you for your contributions!

---

## 📞 Support

### Need Help?

- 📧 **Email**: your.email@example.com
- 💬 **Discord**: [Join our server](https://discord.gg/yourserver)
- 🐛 **Issues**: [GitHub Issues](https://github.com/SaiVardhanKallempudi/springboot-crud-operations/issues)
- 📖 **Discussions**: [GitHub Discussions](https://github.com/SaiVardhanKallempudi/springboot-crud-operations/discussions)

---

<div align="center">

### ⭐ Star this repository if you find it helpful!

### 🚀 Happy Coding! 🚀

---

**Made with ❤️ using Spring Boot**

![Spring Boot](https://img.shields.io/badge/Made%20with-Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot)

</div>