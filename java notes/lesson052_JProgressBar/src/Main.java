/*
 * Lesson fifty-two: JProgressBar
 * Date: July 8, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import javax.swing.*;
import java.awt.*;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		//JProgressBar:	visual aid to let user knows that an operation is processing
		
		//constructors
		//I.	JProgressBar()
		//			creates a horizontal progress bar but no string text
		//II.	JProgressBar(int min, int max)
		//			creates a horizontal progress bar with the specified minimum and maximum value
		//III.	JProgressBar(SwingConstants.VERTICAL || SwingConstants.HORIZONTAL)
		//			creates a progress bar with the specified orientation
		//IV.	JProgressBar(int orient, int min, int max)
		//			creates a progress bar with the specified orientation, minimum and maximum value
		
		//methods
		//I.	void setValue(int value)
		//			sets the current value on the progress bar
		//II.	void setStringPainted(boolean b)
		//			determines whether the number% is painted
		
		//and you need an external function to reset the value
		
		JFrame frame = new JFrame("Caesar's First JProgressBar Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.BLACK);
		
		JProgressBar progressBar = new JProgressBar(0, 100);
		progressBar.setPreferredSize(new Dimension(500, 50));
		progressBar.setForeground(Color.RED);
		progressBar.setBackground(Color.BLUE);
		progressBar.setFont(new Font("Bradley Hand ITC", Font.BOLD, 32));
		progressBar.setStringPainted(true);
		progressBar.setBorderPainted(true);
		frame.add(progressBar);
		
		frame.pack();
		frame.setVisible(true);
		
		progressBarPerformance(progressBar, 0, 100);
	}
	
	public static void progressBarPerformance(JProgressBar progressBar, int min, int max) throws InterruptedException {
		for(int i = min; i <= max; i++) {
			Thread.sleep(100);
			progressBar.setValue(i);
		}
		progressBar.setString("This task is finished!");
	}
}





























