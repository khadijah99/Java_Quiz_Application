package Frames;

import java.io.Serializable;

public class AnsweredQuestion implements Serializable {
	private Question question;
	private String selectedOption;
	private String Testname;
	
	
	public AnsweredQuestion() {
		
	}
	
	public AnsweredQuestion(Question  q, String s) {
		question = q;
		selectedOption = s;
		
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getSelectedOption() {
		return selectedOption;
	}

	public void setSelectedOption(String selectedOption) {
		this.selectedOption = selectedOption;
	}
	
	
}
