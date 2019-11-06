package com.class6;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade and then provide explanation: 
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
             
             
            
//	
             
             
             
             
             
             
             
             
             HomeWork: Using scanner class create calculator. 
             Allow user to enter 2 numbers and operator(+,-,*,/). 
             Based on operator provide the result to user.
		 * 
		 * 
		 * 
		 */

		
		
		

		Scanner scan=new Scanner(System.in);
		System.out.println("please enter grade");
		String grade=scan.next();
		String explain;
		switch(grade) {
		
		case "A":
			explain="Excellent";
			break;
		case "B":
			explain="Good";
			break;	
		case "C":
			explain="Average";
			break;	
		case "D":
			explain=" Bad";
			break;
			default:
				explain="Not Acceptable";
		}
		System.out.println(explain);
		
		
		
		
		
		
	}

}
