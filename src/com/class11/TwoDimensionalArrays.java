package com.class11;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		
		
		// Declare 2D array
		
		int[][] d=new int[3][4];
		
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
		
		System.out.println(d[1][3]);
		
		
		int[][] numList= {{8,7,5,3,8},{1,5,6,4,9},{3,6,8,0,7}};
        //To Identify the numbers of rows
        System.out.println("The numbers of the rowa are: "+numList.length);
        //To identify the numbers of columns/elements in that row
        System.out.println("The numbers in the columns are: "+numList[1].length);
        
        for(int i=0; i<numList.length; i++) {       //PRINTS ONE ROW AT TIME
            for(int j=0; j<numList[i].length; j++) {    //PRINTS COLUMS ALL NUMBERS IN ROW  {THE i will loop the rows
            System.out.print(numList[i][j]+" ");
            }
        }
		
	}

}
