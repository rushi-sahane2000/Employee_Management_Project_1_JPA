# 👨‍💼 Employee Management System (Spring Boot REST API)

A RESTful Employee Management System built using Spring Boot and JPA.  
This project provides APIs to perform CRUD operations on employee data.

---

## 🚀 Features

- Add new employee
- Get all employees
- Get employee by ID
- Update employee
- Delete employee

---

## 🛠️ Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL 
- Postman (for testing)

---
## 📁 Project Structure

src/
 └── main/
     ├── java/
     │    └── com/cfs/JPA01/
     │         ├── controller/
     │         │     └── EmployeeController.java
     │         ├── entity/
     │         │     └── Employee.java
     │         ├── repository/
     │         │     └── EmployeeRepo.java
     │         ├── service/
     │         │     ├── EmployeeService.java
     │         │     └── EmployeeServiceImpl.java
     │         └── Jpa01Application.java
     │
     └── resources/
          ├── application.properties

---

## 📡 API Endpoints

### 1. Get All Employees
GET /employees

### 2. Get Employee by ID
GET /employees/{id}

### 3. Create Employee
POST /employees

### 4. Update Employee
PUT /employees/{id}

### 5. Delete Employee
DELETE /employees/{id}

---

## 📥 Sample JSON (Request Body)

{
  "name": "Rushikesh Sahane",
  "email": "rushi@gmail.com",
  "department": "IT",
  "salary": 40000
}

---

## ⚙️ Application Properties (Example)

spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

---

## ▶️ How to Run

1. Clone the repository  
git clone https://github.com/your-username/employee-management.git  

2. Open project in IDE (IntelliJ / Eclipse)  

3. Run main class  
Jpa01Application.java  

4. Server will start on  
http://localhost:8080  

---

## 🧪 Testing

Use Postman to test APIs:

GET http://localhost:8080/employees

---

## 📌 Author

Rushikesh Sahane
