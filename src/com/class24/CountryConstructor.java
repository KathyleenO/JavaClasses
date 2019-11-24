package com.class24;

public class CountryConstructor {

    public String capital, name;
    public int population;
   
    
    public CountryConstructor(){
    	System.out.println("I am a non argument constructor");
    }
    
   CountryConstructor(String name, String capital, int population){
    	
          this.name=name;
    	this.capital=capital;
    	this.population=population;
    	
    	
    }
    public void displayInfo() {
    	System.out.println("Country "+name+ "  " +capital);
    	
    	
    }

    public static void main(String[] args) {
		
    	//CALL THE CONSTRUCTOR 
    	CountryConstructor country1=new CountryConstructor("USA","Washington DC",350);
    	CountryConstructor country2=new CountryConstructor("Kazakhstan", "Astana",18);
    	CountryConstructor country3=new CountryConstructor("Honduras", "Tegucigalpa",25);
    	CountryConstructor country4=new CountryConstructor();  //NON ARGUMENT CONSTRUCTOR, PRINTS FIRST
    	
    	//PRINT INFORMATION
    	country1.displayInfo();
    	country2.displayInfo();
    	country3.displayInfo();
    	
    	
    	
    	
	}
	
	
	
}
