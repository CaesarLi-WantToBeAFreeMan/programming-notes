package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
    public static void main(String [] args){
        List <String> fruits = Arrays.asList(
            "apple", "banana", "grape", "pineapple", "coconut",
            "strawberry", "blueberry", "watermelon", "pumpkin"
        );

        System.out.println(
            "average length in the fruits:\t" +
            fruits.stream().collect(Collectors.averagingInt(String::length))
        );

        System.out.println(
            "summarizing length of fruits:\t" +
            fruits.stream().collect(Collectors.summarizingInt(String::length))
        );

        System.out.println(
            "count number of elements:\t" +
            fruits.stream().collect(Collectors.counting())
        );

        System.out.println(
            "group by the first letter in lexicographical order:\t" +
            fruits.stream().collect(Collectors.groupingBy(fruit -> fruit.charAt(0)))
        );

        System.out.println(
            "joined fruits with comma:\t" +
            fruits.stream().collect(Collectors.joining(", "))
        );

        System.out.println(
            "maximum length fruit:\t" +
            fruits.stream().collect(Collectors.maxBy(Comparator.comparingInt(String::length))).stream().collect(Collectors.toSet()) + "\n" +
            "minimum length fruit:\t" +
            fruits.stream().collect(Collectors.minBy(Comparator.comparingInt(String::length))).stream().collect(Collectors.toSet())
        );

        System.out.println(
            "add \" - \" between fruits:\t" +
            fruits.stream().collect(Collectors.reducing(
                (fruit0, fruit1) -> fruit0 + " - " + fruit1
            )).orElse("single string")
        );

        System.out.println(
            "\"false\" for fruits whose length are less than 5:\t" +
            fruits.stream().collect(Collectors.partitioningBy(
                fruit -> fruit.length() > 5
            ))
        );
    }
}