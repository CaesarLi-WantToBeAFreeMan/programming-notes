/*
 * Lesson sixty-seven: Packages
 * Date: July 15, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import Tools.Test;

public class Main {
	public static void main(String[] args) {
		//you need add package PackageName; at the top to mark the package except default package
		//you need import PackageName.* or PackageName.ClassName to use the class
		
		Test test = new Test();
		test.test();
	}
}
