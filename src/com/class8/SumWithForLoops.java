package com.class8;

public class SumWithForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		int sum=0;
		for (int i=1; i<=5; i++) {
			sum=sum + i;
			System.out.println(sum); // gonan continue to execute 1+3+6+10=15
		}
		
		System.out.println(sum); // stops to execute til output =15
		
		
	System.out.println("******************");	
		
	int sumAll=0;
		
		for(int i=0; i<20; i+=5) { //0, 5, 15, 20
			sumAll=sumAll+i;
		}
		System.out.println(sumAll);  //30
		
		System.out.println("*************");
		
		int total=2;
		
		for(int y=1; y<=3; y++) {
			total=total*y; //2=2*1; 4=2*2; 12=4*3  TOTAL=12
		}
		System.out.println(total);
	
		//write a code to find the sum of EVEN and ODD from 1-20
		//sum of odds=
		//sum of even=
	System.out.println("************");	
		
	int sumOdd=0;
	int sumEven=0;
		
	//ODD
		for( int a=1; a<=20; a+=2) {
			sumOdd=sumOdd+a;
		}
	System.out.println(sumOdd);

	System.out.println("**********");	
	//EVEN
	
	for(int a=2; a<=20; a+=2) {
		sumEven=sumEven+a;
	}
	
	
	System.out.println(sumEven);
	System.out.println("***********");
	
	// IF ELSE AND FOR LOOP
	int sumE=0;
	int sumO=0;
	
	for(int i=1; i<=20; i++) {
		if(i%2==0) {
			sumE=sumE+i;
		}else {
			sumO=sumO+i; 
		}
	}
	
	System.out.println("The total of all even numbers "  +sumE+ " total for odd numbers "  +sumO);
	
		
		
	}

}
