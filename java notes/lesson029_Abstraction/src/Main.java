/*
 * Lesson twenty-nine: Abstraction
 * Date: July 1, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {

	public static void main(String[] args) {
		//abstraction:		the process of hiding certain details and showing only 
		//					essential information to the users
		
		//abstract classes cannot be instantiated, but they can have a subclass
		//in other words, 	you cannot create an abstract object
		//					but you can inherit it
		//form:		declaration:	abstract class ClassName
		//			inheritance:	class SubclassName extends SuperclassName
		
		//like virtual keyword in C++
		
		//abstract methods are declared without an implementation
		//in other words,	you cannot write the method body
		//					what you can do is override it within its subclasses
		//form:		declaration:	abstract type name();
		//error:					abstract type name(){statements;}

		Circle circle = new Circle(1.5);
		System.out.println(circle);
	}

}
