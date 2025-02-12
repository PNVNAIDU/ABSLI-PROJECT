package com.absli.testcases;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.absli.Listner.CustomListner;
import com.absli.base.TestBase;
import com.absli.dataproviders.DataProviders;
import com.absli.pageObjects.AddNomineePage;
import com.absli.pageObjects.AddressPage;
import com.absli.pageObjects.BankDetails;
import com.absli.pageObjects.CustomerProfile;
import com.absli.pageObjects.Dashboard;
import com.absli.pageObjects.HealthAndPureTermsPage;
import com.absli.pageObjects.LoginPage;
import com.absli.pageObjects.PersonalInfo;
import com.absli.pageObjects.ViewQuote;
import com.absli.utils.WaitUtils;
import com.relevantcodes.extentreports.LogStatus;

import Utils.TestFactory;
import util.TestUtil;

public class PersonalInfoTest extends TestBase {

	LoginPage loginPage;
    Dashboard dashboard;
    CustomerProfile customerProfile;
    ViewQuote viewQuote;
    HealthAndPureTermsPage healthandpuretermspage;
    AddNomineePage addnomineepage;
    BankDetails bankdetails;
    AddressPage address;
    PersonalInfo personalinfo;
    WaitUtils wait;
    public PersonalInfoTest() {
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
          personalinfo=new PersonalInfo(TestBase.driver);
          wait=new WaitUtils();
            
        } else if (TestBase.parameterName.equalsIgnoreCase("Android")) {
        	 loginPage = new LoginPage(TestBase.driver1);
             dashboard = new Dashboard(TestBase.driver1);
             customerProfile = new CustomerProfile(TestBase.driver1);
             viewQuote = new ViewQuote(TestBase.driver1);
             bankdetails = new BankDetails(TestBase.driver1);
             addnomineepage = new AddNomineePage(TestBase.driver1);
             address = new AddressPage(TestBase.driver1);
             personalinfo=new PersonalInfo(TestBase.driver1);
             wait=new WaitUtils();
             
            
        } else {
        	 loginPage = new LoginPage(TestBase.driver2);
             dashboard = new Dashboard(TestBase.driver2);
             customerProfile = new CustomerProfile(TestBase.driver2);
             viewQuote = new ViewQuote(TestBase.driver2);
             bankdetails = new BankDetails(TestBase.driver2);
             addnomineepage = new AddNomineePage(TestBase.driver2);
             address = new AddressPage(TestBase.driver2);
             personalinfo=new PersonalInfo(TestBase.driver2);
             wait=new WaitUtils();
             
            
        }
    }
	
	

@Test(groups = {"web"}, dataProvider = "PersonalInfoPageDataProvider", dataProviderClass = DataProviders.class,
description = "Test-150||Validate Whether Customer is able to click existing Policy"
		+ "Test-150||Verify Customer is able to click on Add Existing Policy1 (+)"
		+ " 1 Name of insurer"
		+ " 2 Sum assured "
		+ " 3 Policy Number "
		+ " 4 Year of Issue/Application "
		+ " 5 Annual Premium"
		+ " 6 Base Plan/Rider Decision "
		+ " 7 Policy Status 8 Medical Policy"
		+ "Test-150||User is able to Move or Navigate to others Features Without selecting EXISITING POLICY DETAILS")

public void UserAbleNevigateToExistingPageWeb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethod,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo,
        String insurerName,String sumAssured ,String policyNumber ,String yearOfApplication ,String basePlan ,String annualPremium ,String policyStatus,String medicalPolicy,String policyReason,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,String provideDetailsErrorMSG,String selectCountryErrorMSG,
        String identificationErrorMSG, String Emaild,String EmailIDErrorMSG,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
        String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String fatherSpouseNameErrorMsg,String motherNameErrorMsg
        ,String maidenNameErrorMsg,String Other,String ParentAnnualIncome,String ParentInsuranceCover,String Gstvalue) throws InterruptedException {

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
	bankdetails.ClickPaymentMethodweb(PaymentMethod);
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
	wait.WaitTime5();
	addnomineepage.clickNomineeAddressNEXTBtnWeb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
    address.clickAddressDropdownWeb();
    address.selectAddressWeb(addressType);
  
    address.enterPinWeb(pinCode);
    wait.WaitTime2();
    address.validationAddressOneWeb(addressOne);
    address.selectPreferredLangWeb(language);
    address.selectAlternateMobileNoWeb(mobile);
    TestUtil.scrollTillEndOfPage(driver);
    address.selectTelPhoneNoWeb(telNo);
   // address.ClickSaveBTNWeb();
    address.ClickAddressNEXTBTNWeb();
    dashboard.checkLoaderWeb();
    wait.WaitTime2();
    TestUtil.scrollTillEndOfPage(driver);
    wait.WaitTime2();
    personalinfo.clickpersonalinfoDOITLETTERBtnWeb();
    dashboard.checkLoaderWeb();
    wait.WaitTime2();
    personalinfo.VerifyExstingPolicyPageWeb();
    personalinfo.clickAddExstingPolicyBtnWeb();
    personalinfo.verifyAllExstingPolicyWeb();
    
    
}




@Test(groups = {"web"}, dataProvider = "PersonalInfoPageDataProvider", dataProviderClass = DataProviders.class,
description = "Test-150||Validate that user can enter insurer name"
		+ "Test-150||it should allow max of 50 chracters"
		+ "Test-150||Validate the Sum assured - Mandatory - 10 Numeric"
		+ "Test-150|| Validate the Policy Number - Optional - 15 Alphanumeric  "
		+ "Test-150||Validate the Year of Issue/Application - Optional - 15 Alphanumeric  "
		+ "Test-150|| Validate the Annual Premium - Optional - 10 Numeric "
		+ "Test-150|| Validate the Base Plan/Rider Decision - Optional - 50 Characters "
		+ "Test-150|| Validate the Policy Status - Optional - 50 Characters "
		+ "Test-150|| validate Medical Policy - YES/NO ")

public void VerifyEnterAllFieldONExistingPageWeb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethod,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo,
        String insurerName,String sumAssured ,String policyNumber ,String yearOfApplication ,String basePlan ,String annualPremium ,String policyStatus,String medicalPolicy,String policyReason,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,String provideDetailsErrorMSG,String selectCountryErrorMSG,
        String identificationErrorMSG, String Emaild,String EmailIDErrorMSG,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
        String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String fatherSpouseNameErrorMsg,String motherNameErrorMsg
        ,String maidenNameErrorMsg,String Other,String ParentAnnualIncome,String ParentInsuranceCover,String Gstvalue) throws InterruptedException {

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
	bankdetails.ClickPaymentMethodweb(PaymentMethod);
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
	wait.WaitTime5();
	addnomineepage.clickNomineeAddressNEXTBtnWeb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
    address.clickAddressDropdownWeb();
    address.selectAddressWeb(addressType);
  
    address.enterPinWeb(pinCode);
    wait.WaitTime2();
    address.validationAddressOneWeb(addressOne);
    address.selectPreferredLangWeb(language);
    address.selectAlternateMobileNoWeb(mobile);
    TestUtil.scrollTillEndOfPage(driver);
    address.selectTelPhoneNoWeb(telNo);
   // address.ClickSaveBTNWeb();
    address.ClickAddressNEXTBTNWeb();
    dashboard.checkLoaderWeb();
    wait.WaitTime2();
    TestUtil.scrollTillEndOfPage(driver);
    wait.WaitTime2();
    personalinfo.clickpersonalinfoDOITLETTERBtnWeb();
    dashboard.checkLoaderWeb();
    wait.WaitTime2();
    personalinfo.VerifyExstingPolicyPageWeb();
    wait.WaitTime2();
    personalinfo.clickAddExstingPolicyBtnWeb();
    wait.WaitTime2();
    personalinfo.EnterInsurerNameONExstingPolicyWeb(insurerName);
    personalinfo.EnterSumAssuredONExstingPolicyWeb(sumAssured);
    personalinfo.EnterPolicyNumberONExstingPolicyWeb(policyNumber);
    personalinfo.EnterYearOfApplicationONExstingPolicyWeb(yearOfApplication);
    personalinfo.EnterBasePlanONExstingPolicyWeb(basePlan);
    personalinfo.EnterAnnualpremiumONExstingPolicyWeb(annualPremium);
    TestUtil.scrollTillEndOfPage(driver);
    Thread.sleep(2000);
    personalinfo.EnterPolicyStatusONExstingPolicyWeb(policyStatus);
    personalinfo.clickMedicalPolicyBtnWeb(medicalPolicy);
    Thread.sleep(2000);
}







@Test(groups = {"web"}, dataProvider = "PersonalInfoPageDataProvider", dataProviderClass = DataProviders.class,
description = "Test-150||Verify that the user can add up to 5 such policies "
		+ "Test-151||Verify that upto 5 policies can be added")

