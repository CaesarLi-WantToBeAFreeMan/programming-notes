/*
 * Lesson sixty-eight: Compile || Run Command Prompt
 * Date: July 15, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import javax.swing.JFrame;
import java.awt.Color;

public class Main {
	public static void main(String[] args) {
		//steps
		//I.	make sure you've a Java JDK installed
		//II.	(optional) use a text editor and save a file as .java
		//III.	open Command Prompt || cmd (Windows) or Terminal (Mac) on your computer
		//IV.	set path = JDK bin location
		//V.	change directory (cd) to your java file location
		//VI.	type "javac fileName.java" to compile
		//VII.	type "java fileName) to run
		
		JFrame frame = new JFrame("Test");
		frame.setSize(900, 500);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
