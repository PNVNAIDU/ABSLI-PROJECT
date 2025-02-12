package com.absli.pageObjects;

import com.absli.APIData.ApiData;
import com.absli.Listner.CustomListner;
import com.absli.utils.WaitUtils;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import util.TestUtil;

import java.util.ArrayList;

public class ReviewAndAccept {

    public WebDriver driver;
    public AndroidDriver driver1;
    public WaitUtils wait;
    public ApiData api;
    public TestUtil testUtil;

    // Initializing the Page Objects:
    public ReviewAndAccept(AndroidDriver driver1) {
        this.driver1 = driver1;
        wait=new WaitUtils();
        api = new ApiData();
        testUtil = new TestUtil();
    }
    public ReviewAndAccept(WebDriver driver) {
        this.driver = driver;
        wait=new WaitUtils();
        api = new ApiData();
        testUtil = new TestUtil();
    }


    public void ClickAgreementCheckBox() throws InterruptedException {
    	
        WebElement AgreeBTN=driver.findElement(By.xpath("//input[@name='userAgreementStatus']"));
        Thread.sleep(2000);
        if(AgreeBTN.isEnabled()) {
        	JavascriptExecutor j = (JavascriptExecutor) driver;
        	j.executeScript("arguments[0].click();", AgreeBTN);
          //  AgreeBTN.click();
            CustomListner.test.log(LogStatus.INFO, "Click on I agree Button");
        }else {
            CustomListner.test.log(LogStatus.FAIL,  "I agree button not Display");
        }

    }


    public void SendForReviewClick() {
        WebElement ReviewBTN=driver.findElement(By.xpath("//button[@name='SEND FOR REVIEW']"));
        wait.waitForElementToBeVisibleweb(driver, ReviewBTN, 20, "Element is Not Display");
        if(ReviewBTN.isDisplayed()) {
            ReviewBTN.click();
            CustomListner.test.log(LogStatus.INFO, "Click on review Button");
        }else {
            CustomListner.test.log(LogStatus.FAIL,  "Review button not Display");
        }

    }


    public void verifyRNAHeader() {
        WebElement Header=driver.findElement(By.xpath("//span[@class='pathname' and contains(text(),'Review')]"));
        Assert.assertTrue(Header.isDisplayed());

    }


    public void inputOtp(String Otp){

        WebElement elem = driver.findElement(By.cssSelector("#inputotp"));
        elem.click();
        elem.sendKeys(Otp);
    }


    public void performLinkGenAndOTPFill(String userName , String passWord) throws InterruptedException {
       // String token = api.getToken(userName, passWord);
        String appNumber = null, ApplicationNumber = null;
        verifyRNAHeader();
        appNumber = driver.findElement(By.xpath("//div[@class=\"application-no\"]")).getText();
        String[] appnum = appNumber.split(" ");
        ApplicationNumber = appnum[2].trim();
       // String applicationID = api.getApplicationId(userName, ApplicationNumber, token);
        //String url =api.getRNALink(userName,ApplicationNumber,applicationID,token);
         wait.sleep(10000);
       // ArrayList<String> tab = testUtil.openNewTab(driver, url);
        Thread.sleep(10000);
        TestUtil.scrollTillEndOfPage(driver);
        WebElement elem = driver.findElement(By.xpath("//span[text()='AGREE']"));
        testUtil.chooseActionButton(elem);
        //int otp = api.getOTP(userName, ApplicationNumber, applicationID, token);
        //inputOtp(Integer.toString(otp));
        Thread.sleep(20000);
       // driver.switchTo().window(tab.get(0));
    }

    public void verifyStatus(){

        WebElement elem = driver.findElement(By.xpath("//div[text()='Check Status']"));
        elem.click();
    }

	public void clickProceed() {
		WebElement elem = driver.findElement(By.xpath("//button[@name='PROCEED']"));
		wait.waitForElementToBeVisibleweb(driver, elem, 20, "Element Is Not Display On Page");
		if (elem.isDisplayed()) {
			elem.click();
			CustomListner.test.log(LogStatus.INFO, "Click on Proceed Button");
		} else {
			CustomListner.test.log(LogStatus.FAIL, "Proceed Button is Not Display");

		}
	}
}
