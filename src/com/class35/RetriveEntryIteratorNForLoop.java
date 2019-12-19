package com.class35;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RetriveEntryIteratorNForLoop {

	public static void main(String[] args) {
		
		Map<String, Integer> classroom=new HashMap<>();
		classroom.put("Instructors", 3);
		classroom.put("Student", 80);
		classroom.put("Tables", 20);
		classroom.put("Chairs", 80);
		
		System.out.println(classroom);
		
		//step 1 CALL ENTRY SET
		Set<Map.Entry<String,Integer>> entrySet=classroom.entrySet();
		
		System.out.println("----For Each Loop, ALL ENTRY------");
		for(Entry<String,Integer> entry:entrySet) {
			System.out.println(entry.getKey()+ ":"+entry.getValue());
			
		}
		System.out.println("===Iterator with ENTRY====");
		
		Iterator<Entry<String, Integer>> entryIterator=entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> ent=entryIterator.next();
			String entrys=ent.getKey()+ ";" +ent.getValue();
			System.out.println(entrys);
		}
		
	}

}
