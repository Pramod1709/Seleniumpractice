package com.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	public static WebDriver driver;
	public WebDriverWait wait;

	public static WebDriver getDriver() {
		return driver;
	}

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\NewChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	/*@AfterClass
	public static void teardown() {
		driver.close();
	}*/
}
