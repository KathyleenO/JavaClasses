package com.class35;

import java.util.HashMap;



public class MapIntro {
public static void main(String[] args) {


	HashMap<Integer, String> map=new HashMap<>();
	//to STORE values into map
	map.put(101, "John");
	map.put(102, "Jack");
	map.put(103, "Jane");
	map.put(104, "Jenny");
	
	System.out.println(map);
	//how to verify if any elements inside map
	
	boolean vacio=map.isEmpty();
	if(!vacio) {
		int size=map.size();
		System.out.println(size);
	}
	//I want to ADD more entries
//	map.put("105", "John");  ---> CE keys and values must match
	
	//adding DUPLICATE VALUES
	map.put(105, "Jonh");  //creates other value
    System.out.println(map);
    
    //adding DUPLICATE KEYS
    map.put(102, "Hasan"); //IT OVERRIDES, KEYS MUST ALWAYS BE UNIQUE
    System.out.println(map);
	
    //how to ACCESS VALUE
    
    String mapElement=map.get(105);

    System.out.println(mapElement);
   System.out.println(map.values());
	
    //to REPLACE OR UPDATE VALUE
    map.replace(103, "Zeynep");
    System.out.println(map);
    
    //how to REMOVE AN OBJECT from map
    map.remove(101);
    System.out.println(map);
    System.out.println("---------------");
    //how to verify certain KEY  IS THERE
  
    boolean flag1= map.containsKey(103);
       System.out.println(flag1);
  if(flag1) {
	  map.replace(103, "Seval");
	  
  }else {
	  map.put(103, "Seval");
  }
  //how to verify if certain VALUE EXIST
   boolean flag2= map.containsValue("Seval");
    System.out.println(flag2);
    System.out.println(map);
    
}	
}
