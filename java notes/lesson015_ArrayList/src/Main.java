/*
 * Lesson fifteen: Array List
 * Date: June 18, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//ArrayList		a resizable array
		//resizable (可調整大小的) is its capacity can be changed
		//				elements can be added and removed after compilation phase
		//				stores reference data types
		
		//declaration:	ArrayList <Reference_Name> name = new ArrayList <Reference_Name>()
		ArrayList <Integer> number = new ArrayList <Integer>();
		
		//add(Reference_Name_Value) likes push_back(data_type_value) on C++
		//add(position, Reference_Name_Value)
		//likes insert(vector.begin() + position, value) on C++
		number.add(12);
		number.add(21);
		number.add(0, 5);
		
		//reassignment: set(position, Reference_Name_Value)
		//likes name [position] = value on C++
		number.set(0, 3);
		
		//iteration using for-each loop, and cann't use '\t', only can use "\t"
		for(int i : number)
			System.out.print(i + "\t");
		System.out.println();
		
		//accessing an element, using get(position) method rather than [position] likes C++
		System.out.println(number.get(0));
		
		//remove(position), only remove(ArrayList.size() - 1) likes pop_back() on C++
		number.remove(1);
		for(int i : number)
			System.out.print(i + "\t");
		System.out.println();
		
		//size() method likes C++
		System.out.println(number.size());
		
		//clear() method likes C++
		number.clear();
		
		//isEmpty() likes empty() on C++
		System.out.println(number.isEmpty());
	}
}