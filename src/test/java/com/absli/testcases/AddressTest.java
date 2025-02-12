package com.absli.testcases;

import com.absli.base.TestBase;
import com.absli.dataproviders.DataProviders;
import com.absli.pageObjects.*;


import com.absli.utils.WaitUtils;

import Utils.TestFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.TestUtil;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class AddressTest extends TestBase {

	LoginPage loginPage;
    Dashboard dashboard;
    CustomerProfile customerProfile;
    ViewQuote viewQuote;
    HealthAndPureTermsPage healthandpuretermspage;
    AddNomineePage addnomineepage;
    BankDetails bankdetails;
    AddressPage address;
    WaitUtils wait;
    public AddressTest() {
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
            bankdetails = new BankDetails(TestBase.driver);
            addnomineepage = new AddNomineePage(TestBase.driver);
            address = new AddressPage(TestBase.driver);
            wait=new WaitUtils();
            
        } else if (TestBase.parameterName.equalsIgnoreCase("Android")) {
        	 loginPage = new LoginPage(TestBase.driver1);
             dashboard = new Dashboard(TestBase.driver1);
             customerProfile = new CustomerProfile(TestBase.driver1);
             viewQuote = new ViewQuote(TestBase.driver1);
             bankdetails = new BankDetails(TestBase.driver1);
             addnomineepage = new AddNomineePage(TestBase.driver1);
             address = new AddressPage(TestBase.driver1);
             wait=new WaitUtils();
             
            
        } else {
        	 loginPage = new LoginPage(TestBase.driver2);
             dashboard = new Dashboard(TestBase.driver2);
             customerProfile = new CustomerProfile(TestBase.driver2);
             viewQuote = new ViewQuote(TestBase.driver2);
             bankdetails = new BankDetails(TestBase.driver2);
             addnomineepage = new AddNomineePage(TestBase.driver2);
             address = new AddressPage(TestBase.driver2);
             wait=new WaitUtils();
             
            
        }
    }



	@Test(groups = {
			"web" }, dataProvider = "AddressDataProvider", dataProviderClass = DataProviders.class, description = "TEST_25-Verify if User is able to navigate to Address screen || "
					+ "Verify if the user is able navigate back to Nominee page and coe back || \r\n"
					+ "Verify user is able to see Type of Address drop down and select the values")
	public void addressWeb(String userName, String passWord, String leadID, String mobileNumber, String panNumber,
			String day, String month, String year, String quoteAmount, String planOptions, String smokerNonSmoker,
			String pptOption, String term, String paymode, String AciSumAssured, String Rideramount, String level,
			String IFSCCode, String IFSCErrorMSG, String BankName, String BankNameErrorMSG, String BranchName,
			String BranchNameErrorMSG, String AccountNo, String AccountNoErrorMSG, String PaymentMethodString,
			String PreferredDrawDate, String SourceOfFunds, String BankStatus, String nomiFirstName,
			String nimiLastName, String nomiday, String nomimonth, String nomiyear, String genderValue,
			String relationshipValue, String shareValue, String shareErrorMSG, String relationshipErrorMSG,
			String firstNameErrorMSG, String lastNameErrorMSG, String removeMSG, String nomiDOBErrorMSG,
			String addressType, String pinCode, String addressOne, String addressTwo, String addressThree,
			String pinCode2, String language, String mobile, String telNo) throws InterruptedException {

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
		dashboard.checkLoaderWeb();
		wait.WaitTime2();
		// bankdetails.ClickPolicyPayoutNEXTweb();
		bankdetails.ClickPaymentMethodweb(PaymentMethodString);
		bankdetails.ClickPreferredDrawDateweb(PreferredDrawDate);
		bankdetails.ClickSourceOfFundweb(SourceOfFunds);
		TestUtil.scrollTillEndOfPage(driver);
		Thread.sleep(2000);
		bankdetails.ClickSaveButtonweb();
		Thread.sleep(3000);

		addnomineepage.clickBankDetailsNextKBtnWeb();
		dashboard.checkLoaderWeb();
		wait.WaitTime2();

		addnomineepage.enterNomineeNameWeb(nomiFirstName);
		addnomineepage.enterNomineeLastNameWeb(nimiLastName);
		addnomineepage.fillDOBdetailsAddNomineeWeb(nomiday, nomimonth, nomiyear);
		addnomineepage.SelectGenderNomineePageWeb(genderValue);
		addnomineepage.SelectRelationshipwithProposerdropdownWeb(relationshipValue);
		addnomineepage.enterNomineeShareWeb(shareValue);
		addnomineepage.clickNomineeSAVEBtnWeb();
		wait.WaitTime2();
		addnomineepage.clickNomineeNEXTBtnWeb();
		Thread.sleep(5000);
		addnomineepage.clickNomineeAddressNEXTBtnWeb();
		dashboard.checkLoaderWeb();
		wait.WaitTime2();

		address.clickHamburger();
		wait.WaitTime2();
		addnomineepage.clickNomineeNEXTBtnWeb();
		wait.WaitTime2();
		addnomineepage.clickNomineeAddressNEXTBtnWeb();
		wait.WaitTime2();
		address.clickAddressDropdownWeb();
		wait.WaitTime2();
		address.selectAddressWeb(addressType);

	}


	@Test(groups = {
			"web" }, dataProvider = "AddressDataProvider", dataProviderClass = DataProviders.class, description = "User able to enter 6 digit Pin Code || City Name should be Auto populate")

	public void enterPinCodeWeb(String userName, String passWord, String leadID, String mobileNumber, String panNumber,
			String day, String month, String year, String quoteAmount, String planOptions, String smokerNonSmoker,
			String pptOption, String term, String paymode, String AciSumAssured, String Rideramount, String level,
			String IFSCCode, String IFSCErrorMSG, String BankName, String BankNameErrorMSG, String BranchName,
			String BranchNameErrorMSG, String AccountNo, String AccountNoErrorMSG, String PaymentMethodString,
			String PreferredDrawDate, String SourceOfFunds, String BankStatus, String nomiFirstName,
			String nimiLastName, String nomiday, String nomimonth, String nomiyear, String genderValue,
			String relationshipValue, String shareValue, String shareErrorMSG, String relationshipErrorMSG,
			String firstNameErrorMSG, String lastNameErrorMSG, String removeMSG, String nomiDOBErrorMSG,
			String addressType, String pinCode, String addressOne, String addressTwo, String addressThree,
			String pinCode2, String language, String mobile, String telNo) throws InterruptedException {

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
		dashboard.checkLoaderWeb();
		wait.WaitTime2();
		// bankdetails.ClickPolicyPayoutNEXTweb();
		bankdetails.ClickPaymentMethodweb(PaymentMethodString);
		bankdetails.ClickPreferredDrawDateweb(PreferredDrawDate);
		bankdetails.ClickSourceOfFundweb(SourceOfFunds);
		TestUtil.scrollTillEndOfPage(driver);
		Thread.sleep(2000);
		bankdetails.ClickSaveButtonweb();
		Thread.sleep(3000);

		addnomineepage.clickBankDetailsNextKBtnWeb();
		dashboard.checkLoaderWeb();
		wait.WaitTime2();

		addnomineepage.enterNomineeNameWeb(nomiFirstName);
		addnomineepage.enterNomineeLastNameWeb(nimiLastName);
		addnomineepage.fillDOBdetailsAddNomineeWeb(nomiday, nomimonth, nomiyear);
		addnomineepage.SelectGenderNomineePageWeb(genderValue);
		addnomineepage.SelectRelationshipwithProposerdropdownWeb(relationshipValue);
		addnomineepage.enterNomineeShareWeb(shareValue);
		addnomineepage.clickNomineeSAVEBtnWeb();
		wait.WaitTime2();
		addnomineepage.clickNomineeNEXTBtnWeb();
		Thread.sleep(5000);
		addnomineepage.clickNomineeAddressNEXTBtnWeb();
		dashboard.checkLoaderWeb();
		wait.WaitTime2();

		address.clickHamburger();
		wait.WaitTime2();
		addnomineepage.clickNomineeNEXTBtnWeb();
		wait.WaitTime2();
		addnomineepage.clickNomineeAddressNEXTBtnWeb();
		wait.WaitTime2();
		address.clickAddressDropdownWeb();
		wait.WaitTime2();
		address.selectAddressWeb(addressType);
		Thread.sleep(1000);
		// address.selectAddressWeb(addressType);
		address.enterPinWeb(pinCode);
		Thread.sleep(1000);
		address.greenTickWeb();
		address.cityNameAutopopulateWeb();
		address.validateAddressOneWeb();
		address.validateAddressTwoWeb();
		address.validateAddressThreeWeb();

	}

