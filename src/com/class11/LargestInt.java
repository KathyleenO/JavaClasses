package com.class11;

public class LargestInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int[] numbers= {500, 20, 13, 499, 65};
	int largest=numbers[0];
			
	for(int i=0; i<numbers.length; i++) {
		
		if(numbers[i]> largest) {
			largest=numbers[i];
		}
	}
		
	System.out.println("largets number is" +largest);	
		
	}

}
