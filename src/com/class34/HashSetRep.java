package com.class34;

import java.util.HashSet;
import java.util.Iterator;

/*
 * Create a Hashset and add below values to it. 

Red
Pink
Yellow
White
Black
print the colors 
and get total number of colors available in the set

Output:
Original Hash Set: [Red, Pink, White, Yellow, Black]
Size of t
 */
public class HashSetRep {

	public static void main(String[] args) {
		
	
	HashSet<String>colors=new HashSet<>();
	
	colors.add("red");
	colors.add("Pink");
	colors.add("Yellow");
	colors.add("White");
	colors.add("Black");
	
	System.out.println("Original Hash Set;" + colors);
	System.out.println("Size of Hash Set;" +colors.size());
	
	/*Create the HashSet with list of integers add the below numbers 
	 * for the list
111
111
111
999
999
999
 
Print the list elements one by one.
	 * 
	 */
	
	
	HashSet<Integer> nums=new HashSet<>();
	nums.add(111);
	nums.add(111);
	nums.add(111);
	nums.add(999);
	nums.add(999);
	nums.add(999);
	
	for(Integer numss:nums) {
		System.out.println(numss);
	}
	
	/*Create a Set and and below values to it. 
[third, first, second]

Print the hashset
then remove all the elements from Hashset. 

Print the hashset

Output:

 
[third, first, second]
[]
	 * 
	 */

	HashSet<String>a=new HashSet<>();
	a.add("Third");
	a.add("first");
	a.add("second");
	System.out.println(a);
	
	Iterator<String> iterator= a.iterator();
	while(iterator.hasNext()) {
		iterator.next();
		iterator.remove();
	}
	System.out.println(a);
	
	
	/*
	 * Set
Create a Hashset 
Add the below values 
null
shiva 
sandish
asel
sumair 
 
print the values and than 

Check the set contain a null value. 

print the result of check. 

output 
	 */
	
	HashSet<String> set=new HashSet<>();
	set.add("null");
	set.add("shiva");
	set.add("sandish");
	set.add("asel");
	set.add("sumair");
	
	System.out.println(set);
	System.out.println(set.contains("null"));
	
	/*Create a Hashset.
Just add the values as

first
second
third
fourth 
fifth 

first print the all values

then remove "second"

then print the values

Then remove all the elements.

Then Print the values. 

output

	 * 
	 */
	

	
	
	HashSet<String>sets=new HashSet<>();
	sets.add("first");
	sets.add("second");
	sets.add("third");
	sets.add("fourth");
	sets.add("fifth");
	System.out.println(sets);
	sets.remove("second");
	System.out.println(sets);
	
	
	Iterator<String> prints=sets.iterator();
	while(prints.hasNext()) {
		prints.next();
		prints.remove();
	}
	
	System.out.println(sets);
	
	
	/*Set
Create a hashset.
Add the values as
first
second
third
fourth 
fifth 
 

then create a logic to print the values of hashset one by one .

Output:
third
fifth
fourth
first
second
	 * 
	 */
	
	HashSet<String> printing=new HashSet<>();
	printing.add("first");
	printing.add("second");
	printing.add("third");
	printing.add("fourth");
	printing.add("fifth");
	
	
	for(String d:printing) {
		System.out.println(d);
	}
	
	
	
	
	
	
	
	
}
}
