package com.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import model.Student;
import model.StudentBusinessLogic;

public class TestStudentBusinessLogic {
	private StudentBusinessLogic studentBusinessLogic;
	private static Student student;
	
	@Before
	public void setUp() throws Exception {
		student = createStudent();
		studentBusinessLogic = new StudentBusinessLogic();
	}
	
	
	@Test
	public void testFindStudentType() throws Exception {
		String expected = "Online";
		String actual = studentBusinessLogic.findStudentType(student);
		assertEquals(expected, actual);
		
	}
	
	@Test(expected=Exception.class)
	public void testException() throws Exception{
		String expected = "OnCampus";
		student.setStudentType(null);
		String actual = studentBusinessLogic.findStudentType(student);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testHasAssistanceship() throws Exception{
		boolean expected =  true;
		boolean actual = studentBusinessLogic.hasAssistanceship(student);
		assertTrue(actual == expected);
		
	}
	
	@Test
	public void testDoesNotHaveAssistanceship() throws Exception{
		boolean expected =  true;
		boolean actual = studentBusinessLogic.hasAssistanceship(student);
		assertFalse(actual == expected);
		
	}
	

	//create student object for testing	
	private static Student createStudent() {
		Student student = new Student();
		student.setName("Tina");
		student.setStudentType("Online");
		student.setPhone("515-123-2345");
		student.setScores(createScores());
		return student;
	}
	
	private static List<Double> createScores(){
		List<Double> scoreList = new ArrayList<Double>();
		scoreList.add(8.00);
		scoreList.add(68.00);
		scoreList.add(90.00);
		scoreList.add(75.00);
		scoreList.add(8.00);
		
		return scoreList;
	}
	

}

