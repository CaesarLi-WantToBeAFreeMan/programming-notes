/*
 * Lesson forty-nine: JRadioButton
 * Date: July 7, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Image;

public class Main {
	
	static private String genderOption = "other";
	static private String ageRangeOption = "adult";
	static private boolean agreeOption = false;
	
	public static void main(String[] args) {
		//JRadioButton:	one or more buttons in a grouping in which only 1 may be selected per group
		JFrame frame = new JFrame("Caesar's first JRadioBUtton window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.BLACK);
		
		//------------------------------------------- submit block------------------------------------------------------------------
		
		JButton submitButton = new JButton("submit");
		submitButton.setFont(new Font("Cooper Black", Font.BOLD, 21));
		submitButton.setBackground(Color.CYAN);
		submitButton.setForeground(Color.RED);
		submitButton.setFocusable(false);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setPreferredSize(new Dimension(75, 70));
		bottomPanel.setBackground(null);
		bottomPanel.add(submitButton);
		frame.add(bottomPanel, BorderLayout.SOUTH);
		
		//-------------------------------------------------------------------------------------------------------------
		
		//------------------------------------------- gender block ------------------------------------------------------------------
		
		JLabel genderText = new JLabel("gender:");
		genderText.setBackground(null);
		genderText.setForeground(Color.WHITE);
		genderText.setFont(new Font("Arial", Font.PLAIN, 18));
		
		ImageIcon 	selectedMaleIcon = new ImageIcon("images/selectedMale.png"),
					deselectedMaleIcon = new ImageIcon("images/deselectedMale.png"),
					selectedFemaleIcon = new ImageIcon("images/selectedFemale.png"),
					deselectedFemaleIcon = new ImageIcon("images/deselectedFemale.png"),
					selectedOtherGenderIcon = new ImageIcon("images/selectedOther.png"),
					deselectedOtherGenderIcon = new ImageIcon("images/deselectedOther.png");
		
		JRadioButton 	maleButton = new JRadioButton("male"),
						femaleButton = new JRadioButton("female"),
						otherGenderButton = new JRadioButton("other");
		
		maleButton.setBackground(null);
		maleButton.setForeground(Color.WHITE);
		maleButton.setFocusable(false);
		maleButton.setFont(new Font("Arial", Font.PLAIN, 18));
		maleButton.setSelectedIcon(selectedMaleIcon);
		maleButton.setIcon(deselectedMaleIcon);
		
		femaleButton.setBackground(null);
		femaleButton.setForeground(Color.WHITE);
		femaleButton.setFocusable(false);
		femaleButton.setFont(new Font("Arial", Font.PLAIN, 18));
		femaleButton.setSelectedIcon(selectedFemaleIcon);
		femaleButton.setIcon(deselectedFemaleIcon);
		
		otherGenderButton.setBackground(null);
		otherGenderButton.setForeground(Color.WHITE);
		otherGenderButton.setFocusable(false);
		otherGenderButton.setFont(new Font("Arial", Font.PLAIN, 18));
		otherGenderButton.setSelectedIcon(selectedOtherGenderIcon);
		otherGenderButton.setIcon(deselectedOtherGenderIcon);
		//set it's a default selected button
		otherGenderButton.setSelected(true);
		
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(maleButton);
		genderGroup.add(femaleButton);
		genderGroup.add(otherGenderButton);
		
		JLabel ageRangeText = new JLabel("age range:");
		ageRangeText.setBackground(null);
		ageRangeText.setForeground(Color.WHITE);
		ageRangeText.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JPanel genderPanel = new JPanel();
		genderPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		genderPanel.setBackground(null);
		genderPanel.add(genderText);
		genderPanel.add(maleButton);
		genderPanel.add(femaleButton);
		genderPanel.add(otherGenderButton);
		
		//-------------------------------------------------------------------------------------------------------------
		
		//-------------------------------------------- age range block -----------------------------------------------------------------
		
		JRadioButton 	childButton = new JRadioButton("child"),
						teenageButton = new JRadioButton("teenage"),
						adultButton = new JRadioButton("adult");

		childButton.setBackground(null);
		childButton.setForeground(Color.WHITE);
		childButton.setFocusable(false);
		childButton.setFont(new Font("Arial", Font.PLAIN, 18));
		
		teenageButton.setBackground(null);
		teenageButton.setForeground(Color.WHITE);
		teenageButton.setFocusable(false);
		teenageButton.setFont(new Font("Arial", Font.PLAIN, 18));
		
		adultButton.setBackground(null);
		adultButton.setForeground(Color.WHITE);
		adultButton.setFocusable(false);
		adultButton.setFont(new Font("Arial", Font.PLAIN, 18));
		adultButton.setSelected(true);
		
		ButtonGroup ageRangeGroup = new ButtonGroup();
		ageRangeGroup.add(childButton);
		ageRangeGroup.add(teenageButton);
		ageRangeGroup.add(adultButton);
		
		JPanel ageRangePanel = new JPanel();
		ageRangePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		ageRangePanel.setBackground(null);
		ageRangePanel.add(ageRangeText);
		ageRangePanel.add(childButton);
		ageRangePanel.add(teenageButton);
		ageRangePanel.add(adultButton);
		
		//-------------------------------------------------------------------------------------------------------------
		
		//-------------------------------------------- agree block -----------------------------------------------------------------
		
		JCheckBox agreeCheckBox = new JCheckBox();
		agreeCheckBox.setText("Do You Agree");
		agreeCheckBox.setBackground(null);
		agreeCheckBox.setForeground(Color.RED);
		agreeCheckBox.setFont(new Font("Arial", Font.BOLD, 30));
		agreeCheckBox.setFocusable(false);
		
		JPanel agreePanel = new JPanel();
		agreePanel.setBackground(null);
		agreePanel.add(agreeCheckBox);
		
		//-------------------------------------------------------------------------------------------------------------		
		
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new GridLayout(3, 1, 0, 10));
		topPanel.setPreferredSize(new Dimension(500, 200));
		topPanel.setBackground(null);
		topPanel.add(genderPanel);
		topPanel.add(ageRangePanel);
		topPanel.add(agreePanel);
		frame.add(topPanel, BorderLayout.NORTH);
		
		//-------------------------------------------- action listener block -----------------------------------------------------------------
		agreeCheckBox.addActionListener(e -> agreeOption = agreeCheckBox.isSelected());
		submitButton.addActionListener(e -> {	if(agreeOption) {
													genderOption = maleButton.isSelected() ? 	"male" : 
																								femaleButton.isSelected() ? "female" : "other";
													ageRangeOption = childButton.isSelected() ?	"child" : 
																								teenageButton.isSelected() ? "teenage" : "adult";
													JOptionPane.showConfirmDialog(frame, "Hello user, your gender is " + genderOption
																				+ " and your age range is " + ageRangeOption, "OPTIONS", JOptionPane.OK_CANCEL_OPTION);
												}else {
													JOptionPane.showMessageDialog(frame, "Sorry, you've to agree to continue!!!",
																				"YOU HAVE TO AGREE", JOptionPane.ERROR_MESSAGE);
												}
												
									});
		//-------------------------------------------------------------------------------------------------------------
		
		frame.pack();
		frame.setVisible(true);
	}
}