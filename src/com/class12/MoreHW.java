package com.class12;

import java.util.Scanner;

public class MoreHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		

	
	
		
		int[][] f = {
			{1,1,2}, //sum = 4
			{3,1,2}, //sum = 6
			{3,5,3}, //sum = 11
			{0,1,2}  //sum = 3
		};
	
		int rowTotal=0;
		for(int i=0; i<f.length; i++){
	       rowTotal+=f[1][i];
		}
	System.out.println(rowTotal);
	
	
//	 String name="Timmy";
//	    System.out.println(name.length());
//	    
//		
	    
//	    Scanner sc = new Scanner(System.in); 
//	    System.out.println("Enter the browser name to proceed further with execution");
//	     String browser = sc.nextLine(); 
	     
//	     if(browser.equalsIgnoreCase("ChRoME")){
//	     System.out.println("Proceed with Chrome browser");
//	     } else if(browser.equalsIgnoreCase("FireFOX")){
//	       System.out.println("Proceed with Firefox browser");
//	     }else if(browser.equalsIgnoreCase("IE")){
//	       System.out.println("Proceed with IE browser");
//	     }else{
//	       System.out.println("Invalid browser");
//	     }
	     
//	     Scanner sc = new Scanner(System.in); 
//		  System.out.println("Enter any programming language");
//		   String language = sc.nextLine(); 
//		  
//	    
//		  String print;
//		  switch(language){
//	    case "Java":
//		    print="Java is a programming language";
//		    break;
//		    case "C":
//		      print="C is a procedural programming language";
//		      break;
//		      case "C++":
//		        print="C++ is a middle-level programming language";
//		        break;
//		        default:
//		        	
//		        print="Doesn't match any programming language";
//		  }
//		  
//		
//		System.out.println(print);
//	    
//		Scanner sc = new Scanner(System.in); 
//		  System.out.println("Enter any programming language");
//		   String language = sc.nextLine(); 
//		  
//		if(language.equals("Java")){
//		  System.out.println("Java is a programming language");
//		} else if(language.equals("C")){
//		    System.out.println("C is a procedural programming language");
//		  }else if(language.equals("C++")) {
//		System.out.println("C++ is a middle-level programming language");
//		  }else {
//			  System.out.println("Doesn't match any programming language");
//		  }
	   
		
//		           
//		                String str1="Welcome To Syntax Solutions" ;
//		                   char array[]=new char[27];
//		
//		
//		                str1.getChars(0, 27, array, 0);
//		                
//		                for(int i=0; i<array.length; i++) {
//		                	for(int j=0; j<array[i]; j++) {
//		                		System.out.println(array[j]);	
//		                	}
//		                }
//		                
//        

                      
                      
                      
                      
//                    
//                	Scanner input = new Scanner(System.in);
//          		String[] arr = new String[5];
//            	           		
//            		//leave above alone!  write your code below  		
//           		for (int i=0;i<5;i++) {
//            			arr[i] = input.nextLine();
//         			for(int j=0; j<5; j++) {
//        				
//           			}
//            			System.out.println(arr[i].substring(0,3));}
//
//                     
//           		
//           	 Scanner inp = new Scanner(System.in);
//             System.out.print("In:");
//             String word = inp.next();
//             //write your code below
//           
//           for(int i=0; i<word.length(); i++) {
//        	   for(int j=0; j<i; j++) {
//        		   System.out.println(word.charAt());
//        	   }
//           }
          
           		
//		 String s1="hello how are you";
//		System.out.println("before " +s1);
//		 s1=s1.replace("h", "t");
//		 System.out.println(s1);
//		
//            s1=s1.replace("you", "hi");
//		 System.out.println(s1);
//		 
//		 s1=s1.replaceAll("hello how are you", "I am fine");
//		System.out.println(s1);
//           		
	}

}
