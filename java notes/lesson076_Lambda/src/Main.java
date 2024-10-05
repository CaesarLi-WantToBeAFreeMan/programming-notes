/*
 * Lesson seventy-six: Lambda
 * Date: August 28, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;

public class Main {
	public static void main(String[] args) {
		//lambda expression:	feature for Java 8 and above
		//						also known as an anonymous method
		//						a shorter way to write anonymous classes with only one method
		
		//						need to use a functional interface or use a pre-defined functional interface
		//						they contain only one abstract (抽象的) method
		//						ex. ActionListener, Runnable, etc.
		
		//						a lambda expression can be used in any place where a functional interface is required
		
		//syntax:
		//empty argument and single statement:			() -> statement
		//empty argument and multiple statements:		() -> {statements}
		//single argument and single statement:			argument -> statement
		//single argument and multiple statements:		argument -> {statements}
		//multiple arguments and single statement:		(arguments) -> statement
		//multiple arguments and multiple statements:	(arguments) -> {statements}
		
		//functional interface
		MyInterface mIt = () -> System.out.println("Hello World!");
		mIt.helloWorld();
		
		//action listener
		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		
		JLabel info = new JLabel();
		info.setForeground(Color.PINK);
		info.setFont(new Font("Cooper Black", Font.BOLD, 18));
		info.setBounds(175, 300, 200, 50);
		frame.add(info);
		
		JButton helloButton = new JButton("hello");
		helloButton.setBackground(Color.GRAY);
		helloButton.setForeground(Color.CYAN);
		helloButton.setFont(new Font("Arial", Font.BOLD, 15));
		helloButton.setFocusable(false);
		helloButton.setBounds(190, 50, 100, 100);
		helloButton.addActionListener(e -> info.setText("Hello World!"));
		frame.add(helloButton);
		
		frame.setVisible(true);
	}
}