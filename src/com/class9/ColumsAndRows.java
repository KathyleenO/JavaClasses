package com.class9;

public class ColumsAndRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j); //repeats THIS FOR LOOP ENDS WHEN ITS COMPLETED
			}
			System.out.println();
		}
		
		System.out.println("****************");
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);  //Repeats the SAME NUMBER
			}
			System.out.println();
		}
		
		
		
		
	}

}
