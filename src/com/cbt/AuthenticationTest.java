package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\bagi\\\\Documents\\\\Selenium dependencies\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://testing-ground.scraping.pro/login");
		
		// findElement --> find element in page
		//locator --> is a way to finding element on a page
		// used by selenium(it caleed "by" in selenium)
		// By.name("userName")--> how to find it
		//sendKeys() --> type the element
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>
	/*	Test 3: basic authentication
		1. open chrome
		2. go to url "http://testing-ground.scraping.pro/login""
		3. enter username "admin"
		4. enter password "12345"
		5. click on sign in button
		6. verfiy title contains 
			Expected:  welcome */
		
		Thread.sleep(2000);
		driver.findElement(By.name("usr")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("12345");
		//click() --> clicks
		driver.findElement(By.cssSelector("intput[type='submit']")).click();
		
		String expected = "welcome";
		String actual = driver.getTitle();
		if(actual.contains(expected)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
			System.out.println("Expected:\t" + expected);
			System.out.println("Actual:\t"+ actual);
		}
	}

}
