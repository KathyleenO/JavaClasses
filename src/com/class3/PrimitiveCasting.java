package com.class3;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
/// casting change datatypes to another dataype
		
		double d=12;
		System.out.println(d);
		
		// int i=12.0; /compile time error
		
		// WIDENING/IMPLICIT/AUTOMATIC
		byte b=127;
		int i=b;
		
		int num=123;
		double d1=num;
		System.out.println(d1);
		
		//NARROWING/EXPLICIT/MANUALLY
		
		double d2=123.56;
		int num2=(int)d2; //casting d2 to int
		System.out.println(num2);
		
		int num3=1000;
		byte b1=(byte)num3;
		System.out.println(b1);
		
		

	    double num1=5f;
	    double num4=2f;
	    
	    double div=num1/num4;
	    
	    System.out.println(div);
		
		
		
	}

}
