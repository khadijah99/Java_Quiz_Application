
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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.*;

public class ModifyQuestionFrame extends JFrame {
	JComboBox c1,c2,c3;
	JButton b1,b2;
	JLabel l1,l2,l3;
	
	public ModifyQuestionFrame(ArrayList<Test> t) {
		setSize(400,200);
		c1 = new  JComboBox();
		c2 = new JComboBox ();
		c3 = new JComboBox ();
		  JLabel background = new JLabel(new ImageIcon(new ImageIcon("E:\\Project\\registerbg2.jpg").getImage().getScaledInstance(400, 200, Image.SCALE_SMOOTH)));
	        add(background);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setLayout(null);
	        setLocationRelativeTo(null);
	        background.setBounds(0, 0, 400,200);
	        javax.swing.border.Border border1 = BorderFactory.createLineBorder(Color.WHITE,2);

		
		for (int x = 0 ; x < t.size() ; x++) {
			c2.addItem(t.get(x).getTestName());
		}
		
		c2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String selected =  c2.getSelectedItem().toString();
				for (int x = 0 ; x < t.size() ; x++) {
					if (t.get(x).getTestName().equalsIgnoreCase(selected)) {
						for (int y = 0 ;  y < t.get(x).questions.size()-1 ; y++) {
							c1.addItem(Integer.toString(y+1));
						
						
					}
						break;
				}
				
				
				
			
			}
			}
		});
		
		
				// TODO Auto-generated method stub
			
	
		
	
		 setUndecorated(true);
	        JPanel p1 = new JPanel();
	        p1.setLayout(new GridBagLayout());
	        background.add(p1);
	        
	    	GridBagConstraints c = new GridBagConstraints();
	    	c.insets = new Insets(10,10,10,10);
	    	
			c.gridx = 0; c.gridy = 0;
			l1 = new JLabel("Select Test");
			l1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			p1.add(l1,c);
			
			c.gridx = 1; c.gridy = 0;
			c2.setBorder(border1);
			c2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			p1.add(c2,c);
			
			c.gridx = 0; c.gridy = 1;
			l2 = new JLabel("Question No");
			l2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			p1.add(l2,c);
			
			c.gridx = 1; c.gridy = 1;
			c1.setBorder(border1);
			c1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			p1.add(c1,c);
			
			
		

			b1= new JButton("     Edit     ");
		
			JPanel p2 = new JPanel();
			p2.add(b1);
			p2.setOpaque(false);
			p2.setBounds(180, 140, 70, 70);
			background.add(p2);
			
			
			
			
			p1.setBounds(30, -70, 300, 300);
			p1.setOpaque(false);
			background.add(p1);

		
	
		
	
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			 try {
				String selected =  c2.getSelectedItem().toString();
				AddQuestionEditFrame a1;
				for (int x = 0 ; x < t.size() ; x++) {
					if (t.get(x).getTestName().equalsIgnoreCase(selected)) {
						
						
					int	 a = Integer.parseInt(c1.getSelectedItem().toString());

						Question q = t.get(x).getQuestions().get(a);
						

						a1= new AddQuestionEditFrame(t.get(x),a);

						a1.t1.setEnabled(true);
						a1.t2.setEnabled(true);
						a1.t3.setEnabled(true);
						a1.t4.setEnabled(true);
						a1.t5.setEnabled(true);
						
						if(q.getQimage()!=null)
							a1.image.setSelected(true);
						
						if(q.isOptionIsText()==true)
							a1.text1.setSelected(true);
						else a1.image1.setSelected(true);
						
						
						a1.option.setSelectedIndex(q.getCorrectOption());
						a1.t1.setText(q.getQuestion());
						a1.t2.setText(q.getOptions()[0]);
						System.out.println(q.getOptions()[0]);
						a1.t3.setText(q.getOptions()[1]);
						a1.t4.setText(q.getOptions()[2]);
						a1.t5.setText(q.getOptions()[3]);
						a1.t6.setText(Integer.toString(q.getMarks()));
						
						
						
						
						ModifyQuestionFrame.this.dispose();
						break;
					}
					}	
						
					}catch(Exception ea) {
						JOptionPane.showMessageDialog(null, "Select option", "Error Message", JOptionPane.ERROR_MESSAGE);
						
					
				
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
				ModifyQuestionFrame.this.dispose();
				
			}
		});
		
	
		setVisible(true);
	}
	public static void main(String [] args) { 
		
		
		String question = "asdasd";
		 int correctOption = 3 ;
		 int marks = 5;
		 String[] options = {"sad","asda"};
		  boolean opText = false;
	Question q1 = new Question(question, correctOption, marks, options, opText);
	ArrayList<Question> q3 = new ArrayList<Question>();
	q3.add(q1);
 		Test t = new Test("New test", null, 0, q3);
 		ArrayList<Test> t11 = new ArrayList<Test>();
 		t11.add(t);
		new ModifyQuestionFrame(t11);
	
	
	
	
	}
		
}