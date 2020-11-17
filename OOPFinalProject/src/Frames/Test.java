package Frames;

import java.io.Serializable;
import java.util.ArrayList;

public class Test implements Serializable{
	private String testName;
	private String totalTime;
	private int totalMarks;
	ArrayList<Question> questions = new ArrayList(0);
	
	public Test() {
		
	}
	
	public Test(String name, String time, int marks, ArrayList<Question> questions) {
		testName = name;
		totalTime = time;
		totalMarks = marks;
		this.questions = questions;
	}
	
	public String calDifficulty() {
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		for (int x = 0 ; x < questions.size() ; x++) {
			if (questions.get(x).Difficulty().equalsIgnoreCase("Hard")){
				count1++;
			}
			else if (questions.get(x).Difficulty().equalsIgnoreCase("Medium")){
				count2++;
			}
			else if (questions.get(x).Difficulty().equalsIgnoreCase("Easy")){
				count3++;
			}
		}
		
		if (count1>count2 && count1 > count3) {
			return "Hard";
		}
		

		else if (count2>count1 && count2 > count3) {
			return "Medium";
		}
		

		else{
			return "Easy";
		}	
	}
	
	
	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
	}

	public int getTotalMarks() {
		totalMarks = 0;
		for(int i=0; i<questions.size(); i++)
			totalMarks+= questions.get(i).getMarks();
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public ArrayList<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}
	
	public int getTotalQuestions() {
		int count = 0;
		for (int x = 0 ; x < questions.size() ; x++) {
			
			if (questions.get(x) != null){
				count++;
			}
		}
		return count;
	}

	

}