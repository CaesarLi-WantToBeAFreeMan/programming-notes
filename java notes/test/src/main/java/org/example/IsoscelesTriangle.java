package org.example;

public class IsoscelesTriangle extends Triangle{
    public IsoscelesTriangle(double equalSide, double base){
        super(equalSide, equalSide, base);
    }

    public String getName(){
        return "isosceles triangle";
    }
}
