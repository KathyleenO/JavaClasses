package com.class24;

public class ThisKeyword {

	
	int a,b;
	public ThisKeyword(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public void sum(int a, int b) {
		System.out.println("the sum of local parameter is " + (a+b));
		System.out.println("the sum of instance variables is " +(this.a+this.b));
	}
	public ThisKeyword() {
		System.out.println(" i am non argument consgtructor");
	}
	public void sayA() {
		System.out.println(a);
	}
	public void sayB() {
		System.out.println(b);
	}
	public void sayAandB() {
		this.sayA();//can be use but not recommended compiler already puts this.sayA
		sayB();
	}
	public static void main(String[] args) {
	
		ThisKeyword obj=new ThisKeyword(5,10);
		obj.sum(10,20);
		obj.sayA();
		obj.sayB();
		obj.sayAandB();
		
		System.out.println("****** this is non argument printing");
		
		ThisKeyword obj2=new ThisKeyword();
		obj2.sum(100, 200);
		
		System.out.println("Another variable");
		ThisKeyword obj3=new ThisKeyword(20,20);
		obj3.sum(100, 200);
		
		
		
	}
	
	
	
}
