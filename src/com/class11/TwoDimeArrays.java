package com.class11;

public class TwoDimeArrays {

	public static void main(String[] args) {
		// create 2d array of String with 2 and 3 colums
		
		
		String[][] names=new String[2][3];
		
		//row 1
		names[0][0]="Kathy";
		names[0][1]="Erick";
		names[0][2]="Jonh";
		
		//row 2
		names[1][0]="Karla";
		names[1][1]="Melina";
		names[1][2]="Gordo";
		
		
		//SECOND WAY, DONT HAVE TO SPECIFY THE NUMBERS OF ROW AND COLUMS 
		//ALSO PUT COMMAS AFTER EACH ROW
		
		
		String[][] name= {
				
				{"ELena", "Job", "mom"},    //1 row     INDEX 0
				{"nicole", "ochoa", "Dominguez"},     //2 rows    INDEX 1
				{"erick", "daniel","lopez"},        //3 rows    INDEX 2
				{"LOVE", "CAT","DOG", "perro", "loca"} 
				
		};
		
		System.out.println(name[1][2]);   //Dominguez
		
		System.out.println("the numbers od rows are " +name.length);   // 4 rows
		System.out.println("the numbers of colums of the certain row" +name[3].length);  //lenght of collums of row 3
	}

}
