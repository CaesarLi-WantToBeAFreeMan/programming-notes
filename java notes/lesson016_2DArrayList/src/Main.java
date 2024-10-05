/*
 * Lesson sixteen: 2D Array List
 * Date: June 18, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		//2D ArrayList, a dynamic list of lists
		//you can change the size of these lists during runtime
		
		//declaration:
		//ArrayList <ArrayList <Referene_Name>> name = new ArrayList <ArrayList <Reference_Name>>()
		ArrayList <ArrayList <Integer>> numbers = new ArrayList <ArrayList <Integer>>();
		
		//Adding a row way I:	add(new ArrayList <Reference_Name>()) first, get(row).add(value) second
		numbers.add(new ArrayList <Integer>());
		numbers.get(0).add(12);
		numbers.get(0).add(21);
		
		//Adding a row way II:	add(new ArrayList <Integer>(Arrays.asList(values)))
		//tips:					don't forget to import java.util.Arrays library
		numbers.add(new ArrayList <Integer>(Arrays.asList(3, 30)));
		
		numbers.add(new ArrayList <Integer>());
		numbers.get(2).add(8964);
		
		//iteration using for-each loop
		for(int i = 0; i < numbers.size(); i++) {
			for(int j : numbers.get(i))
				System.out.print(j + "\t");
			System.out.println();
		}
		
	}
}