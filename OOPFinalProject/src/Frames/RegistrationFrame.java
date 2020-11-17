package Frames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;

import javax.swing.*;
import com.toedter.calendar.JDateChooser;

//import sun.util.calendar.JulianCalendar;

public class RegistrationFrame extends JFrame {
	
	ArrayList<Student> students = new ArrayList<Student>();
	JTextField fname, lname, username, phone, email;
	public RegistrationFrame(String person) {
		super("Register");
		setSize(1200, 900);
        JLabel background = new JLabel(new ImageIcon(new ImageIcon("E:\\Project\\regg.png").getImage().getScaledInstance(1200, 900, Image.SCALE_SMOOTH)));
        add(background);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        background.setBounds(0, 0, 1200,900);
        setUndecorated(true);
        
        javax.swing.border.Border border1 = BorderFactory.createLineBorder(Color.WHITE,2);
             
        JPanel p1 = new JPanel();
        p1.setLayout(new GridBagLayout());
        background.add(p1);
        
    	GridBagConstraints c = new GridBagConstraints();
    	c.insets = new Insets(10,10,10,10);
    	
    	MyKeyListener k = new MyKeyListener();
    	
		c.gridx = 0; c.gridy = 0;
		JLabel l1 = new JLabel("First Name");
		l1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		p1.add(l1,c);
		
		c.gridx = 1; c.gridy = 0;
		fname = new JTextField(14);
		fname.setBorder(border1);
		//fname.addKeyListener(k);
		fname.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		p1.add(fname,c);
		
		
		
		c.gridx = 0; c.gridy = 1;
		JLabel l11 = new JLabel("Last Name");
		l11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		p1.add(l11,c);
		
		c.gridx = 1; c.gridy = 1;
		lname = new JTextField(14);
		lname.setBorder(border1);
		//lname.addKeyListener(k);
		lname.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		p1.add(lname,c);
		
		c.gridx = 0; c.gridy = 2;
		JLabel ll = new JLabel("Username");
		ll.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		p1.add(ll,c);
		
		c.gridx = 1; c.gridy = 2;
		username = new JTextField(14);
		username.setBorder(border1);
		username.addKeyListener(k);
		username.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		p1.add(username,c);
		
		c.gridx = 0; c.gridy = 3;
		JLabel l2 = new JLabel("Email");
		l2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		p1.add(l2,c);
		
		c.gridx = 1; c.gridy = 3;
		email = new JTextField(14);
		email.setBorder(border1);
		//email.addKeyListener(k);
		email.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		p1.add(email,c);
		
		c.gridx = 0; c.gridy = 4;
		JLabel l3 = new JLabel("Phone");
		l3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		p1.add(l3,c);
		
		c.gridx = 1; c.gridy = 4;
		phone  = new JTextField(14);
		phone.setBorder(border1);
		phone.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		p1.add(phone,c);
		
		c.gridx = 0; c.gridy = 5;
		JLabel l4  = new JLabel("Gender");
		l4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		p1.add(l4,c);
		
		JRadioButton male = new JRadioButton("Male");
		male.setOpaque(false);
		JRadioButton female = new JRadioButton("Female");
		female.setOpaque(false);
		ButtonGroup bg = new ButtonGroup();
		bg.add(female); bg.add(male);
		
		c.gridx = 0; c.gridy = 6;
		p1.add(male,c);
		c.gridx = 1; c.gridy = 6;
		p1.add(female,c);
		
		c.gridx = 0; c.gridy = 7;
		JLabel dob = new JLabel("Date of birth: ");
		dob.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		p1.add(dob,c);
		
		c.gridx = 1; c.gridy = 7;
		JDateChooser chooser = new JDateChooser();
		chooser.setLocale(Locale.UK);
		chooser.setPreferredSize(new Dimension(200,30));
		p1.add(chooser,c);
		
		
		c.gridx = 0; c.gridy = 8;
		JLabel l5 = new JLabel("Password");
		l5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		p1.add(l5,c);
		
		c.gridx = 1; c.gridy = 8;
		JPasswordField pass = new JPasswordField(14);
		pass.setBorder(border1);
		pass.setEchoChar('•');
		pass.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		p1.add(pass,c);
		
		c.gridx = 1; c.gridy = 9;
		JCheckBox showPass = new JCheckBox("Show Password");
		showPass.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		showPass.setOpaque(false);
		p1.add(showPass,c);
		
		c.gridx = 0; c.gridy = 10;
		JButton back = new JButton("Back");
		p1.add(back,c);
		
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				RegistrationFrame.this.dispose();
				
			}
		});
		
		c.gridx = 1; c.gridy = 10;
		JButton register = new JButton("Register");
		p1.add(register,c);
		
		register.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<Student> studs = new ArrayList<Student>();
				studs = StudentHelperClass.readAllData();
				boolean exists = false;
				
				if(username.getText()!=null && username.getText().equals("")==false) {
				for(int i=0; i<studs.size(); i++) {
					if(studs.get(i).getUsername().equalsIgnoreCase(username.getText())) {
						exists = true;
					}
						
				}
				}
				
				if(fname.getText()==null || fname.getText().equals("")==true) 
					JOptionPane.showMessageDialog(null, "Enter first name", "Error Message", JOptionPane.ERROR_MESSAGE);

				else if(lname.getText()==null || lname.getText().equals("")==true)
					JOptionPane.showMessageDialog(null, "Enter last name", "Error Message", JOptionPane.ERROR_MESSAGE);
				
				else if(username.getText()==null || username.getText().equals("")==true) 
					JOptionPane.showMessageDialog(null, "Enter username", "Error Message", JOptionPane.ERROR_MESSAGE);
				
				else if(email.getText()==null || email.getText().equals("")==true)
					JOptionPane.showMessageDialog(null, "Enter email", "Error Message", JOptionPane.ERROR_MESSAGE);
				
				else if( phone.getText()==null ||phone.getText().equals("")==true)
					JOptionPane.showMessageDialog(null, "Enter phone number", "Error Message", JOptionPane.ERROR_MESSAGE);
				
				else if(pass.getText()==null || pass.getText().equals("")==true)
					JOptionPane.showMessageDialog(null, "Enter password", "Error Message", JOptionPane.ERROR_MESSAGE);
				
