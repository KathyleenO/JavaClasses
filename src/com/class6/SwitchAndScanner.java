package com.class6;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {
		/* switch statements executes one statement from multiple conditions
		//works with byte,short,char,int, and String
		//NO LONG OR BOOLEAN, float or double
		 * cannot use RELATION OPERATOR 
		 * ONLY EQUALITY
		 * in the switch case provide correct DATATYPE
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your gender F or M");
		char gender=scan.next().charAt(0);
		String userGender;
		
		switch(gender) {
		
		case'F':
			userGender="Female";
			break;
		case'M':
			userGender="Male";
			break;
		default:
			userGender="unknown";	
		
		}
		
		System.out.println("Your gender is " +userGender);
		
		
		
		
		
	}

}
