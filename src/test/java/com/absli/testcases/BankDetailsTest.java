package com.absli.testcases;

import com.absli.Listner.CustomListner;
import com.absli.base.TestBase;
import com.absli.dataproviders.DataProviders;
import com.absli.pageObjects.*;
import com.absli.utils.WaitUtils;
import com.relevantcodes.extentreports.LogStatus;

import Utils.TestFactory;
import util.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.EmptyStackException;
import java.util.concurrent.TimeUnit;

public class BankDetailsTest extends TestBase {



    LoginPage loginPage;
    Dashboard dashboard;
    CustomerProfile customerProfile;
    ViewQuote viewQuote;
    PlanInfo planInfo;
    BankDetails bankdetails;
    WaitUtils wait;

    public BankDetailsTest() {
        super();

    }

    @BeforeClass
    public void preSetup() throws IOException {
        initialization();
    }


    @BeforeMethod
    public void setUp() throws MalformedURLException {

        if (TestBase.parameterName.equalsIgnoreCase("web")) {
            loginPage = new LoginPage(TestBase.driver);
            dashboard = new Dashboard(TestBase.driver);
            customerProfile = new CustomerProfile(TestBase.driver);
            viewQuote = new ViewQuote(TestBase.driver);
            planInfo = new PlanInfo(TestBase.driver);
            bankdetails= new BankDetails(TestBase.driver);
            wait=new WaitUtils();

        } else if (TestBase.parameterName.equalsIgnoreCase("Android")) {
            loginPage = new LoginPage(TestBase.driver1);
            dashboard = new Dashboard(TestBase.driver1);
            customerProfile = new CustomerProfile(TestBase.driver1);
            planInfo = new PlanInfo(TestBase.driver1);
            bankdetails= new BankDetails(TestBase.driver1);
            wait=new WaitUtils();
        } else {
            loginPage = new LoginPage(TestBase.driver2);
            dashboard = new Dashboard(TestBase.driver2);
            customerProfile = new CustomerProfile(TestBase.driver2);
            planInfo = new PlanInfo(TestBase.driver2);
            bankdetails= new BankDetails(TestBase.driver2);
            wait=new WaitUtils();
        }
    }

/*

    @Test(groups = {"web"}, dataProvider = "bankDetailDataProvider", dataProviderClass = DataProviders.class,
            description = "TEST_59-User should click on the credit card option, enter credit card details and have the mandate registered"
    )
    public void bankDetailsWeb(String userName, String passWord, String leadID, String mobileNumber,
                                          String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
                                          String smokerNonSmoker, String pptOption, String term, 
                                          String paymode, String AciSumAssured, String Rideramount,String level,String IFSCCode,
                                          String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
                                          String AccountNo,String AccountNoErrorMSG,String PaymentMethod,String PreferredDrawDate,String SourceOfFunds,String BankStatus) throws InterruptedException {
    
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonweb();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        dashboard.clickHamburgerandSelectNewApplicationWeb();
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        customerProfile.enterLeadIDWeb(leadID);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.enterpanNumberWeb(panNumber);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.fillDOBdetailsWeb(day, month, year);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        viewQuote.clickselectPlanBtnWeb();
        viewQuote.selectPlanJourneyNewWeb("BSLI CritiShield Plan");
        viewQuote.viewQuotePageVerifyWeb();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        viewQuote.clickNextBtnCapital();

    }
    */
@Test(groups = {
		"web" }, dataProvider = "bankDetailDataProvider", dataProviderClass = DataProviders.class, description = "TEST_38 ||To check IFSC code field is available on bank details page"
				+ "TEST_38 ||To check lengh of IFSC code field should be 11 digits which contains:\n"
				+ "First 4 are alphabets\n" + "5th is zero\n" + "next 6 are alpha - numeric"
				+ "TEST_38 ||To verify no special characters including spaces are allowed"
				+ "TEST_38 ||Only once the required format is entered and then on tap out then only the IFSC code can be verified"
				+ "TEST_38 ||To check if user enters valid IFSC code then the below details are prefilled:\n"
				+ "Bank name\n" + "Bank branch address\n" + "Branch name")
public void VerifyIFSCCodeWeb(String userName, String passWord, String leadID, String mobileNumber, String panNumber,
		String day, String month, String year, String quoteAmount, String planOptions, String smokerNonSmoker,
		String pptOption, String term, String paymode, String AciSumAssured, String Rideramount, String level,
		String IFSCCode, String IFSCErrorMSG, String BankName, String BankNameErrorMSG, String BranchName,
		String BranchNameErrorMSG, String AccountNo, String AccountNoErrorMSG, String PaymentMethod,
		String PreferredDrawDate, String SourceOfFunds, String BankStatus) throws InterruptedException {

	new TestFactory().gotoBankweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			quoteAmount, planOptions, smokerNonSmoker, pptOption, term, paymode, AciSumAssured, Rideramount, level);

