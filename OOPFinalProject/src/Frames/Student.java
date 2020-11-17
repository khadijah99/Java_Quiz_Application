package Frames;

import java.io.Serializable;
import java.util.ArrayList;

public class Student extends Person implements Serializable {
	private ArrayList<Result> r;
	
	public Student() {
		
	}
	
	public Student(String username, String fname, String lname, String dob, String pass, String email, String phoneNo, String gender,ArrayList<Result> s1) {
		super(username, fname, lname, dob, pass, email, phoneNo, gender);
		r = s1;
	}
	
	

	public ArrayList<Result> getR() {
		return r;
	}

	public void setR(ArrayList<Result> r) {
		this.r = r;
	}

	
}