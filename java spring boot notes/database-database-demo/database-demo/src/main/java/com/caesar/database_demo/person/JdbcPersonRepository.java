package com.caesar.database_demo.person;

import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.util.Assert;
import java.util.List;
import java.util.Optional;

@Repository
public class JdbcPersonRepository implements PersonRepository{
    private final JdbcClient jdbcClient;

    public JdbcPersonRepository(JdbcClient jdbcClient){
        this.jdbcClient = jdbcClient;
    }

    public List <Person> findAll(){
        return jdbcClient.sql("SELECT * FROM travels")
                .query(Person.class)
                .list();
    }

    public Optional <Person> findById(Integer id){
        return jdbcClient.sql("SELECT * FROM travels WHERE id = :id")
                .param("id", id)
                .query(Person.class)
                .optional();
    }

    public void create(Person person){
        int newPerson = jdbcClient.sql("INSERT INTO travels(id, firstName, lastName, age, address, email, telephone, registerDateTime) VALUES(?, ?, ?, ?, ?, ?, ?, ?)")
                .params(List.of(person.id(), person.firstName(), person.lastName(), person.age(), person.address().toString(), person.email(), person.telephone(), person.registerDateTime()))
                .update();
        Assert.state(newPerson == 1, "cannot create " + person.firstName() + ' ' + person.lastName());
    }

    public void update(Person person, Integer id){
        int newPerson = jdbcClient.sql("UPDATE travels SET firstName = ?, lastName = ?, age = ?, address = ?, email = ?, telephone = ?, registerDateTime = ? WHERE id = ?")
                .params(List.of(person.firstName(), person.lastName(), person.age(), person.address().toString(), person.email(), person.telephone(), person.registerDateTime(), id))
                .update();
        Assert.state(newPerson == 1, "Cannot update " + person.firstName() + ' ' + person.lastName());
    }

    public void delete(Integer id){
        int oldPerson = jdbcClient.sql("DELETE FROM travels WHERE id = :id")
                .param("id", id)
                .update();
        Assert.state(oldPerson == 1, "cannot delete this person");
    }

    public int count(){
        return jdbcClient.sql("SELECT * FROM travels")
                .query()
                .listOfRows()
                .size();
    }

    public void saveAll(List <Person> persons){
        persons.stream().forEach(this::create);
    }

    public List <Person> findByLocation(String location){
        return jdbcClient.sql("SELECT * FROM travels WHERE location = :location")
                .param("location", location)
                .query(Person.class)
                .list();
    }
}