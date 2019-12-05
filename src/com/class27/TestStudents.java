package com.class27;

public class TestStudents {

	public static void main(String[] args) {
		
		Student std1=new syntaxStudentt();
		String st=std1.studentID="Student1";
		System.out.println(st);
		std1.homework();
		std1.prepare();
		std1.study();
		
		Student std2=new CollegeStudent();
		String std=std2.studentID="Student 2";
		System.out.println(std);
		std2.homework();
		std2.study();
		std2.prepare();
		
		Student std3=new SchoolStudent();
		String stdd=std3.studentID="Student 3";
		System.out.println(stdd);
		std3.homework();
		std3.prepare();
		std3.study();
	}

}
