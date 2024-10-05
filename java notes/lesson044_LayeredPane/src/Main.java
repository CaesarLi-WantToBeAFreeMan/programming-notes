/*
 * Lesson forty-four: Layered Pane
 * Date: July 4, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import javax.swing.*;
import java.awt.*;

public class Main {
	public static void main(String[] args) {
		//JLayeredPane:		Swing container
		//					that provides a third dimension for positioning components
		//					ex. depth, Z-index
		
		//there's 5 layers(inner to outer)
		//Default	-	Palette	-	Modal	-	PopUp	-	Drag
		
		JFrame window = new JFrame("Caesar's Java Window");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.BLACK);
		window.setLayout(null);
		window.setSize(500, 500);
		
		JLayeredPane layeredPane = new JLayeredPane();
		JLabel 	label1 = new JLabel(),
				label2 = new JLabel(),
				label3 = new JLabel(),
				label4 = new JLabel(),
				label5 = new JLabel();
		
		label1.setBounds(50, 50, 200, 200);
		label1.setOpaque(true);
		label1.setBackground(Color.RED);
		
		label2.setBounds(100, 100, 200, 200);
		label2.setOpaque(true);
		label2.setBackground(Color.GREEN);
		
		label3.setBounds(150, 150, 200, 200);
		label3.setOpaque(true);
		label3.setBackground(Color.BLUE);
		
		label4.setBounds(200, 200, 200, 200);
		label4.setOpaque(true);
		label4.setBackground(Color.PINK);
		
		label5.setBounds(250, 250, 200, 200);
		label5.setOpaque(true);
		label5.setBackground(Color.ORANGE);
		
		layeredPane.setBounds(0, 0, 500, 500);
		window.add(layeredPane);
		
		//and we can specify the layer of the component
		//there's two ways
		//i.	typing the layer name
		//layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
		//layeredPane.add(label2, JLayeredPane.POPUP_LAYER);
		//layeredPane.add(label3, JLayeredPane.DEFAULT_LAYER);
		//layeredPane.add(label4, JLayeredPane.POPUP_LAYER);
		//layeredPane.add(label5, JLayeredPane.DRAG_LAYER);
		
		//ii.	typing the Z-Index
		//range [0, +∞)
		layeredPane.add(label1, Integer.valueOf(0));
		layeredPane.add(label2, Integer.valueOf(1));
		layeredPane.add(label3, Integer.valueOf(0));
		layeredPane.add(label4, Integer.valueOf(1));
		layeredPane.add(label5, Integer.valueOf(2));
		
		window.setVisible(true);
		
	}
}