public void UserCanAddedFivePolicyONExistingPageWeb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethod,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo,
        String insurerName,String sumAssured ,String policyNumber ,String yearOfApplication ,String basePlan ,String annualPremium ,String policyStatus,String medicalPolicy,String policyReason,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,String provideDetailsErrorMSG,String selectCountryErrorMSG,
        String identificationErrorMSG, String Emaild,String EmailIDErrorMSG,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
        String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String fatherSpouseNameErrorMsg,String motherNameErrorMsg
        ,String maidenNameErrorMsg,String Other,String ParentAnnualIncome,String ParentInsuranceCover,String Gstvalue) throws InterruptedException {

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
	bankdetails.ClickPaymentMethodweb(PaymentMethod);
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
	wait.WaitTime5();
	addnomineepage.clickNomineeAddressNEXTBtnWeb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
    address.clickAddressDropdownWeb();
    address.selectAddressWeb(addressType);
  
    address.enterPinWeb(pinCode);
    wait.WaitTime2();
    address.validationAddressOneWeb(addressOne);
    address.selectPreferredLangWeb(language);
    address.selectAlternateMobileNoWeb(mobile);
    TestUtil.scrollTillEndOfPage(driver);
    address.selectTelPhoneNoWeb(telNo);
   // address.ClickSaveBTNWeb();
    address.ClickAddressNEXTBTNWeb();
    dashboard.checkLoaderWeb();
    wait.WaitTime2();
    TestUtil.scrollTillEndOfPage(driver);
    wait.WaitTime2();
    personalinfo.clickpersonalinfoDOITLETTERBtnWeb();
    dashboard.checkLoaderWeb();
    wait.WaitTime2();
    personalinfo.VerifyExstingPolicyPageWeb();
    personalinfo.clickAddExstingPolicyBtnWeb();

    personalinfo.EnterInsurerNameONExstingPolicyWeb(insurerName);
    personalinfo.EnterSumAssuredONExstingPolicyWeb(sumAssured);
    personalinfo.EnterPolicyNumberONExstingPolicyWeb(policyNumber);
    personalinfo.EnterYearOfApplicationONExstingPolicyWeb(yearOfApplication);
    personalinfo.EnterBasePlanONExstingPolicyWeb(basePlan);
    personalinfo.EnterAnnualpremiumONExstingPolicyWeb(annualPremium);
   // TestUtil.scrollTillEndOfPage(driver);
    Thread.sleep(2000);
    personalinfo.EnterPolicyStatusONExstingPolicyWeb(policyStatus);
    personalinfo.clickMedicalPolicyBtnWeb(medicalPolicy);
    personalinfo.clickSaveExstingPolicyBtnWeb();
    dashboard.checkLoaderWeb();
    wait.WaitTime2();
    personalinfo.clickAddExstingPolicyBtnWeb();
    wait.WaitTime2();
    personalinfo.EnterAddedTwoExstingPolicyWeb(insurerName, sumAssured, policyNumber, yearOfApplication,
    		basePlan, annualPremium, policyStatus, medicalPolicy);
  
    Thread.sleep(2000);
    personalinfo.clickAddExstingPolicyBtnWeb();
    Thread.sleep(2000);
    personalinfo.EnterAddedThirdExstingPolicyWeb(insurerName, sumAssured, policyNumber, yearOfApplication, 
    		basePlan, annualPremium, policyStatus,medicalPolicy);
    personalinfo.clickAddExstingPolicyBtnWeb();
    Thread.sleep(2000);
    personalinfo.EnterAddedFoureExstingPolicyWeb(insurerName, sumAssured, policyNumber, yearOfApplication,
    		basePlan, annualPremium, policyStatus, medicalPolicy);
    personalinfo.clickAddExstingPolicyBtnWeb();
    Thread.sleep(2000);
    personalinfo.EnterAddedFiveExstingPolicyWeb(insurerName, sumAssured, policyNumber, yearOfApplication,
    		basePlan, annualPremium, policyStatus, medicalPolicy);
}






@Test(groups = {"web"}, dataProvider = "PersonalInfoPageDataProvider", dataProviderClass = DataProviders.class,
description = "Test-151||Capture if the customer has any policy that has been rejected, Withdrawn, Declined or Postponed"
		+ "If yes, then capture below details                            "
		+ " Name of insurer - 50 Characters"
		+ "Sum assured - 10 Digits"
		+ "Reason - 50 Characters"	
		+ "Test-151||Verify that upto 5 policies can be added")

public void UserCanAddedFivePolicyOnRefusedPolicyWeb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethod,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo,
        String insurerName,String sumAssured ,String policyNumber ,String yearOfApplication ,String basePlan ,String annualPremium ,String policyStatus,String medicalPolicy,String policyReason,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,String provideDetailsErrorMSG,String selectCountryErrorMSG,
        String identificationErrorMSG, String Emaild,String EmailIDErrorMSG,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
        String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String fatherSpouseNameErrorMsg,String motherNameErrorMsg
        ,String maidenNameErrorMsg,String Other,String ParentAnnualIncome,String ParentInsuranceCover,String Gstvalue) throws InterruptedException {

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
	bankdetails.ClickPaymentMethodweb(PaymentMethod);
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
	wait.WaitTime5();
	addnomineepage.clickNomineeAddressNEXTBtnWeb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
    address.clickAddressDropdownWeb();
    address.selectAddressWeb(addressType);
  
    address.enterPinWeb(pinCode);
    wait.WaitTime2();
    address.validationAddressOneWeb(addressOne);
    address.selectPreferredLangWeb(language);
    address.selectAlternateMobileNoWeb(mobile);
    TestUtil.scrollTillEndOfPage(driver);
    address.selectTelPhoneNoWeb(telNo);
   // address.ClickSaveBTNWeb();
    address.ClickAddressNEXTBTNWeb();
    dashboard.checkLoaderWeb();
    wait.WaitTime2();
    TestUtil.scrollTillEndOfPage(driver);
    wait.WaitTime2();
    personalinfo.clickpersonalinfoDOITLETTERBtnWeb();
    dashboard.checkLoaderWeb();
    wait.WaitTime2();
    personalinfo.clickAddRefusedPolicyBtnWeb();
    Thread.sleep(2000);
    personalinfo.EnterInsurerNameONRefusedPolicyWeb(insurerName);
    personalinfo.EnterSumAssuredONRefusedPolicyWeb(sumAssured);
    personalinfo.EnterReasonONRefusedPolicyWeb(policyReason);
    TestUtil.scrollTillEndOfPage(driver);
    personalinfo.clickSaveOnRefusedPolicyBtnWeb();
    Thread.sleep(2000);
    personalinfo.clickAddRefusedPolicyBtnWeb();
    Thread.sleep(2000);
    personalinfo.EnterAddedTwoRefusedPolicyWeb(insurerName, sumAssured, policyReason);
    TestUtil.scrollTillEndOfPage(driver);
    personalinfo.clickSaveOntwoRefusedPolicyBtnWeb();
    Thread.sleep(2000);
    personalinfo.clickAddRefusedPolicyBtnWeb();
    Thread.sleep(2000);
    personalinfo.EnterAddedThirdRefusedPolicyWeb(insurerName, sumAssured, policyReason);
    TestUtil.scrollTillEndOfPage(driver);
    personalinfo.clickSaveThirdONRefusedPolicyBtnWeb();
    personalinfo.clickAddRefusedPolicyBtnWeb();
    Thread.sleep(2000);
    personalinfo.EnterAddedFourRefusedPolicyWeb(insurerName, sumAssured, policyReason);
    Thread.sleep(2000);
    TestUtil.scrollTillEndOfPage(driver);
    personalinfo.clickSavefourthONRefusedPolicyBtnWeb();
    personalinfo.clickAddRefusedPolicyBtnWeb();
    Thread.sleep(2000);
    personalinfo.EnterAddedFiveRefusedPolicyWeb(insurerName, sumAssured, policyReason);
    TestUtil.scrollTillEndOfPage(driver);
    personalinfo.clickSaveFifthONRefusedPolicyBtnWeb();
   
    
}











@Test(groups = {"web"}, dataProvider = "PersonalInfoPageDataProvider", dataProviderClass = DataProviders.class,
description = "Test-149||Validate  that the Purpose of insurance is taken from the LOVs - If PSM is not done then it needs to be manually selected. IF PSM is done then appropriate value will be autochecked - "
		+ "Only 3 can be selected")

public void UserSelectProposeOfInsuranceWeb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethod,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo,
        String insurerName,String sumAssured ,String policyNumber ,String yearOfApplication ,String basePlan ,String annualPremium ,String policyStatus,String medicalPolicy,String policyReason,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,String provideDetailsErrorMSG,String selectCountryErrorMSG,
        String identificationErrorMSG, String Emaild,String EmailIDErrorMSG,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
        String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String fatherSpouseNameErrorMsg,String motherNameErrorMsg
        ,String maidenNameErrorMsg,String Other,String ParentAnnualIncome,String ParentInsuranceCover,String Gstvalue) throws InterruptedException {

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
	bankdetails.ClickPaymentMethodweb(PaymentMethod);
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
	wait.WaitTime5();
	addnomineepage.clickNomineeAddressNEXTBtnWeb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
    address.clickAddressDropdownWeb();
    address.selectAddressWeb(addressType);
  
    address.enterPinWeb(pinCode);
    wait.WaitTime2();
    address.validationAddressOneWeb(addressOne);
    address.selectPreferredLangWeb(language);
    address.selectAlternateMobileNoWeb(mobile);
    TestUtil.scrollTillEndOfPage(driver);
    address.selectTelPhoneNoWeb(telNo);
   // address.ClickSaveBTNWeb();
    address.ClickAddressNEXTBTNWeb();
    dashboard.checkLoaderWeb();
    wait.WaitTime5();
    TestUtil.scrollTillEndOfPage(driver);
    wait.WaitTime2();
    personalinfo.clickpersonalinfoDOITLETTERBtnWeb();
    dashboard.checkLoaderWeb();
    wait.WaitTime2();
    personalinfo.clickpersonalinfoExstingPageDOITLETTERBtnWeb();
    wait.WaitTime2();
    personalinfo.ClickSelectProposeOfInsuranceWeb(purposeOfInsuValue1, purposeOfInsuValue2, purposeOfInsuValue3);
}
//===================complite exsting policy and Refused policy By vijay======================

