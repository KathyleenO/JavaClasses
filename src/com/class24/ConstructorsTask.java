package com.class24;

public class ConstructorsTask {

	String name, city, lenguage, str;
	int num1, num2;
	
	
	public ConstructorsTask(int num1, int num2) {
		System.out.println(" I am publlic ");
	}
	
	 ConstructorsTask(String str, String city) {
		System.out.println(" I am default ");
	}
	
   private ConstructorsTask() {
	
	System.out.println(" I am private constructor");
}
	
   //CANNOT MAKE A METHOD STATIC 
//	static ConstructorsTask(String name2) {
//		System.out.println("Static Cosntructor");
//	}
	
	protected ConstructorsTask(int num1) {
		System.out.println(" I am protected");
	}
	
	
	
	public static void main(String[] args) {
		ConstructorsTask obj1=new ConstructorsTask(8, 9);
		ConstructorsTask obj2=new ConstructorsTask("HOnduras" ,"Tegu");
		ConstructorsTask obj3=new ConstructorsTask();
		ConstructorsTask obj4=new ConstructorsTask(9);
		
		
	}
	
}
