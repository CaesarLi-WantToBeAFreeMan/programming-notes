/*
 * Lesson Two: Variables
 * Date: June 13, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main{
	public static void main(String[] args) {
		/*
		 * All data types:
		 * boolean:
		 * 		1 bit, primitive, contains true or false (is boolean, is not bool like C++)

		 * integers:
		 * 	byte:	1 byte, 	primitive, 	contains -128 to 127 (C++ doesn't have it)
		 * 	short:	1 byte, 	primitive, 	contains -32,768 to 32,767
		 * 	int:	4 bytes, 	primitive, 	contains -2 billion to 2 billion
		 * 	long:	8 bytes, 	primitive, 	contains -9 quintillion to 9 quintillion,	plus L at the end

		 * fractional numbers:
		 * 	float:	4 bytes, 	primitive, 	up to 6 to 7 digits,	plus f at the end
		 * 	double:	8 bytes, 	primitive, 	up to 15 digits

		 * characters
		 *  char:	2 bytes, 	primitive, 	single character
		 *  String:	varies, 	reference, 	a sequence of characters (is String, is not string like C++)

		 *  As a reference data type, the first letter should be capital
		 */
		boolean IsMale = true;		//this is an initialization statement, which combines both a 
									//declaration statement and an assignment statement into one,
									//like C++
		System.out.println("Is Caesar a male?\t" + IsMale);
		int integer = 8964;
		System.out.println("the integer number is:\t" + integer);
		double charge = 7.99;
		System.out.println("This chicken sandwich needs " + charge + " US$");
		String name = "Caesar James Lee";
		System.out.println("The name of the author is " + name);
	}
}