@Test(groups = {"web"}, dataProvider = "PersonalInfoPageDataProvider", dataProviderClass = DataProviders.class,
description = "1)User should be able  to see State whether the Proposer/ To be insured/ Nominee Are Political exposed question click on YES."
		+ "2)User should be able see State whether the Proposer/ To be insured/ Nominee Are Political exposed question should be in blank, when click on save and continue button. then message is showing in below \"Please enter ")

public void UserSelectStateOfProposerBlankWeb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethod,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo,
        String insurerName,String sumAssured ,String policyNumber ,String yearOfApplication ,String basePlan ,String annualPremium ,String policyStatus,String medicalPolicy,String policyReason,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,String provideDetailsErrorMSG,String selectCountryErrorMSG,
        String identificationErrorMSG, String Emaild,String EmailIDErrorMSG,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
        String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String fatherSpouseNameErrorMsg,String motherNameErrorMsg
        ,String maidenNameErrorMsg,String Other,String ParentAnnualIncome,String ParentInsuranceCover,String Gstvalue) throws InterruptedException {

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
	bankdetails.ClickPaymentMethodweb(PaymentMethod);
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
	wait.WaitTime5();
	addnomineepage.clickNomineeAddressNEXTBtnWeb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
    address.clickAddressDropdownWeb();
    address.selectAddressWeb(addressType);

    address.enterPinWeb(pinCode);
    wait.WaitTime2();
    address.validationAddressOneWeb(addressOne);
    address.validationAddressTwoWeb(addressTwo);
    address.validationAddressThreeWeb(addressThree);
    address.selectPreferredLangWeb(language);
    address.selectAlternateMobileNoWeb(mobile);
    TestUtil.scrollTillEndOfPage(driver);
    address.selectTelPhoneNoWeb(telNo);
    address.ClickAddressNEXTBTNWeb();
    wait.WaitTime5();
    personalinfo.ClickYesBTNOnStateProposerweb();
    Thread.sleep(2000);
    TestUtil.scrollTillEndOfPage(driver);
    Thread.sleep(2000);
    personalinfo.ClickSaveAndContinueweb();
    
    WebElement ProvidedettailsErrorMsg=driver.findElement(By.xpath("//p[text()='Please enter this field']"));
    TestUtil.scrollToElement(driver, ProvidedettailsErrorMsg);
    String getvalue=ProvidedettailsErrorMsg.getText();
    TestUtil.verifybgColor(ProvidedettailsErrorMsg, driver);
    if(ProvidedettailsErrorMsg.isDisplayed())
    {
    	CustomListner.test.log(LogStatus.INFO, "Successfully Display Provide details  Error MSG");
    }else {
    	CustomListner.test.log(LogStatus.FAIL, "Failed to Provide Details  Error MSG");
    }
    Assert.assertEquals(getvalue, provideDetailsErrorMSG);
    
    
}



@Test(groups = {"web"}, dataProvider = "PersonalInfoPageDataProvider", dataProviderClass = DataProviders.class,
description = "1)User should be able to see Are you Holding  Citizenship of Any Other Country question should be in blank, when click on save and continue button. then message is showing in below \"Please enter this field\". ")

public void UserSelectHoldingCitizenshipOfOtherCountryBlankWeb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethod,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo,
        String insurerName,String sumAssured ,String policyNumber ,String yearOfApplication ,String basePlan ,String annualPremium ,String policyStatus,String medicalPolicy,String policyReason,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,String provideDetailsErrorMSG,String selectCountryErrorMSG,
        String identificationErrorMSG, String Emaild,String EmailIDErrorMSG,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
        String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String fatherSpouseNameErrorMsg,String motherNameErrorMsg
        ,String maidenNameErrorMsg,String Other,String ParentAnnualIncome,String ParentInsuranceCover,String Gstvalue) throws InterruptedException {

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
	bankdetails.ClickPaymentMethodweb(PaymentMethod);
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
	wait.WaitTime5();
	addnomineepage.clickNomineeAddressNEXTBtnWeb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
    address.clickAddressDropdownWeb();
    address.selectAddressWeb(addressType);

    address.enterPinWeb(pinCode);
    wait.WaitTime2();
    address.validationAddressOneWeb(addressOne);
    address.validationAddressTwoWeb(addressTwo);
    address.validationAddressThreeWeb(addressThree);
    address.selectPreferredLangWeb(language);
    address.selectAlternateMobileNoWeb(mobile);
    TestUtil.scrollTillEndOfPage(driver);
    wait.WaitTime2();
    address.selectTelPhoneNoWeb(telNo);
    address.ClickAddressNEXTBTNWeb();
    wait.WaitTime5();
    personalinfo.ClickYesBTNOnHoldingCitizenshipweb();
    Thread.sleep(2000);
    TestUtil.scrollTillEndOfPage(driver);
    Thread.sleep(2000);
    personalinfo.ClickSaveAndContinueweb();
    
    
    
    WebElement selectcountryErrorMsg=driver.findElement(By.xpath("//p[text()='Please enter this field']"));
    TestUtil.scrollToElement(driver, selectcountryErrorMsg);
    String getvalue=selectcountryErrorMsg.getText();
    TestUtil.verifybgColor(selectcountryErrorMsg, driver);
    if(selectcountryErrorMsg.isDisplayed())
    {
    	CustomListner.test.log(LogStatus.INFO, "Successfully Display select country Error MSG");
    }else {
    	CustomListner.test.log(LogStatus.FAIL, "Failed to select country Error Error MSG");
    }
    Assert.assertEquals(getvalue, selectCountryErrorMSG);
    
    
}






@Test(groups = {"web"}, dataProvider = "PersonalInfoPageDataProvider", dataProviderClass = DataProviders.class,
description = "1)User should be able  to see Are You A Tax Resident of any other country question should be in blank, when click on save and continue button. then message is showing in below \"Please enter this field ")

public void UserSelectTaxResidentOfOtherCountryBlankWeb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethod,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo,
        String insurerName,String sumAssured ,String policyNumber ,String yearOfApplication ,String basePlan ,String annualPremium ,String policyStatus,String medicalPolicy,String policyReason,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,String provideDetailsErrorMSG,String selectCountryErrorMSG,
        String identificationErrorMSG, String Emaild,String EmailIDErrorMSG,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
        String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String fatherSpouseNameErrorMsg,String motherNameErrorMsg
        ,String maidenNameErrorMsg,String Other,String ParentAnnualIncome,String ParentInsuranceCover,String Gstvalue) throws InterruptedException {

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
	bankdetails.ClickPaymentMethodweb(PaymentMethod);
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
	wait.WaitTime5();
	addnomineepage.clickNomineeAddressNEXTBtnWeb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
    address.clickAddressDropdownWeb();
    address.selectAddressWeb(addressType);

    address.enterPinWeb(pinCode);
    wait.WaitTime2();
    address.validationAddressOneWeb(addressOne);
    address.validationAddressTwoWeb(addressTwo);
    address.validationAddressThreeWeb(addressThree);
    address.selectPreferredLangWeb(language);
    address.selectAlternateMobileNoWeb(mobile);
    TestUtil.scrollTillEndOfPage(driver);
    wait.WaitTime2();
    address.selectTelPhoneNoWeb(telNo);
    address.ClickAddressNEXTBTNWeb();
    wait.WaitTime5();
    personalinfo.ClickYesBTNOnTaxResidentweb();
    Thread.sleep(2000);
    TestUtil.scrollTillEndOfPage(driver);
    Thread.sleep(2000);
    personalinfo.ClickSaveAndContinueweb();

    wait.WaitTime2();
    WebElement identificationErrorMsg=driver.findElement(By.xpath("//p[text()='Please enter this field']"));
    TestUtil.scrollToElement(driver, identificationErrorMsg);
    String getvalue=identificationErrorMsg.getText();
    TestUtil.verifybgColor(identificationErrorMsg, driver);
    if(identificationErrorMsg.isDisplayed())
    {
    	CustomListner.test.log(LogStatus.INFO, "Successfully Display Indentificatio NO. Error MSG");
    }else {
    	CustomListner.test.log(LogStatus.FAIL, "Failed to Identification NO Error Error MSG");
    }
    Assert.assertEquals(getvalue, identificationErrorMSG);
    
    
}


//================Below Code By nikhil=============================================================================================





