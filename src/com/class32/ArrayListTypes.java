package com.class32;

import java.util.ArrayList;

public class ArrayListTypes {
public static void main(String[] args) {
	
//GENERIC ARRAY LIST 
	ArrayList<String>arraystring=new ArrayList<>();
	arraystring.add("Erick");
	arraystring.add("Kathy");
	arraystring.add("Dominguez");
	arraystring.add("Lopez");
	arraystring.add("Marisol");
	
	System.out.println(arraystring.isEmpty());
	System.out.println(arraystring.size());
	System.out.println(arraystring);
	
	
	
	// NON-GENERIC ArrayList
	
	ArrayList alist=new ArrayList(); //or can use  ArrayList<Object> alist=new ArrayList<>();
	alist.add("Hello");
	alist.add(100);
	alist.add(10.10);
	alist.add(true);
	alist.add('g');
	
	System.out.println(alist);
	
	
}	
}
