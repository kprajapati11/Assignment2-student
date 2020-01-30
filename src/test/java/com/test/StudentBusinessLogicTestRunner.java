package com.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class StudentBusinessLogicTestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestStudentBusinessLogic.class);
		System.out.println("TOTAL TEST CASES RUNNING = " + result.getRunCount());
		
		if(result.wasSuccessful()) {
			System.out.println("All Test cases passed test run..");
		}else {
			int failedTestCount = 0;
			for(Failure failure : result.getFailures()) {
				System.out.println(failure.toString());
				failedTestCount +=1;
			}
			System.out.println(failedTestCount + " Test cases Failed");
		}
		
		//System.out.println(result.wasSuccessful());
	}
}