@Test(groups = {
		"web" }, dataProvider = "PersonalInfoPageDataProvider", dataProviderClass = DataProviders.class, description = "TEST-148 ||Validate Ensure the email ID ends with the below format. Standard email ID regular expression to be used"
				+ "TEST-148 ||Validate the field by entering the valid email address."
				+ "TEST-148 ||Validate the field With Email contains dot in the address field"
				+ "TEST-148 ||Validate With Email contains dot with subdomain"
				+ "TEST-148 ||Validate email id field With Digits in address are valid"
				+ "TEST-148 ||Validate the email id filed With Quotes around email is considered valid"
				+ "TEST-148 ||Validate With Dot in Top Level Domain name also considered valid (use co.jp as example here)"
				+ "TEST-148 ||Validate the email id filed With Missing @ sign and domain"
				+ "TEST-148 ||Validate the email id filed With Missing username"
				+ "TEST-148 ||Validate the email id field With Missing @"
				+ "TEST-148 ||Validate the email id filed With Two @ sign"
				+ "TEST-148 ||Validate email address field With Multiple dots"
				+ "TEST-148 ||Validate the email id filed With .name is valid Top Level Domain name"
				+ "TEST-148 ||Validate the email id filed With Underscore in the address field is valid"
				+ "Validate the email id text box With Missing top level domain (.com/.net/.org/etc)"
				+ "TEST-148 ||Validate the email id filed With Plus sign is considered valid character.")
public void EmailIdValidationweb(String userName, String passWord, String leadID, String mobileNumber, String panNumber,
		String day, String month, String year, String quoteAmount, String planOptions, String smokerNonSmoker,
		String pptOption, String term, String paymode, String AciSumAssured, String Rideramount, String level,
		String IFSCCode, String IFSCErrorMSG, String BankName, String BankNameErrorMSG, String BranchName,
		String BranchNameErrorMSG, String AccountNo, String AccountNoErrorMSG, String PaymentMethod,
		String PreferredDrawDate, String SourceOfFunds, String BankStatus, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String shareErrorMSG, String relationshipErrorMSG, String firstNameErrorMSG,
		String lastNameErrorMSG, String removeMSG, String nomiDOBErrorMSG, String addressType, String pinCode,
		String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile,
		String telNo, String insurerName, String sumAssured, String policyNumber, String yearOfApplication,
		String basePlan, String annualPremium, String policyStatus, String medicalPolicy, String policyReason,
		String purposeOfInsuValue1, String purposeOfInsuValue2, String purposeOfInsuValue3,
		String provideDetailsErrorMSG, String selectCountryErrorMSG, String identificationErrorMSG, String Emaild,
		String EmailIDErrorMSG, String MaritalStatus, String fatherSpouseName, String motherName, String maidenName,
		String Qualification, String Occupation, String NameOfEmployer, String NatureofBusiness,
		String TypeOfOrganisation, String Designation, String AnnualIncome, String fatherSpouseNameErrorMsg,
		String motherNameErrorMsg, String maidenNameErrorMsg, String Other, String ParentAnnualIncome,
		String ParentInsuranceCover, String Gstvalue) throws InterruptedException {

	new TestFactory().gotoNomineeweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			quoteAmount, planOptions, smokerNonSmoker, pptOption, term, paymode, AciSumAssured, Rideramount, level,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds);

	TestUtil.scrollTillEndOfPage(driver);
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();// VIJAY
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();// PRATIMA
	Thread.sleep(2000);
	personalinfo.EnterEmailIdweb(Emaild);
	wait.WaitTime5();
	boolean emailstatus = personalinfo.validate(Emaild);
	if (emailstatus == true) {
		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Email ID");
	} else {
		CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Email ID ");
	}

}







@Test(groups= {"web"},dataProvider = "PersonalInfoPageDataProvider", dataProviderClass = DataProviders.class,
        description = "TEST-148 ||Validate That Email Id is Mandatory Captured in the field")
public void EmailIdMandatoryFieldweb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethod,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo,
        String insurerName,String sumAssured ,String policyNumber ,String yearOfApplication ,String basePlan ,String annualPremium ,String policyStatus,String medicalPolicy,String policyReason,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,String provideDetailsErrorMSG,String selectCountryErrorMSG,
        String identificationErrorMSG, String Emaild,String EmailIDErrorMSG,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
        String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String fatherSpouseNameErrorMsg,String motherNameErrorMsg
        ,String maidenNameErrorMsg,String Other,String ParentAnnualIncome,String ParentInsuranceCover,String Gstvalue) throws InterruptedException{
	
	new TestFactory().gotoNomineeweb(driver, userName,  passWord,  leadID,  mobileNumber,
            panNumber,  day,  month,  year,  quoteAmount,  planOptions,
            smokerNonSmoker,  pptOption,  term,  paymode, 
            AciSumAssured,  Rideramount, level, IFSCCode, AccountNo, PaymentMethod,
             PreferredDrawDate, SourceOfFunds);
	
	
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime5();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	personalinfo.ClickSaveAndContinueweb();
	wait.WaitTime5();
	TestUtil.scrollTillTOPOfPage(driver);
	Thread.sleep(2000);
	WebElement email=driver.findElement(By.xpath("//p[text()='Please enter Email Id']"));
	String getvalue=email.getText();
	TestUtil.verifybgColor(email, driver);
	Assert.assertEquals(getvalue, EmailIDErrorMSG);
	CustomListner.test.log(LogStatus.INFO, "Successfully Verified Email ID Error Msg");
	
	
} 

@Test(groups= {"web"},dataProvider = "PersonalInfoPageDataProvider", dataProviderClass = DataProviders.class,
        description = "TEST-148 ||Validate  Configuration to enable user to proceed even if the email ID is inactive")
public void EmailIdInactiveAndProccedNEXTPageweb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethod,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo,
        String insurerName,String sumAssured ,String policyNumber ,String yearOfApplication ,String basePlan ,String annualPremium ,String policyStatus,String medicalPolicy,String policyReason,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,String provideDetailsErrorMSG,String selectCountryErrorMSG,
        String identificationErrorMSG, String Emaild,String EmailIDErrorMSG,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
        String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String fatherSpouseNameErrorMsg,String motherNameErrorMsg
        ,String maidenNameErrorMsg,String Other,String ParentAnnualIncome,String ParentInsuranceCover,String Gstvalue) throws InterruptedException{
	
	new TestFactory().gotoNomineeweb(driver, userName,  passWord,  leadID,  mobileNumber,
            panNumber,  day,  month,  year,  quoteAmount,  planOptions,
            smokerNonSmoker,  pptOption,  term,  paymode, 
            AciSumAssured,  Rideramount, level, IFSCCode, AccountNo, PaymentMethod,
             PreferredDrawDate, SourceOfFunds);

	
	
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	Thread.sleep(2000);
	personalinfo.EnterEmailIdweb(Emaild);
	personalinfo.EnterMaritalStatusweb(MaritalStatus);
	personalinfo.EnterFatherSpaouseNameweb(fatherSpouseName);
	personalinfo.EnterMotherNameweb(motherName);
	//personalinfo.EnterMaidenNameweb(maidenName);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	personalinfo.SelectQualificationweb(Qualification);
	personalinfo.SelectOccupationweb(Occupation);
	personalinfo.EnterOccupationNameofEmployeeweb(NameOfEmployer);
	personalinfo.EnterOccupationNatureofbusinessweb(NatureofBusiness);
	personalinfo.selectOccupationTypeofOrganisationweb(TypeOfOrganisation);
	personalinfo.EnterOccupationDesignationweb(Designation);
	personalinfo.EnterOccupationAnnualIncomeweb(AnnualIncome);
	TestUtil.scrollTillTOPOfPage(driver);
	Thread.sleep(2000);
	WebElement emailtextError=driver.findElement(By.xpath("(//p[text()='Unable to verify EMAIL. Please continue with rest of the form'])[2]"));
	String getvalue=emailtextError.getText();
	TestUtil.verifybgColor(emailtextError, driver);
	Assert.assertEquals(getvalue, EmailIDErrorMSG);
	CustomListner.test.log(LogStatus.INFO, "Successfully Verified Email ID Error Msg");
	
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	
	personalinfo.ClickSaveAndContinueweb();
	Thread.sleep(3000);
	WebElement ExistingTitle=driver.findElement(By.xpath("(//h2[text()='Existing Policy'])[1]"));
	Assert.assertTrue(ExistingTitle.isDisplayed());
} 
@Test(groups= {"web"},dataProvider = "PersonalInfoPageDataProvider", dataProviderClass = DataProviders.class,
        description = "TEST-149 ||Validate that father’s, Spouse, mother’s and mother’s maiden name are all captured as they are mandatory")
