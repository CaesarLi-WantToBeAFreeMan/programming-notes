# Title: Course 04: Connect Database
# Date: January 23, 2025
# Author: Caesar James LEE
## needed dependencies
1. `H2 Database`
    * `in-memory` relational database management system (`RDBMS`)
    * `in-memory` means that stores all its data in `RAM`, and the data will be lost when the application or the server shuts down and the application or the server can access the data quickly
2. `JDBC API`
    * Supports a connectivity API to connect and query a database
## `application.properties`
* A configuration file to externalize configuration settings
* This file typically located in `src/main/resources` directory
* format: `key = value`
* common used cases & settings
    * server
        1. `server.port`
            * Server HTTP port
            * Default value: `8080`
        2. `server.address`
            * Network address to which the server should bind
        3. `server.error.path`
            * Path of the error controller
            * Default value: `/error`
        4. `server.servlet.encoding.charset`
            * Charset of HTTP requests and responses
            * Default value: `UTF-8`
        5. `server.servlet.context-path`
            * Context path of the application.
    * database
        1. `spring.datasource.url`
            * JDBC URL of the database
        2. `spring.datasource.username`
            * Login username of the database
        3. `spring.datasource.password`
            * Login password of the database
        4. `spring.datasource.driver-class-name`
            * Fully qualified name of the JDBC driver
        5. `spring.datasource.generate-unique-name`
            * Whether to generate a random datasource name
            * By default, it's `true `
        6. `spring.datasource.name`
            * Specifies a datasource name only if `spring-datasource.generate-unique-name=false`
    * application
        1. `spring.application.admin.enabled`
            * Whether to enable admin features for the application
            * Default value: `false`
        2. `spring.application.group`
            * Application group
        3. `spring.application.name`
            * Application name
        4. `spring.application.version`
            * Application version
    * H2 Database
        1. `spring.h2.console.enabled`
            * Whether to enable the console
            * By default, it's `false`
        2. `spring.h2.console.path`
            * Path at which the console is available
            * By default, it's `/h2-console`
* And you can also use `yml` format for `application.yml`, but you need to delete `application.properties`
* format:
    ```yml
        parentKey:
            childKey: value
    ```
## H2 Console GUI
* Steps
1. We need to type these code in `application.properties`
    ```properties
        spring.h2.console.enabled=true
        spring.datasource.generate-unique-name=false
        spring.datasource.name=test
    ```
2. We can watch H2 console when we type `localhost:8080/h2-console`, or other port number
3. We need replace the original `JDBC URL` text to `jdbc:h2:mem:test`, or other name
4. Clicks the `Connect` button
5. Adds `schema.sql` in `resources` folder to set up the database
6. Adds `data.sql` in `resources` folder to insert data
* example:
    * `schema.sql`
        ```sql
            CREATE TABLE IF NOT EXISTS travels(
                id INT PRIMARY KEY,
                firstName VARCHAR(30) NOT NULL,
                lastName VARCHAR(30) NOT NULL,
                age INT NOT NULL,
                address VARCHAR(15) NOT NULL,
                email VARCHAR(50) NOT NULL,
                telephone INT NOT NULL,
                registerDateTime TIMESTAMP
            );
        ```
    * `data.sql`
        ```sql
            INSERT INTO travels(id, firstName, lastName, age, address, email, telephone, registerDateTime)
                VALUES(8964, 'Caesar', 'LEE', 18, 'LOS_ANGLES', 'caesarlee@fuckccp.com', 1234567890, '2024-06-04 06:04:00'),
                        (228, 'James', 'LEE', 21, 'NEW_YORK', 'jameslee@fuckchiangchungcheng.com', 1234567891, '2024-02-28 02:28:00');
        ```
## `JdbcClient`
* It's a class in Spring frameworks's `org.springframework.jdbc.core.simple` package
* Simplifies the use of JDBC in Spring applications
* It reduces the boilerplate(template) code needed for database interaction and integrates will with Spring's transaction management
* code
    ```java
        import org.springframework.jdbc.core.simple.JdbcClient;//import JdbcClient
        import org.springframework.stereotype.Repository;//import @Repository
        @Repository
        public class JdbcPersonRepository implements PersonRepository{
            private final JdbcClient jdbcClient;
            public JdbcPersonRepository(JdbcClient jdbcClient){
                this.jdbcClient = jdbcClient;
            }
        }
    ```
## reflection
* Allows a program to inspect and manipulate itself at runtime
* In simpler items, it lets a program examine and modify its own structure, such as `class`es, `method`s, `field`s, and `constructor`s, even while it's running
* It offers flexibility and is essential for framework, like Spring
* Should be used carefully because of performance concerns and the risks of breaking encapsulation
## `findAll` method
* `PersonRepository.java`
    ```java
        public List <Person> findAll(){
            return jdbcClient.sql("SELECT * FROM travels")//sets the SQL query that will be executed
                    .query(Person.class)//tells the JdbcClient how to map each row of the result set to a Person class
                    //uses reflection to create instances of the Person class for each row
                    .list();//executes the SQL query and retrieves the result as a list
        }
    ```
