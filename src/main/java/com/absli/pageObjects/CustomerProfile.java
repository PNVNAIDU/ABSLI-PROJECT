package com.absli.pageObjects;

import com.absli.Listner.CustomListner;
import com.absli.utils.WaitUtils;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import util.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//import java.util.regex.Pattern;
import java.util.regex.Pattern;

public class CustomerProfile {


    public WebDriver driver;
    public AndroidDriver driver1;
    public WaitUtils waitUtils;


    // Initializing the Page Objects:
    public CustomerProfile(AndroidDriver driver1) {
        this.driver1 = driver1;
        waitUtils=new WaitUtils();

    }
    public CustomerProfile(WebDriver driver) {
        this.driver = driver;
        waitUtils=new WaitUtils();
    }


    /**
     * Methods and locators start
     */



    public void VerifyCustomerProfileHeaderWeb() {
        WebElement dashboardlogo=driver.findElement(By.xpath("//span[text() =\"Customer Profile\"]"));
        waitUtils.waitForElementToBeVisibleweb(driver, dashboardlogo, 30, "Element is Not Display On Page");
        boolean islogoPresent = dashboardlogo.isDisplayed();
        if(dashboardlogo.isDisplayed()) {
            CustomListner.test.log(LogStatus.INFO, "Customer profile header is present");
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Customer profile header is  not present");
        }
        Assert.assertTrue(islogoPresent, "header displayed");
    }

