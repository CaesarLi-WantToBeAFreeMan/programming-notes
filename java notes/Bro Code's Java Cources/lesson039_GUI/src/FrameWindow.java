import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class FrameWindow extends JFrame{
	FrameWindow(){
		this.setVisible(true);
		this.setSize(700, 500);
		this.setTitle("Ceasar's First Java Window");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		ImageIcon icon = new ImageIcon("icon/original.png");
		this.setIconImage(icon.getImage());
		this.getContentPane().setBackground(new Color(0, 0, 0));
	}
}