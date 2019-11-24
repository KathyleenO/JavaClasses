package com.class21;

public class Student {

	
	public String studentName;
	public double GPA;
	public static String school;
	
	
	public void displayInfo() {
		System.out.println(studentName + " Attending " +school+ " with a GPA of " +GPA);
		
	}
	
	
	protected void study(int hours) {
		System.out.println(studentName+ " Studyig for " +hours);
		
	}
	
	
	
	
	
	
	
}
