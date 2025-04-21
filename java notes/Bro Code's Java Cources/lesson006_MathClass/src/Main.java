/*
 * Lesson Six: Math Class
 * Date: June 16, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/


public class Main {
	public static void main(String[] args) {
		//some useful methods of Math class, and almost all like C++
		//1. max()
		//There are 4 versions of max() method.
		//max(int, int)		max(double, double)		max(float, float)		max(long, long)
		int a = 12, b = 25;
		int bigger = Math.max(a, b);
		System.out.println("The bigger one is " + bigger);
		
		//2. min()
		//There are 4 versions of min() method.
		//min(int, int)		min(double, double)		min(float, float)		min(long, long)
		
		int smaller = Math.min(a, b);
		System.out.println("The smaller one is " + smaller);
		
		//3. abs()
		//There are 4 versions of abs() method.
		//abs(int)		abs(double)		abs(float)		abs(long)
		System.out.println("The absolute value of -1.3 is " + Math.abs(-1.3));
		
		//4. sqrt(double)
		System.out.println("The square root value of 25.0 is " + Math.sqrt(25.0));
		
		//5. round(double || float)
		System.out.println("The rounded number of 12.3 is " + Math.round(12.3) + 
							" and the number of 12.6 is " + Math.round(12.6));
		
		//6. ceil(double)
		//returns a value that is greater than or equal to the nearest mathematical integer
		System.out.println("The ceiled number of 3.1 is " + Math.ceil(3.1) + 
							" and the number of 3.6 is " + Math.ceil(3.6));
		
		//7. floor(double)
		//returns a value that is less than or equal to the nearest mathematical integer
		System.out.println("The floored number of 3.1 is " + Math.floor(3.1) + 
				" and the number of 3.6 is " + Math.floor(3.6));
		
		//8. pow(base, exponent)
		//returns a value base^exponent
		System.out.println("two to the tenth power is " + Math.pow(2, 10));
	}
}
