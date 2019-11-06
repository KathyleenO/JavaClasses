package com.class12;

public class ReplaceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String str="Hello Dear, how are you?";
		
		System.out.println(str.replace('e','z'));   //replace all n to z       
		System.out.println(str.replace("Dear", "Ben"));
		System.out.println(str.replaceFirst("Dan", "Ali"));  //first Dan
		
		
		String str1="12-22-1990";
		System.out.println(str1.replace("-", "/"));
		System.out.println(str1.replaceAll("-", "/"));
		
		
		
	
		
		
		
	}

}
