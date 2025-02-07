package com.caesar.database_demo.person;

import org.springframework.http.HttpStatus;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController{
    private final JdbcPersonRepository personRepository;

    //constructor
    PersonController(JdbcPersonRepository personRepository){
        this.personRepository = personRepository;
    }

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
    void create(@Valid @RequestBody Person person){
        personRepository.create(person);
    }

    //put
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/update/{id}")
    void update(@Valid @RequestBody Person person, @PathVariable Integer id){
        personRepository.update(person, id);
    }

    //delete
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable Integer id){
        personRepository.delete(id);
    }

    List <Person> findByLocation(@RequestParam String location){
        return personRepository.findByLocation(location);
    }
}