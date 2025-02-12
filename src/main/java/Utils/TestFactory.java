package Utils;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

import com.absli.Listner.CustomListner;
import com.absli.base.TestBase;
import com.absli.pageObjects.AddNomineePage;
import com.absli.pageObjects.AddressPage;
import com.absli.pageObjects.BankDetails;
import com.absli.pageObjects.CustomerProfile;
import com.absli.pageObjects.Dashboard;
import com.absli.pageObjects.Documents;
import com.absli.pageObjects.HealthDetail;
import com.absli.pageObjects.LoginPage;
import com.absli.pageObjects.PaymentPage;
import com.absli.pageObjects.PersonalInfo;
import com.absli.pageObjects.PlanInfo;
import com.absli.pageObjects.ReviewAndAccept;
import com.absli.pageObjects.ViewQuote;
import com.absli.utils.WaitUtils;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import util.TestUtil;

public class TestFactory {

	    LoginPage loginPage;
	    Dashboard dashboard;
	    CustomerProfile customerProfile;
	    ViewQuote viewQuote;
	    PlanInfo planInfo;
	    BankDetails bankdetails;
	    AddNomineePage addnomineepage;
	    AddressPage address;
	    PersonalInfo personalinfo;
	    HealthDetail healthdetail;
	    ReviewAndAccept reviewAndAccept;
	    PaymentPage paymentpage;
	    Documents document;
	    public WaitUtils waitUtils;

	

		public void gotoBankweb(WebDriver driver, String userName, String passWord, String leadID, String mobileNumber,
				String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
				String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
				String Rideramount, String level) throws InterruptedException {

			loginPage = new LoginPage(driver);
			dashboard = new Dashboard(driver);
			customerProfile = new CustomerProfile(driver);
			viewQuote = new ViewQuote(driver);

			loginPage.enterUserNameweb(userName);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loginPage.enterpasswordweb(passWord);
			loginPage.submitButtonweb();
			dashboard.checkLoaderWeb();
			waitUtils.WaitTime2();
			dashboard.clickPlusButtonWeb();
			dashboard.clickNewCustomerButton();
			dashboard.checkLoaderWeb();
			waitUtils.WaitTime5();

			customerProfile.enterLeadIDWeb(leadID);
			customerProfile.customerProfileNextButtonClick();
			dashboard.checkLoaderWeb();
			waitUtils.WaitTime2();
			customerProfile.clickIAgreeCheckboxWeb();
			customerProfile.enterMobileNumberWeb(mobileNumber);
			customerProfile.enterpanNumberWeb(panNumber);
			customerProfile.customerProfileNextButtonClick();
			dashboard.checkLoaderWeb();
			waitUtils.WaitTime5();
			customerProfile.fillDOBdetailsWeb(day, month, year);
			customerProfile.customerProfileSaveButtonClick();
			waitUtils.WaitTime2();
			customerProfile.customerProfileNEXTButtonClick();
			waitUtils.WaitTime5();

			// viewQuote.clickselectPlanBtnWeb();
			// viewQuote. clickNextBtnWeb();
			// Thread.sleep(2000);
			viewQuote.selectPlanJourneyNewWeb("ABSLI Digishield Plan");
			driver.navigate().refresh();
			waitUtils.WaitTime5();
			viewQuote.clickNextBtnCapital();
			waitUtils.WaitTime2();
			viewQuote.clickContinueBtn();
			waitUtils.WaitTime2();
			// viewQuote.clickInstaDoItButton();
			// Thread.sleep(3000);

		}
	public void gotoNomineeweb(WebDriver driver,String userName, String passWord, String leadID, String mobileNumber,
            String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
            String smokerNonSmoker, String pptOption, String term, String paymode, 
            String AciSumAssured, String Rideramount,String level,String IFSCCode,String AccountNo,String PaymentMethod,
            String PreferredDrawDate,String SourceOfFunds) throws InterruptedException {
		   
		    loginPage=new LoginPage(driver);
		    dashboard=new Dashboard(driver);
		    customerProfile=new CustomerProfile(driver);
		    viewQuote=new ViewQuote(driver);
		    bankdetails=new BankDetails(driver);
		    
		    loginPage.enterUserNameweb(userName);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loginPage.enterpasswordweb(passWord);
			loginPage.submitButtonweb();
			dashboard.checkLoaderWeb();
			waitUtils.WaitTime2();
			dashboard.clickPlusButtonWeb();
			dashboard.clickNewCustomerButton();
			dashboard.checkLoaderWeb();
			waitUtils.WaitTime5();

			customerProfile.enterLeadIDWeb(leadID);
			customerProfile.customerProfileNextButtonClick();
			dashboard.checkLoaderWeb();
			waitUtils.WaitTime2();
		    customerProfile.clickIAgreeCheckboxWeb();
			customerProfile.enterMobileNumberWeb(mobileNumber);
			customerProfile.enterpanNumberWeb(panNumber);
			customerProfile.customerProfileNextButtonClick();
			dashboard.checkLoaderWeb();
			waitUtils.WaitTime5();
			customerProfile.fillDOBdetailsWeb(day, month, year);
			customerProfile.customerProfileSaveButtonClick();
			waitUtils.WaitTime2();
			customerProfile.customerProfileNEXTButtonClick();
			waitUtils.WaitTime5();

			// viewQuote.clickselectPlanBtnWeb();
			// viewQuote. clickNextBtnWeb();
			// Thread.sleep(2000);
			viewQuote.selectPlanJourneyNewWeb("ABSLI Digishield Plan");
			driver.navigate().refresh();
			waitUtils.WaitTime5();
			viewQuote.clickNextBtnCapital();
			waitUtils.WaitTime2();
			viewQuote.clickContinueBtn();
			waitUtils.WaitTime2();
	        bankdetails.InputIFSCCode(IFSCCode); 
	        waitUtils.WaitTime2();
	        TestUtil.scrollTillEndOfPage(driver);
	        Thread.sleep(2000);
	        bankdetails.EnterAccountNumberField(AccountNo);
	        waitUtils.WaitTime2();
	        bankdetails.ClickVerifyButtinweb();
	        waitUtils.WaitTime5();
			bankdetails.ClickOnProceedBtnweb();
			dashboard.checkLoaderWeb();
			waitUtils.WaitTime2();
	        bankdetails.ClickPaymentMethodweb(PaymentMethod);
	        bankdetails.ClickPreferredDrawDateweb(PreferredDrawDate);
	        bankdetails.ClickSourceOfFundweb(SourceOfFunds);
	        TestUtil.scrollTillEndOfPage(driver);
	        Thread.sleep(2000);
	        bankdetails.ClickSaveButtonweb();
	        waitUtils.WaitTime2();
	        viewQuote.clickNextBtnCapital();
	        Thread.sleep(2000);
		
	}
	public void gotoBankWithQuoteweb(WebDriver driver,String userName, String passWord, String leadID, String mobileNumber,
            String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
            String smokerNonSmoker, String pptOption, String term, String paymode, 
            String AciSumAssured, String Rideramount,String level) throws InterruptedException {
		   
		    loginPage=new LoginPage(driver);
		    dashboard=new Dashboard(driver);
		    customerProfile=new CustomerProfile(driver);
		    viewQuote=new ViewQuote(driver);
		    
		    
		    loginPage.enterUserNameweb(userName);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loginPage.enterpasswordweb(passWord);
			loginPage.submitButtonweb();
			dashboard.checkLoaderWeb();
			waitUtils.WaitTime2();
			dashboard.clickPlusButtonWeb();
			dashboard.clickNewCustomerButton();
			dashboard.checkLoaderWeb();
			waitUtils.WaitTime5();

			customerProfile.enterLeadIDWeb(leadID);
			customerProfile.customerProfileNextButtonClick();
			dashboard.checkLoaderWeb();
			waitUtils.WaitTime2();
		    customerProfile.clickIAgreeCheckboxWeb();
			customerProfile.enterMobileNumberWeb(mobileNumber);
			customerProfile.enterpanNumberWeb(panNumber);
			customerProfile.customerProfileNextButtonClick();
			dashboard.checkLoaderWeb();
			waitUtils.WaitTime5();
			customerProfile.fillDOBdetailsWeb(day, month, year);
			customerProfile.customerProfileSaveButtonClick();
			waitUtils.WaitTime2();
			customerProfile.customerProfileNEXTButtonClick();
			waitUtils.WaitTime5();

			// viewQuote.clickselectPlanBtnWeb();
			// viewQuote. clickNextBtnWeb();
			// Thread.sleep(2000);
			viewQuote.selectPlanJourneyNewWeb("ABSLI Digishield Plan");
			driver.navigate().refresh();
			waitUtils.WaitTime5();
	        viewQuote.enterSumAssuredWeb(quoteAmount);
	        Thread.sleep(2000);
	        viewQuote.clickNextBtnCapital();
	        waitUtils.WaitTime2();
	        viewQuote.clickContinueBtn();
	        dashboard.checkLoaderWeb();
	        waitUtils.WaitTime2();
//	        viewQuote.clickInstaDoItButton();
//	        Thread.sleep(3000);
		
		
	}
	public void gotoBankAndroid(AndroidDriver driver1,String userName, String passWord, String leadID, String mobileNumber,
            String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
            String smokerNonSmoker, String pptOption, String term, String paymode, 
            String AciSumAssured, String Rideramount,String level) throws InterruptedException {
		   
		    loginPage=new LoginPage(driver1);
		    dashboard=new Dashboard(driver1);
		    customerProfile=new CustomerProfile(driver1);
		    viewQuote=new ViewQuote(driver1);
		    
		    
		    loginPage.enterUserNameAndroid(userName);
	         Thread.sleep(2000);
	         loginPage.enterpasswordAndroid(passWord);
	         Thread.sleep(2000);
	         loginPage.submitButtonAndroid();
	         Thread.sleep(3000);
	         dashboard.clickhamburgerAndroid();
	         Thread.sleep(3000);
	         dashboard.clickNewCustomerAndroid();
	         Thread.sleep(3000);
	         customerProfile.enterLeadIDAndroid(leadID);
	         ((AndroidDriver)driver1).hideKeyboard();
	         Thread.sleep(2000);
	         customerProfile.customerProfileNextButtonClickAndroid();
	         Thread.sleep(3000);
	         customerProfile.enterMobileNumberAndroid(mobileNumber);
	         driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         customerProfile.enterpanNumberAndroid(panNumber);
	         customerProfile.customerProfileNextButtonClickAndroid();
	         Thread.sleep(3000);
	        customerProfile.fillDOBdetailsAndroid(day, month,year);
	        Thread.sleep(2000);
	        viewQuote.clickSaveBtnAndroid();
	        Thread.sleep(3000);
	        viewQuote.clickselectPlanBtnAndroid();
	        Thread.sleep(2000);
	        viewQuote.selectPlanJourneyNewAndroid("ABSLI Digishield Plan");
	       // driver1.navigate().refresh();
	        Thread.sleep(5000);
	        driver1.findElement(By.xpath("//*[@text='OK']")).click();
	        viewQuote.InputSumAssuredAndroid(quoteAmount);
	        Thread.sleep(2000);
	       // viewQuote.selectPlanOptionsAndroid(planOptions);
	      //  Thread.sleep(2000);
	        driver1.findElement(By.xpath("//*[@text='OK']")).click();
	        driver1.findElementByAndroidUIAutomator("new UiScrollable(new    UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"NEXT\").instance(0))").click();
	        driver1.findElement(MobileBy.AndroidUIAutomator(
			"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"NEXT\").instance(0));"));
	        
	        viewQuote.InputPolicyTermAndroid(term);
	        Thread.sleep(2000);
	        viewQuote.clickNextBtnCapitalAndroid();
	        Thread.sleep(2000);
	        viewQuote.clickContinueBtnAndroid();
	        Thread.sleep(2000);
	        viewQuote.clickInstaDoItButtonAndroid();
	        Thread.sleep(3000);
		
		
	}

