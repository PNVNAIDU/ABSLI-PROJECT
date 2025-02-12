package com.absli.testcases;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.absli.Listner.CustomListner;
import com.absli.base.TestBase;
import com.absli.dataproviders.DataProviders;
import com.absli.pageObjects.AddNomineePage;
import com.absli.pageObjects.BankDetails;
import com.absli.pageObjects.CustomerProfile;
import com.absli.pageObjects.Dashboard;
import com.absli.pageObjects.HealthAndPureTermsPage;
import com.absli.pageObjects.LoginPage;
import com.absli.pageObjects.ViewQuote;
import com.absli.utils.WaitUtils;
import com.relevantcodes.extentreports.LogStatus;

import Utils.TestFactory;
import util.TestUtil;

public class AddNomineePageTest extends TestBase{
	
	

    LoginPage loginPage;
    Dashboard dashboard;
    CustomerProfile customerProfile;
    ViewQuote viewQuote;
    HealthAndPureTermsPage healthandpuretermspage;
    AddNomineePage addnomineepage;
    BankDetails bankdetails;
    WaitUtils wait;
    public AddNomineePageTest() {
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
            healthandpuretermspage=new   HealthAndPureTermsPage(TestBase.driver);
            addnomineepage = new AddNomineePage(TestBase.driver);
            bankdetails= new BankDetails(TestBase.driver);
            wait=new WaitUtils();

        } else if (TestBase.parameterName.equalsIgnoreCase("Android")) {
            loginPage = new LoginPage(TestBase.driver1);
            dashboard = new Dashboard(TestBase.driver1);
            customerProfile = new CustomerProfile(TestBase.driver1);
            viewQuote = new ViewQuote(TestBase.driver1);
            healthandpuretermspage =new   HealthAndPureTermsPage(TestBase.driver1);
            addnomineepage =new AddNomineePage(TestBase.driver1);
            bankdetails= new BankDetails(TestBase.driver);
            wait=new WaitUtils();

            
        } else {
            loginPage = new LoginPage(TestBase.driver2);
            dashboard = new Dashboard(TestBase.driver2);
            customerProfile = new CustomerProfile(TestBase.driver2);
            viewQuote = new ViewQuote(TestBase.driver2);
            healthandpuretermspage =new   HealthAndPureTermsPage(TestBase.driver2);
            addnomineepage = new AddNomineePage(TestBase.driver2);
            wait=new WaitUtils();
            
        }
    }

	@Test(groups = {
			"web" }, dataProvider = "AddNomineePageDataProvider", dataProviderClass = DataProviders.class, description = "TEST-78||Validate User needs to add min 1 and click on next Button"
					+ "Validate % Value will always be whole numbers"
					+ "TEST-35||Verify User should NOT be allowed to enter any character other than alphabets except -space"
					+ "Validate The total nomination % across nominees needs to be 100%"
					+ "Validate if the relationship with the nominee is “Grandfather”, “Parent” , “Grandmother”, “Husband”, “Wife” then the age should be greater then 18 yrs of age"
					+ "Parent,GrandFather,GrandMother,Spouse,Children,Husband,Wife,Son,Daughter,Brother,Sister,Children"
					+ "\"Under the relationship tag, the below details will be displayed \r\n" + "1.Grandfather \r\n"
					+ "2.Grandmother \r\n" + "3.Brother \r\n" + "4.Sister \r\n" + "5.Father \r\n" + "6.Mother \r\n"
					+ "7.Legal Guardian\"\r\n"
					+ "TEST-36 || If the age of the nominee is more than 18 years, the Appointee details do not have to be displayed")
	public void UserNeedToAddMinOneNomineeWeb(String userName, String passWord, String leadID, String mobileNumber,
			String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
			String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
			String Rideramount, String level, String IFSCCode, String IFSCErrorMSG, String BankName,
			String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
			String AccountNoErrorMSG, String PaymentMethodString, String PreferredDrawDate, String SourceOfFunds,
			String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue, String shareErrorMSG,
			String relationshipErrorMSG, String firstNameErrorMSG, String lastNameErrorMSG, String removeMSG,
			String nomiDOBErrorMSG, String AppointeeFirstName, String AppointeeLastName, String AppointeeDD,
			String AppointeeMM, String AppointeeYY, String AppointeeGender, String AppointeeRealation)
			throws InterruptedException {

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
		TestUtil.scrollTillEndOfPage(driver);
		Thread.sleep(2000);
		addnomineepage.clickNomineeSAVEBtnWeb();
		wait.WaitTime2();
		addnomineepage.clickNomineeNEXTBtnWeb();
		wait.WaitTime5();
		addnomineepage.clickNomineeAddressNEXTBtnWeb();
		WebElement addresspage = driver.findElement(By.xpath("//span[text()='Address']"));

		boolean addressvalue = addresspage.isDisplayed();
		Assert.assertTrue(addressvalue);

	}
    
    
    

	@Test(groups = {
			"web" }, dataProvider = "AddNomineePageDataProvider", dataProviderClass = DataProviders.class, description = "TEST-78||Validate User needs to add min 2 and click on next Button")
	public void UserNeedToAddMinTwoNomineeWeb(String userName, String passWord, String leadID, String mobileNumber,
			String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
			String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
			String Rideramount, String level, String IFSCCode, String IFSCErrorMSG, String BankName,
			String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
			String AccountNoErrorMSG, String PaymentMethodString, String PreferredDrawDate, String SourceOfFunds,
			String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue, String shareErrorMSG,
			String relationshipErrorMSG, String firstNameErrorMSG, String lastNameErrorMSG, String removeMSG,
			String nomiDOBErrorMSG, String AppointeeFirstName, String AppointeeLastName, String AppointeeDD,
			String AppointeeMM, String AppointeeYY, String AppointeeGender, String AppointeeRealation)
			throws InterruptedException {

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
		for (int i = 1; i <= 2; i++) {

			addnomineepage.enterNomineeNameWeb(nomiFirstName);
			addnomineepage.enterNomineeLastNameWeb(nimiLastName);
			addnomineepage.fillDOBdetailsAddNomineeWeb(nomiday, nomimonth, nomiyear);
			addnomineepage.SelectGenderNomineePageWeb(genderValue);
			addnomineepage.SelectRelationshipwithProposerdropdownWeb(relationshipValue);
			addnomineepage.enterNomineeShareWeb(shareValue);
			TestUtil.scrollTillEndOfPage(driver);
			Thread.sleep(2000);
			addnomineepage.clickNomineeSAVEBtnWeb();
			wait.WaitTime2();
			if (i == 1) {
				addnomineepage.clickNomineeAddBtnWeb();

			}

		}
		addnomineepage.clickNomineeNEXTBtnWeb();
		wait.WaitTime5();
		addnomineepage.clickNomineeAddressNEXTBtnWeb();
		dashboard.checkLoaderWeb();
		wait.WaitTime2();
		WebElement addresspage = driver.findElement(By.xpath("//span[text()='Address']"));

		boolean addressvalue = addresspage.isDisplayed();
		Assert.assertTrue(addressvalue);
		 CustomListner.test.log(LogStatus.INFO, "Successfully Display Address Page Title");

	}
    


	@Test(groups = {
			"web" }, dataProvider = "AddNomineePageDataProvider", dataProviderClass = DataProviders.class, description = "TEST-78||Validate User needs to add min 3 and click on next Button")
	public void UserNeedToAddMinThirdNomineeWeb(String userName, String passWord, String leadID, String mobileNumber,
			String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
			String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
			String Rideramount, String level, String IFSCCode, String IFSCErrorMSG, String BankName,
			String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
			String AccountNoErrorMSG, String PaymentMethodString, String PreferredDrawDate, String SourceOfFunds,
			String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue, String shareErrorMSG,
			String relationshipErrorMSG, String firstNameErrorMSG, String lastNameErrorMSG, String removeMSG,
			String nomiDOBErrorMSG, String AppointeeFirstName, String AppointeeLastName, String AppointeeDD,
			String AppointeeMM, String AppointeeYY, String AppointeeGender, String AppointeeRealation)
			throws InterruptedException {

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
		Thread.sleep(1000);
		addnomineepage.clickNomineeAddBtnWeb();
		Thread.sleep(3000);

		addnomineepage.enterNomineeNameWeb(nomiFirstName);
		addnomineepage.enterNomineeLastNameWeb(nimiLastName);
		addnomineepage.fillDOBdetailsAddNomineeWeb(nomiday, nomimonth, nomiyear);
		addnomineepage.SelectGenderNomineePageWeb(genderValue);
		addnomineepage.SelectRelationshipwithProposerdropdownWeb(relationshipValue);
		addnomineepage.enterNomineeShareWeb(shareValue);
		addnomineepage.clickNomineeSAVEBtnWeb();
		Thread.sleep(1000);
		addnomineepage.clickNomineeAddBtnWeb();

		Thread.sleep(3000);
		addnomineepage.enterNomineeNameWeb(nomiFirstName);
		addnomineepage.enterNomineeLastNameWeb(nimiLastName);
		addnomineepage.fillDOBdetailsAddNomineeWeb(nomiday, nomimonth, nomiyear);
		addnomineepage.SelectGenderNomineePageWeb(genderValue);
		addnomineepage.SelectRelationshipwithProposerdropdownWeb(relationshipValue);
		String sharesatic = " 40";
		addnomineepage.enterNomineeShareWeb(sharesatic);
		addnomineepage.clickNomineeSAVEBtnWeb();
		Thread.sleep(3000);
		addnomineepage.clickNomineeNEXTBtnWeb();
		Thread.sleep(5000);
		addnomineepage.clickNomineeAddressNEXTBtnWeb();
		dashboard.checkLoaderWeb();
		wait.WaitTime2();
		WebElement addresspage = driver.findElement(By.xpath("//span[text()='Address']"));

		boolean addressvalue = addresspage.isDisplayed();
		Assert.assertTrue(addressvalue);
		CustomListner.test.log(LogStatus.INFO, "Successfully Display Address Page Title");

	}
    
    

	@Test(groups = {"web" }, dataProvider = "AddNomineePageDataProvider", dataProviderClass = DataProviders.class, description = "TEST-78||Validate User needs to add min 4 and click on next Button")
	public void UserNeedToAddMinFourthNomineeWeb(String userName, String passWord, String leadID, String mobileNumber,
			String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
			String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
			String Rideramount, String level, String IFSCCode, String IFSCErrorMSG, String BankName,
			String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
			String AccountNoErrorMSG, String PaymentMethodString, String PreferredDrawDate, String SourceOfFunds,
			String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue, String shareErrorMSG,
			String relationshipErrorMSG, String firstNameErrorMSG, String lastNameErrorMSG, String removeMSG,
			String nomiDOBErrorMSG, String AppointeeFirstName, String AppointeeLastName, String AppointeeDD,
			String AppointeeMM, String AppointeeYY, String AppointeeGender, String AppointeeRealation)
			throws InterruptedException {

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

		for (int i = 1; i <= 4; i++) {

			addnomineepage.enterNomineeNameWeb(nomiFirstName);
			addnomineepage.enterNomineeLastNameWeb(nimiLastName);
			addnomineepage.fillDOBdetailsAddNomineeWeb(nomiday, nomimonth, nomiyear);
			addnomineepage.SelectGenderNomineePageWeb(genderValue);
			addnomineepage.SelectRelationshipwithProposerdropdownWeb(relationshipValue);
			addnomineepage.enterNomineeShareWeb(shareValue);
			TestUtil.scrollTillEndOfPage(driver);
			Thread.sleep(2000);
			addnomineepage.clickNomineeSAVEBtnWeb();
			wait.WaitTime2();
			if (i == 1) {
				addnomineepage.clickNomineeAddBtnWeb();
			}
			if (i == 2) {
				addnomineepage.clickNomineeAddBtnWeb();
			}
			if (i == 3) {
				addnomineepage.clickNomineeAddBtnWeb();
			}
		}

		addnomineepage.clickNomineeNEXTBtnWeb();
		Thread.sleep(5000);
		addnomineepage.clickNomineeAddressNEXTBtnWeb();
		dashboard.checkLoaderWeb();
		wait.WaitTime2();
		WebElement addresspage = driver.findElement(By.xpath("//span[text()='Address']"));
		boolean addressvalue = addresspage.isDisplayed();
		Assert.assertTrue(addressvalue);
		CustomListner.test.log(LogStatus.INFO, "Successfully Display Address Page Title");
	}
           
            
    
	@Test(groups = {
			"web" }, dataProvider = "AddNomineePageDataProvider", dataProviderClass = DataProviders.class, description = "TEST-78||Validate User needs to add min 5 and click on next Button")
	public void UserNeedToAddMinFiveNomineeWeb(String userName, String passWord, String leadID, String mobileNumber,
			String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
			String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
			String Rideramount, String level, String IFSCCode, String IFSCErrorMSG, String BankName,
			String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
			String AccountNoErrorMSG, String PaymentMethodString, String PreferredDrawDate, String SourceOfFunds,
			String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue, String shareErrorMSG,
			String relationshipErrorMSG, String firstNameErrorMSG, String lastNameErrorMSG, String removeMSG,
			String nomiDOBErrorMSG, String AppointeeFirstName, String AppointeeLastName, String AppointeeDD,
			String AppointeeMM, String AppointeeYY, String AppointeeGender, String AppointeeRealation)
			throws InterruptedException {

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

		for (int i = 1; i <= 5; i++) {

			addnomineepage.enterNomineeNameWeb(nomiFirstName);
			addnomineepage.enterNomineeLastNameWeb(nimiLastName);
			addnomineepage.fillDOBdetailsAddNomineeWeb(nomiday, nomimonth, nomiyear);
			addnomineepage.SelectGenderNomineePageWeb(genderValue);
			addnomineepage.SelectRelationshipwithProposerdropdownWeb(relationshipValue);
			addnomineepage.enterNomineeShareWeb(shareValue);
			TestUtil.scrollTillEndOfPage(driver);
			Thread.sleep(2000);
			addnomineepage.clickNomineeSAVEBtnWeb();
			wait.WaitTime2();
			if (i == 1) {
				addnomineepage.clickNomineeAddBtnWeb();
			}
			if (i == 2) {
				addnomineepage.clickNomineeAddBtnWeb();
			}
			if (i == 3) {
				addnomineepage.clickNomineeAddBtnWeb();
			}
			if (i == 4) {
				addnomineepage.clickNomineeAddBtnWeb();
			}

		}
		addnomineepage.clickNomineeNEXTBtnWeb();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		addnomineepage.clickNomineeAddressNEXTBtnWeb();
		dashboard.checkLoaderWeb();
		wait.WaitTime2();
		WebElement addresspage = driver.findElement(By.xpath("//span[text()='Address']"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		boolean addressvalue = addresspage.isDisplayed();
		Assert.assertTrue(addressvalue);
		CustomListner.test.log(LogStatus.INFO, "Successfully Display Address Page Title");

	}
           
            
	@Test(groups = {
			"web" }, dataProvider = "AddNomineePageDataProvider", dataProviderClass = DataProviders.class, description = "TEST-78||Validate if User Add 6 Nominee")
	public void UserDoNotAddSixNomineeWeb(String userName, String passWord, String leadID, String mobileNumber,
			String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
			String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
			String Rideramount, String level, String IFSCCode, String IFSCErrorMSG, String BankName,
			String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
			String AccountNoErrorMSG, String PaymentMethodString, String PreferredDrawDate, String SourceOfFunds,
			String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue, String shareErrorMSG,
			String relationshipErrorMSG, String firstNameErrorMSG, String lastNameErrorMSG, String removeMSG,
			String nomiDOBErrorMSG, String AppointeeFirstName, String AppointeeLastName, String AppointeeDD,
			String AppointeeMM, String AppointeeYY, String AppointeeGender, String AppointeeRealation)
			throws InterruptedException {

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

		for (int i = 1; i <= 5; i++) {

			addnomineepage.enterNomineeNameWeb(nomiFirstName);
			addnomineepage.enterNomineeLastNameWeb(nimiLastName);
			addnomineepage.fillDOBdetailsAddNomineeWeb(nomiday, nomimonth, nomiyear);
			addnomineepage.SelectGenderNomineePageWeb(genderValue);
			addnomineepage.SelectRelationshipwithProposerdropdownWeb(relationshipValue);
			addnomineepage.enterNomineeShareWeb(shareValue);
			TestUtil.scrollTillEndOfPage(driver);
			Thread.sleep(2000);
			addnomineepage.clickNomineeSAVEBtnWeb();
			wait.WaitTime2();
			if (i == 1) {
				addnomineepage.clickNomineeAddBtnWeb();
			}
			if (i == 2) {
				addnomineepage.clickNomineeAddBtnWeb();
			}
			if (i == 3) {
				addnomineepage.clickNomineeAddBtnWeb();
			}
			if (i == 4) {
				addnomineepage.clickNomineeAddBtnWeb();
			}

		}
		addnomineepage.clickNomineeNEXTBtnWeb();
		wait.WaitTime5();

		try {
			WebElement pluesBtn = driver.findElement(By.xpath("//img[@alt='add icon']"));
			boolean pluesValue = pluesBtn.isDisplayed();
		} catch (Exception e) {

			Assert.assertFalse(false);
			CustomListner.test.log(LogStatus.INFO, "DO NOT  Add SIX NOMINEE OF NOMINEE PAGE   ");
		}

	}
    


	@Test(groups = {
			"web" }, dataProvider = "AddNomineePageDataProvider", dataProviderClass = DataProviders.class, description = "TEST-78||Validate If user enters value >100, then message - “Maximum value is 100”")
	public void UserEnterGreterThan100PersentOnShareWeb(String userName, String passWord, String leadID,
			String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
			String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
			String AciSumAssured, String Rideramount, String level, String IFSCCode, String IFSCErrorMSG,
			String BankName, String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
			String AccountNoErrorMSG, String PaymentMethodString, String PreferredDrawDate, String SourceOfFunds,
			String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue, String shareErrorMSG,
			String relationshipErrorMSG, String firstNameErrorMSG, String lastNameErrorMSG, String removeMSG,
			String nomiDOBErrorMSG, String AppointeeFirstName, String AppointeeLastName, String AppointeeDD,
			String AppointeeMM, String AppointeeYY, String AppointeeGender, String AppointeeRealation)
			throws InterruptedException {

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
		TestUtil.scrollTillEndOfPage(driver);
		Thread.sleep(2000);
		addnomineepage.clickNomineeSAVEBtnWeb();
		wait.WaitTime2();
		WebElement shareErrorMsg = driver.findElement(By.xpath("//p[text()='Maximum value is 100']"));
		String getvalue = shareErrorMsg.getText();
		TestUtil.verifybgColor(shareErrorMsg, driver);
		if (shareErrorMsg.isDisplayed()) {
			CustomListner.test.log(LogStatus.INFO,
					"Successfully Display  Nominee Share Persentage inline Error MSG..Maximum value is 100");
		} else {
			CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Nominee Share Persentage Error MSG");
		}
		Assert.assertEquals(getvalue, shareErrorMSG);

	}

    @Test(groups = {"web"}, dataProvider = "AddNomineePageDataProvider", dataProviderClass = DataProviders.class,
            description = "TEST-35||Verify Limit of first name and last name each have min 1 and max 25 alphabets"
    )
    public void UserLimitOfFirstAndLastNameNomineeWeb(String userName, String passWord, String leadID, String mobileNumber,
            String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
            String smokerNonSmoker, String pptOption, String term, String paymode, 
            String AciSumAssured, String Rideramount,String level,String IFSCCode,
            String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
            String AccountNo,String AccountNoErrorMSG,String PaymentMethodString,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
            String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
            String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG,
            String AppointeeFirstName,String AppointeeLastName,String AppointeeDD,String AppointeeMM,String AppointeeYY,String AppointeeGender,String AppointeeRealation) throws InterruptedException {

       
    	
    	
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
                 //addnomineepage.clickNomineeAddBtnWeb();
    
    
    
    
    }


	@Test(groups = {
			"web" }, dataProvider = "AddNomineePageDataProvider", dataProviderClass = DataProviders.class, description = "TEST-78||Validate User needs to assign a min % greater than 0 to each nominee - If user enters % =< 0, the message to be shown - “Please enter % share value >0”")
	public void UserNeedsAssignMinPersentGreaterThan0Web(String userName, String passWord, String leadID,
			String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
			String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
			String AciSumAssured, String Rideramount, String level, String IFSCCode, String IFSCErrorMSG,
			String BankName, String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
			String AccountNoErrorMSG, String PaymentMethodString, String PreferredDrawDate, String SourceOfFunds,
			String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue, String shareErrorMSG,
			String relationshipErrorMSG, String firstNameErrorMSG, String lastNameErrorMSG, String removeMSG,
			String nomiDOBErrorMSG, String AppointeeFirstName, String AppointeeLastName, String AppointeeDD,
			String AppointeeMM, String AppointeeYY, String AppointeeGender, String AppointeeRealation)
			throws InterruptedException {

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
		TestUtil.scrollTillEndOfPage(driver);
		Thread.sleep(2000);
		addnomineepage.clickNomineeSAVEBtnWeb();
		wait.WaitTime2();
		WebElement shareErrorMsg = driver.findElement(By.xpath("//p[text()='Please enter % share value > 0']"));
		String getvalue = shareErrorMsg.getText();
		TestUtil.verifybgColor(shareErrorMsg, driver);
		if (shareErrorMsg.isDisplayed()) {
			CustomListner.test.log(LogStatus.INFO, "Successfully Display Please enter % share value > 0 Error MSG");
		} else {
			CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Nominee Share Persentage Error MSG");
		}
		Assert.assertEquals(getvalue, shareErrorMSG);

	}

	@Test(groups = {
			"web" }, dataProvider = "AddNomineePageDataProvider", dataProviderClass = DataProviders.class, description = "TEST-78||Validate If after adding nominee %, the total exceeds 100%, message to be shown - “Total % shareholding cannot exceed 100%”")
	public void UserAfterAddingNomineePersentTotalExceeds100PersentWeb(String userName, String passWord, String leadID,
			String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
			String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
			String AciSumAssured, String Rideramount, String level, String IFSCCode, String IFSCErrorMSG,
			String BankName, String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
			String AccountNoErrorMSG, String PaymentMethodString, String PreferredDrawDate, String SourceOfFunds,
			String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue, String shareErrorMSG,
			String relationshipErrorMSG, String firstNameErrorMSG, String lastNameErrorMSG, String removeMSG,
			String nomiDOBErrorMSG, String AppointeeFirstName, String AppointeeLastName, String AppointeeDD,
			String AppointeeMM, String AppointeeYY, String AppointeeGender, String AppointeeRealation)
			throws InterruptedException {

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

		for (int i = 1; i <= 4; i++) {

			addnomineepage.enterNomineeNameWeb(nomiFirstName);
			addnomineepage.enterNomineeLastNameWeb(nimiLastName);
			addnomineepage.fillDOBdetailsAddNomineeWeb(nomiday, nomimonth, nomiyear);
			addnomineepage.SelectGenderNomineePageWeb(genderValue);
			addnomineepage.SelectRelationshipwithProposerdropdownWeb(relationshipValue);
			addnomineepage.enterNomineeShareWeb(shareValue);
			TestUtil.scrollTillEndOfPage(driver);
			Thread.sleep(2000);
			addnomineepage.clickNomineeSAVEBtnWeb();
			wait.WaitTime2();
			if (i == 1) {
				Thread.sleep(1000);
				addnomineepage.clickNomineeAddBtnWeb();
			}
			if (i == 2) {
				Thread.sleep(1000);
				addnomineepage.clickNomineeAddBtnWeb();
			}
			if (i == 3) {
				Thread.sleep(1000);
				addnomineepage.clickNomineeAddBtnWeb();
			}
		}

		WebElement shareErrorMsg = driver.findElement(By.xpath("//p[text()='Total % shareholding cannot exceed 100%']"));
		String getvalue = shareErrorMsg.getText();
		TestUtil.verifybgColor(shareErrorMsg, driver);
		if (shareErrorMsg.isDisplayed()) {
			CustomListner.test.log(LogStatus.INFO,"Successfully Display Total % shareholding cannot exceed 100% Error MSG");
		} else {
			CustomListner.test.log(LogStatus.FAIL,"Failed to Verified Total % shareholding cannot exceed 100% Error MSG");
		}
		Assert.assertEquals(getvalue, shareErrorMSG);

	}

	@Test(groups = {
			"web" }, dataProvider = "AddNomineePageDataProvider", dataProviderClass = DataProviders.class, description = "TEST-34||"
					+ "Validate If user does NOT select the relationship type, the nominee details cannot be saved"
					+ "Validate Error message if relationship type not chosen then - “Please choose the relationship type” on clicking next")
	public void UserSelectWithoutRelationshipWithProposeWeb(String userName, String passWord, String leadID,
			String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
			String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
			String AciSumAssured, String Rideramount, String level, String IFSCCode, String IFSCErrorMSG,
			String BankName, String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
			String AccountNoErrorMSG, String PaymentMethodString, String PreferredDrawDate, String SourceOfFunds,
			String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue, String shareErrorMSG,
			String relationshipErrorMSG, String firstNameErrorMSG, String lastNameErrorMSG, String removeMSG,
			String nomiDOBErrorMSG, String AppointeeFirstName, String AppointeeLastName, String AppointeeDD,
			String AppointeeMM, String AppointeeYY, String AppointeeGender, String AppointeeRealation)
			throws InterruptedException {

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
		addnomineepage.enterNomineeShareWeb(shareValue);
		// addnomineepage.SelectRelationshipwithProposerdropdownWeb(relationshipValue);
		TestUtil.scrollTillEndOfPage(driver);
		Thread.sleep(2000);
		addnomineepage.clickNomineeSAVEBtnWeb();
		wait.WaitTime2();
		WebElement RelationshipErrorMsg = driver
				.findElement(By.xpath("//p[text()='Please choose the relationship type']"));
		String getvalue = RelationshipErrorMsg.getText();
		TestUtil.verifybgColor(RelationshipErrorMsg, driver);
		if (RelationshipErrorMsg.isDisplayed()) {
			CustomListner.test.log(LogStatus.INFO, "Successfully Display Nominee Share Persentage Error MSG");
		} else {
			CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Nominee Share Persentage Error MSG");
		}
		Assert.assertEquals(getvalue, relationshipErrorMSG);

	}
    
	@Test(groups = {
			"web" }, dataProvider = "AddNomineePageDataProvider", dataProviderClass = DataProviders.class, description = "TEST-35|| Validate If min 1 character is NOT entered in first name or last name, the message needs to be shown “Please enter name"
					+ "Validate If name is NOT captured, nominee details cannot be saved"
					+ "TEST-36||Name field in min 1 and max 25, if Min is not entered, message to be shown “Please enter name” User will not be allowed to enter more than 25 characters")
	public void UserEnterWithoutNomineeFirstAndLastNameWeb(String userName, String passWord, String leadID,
			String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
			String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
			String AciSumAssured, String Rideramount, String level, String IFSCCode, String IFSCErrorMSG,
			String BankName, String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
			String AccountNoErrorMSG, String PaymentMethodString, String PreferredDrawDate, String SourceOfFunds,
			String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue, String shareErrorMSG,
			String relationshipErrorMSG, String firstNameErrorMSG, String lastNameErrorMSG, String removeMSG,
			String nomiDOBErrorMSG, String AppointeeFirstName, String AppointeeLastName, String AppointeeDD,
			String AppointeeMM, String AppointeeYY, String AppointeeGender, String AppointeeRealation)
			throws InterruptedException {

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
		TestUtil.scrollTillEndOfPage(driver);
		Thread.sleep(2000);
		addnomineepage.clickNomineeSAVEBtnWeb();
		wait.WaitTime2();
		WebElement firstNaErrorMsg = driver.findElement(By.xpath("//p[text()='Please enter first name']"));
		String getvalue = firstNaErrorMsg.getText();
		TestUtil.verifybgColor(firstNaErrorMsg, driver);
		if (firstNaErrorMsg.isDisplayed()) {
			CustomListner.test.log(LogStatus.INFO, "Successfully Display Nominee First Name Inline Error MSG");
		} else {
			CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Nominee First Name Error MSG");
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement lastNaErrorMsg = driver.findElement(By.xpath("//p[text()='Please enter last name']"));
		String getvalue1 = lastNaErrorMsg.getText();
		TestUtil.verifybgColor(lastNaErrorMsg, driver);
		if (lastNaErrorMsg.isDisplayed()) {
			CustomListner.test.log(LogStatus.INFO, "Successfully Display  Nominee Last Name Inline Error MSG");
		} else {
			CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Nominee  Last Name Error MSG");
		}
		Assert.assertEquals(getvalue, firstNameErrorMSG);
		Assert.assertEquals(getvalue1, lastNameErrorMSG);

	}
    
    
	@Test(groups = {
			"web" }, dataProvider = "AddNomineePageDataProvider", dataProviderClass = DataProviders.class, description = "TEST||Verify user able to enter only space value in First name field and last Name field, then should not allow next page . ")
	public void UserEnterSpaceOnNomineeFirstAndLastNameWeb(String userName, String passWord, String leadID,
			String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
			String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
			String AciSumAssured, String Rideramount, String level, String IFSCCode, String IFSCErrorMSG,
			String BankName, String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
			String AccountNoErrorMSG, String PaymentMethodString, String PreferredDrawDate, String SourceOfFunds,
			String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue, String shareErrorMSG,
			String relationshipErrorMSG, String firstNameErrorMSG, String lastNameErrorMSG, String removeMSG,
			String nomiDOBErrorMSG, String AppointeeFirstName, String AppointeeLastName, String AppointeeDD,
			String AppointeeMM, String AppointeeYY, String AppointeeGender, String AppointeeRealation)
			throws InterruptedException {

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
		wait.WaitTime2();
		WebElement firstErrorMsg = driver.findElement(By.xpath("//p[text()='First Name should be Alphabets']"));
		String getvalue = firstErrorMsg.getText();
		TestUtil.verifybgColor(firstErrorMsg, driver);
		if (firstErrorMsg.isDisplayed()) {
			CustomListner.test.log(LogStatus.INFO, "Successfully Display Nominee First Name Error MSG");
		} else {
			CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Nominee First Name Error MSG");
		}

		WebElement lastErrorMsg = driver.findElement(By.xpath("//p[text()='Last Name should be Alphabets']"));
		String getvalue1 = lastErrorMsg.getText();
		TestUtil.verifybgColor(lastErrorMsg, driver);
		if (lastErrorMsg.isDisplayed()) {
			CustomListner.test.log(LogStatus.INFO, "Successfully Display Nominee Last Name  Error MSG");
		} else {
			CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Nominee  Last Name Error MSG");
		}
		Assert.assertEquals(getvalue, firstNameErrorMSG);
		Assert.assertEquals(getvalue1, lastNameErrorMSG);

	}

	@Test(groups = {
			"web" }, dataProvider = "AddNomineePageDataProvider", dataProviderClass = DataProviders.class, description = "TEST-34|| Validate If the nominee relation selected as wife in any case user should get the option - “Do you want to register under MWP Act?")
	public void UserNomineeSelectWifeThenUserShouldBeGetOptionWeb(String userName, String passWord, String leadID,
			String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
			String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
			String AciSumAssured, String Rideramount, String level, String IFSCCode, String IFSCErrorMSG,
			String BankName, String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
			String AccountNoErrorMSG, String PaymentMethodString, String PreferredDrawDate, String SourceOfFunds,
			String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue, String shareErrorMSG,
			String relationshipErrorMSG, String firstNameErrorMSG, String lastNameErrorMSG, String removeMSG,
			String nomiDOBErrorMSG, String AppointeeFirstName, String AppointeeLastName, String AppointeeDD,
			String AppointeeMM, String AppointeeYY, String AppointeeGender, String AppointeeRealation)
			throws InterruptedException {

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
		wait.WaitTime2();
		TestUtil.scrollTillEndOfPage(driver);
		Thread.sleep(2000);
		WebElement MWPActElement = driver
				.findElement(By.xpath("//p[text()='Do you want to protect this policy under MWP Act?']"));
		TestUtil.verifybgColor(MWPActElement, driver);
		if (MWPActElement.isDisplayed()) {
			CustomListner.test.log(LogStatus.INFO,"Successfully Visible Do you want to protect this policy under MWP Act? MSG");
		} else {
			CustomListner.test.log(LogStatus.FAIL,"Failed to Visible Do you want to protect this policy under MWP Act?  MSG");
		}
		Assert.assertTrue(MWPActElement.isDisplayed(),"Failed to Visible Do you want to protect this policy under MWP Act?  MSG ");

	}
    

	@Test(groups = {
			"web" }, dataProvider = "AddNomineePageDataProvider", dataProviderClass = DataProviders.class, description = "TEST-79||To Verify that on remove, we show message -”Are you sure you would like to delete?”"
					+ "To verify On clicking ok, the value will be deleted. ")
	public void UserAddNomineeRemoveWeb(String userName, String passWord, String leadID, String mobileNumber,
			String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
			String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
			String Rideramount, String level, String IFSCCode, String IFSCErrorMSG, String BankName,
			String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
			String AccountNoErrorMSG, String PaymentMethodString, String PreferredDrawDate, String SourceOfFunds,
			String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue, String shareErrorMSG,
			String relationshipErrorMSG, String firstNameErrorMSG, String lastNameErrorMSG, String removeMSG,
			String nomiDOBErrorMSG, String AppointeeFirstName, String AppointeeLastName, String AppointeeDD,
			String AppointeeMM, String AppointeeYY, String AppointeeGender, String AppointeeRealation)
			throws InterruptedException {

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

		TestUtil.scrollTillEndOfPage(driver);

		addnomineepage.clickNomineeSAVEBtnWeb();
		wait.WaitTime2();

		addnomineepage.clickNomineeRemoveBtnWeb();
		wait.WaitTime2();
		WebElement removemsg = driver.findElement(By.xpath("//p[text()='Are you sure you would like to delete?']"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String getvaluemsg = removemsg.getText();
		TestUtil.verifybgColor(removemsg, driver);
		if (removemsg.isDisplayed()) {
			CustomListner.test.log(LogStatus.INFO, "Successfully Display Are you sure you would like to delete? MSG");
		} else {
			CustomListner.test.log(LogStatus.FAIL,
					"Failed to Verified Are you sure you would like to delete? Error MSG");
		}

		Assert.assertEquals(getvaluemsg, removeMSG);

		Thread.sleep(2000);
		addnomineepage.clickNomineeRemoveOKKBtnWeb();
		Thread.sleep(2000);

	}
    

    
    

	@Test(groups = {
			"web" }, dataProvider = "AddNomineePageDataProvider", dataProviderClass = DataProviders.class, description = "TEST-36||DOB of nominee cannot be greater than today ")
	public void UserEnterDOBGreaterThanTodayWeb(String userName, String passWord, String leadID, String mobileNumber,
			String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
			String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
			String Rideramount, String level, String IFSCCode, String IFSCErrorMSG, String BankName,
			String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
			String AccountNoErrorMSG, String PaymentMethodString, String PreferredDrawDate, String SourceOfFunds,
			String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue, String shareErrorMSG,
			String relationshipErrorMSG, String firstNameErrorMSG, String lastNameErrorMSG, String removeMSG,
			String nomiDOBErrorMSG, String AppointeeFirstName, String AppointeeLastName, String AppointeeDD,
			String AppointeeMM, String AppointeeYY, String AppointeeGender, String AppointeeRealation)
			throws InterruptedException {

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
		Thread.sleep(1000);
		WebElement Errormsg = driver.findElement(By.xpath("//span[text()='DOB cannot be greater than today']"));
		String getvaluemsg1 = Errormsg.getText();
		TestUtil.verifybgColor(Errormsg, driver);
		if (Errormsg.isDisplayed()) {
			CustomListner.test.log(LogStatus.INFO,
					"Successfully Display DOB cannot be greater than today Inline Error MSG");
		} else {
			CustomListner.test.log(LogStatus.FAIL,
					"Failed to Verified DOB cannot be greater than today Inline Error MSG");
		}

		Assert.assertEquals(getvaluemsg1, nomiDOBErrorMSG);

	}
    

    @Test(groups = {"web"}, dataProvider = "AddNomineePageDataProvider", dataProviderClass = DataProviders.class,
            description = "TEST-79|| To Verify that On edit and save, the total %age is checked for so that it does NOT exceed 100%"
    )
    public void  VerifyThatEditAndSavePersentOfShareWeb(String userName, String passWord, String leadID, String mobileNumber,
            String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
            String smokerNonSmoker, String pptOption, String term, String paymode, 
            String AciSumAssured, String Rideramount,String level,String IFSCCode,
            String IFSCErrorMSG,String BankName,String BankNameErrorMSG,String BranchName,String BranchNameErrorMSG,
            String AccountNo,String AccountNoErrorMSG,String PaymentMethodString,String PreferredDrawDate,String SourceOfFunds,String BankStatus,
            String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
            String shareValue,String shareErrorMSG,String relationshipErrorMSG,String firstNameErrorMSG,String lastNameErrorMSG,String removeMSG,String nomiDOBErrorMSG,
            String AppointeeFirstName,String AppointeeLastName,String AppointeeDD,String AppointeeMM,String AppointeeYY,String AppointeeGender,String AppointeeRealation) throws InterruptedException {

       
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
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        addnomineepage.clickNomineeSAVEBtnWeb();
        wait.WaitTime2();
        addnomineepage.clickNomineeEditBtnWeb();
        Thread.sleep(2000);
        addnomineepage.enterEditNomineeShareWeb();
        addnomineepage.clickNomineeSAVEBtnWeb();
        wait.WaitTime2();
        WebElement shareErrorMsg1=driver.findElement(By.xpath("//p[text()='Maximum value is 100']"));
        String getvalue2=shareErrorMsg1.getText();
        TestUtil.verifybgColor(shareErrorMsg1, driver);
        if(shareErrorMsg1.isDisplayed())
        {
        	CustomListner.test.log(LogStatus.INFO, "Successfully Display Nominee Share Persentage Error MSG");
        }else {
        	CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Nominee Share Persentage Error MSG");
        }
        Assert.assertEquals(getvalue2, shareErrorMSG);
           
            
         
    }

    
    
	@Test(groups = {
			"web" }, dataProvider = "AddNomineePageDataProvider", dataProviderClass = DataProviders.class, description = "TEST-79|| To Verify that on edit, the revised details are captured")
	public void ClickEditBTNCapturedRevisedNomiDetailsWeb(String userName, String passWord, String leadID,
			String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
			String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
			String AciSumAssured, String Rideramount, String level, String IFSCCode, String IFSCErrorMSG,
			String BankName, String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
			String AccountNoErrorMSG, String PaymentMethodString, String PreferredDrawDate, String SourceOfFunds,
			String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue, String shareErrorMSG,
			String relationshipErrorMSG, String firstNameErrorMSG, String lastNameErrorMSG, String removeMSG,
			String nomiDOBErrorMSG, String AppointeeFirstName, String AppointeeLastName, String AppointeeDD,
			String AppointeeMM, String AppointeeYY, String AppointeeGender, String AppointeeRealation)
			throws InterruptedException {

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
		TestUtil.scrollTillEndOfPage(driver);
		Thread.sleep(2000);
		addnomineepage.clickNomineeSAVEBtnWeb();
		wait.WaitTime2();
		addnomineepage.clickNomineeEditBtnWeb();

		WebElement firstname = driver.findElement(By.xpath("//label[text()='First Name']"));

		Thread.sleep(1000);
		TestUtil.verifybgColor(firstname, driver);
		if (firstname.isDisplayed()) {
			CustomListner.test.log(LogStatus.INFO, "Successfully Nominee Name ");
		} else {
			CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Nominee name");
		}
		Assert.assertTrue(firstname.isDisplayed());

	}

	@Test(groups = {
			"web" }, dataProvider = "AddNomineePageDataProvider", dataProviderClass = DataProviders.class, description = "TEST-79|| To verify Message is having “OK  | Cancel” button "
					+ "To verify On clicking cancel, the value will remain as it is")
	public void RemoveNomineeVerifyCanselBTNdWeb(String userName, String passWord, String leadID,
			String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
			String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
			String AciSumAssured, String Rideramount, String level, String IFSCCode, String IFSCErrorMSG,
			String BankName, String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
			String AccountNoErrorMSG, String PaymentMethodString, String PreferredDrawDate, String SourceOfFunds,
			String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue, String shareErrorMSG,
			String relationshipErrorMSG, String firstNameErrorMSG, String lastNameErrorMSG, String removeMSG,
			String nomiDOBErrorMSG, String AppointeeFirstName, String AppointeeLastName, String AppointeeDD,
			String AppointeeMM, String AppointeeYY, String AppointeeGender, String AppointeeRealation)
			throws InterruptedException {

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
		TestUtil.scrollTillEndOfPage(driver);
		Thread.sleep(2000);
		addnomineepage.clickNomineeSAVEBtnWeb();
		wait.WaitTime2();
		addnomineepage.clickNomineeRemoveBtnWeb();
		wait.WaitTime2();
		addnomineepage.verifyNomineeRemoveOKBtnWeb();
		addnomineepage.verifyNomineeRemoveCANSELBtnWeb();
		addnomineepage.clickNomineeRemoveCancelBtnWeb();
		WebElement firstname1 = driver.findElement(By.xpath("//label[text()='First Name']"));

		Thread.sleep(1000);
		TestUtil.verifybgColor(firstname1, driver);
		if (firstname1.isDisplayed()) {
			CustomListner.test.log(LogStatus.INFO, "Successfully Nominee Name ");
		} else {
			CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Nominee name");
		}
		Assert.assertTrue(firstname1.isDisplayed());

	}
        
	@Test(groups = {
			"web" }, dataProvider = "AddNomineePageDataProvider", dataProviderClass = DataProviders.class, description = "TEST-79|| To Verify if the user is able to see the “Nominee name” on the card when minimized with “Remove” and “Edit” button")
	public void VerifyNomineeNameCardMINIMIZWeb(String userName, String passWord, String leadID,
			String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
			String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
			String AciSumAssured, String Rideramount, String level, String IFSCCode, String IFSCErrorMSG,
			String BankName, String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
			String AccountNoErrorMSG, String PaymentMethodString, String PreferredDrawDate, String SourceOfFunds,
			String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue, String shareErrorMSG,
			String relationshipErrorMSG, String firstNameErrorMSG, String lastNameErrorMSG, String removeMSG,
			String nomiDOBErrorMSG, String AppointeeFirstName, String AppointeeLastName, String AppointeeDD,
			String AppointeeMM, String AppointeeYY, String AppointeeGender, String AppointeeRealation) throws InterruptedException {

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
		Thread.sleep(2000);
		addnomineepage.clickNomineeMinimizBtnWeb();

		Thread.sleep(5000);
	}
    
    //====================================Below Appointee========================================

    
	@Test(groups = {
			"web" }, dataProvider = "AddNomineePageDataProvider", dataProviderClass = DataProviders.class, description = "TEST-36|| Verify that If the age of the nominee is less than 18 years, the Appointee details need to be displayed"
					+ "TEST-36 || If the age of the nominee is less than 18 years, the Appointee details need to be captured manadatory"
					+ "TEST-36 || Verify that if age of nominee is less than 18, the below details of Appointee need to be captured \r\n"
					+ "1.Relationship with Nominee \r\n" + "2.Appointee first name \r\n" + "3.Appointee last name"
					+ "TEST-36 || Verify that Under the relationship tag, the below details will be displayed \r\n"
					+ "1.Grandfather \r\n" + "2.Brother" + "3.Father " + "4.Legal Guardian"
					+ "TEST-36 || Verify that Appointee first name field should display"
					+ "TEST-36 || Verify that Appointee last name field should display"
					+ "TEST-36 || If Appointee relationship with nominee not selected then message to be displayed “Please select Relationship with Nominee”"
					+ "TEST-36 || For minor nominee more than one appointee can not be allowed by the user"
					+ "TEST-36 || Verify that Appointee age cannot be less than 18 years as on date when the application is entered"
					+ "test-36 || Appointee DOB is less than 18 as of today then message “Appointee age must be 18 years or above”"
					+ "TEST-36 || Verify that Name fields cannot accept any value other than alphabets,space and period"
					+ "TEST-36 || Name field in min 1 and max 25, if Min is not entered, message to be shown “Please enter name” User will not be allowed to enter more than 25 characters"
					+ "TEST-36 || ")
	public void ValidationAppointeeDetailsWeb(String userName, String passWord, String leadID, String mobileNumber,
			String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
			String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
			String Rideramount, String level, String IFSCCode, String IFSCErrorMSG, String BankName,
			String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
			String AccountNoErrorMSG, String PaymentMethodString, String PreferredDrawDate, String SourceOfFunds,
			String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue, String shareErrorMSG,
			String relationshipErrorMSG, String firstNameErrorMSG, String lastNameErrorMSG, String removeMSG,
			String nomiDOBErrorMSG, String AppointeeFirstName, String AppointeeLastName, String AppointeeDD,
			String AppointeeMM, String AppointeeYY, String AppointeeGender, String AppointeeRealation)
			throws InterruptedException {

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

		addnomineepage.VerificationOfAppointeeweb();

		addnomineepage.VerificationOfAppointeeFirstAndLastNameweb();

		addnomineepage.clickNomineeSAVEBtnWeb();

		addnomineepage.VerificationOfAppointeeAllFiledErrorMSGweb();

		addnomineepage.enterAppointeeFirstNameWeb(AppointeeFirstName);

		addnomineepage.enterAppointeeLastNameWeb(AppointeeLastName);

		addnomineepage.fillDOBdetailsAppointeeWeb(AppointeeDD, AppointeeMM, AppointeeYY);

		addnomineepage.VerificationOfAppointeeDOBErrorMSGweb();

		addnomineepage.SelectGenderAppointeePageWeb(AppointeeGender);

		addnomineepage.VerificationOfRelationShipOfNomineeErrorMSGweb();

		WebElement relationshipDropdown = driver.findElement(By.xpath("(//div[@role='button'])[3]"));

		if (relationshipDropdown.isDisplayed()) {
			relationshipDropdown.click();
		}
		String[] Occupationupdate = AppointeeRealation.split(",");
		for (int i = 0; i <= Occupationupdate.length - 1; i++) {
			addnomineepage.VerifyRealationshipWithNomineeweb(Occupationupdate[i]);
		}

	}
    


	@Test(groups = {
			"web" }, dataProvider = "AddNomineePageDataProvider", dataProviderClass = DataProviders.class, description = "User Should Be Able to Add less Than 18 yr"
					+ "User Should Be able to allowed to enter " + "TEST-36 || ")
	public void AddFiveMinorNomineeOfSingleAppointeeWeb(String userName, String passWord, String leadID,
			String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
			String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
			String AciSumAssured, String Rideramount, String level, String IFSCCode, String IFSCErrorMSG,
			String BankName, String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
			String AccountNoErrorMSG, String PaymentMethodString, String PreferredDrawDate, String SourceOfFunds,
			String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue, String shareErrorMSG,
			String relationshipErrorMSG, String firstNameErrorMSG, String lastNameErrorMSG, String removeMSG,
			String nomiDOBErrorMSG, String AppointeeFirstName, String AppointeeLastName, String AppointeeDD,
			String AppointeeMM, String AppointeeYY, String AppointeeGender, String AppointeeRealation)
			throws InterruptedException {

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

		for (int i = 1; i <= 5; i++) {

			addnomineepage.enterNomineeNameWeb(nomiFirstName);
			addnomineepage.enterNomineeLastNameWeb(nimiLastName);
			addnomineepage.fillDOBdetailsAddNomineeWeb(nomiday, nomimonth, nomiyear);
			addnomineepage.SelectGenderNomineePageWeb(genderValue);
			addnomineepage.SelectRelationshipwithProposerdropdownWeb(relationshipValue);
			addnomineepage.enterNomineeShareWeb(shareValue);
			addnomineepage.clickNomineeSAVEBtnWeb();
			wait.WaitTime2();

			if (i == 1) {
				addnomineepage.clickNomineeAddBtnWeb();
			}
			if (i == 2) {
				addnomineepage.clickNomineeAddBtnWeb();
			}
			if (i == 3) {
				addnomineepage.clickNomineeAddBtnWeb();
			}
			if (i == 4) {
				addnomineepage.clickNomineeAddBtnWeb();
			}

		}

		addnomineepage.VerificationOfAppointeeweb();
		addnomineepage.enterAppointeeFirstNameWeb(AppointeeFirstName);
		addnomineepage.enterAppointeeLastNameWeb(AppointeeLastName);
		addnomineepage.fillDOBdetailsAppointeeWeb(AppointeeDD, AppointeeMM, AppointeeYY);
		addnomineepage.SelectGenderAppointeePageWeb(AppointeeGender);
		addnomineepage.SelectRelationshipwithProposerdropdownAppointeeWeb(AppointeeRealation);
		TestUtil.scrollTillEndOfPage(driver);
		addnomineepage.clickNomineeSAVEBtnWeb();

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
    
    
    
    

