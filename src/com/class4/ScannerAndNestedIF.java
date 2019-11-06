package com.class4;

import java.util.Scanner;

public class ScannerAndNestedIF {

	public static void main(String[] args) {
	

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
				
				
		//TASK 1You are a loan specialist and you 
				//need to ask user what is the amount of loan is needed. 
				//If loan is less than 200,000 then you would lend the 
				//money otherwise you would reject the client.
				
				
				
				Scanner type=new Scanner(System.in);
				System.out.println("What is the amount of loan need it");
		        int amount=type.nextInt();
		        
		   if(amount<2000000) {
			   System.out.println("I will lend Money");
		   }else {
			   System.out.println("Reject client");
		   }
		
		/*TASK 2
		 * You are DMV representative and you need to ask 
		 * customer their age. If they are 18 and older you 
		 * will issue a driver licence to them, otherwise you 
		 * will offer them to get a learners permit.
		 * 
		 */
		
		  Scanner a=new Scanner(System.in);
		  System.out.println("How old are you");
		   int age=a.nextInt();
	
		   if (age>18) {
			   System.out.println("I Will issue drivers license");
		   }else {
			   System.out.println("get a lerners permit");
		   }
		   
		   
		   
	/*Create a Java program that will ask user to input 
	 * temperature and city. Your program should convert 
	 * Fahrenheit into celsius and print 
	 * “The temperature is the city __ is __”
	 * 	   
	 */
		   
		Scanner b=new Scanner(System.in);
		 System.out.println(" what is the temperature");  
		   double temp=b.nextDouble();
	
		  // Scanner c=new Scanner(System.in);
		 System.out.println("what is name of your city");
		   String city=b.next();
		
		   double convertedTemp=(temp-32)*5/9;
		System.out.println("the temperature in " +city+ "is " +convertedTemp);
				 
	}

}
