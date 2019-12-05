package com.class27;

public class Student {

	String studentID;
	
	void homework() {
	System.out.println("Students do homework");	
	}
	void study() {
		System.out.println("Students study ");
	}
	void prepare() {
		System.out.println("Students prepare for class");
	}
	
	
}
class syntaxStudentt extends Student{
	
	void homework() {
		System.out.println("Syntax students do coding  homework");	
		}
	void code() {
		System.out.println("We know how to code");
	}
	
}
class CollegeStudent extends Student{
	
	void homework() {
		System.out.println("College students donnt like homework");	
		}
	
	void study() {
		System.out.println("College student study before a test ");
	}
	void loans() {
		System.out.println("wasted my money on loans");
	}
}
class SchoolStudent extends Student{
	void homework() {
		System.out.println("School students do 5 subject homework");	
		}
	void study() {
		System.out.println("School students cram  study before test ");
	}
	
	void tutor() {
		System.out.println("I am a math tutor");
	}
	void prepare() {
		System.out.println("School Students Sometimes prepare for class");
	}
	
}
