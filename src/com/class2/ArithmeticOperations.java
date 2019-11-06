package com.class2;

public class ArithmeticOperations {

	public static void main(String[] args) {
		
		/*declare 2 variables and initialize them 
		 * display result of addition, subtraction, multiplication and division
		 * 
		 */
		
		int num1, num2;
		num1=20;
	    num2=10;	
		System.out.println(num1+num2); //30
		System.out.println(num1-num2); //10
		System.out.println(num1*num2); //200
		System.out.println(num1/num2); //2
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		
		System.out.println("The addition of 2 numers is " +sum);
		System.out.println("The subtraction of 2 numers is " +sub);
		System.out.println("The multiplication of 2 numers is " +mult);
		System.out.println("The division of 2 numers is " +div);
		
		
		
	}

}
