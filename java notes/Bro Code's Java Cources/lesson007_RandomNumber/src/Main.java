/*
 * Lesson Seven: Random Number
 * Date: June 16, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

//to create a random number, we should import a java.util.Random library

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		
		//create a random number between -2 billion to 2 billion
		int randomInteger = random.nextInt();
		System.out.println("The random integer is " + randomInteger);
		
		//create a random number between [0, digit)
		randomInteger = random.nextInt(7);
		System.out.println("The random integer is " + randomInteger);
		
		//create a random double number (0, 1)
		double randomDouble = random.nextDouble();
		System.out.println("The random double is " + randomDouble);
		
		//create a random boolean number
		boolean randomBoolean = random.nextBoolean();
		System.out.println("The random boolean is " + randomBoolean);
	}
}