public void VerifyFatherMotherMandatoryFieldweb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethod,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo,
        String insurerName,String sumAssured ,String policyNumber ,String yearOfApplication ,String basePlan ,String annualPremium ,String policyStatus,String medicalPolicy,String policyReason,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,String provideDetailsErrorMSG,String selectCountryErrorMSG,
        String identificationErrorMSG, String Emaild,String EmailIDErrorMSG,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
        String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String fatherSpouseNameErrorMsg,String motherNameErrorMsg
        ,String maidenNameErrorMsg,String Other,String ParentAnnualIncome,String ParentInsuranceCover,String Gstvalue) throws InterruptedException{
	
	new TestFactory().gotoNomineeweb(driver, userName,  passWord,  leadID,  mobileNumber,
            panNumber,  day,  month,  year,  quoteAmount,  planOptions,
            smokerNonSmoker,  pptOption,  term,  paymode, 
            AciSumAssured,  Rideramount, level, IFSCCode, AccountNo, PaymentMethod,
             PreferredDrawDate, SourceOfFunds);

	
	
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	personalinfo.EnterEmailIdweb(Emaild);
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	personalinfo.SelectQualificationweb(Qualification);
	personalinfo.SelectOccupationweb(Occupation);
	personalinfo.EnterOccupationNameofEmployeeweb(NameOfEmployer);
	personalinfo.EnterOccupationNatureofbusinessweb(NatureofBusiness);
	personalinfo.selectOccupationTypeofOrganisationweb(TypeOfOrganisation);
	personalinfo.EnterOccupationDesignationweb(Designation);
	personalinfo.EnterOccupationAnnualIncomeweb(AnnualIncome);
	personalinfo.ClickSaveAndContinueweb();
	Thread.sleep(3000);
	TestUtil.scrollTillTOPOfPage(driver);
	wait.WaitTime2();
	personalinfo.VerifyFathernameweb(fatherSpouseNameErrorMsg);
	personalinfo.VerifyMothernameweb(motherNameErrorMsg);
	
//	WebElement maidentextError=driver.findElement(By.xpath("//p[text()='Please enter Maiden name']"));
//	String maidenvalue=maidentextError.getText();
//	TestUtil.verifybgColor(maidentextError, driver);
//	Assert.assertEquals(maidenvalue, maidenNameErrorMsg);
//	CustomListner.test.log(LogStatus.INFO, "Successfully Verified Maiden Name Error Msg");
	

} 
@Test(groups= {"web"},dataProvider = "PersonalInfoPageDataProvider", dataProviderClass = DataProviders.class,
        description = "TEST-149 ||Validate that the name has at least 3 characters and maximum 50. Verify that the below 3 and above 50, "
        		+ "below message is shown - “Please enter valid name”")
public void VerifyMinAndMaxValidationFieldweb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethod,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo,
        String insurerName,String sumAssured ,String policyNumber ,String yearOfApplication ,String basePlan ,String annualPremium ,String policyStatus,String medicalPolicy,String policyReason,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,String provideDetailsErrorMSG,String selectCountryErrorMSG,
        String identificationErrorMSG, String Emaild,String EmailIDErrorMSG,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
        String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String fatherSpouseNameErrorMsg,String motherNameErrorMsg
        ,String maidenNameErrorMsg,String Other,String ParentAnnualIncome,String ParentInsuranceCover,String Gstvalue) throws InterruptedException{
	
	new TestFactory().gotoNomineeweb(driver, userName,  passWord,  leadID,  mobileNumber,
            panNumber,  day,  month,  year,  quoteAmount,  planOptions,
            smokerNonSmoker,  pptOption,  term,  paymode, 
            AciSumAssured,  Rideramount, level, IFSCCode, AccountNo, PaymentMethod,
             PreferredDrawDate, SourceOfFunds);

	
	
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	personalinfo.EnterEmailIdweb(Emaild);
	personalinfo.EnterMaritalStatusweb(MaritalStatus);
	personalinfo.EnterFatherSpaouseNameweb(fatherSpouseName);
	personalinfo.EnterMotherNameweb(motherName);
	//personalinfo.EnterMaidenNameweb(maidenName);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	personalinfo.SelectQualificationweb(Qualification);
	personalinfo.SelectOccupationweb(Occupation);
	personalinfo.EnterOccupationNameofEmployeeweb(NameOfEmployer);
	personalinfo.EnterOccupationNatureofbusinessweb(NatureofBusiness);
	personalinfo.selectOccupationTypeofOrganisationweb(TypeOfOrganisation);
	personalinfo.EnterOccupationDesignationweb(Designation);
	personalinfo.EnterOccupationAnnualIncomeweb(AnnualIncome);
	personalinfo.ClickSaveAndContinueweb();
	Thread.sleep(3000);
	TestUtil.scrollTillTOPOfPage(driver);
	wait.WaitTime2();
	personalinfo.VerifyFathernameweb(fatherSpouseNameErrorMsg);
	personalinfo.VerifyMothernameweb(motherNameErrorMsg);
	
//	WebElement maidentextError=driver.findElement(By.xpath("(//p[text()='Please enter minimum 3 characters'])[3]"));
//	String maidenvalue=maidentextError.getText();
//	TestUtil.verifybgColor(maidentextError, driver);
//	Assert.assertEquals(maidenvalue, maidenNameErrorMsg);
//	CustomListner.test.log(LogStatus.INFO, "Successfully Verified Maiden Name Error Msg");
	

} 
@Test(groups= {"web"},dataProvider = "PersonalInfoPageDataProvider", dataProviderClass = DataProviders.class,
        description = "TEST-84 ||Validate the user is able to select from the below options under Qualification"
        		+ "TEST-84 ||Validate if others is selected, user needs a separate field on what is the other qualification"
        		+ "TEST-84 ||Validate  The other qualification field will be a 50 character limit and should be alpha numeric. Should accept only period and space as special character")
public void VerifyOtherFieldInQualificationWithAlphaNumericweb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethod,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo,
        String insurerName,String sumAssured ,String policyNumber ,String yearOfApplication ,String basePlan ,String annualPremium ,String policyStatus,String medicalPolicy,String policyReason,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,String provideDetailsErrorMSG,String selectCountryErrorMSG,
        String identificationErrorMSG, String Emaild,String EmailIDErrorMSG,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
        String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String fatherSpouseNameErrorMsg,String motherNameErrorMsg
        ,String maidenNameErrorMsg,String Other,String ParentAnnualIncome,String ParentInsuranceCover,String Gstvalue) throws InterruptedException{
	
	new TestFactory().gotoNomineeweb(driver, userName,  passWord,  leadID,  mobileNumber,
            panNumber,  day,  month,  year,  quoteAmount,  planOptions,
            smokerNonSmoker,  pptOption,  term,  paymode, 
            AciSumAssured,  Rideramount, level, IFSCCode, AccountNo, PaymentMethod,
             PreferredDrawDate, SourceOfFunds);

	
	
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	personalinfo.EnterEmailIdweb(Emaild);
	personalinfo.EnterMaritalStatusweb(MaritalStatus);
	personalinfo.EnterFatherSpaouseNameweb(fatherSpouseName);
	personalinfo.EnterMotherNameweb(motherName);
	//personalinfo.EnterMaidenNameweb(maidenName);
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	personalinfo.SelectQualificationweb(Qualification);
	personalinfo.EnterOtherQualificationweb(Other);
	personalinfo.SelectOccupationweb(Occupation);
	personalinfo.EnterOccupationNameofEmployeeweb(NameOfEmployer);
	personalinfo.EnterOccupationNatureofbusinessweb(NatureofBusiness);
	personalinfo.selectOccupationTypeofOrganisationweb(TypeOfOrganisation);
	personalinfo.EnterOccupationDesignationweb(Designation);
	personalinfo.EnterOccupationAnnualIncomeweb(AnnualIncome);
	personalinfo.ClickSaveAndContinueweb();
	Thread.sleep(2000);

	

} 
@Test(groups= {"web"},dataProvider = "PersonalInfoPageDataProvider", dataProviderClass = DataProviders.class,
        description = "TEST-84 ||Validate No default option will be selected for qualification"
        		+ "TEST-84 ||Validate  If no details mentioned in other - message to be shown “Please capture other details in qualification” "
        		+ "TEST-1087 || Validate if user select the Qualification"
        		+ " TEST-1087 ||Validate Other Qualification")
public void VerifyOtherFieldInQualificationWithBlankcweb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethod,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo,
        String insurerName,String sumAssured ,String policyNumber ,String yearOfApplication ,String basePlan ,String annualPremium ,String policyStatus,String medicalPolicy,String policyReason,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,String provideDetailsErrorMSG,String selectCountryErrorMSG,
        String identificationErrorMSG, String Emaild,String EmailIDErrorMSG,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
        String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String fatherSpouseNameErrorMsg,String motherNameErrorMsg
        ,String maidenNameErrorMsg,String Other,String ParentAnnualIncome,String ParentInsuranceCover,String Gstvalue) throws InterruptedException{
	
	new TestFactory().gotoNomineeweb(driver, userName,  passWord,  leadID,  mobileNumber,
            panNumber,  day,  month,  year,  quoteAmount,  planOptions,
            smokerNonSmoker,  pptOption,  term,  paymode, 
            AciSumAssured,  Rideramount, level, IFSCCode, AccountNo, PaymentMethod,
             PreferredDrawDate, SourceOfFunds);

	
	
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	personalinfo.EnterEmailIdweb(Emaild);
	personalinfo.EnterMaritalStatusweb(MaritalStatus);
	personalinfo.EnterFatherSpaouseNameweb(fatherSpouseName);
	personalinfo.EnterMotherNameweb(motherName);
	//personalinfo.EnterMaidenNameweb(maidenName);
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	personalinfo.SelectQualificationweb(Qualification);
	personalinfo.SelectOccupationweb(Occupation);
	personalinfo.EnterOccupationNameofEmployeeweb(NameOfEmployer);
	personalinfo.EnterOccupationNatureofbusinessweb(NatureofBusiness);
	personalinfo.selectOccupationTypeofOrganisationweb(TypeOfOrganisation);
	personalinfo.EnterOccupationDesignationweb(Designation);
	personalinfo.EnterOccupationAnnualIncomeweb(AnnualIncome);
	personalinfo.ClickSaveAndContinueweb();
	wait.WaitTime2();
	 WebElement OtherErrorMsg=  driver.findElement(By.xpath("//p[text()='Please enter this field']"));
	TestUtil.scrollToElement(driver, OtherErrorMsg);
	wait.WaitTime2();
	TestUtil.verifybgColor(OtherErrorMsg, driver);
	Assert.assertTrue(OtherErrorMsg.isDisplayed(),"Failed to Display Other Field Error Msg");
	CustomListner.test.log(LogStatus.INFO, "Successfully Verified Other Field Mandatory Error Msg");

	

} 

