package com.class7;

public class WhileLoops {

	public static void main(String[] args) {
		
		// WHILE Loop, first initialized variable 
		
		
		int time=8;
		
		if(time<12) {
			System.out.println("Good Morning"); // only prints 1 time
		}
		//VS While Loop
		System.out.println("*******************");
		while (time<12) {
			System.out.println("Good Morning");// code executes infinitely 
			time++; //condition is true 1GM  8+1=9 2GM  9+1=10 3GM  10+1=11 4GM   11+1=12 stop(once condition is False) 
		}
	
		System.out.println("**********");
		
		//print Hello 5 times
		int i=6;
	
         while(i<15) { //THIS HAS TO BE TRUE TO PRINT IF FALSE NOTHING PRINTS 
        	 //can change to = or 6 
			System.out.println("Hello");
		i++;
		}
		
		
		
	}

}
