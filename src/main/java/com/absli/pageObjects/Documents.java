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

public class Documents {
	
	
	
	public WebDriver driver;
    public AndroidDriver driver1;
    public WaitUtils wait;
    public ApiData api;
    public TestUtil testUtil;
   

    // Initializing the Page Objects:
    public Documents(AndroidDriver driver1) {
        this.driver1 = driver1;
        wait=new WaitUtils();
        api = new ApiData();
        testUtil = new TestUtil();
    }
    public Documents(WebDriver driver) {
        this.driver = driver;
        wait=new WaitUtils();
        api = new ApiData();
        testUtil = new TestUtil();
    }
    
    
    public void VerifyIdentityProofweb() throws InterruptedException {
        WebElement identityBTN=driver.findElement(By.xpath("//span[contains(text(),'Identity Proof')]"));
        wait.waitForElementToBeVisibleweb(driver, identityBTN, 20, "Element is Not Display");
        if(identityBTN.isDisplayed()) {
        	TestUtil.verifybgColor(identityBTN, driver);
            CustomListner.test.log(LogStatus.INFO, "Identity Proof Tile is Display ");
        }else {
        	CustomListner.test.log(LogStatus.INFO, "Identity Proof Tile is not display ");
        }
    }
    public void clickOnIdentityTileweb() throws InterruptedException {
        WebElement identityBTN=driver.findElement(By.xpath("//span[contains(text(),'Identity Proof')]"));
        wait.waitForElementToBeVisibleweb(driver, identityBTN, 20, "Element is Not Display");
        if(identityBTN.isDisplayed()) {
        	identityBTN.click();
            CustomListner.test.log(LogStatus.INFO, "Click On Identity Proof Tile ");
        }else {
        	CustomListner.test.log(LogStatus.INFO, "Identity Proof Tile is not display ");
        }
    }
    public void VerifyAddressProofTileweb() throws InterruptedException {
        WebElement identityBTN=driver.findElement(By.xpath("//span[contains(text(),'Address Proof')]"));
        wait.waitForElementToBeVisibleweb(driver, identityBTN, 20, "Element is Not Display");
        if(identityBTN.isDisplayed()) {
        	TestUtil.verifybgColor(identityBTN, driver);
        	Assert.assertTrue(identityBTN.isDisplayed(),"Failed To Display Address Proof Tile ");
            CustomListner.test.log(LogStatus.INFO, "Successfully Display Address Proof Tile ");
        }else {
        	CustomListner.test.log(LogStatus.INFO, "Failed To Display Address Proof Tile ");
        }
    }
    public void VerifyMandatoryField() throws InterruptedException {
        WebElement mandatoryBTN=driver.findElement(By.xpath("//span[text()='*']"));
        wait.waitForElementToBeVisibleweb(driver, mandatoryBTN, 20, "Element is Not Display");
        if(mandatoryBTN.isDisplayed()) {
        	TestUtil.verifybgColor(mandatoryBTN, driver);
        	Assert.assertTrue(mandatoryBTN.isDisplayed(),"Failed To Display Mandatory Field(*) ");
            CustomListner.test.log(LogStatus.INFO, "Successfully Display Mandatory Field(*)");
        }else {
        	CustomListner.test.log(LogStatus.INFO, "Failed To Display Mandatory Field(*) ");
        }
    }
    public void AgeProofTileDisplay() throws InterruptedException {
        WebElement mandatoryBTN=driver.findElement(By.xpath("//span[contains(text(),'Age Proof')]"));
        wait.waitForElementToBeVisibleweb(driver, mandatoryBTN, 20, "Element is Not Display");
        if(mandatoryBTN.isDisplayed()) {
        	TestUtil.verifyRedbgColor(mandatoryBTN, driver);
        	Assert.assertTrue(mandatoryBTN.isDisplayed(),"Failed To Display Age Proof Tile ");
            CustomListner.test.log(LogStatus.INFO, "Successfully Display Age Proof Tile");
        }else {
        	CustomListner.test.log(LogStatus.INFO, "Failed To Display Age Proof Tile ");
        }
    }
    public void clickOnNEXTButtonweb() throws InterruptedException {
        WebElement NEXTBTN=driver.findElement(By.xpath("//span[contains(text(),'NEXT')]"));
        wait.waitForElementToBeVisibleweb(driver, NEXTBTN, 20, "Element is Not Display");
        if(NEXTBTN.isDisplayed()) {
        	NEXTBTN.click();
            CustomListner.test.log(LogStatus.INFO, "Click On Next Button ");
        }else {
        	CustomListner.test.log(LogStatus.INFO, "Next Button  is not display ");
        }
    }
	
