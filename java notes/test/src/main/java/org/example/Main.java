package org.example;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String [] args){
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("'MMM d, yyyy ''EEE'' hh:mm:ss a (z, VV)'")));
    }
}