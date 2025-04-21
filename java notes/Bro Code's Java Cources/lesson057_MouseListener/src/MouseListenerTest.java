import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerTest implements MouseListener{

	JLabel text = new JLabel();
	
	MouseListenerTest(){
		JFrame frame = new JFrame("Caesar's first MouseListener Window");
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		
		text.setBackground(null);
		text.setForeground(Color.RED);
		text.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		text.setPreferredSize(new Dimension(500, 100));
		text.setVerticalAlignment(JLabel.CENTER);
		text.setHorizontalAlignment(JLabel.CENTER);
		text.addMouseListener(this);
		
		frame.add(text);
		frame.setVisible(true);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		//invoked when a mouse button has been clicked (pressed and released) on a component
		//text.setText("You clicked the label");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//invoked when a mouse button has been pressed on a component
		text.setText("You pressed the label");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//invoked when a mouse button has been released on a component
		text.setText("You released the label");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//invoked when the mouse enters a component
		text.setText("You entered the label");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//invoked when the mouse exits a component
		text.setText("You exited the label");
	}

}
