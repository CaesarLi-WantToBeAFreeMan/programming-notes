/*
 * Lesson seventy-three: Anonymous (匿名的) Object
 * Date: August 28, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//anonymous object aka nameless object
		
		ArrayList <JLabel> labels = new ArrayList <JLabel>();
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setLayout(null);
		frame.setSize(700, 150);
		
		for(int i = 0; i < 12; i++) {
			labels.add(new JLabel(Integer.toString(i)));
			labels.get(i).setForeground(Color.CYAN);
			labels.get(i).setBackground(Color.GRAY);
			labels.get(i).setFont(new Font("Arial", Font.BOLD, 18));
			labels.get(i).setBounds(i * 50 + 10, 50 + 10, 30, 30);
			frame.add(labels.get(i));
		}
		
		frame.setVisible(true);
	}
}