    public void VerifyAlertPopUpweb() throws InterruptedException {
        WebElement AlertPopUpBTN=driver.findElement(By.xpath("//p[contains(text(),'Identity Proof is Mandatory')]"));
        wait.waitForElementToBeVisibleweb(driver, AlertPopUpBTN, 20, "Element is Not Display");
        if(AlertPopUpBTN.isDisplayed()) {
        	TestUtil.verifybgColor(AlertPopUpBTN, driver);
        	Assert.assertTrue(AlertPopUpBTN.isDisplayed(),"failed to Display Identity Proof is Mandatory Alert MSG");
            CustomListner.test.log(LogStatus.INFO, "Successfully Display Identity Proof is Mandatory Alert MSG");
        }else {
        	CustomListner.test.log(LogStatus.INFO, "failed to Display Identity Proof is Mandatory Alert MSG");
        }
    }
    public void VerifyAgeProofAlertPopUpweb() throws InterruptedException {
        WebElement AlertPopUpBTN=driver.findElement(By.xpath("//p[contains(text(),'Age Proof is Mandatory')]"));
        wait.waitForElementToBeVisibleweb(driver, AlertPopUpBTN, 20, "Element is Not Display");
        if(AlertPopUpBTN.isDisplayed()) {
        	TestUtil.verifybgColor(AlertPopUpBTN, driver);
        	Assert.assertTrue(AlertPopUpBTN.isDisplayed(),"failed to Display Identity Proof is Mandatory Alert MSG");
            CustomListner.test.log(LogStatus.INFO, "Successfully Display Identity Proof is Mandatory Alert MSG");
        }else {
        	CustomListner.test.log(LogStatus.INFO, "failed to Display Identity Proof is Mandatory Alert MSG");
        }
    }
    public void ClickOnAlertPopUpOKBTNweb() throws InterruptedException {
        WebElement AlertOKBTN=driver.findElement(By.xpath("//span[contains(text(),'OK')]"));
        wait.waitForElementToBeVisibleweb(driver, AlertOKBTN, 20, "Element is Not Display");
        if(AlertOKBTN.isDisplayed()) {
        	AlertOKBTN.click();
            CustomListner.test.log(LogStatus.INFO, "Click On OK Button");
        }else {
        	CustomListner.test.log(LogStatus.INFO, "OK Button is not Display");
        }
    }
    public void VerifyWrongAlertPopUpweb() throws InterruptedException {
        WebElement AlertPopUpBTN=driver.findElement(By.xpath("//p[contains(text(),'Only .jpg,.jpeg,.pdf Format is allowed')]"));
        wait.waitForElementToBeVisibleweb(driver, AlertPopUpBTN, 20, "Element is Not Display");
        if(AlertPopUpBTN.isDisplayed()) {
        	TestUtil.verifybgColor(AlertPopUpBTN, driver);
        	Assert.assertTrue(AlertPopUpBTN.isDisplayed(),"failed to Display Only .jpg,.jpeg,.pdf Format is allowed Alert MSG");
            CustomListner.test.log(LogStatus.INFO, "Successfully Display Only .jpg,.jpeg,.pdf Format is allowed Alert MSG");
        }else {
        	CustomListner.test.log(LogStatus.INFO, "failed to Display Only .jpg,.jpeg,.pdf Format is allowed Alert MSG");
        }
    }
    public void VerifyMaxAlertPopUpweb() throws InterruptedException {
        WebElement AlertPopUpBTN=driver.findElement(By.xpath("//p[contains(text(),'Max file size is 5MB.')]"));
        wait.waitForElementToBeVisibleweb(driver, AlertPopUpBTN, 20, "Element is Not Display");
        if(AlertPopUpBTN.isDisplayed()) {
        	TestUtil.verifybgColor(AlertPopUpBTN, driver);
        	Assert.assertTrue(AlertPopUpBTN.isDisplayed(),"failed to Display Max file size is 5MB.  Alert MSG");
            CustomListner.test.log(LogStatus.INFO, "Successfully Display Max file size is 5MB. Alert MSG");
        }else {
        	CustomListner.test.log(LogStatus.INFO, "failed to Display Max file size is 5MB. Alert MSG");
        }
    }
   
  
  
