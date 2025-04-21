/*
 * Lesson seventy-four: Inner Classes
 * Date: August 28, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		//inner class:	a class inside of another class
		//				useful if a class should be limited in scope
		//				usually private, but not necessary
		//				helps group classes that belong together
		//				extremely useful for listeners for specific events
		//				precursor (前驅) for anonymous inner classes
		
		
		//to create an inside class object, you must create an outside class object first 
		Outside out = new Outside();
		Outside.Inside in = out.new Inside();
		System.out.println(out.x + in.y);
		
		Outside.Inside insideClass = out.new Inside();
		insideClass.HelloWorld();
	}
}