package com.absli.testcases;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
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
import com.absli.pageObjects.LoginPage;
import com.absli.pageObjects.PaymentPage;
import com.absli.pageObjects.PersonalInfo;
import com.absli.pageObjects.ReviewAndAccept;
import com.absli.pageObjects.ViewQuote;
import com.relevantcodes.extentreports.LogStatus;

import Utils.TestFactory;
import util.TestUtil;

public class DocumentsTest extends TestBase {

	

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
    public DocumentsTest() {
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
            paymentpage = new PaymentPage(TestBase.driver);
            api = new ApiData();
            testUtil = new TestUtil();
            document=new Documents(TestBase.driver);

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
	
	
	

    @Test(groups = {"web" }, dataProvider = "DocumentsDataProvider", dataProviderClass = DataProviders.class, description = "TEST-1557 ||Identity Proof Details displays in separate tile of the Page and order of sequence is first"
    		+ "TEST-1557 ||Identity proof Part should displayed as a mandatory document for all applications"
    		+ "TEST-1557 ||This document upload is only getting displayed for proposer in all scenarios"
    		+ "TEST-1557 ||User displays (*) against all the mandatory fields"
    		+ "TEST-1557 ||User clicks on upload option he should be able to upload documents from from device."
    		+ "TEST-1557 ||User should able to view the documents he has uploaded")
    public void VerifyMandatoryDocumentWeb(String userName, String passWord, String leadID,
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
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof)
            throws InterruptedException {


        new TestFactory().gotoDocumentweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode);
        
       
        document.VerifyIdentityProofweb();
        document.clickOnIdentityTileweb();
        document.VerifyMandatoryField();
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        document.VerifyAlertPopUpweb();
        document.ClickOnAlertPopUpOKBTNweb();
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        document.UploadFileweb();
        Thread.sleep(3000);
        document.FileDisplayweb();
        document.clickOnNEXTButtonweb();
                
    }
    @Test(groups = {"web" }, dataProvider = "DocumentsDataProvider", dataProviderClass = DataProviders.class, description = "||Verify user when upload the documents or photos  and if document or photo removed and replaced another document or photo then that should be uploaded successfully."
    		+ "||Verify user able to download documents or photos.")
    public void VerifyIdentityProofDownloadAndRemoveDocumentWeb(String userName, String passWord, String leadID,
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
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof)
            throws InterruptedException {


        new TestFactory().gotoDocumentweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode);
        
       
     
