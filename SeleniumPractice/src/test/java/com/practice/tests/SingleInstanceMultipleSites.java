package com.practice.tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Base.Base;

public class SingleInstanceMultipleSites extends Base{
	WebDriver driver;
	
	@Test
	public void switchingTabsusingSameBrowser(){
		driver=Base.getDriver();
		driver.get("https://www.google.com/");
		String winHandle = driver.getWindowHandle();
		// Opening new tab
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		
		// Switching to new tab
		List<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		System.out.println("Number of tabs are :" +tabs.size());
		driver.switchTo().window(tabs.get(0));
		
		driver.get("http://bing.com");
		
		//Navigate back to old tab 
		driver.switchTo().window(winHandle);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
        driver.switchTo().defaultContent();
	}

}
