package com.class29;

public class Parents {

	
	String str="Hello";
	int age;

	public Parents(int age){
		this.age=age;
	}
	public void hello(){
		System.out.println("Hello");
	}
}
class Children extends Parents{

	Children(int age){
		super(age);
	}
	String str1="Bye";

	public void access(){
		System.out.println(str);   
		System.out.println(super.str);
	}
	public void hello(){
		System.out.println("hello");
	}
	public void display(){
		hello();
		super.hello();
	}

	
	
	

}
