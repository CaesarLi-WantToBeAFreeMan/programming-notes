import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//we need implements KeyListener to use the interface
//we need import java.awt.event.KeyEvent and java.awt.event.KeyListener
//we need override KeyTyped, KeyPressed and KeyReleased methods
//and we can use getX and getY method to get its X-axis and Y-axis value

public class KeyListenerTest implements KeyListener{
	private int moveSpeed = 10;
	private JLabel rocket;
	
	KeyListenerTest(){
		JFrame frame = new JFrame("Caesar's First KeyListener Window");
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(500, 500);
		
		rocket = new JLabel();
		rocket.setBounds(225, 205, 50, 90);
		ImageIcon rocketIcon = new ImageIcon("images/rocket.png");
		Image rocketScaledIcon = rocketIcon.getImage().getScaledInstance(50, 90, Image.SCALE_SMOOTH);
		rocketIcon = new ImageIcon(rocketScaledIcon);
		rocket.setIcon(rocketIcon);
		
		frame.add(rocket);
		frame.addKeyListener(this);
		frame.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//invoked when a key is typed
		//uses KeyChar, char output
		
		switch(e.getKeyChar()) {
			case 'W':
			case 'w':
				rocket.setLocation(rocket.getX(),rocket.getY() - moveSpeed);
				break;
			case 'A':
			case 'a':
				rocket.setLocation(rocket.getX() - moveSpeed, rocket.getY());
				break;
			case 'S':
			case 's':
				rocket.setLocation(rocket.getX(), rocket.getY() + moveSpeed);
				break;
			case 'D':
			case 'd':
				rocket.setLocation(rocket.getX() + moveSpeed, rocket.getY());
				break;
			case '+':
				if(moveSpeed < 30)
					moveSpeed++;
				break;
			case '-':
				if(moveSpeed > 1)
					moveSpeed--;
				break;
			case 'R':
			case 'r':
				moveSpeed = 10;
				break;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//invoked when a physical key is pressed down
		//uses KeyCode, int output
		
		switch(e.getKeyCode()) {
			case 38:
				rocket.setLocation(rocket.getX(),rocket.getY() - moveSpeed);
				break;
			case 37:
				rocket.setLocation(rocket.getX() - moveSpeed, rocket.getY());
				break;
			case 40:
				rocket.setLocation(rocket.getX(), rocket.getY() + moveSpeed);
				break;
			case 39:
				rocket.setLocation(rocket.getX() + moveSpeed, rocket.getY());
				break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//called whenever a button is released
		
		System.out.println(e.getKeyChar() + "\t" + e.getKeyCode());
	}
}
