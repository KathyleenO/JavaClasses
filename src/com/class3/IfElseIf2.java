package com.class3;

public class IfElseIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=100;
		int num2=100;
		
		if (num1>num2) {
			System.out.println("num1 is Larger than num2");
		}else if (num1==num2)  {
			System.out.println("Num1 is equal to num2");
		}else {
			System.out.println("Num1 is smaller than num2");
		}
			
		int day=0;
		if(day==1) {
			System.out.println("Today is Monday. I have work");
		}else if (day==2){
			System.out.println("Today is Tuesday. I have SDLC class");
		}else if (day==3) {
			System.out.println("Wednesday");
		}else if (day==4) {
			System.out.println("Thursday");
		}else if (day==5) {
			System.out.println("Friday");
		}else if (day==6) {
			System.out.println("Saturday");
		}else if (day==7) {
			System.out.println("Sunday");
		}else {
			System.out.println("idk this day");
		}
			
		
		
	}

}
