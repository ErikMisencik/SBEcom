# 🛒 E-Commerce Web Application

This is a full-featured **E-Commerce Web Application** built using **Java Spring Boot**, implementing a robust back-end architecture with **RESTful APIs**, **JPA (Hibernate)** for ORM, and a layered service-repository pattern. It provides a scalable and modular foundation for managing products, categories, users, addresses, carts, and more.

---

## 🎓 Learning Resource & Course Info

This project is built as part of my learning journey using the course:

**_The Complete Spring Boot [SpringBoot] Full Stack Developer Guide: Build a Production-Grade Complex eCommerce Real Time Project!_**

- 🔥 **React Masterclass Included**
- 🎯 **Target Audience:** Beginners aiming to become Full Stack Java Developers
- 📚 **Platform:** Udemy
- 💻 **GitHub Source:** [EmbarkXOfficial Repository](https://github.com/EmbarkXOfficial/spring-boot-course/tree/main)

---

### 📘 Course Highlights

- Spring Framework Core & Spring MVC
- Spring Boot REST APIs from scratch
- JPA/Hibernate, MySQL, PostgreSQL
- Spring Security & JWT Authentication
- Role-Based Authorization and Custom Auth
- Pagination, Sorting, Validation, Lombok
- E-Commerce Modules: Category, Product, Cart, Orders
- Deployment with AWS, Spring Boot Profiles


---

## 🚀 Tech Stack

- **Backend Framework:** Spring Boot (Java)
- **ORM:** JPA / Hibernate
- **REST API:** Fully implemented for frontend/backend communication
- **Database:** MySQL or other JPA-compatible DB
- **Validation:** Jakarta Bean Validation (`@Valid`)
- **API Testing:** Postman
- **Object Mapping:** ModelMapper
- **File Uploads:** Multipart support for product image handling
- **Pagination & Sorting:** Spring Data JPA pageable queries

---

## 📁 Project Structure

- `controller` – Handles incoming HTTP requests and maps them to service calls.
- `service` & `serviceImpl` – Business logic layer handling core operations.
- `repository` – Interfaces for JPA database operations.
- `model` – JPA entity classes for database mapping.
- `payload` – DTOs for request/response bodies.
- `exceptions` – Custom exception classes for API error handling.
- `config` – Constants and configuration files.

---

## ✨ Key Features

- 📦 **Product Management**
    - Add, update, delete, and search products
    - Support for product image uploads
    - Dynamic discount & special price calculation
    - Pagination and sorting on product listings

- 🗂️ **Category-Based Product Filtering**
    - Retrieve products based on category
    - Efficient DB queries with Spring Data JPA

- 📍 **User Address Management**
    - Add, update, retrieve, and delete addresses linked to users
    - Bi-directional mapping between users and addresses

- 🛒 **Shopping Cart Support**
    - Add/remove products to/from user carts
    - Update cart when product data changes

- 🔍 **Search Functionality**
    - Keyword-based product search with pagination and sorting

- 🔒 **Role-Specific Access Endpoints**
    - Public routes for browsing
    - Admin routes for product management

---

## 📬 API Usage

This project uses **Postman** for testing REST endpoints.

---
📦 Setup
1. Clone this repository
2. Configure application.properties with your DB (uncomment the MySQL or PostgreSQL section)
   - For H2, no additional configuration is needed just comment H2 section
3. Run the Spring Boot app from your IDE 
4. Use Postman to interact with the API (There is file Java Spring Boot post man collection.json in the root directory)
 
 ---

## 📄 Creating Jar file for Deployment
1. Open terminal in the project root directory
2. Run the command:
   ```bash
   ./mvnw package  # using Maven for building the project
   ```
3. The generated JAR file will be located in the `target` directory
4. This JAR can be deployed on any server supporting Java for example AWS

 ---

