/*
 * Lesson Seven: do, do while, for loops
 * Date: June 16, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		//The loops of Java is almost like C++, but you can't run do loop
		
		int num = 0;
		
		while(num <= 10)
			System.out.println(num++);
		System.out.println("You escaped from the while loop");
		
		/*
		do {
			if(num > 10) {
				System.out.println("You escaped from the do loop");
				break;
			}
			else
				System.out.println(num++);
		}
		*/
		
		num = 0;
		do {
			System.out.println(num++);
		}while(num <= 10);
		System.out.println("You escaped from the do while loop");
		
		for(num = 0; num <= 10; num++)
			System.out.println(num);
		System.out.println("You escaped from the for loop");
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}
