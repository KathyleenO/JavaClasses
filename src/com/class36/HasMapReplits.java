package com.class36;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HasMapReplits {

	public static void main(String[] args) {
		/*Create a hashset contains below values. 
first
second
third
fourth 
fifth 

Create a logic to add the values of hashset to and array.

print the values of array one by one. 
		 * 
		 */
		
	HashSet<String> list= new HashSet<>();
	
	list.add("first");
	list.add("second");
	list.add("third");
	list.add("fourth");
	list.add("fifth");
	
	ArrayList<String> listb=new ArrayList<>();
	
	listb.addAll(list);
	System.out.println(listb);
	
	/*Create A hash Map of type pairs of String. 

Add below pairs 
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"

Print all thCreate A hash Map of type pairs of String. 

Add below pairs 
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"

Print all the values using loop and KeySet. 
	 * 
	 */
	
	
	HashMap<String, String> map=new HashMap<>();
	map.put("Stree", "Patrick ST");
	map.put("Suite",  "265");
	map.put("City","Vienna");
	map.put	("Zip" ,"22180");
	map.put	("Country" ,"United State");
	
	
	
	Set<String> key=map.keySet();
	
	for(String values:key) {
		System.out.println(map.get(values));
	}
	
	/*Create a HashMap of String. 
Add below pair to it . 
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"

Print all the values using entrySet in upper case. 
	 * 
	
	 *
	 */
	
	System.out.println("UPPERCASE ");
	HashMap<String, String> map2=new HashMap<>();
	map2.put("Street", "Patrick ST");
	map2.put("Suite",  "265");
	map2.put("City","Vienna");
	map2.put	("Zip" ,"22180");
	map2.put	("Country" ,"United State");
	
	
	Set<Entry<String, String>> entrySetObject =map2.entrySet();
	
   Iterator<Entry<String, String>> print=entrySetObject.iterator();
      while(print.hasNext()) {
	Entry<String, String>values=print.next();
	String val=values.getValue();
	System.out.println(val.toUpperCase());
}

	/*Create a LinkedHashMap of String. 
Add below pair to it . 
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"

Print all keys using iterator
	 * 
	 */
	
	
      System.out.println("iterator and keyset");
    
      LinkedHashMap<String,String> link=new LinkedHashMap<>(); 
      
    link.put("Street", "Patrick ST");
 	link.put("Suite",  "265");
 	link.put("City","Vienna");
 	link.put("Zip" ,"22180");
 	link.put("Country" ,"United State");
 	
 	
 	Set<String>keysetObject=link.keySet();
 	
 	Iterator<String> iterator=keysetObject.iterator();
 	while(iterator.hasNext()) {
 		String allkeys=iterator.next();
 		System.out.println(allkeys);
 	}
 	
 	/*Create A TreeMap of Integer, Double
Add the below values

1  1.1
2  2.2
3  3.3
4  4.4
5  5.5

validate below and print the results 
is Contain Key 3?
is Contain Values 4.4?
is Contain  key 6?
 	 * 
 	 */
 	
 	
 	TreeMap<Integer, Double> tree=new TreeMap<>();
 	
 	tree.put(1, 1.1);
 	tree.put(2, 2.2);
 	tree.put(3, 3.3);
 	tree.put(4, 4.4);
 	tree.put(5, 5.5);
 	
 	System.out.println(tree.containsKey(3));
 	System.out.println(tree.containsValue(4.4));
 	System.out.println(tree.containsKey(6));
 	
 	/*Create a Hash Map of String pairs 
add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");

print the key and values pairs using loop

Remove below from Map
"ONE"
"FOUR"

Print key and values pairs using loop

OUTPUT
 	 * 
 	 */
 	
 	HashMap<String, String> map5=new HashMap<>();
 	
 	map5.put("ONE","AAA");
 	map5.put("TWO","BBB");
 	map5.put("THREE","CCC");
 	map5.put("FOUR","DDD");
 	map5.put("FIVE","EEE");
 	
 	System.out.println("HashMap  Before Remvove:" +map5);
 	
 	Set<String> setobject=map5.keySet();
 	for(String printboth:setobject) {
 		System.out.println(printboth+ " : " +map5.get(printboth));
 		
 	}
 	
 	/* 
Create Hash Map. 
add the follow values

map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");

print the key and values pairs using iterator only

replace with below key THREE--> ASEL and key FIVE-->SUMAIR

Print the values using any kind of loops you like.
 	 * 
 	 */
 	
	HashMap<String, String> map6=new HashMap<>();
 	
 	map6.put("ONE","AAA");
 	map6.put("TWO","BBB");
 	map6.put("THREE","CCC");
 	map6.put("FOUR","DDD");
 	map6.put("FIVE","EEE");
 	
 	Set<Entry<String, String>> setUse=map6.entrySet();
 	
 	System.out.println("HasMap Before Replace:");
 	Iterator<Entry<String, String >> keys=setUse.iterator();
 	while(keys.hasNext()) {
 		Entry<String, String> printkeys=keys.next();
 		String getkeys=printkeys.getKey();
 		System.out.println(getkeys+ " : " +map6.get(getkeys));
 	}
 	System.out.println("HashMap After Replace :");
 	map6.replace("THREE", "ASEL");
 	map6.replace("FIVE", "SUMAIR");

 	for(Entry<String, String> prints:setUse) {
 		System.out.println(prints.getKey()+ " : " +prints.getValue());
 	}
 	
 	/*Create HashMap 
add values as below
map.put("mango", 10); 
map.put("apple", 30); 
map.put("orange", 20); 
map.put("mango", 40); 
 map.put("mango", 40);     

Print the hash map. 
output 

{orange=50, apple=30, mango=40}
 	 * 
 	 */
 	
 	HashMap<String, Integer>map7=new HashMap<>();
 	map7.put("mango", 10);
 	map7.put("apple", 30);
 	map7.put("orange", 20);
 	map7.put("mango", 40);
 	map7.put("mango", 40);
 	
 	
 	System.out.println(map7);
// 	Set<Entry<String,Integer>> use=map7.entrySet();
// 	
// 	for(Entry<String, Integer> keyss: use) {
// 		System.out.println(keyss.getKey());
 		
 	
	}
 	
 	
		
	}


