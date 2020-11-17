package Frames;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AdminProfile extends JFrame{
	
	public AdminProfile(Admin a) {
		setSize(700, 500);
        JLabel background = new JLabel(new ImageIcon(new ImageIcon("E:\\Project\\errorbg.jpg").getImage().getScaledInstance(700, 500, Image.SCALE_SMOOTH)));
        add(background);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        background.setBounds(0, 0, 700,500);
        setUndecorated(true);
        
        JLabel l1 = new JLabel(a.getFirstName()+" "+a.getLastName());
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 60));
        
        JLabel l2 = new JLabel("Username: "+a.getUsername());
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        
        JLabel l3 = new JLabel("Email: "+a.getEmail());
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        
        JLabel l4 = new JLabel("Phone number: "+a.getPhoneNo());
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        
        JLabel l5 = new JLabel("Gender: "+a.getGender());
        l5.setForeground(Color.WHITE);
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        
        JLabel l6 = new JLabel("D.O.B: "+a.getDob());
        l6.setForeground(Color.WHITE);
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 30));

        JButton done = new JButton("Done");
        JButton viewTestNames = new JButton("View Tests Created");
        
        viewTestNames.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String testNames = "";
				for(int i=0; i<a.getTestsCreated().size(); i++) {
					testNames = testNames + " \n" + a.getTestsCreated().get(i);
					System.out.println(a.getTestsCreated().get(i));
				}
				JOptionPane.showMessageDialog(null, testNames );
				
			}
		});
        
        done.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AdminProfile.this.dispose();
				
			}
		});
        
        
        
        JPanel p1 = new JPanel();
        p1.setLayout(new GridBagLayout());
        background.add(p1);
        
    	GridBagConstraints c = new GridBagConstraints();
    	c.insets = new Insets(10,10,10,10);
        
    	c.gridx=0; c.gridy = 0;
    	p1.add(l1,c);
    	
    	c.gridx=0; c.gridy = 1;
    	p1.add(l2,c);
    	
    	c.gridx=0; c.gridy = 2;
    	p1.add(l3,c);
    	
    	c.gridx=0; c.gridy = 3;
    	p1.add(l4,c);
    	
    	c.gridx=0; c.gridy = 4;
    	p1.add(l5,c);
    	
    	c.gridx=0; c.gridy = 5;
    	p1.add(l6,c);
    	
    	p1.setBounds(50, 5, 600, 450);
		p1.setOpaque(false);
		background.add(p1);
		
		JPanel p2 = new JPanel(new FlowLayout());
		p2.setOpaque(false);
		p2.add(viewTestNames); p2.add(done);
		p2.setBounds(200, 430, 300, 30);
		background.add(p2);
		
		
		JPanel close = new JPanel(new FlowLayout());
		JButton b3 = new JButton();
		b3.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\cancel.png").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
		 b3.setBorderPainted(false); 
	        b3.setContentAreaFilled(false); 
	        b3.setFocusPainted(false); 
	        b3.setOpaque(false);
		close.add(b3);
		close.setOpaque(false);
		close.setBounds(630,10, 50, 50);
		background.add(close);
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AdminProfile.this.dispose();
			}
		});
		
		setVisible(true);
	
	
	}
	public static void main(String[] args) {
		ArrayList<Admin> admins = AdminHelperClass.readAllData();
		new AdminProfile(admins.get(0));
	}

}
