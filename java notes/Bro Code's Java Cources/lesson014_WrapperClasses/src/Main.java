/*
 * Lesson fourteen: Wrapper Classes
 * Date: June 18, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		//wrapper class provides a way to use primitive data types as reference data types
		//that 	1. contains many useful methods
		//		2. can be used with collections
		//primitive data type name						wrapper class name
		//boolean										Boolean
		//char											Character
		//double										Double
		//int											Integer
		
		//byte											Byte
		//float											Float
		//long											Long
		//short											Short
		
		//none											String
		
		//autoboxing:	the automatic conversion that the Java compiler makes between the
		//				primitive types and their corresponding object wrapper classes
		//corresponding equals similar to (相應的)
		//unboxing:		the reverse of autoboxing. Automatic conversion of wrapper class
		//				to primitive
		
		//autoboxings of primitive data types, like a declaration of the wrapper class
		Boolean isMaleBiological = true;
		Integer age = 18;
		Double GPA = 4.0;
		Character symbol = '！';
		
		//unboxings of wrapper classes
		if(isMaleBiological == true)
			System.out.println("This student is a male biological");
		else
			System.out.println("This student is a female biological");
		
		if(age <= 0)
			System.out.println("You hadn't been born yet");
		else if(age >= 13 && age < 18)
			System.out.println("You are a teenage");
		else
			System.out.println("You are an adult");
		
		if(GPA < 0 || GPA > 4.0)
			System.out.println("OOOOOOOOOOOOOOOOPS! That's so terrible");
		else if(GPA <= 3.6)
			System.out.println("OK, you're normal");
		else if(GPA <= 3.9)
			System.out.println("You're so good");
		else if(GPA <= 4.0)
			System.out.println("Wooooooooooooooow! You're excellent");
		
		if(symbol == 'C')
			System.out.println("You must be Caesar James LEE!!!");
		else
			System.out.println("You're not Caesar");
		
		//some useful methods of a wrapper class
		//1. primitive_nameValue() 			returns its primitive value
		//2. toString()						returns a String of its value
		//3. equals(primitive)				returns a boolean value whether those are equal
		//4. parsePrimitive_Name(String)	reassigns the Primitive_Name as the String
		//									numerical value
		
		
		//some other useful methods of a Character wrapper class
		//1. hashCode()				returns an int of its UNICODE number
		
		//some other useful methods of a Double wrapper class
		//1. intValue()				returns an int of its value
		//2. longValue()			returns a long of its value
		//3. byteValue()			returns a byte of its value
		//4. shortValue()			returns a short of its value
		//5. floatValue()			returns a float of its value
		//6. isInfinite()			returns a boolean whether it's infinitely large (∞)
		//							e.g. 1.0 / 0.0
		//7. isNaN()				returns a boolean whether it's a NaN (Not a Number)
		//							e.g. 0.0 / 0.0
		
		//some other useful methods of an Integer wrapper class
		//1. longValue()						returns a long of its value
		//2. byteValue()						returns a byte of its value
		//3. shortValue()						returns a short of its value
		//4. floatValue()						returns a float of its value
		//5. doubleValue()						returns a double of its value
		//6. divideUnsigned(dividend, divisor)	returns an unsigned int of the quotient of 
		//										dividend / divisor
		//7. sum(a, b)							returns an int of the sum of a + b
		//8. max(a, b)							returns an int of the maximum between a and b
		//9. min(a, b)							returns an int of the minimum between a and b
		//10. toBinaryString(int)				returns a String of the Binary String
		//										of the int
		//11. toOctalString(int)				returns a String of the Octal String of
		//										the int
		//12. toHexString(int)					returns a String of the Hexadecimal String
		//										of the int with lowercases
	}
}