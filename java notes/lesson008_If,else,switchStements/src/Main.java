/*
 * Lesson Eight: if, else, switch Statements
 * Date: June 16, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		
		//the if, else and switch statements of java likes C++
		//switch works with byte, short, char ,int and enumerated types likes C++
		//but it can work with String
		
		boolean status = false;
		if(status)
			System.out.println("The status is true");
		else
			System.out.println("The status is false");
		
		int number = 10;
		if(status) {
			number += 5;
			System.out.println("The number is " + number + " now");
		}else {
			number -= 5;
			System.out.println("The number is " + number + " now");
		}
		
		number = 3;
		
		switch(number) {
			case 15:
				System.out.println("The status is true");
				break;
			case 5:
				System.out.println("The status is false");
				break;
			default:
				System.out.println("Something went wrong.");
				break;
		}
	}
}