package com.class27;

public class CardTest {

	public static void main(String[] args) {

// take an Object of CHILD class and give referencer to PARENT
// reference variable=object is created		
		Card card = new AX();
		card.chargeInterest();
		card.creditLimit();

		// MASTER CARD EXAMPLE HOW TO ACCES WITH FOR LOOP AND WITH PARENT CLASS RUN TIME

		Card card1 = new MC();
		card1.chargeInterest();
		card1.creditLimit();
		// card1.cashBack //NOT AVAILABLE BC PARENT CANT ACCESS FEATUERES OF CHILD

		//CAN ONLY ACCESS THESE WITH LOOP AND ARRAY
		MC mc1 = new MC();
		mc1.creditLimit();
		mc1.cashBack();
		mc1.chargeInterest();
        MC mc2 = new MC();
		MC mc3 = new MC();
        //STORE 
		MC[] masterCards = { mc1, mc2, mc3 }; // c1 cannot access bc of parent class ONLY THOSE WITH MC
         //THEN PRINT WITH FOR LOOP 
		for (MC mecard : masterCards) {
			mecard.cashBack();
			mecard.chargeInterest();
			mecard.creditLimit();
		}
		Card card2 = new Visa();
		card2.creditLimit();

		// type [] arrayName={};
		// type [] arrayName=new Type[how big];

		int[] numArray = { 10, 12, 13 };
		String[] stringArray = { "aa", "bb" };

		// First create objects and assign to the variables and
		// then stored those variables inside the Array
		Card[] cardArray = { card, card1, card2 };
		// Second way to store is this.create object and store it directly into array
		Card[] cardArray1 = { new MC(), new AX(), new Visa(), new Discovery() };
		System.out.println("______________");
		// cardArray[0]--> MC
		// cardArray[2]---> Visa

		for (Card mycard : cardArray1) {
			mycard.creditLimit(); // ONLY GIVES YOU ACCESS TO THE PARENT CLASS METHODS N CONSTRUCTOES
			mycard.chargeInterest();

		}
	}

}