@Test(groups = {"web"}, dataProvider = "AddressDataProvider", dataProviderClass = DataProviders.class,
description = "Validate pincode error message")

public void validatePinCodeWeb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethodString,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo) throws InterruptedException {


	new TestFactory().gotoBankweb(driver, userName,  passWord,  leadID,  mobileNumber,
            panNumber,  day,  month,  year,  quoteAmount,  planOptions,
            smokerNonSmoker,  pptOption,  term,  paymode, 
            AciSumAssured,  Rideramount, level);
   
	bankdetails.InputIFSCCode(IFSCCode);
	wait.WaitTime2();
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	bankdetails.EnterAccountNumberField(AccountNo);
	bankdetails.ClickVerifyButtinweb();
	wait.WaitTime5();
	bankdetails.ClickOnProceedBtnweb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
	// bankdetails.ClickPolicyPayoutNEXTweb();
	bankdetails.ClickPaymentMethodweb(PaymentMethodString);
	bankdetails.ClickPreferredDrawDateweb(PreferredDrawDate);
	bankdetails.ClickSourceOfFundweb(SourceOfFunds);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	bankdetails.ClickSaveButtonweb();
	Thread.sleep(3000);

	addnomineepage.clickBankDetailsNextKBtnWeb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();

	addnomineepage.enterNomineeNameWeb(nomiFirstName);
	addnomineepage.enterNomineeLastNameWeb(nimiLastName);
	addnomineepage.fillDOBdetailsAddNomineeWeb(nomiday, nomimonth, nomiyear);
	addnomineepage.SelectGenderNomineePageWeb(genderValue);
	addnomineepage.SelectRelationshipwithProposerdropdownWeb(relationshipValue);
	addnomineepage.enterNomineeShareWeb(shareValue);
	addnomineepage.clickNomineeSAVEBtnWeb();
	wait.WaitTime2();
	addnomineepage.clickNomineeNEXTBtnWeb();
	Thread.sleep(5000);
	addnomineepage.clickNomineeAddressNEXTBtnWeb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
    address.clickAddressDropdownWeb();
    Thread.sleep(1000);
    address.selectAddressWeb(addressType);
   
    //address.selectAddressWeb("addressType");
    address.enterPinWeb(pinCode);
    Thread.sleep(1000);
    address.validateErrorPinCodeWeb(pinCode);
    
    
   
  }

