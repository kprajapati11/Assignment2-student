package model;

import java.util.List;

public class StudentBusinessLogic {
	
	public String findStudentType(Student student) throws Exception {
		return student.getStudentType();
	}

	public boolean hasAssistanceship(Student student) throws Exception {
		double averagScore = findAvgScore(student.getScores());
		if(averagScore >= 85.00) {
			return true;
		}
		return false;
	}
	
	private static double findAvgScore(List<Double> scoreList) {
		double sumOfScores = 0.0;		
		for(double score : scoreList) {
			sumOfScores = sumOfScores + score;
		}
		System.out.println(sumOfScores);
		return (sumOfScores / scoreList.size()) ;
					
	}
}



	