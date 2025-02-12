package com.absli.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.absli.APIData.ApiData;
import com.absli.Listner.CustomListner;
import com.absli.utils.WaitUtils;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import util.TestUtil;

public class IARPage {
	
	
	
	public WebDriver driver;
    public AndroidDriver driver1;
    public WaitUtils wait;
    public ApiData api;
    public TestUtil testUtil;
   

    // Initializing the Page Objects:
    public IARPage(AndroidDriver driver1) {
        this.driver1 = driver1;
        wait=new WaitUtils();
        api = new ApiData();
        testUtil = new TestUtil();
    }
    public IARPage(WebDriver driver) {
        this.driver = driver;
        wait=new WaitUtils();
        api = new ApiData();
        testUtil = new TestUtil();
    }
    
    
    
    public void EnterClusterMarketNameField(String ClusterMarketName) {
   	 TestUtil.scrollToElement(driver,driver.findElement(By.xpath("(//div[text()='Yes'])[3]")));
        WebElement clusterMarketName=driver.findElement(By.xpath("//input[contains(@placeholder,'Cluster Name')]"));
        if(clusterMarketName.isDisplayed()) {
        	clusterMarketName.sendKeys(ClusterMarketName);
            CustomListner.test.log(LogStatus.INFO, "Enter Cluster Market Name  As=====>"+ClusterMarketName);
        }else {
        	CustomListner.test.log(LogStatus.INFO, "Cluster Market Name is not display ");
        }
    }
    public void ClickSaveAndContinueButtonIARweb() {
        WebElement saveBTN=driver.findElement(By.xpath("//span[contains(text(),'SAVE & CONTINUE')]"));
        if(saveBTN.isDisplayed()) {
        	saveBTN.click();
            CustomListner.test.log(LogStatus.INFO, "Click on Save And Continue Button");
        }else {
        	CustomListner.test.log(LogStatus.INFO, "Save And Continue Button is not Display");
        }
    }
    
    public void VerifyClusterMarketNamtFieldweb() throws InterruptedException {
        try {
        	 WebElement clusterNameErrorMSG=driver.findElement(By.xpath("//p[contains(text(),'Please Select a value')]"));
        	String Value= clusterNameErrorMSG.getText();
          	 if(clusterNameErrorMSG.isDisplayed()) {
          		 TestUtil.verifybgColor(clusterNameErrorMSG, driver);
          		 
          		 CustomListner.test.log(LogStatus.INFO, "Successfully Display Cluster Market Name Error Msg");
          	 }else {
          		 CustomListner.test.log(LogStatus.INFO, "Cluster Market Name Error Msg Is Not Display");
          	 }  
          	 Assert.assertEquals(Value,"Please Select a value" );
        }catch(NoSuchElementException e) {
            
       	 CustomListner.test.log(LogStatus.FAIL, "Element is Not Display..Failed to Verified Cluster Market Name Error Msg");
       	
       }
      	
      }
    
    

    public void EnterLifeToBeINSUREDPROPOSERyeardWeb(String args) {
    	 TestUtil.scrollToElement(driver,driver.findElement(By.xpath("(//div[text()='Yes'])[3]")));
        WebElement lifeInsuredYEAR=driver.findElement(By.xpath("//input[contains(@placeholder,'Years')]"));
        if(lifeInsuredYEAR.isDisplayed()) {
        	lifeInsuredYEAR.sendKeys(args);
            CustomListner.test.log(LogStatus.INFO, "Enter  LIFE to be INSURED / PROPOSER YEAR As=====>"+args);
        }else {
        	CustomListner.test.log(LogStatus.INFO, " LIFE to be INSURED / PROPOSER  YAER Filed is not display ");
        }
    }

    public void EnterLifeToBeINSUREDPROPOSERmonthWeb(String args) {
        WebElement lifeInsuredMONTH=driver.findElement(By.xpath("//input[contains(@placeholder,'Months')]"));
        if(lifeInsuredMONTH.isDisplayed()) {
        	lifeInsuredMONTH.sendKeys(args);
            CustomListner.test.log(LogStatus.INFO, "Enter  LIFE to be INSURED / PROPOSER MONTH As=====>"+args);
        }else {
        	CustomListner.test.log(LogStatus.INFO, " LIFE to be INSURED / PROPOSER MONTH Filed is not display ");
        }
    }
    
