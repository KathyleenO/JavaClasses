package com.class6;

import java.util.Scanner;

public class LogicalOrTaskString {

	public static void main(String[] args) {
		/*ask user to enter the month they were born 
		 * based on the month define the season 
		 * if user born jan, feb, dec = winter
		 * march, april, may = spring
		 * june july August = summer
		 * sep, october, november = fall
		 * other wise unknown
		 * at end of program "Born in +season
		 *  
		 */

		Scanner scan;
		String season;
		scan =new Scanner(System.in);
		System.out.println("please enter the Month you were born");
		String month=scan.nextLine();
		
		if(month.equals("January") || month.equals("february") || month.equals("december")) {
			season="Winter";
		}else if(month.equals("March") || month.equals("April") || month.equals("May")) {
			season="Spring";
		}else if(month.equals("June") || month.equals("July") || month.equals("August")) {
			season="SUMMER";
		}else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season="fall";
		}else {
			season="Unknown";
		}
				
		System.out.println("you were born in "  +season);
	
		
		
		
		
		
	}

}
