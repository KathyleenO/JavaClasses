package com.class12;

public class RegularExapression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		/*
		 * print only text and not numbers
		 */
				
				String str="14234Hel45645lo465456";//Hello
				
				System.out.println("=====================");
				
				System.out.println(str.replaceAll("[0-9]", ""));//Leave only text  1.regular expression 2.string two arguments
				System.out.println("=====================");
				
				System.out.println(str.replaceAll("[a-zA-Z]", ""));//Leave only numbers 1423445645465456
				System.out.println("=====================");
	
				//Remove everything except text and numbers
				
		         String str2="Hi#$%How#$%#$4356346";
				System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));   //^NOT
				System.out.println("=====================");
				
				System.out.println(str2.replaceAll("\\w", ""));

		
		
		
		
		
		
		
		
		
		
	}

}
