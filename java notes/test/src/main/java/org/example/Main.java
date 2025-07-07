package org.example;

import java.util.function.Function;

public class Main{
    public static void main(String [] args){
        Function <String, Integer> stringToLength = words -> words.length();
        Function <Integer, String> lengthToMessage = size -> "size:\t" + size;
        Function <String, String> stringToMessage = stringToLength.andThen(lengthToMessage);
        stringToMessage = stringToMessage.compose(words -> words.toUpperCase());
        System.out.println(Function.identity().apply("Caesar") + "'s " + stringToMessage.apply("Caesar"));
    }
}