@Test(groups = {"web"}, dataProvider = "AddressDataProvider", dataProviderClass = DataProviders.class,
description = "Verify user able to add only this  special characters (, / - & ( ) and space is allowed in Address 1 Field. || User should be able to add only this special characters (, / - & ( ) and space is allowed in Address 2 Field. || User should be able to add only this special characters (, / - & ( ) and space is allowed in Address 3 Field.")

public void specialCharAllowAddressWeb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethodString,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo) throws InterruptedException {

	new TestFactory().gotoBankweb(driver, userName,  passWord,  leadID,  mobileNumber,
            panNumber,  day,  month,  year,  quoteAmount,  planOptions,
            smokerNonSmoker,  pptOption,  term,  paymode, 
            AciSumAssured,  Rideramount, level);
   
	bankdetails.InputIFSCCode(IFSCCode);
	wait.WaitTime2();
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	bankdetails.EnterAccountNumberField(AccountNo);
	bankdetails.ClickVerifyButtinweb();
	wait.WaitTime5();
	bankdetails.ClickOnProceedBtnweb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
	// bankdetails.ClickPolicyPayoutNEXTweb();
	bankdetails.ClickPaymentMethodweb(PaymentMethodString);
	bankdetails.ClickPreferredDrawDateweb(PreferredDrawDate);
	bankdetails.ClickSourceOfFundweb(SourceOfFunds);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	bankdetails.ClickSaveButtonweb();
	Thread.sleep(3000);

	addnomineepage.clickBankDetailsNextKBtnWeb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();

	addnomineepage.enterNomineeNameWeb(nomiFirstName);
	addnomineepage.enterNomineeLastNameWeb(nimiLastName);
	addnomineepage.fillDOBdetailsAddNomineeWeb(nomiday, nomimonth, nomiyear);
	addnomineepage.SelectGenderNomineePageWeb(genderValue);
	addnomineepage.SelectRelationshipwithProposerdropdownWeb(relationshipValue);
	addnomineepage.enterNomineeShareWeb(shareValue);
	addnomineepage.clickNomineeSAVEBtnWeb();
	wait.WaitTime2();
	addnomineepage.clickNomineeNEXTBtnWeb();
	Thread.sleep(5000);
	addnomineepage.clickNomineeAddressNEXTBtnWeb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
    address.clickAddressDropdownWeb();
    Thread.sleep(1000);
    address.selectAddressWeb(addressType);
    
    Thread.sleep(1000);
    //address.selectAddressWeb("addressType");
    Thread.sleep(1000);
    address.enterPinWeb(pinCode);
    Thread.sleep(1000);
    address.validationAddressOneWeb(addressOne);
    address.validationAddressTwoWeb(addressTwo);
    address.validationAddressThreeWeb(addressThree);
    TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
    address.ClickOnAddressNextBTN();
    
   
  }


