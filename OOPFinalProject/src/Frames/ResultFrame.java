package Frames;

import java.util.ArrayList;

import javax.swing.*;

public class ResultFrame extends JFrame {
		public ResultFrame(Student s) {
			setSize(600, 600);
			
			String header [] = {"Test","Attempted Questions","Total Questions", "Total Marks", "Marks Obtained"};
			
			String data [] [] = new String [s.getR().size()][5];
			
			for (int x = 0 ; x < s.getR().size() ; x++) {
				data[x][0] = s.getR().get(x).getT().getTestName();
			}
			
			for (int x = 0 ; x < s.getR().size() ; x++) {
				data[x][1] = Integer.toString(s.getR().get(x).TotalQuestionAnswered());
			}
		
			for (int x = 0 ; x < s.getR().size() ; x++) {
				data[x][2] = (s.getR().get(x).getT().getTotalQuestions()-1+" ");
				
			}
	
			for (int x = 0 ; x < s.getR().size() ; x++) {
				data[x][3] = Integer.toString(s.getR().get(x).getT().getTotalMarks());
				
			}
			
			for (int x = 0 ; x < s.getR().size() ; x++) {
				data[x][4] = Integer.toString(s.getR().get(x).ResultCal());
				
			}
			
			
			
			
			
			JTable tab = new JTable(data, header);
			
			add(tab);
			add(new JScrollPane(tab));
			

			setVisible(true);
		
}
}
