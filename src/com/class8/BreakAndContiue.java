package com.class8;

public class BreakAndContiue {

	public static void main(String[] args) {
		// break keyword breaks the loop

		
		for(int i=0; i<10; i++) {
			if(i==7) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println(" I am outside the loop");
		
		// continue- it will skip currenT iteration
		
		for(int i=1; i<5; i++) {
			if(i==3 || i==4) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println(" i am outside loop");
		
		System.out.println("*********");
		
		// print nums 1-20 skip 5 6 7
		
		for(int a=1; a<=20; a++) {
			if(a==5 || a==6 ||a==7) {
				continue; 
				//break;
			}
			System.out.println(a);
			
			
		}
		
		
		
	}

}
