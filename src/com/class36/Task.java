package com.class36;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Task {
private static final int Entry = 0;

/*
 * Create a Map from array of cities that will sort keys in alphabetical order. 
 * As a key store the name of the city and as a value store the 
 * length of the city (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
If any city name is more than 7 characters remove that city ( use Iterator ). 

Create a Map that will store Employee name and salary. 
Write a logic to retrieve an employee who gets the highest salary. 
Output should be in the below format

 * 
 * 
 */
	public static void main(String[] args) {
//		
//		ArrayList<String> cd=new ArrayList<>();
//		cd.add("Paris");
//		cd.add("Moscow");
//		cd.add("Washington");
//		cd.add("Rio");
//		cd.add("Italy");
//		
		
	
	Map<String, Integer> cities=new TreeMap<>();
	cities.put("Paris", 5);
	cities.put("Moscow", 6);
	cities.put("Washington", 13);
	cities.put("Rio", 3);
	cities.put("Italy", 4);
	
	Set<Entry<String, Integer>> set=cities.entrySet();
	
	Iterator<Entry<String, Integer>> it = set.iterator();  
	while(it.hasNext()) {
		Entry<String, Integer> entry = it.next();
		String key = entry.getKey();
		if(key.length()<7) {
		  it.remove();
		  
		}
		System.out.println(cities);
		
	}
	
}
	
	
}




