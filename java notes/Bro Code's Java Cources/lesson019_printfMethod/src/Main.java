/*
 * Lesson nineteen: printf Method
 * Date: June 19, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		//Java has printf() method as well like C++ 
		//System.out.printf("format string % [width] [precision] [flags]);
		
		//flags:
		//b for booleans	c for characters	s for strings
		//d for integers	f for floats or doubles
		//-:	left-justify	(default is right-justify)
		//,:	comma grouping separator if numbers > 1,000		(default is close)
		//+:	output a plus sign for a positive value
		//0:	numeric values are zero-padded
		
		System.out.printf("Hello %d years old %12s\n", 18, "Caesar");
		System.out.printf("test %05.2f\n", 1.3);
		System.out.printf("And you only have %+,-15.2f US$\n", 1234567.898);
	}
}