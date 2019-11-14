package com.class18;

import java.util.Scanner;

public class BuiltAndUserDefinedMethods {

	public static void main(String[] args) {
		
		// Built in those that computer or Java has saves

		String str="Hello";
		str=str.replace("Hello", "Hi");    //built in methods
		System.out.println(str);
		
		Scanner sca=new Scanner(System.in);  //method
		
		BuiltAndUserDefinedMethods obj=new BuiltAndUserDefinedMethods();
		obj.myMethod();
	}

	
	void myMethod() {
		System.out.println("this is user defined method that i created");
	}
	
	
}
