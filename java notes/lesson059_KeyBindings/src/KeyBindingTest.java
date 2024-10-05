import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Image;

import javax.swing.Action;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

//we need create a class extends AbstractAction to define the action first
//and we need import javax.swing.AbstractAction and java.awt.event.ActionEvent

//we need add Action actionName = new ActionClassName() to use the action second
//and we need import javax.swing.Action

//we need componentName.getInputMap().put(KeyStroke.getKeyStroke(key), "actionID") to create an actionID third
//and then we need componentName.getActionMap().put("actionID", actionName) to call the action
//and we need import javax.swing.KeyStroke


public class KeyBindingTest extends JFrame{
	JLabel rocket = new JLabel();
	Action UpAction = new MoveToUp();
	Action DownAction = new MoveToDown();
	Action LeftAction = new MoveToLeft();
	Action RightAction = new MoveToRight();
	
	KeyBindingTest(){
		this.setTitle("Caesar's First Key Binding Window");
		this.getContentPane().setBackground(Color.BLACK);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon rocketIcon = new ImageIcon("images/rocket.png");
		Image rocketScaledIcon = rocketIcon.getImage().getScaledInstance(50, 90, Image.SCALE_SMOOTH);
		rocketIcon = new ImageIcon(rocketScaledIcon);
		rocket.setIcon(rocketIcon);
		rocket.setVerticalAlignment(JLabel.CENTER);
		rocket.setHorizontalAlignment(JLabel.CENTER);
		
		rocket.getInputMap().put(KeyStroke.getKeyStroke("UP"), "moveToUp");
		rocket.getInputMap().put(KeyStroke.getKeyStroke('w'), "moveToUp");
		rocket.getInputMap().put(KeyStroke.getKeyStroke('W'), "moveToUp");
		rocket.getActionMap().put("moveToUp", UpAction);
		
		rocket.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "moveToDown");
		rocket.getInputMap().put(KeyStroke.getKeyStroke('S'), "moveToDown");
		rocket.getInputMap().put(KeyStroke.getKeyStroke('s'), "moveToDown");
		rocket.getActionMap().put("moveToDown", DownAction);
		
		rocket.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "moveToLeft");
		rocket.getInputMap().put(KeyStroke.getKeyStroke('A'), "moveToLeft");
		rocket.getInputMap().put(KeyStroke.getKeyStroke('a'), "moveToLeft");
		rocket.getActionMap().put("moveToLeft", LeftAction);
		
		rocket.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "moveToRight");
		rocket.getInputMap().put(KeyStroke.getKeyStroke('D'), "moveToRight");
		rocket.getInputMap().put(KeyStroke.getKeyStroke('d'), "moveToRight");
		rocket.getActionMap().put("moveToRight", RightAction);
		
		this.add(rocket);
		this.setVisible(true);
	}
	
	public class MoveToUp extends AbstractAction{
		@Override
		public void actionPerformed(ActionEvent e) {
			rocket.setLocation(rocket.getX(), rocket.getY() - 10);
		}
	}
	
	public class MoveToDown extends AbstractAction{
		@Override
		public void actionPerformed(ActionEvent e) {
			rocket.setLocation(rocket.getX(), rocket.getY() + 10);
		}
	}
	
	public class MoveToLeft extends AbstractAction{
		@Override
		public void actionPerformed(ActionEvent e) {
			rocket.setLocation(rocket.getX() - 10, rocket.getY());
		}
	}
	
	public class MoveToRight extends AbstractAction{
		@Override
		public void actionPerformed(ActionEvent e) {
			rocket.setLocation(rocket.getX() + 10, rocket.getY());
		}
	}
}