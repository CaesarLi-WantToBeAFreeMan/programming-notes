package com.caesar.springboot_demo.person;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
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

    //get
    @GetMapping("/read")
    List <Person> findAll(){
        return personRepository.findAll();
    }

    @GetMapping("/read/{id}")
    Person findById(@PathVariable Integer id){
        Optional <Person> person =  personRepository.findById(id);
        if(person.isEmpty())
            throw new PersonNotFoundException();
        return person.get();
    }

    //post
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    void create(@RequestBody @Validated Person person){
        personRepository.create(person);
    }

    //put
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/update/{id}")
    void update(@RequestBody Person person, @PathVariable Integer id){
        personRepository.update(person, id);
    }

    //delete
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable Integer id){
        personRepository.delete(id);
    }
}