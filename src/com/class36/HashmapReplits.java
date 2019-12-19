package com.class36;

import java.util.HashMap;

public class HashmapReplits {

	
	
	public static void main(String[] args) {
		
		HashMap<String, String> map=new HashMap<>();
		map.put("Street", "Patrick ST");
		map.put	("Suite" ,"265");
		map.put	("City","Vienna");
		map.put("Zip","22180");
		map.put	("Country","United State");

	     System.out.println(map.size());
	     map.clear();
	     System.out.println(map.size());
		
		
		
	}
}
