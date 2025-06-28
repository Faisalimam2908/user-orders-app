# 📦 user-orders-app

A simple Spring Boot application demonstrating the use of **JPA**, **DTOs**, **Lazy loading**, and **RESTful APIs**. The app models a basic `User` and `Order` relationship, where one user can place multiple orders.

## 🚀 Features

- `User` ↔ `Order` mapped using JPA annotations (`@OneToMany`, `@ManyToOne`)
- Uses **Lazy loading** with `JOIN FETCH` to avoid `LazyInitializationException`
- Clean REST API endpoint using **Spring Boot**
- **DTO-based API response** to decouple entity logic
- In-memory **H2 database** for fast testing and development

## 🛠 Tech Stack

| Component     | Technology          |
|---------------|---------------------|
| Language      | Java 17             |
| Framework     | Spring Boot 3.x     |
| ORM           | Spring Data JPA     |
| Database      | H2 (in-memory)      |
| Build Tool    | Maven               |
| API Style     | RESTful             |

## 🔗 API Endpoint

### Get user with orders:
```
GET /users/{id}
```

**Sample Response:**
```json
{
  "id": 1,
  "name": "Faisal Imam",
  "email": "faisal@example.com",
  "orders": [
    {
      "id": 101,
      "product": "Laptop",
      "amount": 60000.0
    },
    {
      "id": 102,
      "product": "Mouse",
      "amount": 500.0
    }
  ]
}
```

## 🧪 How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/<your-username>/user-orders-app.git
   cd user-orders-app
   ```

2. Open in IntelliJ / Eclipse

3. Run the app using:
   ```bash
   mvn spring-boot:run
   ```

4. Visit:  
   👉 http://localhost:8080/users/1

## 🧠 Learning Goals

- Master **lazy vs eager fetching** in JPA
- Prevent `LazyInitializationException` using `JOIN FETCH`
- Use **DTO pattern** for clean and safe API responses
- Build scalable Spring Boot REST APIs with proper project structure
