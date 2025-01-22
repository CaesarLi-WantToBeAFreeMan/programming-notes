package com.caesar.springboot_demo.person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@RestController
@RequestMapping("/person/read")
public class PersonController{
    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    /*
    @GetMapping("/hello")
    String home(){
        return "<h1>Hello World!</h1>" +
                "<br>" +
                "<p>This is " +
                "<b>hello</b> " +
                "endpoint</p>";
    }
    */

    @GetMapping("")
    List <Person> findAll(){
        return personRepository.findAll();
    }

    @GetMapping("/{id}")
    Person findById(@PathVariable Integer id){
        return personRepository.findById(id);
    }
}