import javax.swing.*;
import java.awt.*;

//paint(Graphics p) of Component class:	paints this component
//this method called when the contents of the component should be painted
//and we need override the method if we indeed need

public class TwoDGraphicsTest extends JFrame{
	TwoDGraphicsTest(){
		//the size of frame includes the size of a window bar
		this.setSize(1050, 950);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Ceasar's First 2D Graphics Window");
		this.getContentPane().setBackground(Color.BLACK);
		
		this.setVisible(true);
	}
	
	public void paint(Graphics g) {
		//Graphics2D is a subclass of Graphics
		//we need cast Graphics to Graphics2D
		
		//paint background
		super.paint(g);
		
		Graphics2D g2D = (Graphics2D)g;
		
		//set the pen color
		g2D.setPaint(Color.BLUE);
		
		//set the pen thickness
		g2D.setStroke(new BasicStroke(5));
		
		//draw a line
		//drawLine(startPointX, startPointY, endPointX, endPointY);
		g2D.drawLine(0, 0, 500, 50);
		
		//draw a rectangle
		//drawRect(upper-leftCornerX, upper-leftCornerY, lower-rightConerX, lower-rightConerY);
		g2D.drawRect(50, 70, 200, 150);
		
		//draw a filled rectangle
		//fillRect(upper-leftCornerX, upper-leftCornerY, lower-rightConerX, lower-rightConerY);
		g2D.fillRect(270, 70, 200, 150);
		
		//draw an oval (橢圓)
		//drawOval(leftPointX, leftPointY, width, height);
		g2D.drawOval(50, 250, 200, 150);
		
		//draw a filled oval
		//fillOval(leftPointX, leftPointY, width, height);
		g2D.fillOval(270, 250, 200, 150);
		
		//draw an arc
		//drawArg(leftPointX, leftPointY, width, height, startAngle, endAngle);
		g2D.drawArc(50, 420, 200, 50, 0, 180);
		
		//draw a filled arc
		//fillArg(leftPointX, leftPointY, width, height, startAngle, endAngle);
		g2D.fillArc(270, 420, 200, 50, 180, 180);
		
		//draw a polygon (多邊形)
		//drawPolygon(int [] Xs, int [] Ys, numberOfSides);
		int [] TriXs = {50, 150, 250}, TriYs = {600, 500, 600};
		g2D.drawPolygon(TriXs, TriYs, 3);
		
		//draw a filled polygon
		//fillPolygon(int [] Xs, int [] Ys, numberOfSides);
		int [] RecXs = {300, 500, 500, 300}, RecYs = {500, 500, 600, 600};
		g2D.fillPolygon(RecXs, RecYs, 4);
		
		//draw a photo
		//drawImage(image, upper-leftCornerX, upper-leftCornerY, null);
		Image rocket = new ImageIcon("images/rocket.png").getImage();
		g2D.drawImage(rocket, 510, 10, null);
		
		//set the text font
		//setFont(FontObject);
		g2D.setFont(new Font("Cooper Black", Font.PLAIN, 50));
		
		//draw a text
		//drawString(String text, leftX, leftY);
		g2D.drawString("This is a test", 50, 650);
		
		
	}
}