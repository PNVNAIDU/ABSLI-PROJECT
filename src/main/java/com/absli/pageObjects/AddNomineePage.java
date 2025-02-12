package com.absli.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.absli.Listner.CustomListner;
import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import util.TestUtil;

public class AddNomineePage extends TestBase{

    public WebDriver driver;
    public AndroidDriver driver1;
    public IOSDriver driver2;
    public WaitUtils waitUtils;
    LoginPage loginPage;
    Dashboard dashboard;
    CustomerProfile customerProfile;

    // Initializing the Page Objects:
    public AddNomineePage(AndroidDriver driver1) {
        this.driver1 = driver1;
        waitUtils = new WaitUtils();
    }

    public AddNomineePage(WebDriver driver) {
        this.driver = driver;
        waitUtils = new WaitUtils();
    }

    public AddNomineePage(IOSDriver driver) {
        this.driver2 = driver;
        waitUtils = new WaitUtils();
    }


   
   
  
   
	  public void fillDOBdetailsAddNomineeWeb(String day, String month, String year) {
	        WebElement eleDOBDayInput = driver.findElement(By.xpath("(//input[contains(@id,'dd')])[1]"));
	        waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	        eleDOBDayInput.click();
	        eleDOBDayInput.sendKeys(day);
	        CustomListner.test.log(LogStatus.INFO, "Enter Nominee DOB(day) As=====> "+day);
	        WebElement eleDOBMonthInput=driver.findElement(By.xpath("(//input[contains(@id,'mm')])[1]"));
	        waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	        eleDOBMonthInput.clear();
	        eleDOBMonthInput.sendKeys(month);
	        CustomListner.test.log(LogStatus.INFO, "Enter Nominee DOB(month) As=====> "+month);
	    
	        WebElement eleDOBYearInput=driver.findElement(By.xpath("(//input[contains(@id,'yy')])[1]"));
	        waitUtils.waitforElementToBeClickable(driver, eleDOBYearInput, 100);
	        eleDOBYearInput.clear();
	        eleDOBYearInput.sendKeys(year);
	        eleDOBYearInput.sendKeys(Keys.TAB);
	        CustomListner.test.log(LogStatus.INFO, "Enter Nominee DOB(year) As=====> "+year);
	       
	    }
	

	    public void enterNomineeNameWeb(String args){
	        WebElement NomineeName= driver.findElement(By.xpath("//input[@name='firstName']"));
	        waitUtils.waitforElementToBeClickable(driver, NomineeName, 100);
	        if(NomineeName.isDisplayed()){
	        	NomineeName.click();

	            for (int i = 0; i < 9; i++) {
	            	NomineeName.sendKeys(Keys.BACK_SPACE);
	            	NomineeName.sendKeys(" ");
	            	NomineeName.sendKeys(Keys.DELETE);


	            }  NomineeName.sendKeys(args);
	            CustomListner.test.log(LogStatus.INFO, "Enter Nominee First Name As=====> "+args);
	        }
	        }
	    
	    

	    public void enterNomineeLastNameWeb(String args){
	        WebElement NomineeLastName= driver.findElement(By.xpath("//input[@name='lastName']"));
	        waitUtils.waitforElementToBeClickable(driver, NomineeLastName, 100);
	        if(NomineeLastName.isDisplayed()){
	        	NomineeLastName.click();

	            for (int i = 0; i < 9; i++) {
	            	NomineeLastName.sendKeys(Keys.BACK_SPACE);
	            	NomineeLastName.sendKeys(" ");
	            	NomineeLastName.sendKeys(Keys.DELETE);


	            }  NomineeLastName.sendKeys(args);
	            CustomListner.test.log(LogStatus.INFO, "Enter Nominee Last Name As=====> "+args);
	        }}
	    public void SelectGenderNomineePageWeb(String args){

	        WebElement GenderBtnWeb= driver.findElement(By.xpath("(//span/div[text()=\""+args+"\"])[1]"));
	        waitUtils.waitforElementToBeClickable(driver, GenderBtnWeb, 100);

	        if(GenderBtnWeb.isDisplayed()){
	        	GenderBtnWeb.click();
	        	 CustomListner.test.log(LogStatus.INFO, "Select Nominee Gender As=====> "+args);
	        }else {
	        	System.out.println("Nominee Gender  Element no Display");
	        	 CustomListner.test.log(LogStatus.FAIL, "Nominee Gender  Element not Display");
	        }

	    }
	    public void SelectRelationshipwithProposerdropdownWeb(String args ) throws InterruptedException {
	        WebElement relationshipDropdown  = driver.findElement(By.xpath("//div[@aria-haspopup='listbox']"));
	        waitUtils.waitforElementToBeClickable(driver, relationshipDropdown, 100);
	        if(relationshipDropdown.isDisplayed()) {
	        	Thread.sleep(1000);
	        	relationshipDropdown.click();
	        }
	    	
	        waitUtils.waitforElementToBeClickable(driver, relationshipDropdown, 100);
	        
	       
	        WebElement SelectrelationshipChoose = driver.findElement(By.xpath("//ul/li[@data-value=\""+args+"\"]"));
	        waitUtils.waitforElementToBeClickable(driver, SelectrelationshipChoose, 100);
	        if(SelectrelationshipChoose.isDisplayed()){
	        	SelectrelationshipChoose.click();
	        	 CustomListner.test.log(LogStatus.INFO, "Select Nominee Relationship As=====> "+args);

	        }else {
	        	 CustomListner.test.log(LogStatus.FAIL, "Nominee Relationship is Not Display");
	        }
	    }	
	    
