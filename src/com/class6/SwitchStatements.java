package com.class6;

public class SwitchStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* switch statements executes one statement from multiple conditions
		//works with byte,short,char,int, and String
		//NOt work LONG OR BOOLEAN, float or double
		 * cannot use RELATION OPERATOR 
		 * ONLY EQUALITY
		 * in the switch case provide correct DATATYPE
		 * 7 weekdays if day==1--> Monday if day==2 --> Tuesday
		 */

	int day = 6;
	String weekDay;

		if (day == 1) {
			weekDay = "Monday";
		} else if (day == 2) {
			weekDay = "Tuesday";
		} else if (day == 3) {
			weekDay = "Wednesday";
		} else if (day == 4) {
			weekDay = "Thursday";
		} else if (day == 5) {
			weekDay = "Friday";
		} else if (day == 6) {
			weekDay = "Saturday";
		} else if (day == 7) {
			weekDay = "Sunday";
		} else {
			weekDay = "Invaid";
		}
		System.out.println(weekDay);
		
		
		switch (day) {
		case 1:// day==1
			weekDay = "Monday";
			break;
		case 2:
			weekDay = "Tueday";
			break;
		case 3:
			weekDay = "Wednesday";
			break;
		case 4:
			weekDay = "Thursday";
			break;
		case 5:
			weekDay = "Friday";
			break;
		case 6:
			weekDay = "Saturday";
			break;
		case 7:
			weekDay = "Sunday";
			break;
		default:
			weekDay = "Invalid";
		}
		System.out.println(weekDay);
		
		
		
		
		String country=null;
		String language =null;
		
		switch(country) {
		
		case "Honduras":
			language="Catalan";
			break;
		case "El Salvador":
			language="Spanish";
			break;
		case "France":
			language="French";
			break;
		case "Brazil":
			language="Portuguese";
			break;
		case "Germany":
			language="German";
			break;
		default:
		}
		
		System.out.println(" You speak " +language);
		
		
		
		
		
		
		
	}

}
