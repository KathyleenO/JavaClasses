package com.class7;

public class BooleanIfElseWhileLoop {

	public static void main(String[] args) {
		/*
		 * Create a boolean variable workDay and assign true create int variable day and assign it to 1

As long as it is workDay print “I need a day off” and increase day.
Once day is 6 or 7 print “I do not need a day off any more”
		 */

		
		boolean workDay=true;
		int day=1;
		
		while(workDay) {
				System.out.println(" I need a day off");
				if (day==6) { //only when it reaches 6 when its true this section
					workDay=false;
					System.out.println(" i do not need a day off");
					
				}else {
					System.out.println(" I need a day off");
				}
				day++;
		
		
		}
				
				
			
		
		
		
		
		
		
		
	}

}