@Test(groups= {"web"},dataProvider = "PersonalInfoPageDataProvider", dataProviderClass = DataProviders.class,
        description = "TEST-84 ||If no Qualification is selected, the user will displayed message - “Please choose Qualification” ")
public void VerifyQualificationWithBlankValidationcweb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethod,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo,
        String insurerName,String sumAssured ,String policyNumber ,String yearOfApplication ,String basePlan ,String annualPremium ,String policyStatus,String medicalPolicy,String policyReason,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,String provideDetailsErrorMSG,String selectCountryErrorMSG,
        String identificationErrorMSG, String Emaild,String EmailIDErrorMSG,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
        String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String fatherSpouseNameErrorMsg,String motherNameErrorMsg
        ,String maidenNameErrorMsg,String Other,String ParentAnnualIncome,String ParentInsuranceCover,String Gstvalue) throws InterruptedException{
	
	new TestFactory().gotoNomineeweb(driver, userName,  passWord,  leadID,  mobileNumber,
            panNumber,  day,  month,  year,  quoteAmount,  planOptions,
            smokerNonSmoker,  pptOption,  term,  paymode, 
            AciSumAssured,  Rideramount, level, IFSCCode, AccountNo, PaymentMethod,
             PreferredDrawDate, SourceOfFunds);

	
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	personalinfo.EnterEmailIdweb(Emaild);
	personalinfo.EnterMaritalStatusweb(MaritalStatus);
	personalinfo.EnterFatherSpaouseNameweb(fatherSpouseName);
	personalinfo.EnterMotherNameweb(motherName);
	//personalinfo.EnterMaidenNameweb(maidenName);
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	personalinfo.SelectOccupationweb(Occupation);
	personalinfo.EnterOccupationNameofEmployeeweb(NameOfEmployer);
	personalinfo.EnterOccupationNatureofbusinessweb(NatureofBusiness);
	personalinfo.selectOccupationTypeofOrganisationweb(TypeOfOrganisation);
	personalinfo.EnterOccupationDesignationweb(Designation);
	personalinfo.EnterOccupationAnnualIncomeweb(AnnualIncome);
	personalinfo.ClickSaveAndContinueweb();
	wait.WaitTime2();
	 WebElement QualificationError=  driver.findElement(By.xpath("//p[text()='Please enter Qualification']"));
	TestUtil.scrollToElement(driver, QualificationError);
	wait.WaitTime2();
	TestUtil.verifybgColor(QualificationError, driver);
	Assert.assertTrue(QualificationError.isDisplayed(),"Failed to Display Qualification Field Error Msg");
	

	

} 
@Test(groups= {"web"},dataProvider = "PersonalInfoPageDataProvider", dataProviderClass = DataProviders.class,
        description = "TEST-84 ||Validate  If Qualification is selected as ‘Illiterate’ or ' Below SSC' then Term plan should not be allowed to be purchased. Message to be displayed “ Term plan is not eligible as per plan guidelines”."
        		+ " OK button to be provided. The user can click on ok and select any other qualification and then proceed ahead. ")
public void VerifyQualificationBelowSSCAndGoNextPageweb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethod,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo,
        String insurerName,String sumAssured ,String policyNumber ,String yearOfApplication ,String basePlan ,String annualPremium ,String policyStatus,String medicalPolicy,String policyReason,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,String provideDetailsErrorMSG,String selectCountryErrorMSG,
        String identificationErrorMSG, String Emaild,String EmailIDErrorMSG,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
        String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String fatherSpouseNameErrorMsg,String motherNameErrorMsg
        ,String maidenNameErrorMsg,String Other,String ParentAnnualIncome,String ParentInsuranceCover,String Gstvalue) throws InterruptedException{
	
	new TestFactory().gotoNomineeweb(driver, userName,  passWord,  leadID,  mobileNumber,
            panNumber,  day,  month,  year,  quoteAmount,  planOptions,
            smokerNonSmoker,  pptOption,  term,  paymode, 
            AciSumAssured,  Rideramount, level, IFSCCode, AccountNo, PaymentMethod,
             PreferredDrawDate, SourceOfFunds);

	
	
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	personalinfo.EnterEmailIdweb(Emaild);
	personalinfo.EnterMaritalStatusweb(MaritalStatus);
	personalinfo.EnterFatherSpaouseNameweb(fatherSpouseName);
	personalinfo.EnterMotherNameweb(motherName);
	//personalinfo.EnterMaidenNameweb(maidenName);
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	personalinfo.SelectQualificationweb(Qualification);
	wait.WaitTime2();
	personalinfo.ClickAlertOkPopUpQualificationweb();
	wait.WaitTime2();
	personalinfo.SelectQualificationweb("Graduate");
	personalinfo.SelectOccupationweb(Occupation);
	personalinfo.EnterOccupationNameofEmployeeweb(NameOfEmployer);
	personalinfo.EnterOccupationNatureofbusinessweb(NatureofBusiness);
	personalinfo.selectOccupationTypeofOrganisationweb(TypeOfOrganisation);
	personalinfo.EnterOccupationDesignationweb(Designation);
	personalinfo.EnterOccupationAnnualIncomeweb(AnnualIncome);
	personalinfo.ClickSaveAndContinueweb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
	WebElement ExistingTitle=driver.findElement(By.xpath("(//h2[text()='Existing Policy'])[1]"));
	Assert.assertTrue(ExistingTitle.isDisplayed());

	

} 

@Test(groups= {"web"},dataProvider = "PersonalInfoPageDataProvider", dataProviderClass = DataProviders.class,
        description = "TEST-84 ||Validate  If Agriculture is selected as Occupation. Max Sum Assured for term plan can be given for 50 lacs, if Qualification is Graduate or above."
        		+ " If Qualification is below graduate then message to be displayed “ Term plan is not eligible as per plan guidelines”. OK button to be provided. The user can click on ok and select any other qualification and then proceed ahead. ")
public void VerifySumAssuredMax50lackAndOccupationAgricultureweb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethod,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo,
        String insurerName,String sumAssured ,String policyNumber ,String yearOfApplication ,String basePlan ,String annualPremium ,String policyStatus,String medicalPolicy,String policyReason,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,String provideDetailsErrorMSG,String selectCountryErrorMSG,
        String identificationErrorMSG, String Emaild,String EmailIDErrorMSG,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
        String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String fatherSpouseNameErrorMsg,String motherNameErrorMsg
        ,String maidenNameErrorMsg,String Other,String ParentAnnualIncome,String ParentInsuranceCover,String Gstvalue) throws InterruptedException{
	
	new TestFactory().gotoBankWithQuoteweb(driver, userName,  passWord,  leadID,  mobileNumber,
            panNumber,  day,  month,  year,  quoteAmount,  planOptions,
            smokerNonSmoker,  pptOption,  term,  paymode, 
            AciSumAssured,  Rideramount, level);
	bankdetails.InputIFSCCode(IFSCCode);
	wait.WaitTime2();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	bankdetails.EnterAccountNumberField(AccountNo);
	wait.WaitTime2();
	bankdetails.ClickVerifyButtinweb();
	wait.WaitTime5();
	bankdetails.ClickOnProceedBtnweb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
	bankdetails.ClickPaymentMethodweb(PaymentMethod);
	bankdetails.ClickPreferredDrawDateweb(PreferredDrawDate);
	bankdetails.ClickSourceOfFundweb(SourceOfFunds);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	bankdetails.ClickSaveButtonweb();
	wait.WaitTime2();
	viewQuote.clickNextBtnCapital();
	Thread.sleep(2000);
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	personalinfo.EnterEmailIdweb(Emaild);
	personalinfo.EnterMaritalStatusweb(MaritalStatus);
	personalinfo.EnterFatherSpaouseNameweb(fatherSpouseName);
	personalinfo.EnterMotherNameweb(motherName);
	// personalinfo.EnterMaidenNameweb(maidenName);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	personalinfo.SelectQualificationweb(Qualification);
	personalinfo.SelectOccupationweb(Occupation);
	wait.WaitTime2();
	WebElement guidlianceAlert = driver
			.findElement(By.xpath("//div[text()='Term plan is not eligible as per plan guidelines']"));

	TestUtil.verifybgColor(guidlianceAlert, driver);
	Assert.assertTrue(guidlianceAlert.isDisplayed(), "Alert PopUp is not display");
	personalinfo.ClickAlertOkPopUpQualificationweb();
	wait.WaitTime2();
	personalinfo.SelectOccupationweb("Service");
	personalinfo.EnterOccupationNameofEmployeeweb(NameOfEmployer);
	personalinfo.EnterOccupationNatureofbusinessweb(NatureofBusiness);
	personalinfo.selectOccupationTypeofOrganisationweb(TypeOfOrganisation);
	personalinfo.EnterOccupationDesignationweb(Designation);
	personalinfo.EnterOccupationAnnualIncomeweb(AnnualIncome);
	personalinfo.ClickSaveAndContinueweb();
	Thread.sleep(3000);
	WebElement ExistingTitle = driver.findElement(By.xpath("(//h2[text()='Existing Policy'])[1]"));
	Assert.assertTrue(ExistingTitle.isDisplayed());

}

