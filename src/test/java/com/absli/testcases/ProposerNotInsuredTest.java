package com.absli.testcases;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.absli.APIData.ApiData;
import com.absli.Listner.CustomListner;
import com.absli.base.TestBase;
import com.absli.dataproviders.DataProviders;
import com.absli.pageObjects.AddNomineePage;
import com.absli.pageObjects.AddressPage;
import com.absli.pageObjects.BankDetails;
import com.absli.pageObjects.CustomerProfile;
import com.absli.pageObjects.Dashboard;
import com.absli.pageObjects.Documents;
import com.absli.pageObjects.HealthAndPureTermsPage;
import com.absli.pageObjects.HealthDetail;
import com.absli.pageObjects.IARPage;
import com.absli.pageObjects.LoginPage;
import com.absli.pageObjects.PaymentPage;
import com.absli.pageObjects.PersonalInfo;
import com.absli.pageObjects.ProposerNotInsured;
import com.absli.pageObjects.ReviewAndAccept;
import com.absli.pageObjects.ViewQuote;
import com.relevantcodes.extentreports.LogStatus;

import Utils.TestFactory;
import util.TestUtil;

public class ProposerNotInsuredTest  extends TestBase {
	
	
	    LoginPage loginPage;
	    Dashboard dashboard;
	    CustomerProfile customerProfile;
	    ViewQuote viewQuote;
	    HealthAndPureTermsPage healthandpuretermspage;
	    AddNomineePage addnomineepage;
	    BankDetails bankdetails;
	    AddressPage address;
	    PersonalInfo personalinfo;
	    ProposerNotInsured proposerNotinsured;
	
	
	    public ProposerNotInsuredTest(){
			super();

		}

