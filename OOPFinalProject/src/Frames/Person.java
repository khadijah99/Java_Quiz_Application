package Frames;

import java.io.Serializable;

public class Person implements Serializable {
	private String username;
	private String firstName;
	private String lastName;
	private String dob;
	private String password;
	private String email;
	private String phoneNo;
	private String gender;
	
	public Person(String username, String fname, String lname, String dob, String pass, String email, String phoneNo, String gender) {
		this.username = username;
		firstName = fname;
		lastName = lname;
		this.dob = dob;
		password = pass;
		this.email = email;
		this.phoneNo = phoneNo;
		this.gender = gender;
	}
	
	public Person() {
		
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
