/*
 * Lesson Five: GUI Introduction
 * Date: June 16, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

//GUI is Graphical User Interface
//To create a dialog window, we should import javax.swing.JOptionPane library to use JOptionPane class

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		//show the name of the input dialog, and the name string will recipe the answer of the dialog
		String name = JOptionPane.showInputDialog("Enter Your Name");
		
		//create a message dialog to interact with users, and say hello
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		//to recipe an integer value, we should use Integer.parseInt function to transform a String
		//into int.
		//and JOptionPane.showInputDialog() method only returns a String value
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
		
		JOptionPane.showMessageDialog(null, "You're " + age + " years old");
		
		//and you also can transform the String into double
		JOptionPane.showMessageDialog(null, "You only have " + 
		Double.parseDouble(JOptionPane.showInputDialog("Enter Your Money")) + " US$ now");
	}
}
