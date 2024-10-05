/*
 * Lesson seventy: Enum (enumerated)
 * Date: July 15, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

enum Planets{
	//every item has a different constructor
	MERCURY(1),
	VENUS(2),
	EARTH(3),
	MARS(4),
	JUPITER(5),
	SATURN(6),
	URANUS(7),
	NEPTUNE(8),
	PLUTO(9);
	
	private int number;
	
	//constructor
	Planets(int number){
		this.number = number;
	}
	
	//getter
	public int getNumber() {
		return this.number;
	}
}

public class Main {
	public static void main(String[] args) {
		//enum (enumerated):	ordered listing of items in a collection
		//grouping of constants that behave similarly to objects
		
		//it has significant differences between C++'s and Java's
		
		//I.	syntax:
		//	C++:
		//		enum EnumName {ITEMNAMES};
		//		EnumName || int name = ITEMNAME;
		
		//		enum class EnumName {ITEMNAMES};	(Scoped enum since C++11)
		//		EnumName name = EnumName::ITEMNAME;
		
		//	Java:
		//		access_modifier enum EnumName {ITEMNAMES};
		//		EnumName name = EnumName.ITEMANAME;
		
		//II.	type safety:
		//	only in early C++ version, you can pass an enum itme to an int variable
		//	on the rest, you can only pass an enum item to its EnumName object
		
		//III.	methods
		//	in C++ all versions, there's no one method or field
		//	in Java version, you can even include constructor
		
		//IV.	inheritance
		//	in C++ all versions, it doesn't support inheritance
		//	in Java version, you can only implement interfaces
		//	because, all enums implicitly extend java.lang.Enum
		
		Planets test = Planets.MARS;
		System.out.println(test);
		System.out.println("This planet is #" + test.getNumber() + " planet of Solar System");
	}
}