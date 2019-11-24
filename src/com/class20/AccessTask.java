package com.class20;

public class AccessTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Task obj=new Task();
	
		
		//REVERSE
	String result=obj.reverse("syntax");
	System.out.println(result);
	
	
	
	//POLINDROME
	
	boolean result2=obj.isPolindrome("kayak");
	System.out.println(result2);
	
	
	
	
	//ARRAY
	
	String [] strArray=obj.ArrayofWords("What a beautiful day is today!");
	System.out.println(strArray.length);
	for (String word:strArray) {
		System.out.println(word);
	}
	
	
	
	
	}

}
