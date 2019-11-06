package com.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*ask user ti ebter boolean value for sale
		 * if no sale- iam not shopping 
		 * if sale = check the price of the item 
		 * based on the amount we will have to calculate the price after discount
		 * if price <20= aplly 10%
		 * if price between 20-100= 20%
		 * if price 100-500 = 30%
		 * anything =50%
		 * 
		 * after discount +discount the price of item redice from  1-90
		 *  
		 */

		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Is there a Sale True or False?");
		boolean value=scan.nextBoolean();
	    double discount;
		double price;
		double finalPrice;
		
		if(!value) {
			System.out.println("i am not shopping");
		}else {
			System.out.println("what is the actual price");
			price=scan.nextDouble();
		if(price<20) {
			discount=price*0.1;
		}else if(price>=20 && price <=100) {
			discount=price*0.20;
		}else if (price>100 && price<=500) {
			discount=price*0.30;
		}else {
			discount=price*0.50;
		}
		finalPrice=price-discount;
		System.out.println("after discount " +discount+ " the price of the item reduce from " +price+ " to " +finalPrice );
		
		
		}
			
		
		
		
		
	}

}
