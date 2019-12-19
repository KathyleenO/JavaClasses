package com.class36;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HW {

	public static void main(String[] args) {
		Map<Integer, String> map=new TreeMap<>();
		map.put(3456, "Mac Laptop");
		map.put(6746, "HP Printer");
		map.put(3468, "Dell Screen");
		map.put(8753, "Samsung TV");
		map.put(1765, "Sony Camera");

		System.out.println(map);
		//Retive Key-- using entrey set
		
		//STEP 1 CALL ENTRY SET
		Set<Entry<Integer, String>> set= map.entrySet();
		
		for(Entry<Integer, String>entry:set) {
		    String element =entry.getKey()+entry.getValue();
		    System.out.println(element);
		    //or
		    //int key=singleEntry.getKey();
			//String value=singleEntry.getValue();
			//System.out.println(key + "---" + value);
		}
	}

}
