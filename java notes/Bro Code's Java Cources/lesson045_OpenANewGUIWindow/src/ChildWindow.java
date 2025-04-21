import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class ChildWindow{
	private boolean isPaused = false;
	private long microseconds = 0;
	
	
	JFrame frame = new JFrame("Child Window");
	ChildWindow() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 550);
		
		JPanel northPanel = new JPanel();
		frame.add(northPanel, BorderLayout.NORTH);
		northPanel.setPreferredSize(new Dimension(500, 70));
		northPanel.setBackground(new Color(255, 0, 0));
		JLabel 	songName = new JLabel("We Are Never Ever Getting Back Together"),
				songVersion = new JLabel("(Taylor's Version)");
		songName.setFont(new Font("Cooper Black", Font.BOLD, 21));
		songName.setForeground(Color.CYAN);
		songName.setHorizontalAlignment(JLabel.CENTER);
		songName.setVerticalAlignment(JLabel.CENTER);
		songVersion.setFont(new Font("Cooper Black", Font.BOLD, 23));
		songVersion.setForeground(Color.CYAN);
		songVersion.setHorizontalAlignment(JLabel.CENTER);
		songVersion.setVerticalAlignment(JLabel.CENTER);
		northPanel.add(songName);
		northPanel.add(songVersion);
		
		JPanel southPanel = new JPanel();
		frame.add(southPanel, BorderLayout.SOUTH);
		southPanel.setPreferredSize(new Dimension(500, 50));
		southPanel.setBackground(Color.GRAY);
		JLabel language = new JLabel("writtin by JAVA");
		language.setFont(new Font("Cascadia Code", Font.PLAIN, 39));
		language.setHorizontalAlignment(JLabel.LEFT);
		language.setVerticalAlignment(JLabel.BOTTOM);
		language.setForeground(new Color(104, 217, 196));
		southPanel.add(language);
		
		JPanel centerPanel = new JPanel();
		frame.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setPreferredSize(new Dimension(500, 430));
		centerPanel.setBackground(new Color(8, 172, 201));
		ImageIcon coverImage = new ImageIcon("image/Cover.png");
		Image scaleCover = coverImage.getImage().getScaledInstance(370, 370, Image.SCALE_SMOOTH);
		coverImage = new ImageIcon(scaleCover);
		JPanel 	coverPanel = new JPanel(),
				buttonsPanel = new JPanel();
		//northernLabel.setHorizontalAlignment(JLabel.CENTER);
		//northernLabel.setVerticalAlignment(JLabel.CENTER);
		centerPanel.add(coverPanel, BorderLayout.NORTH);
		centerPanel.add(buttonsPanel, BorderLayout.SOUTH);
		coverPanel.setPreferredSize(new Dimension(500, 350));
		coverPanel.setBackground(null);
		buttonsPanel.setPreferredSize(new Dimension(500, 30));
		buttonsPanel.setBackground(null);
		
		JButton coverButton = new JButton(),
				forward10Seconds = new JButton("↩"),
				play = new JButton("▶"),
				stop = new JButton("■"),
				backward10Seconds = new JButton("↪");
		
		coverButton.setIcon(coverImage);
		coverButton.setPreferredSize(new Dimension(370, 370));
		coverButton.setFocusable(false);
		coverButton.setBorderPainted(false);
		
		forward10Seconds.setFocusable(false);
		forward10Seconds.setBackground(Color.BLACK);
		forward10Seconds.setForeground(Color.WHITE);
		
		play.setFocusable(false);
		play.setBackground(Color.BLACK);
		play.setForeground(Color.WHITE);
		
		stop.setFocusable(false);
		stop.setBackground(Color.BLACK);
		stop.setForeground(Color.WHITE);
		
		backward10Seconds.setFocusable(false);
		backward10Seconds.setBackground(Color.BLACK);
		backward10Seconds.setForeground(Color.WHITE);
		
		File song = new File("songs/WeAreNeverEverGettingBackTogether(Taylor'sVersion).wav");
		AudioInputStream songStream = AudioSystem.getAudioInputStream(song);
		Clip control = AudioSystem.getClip();
		control.open(songStream);
		
		control.addLineListener(event -> {
											if(event.getType() == LineEvent.Type.STOP ) {
												microseconds = 0;
												play.setText("▶");
												control.stop();
												control.setMicrosecondPosition(microseconds);
											}
		});
		
		
		coverButton.addActionListener(e -> {	if(isPaused == false) {
													play.setText("||");
													control.setMicrosecondPosition(microseconds);
													control.start();
													isPaused = true;
												}else {
													play.setText("▶");
													microseconds = control.getMicrosecondPosition();
													control.stop();
													isPaused = false;
												}
											});
		
		play.addActionListener(e -> {	if(isPaused == false) {
											play.setText("||");
											control.setMicrosecondPosition(microseconds);
											control.start();
											isPaused = true;
										}else {
											play.setText("▶");
											microseconds = control.getMicrosecondPosition();
											control.stop();
											isPaused = false;
										}
									});
		
		stop.addActionListener(e -> {	microseconds = 0;
										control.stop();
										control.setMicrosecondPosition(microseconds);
										isPaused = false;
										play.setText("▶");
									});
		
		forward10Seconds.addActionListener(e -> {	microseconds = control.getMicrosecondPosition();
													if(microseconds >= 10000000) {
														control.stop();
														microseconds -= 10000000;
														control.setMicrosecondPosition(microseconds);
														control.start();
													}
												});
		
		backward10Seconds.addActionListener(e -> {	microseconds = control.getMicrosecondPosition();
													if(microseconds + 10000000 <= control.getMicrosecondLength()) {
														control.stop();
														microseconds += 10000000;
														control.setMicrosecondPosition(microseconds);
														control.start();
													}
												});
		
		coverPanel.add(coverButton);
		buttonsPanel.add(forward10Seconds);
		buttonsPanel.add(play);
		buttonsPanel.add(stop);
		buttonsPanel.add(backward10Seconds);
		
		frame.setVisible(true);
	}
}