@Test(groups = {"web"}, dataProvider = "AddressDataProvider", dataProviderClass = DataProviders.class,
description = "Verify user do not able to add other special characters in Address  Field || User Shouldn't  be  able to add other special characters in Address 2 Field || User Shouldn't  be  able to add other special characters in Address 3 Field")

public void specialCharNotAllowAddressWeb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethodString,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo) throws InterruptedException {
	new TestFactory().gotoBankweb(driver, userName,  passWord,  leadID,  mobileNumber,
            panNumber,  day,  month,  year,  quoteAmount,  planOptions,
            smokerNonSmoker,  pptOption,  term,  paymode, 
            AciSumAssured,  Rideramount, level);
   
	bankdetails.InputIFSCCode(IFSCCode);
	wait.WaitTime2();
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	bankdetails.EnterAccountNumberField(AccountNo);
	bankdetails.ClickVerifyButtinweb();
	wait.WaitTime5();
	bankdetails.ClickOnProceedBtnweb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
	// bankdetails.ClickPolicyPayoutNEXTweb();
	bankdetails.ClickPaymentMethodweb(PaymentMethodString);
	bankdetails.ClickPreferredDrawDateweb(PreferredDrawDate);
	bankdetails.ClickSourceOfFundweb(SourceOfFunds);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	bankdetails.ClickSaveButtonweb();
	Thread.sleep(3000);

	addnomineepage.clickBankDetailsNextKBtnWeb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();

	addnomineepage.enterNomineeNameWeb(nomiFirstName);
	addnomineepage.enterNomineeLastNameWeb(nimiLastName);
	addnomineepage.fillDOBdetailsAddNomineeWeb(nomiday, nomimonth, nomiyear);
	addnomineepage.SelectGenderNomineePageWeb(genderValue);
	addnomineepage.SelectRelationshipwithProposerdropdownWeb(relationshipValue);
	addnomineepage.enterNomineeShareWeb(shareValue);
	addnomineepage.clickNomineeSAVEBtnWeb();
	wait.WaitTime2();
	addnomineepage.clickNomineeNEXTBtnWeb();
	Thread.sleep(5000);
	addnomineepage.clickNomineeAddressNEXTBtnWeb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
    
    address.clickAddressDropdownWeb();
    address.selectAddressWeb(addressType);
    
    Thread.sleep(1000);
    address.enterPinWeb(pinCode);
    Thread.sleep(1000);
    address.invalidationAddressOneWeb(addressOne);
    address.invalidationAddressTwoWeb(addressTwo);
    address.invalidationAddressThreeWeb(addressThree);
    
    
   
  }


