package com.class12;

public class StringManipulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//First Way
		String name="john";
		System.out.println(name);
		System.out.println(name.length());
		
		
		//Second way
		
		String name1=new String("John1");
		
		System.out.println(name1);
	
		//using an INT datatype
		int name1Len=name1.length();
		System.out.println(name1Len);
		
		
		//Changing Caps to lower Case
		
		String str1="HELLO WORLD";
		System.out.println("before " +str1);
		str1=str1.toLowerCase();
		System.out.println("after " +str1);
		
		
		//COMPARING STRINGS
		
		String str2="Hello World";
		boolean isEquals= str2.equals(str1);
		System.out.println(isEquals);           //FALSE
				
		//COMPARING WITHOUT CARING OF LOWER CASE OR UPPER CASE
		
		boolean equals=str2.equalsIgnoreCase(str1);
		System.out.println(equals);            //TRUE
		
		
		// FROM LOWERCASE TO UPPER CASE ALL
		
		String str3="Mohamed";
		System.out.println("before " +str3);
		str3=str3.toUpperCase();
		System.out.println("after " +str3);
		
		
	}

}
