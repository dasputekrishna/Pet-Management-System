Pet Management System is the systen an element og\f
The Pet Management System is a Spring Boot application that enables users to manage pet records stored in an H2 database. It provides CRUD (Create, Read, Update, Delete) functionalities for pet details.

Features
CRUD Operations: Perform Create, Read, Update, and Delete operations on pet records.
RESTful API: Provides RESTful endpoints for managing pet records.
H2 Database: Utilizes an in-memory H2 database for data storage.
Spring Boot: Developed using the Spring Boot framework.
Getting Started
Follow these instructions to get the Pet Management System up and running on your local machine.

Prerequisites
Java Development Kit (JDK) 8 or higher
Maven or Gradle build tool
Git
Installation

Clone the repository:
bash
Copy code
git clone <https://github.com/dasputekrishna/Pet-Management-System>

Navigate to the project directory:
bash
Copy code
cd pet-management-system

Build the project:
bash
Copy code
mvn clean install
Run the application:

bash
Copy code
java -jar target/pet-management-system.jar
Access the application in your web browser at http://localhost:8080.

Usage
Use Postman or any REST client to interact with the API endpoints.

Available endpoints:
GET /api/pets: Retrieve all pets
GET /api/pets/{id}: Retrieve pet by ID
POST /api/pets: Add a new pet
PUT /api/pets/{id}: Update pet
DELETE /api/pets/{id}: Delete pet

Configuration
Database configuration is located in the application.properties file.
Modify the properties in the application.properties file according to your environment requirements.

Contributing
Contributions are welcome! Please fork the repository, make your changes, and submit a pull request.

Acknowledgments
This project was created to demonstrate Spring Boot and H2 database integration.