	bankdetails.VerifyIFSCCode();
	bankdetails.InputIFSCCode(IFSCCode);
	Thread.sleep(2000);
	bankdetails.VerifyBankNameField();
	bankdetails.VerifyBranchkNameField();
	boolean value = bankdetails.isValidIFSCode(IFSCCode);
	if (value == true) {
		CustomListner.test.log(LogStatus.INFO, "Successfully Verified IFSC Code Validation");
	} else {
		CustomListner.test.log(LogStatus.FAIL, "Failed to Verified IFSC COde");
	}

}

@Test(groups = {
		"web" }, dataProvider = "bankDetailDataProvider", dataProviderClass = DataProviders.class, description = "TEST_38 ||To Verify that if the IFSC code is invalid/not exist in the API, then the user should be shown a message on tap out - “The IFSC code is invalid. Please re-enter”")
public void VerifyInvalidIFSCCodeWeb(String userName, String passWord, String leadID, String mobileNumber,
		String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
		String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured, String Rideramount,
		String level, String IFSCCode, String IFSCErrorMSG, String BankName, String BankNameErrorMSG, String BranchName,
		String BranchNameErrorMSG, String AccountNo, String AccountNoErrorMSG, String PaymentMethod,
		String PreferredDrawDate, String SourceOfFunds, String BankStatus) throws InterruptedException {

	new TestFactory().gotoBankweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			quoteAmount, planOptions, smokerNonSmoker, pptOption, term, paymode, AciSumAssured, Rideramount, level);

	bankdetails.InputIFSCCode(IFSCCode);
	wait.WaitTime2();
	WebElement invalidMSG = driver.findElement(By.xpath("//p[text()='Invalid IFSC Code']"));
	String ErrorValue = invalidMSG.getText();
	if (invalidMSG.isDisplayed()) {
		TestUtil.verifybgColor(invalidMSG, driver);
		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Invalid IFSC Code ");
	} else {
		CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Invalid IFSC Code");
	}
	Assert.assertEquals(IFSCErrorMSG, ErrorValue);
}
//    @Test(groups = {"web"}, dataProvider = "bankDetailDataProvider", dataProviderClass = DataProviders.class,
//            description = "TEST_38 ||To check Bank name range should in between 5 to 100 character."
//            		+ "TEST_38 ||To check if below 5 and above 100 character should not accept in bank name field"
//    )
//    public void VerifyBankNameMinAndMaxValidationWeb(String userName, String passWord, String leadID, String mobileNumber,
//                                          String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
//                                          String smokerNonSmoker, String pptOption, String term, String paymode, 
//                                          String AciSumAssured, String Rideramount,String level,String IFSCCode,
//                                          String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
//                                          String AccountNo,String AccountNoErrorMSG,String PaymentMethod,String PreferredDrawDate,String SourceOfFunds,String BankStatus) throws InterruptedException {
//     
//    	new TestFactory().gotoBankweb(driver, userName,  passWord,  leadID,  mobileNumber,
//                panNumber,  day,  month,  year,  quoteAmount,  planOptions,
//                smokerNonSmoker,  pptOption,  term,  paymode, 
//                AciSumAssured,  Rideramount, level);
//       
//        bankdetails.InputIFSCCode(IFSCCode); 
//        Thread.sleep(2000);
//        bankdetails.ClearBankNameField();
//        bankdetails.EnterBankNameField(BankName);
//        TestUtil.scrollTillEndOfPage(driver);
//        Thread.sleep(2000);
//        bankdetails.ClickVerifyButtinweb();
//        Thread.sleep(5000);
//       WebElement invalidBankMSG= driver.findElement(By.xpath("//p[text()='Min 5 and max 100 characters']"));
//      String ErrorValue=invalidBankMSG.getText();
//       if(invalidBankMSG.isDisplayed()) {
//    	   TestUtil.verifybgColor(invalidBankMSG, driver);
//    	   CustomListner.test.log(LogStatus.INFO, "Successfully Verified Invalid Bank Name Error MSG ");
//       }
//       else {
//    	   CustomListner.test.log(LogStatus.INFO, "Failed to Verified Invalid Bank Name");
//       }
//       Assert.assertEquals(BankNameErrorMSG, ErrorValue);
//    }

