package Frames;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Frames.AdminLoginFrame;

public class AdminSelectFrame extends JFrame {
	JButton b1,b2,b3,b4,b5,b6,b7,b8, b9, viewProfile;
	JPanel j1, plus, edit, delete, deleteTest, deleteQuestion;
	public AdminSelectFrame(Admin a) {
		super("AdminSelectFrame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,500);
		JLabel Background = new JLabel(new ImageIcon(new ImageIcon("E:\\Project\\5916.jpg").getImage().getScaledInstance(800, 500, Image.SCALE_SMOOTH)));
		add(Background);
		setLocationRelativeTo(null);
		
		
		setLayout(null);
		Background.setBounds(0, 0, 800, 500);
		setUndecorated(true);
		
		b1 = new JButton("Add Test");
		b2 = new JButton("Edit Test");
		b9 = new JButton("View Students");

		
		b1.setBorderPainted(false); 
        b1.setContentAreaFilled(false); 
        b1.setFocusPainted(false); 
        b1.setOpaque(false);
        b1.setForeground(Color.WHITE);
        b1.setRolloverIcon(new ImageIcon(new ImageIcon("E:\\Project\\smartphone (1).png").getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH)));
        b1.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\smartphone.png").getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH)));
        b1.setVerticalTextPosition(JButton.BOTTOM);
        b1.setHorizontalTextPosition(JButton.CENTER);
        
        b2.setBorderPainted(false); 
        b2.setContentAreaFilled(false); 
        b2.setFocusPainted(false); 
        b2.setOpaque(false);
        b2.setForeground(Color.white);
        b2.setRolloverIcon(new ImageIcon(new ImageIcon("E:\\Project\\edit.png").getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH)));
        b2.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\document.png").getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH)));
        b2.setVerticalTextPosition(JButton.BOTTOM);
        b2.setHorizontalTextPosition(JButton.CENTER);
        
