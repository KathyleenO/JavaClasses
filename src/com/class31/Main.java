package com.class31;

public class Main implements Functions {

	@Override
	public void display(double result) {
		
		
	}

	@Override
	public double adding(double firstNumber, double SecondNumber) {
		
		return firstNumber+SecondNumber;
	}

	@Override
	public double subtracting(double firstNumber, double SecondNumber) {
		
		return firstNumber-SecondNumber;
	}

	@Override
	public double multiply(double firstNumber, double SecondNumber) {
		
		return firstNumber*SecondNumber;
	}

	@Override
	public double dividing(double firstNumber, double SecondNumber) {
		
		return firstNumber/SecondNumber;
	}


	public static void main(String[] args) {
		
		double firstNumber = 100.00; 
		double SecondNumber = 20.00;
		
		
		Main obj=new Main();
		System.out.println(obj.adding(firstNumber, SecondNumber));
		System.out.println(obj.subtracting(firstNumber, SecondNumber));
		System.out.println(obj.multiply(firstNumber, SecondNumber));
		System.out.println(obj.dividing(firstNumber, SecondNumber));
	}
	
}

interface Outputs{
	 public void display(double result);
	}


interface Functions extends Outputs{
	  
	  double adding(double firstNumber, double SecondNumber);
	  double subtracting(double firstNumber, double SecondNumber );
	  double multiply(double firstNumber, double SecondNumber);
	  double dividing(double firstNumber, double SecondNumber);
	   
	  
	}