//    @Test(groups = {"web"}, dataProvider = "bankDetailDataProvider", dataProviderClass = DataProviders.class,
//            description = "TEST_38 ||To check Branch Name range should in between 5 to 100 character."
//            		+ "TEST_38 ||To check below 5 and above 100 character should not accept in Branch Name field"
//            		+ "TEST_38 ||To Verify if the value does NOT meet the min mx, show message - “Min 5 and max 100 characters”"
//    )
//    public void VerifyBranchNameMinAndMaxValidationWeb(String userName, String passWord, String leadID, String mobileNumber,
//                                          String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
//                                          String smokerNonSmoker, String pptOption, String term, String paymode, 
//                                          String AciSumAssured, String Rideramount,String level,String IFSCCode,
//                                          String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
//                                          String AccountNo,String AccountNoErrorMSG,String PaymentMethod,String PreferredDrawDate,String SourceOfFunds,String BankStatus) throws InterruptedException {
//    	
//    	new TestFactory().gotoBankweb(driver, userName,  passWord,  leadID,  mobileNumber,
//                panNumber,  day,  month,  year,  quoteAmount,  planOptions,
//                smokerNonSmoker,  pptOption,  term,  paymode, 
//                AciSumAssured,  Rideramount, level);
//
//      
//        bankdetails.InputIFSCCode(IFSCCode); 
//        Thread.sleep(2000);
//        bankdetails.ClearBranchNameField();
//        bankdetails.EnterBranchNameField(BranchName);
//        TestUtil.scrollTillEndOfPage(driver);
//        Thread.sleep(2000);
//        bankdetails.ClickVerifyButtinweb();
//        Thread.sleep(5000);
//       WebElement invalidBranchMSG= driver.findElement(By.xpath("//p[text()='Min 5 and max 100 characters']"));
//      String ErrorValue=invalidBranchMSG.getText();
//       if(invalidBranchMSG.isDisplayed()) {
//    	   TestUtil.verifybgColor(invalidBranchMSG, driver);
//    	   CustomListner.test.log(LogStatus.INFO, "Successfully Verified Invalid Branch Name Error MSG ");
//       }
//       else {
//    	   CustomListner.test.log(LogStatus.INFO, "Failed to Verified Invalid Branch Name");
//       }
//       Assert.assertEquals(BranchNameErrorMSG, ErrorValue);
//    }
@Test(groups = {
		"web" }, dataProvider = "bankDetailDataProvider", dataProviderClass = DataProviders.class, description = "TEST_38 ||o check Account no field is available on page"
				+ "TEST_38 ||To Verify that the user is able to enter the bank account no. manually - This is min 9 number and MAX 50 numbers. No special character is to be entered. This should be configurable"
				+ "TEST_38 ||To check once the below details are entered, the user can perform “penny testing”:\n"
				+ "IFSC code\n" + "Bank Name\n" + "Account no\n" + "Branch name\n" + "Bank Address"
				+ "TEST_38 ||To check that only entering the above details, the “Verify bank” action is activated"
				+ "TEST_147 ||To check If the name %age match is above 70% then following will happen 3)Message - “Super! The Bank account is verified. No cheque copy is required!”"
				+ "TEST_147 ||To check If the name %age match is above 70% then following will happen 4)Ensure account name is NOT editable once the bank account is verified ")
