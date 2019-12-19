package com.class31;

public class WebDriverTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.openBrowser();
		driver.closeBrowser();
		driver.maximazeWindow();
		driver.findElement();
		driver.takepictures();
		driver.takesScreen();

		WebDriver drivers = new FirefoxDriver();
		drivers.openBrowser();
		drivers.closeBrowser();
		drivers.maximazeWindow();
		drivers.findElement();

		
		
	}

}
