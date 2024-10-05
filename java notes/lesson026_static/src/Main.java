/*
 * Lesson twenty-six: static
 * Date: June 28, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		//static is a	modifier
		//				a single copy of a variable || method is created and shared
		//				the class "owns" the static member
		//static variables || methods || classes:
		//	JVM will ask some memory addresses to store the variables || methods when JVM is stored
		//not static variables || methods || classes:
		//	JVM will ask some memory addresses to store the variables || methods after JVM is stored
		//this modifier like declare a global variable || method || class, and can use it everywhere 
		
		//you should use className.variableName to use a static variable
		//rather than use objectName.variableName
		System.out.println(Food.name);
		Food food = new Food();
		System.out.println(food.price);
		
		//you should use className.methodName to use a static method
		//rather than use objectName.methodName
		Food.showName();
		food.showPrice();
		
		//you just should create a outerClassName.innerClassName instance to use its properties
		Food.StaticFood test = new Food.StaticFood();
		test.showName();
		test.showPrice();
		
	}
}