package com.absli.testcases;

import Utils.TestFactory;
import com.absli.APIData.ApiData;
import com.absli.Listner.CustomListner;
import com.absli.base.TestBase;
import com.absli.dataproviders.DataProviders;
import com.absli.pageObjects.*;
import com.absli.utils.WaitUtils;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.TestUtil;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class ReviewAndAcceptTest extends TestBase {


    LoginPage loginPage;
    Dashboard dashboard;
    CustomerProfile customerProfile;
    ViewQuote viewQuote;
    HealthAndPureTermsPage healthandpuretermspage;
    AddNomineePage addnomineepage;
    BankDetails bankdetails;
    AddressPage address;
    PersonalInfo personalinfo;
    HealthDetail healthdetail;
    ReviewAndAccept reviewAndAccept;
    ApiData api;
    TestUtil testUtil;
    public ReviewAndAcceptTest() {
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
            healthdetail = new HealthDetail(TestBase.driver);
            reviewAndAccept = new ReviewAndAccept(TestBase.driver);
            api = new ApiData();
            testUtil = new TestUtil();

        } else if (TestBase.parameterName.equalsIgnoreCase("Android")) {
            loginPage = new LoginPage(TestBase.driver1);
            dashboard = new Dashboard(TestBase.driver1);
            customerProfile = new CustomerProfile(TestBase.driver1);
            viewQuote = new ViewQuote(TestBase.driver1);
            bankdetails = new BankDetails(TestBase.driver1);
            addnomineepage = new AddNomineePage(TestBase.driver1);
            address = new AddressPage(TestBase.driver1);
            personalinfo=new PersonalInfo(TestBase.driver1);
            healthdetail = new HealthDetail(TestBase.driver1);


        } else {
            loginPage = new LoginPage(TestBase.driver2);
            dashboard = new Dashboard(TestBase.driver2);
            customerProfile = new CustomerProfile(TestBase.driver2);
            viewQuote = new ViewQuote(TestBase.driver2);
            bankdetails = new BankDetails(TestBase.driver2);
            addnomineepage = new AddNomineePage(TestBase.driver2);
            address = new AddressPage(TestBase.driver2);
            personalinfo=new PersonalInfo(TestBase.driver2);
            healthdetail = new HealthDetail(TestBase.driver2);


        }
    }



    @Test(groups = {"web" }, dataProvider = "ReviewAndAcceptDataProvider", dataProviderClass = DataProviders.class, description = "TEST-86 ||Capture personal Health details "
            + "TEST-87 ||Validate Are you involved or do you intend to involve in any hazardous occupation or avocation? (for e.g. flying other than a fare paying passenger, diving, mountaineering, working at heights, "
            + "underground or offshore, using explosives or any other dangerous activity")
    public void ReviewAndAcceptWeb(String userName, String passWord, String leadID,
                                   String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
                                   String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
                                   String AciSumAssured, String Rideramount, String level, String IFSCCode, String IFSCErrorMSG,
                                   String BankName, String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
                                   String AccountNoErrorMSG, String PaymentMethod, String PreferredDrawDate, String SourceOfFunds,
                                   String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
                                   String nomiyear, String genderValue, String relationshipValue, String shareValue, String shareErrorMSG,
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
                                   String Gstvalue, String ClickOnhealthDetailTab, String FMBSLivingDemise, String FMBSAgeDeath,
                                   String FMBSStateAndCause)
            throws InterruptedException {


        new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome);


        healthdetail.EnterWeight("55");
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        healthdetail.ClickSaveContinueBtn();
        Thread.sleep(2000);

        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        healthdetail.ClicLifeStyleSaveContinueBtn();


        healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
        Thread.sleep(2000);
        TestUtil.scrollToElement(driver, driver.findElement(By.xpath("//div[text()='Mother']")));
        // This Line Is Tempary Becuse Living BTN Is NOt Click Directly
        driver.findElement(By.xpath("(//div[text()='Demise'])[1]")).click();
        Thread.sleep(2000);
        healthdetail.ValidationsOfFatherOnFamilyMedicalWeb(FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
        Thread.sleep(1000);
        TestUtil.scrollTillEndOfPage(driver);
        healthdetail.ValidationsOfMotherOnFamilyMedicalWeb(FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        healthdetail.ClickonAddBrotherBTNWeb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        healthdetail.ValidationsOfBrotherOnFamilyMedicalWeb(FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
        Thread.sleep(2000);
        healthdetail.ClickonSaveBrotherAndSisterBTNWeb();
        Thread.sleep(2000);

        healthdetail.ClickonAddSisterBTNAfterAddingBrotherBTNWeb();
        Thread.sleep(2000);
        healthdetail.ValidationsOfSisterOnFamilyMedicalWeb(FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        healthdetail.ClickonSaveBrotherAndSisterBTNWeb();
        Thread.sleep(2000);
        healthdetail.ClickonSaveAndContinueBTNWeb();
        Thread.sleep(4000);
/*
		healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
		Thread.sleep(2000);
		TestUtil.scrollToElement(driver, driver.findElement(By.xpath("//div[text()='Mother']")));

		WebElement Fatherage = driver.findElement(By.xpath("(//input[@placeholder='Age'])[1]"));
		  String getvalue=Fatherage.getText();
		if (Fatherage.isDisplayed()) {
			CustomListner.test.log(LogStatus.INFO, "Successfully Display  Father Age on family Medical");
		} else {
			CustomListner.test.log(LogStatus.INFO, "Father Age is Not Display On Family Medical");
		}
		Assert.assertTrue(Fatherage.isDisplayed());
		*/
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
        Thread.sleep(2000);
        healthdetail.ClicLifeStyleSaveContinueBtn();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        healthdetail.ClicLifeStyleSaveContinueBtn();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        reviewAndAccept.ClickAgreementCheckBox();
        reviewAndAccept.SendForReviewClick();
        Thread.sleep(30000);
        reviewAndAccept.performLinkGenAndOTPFill(userName,passWord);
        reviewAndAccept.verifyStatus();
        reviewAndAccept.clickProceed();
    }

}
