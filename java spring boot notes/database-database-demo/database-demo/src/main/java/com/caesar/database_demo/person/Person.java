package com.caesar.database_demo.person;

import java.time.LocalDateTime;
import jakarta.validation.constraints.*;

public record Person(
        @PositiveOrZero
        Integer id,
        @NotBlank
        @Size(min = 1, max = 30)
        String firstName,
        String lastName,
        @Positive
        Integer age,
        Location address,
        @Email
        String email,
        Long telephone,
        LocalDateTime registerDateTime
){
    public Person{
        if(registerDateTime.isBefore(LocalDateTime.of(1989, 6, 4, 0, 0, 0)))
            throw new IllegalArgumentException("our server was running on June 4, 1989 at 0");
        if(id != null && id < 0)
            throw new IllegalArgumentException("id must greater than or equal to 0");
        if(firstName.isBlank())
            throw new IllegalArgumentException("first name cannot be a blank");
        if(firstName.length() > 30)
            throw new IllegalArgumentException("first name is so long");
        if(lastName.isBlank())
            throw new IllegalArgumentException("last name cannot be a blank");
        if(lastName.length() > 30)
            throw new IllegalArgumentException("last name is so long");
        if(age < 1)
            throw new IllegalArgumentException("age must greater than 0");
    }
}