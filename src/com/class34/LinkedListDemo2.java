package com.class34;

import java.util.LinkedList;

class Sweets{
	
	String name;
	
	public Sweets(String name) {
		this.name=name;
		
	}
	
	public void iLove() {
		System.out.println(" I love " +name);
	}
	
	
}


public class LinkedListDemo2 {


	
	public static void main(String[] args) {
		
		LinkedList<Sweets>list=new LinkedList();
		
		list.add(new Sweets("M&M"));
		list.add(new Sweets("Cake"));
		list.add(new Sweets("Cookies"));
		list.add(new Sweets("Chocolate"));
        //lets display name of each sweet object
		for(Sweets print:list) {
			System.out.println(print.name);
			print.iLove();
		}
		//retriving 1 element and acceing method
		list.get(2).iLove();
		String nameOfTheSweet=list.get(2).name;
		System.out.println(nameOfTheSweet);
		
		
		String str="hello 123 ";
		str.replace("123", "456").trim();
		
		Integer num=100;
		              //100---       100---------- 4000---- 4
		int newNumber=num.toString().replace("100", "4000").length();
		System.out.println(newNumber);
		
	}

}
