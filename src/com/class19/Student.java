package com.class19;

public class Student {

	String getGrade (int score) {
	String result;
		
		if(score>90) {
			result="A";
		}else if(score>80) {
			 result="B";
		}else if(score>70) {
			result="C";
		}else if(score>50) {
			 result="D";
		}else {
			result="F";
	
		}
		return result;
	}
	
	public static void main(String [] args) {
		
		Student Scores=new Student();
		
		String a=Scores.getGrade(100);
		System.out.println(a);
	}
	
	
	
	
	
}
