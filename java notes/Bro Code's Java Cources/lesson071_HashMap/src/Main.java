/*
 * Lesson seventy-one: HashMap
 * Date: August 26, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		//Java's HashMap is very similar to C++'s std::map
		//but they have a significant difference:
		//HashMap cann't order data automatically, but C++'s std::map does
		//because C++'s std::map uses a balanced binary tree but Java's HashMap doesn't
		//so The time complexity of C++'s std::map is O(log n), and Java's HashMap is O(1)
		
		//syntax:
		
		//C++'s std::map
		//	#include <map>
		//	std::map <type1, type2> name;
		
		//Java's HashMap
		//	import java.util.HashMap;
		//	HashMap <type1, type2> name = new HashMap <type1, type2>();
		
		//HashMap implements the Map interface
		//HashMap 	is similar to ArrayList, but with key-value pairs
		//			stores objects, need to use Wrapper Class
		//ex: (name, email), (username, userID), (country, capital)
		
		//useful methods
		//	I.		add a key and value
		//				put(key, value);
		//	II.		remove data by a key
		//				remove(key);
		//	III.	return a value by a key
		//				get(key);
		//	IV.		remove all data
		//				clear();
		//	V.		return a number how many the HashMap contains
		//				size();
		//	VI.		replace old value with new value
		//				replace(key, newValue);
		//	VII.	return a boolean whether the HashMap container a key
		//				containesKey(key);
		//	VIII.	return a boolean whether the HashMap container a value
		//				containesValue(key);
		//	IX.		return a set of keys, basically used in iteration
		//				keySet();
		//	X.		return a set of values, basically used in iteration
		//				values();
		
		HashMap <String, Double> clothesPrice = new HashMap <String, Double>();
		clothesPrice.put("T-shirt", 3.99);
		clothesPrice.put("Skirt", 5.99);
		clothesPrice.put("Dress", 6.99);
		clothesPrice.put("Shorts", 3.99);
		clothesPrice.put("Jeans", 7.99);
		clothesPrice.put("Coat", 12.99);
		clothesPrice.put("Suit", 19.99);
		clothesPrice.put("Shirt", 5.99);
		clothesPrice.put("Bra", 1.99);
		clothesPrice.put("Swimsuit", 9.99);
		clothesPrice.put("Jacket", 12.99);
		clothesPrice.remove("T-shirt");
		clothesPrice.replace("skirt", 7.99);
		System.out.println(clothesPrice.get("Skirt"));
		System.out.println(clothesPrice.size());
		System.out.println("is the HashMap contains \"Skirt\"?\t" + clothesPrice.containsKey("Skirt"));
		System.out.println("is the HashMap contains \"12.99\"?\t" + clothesPrice.containsValue(12.99));
		
		System.out.println("product names:\n");
		for(String product : clothesPrice.keySet())
			System.out.print(product + "\t");
		
		System.out.println("\nprices:\n");
		for(double price : clothesPrice.values())
			System.out.print(price + "\t");
	}
}