package com.class25_1;

public class ConstructorsOverloading {

	// overloading happens when you make a constructor with different amount of
	// parameters
	ConstructorsOverloading() {

		System.out.println(" I am non argument constructor");
	}

	ConstructorsOverloading(String str) {

		System.out.println(" I am an argument constructor");
	}

//HAVING DIFFERENT DATATYPES PARAMETERS

	ConstructorsOverloading(int num) {

		System.out.println(" I am a constructor with 1 int param");
	}

	ConstructorsOverloading(double num1) {

		System.out.println(" I am a double constructor");
	}
}
