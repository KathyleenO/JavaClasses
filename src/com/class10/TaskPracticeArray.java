package com.class10;

public class TaskPracticeArray {

	public static void main(String[] args) {

		// 1st way
		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println(grades[0]); // prints A

		int a = 2;
		System.out.println(grades[a]); // int a=2; prints C

		a += 2; // 2+2=4
		System.out.println(grades[a]); // prints E
		a--; // 4-1=3
		System.out.println(grades[a]); // prints D

		System.out.println("************************");
		
		for(int i=0; i<grades.length; i++ ) {
			System.out.println(grades[i]);       //Prints ALL value
		}
		
		
		
		
		// 2nd way
		char[] grade = new char[6];

		grade[0] = 'A';
		grade[1] = 'B';
		grade[2] = 'C';
		grade[3] = 'D';
		grade[4] = 'E';
		grade[5] = 'F';

		System.out.println(grade[0]); // A

		String[] names = { "Kathleen", "Erick", "Joe" };
		System.out.println(names[0]); // Kathleen

		String[] name = new String[4];

		name[0] = "Linda";
		name[1] = "Kathy";
		name[2] = "Kathleen";
		name[3] = "Daniel";
		System.out.println(name[0]); // Linda

		String[] words = { "Java", "Saturday", "day", "coding" };
		System.out.println(words[1] + " is " + words[0] + words[3] + words[2]);

	}

}
