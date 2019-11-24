package com.class20_Other;

import com.class20.USA;

public class Mexico {

	public static void main(String[] args) {
		// when CLASS USA turned into public you can access USA but when Deafault you CANOT bc different package 

		USA us2=new USA();   //MUST IMPORT CLASS
		System.out.println("Access from Mexico");
		
		System.out.println(us2.mainState);
		//System.out.println(us2.school);  cant access IS PROTECTED
		//System.out.println(us2.capitalCity);  CAN ACCESS BC PRIVATE
		
	}

}
