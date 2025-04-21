/*
 * Lesson Four: Expressions
 * Date: June 16, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		int number = 1;
		
		//I can use all calculation laws of C++ on Java
		number++;
		System.out.println("This number is " + number + " now");
		
		number += 2;
		System.out.println("This number is " + number + " now");
		
		number--;
		System.out.println("This number is " + number + " now");
		
		number -= 2;
		System.out.println("This number is " + number + " now");
		
		number *= 5;
		System.out.println("This number is " + number + " now");
		
		number /= 3;
		System.out.println("This number is " + number + " now");
		
		number %= 2;
		System.out.println("This number is " + number + " now");
		
		double another = (double) number / 3;
		System.out.println("After explicit cast, the another number is " + another);
	}
}