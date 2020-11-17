package Frames;

import java.io.Serializable;
import java.util.ArrayList;

public class Admin extends Person implements Serializable{
	ArrayList<String> testsCreated = new ArrayList<String>();
	
	public Admin() {
		
	}
	
	public Admin(String username, String fname, String lname, String dob, String pass, String email, String phoneNo, String gender,ArrayList<String> t1) {
		super(username, fname, lname, dob, pass, email, phoneNo, gender);
		testsCreated = t1;
	}

	public ArrayList<String> getTestsCreated() {
		return testsCreated;
	}

	public void setTestsCreated(ArrayList<String> testsCreated) {
		this.testsCreated = testsCreated;
	}
	
	

}
