package com.class30;

public class VehicleTest {

	public static void main(String[] args) {

		BMW bmw = new BMW("8798676", "Sedan", "bmw", "x5");
		//BMW.displayTotal();
		// comes from BMW class
		bmw.display();
		// comes from Car Class
		bmw.breaking();
		// comes from Vehicle class
		bmw.drive();
		bmw.speed();
		bmw.start();
		bmw.stop();
		Car car = new BMW("8798676", "Sedan", "bmw", "x5");
		//car.displayTotal();
		// comes from vehicle class
		car.drive();
		car.stop();
		car.speed();
		car.start();
		// comes from car class
		car.breaking();
		// comes from bmw wont be available to parent
		// car.display();
		Vehicle vehicle = new BMW("8798676", "Sedan", "bmw", "x5");
		vehicle.displayTotal();
		vehicle.drive();
		vehicle.stop();
		vehicle.speed();
		vehicle.start();
		// cpmes from car classs - wont be available to parent
		// vehicle.breaking();
		// comes from BMW class wont be availale to grandparent
		// vehicle.display();

	}

}
