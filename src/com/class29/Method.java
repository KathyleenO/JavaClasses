package com.class29;

public abstract class Method  {

	public abstract void method1();
	
	public abstract void method2();
	
}
class Main extends Method {
	
	
	
	public static void main(String[] args) {
		Main obj=new Main();
		obj.method1();
		obj.method2();
		
	}

	@Override
	public void method1() {
		 System.out.println("hi");
		
	}

	@Override
	public void method2() {
		System.out.println("bye");
		
	}
	
}