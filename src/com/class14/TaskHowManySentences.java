package com.class14;

public class TaskHowManySentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String b = "Hola como estas?";

		System.out.println(b.replace(" ", ""));

		System.out.println("********************");

		String c = "K7667320$##$#at&$#@&*753354hy63732%$#@";

		String l = c.replaceAll("[^A-z]", "");
        System.out.println(c.replaceAll("[^A-z]", ""));
		System.out.println(l.length());

		System.out.println("********************");

		String a = "Is it Saturday? Is it raining? Do we have a Java Class Today?";

		String[] array = a.split("\\?");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].trim());
		}

	}

}
