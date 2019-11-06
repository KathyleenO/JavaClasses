package com.class7;

import java.util.Scanner;

public class ScannerDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scan=new Scanner(System.in);
//		
//		int i=1;
//		
//		while(i<6) {
//			System.out.println("Please enter your name");
//			String name=scan.nextLine();
//			System.out.println("Good afternoon " + name);
//			i++;
//			}
//	
	
	/* ask user to pay for coffee
	 * YOu need to keep asking user to pay for it until 
	 * entered price is equal to 5
	 * after user paid then say " enjoy your coffee!"
	 * 
	 */
	
		
		// WHILE EXAMPLE
		
//		Scanner input=new Scanner(System.in);
//        System.out.println("Enter amount");
//         
//        int bill=input.nextInt();
//        while(bill<5) {
//            System.out.println("Please pay for your coffee");
//            bill++;
//        }
//        System.out.println("Enjoy your coffee");
//   
	
		
		//DO WHILE EXAMPLE
		
		
	Scanner scan=new Scanner(System.in);
	int price;
	
	do {
		System.out.println("Please pay for your coffee");
		price=scan.nextInt();
		
	}while(price!=5);
        
      
	//While looop
       int price1; 
	  System.out.println("please pay coffe");
       price1=scan.nextInt();//4
       
       while(price1!=5) {
		System.out.println("please pay for your coffe");
		price=scan.nextInt();
	}
        
       System.out.println("enjoy coffee"); 
        
        
	}	
	}


