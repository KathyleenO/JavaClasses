package com.class8;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		for(int i=0; i<=4; i++ ) {
		System.out.println("Good morning");
		}
		
		//print numbers from 1-10
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		// numbres from 10-1
		
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		// by 5
		for(int i=5; i<=50; i+=5) {
			System.out.println(i);
		}
		
		//numbers from 1=100 with space
		
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
		
		for (int i=20; i>=50; i+=2) {
			System.out.println(i);
		}
		
		
		
		
	}

}