* `PersonController.java`
    ```java
        @GetMapping("")
        List <Person> findAll(){
            return personRepository.findAll();
        }
    ```
## `findById` method
* `PersonRepository.java`
    ```java
        public Optional <Person> findById(Integer id){
            return jdbcClient.sql("SELECT * FROM travels WHERE id = :id")
                    .param("id", id)//binds the parameter id in the query to the actual value of the id parameter passed into the method
                    .query(Person.class)
                    .optional();//returns Optional <Person>
        }
    ```
* `PersonController.java`
    ```java
        @GetMapping("/{id}")
        Person findById(@PathVariable Integer id){
            Optional <Person> person =  personRepository.findById(id);
            if(person.isEmpty())
                throw new PersonNotFoundException();
            return person.get();
        }
    ```
## `create` method
* `PersonRepository.java`
    ```java
        public void create(Person person){
            int newPerson = jdbcClient.sql("INSERT INTO travels(id, firstName, lastName, age, address, email, telephone, registerDateTime) VALUES(?, ?, ?, ?, ?, ?, ?, ?)")
                    .params(List.of(person.id(), person.firstName(), person.lastName(), person.age(), person.address().toString(), person.email(), person.telephone(), person.registerDateTime()))
                    //person.address() returns an object
                    //List.of() contains these values in the order of the ? placeholder in the SQL query
                    //params() binds the parameters to the placeholder in the SQL query
                    .update();//executes the SQL query and performs an update operation in the database
            Assert.state(newPerson == 1, "cannot create " + person.firstName() + ' ' + person.lastName());
            //Assert.state(condition, message) checks whether the condition is true
            //if the condition is false, it throws an exception with the specified message
        }
    ```
* `PersonController.java`
    ```java
        @ResponseStatus(HttpStatus.CREATED)
        @PostMapping("/create")
        void create(@RequestBody @Validated Person person){
            personRepository.create(person);
        }
    ```
## `update` method
* `PersonRepository.java`
    ```java
         public void update(Person person, Integer id){
            int newPerson = jdbcClient.sql("UPDATE travels SET firstName = ?, lastName = ?, age = ?, address = ?, email = ?, telephone = ?, registerDateTime = ? WHERE id = ?")
                    .params(List.of(person.firstName(), person.lastName(), person.age(), person.address().toString(), person.email(), person.telephone(), person.registerDateTime(), id))
                    .update();
            Assert.state(newPerson == 1, "Cannot update " + person.firstName() + ' ' + person.lastName());
        }
    ```
* `PersonController.java`
    ```java
        @ResponseStatus(HttpStatus.NO_CONTENT)
        @PutMapping("/update/{id}")
        void update(@RequestBody Person person, @PathVariable Integer id){
            personRepository.update(person, id);
        }
    ```
## `delete` method
* `PersonRepository.java`
    ```java
        public void delete(Integer id){
            int oldPerson = jdbcClient.sql("DELETE FROM travels WHERE id = :id")
                    .param("id", id)
                    .update();
            Assert.state(oldPerson == 1, "cannot delete this person");
        }
    ```
* `PersonController.java`
    ```java
        @ResponseStatus(HttpStatus.NO_CONTENT)
        @DeleteMapping("/delete/{id}")
        void delete(@PathVariable Integer id){
            personRepository.delete(id);
        }
    ```
