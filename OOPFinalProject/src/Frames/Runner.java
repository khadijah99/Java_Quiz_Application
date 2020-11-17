package Frames;

import java.util.ArrayList;

import javax.swing.Icon;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MainFrame m1 = new MainFrame();
	//	AdminLoginFrame m2 = new AdminLoginFrame();
	String a = "Wrong Password!";
		//ErrorFrame e1 = new ErrorFrame(a);
	//	RegistrationFrame e2  = new RegistrationFrame();
	//QuestionFrame q = new QuestionFrame();
	ArrayList<Object> o = new ArrayList<Object>();
	
	new MainFrame();
	
	ArrayList<Test> q3 = HelperClass.readAllData();
	
	Test q4 = q3.get(0); 
	
	ArrayList<Question> q = q4.getQuestions();
	
	
	
//QuestionFrame c = new QuestionFrame(q, 1);


	
	

	
	}
	}


