package com.class32;

public class WrapperClasses {

	public static void main(String[] args) {
		
		int num=10;
		
		//Auto-Boxing === converting PRIMITIVE type into OBJECT Type
		Integer integer=100;
		System.out.println(Integer.MIN_VALUE);
		String str=integer.toString();
		System.out.println(str);
		
		//converting boolean primitive type into Boolean Object Type
		Boolean bool=true;
		
		Byte b=20;
		System.out.println(b.MAX_VALUE);
		
	
		//Auto-Unboxing ====Converting OBJECT to Primitive 
       
		int num1=new Integer(10);
         System.out.println(num1);
		
		
		
		
	}

}
