package Frames;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.Border;

public class CreateTestFrame extends JFrame {
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField j1,j2,j3,j4,j5;
	JButton b1,close,b4;
	
	public CreateTestFrame(Test t, Admin a) {
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel Background = new JLabel(new ImageIcon(new ImageIcon("E:\\Project\\errorbg.jpg").getImage().getScaledInstance(750, 500, Image.SCALE_SMOOTH)));
		add(Background);
		setLocationRelativeTo(null);
		Background.setBounds(0, 0, 600, 300);
		setUndecorated(true);
		
		
		b1 = new JButton();
		b1.setBorderPainted(false); 
        b1.setContentAreaFilled(false); 
        b1.setFocusPainted(false); 
        b1.setOpaque(false);
		b1.setRolloverIcon(new ImageIcon(new ImageIcon("E:\\Project\\submit (1).png").getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH)));
	    b1.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\submit.png").getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH)));
		JPanel p1 = new  JPanel();
		p1.setOpaque(false);
		p1.add(b1);
		p1.setBounds(190, 200, 100, 100);
		Background.add(p1);
		b1.setEnabled(false);
		
        b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				ArrayList<Test> t1 = new ArrayList<Test>();
				t1 = HelperClass.readAllData();
				for (int x = 0 ; x < t1.size() ; x++) {
					if (t1.get(x).getTestName().equalsIgnoreCase(t.getTestName())) {
						t1.remove(x);
						break;
					}
				}
				
				
				ArrayList<Admin> admins = AdminHelperClass.readAllData();
				
				
				for(int i=0; i<admins.size();i++) {
					if(admins.get(i).getFirstName().equals(a.getFirstName())) {
//						for(int j=0; j<admins.get(i).getTestsCreated().size(); j++) {
//							if(t.getTestName().equalsIgnoreCase(admins.get(i).getTestsCreated().get(j)));
//								admins.get(i).getTestsCreated().remove(j);
//						}
						admins.get(i).getTestsCreated().add(t.getTestName());
						break;
					}			
				}
				
				AdminHelperClass.writeToFile(admins);
				
				t1.add(t);
				HelperClass.addArrayListToFile(t1);	
				CreateTestFrame.this.dispose();
			}
		});
		
		close = new JButton();
		close.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\error.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
		JPanel p2 = new JPanel();
		p2.add(close);
		p2.setBounds(315, 10, 100, 100);
		p2.setOpaque(false);
		close.setBorderPainted(false); 
        close.setContentAreaFilled(false); 
        close.setFocusPainted(false); 
        close.setOpaque(false);
		Background.add(p2);
		
		
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				CreateTestFrame.this.dispose();
			}
		});
		
		
		
		JPanel p3 = new JPanel();
		l1 = new JLabel("Test Name");
		l2 = new JLabel("Test Time");
		l3 = new JLabel("min");
		l4 = new JLabel("Total Questions");
		l5 = new JLabel("Total Marks");
		
		l1.setForeground(Color.white);
		l2.setForeground(Color.white);
		l3.setForeground(Color.white);
		l4.setForeground(Color.white);
		l5.setForeground(Color.white);
		j1 = new JTextField(12);
		j2 = new JTextField(12);
		j3 = new JTextField(12);
		j4 = new JTextField(12);
		j1.setFont(new Font("Times New Roman",Font.PLAIN,13));
		j1.setOpaque(true);
		Border bord = BorderFactory.createLineBorder(Color.WHITE, 2,true);
		j1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.BLACK));
		j1.setBorder(bord);
		p3.add(l1);
		p3.add(j1);
		p3.setBounds(70, 70, 200, 100);
		p3.setOpaque(false);
		Background.add(p3);
		j2.setFont(new Font("Times New Roman",Font.PLAIN,13));
		j2.setOpaque(true);
		j2.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.BLACK));
		j2.setBorder(bord);
		
		JPanel p4 = new JPanel();
		p4.setOpaque(false);
		p4.add(l2);
		p4.add(j2);
		p4.add(l3);
		p4.setBounds(78, 100, 217, 100);
		Background.add(p4);
	
		p3.setOpaque(false);
		
		JPanel p5 = new JPanel();
		p5.add(l4);
		p5.add(j3);
		j3.setFont(new Font("Times New Roman",Font.PLAIN,13));
		j3.setOpaque(true);
		j3.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.BLACK));
		j3.setBorder(bord);
		p5.setBounds(37,130,240,100);
		p5.setOpaque(false);
		Background.add(p5);
		
		JPanel p6 = new JPanel();
		p6.add(l5);
		p6.add(j4);
		j4.setFont(new Font("Times New Roman",Font.PLAIN,13));
		j4.setOpaque(true);
		j4.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.BLACK));
		j4.setBorder(bord);
		p6.setBounds(47,160,240,100);
		p6.setOpaque(false);
		Background.add(p6);


		b4 = new JButton("Add Question");
		b4.setBorderPainted(false); 
        b4.setContentAreaFilled(false); 
        b4.setFocusPainted(false); 
        b4.setOpaque(false);
        b4.setForeground(Color.white);
        b4.setRolloverIcon(new ImageIcon(new ImageIcon("E:\\Project\\plus (1).png").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
        b4.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\plus.png").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
        b4.setVerticalTextPosition(JButton.BOTTOM);
        b4.setHorizontalTextPosition(JButton.CENTER);
         
        
        JPanel p7 = new JPanel();
        p7.add(b4);
        p7.setBounds(75, 190, 160, 160);
        p7.setOpaque(false);
        Background.add(p7);
        j2.setEnabled(false);
        j3.setEnabled(false);
        j4.setEnabled(false);
        
        b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
		        Question q = new Question();
		        ArrayList<Question> q1 = new ArrayList<Question>();
		        q1.add(q);
		        
		        Test t1 = new Test(j1.getText(),null,0,q1);
		        
		        
		        new AddQuestionFrame(t1,a);
		        CreateTestFrame.this.dispose();
		       
			}
		});
        

		
        
		
		setVisible(true);
	}
	public static void main(String[] args) {
		Admin a = new Admin();
		new CreateTestFrame(null,a);
	}
}
