package com.class8;

import java.util.Scanner;

public class BreakContinueTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print 1-50 except divisible by 3
		
		
		
		for(int d=1; d<=50; d++ ) {
			if(d%3!=0) {
				System.out.println(d);
				continue;
			}
			
				
		//ask user to apply for card	10 times until they say yes	
			}
//		Scanner scan=new Scanner(System.in);
//		String card;
//		for(int card=1; card<=10; card++) {
//			System.out.println("please appply to credit card");
//			card=scan.next();
//			
//			if(card.equals("Yes")) {
//			break;
//			}
//				
//			}
			
		
		Scanner input=new Scanner(System.in);
        String credit;
        
        for(int card=1; card<=10; card++) {
            System.out.println("Would you like a credit card?");
            credit=input.nextLine();
            if(credit.equals("yes")) {
                break;
            }
        }
            	
		
	

        }
}