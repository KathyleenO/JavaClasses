package com.class5;

public class LogicalAnd {

	public static void main(String[] args) {
		/*num between 1-10 = small
		 * num between 10-100 = medium 
		 * num between 100=1000 large 
		 * else "num out of range"
		 */
	//AND use &&
	
	int num=200;
	
	if(num>1 && num<10) {
		System.out.println("num is small");
	}else if(num>10 && num<100) {
		System.out.println("num is medium");
	}else if(num>100 && num<1000) {
		System.out.println("num is large");
	}else {
		System.out.println("num out of range");
	}
		
	//OR
	/* 7 days a week
	 * if days is 2 or4 ---- SDLC class
	 * if day is 6 or 7----- Java class
	 * if day 1 or 5----- no class
	 * if day =3---- review class
	 */  
	
	int day=7;
	
	if(day==2 || day==4) {
		System.out.println("SDLC class");
	}else if(day==6 || day==7) {
			System.out.println("Java class");
		}else if (day==1 || day==5) {
			System.out.println("no class");
		}else if (day==3) {
			System.out.println("review class");
		}else {
		System.out.println("Not a Valid day");
	}
	
	
	String weekDay="Monday";
	
	if (weekDay.equals("Tuesday")|| weekDay.equals("Thursday")) {
		System.out.println("SDLC class");
	}else if(weekDay.equals("saturday")|| weekDay.equals("Sunday")) {
		System.out.println("Java Class");
	}else if(weekDay.equals("Monday")|| weekDay.equals("friday")) {
		System.out.println("No class");
	}else if(weekDay.equals("wednesday")) {
		System.out.println("review class");
	}else {
		System.out.println("not a valid day ");
	}
	
	
	
	
	
	
	}

}
