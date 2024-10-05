/*
 * Lesson eighteen: Methods
 * Date: June 19, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		//method:		a block of code that is executed whenever it's called in a class
		//likes a method of C++, just there's no function in Java
		//because everything is doing or done in a class
		
		//overloaded method:	methods that share the same name 
		//						but have different parameters
		//method signature includes method name and method parameters
		
		hello("Caesar", 18);
		System.out.println(addition(1.5, 2.5, 3.5));
	}
	
	//overloaded method, needs a parameter
	static void hello(String name) {
		System.out.println("Hello " + name);
	}
	
	//overloaded method, needs two parameters
	static void hello(String name, int age) {
		System.out.println("Hello " + age + " years old " + name);
	}
	
	//returns a value
	static int addition(int a, int b, int c) {
		return a + b + c;
	}
	
	static double addition(double a, double b, double c) {
		return a + b + c;
	}
}