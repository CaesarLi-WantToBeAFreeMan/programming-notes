/*
 * Lesson thirty-two: copy Method
 * Date: July 1, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		Person caesar = new Person("Caesar James", "LEE", "Male", 18);
		System.out.println("object caesar is " + caesar.show() + "\nand its address:\t" + caesar);
		
		//Person alice = new Person("Alice", "White", "Female", 20);
		//System.out.println("object alice has not copied is " + alice.show() + "\nand its address:\t"
		//					+ alice);
		
		//object2 = object1
		//passing the memory address of object1 into object2
		//alice = caesar;
		//System.out.println("after \'alice = caesar\' is " + alice.show() + "\nand its address:\t"
		//		+ alice);
		
		//then you should define copy method to copy all properties of object1 into object2
		//but they was stored in different memory addresses
		//alice.copy(caesar);
		//System.out.println("after \'alice.copy(caesar)\' is " + alice.show() + "\nand its address:\t"
		//		+ alice);
		
		//and you can use copy constructor as well
		Person alice = new Person(caesar);
		System.out.println("copy construtor of object alice is " + alice.show() + "\nand its address:\t"
							+ alice);
		
	}
}