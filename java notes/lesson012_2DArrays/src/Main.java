/*
 * Lesson twelve: 2D Arrays
 * Date: June 17, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		//1. declaration
		//i. first way
		String [] [] cars = new String [3] [3];
		//ii. second way
		/*
			String [] [] = {{"Tesla Cybertruck", "Tesla Model 3", "Tesla Model X"},
							{"Toyota productName1", "Toyota productName2", "Toyota productName3"},
							{"BMW productName1", "BMW productName2", "BMW productName3"}};
		*/
		
		//2. reassignment, like C++
		cars [0] [0] = "Tesla Cybertruck";
		cars [0] [1] = "Tesla Model 3";
		cars [0] [2] = "Tesla Model X";
		cars [1] [0] = "Toyota productName1";
		cars [1] [1] = "Toyota prodectName2";
		cars [1] [2] = "Toyota productName3";
		cars [2] [0] = "BMW productName1";
		cars [2] [1] = "BMW productName2";
		cars [2] [2] = "BMW productName3";
		
		//3. iteration
		//i. standard for loop
		for(int i = 0; i < cars.length; i++) {
			for(int j = 0; j < cars [i].length; j++)
				System.out.print(cars [i] [j] + '\t');
			System.out.println();
		}
		
		System.out.println("\t\t\t***********************************\t\t\t");
		
		//ii.for-each loop
		for(String [] i : cars) {
			for(String j : i)
				System.out.print(j + '\t');
			System.out.println();
		}
	}
}