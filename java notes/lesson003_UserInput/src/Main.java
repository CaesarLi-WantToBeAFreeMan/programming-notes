/*
 * Lesson Three: User Input
 * Date: June 13, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

/*
 * We should import java.util.Scanner library to use Scanner class to get user input content
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	//create a new object of the Scanner class
													//then call its constructor with System.in parameter
		
		System.out.println("Could you know what's the author's name?");
		String name = scanner.nextLine();			//call the nextLine method of the scanner object
													//then assign the content into the name variable
													//this method gets the next whole line content
		
		System.out.println("Could you know how old is the author?");
		int age = scanner.nextInt();				//like nextLine method, but just gets the next 
													//integer number
													//it'll throw an exception error if we typed isn't 
													//an integer number
		
		System.out.println("Could you know what is the author's gender?");
		boolean IsMale = scanner.nextBoolean();		//like nextLine method, but just gets the next
													//boolean value
		
		//I cann't type 1 for true, and 0 for false like C++
		
		//scanner.next + a variable type name() method is a method to get the next the type value
		//but except String and char
		
		scanner.close();							//like a destructor in C++, but it isn't 
													//operate automatically
		
		System.out.println("Your answers are " + name + " , " + age + " and " + IsMale);
	}
}