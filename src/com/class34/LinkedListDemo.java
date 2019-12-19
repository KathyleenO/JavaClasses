 package com.class34;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// create linked list of String Object
		
		LinkedList<String>llist=new LinkedList<>();
        llist.add("hello");
		llist.add("Bye");
		System.out.println(llist.size());
		
		//add more values
		llist.add("Hello2");
		llist.add("Bye1");
		
		//retrive 1 value
		System.out.println(llist.get(1));
		//update/replace
		llist.set(2, "hi");
		
		System.out.println(llist);
		
		//HOW TO RETRIVE ALL VALUES FROM LINK LIST
		
		
		
	}

}
