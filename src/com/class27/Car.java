package com.class27;

public class Car {

	
	String make, model;
	int year;
	
	Car(){
		System.out.println(" I am non argumnet  constructor");
	}
	
	public void display() {
		System.out.println("We build " +year+ make+ model);
	}

	public static void main(String[] args) {
		//SIDENOTE   int num; ssytem.out(num)==> compiler error mus be initiliazed
		
		Car car=new Car();
		car.display();
		
		
		
		
	}
	
	class Tesla extends Car{
		
		boolean autopilot;
		Tesla(){
			super();
			System.out.println(" non argument constructor of child class");
		}
	}
	
	
}
