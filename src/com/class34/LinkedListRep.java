package com.class34;

import java.util.LinkedList;
import java.util.List;

public class LinkedListRep {

	/*Create a linkList of type Integer call list, 
Add the values below. 
111
222
333
444
555
666

Create a logic to calculate sum of the all the values in list. 

Print the result only. 

Output. 
Result of sum is 2331
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		
	
	List<Integer> list=new LinkedList<>();
	
	list.add(111);
	list.add(222);
	list.add(333);
	list.add(444);
	list.add(555);
	list.add(666);
	

	for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i));
	}
	
	
}
}
