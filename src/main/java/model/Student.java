package model;

import java.util.List;

public class Student {
	private String name;
	private String phone;
	private List<Double> scores; 
	private String studentType;
	private double average;
	
	public Student(){
		
	}
	
	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Double> getScores() {
		return scores;
	}

	public void setScores(List<Double> scores) {
		this.scores = scores;
	}

	public String getStudentType() throws Exception{
		if(studentType==null) {
			throw new NullPointerException("Exception occured because student type is null");
		}
		return studentType;
	}

	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}
	
	
}
