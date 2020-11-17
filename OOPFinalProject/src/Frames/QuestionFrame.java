
package Frames;
import java.time.LocalTime;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import java.time.*;

public class QuestionFrame extends JFrame {
	JLabel l1,l2,l22,l3,l4,l5,l6,option1,option2,option3,option4,select;
	JButton back,next,close,done,save;
	JComboBox c1;
	JCheckBox check;
	JRadioButton r1,r2,r3,r4;
	
	static ArrayList<AnsweredQuestion> ans = new ArrayList<AnsweredQuestion>();
	
	public QuestionFrame( Test t,int QuestionNO,Student s) {
		Result r = new Result();

		setSize(1000,700);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JLabel Background = new JLabel(new ImageIcon(new ImageIcon("E:\\Project\\addQuestion.jpg").getImage().getScaledInstance(1000, 700, Image.SCALE_SMOOTH)));
		add(Background);
		setLocationRelativeTo(null);
		Background.setBounds(0, 0, 1000, 700);
		//setUndecorated(true);
		final ArrayList<Question> q1;
		
		q1 = t.getQuestions();
		Question q;
		if (q1.get(QuestionNO)!= null) {
		q = q1.get(QuestionNO);
		
		

		if (q.isOptionIsText()) {
			  JPanel p1 = new JPanel(new GridBagLayout());
		 		GridBagConstraints c = new GridBagConstraints();

		    	c.insets = new Insets(10,10,10,10);
		    	l1 = new JLabel("(" + Integer.toString(QuestionNO) + ")." + "  ");
				l2 = new JLabel( q.getQuestion());
				
				
		        l1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		        l2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		        
				  r2 = new JRadioButton("asdasd");


	        c.gridx = 0; c.gridy = 0; p1.add(l1,c);
	        c.gridx = 1; c.gridy = 0; p1.add(l2,c);
	       
	        if(q.getQimage()!=null) {
				l22 = new JLabel(new ImageIcon(new ImageIcon(q.getQimage().toString()).getImage().getScaledInstance(45, 30, Image.SCALE_SMOOTH)));;
				c.gridx = 0; c.gridy = 1; p1.add(l22,c);
			} 			
			
			p1.setBounds(0, -70, 1000, 350);
			p1.setOpaque(false);
			Background.add(p1);
			
			
			
			  JPanel p2 = new JPanel();
			  p2.setLayout(new GridBagLayout());
			  GridBagConstraints c2 = new GridBagConstraints();
				c2.insets = new Insets(20,5,20,5);
			  
			  r1 = new JRadioButton();
			  r2 = new JRadioButton();
			  r3 = new JRadioButton();
			  r4 = new JRadioButton();
			  r1.setOpaque(false);
			  r2.setOpaque(false);
			  r3.setOpaque(false);
			  r4.setOpaque(false);
			  
			  ButtonGroup rg;
			  rg = new ButtonGroup();
			  rg.add(r1);
			  rg.add(r2);
			  rg.add(r3);
			  rg.add(r4);
			  
			  
			  l3 = new JLabel("(a).");
			  l4 = new JLabel("(b).");
			  l5 = new JLabel("(c).");
			  l6 = new JLabel("(d).");
			  
			  option1 = new JLabel(q.getOptions()[0]);
			  option2 = new JLabel(q.getOptions()[1]);
			  option3 = new JLabel(q.getOptions()[2]);
			  option4 = new JLabel(q.getOptions()[3]);
		      
		       	
		        c2.gridx = 0; c2.gridy = 0;
		        
		        p2.add(l3,c2);
		        c2.gridx = 1; c2.gridy = 0;
		        p2.add(r1,c2);
		        c2.gridx = 2 ; c2.gridy = 0;
		        p2.add(option1,c2);
		        c2.gridx = 0; c2.gridy = 1; 
		        p2.add(l4,c2);
		        c2.gridx = 1; c2.gridy = 1; 
		        p2.add(r2,c2);
		        c2.gridx = 2 ; c2.gridy = 1;
		        p2.add(option2,c2);
		       
		        c2.gridx = 0; c2.gridy = 2;
		        
		        p2.add(l5,c2);
		        c2.gridx = 1; c2.gridy = 2;
		        p2.add(r3,c2);
		        c2.gridx = 2 ; c2.gridy = 2;
		        p2.add(option3,c2);
		        c2.gridx = 0; c2.gridy = 3; 
		        p2.add(l6,c2);
		        c2.gridx = 1; c2.gridy = 3; 
		        p2.add(r4,c2); 
		        c2.gridx = 2 ; c2.gridy = 3;
		        p2.add(option4,c2);
			       p2.setBounds(-150, 100, 800, 300);
			       
			     p2.setOpaque(false);
	
		       Background.add(p2);
		        
		       JPanel p3 = new JPanel();
		       back = new JButton("Previous Question");
		       next = new JButton("Next Question");
		       check = new JCheckBox("Mark");
		       
		        back.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\back.png").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
		        next.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\forward.png").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));

				back.setBorderPainted(false); 
		        back.setContentAreaFilled(false); 
		        back.setFocusPainted(false); 
		        back.setOpaque(false);
		        back.setVerticalTextPosition(JButton.BOTTOM);
		        back.setHorizontalTextPosition(JButton.CENTER);
		       
				p3.add(back);
				p3.setOpaque(false);
				p3.setBounds(80, 420, 120, 120);
				Background.add(p3);
				
				JPanel p4 = new JPanel();

			    next.setBorderPainted(false); 
		        next.setContentAreaFilled(false); 
		        next.setFocusPainted(false); 
		        next.setOpaque(false);
		        next.setVerticalTextPosition(JButton.BOTTOM);
		        next.setHorizontalTextPosition(JButton.CENTER);
				
				p4.add(next);
				p4.setOpaque(false);
				p4.setBounds(620, 420, 80, 80);
				Background.add(p4);
		       
				
			JPanel p5 = new JPanel();
			select = new JLabel("Select Question");
			c1 = new JComboBox ();
			for (int x = 0 ; x < q1.size() - 1 ; x++) {
				c1.addItem(x+1);
			}
			
			p5.add(select); p5.add(c1);
			p5.setBounds(240, 400, 150, 150);
			p5.setOpaque(false);
			Background.add(p5);
			
			save = new JButton("Save");
			JPanel p6 = new JPanel();
			for (int x = 0 ; x < ans.size() ; x++) {
				if (q.getQuestion().equalsIgnoreCase(ans.get(x).getQuestion().getQuestion())) {
					save.setText("Saved");
					
				}
				else {
					save.setText("Save");
					
				}
			}
			
			p6.add(save);

			
			p6.setOpaque(false);
			p6.setBounds(450, 400, 100, 100);
			Background.add(p6);
			
			save.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String selected;

					// TODO Auto-generated method stub
					if (r1.isSelected()) {
						selected = "1";
					}
					else if (r2.isSelected()) {
						selected = "2";
					}
					else if (r3.isSelected()) {
						selected = "3";
					}
					else {
						selected = "4";
					}
					
					AnsweredQuestion answer = new AnsweredQuestion(q, selected);

					for (int x = 0 ; x < ans.size() ; x++) {
						System.out.println(x+1);
						if (ans.get(x).getQuestion().getQuestion().equalsIgnoreCase(answer.getQuestion().getQuestion())){
							ans.remove(x);
						}
						
					}
					
					
					ans.add(answer);
					
					
					
					save.setText("Saved");
					save.setEnabled(false);
					
				}
				
		

			});
			JPanel p8 = new JPanel();
			