	public void SelectTypeOfDocumentweb(String val) throws InterruptedException {
		WebElement SelectType = driver.findElement(By.xpath("//div[@aria-haspopup='listbox']"));
		wait.waitforElementToBeClickable(driver, SelectType, 20);
		SelectType.click();
		Thread.sleep(1000);
		CustomListner.test.log(LogStatus.INFO, "Click On Select Type of document DropDown");

		if (val.contains("Aadhaar Card")) {
			WebElement SelectVal = driver.findElement(By.xpath("//ul//li//span[contains(text(),'Aadhaar Card')]"));
			wait.waitforElementToBeClickable(driver, SelectVal, 20);
			SelectVal.click();
			CustomListner.test.log(LogStatus.INFO, "Select Values As=====>" + val);
		} else {
			CustomListner.test.log(LogStatus.INFO, val + " is not Display");
		}

	}
	public void SelectTypeOfDocumentIncomePrrofweb(String val) throws InterruptedException {
		WebElement SelectType = driver.findElement(By.xpath("//div[@aria-haspopup='listbox']"));
		wait.waitforElementToBeClickable(driver, SelectType, 20);
		SelectType.click();
		CustomListner.test.log(LogStatus.INFO, "Click On Select Type of document DropDown");

		if (val.contains("Audited Business financial")) {
			WebElement SelectVal = driver.findElement(By.xpath("//ul//li//span[contains(text(),'Audited Business financial')]"));
			wait.waitforElementToBeClickable(driver, SelectVal, 20);
			SelectVal.click();
			CustomListner.test.log(LogStatus.INFO, "Select Values As=====>" + val);
		} else {
			CustomListner.test.log(LogStatus.INFO, val + " is not Display");
		}

	}
    public void SelectTypeOfDocumentAgeProofweb(String val) throws InterruptedException {
        WebElement SelectType=driver.findElement(By.xpath("//div[@aria-haspopup='listbox']"));
        wait.waitforElementToBeClickable(driver, SelectType, 20);
        SelectType.click();
        CustomListner.test.log(LogStatus.INFO, "Click On Select Type of document DropDown");
       
        if(val.contains("Aadhaar Card")) {
        	 WebElement SelectVal=driver.findElement(By.xpath("//ul//li//span[contains(text(),'Aadhar card')]"));
        	 wait.waitforElementToBeClickable(driver, SelectVal, 20);
        	 SelectVal.click();
            CustomListner.test.log(LogStatus.INFO, "Select Values As=====>"+val);
        }else {
        	CustomListner.test.log(LogStatus.INFO, val+" is not Display");
        }
    }
    public void VerifyListOfDocumentDisplayweb(String val) throws InterruptedException {
    	
        try {
        	WebElement Selectele=driver.findElement(By.xpath("//ul//li/span[contains(text(),'"+val+"')]"));
            wait.waitforElementToBeClickable(driver, Selectele, 20);
            
             String getValue=  Selectele.getText();
           // val= val.replaceAll("\\s+$", "");
            if(getValue.contains(val)) {
          	  TestUtil.verifybgColor(Selectele, driver);
          	  CustomListner.test.log(LogStatus.INFO, "Successfully verified=====>"+val);
            }else {
          	  CustomListner.test.log(LogStatus.INFO, "Failed to Verified=====>"+val);
            }
          
        	
        }catch(NoSuchElementException e) {
        	
            CustomListner.test.log(LogStatus.FAIL, "Unable to Locate Element..Failed to Verified=====>"+val);
        	
        }
    	
       
    }
    