## insert data into in-memory using `json`
* Steps
    1. create `data.json` in `resources` directory
        * code
            ```json
                {
                    "travels": [
                        {
                            "id": 1,
                            "firstName": "John",
                            "lastName": "SMITH",
                            "age": 18,
                            "address": "NEW_YORK",
                            "email": "johnsmith@fake.com",
                            "telephone": 1234567892,
                            "registerDateTime": "2025-02-05T16:44:00"
                        },
                        {
                            "id": 2,
                            "firstName": "Michael",
                            "lastName": "JOHNSON",
                            "age": 19,
                            "address": "LOS_ANGLES",
                            "email": "michaeljohnson@fake.com",
                            "telephone": 1234567893,
                            "registerDateTime": "2025-02-05T16:44:01"
                        },
                        {
                            "id": 3,
                            "firstName": "James",
                            "lastName": "BROWN",
                            "age": 20,
                            "address": "CHICAGO",
                            "email": "jamesbrown@fake.com",
                            "telephone": 1234567894,
                            "registerDateTime": "2025-02-05T16:44:02"
                        },
                        {
                            "id": 4,
                            "firstName": "Robert",
                            "lastName": "MILLER",
                            "age": 21,
                            "address": "HOUSTON",
                            "email": "robertmiller@fake.com",
                            "telephone": 1234567895,
                            "registerDateTime": "2025-02-05T16:44:03"
                        },
                        {
                            "id": 5,
                            "firstName": "David",
                            "lastName": "WILSON",
                            "age": 22,
                            "address": "PHOENIX",
                            "email": "davidwilson@fake.com",
                            "telephone": 1234567896,
                            "registerDateTime": "2025-02-05T16:44:04"
                        },
                        {
                            "id": 6,
                            "firstName": "William",
                            "lastName": "ANDERSON",
                            "age": 23,
                            "address": "PHILADELPHIA",
                            "email": "williamanderson@fake.com",
                            "telephone": 1234567897,
                            "registerDateTime": "2025-02-05T16:44:05"
                        },
                        {
                            "id": 7,
                            "firstName": "Christopher",
                            "lastName": "TAYLOR",
                            "age": 24,
                            "address": "SAN_ANTONIO",
                            "email": "christophertaylor@fake.com",
                            "telephone": 1234567898,
                            "registerDateTime": "2025-02-05T16:44:06"
                        },
                        {
                            "id": 8,
                            "firstName": "Joseph",
                            "lastName": "THOMAS",
                            "age": 25,
                            "address": "SAN_DIEGO",
                            "email": "josephthomas@fake.com",
                            "telephone": 1234567899,
                            "registerDateTime": "2025-02-05T16:44:07"
                        },
                        {
                            "id": 9,
                            "firstName": "Daniel",
                            "lastName": "Martinez",
                            "age": 26,
                            "address": "DALLAS",
                            "email": "danielmartinez@fake.com",
                            "telephone": 1234567900,
                            "registerDateTime": "2025-02-05T16:44:08"
                        },
                        {
                            "id": 10,
                            "firstName": "Matthew",
                            "lastName": "White",
                            "age": 27,
                            "address": "AUSTIN",
                            "email": "matthewwhite@fake.com",
                            "telephone": 1234567901,
                            "registerDateTime": "2025-02-05T16:44:09"
                        },
                        {
                            "id": 11,
                            "firstName": "Andrew",
                            "lastName": "HARRIS",
                            "age": 28,
                            "address": "JACKSONVILLE",
                            "email": "andrewharris@fake.com",
                            "telephone": 1234567902,
                            "registerDateTime": "2025-02-05T16:44:10"
                        },
                        {
                            "id": 12,
                            "firstName": "Joshua",
                            "lastName": "CLARK",
                            "age": 29,
                            "address": "SAN_JOSE",
                            "email": "joshuaclark@fake.com",
                            "telephone": 1234567903,
                            "registerDateTime": "2025-02-05T16:44:11"
                        }
                    ]
                }
            ```
    2. create a loader class `PersonLoader` in `java/com/caesar/database_demo/person` direction
        * code
            ```java
                package com.caesar.database_demo.person;

                import com.fasterxml.jackson.core.type.TypeReference;//import TypeReference
                import com.fasterxml.jackson.databind.ObjectMapper;//import ObjectMapper
                import org.slf4j.Logger;
                import org.slf4j.LoggerFactory;
                import org.springframework.beans.factory.annotation.Qualifier;//import Qualifier
                import org.springframework.boot.CommandLineRunner;//import CommandLineRunner
                import org.springframework.stereotype.Component;

                import java.io.IOException;
                import java.io.InputStream;//import InputStream

                @Component
                public class PersonLoader implements CommandLineRunner{
                    //implements CommandLineRunner means the class runs when the Spring Boot application starts
                    private static final Logger log = LoggerFactory.getLogger(PersonLoader.class);
                    private final ObjectMapper objectMapper;
                    private final PersonRepository personRepository;

                    public PersonLoader(ObjectMapper objectMapper, @Qualifier("jdbcPersonRepository") PersonRepository personRepository){
                        //@Qualifier is a Spring annotation to specify which implementation of a bean to inject when there are multiple candidates
                        this.objectMapper = objectMapper;//used to read and write JSON
                        //it's a Jackson (JSON processing library)
                        this.personRepository= personRepository;
                    }

                    @Override
                    public void run(String... args) throws Exception{
                        if(personRepository.count() < 3){
                            try(InputStream inputStream = TypeReference.class.getResourceAsStream("/data.json")){//loads the data.json file from the recourse folder
                                Persons persons = objectMapper.readValue(inputStream, Persons.class);
                                //Deserializes the JSON data into a Persons object
                                //reads the JSON from the input stream and converts it into a Person class
                                log.info("Reading {} persons from data.json and saving into in-memory database.", persons.travels().size());
                                personRepository.saveAll(persons.travels());
                            } catch(IOException e){
                                throw new RuntimeException("cannot read data.json", e);
                            }
                        } else
                            log.info("the in-memory database has stored more than 2 records");
                    }
                }
            ```
## connect to MySQL
* Steps
    1. dependency(y -> ies)
        1. `MySQL Driver`
            * MySQL JDBC driver
    2. `application.yml` or `application.properties`
        ```properties
            spring:
                datasource:
                    url: jdbc:mysql://127.0.0.1:3306/travels?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC
                    username: root
                    password: 123456
                    driver-class-name: com.mysql.cj.jdbc.Driver
                jpa:
                    database-platform: org.hibernate.dialect.MySQL8Dialect
                    hibernate:
                        ddl-auto: update
                        #automatically update database schema
                    show-sql: true
                    properties:
                        hibernate:
                            format_sql: true
        ```
    3. open your MySQL
    4. create a table named `travels` and contains all columns what you wanted
    5. run the application