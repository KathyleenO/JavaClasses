package com.class9;

public class PracticePatterns {

	public static void main(String[] args) {

		for(int i=0; i<=10; i++) {    //ROWS 
			for(int j=0; j<10; j++) {  //COLUMS
				System.out.print("*");
			}
			System.out.println();  ///BREAKS IT DOWN TO ANOTHER LINE 
		}
		
System.out.println("*******************");
		
		for (int num=1; num<5; num++) {
			
			for( int c=1; c<=5; c++) {
				System.out.print(c);
			}
			System.out.println();
		}
		
		System.out.println("*********************");
		// task 123456789 5 times
		
		for(int r=1; r<=5; r++) {
			for(int c=1; c<=9; c++) {
				System.out.print(c);
			}
			
			System.out.println();
		}
		
		System.out.println("*************");
		// 54321 5 times

		for (int a = 5; a >= 1; a--) {//5=a
			for (int b = 5; b >= 1; b--) {
				System.out.print(a+" "+b);//5
			}
			System.out.println();
		}

	System.out.println("**************");
	
		for(int i=5; i>=0; i--) {
			//System.out.println(i);
			for(int j=5; j>=1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
		

	}
}
