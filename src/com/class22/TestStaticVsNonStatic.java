package com.class22;

public class TestStaticVsNonStatic {

	public static void main(String[] args) {
		// how to access Static Members
		//By CLASS NAMe
		
		
	System.out.println(StaticVSNonStatic.school);
	StaticVSNonStatic.getInfo1();
		
	//How to access NON static methods
	//CREATE AN OBJECT
	
	
	StaticVSNonStatic obj=new StaticVSNonStatic();
	obj.name="john";
	obj.grade='A';
	obj.getInfo();
	//obj.getInfo1(); STATIC method possible to access but NOT preferable
	
	RepsAccesModifiers obj1=new RepsAccesModifiers();
	
          obj1.m9();
	
	
	}

}
