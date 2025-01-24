package com.caesar.springboot_demo;

import org.springframework.boot.SpringApplication;//import SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication;//import SpringBootApplication
import org.slf4j.Logger; //import Logger interface
import org.slf4j.LoggerFactory;//import LoggerFactory
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import com.caesar.springboot_demo.person.Location;
import com.caesar.springboot_demo.person.Person;
import java.time.LocalDateTime;

@SpringBootApplication
public class Application{
    //create a Logger instance for the Application class to log messages
    private static final Logger log = LoggerFactory.getLogger(Application.class);
    public static void main(String [] args){
        SpringApplication.run(Application.class, args);
        //log an informational message once the application has started successfully
        log.info("Application has been started successfully");
    }
    @Bean
    CommandLineRunner runner(){
        return agrs -> {
            Person person = new Person(0, "Caesar", "LEE", 18, Location.LOS_ANGLES, "caesar@fake.com", 1234567890L, LocalDateTime.now());
            log.info("Person:\n" + person.toString());
        };
    }
}