public void VerifyAccountNumberSuccessfullyVerifiedWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
		String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
		String Rideramount, String level, String IFSCCode, String IFSCErrorMSG, String BankName,
		String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
		String AccountNoErrorMSG, String PaymentMethod, String PreferredDrawDate, String SourceOfFunds,
		String BankStatus) throws InterruptedException {

	new TestFactory().gotoBankweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			quoteAmount, planOptions, smokerNonSmoker, pptOption, term, paymode, AciSumAssured, Rideramount, level);

	bankdetails.InputIFSCCode(IFSCCode);
	wait.WaitTime2();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	bankdetails.VerifyAccountNumberField();
	bankdetails.EnterAccountNumberField(AccountNo);
	bankdetails.ClickVerifyButtinweb();
	wait.WaitTime5();
	bankdetails.ClickOnProceedBtnweb();
	CustomListner.test.log(LogStatus.INFO, "Successfully Verified Account Number");
//        WebElement verifiedTick= driver.findElement(By.xpath("//img[@alt='endicon']"));
//        TestUtil.verifybgColor(verifiedTick, driver);
//        Assert.assertTrue(verifiedTick.isDisplayed(),"Verified Tick is not display");
//        CustomListner.test.log(LogStatus.INFO, "Successfully Verified Tick");

}

@Test(groups = {
		"web" }, dataProvider = "bankDetailDataProvider", dataProviderClass = DataProviders.class, description = "TEST_38 ||Verify that user is able to enter ONLY numbers and no other special characters in the account number")
public void VerifyAccountNumberNoSpecialCharacterWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
		String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
		String Rideramount, String level, String IFSCCode, String IFSCErrorMSG, String BankName,
		String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
		String AccountNoErrorMSG, String PaymentMethod, String PreferredDrawDate, String SourceOfFunds,
		String BankStatus) throws InterruptedException {

	new TestFactory().gotoBankweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			quoteAmount, planOptions, smokerNonSmoker, pptOption, term, paymode, AciSumAssured, Rideramount, level);

	bankdetails.InputIFSCCode(IFSCCode);
	wait.WaitTime2();
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	bankdetails.EnterAccountNumberField(AccountNo);
	bankdetails.ClickVerifyButtinweb();
	wait.WaitTime2();
	bankdetails.EnterAccountNumberField(AccountNo);

	WebElement invalidAccountMSG = driver.findElement(By.xpath("//p[text()='Enter only Numbers']"));
	String ErrorValue = invalidAccountMSG.getText();
	if (invalidAccountMSG.isDisplayed()) {
		TestUtil.verifybgColor(invalidAccountMSG, driver);
		CustomListner.test.log(LogStatus.INFO, "Successfully Display Enter only Numbers Error Message");
	} else {
		CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Enter only Numbers Error Message");
	}
	Assert.assertEquals(AccountNoErrorMSG, ErrorValue);

}

@Test(groups = {
		"web" }, dataProvider = "bankDetailDataProvider", dataProviderClass = DataProviders.class, description = "TEST_38 ||Verify that if digits in account no. are below 9 and above 50, the message is shown - “Min 9- max 50 nos.”")
