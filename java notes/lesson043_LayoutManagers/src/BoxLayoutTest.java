import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BoxLayout;

public class BoxLayoutTest extends JFrame{
	//BoxLayput is used to arrange the components eight vertically or horizontally
	
	//I.	constructors
	//i.	CardLayout(Container c, int axis)
	//			creates a box layout that arranges the components with the given axis
	//			tips:	you cann't pass JFrame itself, what you can pass is JFrame.getContentPane()
	
	//II.	fields
	//i.	X_AXIS
	//			alignment of the components is horizontal from left to right
	//ii.	Y_AXIS
	//			alignment of the components is vertical from top to bottom
	//iii.	LINE_AXIS
	//			alignment of the components is similar to the way words are aligned in a line,
	//			which is based on the ComponentOrientation property of the container
	//			if the ComponentOrientation property is horizontal,
	//				we can align from left to right or from right to left
	//			if the ComponentOrientation property is vertical,
	//				we can only align from top to bottom
	//iv.	PAGE_AXIS
	//			alignment of the components is similar to the way text lines are put on a page
	//			the rest part is similar to LINE_AXIS
	
	BoxLayoutTest(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("BOX LAYOUT");
		this.getContentPane().setBackground(Color.BLACK);
		this.setSize(300, 300);
		
		JPanel 	XAxisPanel = new JPanel(),
				YAxisPanel = new JPanel(),
				LineAxisPanel = new JPanel(),
				PageAxisPanel = new JPanel();
		
		this.setLayout(null);
		XAxisPanel.setBounds(0, 0, 150, 150);
		YAxisPanel.setBounds(0, 150, 150, 150);
		LineAxisPanel.setBounds(150, 0, 150, 150);
		PageAxisPanel.setBounds(150, 150, 150, 150);
		
		this.add(XAxisPanel);
		XAxisPanel.add(new JLabel("X-AXIS"));
		XAxisPanel.setLayout(new BoxLayout(XAxisPanel, BoxLayout.X_AXIS));
		XAxisPanel.setBackground(Color.RED);
		JButton buttons1 [] = new JButton [2];
		for(int i = 0; i < 2; i++) {
			buttons1 [i] = new JButton(Integer.toString(i));
			XAxisPanel.add(buttons1 [i]);
			buttons1 [i].setFocusable(false);
		}
		
		this.add(YAxisPanel);
		YAxisPanel.add(new JLabel("Y-AXIS"));
		YAxisPanel.setLayout(new BoxLayout(YAxisPanel, BoxLayout.Y_AXIS));
		YAxisPanel.setBackground(Color.BLUE);
		JButton buttons2 [] = new JButton [2];
		for(int i = 0; i < 2; i++) {
			buttons2 [i] = new JButton(Integer.toString(i));
			YAxisPanel.add(buttons2 [i]);
			buttons2 [i].setFocusable(false);
		}
		
		this.add(LineAxisPanel);
		LineAxisPanel.add(new JLabel("LINE-AXIS"));
		LineAxisPanel.setLayout(new BoxLayout(LineAxisPanel, BoxLayout.LINE_AXIS));
		LineAxisPanel.setBackground(Color.YELLOW);
		JButton buttons3 [] = new JButton [2];
		for(int i = 0; i < 2; i++) {
			buttons3 [i] = new JButton(Integer.toString(i));
			LineAxisPanel.add(buttons3 [i]);
			buttons3 [i].setFocusable(false);
		}
		
		this.add(PageAxisPanel);
		PageAxisPanel.add(new JLabel("PAGE-AXIS"));
		PageAxisPanel.setLayout(new BoxLayout(PageAxisPanel, BoxLayout.PAGE_AXIS));
		PageAxisPanel.setBackground(Color.GREEN);
		JButton buttons4 [] = new JButton [2];
		for(int i = 0; i < 2; i++) {
			buttons4 [i] = new JButton(Integer.toString(i));
			PageAxisPanel.add(buttons4 [i]);
			buttons4 [i].setFocusable(false);
		}
		
		this.setVisible(true);
	}
}