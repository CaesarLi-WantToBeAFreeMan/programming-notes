# Title: Course 03: REST API
# Date: January 22, 2025
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
## throw a 404 not found error when type an non-existent id
* code
    * `PersonRepository.java`
        ```java
            //...
            import java.util.Optional;//import optional

            @Repository
            public class PersonRepository{
                //...
                Optional <Person> findById(Integer id){//return an optional data type
                    return persons.stream()
                            .filter(person -> person.id() == id)
                            .findFirst();
                }
            }
        ```
    * `PersonController.java`
        ```java
            //...
            import java.util.Optional;

            @RestController
            @RequestMapping("/person/read")
            public class PersonController{
                //...
                @GetMapping("/{id}")
                Person findById(@PathVariable Integer id){
                    Optional <Person> person =  personRepository.findById(id);//declare a local optional variable
                    if(person.isEmpty())//if the given id doesn't exist
                        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Person Not Found");//throw a 404 not found error
                    return person.get();//else return the person
                }
            }
        ```
## create data
* code
    * `PersonRepository.java`
        ```java
            //...
            @Repository
            public class PersonRepository{
                //...
                void create(Person person){
                    persons.add(person);
                }
            }
        ```
    * `PersonController.java`
        ```java
            //...
            import org.springframework.web.bind.annotation.*;//import @RestController, @RequestMapping, @GetMapping, @PostMapping, etc
            @RestController
            @RequestMapping("/person")
            public class PersonController{
                @PostMapping("/create")
                void create(@RequestBody Person person){
                    personRepository.create(person);
                }
            }
        ```
## throw a 201 created error when create existent data
* code
    * `PersonController.java`
        ```java
            //...
            import org.springframework.http.HttpStatus;
            import org.springframework.web.bind.annotation.*;
            @RestController
            @RequestMapping("/person")
            public class PersonController{
                //...
                @ResponseStatus(HttpStatus.CREATED)
                @PostMapping("/create")
                void create(@RequestBody Person person){
                    personRepository.create(person);
                }
            }
        ```
## update data
* code
    * `PersonRepository.java`
        ```java
            //...
            @Repository
            public class PersonRepository{
                //...
                //update
                void update(Person person, Integer id){
                    Optional <Person> existingPerson = this.findById(id);
                    if(existingPerson.isPresent())
                        persons.set(persons.indexOf(existingPerson.get()), person);
                }
            }
        ```
    * `PersonController.java`
        ```java
            import org.springframework.http.HttpStatus;
            import org.springframework.web.bind.annotation.*;
            @RestController
            @RequestMapping("/person")
            public class PersonController{
                //...
                //put
                @ResponseStatus(HttpStatus.NO_CONTENT)//no content to send
                @PutMapping("/update/{id}")
                void update(@RequestBody Person person, @PathVariable Integer id){
                    personRepository.update(person, id);
                }
            }
        ```
## delete data
* code
    * `PersonRepository.java`
        ```java
            //...
            @Repository
            public class PersonRepository{
                //...
                 //delete
                void delete(Integer id){
                    persons.removeIf(person -> person.id().equals(id));
                }
            }
        ```
    * `PersonController.java`
        ```java
            import org.springframework.http.HttpStatus;
            import org.springframework.web.bind.annotation.*;
            @RestController
            @RequestMapping("/person")
            public class PersonController{
                //...
                //delete
                @ResponseStatus(HttpStatus.NO_CONTENT)
                @DeleteMapping("/delete/{id}")
                void delete(@PathVariable Integer id){
                    personRepository.delete(id);
                }
            }
        ```
## throw an own exception
* code
    * `PersonNotFoundException.java`
        ```java
            package com.caesar.springboot_demo.person;
            import org.springframework.http.HttpStatus;
            import org.springframework.web.bind.annotation.ResponseStatus;
            @ResponseStatus(HttpStatus.NOT_FOUND)
            public class PersonNotFoundException extends RuntimeException{
                public PersonNotFoundException(){
                    super("Person Not Found");
                }
            }
        ```
    * `PersonController.java`
        ```java
            //...
            import org.springframework.http.HttpStatus;
            import org.springframework.web.bind.annotation.*;
            @RestController
            @RequestMapping("/person")
            public class PersonController{
                //...
                @GetMapping("/read/{id}")
                Person findById(@PathVariable Integer id){
                    Optional <Person> person =  personRepository.findById(id);
                    if(person.isEmpty())
                        throw new PersonNotFoundException();//throw PersonNotFoundException that we defined
                    return person.get();
                }
            }
        ```
## validation from `boot.springframework.org`
* steps
    1. open `pom.xml`
    2. type these code within dependencies
        ```xml
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-validation</artifactId>
            </dependency>
        ```
    3. reload the `pom.xml`
    4. add annotations
* code
    * `Person.java` (record)
        ```java
            package com.caesar.springboot_demo.person;
            import java.time.LocalDateTime;
            import jakarta.validation.constraints.*;//import @NotBlank, @Size, @Positive, @Email

            public record Person(
                    Integer id,
                    @NotBlank//ensure the string is filled with at least one non-whitespace character
                    //@NotEmpty ensures that the field is not null, not empty
                    //@NotNull ensures that the field is not null
                    @Size(min = 1, max = 30)//ensure the field has between [1, 30] character(s)
                    String firstName,
                    String lastName,
                    @Positive//ensure the number is filled with positive number
                    Integer age,
                    Location address,
                    @Email//ensure the string matches the email format
                    String email,
                    Long telephone,
                    LocalDateTime registerDateTime
            ){/*...*/}
        ```
    * `PersonController.java`
        ```java
            //...
            import org.springframework.http.HttpStatus;
            import jakarta.validation.Valid;//import @Valid
            import org.springframework.web.bind.annotation.*;
            @RestController
            @RequestMapping("/person")
            public class PersonController{
                //post
                @ResponseStatus(HttpStatus.CREATED)
                @PostMapping("/create")
                void create(@RequestBody @Valid Person person){
                    personRepository.create(person);
                }
            }
        ```
## throw some illegal argument exceptions
* code
    * `Person.java`
        ```java
            package com.caesar.springboot_demo.person;
            import java.time.LocalDateTime;
            import jakarta.validation.constraints.*;
            public record Person(
                    @PositiveOrZero
                    Integer id,
                    @NotBlank
                    @Size(min = 1, max = 30)
                    String firstName,
                    String lastName,
                    @Positive
                    Integer age,
                    Location address,
                    @Email
                    String email,
                    Long telephone,
                    LocalDateTime registerDateTime
            ){
                public Person{
                    if(registerDateTime.isBefore(LocalDateTime.of(1989, 6, 4, 0, 0, 0)))
                        throw new IllegalArgumentException("our server was running on June 4, 1989 at 0");
                    if(id < 0)
                        throw new IllegalArgumentException("id must greater than or equal to 0");
                    if(firstName.isBlank())
                        throw new IllegalArgumentException("first name cannot be a blank");
                    if(firstName.length() > 30)
                        throw new IllegalArgumentException("first name is so long");
                    if(lastName.isBlank())
                        throw new IllegalArgumentException("last name cannot be a blank");
                    if(lastName.length() > 30)
                        throw new IllegalArgumentException("last name is so long");
                    if(age < 1)
                        throw new IllegalArgumentException("age must greater than 0");
                }
                //...
            }
        ```