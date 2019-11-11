package com.class17;

public class Computer {

	//Features/Attributes
	
	
	int screen, memory;
	String brand, name;
	boolean keyboard;
	
	
	//Behavior
	
	void playGames() {
		System.out.println("I can play on my " +name);
	}
	
	void coding() {
		System.out.println("I can do Java coding on my " +name);
	}
	
	
	void watchMovies() {
		System.out.println("I can watch movies on my " +name);
	}
	
	//Nothing will print FROM ABOVE
		
 public static void main(String [] args) {

Computer comp1=new Computer(); 
	 //Features
	 comp1.brand="Apple";
	 comp1.name="Mackbook Pro";
	 comp1.memory=250;
	 
	 //Behavior
	 System.out.println("I have a " +comp1.brand+ comp1.name);
	 comp1.coding();
	 comp1.watchMovies();
	 comp1.playGames();
	 
	 System.out.println();
	 System.out.println("Creating Second object computer 2");
	 System.out.println();
	 
	 Computer comp2=new Computer();
	 //Features
	 comp2.brand="Dell";
	 comp2.name="420";
	 comp2.memory=125;
	 
	 //Behavior
	 comp2.coding();
	 comp2.watchMovies();
	 comp2.playGames();
	 
	 
	 
	 
	 
}	
}
