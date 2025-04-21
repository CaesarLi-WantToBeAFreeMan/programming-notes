/*
 * Lesson fifty: JComboBox
 * Date: July 7, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class Main {
	private static String countryOption;
	public static void main(String[] args) {
		//JComboBox:	A component that combines a button or editable field and a drop-down list
		
		//methods:
		//i.	void addItem(Object item)
		//			add the item to the item list
		//ii.	insertItemAt(Object item, int index)
		//			insert the item to the No.index position
		
		//iii.	void removeItem(Object item)
		//			delete the item to the item list
		//iv.	void removeAllItems()
		//			remove all the items from the list
		//		void removeIntemAt(int index)
		//			remove the No.index item from the list
		
		//v.	void setEditable(boolean status)
		//			determine whether the JComboBox is editable
		//vi.	setSelectedIndex(int index)
		//			set the No.index item to be selected
		
		JFrame frame = new JFrame("Carsar's first JComboBox window");
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel 	topPanel = new JPanel(),
				bottomPanel = new JPanel();
		
		topPanel.setBackground(null);
		bottomPanel.setBackground(null);
		
		JLabel countriesText = new JLabel("country:");
		countriesText.setBackground(null);
		countriesText.setForeground(Color.WHITE);
		countriesText.setFont(new Font("Arial", Font.PLAIN, 21));
		topPanel.add(countriesText);
		
		String countries[] = {	"Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra",
								"Angola", "Auguilla", "Antigua and Barbuda", "Angentina", "Armenia",
								"Aruba", "Australia", "Austria", "Azerbaijan",
								"Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus",
								"Belgium", "Belize", "Benin", "Bermuda", "Bhutan",
								"Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei Darussalam",
								"Bulgaria", "Burkina Faso", "Burundi",
								"Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands",
								"Central African Republic", "Chad", "Chile", "China", "Christmas Island",
								"Cocos (Keeling) Islands", "Colombia", "Comoros", "Democratic Republic of the Congo (Kinshasa)", "Congo, Republic of (Brazzaville)",
								"Cook Islands", "Costa Rica", "Croatia", "Cuba", "Cyprus",
								"Czech Republic",
								"Denamark", "Djibouti", "Dominica", "Diminican Republic",
								"East Timor", "Ecuador", "Egypt", "EI Salador", "Equatorial Guinea",
								"Eritrea", "Estonia", "Ethiopia",
								"Falkland Islands", "Faroe Islands", "Fiji", "Finland", "France",
								"French Guiana", "French Polynesia", "French Southern Territories", 
								"Gabon", "The Gambia", "Georgia", "Germany", "Ghana",
								"Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe",
								"Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana",
								"Haiti", "Holy See", "Honduras", "Hungary",
								"Iceland", "India", "Indonesia", "Iran", "Iraq", 
								"Ireland", "Israel", "Italy", "Ivory Coast",
								"Jamaica", "Japan", "Jordan",
								"Kazakhstan", "Kenya", "Kiribati", "Korea, Democratic People's Rep. (North Korea)", "Korea, Republic of (South Korea)",
								"Kosovo", "Kuwait", "Kyrgyzstan",
								"Lao, People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia",
								"Libya", "Liechtenstein", "Lithuania", "Luxembourg",
								"Madagascar", "Malawi", "Malaysia", "Maldives", "Mali",
								"Malta", "Marshall Islands", "Martinique", "Mauritius", "Mayotte",
								"Mexico", "Microbesia, Federal States of", "Moldova, Republic of", "Monaco", "Mongolia",
								"Montenegro", "Montserrat", "Morocco", "Mozambique", "Myanmar, Burma",
								"Namibia", "Nauru", "Nepal", "Netherlands", "New Caledonia",
								"New zealand", "Nicaragua", "Niger", "Nigeria", "Niue",
								"North Macedonia", "Northern Mariana Islands", "Norway",
								"Oman",
								"Pakistan", "Palau", "Palestinian territories", "Panama", "Papua New Guinea",
								"Paragury", "Peru", "Philippines", "Pitcairn Island", "Poland",
								"Portugal", "Puerto Rico",
								"Qatar",
								"Reunion Island", "Romania", "Russian Federation", "Rwanda",
								"Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino",
								"Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles",
								"Sierra Leone", "Singapore", "Slovakia (Slovak Republic)", "Slovenia", "Solomon Islands",
								"Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka",
								"Sudan", "Suriname", "Swaziland (Eswatini)", "Sweden", "Switzerland",
								"Syria, Syrian Arab Republic",
								"Taiwan (Republic Of China)", "Tajikistan", "Tanzania, officially the United Republic of Tanzania", "Thailand", "Tibet",
								"Timor-Leste (East Timor)", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago",
								"Tunisia", "Turkey", "Turkmenistan", "Tuvalu",
								"Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States",
								"Uruguay", "Uzbekistan",
								"Vanuatu", "Vatican City State (Holy See)", "Venezuela", "Viernam", "Virgin Islands (British)",
								"Virgin Islands (U.S.)",
								"Wallis and Futuna Islands", "Western Sahara",
								"Yemen",
								"Zambia", "Zimbabwe"};
		JComboBox countriesList = new JComboBox(countries);
		countriesList.setSelectedIndex(0);
		countriesList.setBackground(Color.BLACK);
		countriesList.setForeground(Color.WHITE);
		countriesList.setFont(new Font("Arial", Font.BOLD, 15));
		topPanel.add(countriesList);
		
		JButton submitButton = new JButton("submit");
		submitButton.setBackground(null);
		submitButton.setForeground(Color.PINK);
		submitButton.setFont(new Font("Cooper Black", Font.BOLD, 21));
		submitButton.setFocusable(false);
		bottomPanel.add(submitButton);
		
		submitButton.addActionListener(e -> {	countryOption = (String) countriesList.getSelectedItem();
												JOptionPane.showMessageDialog(frame, "You Came From " + countryOption, "YOUR BORN COUNTRY", JOptionPane.OK_CANCEL_OPTION);
											});
		
		frame.add(topPanel, BorderLayout.NORTH);
		frame.add(bottomPanel, BorderLayout.SOUTH);
		
		
		frame.pack();
		frame.setVisible(true);
	}
}