package Frames;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ErrorFrame extends JFrame{
	JLabel l1;
	JButton b1,b2;
	
	
	public ErrorFrame(String a) {
		super("Error Frame");
		setSize(400,150);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JLabel Background = new JLabel(new ImageIcon(new ImageIcon("E:\\Project\\errorbg.jpg").getImage().getScaledInstance(400, 200, Image.SCALE_SMOOTH)));

		
		setLocationRelativeTo(null);
		JPanel j1 = new JPanel();
		JPanel j2 = new JPanel();
		JPanel j3 = new JPanel();
		JPanel j4 = new JPanel();
		
		JLabel error = new JLabel(new ImageIcon(new ImageIcon("E:\\Project\\warning.png").getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH)));
		JButton b1 = new JButton();
		b1.setIcon(new ImageIcon(new ImageIcon("E:\\Project\\error.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
		b1.setOpaque(false);

		j1.setBounds(25,43, 60, 60);
		j1.setOpaque(false);
		b1.setBorderPainted(false); 
        b1.setContentAreaFilled(false); 
        b1.setFocusPainted(false); 
        b1.setOpaque(false);
		setLocationRelativeTo(null);
		setUndecorated(true);
		j2.setBounds(350, 4, 50, 50);
		j2.setOpaque(false);
		b2 = new JButton("Ok");
//		b2.setBorderPainted(false); 
//      b2.setContentAreaFilled(false); 
//      b2.setFocusPainted(false); 
//      b2.setOpaque(false);
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ErrorFrame.this.dispose();
			}
		});
        
		j3.add(b2);
		j3.setBounds(150, 100, 100, 100);
		j3.setOpaque(false);
		
		
		
		l1 = new JLabel(a);
		l1.setForeground(Color.white);
		l1.setFont(new Font(null,Font.BOLD,14));

		j4.add(l1);
		j4.setOpaque(false);
		
		j4.setBounds(120, 60, 240, 50);
		j1.add(error);
		j2.add(b1);
		Background.add(j1);
		Background.add(j2);
		Background.add(j3);
		Background.add(j4);
		
		add(Background);

		
		
		
		
		Background.setBounds(0, 0, 400, 200);
		
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ErrorFrame.this.dispose();
			}
		});
		
		
		
		
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new ErrorFrame("Password is Incorrect");
	}

}
