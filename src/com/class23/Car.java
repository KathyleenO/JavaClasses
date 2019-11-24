package com.class23;

public class Car {
/* we want to build toyota cars that 
 * will have different models and colors
 * 
 */
	public static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	public void getDetail() {
		
		System.out.println(" I build " +color+  " "  +make+ " "+ model);
		System.out.println("My car has "+doors+" doors and can have speed up to "+speed );
	
	}

	
	
}