public void VerifyAccountNumberMinAndMaxValidationWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
		String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
		String Rideramount, String level, String IFSCCode, String IFSCErrorMSG, String BankName,
		String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
		String AccountNoErrorMSG, String PaymentMethod, String PreferredDrawDate, String SourceOfFunds,
		String BankStatus) throws InterruptedException {

	new TestFactory().gotoBankweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			quoteAmount, planOptions, smokerNonSmoker, pptOption, term, paymode, AciSumAssured, Rideramount, level);

	bankdetails.InputIFSCCode(IFSCCode);
	wait.WaitTime2();
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	bankdetails.EnterAccountNumberField(AccountNo);
	bankdetails.ClickVerifyButtinweb();
	Thread.sleep(2000);
	WebElement invalidAccountMSG = driver
			.findElement(By.xpath("//p[text()='Account number can not have less than 9 digits']"));
	String ErrorValue = invalidAccountMSG.getText();
	if (invalidAccountMSG.isDisplayed()) {
		TestUtil.verifybgColor(invalidAccountMSG, driver);
		CustomListner.test.log(LogStatus.INFO,
				"Successfully Verified Account number can not have less than 9 digits Error MSG ");
	} else {
		CustomListner.test.log(LogStatus.FAIL,
				"Failed to Verified Account number can not have less than 9 digits Error Message");
	}
	Assert.assertEquals(AccountNoErrorMSG, ErrorValue);

}

@Test(groups = {
		"web" }, dataProvider = "bankDetailDataProvider", dataProviderClass = DataProviders.class, description = "TEST_38 ||To check User should NOT ENTER more than 50 numbers")
public void VerifyAccountNumber50CharacternWeb(String userName, String passWord, String leadID, String mobileNumber,
		String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
		String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured, String Rideramount,
		String level, String IFSCCode, String IFSCErrorMSG, String BankName, String BankNameErrorMSG, String BranchName,
		String BranchNameErrorMSG, String AccountNo, String AccountNoErrorMSG, String PaymentMethodString,
		String PreferredDrawDate, String SourceOfFunds, String BankStatus) throws InterruptedException {

	new TestFactory().gotoBankweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			quoteAmount, planOptions, smokerNonSmoker, pptOption, term, paymode, AciSumAssured, Rideramount, level);

	bankdetails.InputIFSCCode(IFSCCode);
	wait.WaitTime2();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	bankdetails.EnterAccountNumberField(AccountNo);
	bankdetails.ClickVerifyButtinweb();
	Thread.sleep(2000);
	CustomListner.test.log(LogStatus.INFO, "Account Number is Not Verified.You Can Not Enter More Than 50 Number");

}

@Test(groups = {
		"web" }, dataProvider = "bankDetailDataProvider", dataProviderClass = DataProviders.class, description = "TEST_147 ||To test If the name %age match is below 70% then following should happen 3)Message - “Account could not be verified. You will need to upload a cheque copy later” ")
public void VerifyAccountNumberInValidWeb(String userName, String passWord, String leadID, String mobileNumber,
		String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
		String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured, String Rideramount,
		String level, String IFSCCode, String IFSCErrorMSG, String BankName, String BankNameErrorMSG, String BranchName,
		String BranchNameErrorMSG, String AccountNo, String AccountNoErrorMSG, String PaymentMethodString,
		String PreferredDrawDate, String SourceOfFunds, String BankStatus) throws InterruptedException {

	new TestFactory().gotoBankweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			quoteAmount, planOptions, smokerNonSmoker, pptOption, term, paymode, AciSumAssured, Rideramount, level);

	bankdetails.InputIFSCCode(IFSCCode);
	wait.WaitTime2();
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	bankdetails.EnterAccountNumberField(AccountNo);
	bankdetails.ClickVerifyButtinweb();
	wait.WaitTime5();
	bankdetails.VerifyInvalidPopUpButtinweb();
	// bankdetails.ClickAlertOkButtinweb();

}

