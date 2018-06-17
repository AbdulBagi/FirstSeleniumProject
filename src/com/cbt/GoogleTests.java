package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTests {
	public static void main(String[] args) {
//		1. open chrome
//		chrome driver from doc: C:\Users\bagi\Documents\Selenium dependencies\drivers/chromedriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\bagi\\\\Documents\\\\Selenium dependencies\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		2. go to url www.google.com
		driver.get("http://google.com");
//  	3. verify title 
//			Expected: Google
		String expected = "Google";
//   getTitle() --> gets the title of the tab
		String actual = driver.getTitle();
		System.out.println(actual);
		
		if(expected.equals(actual)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
			System.out.println("Expected:\t" + expected);
			System.out.println("Actual:\t"+ actual);
		}
	}
}
