package com.class12;

public class AllManipulationsTask {

	public static void main(String[] args) {
		/*
		 * // Create two Strings and initaialize them with some value. //implement the
		 * following methods on those strings.
		 * 
		 * /* sen.length(); sen.equals(); sen.contains(s); sen.toUpperCase();
		 * sen.toLowerCase(); sen.equalsIgnoreCase(anotherString);
		 */

		String words = "I love Java Class And Will Not Give UP";
		String words1 = "I love Java";
		String l = "HI";
		String l2 = "hi";

		// FINDING LENGTH OF STRING
		System.out.println(words.length()); // 38
		System.out.println(words1.length()); // 11

		// FINDING IF SENTENCE EQUALS EACH OTHER
		System.out.println(words.equals(words1)); // FALSE
		System.out.println(l.equals(l2)); // TRUE

		// COMPARES TWO STRING IF THEY EQUAL EACH OTHER WITHOUT CARING IF ITS UPPER OR
		// LOWERCASE
		System.out.println(l.equalsIgnoreCase(l2)); // TRUE
		System.out.println(words.equalsIgnoreCase(words1)); // not equal so FALSE

		// CONTAINS CERTAIN PHRASES WITHIN EACH SENTENCE
		System.out.println(words.contains(words1)); // True
		System.out.println(words1.contains(words)); // FALSE

		// CONVERTING ALL TO UPPER CASE LETTERS
		System.out.println(words.toUpperCase()); // I LOVE JAVA CLASS AND WILL NOT GIVE UP
		System.out.println(l.toUpperCase()); // HI

		// COVERTING ALL TO LOWERCASE LETTERS
		System.out.println(words.toLowerCase());       //i love java class and will not give up 
		System.out.println(words1.toLowerCase());  // i love java

	}

}
