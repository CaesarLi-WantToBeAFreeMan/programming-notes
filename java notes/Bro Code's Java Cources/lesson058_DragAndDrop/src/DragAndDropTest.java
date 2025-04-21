import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragAndDropTest extends JLabel{
	private ImageIcon rocket = new ImageIcon("images/rocket.png");
	
	//creates two container to store X-axis and Y-axis values
	//imageCorner stores the X-axis and Y-axis values of the image corner
	//previousPoint stores the X-axis and Y-axis values of the previous location of the image corner
	Point imageCorner, previousPoint;
	
	DragAndDropTest(){
		Image rocketScaled = rocket.getImage().getScaledInstance(50, 90, Image.SCALE_SMOOTH);
		rocket = new ImageIcon(rocketScaled);
		
		//initializes the image corner value
		imageCorner = new Point(225, 205);
		ClickListener clickListener = new ClickListener();
		DragListener dragListener = new DragListener();
		this.addMouseListener(clickListener);
		//MouseMotionListener is a listener to take actions when mouse is moving
		this.addMouseMotionListener(dragListener);
	}
	
	public void paintComponent(Graphics g) {
		//paints the image component
		super.paintComponent(g);
		//paints the image in this component at (imageCorner.getX, imageCorner.getY)
		rocket.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
	}
	
	private class ClickListener extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			//updates the location when the image is pressed
			previousPoint = e.getPoint();
		}
	}
	
	private class DragListener extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent e) {
			Point currentPoint = e.getPoint();
			//updates the imageCorner value to the difference between the current and previous locations
			imageCorner.translate(	(int)(currentPoint.getX() - previousPoint.getX()),
									(int)(currentPoint.getY() - previousPoint.getY())
								);
			//updates the previous location
			previousPoint = currentPoint;
			repaint();
		}
	}
}
