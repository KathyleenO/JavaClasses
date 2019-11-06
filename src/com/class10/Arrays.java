package com.class10;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	// 1st way to write arrays
		
		int[] array;  //create varibale type
		
		array=new int[4];  // assign how many values will carry
		
		array[0]=10;   ///assign ACTUAL values
		array[1]=20;
		array[2]=30;
		array[3]=40;
		
		System.out.println(array[2]);
		
		//Second way 
		
		//size of Array is fixed
		int[] numbers=new int[3];
		
		numbers[0]=5;
		numbers[1]=10;
		numbers[2]=15;
		//numbers[3]=20; // no error here in compiler but error in console //ArrayIndexOutofBoudsException
		System.out.println(numbers[2]); //3 error
		
		
		String[] a=new String[3];
		a[0]="Hello";
		a[1]="Hi";
		a[2]="bye";
		
		System.out.println(a[1]+ " Friend");
		
		//lets create an array that will store classes
		
		
		String[] classes=new String[4];
		
		classes[0]="Java";
		classes[1]="SDLC";
		classes[2]="Manual testing";
		classes[3]="GIT";
		
		System.out.println("Today we have " +classes[0] + " class");
		
		int[] num=new int[3];
		
		num[0]=1;
		num[1]=2;
		num[2]=3;
		//how to change 1-100
		num[0]=100;
		
		System.out.println(num[0]);
		System.out.println(num[0]+ num[2]);
		
		double[] number=new double[4];
		
		number[1]=100;
		number[3]=200;
		
		System.out.println(number[2]); //Print out DEFAULT VALUES bc no value stored
		
	}

}
