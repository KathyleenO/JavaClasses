package com.class5;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean traffic=true;
		
		if(!traffic) {   //not true so it equals false  if traffic=true then its false with !traffic
			System.out.println("On time"); //using ! we are reverting condition
		}else {
			System.out.println("late");
		}
		
		boolean isRain=false;
		if(!isRain) {      //not false so its TRUE
			System.out.println("take umbrella");
		}else {
			System.out.println("dont take umbrella");
		}
		
		//lets compare 2 numbers using NOT operators
		
		int num1=10;
		int num2=11;
		
		if(num1==num2) {
			System.out.println("Numbers are equal");
		}else {
			System.out.println("Numbers are NOt equal");
		}
		
		
		if(!(num1==num2)) {
			System.out.println("Numbers are NOT equal");
		}else {
			System.out.println("Numbers are equal");
		}
		
		
		//If name is not Mary or Anna then your NOT my sister with STRING
		
		String name="Mary";
		String name2="Anna";
		
		if(!(name.equals("Mary") || name.equals("anna"))) {
			System.out.println("You are not my sister");
		}else {
			System.out.println("you are my siter");
		}
		
	}

}
