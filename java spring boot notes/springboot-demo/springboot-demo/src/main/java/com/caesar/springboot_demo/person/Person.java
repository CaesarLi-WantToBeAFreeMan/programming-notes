package com.caesar.springboot_demo.person;

import java.time.LocalDateTime;

public record Person(
        Integer id,
        String firstName,
        String lastName,
        Integer age,
        Location address,
        String email,
        Long telephone,
        LocalDateTime registerDateTime
){
    @Override
    public Integer id() {
        return id;
    }

    @Override
    public String firstName() {
        return firstName;
    }

    @Override
    public String lastName() {
        return lastName;
    }

    @Override
    public Integer age() {
        return age;
    }

    @Override
    public Location address() {
        return address;
    }

    @Override
    public String email() {
        return email;
    }

    @Override
    public Long telephone() {
        return telephone;
    }

    @Override
    public LocalDateTime registerDateTime() {
        return registerDateTime;
    }

    @Override
    public String toString() {
        return "id = " + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", telephone=" + telephone +
                ", registerDateTime=" + registerDateTime +
                '}';
    }
}