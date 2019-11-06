package com.class11;

public class ArrayTask2 {

	public static void main(String[] args) {
		// Create a 2D array or integer type where you will 
		//store odd and even numbers in 3 rows and 4 columns. 
		//Develop a program which will identify/print the even numbers only.
		
		//Create a 2D array or integer type and store 
		//numbers in 3 rows and 3 columns. Print the sum of all numbers.
		
		
		//Create a 2D array of integer type with 3 rows and 4 
		//columns and print all values of the whole array.
		int[][] numbers= {
				
				{5,30,4,20},
				{9, 7, 10, 4},
				{8, 2, 3, 60,}
		};
		
		int sum=0;
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j]+ " " );   //TO PRINT ALL NUMBERS IN ARAYS
				
				//SUM
				sum=sum+numbers[i][j];
			}
			System.out.println();
		}
		//SUM
		System.out.println(sum);
		
		
		//SUM WITH ADVANCED LOOP
		
		int sum1=0;
	
		for(int nums[]:numbers) {
			for(int getnum:nums) {
				sum1=sum1+getnum;
			}
		}
		
		
		System.out.println(sum1);
		
		
		
		
	}

}
