package com.class23;

public class ConstructorDemo {

	
	ConstructorDemo(){
	System.out.println(" I am your constructor");	
		
	}
	ConstructorDemo(String str){
		System.out.println(" I am your constructor with 1 paremeter" +str);	
			
		}
    ConstructorDemo(int num) {
        System.out.println("I am constructor with 1 int parameter " + num);
    }
    ConstructorDemo(int num, String str) {
        System.out.println("I am constructor with 2 int parameter " + num);
    }
	public void hello() {
		System.out.println("hello class");
		System.out.println("hello instructors");
	}
	
	public void hello(String str) {
		System.out.println("hello class1" +str);
		System.out.println("hello instructors1");
	}
	
	
	public static void main(String[] args) {
		
		
		ConstructorDemo obj=new  ConstructorDemo();
		System.out.println("Code after constructor");
		
		obj.hello("hola");
	     
		ConstructorDemo obj2 = new ConstructorDemo(123, "String");
	    
		
		
		
	}

}
