import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import java.io.File;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Window extends JFrame implements DocumentListener, Serializable{
	private static final long serialVersionUID = 8964L;
	private String name = null;
	private Color background = null;
	private Color foreground = null;
	private JLabel summaryBackgroundContent = new JLabel();
	private JLabel summaryForegroundContent = new JLabel();
	private JLabel summaryTitleContent = new JLabel();
	private JTextField enterTitleArea = new JTextField();
	private User user = null;
	
	Window(){
		try {
			FileInputStream fileInputStream = new FileInputStream("info/user.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			user = (User) objectInputStream.readObject();
			objectInputStream.close();
			fileInputStream.close();
		} catch (FileNotFoundException e) {
			user = new User();
			user.setName("Ceasar's First Serializable Window");
			user.setBackground(Color.BLACK);
			user.setForeground(new Color(40, 156, 201));
			File file = new File("info/user.ser");
			file.getParentFile().mkdir();
			try {
				file.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		this.setTitle(user.getName());
		this.getContentPane().setBackground(user.getBackground());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 500);
		this.setLayout(new GridLayout(5, 1, 10, 10));
		
		JPanel selectBackgroundContainer = new JPanel();
		selectBackgroundContainer.setBackground(null);
		selectBackgroundContainer.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 5));
		
		JLabel selectBackgroundText = new JLabel("select background color");
		selectBackgroundText.setBackground(null);
		selectBackgroundText.setForeground(user.getForeground());
		selectBackgroundText.setFont(new Font("Cooper Black", Font.PLAIN, 32));
		selectBackgroundText.setVerticalAlignment(JLabel.CENTER);
		selectBackgroundText.setHorizontalAlignment(JLabel.CENTER);
		
		JButton selectBackgroundButton = new JButton("select...");
		selectBackgroundButton.setBackground(new Color(171, 76, 36));
		selectBackgroundButton.setForeground(new Color(250, 139, 135));
		selectBackgroundButton.setFont(new Font("Arial", Font.BOLD, 35));
		selectBackgroundButton.setFocusable(false);
		selectBackgroundButton.addActionListener(e -> {	
														Color selectedBackground = JColorChooser.showDialog(this, "Please Pick Your Favorite Background Color", Color.BLACK);
														background = selectedBackground;
														changeBackgroungText();
													});
		
		selectBackgroundContainer.add(selectBackgroundText);
		selectBackgroundContainer.add(selectBackgroundButton);
		
		JPanel selectForegroundContainer = new JPanel();
		selectForegroundContainer.setBackground(null);
		selectForegroundContainer.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 5));
		
		JLabel selectForegroundText = new JLabel("select foreground color");
		selectForegroundText.setBackground(null);
		selectForegroundText.setForeground(user.getForeground());
		selectForegroundText.setFont(new Font("Cooper Black", Font.PLAIN, 32));
		selectForegroundText.setVerticalAlignment(JLabel.CENTER);
		selectForegroundText.setHorizontalAlignment(JLabel.CENTER);
		
		JButton selectForegroundButton = new JButton("select...");
		selectForegroundButton.setBackground(new Color(171, 76, 36));
		selectForegroundButton.setForeground(new Color(250, 139, 135));
		selectForegroundButton.setFont(new Font("Arial", Font.BOLD, 35));
		selectForegroundButton.setFocusable(false);
		selectForegroundButton.addActionListener(e -> {	
														Color selectedForeground = JColorChooser.showDialog(this, "Please Pick Your Favorite Foreground Color", Color.WHITE);
														foreground = selectedForeground;
														changeForegroungText();
													});
		
		selectForegroundContainer.add(selectForegroundText);
		selectForegroundContainer.add(selectForegroundButton);
		
		JPanel enterTitleContainer = new JPanel();
		enterTitleContainer.setBackground(null);
		enterTitleContainer.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 10));
		
		JLabel enterTitleText = new JLabel("enter a title");
		enterTitleText.setBackground(null);
		enterTitleText.setForeground(user.getForeground());
		enterTitleText.setFont(new Font("Cooper Black", Font.PLAIN, 32));
		enterTitleText.setVerticalAlignment(JLabel.CENTER);
		enterTitleText.setHorizontalAlignment(JLabel.CENTER);
		
		enterTitleArea.setBackground(new Color(4, 40, 84));
		enterTitleArea.setForeground(new Color(143, 14, 199));
		enterTitleArea.setFont(new Font("Cascadia Code", Font.PLAIN, 27));
		enterTitleArea.setCaretColor(Color.WHITE);
		enterTitleArea.setPreferredSize(new Dimension(300, 50));
		enterTitleArea.getDocument().addDocumentListener(this);
		
		enterTitleContainer.add(enterTitleText);
		enterTitleContainer.add(enterTitleArea);
		
		JPanel submitContainer = new JPanel();
		submitContainer.setBackground(null);
		submitContainer.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 10));
		
		JButton submitButton = new JButton("submit");
		submitButton.setBackground(new Color(97, 90, 90));
		submitButton.setForeground(new Color(184, 130, 79));
		submitButton.setFont(new Font("Cooper Black", Font.PLAIN, 50));
		submitButton.setFocusable(false);
		
		submitContainer.add(submitButton);
		
		JPanel summaryContainer = new JPanel();
		summaryContainer.setBackground(null);
		summaryContainer.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		JPanel summaryBackgroundContainer = new JPanel();
		summaryBackgroundContainer.setOpaque(true);
		summaryBackgroundContainer.setBackground(new Color(46, 44, 41));
		summaryBackgroundContainer.setLayout(new GridLayout(2, 1, 10, 10));
		summaryBackgroundContainer.setPreferredSize(new Dimension(150, 50));
		
		JLabel summaryBackgroundTitle = new JLabel("background:");
		summaryBackgroundTitle.setForeground(new Color(158, 154, 147));
		summaryBackgroundTitle.setFont(new Font("Copperplate Gothic Bold", Font.ITALIC, 15));
		
		summaryBackgroundContent.setForeground(new Color(158, 154, 147));
		summaryBackgroundContent.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		
		summaryBackgroundContainer.add(summaryBackgroundTitle);
		summaryBackgroundContainer.add(summaryBackgroundContent);
		
		JPanel summaryForegroundContainer = new JPanel();
		summaryForegroundContainer.setOpaque(true);
		summaryForegroundContainer.setBackground(new Color(46, 44, 41));
		summaryForegroundContainer.setLayout(new GridLayout(2, 1, 10, 10));
		summaryForegroundContainer.setPreferredSize(new Dimension(150, 50));
		
		JLabel summaryForegroundTitle = new JLabel("foreground:");
		summaryForegroundTitle.setForeground(new Color(158, 154, 147));
		summaryForegroundTitle.setFont(new Font("Copperplate Gothic Bold", Font.ITALIC, 15));
		
		summaryForegroundContent.setForeground(new Color(158, 154, 147));
		summaryForegroundContent.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		
		summaryForegroundContainer.add(summaryForegroundTitle);
		summaryForegroundContainer.add(summaryForegroundContent);
		
		JPanel summaryTitleContainer = new JPanel();
		summaryTitleContainer.setOpaque(true);
		summaryTitleContainer.setBackground(new Color(46, 44, 41));
		summaryTitleContainer.setLayout(new GridLayout(2, 1, 10, 10));
		summaryTitleContainer.setPreferredSize(new Dimension(150, 50));
		
		JLabel summaryTitleTitle = new JLabel("title:");
		summaryTitleTitle.setForeground(new Color(158, 154, 147));
		summaryTitleTitle.setFont(new Font("Copperplate Gothic Bold", Font.ITALIC, 15));
		
		summaryTitleContent.setForeground(new Color(158, 154, 147));
		summaryTitleContent.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		
		summaryTitleContainer.add(summaryTitleTitle);
		summaryTitleContainer.add(summaryTitleContent);
		
		summaryContainer.add(summaryBackgroundContainer);
		summaryContainer.add(summaryForegroundContainer);
		summaryContainer.add(summaryTitleContainer);
		
		submitButton.addActionListener(e -> {	
												user.setName(name);
												user.setBackground(background);
												user.setForeground(foreground);
												try {	
													FileOutputStream fileOutputSystem = new FileOutputStream("info/user.ser");
													ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputSystem);
													objectOutputStream.writeObject(user);
													objectOutputStream.close();
													fileOutputSystem.close();
												}catch (FileNotFoundException e1) {
													e1.printStackTrace();
												}catch (IOException e1) {
													e1.printStackTrace();
												}
											});
		
		this.add(selectBackgroundContainer);
		this.add(selectForegroundContainer);
		this.add(enterTitleContainer);
		this.add(submitContainer);
		this.add(summaryContainer);
		this.setVisible(true);
	}
	
	private void changeBackgroungText(){
		summaryBackgroundContent.setText("(" + background.getRed() + ", " + background.getGreen()
									+ ", " + background.getBlue() + ")");
	}
	
	private void changeForegroungText(){
		summaryForegroundContent.setText("(" + foreground.getRed() + ", " + foreground.getGreen()
									+ ", " + foreground.getBlue() + ")");
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		summaryTitleContent.setText(enterTitleArea.getText());
		name = enterTitleArea.getText();
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		summaryTitleContent.setText(enterTitleArea.getText());
		name = enterTitleArea.getText();
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		summaryTitleContent.setText(enterTitleArea.getText());
		name = enterTitleArea.getText();
	}
}