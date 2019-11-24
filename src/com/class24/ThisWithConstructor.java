package com.class24;

public class ThisWithConstructor {

	ThisWithConstructor(){
		System.out.println(" I am non argument constructor");
	}
	
	ThisWithConstructor(String str){
		this();//MUST ALWAYS BE FIRST
		//this.(); CANNOT CALL MORE THAN ONCE
		System.out.println(" I am constructor with 1 string parameter");
	}
	ThisWithConstructor(String str, String str2){
		this(str);
		
		System.out.println("two string consstructor");
	
	}
	public static void main(String[] args) {
		
		
		ThisWithConstructor obj=new ThisWithConstructor("hello");
		//can we execute 2 constructor at the same time
		//YES - it can be achived using this() keyword
		
		ThisWithConstructor obj1=new ThisWithConstructor("hello", "Bye");
		
		
		
	}
	
}
