package com.caesar.database_demo.person;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

@Component
public class PersonLoader implements CommandLineRunner{
    private static final Logger log = LoggerFactory.getLogger(PersonLoader.class);
    private final ObjectMapper objectMapper;
    private final PersonRepository personRepository;

    public PersonLoader(ObjectMapper objectMapper, @Qualifier("jdbcPersonRepository") PersonRepository personRepository){
        this.objectMapper = objectMapper;
        this.personRepository= personRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        if(personRepository.count() < 3){
            try(InputStream inputStream = TypeReference.class.getResourceAsStream("/data.json")){
                Persons persons = objectMapper.readValue(inputStream, Persons.class);
                log.info("Reading {} persons from data.json and saving into in-memory database.", persons.travels().size());
                personRepository.saveAll(persons.travels());
            }catch(IOException e){
                throw new RuntimeException("cannot read data.json", e);
            }
        }else
            log.info("the in-memory database has stored more than 2 records");
    }
}