	    public void enterNomineeShareWeb(String args){
	        WebElement NomineeShare= driver.findElement(By.xpath("//input[@id='percentageShare']"));
	        waitUtils.waitforElementToBeClickable(driver, NomineeShare, 100);
	        if(NomineeShare.isDisplayed()){
	        	NomineeShare.click();
	        	 CustomListner.test.log(LogStatus.INFO, "Enter Nominee Share As=====> "+args);
	        	
	        }else {
	        	 CustomListner.test.log(LogStatus.FAIL, "Nominee Share Is Not Display");
	        }

	            for (int i = 0; i < 9; i++) {
	            	NomineeShare.sendKeys(Keys.BACK_SPACE);
	            	NomineeShare.sendKeys(" ");
	            	NomineeShare.sendKeys(Keys.DELETE);


	            }  
	            NomineeShare.sendKeys(args);
	             
	        }

			public void clickNomineeNEXTBtnWeb() {

				WebElement NextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
				waitUtils.waitforElementToBeClickable(driver, NextBtn, 100);
				if (NextBtn.isDisplayed()) {
					NextBtn.click();

					CustomListner.test.log(LogStatus.INFO, "Nominee click Next BTN  Successfully ");

				} else {
					System.out.println("Nominee Next BTN is not visible");
					CustomListner.test.log(LogStatus.FAIL, " Nominee click Next BTN  is not display ");
				}
			}
	    public void clickNomineeAddressNEXTBtnWeb() {
		       
	    	 WebElement AddNextBtn = driver.findElement(By.xpath("//span[text()='NEXT']"));
	    	  waitUtils.waitforElementToBeClickable(driver, AddNextBtn, 100);
	        if(AddNextBtn.isDisplayed()) {
	        	AddNextBtn.click();
	        	 CustomListner.test.log(LogStatus.INFO, "Nominee click Next BTN  Successfully ");
	        }else {
	            System.out.println("Nominee Address BTN is not visible");
	            CustomListner.test.log(LogStatus.FAIL, " Nominee click Next BTN  is not display ");
	        
	        }
	    }

	    public void clickNomineeSAVEBtnWeb() {
	    	  WebElement SaveBtn = driver.findElement(By.xpath("//span[text()='SAVE']"));
	    	  waitUtils.waitforElementToBeClickable(driver, SaveBtn, 100);
	        if(SaveBtn.isDisplayed()) {
	        	SaveBtn.click();
	        	 CustomListner.test.log(LogStatus.INFO, "Nominee click Save BTN  Successfully ");
	        	
	        }else {
	            System.out.println("Nominee Save BTN is not visible");
	            CustomListner.test.log(LogStatus.FAIL, "Failed Nominee click Save BTN   ");
	        }
	    }

