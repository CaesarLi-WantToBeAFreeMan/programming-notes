package com.caesar.database_demo.person;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository{
    private List <Person> persons = new ArrayList <>();

    //initialization
    @PostConstruct
    private void init(){
        persons.add(new Person(
                1,
                "Taylor",
                "SWIFT",
                34,
                Location.NEW_YORK,
                "taylorswift@fake.com",
                1234567891L,
                LocalDateTime.now().plus(12, ChronoUnit.MINUTES)
        ));

        persons.add(new Person(
                2,
                "Olivia",
                "RODRIGO",
                21,
                Location.SAN_FRANCISCO,
                "oliviarodrigo@fake.com",
                1234567892L,
                LocalDateTime.now().plus(21, ChronoUnit.MINUTES)
        ));
    }

    //read
    List <Person> findAll(){
        return persons;
    }

    Optional <Person> findById(Integer id){
        return persons.stream()
                .filter(person -> person.id() == id)
                .findFirst();
    }

    //create
    void create(Person person){
        persons.add(person);
    }

    //update
    void update(Person person, Integer id){
        Optional <Person> existingPerson = this.findById(id);
        if(existingPerson.isPresent())
            persons.set(persons.indexOf(existingPerson.get()), person);
    }

    //delete
    void delete(Integer id){
        persons.removeIf(person -> person.id().equals(id));
    }
}