/*
 * Lesson seventeen: for-each Loop
 * Date: June 19, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		//for-each loop:		traversing technique to iterate through the elements in
		//						an array or other collection
		//pros:					1. less steps		2. more readable
		//cons:					1. less flexible
		
		String [] singers = {"Taylor Swift", "Olivia Rodrigo", "Justin Bieber", "Gayle"};
		ArrayList <ArrayList <String>> artists = new ArrayList <ArrayList <String>>();
		artists.add(new ArrayList <String>());
		artists.get(0).addAll(new ArrayList <String>(Arrays.asList("Songstresses", "Taylor Swift", "Olivia Rodrigo", "Gayle")));
		artists.add(new ArrayList <String>());
		artists.get(1).add("Songsters");
		artists.get(1).add("Justin Bieber");
		artists.add(new ArrayList <String>());
		artists.get(2).addAll(new ArrayList <String>(Arrays.asList("Bands", "(G)I-DLE", "BLACKPINK", "aespa", "twice")));
		
		System.out.println("singers table:");
		
		for(String i : singers)
			System.out.print(i + "\t");
		
		System.out.println("\n\t***********************\nartists table:");
		
		for(int i = 0; i < artists.size(); i++) {
			for(String k : artists.get(i))
				System.out.print(k + "\t");
			System.out.println();
		}
	}
}