    public void VerifyINSUREDPROPOSERyearFieldweb() throws InterruptedException {
        try {
        	 TestUtil.scrollToElement(driver,driver.findElement(By.xpath("(//div[text()='Yes'])[3]")));
        	 WebElement InsuredProposerYrErrorMSG=driver.findElement(By.xpath("//p[contains(text(),'Please Enter Year')]"));
        	String Value1= InsuredProposerYrErrorMSG.getText();
          	 if(InsuredProposerYrErrorMSG.isDisplayed()) {
          		 TestUtil.verifybgColor(InsuredProposerYrErrorMSG, driver);
          		 
          		 CustomListner.test.log(LogStatus.INFO, "Successfully Display LIFE to be INSURED / PROPOSER YEAR Error Msg");
          	 }else {
          		 CustomListner.test.log(LogStatus.INFO, " LIFE to be INSURED / PROPOSER YEAR Error Msg Is Not Display");
          	 }  
          	 Assert.assertEquals(Value1,"Please Enter Year" );
        }catch(NoSuchElementException e) {
            
       	 CustomListner.test.log(LogStatus.FAIL, "Element is Not Display..Failed to Verified  LIFE to be INSURED / PROPOSER YEAR Error Msg ");
       	
       }
      	
      }
    public void VerifyINSUREDPROPOSERmonthsFieldweb() throws InterruptedException {
        try {
        	 WebElement InsuredProposerMonthErrorMSG=driver.findElement(By.xpath("//p[contains(text(),'Please Enter Month')]"));
        	String Value1= InsuredProposerMonthErrorMSG.getText();
          	 if(InsuredProposerMonthErrorMSG.isDisplayed()) {
          		 TestUtil.verifybgColor(InsuredProposerMonthErrorMSG, driver);
          		 
          		 CustomListner.test.log(LogStatus.INFO, "Successfully Display LIFE to be INSURED / PROPOSER MONTH Error Msg");
          	 }else {
          		 CustomListner.test.log(LogStatus.INFO, "LIFE to be INSURED / PROPOSER MONTH Error Msg Is Not Display");
          	 }  
          	 Assert.assertEquals(Value1,"Please Enter Month" );
        }catch(NoSuchElementException e) {
            
       	 CustomListner.test.log(LogStatus.FAIL, "Element is Not Display..Failed to Verified LIFE to be INSURED / PROPOSER MONTH Error Msg");
       	
       }
      	
      }
    public void ClickphysicaldefectsYESBTNweb() {
        WebElement physicalDefectYESBtn=driver.findElement(By.xpath("(//div[contains(text(),'Yes')])[3]"));
        if(physicalDefectYESBtn.isDisplayed()) {
        	physicalDefectYESBtn.click();
            CustomListner.test.log(LogStatus.INFO, "Click on physical defects Yes BTN");
        }else {
        	CustomListner.test.log(LogStatus.INFO, "  physical defects Yes button is not display ");
        }
    }

