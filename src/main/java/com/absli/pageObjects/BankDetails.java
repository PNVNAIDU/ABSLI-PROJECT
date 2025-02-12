package com.absli.pageObjects;

import com.absli.Listner.CustomListner;
import com.absli.utils.WaitUtils;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import util.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BankDetails {

    public WebDriver driver;
    public AndroidDriver driver1;
    public IOSDriver driver2;
    public WaitUtils waitUtils;
    LoginPage loginPage;
    Dashboard dashboard;
    CustomerProfile customerProfile;

    // Initializing the Page Objects:
    public BankDetails (AndroidDriver driver1) {
        this.driver1 = driver1;
        waitUtils = new WaitUtils();
    }

    public BankDetails (WebDriver driver) {
        this.driver = driver;
        waitUtils = new WaitUtils();
    }

    public BankDetails (IOSDriver driver) {
        this.driver2 = driver;
        waitUtils = new WaitUtils();
    }
    
    
    
    public void VerifyIFSCCode() {
        WebElement ifsccode=driver.findElement(By.xpath("//input[@id='ifscCode']"));
        waitUtils.waitForElementToBeVisibleweb(driver, ifsccode, 20, "Element is Not Display On Page");
        boolean isifscPresent = ifsccode.isDisplayed();
        if(ifsccode.isDisplayed()) {

            CustomListner.test.log(LogStatus.INFO, "IFSC code display Successfully ");
        }else {
        	CustomListner.test.log(LogStatus.INFO, " IFSC code is not display ");
        }
        Assert.assertTrue(isifscPresent, "ifsc code not  displayed");
    }
    public void VerifyBankNameField() {
        WebElement bankname=driver.findElement(By.xpath("//input[@id='bankName']"));
        waitUtils.waitForElementToBeVisibleweb(driver, bankname, 20, "Element is Not Display On Page");
        boolean banknamePresent = bankname.isDisplayed();
        if(bankname.isDisplayed()) {

            CustomListner.test.log(LogStatus.INFO, "Bank Name  display Successfully ");
        }else {
        	CustomListner.test.log(LogStatus.FAIL, " Bank Name is not display ");
        }
        Assert.assertTrue(banknamePresent, "Bank Name is  not  displayed");
    }
    public void VerifyBranchkNameField() {
        WebElement BranchkName=driver.findElement(By.xpath("//input[@id='branchName']"));
        waitUtils.waitForElementToBeVisibleweb(driver, BranchkName, 20, "Element is Not Display On Page");
        boolean BranchkNamePresent = BranchkName.isDisplayed();
        if(BranchkName.isDisplayed()) {

            CustomListner.test.log(LogStatus.INFO, "Branchk Name  display Successfully ");
        }else {
        	CustomListner.test.log(LogStatus.FAIL, " Branchk Name is not display ");
        }
        Assert.assertTrue(BranchkNamePresent, "Branchk Name is  not  displayed");
    }

    public void InputIFSCCode(String ifsc) {
        WebElement ifsccode=driver.findElement(By.xpath("//input[@id='ifscCode']"));
       waitUtils.waitForElementToBeVisibleweb(driver, ifsccode, 20, "Element is Not Display");
        if(ifsccode.isDisplayed()) {
        	ifsccode.sendKeys(ifsc);
            CustomListner.test.log(LogStatus.INFO, "Enter IFSC code As=====> "+ifsc);
        }else {
        	CustomListner.test.log(LogStatus.FAIL, " IFSC code is not display ");
        }
    }
    public void ClearBankNameField() {
        WebElement bankname=driver.findElement(By.xpath("//input[@id='bankName']"));
        waitUtils.waitForElementToBeVisibleweb(driver, bankname, 20, "Element is Not Display On Page");
        if(bankname.isDisplayed()) {
        	bankname.clear();
        	 CustomListner.test.log(LogStatus.INFO, "Clear Bank Name TextField");
        }else {
        	 CustomListner.test.log(LogStatus.FAIL, "Bank Name TextField Is Not Display");
        }
    }
    public void ClearBranchNameField() {
        WebElement branchname=driver.findElement(By.xpath("//input[@id='branchName']"));
        waitUtils.waitForElementToBeVisibleweb(driver, branchname, 20, "Element is Not Display On Page");
        if(branchname.isDisplayed()) {
        	branchname.clear();
            
        }
    }
    public void EnterBankNameField(String BankName) {
        WebElement bankname=driver.findElement(By.xpath("//input[@id='bankName']"));
        waitUtils.waitForElementToBeVisibleweb(driver, bankname, 20, "Element is Not Display On Page");
        if(bankname.isDisplayed()) {
        	bankname.sendKeys(BankName);
            CustomListner.test.log(LogStatus.INFO, "Enter Bank Name  As=====>"+BankName);
        }else {
        	CustomListner.test.log(LogStatus.INFO, " Bank Name is not display ");
        }
    }
    public void EnterBranchNameField(String BranchName) {
        WebElement branchname=driver.findElement(By.xpath("//input[@id='branchName']"));
        waitUtils.waitForElementToBeVisibleweb(driver, branchname, 20, "Element is Not Display On Page");
        if(branchname.isDisplayed()) {
        	branchname.sendKeys(BranchName);
            CustomListner.test.log(LogStatus.INFO, "Enter Branch Name  As=====>"+BranchName);
        }else {
        	CustomListner.test.log(LogStatus.FAIL, " Branch Name is not display ");
        }
    }
    public void EnterAccountNumberField(String accountno) {
        WebElement AccountNo=driver.findElement(By.xpath("//input[@id='accountNo']"));
        waitUtils.waitForElementToBeVisibleweb(driver, AccountNo, 20, "Element is Not Display");
        if(AccountNo.isDisplayed()) {
        	AccountNo.sendKeys(accountno);
            CustomListner.test.log(LogStatus.INFO, "Enter Account No  As=====>"+accountno);
        }else {
        	CustomListner.test.log(LogStatus.FAIL, " Account No is not display ");
        }
    }
    public void VerifyAccountNumberField() {
        WebElement AccountNo=driver.findElement(By.xpath("//input[@id='accountNo']"));
        waitUtils.waitForElementToBeVisibleweb(driver, AccountNo, 20, "Element is Not Display On Page");
        boolean AccountNoPresent = AccountNo.isDisplayed();
        if(AccountNo.isDisplayed()) {

            CustomListner.test.log(LogStatus.INFO, "Account Number   display Successfully ");
        }else {
        	CustomListner.test.log(LogStatus.FAIL, "Account Number is not display ");
        }
        Assert.assertTrue(AccountNoPresent, "Account Number is  not  displayed");
    }
    public void ClickVerifyButtinweb() {
        WebElement VerifyBTN=driver.findElement(By.xpath("//span[text()='Verify']"));
        waitUtils.waitForElementToBeVisibleweb(driver, VerifyBTN, 20, "Element is Not Display On Page");
        if(VerifyBTN.isDisplayed()) {
        	VerifyBTN.click();
            CustomListner.test.log(LogStatus.INFO, "Click on Verify Button");
        }else {
        	CustomListner.test.log(LogStatus.FAIL, " Verify Button is not display ");
        }
    }
    public void VerifyInvalidPopUpButtinweb() throws InterruptedException {
        WebElement VerifyBTN=driver.findElement(By.xpath("//div[contains(text(),'The bank account is Invalid.')]"));
        waitUtils.waitForElementToBeVisibleweb(driver, VerifyBTN, 20, "Element is Not Display On Page");
        if(VerifyBTN.isDisplayed()) {
        	TestUtil.verifybgColor(VerifyBTN, driver);
            CustomListner.test.log(LogStatus.INFO, "Successfully Display The bank account is Invalid. Error PopUp ");
        }else {
        	CustomListner.test.log(LogStatus.FAIL, " Failed To Display The bank account is Invalid.  Error PopUp ");
        }
    }
    public void ClickAlertOkButtinweb() {
        WebElement OKBTN=driver.findElement(By.xpath("//span[text()='OK']"));
        waitUtils.waitForElementToBeVisibleweb(driver, OKBTN, 20, "Element is Not Display On Page");
        if(OKBTN.isDisplayed()) {
        	OKBTN.click();
            CustomListner.test.log(LogStatus.INFO, "Click on OK Button");
        }else {
        	CustomListner.test.log(LogStatus.FAIL, " OK Button is not display ");
        }
    }
    public void ClickOnProceedBtnweb() {
        WebElement OKBTN=driver.findElement(By.xpath("(//span[contains(text(),'PROCEED')])[1]"));
        waitUtils.waitForElementToBeVisibleweb(driver, OKBTN, 30, "Unable To Locate Element");
        if(OKBTN.isDisplayed()) {
        	OKBTN.click();
            CustomListner.test.log(LogStatus.INFO, "Click on PROCEED  Button");
        }else {
        	CustomListner.test.log(LogStatus.INFO, " PROCEED Button is not display ");
        }
    }

    public void ClickPolicyPayoutNEXTweb() {
        WebElement NXTBTN=driver.findElement(By.xpath("//span[text()='Next']"));
        waitUtils.waitForElementToBeVisibleweb(driver, NXTBTN, 20, "Element is Not Display On Page");
        if(NXTBTN.isDisplayed()) {
        	NXTBTN.click();
            CustomListner.test.log(LogStatus.INFO, "Click on NEXT Button");
        }else {
        	CustomListner.test.log(LogStatus.FAIL, " NEXT Button is not display ");
        }
    }
    public void ClickPaymentMethodweb(String paymentmethod) {
        WebElement PaymentMethod=driver.findElement(By.xpath("//button[contains(@value,'"+paymentmethod+"')]"));
        waitUtils.waitForElementToBeVisibleweb(driver, PaymentMethod, 30, "Element is Not Display");

        if(PaymentMethod.isDisplayed()) {
        	PaymentMethod.click();
            CustomListner.test.log(LogStatus.INFO, "Click on payment Method Button As=====>"+paymentmethod);
        }else {
        	CustomListner.test.log(LogStatus.FAIL, "Payment method button is not display ");
        }
    }
    public void ClickPreferredDrawDateweb(String PreferredDrawDate) {
        WebElement preferreddrawDate=driver.findElement(By.xpath("//button[@value='"+PreferredDrawDate+"']"));
        waitUtils.waitForElementToBeVisibleweb(driver, preferreddrawDate, 20, "Element is Not Display On Page");
        if(preferreddrawDate.isDisplayed()) {
        	preferreddrawDate.click();
            CustomListner.test.log(LogStatus.INFO, "Click on Preferred Draw Date Button As=====> "+PreferredDrawDate);
        }else {
        CustomListner.test.log(LogStatus.FAIL, "Preferred Draw Date button is not display ");
        }
    }
    public void ClickSourceOfFundweb(String sourceoffund) {
        WebElement SourceOfFund=driver.findElement(By.xpath("//button[contains(@value,'"+sourceoffund+"')]"));
        waitUtils.waitForElementToBeVisibleweb(driver, SourceOfFund, 20, "Element is Not Display On Page");
        if(SourceOfFund.isDisplayed()) {
        	SourceOfFund.click();
            CustomListner.test.log(LogStatus.INFO, "Click on source of fund Button As=====>"+sourceoffund);
        }else {
        	CustomListner.test.log(LogStatus.FAIL, "source of fund button is not display ");
        }
    }
    public void ClickSendLinkToClientweb() {
        WebElement SendLinkToClient=driver.findElement(By.xpath("//span[text()='Send Link To Client']"));
        waitUtils.waitForElementToBeVisibleweb(driver, SendLinkToClient, 20, "Element is Not Display On Page");
        if(SendLinkToClient.isDisplayed()) {
        	SendLinkToClient.click();
            CustomListner.test.log(LogStatus.INFO, "Click on send link To Client");
        }else {
        	CustomListner.test.log(LogStatus.FAIL, "send link To Client button is not display ");
        }
    }
    public void VerifyStatusweb(String status) throws InterruptedException {
        WebElement Status=driver.findElement(By.xpath("//div[text()='"+status+"']"));
        waitUtils.waitForElementToBeVisibleweb(driver, Status, 20, "Element is Not Display On Page");
        String statusvalue=Status.getText();
        if(Status.isDisplayed()) {
        	TestUtil.verifybgColor(Status, driver);
        	Assert.assertTrue(Status.isDisplayed(),"Status is not displayed");
            CustomListner.test.log(LogStatus.INFO, "Successfully Verify Status As=====>"+status);
        }else {
        	CustomListner.test.log(LogStatus.FAIL, "Status  is not display ");
        }
    }
    
    public void ClickSaveButtonweb() {
        WebElement saveBTN=driver.findElement(By.xpath("//span[text()='SAVE']"));
        waitUtils.waitForElementToBeVisibleweb(driver, saveBTN, 20, "Element is Not Display On Page");
        if(saveBTN.isDisplayed()) {
        	saveBTN.click();
            CustomListner.test.log(LogStatus.INFO, "Click on Save Button");
        }else {
        	CustomListner.test.log(LogStatus.FAIL, "Save Button is not Display");
        }
    }
    public void ClickAlertOKButtonweb() {
        WebElement OKBTN=driver.findElement(By.xpath("//span[text()='OK']"));
        waitUtils.waitForElementToBeVisibleweb(driver, OKBTN, 20, "Element is Not Display On Page");
        if(OKBTN.isDisplayed()) {
        	OKBTN.click();
            CustomListner.test.log(LogStatus.INFO, "Click on Alert Ok Button");
        }else {
        	CustomListner.test.log(LogStatus.FAIL, "Alert OK  Button is not Display");
        }
    }

    public  boolean isValidIFSCode(String str)
    {
        // Regex to check valid IFSC Code.
        String regex = "^[A-Z]{4}0[A-Z0-9]{6}$";
        return str.trim().matches(regex);
    }
    
    
}
