package org.example;

public class EquilateralTriangle extends Triangle{
    public EquilateralTriangle(double side) {
        super(side, side, side);
    }

    public String getName(){
        return "equilateral triangle";
    }
}
