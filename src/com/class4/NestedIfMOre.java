package com.class4;

public class NestedIfMOre {

	public static void main(String[] args) {
		/* check age, if age <16 = to young to drive
		 * otherwise you can drive  
		 * we will check if you are <18 
		 * then you can get drivers license and if not you gert driver permit
		 * 
		 */

		int age=55;
		
		if (age<16) {   //IF THIS IS TRUE IGNORE THE REST
			System.out.println("You are too young to drive");
		}else {
			System.out.println(" you are eligible to drive");
		
		if (age>=18) {
			System.out.println("you can drive alone");
		}else {
			System.out.println("you need your parents to drive");
		}	
			
		}
		
		System.out.println("*****************");
		
	/* we need to check if student completed the quiz
	 * if yes than good job if not= not good
	 * 	if completed than check score
	 * if more than 90=A 
	 * if more than 80=B
	 * anything else = Study more
	 */
		
		boolean quiz=true;
		int score=80;
		
		if (quiz) {              //when True look at nested if values if FALSE than ignore and go to ELse nested if values
			System.out.println("Good job");
			if (score>=90) {
				System.out.println("You gotan A");
			}else if(score>80) {
				System.out.println("you got a B");
			}else {
				System.out.println("you should studymore");
			}
			
		}else {
			System.out.println("Not Good!!!");
	
		}
		
		System.out.println("**********************");
		
		/*Write a program to store a boolean value 
		 * of whether user has diploma or not. 
		 * If user has a diploma, you should say congratulations, 
		 * otherwise program should suggest to get a degree. 
		 * Then if user has a degree program should check a gpa score. 
		 * If gpa score is higher or equals to 3.5 → output should say 
		 * “You are eligible for scholarship”, 
		 * otherwise → “You should have studied harder” .






Create a Java program and store values of mortgage 
rate and mortgage price. 
First, program should check if rate is higher than 4.5 
user will not buy a house, otherwise user will consider buying.
 Once user decides to buy a house, if price of the house is larger 
 than 200000 than user will take a loan, otherwise user will pay cash.
		 * 
		 */
		
		//TASK 1
		
		boolean diploma=true;
		double gpa=3.0;
		
		if (diploma==true) {
			System.out.println("Congrats!!!");
		if (gpa>=3.5) {
			System.out.println("You are eligible for scholarship");
		}else {
			System.out.println("YOu should study harder");
		}
			
		}else {
			System.out.println("GO get a degree");
		}
		
		
		System.out.println("***************");
		
		//TASK 2
		//Create a Java program and store values of mortgage 
		//rate and mortgage price. 
		//First, program should check if rate is higher than 4.5 
		//user will not buy a house, otherwise user will consider buying.
		// Once user decides to buy a house, if price of the house is larger 
		// than 200000 than user will take a loan, otherwise user will pay cash.
				 
		double rate=3.5;
		int mortgagePrice=100000;
		
		
		if(rate>4.5) {
			System.out.println("will not buy house");
		}else {
			System.out.println("condsider buying house");
			
				if(mortgagePrice>200000) {
					System.out.println("will take a loan");
				}else {
					System.out.println("will pay cash");
				}
			}
			
		
		
			
	}

}
