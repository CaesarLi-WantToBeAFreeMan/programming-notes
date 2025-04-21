/*
 * Lesson forty-seven: JTextField
 * Date: July 6, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class Main {
	public static void main(String[] args) {
		//JTextField:	A GUI textbox component that can be used to add, set or get text
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField textField = new JTextField("username");
		textField.setPreferredSize(new Dimension(500, 400));
		textField.setBackground(Color.BLACK);
		//set the caret (游標) color
		textField.setCaretColor(Color.RED);
		textField.setForeground(Color.BLUE);
		textField.setFont(new Font("Arial", Font.BOLD, 50));
		textField.setColumns(5);
		frame.add(textField, BorderLayout.NORTH);
		
		JPanel buttonsContainer = new JPanel();
		buttonsContainer.setPreferredSize(new Dimension(500, 50));
		buttonsContainer.setBackground(null);
		frame.add(buttonsContainer, BorderLayout.SOUTH);
		JButton submit = new JButton("submit"),
				reset = new JButton("reset");
		submit.setPreferredSize(new Dimension(180, 39));
		submit.setBackground(Color.GRAY);
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		submit.setFocusable(false);
		submit.setHorizontalAlignment(JButton.CENTER);
		submit.setVerticalAlignment(JButton.CENTER);
		reset.setPreferredSize(new Dimension(180, 39));
		reset.setBackground(Color.GRAY);
		reset.setForeground(Color.WHITE);
		reset.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		reset.setFocusable(false);
		reset.setHorizontalAlignment(JButton.CENTER);
		reset.setVerticalAlignment(JButton.CENTER);
		buttonsContainer.add(reset);
		buttonsContainer.add(submit);
		
		submit.addActionListener(e -> {
									//setEditable(boolean), set the text field can be edited or not
									//by default is true
									textField.setEditable(false);
									textField.setEnabled(false);
									submit.setEnabled(false);
									reset.setEnabled(false);
									//getText() returns a String of the text field had
									String name = textField.getText();
									JOptionPane.showMessageDialog(frame, "Hello " + name, "GOODBYEEEEE", JOptionPane.INFORMATION_MESSAGE);
									frame.dispose();
								});
		
		reset.addActionListener(e -> {
									textField.setText("");
								});
		
		frame.setVisible(true);
		
	}
}