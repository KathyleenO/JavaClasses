package com.class10;

import java.util.Scanner;

public class replits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		  Scanner inp = new Scanner(System.in);
//		    System.out.print("Int:");
//		    int end = inp.nextInt();
//		    //write your code below
//		    
//		    for(int i=0; i<end; i++) {
//		   // System.out.println(end);
//		    }for(int j=0; j>=end; j++) {
//		    	System.out.println(end);
//		    }
//		    
		
		///123 with spaces infront
	
//		    for(int i=1; i<=5; i++){
//		        
//		        for(int s=5-i; s>=1; s--){   //spaces
//		          System.out.print(" ");
//		        }
//		        for(int j=1; j<=i; j++ ){
//		          System.out.print(j);
//		        }
//		        System.out.println();
//		      }    
//		    
//		    
//		    for(int i=1; i<=4; i++){
//		        for(int j=1; j<=4; j++) {
//		         // System.out.print();
//		        if( i==1 || j==1 || i==4 || j==4){
//		          System.out.print("$");
//		        }else{
//		          System.out.print(" ");
//		        }
//		        }
//		        System.out.println();
//		        
//		      }   
//		
//		    
//		    for(int i=1; i<=10; i++){
//		        System.out.print(i);
//		      }
//		      System.out.println();
//		      for(int a=2; a<=20; a+=2){
//		      System.out.print(a);
//		      } 
//		        System.out.println();
//		        for(int b=3; b<=30; b+=3){
//		          System.out.print(b);
//		        }
//		        System.out.println();
//		      
//		         
//		   
//		        System.out.println("----------------");
//		        String[] s = { "dog", "cat", "mouse", "bird", "donkey", "horse" };
//		        for (int i = 0; i < s.length; i++) {
//		            System.out.println(s[i]);
//		        }
//		    
//		        int[] numbers={45,78,12,67,55,89, 23, 77, 88};
//		        for(int i=0; i<numbers.length; i+=2){
//		         System.out.print(numbers[i] +" ");
//		        }
//		    
//		        String[] l={"s","a","y","b","n","c","t","d","a","e","x"};
//		        
//		        for(int i=0; i<l.length; i+=2){
//		          System.out.print(l[i] );
//		        }
//		       
//		        String[] letters={"This", "is", "array", "of", "Strings"};
//		        
//		        for(int i=0; i<letters.length; i++){
//		          System.out.print(letters[i]+ " ");
//		        }
//		           
//		  
		        
		     //   Scanner scan;
		       // scan=new Scanner(System.in);
		        
//		        System.out.println("Please enter day of week");
//		        String day=scan.next();
//		        
//		        String[] days={"Sunday" ,"Monday", "Tuesday", "Wednesday", "Thursday" ,"Friday", "Saturday"};
//		           
//		        for(int i=0; i<=7; i++ ) {
//		        	// int daynum=scan.nextInt();
//		        	System.out.println("Please enter day of week");
//				        int daynum=scan.nextInt();
//		        }
//		        for(int j=0; j<days.length; j++) {
//		        	System.out.println(days[j]);
//		        }
////		    
//		 Scanner scan;
//		 scan=new Scanner(System.in);
//		   String[] days=new String[7];
//		   int num=0;
//		   
//		     days[0]="Sunday";   
//		     days[1]="Monday";  
//		     days[2]="Tuesday";  
//		     days[3]="Wednesday";  
//		     days[4]="Thursday";  
//		     days[5]="Friday";  
//		     days[6]="Saturday";  
//		     
//		   for(int i=0; i<days.length; i++) {
//			   //num=scan.nextInt();
//			   System.out.println("Please enter day of week");
//			   num=scan.nextInt();
//		   
//		   }for(int j=0; j<7; j++) {
//			   System.out.println(days[j]);
//		   
//		     
//	}
		   
		   
		   
		
			
			//int[] numbers=new int[5];
	
			//int index=0;
//			for(int i=0; i<=4; i++){
//			  System.out.println(numbers[i]);
//			}
//			System.out.println();
//				for(int j=5; j>=1; j--) {
//				  System.out.println(j);
//			  }
		        
//		        Scanner scan;
//		        scan=new Scanner(System.in);
//			
//			int[] numbers=new int[5];
//			
//			int index=0;
//			
//			do {
//		
//			int number=scan.nextInt();
//			numbers[index]=number;
//			index++;
//			}while(index<numbers.length); 
//			System.out.println("_________");
//				for (int i=numbers.length-1; i>=0; i--) {
//		            System.out.println(numbers[i]);
//		        }
//			
		   
//			    
//				int[] numberss= {45, 78, 12,  67, 55, 89, 23, 77, 88};
//				
//				for(int i=1; i<numberss.length; i+=3){
//				  System.out.println(numberss[i]/ i);
//			
//				}	   
//				
		   
		   
		   Scanner scan = new Scanner(System.in);
	        String[] day = new String[7];
	        for (int i = 0; i < day.length; i++) {
	            System.out.println("Please enter day " + (i + 1) + " of the week");
	            day[i] = scan.nextLine();
	        }
	        for (int i = 0; i <= day.length-1; i++) {
	            System.out.println(day[i]);
	        }
	    
	
		   
		   
		   
		   
	}

}
