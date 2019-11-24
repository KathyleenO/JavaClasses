package com.class22;

public class InstanceVaribales {

	
	String name="SAmir";
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		String name="Burcu";
		System.out.println(name);
		
		InstanceVaribales obj=new InstanceVaribales();
		
		System.out.println(obj.name);
		obj.name="jOhn";   //changing value of instance name variable
		System.out.println(obj.name);
		
		InstanceVaribales obj1=new InstanceVaribales();
		System.out.println(obj1.name);   //Value will be samir
		
	}

}
