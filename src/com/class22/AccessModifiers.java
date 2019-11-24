package com.class22;

public class AccessModifiers {

	//CAN ACCESS ANYWHRE IN SAME PROJECT   ;WORLD
	public static String langauge="java class";
	
	//CAN ACCESS ANYWHRE IN SAME PROJECT  ;WORLD
	public static void hello() {
		System.out.println("hello");
	}
	//CAN ONLY ACCESS ON SAME PACKAGE  IMPORT CLASS  ;COUNTRY
	protected static void hello1() {
		System.out.println("hello1");
	}
	//CAN ONLY ACCESS ON SAME PACKAGE  IMPORT CLASS ;COUNTRY
	static void hello2() {
		System.out.println("hello2");
	}
	//CANNOT ACCESS ANYWHRE ONLY HERE SAME CLASS AND PACKAGE  ;HOUSE
	private static void hello3() {
		System.out.println("hello3");
	}
	
}
