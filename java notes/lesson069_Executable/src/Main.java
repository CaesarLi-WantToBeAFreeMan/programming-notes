/*
 * Lesson sixty-nine: Executable (.jar)
 * Date: July 15, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import javax.swing.JFrame;
import java.awt.Color;

public class Main {
	public static void main(String[] args) {
		//create an executable with Eclipse IDE
		//I.	right click on Java project (pick a project with a GUI)
		//II.	Export
		//III.	Java > Runnable JAR file > Next
		//IV.	at Launch configuration select your project
		//V.	at Export destination, select where you want this jar file exported to
		//VI.	> Finish
		
		//change .jar to .exe
		//I.	at Basic > Output file, select a location of your .exe file
		//II.	at Basic > Jar, select the location of your .jar file
		//III.	at Basic > Icon, select the icon location
		//IV.	at JRE > Bundled JRE path, select your JDK rather than JDK bin location
		//V.	click Build wrapper (settings icon) button
		
		JFrame frame = new JFrame("Ceasar's First Executable Application");
		frame.setSize(900, 500);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}