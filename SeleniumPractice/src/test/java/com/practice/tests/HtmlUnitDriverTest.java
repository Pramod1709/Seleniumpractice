package com.practice.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HtmlUnitDriverTest {

	static WebDriver driver;
	
	@BeforeMethod
	public void loadDriver() {
		//Creating new instance of HTML unit driver
		driver = new HtmlUnitDriver();
						
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Navigate to google
		driver.get("http://www.google.com");
	}
		
	@Test
	public void googleTest() {
		//Locating search box by name
		WebElement element = driver.findElement(By.name("q"));
				
		//Enter search query
		element.sendKeys("Testing");
				
		//submit query. No need to find or locate search button
		element.submit();
				
		//Page title printing
		System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void quitBrowser() {
		//Quitting driver
		driver.quit();
	}
}
