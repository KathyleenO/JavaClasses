package com.class21;

public class Mains {

	
	

	String PrinTwice(String name){
		 String result=name;
		for(int i=0; i<2; i++){
	
	    }
		return result;
	  }
	
	
	String makeCapital(String name){
		  String result= name.toUpperCase();
		  return result;
		}

	
	
	  
	  public static void main(String[] args) {
	    
	    Mains print=new Mains();
	    
//	     String a= print.PrinTwice("dont make");
//	 System.out.println(a);

	
	
	String hola=print.makeCapital("kathy");
	
	System.out.println(hola);
	
	  }
	
}
