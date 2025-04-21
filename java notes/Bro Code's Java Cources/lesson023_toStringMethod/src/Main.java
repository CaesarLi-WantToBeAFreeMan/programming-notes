/*
 * Lesson twenty-three: toString method
 * Date: June 28, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		//toString method:	a special method that all objects inherit
		//					returns a string that "textually represents" an object
		//textually represents	文字上的代表
		//form:	class_name@obejct_memory_address
		//					can be used both implicitly and explicitly
		//im- and ex- + plicitly means "隱式" and "顯式"
		//implicit usage:		object_name
		//explicit usage:		object_name.toString()
		//but you can overwrite the method
		
		System.out.println("circle1:");
		Circle circle1 = new Circle(100.5);
		System.out.println(circle1.toString());
		
		System.out.println("circle2:");
		Circle circle2 = new Circle(100.5);
		System.out.println(circle2);
	}
}