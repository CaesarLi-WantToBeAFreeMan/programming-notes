/*
 * Lesson forty-one: Panels
 * Date: July 2, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;

public class Main {
	public static void main(String[] args) {
		//JPanel:	a GUI component that functions as a container to hold other components
		JFrame frame = new JFrame("Caesae's Java Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(550, 550);
		frame.getContentPane().setBackground(Color.BLACK);
		
		//to make setBounds method works
		frame.setLayout(null);
		
		frame.setVisible(true);
		
		JPanel redPanel = new JPanel();
		
		//setBounds, add like label
		redPanel.setBounds(0, 0, 250, 250);
		
		JLabel label = new JLabel("This is a text label");
		label.setFont(new Font("Cooper Black", Font.BOLD, 21));
		label.setForeground(Color.PINK);
		
		//you only can use setBounds() when super.setLayout is null
		//you can use setVeriticleAlignment and setHorizontalAlignment
		//when super.setLayour is new BorderLayout (import java.awt.BorderLayout;)
		
		//redPanel.setLayout(null);
		//label.setBounds(25, 125, 200, 50);
		redPanel.setLayout(new BorderLayout());
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		redPanel.add(label);
		
		//setVisible likes frame
		redPanel.setVisible(true);
		
		//setBackground 
		redPanel.setBackground(Color.RED);
		frame.add(redPanel);
		
		//constructor JPanel(boolean) is set the visible of the panel
		JPanel 	bluePanel = new JPanel(true),
				yellowPanel = new JPanel(true),
				greenPanel = new JPanel(true);
		
		bluePanel.setBounds(0, 250, 250, 250);
		yellowPanel.setBounds(250, 0, 250, 250);
		greenPanel.setBounds(250, 250, 250, 250);
		
		bluePanel.setBackground(Color.BLUE);
		yellowPanel.setBackground(Color.YELLOW);
		greenPanel.setBackground(Color.GREEN);
		
		frame.add(bluePanel);
		frame.add(yellowPanel);
		frame.add(greenPanel);
	}
}