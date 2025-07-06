package org.example;

public class Main{
    public static void main(String [] args){
        CartesianCoordinate cartesianCoordinate = new CartesianCoordinate(1, 2);
        System.out.println("coordinate:\t" + cartesianCoordinate);
        System.out.println("its distance from origin point:\t" + cartesianCoordinate.getDistanceFromOriginPoint());
        System.out.println("its position:\t" + cartesianCoordinate.getPosition());
        //cartesianCoordinate.x = 0; you cannot change a final field
        //cartesianCoordinate.y() = 0;
        System.out.println("its x value:\t" + cartesianCoordinate.x());
        System.out.println("its y value:\t" + cartesianCoordinate.y());
        System.out.println("is the point in origin point:\t" + cartesianCoordinate.equals(new CartesianCoordinate(0, 0)));
    }
}