@Test(groups= {"web"},dataProvider = "PersonalInfoPageDataProvider", dataProviderClass = DataProviders.class,
        description = "TEST-84 ||Validate  Occupation - Retired, Then Term plan should not be allowed."
        		+ " Display message “ Term plan is not eligible as per plan guidelines”. OK button to be provided. The user can click on ok and select other Occupation"
        		+ "Test-84 ||Validate the Redirection and Navigation")
public void VerifyOccupationRetiredNotAcceptweb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethod,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo,
        String insurerName,String sumAssured ,String policyNumber ,String yearOfApplication ,String basePlan ,String annualPremium ,String policyStatus,String medicalPolicy,String policyReason,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,String provideDetailsErrorMSG,String selectCountryErrorMSG,
        String identificationErrorMSG, String Emaild,String EmailIDErrorMSG,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
        String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String fatherSpouseNameErrorMsg,String motherNameErrorMsg
        ,String maidenNameErrorMsg,String Other,String ParentAnnualIncome,String ParentInsuranceCover,String Gstvalue) throws InterruptedException{
	
	new TestFactory().gotoNomineeweb(driver, userName,  passWord,  leadID,  mobileNumber,
            panNumber,  day,  month,  year,  quoteAmount,  planOptions,
            smokerNonSmoker,  pptOption,  term,  paymode, 
            AciSumAssured,  Rideramount, level, IFSCCode, AccountNo, PaymentMethod,
             PreferredDrawDate, SourceOfFunds);

	
	
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	personalinfo.EnterEmailIdweb(Emaild);
	personalinfo.EnterMaritalStatusweb(MaritalStatus);
	personalinfo.EnterFatherSpaouseNameweb(fatherSpouseName);
	personalinfo.EnterMotherNameweb(motherName);
	//personalinfo.EnterMaidenNameweb(maidenName);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	personalinfo.SelectQualificationweb(Qualification);
	personalinfo.SelectOccupationweb(Occupation);
	wait.WaitTime2();
    WebElement guidlianceAlert=	driver.findElement(By.xpath("//div[text()='Term plan is not eligible as per plan guidelines']"));
    wait.WaitTime2();
	TestUtil.verifybgColor(guidlianceAlert, driver);
	Assert.assertTrue(guidlianceAlert.isDisplayed(),"Alert PopUp is not display");
	personalinfo.ClickAlertOkPopUpQualificationweb();
	wait.WaitTime2();
	personalinfo.SelectOccupationweb("Service");
	personalinfo.EnterOccupationNameofEmployeeweb(NameOfEmployer);
	personalinfo.EnterOccupationNatureofbusinessweb(NatureofBusiness);
	personalinfo.selectOccupationTypeofOrganisationweb(TypeOfOrganisation);
	personalinfo.EnterOccupationDesignationweb(Designation);
	personalinfo.EnterOccupationAnnualIncomeweb(AnnualIncome);
	personalinfo.ClickSaveAndContinueweb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
	WebElement ExistingTitle=driver.findElement(By.xpath("(//h2[text()='Existing Policy'])[1]"));
	Assert.assertTrue(ExistingTitle.isDisplayed());
} 
@Test(groups= {"web"},dataProvider = "PersonalInfoPageDataProvider", dataProviderClass = DataProviders.class,
        description = "TEST-1087 ||As a sales person, I would like to know the occupation of the customer as this is required in underwriting to assess the risk associated with the proposer or insured,Validate Occupation Dropdown")
public void VerifyOccupationValidationweb(String userName, String passWord, String leadID, String mobileNumber,
        String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
        String smokerNonSmoker, String pptOption, String term, String paymode, 
        String AciSumAssured, String Rideramount,String level,String IFSCCode,
        String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
        String AccountNo,String AccountNoErrorMSG,String PaymentMethod,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
        String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
        String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile, String telNo,
        String insurerName,String sumAssured ,String policyNumber ,String yearOfApplication ,String basePlan ,String annualPremium ,String policyStatus,String medicalPolicy,String policyReason,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,String provideDetailsErrorMSG,String selectCountryErrorMSG,
        String identificationErrorMSG, String Emaild,String EmailIDErrorMSG,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
        String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String fatherSpouseNameErrorMsg,String motherNameErrorMsg
        ,String maidenNameErrorMsg,String Other,String ParentAnnualIncome,String ParentInsuranceCover,String Gstvalue) throws InterruptedException{
	
	new TestFactory().gotoNomineeweb(driver, userName,  passWord,  leadID,  mobileNumber,
            panNumber,  day,  month,  year,  quoteAmount,  planOptions,
            smokerNonSmoker,  pptOption,  term,  paymode, 
            AciSumAssured,  Rideramount, level, IFSCCode, AccountNo, PaymentMethod,
             PreferredDrawDate, SourceOfFunds);

	
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	personalinfo.EnterEmailIdweb(Emaild);
	personalinfo.EnterMaritalStatusweb(MaritalStatus);
	personalinfo.EnterFatherSpaouseNameweb(fatherSpouseName);
	personalinfo.EnterMotherNameweb(motherName);
	//personalinfo.EnterMaidenNameweb(maidenName);
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	personalinfo.SelectQualificationweb(Qualification);
	wait.WaitTime2();
    WebElement occupationele=  driver.findElement(By.xpath("(//div[contains(@id,'mui-component-select-24')])[2]"));
    occupationele.click();
    String[] Occupationupdate = Occupation.split(",");
	for (int i = 0; i <= Occupationupdate.length - 1; i++) {
	personalinfo.SelectOccupationValidationweb(Occupationupdate[i]);
	
	}
} 

@Test(groups = {
		"web" }, dataProvider = "PersonalInfoPageDataProvider", dataProviderClass = DataProviders.class, description = "TEST-1087 || Validate if it is Student ||then Annual income and Insurance cover needs to be asked."
				+ "TEST-1087 ||Validate Parent's Annual Income ||Dependent Mandatory ,1-15 digits, If not entered \" Please enter the details\""
				+ "TEST-1087 ||Validate Parent's Insurance Cover (Rs.) ||Dependent Mandatory ,1-10 digits , If not entered \" Please enter the details\"")
public void VerifySelectOccupationStudentweb(String userName, String passWord, String leadID, String mobileNumber,
		String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
		String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured, String Rideramount,
		String level, String IFSCCode, String IFSCErrorMSG, String BankName, String BankNameErrorMSG, String BranchName,
		String BranchNameErrorMSG, String AccountNo, String AccountNoErrorMSG, String PaymentMethod,
		String PreferredDrawDate, String SourceOfFunds, String BankStatus, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String shareErrorMSG, String relationshipErrorMSG, String firstNameErrorMSG,
		String lastNameErrorMSG, String removeMSG, String nomiDOBErrorMSG, String addressType, String pinCode,
		String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile,
		String telNo, String insurerName, String sumAssured, String policyNumber, String yearOfApplication,
		String basePlan, String annualPremium, String policyStatus, String medicalPolicy, String policyReason,
		String purposeOfInsuValue1, String purposeOfInsuValue2, String purposeOfInsuValue3,
		String provideDetailsErrorMSG, String selectCountryErrorMSG, String identificationErrorMSG, String Emaild,
		String EmailIDErrorMSG, String MaritalStatus, String fatherSpouseName, String motherName, String maidenName,
		String Qualification, String Occupation, String NameOfEmployer, String NatureofBusiness,
		String TypeOfOrganisation, String Designation, String AnnualIncome, String fatherSpouseNameErrorMsg,
		String motherNameErrorMsg, String maidenNameErrorMsg, String Other, String ParentAnnualIncome,
		String ParentInsuranceCover, String Gstvalue) throws InterruptedException {

	new TestFactory().gotoNomineeweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			quoteAmount, planOptions, smokerNonSmoker, pptOption, term, paymode, AciSumAssured, Rideramount, level,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds);

	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	personalinfo.EnterEmailIdweb(Emaild);
	personalinfo.EnterMaritalStatusweb(MaritalStatus);
	personalinfo.EnterFatherSpaouseNameweb(fatherSpouseName);
	personalinfo.EnterMotherNameweb(motherName);
	// personalinfo.EnterMaidenNameweb(maidenName);
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	personalinfo.SelectQualificationweb(Qualification);
	personalinfo.SelectOccupationweb(Occupation);
	personalinfo.ClickSaveAndContinueweb();
	wait.WaitTime2();
	WebElement Error1 = driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[1]"));
	WebElement Error2 = driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[2]"));

	TestUtil.verifybgColor(Error1, driver);
	Assert.assertTrue(Error1.isDisplayed(), "Failed to Display  Error Msg of Occupation");
	CustomListner.test.log(LogStatus.INFO, "Successfully Display Parent's Annual Income Mandatory Error MSG");
	TestUtil.verifybgColor(Error2, driver);
	Assert.assertTrue(Error2.isDisplayed(), "Failed to Display  Error Msg of Occupation");
	CustomListner.test.log(LogStatus.INFO, "Successfully Display Parent's Insurance Cover Mandatory Error MSG");
	Thread.sleep(2000);
	personalinfo.EnterParentAnnualIncomeweb(ParentAnnualIncome);
	personalinfo.EnterParentInsuranceCoverweb(ParentInsuranceCover);
	personalinfo.ClickSaveAndContinueweb();

}

