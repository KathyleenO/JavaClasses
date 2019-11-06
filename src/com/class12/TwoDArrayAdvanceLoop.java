package com.class12;

public class TwoDArrayAdvanceLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] array=new int[2][3];
		
		//row 1
		array[0][0]=9;
		array[0][1]=10;
		array[0][2]=11;
		
		
		//row 2
		array[1][0]=12;
		array[1][1]=13;
		array[1][2]=14;
		
		
		for(int arr[]:array) {          //FOR ADVANCE ARRAY PROVIDE []
			//System.out.println(arr) // CAN NOT DO THIS to print all values
	
		for(int j:arr) {
			System.out.println(j);
		}
		
		}
		
		
		System.out.println("***************");
		
		int [][] array1= {
				
				{44,55,67},
				{11,22,33},
				
		};
		
		for (int[] is : array1) {
			for (int  is2 : is) {
				System.out.println(is2);
			}
		}
		
		
		
		
	}

}
