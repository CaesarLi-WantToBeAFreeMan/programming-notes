/*
 * Lesson fifty-four: JFlieChooser
 * Date: July 9, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
	public static void main(String[] args) {
		//JFlieChooser:	a GUI mechanism that let's a user choose a file
		//				helpful for opening or saving files
		
		//fileChooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION
		//the user selected a file
		
		//File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
		//create a File object of the selected file
		
		//then we can read or write the file
		
		//we can use JTextArea to edit the file
		
		JFrame frame = new JFrame("Caesar's First JFileChooser Window");
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel fileName = new JLabel("Please select a file or create a new file");
		fileName.setOpaque(true);
		fileName.setBackground(Color.LIGHT_GRAY);
		fileName.setForeground(new Color(88, 57, 39));
		fileName.setFont(new Font("Cooper Black", Font.BOLD, 18));
		fileName.setVerticalAlignment(JLabel.CENTER);
		fileName.setHorizontalAlignment(JLabel.CENTER);
		frame.add(fileName, BorderLayout.NORTH);
		
		JTextArea textEditArea = new JTextArea();
		textEditArea.setBackground(Color.DARK_GRAY);
		textEditArea.setForeground(Color.WHITE);
		textEditArea.setFont(new Font("Arial", Font.PLAIN, 23));
		textEditArea.setCaretColor(Color.RED);
		textEditArea.setVisible(false);
		frame.add(textEditArea, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu fileMenu = new JMenu("file");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(fileMenu);
		
		JMenuItem newMenuItem = new JMenuItem("new");
		newMenuItem.setMnemonic(KeyEvent.VK_N);
		newMenuItem.addActionListener(e -> {	textEditArea.setText("");
												textEditArea.setVisible(true);
												fileName.setText("a new file");
											});
		fileMenu.add(newMenuItem);
		
		JMenuItem openMenuItem = new JMenuItem("open");
		openMenuItem.setMnemonic(KeyEvent.VK_O);
		openMenuItem.addActionListener(e -> {	JFileChooser fileChooser = new JFileChooser();
												if(fileChooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
													File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
													try{
														FileReader fileReader = new FileReader(file);
														String text = "";
														for(int character = fileReader.read(); character != -1; character = fileReader.read())
															text += (char)character;
														fileName.setText(file.getName());
														fileReader.close();
														textEditArea.setText(text);
														textEditArea.setVisible(true);
													}catch(FileNotFoundException e1) {
														JOptionPane.showMessageDialog(frame, "Sorry, we cann't find the file!", "Can Not Find The File", JOptionPane.ERROR_MESSAGE);
													}catch(IOException e1) {
														JOptionPane.showMessageDialog(frame, "Sorry, we cann't read the file!", "Can Not Read The File", JOptionPane.ERROR_MESSAGE);
													}
												}
											});
		fileMenu.add(openMenuItem);
		
		JMenuItem saveMenuItem = new JMenuItem("save");
		saveMenuItem.setMnemonic(KeyEvent.VK_S);
		saveMenuItem.addActionListener(e -> {	JFileChooser fileChooser = new JFileChooser();
												if(fileChooser.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION) {
													File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
													try {
														FileWriter fileWriter = new FileWriter(file);
														String text = textEditArea.getText();
														fileWriter.write(text);
														fileWriter.close();
														textEditArea.setVisible(false);
													}catch(IOException e1) {
														JOptionPane.showMessageDialog(frame, "Sorry, we cann't write to the file!", "Can Not Write To The File", JOptionPane.ERROR_MESSAGE);
													}
												}
												fileName.setText("Please select a file or create a new file");
											});
		fileMenu.add(saveMenuItem);
		
		JMenuItem closeMenuItem = new JMenuItem("close");
		closeMenuItem.setMnemonic(KeyEvent.VK_C);
		closeMenuItem.addActionListener(e -> {	textEditArea.setText(""); 
												textEditArea.setVisible(false);
												fileName.setText("Please select a file or create a new file");
											});
		fileMenu.add(closeMenuItem);
		
		JMenuItem exitMenuItem = new JMenuItem("exit");
		exitMenuItem.setMnemonic(KeyEvent.VK_E);
		exitMenuItem.addActionListener(e -> System.exit(0));
		fileMenu.add(exitMenuItem);
		
		frame.setVisible(true);
		
	}
}