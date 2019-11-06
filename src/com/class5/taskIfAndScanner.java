package com.class5;

import java.util.Scanner;

public class taskIfAndScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		System.out.println("do you have a credit cad? true or false");
		boolean cc=scan.nextBoolean();
		
		if(cc) {
			System.out.println("what is the balance on the card?");
			int balance=scan.nextInt();
			
			if(balance>1000) {
				System.out.println(" pay card");
			}else {
				System.out.println("spend more");
			}
				
		}else {
			System.out.println("would you like to apply");
		}
		System.out.println();
		
	}

}
