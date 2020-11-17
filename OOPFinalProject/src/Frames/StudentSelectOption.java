package Frames;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StudentSelectOption extends JFrame{
	JButton logout, viewHistory, takeTest, b3, b9, delete;
	public StudentSelectOption(Student s) {
		super("StudentSelectOptionFrame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(750,500);
		JLabel Background = new JLabel(new ImageIcon(new ImageIcon("E:\\Project\\5916.jpg").getImage().getScaledInstance(750, 500, Image.SCALE_SMOOTH)));
		add(Background);
		setLocationRelativeTo(null);
		
		
		setLayout(null);
		Background.setBounds(0, 0, 750, 500);
		setUndecorated(true);
		
		viewHistory = new JButton("View History");
		takeTest = new JButton("Take Test");
		b9 = new JButton("View Profile");
		
		viewHistory.setBorderPainted(false); 
        viewHistory.setContentAreaFilled(false); 
        viewHistory.setFocusPainted(false); 
        viewHistory.setOpaque(false);
        viewHistory.setForeground(Color.WHITE);
        viewHistory.setRolloverIcon(new ImageIcon(new ImageIcon("E:\\Project\\archive (1).png").getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH)));
        viewHistory.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\archive.png").getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH)));
        viewHistory.setVerticalTextPosition(JButton.BOTTOM);
        viewHistory.setHorizontalTextPosition(JButton.CENTER);
        
        viewHistory.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new ResultFrame(s);
			}
		});
        
        takeTest.setBorderPainted(false); 
        takeTest.setContentAreaFilled(false); 
        takeTest.setFocusPainted(false); 
        takeTest.setOpaque(false);
        takeTest.setForeground(Color.white);
        takeTest.setRolloverIcon(new ImageIcon(new ImageIcon("E:\\Project\\checklist (1).png").getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH)));
        takeTest.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\checklist.png").getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH)));
        takeTest.setVerticalTextPosition(JButton.BOTTOM);
        takeTest.setHorizontalTextPosition(JButton.CENTER);
        takeTest.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new StudentSelectTestFrame(s);
				//StudentSelectOption.this.dispose();
			}
		});
        
        b9.setBorderPainted(false); 
        b9.setContentAreaFilled(false); 
        b9.setFocusPainted(false); 
        b9.setOpaque(false);
        b9.setForeground(Color.white);
        b9.setRolloverIcon(new ImageIcon(new ImageIcon("E:\\Project\\eye (1).png").getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH)));
        b9.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\eye.png").getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH)));
        b9.setVerticalTextPosition(JButton.BOTTOM);
        b9.setHorizontalTextPosition(JButton.CENTER);
        
        b9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new StudentProfile(s);
				
			}
		});
        
        JPanel j1 = new JPanel(new FlowLayout()); 

        j1.setBounds(80, 150, 600,500);
        j1.setOpaque(false);
        j1.add(viewHistory); j1.add(takeTest); j1.add(b9);
        Background.add(j1);
		
		b3 = new JButton();
	    b3.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\cancel.png").getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH)));
	    b3.setBorderPainted(false); 
	    b3.setContentAreaFilled(false); 
	    b3.setFocusPainted(false); 
	    b3.setOpaque(false);
	        
	    logout = new JButton("Logout"); 
	    logout.setBorderPainted(false); 
        logout.setContentAreaFilled(false); 
        logout.setFocusPainted(false); 
        logout.setOpaque(false);
        logout.setForeground(Color.white);
        logout.setRolloverIcon(new ImageIcon(new ImageIcon("E:\\Project\\logout (1).png").getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH)));
        logout.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\logout.png").getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH)));
        logout.setVerticalTextPosition(JButton.BOTTOM);
        logout.setHorizontalTextPosition(JButton.CENTER);
        
        delete = new JButton("Delete Profile"); 
	    delete.setBorderPainted(false); 
        delete.setContentAreaFilled(false); 
        delete.setFocusPainted(false); 
        delete.setOpaque(false);
        delete.setForeground(Color.white);
        delete.setRolloverIcon(new ImageIcon(new ImageIcon("E:\\Project\\trash (1).png").getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH)));
        delete.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\trash.png").getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH)));
        delete.setVerticalTextPosition(JButton.BOTTOM);
        delete.setHorizontalTextPosition(JButton.CENTER);
	     
        JPanel close = new JPanel();
        close.add(b3);
		close.setOpaque(false);
		close.setBounds(680,10, 50, 50);
		Background.add(close);
		
		JPanel p1 = new JPanel(new FlowLayout());
        p1.add(logout); p1.add(delete);
		p1.setOpaque(false);
		p1.setBounds(480,10, 200, 60);
		Background.add(p1);
		
		logout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StudentSelectOption.this.dispose();
				new UserLoginFrame();
				
			}
		});
		
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<Student> studs = StudentHelperClass.readAllData();
				for(int i=0; i<studs.size();i++) {
					if(s.getUsername().equals(studs.get(i).getUsername()))
						studs.remove(i);
				}
				StudentHelperClass.writeToFile(studs);
				StudentSelectOption.this.dispose();
				new UserLoginFrame();
				
			}
		});
		
        b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				StudentSelectOption.this.dispose();
			}
		});
        
        setVisible(true);
		
	}
	
	public static void main(String[] args) {
		//ArrayList<Student> studs = StudentHelperClass.readAllData();
		Student s = new Student();
		new StudentSelectOption(s);
	}

	
}