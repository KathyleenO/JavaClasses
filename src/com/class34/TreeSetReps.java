package com.class34;

import java.util.TreeSet;

/*Create Tree Set of type String 
Please add the below values and see the result 
"India"
"Australia"
"South Africa"
"India"
"America"
"America"

Print the Set. 

Output: 
[America, Australia, India, South Africa]
 * 
 */
public class TreeSetReps {
public static void main(String[] args) {
	

	TreeSet<String> set=new TreeSet<>();
	set.add("India");
	set.add("Australia");
	set.add("South Africa");
	set.add("India");
	set.add("America");
	set.add("America");
	System.out.println(set);
	
	
	
}
}
