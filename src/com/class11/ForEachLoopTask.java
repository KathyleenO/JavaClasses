package com.class11;

public class ForEachLoopTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Cars
		
		
		String[] carTypes= {"BMW", "Honda", "Lexus", "Toyota", " Maserati", "VW"};
		
		for( String cars:carTypes) {     //ONE WAY
			System.out.println(cars);
		}
		
		System.out.println("*********");
		
		for(int c=0; c<carTypes.length; c++) {     //TWO WAY
			System.out.println(carTypes[c]);;
		}
		
		System.out.println("**********");
		
		//Arrsy of Int and calcualte Sum of all elements
		
		int[] numbers= {10,20,30,40};
		int sumAll=0;
		
	
		for(int i=0; i<numbers.length; i++) {       //ONE WAY
			sumAll=sumAll+numbers[i];
		}
		System.out.println(sumAll);              //ONE WAY
		
//		int sum2;
//		for(int num:numbers) {
//			sum=sum+num;		
//		
//	}
		System.out.println("******************");
		//TASK 3 COUNTRIES
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
		
		System.out.println("*******************");
		// 2nd Way to print Countries and print all capitals
		
				String[] array= {"Honduras", "USA", "Brazil"};
				
				for(int i=0; i<array.length; i++) {
					if (array[i].equals("Honduras")) {
						System.out.println("Tegu");
					}else if(array[i].equals("USA")){
						System.out.println("DC");
					}else if(array[i].equals("Brazil")){
						System.out.println("Amazon");
					}
				}///and so onnnnn else if else if else if
		
		System.out.println("****************");
				
				for(String getcountry: array) {
					if(getcountry.equals("Honduras")) {
						System.out.println("Tegu");
					}
					else if(getcountry.equals("USA")) {
						System.out.println("DC");
					}else if(getcountry.contentEquals("Brazil")){
						System.out.println("Amazon");
					}
							
				}
		
	}

}
