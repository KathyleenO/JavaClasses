package com.class12;

public class SingleArrayRecapDemo {

	public static void main(String[] args) {
		
		System.out.println("SINGLE ARRAY");
		int [] array1=new int[4];
		
		array1[0]=12;
		array1[1]=13;
		array1[2]=14;
		array1[3]=14;
		
		System.out.println(array1[1]);
		
		System.out.println("FOR LOOP ");
		
		int sum1=0;
		
		for (int i = 0; i < array1.length; i++) {      //s is index 0123
			System.out.println(array1[i]);               //array1 +i gives the numbers in array  in 0 index 1 index and 2 index
			sum1=sum1+array1[i];
		} 
		System.out.println("the sum of array1 is "+ sum1);
		
		System.out.println("ADVANCE OR FOR EACH  LOOP");
		
		for(int nums:array1) {
			System.out.println(nums);
		}
		
	}

}