@Test(groups = {"web"}, dataProvider = "AddressDataProvider", dataProviderClass = DataProviders.class,
description = "Verify Premanet Address section check box is selected")

public void permanentAddressCheckboxWeb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethodString,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo) throws InterruptedException {
  
	new TestFactory().gotoBankweb(driver, userName,  passWord,  leadID,  mobileNumber,
            panNumber,  day,  month,  year,  quoteAmount,  planOptions,
            smokerNonSmoker,  pptOption,  term,  paymode, 
            AciSumAssured,  Rideramount, level);
   
	bankdetails.InputIFSCCode(IFSCCode);
	wait.WaitTime2();
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	bankdetails.EnterAccountNumberField(AccountNo);
	bankdetails.ClickVerifyButtinweb();
	wait.WaitTime5();
	bankdetails.ClickOnProceedBtnweb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
	// bankdetails.ClickPolicyPayoutNEXTweb();
	bankdetails.ClickPaymentMethodweb(PaymentMethodString);
	bankdetails.ClickPreferredDrawDateweb(PreferredDrawDate);
	bankdetails.ClickSourceOfFundweb(SourceOfFunds);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	bankdetails.ClickSaveButtonweb();
	Thread.sleep(3000);

	addnomineepage.clickBankDetailsNextKBtnWeb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();

	addnomineepage.enterNomineeNameWeb(nomiFirstName);
	addnomineepage.enterNomineeLastNameWeb(nimiLastName);
	addnomineepage.fillDOBdetailsAddNomineeWeb(nomiday, nomimonth, nomiyear);
	addnomineepage.SelectGenderNomineePageWeb(genderValue);
	addnomineepage.SelectRelationshipwithProposerdropdownWeb(relationshipValue);
	addnomineepage.enterNomineeShareWeb(shareValue);
	addnomineepage.clickNomineeSAVEBtnWeb();
	wait.WaitTime2();
	addnomineepage.clickNomineeNEXTBtnWeb();
	Thread.sleep(5000);
	addnomineepage.clickNomineeAddressNEXTBtnWeb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
    address.clickAddressDropdownWeb();
    address.selectAddressWeb(addressType);
    
    //address.selectAddressWeb("addressType");
    Thread.sleep(1000);
    address.enterPinWeb(pinCode);
	
    Thread.sleep(1000);
    address.isSelectedCheckboxWeb();
}

@Test(groups = {"web"}, dataProvider = "AddressDataProvider", dataProviderClass = DataProviders.class,
description = "Verify OTHER COMMUNICATION INFO || Section should contain preferred language, Alternate Mobile No. and tel No. ")

public void otherCommunicationInfoWeb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethodString,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo) throws InterruptedException {

	new TestFactory().gotoBankweb(driver, userName,  passWord,  leadID,  mobileNumber,
            panNumber,  day,  month,  year,  quoteAmount,  planOptions,
            smokerNonSmoker,  pptOption,  term,  paymode, 
            AciSumAssured,  Rideramount, level);
   
	bankdetails.InputIFSCCode(IFSCCode);
	wait.WaitTime2();
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	bankdetails.EnterAccountNumberField(AccountNo);
	bankdetails.ClickVerifyButtinweb();
	wait.WaitTime5();
	bankdetails.ClickOnProceedBtnweb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
	// bankdetails.ClickPolicyPayoutNEXTweb();
	bankdetails.ClickPaymentMethodweb(PaymentMethodString);
	bankdetails.ClickPreferredDrawDateweb(PreferredDrawDate);
	bankdetails.ClickSourceOfFundweb(SourceOfFunds);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	bankdetails.ClickSaveButtonweb();
	Thread.sleep(3000);

	addnomineepage.clickBankDetailsNextKBtnWeb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();

	addnomineepage.enterNomineeNameWeb(nomiFirstName);
	addnomineepage.enterNomineeLastNameWeb(nimiLastName);
	addnomineepage.fillDOBdetailsAddNomineeWeb(nomiday, nomimonth, nomiyear);
	addnomineepage.SelectGenderNomineePageWeb(genderValue);
	addnomineepage.SelectRelationshipwithProposerdropdownWeb(relationshipValue);
	addnomineepage.enterNomineeShareWeb(shareValue);
	addnomineepage.clickNomineeSAVEBtnWeb();
	wait.WaitTime2();
	addnomineepage.clickNomineeNEXTBtnWeb();
	Thread.sleep(5000);
	addnomineepage.clickNomineeAddressNEXTBtnWeb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
    address.clickAddressDropdownWeb();
    address.selectAddressWeb(addressType);

    //address.selectAddressWeb("addressType");
    address.enterPinWeb(pinCode);
    Thread.sleep(2000);
    address.validationAddressOneWeb(addressOne);
    address.validationAddressTwoWeb(addressTwo);
    address.validationAddressThreeWeb(addressThree);
    Thread.sleep(2000);
    address.selectPreferredLangWeb(language);
    Thread.sleep(2000);
    address.selectAlternateMobileNoWeb(mobile);
    Thread.sleep(2000);
    address.selectTelPhoneNoWeb(telNo);
    TestUtil.scrollTillEndOfPage(driver);
   	Thread.sleep(2000);
     address.ClickOnAddressNextBTN();
}


