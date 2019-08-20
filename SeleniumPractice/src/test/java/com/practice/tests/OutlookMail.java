package com.practice.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Base.Base;

public class OutlookMail extends Base {
	public String outlookURL = "https://mail.yash.com/owa/";
	public WindowHandles winHandle = new WindowHandles();
	public WebDriver driver;
	
	@Test
	public void switch_To_Outlook_Mail() throws InterruptedException{
		driver=Base.getDriver();
		driver.get("https://www.google.com/");
		
		// Switch to new window and hit Outlook URL
		winHandle.getWindowHandle(driver, outlookURL);
		Thread.sleep(3000);
		
		// Sign in Process
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("pramod.tekale@yash.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pt2577007@1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// Collecting list of all mails
		List<WebElement> numberOfMails = driver.findElements(By.xpath("//div[@id='gc']//div[@id='vr']"));
		System.out.println("No. of mails : " + numberOfMails.size());
		 
		
	}

}
