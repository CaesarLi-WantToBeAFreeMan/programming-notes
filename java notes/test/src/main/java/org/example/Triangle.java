package org.example;

public class Triangle implements Shape{
    protected double a, b, c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isTriangle(){
        return a + b > c && a + c > b && b + c > a;
    }

    @Override
    public double getCircumference(){
        return this.a + this.b + this.c;
    }

    @Override
    public double getArea(){
        double s = this.getCircumference() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String getname(){
        return "generic triangle";
    }
}
