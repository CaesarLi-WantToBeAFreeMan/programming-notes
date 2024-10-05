/*
 * Lesson fifty-one: JSlider
 * Date: July 8, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Font;

public class Main {
	public static void main(String[] args) {
		//JSlider:	GUI component that lets user enter a value
		//			by using an adjustable sliding knob on a track
		//or in other words, a user can select a value from a specific range from a bar
		
		//constructors
		//I.	JSlider()
		//			creates a slider with the initial value of 50 and range of 0 to 100
		//II.	JSlider(int orientation)	orientation 方向
		//			creates a slider with the specified orientation sat by either JSlider.HORIZONTAL
		//			or JSlider.VERTICAL with the range 0 to 100 and initial value 50
		//III.	JSlider(int min, int max)
		//			creates a horizontal slider using the given min and max
		//IV.	JSlider(int min, int max, int value)
		//			creates a horizontal slider using the given min, max and value
		//V.	JSlider(int orientation, int min, int max, int value)
		//			creates a slider using the given orientation, min, max and value
		
		//methods
		//I.	setPaintTicks(boolean b)
		//			determines whether tick (刻度) marks are painted
		//			by default, it's false
		//			and it only works if it's used with setMinorTickSpacing(int n)
		//II.	setMinorTickSpacing(int n)
		//			sets the minor tick spacing to the slider
		//			by default, it's 0
		//			and it only works if it's used with setPaintTicks(boolean b)
		
		//III.	setPaintTrack(boolean b)
		//			determines whether track (bigger tick) marks are painted
		//			by default, it's false, too
		//			and it only works if it's used with setMajorTickSpacing(int n)
		//IV.	setMajorTickSpacing(int n)
		//			sets the major tick spacing to the slider
		//			and it only works if it's used with setPaintTrack(boolean b)
		//V.	setPaintLabels(boolean b)
		//			determines whether track mark numbers are painted
		//			by default, it's false, too
		//VI.	setOrientation(SwingConstants.VERTICAL || SwingConstants.HORIZONTAL)
		//			determines the orientation of the slider is vertical or horizontal
		//VII.	addChangeListener(e -> function)
		//			performances a function when the state is changed
		
		JFrame frame = new JFrame("Caesar's First JSlider Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.BLACK);
		
		JPanel selecteAgeContainer = new JPanel();
		selecteAgeContainer.setBackground(null);
		selecteAgeContainer.setPreferredSize(new Dimension(400, 100));
		selecteAgeContainer.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5));
		frame.add(selecteAgeContainer, BorderLayout.NORTH);
		
		JLabel selecteAgeText = new JLabel("Age:");
		selecteAgeText.setBackground(null);
		selecteAgeText.setForeground(Color.WHITE);
		selecteAgeText.setFont(new Font("Cooper Black", Font.BOLD, 39));
		selecteAgeContainer.add(selecteAgeText);
		
		JSlider selecteAgeChoser = new JSlider(0, 100, 18);
		selecteAgeChoser.setBackground(null);
		selecteAgeChoser.setForeground(Color.WHITE);
		selecteAgeChoser.setPreferredSize(new Dimension(200, 50));
		selecteAgeContainer.add(selecteAgeChoser);
		
		selecteAgeChoser.setPaintTicks(true);
		selecteAgeChoser.setMinorTickSpacing(5);
		
		selecteAgeChoser.setPaintTrack(true);
		selecteAgeChoser.setMajorTickSpacing(20);
		
		selecteAgeChoser.setPaintLabels(true);
		
		JPanel agoInfoContainer = new JPanel();
		agoInfoContainer.setBackground(null);
		frame.add(agoInfoContainer, BorderLayout.CENTER);
		
		JLabel ageInfo = new JLabel("Please selecte your age!");
		ageInfo.setBackground(null);
		ageInfo.setForeground(Color.WHITE);
		ageInfo.setFont(new Font("Arial", Font.ITALIC, 21));
		ageInfo.setVerticalAlignment(JLabel.CENTER);
		ageInfo.setHorizontalAlignment(JLabel.CENTER);
		agoInfoContainer.add(ageInfo);
		
		selecteAgeChoser.addChangeListener(e -> ageInfo.setText("Your age:   " + selecteAgeChoser.getValue()));
		
		frame.pack();
		frame.setVisible(true);
	}
}