package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherTest {

	public static void main(String[] args) throws InterruptedException{
	
	//	test case 2: verify url contain
	//	1. open chrome
	//	2. go to url www.cyberteckschool.com
	//		Expected: cybertekschool
	//  3. 
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\bagi\\\\Documents\\\\Selenium dependencies\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// navigate().to() == get();
		driver.navigate().to("http://www.cybertekschool.com");
		
		String expected = "cybertekschool ";
		// getCurrentUrl()--> gets the url of the current tab
		String actual = driver.getCurrentUrl();
		if(expected.contains(expected)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
			System.out.println("Expected:\t" + expected);
			System.out.println("Actual:\t"+ actual);
		}
		
			driver.navigate().to("http://google.com");
			Thread.sleep(1000);
			// navigate().back(); --> goes back to previous page
			driver.navigate().back();
			Thread.sleep(1000);
			//navigate().forward() --> goes forward in browsing history
			driver.navigate().forward();
			Thread.sleep(1000);
			// naviagte().refresh() --> refreshed the current page
			driver.navigate().refresh();
			Thread.sleep(1000);
			
			//close the current tab
			driver.close();
		 // or other option to close
			driver.quit();
			

	}

}
