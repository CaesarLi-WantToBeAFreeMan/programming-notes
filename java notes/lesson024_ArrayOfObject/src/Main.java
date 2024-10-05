/*
 * Lesson twenty-four: Array Of Object
 * Date: June 28, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		//declaration
		//Table tables[] = new Table [2];
		Table[] tables = new Table [2];
		
		//reassignment
		tables [0] = new Table(3, 3, "Tic Tac Toe", "please click a place to begin");
		tables [1] = new Table(19, 19, "Go", "please click a place to begin");
		
		//iteration
		for(Table i : tables)
			System.out.println(i);
	}
}