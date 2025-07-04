package org.example;

public class Main{
    public static void main(String [] args){
        Shape [] triangles = {
            new EquilateralTriangle(3),
            new IsoscelesTriangle(5, 6),
            new ScaleneTriangle(4, 5, 6),
        };

        for(var triangle : triangles){
            System.out.println("Type:\t\t" + triangle.getName());
            System.out.println("Is Triangle?\t" + triangle.isTriangle());
            System.out.printf("Area:\t\t%.3f\n", triangle.getArea());
            System.out.printf("Perimeter:\3%.2f\n", triangle.getCircumference());
            System.out.println("--------");
        }
    }
}