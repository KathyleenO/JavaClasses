package com.class32;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
	
	ArrayList<String>array=new ArrayList<>();
	
	//to STORE values inside the COLLECTION       ADD
	array.add("John");
	array.add("Jane");
	array.add("Jack");
			
	//to RETRIVE OR PRINT the value from  ARRAYLIST      GET
	
	  System.out.println(array.get(1));
	
	  //ADD MORE values, YOU CAN STORE DUPLICATE OBJECTS      ADD
	  //NO LENGTH RESTRICTION
	  
	  array.add("James");
	  array.add("John");
	  array.add("Jane");
	  
	  //find HOW MANY ELEMENTS INSIDE    SIZE
	  
	  int size=array.size();
	  System.out.println(size);
	  
	 //creating Object ArrayList that will hold Integer
	  ArrayList<Integer>numArrList=new ArrayList<>();
	  numArrList.add(100);
	  numArrList.add(200);
	  numArrList.add(300);
	 System.out.println(numArrList);
	  
	 //UPDATE value                     SET
	  
	  numArrList.set(0, 1000);
	  System.out.println(numArrList);
	  
	  
	  //Printing or retrieving values
	  //Single
	  System.out.println(numArrList.get(2));
	  
	  //ENHANCED ALL
	  for(Integer number:numArrList) {
		  
		  System.out.println(number);
		  
	  }
	  //FOR EACH LOOP ALL
	   for(int num=0; num<numArrList.size(); num++) {
		   System.out.println(numArrList.get(num));
	   }
	  
}
}