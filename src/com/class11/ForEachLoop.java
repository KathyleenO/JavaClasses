package com.class11;

public class ForEachLoop {

	public static void main(String[] args) {
		
		//Advaced for loop, for each loop or  Only used for Array or Collection 
		//Non-primitive

		String[] students= {"Shaban", "Bilal", "mehet" , "Zaki","Samir", "Frank"};
		
		for(String st:students) {
			System.out.println(st);  //datatype anyvariable name: array variable
		}


		//EXAMPLE 2
		
		int [] numbers= {12,13,14,15,16,17};
		
		for(int monkey:numbers) {
			System.out.print(monkey+ " ");
			
		}
		
		//EXAMPLE 3
		
		int[] numberList= {2,3,5,7};
		
		for(int element:numberList) {
			System.out.println(element);
		}
		
		
		
		// TASK CAR
		String[] carType={"BMW", "Honda", "Lexus"};
		
		for(String car:carType) {
			System.out.println(car);
		}
		
		// Countries and print all capitals
		
		String[] array= {"Honduras", "USA", "Brazil"};
		
		for(int i=0; i<array.length; i++) {
			if (array[i].equals("USA")) {
				System.out.println("DC");
			}else if(array[i].equals("russia")){
				System.out.println("moscow");
			}
		}///and so onnnnn else if else if else if
	
		//ANOTHER WAY USING SWITCH 
		
		
		String[] countries= {"Honduras", "USA", "Brazil"};
		
		for(String country:countries) {
			
			
			switch(country) { //country bc the index will change from honduras to usa to brazil
			
			case "Honduras":
				System.out.println("Tegu");
			break;
			
			case "USA":
				System.out.println("Dc");
			case "Brazil":
				System.out.println("Amazon");
				
			}
			
		}
		
		
		
		
		
	}

}