@Test(groups = {
		"web" }, dataProvider = "bankDetailDataProvider", dataProviderClass = DataProviders.class, description = "TEST_58 ||To check that user can change/unclick the mode of payment to another one"
				+ "TEST_58 ||To check that the preferred draw date is On premium due only\n"
				+ "TEST_58 ||To check that the user is able to choose the source of funds from\n" + "1)Others\n"
				+ "2)Salary\n" + "3)Business income"
				+ "TEST_58 || To check that on clicking next the details are saved")
public void VerifyRenewalPremiumWeb(String userName, String passWord, String leadID, String mobileNumber,
		String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
		String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured, String Rideramount,
		String level, String IFSCCode, String IFSCErrorMSG, String BankName, String BankNameErrorMSG, String BranchName,
		String BranchNameErrorMSG, String AccountNo, String AccountNoErrorMSG, String PaymentMethodString,
		String PreferredDrawDate, String SourceOfFunds, String BankStatus) throws InterruptedException {

	new TestFactory().gotoBankweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			quoteAmount, planOptions, smokerNonSmoker, pptOption, term, paymode, AciSumAssured, Rideramount, level);

	bankdetails.InputIFSCCode(IFSCCode);
	wait.WaitTime2();
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	bankdetails.EnterAccountNumberField(AccountNo);
	bankdetails.ClickVerifyButtinweb();
	wait.WaitTime5();
	bankdetails.ClickOnProceedBtnweb();
	Thread.sleep(3000);
	bankdetails.ClickPaymentMethodweb(PaymentMethodString);
	bankdetails.ClickPreferredDrawDateweb(PreferredDrawDate);
	bankdetails.ClickSourceOfFundweb(SourceOfFunds);
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	bankdetails.ClickSaveButtonweb();

}

@Test(groups = {
		"web" }, dataProvider = "bankDetailDataProvider", dataProviderClass = DataProviders.class, description = "TEST_59 ||if user want to pay a bill through credit card, he need to click on SI Credit card opiton and have mandate to registered"
				+ "Verify that the preferred draw date is On premium due only")
public void VerifyRenewalPremiumSICreditCardWeb(String userName, String passWord, String leadID, String mobileNumber,
		String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
		String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured, String Rideramount,
		String level, String IFSCCode, String IFSCErrorMSG, String BankName, String BankNameErrorMSG, String BranchName,
		String BranchNameErrorMSG, String AccountNo, String AccountNoErrorMSG, String PaymentMethodString,
		String PreferredDrawDate, String SourceOfFunds, String BankStatus) throws InterruptedException {

	new TestFactory().gotoBankweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			quoteAmount, planOptions, smokerNonSmoker, pptOption, term, paymode, AciSumAssured, Rideramount, level);

	bankdetails.InputIFSCCode(IFSCCode);
	wait.WaitTime2();
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	bankdetails.EnterAccountNumberField(AccountNo);
	bankdetails.ClickVerifyButtinweb();
	wait.WaitTime5();
	bankdetails.ClickOnProceedBtnweb();
	Thread.sleep(3000);
	bankdetails.ClickPaymentMethodweb(PaymentMethodString);
	bankdetails.ClickPreferredDrawDateweb(PreferredDrawDate);
	bankdetails.ClickSourceOfFundweb(SourceOfFunds);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	bankdetails.ClickSaveButtonweb();

}

@Test(groups = {
		"web" }, dataProvider = "bankDetailDataProvider", dataProviderClass = DataProviders.class, description = "TEST_91 ||To check that as a sales person, I should be able to choose the repayment mode, amongst the following\n"
				+ "\n" + "1)Direct bill\n" + "2)NACH/Direct debit\n" + "3)SI on Credit card\n" + "4)ENACH"
				+ "TEST_91 ||To check If the user select NACH or ENACH, they need to select the preferred draw date from\n"
				+ "1)1\n" + "2)8\n" + "3)15\n" + "4)22"
				+ "TEST_91 ||To check the source of funds is mandatory for each option. User need to select amongst the following\n"
				+ "Others\n" + "Salary\n" + "Business income\n")