		@BeforeClass
		public void preSetup() throws IOException{
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
		            proposerNotinsured=new ProposerNotInsured(TestBase.driver);
		            healthandpuretermspage=new HealthAndPureTermsPage(TestBase.driver);

		        } else if (TestBase.parameterName.equalsIgnoreCase("Android")) {
		            loginPage = new LoginPage(TestBase.driver1);
		            dashboard = new Dashboard(TestBase.driver1);
		            customerProfile = new CustomerProfile(TestBase.driver1);
		            viewQuote = new ViewQuote(TestBase.driver1);
		            bankdetails = new BankDetails(TestBase.driver1);
		            addnomineepage = new AddNomineePage(TestBase.driver1);
		            address = new AddressPage(TestBase.driver1);
		            personalinfo=new PersonalInfo(TestBase.driver1);
		            proposerNotinsured=new ProposerNotInsured(TestBase.driver1);
		            healthandpuretermspage=new HealthAndPureTermsPage(TestBase.driver1);
		         
		        } else {
		            loginPage = new LoginPage(TestBase.driver2);
		            dashboard = new Dashboard(TestBase.driver2);
		            customerProfile = new CustomerProfile(TestBase.driver2);
		            viewQuote = new ViewQuote(TestBase.driver2);
		            bankdetails = new BankDetails(TestBase.driver2);
		            addnomineepage = new AddNomineePage(TestBase.driver2);
		            address = new AddressPage(TestBase.driver2);
		            personalinfo=new PersonalInfo(TestBase.driver2);
		            proposerNotinsured=new ProposerNotInsured(TestBase.driver2);
		            healthandpuretermspage=new HealthAndPureTermsPage(TestBase.driver2);

		        }
		}
		
		
		
		@Test(groups = {"web" }, dataProvider = "ProposerNotInsuredDataProvider", dataProviderClass = DataProviders.class, 
				description = "||Verify user able to log in leap app."
						+ "||Verify user able to see are proposer and insured  proposer the same option? click on No radio button."
						+ "||Verify user when click on No radio button drop down should be visible."
						+ "||Verify user able to add the Mobile number & Pan card Number in Proposer under customer profile."
						+ "||Verify user able to click on Add insured info "
						+ "||Verify user add in complete mobile number and pan number should not allows into next page inline error message is visible under mobile number and pan number field under customer profile."
						+ "||Verify user should not allow to add more then 10 numbers , mobile number field under Proposer tab."
						+ "||Verify user if add less then 10 number in mobile number field user get inline error message under Proposer tab."
						+ "||Verify user if add invalid pan number should not allows to next tab under Proposer tab."
						+ "||Verify user able to add the Mobile number & Pan card Number in To be insured."
						+ "||Verify user able to Click on next button "
						+ "||Verify user add in complete mobile number and pan number should not allows into next page inline error message is visible under mobile number and pan number field under To be insured."
						+ "||Verify user should not allow to add more then 10 numbers , mobile number field under To be insured."
						+ "||Verify user if add less then 10 number in mobile number field user get inline error message under To be insured."
						+ "||Verify user if add invalid pan number should not allows to next tab under To be insured."
						+ "||Verify user able to click on back button pan Number and mobile number should change and fields are should not blank under customer profile page.")
		public void VerifyMobileNoAndPanNoValidationWeb(String userName, String passWord, String leadID,String ProposerInsuredSame,String RelationWithInsured,
				String mobileNumber, String panNumber,String ProposerName,String InsuredMobileNo,String InsuredPanNo,String InsuredName, String day, String month, String year,String InsuredDay,String InsuredMonth ,String InsuredYear, 
				String ProposerSalutation,String InsuredSalutation,String premiumValue, String occupationOption, String lifeStageValue, String riskProfileFieldValue,String investmentGoalValue,String quoteAmount,
				String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
				String AciSumAssured, String Rideramount, String level, String IFSCCode, String AccountNo,
				String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String BankStatus,
				String nomiFirstName, String nimiLastName, String nomiday, String nomimonth, String nomiyear,
				String genderValue, String relationshipValue, String shareValue, String addressType, String pinCode,
				String addressOne, String addressTwo, String addressThree, String Emaild, String MaritalStatus, String fatherSpouseName,
				String motherName, String maidenName, String Qualification, String Occupation, String NameOfEmployer,
				String NatureofBusiness, String TypeOfOrganisation, String Designation, String AnnualIncome) throws InterruptedException {

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
		        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		        customerProfile.enterLeadIDWeb(leadID);
		        proposerNotinsured.ClickOnIsproposerInsuredSameRadioButton(ProposerInsuredSame);
		        proposerNotinsured.SelectRelationWithInsured(RelationWithInsured);
		        customerProfile.customerProfileNextButtonClick();
		        Thread.sleep(3000);
		        proposerNotinsured.ClickOnAddInfoButton();
		        Thread.sleep(2000);
		        proposerNotinsured.VerifyProposerMandatoryErrorMSG();
		        customerProfile.enterMobileNumberWeb(mobileNumber);
		        proposerNotinsured.VerifyProposerMinMaxErrorMSG();
		        customerProfile.enterpanNumberWeb(panNumber);
		        proposerNotinsured.VerifyProposerInvalidaPanErrorMSG();
		        customerProfile.enterMobileNumberWeb("9860217842");
		        customerProfile.enterpanNumberWeb("ATUPP1747N");
		        proposerNotinsured.ClickOnAddInfoButton();  
		        customerProfile.customerProfileNextButtonClick();
		        Thread.sleep(2000);
		        proposerNotinsured.VerifyInsuredMandatoryErrorMSG(); 
		        proposerNotinsured.enterInsuredMobileNumberWeb(InsuredMobileNo);
		        customerProfile.customerProfileNextButtonClick();
		        proposerNotinsured.VerifyInsuredMinMaxErrorMSG(); 
		        proposerNotinsured.enterInsuredpanNumberWeb(InsuredPanNo); 
		        customerProfile.customerProfileNextButtonClick();
		        Thread.sleep(2000);
		        proposerNotinsured.VerifyInsuredInvalidaPanErrorMSG();
		        proposerNotinsured.enterInsuredMobileNumberWeb("9137831342");
		        proposerNotinsured.enterInsuredpanNumberWeb("BVOPG2333Q"); 
		        TestUtil.scrollTillTOPOfPage(driver);
		        Thread.sleep(2000);
		        proposerNotinsured.ClickOnProposerTabButton();
		        customerProfile.enterMobileNumberWeb("9860217800");
		        proposerNotinsured.ClickOnAddInfoButton(); 
		        customerProfile.customerProfileNextButtonClick();
		        Thread.sleep(2000);
		  
		       
		          
		     
				
			
		   

		}
		@Test(groups = {"web" }, dataProvider = "ProposerNotInsuredDataProvider", dataProviderClass = DataProviders.class, 
				description = " ||Verify user If PAN is active in proposer tab under edit customer profile page, below details to be prefilled with the NSDL’s record\r\n"
						+ "*Name\r\n"
						+ "*Gender"
						+ "||Verify The user details of the form will come in a ‘Editable’ state. If the user chooses to save the information as received, "
						+ "the fields will be saved as ‘verified’ proposer tab under edit customer profile page.\n"
						+ "||Verify the user able to add the DOB when can save the information in proposer tab."
						+ "||Verify user able to check  the proposer First and Last name in edit custmore profile page.")
		public void VerifyProposerPrefillCustomerNSDLWeb(String userName, String passWord, String leadID,String ProposerInsuredSame,String RelationWithInsured,
				String mobileNumber, String panNumber,String ProposerName,String InsuredMobileNo,String InsuredPanNo,String InsuredName, String day, String month, String year,String InsuredDay,String InsuredMonth ,String InsuredYear, 
				String ProposerSalutation,String InsuredSalutation,String premiumValue, String occupationOption, String lifeStageValue, String riskProfileFieldValue,String investmentGoalValue,String quoteAmount,
				String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
				String AciSumAssured, String Rideramount, String level, String IFSCCode, String AccountNo,
				String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String BankStatus,
				String nomiFirstName, String nimiLastName, String nomiday, String nomimonth, String nomiyear,
				String genderValue, String relationshipValue, String shareValue, String addressType, String pinCode,
				String addressOne, String addressTwo, String addressThree, String Emaild, String MaritalStatus, String fatherSpouseName,
				String motherName, String maidenName, String Qualification, String Occupation, String NameOfEmployer,
				String NatureofBusiness, String TypeOfOrganisation, String Designation, String AnnualIncome) throws InterruptedException {

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
		        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		        customerProfile.enterLeadIDWeb(leadID);
		        proposerNotinsured.ClickOnIsproposerInsuredSameRadioButton(ProposerInsuredSame);
		        proposerNotinsured.SelectRelationWithInsured(RelationWithInsured);
		        customerProfile.customerProfileNextButtonClick();
		        Thread.sleep(3000);
		        customerProfile.enterMobileNumberWeb(mobileNumber);
		        customerProfile.enterpanNumberWeb(panNumber);
		        proposerNotinsured.ClickOnAddInfoButton();        
		        proposerNotinsured.enterInsuredMobileNumberWeb(InsuredMobileNo);
		        proposerNotinsured.enterInsuredpanNumberWeb(InsuredPanNo);    
		        customerProfile.customerProfileNextButtonClick();     
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        proposerNotinsured.VerifyFirstNameProposerweb();
		        proposerNotinsured.VerifyLastNameProposerweb();
		        proposerNotinsured.VerifyGenderProposerweb(); 
		        proposerNotinsured.VerifyFirstNameTickProposerweb();
		        proposerNotinsured.VerifyGenderTickProposerweb();
		        customerProfile.fillDOBdetailsWeb(day, month, year);
//		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		        customerProfile.savebtnWeb();
		        Thread.sleep(2000); 
//		        proposerNotinsured.fillInsuredDOBdetailsWeb(InsuredDay,InsuredMonth,InsuredYear);
//		        proposerNotinsured.clickInsuredselectPlanBtnWeb();
//		        Thread.sleep(2000);
//		        healthandpuretermspage.selectPlanJourneyRecommendPlansWeb("Recommend Plans");
//		        Thread.sleep(5000);
//	            healthandpuretermspage.enterPremiumValueRecommendPlanWeb(premiumValue);    
//		        healthandpuretermspage.OccupationdropdownSelectionONRecommendPlanWeb(occupationOption);
//				Thread.sleep(3000);
//				healthandpuretermspage.lifeStageSelectionONRecommendPlanWeb(lifeStageValue);
//		        healthandpuretermspage.investmentGoalSelectionONRecommendPlanWeb(investmentGoalValue);
//				healthandpuretermspage.RiskprofileSelectionONRecommendPlanWeb(riskProfileFieldValue);
//				Thread.sleep(3000);
//				TestUtil.scrollTillEndOfPage(driver);
//			    Thread.sleep(2000);
//			    proposerNotinsured.clickonViewPlansBtnWeb();
				
			
		   

		}
		@Test(groups = {"web" }, dataProvider = "ProposerNotInsuredDataProvider", dataProviderClass = DataProviders.class, 
				description = " ||Verify user able to change prefilled Male gender to Transgender under proposer tab."
						+ "||Verify user should not change prefilled Male gender to Female under proposer tab."
						+ "||Verify user able to change prefilled  Female gender to Transgender under proposer tab."
						+ "||Verify user able to should not change change prefilled  Female gender to Male"
						+ "||Verify user able to click on save button"
						+ "||Verify user able to change prefilled Male gender to Transgender under To be insured tab."
						+ "||Verify user should not change prefilled Male gender to Female under Insured tab."
						+ "||Verify user able to change prefilled  Female gender to Transgender")
		public void VerifyChangeGenderToTransgenderWeb(String userName, String passWord, String leadID,String ProposerInsuredSame,String RelationWithInsured,
				String mobileNumber, String panNumber,String ProposerName,String InsuredMobileNo,String InsuredPanNo,String InsuredName, String day, String month, String year,String InsuredDay,String InsuredMonth ,String InsuredYear, 
				String ProposerSalutation,String InsuredSalutation,String premiumValue, String occupationOption, String lifeStageValue, String riskProfileFieldValue,String investmentGoalValue,String quoteAmount,
				String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
				String AciSumAssured, String Rideramount, String level, String IFSCCode, String AccountNo,
				String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String BankStatus,
				String nomiFirstName, String nimiLastName, String nomiday, String nomimonth, String nomiyear,
				String genderValue, String relationshipValue, String shareValue, String addressType, String pinCode,
				String addressOne, String addressTwo, String addressThree, String Emaild, String MaritalStatus, String fatherSpouseName,
				String motherName, String maidenName, String Qualification, String Occupation, String NameOfEmployer,
				String NatureofBusiness, String TypeOfOrganisation, String Designation, String AnnualIncome) throws InterruptedException {

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
		        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		        customerProfile.enterLeadIDWeb(leadID);
		        proposerNotinsured.ClickOnIsproposerInsuredSameRadioButton(ProposerInsuredSame);
		        proposerNotinsured.SelectRelationWithInsured(RelationWithInsured);
		        customerProfile.customerProfileNextButtonClick();
		        Thread.sleep(3000);
		        customerProfile.enterMobileNumberWeb(mobileNumber);
		        customerProfile.enterpanNumberWeb(panNumber);
		        proposerNotinsured.ClickOnAddInfoButton();        
		        proposerNotinsured.enterInsuredMobileNumberWeb(InsuredMobileNo);
		        proposerNotinsured.enterInsuredpanNumberWeb(InsuredPanNo);    
		        customerProfile.customerProfileNextButtonClick();     
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		        customerProfile.fillDOBdetailsWeb(day, month, year);
		        TestUtil.scrollTillEndOfPage(driver);
		        Thread.sleep(2000); 
		        proposerNotinsured.ClickOnMaleButton();
		        WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@value,'male')])[1]"));
		    	String gettext1 = valueEle1.getAttribute("aria-pressed");
		    	if (gettext1.equalsIgnoreCase("true")) {
		    	
		    		CustomListner.test.log(LogStatus.FAIL, "Click on Male Button");

		    	} else {
		    		CustomListner.test.log(LogStatus.INFO, "Failed To Click Male Button..You Can Not Click Female To  Male Button");
		    	}
		        proposerNotinsured.ClickOnTransgenderButton();
		        Thread.sleep(2000); 
		        TestUtil.scrollTillTOPOfPage(driver);
		        proposerNotinsured.ClickOnTobeInsuredTabButton();
		        TestUtil.scrollTillEndOfPage(driver);
		        Thread.sleep(2000); 
		        proposerNotinsured.fillInsuredDOBdetailsWeb(InsuredDay,InsuredMonth,InsuredYear);
		        proposerNotinsured.ClickOnFemaleButton();       
		        WebElement valueEle2 = driver.findElement(By.xpath("(//button[contains(@value,'female')])[2]"));
		    	String gettext2 = valueEle2.getAttribute("aria-pressed");
		    	if (gettext2.equalsIgnoreCase("true")) {
		    	
		    		CustomListner.test.log(LogStatus.FAIL, "Click on Female Button");

		    	} else {
		    		CustomListner.test.log(LogStatus.INFO, "Failed To Click Female Button..You Can Not Click on Male To Female Button");
		    	}
		        proposerNotinsured.ClickOnInsuredTransgenderButton();
		        Thread.sleep(2000); 
		        proposerNotinsured.ClickOnInsuredSaveButton();
		        Thread.sleep(2000); 
		   

		}
		
		@Test(groups = {"web" }, dataProvider = "ProposerNotInsuredDataProvider", dataProviderClass = DataProviders.class, 
				description = " ||Verify user If PAN is active in To be insured tab under edit customer profile page, below details to be prefilled with the NSDL’s record\r\n"
						+ "*Name\r\n"
						+ "*Gender"
						+ "||Verify The user details of the form will come in a ‘Editable’ state. If the user chooses to save the information as received, the fields will be saved as ‘verified’ To be insured tab under edit customer profile page."
						+ "||Verify the user able to add the DOB when can save the information in To be insured tab."
						+ "||Verify user able to check  the To be insured First and Last name in edit customer profile page.")
		public void VerifyInsuredPrefillCustomerNSDLWeb(String userName, String passWord, String leadID,String ProposerInsuredSame,String RelationWithInsured,
				String mobileNumber, String panNumber,String ProposerName,String InsuredMobileNo,String InsuredPanNo,String InsuredName, String day, String month, String year,String InsuredDay,String InsuredMonth ,String InsuredYear, 
				String ProposerSalutation,String InsuredSalutation,String premiumValue, String occupationOption, String lifeStageValue, String riskProfileFieldValue,String investmentGoalValue,String quoteAmount,
				String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
				String AciSumAssured, String Rideramount, String level, String IFSCCode, String AccountNo,
				String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String BankStatus,
				String nomiFirstName, String nimiLastName, String nomiday, String nomimonth, String nomiyear,
				String genderValue, String relationshipValue, String shareValue, String addressType, String pinCode,
				String addressOne, String addressTwo, String addressThree, String Emaild, String MaritalStatus, String fatherSpouseName,
				String motherName, String maidenName, String Qualification, String Occupation, String NameOfEmployer,
				String NatureofBusiness, String TypeOfOrganisation, String Designation, String AnnualIncome) throws InterruptedException {

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
		        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		        customerProfile.enterLeadIDWeb(leadID);
		        proposerNotinsured.ClickOnIsproposerInsuredSameRadioButton(ProposerInsuredSame);
		        proposerNotinsured.SelectRelationWithInsured(RelationWithInsured);
		        customerProfile.customerProfileNextButtonClick();
		        Thread.sleep(3000);
		        customerProfile.enterMobileNumberWeb(mobileNumber);
		        customerProfile.enterpanNumberWeb(panNumber);
		        proposerNotinsured.ClickOnAddInfoButton();        
		        proposerNotinsured.enterInsuredMobileNumberWeb(InsuredMobileNo);
		        proposerNotinsured.enterInsuredpanNumberWeb(InsuredPanNo);    
		        customerProfile.customerProfileNextButtonClick();     
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        customerProfile.fillDOBdetailsWeb(day, month, year);
		        proposerNotinsured.ClickOnAddInfoButton(); 
		        proposerNotinsured.VerifyFirstNameInsuredweb();
		        proposerNotinsured.VerifyLastNameInsuredweb();
		        proposerNotinsured.VerifyGenderInsuredweb(); 
		        proposerNotinsured.VerifyFirstNameTickInsuredweb();
		        proposerNotinsured.VerifyGenderTickInsuredweb();
		        proposerNotinsured.fillInsuredDOBdetailsWeb(InsuredDay,InsuredMonth,InsuredYear);
		        Thread.sleep(2000); 
				
			
		   

		}
		
		
		@Test(groups = {"web" }, dataProvider = "ProposerNotInsuredDataProvider", dataProviderClass = DataProviders.class, 
				description = " ||"
						+ ""
						+ ""
						+ "||"
						+ "||"
						+ "||.")
		public void VerifyPersonalInfoDetailsWeb(String userName, String passWord, String leadID,String ProposerInsuredSame,String RelationWithInsured,
				String mobileNumber, String panNumber,String ProposerName,String InsuredMobileNo,String InsuredPanNo,String InsuredName, String day, String month, String year,String InsuredDay,String InsuredMonth ,String InsuredYear, 
				String ProposerSalutation,String InsuredSalutation,String premiumValue, String occupationOption, String lifeStageValue, String riskProfileFieldValue,String investmentGoalValue,String quoteAmount,
				String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
				String AciSumAssured, String Rideramount, String level, String IFSCCode, String AccountNo,
				String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String BankStatus,
				String nomiFirstName, String nimiLastName, String nomiday, String nomimonth, String nomiyear,
				String genderValue, String relationshipValue, String shareValue, String addressType, String pinCode,
				String addressOne, String addressTwo, String addressThree, String Emaild, String MaritalStatus, String fatherSpouseName,
				String motherName, String maidenName, String Qualification, String Occupation, String NameOfEmployer,
				String NatureofBusiness, String TypeOfOrganisation, String Designation, String AnnualIncome) throws InterruptedException {

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
		        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		        customerProfile.enterLeadIDWeb(leadID);
		        proposerNotinsured.ClickOnIsproposerInsuredSameRadioButton(ProposerInsuredSame);
		        proposerNotinsured.SelectRelationWithInsured(RelationWithInsured);
		        customerProfile.customerProfileNextButtonClick();
		        Thread.sleep(3000);
		        customerProfile.enterMobileNumberWeb(mobileNumber);
		        customerProfile.enterpanNumberWeb(panNumber);
		        proposerNotinsured.ClickOnAddInfoButton();        
		        proposerNotinsured.enterInsuredMobileNumberWeb(InsuredMobileNo);
		        proposerNotinsured.enterInsuredpanNumberWeb(InsuredPanNo);    
		        customerProfile.customerProfileNextButtonClick();     
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        customerProfile.fillDOBdetailsWeb(day, month, year);
		        proposerNotinsured.ClickOnAddInfoProposerButton(); 
		        Thread.sleep(2000); 
		        proposerNotinsured.fillInsuredDOBdetailsWeb(InsuredDay,InsuredMonth,InsuredYear);
		        proposerNotinsured.ClickOnInsuredSaveButton();
		        Thread.sleep(2000); 
		        proposerNotinsured.clickInsuredselectPlanBtnWeb();
		        healthandpuretermspage.selectPlanJourneyRecommendPlansWeb("Recommend Plans");
//		        Thread.sleep(5000);
//	            healthandpuretermspage.enterPremiumValueRecommendPlanWeb(premiumValue);    
//		        healthandpuretermspage.OccupationdropdownSelectionONRecommendPlanWeb(occupationOption);
//				Thread.sleep(3000);
//				healthandpuretermspage.lifeStageSelectionONRecommendPlanWeb(lifeStageValue);
//		        healthandpuretermspage.investmentGoalSelectionONRecommendPlanWeb(investmentGoalValue);
//				healthandpuretermspage.RiskprofileSelectionONRecommendPlanWeb(riskProfileFieldValue);
//				Thread.sleep(3000);
//				TestUtil.scrollTillEndOfPage(driver);
//			    Thread.sleep(2000);
//			    proposerNotinsured.clickonViewPlansBtnWeb();
				
			
		   

		}
		
		@Test(groups = {"web" }, dataProvider = "ProposerNotInsuredDataProvider", dataProviderClass = DataProviders.class, 
				description = " ||Verify user wants to edit the Name in proposer tab Message is should show “You are editing the name. Please upload the PAN card later” "
						+ "||Verify user Validate if the new name in proposer tab is as per NSDL records  If it is the same after editing, capture the name as verified"
						+ "||Verify user wants to edit the Name in To be insured tab Message is should show “You are editing the name. Please upload the PAN card later” "
						+ "||Verify user Validate if the new name in To be insured tab is as per NSDL records  If it is the same after editing, capture the name as verified")
		public void VerifyProposerInsuredEditNameWeb(String userName, String passWord, String leadID,String ProposerInsuredSame,String RelationWithInsured,
				String mobileNumber, String panNumber,String ProposerName,String InsuredMobileNo,String InsuredPanNo,String InsuredName, String day, String month, String year,String InsuredDay,String InsuredMonth ,String InsuredYear, 
				String ProposerSalutation,String InsuredSalutation,String premiumValue, String occupationOption, String lifeStageValue, String riskProfileFieldValue,String investmentGoalValue,String quoteAmount,
				String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
				String AciSumAssured, String Rideramount, String level, String IFSCCode, String AccountNo,
				String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String BankStatus,
				String nomiFirstName, String nimiLastName, String nomiday, String nomimonth, String nomiyear,
				String genderValue, String relationshipValue, String shareValue, String addressType, String pinCode,
				String addressOne, String addressTwo, String addressThree, String Emaild, String MaritalStatus, String fatherSpouseName,
				String motherName, String maidenName, String Qualification, String Occupation, String NameOfEmployer,
				String NatureofBusiness, String TypeOfOrganisation, String Designation, String AnnualIncome) throws InterruptedException {

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
		        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		        customerProfile.enterLeadIDWeb(leadID);
		        proposerNotinsured.ClickOnIsproposerInsuredSameRadioButton(ProposerInsuredSame);
		        proposerNotinsured.SelectRelationWithInsured(RelationWithInsured);
		        customerProfile.customerProfileNextButtonClick();
		        Thread.sleep(3000);
		        customerProfile.enterMobileNumberWeb(mobileNumber);
		        customerProfile.enterpanNumberWeb(panNumber);
		        proposerNotinsured.ClickOnAddInfoButton();        
		        proposerNotinsured.enterInsuredMobileNumberWeb(InsuredMobileNo);
		        proposerNotinsured.enterInsuredpanNumberWeb(InsuredPanNo);    
		        customerProfile.customerProfileNextButtonClick();     
		        Thread.sleep(2000); 
		        proposerNotinsured.EnterProposerFirstNameWeb("Rajini");
		        customerProfile.fillDOBdetailsWeb(day, month, year); 
		        proposerNotinsured.ClickOnAddInfoProposerButton(); 
		        proposerNotinsured.VerifyProposerEditAlerrtPopup();
		        proposerNotinsured.ClickonCancelButton();
		        proposerNotinsured.EnterProposerFirstNameWeb(ProposerName);
		        proposerNotinsured.VerifyFirstNameTickProposerweb();
		        proposerNotinsured.ClickOnAddInfoProposerButton(); 
		        proposerNotinsured.EnterInsuredFirstNameWeb("Rahul");
		        proposerNotinsured.fillInsuredDOBdetailsWeb(InsuredDay,InsuredMonth,InsuredYear);
		        proposerNotinsured.ClickOnInsuredSaveButton();
		        Thread.sleep(2000); 
		        proposerNotinsured.VerifyInsuredEditAlerrtPopup();
		        proposerNotinsured.ClickonCancelButton();
		        proposerNotinsured.EnterInsuredFirstNameWeb(InsuredName);
		        proposerNotinsured.VerifyFirstNameTickInsuredweb();
		        proposerNotinsured.ClickOnInsuredSaveButton();
		        Thread.sleep(2000); 
		       // proposerNotinsured.clickInsuredselectPlanBtnWeb();    
		      //  healthandpuretermspage.selectPlanJourneyRecommendPlansWeb("Recommend Plans");
				
			
		   

		}
		@Test(groups = {"web" }, dataProvider = "ProposerNotInsuredDataProvider", dataProviderClass = DataProviders.class, 
				description = " ||Verify user able to Proposer  Gender from NSDL needs to be prefilled based on the salutation Female : Ms/Shrimati \r\n "
						+ "||Verify user able to Proposer  Gender from NSDL needs to be prefilled based on the salutation Female : Ms/Shrimati \r\n"
						+ "|| Verify user able to To be insured Gender from NSDL needs to be prefilled based on the salutation if Male -Mr./Shri"
						+ "||Verify user able to  be insured  Gender from NSDL needs to be prefilled based on the salutation Female : Mrs/Shrimati \r\n")
		public void VerifyMaleAndFemaleSalutationWeb(String userName, String passWord, String leadID,String ProposerInsuredSame,String RelationWithInsured,
				String mobileNumber, String panNumber,String ProposerName,String InsuredMobileNo,String InsuredPanNo,String InsuredName, String day, String month, String year,String InsuredDay,String InsuredMonth ,String InsuredYear, 
				String ProposerSalutation,String InsuredSalutation,String premiumValue, String occupationOption, String lifeStageValue, String riskProfileFieldValue,String investmentGoalValue,String quoteAmount,
				String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
				String AciSumAssured, String Rideramount, String level, String IFSCCode, String AccountNo,
				String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String BankStatus,
				String nomiFirstName, String nimiLastName, String nomiday, String nomimonth, String nomiyear,
				String genderValue, String relationshipValue, String shareValue, String addressType, String pinCode,
				String addressOne, String addressTwo, String addressThree, String Emaild, String MaritalStatus, String fatherSpouseName,
				String motherName, String maidenName, String Qualification, String Occupation, String NameOfEmployer,
				String NatureofBusiness, String TypeOfOrganisation, String Designation, String AnnualIncome) throws InterruptedException {

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
		        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		        customerProfile.enterLeadIDWeb(leadID);
		        proposerNotinsured.ClickOnIsproposerInsuredSameRadioButton(ProposerInsuredSame);
		        proposerNotinsured.SelectRelationWithInsured(RelationWithInsured);
		        customerProfile.customerProfileNextButtonClick();
		        Thread.sleep(3000);
		        customerProfile.enterMobileNumberWeb(mobileNumber);
		        customerProfile.enterpanNumberWeb(panNumber);
		        proposerNotinsured.ClickOnAddInfoButton();        
		        proposerNotinsured.enterInsuredMobileNumberWeb(InsuredMobileNo);
		        proposerNotinsured.enterInsuredpanNumberWeb(InsuredPanNo);    
		        customerProfile.customerProfileNextButtonClick();     
		        Thread.sleep(2000); 
		        proposerNotinsured.VerifyProposerSalutationweb(ProposerSalutation);
		        customerProfile.fillDOBdetailsWeb(day, month, year); 
		        proposerNotinsured.ClickOnAddInfoProposerButton(); 
		        proposerNotinsured.VerifyInsuredSalutationweb(InsuredSalutation);
		        proposerNotinsured.fillInsuredDOBdetailsWeb(InsuredDay,InsuredMonth,InsuredYear);
		        proposerNotinsured.ClickOnInsuredSaveButton();
		        Thread.sleep(2000); 


		}
	
	
	
	
	
	

}
