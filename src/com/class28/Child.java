package com.class28;

public class Child extends Parent {

	String name="James";
	
	
	public void callName() {
		System.out.println(name);   //JAmes //PRINTS FROM CHILD
		System.out.println(super.name); //JOhn  //PRINTS FROM PARENT
		System.out.println(lastName);//Snow
		
	}
	public void CallingMethod() {
		this.callName();//By default this is added so we are calling current class method
		super.callName();
	}
	
	public static void main(String[] args) {
		Child obj=new Child();
		obj.callName();
		System.out.println("___ _ ______");
		obj.CallingMethod();
		
	}
}
