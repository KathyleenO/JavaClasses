package com.class13;

public class InterviewQuestions {

	public static void main(String[] args) {
		/* Write a program to swap 2 numbers without a temporary variable? Swap2 strings without a temporary variable?
		 * 2.Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
		 * 3.Find out how many alpha characters present in a string?
		 * 4.How to find out the part of the string from a string? What is substring? Find number of words in string?
		 * 5.Write a java program to reverse String? Reverse a string word by word?
		 * 6.Write a Java Program to find whether a String is palindrome or not?
		 * 7.Write a java program to check whether a given number is prime or not?
		 * 8.Write a Java Program to print first 10 numbers of Fibonacci series.
		 *
		 * 
		 */

		
		//NUMBER 1
		
		int y=5;
		int x=10;
		
		y=y+x;
		System.out.println(y);
		
		
		
		
		
		
		//NUMBER 2
		
		int[] array= {98,76,100,600,21,8};
		
		int max=array[0];
		int min=array[0];
		int med=array[0];
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]>max) {
				max=array[i];
				
			}if  (array[i]<min) {
				min=array[i];
			} if(array[i]>med && array[i]<med) {
				med=array[i];
			}
						
		}
		System.out.println(med);
		System.out.println(min);
		System.out.println(max);
		
		

		
		
		// NUMBER 3
		
		
		String str="Syn8765%$#tax&&8754%$3345Sol887665%$#utions88978945%$$#";
		
		String l=str.replaceAll("[^A-z]", "");
		System.out.println(str.replaceAll("[^A-z]", ""));
		System.out.println(l.length());
	
		
		//Number  10
		
	      
	      
	   
	
	
	}
}
