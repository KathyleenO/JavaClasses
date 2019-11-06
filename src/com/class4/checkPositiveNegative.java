package com.class4;

public class checkPositiveNegative{

	public static void main(String[] args) {
		
		// CHECK FOR NEGATIVE OR POSITIVE  also using shorthand
		
		
		int num=23;
		num=90;
		num-=200; // -100=90-200
		num-=110;
		num+=220;
		
		if (num>0) {
		System.out.println(num+ " is positive");
		}else if (num==0){
			System.out.println("Value of num is " +num);
		}else {
			System.out.println(num + " is negative");
		}
		
		//EVEN OR ODD
		
		int i=-40;
		
		if (i%2==00) {
			System.out.println(i+ " even number ");
		}else {
		System.out.println(i+ "odd number");
		}
		//OR
		
		if (i%2!=0) {
			System.out.println(i+ " odd number");
		}else {
			System.out.println(i+ " even number");
		}
		
		
	}

}
