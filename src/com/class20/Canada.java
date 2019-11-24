package com.class20;

public class Canada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		USA us1=new USA();
		System.out.println("Access from Canada");
		System.out.println(us1.mainState);
		System.out.println(us1.school);
		//CANNOT ACCES CAPITALCITY BC IS PRIVATE
		//System.out.println(us1.capitalCity);  
		
		
		
		
		
	}

}
