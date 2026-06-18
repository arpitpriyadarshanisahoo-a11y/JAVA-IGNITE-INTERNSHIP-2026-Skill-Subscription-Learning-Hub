# Viva / Interview Questions

##  Basic

- What is Spring Boot?
- ANS:
- Spring Boot is a Java framework built on top of the Spring Framework that simplifies application development. It provides auto-configuration, embedded servers (like Tomcat), and starter dependencies, reducing the need for manual configuration. It helps developers create standalone, production-ready applications quickly and efficiently.
- What is MVC architecture?
- ANS:
- MVC stands for Model–View–Controller. It is a software design pattern used to develop applications by separating them into three components:
Model – Manages the application's data and business logic.
View – Displays the data to the user (user interface).
Controller – Handles user requests, processes input, and coordinates between the Model and View.

---

##  Intermediate

- What is Service layer?
- ANS:
- The Service Layer is a part of Spring Boot that contains the business logic of an application. It acts as a bridge between the Controller and Repository layers.
Functions:
Processes business rules.
Receives requests from Controller.
Interacts with Repository to access data.
- What is Repository in Spring Data JPA?
- ANS:
- A Repository is an interface used to perform database operations such as Create, Read, Update, and Delete (CRUD).
Features:
Reduces database coding.
Provides built-in CRUD methods.
Extends interfaces like JpaRepository.
- Difference between GET and POST?
- ANS:
- 1. GET method is used to retrieve data from the server, whereas POST method is used to send data to the server.

2. In GET, data is passed through the URL, whereas in POST, data is sent in the request body.

3. GET is less secure because the data is visible in the URL, whereas POST is more secure as the data is hidden from the URL.

4. GET has a limitation on the amount of data that can be sent, whereas POST can send large amounts of data.

5. GET requests can be cached and bookmarked, whereas POST requests cannot be cached or bookmarked easily.

---

##  Advanced (Project Based)

- How does subscription flow work?
- ANS:
- The subscription flow generally works as follows:
User selects a subscription plan.
Payment is processed successfully.
Subscription details are stored in the database.
User gets access to subscribed features/services.
- How do you link User and SkillPack?
- ANS:
- User and SkillPack are usually linked using a relationship mapping in JPA, such as @ManyToMany or @OneToMany.
- EX-@ManyToMany
private List<SkillPack> skillPacks;
- Why do we use Service layer?
- ANS:
- The Service Layer is used to:
Separate business logic from Controller.
Improve code maintainability.
Reuse business logic across multiple controllers.
Make the application easier to test.
- How does JSP get data from Controller?
- ANS:
- The Controller sends data to JSP using a Model object.
Example:
Java
model.addAttribute("name", "Arpita");
return "home";
In JSP:
JSP
${name}
The JSP accesses and displays the data using Expression Language (EL).
