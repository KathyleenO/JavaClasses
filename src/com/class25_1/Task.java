package com.class25_1;

public class Task {

	static void method(String str) {
		System.out.println("first");
	}
	static void method(String str, int num1) {
		System.out.println("num argument");
	}
	static void method(char a, int b) {
		System.out.println("char argument");
	}
	
	
	private void method2(int num1) {
		System.out.println( );
	}
	private  void method2(String str) {
		System.out.println("sentence");
	}
	private void method2(boolean f) {
		System.out.println("true");
	}
	
	public static void main(String[] args) {
		method("first");
		method("Hola", 7);
		method('K', 8);
	
		Task obj=new Task();
		obj.method2(9);
	obj.method2(true);
	obj.method2("kathy");
		
		
	}
	
	
	
}
