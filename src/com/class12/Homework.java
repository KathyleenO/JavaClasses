package com.class12;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
   		
//  String s1="hello how are you";
//  System.out.println("before " +s1);
//   s1=s1.replace("h", "t").replaceAll("you", "hi");
// 
//

		
	
   
   
	int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2,2},
			{1,-2,3,-4}
		};
		 //should print -6
		int sum=0;
	    for(int row=0; row<a.length; row++){
		  for(int colum=0; colum<a.length;  colum++){
		    if(a[row][colum]%2==0) {
		    	sum=sum+a[row][colum];
		    }
		    
		  }
		
		 }
		 System.out.println(sum);
   
//		   Scanner inp = new Scanner(System.in);
//		    System.out.print("In:");
//		    String word = inp.nextLine();
//		    //write your code below
//		   
//   
//   for(int i=0; i<word.length(); i+=2) {
//	  System.out.println(word.charAt(i));
//   }
//   
		
		
	}

}
