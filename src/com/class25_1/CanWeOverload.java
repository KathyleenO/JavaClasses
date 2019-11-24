package com.class25_1;

public class CanWeOverload {

//can overload private method? YES
     
	private void mathodOne() {
		System.out.println("I am method one");
	}
     private void mathodOne(String str) {
 		System.out.println("I am method one " +str);
 	}
	
	//can we overload a main method? YES
     
    
	public static void main(String str) {
		System.out.println(" I am a main method with String argument");
	}
	
	public static void main(String str, String[] arg) {
		System.out.println(" I am a main method with 2 parameters");
	}
	//ONLY THIS PRINTS 
	public static void main (String [] args) {
		System.out.println("I am a main method with String Arrays");
		main("String");
		
		String [] array= {"A", "B"};
		main("Hello", array);
	}
	
}
