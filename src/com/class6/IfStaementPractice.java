package com.class6;

import java.util.Scanner;

public class IfStaementPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Scanner scan=new Scanner(System.in);
//	    System.out.println("input M or F");
//	    String gender=scan.next();
//	    System.out.println("please enter age");
//	    int age=scan.nextInt();
//	    
//		
//	
//		    
//		    if(gender.equals("F")) {
//             gender="woman";
//		    } else {
//		    	gender="girl";
//		    }		    
//		    
//	    
//	    if (age>25) {
//		    	gender="man";
//		        }else {
//		    	gender="boy";
//		    }
//		    	
//		   System.out.println(gender);
//		   
		  
			
	
		
//		    int a, b, c, d;
//		    a=10;
//		    b=20;
//		    c=30;
//		    d=5;
//		   
//		   int result=a+b;
//		   
//		    if(a>d && b>d && c>d) {
//		    	System.out.println("True");
//		    }if(result==c) {
//		    	System.out.println("True");
//		    }
//		
//		
		
		   Scanner scan=new Scanner(System.in);
	        String gender;
	        int age;
	        
	        
	        gender=scan.nextLine();
	        
	        age=scan.nextInt();
	        
	        if(age>25){
	     if( gender.equals("M")) {
	               System.out.println("Man");
	           } else {System.out.println("Woman");
	           }
	   }
	   else {
		   if(gender.equals("M"))
	           {
	               System.out.println("Boy");
	           } else {System.out.println("Girl");
	           }
	       }
		
		
	}

}
