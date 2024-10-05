/*
 * Lesson Eleven: Arrays
 * Date: June 17, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		//1. declaration, almost like C++
		//data_type [] name = {values}			C++: data_type name [] = {values}
		String [] carsBrands = {"?", "Toyota", "BMW"};
		
		//2. reassignment, like C++
		carsBrands [0] = "Tesla";
		
		//3. access
		System.out.println("My favorite car brand is " + carsBrands [0]);
		
		//4. Other way to declare an array with a memory address
		String [] clothBrands = new String [3];
		clothBrands [0] = "Nike";
		clothBrands [1] = "adidas";
		clothBrands [2] = "H&M";
		
		//5. iteration
		//i. standard for loop
		for(int i = 0; i < clothBrands.length; i++)
			System.out.print(clothBrands [i] + '\t');
		System.out.println();
		//ii. for-each loop
		for(String i : clothBrands)
			System.out.print(i + '\t');
		System.out.println();
	}
}