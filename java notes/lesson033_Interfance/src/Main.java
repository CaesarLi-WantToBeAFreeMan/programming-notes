/*
 * Lesson thirty-three: Interface
 * Date: July 1, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		//interface:	a template that can be applied to a class
		//				similar to inheritance, 
		//				but specifies what a class has or must do
		//				classes can apply more than one interface,
		//				inheritance is limited to 1 superclass
		
		//form:		class ClassName implements InterfaceName
		
		Rabbit rabbit = new Rabbit();
		rabbit.flee();
		
		Hawk hawk = new Hawk();
		hawk.hunt();
		
		Fish fish = new Fish();
		fish.flee();
		fish.hunt();
	}
}