package com.class5;

public class StringInScannerWithEQuals {

	public static void main(String[] args) {
		/*Verify if button is displayed on the page
		 * if button is displayed then we need to verify text on
		 * if text equal to sign in --> Test case pass
		 * otherwise --> Wrong text is displayed
		 */
		
		boolean isDisplayed = false;
		String buttonText = "sign in";

		if (isDisplayed) {
			System.out.println("Button is dispalyed");

			if (buttonText.equals("Sign in")) {     //.EQUALS TO COMPARE STRING
				System.out.println("text case pass");
			} else {
				System.out.println("wrong text displayed");
			}

		} else {
			System.out.println("Button is not displayed");
		}

	}

}
