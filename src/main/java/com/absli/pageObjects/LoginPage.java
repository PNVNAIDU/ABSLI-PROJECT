package com.absli.pageObjects;


import com.absli.Listner.CustomListner;
import com.absli.base.*;

import com.absli.utils.WaitUtils;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.pagefactory.AndroidFindBy;

import static org.testng.Assert.assertEquals;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



public class LoginPage extends TestBase {
	public WebDriver driver;
	public AndroidDriver driver1;
	public WaitUtils wait;

	// Initializing the Page Objects:
	public LoginPage(AndroidDriver driver1) {
		this.driver1 = driver1;
		wait=new WaitUtils();
	}
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		wait=new WaitUtils();
	}
	
	
	


	public void enterUserNameAndroid(String username) {
		WebElement userNM=driver1.findElement(By.xpath("//*[@content-desc='userName']"));
		wait.waitForElementToBeVisibleAndroid(driver1, userNM, 60,"time out to find element on page");
		driver1.findElement(By.xpath("//*[@content-desc='userName']")).sendKeys(username);
//		CustomListner.test.log(LogStatus.INFO, "Enter Username TextBox=====>"+username);
	}


	public void enterpasswordAndroid(String password) {
		WebElement PassNM=driver1.findElement(By.xpath("//*[@content-desc='password']"));
		wait.waitForElementToBeVisibleAndroid(driver1, PassNM, 30,"time out to find element on page");
		driver1.findElement(By.xpath("//*[@content-desc='password']")).sendKeys(password);
//		CustomListner.test.log(LogStatus.INFO, "Enter Password TextBox=====>"+password);
	}

	public void submitButtonAndroid() {
		WebElement submit=driver1.findElement(By.xpath("//*[@content-desc='password']"));
		wait.waitForElementToBeVisibleAndroid(driver1, submit, 30,"time out to find element on page");
		driver1.findElement(By.xpath("//*[@text='LOGIN']")).click();
//		CustomListner.test.log(LogStatus.INFO, "click on Submit Button");

	}

	public void VerifyPageTitleAndroid() {
		WebElement dashboardtext=driver1.findElement(By.xpath("//android.view.View[@text='Dashboard']"));
		wait.waitForElementToBeVisibleAndroid(driver1, dashboardtext, 30,"time out to find element on page");
		String GetValue=driver1.findElement(By.xpath("//android.view.View[@text='Dashboard']")).getText();
		if(GetValue.equalsIgnoreCase("Dashboard")) {
	//		CustomListner.test.log(LogStatus.INFO, "Successfully verified DashBoard Title");
		}else {
	//		CustomListner.test.log(LogStatus.INFO, "Failed to verified DashBoard Title");
		}
		Assert.assertEquals(GetValue, "Dashboard");


	}

	public void enterUserNameweb(String username) {
		WebElement userNM=driver.findElement(By.xpath("//input[@id='loginId']"));

		wait.waitForElementToBeVisibleweb(driver, userNM, 50,"time out to find element on page");
		userNM.sendKeys(username);
//		CustomListner.test.log(LogStatus.INFO, "Enter Username TextBox=====>"+username);
	}

	public void enterpasswordweb(String password) {
		WebElement PassNM=driver.findElement(By.xpath("//input[@id='password']"));
		wait.waitForElementToBeVisibleweb(driver, PassNM, 30,"time out to find element on page");
		PassNM.sendKeys(password);
	CustomListner.test.log(LogStatus.INFO, "Enter Password TextBox=====>"+password);
	}

	public void submitButtonweb() {
		WebElement submit=driver.findElement(By.xpath("//span[text()='LOGIN']"));
		wait.waitForElementToBeVisibleweb(driver, submit, 30,"time out to find element on page");
		submit.click();
		CustomListner.test.log(LogStatus.INFO, "click on Submit Button");

	}


	public void VerifyPageTitleweb() {
		try {
			WebElement dashboardtext=driver.findElement(By.xpath("//span[text()='Dashboard']"));
			wait.waitForElementToBeVisibleweb(driver, dashboardtext, 30,"time out to find element on page");
			String GetValue=dashboardtext.getText();
			if(GetValue.equalsIgnoreCase("Dashboard")) {
				CustomListner.test.log(LogStatus.INFO, "Successfully verified DashBoard Title");
			}else {
				CustomListner.test.log(LogStatus.FAIL, "Failed to verified DashBoard Title");
			}
		}catch(NoSuchElementException e) {
			CustomListner.test.log(LogStatus.FAIL, "Element is Not Display On Page");
		}
		


	}


	public void enterUserNameIOS(String username) {
		WebElement userNM=driver2.findElement(By.xpath("//XCUIElementTypeOther[@name='Login ID/AD/ID Login ID/AD/ID']"));
		wait.waitForElementToBeVisibleIOS(driver2, userNM, 60,"time out to find element on page");
		userNM.sendKeys(username);
		//	CustomListner.test.log(LogStatus.INFO, "Enter Username TextBox=====>"+username);
	}
	public void enterpasswordIOS(String password) {
		WebElement PassNM=driver2.findElement(By.xpath("//XCUIElementTypeSecureTextField[@name='password']"));
		wait.waitForElementToBeVisibleIOS(driver2, PassNM, 30,"time out to find element on page");
		PassNM.sendKeys(password);
		//	CustomListner.test.log(LogStatus.INFO, "Enter Password TextBox=====>"+password);
	}

	public void submitButtonIOS() {
		WebElement submit=driver2.findElement(By.xpath("//XCUIElementTypeButton[@name='userLoginBtn']"));
		wait.waitForElementToBeVisibleIOS(driver2, submit, 30,"time out to find element on page");
		submit.click();
		//	CustomListner.test.log(LogStatus.INFO, "click on Submit Button");

	}

	public void VerifyPageTitleIOS() {
		wait.waitForElementToBeVisibleIOS(driver2, driver2.findElement(By.xpath("//XCUIElementTypeOther[@name='Dashboard']")), 30,"time out to find element on page");
		WebElement dashboardtext=driver2.findElement(By.xpath("//XCUIElementTypeOther[@name='Dashboard']"));
		//wait.waitForElementToBeVisibleISO(driver2, dashboardtext, 30,"time out to find element on page");
		String GetValue=dashboardtext.getText();
		if(GetValue.equalsIgnoreCase("Dashboard")) {
			CustomListner.test.log(LogStatus.INFO, "Successfully verified DashBoard Title");
		}else {
			CustomListner.test.log(LogStatus.INFO, "Failed to verified DashBoard Title");
		}
		Assert.assertEquals(GetValue, "Dashboard");


	}


	public void logout(){
		WebElement logoutWeb=driver.findElement(By.xpath("//span[text()=\"Logout\"]"));
		if(logoutWeb.isDisplayed()) {
			logoutWeb.click();
		}else{
			System.out.println("Logout button is not visible");
		}
	}

	public void logoutAndroid(){
		WebElement logoutWeb=driver.findElement(By.xpath("//span[text()=\"Logout\"]"));
		logoutWeb.click();

	}


	//====================shubham changes  =====================//

	public void loginHeaderVerify(){
		WebElement loginHeader=driver.findElement(By.xpath("//div[@class=\"login-heading\"]"));
		wait.waitForElementToBeVisibleweb(driver, loginHeader, 30,"time out to find element on page");
		loginHeader.click();
	}


	public void clickHamburgerIconAndroid(){
		WebElement hamburgerAndroid=driver1.findElement(By.xpath("//android.widget.ImageView"));
		wait.waitForElementToBeVisibleAndroid(driver1, hamburgerAndroid, 30,"Hamburger menu not visible");
		hamburgerAndroid.click();
	}

	public void clickNewCustomerIconAndroid(){
		WebElement newCustomerAndroid=driver1.findElement(By.xpath("//android.widget.TextView[@content-desc='newCustomerButton']"));
		wait.waitForElementToBeVisibleAndroid(driver1,newCustomerAndroid, 30,"new Customer button is not visible");
		newCustomerAndroid.click();
	}




}
