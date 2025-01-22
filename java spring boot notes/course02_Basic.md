# Title: Course 02: Basic
# Date: Janurary 21, 2025
# Author: Caesar James LEE
## `spring initializer`
* We need a [`spring initializer`](https://start.spring.io/) to generate a spring boot project
* metadata meanings
    1. `Group`
        * Is a unique identifier for your project, typically following the **reverse domain name** notation convention
        * If your domain name is `triblec.com`, and group name should be `com.triblec`
        * Repreents the group or organization that is responsible for the project and is used to organize your project in repositories or artifact repositories
    2. `Artifact`
        * Is the name of your project or application, typically **in lowercase** and reflects the name of the generated artifact
        * Uniquely identifies the build output (`.jar` file) and is part of the project's dependency coordinates
        * Combination of `group` and `artifact` uniquely identifies your project in a repository
        * For `maven`, it's the value of the `<artifactId>` element in `pom.xml`
    3. `Name`
        * Is a human-readable for your project
        * It's often used in the UI or CLI tools to display the project's name
        * For `maven`, it's the value of `<name>`element in `pom.xml`
    4. `Description`
        * Is a brief explanation of what your project does
        * For `maven`, it's the value of the `<description>` element in `pom.xml`
    5. `Package name`
        * Is the base package name for your java classes
        * Defines the root java package structure in your project
        * By default, this package structure is used for organizing your java classes, configurations, and services in the project
        * Corresponds to the base package structure under the `src/main/java` directory
    6. example
        1. `Group`: `com.example`
        2. `Artifact`: `springboot-demo`
        3. `Name`: `Spring Boot Demo`
        4. `Description`: `A demo Spring Boot application for learning purposes`
        5. `Package Name`: `com.example.springbootdemo`
        6. structures
            ```bash
                springboot-demo/
                ├── src/
                │   └── main/
                │       └── java/
                │           └── com/
                │               └── example/
                │                   └── springbootdemo/
                │                       ├── SpringbootDemoApplication.java
                ├── pom.xml
                ├── README.md
                └── application.properties
            ```
        7. Adds dependencies
            * `Spring Web`
                * Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
            * `Spring Boot DevTools`
                * Provides fast application restarts, LiveReload, and configurations for enhanced development experience.
        8. Clicks `GENERATE` button to download a `.zip` file
        9. Extracts it and opens it on an IDE
        10. Runs project
            1. Clicks `run` button
            2. Opens `terminal` in this reponsitory and type `./mvnw spring-boot:run`
## output `hello world`
1. create a `HelloWorld.java` in a new package `hello_world`
2. type these code within the `HelloWorld.java`
    ```java
        package hello_world;//declares the package

        import org.springframework.stereotype.Component;//import @Component

        @Component//an annotation that makes the class as a spring-managed bean
        public class HelloWorld{
            public String getHelloWorld(){
                return "Hello World!\n";
            }
        }
    ```
3. type these code within the `Application.java`
    ```java
        package com.caesar.springboot_demo;//declare the package
    
        import org.springframework.boot.SpringApplication;//import SpringApplication
        import org.springframework.boot.autoconfigure.SpringBootApplication;//import @SpringBootApplication
        import hello_world.HelloWorld;//import HelloWorld class

        @SpringBootApplication//an annotation that makes the class as a main class of Springboot application
        public class Application{//entry point of the Springboot application, which means the application starts from here
            public static void main(String [] args){//main method
                SpringApplication.run(Application.class, args);//start spring application
                var helloWorld = new HelloWorld();//var allows developers to declare local variables without specifying a data type
                //almost like auto in C++
                System.out.println(helloWorld.getHelloWorld());
            }
        }
    ```
## `Annotation`
* It's a **form of metadata that provides additional information** about the code
* It **doesn't change the behavior** of the code directly but can be used by **the compiler or runtime tools** (like **frameworks**) to perform a certain action
* It's widely used in `Spring Boot` to define configuration, mark certain methods or classes, or control behavior at runtime
* Comman Spring Boot annotations table:
    * | annotations                 | placed place      | function                                                                  |
    * | :-------------------------: | :---------------: | :-----------------------------------------------------------------------: |
    * | `@SpringBootApplication`    | Main class        | enables the `Spring Boot Application`<br>it combines `@EnableAutoConfiguration`, `@ComponentScan` and `@Configuration`                                                                                           |
    * | `@EnableAutoConfiguration`  | Main class        | automatically configure the application based on the dependencies on the class path                                                                                                                            |
    * | `@ComponentScan`            | Main class        | tells Spring where to scan for components, comfigurations and services    |
    * | `@Configuration`            | Main class        | indicates that a class contains `bean` definitions                        |
    * | `@Bean`                     | methods           | declares a bean to be managed by the `Spring container`                   |
    * | `@Autowired`                | member variables  | Marks a field, constructor, setter method to be automatically injected<br>with a Spring Bean by `Dependency Injection (DI)`                                                                                      |
    * | `@Component`                | classes           | marks a class as a Spring-managed bean                                    |
    * | `@Value`                    | member variables  | injects values into `Beans`                                               |
    * | `@ResetController`          | classes           | marks a class as a controller where each method returns<br>a domain object rather than a view<br>it combines `@Controller` and `@ResponseBody`                                                                    |
    * | `@Controller`               | classes           | marks a class as a Spring MVC controller<br>responsible for handing HTTP requests and returning view names                                                                                                        |
    * | `@ResponseBody`             | methods           | return value should be written directly to the HTTP response body         |
    * | `@RequestMapping`           | methods / classes | maps HTTP requests to handler methods of MVC and REST controllers         |
    * | `@GetMapping`               | methods / classes | shrothand for `@RequestMapping(method = RequestMethod.GET)`               |
    * | `@PostMapping`              | methods / classes | shrothand for `@RequestMapping(method = RequestMethod.POST)`              |
    * | `@PutMapping`               | methods / classes | shrothand for `@RequestMapping(method = RequestMethod.PUT)`               |
    * | `@DeleteMapping`            | methods / classes | shrothand for `@RequestMapping(method = RequestMethod.DELETE)`            |
    * | `@RequestParam`             | parameters        | binds a request parameter from the URL or query string<br>to a method parameter in the controller                                                                                                                  |
    * | `@RequestBody`              | parameters        | used in RESTful web services to handle data sent by clients               |
    * | `@Service`                  | classes           | indicates that the class is a service and should be managed by Spring     |
    * | `@Repository`               | classes           | used to interact with the database, indicating the class is a repository  |
    * | `@Transactional`            | methods / classes | ensures that changes to the database are committed or rolled back properly|
## `Inversion of Control (IoC)`
*  `IoC` is a design principle where **the control of `object creation and dependency management is given to an external framework`** (such as `Spring`), rather than being handled directly within the application.
* In other words, You **don't need create objects and manage dependencies manually**, the `Spring` will take over the task automatically
* It helps the system **more modular and easy to maintain**
* Core principles
    1. `Loose Coupling`
        * It's **when an object gets the object to be used from external sources**
        * Classes are independent one each other
        * If the methods or classes know less about each other, the more loosely coupled structure comes into existence
    2. `Dependency Injection (DI)`
        * Refers to how high-level modules shouldn't depend on low-level modules for their responsibilities
        * There're three common types of DI
            1. `Constructor Injection`
                * Provides through the class constructor
                * example:
                    ```java
                        public ClassName(TypeName typeName){
                            this.typeName = typeName;
                        }
                    ```
            2. `Setter Injection`
                * Provides through setter methods
                * example:
                    ```java
                        @Autowired
                        public void setClassName(TypeName typeName){
                            this.typeName = typeName;
                        }
                    ```
            3. `Field Injection`
                * Injects directly into fields
                * example:
                    ```java
                        @Autowired
                        private TypeName typeName;
                    ```
    3. `Component Scanning`
        * Discovers beans & their dependencies
        * Spring fines `@Component`, `@Service`, `@Repository`, `@Controller`, and automatically manages them as beans
    4. `Application Context`
        * **Central interface** to the Spring IoC container
        * **Responsible for managing the lifecycle of beans**, including creation, initialization, and dependency injection
        * **Spring creates `Application Context` and injects all the beans defined in it** when the application runs
* `Spring` uses **`Dependency Injection (DI)`** to implement `Inversion of Control`
* `Dependency Injection (DI)` means you can inject this class into other classes managed by Spring
* example: show a repository
    1. traditional solution
        * `Service.class`
            ```java
                package example;
                import example.Repository;//import Respository class
                public class Service{
                    private Repository repository;//declare a Repository instance
                    public Service(){
                        this.repository = new Repository();//assign to a Repository instance
                    }
                    public void showRepository(){
                        this.repository.show();
                    }
                }
            ```
        * `Repository.class`
            ```java
                package example;
                public class Repository{
                    public void show(){
                        System.out.println("showing the repository");
                    }
                }
            ```
        * `Main.class`
            ```java
                package example;
                import example.Service;//import Service class
                public class Main{
                    public static void main(String [] args){
                        Service service = new Service();//create a Service instance
                        service.showRepository();//call showRepository method
                    }
                }
            ```
    2. IoC solution
        * `Service.class`
            ```java
                package example;
                import example.Repository;//import Respository class
                import org.springframework.beans.factory.annotation.Autowired;//import @Autowired
                import org.springframework.stereotype.Component;//import @Component
                @Component
                public class Service{
                    private final Repository repository;//declare a final Repository instance
                    @Autowired
                    public Service(Repository reponsitory){
                        this.repository = repository//assign to a Repository variable
                        //you don't need to create an instance
                    }
                    public void showRepository(){
                        this.repository.show();
                    }
                }
            ```
        * `Repository.class`
            ```java
                package example;
                public class Repository{
                    public void show(){
                        System.out.println("showing the repository");
                    }
                }
            ```
        * `Main.class`
            ```java
                package example;
                import example.Service;//import Service class
                import org.springframework.boot.autoconfigure.SpringBootApplication;//import @SpringBootApplication
                import org.springframework.boot.SpringApplication;//import SpringApplication
                @SpringBootApplication
                public class Main{
                    public static void main(String [] args){
                        SpringApplication.run(MainApplication.class, args);
                        //you don't need to 
                    }
                }
            ```
## `Bean`
* Simply, it's a special object **managed by the Spring IoC container**
* Represents an instance of a class that is created, configured, and managed by Spring
* Refers to a managed object that is defined in the Spring context
* By default, a bean is `singleton`, meaning that the container creates only one instance of the bean for the entire application context
* Spring takes care of the lifecycle of beans
* example
    ```java
        package com.caesar.springboot_demo;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.context.ConfigurableApplicationContext;//import ConfigurableApplicationContext
        //HelloWorld and Application classes are in the same package
        @SpringBootApplication
        public class Application{
            public static void main(String [] args){
                ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);//assign SpringApplication to application context
                HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");//get HelloWorld bean from application context
                System.out.println(helloWorld);//print HelloWorld bean
            }
        }
    ```
## log
* It's useful for bugging, testing, etc
* Java Spring Boot uses `SLF4J`, an interface, and `Logback`, a framework that implements the `SLF4J`
* `Simple Logging Facade for Java (SLF4J)` is a logging facade or API
* example
    ```java
        import org.springframework.boot.SpringApplication;//import SpringApplication
        import org.springframework.boot.autoconfigure.SpringBootApplication;//import SpringBootApplication
        import org.slf4j.Logger; //import Logger interface
        import org.slf4j.LoggerFactory;//import LoggerFactory
    
        @SpringBootApplication
        public class Application{
        //create a Logger instance for the Application class to log messages
            private static final Logger log = LoggerFactory.getLogger(Application.class);//in case it's changed by other external classes
            public static void main(String [] args){
                SpringApplication.run(Application.class, args);
                //log an informational message once the application has started successfully
                log.info("Application has been started successfully");
            }
        }
    ```
## create a simple demo
* file structure
    ```bash
        springboot-demo/
        ├── Application.java
        ├── Person
        │   └── Location.java(Enum)
        │   └── Person.java(Record)
    ```
* `Location.java`
    ```java
        package com.caesar.springboot_demo.person;

        public enum Location{
            NEW_YORK,
            LOS_ANGLES,
            CHICAGO,
            HOUSTON,
            PHOENIX,
            PHILADELPHIA,
            SAN_ANTONIO,
            SAN_DIEGO,
            DALLAS,
            AUSTIN,
            JACKSONVILLE,
            SAN_JOSE,
            FORT_WORTH,
            COLUMBUS,
            CHARLOTTE,
            INDIANAPOLIS,
            SAN_FRANCISCO,
            SEATTLE,
            DENVER,
            OKLAHOMA,
            NASHVILLE,
            EI_PASO,
            WASHINGTON_D_C,
            LAS_VEGAS,
            BOSTON
        }
    ```
* `Person.java`
    ```java
        package com.caesar.springboot_demo.person;

        import java.time.LocalDateTime;//import LocalDateTime

        public record Person(
                Integer id,
                String firstName,
                String lastName,
                Integer age,
                Location address,
                String email,
                Long telephone,
                LocalDateTime registerDateTime
        ){
        }
    ```
* `Application.java`
    ```java
        package com.caesar.springboot_demo;

        import org.springframework.boot.SpringApplication;/
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import org.springframework.context.annotation.Bean;//import Bean
        import org.springframework.boot.CommandLineRunner;//import CommandLineRunner
        import com.caesar.springboot_demo.person.Location;//import Location
        import com.caesar.springboot_demo.person.Person;//import Person
        import java.time.LocalDateTime;//import LocalDateTime

        @SpringBootApplication
        public class Application{
            private static final Logger log = LoggerFactory.getLogger(Application.class);
            public static void main(String [] args){
                SpringApplication.run(Application.class, args);
                log.info("Application has been started successfully");
            }
            @Bean//produce a bean that managed by the Spring container
            CommandLineRunner runner(){//an interface
                return agrs -> {//a lambda implementation
                    Person person = new Person(0, "Caesar", "LEE", 18, Location.LOS_ANGLES, "caesar@fake.com", 1234567890L, LocalDateTime.now());//declare a person instance
                    log.info("Person:\t" + person);//log the person instance
                };
            }
        }
    ```
## record
* A special type of class
* Provides a compact syntax for creating classes that are intended to act primarily as data carries, or value types, with immutable fields
* In other words, it's useful to create a class that you don't want to change
* key characteristics
    1. `immutable fields`
        * Files are read-only, and cannot be changed after the object is created
    2. `concise declaration`
        * Automatically generates `generating methods` like `equals()`, `hashCode()`, `toString()` and a constructor
    3. `no need for explicit getters/setters`
        * there's no `setters`, because fields are read-only
        * `getters` are automatically created
## `CommandLineRunner`
* an interface that is often used to execute code at the startup
* Can be executed once the Spring context has been fully initialized, but before the application starts listening to HTTP requests
## lambda expression
* syntax: 
    ```java
        parameter -> expression`
        parameter -> {expressions}
        (parameters) -> expression
        (parameters) -> {expressions}
    ```