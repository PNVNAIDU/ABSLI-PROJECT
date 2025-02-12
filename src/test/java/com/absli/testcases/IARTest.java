package com.absli.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.absli.APIData.ApiData;
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
import com.absli.pageObjects.ReviewAndAccept;
import com.absli.pageObjects.ViewQuote;
import com.absli.utils.WaitUtils;

import Utils.TestFactory;
import util.TestUtil;

public class IARTest extends TestBase {
	
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
	    PaymentPage paymentpage;
	    ApiData api;
	    TestUtil testUtil;
	    Documents document;
	    IARPage IARpage;
	public IARTest(){
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
	            healthdetail = new HealthDetail(TestBase.driver);
	            reviewAndAccept = new ReviewAndAccept(TestBase.driver);
	            paymentpage = new PaymentPage(TestBase.driver);
	            api = new ApiData();
	            testUtil = new TestUtil();
	            document=new Documents(TestBase.driver);
	            IARpage=new IARPage(TestBase.driver);

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
	            paymentpage = new PaymentPage(TestBase.driver1);
	            document=new Documents(TestBase.driver1);
	            IARpage=new IARPage(TestBase.driver1);


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
	            paymentpage = new PaymentPage(TestBase.driver2);


	        }
	}
	

    @Test(groups = {"web" }, dataProvider = "IARDataProvider", dataProviderClass = DataProviders.class, description = "TEST-1644 ||Validate after uploading all the mandatory documents user lands on the IAR page"
    		+ "TEST-1644 ||Validate On IAR page Expected details will be asked from the user"
    		+ "TEST-1644 ||Validate Title"
    		+ "TEST-1644 ||Validate FirstName"
    		+ "TEST-1644 ||Validate Last Name"
    		+ "TEST-1644 ||Validate Age"
    		+ "TEST-1644 ||Validate Gender"
    		+ "TEST-1644 ||Validate Have you personally met the life to be insured for this application?"
    		+ "TEST-1644 ||Verify Are you personally satisfied about the financial standing and insurability of the life to be insured / proposer?"
    		+ "TEST-1644 ||Validate How do you know the LIFE to be INSURED / PROPOSER / NATURAL / REFERENCE MARKET*"
    		+ "Relative\r\n"
    		+ "\r\n"
    		+ "Direct Mail\r\n"
    		+ "\r\n"
    		+ "Friend\r\n"
    		+ "\r\n"
    		+ "Application’s Request\r\n"
    		+ "\r\n"
    		+ "Reference/ Cold Call\r\n"
    		+ "\r\n"
    		+ "Existing Customer\r\n"
    		+ "Others\r\n"
    		+ "Cluster Market\r\n"
    		+ "TEST-1644 ||Validate If user selected as others")
    public void VerifyIARAllTextFieldDisplayAndOtherFieldWeb(String userName, String passWord, String leadID,
                                   String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
                                   String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
                                   String AciSumAssured, String Rideramount, String level, String IFSCCode, 
                                   String AccountNo,
                                   String PaymentMethod, String PreferredDrawDate, String SourceOfFunds,
                                   String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
                                   String nomiyear, String genderValue, String relationshipValue, String shareValue,
                                   String addressType, String pinCode, String addressOne, String addressTwo,
                                   String addressThree, String pinCode2, String language, String mobile, String telNo, String insurerName,
                                   String sumAssured, String policyNumber, String yearOfApplication, String basePlan, String annualPremium,
                                   String policyStatus, String medicalPolicy, String policyReason, String purposeOfInsuValue1,
                                   String purposeOfInsuValue2, String purposeOfInsuValue3, 
                                   String Emaild,
                                   String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
                                   String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
                                   String Designation, String AnnualIncome,
                                   String Other, String ParentAnnualIncome, String ParentInsuranceCover,
                                   String Gstvalue, String ClickOnhealthDetailTab, String FMBSLivingDemise, String FMBSAgeDeath,
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof
                                   ,String 	ListOfValueTextfield,String 	HowDoYouKnowListOfValue,String 	HowDoYouKnowOtherField)
            throws InterruptedException {


        new TestFactory().gotoIARweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode,SelectTypeOfDocument,SelectTypeOfDocAgeProof);
        
       
        String[] ListOfValueTextfieldupdate = ListOfValueTextfield.split(",");
    	for (int i = 0; i <= ListOfValueTextfieldupdate.length - 1; i++) {
        IARpage.VerifyListOfAllFieldsDisplayweb(ListOfValueTextfieldupdate[i]);
    	}  
    	IARpage.VerifyHaveYouPeronallyMetFieldsDisplayweb();
    	IARpage.VerifyHaveYouPeronallySatisfiedFieldsDisplayweb();
    	WebElement ClusterEle= driver.findElement(By.xpath("//input[contains(@placeholder,'Cluster Name')]"));
        TestUtil.scrollToElement(driver, ClusterEle);
        Thread.sleep(1000);
    	 String[] HowDoYouKnowListOfValueupdate = HowDoYouKnowListOfValue.split(",");
     	for (int i = 0; i <= HowDoYouKnowListOfValueupdate.length - 1; i++) {
         IARpage.VerifyListOfAllFieldsDisplayweb(HowDoYouKnowListOfValueupdate[i]);
     	}
     	IARpage.ClickOnOtherHowDoyouKnowweb();
     	 Thread.sleep(1000);
     	IARpage.EnterOtherHowDoyouKnowweb(HowDoYouKnowOtherField);
    }
	
	
	//=======================below vijay=========================
	



    @Test(groups = {"web" }, dataProvider = "IARDataProvider", dataProviderClass = DataProviders.class,
    		description = "TEST-1644 ||Validate Cluster Market(Cluster Name)..This s a non mandatory field, user should be allowed to enter maximum 50 characters, only characters should be allowed to enter"
    				+ "TEST-1644 || ")
    public void validationAndEnterClusterMarketIARWeb(String userName, String passWord, String leadID,
                                   String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
                                   String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
                                   String AciSumAssured, String Rideramount, String level, String IFSCCode, 
                                   String AccountNo,
                                   String PaymentMethod, String PreferredDrawDate, String SourceOfFunds,
                                   String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
                                   String nomiyear, String genderValue, String relationshipValue, String shareValue,
                                   String addressType, String pinCode, String addressOne, String addressTwo,
                                   String addressThree, String pinCode2, String language, String mobile, String telNo, String insurerName,
                                   String sumAssured, String policyNumber, String yearOfApplication, String basePlan, String annualPremium,
                                   String policyStatus, String medicalPolicy, String policyReason, String purposeOfInsuValue1,
                                   String purposeOfInsuValue2, String purposeOfInsuValue3, 
                                   String Emaild,
                                   String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
                                   String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
                                   String Designation, String AnnualIncome,
                                   String Other, String ParentAnnualIncome, String ParentInsuranceCover,
                                   String Gstvalue, String ClickOnhealthDetailTab, String FMBSLivingDemise, String FMBSAgeDeath,
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof,
                                   String ClusterMarketName,String LifeINSUREDYr,String LifeINSUREDMonth,String pleaseSpecify)
            throws InterruptedException {


        new TestFactory().gotoIARweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode,SelectTypeOfDocument,SelectTypeOfDocAgeProof);
        
      //  iarpage.EnterClusterMarketNameField(" ");
       // Thread.sleep(2000);
       // TestUtil.scrollTillEndOfPage(driver);
       // Thread.sleep(2000);
       // iarpage.ClickSaveAndContinueButtonIARweb();
       // Thread.sleep(2000);
      //  iarpage.VerifyClusterMarketNamtFieldweb();
       // Thread.sleep(2000);
        IARpage.EnterClusterMarketNameField(ClusterMarketName);
        IARpage.VerifyNOButtonByDefaultweb();
        IARpage.VerifyNOButtonByDefaulTwoweb();
        IARpage.VerifyNOButtonByDefaulThreeweb();
        IARpage.VerifyNOButtonByDefaulFourweb();
                
    }
	
	
	
	

    @Test(groups = {"web" }, dataProvider = "IARDataProvider", dataProviderClass = DataProviders.class,
    		description = "TEST-1644 || Validate How long have you known the LIFE to be INSURED /PROPOSER?.."
    				+ "Years\r\n"
    				+ "Months(Text Field)"
    				+ "")
    public void validationAndEnterYearAndMonthOfLifeToBeINSUREDWeb(String userName, String passWord, String leadID,
                                   String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
                                   String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
                                   String AciSumAssured, String Rideramount, String level, String IFSCCode, 
                                   String AccountNo,
                                   String PaymentMethod, String PreferredDrawDate, String SourceOfFunds,
                                   String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
                                   String nomiyear, String genderValue, String relationshipValue, String shareValue,
                                   String addressType, String pinCode, String addressOne, String addressTwo,
                                   String addressThree, String pinCode2, String language, String mobile, String telNo, String insurerName,
                                   String sumAssured, String policyNumber, String yearOfApplication, String basePlan, String annualPremium,
                                   String policyStatus, String medicalPolicy, String policyReason, String purposeOfInsuValue1,
                                   String purposeOfInsuValue2, String purposeOfInsuValue3, 
                                   String Emaild,
                                   String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
                                   String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
                                   String Designation, String AnnualIncome,
                                   String Other, String ParentAnnualIncome, String ParentInsuranceCover,
                                   String Gstvalue, String ClickOnhealthDetailTab, String FMBSLivingDemise, String FMBSAgeDeath,
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof,
                                   String ClusterMarketName,String LifeINSUREDYr,String LifeINSUREDMonth,String pleaseSpecify)
            throws InterruptedException {


        new TestFactory().gotoIARweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode,SelectTypeOfDocument,SelectTypeOfDocAgeProof);
        
        IARpage.EnterLifeToBeINSUREDPROPOSERyeardWeb("");
        Thread.sleep(2000);
        IARpage.EnterLifeToBeINSUREDPROPOSERmonthWeb("");
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        IARpage.ClickSaveAndContinueButtonIARweb();
        Thread.sleep(2000);
        IARpage.VerifyINSUREDPROPOSERyearFieldweb();
        Thread.sleep(2000);
        IARpage.VerifyINSUREDPROPOSERmonthsFieldweb();
        Thread.sleep(2000);
        IARpage.EnterLifeToBeINSUREDPROPOSERyeardWeb(LifeINSUREDYr);
        Thread.sleep(2000);
        IARpage.EnterLifeToBeINSUREDPROPOSERmonthWeb(LifeINSUREDMonth);
        Thread.sleep(2000);
        
    }
	

	

    @Test(groups = {"web" }, dataProvider = "IARDataProvider", dataProviderClass = DataProviders.class,
    		description = "TEST-1644 || Validate Is there any physical defects, impairment, deformities, and/or any conditions affecting mobility, sight and /or hearing?"
    				+ "TEST-1644 || Verify if selected as Yes, a field should appear with label...a field should appear with label ”Please Specify” allowed to enter the maximum 50 characters")
    public void SelectAndEnterPhysicalDefectsYESBTNWeb(String userName, String passWord, String leadID,
                                   String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
                                   String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
                                   String AciSumAssured, String Rideramount, String level, String IFSCCode, 
                                   String AccountNo,
                                   String PaymentMethod, String PreferredDrawDate, String SourceOfFunds,
                                   String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
                                   String nomiyear, String genderValue, String relationshipValue, String shareValue,
                                   String addressType, String pinCode, String addressOne, String addressTwo,
                                   String addressThree, String pinCode2, String language, String mobile, String telNo, String insurerName,
                                   String sumAssured, String policyNumber, String yearOfApplication, String basePlan, String annualPremium,
                                   String policyStatus, String medicalPolicy, String policyReason, String purposeOfInsuValue1,
                                   String purposeOfInsuValue2, String purposeOfInsuValue3, 
                                   String Emaild,
                                   String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
                                   String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
                                   String Designation, String AnnualIncome,
                                   String Other, String ParentAnnualIncome, String ParentInsuranceCover,
                                   String Gstvalue, String ClickOnhealthDetailTab, String FMBSLivingDemise, String FMBSAgeDeath,
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof,
                                   String ClusterMarketName,String LifeINSUREDYr,String LifeINSUREDMonth,String pleaseSpecify)
            throws InterruptedException {


        new TestFactory().gotoIARweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode,SelectTypeOfDocument,SelectTypeOfDocAgeProof);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        IARpage.ClickphysicaldefectsYESBTNweb();
        Thread.sleep(2000);
        IARpage.EnterPleaseSpecifyWeb("");
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        IARpage.ClickSaveAndContinueButtonIARweb();
        Thread.sleep(2000);
        IARpage.VerifyPleaseSpecifyFieldweb();
        Thread.sleep(2000);
        IARpage.EnterPleaseSpecifyWeb(pleaseSpecify);
        
    }


    @Test(groups = {"web" }, dataProvider = "IARDataProvider", dataProviderClass = DataProviders.class,
    		description = "TEST-1644 || Validate Are you aware of any information that would have an adverse effect on insurability?(Life style, sports, Medical History, Personal habits etc)"
    				+ "TEST-1644 || Validate if user selected as Yes...a field should appear with label ”Please Specify” and user is allowed to enter the maximum 50 characters")
    public void SelectAndEnterAdverseEffectOnInsurabilityYESBTNWeb(String userName, String passWord, String leadID,
                                   String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
                                   String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
                                   String AciSumAssured, String Rideramount, String level, String IFSCCode, 
                                   String AccountNo,
                                   String PaymentMethod, String PreferredDrawDate, String SourceOfFunds,
                                   String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
                                   String nomiyear, String genderValue, String relationshipValue, String shareValue,
                                   String addressType, String pinCode, String addressOne, String addressTwo,
                                   String addressThree, String pinCode2, String language, String mobile, String telNo, String insurerName,
                                   String sumAssured, String policyNumber, String yearOfApplication, String basePlan, String annualPremium,
                                   String policyStatus, String medicalPolicy, String policyReason, String purposeOfInsuValue1,
                                   String purposeOfInsuValue2, String purposeOfInsuValue3, 
                                   String Emaild,
                                   String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
                                   String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
                                   String Designation, String AnnualIncome,
                                   String Other, String ParentAnnualIncome, String ParentInsuranceCover,
                                   String Gstvalue, String ClickOnhealthDetailTab, String FMBSLivingDemise, String FMBSAgeDeath,
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof,
                                   String ClusterMarketName,String LifeINSUREDYr,String LifeINSUREDMonth,String pleaseSpecify)
            throws InterruptedException {


        new TestFactory().gotoIARweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode,SelectTypeOfDocument,SelectTypeOfDocAgeProof);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        IARpage.ClickAdverseEffectOninsurabilityYESBTNweb();
        Thread.sleep(2000);
        IARpage.EnterPleaseSpecifyWeb("");
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        IARpage.ClickSaveAndContinueButtonIARweb();
        Thread.sleep(2000);
        IARpage.VerifyPleaseSpecifyFieldweb();
        Thread.sleep(2000);
        IARpage.EnterPleaseSpecifyWeb(pleaseSpecify);
        
    }
	

    @Test(groups = {"web" }, dataProvider = "IARDataProvider", dataProviderClass = DataProviders.class,
    		description = "TEST-1644 || Validate Has any application or revival of life/Health insurance on the proposed life ever been Declined/ Deferred / Postponed/ Accepted at special terms?"
    				+ "TEST-1644 || Validate if user selected as Yes...a field should appear with label ”Please Specify” and user is allowed to enter the maximum 50 characters")
    public void SelectAndEnterRevivalOfLifeHealthInsuranceYESBTNWeb(String userName, String passWord, String leadID,
                                   String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
                                   String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
                                   String AciSumAssured, String Rideramount, String level, String IFSCCode, 
                                   String AccountNo,
                                   String PaymentMethod, String PreferredDrawDate, String SourceOfFunds,
                                   String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
                                   String nomiyear, String genderValue, String relationshipValue, String shareValue,
                                   String addressType, String pinCode, String addressOne, String addressTwo,
                                   String addressThree, String pinCode2, String language, String mobile, String telNo, String insurerName,
                                   String sumAssured, String policyNumber, String yearOfApplication, String basePlan, String annualPremium,
                                   String policyStatus, String medicalPolicy, String policyReason, String purposeOfInsuValue1,
                                   String purposeOfInsuValue2, String purposeOfInsuValue3, 
                                   String Emaild,
                                   String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
                                   String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
                                   String Designation, String AnnualIncome,
                                   String Other, String ParentAnnualIncome, String ParentInsuranceCover,
                                   String Gstvalue, String ClickOnhealthDetailTab, String FMBSLivingDemise, String FMBSAgeDeath,
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof,
                                   String ClusterMarketName,String LifeINSUREDYr,String LifeINSUREDMonth,String pleaseSpecify)
            throws InterruptedException {


        new TestFactory().gotoIARweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode,SelectTypeOfDocument,SelectTypeOfDocAgeProof);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        IARpage.ClickRevivalOfLifeHealthInsuranceYESBTNweb();
        Thread.sleep(2000);
        IARpage.EnterPleaseSpecifyWeb("");
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        IARpage.ClickSaveAndContinueButtonIARweb();
        Thread.sleep(2000);
        IARpage.VerifyPleaseSpecifyFieldweb();
        Thread.sleep(2000);
        IARpage.EnterPleaseSpecifyWeb(pleaseSpecify);
        
    }
	

    @Test(groups = {"web" }, dataProvider = "IARDataProvider", dataProviderClass = DataProviders.class,
    		description = "TEST-1644 || Validate Is there any 'Specific Suspicious Activity' observed/reported"
    				+ "TEST-1644 || Validate if user selected as Yes..a field should appear with label ”Please Specify” and user is allowed to enter the maximum 50 characters")
    public void SelectAndEnterSpecificSuspiciousActivityYESBTNWeb(String userName, String passWord, String leadID,
                                   String mobileNumber, String panNumber, String day, String month, String year, String quoteAmount,
                                   String planOptions, String smokerNonSmoker, String pptOption, String term, String paymode,
                                   String AciSumAssured, String Rideramount, String level, String IFSCCode, 
                                   String AccountNo,
                                   String PaymentMethod, String PreferredDrawDate, String SourceOfFunds,
                                   String BankStatus, String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
                                   String nomiyear, String genderValue, String relationshipValue, String shareValue,
                                   String addressType, String pinCode, String addressOne, String addressTwo,
                                   String addressThree, String pinCode2, String language, String mobile, String telNo, String insurerName,
                                   String sumAssured, String policyNumber, String yearOfApplication, String basePlan, String annualPremium,
                                   String policyStatus, String medicalPolicy, String policyReason, String purposeOfInsuValue1,
                                   String purposeOfInsuValue2, String purposeOfInsuValue3, 
                                   String Emaild,
                                   String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
                                   String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
                                   String Designation, String AnnualIncome,
                                   String Other, String ParentAnnualIncome, String ParentInsuranceCover,
                                   String Gstvalue, String ClickOnhealthDetailTab, String FMBSLivingDemise, String FMBSAgeDeath,
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof,
                                   String ClusterMarketName,String LifeINSUREDYr,String LifeINSUREDMonth,String pleaseSpecify)
            throws InterruptedException {


        new TestFactory().gotoIARweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode,SelectTypeOfDocument,SelectTypeOfDocAgeProof);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        IARpage.ClickSpecificSuspiciousActivityYESBTNweb();
        Thread.sleep(2000);
        IARpage.EnterPleaseSpecifyWeb("");
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        IARpage.ClickSaveAndContinueButtonIARweb();
        Thread.sleep(2000);
        IARpage.VerifyPleaseSpecifyFieldweb();
        Thread.sleep(2000);
        IARpage.EnterPleaseSpecifyWeb(pleaseSpecify);
        
    }
	
	
	
	
	
	
	
	
}
