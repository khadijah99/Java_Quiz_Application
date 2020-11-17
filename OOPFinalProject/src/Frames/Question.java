package Frames;

import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.Icon;

public class Question implements Serializable {
	private String question;
	private String qimage;
	private int correctOption;
	private int marks;
	private String options[] = new String[4];
	private boolean optionIsText;
	
	public Question() {
		
	}
	
	public String getQimage() {
		return qimage;
	}

	public void setQimage(String qimage) {
		this.qimage = qimage;
	}

	public boolean isOptionIsText() {
		return optionIsText;
	}

	public void setOptionIsText(boolean optionIsText) {
		this.optionIsText = optionIsText;
	}

	//If question has no image
	public Question(String question, int correctOption, int marks, String[] options, boolean opText) {
		this.question = question;
		this.correctOption = correctOption;
		this.marks = marks;
		this.options = options;
		optionIsText = opText;
	}
	
	//If question has image
	public Question(String question,String qimage, int correctOption, int marks, String[] options, boolean opText) {
		this.question = question;
		this.qimage = qimage;
		this.correctOption = correctOption;
		this.marks = marks;
		this.options = options;
		optionIsText = opText;
	}
	
	public int timeAllocated() {
		return marks*60;
	}
	
	
	public String Difficulty() {
		if (timeAllocated() <= 60) {
			return "Easy";
		}
		else if (timeAllocated() > 60 && timeAllocated() < 180) {
			return "Medium";
		}
		
		else {
			return "Hard";
		}
	}
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	public int getCorrectOption() {
		return correctOption;
	}
	public void setCorrectOption(int correctOption) {
		this.correctOption = correctOption;
	}
	
	

}