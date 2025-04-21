import javax.swing.JFrame;
import java.awt.Color;

public class ShowWindow extends JFrame{
	ShowWindow(){
		this.getContentPane().setBackground(Color.BLACK);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DragAndDropTest dragAndDropTest = new DragAndDropTest();
		
		this.add(dragAndDropTest);
		this.setVisible(true);
	}
}