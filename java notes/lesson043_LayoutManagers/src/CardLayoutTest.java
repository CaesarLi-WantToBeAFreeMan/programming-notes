import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.Container;

public class CardLayoutTest extends JFrame{
	//CardLayout manages the components in such a manner that only one component is visible at a time
	//It treats each component as a card
	
	//I.	constructors
	//i.	CardLayout()
	//creates a card layout with zero horizontal and vertical gap
	//ii.	CardLayout(int horizontalGap, int verticalGap)
	//creates a card layout with the given horizontal and vertical gap
	
	//II.	methods
	//i.	next(Container parent)
	//			flip the next card of the given container
	//ii.	previous(Container parent)
	//			flip the previous card of the given container
	//iii.	first(Container parent)
	//			flip to the first card of the given container
	//iv.	last(Container parent)
	//			flip to the last card of the given container
	//v..	show(Container parent, String name)
	//			flip to the specified card with the given name
	
	CardLayoutTest(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("CARD LAYOUT");
		this.getContentPane().setBackground(Color.BLACK);
		this.setSize(300, 300);
		
		CardLayout card = new CardLayout(3, 3);
		//you should import java.awt.Container;
		Container container = this.getContentPane();
		JButton appleWord = new JButton("Apple"),
				appleMeaning = new JButton("a kind of fruit");
		
		//when the button is clicked, flip to the next card
		appleWord.addActionListener(e -> card.next(container));
		appleMeaning.addActionListener(e -> card.next(container));
		
		appleWord.setFocusable(false);
		appleMeaning.setFocusable(false);
		
		this.add(appleWord);
		this.add(appleMeaning);
		this.setLayout(card);
		
		this.setVisible(true);
	}
	
}
