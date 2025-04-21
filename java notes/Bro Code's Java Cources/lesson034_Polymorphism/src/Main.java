/*
 * Lesson thirty-four: Polymorphism
 * Date: July 1, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		//polymorphism:		"poly" - "many", "morph" - "form"
		//					the ability of an object to identify as more than one type
		
		//Overriding:		using the same function signature to change the inherited methods from a parent.
		//Polymorphism:		a concept in CS that objects can have a mix of some inherited methods and some unique to their own class.
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		Animal [] animals = {dog, cat};
		
		for(Animal i : animals)
			i.scream();
	}
}