@Test(groups = {"web"}, dataProvider = "AddressDataProvider", dataProviderClass = DataProviders.class,
description = "Check box not selected then Follow Step 7")

public void unselectAddressCheckboxWeb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethodString,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo) throws InterruptedException {

	new TestFactory().gotoBankweb(driver, userName,  passWord,  leadID,  mobileNumber,
            panNumber,  day,  month,  year,  quoteAmount,  planOptions,
            smokerNonSmoker,  pptOption,  term,  paymode, 
            AciSumAssured,  Rideramount, level);
   
	bankdetails.InputIFSCCode(IFSCCode);
	wait.WaitTime2();
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	bankdetails.EnterAccountNumberField(AccountNo);
	bankdetails.ClickVerifyButtinweb();
	wait.WaitTime5();
	bankdetails.ClickOnProceedBtnweb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
	// bankdetails.ClickPolicyPayoutNEXTweb();
	bankdetails.ClickPaymentMethodweb(PaymentMethodString);
	bankdetails.ClickPreferredDrawDateweb(PreferredDrawDate);
	bankdetails.ClickSourceOfFundweb(SourceOfFunds);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	bankdetails.ClickSaveButtonweb();
	Thread.sleep(3000);

	addnomineepage.clickBankDetailsNextKBtnWeb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();

	addnomineepage.enterNomineeNameWeb(nomiFirstName);
	addnomineepage.enterNomineeLastNameWeb(nimiLastName);
	addnomineepage.fillDOBdetailsAddNomineeWeb(nomiday, nomimonth, nomiyear);
	addnomineepage.SelectGenderNomineePageWeb(genderValue);
	addnomineepage.SelectRelationshipwithProposerdropdownWeb(relationshipValue);
	addnomineepage.enterNomineeShareWeb(shareValue);
	addnomineepage.clickNomineeSAVEBtnWeb();
	wait.WaitTime2();
	addnomineepage.clickNomineeNEXTBtnWeb();
	Thread.sleep(5000);
	addnomineepage.clickNomineeAddressNEXTBtnWeb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
    address.clickAddressDropdownWeb();
    Thread.sleep(1000);
    address.selectAddressWeb(addressType);
   
    //address.selectAddressWeb("addressType");
    address.enterPinWeb(pinCode);
    Thread.sleep(1000);
    address.validationAddressOneWeb(addressOne);
    address.validationAddressTwoWeb(addressTwo);
    address.validationAddressThreeWeb(addressThree);
    address.unselectCheckboxWeb();
    Thread.sleep(1000);
    address.enterPerAddPinCodeWeb(pinCode2);
    wait.WaitTime2();
    address.perAddGreentickCityStateWeb();
    wait.WaitTime2();
    address.selectPreferredLangWeb(language);
    address.selectAlternateMobileNoWeb(mobile);
    address.selectTelPhoneNoWeb(telNo);
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


        