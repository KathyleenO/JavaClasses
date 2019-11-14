package com.class18;

public class Main {

	/*Create a method that will take 2 parameters as a numbers and prints which number is larger.
      Create a method that will take a number and prints whether the number is even or odd.
      Create a method that will print whether given String is palindrome or not.
	 * 
	 * 
	 * 
	 */
	
	
	
	void largest(int a, int b) {
		if(a>b) {
			System.out.println(a+ "largest");
		}else if(a<b) {
			System.out.println(b+ "largest");
		}else {
			System.out.println("numbers are equal");
		}
	}
	
	void evenOrOdd(int num1) {
		if(num1%2==0) {
			System.out.println(num1+ " is even");
		}else {
			System.out.println(num1+ " is odd");
		}
	}
	
	void polindrome(String original ,String reverse) {
		
		for (int i =original.length()-1 ; i >=0; i--) {
			reverse+=original.charAt(i);  //+k=k+a+Kk
		}
		
		System.out.println(reverse);
		if(original.equals(reverse)) {
			System.out.println("Strings are Polindrome");
		}else  {
			System.out.println("Strings not polindrome");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Main obj=new Main();
	
	obj.largest(0, 40);
	obj.evenOrOdd(5);	
	obj.polindrome("non", "");	
		

	}

}
