package com.class7;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		
		/*
		 *  ask user to enter if if raining or not
		 *  as long as rain  tell user to take umbrella
		 *  as soon as there is no rain== you can go to park
		 * 
		 */

		Scanner scan=new Scanner(System.in);
	     boolean isRain;
	     
	     do {
	    	System.out.println("is it raining"); 
	    	isRain=scan.nextBoolean();
	    	
	     }while (isRain);
	     System.out.println("go to park");
		
		
		
		
	}

}
