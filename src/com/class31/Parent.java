package com.class31;

public class Parent {

	static void hello() {
		System.out.println("hello from superclass");
	}
	
	
}
class Child extends Parent{
	static void hello() {
		System.out.println(" child class ");
	}
}