package com.caesar.database_demo.person;

import java.util.List;
import java.util.Optional;

public interface PersonRepository {
    List <Person> findAll();
    Optional <Person> findById(Integer id);
    void create(Person person);
    void update(Person person, Integer id);
    void delete(Integer id);
    int count();
    void saveAll(List <Person> persons);
    List <Person> findByLocation(String location);
}
