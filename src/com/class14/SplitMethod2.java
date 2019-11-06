package com.class14;

public class SplitMethod2 {

	public static void main(String[] args) {
	
		
		
		//  how to separate comma d string

		
		String str="if you come to class early, "
				+ "then you can study more, "
				+ "also you can learn more, and you can leabe early";
		
		String []  array=str.split(",");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].trim());   
			
		}
		
		System.out.println("************************");
		
		
		String str1="Welcome To Syntax technologies";
		
		String[] array2=str1.split("  ", 2)  ;      //regular expression limit of how many sentences
		System.out.println(array2.length);
	
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i].trim());
		}
		
	}

}
