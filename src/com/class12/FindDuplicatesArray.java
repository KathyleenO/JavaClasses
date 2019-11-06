package com.class12;

public class FindDuplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array2= {2,5,4,7, 7, 8,9,8, 2};
		for(int i=0; i<array2.length; i++) {
			for(int j=i+1; j<array2.length; j++) {
				if(array2[i]==array2[j]) {
					System.out.println(array2[j]);
				}
			}
		}
		
		
		
	}

}
