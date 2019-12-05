package com.class28;

import java.util.Scanner;

public class ScannerAndReverseFinal {


	final String reverseString(){
		Scanner scan=new Scanner(System.in);
	      String reverse=scan.next();
	      String stringReverse="";
	      for(int i=reverse.length()-1; i>=0; i--) {
	    	  stringReverse=stringReverse+reverse.charAt(i);
	      }
	return stringReverse;
	}  

	  public static void main(String [] args){
	    

		  ScannerAndReverseFinal Str1=new ScannerAndReverseFinal();
		  System.out.println(Str1.reverseString());
		
	      
	    
	  
	
	
	
	
	
	
	  }
}
