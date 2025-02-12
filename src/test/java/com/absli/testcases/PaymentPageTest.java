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

public class PaymentPageTest extends TestBase {

	

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
    public PaymentPageTest() {
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




    @Test(groups = {"web" }, dataProvider = "PaymentPageDataProvider", dataProviderClass = DataProviders.class, 
    		description = "Verify user able to login Leap App"
    				+ "User should be able to navigate to RNA page click on check status and Goto click on proceed button "
    				+ "User should be verify check payment mode actual amount should be visible."
    				+ "User refresh the page and verify that payable amount is visible"
    				+ "User go back to previous back and comes back again on payment page the payable amount should be visible"
    				+ "TEST=55 || To completing the payment for any policy, the user able to access in the payment page"
    				+ "TEST=55 || On landing to the payment page user will be able to see the following details: \r\n"
    				+ "1.Application number \r\n"
    				+ "2.Premium Amount \r\n"
    				+ "3.Plan Name"
    				+ "TEST=55 || The plan selected for the application will be displayed as the Plan name."
    				+ "TEST=55 || The premium amount for the application will be displayed as the Premium Amount"
    				+ "TEST=55 || user will be displaying the following options\r\n"
    				+ "TEST=55 || User should be displayed with the application number, for which the customer is making the payment"
    				+ "1.Online Payment\r\n"
    				+ "2.Cash\r\n"
    				+ "3.Cheque / Demand Draft\r\n"
    				+ "4.Win Back\r\n"
    				+ "5.Over the Counter (OTC)\r\n"
    				+ " ")
    public void ValidationOfNevigateToPaymentPageWeb(String userName, String passWord, String leadID, String mobileNumber,
			String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
			String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
			String Rideramount, String level, String IFSCCode,
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
			String Gstvalue,String ClickOnhealthDetailTab,String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause,String clickOnPaymentMode,String selectChequeORDemandDraft,
			String ChequeDDNo,String CDDday,String CDDMonth,String CDDYear,String CDDIFSCcode ,String WBplicyNo,String Wbamount,String paymentSummary)
            throws InterruptedException {



        new TestFactory().gotoPaymentPageweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
        
       
        
        Thread.sleep(2000);
        driver.navigate().refresh();
        CustomListner.test.log(LogStatus.INFO, "Click Refresh BTN On Payment Page");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        paymentpage.VerifictionOfPremiumValueWeb();
        driver.navigate().back();
        CustomListner.test.log(LogStatus.INFO, "Click Back BTN On Payment Page");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        paymentpage. clickProceedonRNAWeb();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        paymentpage.VerifictionOfPremiumValueWeb();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        paymentpage.NevigatePaymentModeWeb();
        Thread.sleep(2000);
        
      
    
    
  
                
    }

    @Test(groups = {"web" }, dataProvider = "PaymentPageDataProvider", dataProviderClass = DataProviders.class, 
    		description = "TEST=577||select mode \"ONLINE\" & it should be clickable by user."
    				+ "TEST=577||user should get"
    				+ "1-plan"
    				+ "2-application no"
    				+ "3-online\" label"
    				+ "a-Amount"
    				+ "b-send payment link"
    				+ "c-copy payment link"
    				+ "4-PAY NOW\" button"
    				+ "TEST=577||validate that premium amount is displaying for"
    				+ "TEST=577|| validate \"Send Payment Link\" is clickable or Not==if Send Payment Link is clickable then the system will be sending the payment link to the customer & user will get ( “The payment link has been send to the customer successfully”) message"
    				+ "TEST=577|| \"SUBMIT\" button should clickable"
    			
    				+ "TEST=54 || make payement by ONLINE & Validtae the all the details in payment Summary page "
    				+ "user shoud able to see"
    				+ "1.paid via ONLINE"
    				+ "2.Total amount paid"
    				+ "3.\"ONLINE\" lable"
    				+ "a-Details"
    				+ "b-Amount Recived"
    				+ "c-Date"
    				+ "D-Mode"
    				+ "4.\"NEXT\" button"
    				+ "TEST=54 || user should able to navigate to payment Summary page")
    public void ValidationAndSelectOnlinePaymentWeb(String userName, String passWord, String leadID, String mobileNumber,
			String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
			String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
			String Rideramount, String level, String IFSCCode,
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
			String Gstvalue,String ClickOnhealthDetailTab,String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause,String clickOnPaymentMode,String selectChequeORDemandDraft,
			String ChequeDDNo,String CDDday,String CDDMonth,String CDDYear,String CDDIFSCcode ,String WBplicyNo,String Wbamount,String paymentSummary)
            throws InterruptedException {


        new TestFactory().gotoPaymentPageweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
        
       
        
        Thread.sleep(2000);
        paymentpage.VerificationOfOnlinPaymentModeWeb();
        Thread.sleep(2000);
         paymentpage.ClickONLINEPaymentPayNowBTNweb();
    
    
  
                
    }


    @Test(groups = {"web" }, dataProvider = "PaymentPageDataProvider", dataProviderClass = DataProviders.class, 
    		description = "TEST=1278 || Verify that after insurance selecting Payment mode as Cheque/Demand draft user will see the premium amount paid"
    				+ "TEST=1278 || Verify the By default cheque will be selected "
    				+ "User can see the details of Cheque Image,Amount, Cheque details,Cheque date, IFSC should be populated"
    				+ "TEST=1278 ||Verfiy the Cheque number should be 6-14 Characters"
    				+ "TEST=1278 || Verify IFSC code should match with desired format and should be proper"
    				+ "TEST=1278 || Verify the IFSC code if entered correct "
    				+ "User  should display\r\n"
    				+ "Bank Name, MICR \r\n"
    				+ "number, Branch Name"
    				+ "TEST=1278 || User when Document uploaded should only be jpg,jpeg or pdf "
    				+ "TEST=1278 || User when Document uploaded size should not be greater than 5 mb"
    				+ "User  should be able remove an existing uploaded document, and upload a new document."
    				+ "TEST=1278 || User should see On click of submit system should save the entry and message should pop up \"The payment has been completed successful\""
    				+ "TEST=1278 || User should be directed to summary page to view summary completed"
    				+ "TEST=54 || user should able to navigate to payment Summary page"
    				+ "TEST=54 || make payement by CHEQUE/Demand Draft & \r\n"
    				+ "Validtae the all the details in payment Summary pagEB user shoud able to see\r\n"
    				+ "1.paid via CHEQUE\r\n"
    				+ "2.Total amount paid\r\n"
    				+ "3.\"CHEQUE\" lable\r\n"
    				+ "a-Details\r\n"
    				+ "b-Amount Recived\r\n"
    				+ "c- Date\r\n"
    				+ "CHEQUE DETAILS\r\n"
    				+ "cheque No\r\n"
    				+ "cheque amount\r\n"
    				+ "cheque date\r\n"
    				+ "ifsc code\r\n"
    				+ "Bank name\r\n"
    				+ "Branch name\r\n"
    				+ "mcr code \r\n"
    				+ "4.\"NEXT\" button")
    public void ValidationChequePaymentWeb(String userName, String passWord, String leadID, String mobileNumber,
			String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
			String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
			String Rideramount, String level, String IFSCCode,
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
			String Gstvalue,String ClickOnhealthDetailTab,String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause,String clickOnPaymentMode,String selectChequeORDemandDraft,
			String ChequeDDNo,String CDDday,String CDDMonth,String CDDYear,String CDDIFSCcode ,String WBplicyNo,String Wbamount,String paymentSummary)
            throws InterruptedException {


        new TestFactory().gotoPaymentPageweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
        
     
        paymentpage.ClickOnPaymentModeweb(clickOnPaymentMode);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        paymentpage.VerificationChequeAndDemandDraftPaymentModeWeb();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        paymentpage.SelectChequeORDemandDraftWeb(selectChequeORDemandDraft);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        paymentpage.UploadChequeAndDDImgweb();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        paymentpage.CDDRemoveBTNweb();
        Thread.sleep(4000);
        paymentpage.VerifyAlertMsgUploadImg();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        paymentpage.UploadChequeAndDDGreaterSizeImgweb();
        Thread.sleep(3000);
        paymentpage.ValidationCDDImagegreterSizeErrorMSG();
        Thread.sleep(2000);
        paymentpage.IMGAlertOKBTN();
        Thread.sleep(2000);
        paymentpage.UploadChequeAndDDImgweb();
        Thread.sleep(2000);
        paymentpage.EnterChequeDDNoWeb(ChequeDDNo);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        paymentpage.EnterDDMMYYONCDDWeb(CDDday, CDDMonth, CDDYear);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        paymentpage.VarifyINCORRECTIFSCCodeOnCDDWeb();  
        Thread.sleep(2000);
        paymentpage.EnterIFSCCodeOnCDDWeb(CDDIFSCcode);
        Thread.sleep(2000);
        paymentpage.VerifyEnetrvalidIFSCCodeOnCDDWeb();
        Thread.sleep(2000);
        paymentpage.ClickCDDPaymentSubmitBTNweb();
        Thread.sleep(2000);
      // paymentpage.VerificationOfSummaryPageOnCashweb();//UNDER DEV THIS FUN

       
        String[] Occupationupdate = paymentSummary.split(",");
       	for (int i = 0; i <= Occupationupdate.length - 1; i++) {
       		paymentpage 	.ValidationSummaryPageweb(Occupationupdate[i]);
       	}
    
    }


    @Test(groups = {"web" }, dataProvider = "PaymentPageDataProvider", dataProviderClass = DataProviders.class, 
    		description = "TEST=1278 || Verfiy the user can able to selected the radio button of demand draft"
    				+ "TEST=1278 || Verfiy the Cheque number should be 6-14 Characters"
    				+ "TEST=1278 || Verify the user selects demand draft option"
    				
    				+ "User should be able to navigate Payment mode page."
    				+ "User should able to select Cheque/Demand draft."
    				+ "User should be able to upload Declaration form, Declartion form should be uploaded."
    				+ "TEST=1278 || User will be asked to upload Demand Draft declaration form"
    				+ "User  should be able remove an existing uploaded document, and upload a new document."
    				+ "User  should be able  uploaded Cheque image , must be in either in jpg, jpeg or pdf format. The size of the document must not be greater than 5 mb."
    				+ "TEST=1278 || User should see On click of submit system should save the entry and message should pop up \"The payment has been completed successful\""
    				+ "TEST=1278 || User should be directed to summary page to view summary completed"
    				+ "TEST=54 || user should able to navigate to payment Summary page"
    				+ "TEST=54 || make payement by CHEQUE/Demand Draft &user shoud able to see\r\n"
    				+ "1.paid via CHEQUE\r\n"
    				+ "2.Total amount paid\r\n"
    				+ "3.\"CHEQUE\" lable\r\n"
    				+ "a-Details\r\n"
    				+ "b-Amount Recived\r\n"
    				+ "c- Date\r\n"
    				+ "CHEQUE DETAILS\r\n"
    				+ "cheque No\r\n"
    				+ "cheque amount\r\n"
    				+ "cheque date\r\n"
    				+ "ifsc code\r\n"
    				+ "Bank name\r\n"
    				+ "Branch name\r\n"
    				+ "mcr code \r\n"
    				+ "4.\"NEXT\" button"
    				)
    public void ValidationDDPaymentWeb(String userName, String passWord, String leadID, String mobileNumber,
			String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
			String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
			String Rideramount, String level, String IFSCCode,
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
			String Gstvalue,String ClickOnhealthDetailTab,String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause,String clickOnPaymentMode,String selectChequeORDemandDraft,
			String ChequeDDNo,String CDDday,String CDDMonth,String CDDYear,String CDDIFSCcode ,String WBplicyNo,String Wbamount,String paymentSummary)
            throws InterruptedException {


        new TestFactory().gotoPaymentPageweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
        
        

        Thread.sleep(2000);
        paymentpage.ClickOnPaymentModeweb(clickOnPaymentMode);
        Thread.sleep(2000);
      //  paymentpage.VerificationCashAndDemandDraftPaymentModeWeb();
        Thread.sleep(2000);
        paymentpage.SelectChequeORDemandDraftWeb(selectChequeORDemandDraft);
        Thread.sleep(2000);
        paymentpage.UploadChequeAndDDImgweb();
        Thread.sleep(3000);
        paymentpage.CDDRemoveBTNweb();
        Thread.sleep(4000);
        paymentpage.VerifyAlertMsgUploadImg();
        Thread.sleep(2000);
        paymentpage.UploadChequeAndDDGreaterSizeImgweb();
        Thread.sleep(3000);
        paymentpage.ValidationCDDImagegreterSizeErrorMSG();
        Thread.sleep(2000);
        paymentpage.IMGAlertOKBTN();
        Thread.sleep(2000);
        paymentpage.UploadChequeAndDDImgweb();
        Thread.sleep(3000);
        paymentpage.EnterChequeDDNoWeb(ChequeDDNo);
        Thread.sleep(2000);
        paymentpage.EnterDDMMYYONCDDWeb(CDDday, CDDMonth, CDDYear);
        Thread.sleep(2000);
        paymentpage.VarifyINCORRECTIFSCCodeOnCDDWeb();  
        Thread.sleep(2000);
        paymentpage.EnterIFSCCodeOnCDDWeb(CDDIFSCcode);
        Thread.sleep(2000);
        paymentpage.VerifyEnetrvalidIFSCCodeOnCDDWeb();
        Thread.sleep(2000);
        paymentpage.UploadDECLARATIONFORMImgweb();
        Thread.sleep(3000);
        paymentpage.ClickCDDPaymentSubmitBTNweb();
        
       // paymentpage.VerificationOfSummaryPageOnCashweb();//UNDER DEV THIS FUN
    }


    @Test(groups = {"web" }, dataProvider = "PaymentPageDataProvider", dataProviderClass = DataProviders.class, 
    		description = "User should be able to login Leap App"
    				+ "TEST=578 || After user on selecting the payment mode as Cash user will be able to see the following "
    				+ "1.Premium amount to be paid."
    				+ "TEST=578 || User should be displayed with Submit option"
    				+ "TEST=578 || After click on submit option user should display successful message that “The payment has been completed successful” on the summary page."
    				+ "TEST=578 || After the payment has been completed, then the user will be redirected to the summary page to view summary of the payment"
    				+ "TEST=578 || Verify Navigation Flow and Redirecting Flow"
    				+ "User should be able to navigate Payment mode page."
    				+ "User should be able to see he Premium amount, will be displayed and disabled."
    				+ "User should be able to click on submit button."
    				+ "User should be able to  payment has been completed then the user will be redirected to the summary page, view the summary of the payment is completed."
    				+ "User Should be able to see  Payment successfull message once payment is done by cash and user land on the summery page."
    				+ "User should be able to click on submit button then system will save the entery and show the successful message, That is “The payment has been completed successful”."
    				+ "TEST=54 || user should able to navigate to payment Summary page"
    				+ "TEST=54 || make payement by CASH & Validate the all the details in payment Summary page"
    				+ "user shoud able to see"
    				+ "1.paid via CASH"
    				+ "2.Total amount paid"
    				+ "3.\"CASH\" lable"
    				+ "a-Details"
    				+ "b-Amount Recived"
    				+ "c-Payment Date"
    				+ "4.\"NEXT\" button")
    public void ValidationCashPaymentWeb(String userName, String passWord, String leadID, String mobileNumber,
			String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
			String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
			String Rideramount, String level, String IFSCCode,
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
			String Gstvalue,String ClickOnhealthDetailTab,String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause,String clickOnPaymentMode,String selectChequeORDemandDraft,
			String ChequeDDNo,String CDDday,String CDDMonth,String CDDYear,String CDDIFSCcode ,String WBplicyNo,String Wbamount,String paymentSummary)
            throws InterruptedException {


        new TestFactory().gotoPaymentPageweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
        
        

        Thread.sleep(2000);
        paymentpage.ClickOnPaymentModeweb(clickOnPaymentMode);
        Thread.sleep(2000);
    	 TestUtil.scrollTillEndOfPage(driver);
        paymentpage.VerificationOfCashModeweb();
        Thread.sleep(2000);
        paymentpage.ClickOnCashSubmitBTNweb();
        Thread.sleep(2000);
     
       
       String[] Occupationupdate = paymentSummary.split(",");
   	for (int i = 0; i <= Occupationupdate.length - 1; i++) {
   		paymentpage 	.ValidationSummaryPageweb(Occupationupdate[i]);
   	}
   	paymentpage.VerifySuccessFullPaymentOnSummaryPageWeb();
   	
       // paymentpage.VerificationOfSummaryPageOncashweb();
        Thread.sleep(2000);
        

    
    
    }
    

    @Test(groups = {"web" }, dataProvider = "PaymentPageDataProvider", dataProviderClass = DataProviders.class, 
    		description = "TEST=1343 || user sholud enter valid policy number against which the user wants to do a fund transfer, and will be entering the amount for the respective policy."
    				+ "TEST=1343 || The user can choose to make payments via different funds, and enter multiple policy number."
    				+ "TEST=1343 || the system should save the entry and should show a successful message that “The payment has been completed successful” and the user will land on the summary page."
    				+ "TEST=1343 || The policy number, entered must be of 9 digits. Alphabets will not be allowed."
    				+ "TEST=1343 || The amount against each of the policy, must be in digits. Alphabets will not be allowed."
    				+ "TEST=1343 || The sum of the amount of all the policies should not exceed the premium amount."
    				+ "TEST=1343 || If the user selects any of the application, where the payment has been completed, then the user will be redirected to the summary page, to view the summary of the payment completed."
    				+ "TEST=54 || user should able to navigate to payment Summary page"
    				+ "TEST=54 || make payement by WINBACK & Validate the all the details in payment Summary page"
    				+ "user shoud able to see\r\n"
    				+ "1.paid via WINBACK\r\n"
    				+ "2.Total amount paid\r\n"
    				+ "3.\"WINBACK\" lable\r\n"
    				+ "a-Details\r\n"
    				+ "b-Amount Recived\r\n"
    				+ "c- Date\r\n"
    				+ "d-policy used for redemtion\r\n"
    				+ "policy No\r\n"
    				+ "Amount\r\n"
    				+ "4.\"NEXT\" button"
    				+ "")
    public void ValidationWinBackPaymentWeb(String userName, String passWord, String leadID, String mobileNumber,
			String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
			String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
			String Rideramount, String level, String IFSCCode,
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
			String Gstvalue,String ClickOnhealthDetailTab,String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause,String clickOnPaymentMode,String selectChequeORDemandDraft,
			String ChequeDDNo,String CDDday,String CDDMonth,String CDDYear,String CDDIFSCcode ,String WBplicyNo,String Wbamount,String paymentSummary)
            throws InterruptedException {


        new TestFactory().gotoPaymentPageweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
        
        Thread.sleep(1000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        paymentpage.ClickOnPaymentModeweb(clickOnPaymentMode);
        Thread.sleep(2000);
    	 TestUtil.scrollTillEndOfPage(driver);
    	 paymentpage.VerificationOfPolicyNOeweb();
    	 Thread.sleep(2000);
        paymentpage.EnterPolicyNOOnWinBackWeb(WBplicyNo);
        Thread.sleep(2000);
        paymentpage.VerificationOfAmounteWBweb();
        Thread.sleep(2000);
        paymentpage.ClickOnWinBackSaveBTNweb();
        Thread.sleep(2000);
        paymentpage.validationExceedMSgonWBWeb();
        Thread.sleep(2000);
        paymentpage.RemoveAmountOnWinBackWeb();
        Thread.sleep(2000);
        paymentpage.EnterAmountOnWinBackWeb(Wbamount);
        Thread.sleep(2000);
        paymentpage.ClickOnWinBackSaveBTNweb();
        Thread.sleep(2000);
        paymentpage.ClickOnWinBackEditBTNweb();
        Thread.sleep(2000);
        paymentpage.EditAndReEnterAmountOnWinBackWeb(Wbamount);
        Thread.sleep(2000);
        paymentpage.ClickOnWinBackSaveBTNweb();
        Thread.sleep(2000);
        paymentpage.EnterSecondPolicyNOOnWinBackWeb(WBplicyNo);
        Thread.sleep(2000);
        paymentpage.EnterSecondAmountOnWinBackWeb(Wbamount);
        Thread.sleep(2000);
        paymentpage.ClickOnWinBackSaveBTNweb();
        Thread.sleep(2000);
        paymentpage.validationExceedMSgonWBWeb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        paymentpage.ClickOnWinBackREDEEMBTNweb();
        Thread.sleep(2000);
        TestUtil.scrollTillTOPOfPage(driver);
        Thread.sleep(2000);
        
        String[] Occupationupdate = paymentSummary.split(",");
    	for (int i = 0; i <= Occupationupdate.length - 1; i++) {
    		paymentpage 	.ValidationSummaryPageweb(Occupationupdate[i]);
    	}
    	paymentpage.VerifySuccessFullPaymentOnSummaryPageWeb();
        
        
        
        
       //paymentpage.VerificationOfSummaryPageOnWINBACKweb();
       // TestUtil.scrollTillTOPOfPage(driver);
    }
    


    @Test(groups = {"web" }, dataProvider = "PaymentPageDataProvider", dataProviderClass = DataProviders.class, 
    		description = "TEST=1343 || To verify that on selecting the payment mode as Winback, the user will be able to see the following options:-\r\n"
    				+ "1) Premium amount to be paid.\r\n"
    				+ "2)Balance amount, in case on win back will be displayed, which will be the difference between the premium amount and the paid amount for each policy"
    				+ "TEST=1343 || policy should be add/remove before saving the payment entry"
    				)
    public void ValidationWinBackPaymentADDAndRemoveWeb(String userName, String passWord, String leadID, String mobileNumber,
			String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
			String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
			String Rideramount, String level, String IFSCCode,
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
			String Gstvalue,String ClickOnhealthDetailTab,String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause,String clickOnPaymentMode,String selectChequeORDemandDraft,
			String ChequeDDNo,String CDDday,String CDDMonth,String CDDYear,String CDDIFSCcode ,String WBplicyNo,String Wbamount,String paymentSummary)
            throws InterruptedException {


        new TestFactory().gotoPaymentPageweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
        
        Thread.sleep(1000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        paymentpage.ClickOnPaymentModeweb(clickOnPaymentMode);
        Thread.sleep(2000);
    	 TestUtil.scrollTillEndOfPage(driver);
    	
        paymentpage.EnterPolicyNOOnWinBackWeb(WBplicyNo);
        Thread.sleep(2000);
        paymentpage.EnterAmountOnWinBackWeb(Wbamount);
        Thread.sleep(2000);
        paymentpage.ClickOnWinBackSaveBTNweb();
        Thread.sleep(2000);
        paymentpage.EnterSecondPolicyNOOnWinBackWeb(WBplicyNo);
        Thread.sleep(2000);
        paymentpage.EnterSecondAmountOnWinBackWeb(Wbamount);
        Thread.sleep(2000);
        paymentpage.ClickOnWinBackSaveBTNweb();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        paymentpage.VerifyDifferenceBetweenPremiumAmountAndPaidAmountOnWINBACKweb();
        Thread.sleep(2000);
        paymentpage.ClickOnReMovePolicyBTNweb();
        TestUtil.scrollTillEndOfPage(driver);
        paymentpage.ClickOnWinBackREDEEMBTNweb();
        Thread.sleep(2000);
        TestUtil.scrollTillTOPOfPage(driver);
        Thread.sleep(2000);
        
    }
    

    

    @Test(groups = {"web" }, dataProvider = "PaymentPageDataProvider", dataProviderClass = DataProviders.class, 
    		description = "TEST=577 || To do half payment via winback & validtae system is displaying the amount paid via Winback or not the due amount to be paid should display ON ONLINE PAYMENT"
    				+ "TEST=577 || Don't do payment & validtae due amount is displaying or not ON ONLINE PAYMENT"
    				+ "TEST=577 || make payment vai winback & validtae that payment via is displaying winback or not ON ONLINE PAYMENT"
    				+ "TEST=1278 || Verify premium  payment already done via WinBack following should be displayed on the paid ON CASH And DEMAND DRAFT"
    				+ "TEST=1278 || Verify that after insurance selecting Payment mode as Cheque/Demand draft user will see due amount to be paid ON CASH AND DEMAND DRAFT"
    				+ "TEST=1278 || Verify that in case Partially paid by win back then remaining payment amount should only on due amount ON CASH AND DEMAD DRAFT"
    				+ "TEST=1343 || user should remain on payment page and should have the option to select any one of the existing payment modes and complete the payment using the same.ON WIN BACK"
    				+ " TEST=578 || In case of Partial Payment already done through Winback, the system will display the amount paid via Winback and the due amount to be paid. ON CASH"
    				+ "TEST=578 || User displays the payment to be done, will be the due amount. ON CASH"
    				+ "TEST=578 || The above section will be displayed, when the payment for this application has been done already via Winback.ON CASH"
    				+ "TEST=1344 || Verify that in case of Partial Payment already done through Winback, the system will display the amount paid via Winback and the due amount to be paid.ON OTC"
    				+ "TEST=1344 || Verify that user displays the payment to be done, will be the due amount.ON OTC"
    				+ "TEST=1344 || The above section for user should be displayed, when the payment for this application has been done already via Winback."
    				+ "TEST=54 || validtae user will be able to see the payment summary for both the payment when user will make payment by using winback"
    				+ "TEST=54 || user should redirect to summary page"
    				+ "")
    public void WinBackBalanceAmountCanPayToDifferentPayModeWeb(String userName, String passWord, String leadID, String mobileNumber,
			String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
			String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
			String Rideramount, String level, String IFSCCode,
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
			String Gstvalue,String ClickOnhealthDetailTab,String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause,String clickOnPaymentMode,String selectChequeORDemandDraft,
			String ChequeDDNo,String CDDday,String CDDMonth,String CDDYear,String CDDIFSCcode ,String WBplicyNo,String Wbamount,String paymentSummary)
            throws InterruptedException {


        new TestFactory().gotoPaymentPageweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
        
        Thread.sleep(1000);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        paymentpage.ClickOnPaymentModeweb(clickOnPaymentMode);
        Thread.sleep(2000);
    	 TestUtil.scrollTillEndOfPage(driver);
    	 paymentpage.EnterPolicyNOOnWinBackWeb(WBplicyNo);
    	 Thread.sleep(2000);
    	 paymentpage.EnterAmountOnWinBackWeb(Wbamount);
    	 Thread.sleep(2000);
    	 paymentpage.ClickOnWinBackSaveBTNweb();
    	 Thread.sleep(2000);
    	 TestUtil.scrollTillEndOfPage(driver);
    	 paymentpage.ClickOnWinBackREDEEMBTNweb();
    	 Thread.sleep(2000);
    	 TestUtil.scrollTillTOPOfPage(driver);
    	 paymentpage.VerificatinOfBalanceAmountCanPayToOnlineModeWeb();
    	 Thread.sleep(2000);
    	
    	 paymentpage.VerificatinOfBalanceAmountCanPayToCDDModeWeb();
    	 Thread.sleep(2000);
    	 paymentpage.VerificatinOfBalanceAmountCanPayToCashModeWeb();
      	 TestUtil.scrollTillEndOfPage(driver);
    	 paymentpage.VerificatinOfBalanceAmountCanPayToOTCModeWeb();
    	 Thread.sleep(2000);
    	 TestUtil.scrollTillTOPOfPage(driver);
       	 Thread.sleep(2000);
         paymentpage.VerificatinOfBalanceAmountCanPayToOTCModeSummaryPageWeb();
     }
    

    
    

    @Test(groups = {"web" }, dataProvider = "PaymentPageDataProvider", dataProviderClass = DataProviders.class, 
    		description = "TEST=1344 || Verify that for a sales user, the following functionalities will be accessed when user trying to make payment using Offline Payment Mode - Over the Counter (OTC)"
    				+ "TEST=1344 || Verify that after user on selecting the payment mode as Over the Counter(OTC) user will be able to see the following \r\n"
    				+ "1.Premium amount to be paid. "
    				+ "TEST=1344 || Verify that the Premium amount will be displayed and disabledas it is read only field for the user."
    				+ "TEST=1344 || Verify that Submit option is displayed on the user"
    				+ "TEST=1344 || Verify that on the click of submit option, the system will save the entry and show a successful message that “The payment has been completed successful” and the user will land on the summary page."
    				+ "TEST=1344 || Verify that after the payment has been completed, then the user will be redirected to the summary page"
    				+ "TEST=1344 || Validate Navigation Flow and Redirecting Flow"
    				+ "TEST=54 || user should able to navigate to payment Summary page"
    				+ "TEST=54 || user shoud able to see\r\n"
    				+ "1.paid via OTc\r\n"
    				+ "2.Total amount paid\r\n"
    				+ "3.\"OTC\" lable\r\n"
    				+ "a-Details\r\n"
    				+ "b-Amount Recived\r\n"
    				+ "c-Date\r\n"
    				+ "4.\"NEXT\" button")
    public void ValidationOTCPaymentWeb(String userName, String passWord, String leadID, String mobileNumber,
			String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
			String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
			String Rideramount, String level, String IFSCCode,
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
			String Gstvalue,String ClickOnhealthDetailTab,String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause,String clickOnPaymentMode,String selectChequeORDemandDraft,
			String ChequeDDNo,String CDDday,String CDDMonth,String CDDYear,String CDDIFSCcode ,String WBplicyNo,String Wbamount,String paymentSummary)
            throws InterruptedException {


        new TestFactory().gotoPaymentPageweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
    			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
    			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
    			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
    			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
    			AnnualIncome,purposeOfInsuValue1,purposeOfInsuValue2,purposeOfInsuValue3,
        		ClickOnhealthDetailTab, FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
        
     
        TestUtil.scrollTillEndOfPage(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        paymentpage.ClickOnPaymentModeweb(clickOnPaymentMode);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        paymentpage.VerificationOfOTCModeweb();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        paymentpage.ClickOnOTCSubmitBTNweb();
        Thread.sleep(2000);
        TestUtil.scrollTillTOPOfPage(driver);
        
        String[] Occupationupdate = paymentSummary.split(",");
    	for (int i = 0; i <= Occupationupdate.length - 1; i++) {
    		paymentpage .ValidationSummaryPageweb(Occupationupdate[i]);
    	}
    	paymentpage.VerifySuccessFullPaymentOnSummaryPageWeb();
        
        
        
        
        
        
       // paymentpage.VerificationOfSummaryPageOnOTCweb();

        
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

	}
	*/
}
}