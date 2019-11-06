package com.class5;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		/* Write a program that will read three inputs of scores 
		 * (quiz, mid term, and final scores) 
		 * and determine the grade based on the following rules: 
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F


Write a program to determine the classMode.
If there is no rain → classMode=“In Class”, otherwise classMode → “Online”.
		 * 
	
		 */

		/* Scanner scan;
		 * int quiz, midTerm,finalScore, average;
		 * scan =new Scanner(System.in)
		 * System.out.println("please enter quiz score);
		 * quiz=scan.nextInt();
		 * Syso.(enter midtenrn)
		 * midterm=scan.nextInt();
		 * syso(final score)
		 * finalScaore=scan.nextInt();
		 * 
		 */
		
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("PLease enter quiz score");
		int quiz=scan.nextInt();
		System.out.println("Please enter mid term score");
		int midterm=scan.nextInt();
		System.out.println("Please enter final score");
		int fin=scan.nextInt();
	
		int	average=(quiz+midterm+fin)/3;
		
		
	if(average>=90) {
			System.out.println("grade A with average of " +average);
		}else if(average>=70 && average<90) {
			System.out.println("grade is B " +average);
		}else if(average>=50 && average<70) {
			System.out.println("grade is C " +average);
		}else if(average<50) {
			System.out.println("grade is F " +average);
		}
		
		
		boolean rain=true;
		
		if(!rain) {
			System.out.println("in class");
		}else {
			System.out.println("Online");
		}
		
		
		
		
		
	}

}