@Test(groups = {
		"web" }, dataProvider = "PersonalInfoPageDataProvider", dataProviderClass = DataProviders.class, description = "TEST-1087 ||Validate Name of Employer ||Dependent Mandatory ,accept minimum 100 characters, If not entered \" Please enter the details\""
				+ "TEST-1087 ||Validate Nature of Business/Duties ||Dependent Mandatory ,accept minimum 100 characters, If not entered \" Please enter the details\""
				+ " TEST-1087 ||Validate Type of Organisation ||Dependent Mandatory ,accept minimum 100 characters, If not entered \" Please enter the details\""
				+ "TEST-1087 ||Validate Designation  ||Dependent Mandatory ,accept minimum 100 characters, If not entered \" Please enter the details\""
				+ "TEST-1087 ||Validate Annual Income ||Dependent Mandatory ,accept minimum 100 characters, If not entered \" Please enter the details\"")
public void VerifyQualificationAllBlankFieldValidationweb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
		String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
		String Rideramount, String level, String IFSCCode, String IFSCErrorMSG, String BankName,
		String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
		String AccountNoErrorMSG, String PaymentMethod, String PreferredDrawDate, String SourceOfFunds,
		String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth, String nomiyear,
		String genderValue, String relationshipValue, String shareValue, String shareErrorMSG,
		String relationshipErrorMSG, String firstNameErrorMSG, String lastNameErrorMSG, String removeMSG,
		String nomiDOBErrorMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String insurerName,
		String sumAssured, String policyNumber, String yearOfApplication, String basePlan, String annualPremium,
		String policyStatus, String medicalPolicy, String policyReason, String purposeOfInsuValue1,
		String purposeOfInsuValue2, String purposeOfInsuValue3, String provideDetailsErrorMSG,
		String selectCountryErrorMSG, String identificationErrorMSG, String Emaild, String EmailIDErrorMSG,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String fatherSpouseNameErrorMsg, String motherNameErrorMsg,
		String maidenNameErrorMsg, String Other, String ParentAnnualIncome, String ParentInsuranceCover,
		String Gstvalue) throws InterruptedException {

	new TestFactory().gotoNomineeweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			quoteAmount, planOptions, smokerNonSmoker, pptOption, term, paymode, AciSumAssured, Rideramount, level,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds);

	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	personalinfo.EnterEmailIdweb(Emaild);
	personalinfo.EnterMaritalStatusweb(MaritalStatus);
	personalinfo.EnterFatherSpaouseNameweb(fatherSpouseName);
	personalinfo.EnterMotherNameweb(motherName);
	// personalinfo.EnterMaidenNameweb(maidenName);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	personalinfo.SelectQualificationweb(Qualification);
	personalinfo.SelectOccupationweb(Occupation);
	personalinfo.ClickSaveAndContinueweb();
	wait.WaitTime2();
	WebElement Error1 = driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[1]"));
	WebElement Error2 = driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[2]"));
	WebElement Error3 = driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[3]"));
	WebElement Error4 = driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[4]"));
	WebElement Error5 = driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[5]"));

	TestUtil.verifybgColor(Error1, driver);
	Assert.assertTrue(Error1.isDisplayed(), "Failed to Display  Error Msg of Occupation");
	CustomListner.test.log(LogStatus.INFO, "Successfully Display Name of Employer Mandatory Error MSG");
	TestUtil.verifybgColor(Error2, driver);
	Assert.assertTrue(Error2.isDisplayed(), "Failed to Display  Error Msg of Occupation");
	CustomListner.test.log(LogStatus.INFO, "Successfully Display Nature of Business/Duties Mandatory Error MSG");
	TestUtil.verifybgColor(Error3, driver);
	Assert.assertTrue(Error3.isDisplayed(), "Failed to Display  Error Msg of Occupation");
	CustomListner.test.log(LogStatus.INFO, "Successfully Display Type of Organisation Error Mandatory MSG");
	TestUtil.verifybgColor(Error4, driver);
	Assert.assertTrue(Error4.isDisplayed(), "Failed to Display  Error Msg of Occupation");
	CustomListner.test.log(LogStatus.INFO, "Successfully Display Designation Mandatory Error MSG");
	TestUtil.verifybgColor(Error5, driver);
	Assert.assertTrue(Error5.isDisplayed(), "Failed to Display  Error Msg of Occupation");
	CustomListner.test.log(LogStatus.INFO, "Successfully Display  Annual Income Mandatory Error MSG");

}

@Test(groups = {
		"web" }, dataProvider = "PersonalInfoPageDataProvider", dataProviderClass = DataProviders.class, description = "TEST-1087 ||Validate Are you registered person under GST Law?"
				+ "TEST-1087 ||Validate Provide your GST registration number"
				+ "||Verify user able to see GST law question must be default as \"no\"")
public void ClickUnderGSTLawCheckboxweb(String userName, String passWord, String leadID, String mobileNumber,
		String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
		String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured, String Rideramount,
		String level, String IFSCCode, String IFSCErrorMSG, String BankName, String BankNameErrorMSG, String BranchName,
		String BranchNameErrorMSG, String AccountNo, String AccountNoErrorMSG, String PaymentMethod,
		String PreferredDrawDate, String SourceOfFunds, String BankStatus, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String shareErrorMSG, String relationshipErrorMSG, String firstNameErrorMSG,
		String lastNameErrorMSG, String removeMSG, String nomiDOBErrorMSG, String addressType, String pinCode,
		String addressOne, String addressTwo, String addressThree, String pinCode2, String language, String mobile,
		String telNo, String insurerName, String sumAssured, String policyNumber, String yearOfApplication,
		String basePlan, String annualPremium, String policyStatus, String medicalPolicy, String policyReason,
		String purposeOfInsuValue1, String purposeOfInsuValue2, String purposeOfInsuValue3,
		String provideDetailsErrorMSG, String selectCountryErrorMSG, String identificationErrorMSG, String Emaild,
		String EmailIDErrorMSG, String MaritalStatus, String fatherSpouseName, String motherName, String maidenName,
		String Qualification, String Occupation, String NameOfEmployer, String NatureofBusiness,
		String TypeOfOrganisation, String Designation, String AnnualIncome, String fatherSpouseNameErrorMsg,
		String motherNameErrorMsg, String maidenNameErrorMsg, String Other, String ParentAnnualIncome,
		String ParentInsuranceCover, String Gstvalue) throws InterruptedException {

	new TestFactory().gotoNomineeweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			quoteAmount, planOptions, smokerNonSmoker, pptOption, term, paymode, AciSumAssured, Rideramount, level,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds);

	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	driver.findElement(By.xpath("//span[text()='DO IT LATER']")).click();
	wait.WaitTime2();
	personalinfo.EnterEmailIdweb(Emaild);
	personalinfo.EnterMaritalStatusweb(MaritalStatus);
	personalinfo.EnterFatherSpaouseNameweb(fatherSpouseName);
	personalinfo.EnterMotherNameweb(motherName);
	// personalinfo.EnterMaidenNameweb(maidenName);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	personalinfo.SelectQualificationweb(Qualification);
	personalinfo.SelectOccupationweb(Occupation);
	personalinfo.EnterOccupationNameofEmployeeweb(NameOfEmployer);
	personalinfo.EnterOccupationNatureofbusinessweb(NatureofBusiness);
	personalinfo.selectOccupationTypeofOrganisationweb(TypeOfOrganisation);
	personalinfo.EnterOccupationDesignationweb(Designation);
	personalinfo.EnterOccupationAnnualIncomeweb(AnnualIncome);
	personalinfo.ClickGSTYesBtnweb();
	Thread.sleep(2000);
	personalinfo.ClickSaveAndContinueweb();
	wait.WaitTime2();

	WebElement Error1 = driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[1]"));
	TestUtil.verifybgColor(Error1, driver);
	Assert.assertTrue(Error1.isDisplayed(), "Failed to Display  Error Msg of GST Registration Number");
	CustomListner.test.log(LogStatus.INFO, "Successfully Display GST Registration Number Error MSG");
	personalinfo.EnterGSTTextFieldweb(Gstvalue);
	personalinfo.ClickSaveAndContinueweb();

}





/*


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
*/
}
	
	
	
	


	
    