        b9.setBorderPainted(false); 
        b9.setContentAreaFilled(false); 
        b9.setFocusPainted(false); 
        b9.setOpaque(false);
        b9.setForeground(Color.white);
        b9.setRolloverIcon(new ImageIcon(new ImageIcon("E:\\Project\\eye (1).png").getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH)));
        b9.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\eye.png").getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH)));
        b9.setVerticalTextPosition(JButton.BOTTOM);
        b9.setHorizontalTextPosition(JButton.CENTER);
        
        b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//AdminSelectFrame.this.dispose();
				new CreateTestFrame(null, a);
			}
		});
        
        b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				b4.setVisible(true);
				b5.setVisible(true);
				b6.setVisible(true);
				
			}
		});
        
        b9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new SelectStudent();
				
			}
		});
        
        j1 = new JPanel(new FlowLayout()); 

        j1.setBounds(70, 150, 700, 500);
        j1.setOpaque(false);
        j1.add(b9); j1.add(b1); j1.add(b2);
        Background.add(j1);
        
        b3 = new JButton();
        b3.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\cancel.png").getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH)));
		b3.setBorderPainted(false); 
        b3.setContentAreaFilled(false); 
        b3.setFocusPainted(false); 
        b3.setOpaque(false);
        
        JPanel close = new JPanel();
        close.add(b3);
		close.setOpaque(false);
		close.setBounds(730,10, 50, 50);
		Background.add(close);
			
        b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AdminSelectFrame.this.dispose();
			}
		});
        
    	b4 = new JButton("Add Question");
    	b4.setBorderPainted(false); 
        b4.setContentAreaFilled(false); 
        b4.setFocusPainted(false); 
        b4.setOpaque(false);
        b4.setForeground(Color.white);
        b4.setRolloverIcon(new ImageIcon(new ImageIcon("E:\\Project\\plus (1).png").getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH)));
        b4.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\plus.png").getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH)));
        b4.setVerticalTextPosition(JButton.BOTTOM);
        b4.setHorizontalTextPosition(JButton.CENTER);
        b4.setVisible(false);
        
        plus = new JPanel(new FlowLayout());
        plus.add(b4);
        plus.setOpaque(false);
		plus.setBounds(690,150, 80, 80);
		Background.add(plus);
		
		b5 = new JButton("Edit Question");
		b5.setBorderPainted(false); 
        b5.setContentAreaFilled(false); 
        b5.setFocusPainted(false); 
        b5.setOpaque(false);
        b5.setForeground(Color.white);
        b5.setRolloverIcon(new ImageIcon(new ImageIcon("E:\\Project\\test1.png").getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH)));
        b5.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\test.png").getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH)));
        b5.setVerticalTextPosition(JButton.BOTTOM);
        b5.setHorizontalTextPosition(JButton.CENTER);
        b5.setVisible(false);
        
        edit = new JPanel(new FlowLayout());
        edit.add(b5);
        edit.setOpaque(false);
		edit.setBounds(690,240, 80, 80);
		Background.add(edit);
		
		
		b6 = new JButton("Delete");
		b6.setBorderPainted(false); 
        b6.setContentAreaFilled(false); 
        b6.setFocusPainted(false); 
        b6.setOpaque(false);
        b6.setForeground(Color.white);
        b6.setRolloverIcon(new ImageIcon(new ImageIcon("E:\\Project\\trash (1).png").getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH)));
        b6.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\trash.png").getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH)));
        b6.setVerticalTextPosition(JButton.BOTTOM);
        b6.setHorizontalTextPosition(JButton.CENTER);
        b6.setVisible(false);
        
        delete = new JPanel(new FlowLayout());
        delete.add(b6);
        delete.setOpaque(false);
		delete.setBounds(630,70, 90, 80);
		Background.add(delete);
      
        b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new SelectTest(HelperClass.readAllData(),a);
			}
		});
        
        b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				new ModifyQuestionFrame(HelperClass.readAllData());
				
			}
		});
        
        b6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				b7.setVisible(true);
				b8.setVisible(true);
				
			}
		});
        
        b7 = new JButton("Delete Test");
     	b7.setBorderPainted(false); 
	     b7.setContentAreaFilled(false); 
	     b7.setFocusPainted(false); 
	     b7.setOpaque(false);
	     b7.setForeground(Color.white);
	     b7.setRolloverIcon(new ImageIcon(new ImageIcon("E:\\Project\\file (1).png").getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH)));
	     b7.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\file.png").getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH)));
	     b7.setVerticalTextPosition(JButton.BOTTOM);
	     b7.setHorizontalTextPosition(JButton.CENTER);
	     b7.setVisible(false);
	     
	     deleteTest = new JPanel(new FlowLayout());
	     deleteTest.add(b7);
	     deleteTest.setOpaque(false);
 		deleteTest.setBounds(700,75, 90, 80);
 		Background.add(deleteTest);
     		
     		b8 = new JButton("Delete Question");
     		b8.setBorderPainted(false); 
             b8.setContentAreaFilled(false); 
             b8.setFocusPainted(false); 
             b8.setOpaque(false);
             b8.setForeground(Color.white);
             b8.setRolloverIcon(new ImageIcon(new ImageIcon("E:\\Project\\question (1).png").getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH)));
             b8.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\question.png").getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH)));
             b8.setVerticalTextPosition(JButton.BOTTOM);
             b8.setHorizontalTextPosition(JButton.CENTER);
             b8.setVisible(false);
             
             deleteQuestion = new JPanel(new FlowLayout());
             deleteQuestion.add(b8);
             deleteQuestion.setOpaque(false);
     		deleteQuestion.setBounds(550,70, 90, 80);
     		Background.add(deleteQuestion);
             
     		b7.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new DeleteTestFrame(HelperClass.readAllData());
				}
			});
     		
     		b8.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new DeleteQuestionFrame(HelperClass.readAllData());
					
				}
			});
     		
     		viewProfile = new JButton("View Profile"); 
    	    viewProfile.setBorderPainted(false); 
            viewProfile.setContentAreaFilled(false); 
            viewProfile.setFocusPainted(false); 
            viewProfile.setOpaque(false);
            viewProfile.setForeground(Color.white);
            viewProfile.setRolloverIcon(new ImageIcon(new ImageIcon("E:\\Project\\man (1).png").getImage().getScaledInstance(35,35, Image.SCALE_SMOOTH)));
            viewProfile.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\man.png").getImage().getScaledInstance(35,35, Image.SCALE_SMOOTH)));
            viewProfile.setVerticalTextPosition(JButton.BOTTOM);
            viewProfile.setHorizontalTextPosition(JButton.CENTER);
            
            JPanel p1 = new JPanel(new FlowLayout());
            p1.add(viewProfile);
    		p1.setOpaque(false);
    		p1.setBounds(630,10, 100, 70);
    		Background.add(p1);
    		
    		viewProfile.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new AdminProfile(a);
					
				}
			});
     		
     		
     		
     setVisible(true);

}
	public static void main(String[] args) {
		Admin a = new Admin();
		new AdminSelectFrame(a);
	}
}
