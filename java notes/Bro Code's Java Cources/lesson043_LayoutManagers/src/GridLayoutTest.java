import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridLayout;

public class GridLayoutTest extends JFrame{
	//GridLayout is used to arrange the components in a rectangular grid.
	//one component is displayed in each rectangle
	
	//I.	constructors
	//i.	GridLayout()
	//creates a grid layout with one column per component in a row
	//ii.	GridLayout(int rows, int columns)
	//creates a flow layout with the given rows and columns but no gaps between the components
	//iii.	GridLayout(int rows, int columns, int horizontalGap, int verticalGap)
	//creates a flow layout with the given rows and columns along with given horizontal and vertical gaps
	
	GridLayoutTest(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("GRID LAYOUT");
		this.getContentPane().setBackground(Color.BLACK);
		this.setSize(300, 300);
		
		JButton button1 = new JButton("1"),
				button2 = new JButton("2"),
				button3 = new JButton("3"),
				button4 = new JButton("4"),
				button5 = new JButton("5"),
				button6 = new JButton("6"),
				button7 = new JButton("7"),
				button8 = new JButton("8"),
				button9 = new JButton("9");
		
		button1.setFocusable(false);
		button2.setFocusable(false);
		button3.setFocusable(false);
		button4.setFocusable(false);
		button5.setFocusable(false);
		button6.setFocusable(false);
		button7.setFocusable(false);
		button8.setFocusable(false);
		button9.setFocusable(false);
		
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(button7);
		this.add(button8);
		this.add(button9);
		this.setLayout(new GridLayout(3, 3, 30, 30));
		
		this.setVisible(true);
	}
	
}
