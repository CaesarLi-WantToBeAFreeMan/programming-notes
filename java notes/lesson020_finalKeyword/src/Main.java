/*
 * Lesson twenty: final Keyword
 * Date: June 19, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		//final is const of C++
		//you cann't change or update the value of a final variable
		final double PI = 3.1415926;
		double radius = 120;
		System.out.println("This circle's area is " + PI * Math.pow(radius, 2));
		System.out.printf("This circle's area is %,9.3f\n", PI * Math.pow(radius, 2));
	}
}