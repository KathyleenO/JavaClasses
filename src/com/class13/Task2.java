package com.class13;

public class Task2 {

	public static void main(String[] args) {
		
		/*
		 * Create a String and print it in reverse order (Sunday → yadnuS).
           Create a String and if the String is not empty perform the following: 
           if the String has an odd number of characters and has 3 or more characters, 
           print the character in the middle of the String.
		 * 
		 */
	  //INDEX   0 1 2 3 4 5
	String day="S u n d a y";
	
//	System.out.println(+day.charAt(4)+day.charAt(5));   //worst case
//	
	System.out.println(day.length());  //6  DOES NOT START AT INDEX 0 STARTS AT 1, LENGTH ALWAYS BIGGER THAN INDEX
	
	
	                //6 (-1)=5 INDEX 
	for(int i=day.length()-1; i>=0; i--) {
		System.out.print(day.charAt(i));
	}
	
//	System.out.println(+day.charAt(4)+day.charAt(5));   //worst case
//	
	System.out.println();
	
		
	String cars="abcdefgurwe";
	
	int middle=cars.length()/2;
	
	if(!cars.isEmpty()) {
	 if(cars.length()%2!=0 && cars.length()>=3 ) {
		System.out.println(cars.charAt(middle));
	 }
	
	}
	
	}

}