			done = new JButton("Finish Test");
			p8.add(done);
			Background.add(p8);
			p8.setBounds(375, 480, 100, 100);
			p8.setOpaque(false);
		
			
			done.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					r.setAns(ans);
					r.setT(t);
				
					
					ArrayList<Student> s1 = StudentHelperClass.readAllData();
					for (int x = 0 ; x < s1.size() ; x++) {
						if (s1.get(0).getUsername().equalsIgnoreCase(s.getUsername())) {
							s1.get(x).getR().add(r);
							StudentHelperClass.writeToFile(s1);
							JOptionPane.showMessageDialog(null, "Total Marks : " + t.getTotalMarks() + "\n" + "Marks Obtained : " + r.ResultCal() );
							QuestionFrame.this.dispose();
							break;
						}
					}			
				}
			});
			
			
			back.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
						if (QuestionNO != 1) {
						QuestionFrame.this.dispose();
						new QuestionFrame(t, QuestionNO-1,s);
						}
						
					}
				
			});
			
			next.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
						if (QuestionNO < q1.size()-1) {
						QuestionFrame.this.dispose();
						new QuestionFrame(t, QuestionNO+1,s);
						}
						else JOptionPane.showMessageDialog(null, "End of test" );
						
					}
				
					
				
			});
			
			c1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String questionselected = c1.getSelectedItem().toString();
					
					if (check.isSelected()) {
						String selected = rg.getSelection().getSelectedObjects().toString();
					
						AnsweredQuestion answer = new AnsweredQuestion(q, selected);
						ans.add(answer);
						r.setAns(ans);
						r.setT(t);
						
						QuestionFrame.this.dispose();
						new QuestionFrame(t, Integer.parseInt(questionselected),s);
						
						
					}
					else {
						if (QuestionNO < q1.size()) {
						QuestionFrame.this.dispose();
						new QuestionFrame(t, Integer.parseInt(questionselected),s);
						}
						
					}
					
				}
			} );
			
			int counter = 0;
			for (int x = 0 ; x < ans.size() ; x++) {
				counter++;
			}
			
			if (counter-1 == q1.size()-1) {
				//new ResultFrame(q1, ans);
			}
			
			
		}
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		else {
			JPanel p8 = new JPanel();
			
			done = new JButton("Finish Test");
			p8.add(done);
			Background.add(p8);
			p8.setBounds(375, 480, 100, 100);
			p8.setOpaque(false);
		
			
			done.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					r.setAns(ans);
					r.setT(t);
				
					
					ArrayList<Student> s1 = StudentHelperClass.readAllData();
					for (int x = 0 ; x < s1.size() ; x++) {
						if (s1.get(0).getUsername().equalsIgnoreCase(s.getUsername())) {
							s1.get(x).getR().add(r);
							StudentHelperClass.writeToFile(s1);
							JOptionPane.showMessageDialog(null, "Total Marks : " + t.getTotalMarks() + "\n" + "Marks Obtained : " + r.ResultCal() );
							QuestionFrame.this.dispose();
							break;
						}
					}			
				}
			});
			
			
			
			 JPanel p1 = new JPanel(new GridBagLayout());
		 		GridBagConstraints c = new GridBagConstraints();

		    	c.insets = new Insets(10,10,10,10);
		    	l1 = new JLabel("(" + Integer.toString(QuestionNO) + ")." + "  ");
				l2 = new JLabel(q.getQuestion());

		        l2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
				  r2 = new JRadioButton("asdasd");


	        c.gridx = 0; c.gridy = 0; p1.add(l1,c);
	        c.gridx = 1; c.gridy = 0; p1.add(l2,c);
	         
	        if(q.getQimage()!=null) {
				l22 = new JLabel(new ImageIcon(new ImageIcon(q.getQimage().toString()).getImage().getScaledInstance(45, 30, Image.SCALE_SMOOTH)));;
				c.gridx = 0; c.gridy = 1; p1.add(l22,c);
			} 
						
			
			p1.setBounds(0, -70, 800, 250);
			p1.setOpaque(false);
			Background.add(p1);
			
			
			
			  JPanel p2 = new JPanel();
			  p2.setLayout(new GridBagLayout());
			  GridBagConstraints c2 = new GridBagConstraints();
				c2.insets = new Insets(20,5,20,5);
			  
			  r1 = new JRadioButton();
			  r2 = new JRadioButton();
			  r3 = new JRadioButton();
			  r4 = new JRadioButton();
			  r1.setOpaque(false);
			  r2.setOpaque(false);
			  r3.setOpaque(false);
			  r4.setOpaque(false);
			  
			  ButtonGroup rg;
			  rg = new ButtonGroup();
			  rg.add(r1);
			  rg.add(r2);
			  rg.add(r3);
			  rg.add(r4);
			  
			  
			  l3 = new JLabel("(a).");
			  l4 = new JLabel("(b).");
			  l5 = new JLabel("(c).");
			  l6 = new JLabel("(d).");
			  
			  option1 = new JLabel(new ImageIcon(new ImageIcon(q.getOptions()[0].toString()).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));;
			  option2 = new JLabel(new ImageIcon(new ImageIcon(q.getOptions()[1].toString()).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));;
			  option3 = new JLabel(new ImageIcon(new ImageIcon(q.getOptions()[2].toString()).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));;
			  option4 = new JLabel(new ImageIcon(new ImageIcon(q.getOptions()[3].toString()).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));;
		      
		       	
		        c2.gridx = 0; c2.gridy = 0;
		        
		        p2.add(l3,c2);
		        c2.gridx = 1; c2.gridy = 0;
		        p2.add(r1,c2);
		        c2.gridx = 2 ; c2.gridy = 0;
		        p2.add(option1,c2);
		        c2.gridx = 0; c2.gridy = 1; 
		        p2.add(l4,c2);
		        c2.gridx = 1; c2.gridy = 1; 
		        p2.add(r2,c2);
		        c2.gridx = 2 ; c2.gridy = 1;
		        p2.add(option2,c2);
		       
		        c2.gridx = 0; c2.gridy = 2;
		        
		        p2.add(l5,c2);
		        c2.gridx = 1; c2.gridy = 2;
		        p2.add(r3,c2);
		        c2.gridx = 2 ; c2.gridy = 2;
		        p2.add(option3,c2);
		        c2.gridx = 0; c2.gridy = 3; 
		        p2.add(l6,c2);
		        c2.gridx = 1; c2.gridy = 3; 
		        p2.add(r4,c2); 
		        c2.gridx = 2 ; c2.gridy = 3;
		        p2.add(option4,c2);
			       p2.setBounds(-250, 100, 800, 300);
			       
			     p2.setOpaque(false);
	
		       Background.add(p2);
		        
		       JPanel p3 = new JPanel();
		       back = new JButton("Previous Question");
		       next = new JButton("Next Question");
		       check = new JCheckBox("Mark");
		       
		        back.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\back.png").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
		        next.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\forward.png").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));

				 back.setBorderPainted(false); 
			        back.setContentAreaFilled(false); 
			        back.setFocusPainted(false); 
			        back.setOpaque(false);
			        back.setVerticalTextPosition(JButton.BOTTOM);
			        back.setHorizontalTextPosition(JButton.CENTER);
		       
				p3.add(back);
				p3.setOpaque(false);
				p3.setBounds(80, 420, 120, 120);
				Background.add(p3);
				
				JPanel p4 = new JPanel();

					 next.setBorderPainted(false); 
				        next.setContentAreaFilled(false); 
				        next.setFocusPainted(false); 
				        next.setOpaque(false);
				        next.setVerticalTextPosition(JButton.BOTTOM);
				        next.setHorizontalTextPosition(JButton.CENTER);
				
				p4.add(next);
				p4.setOpaque(false);
				p4.setBounds(620, 420, 80, 80);
				Background.add(p4);
		       
				
			JPanel p5 = new JPanel();
			select = new JLabel("Select Question");
			c1 = new JComboBox ();
			for (int x = 0 ; x < q1.size() - 1 ; x++) {
				c1.addItem(x+1);
			}
			
			p5.add(select); p5.add(c1);
			p5.setBounds(240, 400, 150, 150);
			p5.setOpaque(false);
			Background.add(p5);
			
		
		
			
		
			
			save = new JButton("Save");
			JPanel p6 = new JPanel();
			p6.add(save);
			check.setOpaque(false);
			p6.setOpaque(false);
			p6.setBounds(450, 400, 100, 100);
			Background.add(p6);
			
			save.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String selected;

					// TODO Auto-generated method stub
					if (r1.isSelected()) {
						selected = "1";
					}
					else if (r2.isSelected()) {
						selected = "2";
					}
					else if (r3.isSelected()) {
						selected = "3";
					}
					else {
						selected = "4";
					}
					
					AnsweredQuestion answer = new AnsweredQuestion(q, selected);

					for (int x = 0 ; x < ans.size() ; x++) {
						if (ans.get(x).getQuestion().getQuestion().equalsIgnoreCase(answer.getQuestion().getQuestion())){
							ans.remove(x);
						}
						
					}
					
					
					ans.add(answer);
					
					

					save.setText("Saved");
					save.setEnabled(false);
					
				}
				
		

			});
			
					
			
		
