package com.class15;

public class StringManipulationQUiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String  str=" ";
		String str2="  koo";
	
		
		System.out.println(str2.trim());
		System.out.println("0000000");
		
		 String c = "Hello i love java";
		  boolean var;
		  var = c.startsWith("hello");
		  System.out.println(var);
		
		System.out.println();
		 
		String obj = "I LIKE JAVA";
		  System.out.println(obj.charAt(3));
		  
		  System.out.println();
		  String str3 = "0123456789";
		  System.out.println(str3.substring(4));
		
		System.out.println();
		
		    String word ="abrakadabra";

		      String replace=word.replaceAll("[^aAeEiIoOuU]", " ");

		      System.out.println(replace);

		
		
		
		
		      String str_Sample = "RockStar";
		      System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));

		
		
		
		
		
	}

}
