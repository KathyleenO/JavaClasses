package com.class12;

public class StringManipulation2 {

	public static void main(String[] args) {
		
		
		// .contains is CASE SENSETIVE
		//can do one character or sequence 
		
		String sentence="It was raining";
		String sen="raining";
		System.out.println(sentence.contains(sen));  //  TRUE can look for sequence of characters
		System.err.println(sen.contains(sentence)); // FALSE
		
		System.out.println(sentence.contains("w"));  //TRUE
	   System.out.println(sentence.contains("Was")); //FALSE can give one  or sequence of characters
		
		
	   //TEST IF STRING STARTS WITH SPECIFIED PREFIX
	  
	   String str="It is very hot in the class today";  
	   System.out.println(str.startsWith("It"));     //TRUE
	   
	   //TEST IF STRING ENDS WITH SPECIFIED PREFIX
	   
	   System.out.println(str.endsWith("today"));  //TRUE
		System.out.println(str.endsWith("class"));  //FALSE
		
	System.out.println("CHECKS IF STRING IS EMPTY OR NOT");
		
		String str1="";
		String  str2="Hello";
		System.out.println(str1.isEmpty());  //TRUE
		System.out.println(str2.isEmpty());  //FALSE
		
		
		
		
		
		
		
		
		
	}

}
