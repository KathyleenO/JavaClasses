package com.class6;

import java.util.Scanner;

public class replits {

	public static void main(String[] args) {

//
//		  Scanner scan=new Scanner(System.in);
//		  System.out.println("Do you need a loan? True or False");
//		  boolean loan=scan.nextBoolean();
//		 int score; 
//		 String eligibility=null;
//		  
//		  if(loan){
//		    System.out.println("What is your credit score");
//		    score=scan.nextInt();
//		    
//		    if(score<600){
//		      eligibility="Not Eligible";
//		    }else if(score>600 && score<=700){
//		      eligibility="Maybe eligible";
//		    }else if(score>701 && score<=800){
//		      eligibility="Eligible";
//		    }else if(score>600){
//		      eligibility="Definitely eligible";
//		    }
//		    
//		  }else{
//				eligibility="unknown";
//		}
//	
//		  System.out.println("The eligibility is " +eligibility); 
//		

		/*
		 * if int1 and int2 are equal and word1 and word2 are equal, output "AND" if
		 * int1 and int2 are equal or word1 and word2 are equal, output "OR" if int1 and
		 * int2 are not equal and word1 and word2 are not equal, output "NONE"
		 * 
		 * 
		 * 
		 * 
		 */

//		  Scanner scan=new Scanner(System.in);
//		  System.out.println("Please enter 2 Strings");
//		  String word1=scan.next();
//		   String word2=scan.next();
//		   System.out.println("Please enter 2 numbers ");
//		   int num1=scan.nextInt();
//		    int num2=scan.nextInt();
//		
//		   if(num1==num2 && word1.equals(word2)) {
//			   System.out.println("AND");
//		   }else if(num1==num2 || word1.equals(word2)) {
//			  System.out.println("OR"); 
//		   }else if(!(num1==num2) && !(word1.equals(word2))) {
//	            System.out.println("None");
//		  
//		 }

//	  Scanner scan=new Scanner(System.in);
//	System.out.println("Are you thirsty");
//	boolean th=scan.nextBoolean();
//	System.out.println("Are you sleepy");
//	boolean sleep=scan.nextBoolean();
//	String drink;
//
//	if(th && !sleep) {
//		drink="water";
//	}else if(th && sleep) {
//		drink="coffee";
//	}else if(!th &&  sleep) {
//		drink="tea";
//	}else {
//		drink="nothing";
//	}
//	
//	System.out.println("looks like you need " +drink);

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter name of instructor");
//		String name = scan.next();
//		String job;

//		switch (name) {
//		case "Shiva":
//			job = "Java Assigment";
//			break;
//		case "Sandish":
//			job = "SDLC Assigment";
//			break;
//		case "Weqas":
//			job = "Selenium Assigment";
//			break;
//		case "Asel":
//			job = "Every Assigment";
//			break;
//		default:
//			job = "Invalid instructor selected";
//
//		}
//
//		System.out.println("Will take care of " + job);

//		
//		Scanner scan=new Scanner(System.in);
//		   System.out.println("enter the age of the Child");
//		   int age=scan.nextInt();
//		   String feet;
//		   
//		   switch(age){
//		     
//		     case 1:
//		       feet="You can Crawl";
//		       break;
//		       case 2:
//		         feet="You can Talk";
//		         break;
//		         case 3:
//		           feet="You can Dance";
//		           break;
//		           case 4:
//		             feet="You can get Trouble";
//		             break;
//		             default:
//		             feet="I don't know how old you are";
//		      
//		   }
//		          System.out.println(feet);

//		Scanner myObj = new Scanner(System.in);
//        System.out.println("Please enter two strings");
//        String word1= myObj.nextLine();
//        String word2=myObj.nextLine();
//        System.out.println("Please enter two numbers");
//        int num1=myObj.nextInt();
//        int num2=myObj.nextInt();
//    
//        
//        
//        if (num1==num2 && word1.equals(word2)) {
//            System.out.println("AND");
//            }
//        else if (num1 == num2 || word1.equals(word2)) {
//            System.out.println("OR");
//            
//            }
//        else if (num1!= num2 && !word1.equals(word2));{
//        
//            System.out.println("NONE");

		// }

//        Scanner scan=new Scanner(System.in);
//        System.out.println("enter the roll number of the Child");
//        int roll=scan.nextInt();
//        String studentName;
//        
//        switch(roll){
//          
//          case 101:
//            studentName="Student name: Ramesh ";
//            break;
//            case 102:
//              studentName="Student name: Mahesh ";
//            break;
//            case 103:
//              studentName="Student name: Mukesh ";
//          break;
//          default:
//          studentName=" Not found Student name: in Class";
//          
//
//        }
//        
//        System.out.println(studentName);

//		Scanner scan=new Scanner(System.in);
//		  System.out.println("Please enter your favorite car make");
//		  String make=scan.next();
//		  String carOrigin;
//		  
//		  switch (make){
//		    
//		    case "BMW":
//		      carOrigin="german car";
//		      break;
//		     case "Toyota":
//		      carOrigin="japanese car";
//		      break; 
//		    case "Maserati":
//		      carOrigin="italian car";
//		      break;
//		      default:
//		      carOrigin="unknown";
//		  }
//		  
//		  System.out.println("Your Favorite car is " +carOrigin);
//		

//		 int iSwitch=6;
//		   switch(iSwitch){
//		     case 0:
//		     System.out.println("ZERO");
//		     break;
//		     case 1:
//		       System.out.println("ONE");
//		       break;
//		       case 2:
//		       System.out.println("TWO");
//		       break;
//		       case 3:
//		       System.out.println("THREE");
//		       break;
//		       case 4:
//		       System.out.println("FOUR");
//		       break;
//		       case 5:
//		       System.out.println("FIVE");
//		       break;
//		       default:
//		       System.out.println("Not in the list");
		// }

//		
		Scanner scan=new Scanner(System.in);
	    System.out.println("Please enter a number");
	    int obj=scan.nextInt();
	    
	   
	    
	  if(obj%2==0){
	    System.out.println("value is even");
	       
	       if(obj>100) {
	       System.out.println("value is too large");
	      } else {
	      System.out.println("value is just right");
	      }
	   
	   }else if(obj<100) {
		   System.out.println("value just right and is odd");
	   } else   {
		   System.out.println(" this is an odd number and value too high");
	   
	   }
	  
//	  else {
//	   System.out.println("Value is odd number ");
//	   }if(obj<100) {
//		   System.out.println("Value is just right and odd number");
//	   }else {
//		   System.out.println("This is an odd number and value is too high");
//	   }

		// Initialize an object for Scanner class,
		// condition is if object is greater than 400 create a nested
		// if condition to see if object is less than or equal to 600.
		// If object is less than or equal to 600 have output say
		// "don't calculate commission", if object is greater than or
		// equal to 600 then have output say "Value is too large".
		// For anything less than the value of 400 in the first condition
		// please print "calculate commission"

//	   Scanner scan=new Scanner(System.in);
//	   System.out.println("Please enter number");
//	   int number=scan.nextInt();
//	   
//	  // if(number>400){
//	//     System.out.println();
//	 
//	   
//	   if((number>=400) || (number<=600)  ){
//	     System.out.println("dont calculate comission");
//	   }else if ( number>=600){
//	     System.out.println("value is too large");
//	   }else{
//	  System.out.println("calculate commission");
//	   }   

		

		// Scanner scan=new Scanner(System.in);

//		 int number=400;
//		 
//		 if(number>=400){
//			 //System.out.println("dont calculate");
//		 if(number<=600) {
//		   System.out.println("dont calcualte comission");
//		 
//		 }else if(number>=600) {
//		   System.out.println("value is too large");
//		 }
//		 }else{
//		System.out.println("calculate commission");
//		 }
//		 
//		
		
		
		
		
		
		
		
		
		
//		
//		Scanner scan = new Scanner(System.in);
//
//		int number = 200;
//
//		if (number > 400) {
//
//		}if (number <= 600) {
//
//				System.out.println("dont calcualte comission");
//			}
//			     if (number >= 600) {
//				  System.out.println("value is too large");
//			}
//		} else {
//			System.out.println("calculate commission");
//		}
//		
//		
//		
//		if(number>400) {
//			
//		else if (number <= 600) {
//			
//		}
//		}

	}
}

