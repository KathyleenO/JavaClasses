package com.class15;

public class StringManipulationsRecap {

	public static void main(String[] args) {
		
		
		//  String Class comes in Java Lang packacked
		
		//Literal
		String str="Hello ";
		
		//Second one using new keyword
		
		String str1=new String("Hello");
		
		System.out.println(str);
		System.out.println(str1);
		
		//Find the number of characters in a string
		int length=str.length();
		System.out.println(length);

		
		//case conversation methods
		
		str=str.toLowerCase().toUpperCase();
		System.out.println(str);
		

        //verify if there if the string is Empty
        String myString="";//empty value
        boolean isEmpty=myString.isEmpty();
        System.out.println(isEmpty);
        
        String myString1=null;//no value at all it is equal to 
        // String myString1;
        //System.out.println(myString1.isEmpty());
        
        //how to verify existence of characters in the string
        String a="Good evening students";
        boolean exist=a.contains("student");
        System.out.println(exist);
        
        System.out.println(a.startsWith("Good"));
        System.out.println(a.endsWith("student"));
		
		
		
		
		
		
		
		
	}

}
