package com.class4;

public class NestedIf1 {

	public static void main(String[] args) {
		// Brackets of FIRST IF PUT ON THE ELSE
		// TRUE 

	
		//EXAMPLE 1
		
		boolean b=false;
	boolean classToday=false;
	
	if (b) {
	System.out.println("hello");	
   
	if (classToday)	{
		System.out.println("hello friends");
   }
	}else {
		System.out.println("bye");
	}	
	
	System.out.println(" continue coding ");
	
	
	// EXAMPLE 2
	boolean ifFriday=true;
	int day=13;
	
	if (ifFriday) { //IF THIS IS TRUE IGNORE THE NESTED IF AND ELSE
		System.out.println("Today is Friday");
	if (day==13) {
		System.out.println("I will watch scary movie");
	}
		
	}else {
		System.out.println("Not Friday ");
	}
	
	
	
	
	
	
	
	
	
	}

}
