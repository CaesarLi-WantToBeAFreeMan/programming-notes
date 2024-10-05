/*
 * Lesson forty-six: JOptionPane
 * Date: July 6, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		//JOptionPane:	pop up a standard dialog box that prompts users
		//				for a value or informs them of something
		
		//we should import javax.swing.JOptionPane;
		
		
		//1.	creating a message dialog
		//there's three types of constructors
		//i.	void showMessageDialog(Component parentComponent, Object message)
		//ii.	void showMessageDialog(Component parentComponent, Object message, String title, int messageType)
		//iii.	void showMessageDialog(Component parentComponent, Object message, String title, int messageType, Icon icon)
		JOptionPane.showMessageDialog(null, "This is a test", "Test Dialog", JOptionPane.PLAIN_MESSAGE);;
		
		//2.	creating a input dialog
		//there's six types of constructors
		//i.	String showInputDialog(Object message)
		//ii.	String showInputDialog(Component parentComponent, Object message)
		//iii.	String showInputDialog(Object message, Object initialSelectionValue)
		//iv.	String showInputDialog(Component parentComponent, Object message, Object initialSelectionValue)
		//v.	String showInputDialog(Component parentComponent, Object message, String title, int messageType)
		//vi.	Object showInputDialog(Component parentComponent, Object message, String title, int messageType, Icon icon, Object[] selectionValues, Object initialSelectionValue)
		//we need a String variable to store the String value that the method returned
		String name = JOptionPane.showInputDialog(null, "Please Enter Your nams:", "Caesar");
		
		
		//3.	creating a confirm dialog
		//there's four types of constructors
		//i.	int showConfirmDialog(Component parentComponent, Object message)
		//ii.	int showConfirmDialog(Component parentComponent, Object message, String title, int optionType)
		//iii.	int showConfirmDialog(Component parentComponent, Object message, String title, int optionType, int messageType)
		//iv.	int showConfirmDialog(Component parentComponent, Object message, String title, int optionType, int messageType, Icon icon)
		//we need a int variable to store the options
		
		//4.	creating an option pane
		//it only has one constructor
		//int showOptionDialog(Component parentComponent, Object message, String title, int OptionTye, int messageType, Icon icon, Object[] options, Object initialValue
		String options [] = {"That's my name", "that isn't my name", "skip"};
		int choice = JOptionPane.showOptionDialog(	null, "Are you " + name + " ?", "Name Confirmation", 
													JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, 
													null, options, options [2]);

		switch(choice) {
			case JOptionPane.YES_OPTION:
				JOptionPane.showMessageDialog(null, "You're " + name + " !");
				break;
			case JOptionPane.NO_OPTION:
				JOptionPane.showMessageDialog(null, "You aren't " + name + " !");
				break;
			case JOptionPane.CANCEL_OPTION:
				JOptionPane.showMessageDialog(null, "You haven't told me who you are yet!");
				break;
			case JOptionPane.CLOSED_OPTION:
				JOptionPane.showMessageDialog(null, "You closed the window");
				break;
		}
		
		//there's some messageTypes
		//i			JOptionPane.PLAIN_MESSAGE:				don't show an icon 
		//ii.		JOptionPane.INFORMATION_MESSAGE:		show an information (!) icon
		//iii.		JOptionPane.QUESTION_MESSAGE:			show a question (?) icon
		//iv.		JOptionPane.WARNING_MESSAGE:			show a warning (!) icon
		//v.		JOptionPane.ERROR_MESSAGE:				show an error (X) icon
		
		//here are optionTypes
		//i.		JOptionPane.YES_NO_OPTION:				display a dialog with yes and no buttons(confirm dialog only)
		//ii.		JOptionPane.YES_NO_CANCEL_OPTION:		display a dialog with yes, no and cancel buttons (confirm dialog only)
		//iii.		JOptionPane.OK_CANCEL_OPTION:			display a dialog with OK, cancel buttons(confirm dialog only)
		
		//here are chosenType
		//i.		JOptionPane.YES_OPTION					you chosen Yes button
		//ii.		JOptionPane.NO_OPTION					you chosen No button
		//iii.		JOptionPane.CANCEL_OPTION				you chosen Cancel button
		//iv.		JOptionPane.CLOSED_OPTION				you chosen close button
		
		
	}
}