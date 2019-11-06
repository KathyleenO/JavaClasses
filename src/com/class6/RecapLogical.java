package com.class6;

public class RecapLogical {

	public static void main(String[] args) {
		/*
		 * 
		 */
		
		
		int time=17;
		String timeOfDay=null;
		
		if(time>=1 && time<=11) {
			timeOfDay="morning";
		}else if(time>=12 && time<=15) {
			timeOfDay="noon";
		}else if(time>=16 && time<=20) {
			timeOfDay="evening";
		}else if(time>20 && time<=24) {
			timeOfDay="Night";
		}else {
			//timeOfDay="Invalid";
		}
		
		System.out.println("time of the day is "  +timeOfDay);
		
		if(timeOfDay.equals("Morning")) {           // You can use variable for later on
			System.out.println("good morning");
		}
		
		
		
		
		
	}

}
