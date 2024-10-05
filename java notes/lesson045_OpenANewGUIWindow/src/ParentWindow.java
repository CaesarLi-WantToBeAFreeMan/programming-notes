import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

public class ParentWindow {
	JFrame frame = new JFrame("Parent Window");
	
	ParentWindow(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 550);
		
		JPanel northPanel = new JPanel();
		frame.add(northPanel, BorderLayout.NORTH);
		northPanel.setPreferredSize(new Dimension(500, 50));
		northPanel.setBackground(Color.LIGHT_GRAY);
		JLabel welcomeLabel = new JLabel("Welcome to Caear's Player");
		welcomeLabel.setFont(new Font("Cooper Black", Font.BOLD, 32));
		welcomeLabel.setForeground(Color.CYAN);
		welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
		welcomeLabel.setVerticalAlignment(JLabel.CENTER);
		northPanel.add(welcomeLabel);
		
		JPanel southPanel = new JPanel();
		frame.add(southPanel, BorderLayout.SOUTH);
		southPanel.setPreferredSize(new Dimension(500, 50));
		northPanel.setBackground(Color.LIGHT_GRAY);
		JLabel 	author = new JLabel("AUTHOR: Caesar James LEE"),
				date = new JLabel("DATE: July 4, 2024");
		southPanel.setLayout(null);
		author.setBounds(0, 0, 500, 25);
		author.setFont(new Font("Arial", Font.ITALIC, 21));
		author.setForeground(Color.ORANGE);
		author.setHorizontalAlignment(JLabel.LEFT);
		author.setVerticalAlignment(JLabel.BOTTOM);
		date.setBounds(0, 25, 500, 25);
		date.setFont(new Font("Arial", Font.ITALIC, 21));
		date.setForeground(Color.BLUE);
		date.setHorizontalAlignment(JLabel.LEFT);
		date.setVerticalAlignment(JLabel.TOP);
		southPanel.add(author);
		southPanel.add(date);
		
		JPanel westPanel = new JPanel();
		frame.add(westPanel, BorderLayout.WEST);
		westPanel.setPreferredSize(new Dimension(250, 400));
		westPanel.setBackground(new Color(187, 49, 214));
		JLabel	please = new JLabel("please"),
				click = new JLabel("click"),
				the = new JLabel("the"),
				button = new JLabel("button"),
				to = new JLabel("to"),
				play = new JLabel("play"),
				a = new JLabel("a"),
				song = new JLabel("song");
		westPanel.setLayout(null);
		please.setBounds(0, 0, 250, 50);
		please.setFont(new Font("Franklin Gothic Demi Cond", Font.ITALIC, 30));
		please.setForeground(new Color(245, 222, 179));
		please.setHorizontalAlignment(JLabel.CENTER);
		please.setVerticalAlignment(JLabel.CENTER);
		click.setBounds(0, 50, 250, 50);
		click.setFont(new Font("Franklin Gothic Demi Cond", Font.ITALIC, 30));
		click.setForeground(new Color(245, 222, 179));
		click.setHorizontalAlignment(JLabel.CENTER);
		click.setVerticalAlignment(JLabel.CENTER);
		the.setBounds(0, 100, 250, 50);
		the.setFont(new Font("Franklin Gothic Demi Cond", Font.ITALIC, 30));
		the.setForeground(new Color(245, 222, 179));
		the.setHorizontalAlignment(JLabel.CENTER);
		the.setVerticalAlignment(JLabel.CENTER);
		button.setBounds(0, 150, 250, 50);
		button.setFont(new Font("Franklin Gothic Demi Cond", Font.ITALIC, 30));
		button.setForeground(new Color(245, 222, 179));
		button.setHorizontalAlignment(JLabel.CENTER);
		button.setVerticalAlignment(JLabel.CENTER);
		to.setBounds(0, 200, 250, 50);
		to.setFont(new Font("Franklin Gothic Demi Cond", Font.ITALIC, 30));
		to.setForeground(new Color(245, 222, 179));
		to.setHorizontalAlignment(JLabel.CENTER);
		to.setVerticalAlignment(JLabel.CENTER);
		play.setBounds(0, 250, 250, 50);
		play.setFont(new Font("Franklin Gothic Demi Cond", Font.ITALIC, 30));
		play.setForeground(new Color(245, 222, 179));
		play.setHorizontalAlignment(JLabel.CENTER);
		play.setVerticalAlignment(JLabel.CENTER);
		a.setBounds(0, 300, 250, 50);
		a.setFont(new Font("Franklin Gothic Demi Cond", Font.ITALIC, 30));
		a.setForeground(new Color(245, 222, 179));
		a.setHorizontalAlignment(JLabel.CENTER);
		a.setVerticalAlignment(JLabel.CENTER);
		song.setBounds(0, 350, 250, 50);
		song.setFont(new Font("Franklin Gothic Demi Cond", Font.ITALIC, 30));
		song.setForeground(new Color(245, 222, 179));
		song.setHorizontalAlignment(JLabel.CENTER);
		song.setVerticalAlignment(JLabel.CENTER);
		westPanel.add(please);
		westPanel.add(click);
		westPanel.add(the);
		westPanel.add(button);
		westPanel.add(to);
		westPanel.add(play);
		westPanel.add(a);
		westPanel.add(song);
		
		JPanel eastPanel = new JPanel();
		frame.add(eastPanel);
		eastPanel.setPreferredSize(new Dimension(250, 400));
		eastPanel.setBackground(Color.BLACK);
		JButton playButton = new JButton();
		ImageIcon image = new ImageIcon("image/playButtonIcon.png");
		Image scaleImage = image.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		image = new ImageIcon(scaleImage);
		playButton.setIcon(image);
		playButton.setBackground(Color.BLACK);
		playButton.setFocusable(false);
		//don't show the border line
		playButton.setBorderPainted(false);
		playButton.setBounds(100, 175, 50, 50);
		eastPanel.setLayout(null);
		eastPanel.add(playButton);
		
		playButton.addActionListener(e -> {	frame.dispose();
											try {
												new ChildWindow();
											}catch (UnsupportedAudioFileException e1) {
												e1.printStackTrace();
											}catch (IOException e1) {
												e1.printStackTrace();
											}catch (LineUnavailableException e1) {
												e1.printStackTrace();
											}});
		
		frame.setVisible(true);
	}
	
	
}