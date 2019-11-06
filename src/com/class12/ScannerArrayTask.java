package com.class12;

import java.util.Scanner;

public class ScannerArrayTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array2= {2,5,4,7};
	
	for(int i:array2) {
		System.out.println(i);
		}
		
		int[] a=new int[5];
		
		Scanner scan;
		scan=new Scanner(System.in);
		
		for(int i=0; i<a.length; i++) {
			a[i]=scan.nextInt();                        ///THIS INPUTS THE INTEGERS FROM CONSOLE
		}
		for(int j=0; j<a.length; j++ ) {             /// THIS ONE PRINTS ALL VALUES THAT YOU INPUT IN CONSOLE
			System.out.println(a[j] + " " );
		}
		
		
		
		
	}

}
