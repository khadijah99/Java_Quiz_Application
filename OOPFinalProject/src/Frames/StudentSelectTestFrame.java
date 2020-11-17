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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StudentSelectTestFrame extends JFrame{
	
	ArrayList<Test> tests = new ArrayList<Test>();
	String testNames[];
	JLabel l1, l2, l3, l33, l4, l44, l5, l55, l6, l66;
	JPanel p1, p2, p3, p4;
	JButton start, cancel, b3;
	 
	
	public StudentSelectTestFrame(Student s) {
		
		setSize(700, 500);
        JLabel background = new JLabel(new ImageIcon(new ImageIcon("E:\\Project\\errorbg.jpg").getImage().getScaledInstance(700, 500, Image.SCALE_SMOOTH)));
        add(background);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        background.setBounds(0, 0, 700,500);
        setUndecorated(true);
        
        l1 = new JLabel("Select Test");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 60));
        p1  = new JPanel(new FlowLayout());
        p1.setBounds(100, 20, 500, 500);
        p1.setOpaque(false);
        p1.add(l1); 
        background.add(p1); 
        
		l2 = new JLabel("Test name: ");
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		tests = HelperClass.readAllData();
		testNames = new String[tests.size()];
		for(int i=0; i<tests.size(); i++) {
			testNames[i] = tests.get(i).getTestName();
		}
		JComboBox<String> names = new JComboBox<String>(testNames);
          
        p2  = new JPanel(new FlowLayout(0, 17, 0));
        p2.setBounds(240, 120, 500, 500);
        p2.setOpaque(false);
        p2.add(l2); p2.add(names); 
        background.add(p2);
        
        names.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = names.getSelectedItem().toString();
				for(int i=0; i<tests.size(); i++) {
					if(tests.get(i).getTestName().equalsIgnoreCase(s)) {
						l33.setText(tests.get(i).getTotalTime()+" ");
						l44.setText(tests.get(i).getTotalMarks()+" ");
						l55.setText((tests.get(i).getTotalQuestions()-1)+" ");
						l66.setText(tests.get(i).calDifficulty());
					}
				}
				
			}
		});
        
        p3 = new JPanel(new GridBagLayout());
        p3.setBounds(0,90, 700, 400);
 		p3.setOpaque(false);
 		background.add(p3);
        
 		GridBagConstraints c = new GridBagConstraints();
    	c.insets = new Insets(10,10,10,10);
    	
    	l3 = new JLabel("Time allowed: "); l33 = new JLabel();
    	l3.setForeground(Color.WHITE); l33.setForeground(Color.WHITE);
    	l3.setFont(new Font("Times New Roman", Font.PLAIN, 30)); l33.setFont(new Font("Times New Roman", Font.PLAIN, 30));
    	
    	c.gridx = 0; c.gridy= 0;
    	p3.add(l3, c); 
    	c.gridx = 1; c.gridy= 0;
    	p3.add(l33, c);
    	
    	l4 = new JLabel("Total Marks: "); l44 = new JLabel();
    	l4.setForeground(Color.WHITE); l44.setForeground(Color.WHITE);
    	l4.setFont(new Font("Times New Roman", Font.PLAIN, 30)); l44.setFont(new Font("Times New Roman", Font.PLAIN, 30));
    	
    	c.gridx = 0; c.gridy= 1;
    	p3.add(l4, c); 
    	c.gridx = 1; c.gridy= 1;
    	p3.add(l44, c);
    	
    	l5 = new JLabel("No. of Questions: "); l55 = new JLabel();
    	l5.setForeground(Color.WHITE); l55.setForeground(Color.WHITE);
    	l5.setFont(new Font("Times New Roman", Font.PLAIN, 30)); l55.setFont(new Font("Times New Roman", Font.PLAIN, 30));
    	
    	c.gridx = 0; c.gridy= 2;
    	p3.add(l5, c); 
    	c.gridx = 1; c.gridy= 2;
    	p3.add(l55, c);
    	
    	l6 = new JLabel("Difficulty level: "); l66 = new JLabel();
    	l6.setForeground(Color.WHITE); l66.setForeground(Color.WHITE);
    	l6.setFont(new Font("Times New Roman", Font.PLAIN, 30)); l66.setFont(new Font("Times New Roman", Font.PLAIN, 30));
    	
    	c.gridx = 0; c.gridy= 3;
    	p3.add(l6, c); 
    	c.gridx = 1; c.gridy= 3;
    	p3.add(l66, c);
    	
    	cancel  = new JButton("Cancel"); cancel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        start = new JButton("Start Test"); start.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        
        cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StudentSelectTestFrame.this.dispose();
				
			}
		});
        
        
        start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String n = names.getSelectedItem().toString();
				for(int i=0; i<tests.size(); i++) {
					if(tests.get(i).getTestName().equalsIgnoreCase(n)) {
						new QuestionFrame(tests.get(i),1, s);
						break;
					}
				}
			}
		});
        
        
        p4  = new JPanel(new FlowLayout(0, 30, 0));
        p4.setBounds(200, 420, 500, 500);
        p4.setOpaque(false);
        p4.add(cancel); p4.add(start); 
        background.add(p4);
        
        b3 = new JButton();
        b3.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\cancel.png").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
		b3.setBorderPainted(false); 
        b3.setContentAreaFilled(false); 
        b3.setFocusPainted(false); 
        b3.setOpaque(false);
        
        JPanel close = new JPanel();
        close.add(b3);
		close.setOpaque(false);
		close.setBounds(620,10, 70, 70);
		background.add(close);
        
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				StudentSelectTestFrame.this.dispose();
			}
		});
    	
        
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Student s  = new Student();
		new StudentSelectTestFrame(s);
	}

}