    public void UploadFileweb() throws InterruptedException {
     
    	 WebElement SelectVal=driver.findElement(By.xpath("//input[@type='file']"));
    	 wait.waitForElementToBeVisibleweb(driver, SelectVal, 20, "Element is Not Display");
    	 String destination= System.getProperty("user.dir")+"/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
    	 if(SelectVal.isDisplayed()) {
    		 SelectVal.sendKeys(destination);
    		 CustomListner.test.log(LogStatus.INFO, "Successfully Uploaded File");
    	 }else {
    		 SelectVal.sendKeys(destination);
    		 CustomListner.test.log(LogStatus.INFO, "Successfully Uploaded File");
    	 }
        
       
    }
    public void UploadNonMedicalIncomeProofweb() throws InterruptedException {
        
      	 WebElement SelectVal=driver.findElement(By.xpath("(//input[@type='file'])[1]"));
      	 wait.waitForElementToBeVisibleweb(driver, SelectVal, 20, "Element is Not Display");
      	 String destination= System.getProperty("user.dir")+"/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
      	 if(SelectVal.isDisplayed()) {
      		 SelectVal.sendKeys(destination);
      		 CustomListner.test.log(LogStatus.INFO, "Successfully Uploaded NEFT Cancelled Cheque File");
      	 }else {
      		 SelectVal.sendKeys(destination);
      		 CustomListner.test.log(LogStatus.INFO, "Successfully Uploaded NEFT Cancelled Cheque File");
      	 }
          
         
      }
    public void UploadNonMedicalNEFTCancelweb() throws InterruptedException {
        
   	 WebElement SelectVal=driver.findElement(By.xpath("(//input[@type='file'])[2]"));
   	 wait.waitForElementToBeVisibleweb(driver, SelectVal, 0, "Element is not Display");
   	 String destination= System.getProperty("user.dir")+"/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
   	 if(SelectVal.isDisplayed()) {
   		 SelectVal.sendKeys(destination);
   		 CustomListner.test.log(LogStatus.INFO, "Successfully Uploaded NEFT Cancelled Cheque File");
   	 }else {
   		 SelectVal.sendKeys(destination);
   		 CustomListner.test.log(LogStatus.INFO, "Successfully Uploaded NEFT Cancelled Cheque File");
   	 }
       
      
   }
    public void UploadNonMedicalPHOTOGRAPHweb() throws InterruptedException {
        
      	 WebElement SelectVal=driver.findElement(By.xpath("(//input[@type='file'])[3]"));
      	wait.waitForElementToBeVisibleweb(driver, SelectVal, 0, "Element is not Display");
      	String destination= System.getProperty("user.dir")+"/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
      	 if(SelectVal.isDisplayed()) {
      		 SelectVal.sendKeys(destination);
      		 CustomListner.test.log(LogStatus.INFO, "Successfully Uploaded PHOTOGRAPH File");
      	 }else {
      		 SelectVal.sendKeys(destination);
      		 CustomListner.test.log(LogStatus.INFO, "Successfully Uploaded PHOTOGRAPH File");
      	 }
          
         
      }
    public void UploadUpto11Documentweb() throws InterruptedException {
      
   
   		 WebElement SelectVal=driver.findElement(By.xpath("//input[@type='file']"));
   		 wait.waitForElementToBeVisibleweb(driver, SelectVal, 20, "Element is Not Display");
   		 String destination= System.getProperty("user.dir")+"/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
   	   	 SelectVal.sendKeys(destination+" \n "+destination+" \n "+destination+" \n "+destination+" \n "+destination+" \n "+destination+" \n "+destination+" \n "+destination+" \n "+
   	   		destination+" \n "+destination+" \n "+destination);
   	     
   	   
   		 CustomListner.test.log(LogStatus.INFO, "You uploaded More Than 10 file In Document");
   	
       
      
   }
    public void UploadUpto6Documentweb() throws InterruptedException {
        
    	   
  		 WebElement SelectVal=driver.findElement(By.xpath("(//input[@type='file'])[2]"));
  		 wait.waitForElementToBeVisibleweb(driver, SelectVal, 20, "Element is Not Display");
  		 String destination= System.getProperty("user.dir")+"/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
  	   	 SelectVal.sendKeys(destination+" \n "+destination+" \n "+destination+" \n "+destination+" \n "+destination+" \n "+destination);
  	     
  	   
  		 CustomListner.test.log(LogStatus.INFO, "You uploaded More Than 5 file In Document");
  	
      
     
  }
    public void UploadUpto5Documentweb() throws InterruptedException {
        
 	   
 		 WebElement SelectVal=driver.findElement(By.xpath("(//input[@type='file'])[2]"));
 		 wait.waitForElementToBeVisibleweb(driver, SelectVal, 20, "Element is Not Display");
 		 String destination= System.getProperty("user.dir")+"/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
 	   	 SelectVal.sendKeys(destination+" \n "+destination+" \n "+destination+" \n "+destination+" \n "+destination);
 	     
 	   
 		 CustomListner.test.log(LogStatus.INFO, "You uploaded Upto 5 file In Document");
 	
     
    
 }
    public void UploadUpto10Documentweb() throws InterruptedException {
        
    	   
  		 WebElement SelectVal=driver.findElement(By.xpath("//input[@type='file']"));
  		 wait.waitForElementToBeVisibleweb(driver, SelectVal, 20, "Element is Not Display");
  		 String destination= System.getProperty("user.dir")+"/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
  	   	 SelectVal.sendKeys(destination+" \n "+destination+" \n "+destination+" \n "+destination+" \n "+destination+" \n "+destination+" \n "+destination+" \n "+destination+" \n "+
  	   	   		destination+" \n "+destination);
  	     
  	   
  		 CustomListner.test.log(LogStatus.INFO, "You uploaded 10 File in Document");
  	
      
     
  }
    public void FileDisplayweb() throws InterruptedException {
        
   	 WebElement FileDisplayele=driver.findElement(By.xpath("(//div[@class='image-size display-flex mar-top-10'])[1]"));
   	 wait.waitForElementToBeVisibleweb(driver, FileDisplayele, 20, "Element is Not Display");
   	 if(FileDisplayele.isDisplayed()) {
   		 TestUtil.verifybgColor(FileDisplayele, driver);
   		 Assert.assertTrue(FileDisplayele.isDisplayed(),"Failed to Display Uploaded File");
   		 CustomListner.test.log(LogStatus.INFO, "Successfully Display Uploaded File");
   	 }else {
   		 CustomListner.test.log(LogStatus.INFO, "Failed to Display Uploaded File");
   	 }
       
      
   }
    public void AgeProofDisplayToBeInsuredweb() throws InterruptedException {
        
      	 WebElement FileDisplayele=driver.findElement(By.xpath("//div[contains(text(),'TO BE INSURED')]"));
      	 wait.waitForElementToBeVisibleweb(driver, FileDisplayele, 20, "Element is Not Display");
      	 if(FileDisplayele.isDisplayed()) {
      		 TestUtil.verifybgColor(FileDisplayele, driver);
      		 Assert.assertTrue(FileDisplayele.isDisplayed(),"Failed to Display TO BE INSURED Text");
      		 CustomListner.test.log(LogStatus.INFO, "Successfully Display TO BE INSURED Text");
      	 }else {
      		 CustomListner.test.log(LogStatus.INFO, "Failed to Display TO BE INSURED Text");
      	 }   
      }
    public void VerifyUpto11DocumentUploadweb() throws InterruptedException {
        
      	 WebElement upto10ele=driver.findElement(By.xpath("//p[contains(text(),'Upload upto 10 documents in JPG, JPEG, PDF formats only')]"));
      	 wait.waitForElementToBeVisibleweb(driver, upto10ele, 20, "Element is Not Display");
      	 if(upto10ele.isDisplayed()) {
      		 TestUtil.verifybgColor(upto10ele, driver);
      		 Assert.assertTrue(upto10ele.isDisplayed(),"Failed to Display Upto 10 Document Alert MSG");
      		 CustomListner.test.log(LogStatus.INFO, "Successfully Display Upload upto 10 documents in JPG, JPEG, PDF formats only Alert MSG");
      	 }else {
      		 CustomListner.test.log(LogStatus.INFO, "Failed to Display Upto 10 Document Alert MSG");
      	 }
          
         
      }
    public void VerifyUpto6DocumentUploadweb() throws InterruptedException {
        
     	 WebElement upto10ele=driver.findElement(By.xpath("//p[contains(text(),'Upload upto 10 documents in JPG, JPEG, PDF formats only')]"));
     	 wait.waitForElementToBeVisibleweb(driver, upto10ele, 20, "Element is Not Display");
     	 if(upto10ele.isDisplayed()) {
     		 TestUtil.verifybgColor(upto10ele, driver);
     		 Assert.assertTrue(upto10ele.isDisplayed(),"Failed to Display Upto 10 Document Alert MSG");
     		 CustomListner.test.log(LogStatus.INFO, "Successfully Display Upload upto 10 documents in JPG, JPEG, PDF formats only Alert MSG");
     	 }else {
     		 CustomListner.test.log(LogStatus.INFO, "Failed to Display Upto 10 Document Alert MSG");
     	 }
         
        
     }
    public void UploadWrongFileFormateweb() throws InterruptedException {
        
   	 WebElement SelectwrongVal=driver.findElement(By.xpath("//input[@type='file']"));
   	 wait.waitForElementToBeVisibleweb(driver, SelectwrongVal, 20, "Element is Not Display");
   	String destination= System.getProperty("user.dir")+"/FileUpload/TestData_payment.xlsx";
   	 if(SelectwrongVal.isDisplayed()) { 
   		 SelectwrongVal.sendKeys(destination);
   		 CustomListner.test.log(LogStatus.INFO, "Successfully validate Wrong File Formate");
   	 }else { 
   		SelectwrongVal.sendKeys(destination);
   		// CustomListner.test.log(LogStatus.INFO, "Failed to upload file...Upload Button is not Display");
   	     CustomListner.test.log(LogStatus.INFO, "Successfully validate Wrong File Formate");

   	 }
       
      
   }
  
