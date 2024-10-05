import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class BorderLayoutTest extends JFrame{
	//BorderLayout is used to arrange the components in five regions: north, south, east, west and center
	//each region may contain one component only
	//it's the default layout of a frame or window
	
	//I.	constructors
	//i.	BorderLayout()
	//creates a BorderLayout but with no gaps between the components
	//ii.	BorderLayout(int horizontalGap, int verticalGap)
	//creates a BorderLayout with the given horizontal and vertical gaps between the components
	
	//II.	fields
	//i.	NORTH
	//ii.	SOUTH
	//iii.	EAST
	//iv.	WEST
	//v.	CENTER
	
	BorderLayoutTest(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("BORDER LAYOUT");
		this.getContentPane().setBackground(Color.BLACK);
		this.setSize(300, 300);
		
		JButton northenButton = new JButton("NORTH"),
				southenButton = new JButton("SOUTH"),
				easternButton = new JButton("EAST"),
				westernButton = new JButton("WEST"),
				centerButton = new JButton("CENTER");
		
		//both setSize and set PreferredSize are set the component size
		//but the difference of those is the parent layout manager
		//setSize:			works when a parent layout manager doesn't exist
		//setPreferredSize:	works when a parent layout manager exists
		
		northenButton.setFocusable(false);
		northenButton.setPreferredSize(new Dimension(300, 50));
		southenButton.setFocusable(false);
		southenButton.setPreferredSize(new Dimension(300, 50));
		easternButton.setFocusable(false);
		easternButton.setPreferredSize(new Dimension(100, 200));
		westernButton.setFocusable(false);
		westernButton.setPreferredSize(new Dimension(100, 200));
		centerButton.setFocusable(false);
		centerButton.setPreferredSize(new Dimension(100, 200));
		
		this.setLayout(new BorderLayout(5, 5));
		this.add(northenButton, BorderLayout.NORTH);
		this.add(southenButton, BorderLayout.SOUTH);
		this.add(easternButton, BorderLayout.EAST);
		this.add(westernButton, BorderLayout.WEST);
		this.add(centerButton, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	
}
