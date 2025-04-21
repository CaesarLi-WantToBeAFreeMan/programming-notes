/*
 * Lesson forty: Labels
 * Date: July 2, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Main {
	public static void main(String[] args) {
		//JLabel:	a GUI display area for a string of text, an image, or both
		
		//1.	creating a frame
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 900);
		frame.setTitle("Caesar's Java Window");
		frame.getContentPane().setBackground(new Color(120, 120, 120));;
		
		//2.	creating a JLabel object
		JLabel label = new JLabel();
		
		//3.	adding the label into the frame
		frame.add(label);
		
		//4.	showing text
		label.setText("Ceasar, Congratulations, you've a Java label now!!!");
		
		//5.	showing the label icon
		ImageIcon image = new ImageIcon("image/LabelImage.png");
		label.setIcon(image);
		
		//6.	adjusting the text position for the image
		//by default, 	setHorizontalTextPosition(JLabel.RIGHT),
		//				setVerticalTextPosition(JLabel.CENTER)
		//and you've two method to set:		setHorizontalTextPosition,
		//you've three parameter to pass:	JLabel.LEFT, JLabel.CENTER, JLabel.RIGHT
		//									setVerticalTextPosition
		//									JLabel.TOP,  JLabel.CENTER, JLabel.BOTTOM
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		
		//7.	adjusting the text color
		label.setForeground(Color.PINK);
		
		//8.	adjusting the text font
		//setFont(name, style, size)
		//and you should import java.awt.Font
		label.setFont(new Font("Cooper Black", Font.BOLD, 23));
		
		//9.	adjusting the distance between the text and the image
		//and you can set it a positive or negative number
		label.setIconTextGap(150);
		
		//10.	adjusting the label color
		//but you should set setOpaque into true, because this method is set the label
		//background visible or invisible
		//by default, the value of opaque is false;
		label.setBackground(Color.BLACK);
		label.setOpaque(true);
		
		//11.	adjusting the label position
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		//12.	setting the label location and size
		//i.	frame.setLayout(null)
		//	the default layout on a JFrame is a BorderLayout
		//	and each of the locations of the BorderLayout can contain only one element
		//ii.	label.setBounds(x-deminsion, y-deminsion, width, height)
		
		//frame.setLayout(null);
		//label.setBounds(50, 125, 900, 600);
		
		//13.	size the window size automatically
		//and this method is only useful after add method
		frame.pack();
	}
}