        document.clickOnIdentityTileweb();
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        document.UploadFileweb();
        Thread.sleep(3000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.ClickOnDownloadFileweb();
        document.ClickOnDeleteBTNweb();
        document.VerifyDeleteAreYouSureAlertTextweb();
        document.ClickOnDeleteAreYouSureAlertYesBtnweb();
                
    }
    @Test(groups = {"web" }, dataProvider = "DocumentsDataProvider", dataProviderClass = DataProviders.class, description = "TEST-1557 ||User should be displayed with the following list of documents under identity proof \r\n"
    		+ "\r\n"
    		+ "1.Passport\r\n"
    		+ "2.PAN Card \r\n"
    		+ "3.Voter’s Identity Card issued by Election Commission of India \r\n"
    		+ "4.Driving License \r\n"
    		+ "5.Aadhar card")
    public void VerifyDisplayListOfAllValueDocumentWeb(String userName, String passWord, String leadID,
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
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof)
            throws InterruptedException {


        new TestFactory().gotoDocumentweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode);
        
       
   
    
        document.clickOnIdentityTileweb();
        Thread.sleep(1000);
        WebElement SelectType=driver.findElement(By.xpath("//div[@aria-haspopup='listbox']"));
        Thread.sleep(1000);
        SelectType.click();
        CustomListner.test.log(LogStatus.INFO, "Click On Select Type of document DropDown");   
        String[] ListOfValueDropDownupdate = ListOfValueDropDown.split(",");
    	for (int i = 0; i <= ListOfValueDropDownupdate.length - 1; i++) {
        document.VerifyListOfDocumentDisplayweb(ListOfValueDropDownupdate[i]);
    	}
  
        
       
        
                
    }
    @Test(groups = {"web" }, dataProvider = "DocumentsDataProvider", dataProviderClass = DataProviders.class, description = "TEST-1557 ||User is able to upload the documents only in the below mentioned formats: \r\n"
    		+ "1.PDF \r\n"
    		+ "2.JPEG \r\n"
    		+ "3.JPG"
    		+ "TEST-1557 ||If error message pops up, user should we allowed to again select the document type and upload a fresh document")
    public void VerifyUploadOnlySpecificFormateDocumentWeb(String userName, String passWord, String leadID,
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
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof)
            throws InterruptedException {


        new TestFactory().gotoDocumentweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode);
        
       
   
    
        document.clickOnIdentityTileweb();
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        document.UploadWrongFileFormateweb();
        Thread.sleep(2000);
        document.VerifyWrongAlertPopUpweb();
        document.ClickOnAlertPopUpOKBTNweb();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        document.UploadFileweb();
       
        
                
    }
    @Test(groups = {"web" }, dataProvider = "DocumentsDataProvider", dataProviderClass = DataProviders.class, description = "TEST-1557 ||Maximum size of the documents accepted is 5MB, if size of the document exceeds user displays error message ” "
    		+ "File size of the document exceeded kindly upload the document again”")
    public void VerifyMaxFileSizeDocumentWeb(String userName, String passWord, String leadID,
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
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof)
            throws InterruptedException {


        new TestFactory().gotoDocumentweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode);
        
       
   
    
        document.clickOnIdentityTileweb();
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        document.UploadMAXFileSizeweb();
        Thread.sleep(2000);
        document.VerifyMaxAlertPopUpweb();
        document.ClickOnAlertPopUpOKBTNweb();
        
                
    }
    @Test(groups = {"web" }, dataProvider = "DocumentsDataProvider", dataProviderClass = DataProviders.class, description = "TEST-1557 ||User able to upload the multiple documents, maximum documents user allowed upload is 10"
    		+ "TEST-1557 ||Verify Navigation Flow and Redirecting Flow")
    public void VerifyUploadUpto10DocumentWeb(String userName, String passWord, String leadID,
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
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof)
            throws InterruptedException {


        new TestFactory().gotoDocumentweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode);
        
       
       
        
        document.clickOnIdentityTileweb();
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        document.UploadUpto11Documentweb();
        Thread.sleep(1000);
        document.VerifyUpto11DocumentUploadweb();
        document.ClickOnAlertPopUpOKBTNweb();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        document.UploadUpto10Documentweb();
        Thread.sleep(1000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        document.clickOnIdentityTileweb();
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
      
    }
    @Test(groups = {"web" }, dataProvider = "DocumentsDataProvider", dataProviderClass = DataProviders.class, description = "TEST-152 ||Validate when user clicks on upload option he should be able to either upload the document from device "
    		+ "and should be able to capture the image(this will only be applicable for App) from the device camera and upload"
    		+ "TEST-152 ||Validate if user gets the information on front end that document can be uploaded in which format against all the requirements"
    		+ "TEST-152 ||Validate user is able to upload the documents only in the below mentioned formats:PDF,JPEG,JPG"
    		+ "TEST-152 ||Validate Order of Sequence"
    		+ "TEST-152 ||Validate if the user is able to see the requirements raised by PX in non medical tile")
    public void VerifyNonMedicalTileDocumentWeb(String userName, String passWord, String leadID,
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
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof)
            throws InterruptedException {


        new TestFactory().gotoDocumentweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode);
        
       
        document.clickOnIdentityTileweb();
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        document.UploadFileweb();
        Thread.sleep(3000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        document.UploadNonMedicalNEFTCancelweb();
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.UploadNonMedicalPHOTOGRAPHweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
    }
    @Test(groups = {"web" }, dataProvider = "DocumentsDataProvider", dataProviderClass = DataProviders.class, description = "TEST-152 ||Should not allowed to upload except PDF,JPEG,JPG"
    		+ "TEST-152 ||Validate In the above mentioned scenario user should we allowed to again select the document type and upload a fresh document")
    public void VerifyNonMedicalTileOnlySpecificFormateAcceptedWeb(String userName, String passWord, String leadID,
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
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof)
            throws InterruptedException {


        new TestFactory().gotoDocumentweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode);
        
       
        document.clickOnIdentityTileweb();
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        document.UploadFileweb();
        Thread.sleep(3000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        document.UploadWrongFileFormateNonMedicalweb();
        Thread.sleep(2000);
        document.VerifyWrongAlertPopUpweb();
        document.ClickOnAlertPopUpOKBTNweb();
        driver.navigate().refresh();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        document.UploadNonMedicalNEFTCancelweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.UploadNonMedicalPHOTOGRAPHweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
    }
    @Test(groups = {"web" }, dataProvider = "DocumentsDataProvider", dataProviderClass = DataProviders.class, description = "TEST-152 ||Validate Maximum size of the documents accepted after compressing is 5mb,"
    		+ " if size of the document exceeds user should get the error message ” File size of the document exceeded kindly upload the document again")
    public void VerifyNonMedicalTileMaxFileSizeDocumentdWeb(String userName, String passWord, String leadID,
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
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof)
            throws InterruptedException {


        new TestFactory().gotoDocumentweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode);
        
       
        document.clickOnIdentityTileweb();
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        document.UploadFileweb();
        Thread.sleep(3000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        document.UploadNonMedicalMAXFileSizeweb();
        Thread.sleep(2000);
        document.VerifyMaxAlertPopUpweb();
        document.ClickOnAlertPopUpOKBTNweb();
       
    }
    @Test(groups = {"web" }, dataProvider = "DocumentsDataProvider", dataProviderClass = DataProviders.class, description = "TEST-152 ||Validate if user able to upload the multiple documents, max document he can upload is 5"
    		+ "TEST-152 ||should not allowed to enter more than 5 and through a inline message max 5 can upload"
    		+ "TEST-152 ||Validate Navigation Flow and Redirecting Flow")
    public void VerifyNonMedicalTileuploadUpto5DocumentdWeb(String userName, String passWord, String leadID,
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
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof)
            throws InterruptedException {


        new TestFactory().gotoDocumentweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode);
        
       
        document.clickOnIdentityTileweb();
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        document.UploadFileweb();
        Thread.sleep(3000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        document.UploadUpto6Documentweb();
        Thread.sleep(2000);
        document.VerifyUpto6DocumentUploadweb();
        document.ClickOnAlertPopUpOKBTNweb();
        driver.navigate().refresh();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        document.UploadUpto5Documentweb();
        Thread.sleep(2000);
    }
    @Test(groups = {"web" }, dataProvider = "DocumentsDataProvider", dataProviderClass = DataProviders.class, description = "TEST-1566 ||Validate that Medical Requirements"
    		+ "TEST-1566 ||User should able to get\r\n"
    		+ "a)\"Proposer\" label\r\n"
    		+ "1. \"old Medical Reports\" \r\n"
    		+ "formats JPG,PNG,PDF\r\n"
    		+ "2.Medical Documents Required\r\n"
    		+ "b) \"TO BE INSURED\" label\r\n"
    		+ "c) \"Next\" button"
    		+ "TEST-1566 ||validate \"Medical Requirements\" label \r\n"
    		+ "is not mandatory"
    		+ "TEST-1566 ||validate \"Next\" button is clickable")
    public void VerifyMedicalTileAllFieldDisplayWeb(String userName, String passWord, String leadID,
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
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof)
            throws InterruptedException {


        new TestFactory().gotoDocumentweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode);
        
       
        document.clickOnIdentityTileweb();
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        document.UploadFileweb();
        Thread.sleep(3000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        document.UploadNonMedicalNEFTCancelweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.UploadNonMedicalPHOTOGRAPHweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        document.VerifyMedicalTileweb();
        document.VerifyTobeInsuredweb();
        document.VerifyoldMedicalReportweb();
        document.VerifyoldMedicalDocumentRequiredweb();
        document.VerifyFormateTextDisplayweb();
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(1000);
        document.clickOnNEXTButtonweb();
    }
    @Test(groups = {"web" }, dataProvider = "DocumentsDataProvider", dataProviderClass = DataProviders.class, description = "TEST-1566 ||validate \"Old Medical Report\" upload"
    		+ "TEST-1566 ||User should allow to upload the Report of (JPG,PNG,PDF) format"
    		+ "TEST-1566 ||validate to upload non valid format Report")
    public void VerifyMedicaluploadSpecificFormateWeb(String userName, String passWord, String leadID,
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
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof)
            throws InterruptedException {


        new TestFactory().gotoDocumentweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode);
        
       
        document.clickOnIdentityTileweb();
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        document.UploadFileweb();
        Thread.sleep(3000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        document.UploadNonMedicalNEFTCancelweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.UploadNonMedicalPHOTOGRAPHweb();
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        document.UploadWrongFileFormateweb();
        Thread.sleep(2000);
        document.VerifyWrongAlertPopUpweb();
        document.ClickOnAlertPopUpOKBTNweb();
        driver.navigate().refresh();
        Thread.sleep(3000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        document.UploadFileweb();
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(1000);
        document.clickOnNEXTButtonweb();
    }
    @Test(groups = {"web" }, dataProvider = "DocumentsDataProvider", dataProviderClass = DataProviders.class, description = "TEST_1564 ||Validate Age Proof tile is not raised"
    		+ "TEST_1564 ||If DOB is not verified by API,then user will get Age Proof tile in Documents Page.\r\n"
    		+ "TEST_1564 ||user should able to display 'TO BE INSURED label."
    		+ "TEST_1564 ||Validtae Age prrof tile is mandatory"
    		+ "TEST_1564 ||validate that user display(*) against"
    		+ "TEST_1564 ||Validate that when user clicks on upload option he should be able to upload document from system"
    		+ "(In-case of Web) and he should be able to capture the image and upload from device(In-case of mobile).")
    public void VerifyAgeProofWeb(String userName, String passWord, String leadID,
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
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof)
            throws InterruptedException {


        new TestFactory().gotoDocumentChangeDOBweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode);
        
       
        document.clickOnIdentityTileweb();
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        document.UploadFileweb();
        Thread.sleep(3000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        document.UploadNonMedicalNEFTCancelweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.UploadNonMedicalPHOTOGRAPHweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        document.SelectTypeOfDocumentIncomePrrofweb(SelectTypeOfDocAgeProof);
        document.UploadFileweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(1000);
        document.clickOnNEXTButtonweb();
        Thread.sleep(4000);
        document.AgeProofTileDisplay();
        document.AgeProofDisplayToBeInsuredweb();
        document.VerifyMandatoryField();
        Thread.sleep(1000);
        document.clickOnNEXTButtonweb();
        Thread.sleep(2000);
        document.VerifyAgeProofAlertPopUpweb();
        document.ClickOnAlertPopUpOKBTNweb();
        document.SelectTypeOfDocumentAgeProofweb(SelectTypeOfDocument);
        document.UploadFileweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(1000);
        document.clickOnNEXTButtonweb();
    }
    @Test(groups = {"web" }, dataProvider = "DocumentsDataProvider", dataProviderClass = DataProviders.class, description = "TEST-1564 ||Validate that user is able to upload the documents only in the below mentioned formats:\r\n"
    		+ "1.PDF\r\n"
    		+ "2.JPEG\r\n"
    		+ "3.JPG"
    		+ "TEST-1564 ||validate user should not able to upload PNG format documents."
    		+ "TEST-1564 ||Verify that user is able to view the documents that he has uploaded"
    		+ "TEST-1564 ||Verify that if error message pops up, user should we allowed to again select the document type and upload a fresh document")
    public void VerifyAgeProofuploadSpecificFormateWeb(String userName, String passWord, String leadID,
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
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof)
            throws InterruptedException {


        new TestFactory().gotoDocumentChangeDOBweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode);
        
       
        document.clickOnIdentityTileweb();
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        document.UploadFileweb();
        Thread.sleep(3000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        document.UploadNonMedicalNEFTCancelweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.UploadNonMedicalPHOTOGRAPHweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        document.SelectTypeOfDocumentIncomePrrofweb(SelectTypeOfDocAgeProof);
        document.UploadFileweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(1000);
        document.clickOnNEXTButtonweb();
        Thread.sleep(4000);
        document.SelectTypeOfDocumentAgeProofweb(SelectTypeOfDocument);
        document.UploadWrongFileFormateweb();
        Thread.sleep(2000);
        document.VerifyWrongAlertPopUpweb();
        document.ClickOnAlertPopUpOKBTNweb();
        driver.navigate().refresh();
        Thread.sleep(3000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(1000);
        document.clickOnNEXTButtonweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(1000);
        document.clickOnNEXTButtonweb();
        Thread.sleep(2000);
        document.SelectTypeOfDocumentAgeProofweb(SelectTypeOfDocument);
        document.UploadFileweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(1000);
        document.FileDisplayweb();
        document.clickOnNEXTButtonweb();
    }
    @Test(groups = {"web" }, dataProvider = "DocumentsDataProvider", dataProviderClass = DataProviders.class, description = "TEST_1564 ||Validate that Maximum size of the documents accepted is 5MB,"
    		+ " if size of the document exceeds user displays error message File size of the document exceeded kindly upload the document again”")
    public void VerifyAgeProofTileMaxFileSizeDocumentdWeb(String userName, String passWord, String leadID,
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
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof)
            throws InterruptedException {


        new TestFactory().gotoDocumentChangeDOBweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode);
        
       
        document.clickOnIdentityTileweb();
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        document.UploadFileweb();
        Thread.sleep(3000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        document.UploadNonMedicalNEFTCancelweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.UploadNonMedicalPHOTOGRAPHweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        document.SelectTypeOfDocumentIncomePrrofweb(SelectTypeOfDocAgeProof);
        document.UploadFileweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(1000);
        document.clickOnNEXTButtonweb();
        Thread.sleep(4000);
        document.SelectTypeOfDocumentAgeProofweb(SelectTypeOfDocument);
        Thread.sleep(2000);
        document.UploadMAXFileSizeweb();
        Thread.sleep(2000);
        document.VerifyMaxAlertPopUpweb();
        Thread.sleep(2000);
        document.ClickOnAlertPopUpOKBTNweb();
        Thread.sleep(2000);
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(1000);
        document.clickOnNEXTButtonweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(1000);
        document.clickOnNEXTButtonweb();
        Thread.sleep(2000);
        document.SelectTypeOfDocumentAgeProofweb(SelectTypeOfDocument);
        document.UploadFileweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(1000);
        document.clickOnNEXTButtonweb();
    }
    @Test(groups = {"web" }, dataProvider = "DocumentsDataProvider", dataProviderClass = DataProviders.class, description = "TEST_1564 ||validate User able to upload the multiple documents, maximum documents user allowed upload is 10"
    		+ "TEST_1564 ||validate User try to upload 11 documents And user should get meaningful error message")
    public void VerifyAgeProofTileUploadUpto10DocumentWeb(String userName, String passWord, String leadID,
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
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof)
            throws InterruptedException {


        new TestFactory().gotoDocumentChangeDOBweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode);
        
       
        document.clickOnIdentityTileweb();
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        document.UploadFileweb();
        Thread.sleep(3000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        document.UploadNonMedicalNEFTCancelweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.UploadNonMedicalPHOTOGRAPHweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        document.SelectTypeOfDocumentIncomePrrofweb(SelectTypeOfDocAgeProof);
        document.UploadFileweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(1000);
        document.clickOnNEXTButtonweb();
        Thread.sleep(4000);
        document.SelectTypeOfDocumentAgeProofweb(SelectTypeOfDocument);
        Thread.sleep(2000);
        document.UploadUpto11Documentweb();
        Thread.sleep(1000);
        document.VerifyUpto11DocumentUploadweb();
        document.ClickOnAlertPopUpOKBTNweb();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(1000);
        document.clickOnNEXTButtonweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(1000);
        document.clickOnNEXTButtonweb();
        Thread.sleep(2000);
        document.SelectTypeOfDocumentAgeProofweb(SelectTypeOfDocument);
        Thread.sleep(2000);
        document.UploadUpto10Documentweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(1000);
        document.clickOnNEXTButtonweb();
    }
    @Test(groups = {"web" }, dataProvider = "DocumentsDataProvider", dataProviderClass = DataProviders.class, description = "TEST_1558 ||Address Proof Details Displays in separate tile of the Page and order of sequence is second"
    		+ "TEST_1558 ||Address proof is getting raised as per the logic mentioned above"
    		+ "TEST_1558 ||Address proof tile will not displayed, if total Annual Premium less than 10,000"
    		+ "TEST_1558 ||address proof tile will be displayed only if Total Annual Premium more than 10,000 ans less than 1,00,000"
    		+ "TEST_1558 ||address proof tile will be displayed only if Total Annual Premium more than 1,00,000"
    		+ "TEST_1558 ||User clicks on upload option he should be able to upload documents from from device."
    		+ "TEST_1558 ||User is able to upload the documents only in the below mentioned formats: \r\n"
    		+ "1.PDF \r\n"
    		+ "2.JPEG \r\n"
    		+ "3.JPG"
    		+ "TEST_1558 ||User clicks on the Address proof tile to select the type of document from the below documents as address proof: \r\n"
    		+ "\r\n"
    		+ "1.Passport \r\n"
    		+ "2.Voter’s Identity Card issued by Election Commission of India \r\n"
    		+ "3.Aadhar Card \r\n"
    		+ "4.Driving License"
    		+ "TEST_1558 ||User should able to view the documents he has uploaded")
    public void VerifyAddressProofuploadSpecificFormateWeb(String userName, String passWord, String leadID,
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
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof)
            throws InterruptedException {


        new TestFactory().gotoDocumentChangeSumAssuredweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,quoteAmount,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode);
        
       
        document.clickOnIdentityTileweb();
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        document.UploadFileweb();
        Thread.sleep(3000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        document.VerifyAddressProofTileweb();
        Thread.sleep(2000);
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        Thread.sleep(1000);
        document.UploadWrongFileFormateweb();
        Thread.sleep(3000);
        document.VerifyWrongAlertPopUpweb();
        document.ClickOnAlertPopUpOKBTNweb();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        Thread.sleep(2000);
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        document.UploadFileweb();
        Thread.sleep(3000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.FileDisplayweb();
        document.clickOnNEXTButtonweb();
    }
    @Test(groups = {"web" }, dataProvider = "DocumentsDataProvider", dataProviderClass = DataProviders.class, description = "TEST_1558 ||Maximum size of the documents accepted is 5MB, if size of the document exceeds user displays error message ” File size of the document exceeded kindly upload the document again”"
    		+ "TEST_1558 ||If error message pops up, user should we allowed to again select the document type and upload a fresh document")
    public void VerifyAddressProofMaxFileSizeDocumentdWeb(String userName, String passWord, String leadID,
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
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof)
            throws InterruptedException {


        new TestFactory().gotoDocumentChangeSumAssuredweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,quoteAmount,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode);
        
       
        document.clickOnIdentityTileweb();
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        document.UploadFileweb();
        Thread.sleep(3000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        document.UploadMAXFileSizeweb();
        Thread.sleep(3000);
        document.VerifyMaxAlertPopUpweb();
        document.ClickOnAlertPopUpOKBTNweb();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        Thread.sleep(2000);
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        Thread.sleep(1000);
        document.UploadFileweb();
        Thread.sleep(3000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        Thread.sleep(2000);
    }
    @Test(groups = {"web" }, dataProvider = "DocumentsDataProvider", dataProviderClass = DataProviders.class, description = "TEST_1558 ||User able to upload the multiple documents, maximum documents user allowed upload is 10")
    public void VerifyAddressProofUploadUpto10DocumentDocumentdWeb(String userName, String passWord, String leadID,
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
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof)
            throws InterruptedException {


        new TestFactory().gotoDocumentChangeSumAssuredweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,quoteAmount,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode);
        
       
        document.clickOnIdentityTileweb();
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        document.UploadFileweb();
        Thread.sleep(3000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        Thread.sleep(1000);
        document.UploadUpto10Documentweb();
        Thread.sleep(3000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
    }
    @Test(groups = {"web" }, dataProvider = "DocumentsDataProvider", dataProviderClass = DataProviders.class, description = "TEST_1564 ||Validate that user gets the following list of all the documents which can be displayed under Age proof (This list should be configurable)\r\n"
    		+ "\r\n"
    		+ "1.Passport\r\n"
    		+ "2.PAN Card \r\n"
    		+ "3.Voter’s Identity Card issued by Election Commission of India \r\n"
    		+ "4.Driving License \r\n"
    		+ "5.Aadhar card")
    public void VerifyAgeProofTileDisplayListOfAllValuesWeb(String userName, String passWord, String leadID,
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
                                   String FMBSStateAndCause,String clickOnPaymentMode,String 	SelectTypeOfDocument,String 	ListOfValueDropDown,String 	SelectTypeOfDocAgeProof)
            throws InterruptedException {


        new TestFactory().gotoDocumentChangeDOBweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause,clickOnPaymentMode);
        
       
        document.clickOnIdentityTileweb();
        document.SelectTypeOfDocumentweb(SelectTypeOfDocument);
        document.UploadFileweb();
        Thread.sleep(3000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        document.UploadNonMedicalNEFTCancelweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.UploadNonMedicalPHOTOGRAPHweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        document.clickOnNEXTButtonweb();
        Thread.sleep(3000);
        document.SelectTypeOfDocumentIncomePrrofweb(SelectTypeOfDocAgeProof);
        document.UploadFileweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(1000);
        document.clickOnNEXTButtonweb();
        Thread.sleep(4000);
       
        WebElement SelectType=driver.findElement(By.xpath("//div[@aria-haspopup='listbox']"));
        Thread.sleep(1000);
        SelectType.click();
        CustomListner.test.log(LogStatus.INFO, "Click On Select Type of document DropDown");
        
        String[] ListOfValueDropDownupdate = ListOfValueDropDown.split(",");
    	for (int i = 0; i <= ListOfValueDropDownupdate.length - 1; i++) {
        document.VerifyListOfDocumentDisplayweb(ListOfValueDropDownupdate[i]);
    	}
    }
    
//    @AfterMethod
//	public void tearDown(){
//		if (TestBase.parameterName.equalsIgnoreCase("web")) {
//			driver.quit();
//		}
//		else if(TestBase.parameterName.equalsIgnoreCase("Android")) {
//			driver1.quit();
//		}
//		else {
//			driver1.quit();
//		}
//
//	}





}
