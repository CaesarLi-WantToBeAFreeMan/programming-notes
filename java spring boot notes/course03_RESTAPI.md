# Title: Course 03: REST API
# Date: Janurary 22, 2025
# Author: Caesar James LEE
## `Model View Controller (MVC)`
1. `model`
    * The data and the business logic of the application
    * It can be a variable, an object, data from a database, etc
2. `view`
    * Displays the data to the user
    * You can think of it's a UI
    * It can be a web page, a component, a console, a page of desktop or mobile application, etc
3. `controller`
    * Handles user requests, interacts with the model, and returns the appropriate view
    * It can be a click event, a mouse hover event, a keyboard event, etc
* benefits
    1. `separation of concerns`
        * Helps separate the business logic, user interface, and user input handling
        * Makes the application easier to manage and maintain
    2. `scalability`
        * Each component can be worked on independently
        * Adding new features or changing the UI can be done without affecting the business logic
    3. `testability`
        * You can test the model, view and controller independently
    4. `reusability`
        * Models and controllers can often be reused indifferent parts of the application or across different application
## return `Hello World!` when type `/hello`
* We need add a controller
* code
    ```java
        package com.caesar.springboot_demo.person;

        import org.springframework.web.bind.annotation.GetMapping;//import @GetMapping
        import org.springframework.web.bind.annotation.RestController;//import @RestController

        @RestController//is used to mark the class is a controller where each method returns a response directly (as opposed to returning a view)
        public class PersonController {
            @GetMapping("/hello")//is used to map HTTP GET requests onto specific handler methods
            //any HTTP client(a browser, a REST client like Postman, or a tool like cURL) sends /hello endpoint, Spring will route that request to this method
            String home(){
                 return "<h1>Hello World!</h1>" +
                        "<br>" +
                        "<p>This is " +
                        "<b>hello</b> " +
                        "endpoint</p>";
            }
        }
    ```
## return an ArrayList when type `/persons/read`
* we need add a repository and a controller as well
* code
    * `PersonRepository.java`
    ```java
        package com.caesar.springboot_demo.person;

        import java.time.LocalDateTime;
        import java.time.temporal.ChronoUnit;//import ChronoUnit
        import java.util.ArrayList;
        import java.util.List;
        import jakarta.annotation.PostConstruct;//import PostConstruct
        import org.springframework.stereotype.Repository;//import @Repository

        @Repository//is used to mark a class as a Data Access Object (DAO)
        //indicates the class will handle reading, writing and updating data from or to the database
        public class PersonRepository {
            private List <Person> persons = new ArrayList <>();

            List <Person> findAll(){
                return persons;
            }

            @PostConstruct//marks the method will run immediately after the PersonRepository bean is constructed and injected
            //is used to populate the persons with initial data
            private void init(){
                persons.add(new Person(
                        1,
                        "Taylor",
                        "Swift",
                        34,
                        Location.NEW_YORK,
                        "taylorswift@fake.com",
                        1234567891L,
                        LocalDateTime.now().plus(12, ChronoUnit.MINUTES)//adds 12 minutes to the current time
                ));
            }
        }
    ```
    * `PersonController.java`
    ```java
        package com.caesar.springboot_demo.person;

        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;
        import java.util.List;

        @RestController
        public class PersonController {
            private final PersonRepository personRepository;

            //constructor injection
            public PersonController(PersonRepository personRepository){
                this.personRepository = personRepository;
            }

            @GetMapping("/person/read")
            List <Person> findAll(){
                return personRepository.findAll();
            }
        }
    ```
## return a Person when type `/persons/read/{id}`
* we need add two methods, and two annotations as well
* code
    * `PersonRepository.java`
        ```java
            //...
            public class PersonRepository{
                //...
                Person findById(Integer id){
                    return persons.stream()//convert the list to a stream
                            .filter(person -> person.id() == id)//find the person with a matching id
                            .findFirst()
                            .get();//extract the value from optional object
                }
                //...
            }
        ```
    * `PersonController.java`
        ```java
            //...
            import org.springframework.web.bind.annotation.GetMapping;
            import org.springframework.web.bind.annotation.PathVariable;
            import org.springframework.web.bind.annotation.RestController;
            import org.springframework.web.bind.annotation.RequestMapping;//import @RequestMapping
            //...
            @RestController
            @RequestMapping("/person/read")//specify the base URL
            public class PersonController{
                //...
                @GetMapping("")
                List <Person> findAll(){
                    return personRepository.findAll();
                }

                @GetMapping("/{id}")//{id} is a variable in the URL path
                Person findById(@PathVariable Integer id){//bind the id from the URL path to the method parameter
                    return personRepository.findById(id);
                }
            }
        ```