package com.class11;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] d=new int[4][4];      ///first specify rows then collums
		
		//row 1
		d[0][0]=12;
		d[0][1]=13;
		d[0][2]=14;
		d[0][3]=15;
		
		//row 2
		d[1][0]=1;
		d[1][1]=2;
		d[1][2]=3;
		d[1][3]=4;
		
		//row 3
		d[2][0]=5;
		d[2][1]=10;
		d[2][2]=15;
		d[2][3]=20;
		//row 4
		d[3][0]=100;
		d[3][1]=200;
		d[3][2]=300;
		d[3][3]=400;
		
		
		System.out.println(d[1][2]); //3
		System.out.println(d[2][3]);//20
		
		
		//SECOND WAY TO WRITE A 2DIMENTIONAL ARRAY
		
		int [][] c= {
				{12,13,14,15},
				{1,2,3,4},
				{5,10,15,20},
				{100,200,300,400}			
		};
		
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				System.out.println(c[i][j]);
			}
		}
		
	}

}
