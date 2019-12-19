package com.class35;

import java.util.HashMap;

public class TaskMapHashSet {
public static void main(String[] args) {
	

	HashMap<Integer,String> maps=new HashMap<>();
maps.put(1, "Google");
maps.put(2, "Syntax");
maps.put(3, "Microsoft");
maps.put(4, "Facebook");
maps.put(2, "Instagram");
maps.put(6, "Google");
maps.put(7, "Dominguez");

System.out.println(maps);
System.out.println(maps.size());
System.out.println(maps.replace(4, "Geico"));
System.out.println(maps.remove(4));
System.out.println(maps);
	
	
	
}	
	
}
