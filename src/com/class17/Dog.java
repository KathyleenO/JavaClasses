package com.class17;

public class Dog {

	
	//Features/attributes
	
	String hairColor,size, breed; 
	int paws,eyes, years;
	
	
	
	//Behaviors
	
	void bark() {
		System.out.println("My" +breed+ " can bark");
	}
	
	void eat() {
		System.out.println("My" +breed+ " can eat");
	}
	
	void jump() {
		System.out.println("My" +breed+ " can jump");
	}
	void fetch() {
		System.out.println("My" +breed+ " can fetch");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dog perro1=new Dog();
		//features 
		perro1.breed="Husky";
		perro1.size="Medium";
		perro1.hairColor="Gray and White";
		perro1.paws=4;
		perro1.eyes=2;
		perro1.years=6;
		//behaviors
		
		perro1.bark();
		perro1.eat();
		perro1.fetch();
		perro1.jump();
		
		Dog perro2=new Dog();
		perro2.breed="Bulldog";
		perro2.size="Small";
		perro2.hairColor="Brown";
		perro2.paws=4;
		perro2.eyes=2;
		perro2.years=3;
		
		//Behaviors
		perro2.bark();
		perro2.eat();
		perro2.fetch();
		perro2.jump();
		
		Dog perro3=new Dog();
		perro3.breed="Labrador";
		perro3.size="large";
		perro3.hairColor="Dark Brown";
		perro3.paws=4;
		perro3.eyes=2;
		perro3.years=3;
		
		//Behaviors
		perro3.bark();
		perro3.eat();
		perro3.fetch();
		perro3.jump();
		
		
	}

}
