package com.absli.pageObjects;

import java.util.*;
import com.absli.Listner.CustomListner;
import com.absli.utils.WaitUtils;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddressPage {

    public WebDriver driver;
    public AndroidDriver driver1;
    public IOSDriver driver2;
    public WaitUtils waitUtils;
    LoginPage loginPage;
    Dashboard dashboard;
    CustomerProfile customerProfile;

    // Initializing the Page Objects:
    public AddressPage (AndroidDriver driver1) {
        this.driver1 = driver1;
        waitUtils = new WaitUtils();
    }

    public AddressPage (WebDriver driver) {
        this.driver = driver;
        waitUtils = new WaitUtils();
    }

    public AddressPage (IOSDriver driver) {
        this.driver2 = driver;
        waitUtils = new WaitUtils();
    }
    
    
    public void clickHamburger() {
		WebElement Hamburger = driver.findElement(By.xpath("//img[@class=\"hamburger-icon\"]"));
		if(Hamburger.isDisplayed()) {
        waitUtils.waitforElementToBeClickable(driver, Hamburger, 100);
        Hamburger.click();
		}
		else {
			System.out.println("DoItLaterBtn is not displayed");
		}
		CustomListner.test.log(LogStatus.INFO, "click on Do It Later Button");

	}
    
    public void clickAddressDropdownWeb() {
		WebElement AddressDropdown = driver.findElement(By.xpath("(//*[@id=\"addTypeID\"])[1]"));
		 waitUtils.waitforElementToBeClickable(driver,AddressDropdown,30);
		if(AddressDropdown.isDisplayed()) {
			
        waitUtils.waitforElementToBeClickable(driver, AddressDropdown, 100);
        AddressDropdown.click();
        CustomListner.test.log(LogStatus.INFO, "click on Address Dropdown");
		}
		else {
			System.out.println("Address Dropdown is not displayed");
			CustomListner.test.log(LogStatus.FAIL, "Address Dropdown is not displayed");
		}
		
		
		
    }
    
  
    public void selectAddressWeb(String args) {
    	WebElement  dropdownvalue = driver.findElement(By.xpath("//ul//li//span[contains(text(),'"+args+"')]"));
    	 waitUtils.waitforElementToBeClickable(driver,dropdownvalue,30);
    	String value= dropdownvalue.getText();
    	 if(value.equalsIgnoreCase(args)) {
    		 dropdownvalue.click();
    		 CustomListner.test.log(LogStatus.INFO, "Select Type Of Address Value As =====>"+args);
    	 }else {
    		 CustomListner.test.log(LogStatus.FAIL, "Type Of Address value is Not Display");
    	 }
    	
    	
    
      
    }
   
    
    public void enterPinWeb(String pinCode){
        WebElement  pinCodeInputWeb =driver.findElement(By.xpath("(//input[@name=\"pinCodeId\"])[1]"));
        waitUtils.waitforElementToBeClickable(driver,pinCodeInputWeb,100);
        if(pinCodeInputWeb.isDisplayed()){
        	pinCodeInputWeb.sendKeys(pinCode);
            CustomListner.test.log(LogStatus.INFO, "Enter Pincode  Value As =====>"+pinCode);
           }
        else {
        	CustomListner.test.log(LogStatus.FAIL, "pincide is not displayed");
        }
    }
    
    public void enterPinAndroid(String pinCode){
        WebElement  pinCodeInputWeb =driver1.findElement(By.xpath("//*[@text='Login ID/AD/ID']"));

        waitUtils.waitforElementToBeClickable(driver,pinCodeInputWeb,100);
        if(pinCodeInputWeb.isDisplayed()){
        	pinCodeInputWeb.sendKeys(pinCode);
            CustomListner.test.log(LogStatus.INFO, "Enter Pincode  Value As =====>"+pinCode);
           }
        else {
        	CustomListner.test.log(LogStatus.FAIL, "pincide is not displayed");
        }
    }
    
    public void enterPerAddPinCodeWeb(String pinCode2){
        WebElement  pinCodeInputWeb =driver.findElement(By.xpath("//input[@id=\"perAddPinId\"]"));
        waitUtils.waitforElementToBeClickable(driver,pinCodeInputWeb,100);
        if(pinCodeInputWeb.isDisplayed()){
        	pinCodeInputWeb.click();
        	pinCodeInputWeb.clear();
        	pinCodeInputWeb.sendKeys(pinCode2);
            CustomListner.test.log(LogStatus.INFO, "Enter Pincode  Value As =====>"+pinCode2);
           }
        else {
        	CustomListner.test.log(LogStatus.FAIL, "pincide is not displayed");
        }
    }
    
    
    public void greenTickWeb(){
        WebElement  tick =driver.findElement(By.xpath("(//img[@alt=\"endicon\"])[1]"));
        waitUtils.waitforElementToBeClickable(driver,tick,100);
        if(tick.isDisplayed()){
        CustomListner.test.log(LogStatus.INFO, "Green tick is autopopulated");
            }
        else {
        	CustomListner.test.log(LogStatus.FAIL, "Green tick is not autopopulated");
        }
    }
    
    public void cityNameAutopopulateWeb(){
        WebElement  cityName =driver.findElement(By.xpath("//input[@id=\"city\"]"));
        waitUtils.waitforElementToBeClickable(driver,cityName,100);
        if(cityName.isDisplayed()){
        CustomListner.test.log(LogStatus.INFO, "city name is autopopulated");
            }
        else {
        	CustomListner.test.log(LogStatus.FAIL, "city name is not autopopulated");
        }
    }
    
    
        public void validateAddressOneWeb(){
        WebElement  address1 =driver.findElement(By.xpath("//input[@id=\"add1Id\"]"));
        waitUtils.waitforElementToBeClickable(driver,address1,100);
        if(address1.isDisplayed()){
        CustomListner.test.log(LogStatus.INFO, "Address1 is displayed");
            }
        else {
        	CustomListner.test.log(LogStatus.FAIL, "Address1 is not displayed");
        }
        }
        
        public void validateAddressTwoWeb(){
            WebElement  address2 =driver.findElement(By.xpath("//input[@id=\"add2Id\"]"));
            waitUtils.waitforElementToBeClickable(driver,address2,100);
            if(address2.isDisplayed()){
            CustomListner.test.log(LogStatus.INFO, "Address2 is displayed");
                }
            else {
            	CustomListner.test.log(LogStatus.FAIL, "Address2 is not displayed");
            }
            
        }
        
        public void validateAddressThreeWeb(){
            WebElement  address3 =driver.findElement(By.xpath("//input[@id=\"add3Id\"]"));
            waitUtils.waitforElementToBeClickable(driver,address3,100);
            if(address3.isDisplayed()){
            CustomListner.test.log(LogStatus.INFO, "Address3 is displayed");
                }
            else {
            	CustomListner.test.log(LogStatus.FAIL, "Address3 is not displayed");
            }
            }
        
    
			public void validateErrorPinCodeWeb(String pinCode) {
				WebElement errorMsgPinCode = driver.findElement(By.xpath("(//p[@id=\"pinCodeId-helper-text\"])[1]"));
				if (errorMsgPinCode.isDisplayed()) {
					String error = errorMsgPinCode.getText();
					Assert.assertEquals(error, "Pincode / Zipcode should be 6 digit");
					CustomListner.test.log(LogStatus.INFO, "Validation error msg for pincode is displayed");
				} else {
					CustomListner.test.log(LogStatus.FAIL, "Validation error msg for pincode is Not displayed");
				}
			}
			 public void ClickOnAddressNextBTN() {
		    	  WebElement Btn = driver.findElement(By.xpath("//span[text()='NEXT']"));
		    	  waitUtils.waitforElementToBeClickable(driver, Btn, 100);
		        if(Btn.isDisplayed()) {
		        	Btn.click();
		        	 CustomListner.test.log(LogStatus.INFO, "Click on Address Next Button");
		        }else {
		       
		            CustomListner.test.log(LogStatus.FAIL, "Address Next Button Is Not Display");
		        }
		    }

    
    public void validationAddressOneWeb(String addressOne){
        WebElement  validAddressOne =driver.findElement(By.xpath("//input[@id=\"add1Id\"]"));
        waitUtils.waitforElementToBeClickable(driver,validAddressOne,100);
        if(validAddressOne.isDisplayed()){
        	validAddressOne.sendKeys(addressOne);
            CustomListner.test.log(LogStatus.INFO, "Enter Addeass1  Value As =====>"+addressOne);
           }
        else {
        	CustomListner.test.log(LogStatus.FAIL, "Address1 is not displayed");
        }
    }
    
    
    
    public void validationAddressTwoWeb(String addressTwo){
        WebElement  validAddressTwo =driver.findElement(By.xpath("//input[@id=\"add2Id\"]"));
        waitUtils.waitforElementToBeClickable(driver,validAddressTwo,100);
        if(validAddressTwo.isDisplayed()){
        	validAddressTwo.sendKeys(addressTwo);
            CustomListner.test.log(LogStatus.INFO, "Enter Addeass2  Value As =====>"+addressTwo);
           }
        else {
        	CustomListner.test.log(LogStatus.FAIL, "Address2 is not displayed");
        }
    }
    
    
    public void validationAddressThreeWeb(String addressThree){
        WebElement  validAddressThree =driver.findElement(By.xpath("//input[@id=\"add3Id\"]"));
        waitUtils.waitforElementToBeClickable(driver,validAddressThree,100);
        if(validAddressThree.isDisplayed()){
        	validAddressThree.sendKeys(addressThree);
            CustomListner.test.log(LogStatus.INFO, "Enter Addeass3  Value As =====>"+addressThree);
           }
        else {
        	CustomListner.test.log(LogStatus.FAIL, "Address3 is not displayed");
        }
    }
    
    public void invalidationAddressOneWeb(String addressOne){
    	 WebElement  validAddressOne =driver.findElement(By.xpath("//input[@id=\"add1Id\"]"));
    	 validAddressOne.isDisplayed();
    	 validAddressOne.sendKeys(addressOne);
    	 CustomListner.test.log(LogStatus.INFO, "Enter Addeass1  Value As =====>"+addressOne);
    	 validAddressOne.sendKeys(Keys.TAB);
        WebElement  invalidAddressOne =driver.findElement(By.xpath("//p[@id=\"add1Id-helper-text\"]"));
        waitUtils.waitforElementToBeClickable(driver,invalidAddressOne,100);
        if(invalidAddressOne.isDisplayed()){
        	String text = invalidAddressOne.getText();
            CustomListner.test.log(LogStatus.INFO, "validation error msg for Address1 is displayed");
           }
        else {
        	CustomListner.test.log(LogStatus.FAIL, "validation error msg for address1 is not displayed");
        }
    }
    
    
     public void invalidationAddressTwoWeb(String addressTwo){
    	WebElement  validAddressTwo =driver.findElement(By.xpath("//input[@id=\"add2Id\"]"));
    	validAddressTwo.isDisplayed();
    	validAddressTwo.sendKeys(addressTwo);
    	CustomListner.test.log(LogStatus.INFO, "Enter Addeass2  Value As =====>"+addressTwo);
    	validAddressTwo.sendKeys(Keys.TAB);
        WebElement  invalidAddressTwo =driver.findElement(By.xpath("//p[@id=\"add2Id-helper-text\"]"));
        waitUtils.waitforElementToBeClickable(driver,invalidAddressTwo,100);
        if(invalidAddressTwo.isDisplayed()){
        	String text = invalidAddressTwo.getText();
            CustomListner.test.log(LogStatus.INFO, "validation error msg for Address2 is displayed");
           }
        else {
        	CustomListner.test.log(LogStatus.FAIL, "validation error msg for address2 is not displayed");
        }
    }
    
    
    public void invalidationAddressThreeWeb(String addressThree){
    	WebElement  validAddressThree =driver.findElement(By.xpath("//input[@id=\"add3Id\"]"));
    	validAddressThree.isDisplayed();
    	validAddressThree.sendKeys(addressThree);
    	CustomListner.test.log(LogStatus.INFO, "Enter Addeass3  Value As =====>"+addressThree);
    	validAddressThree.sendKeys(Keys.TAB);
        WebElement  invalidAddressThree =driver.findElement(By.xpath("//p[@id=\"add3Id-helper-text\"]"));
        waitUtils.waitforElementToBeClickable(driver,invalidAddressThree,100);
        if(invalidAddressThree.isDisplayed()){
        	String text = invalidAddressThree.getText();
            CustomListner.test.log(LogStatus.INFO, "validation error msg for Address3 is displayed");
           }
        else {
        	CustomListner.test.log(LogStatus.FAIL, "validation error msg for address3 is not displayed");
        }
    }
    
    public void isSelectedCheckboxWeb() {
		WebElement Checkbox = driver.findElement(By.xpath("//input[@name=\"isSameAsComAdd\"]"));
		if(Checkbox.isSelected()) {
			CustomListner.test.log(LogStatus.INFO, "Checkbox is selected");
		}
		else {
			CustomListner.test.log(LogStatus.FAIL, "Checkbox is Not selected");
		}
    }
    
    public void unselectCheckboxWeb() {
		WebElement Checkbox = driver.findElement(By.xpath("//input[@name=\"isSameAsComAdd\"]"));
		if(Checkbox.isSelected()) {
			Checkbox.click();
			CustomListner.test.log(LogStatus.INFO, "click on checkbox ");
		}
		else {
			CustomListner.test.log(LogStatus.FAIL, "not click on checkbox");
		}
    }
    
   
    public void selectPreferredLangWeb(String args) throws InterruptedException{
        WebElement language = driver.findElement(By.xpath("//div[@aria-labelledby=\"languageId\"]"));
        waitUtils.waitforElementToBeClickable(driver, language, 100);
        language.click();
        
        if(args.equalsIgnoreCase("English")){
        Thread.sleep(2000);
        WebElement eng = driver.findElement(By.xpath("//li[@data-value=\"English\"]"));
        waitUtils.waitforElementToBeClickable(driver, eng, 100);
        eng.click();
        CustomListner.test.log(LogStatus.INFO, "click on English option");
        }
        else if(args.equalsIgnoreCase("Hindi")) {

            WebElement hindi = driver.findElement(By.xpath("//li[@data-value=\"Hindi\"]"));
            waitUtils.waitforElementToBeClickable(driver, hindi, 100);
            hindi.click();
            CustomListner.test.log(LogStatus.INFO, "click on Hindi option");
        }
    }
    
    public void selectAlternateMobileNoWeb(String mobile){
        WebElement  mobileNo =driver.findElement(By.xpath("//input[@id=\"mobNumId\"]"));
        waitUtils.waitforElementToBeClickable(driver,mobileNo,100);
        if(mobileNo.isDisplayed()){
        	mobileNo.sendKeys(mobile);
            CustomListner.test.log(LogStatus.INFO, "Enter mobile No. As =====>"+mobile);
           }
        else {
        	CustomListner.test.log(LogStatus.FAIL, "Mobile No. is not displayed");
        }
    }
    
    
    public void selectTelPhoneNoWeb(String telNo){
        WebElement  TelNo =driver.findElement(By.xpath("//input[@id=\"resTelNO\"]"));
        waitUtils.waitforElementToBeClickable(driver,TelNo,100);
        if(TelNo.isDisplayed()){
        	TelNo.sendKeys(telNo);
            CustomListner.test.log(LogStatus.INFO, "Enter TelNo. Value As =====>"+telNo);
           }
        else {
        	CustomListner.test.log(LogStatus.FAIL, "TelNo. is not displayed");
        }
    }
    
	public void perAddGreentickCityStateWeb() {
		WebElement tick = driver.findElement(By.xpath("(//img[@alt=\"endicon\"])[2] "));
		waitUtils.waitforElementToBeClickable(driver, tick, 100);
		if (tick.isDisplayed()) {
			CustomListner.test.log(LogStatus.INFO, "green tick is displayed");
		} else {
			CustomListner.test.log(LogStatus.FAIL, "green tick is Not displayed");
		}

	}
    public void ClickSaveBTNWeb() {
		WebElement save = driver.findElement(By.xpath("//span[text()='SAVE']"));
		if(save.isDisplayed()) {
			save.click();
			CustomListner.test.log(LogStatus.INFO, "Save BTN is click");
		}
		else {
			CustomListner.test.log(LogStatus.FAIL, " not Save BTN is click");
		}
    }
    public void ClickAddressNEXTBTNWeb() {
		WebElement next = driver.findElement(By.xpath("//span[text()='NEXT']"));
		if(next.isDisplayed()) {
			next.click();
			
			CustomListner.test.log(LogStatus.INFO, "Click on Address NEXT BTN ");
		}
		else {
			CustomListner.test.log(LogStatus.FAIL, "Address NEXT BTN is Not Display");
		}
    }

}
