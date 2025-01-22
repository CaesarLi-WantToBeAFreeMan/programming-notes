package com.caesar.springboot_demo.person;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository{
    private List <Person> persons = new ArrayList <>();

    List <Person> findAll(){
        return persons;
    }

    Person findById(Integer id){
        return persons.stream()
                .filter(person -> person.id() == id)
                .findFirst()
                .get();
    }

    @PostConstruct
    private void init(){
        persons.add(new Person(
                1,
                "Taylor",
                "Swift",
                34,
                Location.NEW_YORK,
                "taylorswift@fake.com",
                1234567891L,
                LocalDateTime.now().plus(12, ChronoUnit.MINUTES)
        ));

        persons.add(new Person(
                2,
                "Olivia",
                "Rodrigo",
                21,
                Location.SAN_FRANCISCO,
                "oliviarodrigo@fake.com",
                1234567892L,
                LocalDateTime.now().plus(21, ChronoUnit.MINUTES)
        ));
    }
}