/*
 * Lesson thirty-five: Dynamic Polymorphism
 * Date: July 1, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//dynamic means this process is doing during runtime, or after compilation
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enert an integer to choose a character what u wanna be:");
		System.out.print("1=DOG\t2=CAT\tother=animal:\t");
		int choice = scanner.nextInt();
		
		Animal animal;
		switch(choice) {
		case 1:
			animal = new Dog();
			break;
		case 2:
			animal = new Cat();
			break;
		default:
			animal = new Animal();
			break;
		}
		animal.speak();
	}
}