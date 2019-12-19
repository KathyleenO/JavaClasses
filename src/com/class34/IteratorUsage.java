package com.class34;

import java.util.ArrayList;
import java.util.*;

public class IteratorUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> stringList=new ArrayList<>();
		stringList.add("Esra");
		stringList.add("Hasan");
		stringList.add("Ak");
		stringList.add("Ak");
		stringList.add("Salim");
		stringList.add("Helen");
		stringList.add("John");
		
		//remove names that are shorter than 4 chararters
		stringList.remove("Hasan");
		stringList.remove(2);
		System.out.println(stringList);
		
		//NO GOOD WAY TO REMOVE ELEMENTS FROM COLLECTION
		for(int i=0; i<stringList.size(); i++) {
			if(stringList.get(i).length()<=4) {
				stringList.remove(i);
			}
		}
		
		System.out.println(stringList);
	
	
	List<String> stringList1=new ArrayList<>();
	stringList1.add("Esra");
	stringList1.add("Hasan");
	stringList1.add("Ak");
	stringList1.add("Ak");
	stringList1.add("Salim");
	stringList1.add("Helen");
	stringList1.add("John");
	
	
	//INSTEAD USE ITERATOR
	
	Iterator<String> it=stringList1.iterator();
	while(it.hasNext()) {
		if (it.next().length()<4) {
			it.remove();
		}
	}
	System.out.println(stringList1);
	
}
}
