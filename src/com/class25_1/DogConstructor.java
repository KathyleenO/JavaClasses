package com.class25_1;

public class DogConstructor {
	  String dogName;
	  double dogWeight;
 static String dogBreed="Mutt";
	 
	 
	 DogConstructor (String name, String breed, double weight){
		    name=dogName;
		    weight=dogWeight;
		    breed=dogBreed;
		    
		  }
	 
	  DogConstructor(String name, double weight){
		    dogName=name;
		    dogWeight=weight;
	  }
	 
	 
	  public void display(){
	  System.out.println(dogName+ " " +dogBreed+ " "+dogWeight);
	  }
		  
	 
	 
	 
	 
	 
	 
	 
}
