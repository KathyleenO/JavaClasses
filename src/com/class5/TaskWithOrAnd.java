package com.class5;

public class TaskWithOrAnd {

	public static void main(String[] args) {
		/*
		 * Write a program that will print whether it is a weekend or weekday. If any
		 * day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a
		 * weekend”, any other day → output “Invalid day”
		 * 
		 * 
		 * Prompt the user to enter person heights in inches. Person should be
		 * classified as one of the following: short (under 5 feet) medium(5 to 6 feet)
		 * tall (6 feet and over)
		 * 
		 *
		 * 
		 */

		
		int day=5;
		
		if(day==1 || day==2 || day==3 || day==4 || day==5) {
			System.out.println("Weekday");
		}else if(day==6 || day==7) {
			System.out.println("Weekend");
		}else {
			System.out.println("Invalid");
		}
		
		double height=5.5;
		
		if(height<5) {
			System.out.println("short");
		}else if (height>=5 && height<=6){
			System.out.println("Medium");
		}else if(height>=6) {
			System.out.println("Large");
		}
		
		
		
		
	}

}
