package com.class2;

public class TaskArithO {

	public static void main(String [] args) {
	
	//Write a Java program to add, subtract, multiply and divide 2 decimal values. 
	  //Your program should say. “The _______ of 2 numbers ___ and ___ is equal to _____”

		double num1=3.5;
		double num2=5.5;
		
		double sum, sub, div, multi;
		
	   sum=num1+num2;
	   div=num1/num2;
	   sub=num1-num2;
	   multi=num1*num2;
		
		
	System.out.println("The sum of 2 numbers " +num1+ "and " +num2+ "is equal to " +sum  );
	System.out.println("The division of 2 numbers " +num1+ "and " +num2+ "is equal to " +div  );
	System.out.println("The subtraction of 2 numbers " +num1+ "and " +num2+ "is equal to " +sub  );
	System.out.println("The multiplication of 2 numbers " +num1+ "and " +num2+ "is equal to " +multi );
	
	
	//Write a program to find the square of the number 3.9. You program should say 
	//“The square of the ____ is ____ “
	
	double number1=3.9;
	double square=3.9*3.9;
	
	System.out.println("The square of " +number1+ " is " +square);
	
	
	//Write a program to print the area and perimeter of a rectangle 
	//with width = 5 and  height = 8. Your program should say. 
	//“The perimeter of a rectangle with 
	//width ___ and height ____ is equal to _____ and the area is __”
		 
	int width=5; 
	int height=8;
	
	int perimeter=2*(width+height);
	int area=width*height;
	
	System.out.println("The perimeter of a rectangle with width of " +width+ " and height of " +height+ "is equal to " + perimeter+ " and area is " +area) ;
	
	}	
}
