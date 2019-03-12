package com.practice.tests;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Base;
import com.Utils.ExtentTestManager;

public class GoogleSearchTest extends Base{
	
	WebDriver driver;
	static String Search = "Testing";
	static Actions action;

	@BeforeMethod
	public void loadBrowser() {
		driver = Base.getDriver();
		driver.get("https://www.google.com/");
	}

	@Test
	public void googleSearchTest() {
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Search);
		List<WebElement> searchList = driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
		for (WebElement item : searchList) {
			if (item.getText().equals("testing interview questions")) {
				action = new Actions(driver);
				action.moveToElement(item).click().build().perform();
				//item.click(); //also works
				break;
			}
		}
	}

	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
