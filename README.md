Flipkart-User-Pagination is a Spring Boot REST API project that demonstrates how to build backend services with CRUD operations and pagination using Spring Data JPA. The project follows a clean architecture and provides pageable user management similar to what you’d expect in real-world applications.

🚀 Features
✔️ Spring Boot based REST API
✔️ User management with full CRUD operations
✔️ Pagination using PageRequest and Pageable from Spring Data JPA
✔️ Simple and extendable service-repository architecture
✔️ Easy to use endpoints for fetching users with pagination support
✔️ Java-based implementation (Maven project)

📁 What’s Inside

The repository includes:
🔹 Controller Layer – Exposes REST endpoints to handle HTTP requests for users
🔹 Service Layer – Contains business logic for user operations (like fetching users with pagination)
🔹 Repository Layer – Interfaces with the database using Spring Data JPA
🔹 Entity Classes – Defines the User entity for database mapping
🔹 Pagination Logic – Implements Spring Data JPA pagination with PageRequest and Page<UserEntity>

💡 Technology Stack
Technology	Purpose
Java	Programming language
Spring Boot	REST API development framework
Spring Data JPA	Database access and pagination
Maven	Project build and dependency management
H2 / MySQL	Database support (configurable)
📌 Example Pagination Endpoint
GET /users?page=0&size=10


Returns a paginated list of users where:
➡ page – page number (starting from 0)
➡ size – number of users per page

🛠 How It Works
UserRepository extends JpaRepository<UserEntity, Long>

Service method uses:
PageRequest pageable = PageRequest.of(page, size);
Page<UserEntity> users = userRepository.findAll(pageable);

Controller returns the paginated response to the API consumer.

📄 License
This project is open-source and can be freely used to learn Spring Boot pagination and CRUD patterns.

👤 Author
Bidyut,
Java Backend Develope
