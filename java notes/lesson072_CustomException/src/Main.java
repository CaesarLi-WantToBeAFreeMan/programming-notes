/*
 * Lesson seventy-two: Custom Exception
 * Date: August 28, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//custom exceptions:	user defined exceptions
		//exception:			an event, after execution, that disrupts the normal flow of the program
		//ex. ArithmeticException, ArrayIndexOutOfBoundsException, FileNotFoundException
		
		//steps:
		//I.	create a class extends Exception
		//II.	create a constructor with a parameter (String message)
		//III.	add a statement "super(message);" within the constructor
		//IV.	create a check method within a class what you wanna add, then add "throws AExceptionName" at the end
		//V.	add a statement "throw new DefinedCustomExceptionName("exception content"); within a condition block
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("please enter your age:\t");
		int age = scanner.nextInt();
		try {
			checkAge(age);
		} catch (AgeException e) {
			System.out.println("Sorry, You cann't visit here\nthrow an exception:\t" + e);
		}
	}
	
	public static void checkAge(int age) throws AgeException{
		if(age < 18)
			throw new AgeException("\nyou too young to enter");
		else
			System.out.println("welcome!");
	}
}