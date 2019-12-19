package com.class34;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {

	public static void main(String[] args) {
		// lets create a collection of veggies where I do Not want duplicate
		//Inside HashSet order is Not PRESERVED
		//does NOT TAKE DUPLICATES
		
		HashSet<String>hasSet=new HashSet<>();
        //Storing vales into hashSet
		hasSet.add("cucumber");
		hasSet.add("onion");
		hasSet.add("peper");
		hasSet.add("zuccini");
		hasSet.add("carrot");
		hasSet.add("zuccini");
		
		System.out.println(hasSet.size());
		System.out.println(hasSet);
		
		//they do not have any methods to retrieve elements from the collection
		//.get();  set();
		//NO INDEX
		
		
		//how can we RETRIVE ALL ELEMENTS? use ITERATOR OR ENHANCED LOOP
		System.out.println("------ITERATOR------");
		Iterator<String> it=hasSet.iterator();
		while(it.hasNext()) {
			String element=it.next();
			System.out.println(element);
			
		}
		System.out.println("------ENHANCED LOOP----");
		for(String el:hasSet) {
			System.out.println(el);
		}
		
	}

}
