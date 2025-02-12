package com.absli.pageObjects;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCe {
	public static	WebDriver driver;

	public static void main(String[] args) throws IOException
	{	
		FileInputStream fs = new FileInputStream("C:\\Users\\Acer\\work2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheet("testdata");
		
		int rows = sheet.getLastRowNum();
		
		System.out.println(rows);
		
		for(int i=1;i<=rows;i++)
		{
			XSSFRow row=	sheet.getRow(i);
		String	emailid=	row.getCell(0).getStringCellValue();
	String		password=	row.getCell(1).getStringCellValue();
	//String		InlineError=	row.getCell(3).getStringCellValue();
			WebDriverManager.chromedriver().setup();
			  WebDriver	driver= new ChromeDriver();
				driver.get("https://www.fb.com");		
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailid);
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
			 driver.close();
			 
			 
			 // actual result =  //div[@class='_9ay7']
			 //Expected result=  The password that you've entered is incorrect. 
					// Forgotten 
			 
			// WebElement ActulResult = driver.findElement(By.xpath("//div[@class='_9ay7']]")).getText();
			
			 String expectedresult="please enter the valid username and password";
			 String actualresult="please d";
			 int cellCount = sheet.getRow(i).getLastCellNum();
			 XSSFCell cell = row.createCell(cellCount);
			 
			 if(expectedresult.equals(actualresult))
			 {
				 cell.setCellValue("pass");
			 }
			 else
			 {
				 
			 cell.setCellValue("fail");
			 
		}
		
	}
		fs.close();
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Acer");
		workbook.write(fout);
		fout.close();
	
}
}