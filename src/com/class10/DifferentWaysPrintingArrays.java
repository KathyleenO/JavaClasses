package com.class10;

public class DifferentWaysPrintingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println(grades[0]); // prints A

		int a = 2;
		System.out.println(grades[a]); // int a=2; prints C

		a += 2; // 2+2=4
		System.out.println(grades[a]); // prints E
		a--; // 4-1=3
		System.out.println(grades[a]); // prints D

		System.out.println("************************");
		
		for(int i=0; i<grades.length; i++ ) {
			System.out.println(grades[i]);       //Prints ALL value
		}
		
		
		
		
		
		
		String[] animals= {"Cat", "Dog", "Cow", "Snake", "Elephant"};
		int size=animals.length;
		
		for(int i=0; i<size; i++) {
			System.out.print(animals[i]+ " ");
		}
	
		//create array to store 5 double values, pritn all
		
		
		 double[] b= {2.5 ,4.6,7.0, 8.8, 9.0};
		 int lenght=b.length;
		
		 for(int i=0; i<lenght; i++) {
		 System.out.println(b[i]+  " ");
		 }
		
		
		
		
		
	}

}
