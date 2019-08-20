package com.practice.tests;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Base.Base;

public class BootstrapDropdown extends Base {

	WebDriver driver;

	@BeforeMethod
	public void loadBrowser() {
		driver = Base.getDriver();
		driver.get("https://you.yash.com/Pages/default.aspx");
	}
	
	@Test
	public void bootStrapDropdown() throws InterruptedException {
		driver.navigate().to("https://you.yash.com/Pages/default.aspx");	//refreshing the page
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//span[contains(text(),'Shared Services')]"))));
		driver.findElement(By.xpath("//span[contains(text(),'Shared Services')]")).click();
				
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='static']//li[1]//ul//a"));
		for(WebElement element : list) {
			if(element.getText().equals("Human Resources")) {
				 element.click(); 
				 System.out.println("clicked on " + element.getText());	 
			}
		}
	}
}
