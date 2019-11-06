package com.class3;

public class IfElseTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DCreate a Java program and name it Double Comparison. 
		//Declare 2 double values and if value of 
		//first variable is higher then print “Double value __ is larger than __ .” 
		//Otherwise print..
		
		//Create a Java program and name it Temperature Check. 
		//Create variable to store temperature. Your program should check 
		//if temperature is below 32 then it should print 
		//“Water will freeze with temperature __”, otherwise 
		//“Water will NOT freeze with temperature __”.
		
		
		//DOUBLE COMPARISON
		
		double num1=5.5;
		double num2=10.9;
		
		if (num1>num2) {
			System.out.println("Double value " +num1+ " is Larger than " +num2);
		}else {
		System.out.println("Not larger");	
			
		}
	
		//Temperature Check
		
		double temperature=32.0;
		double temp2= 40.0;
		
		if (temp2<temperature) {
			System.out.println("water will freeze with temperature");
		}else {
			System.out.println("Water will not freeze with temperature");
		}
		
		//diferent way to write 
		
		boolean val=false;
		if (val) {
		System.out.println("hello");
		}else {
			System.out.println("bye");
		}
	}

}
