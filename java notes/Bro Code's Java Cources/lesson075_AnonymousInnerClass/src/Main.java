/*
 * Lesson seventy-five: Anonymous Inner Class
 * Date: August 28, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		//anonymous inner class:	an inner class without a name
		//							only a single object is created from one
		//							the object may have "extras (額外的)" or "changes"
		//							and no need to create a separate innerclass when it only need it once
		//							helps us to avoid cluttering (雜亂) code with a class name
		
		//							its syntax is similar to a constructor
		//							except that there is also a class definition without a block of code
		//							it's a GREAT option for LISTENERS
		
		HelloWorld helloWorld = new HelloWorld() {
			//override the helloWorld method
			@Override		//tell to compiler, not necessary
			public void helloWorld() {
				System.out.println("Hello Caesar James LEE");
			}
		};
		
		HelloWorld helloWorld1 = new HelloWorld();
		
		System.out.println("overrided version:");
		helloWorld.helloWorld();
		
		System.out.println("\noriginal version:");
		helloWorld1.helloWorld();
		
		new UI();
	}
}