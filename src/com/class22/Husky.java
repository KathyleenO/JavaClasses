package com.class22;

public class Husky {

	//Static variables
	
	static String breed="Husky";
	static int paws=4;
	static int tail=1;
	
	//Instance variables
	String name;
	String color;
	
	void display() {
		
		System.out.println("Puppy name is " +name+  " and its breed is " +breed );
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Husky dog=new Husky();
		dog.name="Meatball";
		dog.color="brown";
		dog.display();
		
		Husky dog1=new Husky();
		dog1.name="sharik";
		dog1.color="black";
		dog1.display();
		

		Husky dog3=new Husky();
		dog3.name="Jack";
		dog3.color="black";
		dog3.breed="Bulldog";
	
		System.out.println("change breed");
		dog3.display();
		dog1.display();
		dog.display();
		
		
	}

}
