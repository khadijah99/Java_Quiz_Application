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

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SelectTest extends JFrame {
	public SelectTest(ArrayList<Test> t, Admin admin) {	
		JComboBox c1,c2,c3;
		JButton b1,b2;
		JLabel l1,l2,l3;
		
		 
			setSize(400,200);
			
			c2 = new JComboBox ();
			
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
				
				
				
				c.gridx = 1; c.gridy = 1;
				
				
			

				b1= new JButton("ADD");
			
				JPanel p2 = new JPanel();
				p2.add(b1);
				p2.setOpaque(false);
				p2.setBounds(170, 140, 70, 70);
				background.add(p2);
				
				
				
				
				p1.setBounds(30, -70, 300, 300);
				p1.setOpaque(false);
				background.add(p1);

		
			b1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String selectedTest = c2.getSelectedItem().toString();
					Test test1 = new Test();
					
					for (int x = 0 ; x < t.size() ; x++ ) {
						if (t.get(x).getTestName().equalsIgnoreCase(selectedTest)) {
							test1 = t.get(x);
							break;
						}
					}
					
					new AddQuestionFrame(test1,admin);	
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
					SelectTest.this.dispose();
					
				}
			});
						
	
			
			setVisible(true);
		}
	
	public static void main(String[] args) {
		ArrayList<Test> tests = new ArrayList();
		Admin a = new Admin();
		new SelectTest(tests, a);
	}
	
	}


