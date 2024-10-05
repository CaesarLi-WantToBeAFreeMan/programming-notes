/*
 * Lesson thirty-six: Exception Handling
 * Date: July 1, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//exception:	an event that occurs during the execution of a program that,
		//				disrupts the normal flow of instructions
		
		//almost like C++
		//C++:
		/*
		try{
			statements;
			if(condition){
				statements;
			}else{
				throw(parameter);
			}
		}
		catch(argument){
			statements;
		}
		finally{
			statements;
		}
		*/
		
		//Java
		/*
		try{
			statements;
		}
		catch(condition){
			statements;
		}
		finally{
			statements;
		}
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("please enter an integer to divide:\t");
			int divisor = scanner.nextInt();
			
			System.out.print("please enter an integer to divide by:\t");
			int devidend = scanner.nextInt();
			int quotient = divisor / devidend;
			System.out.println("The quotient is:\t" + quotient);
		}
		
		//handling some specific conditions using catch keyword
		catch(ArithmeticException e) {
			System.out.println("Sorry, you cannot divide by ZERO!!!");
		}
		
		catch(InputMismatchException e) {
				System.out.println("Sorry, please enter two INTEGER numbers!!!");
		}
		
		catch(Exception e) {
			System.out.println("Sorry, SOMETHING WENT WRONG!");
		}
		
		finally {
			scanner.close();
			System.out.println("This line will always running!!!");
		}
	}
}