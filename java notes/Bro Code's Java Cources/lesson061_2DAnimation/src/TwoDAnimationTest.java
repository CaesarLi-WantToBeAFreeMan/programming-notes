import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TwoDAnimationTest extends JLabel implements ActionListener{
	private JFrame frame = new JFrame("Caesar's First 2D Animation Window");
	private Image rocket = new ImageIcon("images/rocket.png").getImage().getScaledInstance(50, 90, Image.SCALE_SMOOTH);
	private ImageIcon space = new ImageIcon("images/space.jpg");
	private int CANVAS_WIDTH = space.getImage().getWidth(null),
				CANVAS_HEIGHT = space.getImage().getHeight(null),
				ROCKET_WIDTH = 50,
				ROCKET_HEIGHT = 90,
				x = CANVAS_WIDTH / 2 - (ROCKET_WIDTH / 2),
				y = CANVAS_HEIGHT / 2 - (ROCKET_HEIGHT / 2),
				xVelocity = 1,
				yVelocity = 1;
	//constructor of Timer
	//Timer(delayMicrosecond, ActionListenerObject);
	private Timer timer = new Timer(10, this);
	
	TwoDAnimationTest(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
		this.setIcon(space);
		//call actionPerformed method every 10 microseconds
		timer.start();
		frame.add(this);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public void paint(Graphics g) {
		//paint the icon as background
		super.paint(g);
		Graphics2D g2D = (Graphics2D)g;
		g2D.drawImage(rocket, x, y, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(x >= CANVAS_WIDTH - ROCKET_WIDTH || x < 0)
			xVelocity *= -1;
		if(y >= CANVAS_HEIGHT - ROCKET_HEIGHT || y < 0)
			yVelocity *= -1;
		x += xVelocity;
		y += yVelocity;
		
		//paint the label when the method is called
		repaint();
	}
}
