package com.absli.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;



public class Dropdown extends BaseC {
	
	public static  WebElement ClickonCreate = driver.findElement(By.xpath("//a[text()='Create new account']"));

	public static void DropDOWN(String[] args) throws InterruptedException
	{

	
	//Select obj1= new Select(webelement);
		
		
		
		ClickonCreate.click();
		WebElement dropdown= driver.findElement(By.xpath("//select[@id='day']"));
	Select daydropdown= new Select(dropdown);
		List<WebElement> alllist=  daydropdown.getOptions();	
		for(int i=0;i<=alllist.size()-1;i++)
	{
			if("10".equals(alllist.get(i).getText()))
	{
				daydropdown.selectByValue("10");
				break;
			}
			
	
	}
	}
	
	
}

