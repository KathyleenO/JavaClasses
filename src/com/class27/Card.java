package com.class27;




public class Card {

	public void chargeInterest() {
		System.out.println("Card charges 25% interest");
	}
	public void creditLimit() {  //overridden 
		System.out.println("Credit limit of the card is 5000");
	}
	
	
	
}
class AX extends Card{

	public void creditLimit() { //overriding method
		System.out.println("Credit limit of AX card is 25000");
	}
	
	
	
}
class MC extends Card{
	public void creditLimit() { //overriding method
		System.out.println("Credit limit of MC card is 15000");
	}
	
	public void cashBack() {
		System.out.println("MC gives cash back of 3%");
	}
	
}
class Visa extends Card{
	public void creditLimit() { //overriding method
		System.out.println("Credit limit of Visa card is 20000");
	}
}
class Discovery extends Card{
	public void applePay() {
		System.out.println("Discovery can take apple pay");
	}
}


	
