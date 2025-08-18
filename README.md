# Spring Boot Dinner Web App

## About
This is a demo project for practicing Spring + Thymeleaf. The idea was to build some basic restaurants dinner web app.

It was made using Spring Boot, Spring Security, Thymeleaf, Spring Data JPA, Spring Data REST and Docker. Database is in memory H2.


## Configuration

Configuration Files
Folder `src/main/java/com/example/dinner_menu/` contains main java class that will call the another controller class.

- DinnerMenuApplication.java => Main Class
- controller/MenuController.java => Contains the List of Menu.
- src/main/resources/templates => Contains the HTML page code.

## How to run
There are several ways to run the application. You can run it from the command line with included Maven Wrapper, Maven or Docker.

Once the app starts, go to the web browser and visit http://localhost:8080/menu


### 1. Using the Maven Plugin:

Go to the root folder of the application and type:
```
./mvnw spring-boot:run
./mvnw clean package -DskipTests #Create a jar file!
```

### 2. Using Executable Jar:

Then you can run the JAR file:
```
$java -jar target/dinner-menu-0.0.1-SNAPSHOT.jar
```

### 3. Docker

It is possible to run Dinner Menu using Docker:

Build Docker image:
```
$ mvn clean package
$ docker build -t dinner-menu-app .
```
Run Docker container:
```
$ docker run --rm -i -p 8080:8080 \
      --name Dinner-menu-app \
      dinner-menu-app
```
