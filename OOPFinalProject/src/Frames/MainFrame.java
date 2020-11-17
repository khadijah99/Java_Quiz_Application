package Frames;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.Border;

public class MainFrame extends JFrame {
	JButton b1,b2,b3;
	public MainFrame() {
		super("Login");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(750,500);
		JLabel Background = new JLabel(new ImageIcon(new ImageIcon("E:\\Project\\5916.jpg").getImage().getScaledInstance(750, 500, Image.SCALE_SMOOTH)));
		add(Background);
		setLocationRelativeTo(null);
		
		
		setLayout(null);
		Background.setBounds(0, 0, 750, 500);
		setUndecorated(true);
		
		b1 = new JButton("Admin Login");
		b2 = new JButton("Student Login");
		

		 b1.setBorderPainted(false); 
	        b1.setContentAreaFilled(false); 
	        b1.setFocusPainted(false); 
	        b1.setOpaque(false);
	        b1.setForeground(Color.WHITE);
	        b1.setRolloverIcon(new ImageIcon(new ImageIcon("E:\\Project\\admin login(1).png").getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH)));
	        b1.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\admin login.png").getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH)));
	        b1.setVerticalTextPosition(JButton.BOTTOM);
	        b1.setHorizontalTextPosition(JButton.CENTER);
	        
	        b1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//MainFrame.this.dispose();
					// TODO Auto-generated method stub
					new AdminLoginFrame();
					
				}
			});
	        
	        b2.setBorderPainted(false); 
	        b2.setContentAreaFilled(false); 
	        b2.setFocusPainted(false); 
	        b2.setOpaque(false);
	        b2.setForeground(Color.white);
	        b2.setRolloverIcon(new ImageIcon(new ImageIcon("E:\\Project\\student.png").getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH)));
	        b2.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\student (1).png").getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH)));
	        b2.setVerticalTextPosition(JButton.BOTTOM);
	        b2.setHorizontalTextPosition(JButton.CENTER);
	        
	        b2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new UserLoginFrame();
					
				}
			});
	        JPanel j1 = new JPanel(new FlowLayout()); 

	        j1.setBounds(125, 150, 500, 500);
	        j1.setOpaque(false);
	        Background.add(j1);
	        
	        b3 = new JButton();
	        b3.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\cancel.png").getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH)));
			 b3.setBorderPainted(false); 
		        b3.setContentAreaFilled(false); 
		        b3.setFocusPainted(false); 
		        b3.setOpaque(false);
		        j1.add(b1); j1.add(b2);
		        JPanel close = new JPanel();
		        close.add(b3);
				close.setOpaque(false);
				close.setBounds(685,10, 50, 50);
				Background.add(close);
	        b3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.exit(0);
				}
			});
	        
	     setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}

}
