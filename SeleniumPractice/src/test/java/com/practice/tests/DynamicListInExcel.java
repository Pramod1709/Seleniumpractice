package com.practice.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Base;

public class DynamicListInExcel extends Base{
	
	WebDriver driver;
	Workbook workbook = null;
	Sheet sheet;
	//String filePath = "C:\\Users\\pramod.tekale\\git\\SeleniumPractice\\SeleniumPractice\\TestData\\TestData.xlsx";
	
	
	@BeforeMethod
	public void init() {
		driver = Base.getDriver();
		driver.get("https://you.yash.com/Pages/default.aspx");
	}
	
	@Test
	public void infogramList(){
		driver.findElement(By.xpath("//a[@class='slogo8']")).click();
		String mainWindow = driver.getWindowHandle();
		//To handle new opened window
		Set<String> childWindowIds = driver.getWindowHandles();
		Iterator<String> iterator = childWindowIds.iterator();
				
			while(iterator.hasNext()) {
				String childWindow = iterator.next();
				
				if(!mainWindow.equalsIgnoreCase(childWindow)) {
					//Switching to child window
					driver.switchTo().window(childWindow);
					
					// Create list of My Info links
					/*List<WebElement> myInfolinks = driver.findElements(By.xpath("//ul[@title='My Info']//li"));
					System.out.println("List of the links are:"+ myInfolinks );
					
					// Get the link from the user
					Scanner sc =new Scanner(System.in);
					System.out.println("Enter the link you want to work");
					String link = sc.nextLine();
					for(int i=1;i<=myInfolinks.size();i++){
						if(links.equals(myInfolinks.get(i))){
							System.out.println("Entered link is matched.");
						}
					}*/
					
					driver.findElement(By.xpath("//ul[@title='My Info']//li[2]")).click();
					
				}
			}
		
	}
	
public void writeExcel(String filePath,String fileName,String sheetName, String status,Integer rowId) throws IOException {
		
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		
		String fileExtension = fileName.substring(fileName.indexOf("."));
		if(fileExtension.equals(".xlsx")) {
			workbook = new XSSFWorkbook(fis);
		}else if(fileExtension.equals(".xls")) {
			workbook = new HSSFWorkbook(fis);
		}
		
		sheet = workbook.getSheet(sheetName); 
		
		 Row row = sheet.getRow(rowId);
		 
		 row.createCell(3, CellType.STRING).setCellValue(status);
		
		file = new File(filePath);
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
	}
	
}
