package com.class30;

public interface Driveable {
   //public static final variables, can NOT change them
	
	boolean DRIVE_FAST=true;  //Constant variables are UPPER CASE
	
	// like this or by default compiler add public abstract
	//public abstract void drive();
	
	void drive();
	
	
}
class Cars {
	
	public void stop() {
		System.out.println("Car Stops by pressing breaks");

	}
	
	
}

class Toyota extends Cars implements Driveable{

	@Override
	public void drive() {
		System.out.println("toyota can drive");
		
		
	}
}