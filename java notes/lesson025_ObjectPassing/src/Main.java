/*
 * Lesson twenty-five: Object Passing
 * Date: June 28, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		Food[] food = new Food [2];
		food [0] = new Food("hotdog");
		food [1] = new Food("burger");
		
		System.out.println("whether " + food [0] + " and " + food [1] + " are equal?");
		System.out.println(food [0].equals(food [1]));
	}
}