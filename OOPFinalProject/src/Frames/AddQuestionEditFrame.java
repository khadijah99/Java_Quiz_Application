package Frames;

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
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AddQuestionEditFrame extends JFrame {
	
	JCheckBox image;
	JRadioButton text1, image1;
	JLabel question, options, option1, option2, option3, option4, marks, correctOption;
	JTextField t1, t2, t3, t4, t5, t6, t7;
	JButton qimage, op1image, op2image, op3image, op4image, done,  b3;
	JPanel p1, p2, p3, p4, p5, p6, p7;
	String qImage, op1, op2, op3, op4, s;
	String ops[] = new String[4];
	ArrayList<Question> questions = new ArrayList<Question>();
	  JComboBox<Integer> option;
	
	
	public AddQuestionEditFrame(Test t, int q1) {
		

		setSize(850, 700);
        JLabel background = new JLabel(new ImageIcon(new ImageIcon("E:\\Project\\addQuestion.jpg").getImage().getScaledInstance(850, 700, Image.SCALE_SMOOTH)));
        add(background);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        background.setBounds(0, 0, 850,700);
        setUndecorated(true);
        
        
        ///PANEL1
        question = new JLabel("Question");
        question.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        image = new JCheckBox("Image"); 
        image.setOpaque(false); image.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        
        p1  = new JPanel(new FlowLayout(0, 17, 0));
        p1.setBounds(125, 70, 500, 500);
        p1.setOpaque(false);
        p1.add(question); p1.add(image);
        background.add(p1);
        
        image.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (image.isSelected()) {
				      qimage.setEnabled(true);;
				   } else {
				      qimage.setEnabled(false);
				   }
				
			}
		});
        
        
        ///PANEL 2
        t1 = new JTextField(30); qimage = new JButton("Add Image");
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20)); 
        qimage.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        qimage.setEnabled(false);
        p2  = new JPanel(new FlowLayout(0, 17, 0));
        p2.setBounds(125, 120, 500, 500);
        p2.setOpaque(false);
        p2.add(t1); p2.add(qimage);
        background.add(p2);
        
        qimage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser j = new JFileChooser();
	            int r = j.showOpenDialog(null); 
	  
	            // if the user selects a file 
	            if (r == JFileChooser.APPROVE_OPTION) 
	            { 
	                // set the label to the path of the selected file
	            	qImage = j.getSelectedFile().getAbsolutePath();
	                qimage.setText("Added");
	                qimage.setEnabled(false);
	            } 
	            // if the user cancelled the operation 
	            else
	                qimage.setText("Add Image");		
			}
		});
        
        ///PANEL 3
        options = new JLabel("Options");
        options.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        text1 = new JRadioButton("Text");
        text1.setOpaque(false); text1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        image1 = new JRadioButton("Image");
        image1.setOpaque(false); image1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        ButtonGroup g = new ButtonGroup();
        g.add(text1); g.add(image1);
        
        MyItemListener a = new MyItemListener();
        text1.addItemListener(a); image1.addItemListener(a);
          
        p3  = new JPanel(new FlowLayout(0, 17, 0));
        p3.setBounds(125, 200, 500, 500);
        p3.setOpaque(false);
        p3.add(options); p3.add(text1); p3.add(image1);
        background.add(p3);
        
        ///PANEL 4
        p4 = new JPanel(new GridBagLayout());
        p4.setBounds(100, 150, 700, 400);
 		p4.setOpaque(false);
 		background.add(p4);
        
 		GridBagConstraints c = new GridBagConstraints();
    	c.insets = new Insets(10,10,10,10);
    	
        option1 = new JLabel("Option 1");
        option1.setFont(new Font("Times New Roman", Font.PLAIN, 27));
        t2 = new JTextField(20); t2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t2.setEnabled(false);
        op1image = new JButton("Add Image"); op1image.setEnabled(false);
        
        op1image.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser j = new JFileChooser();
	            int r = j.showOpenDialog(null); 
	  
	            // if the user selects a file 
	            if (r == JFileChooser.APPROVE_OPTION) 
	            { 
	                // set the label to the path of the selected file
	            	op1 = j.getSelectedFile().getAbsolutePath();
	                op1image.setText("Added");
	                op1image.setEnabled(false);
	            } 
	            // if the user cancelled the operation 
	            else
	                op1image.setText("Add Image");
				
			}
		});
        
        c.gridx = 0; c.gridy = 0; p4.add(option1,c);
        c.gridx = 1; c.gridy = 0; p4.add(t2,c);
        c.gridx = 2; c.gridy = 0; p4.add(op1image,c); 
        
        option2 = new JLabel("Option 2");
        option2.setFont(new Font("Times New Roman", Font.PLAIN, 27));
        t3 = new JTextField(20); t3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t3.setEnabled(false);
        op2image = new JButton("Add Image"); op2image.setEnabled(false);
        
        op2image.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser j = new JFileChooser();
	            int r = j.showOpenDialog(null); 
	  
	            // if the user selects a file 
	            if (r == JFileChooser.APPROVE_OPTION) 
	            { 
	                // set the label to the path of the selected file
	            	op2 = j.getSelectedFile().getAbsolutePath();
	                op2image.setText("Added");
	                op2image.setEnabled(false);
	            } 
	            // if the user cancelled the operation 
	            else
	                op2image.setText("Add Image");
				
			}
		});
        
        c.gridx = 0; c.gridy = 1; p4.add(option2,c);
        c.gridx = 1; c.gridy = 1; p4.add(t3,c);
        c.gridx = 2; c.gridy = 1; p4.add(op2image,c); 
        
        option3 = new JLabel("Option 3");
        option3.setFont(new Font("Times New Roman", Font.PLAIN, 27));
        t4 = new JTextField(20); t4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t4.setEnabled(false);
        op3image = new JButton("Add Image"); op3image.setEnabled(false);
        
        op3image.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser j = new JFileChooser();
	            int r = j.showOpenDialog(null); 
	  
	            // if the user selects a file 
	            if (r == JFileChooser.APPROVE_OPTION) 
	            { 
	                // set the label to the path of the selected file
	            	op3 = j.getSelectedFile().getAbsolutePath();
	                op3image.setText("Added");
	                op3image.setEnabled(false);
	            } 
	            // if the user cancelled the operation 
	            else
	                op3image.setText("Add Image");
				
			}
		});
        
        c.gridx = 0; c.gridy = 2; p4.add(option3,c);
        c.gridx = 1; c.gridy = 2; p4.add(t4,c);
        c.gridx = 2; c.gridy = 2; p4.add(op3image,c); 
        
        option4 = new JLabel("Option 4");
        option4.setFont(new Font("Times New Roman", Font.PLAIN, 27));
        t5 = new JTextField(20); t5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t5.setEnabled(false);
        op4image = new JButton("Add Image"); op4image.setEnabled(false);
        
        op4image.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser j = new JFileChooser();
	            int r = j.showOpenDialog(null); 
	  
	            // if the user selects a file 
	            if (r == JFileChooser.APPROVE_OPTION) 
	            { 
	                // set the label to the path of the selected file
	            	op4 = j.getSelectedFile().getAbsolutePath();
	                op4image.setText("Added");
	                op4image.setEnabled(false);
	            } 
	            // if the user cancelled the operation 
	            else
	                op4image.setText("Add Image");
				
			}
		});
        
        c.gridx = 0; c.gridy = 3; p4.add(option4,c);
        c.gridx = 1; c.gridy = 3; p4.add(t5,c);
        c.gridx = 2; c.gridy = 3; p4.add(op4image,c); 
        
        ///PANEL 5
        marks = new JLabel("Marks");
        marks.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        t6 = new JTextField(9); t6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
          
        p5  = new JPanel(new FlowLayout(0, 17, 0));
        p5.setBounds(125, 480, 500, 500);
        p5.setOpaque(false);
        p5.add(marks); p5.add(t6); 
        background.add(p5);
        
        ///PANEL 6
        correctOption = new JLabel("Correct option");
        correctOption.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        Integer opt[] = {1,2,3,4};
         option = new JComboBox<Integer>(opt);
        
        option.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				s = option.getSelectedItem().toString();
			}
		});
          
        p6  = new JPanel(new FlowLayout(0, 17, 0));
        p6.setBounds(125, 530, 500, 500);
        p6.setOpaque(false);
        p6.add(correctOption); p6.add(option); 
        background.add(p6);
        
        ///PANEL 7
        done  = new JButton("Done"); done.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        
        p7  = new JPanel(new FlowLayout(0, 17, 0));
        p7.setBounds(380, 600, 500, 500);
        p7.setOpaque(false);
        p7.add(done); 
        background.add(p7);
   
        
        ///Close button
        b3 = new JButton();
        b3.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\cancel.png").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
		b3.setBorderPainted(false); 
        b3.setContentAreaFilled(false); 
        b3.setFocusPainted(false); 
        b3.setOpaque(false);
        
        JPanel close = new JPanel();
        close.add(b3);
		close.setOpaque(false);
		close.setBounds(770,10, 70, 70);
		background.add(close);
        
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AddQuestionEditFrame.this.dispose();
			}
		});
		
        done.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(image.isSelected()==true && qimage.getText().equalsIgnoreCase("Added")==false)
					JOptionPane.showMessageDialog(null, "Select image for question", "Error Message", JOptionPane.ERROR_MESSAGE);
				
				else if(t1.getText()==null || t1.getText().equals(""))
					JOptionPane.showMessageDialog(null, "Enter question text please", "Error Message", JOptionPane.ERROR_MESSAGE);
				
				else if(text1.isSelected()==false && image1.isSelected()==false)
					JOptionPane.showMessageDialog(null, "Select option type please", "Error Message", JOptionPane.ERROR_MESSAGE);
				
				else if(text1.isSelected()==true && (t2.getText().equals("") || t3.getText().equals("") || t4.getText().equals("") || t5.getText().equals("")))
					JOptionPane.showMessageDialog(null, "Fill all option fields", "Error Message", JOptionPane.ERROR_MESSAGE);
				
				else if(text1.isSelected()==true && (t2.getText() ==null || t3.getText() == null || t4.getText() == null || t5.getText()==null))
					JOptionPane.showMessageDialog(null, "Fill all option fields", "Error Message", JOptionPane.ERROR_MESSAGE);
					
				else if(t6.getText()==null || t6.getText().equals(""))
					JOptionPane.showMessageDialog(null, "Input marks please", "Error Message", JOptionPane.ERROR_MESSAGE);
				
				else if(Pattern.compile("^[0-9]*$").matcher(t6.getText()).matches()==false)
					JOptionPane.showMessageDialog(null, "Marks can have digits only", "Error Message", JOptionPane.ERROR_MESSAGE);
				else {
					try {
						Question q;
						int cop = Integer.parseInt(s);
						int markss = Integer.parseInt(t6.getText());
						boolean isText = false;
						
						if(text1.isSelected()) {
							ops[0] = t2.getText(); ops[1] = t3.getText(); ops[2] = t4.getText(); ops[3] = t5.getText();
							isText = true;
							}
						else {
							ops[0] = op1; ops[1] = op2; ops[2] = op3; ops[3] = op4;
						}
						
						if(qimage.getText().equals("Added")) {
							q = new Question(t1.getText(), qImage, cop , markss, ops, isText);
						}
						
						else {
							q = new Question(t1.getText(), cop , markss, ops, isText);
						}
						
						t.getQuestions().set(q1, q);
						
						ArrayList<Test> t1 = new ArrayList<Test>();
						t1 = HelperClass.readAllData();
						
						for (int x =0 ; x < t1.size() ; x++) {
							if (t1.get(x).getTestName().equalsIgnoreCase(t.getTestName())) {
								t1.set(x, t);
								System.out.println("asdasd");
								HelperClass.addArrayListToFile(t1);
								break;
							}
						}
					}catch(Exception ea) {
						JOptionPane.showMessageDialog(null, "Select correct option", "Error Message", JOptionPane.ERROR_MESSAGE);
					}
				}
				

			}
		});
		
		
		
        
		
        setVisible(true);
		
		
	}
	
	public class MyItemListener implements ItemListener{
		
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource()==text1) {
				t2.setEnabled(true);
				t3.setEnabled(true);
				t4.setEnabled(true);
				t5.setEnabled(true);
				op1image.setEnabled(false);
				op2image.setEnabled(false);
				op3image.setEnabled(false);
				op4image.setEnabled(false);
			}
			if(e.getSource()==image1) {
				op1image.setEnabled(true);
				op2image.setEnabled(true);
				op3image.setEnabled(true);
				op4image.setEnabled(true);
				t2.setEnabled(false);
				t3.setEnabled(false);
				t4.setEnabled(false);
				t5.setEnabled(false);
			}
			
		}
	}
	
	
	
	public static void main(String[] args) {
		Test t = new Test();
		new AddQuestionEditFrame(t, 1);
	}

}
	

