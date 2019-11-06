package com.class3;

public class ShortHandOperators {

	public static void main(String[] args) {

		int num = 1000;
		num = num + 1000;
		System.out.println(num); //2000

		int num2 = 10;
		num2 = num2 - 5;
		System.out.println(num2); //5

		int num3 = 1000;
		num3 += 1000;
		System.out.println(num3); //2000

		int num4 = 50;
		num4 += 20;// num4=num4+20 
		System.out.println(num4); //70

		num4 -= 30;
		System.out.println(num4);//70-30=40

		num4 /= 10;
		System.out.println(num4); //40/10 =4

		num4 %= 2; //4/2=0
		System.out.println(num4);
		

	}

}
