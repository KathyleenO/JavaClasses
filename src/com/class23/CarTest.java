package com.class23;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car.make="Toyota";
		Car car1=new Car();
		car1.model="Camry";
		car1.color="Pink";
		car1.speed=200;
		car1.doors=4;
		car1.getDetail();

		
		System.out.println("----------");
		
		BetterCars.make="Toyota";
		
		BetterCars betterCar1=new BetterCars("Corrola", "White", 180, 5);
		
		betterCar1.getDetails();
		
	
		Car car2=new Car();
		car2.model="Corolla";
		car2.color="Blue";
		car2.speed=900;
		car2.doors=2;
		car2.getDetail();
		
		Car car3=new Car();
		car3.model="Corolla";
		car3.color="Blue";
		car3.speed=900;
		car3.doors=2;
		car3.getDetail();
		
		car3.getDetail();
		
		
	}

}
