import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Window extends JFrame implements ActionListener{
	//in order to control the button within actionPerformed method
	JButton button;
	int times = 0;
	
	Window(){
		button = new JButton("CLICK ME");
		button.setFont(new Font("Cooper Black", Font.ITALIC, 15));
		button.setForeground(Color.PINK);
		button.setBackground(Color.BLACK);
		button.setBounds(100, 50, 120, 100);
		
		button.setText("changing the background color");
		button.setSize(300, 250);
		button.setFont(new Font("Cooper Black", Font.BOLD, 15));
		
		//hide the text border
		button.setFocusable(false);
		button.setIcon(new ImageIcon("image/cursorPointer.png"));
		button.setVerticalTextPosition(JButton.TOP);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setIconTextGap(30);
		
		//disable the button
		//button.setEnabled(false);
		//add an action listener to listen events of this object
		//button.addActionListener(this);
		
		//we need add 	ActionListener interface, 
		//				java.awt.event.ActionEvent and java.awt.event.ActionListener libraries
		//and override the actionPerformed method
		//to set actions when the button is clicked
		
		//or using lambda statement and can remove "implements ActionListener"
		//form1:	parameter -> expression
		//form2:	(parameter1, parameter2) -> expression
		//form3:	(parameter1, parameter2) -> {expression1; expression2;}
		button.addActionListener(e -> {this.getContentPane().setBackground(new Color(++times * 10, 20 * ++times, 30 * ++times)); button.setEnabled(false);});
		
		this.setTitle("Caesar's Java Window");
		this.setSize(700, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.BLACK);
		this.add(button);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//when the button is clicked
		if(e.getSource() == button) {
			this.getContentPane().setBackground(new Color(++times, 2 * times, 3 * times));
		}
		
	}
}