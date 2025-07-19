# 📆 Monthly Challenge App

A Spring Boot application to manage **monthly challenges** with full RESTful support — `GET`, `POST`, `PUT`, and `DELETE`. You can fetch challenges by month, add new ones, update existing ones, and delete them.

---

## 🚀 Features

- 📥 Add new challenges (POST)  
- 📤 View all challenges or by specific month (GET)  
- 🛠️ Update challenges (PUT)  
- ❌ Delete challenges (DELETE)  
- ✅ Clean and structured service layer  
- 📦 Uses `ResponseEntity` for standardized HTTP responses

---

## 🧰 Tech Stack

- Java 17+  
- Spring Boot  
- Spring Web  
- Maven  
- H2 / PostgreSQL (configurable)

---

## 📁 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/example/monthlychallenge/
│   │       ├── controller/
│   │       ├── model/
│   │       ├── service/
│   │       └── MonthlyChallengeAppApplication.java
│   └── resources/
│       ├── application.properties
```

---

## 📦 API Endpoints

### ➕ Add a Challenge

```
POST /api/challenges
```

**Request Body**
```json
{
  "month": "january",
  "description": "Workout 5 days a week"
}
```

---

### 📋 Get All Challenges

```
GET /api/challenges
```

---

### 📆 Get Challenge by Month

```
GET /api/challenges/january
```

---

### ✏️ Update Challenge

```
PUT /api/challenges/january
```

**Request Body**
```json
{
  "description": "Workout every day"
}
```

---

### 🗑️ Delete Challenge

```
DELETE /api/challenges/january
```

---

## ▶️ Running Locally

1. **Clone the Repository**
```bash
git clone https://github.com/ArjunBhogavimath/Monthly-Challenge-App.git
cd Monthly-Challenge-App
```

2. **Run the Application**
```bash
./mvnw spring-boot:run
```

The application will start at: `http://localhost:8080`

---

## 🔧 Future Enhancements

- Add persistent database (PostgreSQL/MySQL)  
- Global exception handling and validations  
- Swagger/OpenAPI documentation  
- JWT-based authentication

---

## 👨‍💻 Author

**Mallikarjunaiah B M**  
📧 Email: vpmallikarjuna03@gmail.com  
🔗 LinkedIn: [https://www.linkedin.com/in/mallikarjunaiah-b-m-1331a319a/](https://www.linkedin.com/in/mallikarjunaiah-b-m-1331a319a/)
