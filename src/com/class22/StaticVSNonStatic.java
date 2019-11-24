package com.class22;

public class StaticVSNonStatic {

	
	//Template for student class(school, name, grade)
	
	static String school="Syntax";
	String name;
	char grade;
	
	static String ss="Welcome To Syntax Solutions";
	  
	
	//INSTANCE or NON-STATIC MEthod
	void getInfo() {
		System.out.println("My name is " +name+ "and I am going to " +school+ "and my grade is" +grade);
	}
	
	//STATIC Method
	static void getInfo1() {
		System.out.println(" I am attending classes at " +school +"And my name is " +"name"); //cant Access instance variables
	//System.out.println(" my name is" +name);
	//Compiler will give error on above code bc we CANNOT access NON static members within Static methods
	//BUT non static methods CAN access both non static and static	
	}
	
	public static void main(String[] args) {
		
		//CAN Access static and non static methods with same class by using just the name
		System.out.println(school);
		getInfo1();
		
		System.out.println(StaticVSNonStatic.ss);
	   System.out.println(ss);
		
	}
		

	

}
