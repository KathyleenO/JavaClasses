package com.class34;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {
		//create a collection that will store sweets types of Objects
		//I do not care about ORDER AND NO DUPLICATES PLEASE
		
		
		Set<Sweets>sweetset=new HashSet<>();
		Sweets sweet=new Sweets("cake");  //make object first then add
		sweetset.add(sweet);//then add
		//or add directly to set
		
	sweetset.add(new Sweets("cookies"));
	sweetset.add(new Sweets("ice cream"));	
	sweetset.add(new Sweets("bakclava"));
	sweetset.add(new Sweets("macaroons"));
	sweetset.add(new Sweets("chocoalte"));
	sweetset.add(sweet);
	
	System.out.println(sweetset.size());//6 bc duplicate
	//how to print name of each
	
	System.out.println("----retrive all values---");
	for(Sweets elements:sweetset) {
		System.out.println(elements.name);
	}
	System.out.println("---Print with Iterator----");
	
	Iterator<Sweets> it= sweetset.iterator();
          while(it.hasNext()) {
	       System.out.println(it.next().name);
}
	
	}

}