	    public void clickNomineeAddBtnWeb() {
	    	  WebElement AddBtn = driver.findElement(By.xpath("//img[@alt='add icon']"));
	    	  waitUtils.waitforElementToBeClickable(driver, AddBtn, 100);
	        if(AddBtn.isDisplayed()) {
	        	AddBtn.click();
	        	 CustomListner.test.log(LogStatus.INFO, "Nominee click Add BTN  Successfully ");
	        }else {
	            System.out.println("Add BTN is not visible");
	            CustomListner.test.log(LogStatus.FAIL, "Failed Nominee click Add BTN   ");
	        }
	    }
	    public void clickNomineeMinimizBtnWeb() {
	    	  WebElement miniBtn = driver.findElement(By.xpath("(//div[@role='button'])[1]"));
	    	  waitUtils.waitforElementToBeClickable(driver, miniBtn, 100);
	        if(miniBtn.isDisplayed()) {
	        	miniBtn.click();
	        	CustomListner.test.log(LogStatus.INFO, "Successfully Display Nominee Minimiz BTN");
	        }else {
	            System.out.println("Add BTN is not visible");
	        	CustomListner.test.log(LogStatus.FAIL, "Failed Display Nominee Minimiz BTN");
	        }
	    }

	    public void clickNomineeRemoveBtnWeb() {
	    	  WebElement RemoveBtn = driver.findElement(By.xpath("//span[text()='REMOVE']"));
	    	  waitUtils.waitforElementToBeClickable(driver, RemoveBtn, 100);
	        if(RemoveBtn.isDisplayed()) {
	        	RemoveBtn.click();
	        	 CustomListner.test.log(LogStatus.INFO, "Nominee click Remove BTN  Successfully ");
	        }else {
	            System.out.println("Remove BTN is not visible");
	            CustomListner.test.log(LogStatus.FAIL, "Failed Nominee click Remove BTN ");
	        }
	    }
	    public void clickNomineeRemoveOKKBtnWeb() {
	    	  WebElement RemoveBtn = driver.findElement(By.xpath("//span[text()='OK']"));
	    	  waitUtils.waitforElementToBeClickable(driver, RemoveBtn, 100);
	        if(RemoveBtn.isDisplayed()) {
	        	RemoveBtn.click();
	        	 CustomListner.test.log(LogStatus.INFO, "Nominee click Remove OK BTN  Successfully ");
	        }else {
	            System.out.println("Remove OKK BTN is not visible");
	            CustomListner.test.log(LogStatus.FAIL, "Failed Nominee click Remove OK  BTN ");
	        }
	    }
	    public void clickBankDetailsNextKBtnWeb() {
	    	  WebElement Btn = driver.findElement(By.xpath("//span[text()='NEXT']"));
	    	  waitUtils.waitforElementToBeClickable(driver, Btn, 100);
	        if(Btn.isDisplayed()) {
	        	Btn.click();
	        	 CustomListner.test.log(LogStatus.INFO, "Bank Details NEXT BTN  Successfully ");
	        }else {
	            System.out.println("Bank Details Next BTN is not visible");
	            CustomListner.test.log(LogStatus.FAIL, "Bank Details Next BTN is not visible");
	        }
	    }
	    public void clickNomineeEditBtnWeb() {
	    	  WebElement nomiBtn = driver.findElement(By.xpath("//span[text()='EDIT']"));
	    	  waitUtils.waitforElementToBeClickable(driver, nomiBtn, 100);
	        if(nomiBtn.isDisplayed()) {
	        	nomiBtn.click();
	        	 CustomListner.test.log(LogStatus.INFO, "Nominee click Edit BTN  Successfully ");
	        }else {
	            System.out.println("Nominee Edit  BTN is not visible");
	            CustomListner.test.log(LogStatus.FAIL, "Failed Nominee click Edit BTN   ");
	        }
	    }
	    public void verifyNomineeRemoveOKBtnWeb() throws InterruptedException  {
	    	 WebElement okEle=driver.findElement(By.xpath("//span[text()='OK']"));
	      
	         TestUtil.verifybgColor(okEle, driver);
	         if(okEle.isDisplayed())
	         {
	         	CustomListner.test.log(LogStatus.INFO, "Successfully Display Remove OK BTN");
	         }else {
	         	CustomListner.test.log(LogStatus.FAIL, "Failed to Display  Remove OK BTN");
	         }
	    }
	    public void verifyNomineeRemoveCANSELBtnWeb() throws InterruptedException {
	    	WebElement cancelEle=driver.findElement(By.xpath("//span[text()='CANCEL']"));
	        Thread.sleep(4000);
	        TestUtil.verifybgColor(cancelEle, driver);
	        if(cancelEle.isDisplayed())
	        {
	        	CustomListner.test.log(LogStatus.INFO, "Successfully Display Remove Cancel BTN");
	        }else {
	        	CustomListner.test.log(LogStatus.FAIL, "Failed to Display  Remove Cancel BTN");
	        }
	        
	    }
	    public void clickNomineeRemoveCancelBtnWeb() {
	    	  WebElement nomiBtn = driver.findElement(By.xpath("//span[text()='CANCEL']"));
	    	  waitUtils.waitforElementToBeClickable(driver, nomiBtn, 100);
	        if(nomiBtn.isDisplayed()) {
	        	nomiBtn.click();
	        	 CustomListner.test.log(LogStatus.INFO, "Nominee click Cancel BTN  Successfully ");
	        }else {
	            System.out.println("Nominee Remove Cancel BTN is not visible");
	            CustomListner.test.log(LogStatus.FAIL, "Failed Nominee click Cancel BTN ");
	        }
	    }
	    public void enterEditNomineeShareWeb(){
	        WebElement NomineeShare= driver.findElement(By.xpath("//input[@id='percentageShare']"));
	        waitUtils.waitforElementToBeClickable(driver, NomineeShare, 100);
	        if(NomineeShare.isDisplayed()){
	        	NomineeShare.click();
	        	CustomListner.test.log(LogStatus.INFO, "Click on Edit Button");
	        	
	        }else {
	        	CustomListner.test.log(LogStatus.FAIL, "Edit Button is Not Display");
	        }

	            for (int i = 0; i < 3; i++) {
	            	NomineeShare.sendKeys(Keys.BACK_SPACE);
	            	NomineeShare.sendKeys(" ");
	            	NomineeShare.sendKeys(Keys.DELETE);


	            }  NomineeShare.sendKeys("101");
	            CustomListner.test.log(LogStatus.INFO, "Enter Nominee Share 101 persent ");
	             
	        }
	    
	    
	    //==================================================================================================================

public void fillDOBdetailsAddNomineeAndroid(String day, String month, String year) {
    WebElement nomiDOBDayInput =driver1.findElement(By.xpath("//*[@text='DD']"));
    nomiDOBDayInput.click();
    WebElement nomiDOBDayInput2 =driver1.findElement(By.xpath("//android.widget.EditText[@content-desc='nomineeday']"));

    waitUtils.waitforElementToBeClickable(driver1, nomiDOBDayInput2, 100);
    nomiDOBDayInput2.sendKeys(day);
    ((AndroidDriver) driver1).hideKeyboard();
    driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    WebElement nomiDOBMonthInput =driver1.findElement(By.xpath("//*[@text='MM']"));


    nomiDOBMonthInput.click();
    WebElement nomiDOBMonthInput2 = driver1.findElement(By.xpath("//android.widget.EditText[@content-desc='nomineemonth']"));


    waitUtils.waitforElementToBeClickable(driver1, nomiDOBMonthInput2, 100);
    nomiDOBMonthInput2.sendKeys(month);
    ((AndroidDriver) driver1).hideKeyboard();
    driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    WebElement nomiDOBYearInput =driver1.findElement(By.xpath("//*[@text='YYYY']"));

    nomiDOBYearInput.click();
    WebElement nomiDOBYearInput2 = driver1.findElement(By.xpath("//android.widget.EditText[@content-desc='nomineeyear']"));


    waitUtils.waitforElementToBeClickable(driver1, nomiDOBYearInput2, 100);
    nomiDOBYearInput2.sendKeys(year);
    ((AndroidDriver) driver1).hideKeyboard();


}

public void enterNomineeNameAndroid(String nomiFirstName){
    WebElement NomineeName=driver1.findElement(By.xpath("//*[@text='First Name']"));

    waitUtils.waitforElementToBeClickable(driver1, NomineeName, 100);
    if(NomineeName.isDisplayed()){
    	NomineeName.click();
      NomineeName.sendKeys(nomiFirstName);
        CustomListner.test.log(LogStatus.INFO, "Enter Nominee First Name As=====> "+nomiFirstName);
    }
    }



public void enterNomineeLastNameAndroid(String nimiLastName){
    WebElement NomineeLastName= driver1.findElement(By.xpath("//*[@text='Last Name']"));

    waitUtils.waitforElementToBeClickable(driver1, NomineeLastName, 100);
    if(NomineeLastName.isDisplayed()){
    	NomineeLastName.click();

         NomineeLastName.sendKeys(nimiLastName);
        CustomListner.test.log(LogStatus.INFO, "Enter Nominee Last Name As=====> "+nimiLastName);
    }
    }




public void SelectGenderNomineePageAndroid(String genderValue){

    WebElement lifeStageBtnAndroid=driver1.findElement(By.xpath("//*[@text='Female']"));

    waitUtils.waitforElementToBeClickable(driver1, lifeStageBtnAndroid, 100);

    if(lifeStageBtnAndroid.isDisplayed()){
    	lifeStageBtnAndroid.click();
    	 CustomListner.test.log(LogStatus.INFO, "Select Gender As=====> "+genderValue);
    }else {
    	System.out.println("Select Gender Element no Display");
    }

}


public void SelectRelationshipwithProposerdropdownAndroid(String relationshipValue ) {
    WebElement relationshipDropdown  = driver1.findElement(By.xpath("//*[@text='Relationship with Proposer']"));
    waitUtils.waitforElementToBeClickable(driver1, relationshipDropdown, 100);
    if(relationshipDropdown.isDisplayed()) {
    	relationshipDropdown.click();
    }
	
    waitUtils.waitforElementToBeClickable(driver1, relationshipDropdown, 100);
    
   
    WebElement SelectrelationshipChoose = driver1.findElement(By.xpath("//*[@text='"+relationshipValue+"']"));

    waitUtils.waitforElementToBeClickable(driver1, SelectrelationshipChoose, 100);
    if(SelectrelationshipChoose.isDisplayed()){
    	SelectrelationshipChoose.click();
    	 CustomListner.test.log(LogStatus.INFO, "Select Relationship As=====> "+relationshipValue);

    }
}	

public void enterEditNomineeShareAndroid(String args){
    WebElement NomineeShare= driver1.findElement(By.xpath("//*[@text='Nominee Share in %']"));

    waitUtils.waitforElementToBeClickable(driver1, NomineeShare, 100);
    if(NomineeShare.isDisplayed()){
    	NomineeShare.click();
    	
    	
    }

        for (int i = 0; i < 3; i++) {
        	NomineeShare.sendKeys(Keys.BACK_SPACE);
        	NomineeShare.sendKeys(" ");
        	NomineeShare.sendKeys(Keys.DELETE);


        }  NomineeShare.sendKeys(args);
        CustomListner.test.log(LogStatus.INFO, "Enter Nominee Share  persent ");
         
    }



