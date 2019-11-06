package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int [] number=new int[2147483647]; //MAX NUMBER
		
		int[] num=new int[4];
		
		num[0]=12;
		num[1]=13;
		num[2]=14;
		num[3]=15;
		
		System.out.println(num.length); //gives you how many numbers are stored
		
		//THIRD AND EASIER WAY TO STORE ARRAYS
		
		String[] array= {"winter", "fall", "spring", "summer"};
		//print I was born in summer
		System.out.println("i was born in " +array[3]);
		int arraySize=array.length; /// will print integer size of the array how many values it holds
		
		
	}

}
