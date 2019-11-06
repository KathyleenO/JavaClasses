package com.class13;

public class Recap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// how to write String Literal
		String str1="Fairfax";  

		//String second way
		String str2=new String("Hello");       
		
		//concat
		String print=str1.concat("World");
        System.out.println(print);
		
		
		
		String str4="Hello";   
		String str5="Hello";
	
		//CONTAINS
		
		System.out.println(str4.contains("ll"));
		
		System.out.println("STARTS WITH AND ENDS WITH");
		
		String str6="Today is Saturday";
		System.out.println(str6.startsWith("Today"));
		System.out.println(str5.endsWith("day"));
		
		
		System.out.println("*******CONCAT IS SAME AS + *********");
		
		System.out.println(str6.concat("and we have java class"));
		
		
		System.out.println("*****TRIM REMOVE SPACES START AND END");
		
		
		String str7= "     It is sunny   ";
		
		System.out.println("Before triming " +str7);
		System.out.println(str7.trim());
		
		System.out.println("========= Index Of and CharAt=========");
		
		String str8="tomorrow we will be done with String Manipulation";
		System.out.println(str8.indexOf('e'));     // index of first with this method or "E" character not present -1
		System.out.println(str8.indexOf("String")); //input words
		System.out.println(str8.indexOf('e', 11));  //look for character 'e' start after index 11
		
		System.out.println(str8.charAt(5));       //Or put number of index and gives you the character at that index
		
		
	}

}
