package org.example;

import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        System.out.println("please enter an integer that represents a day of week:\t");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        String dayOfWeek = switch(input){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> {
                System.out.println("middle of the week");
                yield "Wednesday";
            }
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> {
                System.out.println("the first day of weekend");
                yield "Saturday";
            }
            case 7 -> {
                System.out.println("the last day of weekend");
                yield "Sunday";
            }
            case -1, 8 -> "please try again";
            default -> {
                System.out.println("invalid input");
                yield "please enter an integer in the range [1, 7]";
            }
        };

        System.out.println(dayOfWeek);
    }
}