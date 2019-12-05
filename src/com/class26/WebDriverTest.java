package com.class26;

public class WebDriverTest {


	public static void main(String[] args) {
	
	ChromerDriver chrome=new ChromerDriver();
	chrome.refresh();
	chrome.open();
	
	FireFoxDriver firefox=new FireFoxDriver();
	firefox.refresh();
	firefox.open();
	System.out.println("---------------");
	//creating an object of child class and given reference to the parent
	WebDriver driver=new FireFoxDriver();
	driver.open();
	driver.refresh();
	//no access to child specific class through Parent type
}

}
