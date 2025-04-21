import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame{
	private JButton likeButton = new JButton("like"),
					hateButton = new JButton("hate"),
					skitButton = new JButton("skip");
	private JLabel info = new JLabel();
	
	UI(){
		this.getContentPane().setBackground(Color.BLACK);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		
		info.setBounds(100, 300, 200, 50);
		info.setBackground(Color.DARK_GRAY);
		info.setForeground(Color.PINK);
		info.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		this.add(info);
		
		likeButton.setBounds(50, 50, 100, 100);
		likeButton.setBackground(Color.LIGHT_GRAY);
		likeButton.setForeground(Color.CYAN);
		likeButton.setFont(new Font("Arial", Font.BOLD, 18));
		likeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				info.setText("You like it");
			}
		});
		this.add(likeButton);
		
		hateButton.setBounds(150, 50, 100, 100);
		hateButton.setBackground(Color.LIGHT_GRAY);
		hateButton.setForeground(Color.CYAN);
		hateButton.setFont(new Font("Arial", Font.BOLD, 18));
		hateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				info.setText("You hate it");
			}
		});
		this.add(hateButton);
		
		skitButton.setBounds(250, 50, 100, 100);
		skitButton.setBackground(Color.LIGHT_GRAY);
		skitButton.setForeground(Color.CYAN);
		skitButton.setFont(new Font("Arial", Font.BOLD, 18));
		skitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				info.setText("You skit it");
			}
		});
		this.add(skitButton);
		
		this.setVisible(true);
	}
}