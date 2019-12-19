package com.class36;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListReplits {
/*Create A array list of type String, call it list. 
then find out array list is empty or not. 
then add value to it "Syntax"
the find out list is empty or not
 * 
 * 
 * 
 * 
 * 
 */
	
	
	public static void main(String[] args) {
		
		
		ArrayList<String> list=new ArrayList<>();
		
	     System.out.println(list.isEmpty());
	     list.add("Syntax");
	     System.out.println(list.isEmpty());
		
	/*Create a ArrayList of Integers called listA
add below values to it. 
(0, 1, 2, 3, 4, 5)
Create another array list of Integer. called listB

Create a logic to the values of listA to listB twice for each values. 

Print the listB

Output
[0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
	 * 	
	 */
	     
	     
//	  ArrayList<Integer> listA=new ArrayList<>();
//	  listA.add(0);
//	  listA.add(1);
//	  listA.add(2);
//	  listA.add(3);
//	  listA.add(4);
//	  listA.add(5);
//		
//	  for(int i=0;i<listA.size(); i++) {
//			listA.add(i);
//			listA.add(i);
//			}
//	  System.out.println(listA.add(i));
//	 
//	  
//	  ArrayList<Integer> listB=new ArrayList<>();   
//	            
//
//	  
	
				

/*
Create a ArrayList of type boolean called listA
add below to list values
(true, false, false)

Create another array list call listB

then write a logic to add the same values of listA to list B twice. 

Print the List. 
 * 	
 */
	     
	     
	     
				
		/*Create a method the return an LinkList. without parameters. 
inside the method put the logic to add below values to the linklist and return the list. 

In Main Class. 
call the method and store it to a new Linklist. 

Print the values of LinkList. 


		 * 		
		 */
	  
	  List<String> linklist=new LinkedList<>();
	  linklist.add("John");
	  linklist.add("Brian");
	  linklist.add("Ryan");
	  
	  
	  List<String> newlist=new LinkedList<>();
	  newlist.addAll(linklist);
	  
	  System.out.println(newlist);
	 
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

	  List<Integer> intlist=new LinkedList<>();	  
	  intlist.add(111);
	  intlist.add(22);
	  intlist.add(333);
	  intlist.add(444);
	  intlist.add(555);
	  intlist.add(666);
	  
	  int sumoflist=0;
	  
	  for(int i=0; i<intlist.size(); i++) {
	  sumoflist=(intlist.indexOf(i))+(intlist.indexOf(i));
	  
	  }
	  
	  System.out.println(sumoflist);
	  
	}		
	

	
	
	
	
}

