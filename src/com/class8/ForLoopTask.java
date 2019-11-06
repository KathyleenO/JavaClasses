package com.class8;

public class ForLoopTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	//numbers from 1=100  in one line with space
		
		for(int i=1; i<=100; i++) {
			System.out.print(i + " " );
		}
		
		// numbers 100 to 1
		
		
		for( int i=100; i>=1; i--) {
			System.out.println(i);
		}
		
		//even numbers from 20 to 1
		
		for(int i=20; i>=2; i-=2 ) {
			System.out.println(i);
		}
		
		//odd numbers 20 to 50
		
		for (int i=49; i>=21; i-=2) {
			System.out.println(i);
		}
			
		//or
		
		for(int i=21; i<50; i+=2) {
			System.out.println(i);
		}
		
		
		
		
		
	}

}
