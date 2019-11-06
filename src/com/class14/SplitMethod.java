package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		
		
		// .split() method 
		//splits the string around matches of the given regular expression

		
		String str="Video provides powerful way to help you prove your point ";
	
		String [] array=str.split(" ");
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("****************************");
		//heo can we find how many sentences are in the following string
		
		String str1="Today is Sunday.  Its sunny day. And we are having Java class";
		
	String[]	array2=str1.split("\\.");     //double \\ to recognize it
	System.out.println(array2.length);
		
	for(String string:array2) {
		System.out.println(string.trim());    //trims spaces first and last
	} 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
