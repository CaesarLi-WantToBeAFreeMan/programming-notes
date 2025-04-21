/*
 * Lesson thirty-nine: GUI
 * Date: July 2, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		//JFram:	s GUI window to add components to
		//components:	成分
		
		/*
			//creating a frame
			JFrame frame = new JFrame();
			
			//1.	making the frame visible	
			//by default, the frame is invisible
			frame.setVisible(true);
			
			//2.	adjusting the frame size
			//setSize(x-dimension, y-dimension);
			frame.setSize(700, 500);
			
			//3.	changing the frame title
			//setTitle(String)
			frame.setTitle("Ceasar's First Java Window");
			
			//4.	closing the thread or hiding the thread
			//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE || JFrame.HIDE_ON_CLOSE)
			//by default, the parameter is JFrame.HIDE_ON_CLOSE
			//and there'e another option:	JFrame.DO_NOTHING_ON_CLOSE
			//but it's often useless 
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//5.	set the frame resizable
			//setResizable(true || false)
			//by default, the parameter is true
			frame.setResizable(false);
			
			//6.	changing the frame icon
			//I.	adding import javax.swing.ImageIcon;
			//II.	creating an ImageIcon object
			ImageIcon icon = new ImageIcon("icon/original.png");
			//III.	changing setIconImage parameter into object_name.getImage
			frame.setIconImage(icon.getImage());
			
			//7.	changing the background color
			//I.	adding import java.awt.Color; to select a color
			//II.	getContentPane().setBackground(color);
			//by default, the color is white
			
			//i.	adding a color name
			//frame.getContentPane().setBackground(Color.BLACK);
			//ii.	adding a RGB value
			//frame.getContentPane().setBackground(new Color(0, 0, 0));
			//iii.	adding a hexadecimal value
			frame.getContentPane().setBackground(new Color(0x000000));
			
			//but it's commended, adding a class to hold the whole frame
		 */
		
		new FrameWindow();
	}
}