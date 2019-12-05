package com.class24;

public class Final {

	/*Create the two final method with same name
	First method with boolean parameter
	Second method with String parameter

	code to print below sentences. 

	call them in main method

	output would 
	*/
	
	public static void main(String[] args) {
		Final f=new Final();
		f.kathy(false);
		f.kathy("f");
	}
	
	final void kathy(boolean n) {
		System.out.println("Final method with boolean parameter");
	}
	
	final void kathy(String str) {
		System.out.println("Final method with string parameter");

	}
}
