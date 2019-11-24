package com.class21;

public class Reps {


	/*Return Type: String
Method Name: makeThreeSubstr
Parameters:
a String called "word"
an integer called "startIndex"
an integer called "endIndex"

Then inside method write logic to return the result of substring  from "startIndex" to "endIndex" which repeated 3 times with no space.  
write code that will return 3x the substring (no spaces) from "startIndex" to "endIndex"
	 * 
	 */
	
//	
//	 String makeThreeSubstr(String word, int startIndex, int endIndex) {
//		
//			String result=""; 
//		for(int i=0; i<3; i++) {
//			result+=word.substring(startIndex, endIndex);
//		}
//		return result;
//	}

	 
	 String PrinTwice(String str){
		   
		 String result1=str;
		 for(int i=0; i<1; i++){
		      
			 result1+=str;
		      
		    }
		    return result1;
		  }
		  
		
		    
		 
		    

		 
	 
	 
	 
	 
	 
	 


	
	public static void main(String [] args) {
		
//		Main print=new Main();
//		
//		System.out.println(print.makeThreeSubstr("Shenanigans", 3, 7));
//	
		
		Reps print1=new Reps();
		
		System.out.print(print1.PrinTwice("Dont make me say this twice!" +" "));
		
		
		
		
		
		
	}
	
	
}
	
	
	
	
	
	