	public void ChangeSalutionTitleWeb(String Title) throws InterruptedException {
		 
		WebElement salution = driver.findElement(By.xpath("(//div[@id='salutation'])[1]"));
		 waitUtils.waitForElementToBeVisibleweb(driver, salution, 30, "Element is Not Display On Page");
		if (salution.isDisplayed()) {
			salution.click();
			CustomListner.test.log(LogStatus.INFO, "click on Salution Title DropDown");
			Thread.sleep(3000);
			WebElement Titlevalue = driver.findElement(By.xpath("//ul//li//span[text()='" + Title + "']"));
			if (Titlevalue.isDisplayed()) {

				Titlevalue.click();
				CustomListner.test.log(LogStatus.INFO, "Select Salution Title DropDown value As====>"+Title);
			} else {
				CustomListner.test.log(LogStatus.INFO, "Salution Title DropDown value is not display");
			}
			
		}
		else {
			CustomListner.test.log(LogStatus.INFO, "Salution Title DropDown is not display");
		}
	}
	public void ChangeSalutionTitleAndroid(String Title) throws InterruptedException {
		 
		WebElement salution = driver1.findElement(By.xpath("//*[@text='󰅀']"));
		if (salution.isDisplayed()) {
			salution.click();
			CustomListner.test.log(LogStatus.INFO, "click on Salution Title DropDown");
			Thread.sleep(3000);
			WebElement Titlevalue = driver1.findElement(By.xpath("//*[@text='"+Title+"']"));
			if (Titlevalue.isDisplayed()) {

				Titlevalue.click();
				CustomListner.test.log(LogStatus.INFO, "Select Salution Title DropDown value As====>"+Title);
			} else {
				CustomListner.test.log(LogStatus.INFO, "Salution Title DropDown value is not display");
			}
			
		}
		else {
			CustomListner.test.log(LogStatus.INFO, "Salution Title DropDown is not display");
		}
	}
	public void checkFirstNameWeb() {
        WebElement customerProfileCheckFirstNameWeb =driver.findElement(By.xpath("(//input[contains(@id,'firstname')])[1]"));
        waitUtils.waitForElementToBeVisibleweb(driver, customerProfileCheckFirstNameWeb, 30, "Element is Not Display On Page");
        if(customerProfileCheckFirstNameWeb.isDisplayed()) {
       //	String checkFirstNameWeb=customerProfileCheckFirstNameWeb.getText();
       	CustomListner.test.log(LogStatus.INFO, "Successfully Display First Name");
       	 
        }else {
        	CustomListner.test.log(LogStatus.FAIL, "Failed To Display First Name");
        }
    }
	public void EditButton() {
        WebElement Editbutton =driver.findElement(By.xpath("(//span[text()='EDIT'])[1]"));
        waitUtils.waitForElementToBeVisibleweb(driver, Editbutton, 30, "Element is Not Display On Page");
        if(Editbutton.isDisplayed()) {
        	Editbutton.click();
        	CustomListner.test.log(LogStatus.INFO, "Click on Edit Button");
        }else {
        	CustomListner.test.log(LogStatus.FAIL, "Failed to Click on Edit Button");
        }
    }
	public void EditButtonAndroid() {
        WebElement Editbutton =driver1.findElement(By.xpath("//*[@text='EDIT']"));

        if(Editbutton.isDisplayed()) {
        	Editbutton.click();
        	CustomListner.test.log(LogStatus.INFO, "Click on Edit Button");
        }else {
        	CustomListner.test.log(LogStatus.FAIL, "Failed to Click on Edit Button");
        }
    }
	 public void dateFutureWeb() {
	        WebElement editCustomerProfileDateRangeWeb =driver.findElement(By.xpath("//span[text()='Proposer needs to be above 18 years old']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, editCustomerProfileDateRangeWeb, 30, "Element is Not Display On Page");
	        if(editCustomerProfileDateRangeWeb.isDisplayed()){

	        	Assert.assertEquals(editCustomerProfileDateRangeWeb.getText(), "Proposer needs to be above 18 years old");
	        	CustomListner.test.log(LogStatus.INFO, "Successfully Display Proposer needs to be above 18 years old..You Can Not Select Future Date ");
	        }
	        else {
	        	CustomListner.test.log(LogStatus.FAIL, "Failed To Display Mandatory Error Message");
	        }
	}
	 public void dateRangeWeb() {
         WebElement editCustomerProfileDateRangeWeb = driver.findElement(By.xpath("//*[@id=\"page-container\"]/main/div[3]/form/div[1]/div/div[6]/span"));
         waitUtils.waitForElementToBeVisibleweb(driver, editCustomerProfileDateRangeWeb, 30, "Element is Not Display On Page");
         if (editCustomerProfileDateRangeWeb.isDisplayed()) {

             Assert.assertEquals(editCustomerProfileDateRangeWeb.getText(), "Proposer needs to be above 18 years old");
         } else {
             System.out.println("Error message is not visible");
         }
     }

     public void clickIAgreeCheckboxWeb(){

        WebElement termAndCondition=driver.findElement(By.xpath("(//span[text()=\"terms and conditions\"])[1]"));

        if(termAndCondition.isDisplayed()){
            termAndCondition.click();
        }else{
            System.out.println("checkbox element not clickable");
        }
         WebElement termAndConditionAccept=driver.findElement(By.xpath("//span[text()=\"ACCEPT\"]"));
        if(termAndConditionAccept.isDisplayed()){
            termAndConditionAccept.click();
        }else{
            System.out.println("checkbox element not clickable");

        }



         }



	 public void saveButtonWeb() {
	        WebElement customerProfileSaveBtnWeb =driver.findElement(By.xpath("(//span[text()='Save'])[1]"));
	        waitUtils.waitForElementToBeVisibleweb(driver, customerProfileSaveBtnWeb, 30, "Element is Not Display On Page");
	        if(customerProfileSaveBtnWeb.isDisplayed()) {
	            customerProfileSaveBtnWeb.click();
	        }else {
	            System.out.println("Save button is not clickable");
	        }
	    }


	 public void clickOnTransgender() {
	        WebElement customerProfileTransgenderWeb =driver.findElement(By.xpath("(//span[contains(text(),'Transgender')])[1]"));
	        waitUtils.waitForElementToBeVisibleweb(driver, customerProfileTransgenderWeb, 30, "Element is Not Display On Page");
	        if(customerProfileTransgenderWeb.isDisplayed()) {
	       	 customerProfileTransgenderWeb.click();
	       	 CustomListner.test.log(LogStatus.INFO, "Click on TransGender Button");
	        }else {
	            CustomListner.test.log(LogStatus.FAIL, "Button is not clickable");
	        }
	    }
	 public void clickOnTransgenderAndroid() {
	       WebElement customerProfileTransgenderWeb =driver1.findElement(By.xpath("//*[@text='Transgender']"));

	       if(customerProfileTransgenderWeb.isDisplayed()) {
	      customerProfileTransgenderWeb.click();
	      CustomListner.test.log(LogStatus.INFO, "Click on TransGender Button");
	       }else {
	           System.out.println("Button is not clickable");
	           CustomListner.test.log(LogStatus.INFO, "Failed to Display TransGender Button");
	       }
	   }





    public void VerifyCustomerProfileHeaderAndroid() {
        WebElement dashboardlogo=driver.findElement(By.xpath("//android.view.View[@text='CUSTOMER PROFILE']"));
        boolean islogoPresent = dashboardlogo.isDisplayed();
        if(dashboardlogo.isDisplayed()) {
            System.out.println("Customer profile header is present");
        }else {
            System.out.println("Customer profile header is  not present");
        }
        Assert.assertTrue(islogoPresent, "header displayed");
    }


    public void VerifyCustomerProfileHeaderIOS() {
        WebElement dashboardlogo=driver.findElement(By.xpath("//span[text() =\"Customer Profile\"]"));
        boolean islogoPresent = dashboardlogo.isDisplayed();
        if(dashboardlogo.isDisplayed()) {
            System.out.println("Customer profile header is present");
        }else {
            System.out.println("Customer profile header is  not present");
        }
        Assert.assertTrue(islogoPresent, "header displayed");
    }


    public void enterLeadIDWeb(String args) {
        WebElement leadIdInputWeb = driver.findElement(By.xpath("//input[@id=\"leadId\"]"));
        waitUtils.waitForElementToBeVisibleweb(driver ,leadIdInputWeb ,100, "element not visible");
        if (leadIdInputWeb.isDisplayed()) {
            leadIdInputWeb.sendKeys(args);
            CustomListner.test.log(LogStatus.INFO, "Enter Lead Value As =====>"+args);
        } else {
            CustomListner.test.log(LogStatus.INFO, "Failed to Enter  Lead Value As =====>"+args);
            System.out.println("leadId input box is not visible");
        }
    }


    public void customerProfileNextButtonClick() {
    	 WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("//span[text()='Next']"));
    	   waitUtils.waitforElementToBeClickable(driver, customerProfileNextBtnWeb, 100);
        if(customerProfileNextBtnWeb.isDisplayed()) {
            customerProfileNextBtnWeb.click();
            CustomListner.test.log(LogStatus.INFO, "Click on NEXT Button");
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Next is not visible");
        }
    }

	
    public void customerProfileEditButtonClickweb() {
        waitUtils.waitForElementToBeVisibleweb(driver, driver.findElement(By.xpath("(//span[text()='EDIT'])[1]")), 20, "Element not display");
        WebElement customerProfileEditBtnWeb =driver.findElement(By.xpath("(//span[text()='EDIT'])[1]"));

        if(customerProfileEditBtnWeb.isDisplayed()) {
            customerProfileEditBtnWeb.click();
            CustomListner.test.log(LogStatus.INFO, "Click on Edit Button");
        }else {
            CustomListner.test.log(LogStatus.INFO, "Edit Button not Display");
            System.out.println("Next is not visible");
        }
    }
    public void customerProfileEditButtonClickAndroid() {
        waitUtils.waitForElementToBeVisibleAndroid(driver1, driver1.findElement(By.xpath("//*[@text='EDIT']")), 20, "Element not display");
        WebElement customerProfileEditBtnWeb =driver1.findElement(By.xpath("//*[@text='EDIT']"));

        if(customerProfileEditBtnWeb.isDisplayed()) {
            customerProfileEditBtnWeb.click();
            CustomListner.test.log(LogStatus.INFO, "Click on Edit Button");
        }else {
            CustomListner.test.log(LogStatus.INFO, "Edit Button not Display");
            System.out.println("Next is not visible");
        }
    }
    public void customerProfileSaveButtonClick() {
        WebElement customerProfileNextBtnWeb =driver.findElement(By.xpath("//span[text()='Save']"));
        waitUtils.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 30, "Element is Not Display On Page");
        if(customerProfileNextBtnWeb.isDisplayed()) {
            customerProfileNextBtnWeb.click();
            CustomListner.test.log(LogStatus.INFO, "Click on Save Button");
        }else {
            CustomListner.test.log(LogStatus.FAIL, " Save Button is not display");

        }
    }
    public void customerProfileNEXTButtonClick() {
        WebElement customerProfileNextBtnWeb =driver.findElement(By.xpath("(//span[contains(text(),'NEXT')])[1]"));
        waitUtils.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 30, "Element is Not Display On Page");
        if(customerProfileNextBtnWeb.isDisplayed()) {
            customerProfileNextBtnWeb.click();
            CustomListner.test.log(LogStatus.INFO, "Click on Next Button");
        }else {
            CustomListner.test.log(LogStatus.FAIL, " Next Button is not display");

        }
    }
    public void VerifyTick() throws InterruptedException {
       try {
    	   WebElement Verifiedtick1=driver.findElement(By.xpath("(//img[@alt='tick'])[2]"));
           WebElement Verifiedtick2=driver.findElement(By.xpath("(//img[@alt='tick'])[3]"));
           WebElement Verifiedtick3=driver.findElement(By.xpath("(//img[@alt='tick'])[4]"));
           Assert.assertTrue(Verifiedtick1.isDisplayed(),"Element is not display");
           Assert.assertTrue(Verifiedtick2.isDisplayed(),"Element is not display");
           Assert.assertTrue(Verifiedtick3.isDisplayed(),"Element is not display");
           TestUtil.verifybgColor(Verifiedtick1, driver);
           Thread.sleep(2000);
           TestUtil.verifybgColor(Verifiedtick2, driver);
           Thread.sleep(2000);
           TestUtil.verifybgColor(Verifiedtick3, driver);
           CustomListner.test.log(LogStatus.INFO, "Successfully Verified All Verified Tick");
       }catch(NoSuchElementException e) {
    	   CustomListner.test.log(LogStatus.FAIL, "Failed To Verified All Verified Tick");
       }
    }
   
    public void customerProfileSaveButtonClickAndroid() {
        WebElement customerProfileNextBtnWeb =driver1.findElement(By.xpath("//*[@text='SAVE']"));
        if(customerProfileNextBtnWeb.isDisplayed()) {
            customerProfileNextBtnWeb.click();
            CustomListner.test.log(LogStatus.INFO, "Click on Save Button");
        }else {
            CustomListner.test.log(LogStatus.INFO, " Save Button is not display");
            System.out.println("Next is not visible");
        }
    }


    public void customerProfileNextButtonClickAndroid() {
        WebElement customerProfileNextBtnWeb =driver1.findElement(By.xpath("//*[@text='NEXT']"));
        waitUtils.waitForElementToBeClickableAndroid(driver1,customerProfileNextBtnWeb,100);
        if(customerProfileNextBtnWeb.isDisplayed()) {
            customerProfileNextBtnWeb.click();
        }else {
            System.out.println("Next is not visible");
        }

    }

    public void leadIDEmptyValidationWeb() {
        WebElement leadIDValidationWeb =driver.findElement(By.xpath("//p[text()=\"Please enter lead ID\"]"));
        waitUtils.waitforElementToBeClickable(driver,leadIDValidationWeb,30);
        if(leadIDValidationWeb.isDisplayed()) {
            String validationMsg = leadIDValidationWeb.getText();
            Assert.assertEquals("Please enter lead ID", validationMsg);
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Blank Lead Id Validation Message..Please enter lead ID");
           
        }else {
            CustomListner.test.log(LogStatus.FAIL, "No validation message displayed For Blank Lead Id  ");
        }

    }


    public void leadIDValidationWeb() {
        WebElement leadIDValidationWeb =driver.findElement(By.xpath("//p[text()=\"Lead ID should be min 14 characters\"]"));
        waitUtils.waitforElementToBeClickable(driver,leadIDValidationWeb,100);
        if(leadIDValidationWeb.isDisplayed()) {
            String validationMsg = leadIDValidationWeb.getText();
            Assert.assertEquals("Lead ID should be min 14 characters", validationMsg);
        }else {
            System.out.println("No validation message displayed. ");
        }

    }

    //=================================Shubham  3 August changes ============================//
	public void enterMobileNumberWeb(String mobileNumber) {
		WebElement mobileInputWeb = driver.findElement(By.xpath("(//input[@id=\"captureMobile\"])[1]"));
		waitUtils.waitforElementToBeClickable(driver, mobileInputWeb, 100);
		if (mobileInputWeb.isDisplayed()) {
			mobileInputWeb.clear();
			mobileInputWeb.sendKeys(mobileNumber);
			mobileInputWeb.sendKeys(Keys.TAB);
			CustomListner.test.log(LogStatus.INFO, "Enter Mobile  Value As =====>" + mobileNumber);
		}
	}


    public void enterMobileNumberAndroid(String mobileNumber){
        WebElement  mobileInputWeb =driver1.findElement(By.xpath("//android.widget.EditText[@content-desc='mobileNumber']"));
        waitUtils.waitforElementToBeClickable(driver1,mobileInputWeb,100);
        if(mobileInputWeb.isDisplayed()){
            mobileInputWeb.sendKeys(mobileNumber);
        }
    }


    public void enterpanNumberWeb(String panNumber){
        WebElement panNumberWeb =driver.findElement(By.xpath("//input[@name=\"proposer.panNumber\"]"));
        waitUtils.waitforElementToBeClickable(driver,panNumberWeb,100);
        if(panNumberWeb.isDisplayed()){
        	panNumberWeb.clear();
            panNumberWeb.sendKeys(panNumber);
            panNumberWeb.sendKeys(Keys.TAB);
            CustomListner.test.log(LogStatus.INFO, "Enter PAN  Value As =====>"+panNumber);
        }}


    public void enterpanNumberAndroid(String panNumber){
        WebElement panNumberWeb =driver1.findElement(By.xpath("//android.widget.EditText[@content-desc='panNumber']"));
        waitUtils.waitforElementToBeClickable(driver1,panNumberWeb,100);
        if(panNumberWeb.isDisplayed()){

            panNumberWeb.sendKeys(panNumber);
        }

    }




    public void fillDOBdetailsWeb(String day, String month, String year) {
        WebElement eleDOBDayInput = driver.findElement(By.xpath("(//input[@name='day'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
        eleDOBDayInput.click();
        eleDOBDayInput.sendKeys(day);
        CustomListner.test.log(LogStatus.INFO, "Enter Day  Value As =====>"+day);
        WebElement eleDOBMonthInput=driver.findElement(By.xpath("(//input[@name='month'])[1]"));
        waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
        eleDOBMonthInput.clear();
        eleDOBMonthInput.sendKeys(month);
        CustomListner.test.log(LogStatus.INFO, "Enter month  Value As =====>"+month);
        eleDOBMonthInput.sendKeys(Keys.TAB);
        WebElement eleDOBYearInput=driver.findElement(By.xpath("(//input[@name='year'])[1]"));
        waitUtils.waitforElementToBeClickable(driver,eleDOBYearInput,100);
        eleDOBYearInput.clear();
        eleDOBYearInput.sendKeys(year);
        CustomListner.test.log(LogStatus.INFO, "Enter year  Value As =====>"+year);
       // eleDOBYearInput.sendKeys(Keys.ENTER);
    }




    public void fillDOBdetailsAndroid(String day, String month, String year) {
        WebElement eleDOBDayInput = driver1.findElement(By.xpath("//android.widget.TextView[@text='DD']"));
        eleDOBDayInput.click();
        WebElement eleDOBDayInput2 = driver1.findElement(By.xpath("//android.widget.EditText[@content-desc='proposerday']"));
        waitUtils.waitforElementToBeClickable(driver1, eleDOBDayInput2, 100);
        eleDOBDayInput2.sendKeys(day);
        ((AndroidDriver) driver1).hideKeyboard();
        driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement eleDOBMonthInput = driver1.findElement(By.xpath("//android.widget.TextView[@text='MM']"));
        eleDOBMonthInput.click();
        WebElement eleDOBMonthInput2 = driver1.findElement(By.xpath("//android.widget.EditText[@content-desc='proposermonth']"));
        waitUtils.waitforElementToBeClickable(driver1, eleDOBDayInput2, 100);
        eleDOBMonthInput2.sendKeys(month);
        ((AndroidDriver) driver1).hideKeyboard();
        driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement eleDOBYearInput = driver1.findElement(By.xpath("//android.widget.TextView[@text='YYYY']"));
        eleDOBYearInput.click();
        WebElement eleDOBYearInput2 = driver1.findElement(By.xpath("//android.widget.EditText[@content-desc='proposeryear']"));
        waitUtils.waitforElementToBeClickable(driver1, eleDOBDayInput2, 100);
        eleDOBYearInput2.sendKeys(year);
        ((AndroidDriver) driver1).hideKeyboard();


    }


    public void savebtnWeb(){
        WebElement savebtn =driver.findElement(By.xpath("//span[text()=\"Save\"]"));
        waitUtils.waitForElementToBeVisibleweb(driver,savebtn,20,"Save Element is Not Display");
        if(savebtn.isDisplayed()){
            savebtn.click();
            CustomListner.test.log(LogStatus.INFO, "Click On Save Button");
        }else {
        	CustomListner.test.log(LogStatus.FAIL, "Save Button Is Not Display");
        }
    }

    public void iAmSureBtnWeb(){
        WebElement iAmSureBtnWeb =driver.findElement(By.xpath("//span[@class=\"MuiTouchRipple-root\"]"));
        waitUtils.waitforElementToBeClickable(driver,iAmSureBtnWeb,100);
        if(iAmSureBtnWeb.isDisplayed()){
            iAmSureBtnWeb.click();
        }
        else{
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }
    }
    public void DOBIncorrectiAmSureBtnWeb(){
        WebElement DOBiAmSureBtnWeb =driver.findElement(By.xpath("//span[text()='YES I AM SURE']"));
        waitUtils.waitforElementToBeClickable(driver,DOBiAmSureBtnWeb,100);
        if(DOBiAmSureBtnWeb.isDisplayed()){
        	DOBiAmSureBtnWeb.click();
        	 CustomListner.test.log(LogStatus.INFO, "Click On YES I AM SURE Button");
        }
        else{
        	 CustomListner.test.log(LogStatus.FAIL, "YES I AM SURE Button is Not Display");

        }
    }


    public void enterLeadIDAndroid(String args) {
        WebElement leadIdInputAndroid= driver1.findElement(By.xpath("//android.widget.EditText[@content-desc='leadId']"));
        waitUtils.waitForElementToBeVisibleAndroid(driver1,leadIdInputAndroid, 30,"lead ID not visible");
        if (leadIdInputAndroid.isDisplayed()) {
            leadIdInputAndroid.click();
            leadIdInputAndroid.sendKeys(args);
        } else {
            System.out.println("leadId input box is not visible");
        }
    }

    public void clickNextBtnCustomerProfileAndroid() {
        WebElement nextBtnAndroid= driver1.findElement(By.xpath("//android.widget.TextView[@text='NEXT']"));
        waitUtils.waitForElementToBeVisibleAndroid(driver1,nextBtnAndroid, 30,"next button on customer profile not visible");
        if (nextBtnAndroid.isDisplayed()) {
            nextBtnAndroid.click();
        } else {
            System.out.println("Next button on the customer profile page is not visible");
        }
    }

    public void clickSaveBtnCustomerProfileAndroid() {
        WebElement saveBtnAndroid= driver1.findElement(By.xpath("//android.widget.TextView[@text='SAVE']"));
        waitUtils.waitForElementToBeVisibleAndroid(driver1,saveBtnAndroid, 30,"next button on customer profile not visible");
        if (saveBtnAndroid.isDisplayed()) {
            saveBtnAndroid.click();
        } else {
            System.out.println("Next button on the customer profile page is not visible");
        }
    }

    public void clicAlertOKBtnDOBIncorrectMSGAndroid() {
        WebElement OKBtnAndroid= driver1.findElement(By.xpath("//*[@text='OK']"));

        waitUtils.waitForElementToBeVisibleAndroid(driver1,OKBtnAndroid, 30,"next button on customer profile not visible");
        if (OKBtnAndroid.isDisplayed()) {
        	OKBtnAndroid.click();
        } 
    }

    public  boolean isValidPanCardNo(String panCardNo)
    {

        // Regex to check valid PAN Card number.
        // String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";

        String regex = "[A-Z]{3}[ABCFGHLJPTF]{1}[A-Z]{1}[0-9]{4}[A-Z]{1}";
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        if (panCardNo == null)
        {
            return false;
        }

        Matcher m = p.matcher(panCardNo);

        return m.matches();
    }



}
