/*
 * Lesson twenty-seven: Inheritance
 * Date: June 28, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		//inheritance		the process where one class acquires,
		//					the attributes and methods of another.
		//inheritances in Java have some important differences between C++'s
		
		//syntax of inheritances in C++
		//class child_class_name : access_specifier parent_class_name{
		//		statements;
		//};
		
		//syntax of inheritances in Java
		//class child_class_name extends parent_class_name{
		//		statements;
		//};
		
		//subclass 		(child):	the class that inherits from another class
		//superclass 	(parent):	the class being inherited from
		
		Circle circle = new Circle(12.5, "My Circle");
		System.out.println(circle);
		
		Rectangle rectangle = new Rectangle(11.5, 13.5, "My Rectangle");
		System.out.println(rectangle);
		
		Rectangle square = new Rectangle(12.0, "My Square");
		System.out.println(square);
	}
}