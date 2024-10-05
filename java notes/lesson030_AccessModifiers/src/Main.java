/*
 * Lesson thirty: Access Modifiers
 * Date: July 1, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		//access specifiers in C++ or access modifiers in Java:
		
		//like C++
		//public:		members are accessible from outside the class
		//private:		members cannot be accessed and inherited from outside the class
		//protected:	members cannot be accessed but can inherited from outside the class
		
		//not like C++
		//default:		members are accessible only within the same package
		
		//access level:
		//scope/modifiers				private		default		protected		public
		//project						N			N			N				Y
		//subclass different package	N			N			Y				Y
		//subclass same package			N			Y			Y				Y
		//within the class				Y			Y			Y				Y
		//N means:	cannot access					Y means:	can access
		
		//a package is a collection of classes
	}
}