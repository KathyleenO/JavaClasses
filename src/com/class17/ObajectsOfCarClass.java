package com.class17;

public class ObajectsOfCarClass {

	public static void main(String[] args) {
		
		
		// to create a class car and object use
		// Class name object name=new Class name();

		
		Car car1=new Car();
		car1.make="Tesla";
		car1.model="S3";
		car1.color="Black";
		car1.year=2020;
		car1.wheels=4;
		car1.windows=5;
		car1.speed=200;
		
		//Behaviors
		car1.drive();
		car1.reverse();
		car1.start();
		
		Car car2=new Car();
		
		car2.make="BMW";
		car2.model="i8";
		car2.color="White and Blue";
		car2.year=2019;
		car2.wheels=4;
		car2.windows=6;
		car2.speed=200;
		car2.make="LExus";   //change the value
		
		//Behaviors
		car2.drive();
		car2.reverse();
		car2.start();
		
		
		
		//Print Features of car
		//I have a black testla
		System.out.println("I have a " +car1.color + car1.make);
		//I drive a BMW 2019 
		System.out.println("I drive a " +car2.make +car2.year);
		
		
	}

}
