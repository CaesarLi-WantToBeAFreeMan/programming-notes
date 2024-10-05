/*
 * Lesson twenty-two: Variable Scope
 * Date: June 21, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		//like C++'s scope in a class
		//local:		declared inside a method
		//				visible only to that method
		//global:		declared outside a method, but within a class
		//				visible to all parts of a class
		
		System.out.print("UTC+8 17:30:00 is:\t");
		Time time = new Time("Taipei", 17, 30, 0);
		System.out.printf("%s\t%,d", time.getZoneName(), time.switchToSecond());
	}
}