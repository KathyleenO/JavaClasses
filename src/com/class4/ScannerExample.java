package com.class4;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// 

		
		/*nextInt();   for NUMBERS
		 * nextLine();  for STRINGS
		 * nextDouble(); for DOUBLES
		 * 
		 */
		
		//INTEGER SCANNER 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter any number");	
	int	number=scan.nextInt();
		System.out.println("entered number is " +number);
		
		System.out.println("******************");
		
		// STRING SCANNER
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=input.nextLine();
		System.out.println("Good afternoon " +name);
		
		//TASK: ask user to enter 2 numbers and then compare which is larger 
		
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Please enter first number ");
		int number1=keyboard.nextInt();
		System.out.println("please enter second number");
		int number2=keyboard.nextInt();
		
		if(number1>number2) {
			System.out.println(number1+ " is  larger than " +number2);
		}else if (number1==number2) {
				System.out.println(number1+ "is equal to " +number2);
			
		}else {
			System.out.println(number1+ "is smaller than " +number2);
		}
		
		
		
	}

}
