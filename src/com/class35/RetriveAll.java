package com.class35;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class RetriveAll {

	public static void main(String[] args) {
		//create a map of a person(name, LastName, address, city, state)
		// want to preserve ORDER
		
		Map<String, String> personMap=new LinkedHashMap<>();

		personMap.put("Name", "Ahmet");
		personMap.put("lastName" , "Yildiz");
		personMap.put("Adress" , "123 test");
		personMap.put("City" , "Dallas");
		personMap.put("State" , "TX");
		
System.out.println(personMap);//LinkedHashMap  {Name=Ahmet, lastName=Yildiz, Adress=123 test, City=Dallas, State=TX}
//System.out.println(personMap);//HASHMAP lastName=Yildiz, State=TX, Adress=123 test, City=Dallas, Name=Ahmet}
//System.out.println(personMap);// TreeMAP{Adress=123 test, City=Dallas, Name=Ahmet, State=TX, lastName=Yildiz}

//to retive specific value
String value=personMap.get("State");
	System.out.println(value);	

//how to retrive all keys and all values?
	System.out.println("---Printing ALL KEYS FOR LOOP KEYSET----");
	
	//KEY SET
	Set<String>keys=personMap.keySet();
	
	for(String key:keys) {
		System.out.println(key);	
	}
	System.out.println("----ITERATOR, using KEYSET ALL KEYS-----");
	
	Iterator<String> keysIterator=keys.iterator();
	while(keysIterator.hasNext()) {
		System.out.println(keysIterator.next());
	}

	//how to print ALL VALUES
	System.out.println("---PRINTIN VALUES-----");

	Collection<String>values=personMap.values();
	
	for(String val: values) {
		System.out.println(val);
	}
System.out.println("----Iterator All VALUES-----");

Iterator<String> valuesIterator=values.iterator();
while(valuesIterator.hasNext()) {
	System.out.println(valuesIterator.next());
}

System.out.println("-----Keys and Values Key set---");
	//how can I retrive and Print values key:value

for(String key:keys) {
	//retriveing both key and value 
	System.out.println(key+ ":" +personMap.get(key));	
}

System.out.println("-----Key+Value with Iterator KEYSET----");

Iterator<String> keysIterators=keys.iterator();
while(keysIterators.hasNext()) {
String mapKey=keysIterators.next();  //keysIterator.next print=== name, lastname,adress...
String mapValue=personMap.get(mapKey); //personMap.get() prints=== values look above
System.out.println(mapKey+": "+ mapValue);   //add or combine both 
	}


	}
}
