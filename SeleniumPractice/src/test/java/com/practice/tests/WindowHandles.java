package com.practice.tests;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class WindowHandles {
	
	public static String returnToMainWindow;
	public static String childSiteHandle;
	
	public void getWindowHandle(WebDriver driver,String diffURL){
		
		Set<String> mainWindow = driver.getWindowHandles();
		returnToMainWindow = driver.getWindowHandle();
		((JavascriptExecutor)driver).executeScript("window.open();");
		Set<String> childWindow = driver.getWindowHandles();
		childWindow.removeAll(mainWindow);
		childSiteHandle = (String) childWindow.toArray()[0];
		driver.switchTo().window(childSiteHandle);
		driver.get(diffURL);
		//driver.switchTo().window(returnToMainWindow);
		//driver.close();
		
	}

}
