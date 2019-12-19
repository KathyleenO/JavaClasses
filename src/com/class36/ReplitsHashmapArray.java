package com.class36;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReplitsHashmapArray {

	public static void main(String[] args) {
		
		  List<Integer> intlist=new LinkedList<>();	  
		  intlist.add(111);
		  intlist.add(22);
		  intlist.add(333);
		  intlist.add(444);
		  intlist.add(555);
		  intlist.add(666);
		  
		  int sumoflist=0;
		  
		  for(int i:intlist) {
		  sumoflist+=i;
		  
		  }
		  
		  System.out.println(sumoflist);
		  
		  
		  



ArrayList<Boolean> listA=new ArrayList<>();
listA.add(true);
listA.add(false);
listA.add(false);

ArrayList<Boolean> listB=new ArrayList<>();
listB.addAll(listA);


for(int i=0; i<=2; i++) {
	System.out.println(listB);
}

		  
		  
		  
		}	
	
		

	}


