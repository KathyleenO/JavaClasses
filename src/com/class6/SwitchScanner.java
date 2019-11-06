package com.class6;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		/*ask user where they are from 
		 * case on country we will specify favorite food
		 * 
		 * 
	
		 */

	String country, foodName;
	Scanner scan;
	
	scan=new Scanner(System.in);
	System.out.println("Please enter your country");
	country=scan.nextLine();
	
	switch(country) {
	
	case "turkey":
	foodName="Kebab";
	break;
	
	case "Ethiopia":
		foodName="tibs";
		break;
	case "Morocco":
		foodName="Tajin";
		break;
	case"Kazakhstan":
		foodName="Kumis";
		break;
	case "Pakistan":
		foodName="Beryani";
		break;
	case "Cuba":
		foodName="sofrito";
		break;
	case"Russia":
		foodName="Caviar";
		break;
		default:
			foodName="unknown";
	
	
	}
	System.out.println("you are from " +country+ " and your food is " +foodName);
	
	
	
	
	}

}