back.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
			if (QuestionNO != 1) {
			QuestionFrame.this.dispose();
			new QuestionFrame(t, QuestionNO-1,s);
			}
			
		}
	
});

next.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
			if (QuestionNO < q1.size()-1) {
			QuestionFrame.this.dispose();
			new QuestionFrame(t, QuestionNO+1,s);
			}
			
		}
	
		
	
});

		
//		
//		JPanel p7 = new JPanel();
//		JLabel timer;
//		setVisible(true);
//		int time = t.getTotalTime();
//		
//		timer = new JLabel();
//		 while (time>0){
//		 timer.setText("Time Allocated : " + LocalTime.MIN.plusSeconds(time).toString()); 
//		
//			p7.add(timer);
//			p7.setBounds(600, 70,200, 200);
//			p7.setOpaque(false);
//			Background.add(p7);
//		  try {
//		    time--;
//		    Thread.sleep(1000L);    // 1000L = 1000ms = 1 second
//		   }
//		   catch (InterruptedException e) {
//		       //I don't think you need to do anything for your particular problem
//		   }
//		 }
		

		
		
		
	}
		setVisible(true);
		}
		else {
			new QuestionFrame(t, QuestionNO+1,s);
			
		}
	}
	public static void main(String [] args) {
//		String question = "What is your name ?";
//		 int correctOption = 3 ;
//		 int marks = 5;
//		 String[] options = {"Fahssssssssad","Zeessssssssssshan","Khadssssija","Moeessssd"};
//		  boolean opText = true;
//	Question q1 = new Question(question, correctOption, marks, options, opText);
//	ArrayList<Question> q3 = new ArrayList<Question>();
//	q3.add(q1);
//		Test t = new Test("New test", null, 0, q3);
		ArrayList<Test> t11 = HelperClass.readAllData();
		Student s = new Student();
	new QuestionFrame( t11.get(0),0,s); 
	}
}
