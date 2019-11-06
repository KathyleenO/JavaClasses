package com.class5;

import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[] args) {
		/*  ask user to enter age
		 * if age is from 1-3= baby
		 * if age is from 3-5= toddler
		 * if age from 5-12=kid
		 * if age 12=19 = teenager
		 * if age >20 =adult
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter age");
		int age=scan.nextInt();
		
		if(age>=1 && age<=3) {
			System.out.println("you are a baby");
		}else if(age>3 && age<=5) {
			System.out.println("toddler");
		}else if(age>5 && age<=12) {
			System.out.println("kid");
		}else if (age>12 && age<=19) {
			System.out.println("teenager");
		}else if(age>=20) {
			System.out.println("adult");
		}else {
			System.out.println("invlaid");
		}
		
		
		
	}

}
