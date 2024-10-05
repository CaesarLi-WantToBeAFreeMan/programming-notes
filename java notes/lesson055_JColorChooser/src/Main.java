/*
 * Lesson fifty-five: JColorChooser
 * Date: July 10, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import javax.swing.*;
import java.awt.*;

public class Main {
	public static void main(String[] args) {
		//JColorChooser:	A GUI mechanism that lat's a user choose a color
		
		//get the selected color
		//Color selectedColorName = JColorChooser.showDialog(component, title, initialColor);

		JFrame frame = new JFrame("Caesar's First JColorChooser Window");
		frame.setSize(500, 300);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(2, 1, 30, 30));
		
		JPanel selectBackgroundColorContainer = new JPanel();
		selectBackgroundColorContainer.setPreferredSize(new Dimension(450, 100));
		selectBackgroundColorContainer.setBackground(null);
		selectBackgroundColorContainer.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));
		frame.add(selectBackgroundColorContainer);
		
		JLabel selectBackgroundColorText = new JLabel("select a background color");
		selectBackgroundColorText.setForeground(Color.WHITE);
		selectBackgroundColorText.setFont(new Font("Cooper Black", Font.PLAIN, 21));
		selectBackgroundColorContainer.add(selectBackgroundColorText);
		
		JButton selectBackgroundColorButton = new JButton("select...");
		selectBackgroundColorButton.setBackground(new Color(88, 57, 39));
		selectBackgroundColorButton.setForeground(Color.BLUE);
		selectBackgroundColorButton.setFont(new Font("Arial", Font.PLAIN, 32));
		selectBackgroundColorButton.setFocusable(false);
		
		selectBackgroundColorContainer.add(selectBackgroundColorButton);
		
		JPanel selectForegroundColorContainer = new JPanel();
		selectForegroundColorContainer.setPreferredSize(new Dimension(450, 100));
		selectForegroundColorContainer.setBackground(null);
		selectForegroundColorContainer.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));
		frame.add(selectForegroundColorContainer);
		
		JLabel selectForegroundColorText = new JLabel("select a foreground color");
		selectForegroundColorText.setForeground(Color.WHITE);
		selectForegroundColorText.setFont(new Font("Cooper Black", Font.PLAIN, 21));
		selectForegroundColorContainer.add(selectForegroundColorText);
		
		JButton selectForegroundColorButton = new JButton("select...");
		selectForegroundColorButton.setBackground(new Color(88, 57, 39));
		selectForegroundColorButton.setForeground(Color.BLUE);
		selectForegroundColorButton.setFont(new Font("Arial", Font.PLAIN, 32));
		selectForegroundColorButton.setFocusable(false);
		
		selectForegroundColorContainer.add(selectForegroundColorButton);
		
		selectBackgroundColorButton.addActionListener(e -> {	Color backgroundColor = JColorChooser.showDialog(selectBackgroundColorContainer, "pick a background color", Color.BLACK);
																frame.getContentPane().setBackground(backgroundColor);
																selectBackgroundColorButton.setBackground(backgroundColor);
																selectForegroundColorButton.setBackground(backgroundColor);
															});
		
		selectForegroundColorButton.addActionListener(e -> {	Color foregroundColor = JColorChooser.showDialog(selectForegroundColorContainer, "pick a foreground color", Color.WHITE);
																selectBackgroundColorText.setForeground(foregroundColor);
																selectForegroundColorText.setForeground(foregroundColor);
																selectBackgroundColorButton.setForeground(foregroundColor);
																selectForegroundColorButton.setForeground(foregroundColor);
															});
		
		frame.setVisible(true);
	}
}