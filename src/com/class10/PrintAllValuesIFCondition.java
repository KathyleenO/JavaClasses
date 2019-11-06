package com.class10;

public class PrintAllValuesIFCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		String[] animals= {"Cat", "Dog", "Cow", "Snake", "Elephant"};
		
		for(int i=0; i<animals.length; i++) {
			//System.out.println(animals[i]);
			
			if(animals[i].equals("Dog")) {     //if condition
				System.out.println("i love dogs");
			}else {
				System.out.println(animals[i]);
			}
		}
		
		//Task, create array of country
		
		String[] countries= {"Honduras", "El Salvador", "Spain","Mexico"};
		
		for(int i=0; i<countries.length; i++) {
			
			switch(countries[i]) {
			
			case "Honduras":
				System.out.println("Tegu");
				break;
				
			case "El Salvador":
				System.out.println("San Salvador");
				break;
			case "Spain":
				System.out.println("catalan");
				break;
			case "Mexico":
				System.out.println("Mexico city");
				break;
			
			}
			
			
			
		}
		
		
		
		
		
		
		
	}

}
