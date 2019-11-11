package com.class15;

public class ArraysConcept {

			public static void main(String[] args) {

			int nums[] = { 12, 15, 16, 17, 19 };

			   for (int i = nums.length-1; i >0; i--) {

			      System.out.println(nums[i]);

			    }
		
		
			   int i = 50;

			   int[] a = new int[10];
			   System.out.println(a.length);

			   a = new int[100];
			   System.out.println(a.length);

			   a = new int[i];
			   System.out.println(a.length);
		
			   
			   
			   int[] a1 = {12, 15, 11, 13, 9, 25};
			   int[] a2 = {12, 15, 11, 13, 9, 25};
			   int sum = 0;
			   for (int i1 = 0; i1 <a1.length; i1++) {
			            if (a1[i1] % 2== a2[i1 ] % 5)  {
			                     sum += i1 * i1;
			            }
			   }
			   System.out.println("sum = " + sum);
			   
			

			   
				   int[] egArray = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };

				   for ( int index= 0 ; index < 5 ; index++ ) {
				          System.out.print( egArray[ index ] + " " );
				   }
			   
   
			   System.out.println();
			             int arr[] = new int[5];
					    int [] arr1 = new int[5];
					    int arr2[] = new int[5];
				    //int arr[] = int [5] new; bad way
					    
					    
					    char array_variable [] = new char[10];
					    for (int i2 = 0; i2 < 10; ++i2) {
					             array_variable[i2] = 'i';
					             System.out.print(array_variable[i2] + " ");
					    }
		
					    
					    
					    System.out.println();
					    int array_variable1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

					    int sum1 = 0;

					    for (int i3 = 0; i3 < 3; ++i3) {

					       for (int j = 0; j < 3; ++j) {

					           sum1 = sum1 + array_variable1[i3][j];

					       }

					    }

					    System.out.print(sum1 / 5);	    
					    
					    
					    System.out.println();
					    int[] array = { 1, 4, 3, 6, 8, 2, 5 };

					    int what = array[0];

					    for (int index = 0; index < array.length; index++) {

					           if (array[index] > what) {

					                      what = array[index];

					            }

					    }

					    System.out.println(what);	 
					    
					    System.out.println();
					    int[] zip = new int[5];

					    zip[0] = 7;
					    zip[1] = 3;
					    zip[2] = 4;
					    zip[3] = 1;
					    zip[4] = 9;

					    System.out.println( zip[ 2 + 1 ] );
					    
					    
					    
			
	}

}
