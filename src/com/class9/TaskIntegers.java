package com.class9;

import java.util.Scanner;

public class TaskIntegers {

	public static void main(String[] args) {
		/*
		 * Write a program that reads a range of integers (start and end point), 
		 * provided by a user and then from that range prints the sum of the even and odd integers.
		 * 
		 * Write a guessing game where the user has to guess a secret number between 1 and 20. 
		 * After every guess input, the program tells the user whether their number was too large or too small.
		 *  The program will keep asking the user to enter the number until he finds the correct number. 
		 *  When the correct answer is found the system should display “Congratulations!!. You got it!”
		 *
		 */

		
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter start number");
			int firstNumber = scan.nextInt();
			System.out.println("Enter ending number");
			int secondNumber = scan.nextInt();
			
			int start = 0;
			int end = 0;
			
			if (firstNumber < secondNumber) {
				start = firstNumber;
				end = secondNumber;
			} else {
				start = secondNumber;
				end = firstNumber;
			}
			int even = 0;
			int odd = 0;
			for (int i = start; i <= end; i++) {
				if (i % 2 == 0) {
					even = even + i;
				} else {
					odd = odd + i;
				}
			}
			System.out.println("The sum of even numbers is " + even);
			System.out.println("The sum of odd numbers is " + odd);
			
			
			Scanner sca = new Scanner(System.in);
	        int guess;
	        int right = 8;
	        boolean win = false;
	        while (win == false) {
	            System.out.println("Guess the secret number between 1 and 20!");
	            guess = sca.nextInt();
	            if (guess == right) {
	                win = true;
	            } else if (guess < right) {
	                System.out.println("Your guess is too low, try again!");
	            } else if (guess > right) {
	                System.out.println("Your guess is too high, try again!");
	            }
	        }
	        System.out.println("Congratulations, you got it!!!");
			
			
			
			
			
			
			
			
			
			
		}
	
	}


