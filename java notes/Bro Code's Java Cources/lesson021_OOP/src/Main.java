/*
 * Lesson twenty-one: OOP
 * Date: June 19, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main{
	public static void main(String[] args) {
		//OOP is Object Oriented Programming
		//attributes, methods, objects are still works, and the meanings are equal
		
		CCircle circle = new CCircle("Caesar");
		circle.setName("Caesar James LEE's circle");
		circle.setRadius(1207.9);
		System.out.println("This circle's name is:\t" + circle.getName());
		System.out.printf("This circle's raidus is:\t%,.3f\n", circle.getRadius());
		System.out.printf("This circle's area is:\t%,.3f\n", circle.getArea());
		System.out.printf("This circle's circumference is:\t%,.3f\n", circle.getCircumference());
		System.out.println(circle.PI);
	}
}