    public void UploadWrongFileFormateNonMedicalweb() throws InterruptedException {
        
      	 WebElement SelectwrongVal=driver.findElement(By.xpath("(//input[@type='file'])[2]"));
      	 wait.waitForElementToBeVisibleweb(driver, SelectwrongVal, 20, "Element is Not Display");
     	String destination= System.getProperty("user.dir")+"/FileUpload/TestData_payment.xlsx";
      	 if(SelectwrongVal.isDisplayed()) { 
      		 SelectwrongVal.sendKeys(destination);
      		 CustomListner.test.log(LogStatus.INFO, "Successfully validate Wrong File Formate");
      	 }else { 
      		SelectwrongVal.sendKeys(destination);
      		// CustomListner.test.log(LogStatus.INFO, "Failed to upload file...Upload Button is not Display");
      	     CustomListner.test.log(LogStatus.INFO, "Successfully validate Wrong File Formate");

      	 }
          
         
      }
    public void UploadMAXFileSizeweb() throws InterruptedException {
        
      	 WebElement SelectwrongVal=driver.findElement(By.xpath("//input[@type='file']"));
      	 wait.waitForElementToBeVisibleweb(driver, SelectwrongVal, 20, "Element is Not Display");
      	String destination= System.getProperty("user.dir")+"/FileUpload/OBPACMB001S.pdf";
      	 if(SelectwrongVal.isDisplayed()) { 
      		 SelectwrongVal.sendKeys(destination);
      		 CustomListner.test.log(LogStatus.INFO, "Successfully validate Max File Size Alert MSG");
      	 }else { 
      		SelectwrongVal.sendKeys(destination);
      		// CustomListner.test.log(LogStatus.INFO, "Failed to upload file...Upload Button is not Display");
      	     CustomListner.test.log(LogStatus.INFO, "Successfully validate Max File Size Alert MSG");

      	 }
          
         
      }
    public void UploadNonMedicalMAXFileSizeweb() throws InterruptedException {
        
     	 WebElement SelectwrongVal=driver.findElement(By.xpath("(//input[@type='file'])[2]"));
     	 wait.waitForElementToBeVisibleweb(driver, SelectwrongVal, 20, "Element is Not Display");
     	String destination= System.getProperty("user.dir")+"/FileUpload/OBPACMB001S.pdf";
     	 if(SelectwrongVal.isDisplayed()) { 
     		 SelectwrongVal.sendKeys(destination);
     		 CustomListner.test.log(LogStatus.INFO, "Successfully validate Max File Size Alert MSG");
     	 }else { 
     		SelectwrongVal.sendKeys(destination);
     		// CustomListner.test.log(LogStatus.INFO, "Failed to upload file...Upload Button is not Display");
     	     CustomListner.test.log(LogStatus.INFO, "Successfully validate Max File Size Alert MSG");

     	 }  
     }
    public void VerifyTobeInsuredweb() throws InterruptedException {
        
      	 WebElement FileDisplayele=driver.findElement(By.xpath("//div[contains(text(),'TO BE INSURED')]"));
      	 wait.waitForElementToBeVisibleweb(driver, FileDisplayele, 20, "Element is Not Display");
      	 if(FileDisplayele.isDisplayed()) {
      		 TestUtil.verifybgColor(FileDisplayele, driver);
      		 Assert.assertTrue(FileDisplayele.isDisplayed(),"Failed to Display TO BE INSURED Text");
      		 CustomListner.test.log(LogStatus.INFO, "Successfully Display TO BE INSURED Text");
      	 }else {
      		 CustomListner.test.log(LogStatus.INFO, "Failed to Display TO BE INSURED Text");
      	 }  
      }
    public void VerifyMedicalTileweb() throws InterruptedException {
        try {
        	 WebElement FileDisplayele=driver.findElement(By.xpath("(//span[contains(text(),'Medical Requirements')])[2]"));
        	 wait.waitForElementToBeVisibleweb(driver, FileDisplayele, 20, "Element is Not Display");
        	 if(FileDisplayele.isDisplayed()) {
         		 TestUtil.verifybgColor(FileDisplayele, driver);
         		 Assert.assertTrue(FileDisplayele.isDisplayed(),"Failed to Display Medical Requirements Tile");
         		 CustomListner.test.log(LogStatus.INFO, "Successfully Display Medical Requirements Tile");
         	 }else {
         		 CustomListner.test.log(LogStatus.INFO, "Failed to Display Medical Requirements Tile");
         	 }  
        }catch(NoSuchElementException e) {
            
       	 CustomListner.test.log(LogStatus.FAIL, "Element is Not Display..Failed to Verified Medical Requirements");
       	
       }
     	
     }
    public void VerifyoldMedicalReportweb() throws InterruptedException {
        try {
        	 WebElement FileDisplayele=driver.findElement(By.xpath("//div[contains(text(),'Old Medical Reports')]"));
        	 wait.waitForElementToBeVisibleweb(driver, FileDisplayele, 20, "Element is Not Display");
        	 if(FileDisplayele.isDisplayed()) {
        		 TestUtil.verifybgColor(FileDisplayele, driver);
        		 Assert.assertTrue(FileDisplayele.isDisplayed(),"Failed to Display Old Medical Reports Text");
        		 CustomListner.test.log(LogStatus.INFO, "Successfully Display Old Medical Reports Text");
        	 }else {
        		 CustomListner.test.log(LogStatus.INFO, "Failed to Display Old Medical Reports Text");
        	 }  
        }catch(NoSuchElementException e) {
            
       	 CustomListner.test.log(LogStatus.FAIL, "Element is Not Display..Failed to Verified Old Medical Reports");
       	
       }
    	
    }
    public void VerifyoldMedicalDocumentRequiredweb() throws InterruptedException {
        try {
        	 WebElement FileDisplayele=driver.findElement(By.xpath("//p[contains(text(),'Medical Documents Required')]"));
        	 wait.waitForElementToBeVisibleweb(driver, FileDisplayele, 20, "Element is Not Display");
           	 if(FileDisplayele.isDisplayed()) {
           		 TestUtil.verifybgColor(FileDisplayele, driver);
           		 Assert.assertTrue(FileDisplayele.isDisplayed(),"Failed to Display Medical Documents Required Text");
           		 CustomListner.test.log(LogStatus.INFO, "Successfully Display Medical Documents Required Text");
           	 }else {
           		 CustomListner.test.log(LogStatus.INFO, "Failed to Display Medical Documents Required Text");
           	 }  
        }catch(NoSuchElementException e) {
            
       	 CustomListner.test.log(LogStatus.FAIL, "Element is Not Display..Failed to Verified Medical Documents Required");
       	
       }
   	
   }
    public void VerifyFormateTextDisplayweb() throws InterruptedException {
        try {
        	 WebElement FileDisplayele=driver.findElement(By.xpath("//p[contains(text(),'Formats JPG,JPEG,PDF')]"));
        	 wait.waitForElementToBeVisibleweb(driver, FileDisplayele, 20, "Element is Not Display");
          	 if(FileDisplayele.isDisplayed()) {
          		 TestUtil.verifybgColor(FileDisplayele, driver);
          		 Assert.assertTrue(FileDisplayele.isDisplayed(),"Failed to Display Formats JPG,JPEG,PDF Text");
          		 CustomListner.test.log(LogStatus.INFO, "Successfully Display Formats JPG,JPEG,PDF Text");
          	 }else {
          		 CustomListner.test.log(LogStatus.INFO, "Failed to Display Formats JPG,JPEG,PDF Text");
          	 }  
        }catch(NoSuchElementException e) {
            
       	 CustomListner.test.log(LogStatus.FAIL, "Element is Not Display..Failed to Verified Formats JPG,JPEG,PDF");
       	
       }
      	
      }
    public void ClickOnDownloadFileweb() throws InterruptedException {
        
     	 WebElement FileDisplayele=driver.findElement(By.xpath("(//div[@class='image-size display-flex mar-top-10'])[1]"));
     	 wait.waitForElementToBeVisibleweb(driver, FileDisplayele, 20, "Element is Not Display");
     	 if(FileDisplayele.isDisplayed()) {
     		FileDisplayele.click();
     		 CustomListner.test.log(LogStatus.INFO, "Click on Uploaded File");
     	 }else {
     		 CustomListner.test.log(LogStatus.INFO, "Failed To Display Uploaded File");
     	 }  
     }
    public void ClickOnDeleteBTNweb() throws InterruptedException {
        
    	 WebElement FileDisplayele=driver.findElement(By.xpath("//img[@alt='delete']"));
    	 wait.waitForElementToBeVisibleweb(driver, FileDisplayele, 20, "Element is Not Display");
    	 if(FileDisplayele.isDisplayed()) {
    		FileDisplayele.click();
    		 CustomListner.test.log(LogStatus.INFO, "Click on Delete  Button");
    	 }else {
    		 CustomListner.test.log(LogStatus.INFO, "Failed To Display Delete Button");
    	 }  
    }
    public void ClickOnDeleteAreYouSureAlertYesBtnweb() throws InterruptedException {
        
   	 WebElement FileDisplayele=driver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
   	 wait.waitForElementToBeVisibleweb(driver, FileDisplayele, 20, "Element is Not Display");
   	 if(FileDisplayele.isDisplayed()) {
   		FileDisplayele.click();
   		 CustomListner.test.log(LogStatus.INFO, "Click on Are You Sure Alert Yes  Button");
   	 }else {
   		 CustomListner.test.log(LogStatus.INFO, "Failed To Display Are You Sure Alert Yes  Button");
   	 }  
   }
    public void VerifyDeleteAreYouSureAlertTextweb() throws InterruptedException {
        
      	 WebElement FileDisplayele=driver.findElement(By.xpath("//div[contains(text(),'Are you sure you want to remove this file?')]"));
      	 wait.waitForElementToBeVisibleweb(driver, FileDisplayele, 20, "Element is Not Display");
      	 if(FileDisplayele.isDisplayed()) {
      		TestUtil.verifybgColor(FileDisplayele, driver);
     		 Assert.assertTrue(FileDisplayele.isDisplayed(),"Failed to Display Are you sure you want to remove this file? Text");
      		 CustomListner.test.log(LogStatus.INFO, "Successfully Verfied Are you sure you want to remove this file? Text");
      	 }else {
      		 CustomListner.test.log(LogStatus.INFO, "Failed to Display Are you sure you want to remove this file? Text");
      	 }  
      }
}
