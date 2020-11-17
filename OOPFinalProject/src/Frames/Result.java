package Frames;

import java.io.Serializable;
import java.util.ArrayList;

public class Result implements Serializable{
	ArrayList<AnsweredQuestion> ans = new ArrayList<AnsweredQuestion>();
	Test t;
	
	
	public Result() {
		
	}
	
	public Result(ArrayList<AnsweredQuestion >a ,Test te) {
		ans = a;
		t = te;
	}

	public ArrayList<AnsweredQuestion> getAns() {
		return ans;
	}

	public void setAns(ArrayList<AnsweredQuestion> ans) {
		this.ans = ans;
	}

	public Test getT() {
		return t;
	}

	public void setT(Test t) {
		this.t = t;
	}
	
	public int TotalQuestionAnswered() {
		int count = 0;
		for (int x = 0 ; x < ans.size() ; x++ ) {
			count++;
		}
		return count;
	}
	
	public int ResultCal() {
		int marks = 0;
		for (int x = 0 ; x < ans.size() ; x ++) {
			if(ans.get(x).getSelectedOption().equalsIgnoreCase(Integer.toString(ans.get(x).getQuestion().getCorrectOption())))
				marks += ans.get(x).getQuestion().getMarks();
		}
		return marks;
	}
	
	
}