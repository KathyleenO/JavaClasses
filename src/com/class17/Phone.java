package com.class17;

public class Phone {

	
	//Features/atributes
	
	String name, brand, color, capacity;
	int generation, size, price;
	

	//Behaviors
	
	void playGames() {
		System.out.println("I can play games on my " +name);
	}
	void calls() {
		System.out.println("I can make calls with my " +name);
	}
	void texts() {
		System.out.println("I can text with my " +name);
	}
	void selfies() {
		System.out.println("I can take selfies with my " +name);
	}

	
	public static void main(String[] args) {
	

		Phone phone1=new Phone();
		
		phone1.brand="Apple";
		phone1.name="iPhone";
		phone1.color="Teal";
		phone1.generation=11;
		phone1.capacity="64GB";
		phone1.price=700;
		
		phone1.playGames();
		phone1.selfies();
		phone1.calls();
		phone1.texts();
		
		
		Phone phone2=new Phone();
		
		phone2.name="Android";
		phone2.brand="Galaxy";
		phone2.color="Black";
		phone2.generation=8;
		phone2.capacity="32GB";
		
		phone2.playGames();
		phone2.calls();
		phone2.selfies();
		phone2.texts();
		
		
		
		
	}

}
