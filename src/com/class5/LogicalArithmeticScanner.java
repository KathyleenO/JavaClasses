package com.class5;

import java.util.Scanner;

public class LogicalArithmeticScanner {

	public static void main(String[] args) {
		/** ask user to enter daily sales 
* based on the sales range we want to give commission to the person
* if sales is <100 --> commission is 10%
* if sales if between 100 -200 --> commission of 20%
* etc...
		 * 
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("PLease enter your sales amount");
		double salesAmount=scan.nextDouble();
		double comission;
		
		if(salesAmount>=1 && salesAmount<100) {
			comission=salesAmount*0.1;
		}else if(salesAmount>=100 && salesAmount<200) {
			comission=salesAmount*0.2;
		}else if(salesAmount>=200 &&  salesAmount<500) {
			comission=salesAmount*0.30;
		}else if(salesAmount>=500) {
			comission=salesAmount*0.5;
		}else {
			comission=0;
		}
	
		System.out.println("based on your sales your comission is " +comission);	
			
			
			
			
			
			
			
	}

}
