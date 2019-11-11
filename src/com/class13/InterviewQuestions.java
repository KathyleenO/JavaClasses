package com.class13;

import java.util.Arrays;
import java.util.Scanner;

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

		
		System.out.println("*********Number 1 Swap characters********");
		
		int a=10;
		int b=20;
		
		a=a+b;//30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		System.out.println("the value of a=" +a);
		System.out.println("the value of b=" +b);
		
		String str="Hello";
		String str2="Bye";
		
		str=str+str2;//HelloBye
		str2=str.substring(0, 5);//hello    or  st.length - str2.length
		str=str.substring(5);//bye
		
		System.out.println(str);
		System.out.println(str2);
		
		
		
		System.out.println("****SORT NUMBERS********");
		//easiest way SORT FUNCTION
		
		
		
		
		int[] array= {98,76,100,600,21,8};
		//ONE WAY 
//		Arrays.sort(array);
//		int min=array[0];
//		int max=array[array.length-1];
//		
//		System.out.println(min);
//		System.out.println(max);
//		
		//SECOND WAY
		int max=array[0];
		int min=array[0];
		int med=array[0];
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]>max) {
				max=array[i];
				
			} if  (array[i]<min) {
				min=array[i];
			} 
			
						
		}
		
		System.out.println("The smallest is" +min);
		System.out.println("The largest is" +max);
		
		System.out.println("****SECOND LARGEST*********");
		int[] array2= {98,76,100,600,21,8};
		
		int large=array2[0];
		int second=array2[0];
		
		for (int i = 0; i < array2.length; i++) {
			
			if(array2[i]>large) {
				second=large;
				large=array2[i];
			}
			if(array2[i]>second && array2[i]<large) {
				second=array2[i];
			}
			
		}
		System.out.println(second);
		
		

		
		System.out.println("*****HOW MANY ALPHA CHAR*********");
		// NUMBER 3 HOW MANY ALPHA CHARACTERS
		
		
		String str3="Syn8765%$#tax&&8754%$3345Sol887665%$#utions88978945%$$#";
		
		String l=str3.replaceAll("[^A-Za-z]", "");
		System.out.println(l);
		//System.out.println(str3.replaceAll("[^A-z]", "")); OR 
		System.out.println(l.length());
	
		
		System.out.println("*******# OF STRINGS*****");
		//4 find # of Strings in a string
		
		String str4="I dont feel great today";
		
		System.out.println(str4.substring(2, 17));    //Substringg
		System.out.println(str4.length());          //FIND HOW MANY LETTERS
		
		System.out.println(str4.replace("dont", ""));   //HOW TO TAKE OUT PART OF STRING
		
		String[] words=str4.split(" ");      //how many sentences and length
		System.out.println(words.length);
		
		System.out.println("******REVERSE STRING CHARACTERS**********");
		//5 REVERSE STRING
		
		char [] reverse=str4.toCharArray();
		
			for (int i = reverse.length-1; i>0; i--) {
				
				System.out.println(reverse[i]);
			}
		System.out.println("*******REVERSED STRING WORDS********");
			String reversed="";
		String[] backwords=str4.split("\\s");
		for (int i = backwords.length-1; i >=0; i--) {
			reversed=reversed+backwords[i]+ " ";
		}
			System.out.println(reversed);
	
		System.out.println("*********8POLINDROME STRING********");
		//Number  6
		//REVERSE String, then capare 2 strings if string equals=polindrome else not 
		
		String original="kayak";
		String reverse2="";
		
		for (int i =original.length()-1 ; i >=0; i--) {
			reverse2+=original.charAt(i);  //+k=k+a+Kk
		}
		
		System.out.println(reverse2);
		
		if(original.equals(reverse2)) {
			System.out.println("String is Polidrome");
		}else {
			System.out.println("String not polidrome");
		}
			
	     //Number7 PRIME NUMBER
			
//			Scanner scan=new Scanner(System.in);
//		    System.out.println("Enter number ");
//			int num=scan.nextInt();
//			boolean isPrime=true;
//			
//			if(num ==0 || num==1) {
//				isPrime=false;
//				
//			}else {
//			for (int i = 2; i <num; i++) {
//		
//			if(num%i==0) {
//				isPrime=false;
//				break;
//			}
//	}
//			}
//			if(isPrime) {
//				System.out.println(num+ " is a Prime number");
//			}else {
//				System.out.println(num+ " not prime");
//			}
			
			System.out.println("*****FIBANNACHI NUMBERS*********");
			//number 8
			
			int a1,b1,c1;
			 a1=0;
			 b1=1;
			 

	      
	      for (int i = 0; i <10; i++) {
			System.out.print(a1 +" ");
			c1=a1+b1;
			a1=b1;
			b1=c1;
		}
	   
	
	
	}
}
