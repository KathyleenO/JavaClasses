package com.class15;

public class StringMoreExamples {

	public static void main(String[] args) {
		
		
//		// get a character at specific location
//		String str="Syntax Technologies";
//		
//		
//		char letter=str.charAt(5);
//		System.out.println(letter);
//
//		//System.out.println(str.charAt(str.length()));   //out of bounds exception does not have character 19
//		System.out.println(str.charAt(str.length()-1));   //Here it works bc 19-1
//		
//		
//		//get a substring from a String
//		
//		
//		String sub=str.substring(0, 6);
//		System.out.println(sub);
//		
//		String sub2=str.substring(7);
//		System.out.println(sub2);
		
		
		//get a character at specific location
        String str="Syntax Technologies Inc";
        
        char letter=str.charAt(5);
        System.out.println(letter);
        //length =19
        //System.out.println(str.charAt(str.length()));//StringIndexOutOfBoundsException
        System.out.println(str.charAt(str.length()-1));
        
        //get a substring from a String
        //Syntax
        String substr1=str.substring(0, 6);
        System.out.println(substr1);
        //Technologies Inc
        String substr2=str.substring(7);
        System.out.println(substr2);
		
		
		
		
		
		
	}

}