	public void VerificationOfAppointeeweb() throws InterruptedException {
		try {
			TestUtil.scrollToElement(driver, driver.findElement(By.xpath("//span[text()='Next']")));
			WebElement appointee = driver.findElement(By.xpath("//div[contains(text(),'APPOINTEE')]"));
			if (appointee.isDisplayed()) {
				TestUtil.verifybgColor(appointee, driver);
				Assert.assertTrue(appointee.isDisplayed(), "  Appointee Filed is not display ");
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Appointee Filed");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "  Appointee Filed is not display ");
			}
		} catch (NoSuchElementException e) {

			CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element on page");

		}

	}
public void VerifyRealationshipWithNomineeweb(String status) throws InterruptedException {
	try {
	
    WebElement Status=driver.findElement(By.xpath("//span[text()='"+status+"']"));
    String statusvalue=Status.getText();
    if(Status.isDisplayed()) {
    	TestUtil.verifybgColor(Status, driver);
    	
        CustomListner.test.log(LogStatus.INFO, "Successfully Verify Relationship with Nominee  As=====>"+status);
    }else {
    	CustomListner.test.log(LogStatus.FAIL, "Relationship with Nominee   is not display ");
    }
   
    
	}catch(NoSuchElementException e) {
		  
		 CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element On Page");
	
	}
}

public void SelectRealationshipWithNomineeweb(String status) throws InterruptedException {
	try {
	
    WebElement Status=driver.findElement(By.xpath("//span[text()='"+status+"']"));
    String statusvalue=Status.getText();
    if(Status.isDisplayed()) {
    	Status.click();
        CustomListner.test.log(LogStatus.INFO, "Successfully Verify Relationship with Nominee  As=====>"+status);
    }else {
    	CustomListner.test.log(LogStatus.FAIL, "Relationship with Nominee   is not display ");
    }
   
    
	}catch(NoSuchElementException e) {
		  
		 CustomListner.test.log(LogStatus.FAIL, "Element is Not Display..of Relationship with Nominee  ");
	
	}
}
public void enterAppointeeFirstNameWeb(String args){
    WebElement appointeeName= driver.findElement(By.xpath("(//input[contains(@id,'appFirstName')])[1]"));
    waitUtils.waitforElementToBeClickable(driver, appointeeName, 100);
    if(appointeeName.isDisplayed()){
    	appointeeName.sendKeys(args);
        CustomListner.test.log(LogStatus.INFO, "Enter Appointee First Name As=====> "+args);
    }else {
    	CustomListner.test.log(LogStatus.FAIL, "Appointee First Name is not display ");
    }
    }	

public void enterAppointeeLastNameWeb(String args){
    WebElement AppointeeLastName= driver.findElement(By.xpath("(//input[contains(@id,'appLastName')])[1]"));
    waitUtils.waitforElementToBeClickable(driver, AppointeeLastName, 100);
    if(AppointeeLastName.isDisplayed()) {
    	AppointeeLastName.sendKeys(args);
        CustomListner.test.log(LogStatus.INFO, "Enter Appointee Last Name As=====> "+args);
    }else {
    	CustomListner.test.log(LogStatus.FAIL, "Appointee Last Name is not display ");
    }
}

public void VerificationOfAppointeeFirstAndLastNameweb() throws InterruptedException {
	try {
		WebElement appointeeName1= driver.findElement(By.xpath("(//input[contains(@id,'appFirstName')])[1]"));
	    waitUtils.waitforElementToBeClickable(driver, appointeeName1, 100);
	    if(appointeeName1.isDisplayed()){
	    	 TestUtil.verifybgColor(appointeeName1, driver);
	        CustomListner.test.log(LogStatus.INFO," Successfully Display Appointee First Name field");
	    }else {
	    	CustomListner.test.log(LogStatus.FAIL, "Appointee First Name Field is not display ");
	    }
	    WebElement AppointeeLastName1= driver.findElement(By.xpath("(//input[contains(@id,'appLastName')])[1]"));
	    waitUtils.waitforElementToBeClickable(driver, AppointeeLastName1, 100);
	    if(AppointeeLastName1.isDisplayed()) {
	    	 TestUtil.verifybgColor(AppointeeLastName1, driver);
	        CustomListner.test.log(LogStatus.INFO, " Successfully Display Appointee Last Name field");
	    }else {
	    	CustomListner.test.log(LogStatus.FAIL, "Appointee Last Name is not display ");
	    }
	}catch(NoSuchElementException e) {
		  
		 CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element On Page");
	
	}
}


public void VerificationOfAppointeeAllFiledErrorMSGweb() throws InterruptedException {
	try {
		WebElement appointeeNameErrorMSG= driver.findElement(By.xpath("//p[text()='Please enter first name']"));
		String NameValue=appointeeNameErrorMSG.getText();
	    waitUtils.waitforElementToBeClickable(driver, appointeeNameErrorMSG, 100);
	    if(appointeeNameErrorMSG.isDisplayed()){
	    	 TestUtil.verifybgColor(appointeeNameErrorMSG, driver);
	        CustomListner.test.log(LogStatus.INFO," Successfully Display Appointee First Name Error Msg");
	    }else {
	    	CustomListner.test.log(LogStatus.FAIL, "Appointee First Name Error MSG is not display ");
	    }
	    Assert.assertEquals(NameValue, "Please enter first name");
	    
	    WebElement AppointeeLastNameErrorMSg= driver.findElement(By.xpath("//p[text()='Please enter last name']"));
	    String LastNameValue=AppointeeLastNameErrorMSg.getText();
	    waitUtils.waitforElementToBeClickable(driver, AppointeeLastNameErrorMSg, 100);
	    if(AppointeeLastNameErrorMSg.isDisplayed()) {
	    	 TestUtil.verifybgColor(AppointeeLastNameErrorMSg, driver);
	        CustomListner.test.log(LogStatus.INFO, " Successfully Display Appointee Last Name Error MSg");
	    }else {
	    	CustomListner.test.log(LogStatus.FAIL, "Appointee Last Name Error MSG is not display ");
	    }
	    Assert.assertEquals(LastNameValue, "Please enter last name");
	    
	}catch(NoSuchElementException e) {
			  
			 CustomListner.test.log(LogStatus.FAIL, " Appointee First And Last Name Error MSg IS Not Display ");
		
		}
	try {
	    WebElement AppointeeDOBdayErrorMSg= driver.findElement(By.xpath("//p[contains(text(),'Enter Day')]"));
	    String DOBdayValue=AppointeeDOBdayErrorMSg.getText();
	    waitUtils.waitforElementToBeClickable(driver, AppointeeDOBdayErrorMSg, 100);
	    if(AppointeeDOBdayErrorMSg.isDisplayed()) {
	    	 TestUtil.verifybgColor(AppointeeDOBdayErrorMSg, driver);
	        CustomListner.test.log(LogStatus.INFO, " Successfully Display Appointee DOB day Error MSg");
	    }else {
	    	CustomListner.test.log(LogStatus.INFO, "Appointee DOB day Error MSG is not display ");
	    }
	    Assert.assertEquals(DOBdayValue, "Enter Day");
	}catch(NoSuchElementException e) {
			  
			 CustomListner.test.log(LogStatus.FAIL, " Appointee DOB day Error MSg IS Not Display ");
		
		}
    try {
	    WebElement AppointeeDOBmonthErrorMSg= driver.findElement(By.xpath("//p[contains(text(),'Enter Month')]"));
	    String DOBmonthValue=AppointeeDOBmonthErrorMSg.getText();
	    waitUtils.waitforElementToBeClickable(driver, AppointeeDOBmonthErrorMSg, 100);
	    if(AppointeeDOBmonthErrorMSg.isDisplayed()) {
	    	 TestUtil.verifybgColor(AppointeeDOBmonthErrorMSg, driver);
	        CustomListner.test.log(LogStatus.INFO, " Successfully Display Appointee DOB month Error MSg");
	    }else {
	    	CustomListner.test.log(LogStatus.FAIL, "Appointee DOB month Error MSG is not display ");
	    }
	    Assert.assertEquals(DOBmonthValue, "Enter Month");
	    
     }catch(NoSuchElementException e) {
			  
			 CustomListner.test.log(LogStatus.FAIL, " Appointee DOB month Error MSg IS Not Display ");
		
		}
try {
	    WebElement AppointeeDOBYrErrorMSg= driver.findElement(By.xpath("//p[contains(text(),'Enter year')]"));
	    String DOBYrValue=AppointeeDOBYrErrorMSg.getText();
	    waitUtils.waitforElementToBeClickable(driver, AppointeeDOBYrErrorMSg, 100);
	    if(AppointeeDOBYrErrorMSg.isDisplayed()) {
	    	 TestUtil.verifybgColor(AppointeeDOBYrErrorMSg, driver);
	        CustomListner.test.log(LogStatus.INFO, " Successfully Display Appointee DOB Year Error MSg");
	    }else {
	    	CustomListner.test.log(LogStatus.FAIL, "Appointee DOB Year Error MSG is not display ");
	    }
	    Assert.assertEquals(DOBYrValue, "Enter year");
}catch(NoSuchElementException e) {
	  
	 CustomListner.test.log(LogStatus.FAIL, " Appointee DOB month Error MSg IS Not Display ");

}
	    try {
	    WebElement AppointeeRelaErrorMSg= driver.findElement(By.xpath("//p[contains(text(),'Please select Relationship with Nominee')]"));
	    String RelaValue=AppointeeRelaErrorMSg.getText();
	    waitUtils.waitforElementToBeClickable(driver, AppointeeRelaErrorMSg, 100);
	    if(AppointeeRelaErrorMSg.isDisplayed()) {
	    	 TestUtil.verifybgColor(AppointeeRelaErrorMSg, driver);
	        CustomListner.test.log(LogStatus.INFO, " Successfully Display Appointee Relationship with Nominee Error MSg");
	    }else {
	    	CustomListner.test.log(LogStatus.FAIL, "Appointee  Relationship with Nominee Error MSG is not display ");
	    }
	    Assert.assertEquals(RelaValue, "Please select Relationship with Nominee");
	    
	    
	}catch(NoSuchElementException e) {
		  
		 CustomListner.test.log(LogStatus.FAIL, " Appointee Relation With Nominee Error MSg IS Not Display ");
	
	}
}

public void VerificationOfRelationShipOfNomineeErrorMSGweb() throws InterruptedException {
	try {
		WebElement RealtionshipErrorEle= driver.findElement(By.xpath("//p[text()='Please select Relationship with Nominee']"));
	    waitUtils.waitforElementToBeClickable(driver, RealtionshipErrorEle, 100);
	  String  valueEle=RealtionshipErrorEle.getText();
	    if(RealtionshipErrorEle.isDisplayed()){
	    	 TestUtil.verifybgColor(RealtionshipErrorEle, driver);
	        CustomListner.test.log(LogStatus.INFO," Successfully Display Relationship with Nominee Error Msg");
	    }else {
	    	CustomListner.test.log(LogStatus.FAIL, "Relationship with Nominee Error Msg is not display ");
	    }
	    Assert.assertEquals(valueEle, "Please select Relationship with Nominee");
	}catch(NoSuchElementException e) {
		  
		 CustomListner.test.log(LogStatus.FAIL, ".Please select Relationship with Nominee Is Not Display ");
	
	}
}


public void fillDOBdetailsAppointeeWeb(String day, String month, String year) {
    WebElement eleDOBDay = driver.findElement(By.xpath("(//input[contains(@id,'dayapp')])[1]"));
    waitUtils.waitforElementToBeClickable(driver, eleDOBDay, 100);
    eleDOBDay.click();
    eleDOBDay.sendKeys(day);
    CustomListner.test.log(LogStatus.INFO, "Enter Appointee DOB(day) As=====> "+day);
    WebElement eleDOBMonth=driver.findElement(By.xpath("(//input[contains(@id,'monthapp')])[1]"));
    waitUtils.waitforElementToBeClickable(driver,eleDOBMonth,100);
    eleDOBMonth.clear();
    eleDOBMonth.sendKeys(month);
    CustomListner.test.log(LogStatus.INFO, "Enter Appointee DOB(month) As=====> "+month);

    WebElement eleDOBYear=driver.findElement(By.xpath("(//input[contains(@id,'yearapp')])[1]"));
    eleDOBYear.clear();
    eleDOBYear.sendKeys(year);
    CustomListner.test.log(LogStatus.INFO, "Enter Appointee DOB(year) As=====> "+year);
   
}


public void VerificationOfAppointeeDOBErrorMSGweb() throws InterruptedException {
	try {
		WebElement AppointeeDOBErrorEle= driver.findElement(By.xpath("//span[text()='Appointee age must be 18 years or above']"));
	    waitUtils.waitforElementToBeClickable(driver, AppointeeDOBErrorEle, 100);
	  String  valueEle1=AppointeeDOBErrorEle.getText();
	    if(AppointeeDOBErrorEle.isDisplayed()){
	    	 TestUtil.verifybgColor(AppointeeDOBErrorEle, driver);
	        CustomListner.test.log(LogStatus.INFO," Successfully Display Appointee DOB Error Msg");
	    }else {
	    	CustomListner.test.log(LogStatus.FAIL, "Appointee DOB Error Msg is not display ");
	    }
	    Assert.assertEquals(valueEle1, "Appointee age must be 18 years or above");
	}catch(NoSuchElementException e) {
		  
		 CustomListner.test.log(LogStatus.FAIL, " Appointee age must be 18 years or above Is Not Display ");
	
	}
}
public void SelectGenderAppointeePageWeb(String args){

    WebElement AppointeeGenderBtnWeb= driver.findElement(By.xpath("(//span/div[text()=\""+args+"\"])[1]"));
    waitUtils.waitforElementToBeClickable(driver, AppointeeGenderBtnWeb, 100);

    if(AppointeeGenderBtnWeb.isDisplayed()){
    	AppointeeGenderBtnWeb.click();
    	 CustomListner.test.log(LogStatus.INFO, "Select Appointee Gender As=====> "+args);
    }else {
    	System.out.println("Appointee Gender Is no Display");
    	 CustomListner.test.log(LogStatus.FAIL, "Appointee Gender Is not Display");
    }

}

public void SelectRelationshipwithProposerdropdownAppointeeWeb(String args ) {
	
    WebElement relationshipDropdown  = driver.findElement(By.xpath("(//div[@role='button'])[7]"));
    waitUtils.waitforElementToBeClickable(driver, relationshipDropdown, 100);
    if(relationshipDropdown.isDisplayed()) {
    	relationshipDropdown.click();
    }
	
    waitUtils.waitforElementToBeClickable(driver, relationshipDropdown, 100);
    
   
    WebElement SelectrelationshipChoose = driver.findElement(By.xpath("//ul/li[@data-value=\""+args+"\"]"));
    waitUtils.waitforElementToBeClickable(driver, SelectrelationshipChoose, 100);
    if(SelectrelationshipChoose.isDisplayed()){
    	SelectrelationshipChoose.click();
    	 CustomListner.test.log(LogStatus.INFO, "Select Relationship With Appointee As=====> "+args);

    }else {
    	 CustomListner.test.log(LogStatus.FAIL, "Relationship With Appointee Is Not Display");
    }
}	







}