    public void EnterPleaseSpecifyWeb(String args) {
    	 TestUtil.scrollToElement(driver,driver.findElement(By.xpath("(//div[text()='Yes'])[3]")));
        WebElement pleaseSpecify=driver.findElement(By.xpath("(//input[@placeholder='Please Specify'])[1]"));
        if(pleaseSpecify.isDisplayed()) {
        	pleaseSpecify.sendKeys(args);
            CustomListner.test.log(LogStatus.INFO, "Enter  Please Specify  As=====>"+args);
        }else {
        	CustomListner.test.log(LogStatus.INFO, "Please Specify Filed is not display ");
        }
    }
    public void VerifyPleaseSpecifyFieldweb() throws InterruptedException {
        try {
        	
        	 WebElement pleaseSpecifyErrorMSG=driver.findElement(By.xpath("(//p[text()='Please specify'])[1]"));
        	String Value2= pleaseSpecifyErrorMSG.getText();
          	 if(pleaseSpecifyErrorMSG.isDisplayed()) {
          		 TestUtil.verifybgColor(pleaseSpecifyErrorMSG, driver);
          		 
          		 CustomListner.test.log(LogStatus.INFO, "Successfully Display Please Specify Filed Error Msg");
          	 }else {
          		 CustomListner.test.log(LogStatus.INFO, " Please Specify Filed Error Msg Is Not Display");
          	 }  
          	 Assert.assertEquals(Value2,"Please specify" );
          	 
        }catch(NoSuchElementException e) {
            
       	 CustomListner.test.log(LogStatus.FAIL, "Element is Not Display..Failed to Please Specify Filed Error Msg ");
       	
       }
      	
      }

public void ClickAdverseEffectOninsurabilityYESBTNweb() {
    WebElement adverseEffectYESBtn=driver.findElement(By.xpath("(//div[contains(text(),'Yes')])[4]"));
    if(adverseEffectYESBtn.isDisplayed()) {
    	adverseEffectYESBtn.click();
        CustomListner.test.log(LogStatus.INFO, "Click on Adverse Effect on Insurability Yes BTN");
    }else {
    	CustomListner.test.log(LogStatus.INFO, "  adverse effect on insurability  Yes button is not display ");
    }
}

public void ClickRevivalOfLifeHealthInsuranceYESBTNweb() {
    WebElement revivalLifeHealthYESBtn=driver.findElement(By.xpath("(//div[contains(text(),'Yes')])[5]"));
    if(revivalLifeHealthYESBtn.isDisplayed()) {
    	revivalLifeHealthYESBtn.click();
        CustomListner.test.log(LogStatus.INFO, "Click on Revival of life/Health Insurance Yes BTN");
    }else {
    	CustomListner.test.log(LogStatus.INFO, "  revival of life/Health insurance Yes button is not display ");
    }
}

public void ClickSpecificSuspiciousActivityYESBTNweb() {
    WebElement specificActivityYESBtn=driver.findElement(By.xpath("(//div[contains(text(),'Yes')])[6]"));
    if(specificActivityYESBtn.isDisplayed()) {
    	specificActivityYESBtn.click();
        CustomListner.test.log(LogStatus.INFO, "Click on Specific Suspicious Activity Yes BTN");
    }else {
    	CustomListner.test.log(LogStatus.INFO, " Specific Suspicious Activity Yes button is not display ");
    }
}



public void VerifyNOButtonByDefaultweb() throws InterruptedException {
    try {
    	 WebElement NoBTNEle1=driver.findElement(By.xpath("(//button[@type='button'])[13]"));
    	String Value= NoBTNEle1.getAttribute("aria-pressed");
      	 if(Value.equalsIgnoreCase("true")) {
      		 TestUtil.verifybgColor(NoBTNEle1, driver);
      		 
      		 CustomListner.test.log(LogStatus.INFO, "Successfully Display NO Button Click By Default");
      	 }else {
      		 CustomListner.test.log(LogStatus.INFO, "NO Button  Is Not Display");
      	 }  
      
    }catch(NoSuchElementException e) {
        
   	 CustomListner.test.log(LogStatus.FAIL, "No Button is Not Display..");
   	
   }
  	
  }


public void VerifyNOButtonByDefaulTwoweb() throws InterruptedException {
    try {
    	 WebElement NoBTNEle2=driver.findElement(By.xpath("(//button[@type='button'])[15]"));
    	String Value= NoBTNEle2.getAttribute("aria-pressed");
      	 if(Value.equalsIgnoreCase("true")) {
      		 TestUtil.verifybgColor(NoBTNEle2, driver);
      		 
      		 CustomListner.test.log(LogStatus.INFO, "Successfully Display NO Button Click By Default");
      	 }else {
      		 CustomListner.test.log(LogStatus.INFO, "NO Button  Is Not Display");
      	 }  
      
    }catch(NoSuchElementException e) {
        
   	 CustomListner.test.log(LogStatus.FAIL, "No Button is Not Display..");
   	
   }
  	
  }


public void VerifyNOButtonByDefaulThreeweb() throws InterruptedException {
    try {
    	 WebElement NoBTNEle3=driver.findElement(By.xpath("(//button[@type='button'])[17]"));
    	String Value= NoBTNEle3.getAttribute("aria-pressed");
      	 if(Value.equalsIgnoreCase("true")) {
      		 TestUtil.verifybgColor(NoBTNEle3, driver);
      		 
      		 CustomListner.test.log(LogStatus.INFO, "Successfully Display NO Button Click By Default");
      	 }else {
      		 CustomListner.test.log(LogStatus.INFO, "NO Button  Is Not Display");
      	 }  
      
    }catch(NoSuchElementException e) {
        
   	 CustomListner.test.log(LogStatus.FAIL, "No Button is Not Display..");
   	
   }
  	
  }


public void VerifyNOButtonByDefaulFourweb() throws InterruptedException {
    try {
    	 WebElement NoBTNEle4=driver.findElement(By.xpath("(//button[@type='button'])[19]"));
    	String Value= NoBTNEle4.getAttribute("aria-pressed");
      	 if(Value.equalsIgnoreCase("true")) {
      		 TestUtil.verifybgColor(NoBTNEle4, driver);
      		 
      		 CustomListner.test.log(LogStatus.INFO, "Successfully Display NO Button Click By Default");
      	 }else {
      		 CustomListner.test.log(LogStatus.INFO, "NO Button  Is Not Display");
      	 }  
      
    }catch(NoSuchElementException e) {
        
   	 CustomListner.test.log(LogStatus.FAIL, "No Button is Not Display..");
   	
   }
  	
  }
//===========================================================================================================================================================================


public void VerifyListOfAllFieldsDisplayweb(String val) throws InterruptedException {
	
    try {
    	WebElement Selectele=driver.findElement(By.xpath("//div[contains(text(),'"+val+"')]"));
        wait.waitForElementToBeVisibleweb(driver, Selectele, 20,"Element is not Display");
        if(val.equals("Ms.")) {
            val=	val.toUpperCase();
         }
        if(val.equals("female")) {
        val=	val.toUpperCase();
        }
         String getValue=  Selectele.getText();
        if(getValue.contains(val)) {
      	  TestUtil.verifybgColor(Selectele, driver);
      	  CustomListner.test.log(LogStatus.INFO, "Successfully verified=====>"+val);
        }else {
      	  CustomListner.test.log(LogStatus.FAIL, "Failed to Verified=====>"+val);
        }
      
    	
    }catch(NoSuchElementException e) {
    	
        CustomListner.test.log(LogStatus.FAIL, "Unable to Locate Element..Failed to Verified=====>"+val);
    	
    }
   
}

public void VerifyHaveYouPeronallyMetFieldsDisplayweb() throws InterruptedException {
	
 try {
 	WebElement NoEle=driver.findElement(By.xpath("(//button[contains(@name,'6000')])[2]"));
 	WebElement YesEle=driver.findElement(By.xpath("(//button[contains(@name,'6000')])[1]"));
    
    if(YesEle.isDisplayed()) {
    	 TestUtil.verifybgColor(YesEle, driver);
     	 CustomListner.test.log(LogStatus.INFO, "Successfully verified Have you personally met the life to be insured for this application?=====>Yes Button");
    }else {
    	 CustomListner.test.log(LogStatus.FAIL, "Failed verified Have you personally met the life to be insured for this application?=====>Yes Button");
    }
    if(NoEle.isDisplayed()) {
   	 TestUtil.verifybgColor(NoEle, driver);
    	 CustomListner.test.log(LogStatus.INFO, "Successfully verified Have you personally met the life to be insured for this application?=====>No Button");
   }else {
   	 CustomListner.test.log(LogStatus.FAIL, "Failed verified Have you personally met the life to be insured for this application?=====>No Button");
   }
    
   
 	
 }catch(NoSuchElementException e) {
 	
     CustomListner.test.log(LogStatus.FAIL, "Unable to Locate Element..Failed to Verified Yes And No Button");
 	
 }  
}
public void VerifyHaveYouPeronallySatisfiedFieldsDisplayweb() throws InterruptedException {
 	
 try {
 	WebElement YesEle=driver.findElement(By.xpath("(//button[contains(@name,'6001')])[1]"));
 	WebElement NoEle=driver.findElement(By.xpath("(//button[contains(@name,'6001')])[2]"));
    
    if(YesEle.isDisplayed()) {
    	 TestUtil.verifybgColor(YesEle, driver);
     	 CustomListner.test.log(LogStatus.INFO, "Successfully verified Are you personally satisfied about the financial standing and insurability of the life to be insured / proposer?=====>Yes Button");
    }else {
    	 CustomListner.test.log(LogStatus.FAIL, "Failed verified Are you personally satisfied about the financial standing and insurability of the life to be insured / proposer?=====>Yes Button");
    }
    if(NoEle.isDisplayed()) {
   	 TestUtil.verifybgColor(NoEle, driver);
    	 CustomListner.test.log(LogStatus.INFO, "Successfully verified Are you personally satisfied about the financial standing and insurability of the life to be insured / proposer?=====>No Button");
   }else {
   	 CustomListner.test.log(LogStatus.FAIL, "Failed verified Are you personally satisfied about the financial standing and insurability of the life to be insured / proposer?=====>No Button");
   }
    	
 }catch(NoSuchElementException e) {
 	
     CustomListner.test.log(LogStatus.FAIL, "Unable to Locate Element..Failed to Verified Yes And No Button");
 	
 } 
} 
public void ClickOnOtherHowDoyouKnowweb() throws InterruptedException {
 	
 
 	WebElement YesEle=driver.findElement(By.xpath("//div[contains(text(),'Others')]"));
 	        
    if(YesEle.isDisplayed()) {
    	YesEle.click();
     	 CustomListner.test.log(LogStatus.INFO, "Click on Other Button");
    }else {
    	 CustomListner.test.log(LogStatus.FAIL, "Other button is Not Display");
    }
 
} 
public void EnterOtherHowDoyouKnowweb(String val) throws InterruptedException {
 	
 
	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@placeholder,'Please specify')]"));
	        
 if(OtherEle.isDisplayed()) {
	 OtherEle.sendKeys(val);
  	 CustomListner.test.log(LogStatus.INFO, "Enter Other Field As=====>"+val);
 }else {
 	 CustomListner.test.log(LogStatus.FAIL, "Failed to verified other Field");
 }

} 

}