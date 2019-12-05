package com.class25_1;

public class Programming {

	 void m1() {
		System.out.println("I love programming language");
	}
	 void m1(String str) {
		System.out.println("I love " +str);
	}
	
	 
	 int num1;
	public static void main(String[] args) {
		
		//CALL BY OBJECT OR 
		Programming obj=new Programming();
		obj.m1();
		obj.m1("Java");
		
		//CALL BY MAKING METHOD STATIC AND CALL AS FOLLOWS
		
		//m1();
		//m1("Java");
		
		
	}
}