//				else if(dob.getText()==null || dob.getText().equals("")==true)
//					JOptionPane.showMessageDialog(null, "Enter date of birth", "Error Message", JOptionPane.ERROR_MESSAGE);
				
				else if(male.isSelected()==false && female.isSelected()==false) 
					JOptionPane.showMessageDialog(null, "Select gender", "Error Message", JOptionPane.ERROR_MESSAGE);
				
				else if((Pattern.compile("^[a-zA-Z]*$").matcher(fname.getText()).matches())==false)
					JOptionPane.showMessageDialog(null, "First name can have letters only. No space allowed", "Error Message", JOptionPane.ERROR_MESSAGE);
									
				else if(Pattern.compile("^[a-zA-Z]*$").matcher(lname.getText()).matches()==false)
					JOptionPane.showMessageDialog(null, "Last name can have letters only. No space allowed", "Error Message", JOptionPane.ERROR_MESSAGE);
				
				else if(Pattern.compile("^(?=.{8,20}$)(?![_.])(?!.*[_.]{2})[a-zA-Z0-9._]+(?<![_.])$").matcher(username.getText()).matches()==false)
					JOptionPane.showMessageDialog(null, "Username should be 8-20 characters long and cannot have '_' or '.' at the beginning, end or in a row", "Error Message", JOptionPane.ERROR_MESSAGE);
				
				else if(exists==true) 
					JOptionPane.showMessageDialog(null, "Username already exists", "Error Message", JOptionPane.ERROR_MESSAGE);
				
				else if(Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b").matcher(email.getText()).matches()==false)
					JOptionPane.showMessageDialog(null, "Email format wrong. No space allowed", "Error Message", JOptionPane.ERROR_MESSAGE);
				
				else if(Pattern.compile("^\\d{3}-\\d{3}-\\d{4}$").matcher(phone.getText()).matches()==false)
					JOptionPane.showMessageDialog(null, "Only digits and 000-000-0000 format allowed", "Error Message", JOptionPane.ERROR_MESSAGE);
				
				else if(Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$").matcher(pass.getText()).matches()==false)
					JOptionPane.showMessageDialog(null, "Password must have atleast 8 characters, atleast one letter and one number", "Error Message", JOptionPane.ERROR_MESSAGE);
				
				
				else {
				
				try {	
				

				Date date = chooser.getDate();
				String strDate = DateFormat.getDateInstance().format(date);
				
				String gender;
				if(male.isSelected())
					gender = "Male";
				else {
					gender = "Female";
				}
				
				if(person.equalsIgnoreCase("student")) {
					ArrayList<Student> students = new ArrayList<>();
					students = StudentHelperClass.readAllData();
					ArrayList<Result> res = new ArrayList();
					Student stud = new Student(username.getText(), fname.getText(), lname.getText(), strDate, pass.getText(), email.getText(), phone.getText(), gender,res);
					
					students.add(stud);
					
					StudentHelperClass.writeToFile(students);
				}
				else {
					ArrayList<Admin> admins = new ArrayList<>();
					admins = AdminHelperClass.readAllData();
					ArrayList<String> testNames = new ArrayList();
					Admin a1 = new Admin(username.getText(), fname.getText(), lname.getText(), strDate, pass.getText(), email.getText(), phone.getText(), gender,testNames);
					
					admins.add(a1);
					
					AdminHelperClass.writeToFile(admins);
				}
				
				JOptionPane.showMessageDialog(null, "Registered");
				RegistrationFrame.this.dispose();
				}catch(NullPointerException ea) {
					JOptionPane.showMessageDialog(null, "Fill all fields", "Error Message", JOptionPane.ERROR_MESSAGE);
				}
				}
		
			}
		});

		
		p1.setBounds(200, 80, 800, 770);
		p1.setOpaque(false);
		background.add(p1);
		
		JPanel close = new JPanel(new FlowLayout());
		JButton b3 = new JButton();
		b3.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\cancel.png").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
		 b3.setBorderPainted(false); 
	        b3.setContentAreaFilled(false); 
	        b3.setFocusPainted(false); 
	        b3.setOpaque(false);
		close.add(b3);
		close.setOpaque(false);
		close.setBounds(1120,10, 50, 50);
		background.add(close);
		
		
		setVisible(true);
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				RegistrationFrame.this.dispose();
			}
		});
			
		
		showPass.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				 if (showPass.isSelected()) {
				      pass.setEchoChar((char)0);
				   } else {
				      pass.setEchoChar('•');
				   }
				
			}
		});


	}
	
	public class MyKeyListener implements KeyListener{
		public void keyPressed(KeyEvent e) {
			if(e.getComponent()==fname) {
				String value = fname.getText();
				if ((e.getKeyChar() >= '@' && e.getKeyChar() <= 'Z') || (e.getKeyChar() >= 'a' && e.getKeyChar() <= 'z') 
				|| e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
					fname.setEditable(true);
				} else {
					fname.setEditable(false);
					
				}
			}
			
			else if(e.getComponent()==lname) {
				String value = fname.getText();
				if ((e.getKeyChar() >= '@' && e.getKeyChar() <= 'Z') || (e.getKeyChar() >= 'a' && e.getKeyChar() <= 'z') 
						|| e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
					lname.setEditable(true);
				} else {
					lname.setEditable(false);
					
				}
			}
			
			else if(e.getComponent()==email) {
				if ((e.getKeyChar() >= '@' && e.getKeyChar() <= 'Z') || (e.getKeyChar() >= 'a' && e.getKeyChar() <= 'z') ||
						(e.getKeyChar() >= '0' && e.getKeyChar() <= '9') || e.getKeyCode() == KeyEvent.VK_BACK_SPACE || e.getKeyChar()==46) {
					email.setEditable(true);
				} else {
					email.setEditable(false);
					
				}
			}
			
//			else if(e.getComponent()==phone) {
//				if ((e.getKeyChar() >= '0' && e.getKeyChar() <= '9') || e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
//					phone.setEditable(true);
//				} else {
//					phone.setEditable(false);
//					
//				}
//			}
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

	
	}
	


public static void main(String[] args) {
	new RegistrationFrame("student");
}


}