# Microservices-Based E-Commerce Application (Bookstore)

## Overview

This is a simple microservices-based e-commerce application built using **Spring Boot (Maven)**. The project consists of two core microservices:

1. **[Product Service](product-service/)** - Manages book-related operations.
2. **[Customer Service](customer-service/)** - Manages customer-related operations.

The services communicate through RESTful APIs and are documented using **Swagger 3**. The application uses **H2 Database** for data persistence.

## Features

- CRUD operations for products (books) and customers.
- RESTful APIs for seamless communication.
- Integrated Swagger documentation for API testing.
- Uses **Spring Boot**, **Spring Data JPA**, and **H2 Database**.

## Technologies Used

- Java 23
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Swagger 3
- Maven

## Project Structure

```
bookstore-microservices/
├── [product-service](product-service)/
│   ├── src/main/java/com/example/bookstore_product_service/
│   │   ├── controller/
│   │   │   ├── ProductController.java
│   │   ├── model/
│   │   │   ├── Product.java
│   │   ├── repository/
│   │   │   ├── ProductRepository.java
│   │   ├── service/
│   │   │   ├── ProductService.java
│   │   ├── BookstoreProductServiceApplication.java
│   ├── src/main/resources/
│   │   ├── application.yml
│   ├── pom.xml
├── [customer-service](customer-service)/
│   ├── src/main/java/com/example/bookstore_customer_service/
│   │   ├── controller/
│   │   │   ├── CustomerController.java
│   │   ├── model/
│   │   │   ├── Customer.java
│   │   ├── repository/
│   │   │   ├── CustomerRepository.java
│   │   ├── service/
│   │   │   ├── CustomerService.java
│   │   ├── BookstoreCustomerServiceApplication.java
│   ├── src/main/resources/
│   │   ├── application.yml
│   ├── pom.xml
├── README.md
```

## Setup Instructions

### 1. Clone the Repository

```sh
git clone https://github.com/yourusername/bookstore-microservice.git
cd bookstore-microservices
```

### 2. Run Each Microservice

Navigate to `product-service` and `customer-service` directories separately and execute:

```sh
mvn spring-boot:run
```

### 3. Access Swagger Documentation

- [Product Service](http://localhost:8080/swagger-ui/index.html)
- [Customer Service](http://localhost:8081/swagger-ui/index.html)

### 4. Testing APIs

Use **Postman** or Swagger UI to test API endpoints like:

- `POST /products` - Add a new book.
- `GET /products` - Retrieve all books.
- `POST /customers` - Add a new customer.
- `GET /customers` - Retrieve all customers.


## License

This project is open-source under the MIT License.

