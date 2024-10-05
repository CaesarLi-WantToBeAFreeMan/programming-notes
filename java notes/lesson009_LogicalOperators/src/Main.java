/*
 * Lesson Nine: Logical Operators
 * Date: June 16, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

//The logical operators of Java are almost like C++
//but you can't type and for &&, or for || and not for !

public class Main {
	public static void main(String[] args) {
		int num = 3;
		if(num >= 0 && num <= 5)
			System.out.println("This is a good number");
		//else if(num >= 10 and num <= 15)
			//System.out.println("This is a good number as well");
		else if(num < 0 || num > 15)
			System.out.println("This number is illegal");
		else if(num != 7)
			System.out.println("This number is not bad");
		else
			System.out.println("This number is bad");
		
		//and for String, we should use equals(String) method to check whether it equals
		
		String day = "Monday";
		if(day.equals("Sunday") || day.equals("Saturday"))
			System.out.println("Today is the weekend");
		else 
			System.out.println("Today is a weekday");
	}
}