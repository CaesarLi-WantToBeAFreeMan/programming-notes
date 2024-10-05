import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class FlowLayoutTest extends JFrame{
	//FlowLayout is used to arrange the components in a line, one after another (in a flow)
	//it's the default layout of the applet or panel
	
	//I.	constructors
	//i.	FlowLayout()
	//creates a flow layout with centered alignment and a default 5 unit horizontal and vertical gap
	//ii.	FlowLayout(int alignment)
	//creates a flow layout with the given alignment and a default 5 unit horizontal and vertical gap
	//iii.	FlowLayout(int alignment, int horizontalGap, int verticalGap)
	//creates a flow layout with the given alignment and the given horizontal and vertical gap
	
	//II.	fields
	//i.	LEFT
	//ii.	RIGHT
	//iii.	CENTER
	//iv.	LEADING
	//v.	TRAILING
	
	FlowLayoutTest(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("FLOW LAYOUT");
		this.getContentPane().setBackground(Color.BLACK);
		this.setSize(300, 300);
		
		JButton button1 = new JButton("1"),
				button2 = new JButton("2"),
				button3 = new JButton("3"),
				button4 = new JButton("4"),
				button5 = new JButton("5"),
				button6 = new JButton("6"),
				button7 = new JButton("7"),
				button8 = new JButton("8");
		
		button1.setFocusable(false);
		button2.setFocusable(false);
		button3.setFocusable(false);
		button4.setFocusable(false);
		button5.setFocusable(false);
		button6.setFocusable(false);
		button7.setFocusable(false);
		button8.setFocusable(false);
		
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(button7);
		this.add(button8);
		//you can set 	FLowLayout.LEFT, FLowLayout.RIGHT, FLowLayout.CENTER
		//				FLowLayout.LEADING, FLowLayout.TRAILING
		this.setLayout(new FlowLayout(FlowLayout.TRAILING, 30, 50));
		
		this.setVisible(true);
	}
	
}
