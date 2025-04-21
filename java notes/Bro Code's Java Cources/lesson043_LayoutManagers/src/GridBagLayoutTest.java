import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GridBagLayoutTest extends JFrame{
	//GridBagLayout is used to align components vertically, horizontally or along their baseline
	//the components may not be the same size
	//each GridBagLayout object maintains a dynamic, rectangular grid of cells
	
	//the difference between GridLayout and GridBagLayout is
	//a component of GridBagLayout can occupy multiple rows and columns
	
	//I.	constructors
	//i.	CardLayout()
	//creates a grid bag layout manager
	
	//II.	attributes
	//i.	Insets insets
	//			holds an insets object, which controls the gap between two cells
	//			an insets object constructor:	(top, right, bottom, left)
	//			by default, (0, 0, 0, 0)
	//			tips:	import java.awt.Insets;
	//ii.	gridx and gridy
	//			holds the x-demension and y-demension of the component
	//			coordinate system starts from the upper left corner
	//iii.	gridwidth and wridheight
	//			holds the width and height of the component
	//			the unit is cell
	//			by default, gridwidth = geidheight = 1
	//iv.	fill
	//			it has two values:	GridBagConstraints.VERTICAL and GridBagConstraints.HORIZONTAL
	//			fill the width and height cells vertically or horizontally
	//			tips:	import java.awt.GridBagConstraints
	//v.	ipadx and ipady
	//			pluses 2 * the value of x-deminsion and y-deminsion
	//			by default, ipadx = ipady = 0
	
	GridBagLayoutTest(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("GRID BAG LAYOUT");
		this.getContentPane().setBackground(Color.BLACK);
		this.setSize(300, 300);
		
		JButton button1 = new JButton("1"),
				button2 = new JButton("2"),
				button3 = new JButton("3"),
				button4 = new JButton("4"),
				button5 = new JButton("5"),
				button6 = new JButton("6");
		
		button1.setFocusable(false);
		button2.setFocusable(false);
		button3.setFocusable(false);
		button4.setFocusable(false);
		button5.setFocusable(false);
		button6.setFocusable(false);
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.insets = new Insets(3, 3, 3, 3);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 4;
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.ipadx = 0;
		gbc.ipady = 0;
		this.add(button1, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.ipadx = 0;
		gbc.ipady = 0;
		this.add(button2, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.ipadx = 0;
		gbc.ipady = 0;
		this.add(button3, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipadx = 0;
		gbc.ipady = 0;
		this.add(button4, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.gridheight = 2;
		gbc.ipadx = 25;
		gbc.ipady = 50;
		this.add(button5, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 3;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipadx = 0;
		gbc.ipady = 0;
		this.add(button6, gbc);
		
		this.setVisible(true);
	}
}