/*
 * Lesson fifty-three: Create A Menu
 * Date: July 8, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {
	public static void main(String[] args) {
		//JMenuBar:		creates a container to hold menus
		//JMenu:		creates a container to hold items of a menu
		//JMenuItem:	creates a menu item
		
		//to add a menu bar
		//I.	JMenuBar JMenuBarName = new JMuneBar();
		//JFrame.addJMenuBar(JMenuBarName);
		
		//to add a menu
		//JMenu JMenuName = new JMenu("JMenuName");
		//JMenuBarName.add(JMenuName);
		
		//to add a menu item
		//JMuneItem JMenuItemName = new JMenuItem("JMenuItemName");
		//JMenuName.add(JMenuItemName
		
		//to add an accelerator key
		//JMenuItemName.setMenemonic(KeyEvent);
		//we need import java.awt.event.KeyEvent;
		
		//to add a menu item icon
		//JMenuName || JMenuItemName.setIcon(ImageIcon);
		
		JFrame frame = new JFrame("Caesar's First Menu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setSize(500, 200);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.GRAY);
		frame.setJMenuBar(menuBar);
		
		ImageIcon fileWindowIcon = new ImageIcon("images/file.png");
		Image fileWindowScaledIcon = fileWindowIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		fileWindowIcon = new ImageIcon(fileWindowScaledIcon);
		
		JMenu fileMenu = new JMenu("File");
		fileMenu.setBackground(Color.RED);
		fileMenu.setForeground(Color.BLUE);
		fileMenu.setFont(new Font("Arial", Font.PLAIN, 15));
		fileMenu.setMnemonic(KeyEvent.VK_F);
		fileMenu.setIcon(fileWindowIcon);
		menuBar.add(fileMenu);
		
		ImageIcon exitWindowIcon = new ImageIcon("images/exit.png");
		Image exitWindowScaledIcon = exitWindowIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		exitWindowIcon = new ImageIcon(exitWindowScaledIcon);
		
		ImageIcon newWindowIcon = new ImageIcon("images/new.png");
		Image newWindowScaledIcon = newWindowIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		newWindowIcon = new ImageIcon(newWindowScaledIcon);
		
		ImageIcon blueWindowIcon = new ImageIcon("images/blue.png");
		Image blueWindowScaledIcon = blueWindowIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		blueWindowIcon = new ImageIcon(blueWindowScaledIcon);
		
		JMenuItem exitWindow = new JMenuItem("exit");
		exitWindow.addActionListener(e -> System.exit(0));
		exitWindow.setFont(new Font("Arial", Font.PLAIN, 15));
		exitWindow.setMnemonic(KeyEvent.VK_E);
		exitWindow.setIcon(exitWindowIcon);
		
		JMenuItem newWindow = new JMenuItem("new");
		newWindow.addActionListener(e -> {	JFrame newFrame = new JFrame("sub window");
											newFrame.getContentPane().setBackground(Color.BLACK);
											newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
											newFrame.setSize(500, 200);
											newFrame.setVisible(true);
										});
		newWindow.setFont(new Font("Arial", Font.PLAIN, 15));
		newWindow.setMnemonic(KeyEvent.VK_N);
		newWindow.setIcon(newWindowIcon);
		
		JMenuItem blueWindow = new JMenuItem("change background color to blue");
		blueWindow.addActionListener(e -> frame.getContentPane().setBackground(Color.BLUE));
		blueWindow.setFont(new Font("Arial", Font.PLAIN, 15));
		blueWindow.setMnemonic(KeyEvent.VK_B);
		blueWindow.setIcon(blueWindowIcon);
		
		fileMenu.add(exitWindow);
		fileMenu.add(newWindow);
		fileMenu.add(blueWindow);
		
		frame.setVisible(true);
	}
}