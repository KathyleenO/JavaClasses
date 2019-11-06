package com.class11;

public class LoopDemoHowItPrints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int s=0; s<=5; s++) {
			System.out.println(s);
		}
		
//		for(;;) {
//			System.out.println("hello");    ///PRINTS INFINITY TIMES
//		}
		
		
		    //this prints 1st     this prints 2nd then 5th             this prints 4th, 7th
		for(int s=0;                   s<=5;                                     s++)         {
			
			//this prints 3rd, 6th
			System.out.println(s);
		}
		
		
		
		
		for(int s=1; s<6; s++) {
			System.out.println("hello");
		System.out.println("go");
		System.out.println("bye");
		System.out.println("kathy");
	
	}
		
		System.out.println("*******");
		
		//MONTHS EXAMPLES
		
		for(int s=1; s<=12; s++) {
			for(int k=1; k<=30; k++) {
			System.out.println(k+ " " +s);	
			}
			System.out.println();
		}
		
		
		int[] array1= {1,2,3,4,5};
		for(int g=0; g<array1.length; g++) {
			System.out.println(array1[g]);
		}
		
	
	}

}
