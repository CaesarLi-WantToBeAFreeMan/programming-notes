/*
 * Lesson thirteen: String Methods
 * Date: June 17, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//1. equals(String) method returns the boolean value
		//to check whether those are equal
		System.out.print("Please enter your name:\t");
		String name = scanner.nextLine();
		if(name.equals("Caesar"))
			System.out.println("You're Caesar!!!");
		else {
			System.out.println("You aren't Caesar!!!");
			//2. equalsIgnoreCase("String") returns the boolean value
			//to check whether those are equal regardless of lowercase or uppercase
			if(name.equalsIgnoreCase("Caesar"))
				System.out.println("But you're Caesar anyway!!!");
		}
		
		//3. length() returns the integer value
		//of your String capability
		System.out.println("Your name has " + name.length() + " letters");
		
		if(name.length() != 0) {
			//4. charAt(int) returns the character value
			//of #int digit
			System.out.println("Your initials is " + name.charAt(0));
			
			//5. indexOf(char) returns the integer value
			//of the character occurred digit
			int digit = name.indexOf('c');
			if(digit != -1)
				System.out.println("\'c\' character is in the #" + digit + " digit");
			else
				System.out.println("\'c\' is not occurred in your name");
		}
		//6. isEmpty() returns the boolean value
		//to check whether this String is empty
		if(name.isEmpty())
			System.out.println("You entered nothing!");
		
		//7. toUpperCase() returns the String Value
		//with all characters converted to uppercase
		System.out.println("UPPERCASE VERSION:\t" + name.toUpperCase());
		
		//8. toLowerCase() returns the String Value
		//with all characters converted to lowercase
		System.out.println("lowercase version:\t" + name.toLowerCase());
		
		//9. trim() returns the String Value
		//with removing all leading and trailing whitespace characters
		System.out.println(name.trim());
		
		//10. replace(oldChar, newChar) returns the String value
		//with replacing all old characters with new characters
		System.out.println("after replaced \'c\' with \'a\'\t" + name.replace('c', 'a'));
	}
}