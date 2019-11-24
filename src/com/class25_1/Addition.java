package com.class25_1;

public class Addition {

	//METHOD OVERLOADING= can happen by having SAME method NAME but different A
	//MOUNT of PARAMETERS Or DIFFERENT DATATYPEs
	
	public void add (int num1, int num2 ) {
		System.out.println(num1+num2);
	}
	public void add (int num1, int num2 ,int num3) {
		
	}
	
	 //Or DIFFERENT DATATYPEs
	public void add(double num1, double num2) {
		
	}
	public void add (int num1, double num2) {
		
	}
	
	//OVERLOADING DOES NOT WORK WITH RETURN TYPE
	
//	int add(int num1, int num2) {
//		return num1+num2;
//	}
//	
//	public void add (int num1, int num2 ) {
//		System.out.println(num1+num2);
//	}
}
