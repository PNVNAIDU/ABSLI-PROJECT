package com.absli.pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

public class BaseC {
	
public static	WebDriver driver;
	
	public static void Browser_launch()
	{
	
		
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	
	
	
}
	public void browser_close() {
		driver.close();
		
	}

}
