package com.class13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner scanner=new Scanner(System.in);	
	System.out.print("Enter your class day");
	String day=scanner.nextLine();
		
		//String day1=day.toLowerCase(); can use this instead of rewriting lowercase in each code
		
	if(day.trim().toLowerCase().equals("saturday")) {         //to fix problems of lowercase can use  day.tolowecase.equals("saturday")
		System.out.println("Saturday is your Java Class");
	}else if (day.equalsIgnoreCase("sunday")) {
		System.out.println("Sunday si GIT class");
	}else if(day.toUpperCase().equals("TUESDAY")) {
		System.out.println("Tuesday is your SDLC class");
	}else if(day.equals("Thursday")) {
		System.out.println("Thursday is your Manual Testing class");
	}else {
		System.err.println("Invalid Entry!! Please enter valid class day");
	}
	
	scanner.close();
	
	
		
	}

}
