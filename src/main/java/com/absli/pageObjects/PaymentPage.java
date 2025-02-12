package com.absli.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.absli.APIData.ApiData;
import com.absli.Listner.CustomListner;
import com.absli.utils.WaitUtils;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import util.TestUtil;

public class PaymentPage {
	public WebDriver driver;
    public AndroidDriver driver1;
    public WaitUtils waitUtils;
    public ApiData api;
    public TestUtil testUtil;

    // Initializing the Page Objects:
    public PaymentPage(AndroidDriver driver1) {
        this.driver1 = driver1;
        waitUtils=new WaitUtils();
        api = new ApiData();
        testUtil = new TestUtil();
    }
    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        waitUtils=new WaitUtils();
        api = new ApiData();
        testUtil = new TestUtil();
    }
    



public void NevigatePaymentModeWeb() throws InterruptedException {
	
	

    WebElement planEle=driver.findElement(By.xpath("//span[text()='PLAN: ']"));
    waitUtils.waitForElementToBeVisibleweb(driver, planEle, 20, "Element is Not Display");
    if(planEle.isDisplayed()) {
	TestUtil.verifybgColor(planEle, driver);
    CustomListner.test.log(LogStatus.INFO, "Successfully Display  Plan Name On Payment Page");
    }else {
    	CustomListner.test.log(LogStatus.FAIL, " Plan Name  is Not Display");
    }
	


    WebElement applicationNOEle=driver.findElement(By.xpath("//span[text()='APPLICATION NO: ']"));
    waitUtils.waitForElementToBeVisibleweb(driver, applicationNOEle, 20, "Element is Not Display");
    if(applicationNOEle.isDisplayed()) {
	TestUtil.verifybgColor(applicationNOEle, driver);
    CustomListner.test.log(LogStatus.INFO, "Successfully Display  APPLICATION NO On Payment Page");
    }else {
    	CustomListner.test.log(LogStatus.FAIL, " APPLICATION NO Payment Page is Not Display");
    }
	


    WebElement premiumValueEle=driver.findElement(By.xpath("//span[text()='8,595.57']"));
    waitUtils.waitForElementToBeVisibleweb(driver, premiumValueEle, 20, "Element is Not Display");
    if(premiumValueEle.isDisplayed()) {
	TestUtil.verifybgColor(premiumValueEle, driver);
    CustomListner.test.log(LogStatus.INFO, "Successfully Display  Premium Value On Payment Page");
    }else {
    	CustomListner.test.log(LogStatus.FAIL, " Premium Value Payment Page is Not Display");
    }


	
	        WebElement onlineEle=driver.findElement(By.xpath("//div[text()='ONLINE']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, onlineEle, 20, "Element is Not Display");
	        if(onlineEle.isDisplayed()) {
			TestUtil.verifybgColor(onlineEle, driver);
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display  Online Payment Mode");
	        }else {
	        	CustomListner.test.log(LogStatus.FAIL, " Online Payment Mode is Not Display");
	        }
	        
	        WebElement CDDEle=driver.findElement(By.xpath("//div[text()='CHEQUE / DEMAND DRAFT']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, CDDEle, 20, "Element is Not Display");
	        if(CDDEle.isDisplayed()) {
			TestUtil.verifybgColor(CDDEle, driver);
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display CHEQUE / DEMAND DRAFT On Payment Mode ");
	        }else {
	        	CustomListner.test.log(LogStatus.FAIL, "CHEQUE / DEMAND DRAFT On Online Payment Mode is Not Display");
	        }
	        WebElement cashEle=driver.findElement(By.xpath("//div[text()='CASH']"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, cashEle, 20, "Element is Not Display");
	        if(cashEle.isDisplayed()) {
	        	TestUtil.verifybgColor(cashEle, driver);
	        	
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display cash Payment Mode ");
	        }else {
	        	  CustomListner.test.log(LogStatus.FAIL, " Cash Option Mode Is Not Dispaly");
	        }
	        
	        TestUtil.scrollTillEndOfPage(driver);
	        
	        WebElement WBEle=driver.findElement(By.xpath("//div[text()='WIN BACK']"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, WBEle, 20, "Element is Not Display");
	        if(WBEle.isDisplayed()) {
	        waitUtils.waitForElementToBeVisibleweb(driver, WBEle, 20, "Element is Not Display");
			TestUtil.verifybgColor(WBEle, driver);
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display WIN BACK On Payment Mode ");
	        }else {
	        	  CustomListner.test.log(LogStatus.FAIL, "WIN BACK  Payment Mode Page Is Not Dispaly");
	        }
	        
	        WebElement OTCEle=driver.findElement(By.xpath("//div[text()='OVER THE COUNTER (OTC)']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, OTCEle, 20, "Element is Not Display");
	        if(OTCEle.isDisplayed()) {
			TestUtil.verifybgColor(OTCEle, driver);
		
			
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display OTC On  Payment Mode");
	        }else {
	        	 CustomListner.test.log(LogStatus.FAIL, " OTC On Online Payment Mode Is Not Display");
	        }
	        
	       


}
    
    public void VerifictionOfPremiumValueWeb() throws InterruptedException {


        WebElement premiumValueEle=driver.findElement(By.xpath("//span[text()='8,595.57']"));
        waitUtils.waitForElementToBeVisibleweb(driver, premiumValueEle, 20, "Element is Not Display");
        if(premiumValueEle.isDisplayed()) {
    	TestUtil.verifybgColor(premiumValueEle, driver);
    	Assert.assertTrue(premiumValueEle.isDisplayed(),"Premium Value On Payment Page is Not Display");
        CustomListner.test.log(LogStatus.INFO, "Successfully Display  Premium Value On Payment Page");
        }else {
        	CustomListner.test.log(LogStatus.FAIL, " Premium Value On Payment Page is Not Display");
        }
    	
    	
    }
    
    

public void ClickOnPaymentModeweb(String val) {
    WebElement PaymentBTN=driver.findElement(By.xpath("//div[contains(text(),'"+val+"')]"));
    waitUtils.waitForElementToBeVisibleweb(driver, PaymentBTN, 20, "Element is Not Display");
    if(PaymentBTN.isDisplayed()) {
    	PaymentBTN.click();
        CustomListner.test.log(LogStatus.INFO, "Click Or Select  Payment Mode Button As=====>"+val);
    }else {
    	CustomListner.test.log(LogStatus.FAIL, "Payment Mode button is not display ");
    }
}


public void ClickOnPaymentSummaryNextBTNweb() {
    WebElement SnextBTN=driver.findElement(By.xpath("//span[contains(text(),'NEXT')]"));
    waitUtils.waitForElementToBeVisibleweb(driver, SnextBTN, 20, "Element is Not Display");
    if(SnextBTN.isDisplayed()) {
    	SnextBTN.click();
        CustomListner.test.log(LogStatus.INFO, "Click on Summary Next  Button On  Payment Mode");
    }else {
    	CustomListner.test.log(LogStatus.FAIL, " Summary Next Button is not display ");
    }
}



public void VerificationOfOnlinPaymentModeWeb() throws InterruptedException {
	
	        WebElement onlineEle=driver.findElement(By.xpath("//div[text()='ONLINE']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, onlineEle, 20, "Element is Not Display");
	        if(onlineEle.isDisplayed()) {
			TestUtil.verifybgColor(onlineEle, driver);
			Assert.assertTrue(onlineEle.isDisplayed(),"Online Payment Mode is Not Display");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display  Online Payment Mode");
	        }else {
	        	CustomListner.test.log(LogStatus.FAIL, " Online Payment Mode is Not Display");
	        }
	        
	        WebElement amountEle=driver.findElement(By.xpath("//div[text()='AMOUNT']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, amountEle, 20, "Element is Not Display");
	        if(amountEle.isDisplayed()) {
			TestUtil.verifybgColor(amountEle, driver);
			Assert.assertTrue(amountEle.isDisplayed(),"Amount Option On Online Payment Mode is Not Display");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Amount of Online Payment Mode ");
	        }else {
	        	CustomListner.test.log(LogStatus.FAIL, "Amount Option On Online Payment Mode is Not Display");
	        }
	        WebElement amountEle1=driver.findElement(By.xpath("//div[@class='prem-amount-val mar-top-5']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, amountEle1, 20, "Element is Not Display");
	        if(amountEle1.isDisplayed()) {
			TestUtil.verifybgColor(amountEle1, driver);
			Assert.assertTrue(amountEle1.isDisplayed(),"Amount Option On Online Payment Mode is Not Display");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Amount of Online Payment Mode ");
	        }else {
	        	CustomListner.test.log(LogStatus.FAIL, "Amount Option On Online Payment Mode is Not Display");
	        }
	      
	        WebElement applictionNoEle=driver.findElement(By.xpath("//span[text()='APPLICATION NO: ']"));
	        if(applictionNoEle.isDisplayed()) {
	        waitUtils.waitForElementToBeVisibleweb(driver, applictionNoEle, 20, "Element is Not Display");
			TestUtil.verifybgColor(applictionNoEle, driver);
			Assert.assertTrue(applictionNoEle.isDisplayed()," Application No  Payment Mode Page Is Not Dispaly");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Application No On Payment Mode Page");
	        }else {
	        	  CustomListner.test.log(LogStatus.FAIL, " Application No  Payment Mode Page Is Not Dispaly");
	        }
	        
	        WebElement sendLinkEle=driver.findElement(By.xpath("//div[text()='Send Payment link']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, sendLinkEle, 20, "Element is Not Display");
	        if(sendLinkEle.isDisplayed()) {
			TestUtil.verifybgColor(sendLinkEle, driver);
			Thread.sleep(2000);
			sendLinkEle.click();
			
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Send Payment Link On Online Payment Mode");
	        }else {
	        	 CustomListner.test.log(LogStatus.FAIL, " Send Payment Link On Online Payment Mode Is Not Display");
	        }
	        
	        WebElement sendLinkMSGEle=driver.findElement(By.xpath("//div[text()='Link Sent to Client']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, sendLinkMSGEle, 20, "Element is Not Display");
	        if(sendLinkMSGEle.isDisplayed()) {
			TestUtil.verifybgColor(sendLinkMSGEle, driver);
			Assert.assertTrue(sendLinkMSGEle.isDisplayed(),"  Send Payment Link MSG On Online Payment Mode Is Not Display");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Send Payment Link MSG On Online Payment Mode");
	        }else {
	        	 CustomListner.test.log(LogStatus.FAIL, " Send Payment Link MSG On Online Payment Mode Is Not Display");
	        }
	        
	        WebElement copyLinkEle=driver.findElement(By.xpath("//div[text()='Copy Payment link']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, copyLinkEle, 20, "Element is Not Display");
	        if(copyLinkEle.isDisplayed()) {
			TestUtil.verifybgColor(copyLinkEle, driver);
			Assert.assertTrue(copyLinkEle.isDisplayed()," Copy Payment link On Online Payment Mode Is Not Display");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Copy Payment link On Online Payment Mode");
	        }else {
	        	 CustomListner.test.log(LogStatus.FAIL, " Copy Payment link On Online Payment Mode Is Not Display");
	        }


}


public void VerificationChequeAndDemandDraftPaymentModeWeb() throws InterruptedException {

   
	
	        WebElement cashEle=driver.findElement(By.xpath("//div[text()='Cheque']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, cashEle, 20, "Element is Not Display");
	        if(cashEle.isDisplayed()) {
			TestUtil.verifybgColor(cashEle, driver);
			   Assert.assertTrue(cashEle.isDisplayed(),"Cash Option is Not Display");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display CHEQUE Option On CHEQUE and Demand Darft Payment Mode");
	        }else {
	        	CustomListner.test.log(LogStatus.FAIL, " Cash Option is Not Display");
	        }
	     
	        TestUtil.scrollToElement(driver,driver.findElement(By.xpath("//input[@id='ifscCode']")));
	        WebElement demandDraftEle=driver.findElement(By.xpath("//div[text()='Demand Draft']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, demandDraftEle, 20, "Element is Not Display");
	        if(demandDraftEle.isDisplayed()) {
			TestUtil.verifybgColor(demandDraftEle, driver);
			   Assert.assertTrue(demandDraftEle.isDisplayed(),"Demand And draft Option is Not Display");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Demand And Draft Payment Mode Option ");
	        }else {
	        	CustomListner.test.log(LogStatus.FAIL, "Demand And draft Option is Not Display");
	        }
	        
	        WebElement cashimgEle=driver.findElement(By.xpath("//div[text()='CHEQUE IMAGE']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, cashimgEle, 20, "Element is Not Display");
	        if(cashimgEle.isDisplayed()) {
			TestUtil.verifybgColor(cashimgEle, driver);
			   Assert.assertTrue(cashimgEle.isDisplayed(),"CHEQUE IMAGE is Not Display");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display CHEQUE IMAGE ");
	        }else {
	        	CustomListner.test.log(LogStatus.FAIL, "CHEQUE IMAGE is Not Display");
	        }
	        
	        WebElement ammuntEle=driver.findElement(By.xpath("//div[@class='prem-amount-val']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, ammuntEle, 20, "Element is Not Display");
	        if(ammuntEle.isDisplayed()) {
			TestUtil.verifybgColor(ammuntEle, driver);
			   Assert.assertTrue(ammuntEle.isDisplayed(),"Cheque Ammount  Is Not Display");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Cheque Amount Option ");
	        }else {
	        	 CustomListner.test.log(LogStatus.FAIL, " Cheque Ammount  Is Not Display");
	        }
	      
	        WebElement chequeNoEle=driver.findElement(By.xpath("//input[@id='chequeDDNo']"));
	        if(chequeNoEle.isDisplayed()) {
	        waitUtils.waitForElementToBeVisibleweb(driver, chequeNoEle, 20, "Element is Not Display");
			TestUtil.verifybgColor(chequeNoEle, driver);
			   Assert.assertTrue(chequeNoEle.isDisplayed(),"Cheque No Is Not Dispaly");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Cheque No Option ");
	        }else {
	        	  CustomListner.test.log(LogStatus.FAIL, " Cheque No Is Not Dispaly");
	        }
	        
	        WebElement chequeDateEle=driver.findElement(By.xpath("//label[text()='Cheque Date']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, chequeDateEle, 20, "Element is Not Display");
	        if(chequeDateEle.isDisplayed()) {
			TestUtil.verifybgColor(chequeDateEle, driver);
			   Assert.assertTrue(chequeDateEle.isDisplayed(),"Cheque Date Is Not Display");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Cheque Date Filed");
	        }else {
	        	 CustomListner.test.log(LogStatus.FAIL, "Cheque Date Is Not Display");
	        }
	        
	        WebElement ifscEle=driver.findElement(By.xpath("//input[@id='ifscCode']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, ifscEle, 20, "Element is Not Display");
	        if(ifscEle.isDisplayed()) {
			TestUtil.verifybgColor(ifscEle, driver);
			   Assert.assertTrue(ifscEle.isDisplayed(),"IFSC Filed Is Not Display");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display IFSC Filed  Option");
	        }else {
	        	 CustomListner.test.log(LogStatus.FAIL, " IFSC Filed Is Not Display");
	        }
	}
	
		




public void ClickONLINEPaymentPayNowBTNweb() throws InterruptedException {
    WebElement PayNowBTN=driver.findElement(By.xpath("//span[text()='Pay Now']"));
    waitUtils.waitForElementToBeVisibleweb(driver, PayNowBTN, 20, "Element is Not Display");
    TestUtil.verifybgColor(PayNowBTN, driver);
    if(PayNowBTN.isDisplayed()) {
    	PayNowBTN.click();
        CustomListner.test.log(LogStatus.INFO, "Click on PayNow Button On Online Payment Mode");
    }else {
    	CustomListner.test.log(LogStatus.FAIL, "Paynow  Button On Online Payment is not display ");
    }
}



public void SelectChequeORDemandDraftWeb(String args) {
	  WebElement cDDEle=driver.findElement(By.xpath("//div[text()='"+args+"']"));
	  waitUtils.waitForElementToBeVisibleweb(driver, cDDEle, 20, "Element is Not Display");
    if(cDDEle.isDisplayed()) {
    	cDDEle.click();
        CustomListner.test.log(LogStatus.INFO, "Select Payment Option  As=====>"+args);
    }else {
    	CustomListner.test.log(LogStatus.FAIL, " Cheque Or Demand Draft No is not display ");
    }
}
public void EnterChequeDDNoWeb(String args) {
    WebElement cheque=driver.findElement(By.xpath("//input[@id='chequeDDNo']"));
    waitUtils.waitForElementToBeVisibleweb(driver, cheque, 20, "Element is Not Display");
    if(cheque.isDisplayed()) {
    	cheque.sendKeys(args);
        CustomListner.test.log(LogStatus.INFO, "Enter Cheque No OR DD No As=====>"+args);
    }else {
    	CustomListner.test.log(LogStatus.FAIL, " Cheque Or Demand Draft No is not display ");
    }
}
public void EnterDDMMYYONCDDWeb(String CDDday,String CDDMonth,String CDDYear ) {

    WebElement CDDDayInput = driver.findElement(By.xpath("//input[@id='dd']"));
    waitUtils.waitforElementToBeClickable(driver, CDDDayInput, 100);
    CDDDayInput.click();
    CDDDayInput.sendKeys(CDDday);
    CustomListner.test.log(LogStatus.INFO, "Enter Cheque Date On(day) As=====> "+CDDday);
    WebElement CDDMonthInput=driver.findElement(By.xpath("//input[@id='mm']"));
    waitUtils.waitforElementToBeClickable(driver,CDDMonthInput,100);
    CDDMonthInput.click();
    CDDMonthInput.sendKeys(CDDMonth);
    CustomListner.test.log(LogStatus.INFO, "Enter Cheque Date On (month) As=====> "+CDDMonth);

    WebElement CDDYearInput=driver.findElement(By.xpath("//input[@id='yy']"));
    CDDYearInput.click();
    CDDYearInput.sendKeys(CDDYear);
    CustomListner.test.log(LogStatus.INFO, "Enter Cheque Date On (year) As=====> "+CDDYear);

}

public void EnterIFSCCodeOnCDDWeb(String CDDIFSCcode) {


	     WebElement ifscEle=driver.findElement(By.xpath("//input[@id='ifscCode']"));
	     waitUtils.waitForElementToBeVisibleweb(driver, ifscEle, 20, "Element is Not Display");
	     if(ifscEle.isDisplayed()) {
	    	ifscEle.click();
	    	ifscEle.sendKeys(CDDIFSCcode);
	     CustomListner.test.log(LogStatus.INFO, "Enter  IFSC Code As >>>"+CDDIFSCcode+ ">>>On Cheque Or DD Payment");
	     }else {
	    	 CustomListner.test.log(LogStatus.FAIL, " IFSC Filed Is Not Display");
	    }
    
	    	
	    }



public void VerifyEnetrvalidIFSCCodeOnCDDWeb() throws InterruptedException {
	
	       TestUtil.scrollToElement(driver,driver.findElement(By.xpath("//div[text()='CASH']")));
	        WebElement banknameEle=driver.findElement(By.xpath("//input[@id='bankName']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, banknameEle, 20, "Element is Not Display");
	        if(banknameEle.isDisplayed()) {
			TestUtil.verifybgColor(banknameEle, driver);
			Assert.assertTrue(banknameEle.isDisplayed(),"Bank Name is Not Display");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Bank Name");
	        }else {
	        	CustomListner.test.log(LogStatus.FAIL, " Bank Name is Not Display");
	        }
	      
	        TestUtil.scrollToElement(driver,driver.findElement(By.xpath("//input[@id='ifscCode']")));
	        WebElement brachnameEle=driver.findElement(By.xpath("//input[@id='branchName']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, brachnameEle, 20, "Element is Not Display");
	        if(brachnameEle.isDisplayed()) {
			TestUtil.verifybgColor(brachnameEle, driver);
			Assert.assertTrue(brachnameEle.isDisplayed(),"Successfully Display Branch Name");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Branch Name ");
	        }else {
	        	CustomListner.test.log(LogStatus.FAIL, "Branch Name is Not Display");
	        }
	        
	        WebElement codeEle=driver.findElement(By.xpath("//input[@id='micrCode']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, codeEle, 20, "Element is Not Display");
	        if(codeEle.isDisplayed()) {
			TestUtil.verifybgColor(codeEle, driver);
			Assert.assertTrue(codeEle.isDisplayed(),"MICR CODE is Not Display");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display MICR CODE ");
	        }else {
	        	CustomListner.test.log(LogStatus.FAIL, "MICR CODE is Not Display");
	        }
	        
	}


public void VarifyINCORRECTIFSCCodeOnCDDWeb() throws InterruptedException {


	     WebElement ifscEle=driver.findElement(By.xpath("//input[@id='ifscCode']"));
	     waitUtils.waitForElementToBeVisibleweb(driver, ifscEle, 20, "Element is Not Display");
	     if(ifscEle.isDisplayed()) {
	    	 Thread.sleep(1000);
	    	ifscEle.clear();
	    	 Thread.sleep(1000);
	    	ifscEle.sendKeys("123456");
	     CustomListner.test.log(LogStatus.INFO, "Enter  Incurrect IFSC Code As >>>123456<<<On Cheque Or DD Payment");
	     }else {
	    	 CustomListner.test.log(LogStatus.FAIL, " IFSC Filed Is Not Display");
	    }
	     TestUtil.scrollToElement(driver,driver.findElement(By.xpath("(//span[text()='Submit'])[1]")));
	       driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).click();
	        WebElement codeErrorEle=driver.findElement(By.xpath("//p[text()='Invalid IFSC Code']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, codeErrorEle, 20, "Element is Not Display");
	       String value= codeErrorEle.getText();
	        if(codeErrorEle.isDisplayed()) {
			TestUtil.verifybgColor(codeErrorEle, driver);
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display IFSC CODE Error MSG ");
	        }else {
	        	CustomListner.test.log(LogStatus.FAIL, " IFSC CODE Error MSG is Not Display");
	        }
	    	Assert.assertEquals(value, "Invalid IFSC Code");
	    	ifscEle.clear();
	    }


public void ClickCDDPaymentSubmitBTNweb() throws InterruptedException {
	 TestUtil.scrollToElement(driver,driver.findElement(By.xpath("(//span[text()='Submit'])[1]")));
    WebElement submitBTN=driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
    TestUtil.verifybgColor(submitBTN, driver);
    if(submitBTN.isDisplayed()) {
    	submitBTN.click();
        CustomListner.test.log(LogStatus.INFO, "Click on Submit On CDD Payment ");
    }else {
    	CustomListner.test.log(LogStatus.FAIL, "Submit  Button On CDD Payment is not display ");
    }
}

public void UploadChequeAndDDImgweb() throws InterruptedException {
	
	 WebElement SelectVal=driver.findElement(By.xpath("//input[@type='file']"));
	 String destination= System.getProperty("user.dir")+"\\Document\\download.jpg";
	 if(SelectVal.isDisplayed()) {
		 Thread.sleep(1000);
		 SelectVal.sendKeys(destination);
		 CustomListner.test.log(LogStatus.INFO, "Failed to upload file...Upload Button is not Display");
	 }else {
		 SelectVal.sendKeys(destination);
		 CustomListner.test.log(LogStatus.INFO, "Successfully Uploaded Cheque Or DD Image");
		
	 }
    
   
}

public void UploadDECLARATIONFORMImgweb() throws InterruptedException {
 
	 WebElement SelectVal=driver.findElement(By.xpath("//input[@type='file']"));
	 String destination= System.getProperty("user.dir")+"\\Document\\download.jpg";
	 if(SelectVal.isDisplayed()) {
		 
		 SelectVal.sendKeys(destination);
		 CustomListner.test.log(LogStatus.INFO, "Failed to upload file...Upload Button is not Display");
	 }else {
		 SelectVal.sendKeys(destination);
		 CustomListner.test.log(LogStatus.INFO, "Successfully Uploaded Cheque Image");
		
	 }
    
   
}
public void CDDRemoveBTNweb() throws InterruptedException {
	
    WebElement RemoveBTN=driver.findElement(By.xpath("//img[@alt='delete']"));
  
    if(RemoveBTN.isDisplayed()) {
    	RemoveBTN.click();
        CustomListner.test.log(LogStatus.INFO, "Click on CDD Image Remove BTN ");
    }else {
    	CustomListner.test.log(LogStatus.FAIL, "CDD Image Remove BTN is not display ");
    }
}
public void VerifyAlertMsgUploadImg() throws InterruptedException {
    WebElement alertMSG=driver.findElement(By.xpath("//div[text()='Are you sure you want to remove this file?']"));
   String Value= alertMSG.getText();
    if(alertMSG.isDisplayed()) {
    	TestUtil.verifybgColor(alertMSG, driver);
    	Assert.assertEquals(Value, "Are you sure you want to remove this file?");
    }else {
    	CustomListner.test.log(LogStatus.INFO, "Remove Alert MSG is not display ");
    }
    	WebElement YesBTN=driver.findElement(By.xpath("//span[text()='Yes']"));
    	
    	if(YesBTN.isDisplayed()) {
    		YesBTN.click();
    		  CustomListner.test.log(LogStatus.INFO, "Click on OK BTN Remove Alert On CDD Payment ");
    	}
      
    else {
    	CustomListner.test.log(LogStatus.FAIL, "OK BTN is not display ");
    }
    
    
}


public void UploadChequeAndDDGreaterSizeImgweb() throws InterruptedException {
 
	 WebElement SelectVal=driver.findElement(By.xpath("//input[@type='file']"));
	 String destination= System.getProperty("user.dir")+"\\Document\\OBPACMB001S.pdf";
	 if(SelectVal.isDisplayed()) {
		 
		 SelectVal.sendKeys(destination);
		 CustomListner.test.log(LogStatus.INFO, "Successfully Uploaded Greater Size Cheque Image");
	 }else {
		 SelectVal.sendKeys(destination);
		 CustomListner.test.log(LogStatus.FAIL, "Successfully Uploaded NEW Cheque Image");
	 }
}
public void ValidationCDDImagegreterSizeErrorMSG() throws InterruptedException {
	 WebElement ErrorMSG=driver.findElement(By.xpath("//p[text()='Max file size is 5MB.']"));
	String value1= ErrorMSG.getText();
	    if(ErrorMSG.isDisplayed()) {
	    	  TestUtil.verifybgColor(ErrorMSG, driver);
	    	  
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Greater Size CDD Image Error MSG  ");
	    }else {
	    	CustomListner.test.log(LogStatus.FAIL, "CDD Image Error MSG is not display ");
	    }
	    Assert.assertEquals(value1, "Max file size is 5MB.");
}
public void IMGAlertOKBTN() throws InterruptedException {
		 WebElement OKBTN=driver.findElement(By.xpath("//span[text()='OK']"));
		    if(OKBTN.isDisplayed()) {
		    	  TestUtil.verifybgColor(OKBTN, driver);
		    	  OKBTN.click();
		        CustomListner.test.log(LogStatus.INFO, "Successfully Display OK BTN ");
		    }else {
		    	CustomListner.test.log(LogStatus.FAIL, "OK is not display ");
		    }
}

public void ClickOnCashSubmitBTNweb() {
    WebElement PaymentBTN=driver.findElement(By.xpath("(//span[contains(text(),'Submit')])[2]"));
    if(PaymentBTN.isDisplayed()) {
    	PaymentBTN.click();
        CustomListner.test.log(LogStatus.INFO, "Click on Submit Button On Cash Payment ");
    }else {
    	CustomListner.test.log(LogStatus.FAIL, "Cash Submit Button is not display ");
    }
}

public void VerificationOfCashModeweb() throws InterruptedException {
    WebElement cashamount=driver.findElement(By.xpath("(//div[text()='Amount'])[1]"));
    if(cashamount.isDisplayed()) {
    	 TestUtil.verifybgColor(cashamount, driver);
    	 Assert.assertTrue(cashamount.isDisplayed(),"Cash Amount is not display");
        CustomListner.test.log(LogStatus.INFO, "Successfully Display Cash Amount On Cash Payment ");
    }else {
    	CustomListner.test.log(LogStatus.FAIL, "  Cash Amount is not display ");
    }
}
/*

public void VerificationOfSummaryPageOncashweb() throws InterruptedException {
	

    WebElement paymentsummary=driver.findElement(By.xpath("//div[text()='Payment Summary']"));
    if(paymentsummary.isDisplayed()) {
    	 TestUtil.verifybgColor(paymentsummary, driver);
    	 Assert.assertTrue(paymentsummary.isDisplayed(),"payment summary is not display");
        CustomListner.test.log(LogStatus.INFO, "Successfully Display Payment Summery On Cash Payment MOde ");
    }else {
    	CustomListner.test.log(LogStatus.INFO, " payment summary is not display ");
    }
    

	
	 WebElement paidvaiEle=driver.findElement(By.xpath("//div[text()='Paid via ']"));
	    if(paidvaiEle.isDisplayed()) {
	    	 TestUtil.verifybgColor(paidvaiEle, driver);
	    	 Assert.assertTrue(paidvaiEle.isDisplayed(),"Paid via CASH payment summary is not display");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Payment Paid via CASH On Cash Payment Mode");
	    }else {
	    	CustomListner.test.log(LogStatus.INFO, "Paid via CASH payment summary is not display ");
	    }
    
    WebElement totalAmount=driver.findElement(By.xpath("//div[@class='display-flex payment-due-mode white']"));
    if(totalAmount.isDisplayed()) {
    	 TestUtil.verifybgColor(totalAmount, driver);
    	 Assert.assertTrue(totalAmount.isDisplayed(),"Total Amount is not display");
        CustomListner.test.log(LogStatus.INFO, "Successfully Display Total Amount On Summary Page ");
    }else {
    	CustomListner.test.log(LogStatus.INFO, "Total Amount is not display ");
    }

	
    WebElement totalAmountPaid=driver.findElement(By.xpath("//div[text()='Total Amount Paid']"));
    if(totalAmountPaid.isDisplayed()) {
    	 TestUtil.verifybgColor(totalAmountPaid, driver);
    	 Assert.assertTrue(totalAmountPaid.isDisplayed(),"Total Amount Paid payment summary is not display");
        CustomListner.test.log(LogStatus.INFO, "Successfully Display Total Amount Paid On Cash Payment Mode");
    }else {
    	CustomListner.test.log(LogStatus.INFO, "Total Amount Paid payment summary is not display ");
    }

	
    WebElement cashamount=driver.findElement(By.xpath("//div[text()='CASH']"));
    if(cashamount.isDisplayed()) {
    	 TestUtil.verifybgColor(cashamount, driver);
    	 Assert.assertTrue(cashamount.isDisplayed()," Cash Amount is not display");
        CustomListner.test.log(LogStatus.INFO, "Successfully Display Cash On Cash Payment Mode");
    }else {
    	CustomListner.test.log(LogStatus.INFO, " Cash Amount is not display ");
    }

   WebElement paymentsucessful=driver.findElement(By.xpath("//span[text()='Payment Sucessful']"));
   String sucessfulMSG=paymentsucessful.getText();
   if(paymentsucessful.isDisplayed()) {
	 TestUtil.verifybgColor(paymentsucessful, driver);
	
    CustomListner.test.log(LogStatus.INFO, "Successfully Display Payment Sucessful MSG On Cash Payment Mode");
  }else {
	CustomListner.test.log(LogStatus.INFO, " payment sucessful MSG is not display ");
  }
  Assert.assertEquals(sucessfulMSG, "Payment Sucessful");
	
	

	    WebElement details=driver.findElement(By.xpath("//div[text()='Details']"));
	    if(details.isDisplayed()) {
	    	 TestUtil.verifybgColor(details, driver);
	    	 Assert.assertTrue(details.isDisplayed(),"  Details Amount is not display");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Details On Cash Payment Mode");
	    }else {
	    	CustomListner.test.log(LogStatus.INFO, "  Details Amount is not display ");
	    }

	    WebElement amountRecieved=driver.findElement(By.xpath("//div[text()='Amount Recieved']"));
	    if(amountRecieved.isDisplayed()) {
	    	 TestUtil.verifybgColor(amountRecieved, driver);
	    	 Assert.assertTrue(amountRecieved.isDisplayed(),"  Amount Recieved Amount is not display");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Amount Recieved On Cash Payment Mode ");
	    }else {
	    	CustomListner.test.log(LogStatus.INFO, "  Amount Recieved Amount is not display ");
	    }

	    WebElement paymentDate=driver.findElement(By.xpath("//div[text()='Date']"));
	    if(amountRecieved.isDisplayed()) {
	    	 TestUtil.verifybgColor(paymentDate, driver);
	    	 Assert.assertTrue(paymentDate.isDisplayed()," Payment Date  is not display");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Payment Date On Cash Payment Mode");
	    }else {
	    	CustomListner.test.log(LogStatus.INFO, " Payment Date  is not display ");
	    }
	
 }
 */

public void VerifySuccessFullPaymentOnSummaryPageWeb() throws InterruptedException{

	   WebElement paymentsucessful=driver.findElement(By.xpath("//span[text()='Payment Sucessful']"));
	   String sucessfulMSG=paymentsucessful.getText();
	   if(paymentsucessful.isDisplayed()) {
		 TestUtil.verifybgColor(paymentsucessful, driver);
		
	    CustomListner.test.log(LogStatus.INFO, "Successfully Display Payment Sucessful MSG ");
	  }else {
		CustomListner.test.log(LogStatus.FAIL, " payment sucessful MSG is not display ");
	  }
	  Assert.assertEquals(sucessfulMSG, "Payment Sucessful");
		
	
}




/*

public void VerificationOfSummaryPageOnWINBACKweb() throws InterruptedException {
	

    WebElement paymentsummary=driver.findElement(By.xpath("//div[text()='Payment Summary']"));
    if(paymentsummary.isDisplayed()) {
    	 TestUtil.verifybgColor(paymentsummary, driver);
    	 Assert.assertTrue(paymentsummary.isDisplayed()," payment summary On WIN BACK is not display");
        CustomListner.test.log(LogStatus.INFO, "Successfully Display Payment Summery On WIN BACK  Payment MOde ");
    }else {
    	CustomListner.test.log(LogStatus.INFO, " payment summary On WIN BACK is not display ");
    }
    

	
	 WebElement paidvaiEle=driver.findElement(By.xpath("//div[text()='Paid via ']"));
	    if(paidvaiEle.isDisplayed()) {
	    	 TestUtil.verifybgColor(paidvaiEle, driver);
	    	 Assert.assertTrue(paidvaiEle.isDisplayed()," Paid via CASH payment summary is not display");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Payment Paid via  WIN BACK On WIN BACK Payment Mode");
	    }else {
	    	CustomListner.test.log(LogStatus.INFO, "Paid via CASH payment summary is not display ");
	    }
    
    WebElement totalAmount=driver.findElement(By.xpath("//div[@class='display-flex payment-due-mode white']"));
    if(totalAmount.isDisplayed()) {
    	 TestUtil.verifybgColor(totalAmount, driver);
    	 Assert.assertTrue(totalAmount.isDisplayed()," Total Amount is not display ");
        CustomListner.test.log(LogStatus.INFO, "Successfully Display Total Amount On Summary Page ");
    }else {
    	CustomListner.test.log(LogStatus.INFO, "Total Amount is not display ");
    }

	
    WebElement totalAmountPaid=driver.findElement(By.xpath("//div[text()='Total Amount Paid']"));
    if(totalAmountPaid.isDisplayed()) {
    	 TestUtil.verifybgColor(totalAmountPaid, driver);
    	 Assert.assertTrue(totalAmountPaid.isDisplayed()," Total Amount Paid payment summary is not display ");
        CustomListner.test.log(LogStatus.INFO, "Successfully Display Total Amount Paid On WIN BACK Payment Mode");
    }else {
    	CustomListner.test.log(LogStatus.INFO, "Total Amount Paid payment summary is not display ");
    }

	
    WebElement WBamount=driver.findElement(By.xpath("//div[text()='WIN BACK']"));
    if(WBamount.isDisplayed()) {
    	 TestUtil.verifybgColor(WBamount, driver);
    	 Assert.assertTrue(WBamount.isDisplayed(),"  WIN BACK Amount is not display ");
        CustomListner.test.log(LogStatus.INFO, "Successfully Display WIN BACK  On WIN BACK Payment Mode");
    }else {
    	CustomListner.test.log(LogStatus.INFO, "  WIN BACK Amount is not display ");
    }

   WebElement paymentsucessful=driver.findElement(By.xpath("//span[text()='Payment Sucessful']"));
   String sucessfulMSG=paymentsucessful.getText();
   if(paymentsucessful.isDisplayed()) {
	 TestUtil.verifybgColor(paymentsucessful, driver);
	 
    CustomListner.test.log(LogStatus.INFO, "Successfully Display Payment Sucessful MSG On WIN BACK Payment Mode");
  }else {
	CustomListner.test.log(LogStatus.INFO, " payment sucessful is not display ");
  }
  Assert.assertEquals(sucessfulMSG, "Payment Sucessful");
	
	

	    WebElement details=driver.findElement(By.xpath("//div[text()='Details']"));
	    if(details.isDisplayed()) {
	    	 TestUtil.verifybgColor(details, driver);
	    	 Assert.assertTrue(details.isDisplayed(),"  Details Amount is not display ");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Details On WIN BACK Payment Mode");
	    }else {
	    	CustomListner.test.log(LogStatus.INFO, "  Details Amount is not display ");
	    }

	    WebElement amountRecieved=driver.findElement(By.xpath("//div[text()='Amount Recieved']"));
	    if(amountRecieved.isDisplayed()) {
	    	 TestUtil.verifybgColor(amountRecieved, driver);
	    	 Assert.assertTrue(amountRecieved.isDisplayed(),"  Amount Recieved Amount is not display ");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Amount Recieved On WIN BACK Payment Mode ");
	    }else {
	    	CustomListner.test.log(LogStatus.INFO, "  Amount Recieved Amount is not display ");
	    }

	    WebElement paymentDate=driver.findElement(By.xpath("//div[text()='Date']"));
	    if(paymentDate.isDisplayed()) {
	    	 TestUtil.verifybgColor(paymentDate, driver);
	    	 Assert.assertTrue(paymentDate.isDisplayed(),"Payment Date  is not display ");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Payment Date On WIN BACK Payment Mode");
	    }else {
	    	CustomListner.test.log(LogStatus.INFO, " Payment Date  is not display ");
	    }
	
 }

*/




public void EnterPolicyNOOnWinBackWeb(String args) {
	     WebElement policyNoEle=driver.findElement(By.xpath("//input[contains(@name,'policyDetails[0].policyNo')]"));
	     waitUtils.waitForElementToBeVisibleweb(driver, policyNoEle, 20, "Element is Not Display");
	     if(policyNoEle.isDisplayed()) {
	    	 policyNoEle.click();
	    	 policyNoEle.sendKeys(args);
	     CustomListner.test.log(LogStatus.INFO, "Enter  Policy Number On WinBack Payment  >>>"+args);
	     }else {
	    	 CustomListner.test.log(LogStatus.FAIL, " Policy NO Is Not Display");
	    }
	     
}


public void EnterSecondPolicyNOOnWinBackWeb(String args) throws InterruptedException {
	     WebElement policyNoEle2=driver.findElement(By.xpath("//input[contains(@name,'policyDetails[1].policyNo')]"));
	     waitUtils.waitForElementToBeVisibleweb(driver, policyNoEle2, 20, "Element is Not Display");
	     if(policyNoEle2.isDisplayed()) {
	    	 policyNoEle2.click();
	    	 policyNoEle2.sendKeys(args);
	     CustomListner.test.log(LogStatus.INFO, "Enter  Second Policy Number As >>>"+args+ "<<<On WinBack Payment");
	     }else {
	    	 CustomListner.test.log(LogStatus.FAIL, "Second Policy NO Is Not Display");
	    }

}

public void VerificationOfPolicyNOeweb() throws InterruptedException {
	 WebElement policyNoEle=driver.findElement(By.xpath("//input[contains(@name,'policyDetails[0].policyNo')]"));
     waitUtils.waitForElementToBeVisibleweb(driver, policyNoEle, 20, "Element is Not Display");
     if(policyNoEle.isDisplayed()) {
    	 policyNoEle.click();
    	 policyNoEle.sendKeys("123456");
     CustomListner.test.log(LogStatus.INFO, "Enter  Policy Number As 123456 On WinBack Payment");
     }else {
    	 CustomListner.test.log(LogStatus.FAIL, " Policy NO Is Not Display");
    }
     Thread.sleep(1000);
     driver.findElement(By.xpath("//span[text()='SAVE']")).click();
     
    WebElement plicyErrorMSg=driver.findElement(By.xpath("//p[text()='Policy number must be of 9 digits']"));
    String Policyvalue=plicyErrorMSg.getText();
    if(plicyErrorMSg.isDisplayed()) {
    	 TestUtil.verifybgColor(plicyErrorMSg, driver);
        CustomListner.test.log(LogStatus.INFO, "Successfully Display Policy Error  Msg  On Win Back Payment ");
    }else {
    	CustomListner.test.log(LogStatus.FAIL, " Policy Error MSG is not display ");
    }
    
Assert.assertEquals(Policyvalue, "Policy number must be of 9 digits");
policyNoEle.clear();
}




public void VerificationOfAmounteWBweb() throws InterruptedException {
	WebElement validationAmountEle=driver.findElement(By.xpath("//input[contains(@name,'policyDetails[0].policyAmount')]"));
     waitUtils.waitForElementToBeVisibleweb(driver, validationAmountEle, 20, "Element is Not Display");
     if(validationAmountEle.isDisplayed()) {
    	 validationAmountEle.click();
    	 validationAmountEle.sendKeys("9000");
     CustomListner.test.log(LogStatus.INFO, "Enter  Policy Amount 9000 On WinBack Payment");
     }else {
    	 CustomListner.test.log(LogStatus.FAIL, " Policy Amount Is Not Display");
    }
   
     
}
     
     public void validationExceedMSgonWBWeb() throws InterruptedException {
    	
         WebElement AmountErrorMSg=driver.findElement(By.xpath("//p[text()='Total policy amount cannot exceed 8595.57']"));
         String Amountvalue=AmountErrorMSg.getText();
         if(AmountErrorMSg.isDisplayed()) {
    	 TestUtil.verifybgColor(AmountErrorMSg, driver);
         CustomListner.test.log(LogStatus.INFO, "Successfully Display Policy Amount Error  Msg  On Win Back Payment ");
         }else {
    	 CustomListner.test.log(LogStatus.FAIL, " Policy Amount Error MSG is not display ");
         }
    
         Assert.assertEquals(Amountvalue, "Total policy amount cannot exceed 8595.57");
         driver.findElement(By.xpath("//span[text()='CLOSE']")).click();
        
}

public void EnterAmountOnWinBackWeb(String args) {
	     WebElement AmountEle=driver.findElement(By.xpath("//input[contains(@name,'policyDetails[0].policyAmount')]"));
	     waitUtils.waitForElementToBeVisibleweb(driver, AmountEle, 20, "Element is Not Display");
	     if(AmountEle.isDisplayed()) {
	    	 AmountEle.click();
	    	 AmountEle.sendKeys(args);
	     CustomListner.test.log(LogStatus.INFO, "Enter  Amount  On WinBack Payment >>>"+args);
	     }else {
	    	 CustomListner.test.log(LogStatus.FAIL, " Amount NO Is Not Display");
	    }
	    	
	    }



public void RemoveAmountOnWinBackWeb() {
	     WebElement RAmountEle=driver.findElement(By.xpath("//input[contains(@name,'policyDetails[0].policyAmount')]"));
	     waitUtils.waitForElementToBeVisibleweb(driver, RAmountEle, 20, "Element is Not Display");
	     if(RAmountEle.isDisplayed()) {
	    	 RAmountEle.click();
	    	 for (int i = 0; i < 9; i++) {
	    		 RAmountEle.sendKeys(Keys.BACK_SPACE);
	    		 RAmountEle.sendKeys(" ");
	    		 RAmountEle.sendKeys(Keys.DELETE);
             }
	    	
	     
	     }else {
	    	 CustomListner.test.log(LogStatus.FAIL, " Amount NO Is Not Display");
	    }
	    	
	    }
	    
public void EnterSecondAmountOnWinBackWeb(String args) {
	     WebElement AmountEle2=driver.findElement(By.xpath("//input[contains(@name,'policyDetails[1].policyAmount')]"));
	     waitUtils.waitForElementToBeVisibleweb(driver, AmountEle2, 20, "Element is Not Display");
	     if(AmountEle2.isDisplayed()) {
	    	 AmountEle2.click();
	    	 AmountEle2.sendKeys(args);
	     CustomListner.test.log(LogStatus.INFO, "Enter Second Amount  As >>>"+args+ "<<<On WinBack Payment");
	     }else {
	    	 CustomListner.test.log(LogStatus.FAIL, "Second Amount NO Is Not Display");
	    }
	    	
	    }

public void EditAndReEnterAmountOnWinBackWeb(String args) throws InterruptedException {
	
	     WebElement AmountEle=driver.findElement(By.xpath("//input[contains(@name,'policyDetails[0].policyAmount')]"));
	     waitUtils.waitForElementToBeVisibleweb(driver, AmountEle, 20, "Element is Not Display");
	    
	    	 if(AmountEle.isDisplayed()){
	    		 AmountEle.click();

	             for (int i = 0; i < 9; i++) {
	            	 AmountEle.sendKeys(Keys.BACK_SPACE);
	            	 AmountEle.sendKeys(" ");
	            	 AmountEle.sendKeys(Keys.DELETE);
	             }
	    	 AmountEle.sendKeys(args);
	     CustomListner.test.log(LogStatus.INFO, "Enter  Amount  As >>>"+args+ "<<<On WinBack Payment");
	     }else {
	    	 CustomListner.test.log(LogStatus.FAIL, " Amount NO Is Not Display");
	    }
	    	
	    }

public void ClickOnWinBackSaveBTNweb() {
    WebElement SaveBTN=driver.findElement(By.xpath("(//span[text()='SAVE'])[1]"));
    if(SaveBTN.isDisplayed()) {
    	SaveBTN.click();
        CustomListner.test.log(LogStatus.INFO, "Click on Save Button On Win Back Payment ");
    }else {
    	CustomListner.test.log(LogStatus.FAIL, "Win Back Save Button is not display ");
    }
}

public void ClickOnWinBackSecondSaveBTNweb() {
    WebElement SaveBTN=driver.findElement(By.xpath("(//span[text()='SAVE'])[2]"));
    if(SaveBTN.isDisplayed()) {
    	SaveBTN.click();
        CustomListner.test.log(LogStatus.INFO, "Click on Save Button On Win Back Payment ");
    }else {
    	CustomListner.test.log(LogStatus.FAIL, "Win Back Save Button is not display ");
    }
}
public void ClickOnWinBackAddBTNweb() {
    WebElement addBTN=driver.findElement(By.xpath("//span[text()='+ Add']"));
    if(addBTN.isDisplayed()) {
    	addBTN.click();
        CustomListner.test.log(LogStatus.INFO, "Click on Add Button On Win Back Payment ");
    }else {
    	CustomListner.test.log(LogStatus.FAIL, "Win Back Add Button is not display ");
    }
}

public void ClickOnWinBackRemoveBTNweb() {
    WebElement removeBTN=driver.findElement(By.xpath("(//span[text()='Remove'])[1]"));
    if(removeBTN.isDisplayed()) {
    	removeBTN.click();
        CustomListner.test.log(LogStatus.INFO, "Click on Remove Button On Win Back Payment ");
    }else {
    	CustomListner.test.log(LogStatus.FAIL, "Win Back Remove Button is not display ");
    }
}

public void ClickOnWinBackREDEEMBTNweb() {
    WebElement redeemBTN=driver.findElement(By.xpath("//span[text()='REDEEM']"));
    if(redeemBTN.isDisplayed()) {
    	redeemBTN.click();
        CustomListner.test.log(LogStatus.INFO, "Click on REDEEM Button On Win Back Payment ");
    }else {
    	CustomListner.test.log(LogStatus.FAIL, "Win Back REDEEM Button is not display ");
    }
}

public void ClickOnWinBackEditBTNweb() throws InterruptedException {
    WebElement editBTN=driver.findElement(By.xpath("//span[text()='Edit']"));
    if(editBTN.isDisplayed()) {
   	 TestUtil.verifybgColor(editBTN, driver);
    	editBTN.click();
        CustomListner.test.log(LogStatus.INFO, "Click on Edit Button On Win Back Payment ");
    }else {
    	CustomListner.test.log(LogStatus.FAIL, "Win Back Edit Button is not display ");
    }
}



            public void VerificatinOfBalanceAmountCanPayToOnlineModeWeb() throws InterruptedException {

	        WebElement onlinemodeEle=driver.findElement(By.xpath("//div[text()='ONLINE']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, onlinemodeEle, 20, "Element is Not Display");
	        if(onlinemodeEle.isDisplayed()) {
			TestUtil.verifybgColor(onlinemodeEle, driver);
			onlinemodeEle.click();
	        CustomListner.test.log(LogStatus.INFO, "Successfully Select Online Option on  Balance Amount Can  Be Pay");
	        }else {
	        	CustomListner.test.log(LogStatus.FAIL, " Cash Option is Not Display");
	        }
	        
	        WebElement amountEle=driver.findElement(By.xpath("//div[text()='AMOUNT']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, amountEle, 20, "Element is Not Display");
	        if(amountEle.isDisplayed()) {
			TestUtil.verifybgColor(amountEle, driver);
			
			 Assert.assertTrue(amountEle.isDisplayed(),"Amount Option On Online Payment Mode is Not Display ");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Deu Amount of Online Payment Mode ");
	        }else {
	        	CustomListner.test.log(LogStatus.FAIL, "Amount Option On Online Payment Mode is Not Display");
	        }
	        
	        TestUtil.scrollToElement(driver,driver.findElement(By.xpath("//button[@name='Pay Now']")));
	        WebElement paynowEle=driver.findElement(By.xpath("//button[@name='Pay Now']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, paynowEle, 20, "Element is Not Display");
	        if(paynowEle.isDisplayed()) {
			TestUtil.verifybgColor(paynowEle, driver);
			 Assert.assertTrue(paynowEle.isDisplayed(),"PayNow Btn Option is Not Display ");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display PayNow  BTN on Online Payment Mode");
	        }else {
	        	CustomListner.test.log(LogStatus.FAIL, "PayNow Btn Option is Not Display");
	        }
}
            
            
            
	        public void VerificatinOfBalanceAmountCanPayToCDDModeWeb() throws InterruptedException {
	        	  TestUtil.scrollToElement(driver,driver.findElement(By.xpath("//div[text()='CASH']")));
	        WebElement cddEle=driver.findElement(By.xpath("//div[text()='CHEQUE / DEMAND DRAFT']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, cddEle, 20, "Element is Not Display");
	        if(cddEle.isDisplayed()) {
			TestUtil.verifybgColor(cddEle, driver);
			cddEle.click();
	        CustomListner.test.log(LogStatus.INFO, "Successfully Select CHEQUE / DEMAND DRAFT Option on  Balance Amount Can Pay");
	        }else {
	        	CustomListner.test.log(LogStatus.INFO, "CHEQUE / DEMAND DRAFT is Not Display");
	        }
	        TestUtil.scrollToElement(driver,driver.findElement(By.xpath("(//span[text()='Submit'])[1]")));
	        WebElement ammuntEle=driver.findElement(By.xpath("//div[@class='prem-amount-val']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, ammuntEle, 20, "Element is Not Display");
	        if(ammuntEle.isDisplayed()) {
			TestUtil.verifybgColor(ammuntEle, driver);
			 Assert.assertTrue(ammuntEle.isDisplayed(),"Cheque Ammount  Is Not Display");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display CDD Deu Amount On CDD Payment Mode ");
	        }else {
	        	 CustomListner.test.log(LogStatus.INFO, " Cheque Ammount  Is Not Display");
	        }
	      
	       
	        WebElement submitEle=driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
	        waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	        if(submitEle.isDisplayed()) {
			TestUtil.verifybgColor(submitEle, driver);
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Sumit BTN On CDD Option.");
	        }else {
	        	 CustomListner.test.log(LogStatus.INFO, "  submit BTN  Is Not Display");
	        }
	        }
	        
	        
	        
	        
	        public void  VerificatinOfBalanceAmountCanPayToCashModeWeb() throws InterruptedException {
	        	 TestUtil.scrollToElement(driver,driver.findElement(By.xpath("//div[text()='OVER THE COUNTER (OTC)']")));
	        WebElement cashEle=driver.findElement(By.xpath("//div[text()='CASH']"));
	        if(cashEle.isDisplayed()) {
	        	TestUtil.verifybgColor(cashEle, driver);
	        	cashEle.click();
		
	        CustomListner.test.log(LogStatus.INFO, "Successfully Select cash Option on  Balance Amount Can Pay");
	        }else {
	        	  CustomListner.test.log(LogStatus.INFO, " Cash Option Is Not Dispaly");
	        }



            WebElement cashamount=driver.findElement(By.xpath("(//div[text()='Amount'])[1]"));
            if(cashamount.isDisplayed()) {
    	     TestUtil.verifybgColor(cashamount, driver);
    	     Assert.assertTrue(cashamount.isDisplayed()," Cash Due Amount is not display ");
             CustomListner.test.log(LogStatus.INFO, "Successfully Display Cash Amount On Cash Payment Mode");
              }else {
         	CustomListner.test.log(LogStatus.INFO, "  Cash Amount is not display ");
             }


	        WebElement submitEle=driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
	        waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	        if(submitEle.isDisplayed()) {
			TestUtil.verifybgColor(submitEle, driver);
		     Assert.assertTrue(submitEle.isDisplayed()," Submit BTN Is Not Display ");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Submit BTN on  Balance Amount Can Pay");
	        }else {
	        	 CustomListner.test.log(LogStatus.INFO, "Submit BTN Is Not Display");
	        }
	        
	        
	        
	}
	        public void  VerificatinOfBalanceAmountCanPayToOTCModeWeb() throws InterruptedException {
	        	
	        WebElement OTCEle=driver.findElement(By.xpath("//div[text()='OVER THE COUNTER (OTC)']"));
	        if(OTCEle.isDisplayed()) {
	        	TestUtil.verifybgColor(OTCEle, driver);
	        	OTCEle.click();
		
	        CustomListner.test.log(LogStatus.INFO, "Successfully Select OTC Option On Balance Amount Can Pay");
	        }else {
	        	  CustomListner.test.log(LogStatus.INFO, " OTC Option Is Not Dispaly");
	        }
	        WebElement OTCamount=driver.findElement(By.xpath("(//div[text()='Amount'])[3]"));
	        if(OTCamount.isDisplayed()) {
	        	 TestUtil.verifybgColor(OTCamount, driver);
	        	 Assert.assertTrue(OTCamount.isDisplayed(),"OTC Amount is not display");
	            CustomListner.test.log(LogStatus.INFO, "Successfully Display OTC Deu Amount On OTC Payment ");
	        }else {
	        	CustomListner.test.log(LogStatus.INFO, "  OTC Amount is not display ");
	        }
	        WebElement submitEle=driver.findElement(By.xpath("(//span[text()='Submit'])[3]"));
	        waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	        if(submitEle.isDisplayed()) {
			TestUtil.verifybgColor(submitEle, driver);
			submitEle.click();
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Submit BTN On OTC Option");
	        }else {
	        	 CustomListner.test.log(LogStatus.INFO, "Submit BTN Is Not Display");
	        }
	        
	        
	        
	}

	        public void  VerificatinOfBalanceAmountCanPayToOTCModeSummaryPageWeb() throws InterruptedException {
	        	 WebElement OTCPaidviawinbackEle=driver.findElement(By.xpath("(//div[@class='display-flex white'])[1]"));
	        	    if(OTCPaidviawinbackEle.isDisplayed()) {
	        	    	 TestUtil.verifybgColor(OTCPaidviawinbackEle, driver);
	        	    	 Assert.assertTrue(OTCPaidviawinbackEle.isDisplayed(),"Paid via WINBACK Amount is not display ");
	        	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Paid via WINBACK On OTC Payment ");
	        	    }else {
	        	    	CustomListner.test.log(LogStatus.INFO, "  Paid via WINBACK Amount is not display ");
	        	    }
	        	    WebElement Paidviaotc=driver.findElement(By.xpath("(//div[@class='display-flex white'])[2]"));
	        	    if(Paidviaotc.isDisplayed()) {
	        	    	 TestUtil.verifybgColor(Paidviaotc, driver);
	        	    	 Assert.assertTrue(Paidviaotc.isDisplayed(),"Paid via OTC Amount is not display ");
	        	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Paid via OTC On OTC Payment ");
	        	    }else {
	        	    	CustomListner.test.log(LogStatus.INFO, "  Paid via OTC Amount is not display ");
	        	    }
	        }

	        public void clickProceedonRNAWeb(){
	            WebElement elem = driver.findElement(By.xpath("//span[text()='PROCEED']"));
	          if(elem.isDisplayed()){
	            elem.click();
	        }}

public void VerificationOfOTCModeweb() throws InterruptedException {
	try {
    WebElement OTCamount=driver.findElement(By.xpath("(//div[text()='Amount'])[3]"));
    waitUtils.waitForElementToBeVisibleweb(driver, OTCamount, 20, "Element is Not Display");
    if(OTCamount.isDisplayed()) {
    	 TestUtil.verifybgColor(OTCamount, driver);
    	 Assert.assertTrue(OTCamount.isDisplayed(),"  OTC Amount is not display ");
        CustomListner.test.log(LogStatus.INFO, "Successfully Display OTC Amount On OTC Payment ");
    }else {
    	CustomListner.test.log(LogStatus.INFO, "  OTC Amount is not display ");
    }}catch(NoSuchElementException e) {
        
   	 CustomListner.test.log(LogStatus.FAIL, "Element is Not Display..Failed to OTC Amount ");
   	
   }
	
}

public void ClickOnOTCSubmitBTNweb() {
    WebElement OTCPaymentBTN=driver.findElement(By.xpath("(//span[contains(text(),'Submit')])[3]"));
    waitUtils.waitforElementToBeClickable(driver, OTCPaymentBTN, 30);
    if(OTCPaymentBTN.isDisplayed()) {
    	OTCPaymentBTN.click();
        CustomListner.test.log(LogStatus.INFO, "Click on Submit Button On OTC Payment ");
    }else {
    	CustomListner.test.log(LogStatus.FAIL, "OTC Submit Button is not display ");
    }
}

/*
public void VerificationOfSummaryPageOnOTCweb() throws InterruptedException {
	try {
	WebElement paymentsummary = driver.findElement(By.xpath("//div[text()='Payment Summary']"));
	if (paymentsummary.isDisplayed()) {
		TestUtil.verifybgColor(paymentsummary, driver);
		 Assert.assertTrue(paymentsummary.isDisplayed(),"  payment summary is not display ");
		CustomListner.test.log(LogStatus.INFO, "Successfully Display Payment Summery On OTC Payment MOde ");
	} else {
		CustomListner.test.log(LogStatus.INFO, " payment summary is not display ");
	}}catch(NoSuchElementException e) {
        
   	 CustomListner.test.log(LogStatus.FAIL, "Element is Not Display..On Payment Summery On OTC Payment MOde ");
   	
   }

	try {

	WebElement paidvaiEle = driver.findElement(By.xpath("//div[text()='Paid via ']"));
	if (paidvaiEle.isDisplayed()) {
		TestUtil.verifybgColor(paidvaiEle, driver);
		 Assert.assertTrue(paidvaiEle.isDisplayed()," Paid via CASH payment summary is not display ");
		CustomListner.test.log(LogStatus.INFO, "Successfully Display Payment Paid via OTC On OTC Payment Mode");
	} else {
		CustomListner.test.log(LogStatus.INFO, "Paid via CASH payment summary is not display ");
	}}catch(NoSuchElementException e) {
        
   	 CustomListner.test.log(LogStatus.FAIL, "Element is Not Display..On Payment Paid via OTC On OTC Payment Mode ");
   	
   }
try {
	WebElement totalAmount = driver.findElement(By.xpath("//div[@class='display-flex payment-due-mode white']"));
	if (totalAmount.isDisplayed()) {
		TestUtil.verifybgColor(totalAmount, driver);
		 Assert.assertTrue(totalAmount.isDisplayed()," Total Amount is not display ");
		CustomListner.test.log(LogStatus.INFO, "Successfully Display Total Amount On Summary Page ");
	} else {
		CustomListner.test.log(LogStatus.INFO, "Total Amount is not display ");
	}
}catch(NoSuchElementException e) {
    
	 CustomListner.test.log(LogStatus.FAIL, "Element is Not Display..On Total Amount On Summary Page ");
	
}
try {
	WebElement totalAmountPaid = driver.findElement(By.xpath("//div[text()='Total Amount Paid']"));
	if (totalAmountPaid.isDisplayed()) {
		TestUtil.verifybgColor(totalAmountPaid, driver);
		 Assert.assertTrue(totalAmountPaid.isDisplayed()," Total Amount Paid payment summary is not display  ");
		CustomListner.test.log(LogStatus.INFO, "Successfully Display Total Amount Paid On OTC Payment Mode");
	} else {
		CustomListner.test.log(LogStatus.INFO, "Total Amount Paid payment summary is not display ");
	}}catch(NoSuchElementException e) {
	    
		 CustomListner.test.log(LogStatus.FAIL, "Element is Not Display..On Total Amount Paid On OTC Payment Mode ");
		
	}
try {

	WebElement otcamount = driver.findElement(By.xpath("//div[text()='OVER THE COUNTER (OTC)']"));
	if (otcamount.isDisplayed()) {
		TestUtil.verifybgColor(otcamount, driver);
		 Assert.assertTrue(otcamount.isDisplayed()," OVER THE COUNTER (OTC  is not display  ");
		CustomListner.test.log(LogStatus.INFO, "Successfully Display OVER THE COUNTER (OTC On OTC Payment Mode");
	} else {
		CustomListner.test.log(LogStatus.INFO, " OVER THE COUNTER (OTC  is not display ");
	}}catch(NoSuchElementException e) {
	    
		 CustomListner.test.log(LogStatus.FAIL, "Element is Not Display..On OVER THE COUNTER (OTC On OTC Payment Mode ");
		
	}
try {

	WebElement paymentsucessful = driver.findElement(By.xpath("//span[text()='Payment Sucessful']"));
	String sucessfulMSG = paymentsucessful.getText();
	if (paymentsucessful.isDisplayed()) {
		TestUtil.verifybgColor(paymentsucessful, driver);
		
		CustomListner.test.log(LogStatus.INFO, "Successfully Display Payment Sucessful MSG On OTC Payment Mode");
	} else {
		CustomListner.test.log(LogStatus.INFO, " payment sucessful is not display ");
	}
	Assert.assertEquals(sucessfulMSG, "Payment Sucessful");
}catch(NoSuchElementException e) {
    
	 CustomListner.test.log(LogStatus.FAIL, "Element is Not Display..On Payment Sucessful MSG On OTC Payment Mode ");
	
}
try {
	WebElement details = driver.findElement(By.xpath("//div[text()='Details']"));
	if (details.isDisplayed()) {
		TestUtil.verifybgColor(details, driver);
		 Assert.assertTrue(details.isDisplayed(),"Details Amount is not display ");
		CustomListner.test.log(LogStatus.INFO, "Successfully Display Details On OTC Payment Mode");
	} else {
		CustomListner.test.log(LogStatus.INFO, "  Details Amount is not display ");
	}}catch(NoSuchElementException e) {
	    
		 CustomListner.test.log(LogStatus.FAIL, "Element is Not Display..On Details On OTC Payment Mode ");
		
	}
try {

	WebElement amountRecieved1 = driver.findElement(By.xpath("//div[text()='Amount Received']"));
	if (amountRecieved1.isDisplayed()) {
		TestUtil.verifybgColor(amountRecieved1, driver);
		 Assert.assertTrue(amountRecieved1.isDisplayed(),"Amount Recieved Amount is not display ");
		CustomListner.test.log(LogStatus.INFO, "Successfully Display Amount Recieved On OTC Payment Mode ");
	} else {
		CustomListner.test.log(LogStatus.INFO, "  Amount Recieved Amount is not display ");
	}}catch(NoSuchElementException e) {
	    
		 CustomListner.test.log(LogStatus.FAIL, "Element is Not Display..On Amount Recieved On OTC Payment Mode ");
		
	}
try {

	WebElement paymentDate1 = driver.findElement(By.xpath("//div[text()='Date']"));
	if (paymentDate1.isDisplayed()) {
		TestUtil.verifybgColor(paymentDate1, driver);
		 Assert.assertTrue(paymentDate1.isDisplayed(),"Payment Date  is not display ");
		CustomListner.test.log(LogStatus.INFO, "Successfully Display Payment Date On OTC Payment Mode");
	} else {
		CustomListner.test.log(LogStatus.INFO, " Payment Date  is not display ");
	}
	}catch(NoSuchElementException e) {
	    
		 CustomListner.test.log(LogStatus.FAIL, "Element is Not Display..On Payment Date On OTC Payment Mode ");
		
	}
}
 

*/

public void VerifyDifferenceBetweenPremiumAmountAndPaidAmountOnWINBACKweb() throws InterruptedException {
	

    WebElement policyDetails1=driver.findElement(By.xpath("(//div[@class='win-back-saved-policy border-top'])[1]"));
    if(policyDetails1.isDisplayed()) {
    	 TestUtil.verifybgColor(policyDetails1, driver);
    	 Assert.assertTrue(policyDetails1.isDisplayed()," Policy Details ONE On WIN BACK is not display ");
        CustomListner.test.log(LogStatus.INFO, "Successfully Display Policy Details ONE On WIN BACK  Payment MOde ");
    }else {
    	CustomListner.test.log(LogStatus.FAIL, " Policy Details ONE On WIN BACK is not display ");
    }
    

	
	 WebElement policyDetails2=driver.findElement(By.xpath("(//div[@class='win-back-saved-policy border-top'])[2]"));
	    if(policyDetails2.isDisplayed()) {
	    	 TestUtil.verifybgColor(policyDetails2, driver);
	    	 Assert.assertTrue(policyDetails2.isDisplayed()," Policy Details TWO is not display ");
	        CustomListner.test.log(LogStatus.INFO, "Successfully Display Policy Details TWO On WIN BACK Payment Mode");
	    }else {
	    	CustomListner.test.log(LogStatus.FAIL, "Policy Details TWO is not display ");
	    }
    
    WebElement balancePayable=driver.findElement(By.xpath("//div[@class='win-back-saved-policy border-top-bottom']"));
    if(balancePayable.isDisplayed()) {
    	 TestUtil.verifybgColor(balancePayable, driver);
    	 Assert.assertTrue(balancePayable.isDisplayed()," Balance Payable is not display ");
        CustomListner.test.log(LogStatus.INFO, "Successfully Display Balance Payable ON WIN BACK  Payment MOde ");
    }else {
    	CustomListner.test.log(LogStatus.FAIL, "Balance Payable is not display ");
    }

}

public void ClickOnReMovePolicyBTNweb() throws InterruptedException {
    WebElement removeBTN=driver.findElement(By.xpath("(//span[text()='Remove'])[2]"));
    if(removeBTN.isDisplayed()) {
    	 TestUtil.verifybgColor(removeBTN, driver);
    	 removeBTN.click();
        CustomListner.test.log(LogStatus.INFO, "Click on Remove Policy Button On Wine Back Payment ");
    }else {
    	CustomListner.test.log(LogStatus.FAIL, "Win Back Remove Button is not display ");
    }
}
	









public void  ValidationSummaryPageweb(String args) throws InterruptedException {
	try {
	TestUtil.scrollToElement(driver,driver.findElement(By.xpath("//div[text()='"+args+"']"))); 
      WebElement selecttext = driver.findElement(By.xpath("//div[text()='"+args+"']"));
      waitUtils.waitforElementToBeClickable(driver, selecttext, 100);
      String getValue=  selecttext.getText();
      if(getValue.contains(args)) {
    	  TestUtil.verifybgColor(selecttext, driver);
    	  CustomListner.test.log(LogStatus.INFO, "Successfully verified=====>"+args);
      }else {
    	  CustomListner.test.log(LogStatus.INFO, "Failed to Verified Summary Page validation  ");
      }
	}catch(NoSuchElementException e) {
	    
		 CustomListner.test.log(LogStatus.FAIL, "Element is Not Display..On Payment Page Summary ");
		
	}








}

}






