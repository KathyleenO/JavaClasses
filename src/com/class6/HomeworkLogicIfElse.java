package com.class6;

import java.util.Scanner;

public class HomeworkLogicIfElse {

	public static void main(String[] args) {
		/*
		 *1. Write a program to find largest of three double values using 
		 * if-else..if and logical operators provided by a user 
		 * (numbers must be distinct)
		 *
		 * 2. Program to find largest number among 
		 * three numbers using nested if provided by a user (numbers must be distinct)
/*
 * 
 */

//		Scanner scan=new Scanner(System.in);
//	System.out.println("PLease enter first number");
//		double num1=scan.nextDouble();	
//		System.out.println("Please enter second number");
//		double num2=scan.nextDouble();
//		System.out.println("Please enter third number");
//		double num3=scan.nextDouble();
//		
		// IF ELSE EXAMPLE 
		
//		if(num1>num2 && num1>num3) {
//			System.out.println("num1 " +num1+ " largest");
//		}else if(num2>num1 && num2>num3) {
//		System.out.println("num2 " +num2+ " largest");
//		}else if(num3>num1 && num3>num2){
//			System.out.println("num3 "+num3+ " largest");
//		}
		
//		 //SAME EXAMPLE AS ABOVE WITH NESTED IF
//		
		//if(num1>num2 && num1>num3 ) {
//			System.out.println("num1 is largest" +num1);
//		} if(num2>num1 && num2>num3) {
//			System.out.println("num2 is largest" +num2);
//		} else {
//			System.out.println("num3 " +num3+ "is largest");
//		}

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers for Nested If Task");

		double no1 = scan.nextDouble();
		double no2 = scan.nextDouble();
		double no3 = scan.nextDouble();

		if (no1 > no2) {
					if (no1 > no3) {//no1>no2 && no1>no3
						System.out.println("Largest number is first - " + no1);
					} else {//no1>no2 but no1<no3
						System.out.println("Largest number is third - " + no3);
					}
		} else {//assuming no2>no1
					if (no2 > no3) {//no2>num1 && no2>no3 --> no2 =largest
						System.out.println("Largest number is second - " + no2);
					} else {//no2>no1 but no2<no3
						System.out.println("Largest number is third - " + no3);
					}
		}		
//			
			//1. Ask user to enter their country and capture it. 
//			Once values are captured print which language user speaks.
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter country name");
//		String country=scan.next();
//		String language=null;
//		
//		switch(country) {
//		
//		case "Honduras":
//			language="Catalan";
//			break;
//		case "El Salvador":
//			language="Spanish";
//			break;
//		case "France":
//			language="French";
//			break;
//		case "Brazil":
//			language="Portuguese";
//			break;
//		case "Germany":
//			language="German";
//			break;
//			default:
//		}
//		
//		System.out.println(" You speak " +language);
			
			//2. Allow user to enter grade and then provide explanation: 
//			A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
			//At the end your program should print which grade 
			//was entered by a user with explanation.

		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("please enter grade");
//		String grade=scan.next();
//		String explain;
//		switch(grade) {
//		
//		case "A":
//			explain="Excellent";
//			break;
//		case "B":
//			explain="Good";
//			break;	
//		case "C":
//			explain="Average";
//			break;	
//		case "D":
//			explain=" Bad";
//			break;
//			default:
//				explain="Not Acceptable";
//		}
//		System.out.println(explain);
//		
		

			//HomeWork: Using scanner class create calculator. 
			//Allow user to enter 2 numbers and operator(+,-,*,/). 
			//Based on operator provide the result to user.	
			
//			Scanner scan=new Scanner(System.in);
//			System.out.println("Please enter First Number");
//			int num1=scan.nextInt();
//			System.out.println("Please enter second number");
//			int num2=scan.nextInt();
//			String operator=null;
//			
//				if(operator.equals("+")) {
//					System.out.println(num1+num2);
//				}else if(operator.equals("-")) {
//					System.out.println(num1-num2);
//				}else if(operator.equals("*")) {
//					System.out.println(num1*num2);
//				}else if(operator.equals("/")) {
//					System.out.println(num1/num2);
//				}
//		
//		scan.close();

	}

}
