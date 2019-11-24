package com.class22;

public class Human {

	

	String name;
	String lastName;
	static int nose=1;
	static int eyes=2;
	static boolean brain=true;
	
	
	
	public static void main(String[] args) {
		
		Human hum1=new Human();
		hum1.name="JOhn";
		hum1.lastName="Smith";
		System.out.println("Printing static varibales");
		System.out.println(Human.eyes);
		System.out.println(hum1.nose);
		System.out.println(brain);
		System.out.println("Human 1 name is " +hum1.name+ hum1.lastName+ " has " +Human.nose +" nose " + " has " +eyes+ " eyes " );
		
		
		
		Human human2=new Human();
	    
		 human2.name="teresa";
	     human2.lastName="miller";
         human2.lastName="doe";     //reassing
	     
	     System.out.println(hum1.lastName);
	     System.out.println(human2.lastName);
	     
	     
	     
	     
	}

}
