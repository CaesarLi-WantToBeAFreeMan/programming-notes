/*
 * Lesson forty-eight: JCheckBox
 * Date: July 7, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.Image;

public class Main {
	public static void main(String[] args) {
		//JCheckBox:	A GUI component that can be selected or deselected
		
		JFrame frame = new JFrame("Caesar's first JCheckBox window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER ,5, 5));
		
		JButton submitButton = new JButton("submit");
		submitButton.setFont(new Font("Cooper Black", Font.BOLD, 21));
		submitButton.setBackground(Color.CYAN);
		submitButton.setForeground(Color.BLUE);
		submitButton.setFocusable(false);
		
		//JCheckBox likes JButton
		JCheckBox checkBox = new JCheckBox("Are You Caesar");
		checkBox.setFont(new Font("Arial", Font.PLAIN, 21));
		checkBox.setBackground(new Color(123, 234, 123));
		checkBox.setForeground(new Color(234, 123, 234));
		checkBox.setFocusable(false);
		//set the gap between text and icon
		checkBox.setIconTextGap(12);
		
		ImageIcon 	selectedIcon = new ImageIcon("images/yes.png"),
					deselectedIcon = new ImageIcon("images/no.png");
		Image 	selectedImage = selectedIcon.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING),
				deselectedImage = deselectedIcon.getImage().getScaledInstance(50, 50, Image.SCALE_FAST);
		selectedIcon = new ImageIcon(selectedImage);
		deselectedIcon = new ImageIcon(deselectedImage);
		//set selected icon
		checkBox.setSelectedIcon(selectedIcon);
		//set deselected icon
		checkBox.setIcon(deselectedIcon);
		
		submitButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, checkBox.isSelected() ? "You're Caesar" : "You aren't Caesar"));
		
		frame.add(submitButton);
		frame.add(checkBox);
		frame.pack();
		
		frame.setVisible(true);
	}
}