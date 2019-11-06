package com.class2;

public class HomeWork {

	public static void main(String[] args) {
	//  Write a Java program and declare 2 numbers and assign values 200 and 100.
 //First add, second subtract, third multiply, forth divide. 
	//200 is the first initialized variable you must use to do this arithmetic assignment.
//Please use variables to print values of each operation result on a separate line.

	
	
	int num1=200;
	int num2=100;
	 int add,sub,multi,div;
	
	  add=num1+num2;
	  sub=num1-num2;
	  multi=num1*num2;
	  div=num1/num2;
			
	 // System.out.println(add);
	//System.out.println(sub);
	//System.out.println(multi);
	//System.out.println(div);
	
	
//Write a program to print the perimeter and area of a rectangle 
	//with width = 5 and height = 8. 

///Output“The perimeter of a rectangle with width __ and height __ 
	//is equals to __ and the area equals to __”
	
	
	int width=5;
	int height=8;
			
	int perimeter=2*(width+height);
	int area=width*height;
	
	//System.out.println("The perimeter of a rectangle with width "+width+ "and height "+height+ "is equals to " +perimeter+ "and area is equal to " +area);
	
	
	
	//Problem 13
	
	int myNumber=7;
	int stepOne=myNumber*myNumber;
	int stepTwo=stepOne+myNumber;
	int stepThree=stepTwo/myNumber;
	int stepFour=stepThree+17;
	int stepFive=stepFour-myNumber;
	int stepSix=stepFive/6;
	
	System.out.println("The magic number is " +stepSix);
	
	
	
	
	
	
	}

}
