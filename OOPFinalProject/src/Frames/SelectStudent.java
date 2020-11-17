package Frames;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SelectStudent extends JFrame{
	ArrayList<Student> students = new ArrayList<Student>();
	public SelectStudent() {
		setSize(400,200);
		JComboBox c1 = new  JComboBox();
		JLabel background = new JLabel(new ImageIcon(new ImageIcon("E:\\Project\\registerbg2.jpg").getImage().getScaledInstance(400, 200, Image.SCALE_SMOOTH)));
        add(background);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        background.setBounds(0, 0, 400,200);
        setUndecorated(true);
        
        
        students = StudentHelperClass.readAllData();
        for(int i=0; i<students.size(); i++)
        	c1.addItem(students.get(i).getUsername());
        
        JLabel l1 = new JLabel("Select Student:  ");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        
        JPanel p1 = new JPanel(new FlowLayout());
        p1.setOpaque(false);
        p1.setBounds(50, 60, 300, 80);
        background.add(p1);
        p1.add(l1); p1.add(c1);
        
        JButton b1 = new JButton("View");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        
        JPanel p2 = new JPanel(new FlowLayout());
        p2.setOpaque(false);
        p2.setBounds(50, 120, 300, 80);
        background.add(p2);
        p2.add(b1);
        
        b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = c1.getSelectedItem().toString();
				
				boolean found = false;
				for(int i=0; i<students.size(); i++) {
					if(students.get(i).getUsername().equals(username)) 
						new StudentProfile(students.get(i));		
				}
			}
		});
        
        
        
        JPanel close = new JPanel(new FlowLayout());
		JButton b3 = new JButton();
		b3.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\cancel.png").getImage().getScaledInstance(25,25, Image.SCALE_SMOOTH)));
		b3.setBorderPainted(false); 
        b3.setContentAreaFilled(false); 
        b3.setFocusPainted(false); 
        b3.setOpaque(false);
		close.add(b3);
		close.setOpaque(false);
		close.setBounds(340,10, 50, 50);
		background.add(close);
	
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SelectStudent.this.dispose();
				
			}
		});
		
		setVisible(true);
	}
	
public static void main(String [] args) { 
		
		new SelectStudent();

	}
}
