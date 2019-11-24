package com.class20;

public class Task {

//FORWARD NORMAL	
//	protected String str(String name) {
//         
//		String result="";
//        
//	       char [] charArray= name.toCharArray();
//		for(int i=0; i<charArray.length; i++)
//		 result+=charArray[i];
//		return result;
//	}
	
	
	//REVERSE
	protected String reverse(String name) {
        
		String result="";
        
	       char [] charArray= name.toCharArray();
		for(int i=charArray.length-1; i>=0; i--)
		 result+=charArray[i];
		return result;
	}
	
	
	//POLINDROME
	
	public boolean isPolindrome(String name1) {
		boolean result=false;
		
		String reverse=reverse(name1);
		if(name1.equalsIgnoreCase(reverse)) {
			result=true;
		}else {
			result=false;
		}
			
		return result;
		
//		boolean result
//		for(int i=name1.length()-1; i>=0; i--) {
//			if(name1.equals(reverse)) {
//				result=true;
//			}else {
//			result=true;
//			}
//			
//			
//		}
//		return result;
	
	
	}
		
	
	
	String[] ArrayofWords(String sentence) {
		
		//LONG WAY
//		String [] stringArray;
//		stringArray=sentence.split(" ");
//		return stringArray;
		
		//SHORT WAY
		
		return sentence.split(" ");
		
	}
	
	
		
		
		
		
		
		
	
}
