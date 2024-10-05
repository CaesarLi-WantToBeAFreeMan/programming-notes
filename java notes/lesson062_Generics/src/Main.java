/*
 * Lesson sixty-two: Generics
 * Date: July 12, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args){
		//generics:		enable types (classes and interfaces) to be parameters when definning:
		//				classes, interfaces and methods
		//				a benefit is to eliminate the need to create multiple versions
		//				of methods or classes for various data types
		//				use 1 version for all reference data types
		
		//it's a bit like templates of C++
		
		//C++:
		//	template <typename T>
		//	returnType name(parameters){
		//		statements;
		//	}
		
		//Java:
		//	<T> returnType name (parameters){
		//		statements;
		//	}
		
		//HashMap can store two different types
		//it likes map or set of C++
		//definition:	HashMap <type1, type2> name = new HashMap <>();
		//we need import java.util.HashMap;
		
		//bounded types:	you can create the objects of a generic class to have data
		//					of specific derived (衍生) types ex. Number
		
		//class name <T extends Number>
		//you can only pass subclasses of Number:
		//AtomicInteger, AtomicLong, BigDecimal, BigInteger, Byte, Double, DoubleAccumulator,
		//DoubleAdder, Float, Integer, Long, LongAccumulator, LongAdder, Short
		
		
		
		Integer[] integerArray = new Integer [10];
		Double[] doubleArray = new Double [10];
		
		for(int i = 0; i < 10; i++)
			integerArray [i] = i;
		for(int i = 0; i < 10; i++)
			doubleArray [i] = (double)i + 0.5;
		
		show(integerArray);
		show(doubleArray);
		
		System.out.println(getThirdElement(integerArray));
		System.out.println(getThirdElement(doubleArray));
		
		Vector <Integer> integerVector = new Vector <Integer>(integerArray);
		Vector <Double> doubleVector = new Vector <Double>(doubleArray);
		
		integerVector.pop_back();
		doubleVector.clear();
		
		System.out.println(integerVector);
		System.out.println();
		System.out.println(doubleVector);
		
		//exception:	java.util.NoSuchElementException
		//System.out.println(doubleVector.front());
		//System.out.println(doubleVector.back());
		
		doubleVector.pop_back();
		System.out.println(doubleVector);
	}
	
	public static <T> void show(T[] array) {
		for(T i : array)
			System.out.print(i + "\t");
		System.out.println();
	}
	
	public static <T> T getThirdElement(T[] array) {
		return array [2];
	}
}