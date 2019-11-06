package com.class13;

public class InterviewMust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1="Hello";    // this 2 str1 and str2 makes 1 memory space or same object bc same value
		String str2="Hello"; 
		
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1==str2);  //true
		
		String str3=new String ("Bye");   //creates new object store new memory
		String str4=new String("Bye");   //creates new object store in new space memory 
		
		
		//comapares reference variable or object  must compare str3==str4 to be TRUE 
		
		System.out.println(str3.equals(str4)); //true
		System.out.println(str3==str4);  //false
		
		
		
		String city="Fairfax";
		String city1="Fairfax";
		
		 String newCity=city.toUpperCase();    //if you store in new object you can use it later        1 WAY
			System.out.println(city.toUpperCase());   // IF NOT YOU can NOT use this variable AGAIN     2 WAY
			System.out.println(newCity);
		
		
		
	}

}
