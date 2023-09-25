# <h2 align="center">Spring Security JWT Project Starter</h3>

<div align="center">

[![Status](https://img.shields.io/badge/status-active-success.svg)]()
[![GitHub Issues](https://img.shields.io/github/issues/chijioke-ibekwe/The-Documentation-Compendium.svg)](https://github.com/chijioke-ibekwe/spring-security-jwt/issues)
[![GitHub Pull Requests](https://img.shields.io/github/issues-pr/chijioke-ibekwe/The-Documentation-Compendium.svg)](https://github.com/chijioke-ibekwe/spring-security-jwt/pulls)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](/LICENSE)

</div>

---

<p align="center"> Spring Boot project starter code fully configured with JWT authentication and authorization, using Spring Boot 3 and Spring Security 6. Features user login, logout, token refresh and user roles/permissions
    <br> 
</p>

## 📝 Table of Contents
- [About](#about)
- [Getting Started](#getting_started)
- [Usage](#usage)
- [Built Using](#built_using)
- [Authors](#authors)

## 🧐 About <a name = "about"></a>
This is a fully configured Spring Security JWT module using the new Spring Boot 3 and Spring Security 6 
frameworks. It provides all the spring security JWT starter code you need to quickly bootstrap your small to medium scale 
projects, allowing you to focus on your peculiar business logic. This project supports the following features:
- User registration
- User login using the password grant type
- User token refresh using the refresh token
- User logout
- API method security with user roles and permissions

**If you find this project useful, kindly drop a star on this repo. I'd really appreciate it.**

## 🏁 Getting Started <a name = "getting_started"></a>
### Prerequisites  
To successfully use this project, you'll need:
- **JDK >= v17.** That is because this project was developed using Spring Boot 3, which requires Java 17
as a minimum version.
- **Apache Maven**

## 🎈 Usage <a name="usage"></a>
To use this project:
1. Fork the repository

2. Clone the repository using the following command:
   ```
   git clone https://github.com/<your-git-username>/spring-security-jwt.git
   ```

3. A docker compose file is attached to this project to help you easily set up a development database. To do this,
   run the following command in your terminal or command prompt
   ```
   docker compose up -d
   ```
   This command will spin-up the following containers running in a detached mode: 
   - A postgres database running on `localhost:5431`, and 
   - A pgAdmin UI running on `localhost:5050` for managing the database.

4. Using the `pgAdmin` interface or your `psql`, create a database called `starter`. If you wish to name this database 
   something different, make sure to update the database configuration in the `application.yml` file.

5. Setup an env variable called `SECRET_KEY`. This value will be used in signing and decoding your JWT.

6. Lastly, run the following command to start the application:
   ```
   mvn clean compile exec:java
   ```
   Liquibase will run the migration files within the `resources/db` directory, upon startup, to set up the database.
   The schema created will have the following structure.  
   <img height="300" src="../../../Pictures/jwt-project-starter-schema-2.png" width="500"/>

Feel free to begin customizations!

## ⛏️ Built Using <a name = "built_using"></a>
- [Spring Boot v3.1.2](https://spring.io/projects/spring-boot) - Spring Boot 3
- [PostgreSQL](https://www.postgresql.org/) - PostgreSQL Database

## ✍️ Authors <a name = "authors"></a>
- [@chijioke-ibekwe](https://github.com/chijioke-ibekwe) - Idea & Initial work