public void VerifyRenewalPremiumENACHMandateWeb(String userName, String passWord, String leadID, String mobileNumber,
		String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
		String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured, String Rideramount,
		String level, String IFSCCode, String IFSCErrorMSG, String BankName, String BankNameErrorMSG, String BranchName,
		String BranchNameErrorMSG, String AccountNo, String AccountNoErrorMSG, String PaymentMethodString,
		String PreferredDrawDate, String SourceOfFunds, String BankStatus) throws InterruptedException {

	new TestFactory().gotoBankweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			quoteAmount, planOptions, smokerNonSmoker, pptOption, term, paymode, AciSumAssured, Rideramount, level);

	bankdetails.InputIFSCCode(IFSCCode);
	Thread.sleep(2000);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	bankdetails.EnterAccountNumberField(AccountNo);
	Thread.sleep(2000);
	bankdetails.ClickVerifyButtinweb();
	Thread.sleep(4000);
	bankdetails.ClickAlertOkButtinweb();
	Thread.sleep(3000);
	bankdetails.ClickPolicyPayoutNEXTweb();
	Thread.sleep(3000);
	bankdetails.ClickPaymentMethodweb(PaymentMethodString);
	bankdetails.ClickPreferredDrawDateweb(PreferredDrawDate);
	bankdetails.ClickSourceOfFundweb(SourceOfFunds);

}

@Test(groups = {
		"web" }, dataProvider = "bankDetailDataProvider", dataProviderClass = DataProviders.class, description = "TEST_56 ||Once the user clicks on “Send register mandate link to customer”, the mandate SMS should be sent to the mobile no. registered in the application"
				+ "TEST_56 ||ENach link should be sent on Email and SMS"
				+ "TEST_56 ||The status of the mandate should be captured and displayed to the user on mandate page (Renewal Details Page) "
				+ "TEST_56 ||Verify if the user can see the e-NACH registration status as Success, Rejected or Pending")
public void VerifyENACHMandateSendLinkToClientAndStatusWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
		String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
		String Rideramount, String level, String IFSCCode, String IFSCErrorMSG, String BankName,
		String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
		String AccountNoErrorMSG, String PaymentMethodString, String PreferredDrawDate, String SourceOfFunds,
		String BankStatus) throws InterruptedException {

	new TestFactory().gotoBankweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			quoteAmount, planOptions, smokerNonSmoker, pptOption, term, paymode, AciSumAssured, Rideramount, level);

	bankdetails.InputIFSCCode(IFSCCode);
	wait.WaitTime2();
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	bankdetails.EnterAccountNumberField(AccountNo);
	bankdetails.ClickVerifyButtinweb();
	wait.WaitTime5();
	bankdetails.ClickOnProceedBtnweb();
	Thread.sleep(3000);
	bankdetails.ClickPaymentMethodweb(PaymentMethodString);
	bankdetails.ClickPreferredDrawDateweb(PreferredDrawDate);
	bankdetails.ClickSourceOfFundweb(SourceOfFunds);
	bankdetails.ClickSendLinkToClientweb();
	Thread.sleep(3000);
	String ENachLinkText = driver.findElement(By.xpath("//p[text()='E-NACH link has been successfully sent']"))
			.getText();
	Assert.assertEquals("E-NACH link has been successfully sent", ENachLinkText);
	bankdetails.ClickAlertOKButtonweb();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	bankdetails.ClickSaveButtonweb();
	TestUtil.scrollToTopOfthePage(driver);
	Thread.sleep(2000);
	bankdetails.VerifyStatusweb(BankStatus);

}


    
    
    
    @AfterMethod
    public void tearDown(){
        if (TestBase.parameterName.equalsIgnoreCase("web")) {
            driver.quit();
        }
        else if(TestBase.parameterName.equalsIgnoreCase("Android")) {
            driver1.quit();
        }
        else {
            driver1.quit();
        }

    }


}
