package com.class12;

public class MoreStringManipulation {

	public static void main(String[] args) {
	
		// "CHECKS IF STRING IS EMPTY OR NOT
		
		String str1="";
		String  str2="Hello";
		System.out.println(str1.isEmpty());  //TRUE
		System.out.println(str2.isEmpty());  //FALSE
			
		
		
	// /n
		System.out.println("tengo hambre y me duele la cabeza con estos codigos,/n Dios ayudame con esta prueba Amen ");
		
		
		
		
		
		
	// CONCACTANATION OF STRING USING .concat
		
		String str="hello ";
		String str3="world ";
		String str4="katy ";
		
		System.out.println(str3+str);
		System.out.println(str.concat(str3).concat(str4));
		
		//Removes spaces and white space at BEGINING and END, it TRIMS SPACES
		
		String str5= "How are you?  ";
		System.out.println(str5);
		System.out.println(str5.trim());
		
		
		System.out.println("Prints out Specific character in EACH INDEX  starts with 0");
		
		String str6="We might be done early today";
		System.out.println(str6.charAt(4));    //i bc it starts at 0,1,2,3,4
		//System.out.println(str6.charAt(33));  //PRINTS OUT OF EXCEPTIONS
		
	// This method you input the CHARACTER AND PRINTS OUT THE INDEX
		
		String str7="We might mnot be done early";
		System.out.println(str7.indexOf('m'));    //put one quote ''  //index 3
		System.out.println(str7.indexOf('m', 4)); //  but if it has two m then use index of char fromIndex()
		System.out.println(str7.indexOf('m', 12));    //returns -1 NOT out of bounds exception bc has no m after 12 or if does not have that  character
		
		
		

	}

}