	public void gotoHealthDetailweb(WebDriver driver, String userName, String passWord, String leadID,
			String mobileNumber, String panNumber, String day, String month, String year, String IFSCCode,
			String AccountNo, String PaymentMethod, String PreferredDrawDate, String SourceOfFunds,
			String nomiFirstName, String nimiLastName, String nomiday, String nomimonth, String nomiyear,
			String genderValue, String relationshipValue, String shareValue, String addressType, String pinCode,
			String addressOne, String addressTwo, String addressThree, String language, String mobile, String telNo,
			String Emaild, String MaritalStatus, String fatherSpouseName, String motherName, String maidenName,
			String Qualification, String Occupation, String NameOfEmployer, String NatureofBusiness,
			String TypeOfOrganisation, String Designation, String AnnualIncome) throws InterruptedException {

		loginPage = new LoginPage(driver);
		dashboard = new Dashboard(driver);
		customerProfile = new CustomerProfile(driver);
		viewQuote = new ViewQuote(driver);
		bankdetails = new BankDetails(driver);
		addnomineepage = new AddNomineePage(driver);
		address = new AddressPage(driver);
		personalinfo = new PersonalInfo(driver);

		loginPage.enterUserNameweb(userName);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterpasswordweb(passWord);
		loginPage.submitButtonweb();
		dashboard.checkLoaderWeb();
		waitUtils.WaitTime2();
		dashboard.clickPlusButtonWeb();
		dashboard.clickNewCustomerButton();
		dashboard.checkLoaderWeb();
		waitUtils.WaitTime5();

		customerProfile.enterLeadIDWeb(leadID);
		customerProfile.customerProfileNextButtonClick();
		dashboard.checkLoaderWeb();
		waitUtils.WaitTime2();
		customerProfile.clickIAgreeCheckboxWeb();
		customerProfile.enterMobileNumberWeb(mobileNumber);
		customerProfile.enterpanNumberWeb(panNumber);
		customerProfile.customerProfileNextButtonClick();
		dashboard.checkLoaderWeb();
		waitUtils.WaitTime5();
		customerProfile.fillDOBdetailsWeb(day, month, year);
		customerProfile.customerProfileSaveButtonClick();
		waitUtils.WaitTime2();
		customerProfile.customerProfileNEXTButtonClick();
		waitUtils.WaitTime5();

		// viewQuote.clickselectPlanBtnWeb();
		// viewQuote. clickNextBtnWeb();
		// Thread.sleep(2000);
		viewQuote.selectPlanJourneyNewWeb("ABSLI Digishield Plan");
		
		driver.navigate().refresh();
		waitUtils.WaitTime5();
		Thread.sleep(2000);
		viewQuote.clickNextBtnCapital();
		waitUtils.WaitTime2();
		viewQuote.clickContinueBtn();
		waitUtils.WaitTime2();
		bankdetails.InputIFSCCode(IFSCCode);
		waitUtils.WaitTime2();
		TestUtil.scrollTillEndOfPage(driver);
		Thread.sleep(2000);
		bankdetails.EnterAccountNumberField(AccountNo);
		waitUtils.WaitTime2();
		bankdetails.ClickVerifyButtinweb();
		waitUtils.WaitTime5();
		bankdetails.ClickOnProceedBtnweb();
		dashboard.checkLoaderWeb();
		waitUtils.WaitTime2();
		bankdetails.ClickPaymentMethodweb(PaymentMethod);
		bankdetails.ClickPreferredDrawDateweb(PreferredDrawDate);
		bankdetails.ClickSourceOfFundweb(SourceOfFunds);
		TestUtil.scrollTillEndOfPage(driver);
		Thread.sleep(2000);
		bankdetails.ClickSaveButtonweb();
		waitUtils.WaitTime2();
		viewQuote.clickNextBtnCapital();
		Thread.sleep(2000);

		addnomineepage.enterNomineeNameWeb(nomiFirstName);
		addnomineepage.enterNomineeLastNameWeb(nimiLastName);
		addnomineepage.fillDOBdetailsAddNomineeWeb(nomiday, nomimonth, nomiyear);
		addnomineepage.SelectGenderNomineePageWeb(genderValue);
		addnomineepage.SelectRelationshipwithProposerdropdownWeb(relationshipValue);
		addnomineepage.enterNomineeShareWeb(shareValue);
		TestUtil.scrollTillEndOfPage(driver);
		Thread.sleep(2000);
		addnomineepage.clickNomineeSAVEBtnWeb();
		waitUtils.WaitTime2();
		addnomineepage.clickNomineeNEXTBtnWeb();
		waitUtils.WaitTime5();
		addnomineepage.clickNomineeAddressNEXTBtnWeb();
		dashboard.checkLoaderWeb();
		waitUtils.WaitTime2();
		address.clickAddressDropdownWeb();
		address.selectAddressWeb(addressType);
		address.enterPinWeb(pinCode);
		Thread.sleep(2000);
		address.validationAddressOneWeb(addressOne);
		address.validationAddressTwoWeb(addressTwo);
		address.selectPreferredLangWeb(language);
		address.selectAlternateMobileNoWeb(mobile);
		TestUtil.scrollTillEndOfPage(driver);
		Thread.sleep(2000);
		address.selectTelPhoneNoWeb(telNo);
		//address.ClickSaveBTNWeb();
		//Thread.sleep(2000);
		address.ClickAddressNEXTBTNWeb();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		waitUtils.WaitTime5();
		personalinfo.EnterEmailIdweb(Emaild);
		personalinfo.EnterMaritalStatusweb(MaritalStatus);
		personalinfo.EnterFatherSpaouseNameweb(fatherSpouseName);
		personalinfo.EnterMotherNameweb(motherName);
	
		// personalinfo.EnterMaidenNameweb(maidenName);
		// Thread.sleep(1000);
		TestUtil.scrollTillEndOfPage(driver);
		Thread.sleep(2000);
		personalinfo.SelectQualificationweb(Qualification);
		personalinfo.SelectOccupationweb(Occupation);
		personalinfo.EnterOccupationNameofEmployeeweb(NameOfEmployer);
		personalinfo.EnterOccupationNatureofbusinessweb(NatureofBusiness);
		personalinfo.selectOccupationTypeofOrganisationweb(TypeOfOrganisation);
		personalinfo.EnterOccupationDesignationweb(Designation);
		personalinfo.EnterOccupationAnnualIncomeweb(AnnualIncome);

		TestUtil.scrollTillEndOfPage(driver);
		Thread.sleep(2000);
		personalinfo.ClickSaveAndContinueweb();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		TestUtil.scrollTillEndOfPage(driver);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[contains(text(),'DO IT LATER ')]")).click();
		//CustomListner.test.log(LogStatus.INFO, "Click On DO IT LATER Button");
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//TestUtil.scrollTillEndOfPage(driver);
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[contains(text(),'DO IT LATER')]")).click();
		CustomListner.test.log(LogStatus.INFO, "Click On DO IT LATER Button");
		Thread.sleep(4000);
		// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}
	public void gotoPaymentPageweb(WebDriver driver,String userName, String passWord, String leadID, String mobileNumber,
            String panNumber, String day, String month, String year,String IFSCCode,String AccountNo,String PaymentMethod,
            String PreferredDrawDate,String SourceOfFunds,
            String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
            String shareValue,String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String language, String mobile, String telNo,
            String Emaild,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
            String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,
            String ClickOnhealthDetailTab,String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause) throws InterruptedException {
		   
		    loginPage=new LoginPage(driver);
		    dashboard=new Dashboard(driver);
		    customerProfile=new CustomerProfile(driver);
		    viewQuote=new ViewQuote(driver);
		    bankdetails=new BankDetails(driver);
		     addnomineepage=new AddNomineePage(driver);
		     address=new AddressPage(driver);
		     personalinfo=new PersonalInfo(driver);
		     healthdetail =new  HealthDetail(driver);
		      reviewAndAccept =new ReviewAndAccept(driver);
		     paymentpage = new PaymentPage(driver);
		    
		    loginPage.enterUserNameweb(userName);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        loginPage.enterpasswordweb(passWord);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        loginPage.submitButtonweb();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        Thread.sleep(1000);
	        dashboard.clickPlusButtonWeb();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        dashboard.clickNewCustomerButton();
	       // dashboard.clickHamburgerandSelectNewApplicationWeb();
	        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	        customerProfile.enterLeadIDWeb(leadID);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        customerProfile.customerProfileNextButtonClick();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       // dashboard.checkLoaderWeb();
	 		customerProfile.clickIAgreeCheckboxWeb();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        customerProfile.enterMobileNumberWeb(mobileNumber);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        customerProfile.enterpanNumberWeb(panNumber);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        customerProfile.customerProfileNextButtonClick();
	        TestUtil.scrollTillEndOfPage(driver);
	        
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        customerProfile.fillDOBdetailsWeb(day, month, year);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        TestUtil.scrollTillEndOfPage(driver);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        viewQuote.clickselectPlanBtnWeb();
	        driver.manage().timeouts().implicitlyWait(01, TimeUnit.SECONDS);
	        viewQuote. clickNextBtnWeb();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        //viewQuote. clickNextBtnWeb();
	        viewQuote.selectPlanJourneyNewWeb("ABSLI Digishield Plan");
	        driver.navigate().refresh();
	        Thread.sleep(5000);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        TestUtil.scrollTillEndOfPage(driver);
	        Thread.sleep(2000);
	        viewQuote.clickNextBtnCapital();
	        Thread.sleep(2000);
	        TestUtil.scrollTillEndOfPage(driver);
	        Thread.sleep(2000);
	        viewQuote.clickContinueBtn();
	       // Thread.sleep(2000);
	       // viewQuote.clickInstaDoItButton();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        bankdetails.InputIFSCCode(IFSCCode); 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        TestUtil.scrollTillEndOfPage(driver);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        bankdetails.EnterAccountNumberField(AccountNo);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        bankdetails.ClickVerifyButtinweb();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       // bankdetails.ClickAlertOkButtinweb();
	        bankdetails.ClickOnProceedBtnweb();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       // bankdetails.ClickPolicyPayoutNEXTweb();
	        Thread.sleep(2000);
	        bankdetails.ClickPaymentMethodweb(PaymentMethod);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        bankdetails.ClickPreferredDrawDateweb(PreferredDrawDate);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        bankdetails.ClickSourceOfFundweb(SourceOfFunds);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        TestUtil.scrollTillEndOfPage(driver);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        bankdetails.ClickSaveButtonweb();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        viewQuote.clickNextBtnCapital();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        
	        
	        addnomineepage.enterNomineeNameWeb(nomiFirstName);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.enterNomineeLastNameWeb(nimiLastName);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.fillDOBdetailsAddNomineeWeb(nomiday, nomimonth, nomiyear);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.SelectGenderNomineePageWeb(genderValue);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.SelectRelationshipwithProposerdropdownWeb(relationshipValue);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.enterNomineeShareWeb(shareValue);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.clickNomineeSAVEBtnWeb();
            Thread.sleep(2000);
            addnomineepage.clickNomineeNEXTBtnWeb();
            Thread.sleep(3000);
            addnomineepage.clickNomineeAddressNEXTBtnWeb();
         
            Thread.sleep(2000);
            address.clickAddressDropdownWeb();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            address.selectAddressWeb(addressType);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            address.enterPinWeb(pinCode);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            address.validationAddressOneWeb(addressOne);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            address.validationAddressTwoWeb(addressTwo);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            address.validationAddressThreeWeb(addressThree);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            address.selectPreferredLangWeb(language);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            address.selectAlternateMobileNoWeb(mobile);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            TestUtil.scrollTillEndOfPage(driver);
            address.selectTelPhoneNoWeb(telNo);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //address.ClickSaveBTNWeb();
          
            address.ClickAddressNEXTBTNWeb();
            Thread.sleep(3000);
            
        	personalinfo.EnterEmailIdweb(Emaild);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	personalinfo.EnterMaritalStatusweb(MaritalStatus);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	personalinfo.EnterFatherSpaouseNameweb(fatherSpouseName);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	personalinfo.EnterMotherNameweb(motherName);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	//personalinfo.EnterMaidenNameweb(maidenName);
        	
        	TestUtil.scrollTillEndOfPage(driver);
        	Thread.sleep(2000);
        	personalinfo.SelectQualificationweb(Qualification);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	personalinfo.SelectOccupationweb(Occupation);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	personalinfo.EnterOccupationNameofEmployeeweb(NameOfEmployer);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	personalinfo.EnterOccupationNatureofbusinessweb(NatureofBusiness);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	personalinfo.selectOccupationTypeofOrganisationweb(TypeOfOrganisation);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	personalinfo.EnterOccupationDesignationweb(Designation);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	personalinfo.EnterOccupationAnnualIncomeweb(AnnualIncome);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	TestUtil.scrollTillEndOfPage(driver);
        	Thread.sleep(2000);
        	personalinfo.ClickSaveAndContinueweb();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//span[contains(text(),'DO IT LATER ')]")).click();
        	CustomListner.test.log(LogStatus.INFO, "Click On DO IT LATER Button");
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	TestUtil.scrollTillEndOfPage(driver);
   
     	  TestUtil.scrollTillTOPOfPage(driver);
          driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
       	  personalinfo.ClickSelectProposeOfInsuranceWeb(purposeOfInsuValue1, purposeOfInsuValue2, purposeOfInsuValue3);
       	  Thread.sleep(2000);
       	  TestUtil.scrollTillEndOfPage(driver);
     	  Thread.sleep(2000);
     	  personalinfo.ClickpurposeOfInsurancekNextBTNweb();
     	  Thread.sleep(2000);
        	  
     	 Thread.sleep(2000);
     	 healthdetail.EnterWeight("55");
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         TestUtil.scrollTillEndOfPage(driver);
         driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
         healthdetail.ClickSaveContinueBtn();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

         TestUtil.scrollTillEndOfPage(driver);
         Thread.sleep(2000);
         healthdetail.ClicLifeStyleSaveContinueBtn();


         healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         TestUtil.scrollToElement(driver, driver.findElement(By.xpath("//div[text()='Mother']")));
      
         driver.findElement(By.xpath("(//div[text()='Demise'])[1]")).click();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         healthdetail.ValidationsOfFatherOnFamilyMedicalWeb(FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
         Thread.sleep(1000);
         TestUtil.scrollTillEndOfPage(driver);
         healthdetail.ValidationsOfMotherOnFamilyMedicalWeb(FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         TestUtil.scrollTillEndOfPage(driver);
         Thread.sleep(2000);
         healthdetail.ClickonAddBrotherBTNWeb();
         Thread.sleep(2000);
         TestUtil.scrollTillEndOfPage(driver);
         Thread.sleep(2000);
         healthdetail.ValidationsOfBrotherOnFamilyMedicalWeb(FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         healthdetail.ClickonSaveBrotherAndSisterBTNWeb();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         healthdetail.ClickonAddSisterBTNAfterAddingBrotherBTNWeb();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         healthdetail.ValidationsOfSisterOnFamilyMedicalWeb(FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
         Thread.sleep(2000);
         TestUtil.scrollTillEndOfPage(driver);
         healthdetail.ClickonSaveBrotherAndSisterBTNWeb();
         Thread.sleep(2000);
         healthdetail.ClickonSaveAndContinueBTNWeb();
         Thread.sleep(1000);
 
         TestUtil.scrollTillEndOfPage(driver);
         Thread.sleep(2000);
         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
         driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         healthdetail.ClicLifeStyleSaveContinueBtn();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         TestUtil.scrollTillEndOfPage(driver);
         Thread.sleep(2000);
         healthdetail.ClicLifeStyleSaveContinueBtn();
         Thread.sleep(2000);
         TestUtil.scrollTillEndOfPage(driver);
         reviewAndAccept.ClickAgreementCheckBox();
         reviewAndAccept.SendForReviewClick();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         reviewAndAccept.performLinkGenAndOTPFill(userName,passWord);
         reviewAndAccept.verifyStatus();
         reviewAndAccept.clickProceed();
	}
	public void gotoDocumentweb(WebDriver driver,String userName, String passWord, String leadID, String mobileNumber,
            String panNumber, String day, String month, String year,String IFSCCode,String AccountNo,String PaymentMethod,
            String PreferredDrawDate,String SourceOfFunds,
            String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
            String shareValue,String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String language, String mobile, String telNo,
            String Emaild,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
            String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,
            String ClickOnhealthDetailTab,String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause,String clickOnPaymentMode) throws InterruptedException {
		   
		    loginPage=new LoginPage(driver);
		    dashboard=new Dashboard(driver);
		    customerProfile=new CustomerProfile(driver);
		    viewQuote=new ViewQuote(driver);
		    bankdetails=new BankDetails(driver);
		     addnomineepage=new AddNomineePage(driver);
		     address=new AddressPage(driver);
		     personalinfo=new PersonalInfo(driver);
		     healthdetail =new  HealthDetail(driver);
		      reviewAndAccept =new ReviewAndAccept(driver);
		      paymentpage=new PaymentPage(driver);
		    
		    loginPage.enterUserNameweb(userName);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        loginPage.enterpasswordweb(passWord);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        loginPage.submitButtonweb();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        Thread.sleep(5000);
	        dashboard.clickPlusButtonWeb();
	        Thread.sleep(2000);
	        dashboard.clickNewCustomerButton();
	       // dashboard.clickHamburgerandSelectNewApplicationWeb();
	        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	        customerProfile.enterLeadIDWeb(leadID);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        customerProfile.customerProfileNextButtonClick();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       // dashboard.checkLoaderWeb();
	        Thread.sleep(3000);
			customerProfile.clickIAgreeCheckboxWeb();
	        customerProfile.enterMobileNumberWeb(mobileNumber);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        customerProfile.enterpanNumberWeb(panNumber);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        customerProfile.customerProfileNextButtonClick();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        customerProfile.fillDOBdetailsWeb(day, month, year);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        Thread.sleep(2000);
	        viewQuote.ClickonCustomerprofileSaveButton();
	        viewQuote.clickselectPlanBtnWeb();
	        Thread.sleep(3000);
	        viewQuote.selectPlanJourneyNewWeb("ABSLI Digishield Plan");
	        driver.navigate().refresh();
	        Thread.sleep(5000);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        viewQuote.clickNextBtnCapital();
	        Thread.sleep(2000);
	        viewQuote.clickContinueBtn();
	       // Thread.sleep(2000);
	       // viewQuote.clickInstaDoItButton();
	        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	        bankdetails.InputIFSCCode(IFSCCode); 
	        Thread.sleep(2000);
	        TestUtil.scrollTillEndOfPage(driver);
	        Thread.sleep(2000);
	        bankdetails.EnterAccountNumberField(AccountNo);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        bankdetails.ClickVerifyButtinweb();
	        bankdetails.ClickOnProceedBtnweb();
	        Thread.sleep(3000);
	        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	        bankdetails.ClickPaymentMethodweb(PaymentMethod);
	        bankdetails.ClickPreferredDrawDateweb(PreferredDrawDate);
	        bankdetails.ClickSourceOfFundweb(SourceOfFunds);
	        TestUtil.scrollTillEndOfPage(driver);
	        Thread.sleep(2000);
	        bankdetails.ClickSaveButtonweb();
	        Thread.sleep(2000);
	        viewQuote.clickNextBtnCapital();
	        Thread.sleep(2000);
	        
	        
	        
	        addnomineepage.enterNomineeNameWeb(nomiFirstName);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.enterNomineeLastNameWeb(nimiLastName);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.fillDOBdetailsAddNomineeWeb(nomiday, nomimonth, nomiyear);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.SelectGenderNomineePageWeb(genderValue);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.SelectRelationshipwithProposerdropdownWeb(relationshipValue);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.enterNomineeShareWeb(shareValue);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.clickNomineeSAVEBtnWeb();
            Thread.sleep(2000);
            addnomineepage.clickNomineeNEXTBtnWeb();
            Thread.sleep(5000);
            addnomineepage.clickNomineeAddressNEXTBtnWeb();
         
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            address.clickAddressDropdownWeb();
            address.selectAddressWeb(addressType);
            address.enterPinWeb(pinCode);
            Thread.sleep(2000);
            address.validationAddressOneWeb(addressOne);
            address.validationAddressTwoWeb(addressTwo);
            address.validationAddressThreeWeb(addressThree);
            address.selectPreferredLangWeb(language);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            address.selectAlternateMobileNoWeb(mobile);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            TestUtil.scrollTillEndOfPage(driver);
            address.selectTelPhoneNoWeb(telNo);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            address.ClickSaveBTNWeb();
            Thread.sleep(2000);
            address.ClickAddressNEXTBTNWeb();
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
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
        	TestUtil.scrollTillEndOfPage(driver);
        	Thread.sleep(2000);
        	personalinfo.ClickSaveAndContinueweb();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//span[contains(text(),'DO IT LATER ')]")).click();
        	CustomListner.test.log(LogStatus.INFO, "Click On DO IT LATER Button");
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	TestUtil.scrollTillEndOfPage(driver);
   
     	  TestUtil.scrollTillTOPOfPage(driver);
      	  Thread.sleep(2000);
       	  personalinfo.ClickSelectProposeOfInsuranceWeb(purposeOfInsuValue1, purposeOfInsuValue2, purposeOfInsuValue3);
       	  Thread.sleep(2000);
       	  TestUtil.scrollTillEndOfPage(driver);
     	  Thread.sleep(2000);
     	  personalinfo.ClickpurposeOfInsurancekNextBTNweb();
     	  Thread.sleep(2000);
     	 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
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
         Thread.sleep(2000);
         reviewAndAccept.ClickAgreementCheckBox();
         Thread.sleep(2000);
         reviewAndAccept.SendForReviewClick();
         Thread.sleep(30000);
         reviewAndAccept.performLinkGenAndOTPFill(userName,passWord);
         Thread.sleep(5000);
         reviewAndAccept.verifyStatus();
         Thread.sleep(2000);
         reviewAndAccept.clickProceed();
         Thread.sleep(2000);
         WebElement PaymentBTN=driver.findElement(By.xpath("//div[contains(text(),'WIN BACK')]"));
         Thread.sleep(2000);
         TestUtil.scrollToElement(driver,PaymentBTN);
         Thread.sleep(2000);
         paymentpage.ClickOnPaymentModeweb(clickOnPaymentMode);
         Thread.sleep(2000);
         TestUtil.scrollTillEndOfPage(driver);
         Thread.sleep(2000);
         paymentpage.ClickOnCashSubmitBTNweb();
         Thread.sleep(5000);
         paymentpage.ClickOnPaymentSummaryNextBTNweb();
         Thread.sleep(4000);
	}
	public void gotoIARweb(WebDriver driver,String userName, String passWord, String leadID, String mobileNumber,
            String panNumber, String day, String month, String year,String IFSCCode,String AccountNo,String PaymentMethod,
            String PreferredDrawDate,String SourceOfFunds,
            String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
            String shareValue,String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String language, String mobile, String telNo,
            String Emaild,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
            String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,
            String ClickOnhealthDetailTab,String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause,String clickOnPaymentMode,String SelectTypeOfDocument,String SelectTypeOfDocAgeProof) throws InterruptedException {
		   
		    loginPage=new LoginPage(driver);
		    dashboard=new Dashboard(driver);
		    customerProfile=new CustomerProfile(driver);
		    viewQuote=new ViewQuote(driver);
		    bankdetails=new BankDetails(driver);
		     addnomineepage=new AddNomineePage(driver);
		     address=new AddressPage(driver);
		     personalinfo=new PersonalInfo(driver);
		     healthdetail =new  HealthDetail(driver);
		      reviewAndAccept =new ReviewAndAccept(driver);
		      paymentpage=new PaymentPage(driver);
		      document=new Documents(driver);
		      
		    
		    loginPage.enterUserNameweb(userName);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        loginPage.enterpasswordweb(passWord);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        loginPage.submitButtonweb();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        Thread.sleep(5000);
	        dashboard.clickPlusButtonWeb();
	        Thread.sleep(2000);
	        dashboard.clickNewCustomerButton();
	       // dashboard.clickHamburgerandSelectNewApplicationWeb();
	        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	        customerProfile.enterLeadIDWeb(leadID);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        customerProfile.customerProfileNextButtonClick();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       // dashboard.checkLoaderWeb();
	        Thread.sleep(3000);
			customerProfile.clickIAgreeCheckboxWeb();
	        customerProfile.enterMobileNumberWeb(mobileNumber);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        customerProfile.enterpanNumberWeb(panNumber);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        customerProfile.customerProfileNextButtonClick();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        customerProfile.fillDOBdetailsWeb(day, month, year);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        Thread.sleep(2000);
	        viewQuote.clickselectPlanBtnWeb();
	        Thread.sleep(3000);
	        viewQuote. clickNextBtnWeb();
	        viewQuote.selectPlanJourneyNewWeb("ABSLI Digishield Plan");
	        driver.navigate().refresh();
	        Thread.sleep(5000);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        viewQuote.clickNextBtnCapital();
	        Thread.sleep(2000);
	        viewQuote.clickContinueBtn();
	       // Thread.sleep(2000);
	       // viewQuote.clickInstaDoItButton();
	        Thread.sleep(3000);
	        bankdetails.InputIFSCCode(IFSCCode); 
	        Thread.sleep(2000);
	        TestUtil.scrollTillEndOfPage(driver);
	        Thread.sleep(2000);
	        bankdetails.EnterAccountNumberField(AccountNo);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        bankdetails.ClickVerifyButtinweb();
	        Thread.sleep(4000);
	        bankdetails.ClickAlertOkButtinweb();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        bankdetails.ClickPolicyPayoutNEXTweb();
	        Thread.sleep(3000);
	        bankdetails.ClickPaymentMethodweb(PaymentMethod);
	        Thread.sleep(2000);
	        bankdetails.ClickPreferredDrawDateweb(PreferredDrawDate);
	        Thread.sleep(2000);
	        bankdetails.ClickSourceOfFundweb(SourceOfFunds);
	        Thread.sleep(2000);
	        TestUtil.scrollTillEndOfPage(driver);
	        Thread.sleep(2000);
	        bankdetails.ClickSaveButtonweb();
	        Thread.sleep(2000);
	        viewQuote.clickNextBtnCapital();
	        Thread.sleep(2000);
	        
	        
	        
	        addnomineepage.enterNomineeNameWeb(nomiFirstName);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.enterNomineeLastNameWeb(nimiLastName);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.fillDOBdetailsAddNomineeWeb(nomiday, nomimonth, nomiyear);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.SelectGenderNomineePageWeb(genderValue);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.SelectRelationshipwithProposerdropdownWeb(relationshipValue);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.enterNomineeShareWeb(shareValue);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.clickNomineeSAVEBtnWeb();
            Thread.sleep(2000);
            addnomineepage.clickNomineeNEXTBtnWeb();
            Thread.sleep(5000);
            addnomineepage.clickNomineeAddressNEXTBtnWeb();
         
            Thread.sleep(2000);
            address.clickAddressDropdownWeb();
            Thread.sleep(1000);
            address.selectAddressWeb(addressType);
            
            Thread.sleep(1000);
            address.enterPinWeb(pinCode);
            Thread.sleep(2000);
            address.validationAddressOneWeb(addressOne);
            address.validationAddressTwoWeb(addressTwo);
            address.validationAddressThreeWeb(addressThree);
            Thread.sleep(2000);
            address.selectPreferredLangWeb(language);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            address.selectAlternateMobileNoWeb(mobile);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            TestUtil.scrollTillEndOfPage(driver);
            address.selectTelPhoneNoWeb(telNo);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            address.ClickSaveBTNWeb();
            Thread.sleep(2000);
            address.ClickAddressNEXTBTNWeb();
            Thread.sleep(3000);
            
        	personalinfo.EnterEmailIdweb(Emaild);
        	Thread.sleep(4000);
        	personalinfo.EnterMaritalStatusweb(MaritalStatus);
        	Thread.sleep(1000);
        	personalinfo.EnterFatherSpaouseNameweb(fatherSpouseName);
        	Thread.sleep(1000);
        	personalinfo.EnterMotherNameweb(motherName);
        	Thread.sleep(1000);
        	personalinfo.EnterMaidenNameweb(maidenName);
        	Thread.sleep(1000);
        	TestUtil.scrollTillEndOfPage(driver);
        	Thread.sleep(2000);
        	personalinfo.SelectQualificationweb(Qualification);
        	Thread.sleep(1000);
        	personalinfo.SelectOccupationweb(Occupation);
        	Thread.sleep(2000);
        	personalinfo.EnterOccupationNameofEmployeeweb(NameOfEmployer);
        	Thread.sleep(1000);
        	personalinfo.EnterOccupationNatureofbusinessweb(NatureofBusiness);
        	Thread.sleep(1000);
        	personalinfo.selectOccupationTypeofOrganisationweb(TypeOfOrganisation);
        	Thread.sleep(1000);
        	personalinfo.EnterOccupationDesignationweb(Designation);
        	Thread.sleep(1000);
        	personalinfo.EnterOccupationAnnualIncomeweb(AnnualIncome);
        	Thread.sleep(1000);
        	TestUtil.scrollTillEndOfPage(driver);
        	Thread.sleep(2000);
        	personalinfo.ClickSaveAndContinueweb();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//span[contains(text(),'DO IT LATER ')]")).click();
        	CustomListner.test.log(LogStatus.INFO, "Click On DO IT LATER Button");
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	TestUtil.scrollTillEndOfPage(driver);
   
     	  TestUtil.scrollTillTOPOfPage(driver);
      	  Thread.sleep(2000);
       	  personalinfo.ClickSelectProposeOfInsuranceWeb(purposeOfInsuValue1, purposeOfInsuValue2, purposeOfInsuValue3);
       	  Thread.sleep(2000);
       	  TestUtil.scrollTillEndOfPage(driver);
     	  Thread.sleep(2000);
     	  personalinfo.ClickpurposeOfInsurancekNextBTNweb();
     	  Thread.sleep(2000);
        	  
     	 Thread.sleep(2000);
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
         Thread.sleep(2000);
        // reviewAndAccept.ClickAgreementCheckBox();
        // Thread.sleep(2000);
         reviewAndAccept.SendForReviewClick();
         Thread.sleep(30000);
         reviewAndAccept.performLinkGenAndOTPFill(userName,passWord);
         Thread.sleep(5000);
         reviewAndAccept.verifyStatus();
         Thread.sleep(2000);
         reviewAndAccept.clickProceed();
         Thread.sleep(2000);
         WebElement PaymentBTN=driver.findElement(By.xpath("//div[contains(text(),'WIN BACK')]"));
         Thread.sleep(2000);
         TestUtil.scrollToElement(driver,PaymentBTN);
         Thread.sleep(2000);
         paymentpage.ClickOnPaymentModeweb(clickOnPaymentMode);
         Thread.sleep(2000);
         TestUtil.scrollTillEndOfPage(driver);
         Thread.sleep(2000);
         paymentpage.ClickOnCashSubmitBTNweb();
         Thread.sleep(5000);
         paymentpage.ClickOnPaymentSummaryNextBTNweb();
         Thread.sleep(4000);
         
         document.clickOnIdentityTileweb();
         Thread.sleep(2000);
         document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
         Thread.sleep(1000);
         document.UploadFileweb();
         Thread.sleep(3000);
         document.clickOnNEXTButtonweb();
         Thread.sleep(2000);
       //  document.UploadNonMedicalIncomeProofweb();
         //Thread.sleep(2000);
        // WebElement PhotographEle= driver.findElement(By.xpath("//div[contains(text(),'Photograph')]"));
        // TestUtil.scrollToElement(driver, PhotographEle);
        // Thread.sleep(1000);
         document.UploadNonMedicalNEFTCancelweb();
         Thread.sleep(2000);
         TestUtil.scrollTillEndOfPage(driver);
         Thread.sleep(2000);
         document.UploadNonMedicalPHOTOGRAPHweb();
         Thread.sleep(2000);
         TestUtil.scrollTillEndOfPage(driver);
         Thread.sleep(2000);
         document.clickOnNEXTButtonweb();
         Thread.sleep(3000);
         TestUtil.scrollTillEndOfPage(driver);
         Thread.sleep(2000);
         document.clickOnNEXTButtonweb();
         Thread.sleep(3000);
         document.SelectTypeOfDocumentIncomePrrofweb(SelectTypeOfDocAgeProof);
         Thread.sleep(2000);
         document.UploadFileweb();
         Thread.sleep(2000);
         TestUtil.scrollTillEndOfPage(driver);
         Thread.sleep(1000);
         document.clickOnNEXTButtonweb();
         Thread.sleep(4000);
        
         
	}
	public void gotoDocumentChangeDOBweb(WebDriver driver,String userName, String passWord, String leadID, String mobileNumber,
            String panNumber, String day, String month, String year,String IFSCCode,String AccountNo,String PaymentMethod,
            String PreferredDrawDate,String SourceOfFunds,
            String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
            String shareValue,String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String language, String mobile, String telNo,
            String Emaild,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
            String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,
            String ClickOnhealthDetailTab,String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause,String clickOnPaymentMode) throws InterruptedException {
		   
		    loginPage=new LoginPage(driver);
		    dashboard=new Dashboard(driver);
		    customerProfile=new CustomerProfile(driver);
		    viewQuote=new ViewQuote(driver);
		    bankdetails=new BankDetails(driver);
		     addnomineepage=new AddNomineePage(driver);
		     address=new AddressPage(driver);
		     personalinfo=new PersonalInfo(driver);
		     healthdetail =new  HealthDetail(driver);
		      reviewAndAccept =new ReviewAndAccept(driver);
		      paymentpage=new PaymentPage(driver);
		    
		    loginPage.enterUserNameweb(userName);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        loginPage.enterpasswordweb(passWord);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        loginPage.submitButtonweb();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        Thread.sleep(5000);
	        dashboard.clickPlusButtonWeb();
	        Thread.sleep(2000);
	        dashboard.clickNewCustomerButton();
	       // dashboard.clickHamburgerandSelectNewApplicationWeb();
	        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	        customerProfile.enterLeadIDWeb(leadID);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        customerProfile.customerProfileNextButtonClick();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       // dashboard.checkLoaderWeb();
	        Thread.sleep(3000);
			customerProfile.clickIAgreeCheckboxWeb();
	        customerProfile.enterMobileNumberWeb(mobileNumber);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        customerProfile.enterpanNumberWeb(panNumber);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        customerProfile.customerProfileNextButtonClick();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        customerProfile.fillDOBdetailsWeb(day, month, year);
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//span[contains(text(),'YES I AM SURE')]")).click();
	        CustomListner.test.log(LogStatus.INFO, "Click on I Am Sure Alert PopUp");
	        Thread.sleep(2000);
	        viewQuote.clickselectPlanBtnWeb();
	        Thread.sleep(3000);
	        viewQuote.selectPlanJourneyNewWeb("ABSLI Digishield Plan");
	        driver.navigate().refresh();
	        Thread.sleep(5000);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        viewQuote.clickNextBtnCapital();
	        Thread.sleep(2000);
	        viewQuote.clickContinueBtn();
	       // Thread.sleep(2000);
	       // viewQuote.clickInstaDoItButton();
	        Thread.sleep(3000);
	        bankdetails.InputIFSCCode(IFSCCode); 
	        Thread.sleep(2000);
	        TestUtil.scrollTillEndOfPage(driver);
	        Thread.sleep(2000);
	        bankdetails.EnterAccountNumberField(AccountNo);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        bankdetails.ClickVerifyButtinweb();
	        Thread.sleep(4000);
	        bankdetails.ClickAlertOkButtinweb();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        bankdetails.ClickPolicyPayoutNEXTweb();
	        Thread.sleep(3000);
	        bankdetails.ClickPaymentMethodweb(PaymentMethod);
	        Thread.sleep(2000);
	        bankdetails.ClickPreferredDrawDateweb(PreferredDrawDate);
	        Thread.sleep(2000);
	        bankdetails.ClickSourceOfFundweb(SourceOfFunds);
	        Thread.sleep(2000);
	        TestUtil.scrollTillEndOfPage(driver);
	        Thread.sleep(2000);
	        bankdetails.ClickSaveButtonweb();
	        Thread.sleep(2000);
	        viewQuote.clickNextBtnCapital();
	        Thread.sleep(2000);
	        
	        
	        
	        addnomineepage.enterNomineeNameWeb(nomiFirstName);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.enterNomineeLastNameWeb(nimiLastName);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.fillDOBdetailsAddNomineeWeb(nomiday, nomimonth, nomiyear);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.SelectGenderNomineePageWeb(genderValue);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.SelectRelationshipwithProposerdropdownWeb(relationshipValue);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.enterNomineeShareWeb(shareValue);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.clickNomineeSAVEBtnWeb();
            Thread.sleep(2000);
            addnomineepage.clickNomineeNEXTBtnWeb();
            Thread.sleep(5000);
            addnomineepage.clickNomineeAddressNEXTBtnWeb();
         
            Thread.sleep(2000);
            address.clickAddressDropdownWeb();
            Thread.sleep(1000);
            address.selectAddressWeb(addressType);
            
            Thread.sleep(1000);
            address.enterPinWeb(pinCode);
            Thread.sleep(2000);
            address.validationAddressOneWeb(addressOne);
            address.validationAddressTwoWeb(addressTwo);
            address.validationAddressThreeWeb(addressThree);
            Thread.sleep(2000);
            address.selectPreferredLangWeb(language);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            address.selectAlternateMobileNoWeb(mobile);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            TestUtil.scrollTillEndOfPage(driver);
            address.selectTelPhoneNoWeb(telNo);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            address.ClickSaveBTNWeb();
            Thread.sleep(2000);
            address.ClickAddressNEXTBTNWeb();
            Thread.sleep(3000);
            
        	personalinfo.EnterEmailIdweb(Emaild);
        	Thread.sleep(4000);
        	personalinfo.EnterMaritalStatusweb(MaritalStatus);
        	Thread.sleep(1000);
        	personalinfo.EnterFatherSpaouseNameweb(fatherSpouseName);
        	Thread.sleep(1000);
        	personalinfo.EnterMotherNameweb(motherName);
        	Thread.sleep(1000);
        	personalinfo.EnterMaidenNameweb(maidenName);
        	Thread.sleep(1000);
        	TestUtil.scrollTillEndOfPage(driver);
        	Thread.sleep(2000);
        	personalinfo.SelectQualificationweb(Qualification);
        	Thread.sleep(1000);
        	personalinfo.SelectOccupationweb(Occupation);
        	Thread.sleep(2000);
        	personalinfo.EnterOccupationNameofEmployeeweb(NameOfEmployer);
        	Thread.sleep(1000);
        	personalinfo.EnterOccupationNatureofbusinessweb(NatureofBusiness);
        	Thread.sleep(1000);
        	personalinfo.selectOccupationTypeofOrganisationweb(TypeOfOrganisation);
        	Thread.sleep(1000);
        	personalinfo.EnterOccupationDesignationweb(Designation);
        	Thread.sleep(1000);
        	personalinfo.EnterOccupationAnnualIncomeweb(AnnualIncome);
        	Thread.sleep(1000);
        	TestUtil.scrollTillEndOfPage(driver);
        	Thread.sleep(2000);
        	personalinfo.ClickSaveAndContinueweb();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//span[contains(text(),'DO IT LATER ')]")).click();
        	CustomListner.test.log(LogStatus.INFO, "Click On DO IT LATER Button");
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	TestUtil.scrollTillEndOfPage(driver);
   
     	  TestUtil.scrollTillTOPOfPage(driver);
      	  Thread.sleep(2000);
       	  personalinfo.ClickSelectProposeOfInsuranceWeb(purposeOfInsuValue1, purposeOfInsuValue2, purposeOfInsuValue3);
       	  Thread.sleep(2000);
       	  TestUtil.scrollTillEndOfPage(driver);
     	  Thread.sleep(2000);
     	  personalinfo.ClickpurposeOfInsurancekNextBTNweb();
     	  Thread.sleep(2000);
        	  
     	 Thread.sleep(2000);
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
         Thread.sleep(2000);
        // reviewAndAccept.ClickAgreementCheckBox();
        // Thread.sleep(2000);
         reviewAndAccept.SendForReviewClick();
         Thread.sleep(30000);
         reviewAndAccept.performLinkGenAndOTPFill(userName,passWord);
         Thread.sleep(5000);
         reviewAndAccept.verifyStatus();
         Thread.sleep(2000);
         reviewAndAccept.clickProceed();
         Thread.sleep(2000);
         WebElement PaymentBTN=driver.findElement(By.xpath("//div[contains(text(),'WIN BACK')]"));
         Thread.sleep(2000);
         TestUtil.scrollToElement(driver,PaymentBTN);
         Thread.sleep(2000);
         paymentpage.ClickOnPaymentModeweb(clickOnPaymentMode);
         Thread.sleep(2000);
         TestUtil.scrollTillEndOfPage(driver);
         Thread.sleep(2000);
         paymentpage.ClickOnCashSubmitBTNweb();
         Thread.sleep(5000);
         paymentpage.ClickOnPaymentSummaryNextBTNweb();
         Thread.sleep(4000);
	}
	public void gotoDocumentChangeSumAssuredweb(WebDriver driver,String userName, String passWord, String leadID, String mobileNumber,
            String panNumber, String day, String month, String year,String quoteAmount,String IFSCCode,String AccountNo,String PaymentMethod,
            String PreferredDrawDate,String SourceOfFunds,
            String nomiFirstName,String nimiLastName,String nomiday,String nomimonth,String nomiyear,String genderValue,String relationshipValue,
            String shareValue,String addressType, String pinCode, String addressOne, String addressTwo, String addressThree, String language, String mobile, String telNo,
            String Emaild,String MaritalStatus,String fatherSpouseName,String motherName,String maidenName,String Qualification,String Occupation,
            String NameOfEmployer,String NatureofBusiness,String TypeOfOrganisation,String Designation,String AnnualIncome,String purposeOfInsuValue1,String purposeOfInsuValue2,String purposeOfInsuValue3,
            String ClickOnhealthDetailTab,String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause,String clickOnPaymentMode) throws InterruptedException {
		   
		    loginPage=new LoginPage(driver);
		    dashboard=new Dashboard(driver);
		    customerProfile=new CustomerProfile(driver);
		    viewQuote=new ViewQuote(driver);
		    bankdetails=new BankDetails(driver);
		     addnomineepage=new AddNomineePage(driver);
		     address=new AddressPage(driver);
		     personalinfo=new PersonalInfo(driver);
		     healthdetail =new  HealthDetail(driver);
		      reviewAndAccept =new ReviewAndAccept(driver);
		      paymentpage=new PaymentPage(driver);
		    
		    loginPage.enterUserNameweb(userName);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        loginPage.enterpasswordweb(passWord);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        loginPage.submitButtonweb();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        Thread.sleep(5000);
	        dashboard.clickPlusButtonWeb();
	        Thread.sleep(2000);
	        dashboard.clickNewCustomerButton();
	       // dashboard.clickHamburgerandSelectNewApplicationWeb();
	        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	        customerProfile.enterLeadIDWeb(leadID);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        customerProfile.customerProfileNextButtonClick();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       // dashboard.checkLoaderWeb();
	        Thread.sleep(3000);
			customerProfile.clickIAgreeCheckboxWeb();
	        customerProfile.enterMobileNumberWeb(mobileNumber);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        customerProfile.enterpanNumberWeb(panNumber);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        customerProfile.customerProfileNextButtonClick();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        customerProfile.fillDOBdetailsWeb(day, month, year);
	        Thread.sleep(3000);
	        viewQuote.clickselectPlanBtnWeb();
	        Thread.sleep(3000);
	        viewQuote.selectPlanJourneyNewWeb("ABSLI Digishield Plan");
	        driver.navigate().refresh();
	        Thread.sleep(5000);
	    
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        viewQuote.enterSumAssuredWeb(quoteAmount);
	        Thread.sleep(2000);
	        viewQuote.clickNextBtnCapital();
	        Thread.sleep(2000);
	        viewQuote.clickContinueBtn();
	       // Thread.sleep(2000);
	       // viewQuote.clickInstaDoItButton();
	        Thread.sleep(3000);
	        bankdetails.InputIFSCCode(IFSCCode); 
	        Thread.sleep(2000);
	        TestUtil.scrollTillEndOfPage(driver);
	        Thread.sleep(2000);
	        bankdetails.EnterAccountNumberField(AccountNo);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        bankdetails.ClickVerifyButtinweb();
	        Thread.sleep(4000);
	        bankdetails.ClickAlertOkButtinweb();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        bankdetails.ClickPolicyPayoutNEXTweb();
	        Thread.sleep(3000);
	        bankdetails.ClickPaymentMethodweb(PaymentMethod);
	        Thread.sleep(2000);
	        bankdetails.ClickPreferredDrawDateweb(PreferredDrawDate);
	        Thread.sleep(2000);
	        bankdetails.ClickSourceOfFundweb(SourceOfFunds);
	        Thread.sleep(2000);
	        TestUtil.scrollTillEndOfPage(driver);
	        Thread.sleep(2000);
	        bankdetails.ClickSaveButtonweb();
	        Thread.sleep(2000);
	        viewQuote.clickNextBtnCapital();
	        Thread.sleep(2000);
	        
	        
	        
	        addnomineepage.enterNomineeNameWeb(nomiFirstName);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.enterNomineeLastNameWeb(nimiLastName);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.fillDOBdetailsAddNomineeWeb(nomiday, nomimonth, nomiyear);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.SelectGenderNomineePageWeb(genderValue);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.SelectRelationshipwithProposerdropdownWeb(relationshipValue);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.enterNomineeShareWeb(shareValue);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            addnomineepage.clickNomineeSAVEBtnWeb();
            Thread.sleep(2000);
            addnomineepage.clickNomineeNEXTBtnWeb();
            Thread.sleep(5000);
            addnomineepage.clickNomineeAddressNEXTBtnWeb();
         
            Thread.sleep(2000);
            address.clickAddressDropdownWeb();
            Thread.sleep(1000);
            address.selectAddressWeb(addressType);
            
            Thread.sleep(1000);
            address.enterPinWeb(pinCode);
            Thread.sleep(2000);
            address.validationAddressOneWeb(addressOne);
            address.validationAddressTwoWeb(addressTwo);
            address.validationAddressThreeWeb(addressThree);
            Thread.sleep(2000);
            address.selectPreferredLangWeb(language);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            address.selectAlternateMobileNoWeb(mobile);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            TestUtil.scrollTillEndOfPage(driver);
            address.selectTelPhoneNoWeb(telNo);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            address.ClickSaveBTNWeb();
            Thread.sleep(2000);
            address.ClickAddressNEXTBTNWeb();
            Thread.sleep(3000);
            
        	personalinfo.EnterEmailIdweb(Emaild);
        	Thread.sleep(4000);
        	personalinfo.EnterMaritalStatusweb(MaritalStatus);
        	Thread.sleep(1000);
        	personalinfo.EnterFatherSpaouseNameweb(fatherSpouseName);
        	Thread.sleep(1000);
        	personalinfo.EnterMotherNameweb(motherName);
        	Thread.sleep(1000);
        	personalinfo.EnterMaidenNameweb(maidenName);
        	Thread.sleep(1000);
        	TestUtil.scrollTillEndOfPage(driver);
        	Thread.sleep(2000);
        	personalinfo.SelectQualificationweb(Qualification);
        	Thread.sleep(1000);
        	personalinfo.SelectOccupationweb(Occupation);
        	Thread.sleep(2000);
        	personalinfo.EnterOccupationNameofEmployeeweb(NameOfEmployer);
        	Thread.sleep(1000);
        	personalinfo.EnterOccupationNatureofbusinessweb(NatureofBusiness);
        	Thread.sleep(1000);
        	personalinfo.selectOccupationTypeofOrganisationweb(TypeOfOrganisation);
        	Thread.sleep(1000);
        	personalinfo.EnterOccupationDesignationweb(Designation);
        	Thread.sleep(1000);
        	personalinfo.EnterOccupationAnnualIncomeweb(AnnualIncome);
        	Thread.sleep(1000);
        	TestUtil.scrollTillEndOfPage(driver);
        	Thread.sleep(2000);
        	personalinfo.ClickSaveAndContinueweb();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//span[contains(text(),'DO IT LATER ')]")).click();
        	CustomListner.test.log(LogStatus.INFO, "Click On DO IT LATER Button");
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	TestUtil.scrollTillEndOfPage(driver);
   
     	  TestUtil.scrollTillTOPOfPage(driver);
      	  Thread.sleep(2000);
       	  personalinfo.ClickSelectProposeOfInsuranceWeb(purposeOfInsuValue1, purposeOfInsuValue2, purposeOfInsuValue3);
       	  Thread.sleep(2000);
       	  TestUtil.scrollTillEndOfPage(driver);
     	  Thread.sleep(2000);
     	  personalinfo.ClickpurposeOfInsurancekNextBTNweb();
     	  Thread.sleep(2000);
        	  
     	 Thread.sleep(2000);
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
         Thread.sleep(2000);
        // reviewAndAccept.ClickAgreementCheckBox();
        // Thread.sleep(2000);
         reviewAndAccept.SendForReviewClick();
         Thread.sleep(30000);
         reviewAndAccept.performLinkGenAndOTPFill(userName,passWord);
         Thread.sleep(5000);
         reviewAndAccept.verifyStatus();
         Thread.sleep(2000);
         reviewAndAccept.clickProceed();
         Thread.sleep(2000);
         WebElement PaymentBTN=driver.findElement(By.xpath("//div[contains(text(),'WIN BACK')]"));
         Thread.sleep(2000);
         TestUtil.scrollToElement(driver,PaymentBTN);
         Thread.sleep(2000);
         paymentpage.ClickOnPaymentModeweb(clickOnPaymentMode);
         Thread.sleep(2000);
         TestUtil.scrollTillEndOfPage(driver);
         Thread.sleep(2000);
         paymentpage.ClickOnCashSubmitBTNweb();
         Thread.sleep(5000);
         paymentpage.ClickOnPaymentSummaryNextBTNweb();
         Thread.sleep(4000);
	}



	public void jointLife(WebDriver driver,String userName, String passWord, String leadID, String mobileNumber,
								  String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
								  String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured, String Rideramount,
								  String level , String JointLifeMobileNumber, String JointLifePan) throws InterruptedException {

		loginPage=new LoginPage(driver);
		dashboard=new Dashboard(driver);
		customerProfile=new CustomerProfile(driver);
		viewQuote=new ViewQuote(driver);
		bankdetails=new BankDetails(driver);
		addnomineepage=new AddNomineePage(driver);
		address=new AddressPage(driver);
		personalinfo=new PersonalInfo(driver);
		healthdetail =new  HealthDetail(driver);
		reviewAndAccept =new ReviewAndAccept(driver);
		paymentpage=new PaymentPage(driver);
		planInfo = new PlanInfo(driver);




		loginPage.enterUserNameweb(userName);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterpasswordweb(passWord);
		loginPage.submitButtonweb();
		// dashboard.checkLoaderWeb();
		//wait.WaitTime5();
		dashboard.clickPlusButtonWeb();
		dashboard.clickNewCustomerButton();
		//  dashboard.checkLoaderWeb();
		//    wait.WaitTime2();
		customerProfile.enterLeadIDWeb(leadID);
		TestUtil.scrollTillEndOfPage(driver);
		customerProfile.customerProfileNextButtonClick();
		//  dashboard.checkLoaderWeb();
		//   wait.WaitTime2();
		customerProfile.clickIAgreeCheckboxWeb();
		customerProfile.enterMobileNumberWeb(mobileNumber);
		customerProfile.enterpanNumberWeb(panNumber);
		customerProfile.customerProfileNextButtonClick();
		//      dashboard.checkLoaderWeb();
		//       wait.WaitTime2();
		customerProfile.fillDOBdetailsWeb(day, month, year);
		customerProfile.customerProfileSaveButtonClick();
		//      wait.WaitTime2();
		customerProfile.customerProfileNEXTButtonClick();
		//     wait.WaitTime5();
		//viewQuote.clickselectPlanBtnWeb();
		viewQuote.selectPlanJourneyNewWeb("BSLI Life Shield");
		//  Thread.sleep(2000);
		planInfo.clickPlanInfoBackBtnWeb();
		viewQuote.selectPlanJourneyNewWeb("BSLI Life Shield");
		Thread.sleep(2000);
		viewQuote.viewQuotePageVerifyWeb();
		Thread.sleep(2);
		viewQuote.isSmoker(smokerNonSmoker);
		viewQuote.enterSumAssuredWeb(quoteAmount);
		viewQuote.clickJointLifeAddbtn();
		TestUtil.scrollTillEndOfPage(driver);
		Thread.sleep(2000);
		viewQuote.enterMobileNumber(JointLifeMobileNumber);
		viewQuote.enterPan(JointLifePan);
		viewQuote.clickVerify();
		Thread.sleep(4);
		viewQuote.enterSumAssuredWeb("6000000");
		customerProfile.fillDOBdetailsWeb(day, month, year);
		viewQuote.clickSaveJointLife();
		viewQuote.ContinueCapitalWeb();


	}
	
}
