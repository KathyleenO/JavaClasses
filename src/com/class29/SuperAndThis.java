package com.class29;

public class SuperAndThis {

	public static void main(String[] args) {

		Child obj = new Child();
		obj.m2();
	}
}

class Parent {
	public void m1() {
		System.out.println("m1 method in parent class");
	}
}

class Child extends Parent {

	public void m1() {
		System.out.println("m1 method in child class");
	}

	public void m2() {
		this.m1();
		super.m1();
	
	
	}
}
