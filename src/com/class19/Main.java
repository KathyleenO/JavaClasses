package com.class19;

public class Main {

	String createEmail(String name, String lasName, String email) {
		String out=name+lasName+email;
		return out ;
	}
	
	
	boolean prime(int num){
		
		boolean isPrime = true;
		if (num <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i < num; i++) {

				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		
		return isPrime;
	}
	
	
	public static void main(String [] args) {
		
		
		
		Main info=new Main();
		
		String output=info.createEmail("kathy", "ochoa", ".gmail");
		System.out.println(output);
		
		boolean a=info.prime(2);
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
