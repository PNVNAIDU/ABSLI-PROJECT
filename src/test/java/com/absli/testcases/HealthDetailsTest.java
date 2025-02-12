package com.absli.testcases;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import com.absli.pageObjects.HealthDetail;
import com.absli.pageObjects.LoginPage;
import com.absli.pageObjects.PersonalInfo;
import com.absli.pageObjects.ViewQuote;
import com.absli.utils.WaitUtils;
import com.relevantcodes.extentreports.LogStatus;

import Utils.TestFactory;
import util.TestUtil;

public class HealthDetailsTest extends TestBase {
	
	
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
    WaitUtils wait;
    public HealthDetailsTest() {
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

	@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, 
					description = "TEST-86 ||Capture personal Health details "
							+ "TEST-86 ||Verify Height - Feet field ||1.Numeric/Whole no.\r\n"
							+ "2.Single digitmin 1 max 8\r\n"
							+ "3.Manadatory\r\n"
							+ "4.Please enter between (Min) and (Max) if try to enter invalid data range "
							+ "TEST-86 ||Verify Height - Inches field  ||1.Numeric/Whole no. \r\n"
							+ "2.Two digits between = 1 to 11\r\n"
							+ "3.Mandatory\r\n"
							+ "4.Please enter between (Min) and (Max) if try to enter invalid data range ")
	public void HealthDetailsPersonalHeightFeetValidationWeb(String userName, String passWord, String leadID, String mobileNumber,
			String panNumber, String day, String month, String year,  String IFSCCode, String AccountNo,
			String PaymentMethod, String PreferredDrawDate, String SourceOfFunds,
			 String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue,  String removeMSG,
			String addressType, String pinCode, String addressOne, String addressTwo,
			String addressThree, String pinCode2, String language, String mobile, String telNo,  String Emaild, String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
			String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
			String Designation, String AnnualIncome, String 	ClickOnhealthDetailTab,String 	weight,String 	WaightChange,String NoOfChangeWaight,String Narcotics,String ReasonForNarcotic,
			String 	Alcohol,String 	TpeofAlcohol,String Quantity,String Frequency,String Tobacco,String TypeofTobacco,String CigrateQuantity,String CigrateNoOfYear,
			String 	Hazardous,String hazarSelectOption1,String 	hazaTimeofYear,String 	hazarSelectOption2,String 	Travell,String 	AbsentFromWork,
			String 	CurrentSymtoms,String 	DoctorDetails,String 	DateOfLastDay,String 	DateOfLastMonth,String 	DateOfLastYear,String 	DetailsOfHospitalization,String 	ClickonHospitalize,
			String 	ClickOnDisorder,String 	ClickOnSpouseHealth,String 	ClickOnOtherSymptoms,String 	ClickOnForFemaleOnly,String 	NoOfWeek,String 	ClickOnHaveYouSufferFrom,String 	ClickOnAilments,
			String 	DisplayAllAilment,String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

		new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month,
				year, IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName,
				nimiLastName, nomiday, nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType,
				pinCode, addressOne, addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus,
				fatherSpouseName, motherName, maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness,
				TypeOfOrganisation, Designation, AnnualIncome);

		healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
		Thread.sleep(2000);
		healthdetail.ClickonHeightFeetUpArrow();
		healthdetail.GetTextHeightfeetIntergerValue();
		healthdetail.ClickonHeightInchUpArrow();
		healthdetail.GetTextHeightInchIntergerValue();
	
	}

	@Test(groups = {
			"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-86 ||Capture personal Health details "
					+ "TEST-86 ||Verify Weight (Kg) ||1.Numeric/Whole no. \r\n"
					+ "2.max 3 digitsMin 1 max 250\r\n"
					+ "3.Mandatory\r\n"
					+ "4.Please enter between (Min) and (Max) if try to enter invalid data range ")
	public void HealthDetailsPersonalWaightValidationWeb(String userName, String passWord, String leadID, String mobileNumber,
			String panNumber, String day, String month, String year,  String IFSCCode, String AccountNo,
			String PaymentMethod, String PreferredDrawDate, String SourceOfFunds,
			 String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue,  String removeMSG,
			String addressType, String pinCode, String addressOne, String addressTwo,
			String addressThree, String pinCode2, String language, String mobile, String telNo,  String Emaild, String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
			String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
			String Designation, String AnnualIncome, String 	ClickOnhealthDetailTab,String 	weight,String 	WaightChange,String NoOfChangeWaight,String Narcotics,String ReasonForNarcotic,
			String 	Alcohol,String 	TpeofAlcohol,String Quantity,String Frequency,String Tobacco,String TypeofTobacco,String CigrateQuantity,String CigrateNoOfYear,
			String 	Hazardous,String hazarSelectOption1,String 	hazaTimeofYear,String 	hazarSelectOption2,String 	Travell,String 	AbsentFromWork,
			String 	CurrentSymtoms,String 	DoctorDetails,String 	DateOfLastDay,String 	DateOfLastMonth,String 	DateOfLastYear,String 	DetailsOfHospitalization,String 	ClickonHospitalize,String 	ClickOnDisorder,
			String 	ClickOnSpouseHealth,String 	ClickOnOtherSymptoms,String 	ClickOnForFemaleOnly,String 	NoOfWeek,String 	ClickOnHaveYouSufferFrom,
			String 	ClickOnAilments,String 	DisplayAllAilment,String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

		new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month,
				year, IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName,
				nimiLastName, nomiday, nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType,
				pinCode, addressOne, addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus,
				fatherSpouseName, motherName, maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness,
				TypeOfOrganisation, Designation, AnnualIncome);
		
		healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
		healthdetail.EnterWeight("");
		healthdetail.ClickSaveContinueBtn();
		Thread.sleep(2000);
		healthdetail.weightValidation();
		healthdetail.ClearWeight();
		healthdetail.EnterWeight(weight);
		String WeightEle=driver.findElement(By.xpath("//input[@placeholder='Enter Weight']")).getAttribute("value");
		if(weight.equalsIgnoreCase(WeightEle)) {
			CustomListner.test.log(LogStatus.INFO, "Weight Value is whole Number.Weight Accept only Integer Value");
			
		}
		else {
			CustomListner.test.log(LogStatus.FAIL, "Weight Value is Not whole Number");
		}

	}

	@Test(groups = {
			"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-86 ||Capture personal Health details "
					+ "TEST-86 ||Verify Is there any weight change during the past one year over 5kgs?"
					+ "TEST-86 ||Increase/Decrease Reason. If YES selected for previous question"
					+ "TEST-86 ||Verify Mandatory Fields ")
	public void HealthDetailsPersonalWeightChangeWeb(String userName, String passWord, String leadID, String mobileNumber,
			String panNumber, String day, String month, String year,  String IFSCCode, String AccountNo,
			String PaymentMethod, String PreferredDrawDate, String SourceOfFunds,
			 String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue,  String removeMSG,
			String addressType, String pinCode, String addressOne, String addressTwo,
			String addressThree, String pinCode2, String language, String mobile, String telNo,  String Emaild, String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
			String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
			String Designation, String AnnualIncome, String 	ClickOnhealthDetailTab,String 	weight,String 	WaightChange,String NoOfChangeWaight,String Narcotics,String ReasonForNarcotic,
			String 	Alcohol,String 	TpeofAlcohol,String Quantity,String Frequency,String Tobacco,String TypeofTobacco,String CigrateQuantity,String CigrateNoOfYear,
			String 	Hazardous,String hazarSelectOption1,String 	hazaTimeofYear,String 	hazarSelectOption2,String 	Travell,String 	AbsentFromWork,
			String 	CurrentSymtoms,String 	DoctorDetails,String 	DateOfLastDay,String 	DateOfLastMonth,String 	DateOfLastYear,String 	DetailsOfHospitalization,String 	ClickonHospitalize,
			String 	ClickOnDisorder,String 	ClickOnSpouseHealth,String 	ClickOnOtherSymptoms,String 	ClickOnForFemaleOnly,String 	NoOfWeek,String 	ClickOnHaveYouSufferFrom,String 	ClickOnAilments,
			String 	DisplayAllAilment,String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

		new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month,
				year, IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName,
				nimiLastName, nomiday, nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType,
				pinCode, addressOne, addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus,
				fatherSpouseName, motherName, maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness,
				TypeOfOrganisation, Designation, AnnualIncome);

		healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
		healthdetail.EnterWeight(weight);
		TestUtil.scrollTillEndOfPage(driver);
	    Thread.sleep(2000);
		WebElement valueEle = driver.findElement(By.xpath("//button[@value='{\"optionId\":\"Q11A2\",\"text\":\"No\"}']"));
		String gettext=valueEle.getAttribute("aria-pressed");
		if (gettext.equalsIgnoreCase("true")) {
			TestUtil.verifybgColor(valueEle, driver);
			CustomListner.test.log(LogStatus.INFO, "Is there any weight change of over 5 kgs during the past one year?By Default Select Value As=====>NO");

		} else {
			CustomListner.test.log(LogStatus.FAIL, "By Default Value is Selected As=====>Yes");
		}
		
		healthdetail.selectWaightChange(WaightChange);
		healthdetail.EnterReasonForChangewaight("");
		healthdetail.ClickSaveContinueBtn();
		Thread.sleep(2000);
		WebElement getTextError1=driver.findElement(By.xpath("//p[text()='Please enter between 6 and 99']"));
		TestUtil.verifybgColor(getTextError1, driver);
		Assert.assertTrue(getTextError1.isDisplayed(),"Weight change Error Msg is not Display");
		CustomListner.test.log(LogStatus.INFO, "Successfully Display Enter No. of Kgs (gained/lost) Validation Error Message");
		healthdetail.EnterReasonForChangewaight(NoOfChangeWaight);
		healthdetail.ClickSaveContinueBtn();
		
	}

	@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-86 ||Capture personal Health details "
					+ "TEST-87 ||Validate Do you consume or have you ever consumed any narcotic substance? ")
	public void HealthDetailsLifeStyleNarcoticsWeb(String userName, String passWord, String leadID, String mobileNumber,
			String panNumber, String day, String month, String year,  String IFSCCode, String AccountNo,
			String PaymentMethod, String PreferredDrawDate, String SourceOfFunds,
			 String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue,  String removeMSG,
			String addressType, String pinCode, String addressOne, String addressTwo,
			String addressThree, String pinCode2, String language, String mobile, String telNo,  String Emaild, String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
			String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
			String Designation, String AnnualIncome, String 	ClickOnhealthDetailTab,String 	weight,String 	WaightChange,String NoOfChangeWaight,String Narcotics,String ReasonForNarcotic,
			String 	Alcohol,String 	TpeofAlcohol,String Quantity,String Frequency,String Tobacco,String TypeofTobacco,String CigrateQuantity,String CigrateNoOfYear,
			String 	Hazardous,String hazarSelectOption1,String 	hazaTimeofYear,String 	hazarSelectOption2,String 	Travell,String 	AbsentFromWork,
			String 	CurrentSymtoms,String 	DoctorDetails,String 	DateOfLastDay,String 	DateOfLastMonth,String 	DateOfLastYear,String 	DetailsOfHospitalization,String 	ClickonHospitalize,
			String 	ClickOnDisorder,String 	ClickOnSpouseHealth,String 	ClickOnOtherSymptoms,String 	ClickOnForFemaleOnly,String 	NoOfWeek,String 	ClickOnHaveYouSufferFrom,
			String 	ClickOnAilments,String 	DisplayAllAilment,String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos)
			throws InterruptedException {

		new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month,
				year, IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName,
				nimiLastName, nomiday, nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType,
				pinCode, addressOne, addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus,
				fatherSpouseName, motherName, maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness,
				TypeOfOrganisation, Designation, AnnualIncome);

		healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
		healthdetail.EnterWeight(weight);
		TestUtil.scrollTillEndOfPage(driver);
		Thread.sleep(2000);
		healthdetail.ClickSaveContinueBtn();
		Thread.sleep(3000);
		healthdetail.selectNarcotics(Narcotics);
		healthdetail.EnterReasonForNarcotics("");
		TestUtil.scrollTillEndOfPage(driver);
		Thread.sleep(2000);
		healthdetail.ClicLifeStyleSaveContinueBtn();
		WebElement getTextError1 = driver.findElement(By.xpath("//p[text()='Please Mention Details']"));
		TestUtil.verifybgColor(getTextError1, driver);
		Assert.assertTrue(getTextError1.isDisplayed(), "Norcotics textfiled Error Msg is not Display");
		CustomListner.test.log(LogStatus.INFO,"Successfully Display Do you consume or have you ever consumed any narcotic substance? Validation Error Message");
		healthdetail.EnterReasonForNarcotics(ReasonForNarcotic);
		TestUtil.scrollTillEndOfPage(driver);
		Thread.sleep(2000);
		healthdetail.ClicLifeStyleSaveContinueBtn();
	}

	@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-86 ||Capture personal Health details "
					+ "TEST-87 ||Validate  Do you consume cigarettes/bidis/cigars or used any other tobacco/nicotine products in any form?")
	public void VerifyHealthDetailsLifeStyleTobaccoNicotineWeb(String userName, String passWord, String leadID, String mobileNumber,
			String panNumber, String day, String month, String year,  String IFSCCode, String AccountNo,
			String PaymentMethod, String PreferredDrawDate, String SourceOfFunds,
			 String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
			String nomiyear, String genderValue, String relationshipValue, String shareValue,  String removeMSG,
			String addressType, String pinCode, String addressOne, String addressTwo,
			String addressThree, String pinCode2, String language, String mobile, String telNo,  String Emaild, String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
			String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
			String Designation, String AnnualIncome, String 	ClickOnhealthDetailTab,String 	weight,String 	WaightChange,String NoOfChangeWaight,String Narcotics,String ReasonForNarcotic,
			String 	Alcohol,String 	TpeofAlcohol,String Quantity,String Frequency,String Tobacco,String TypeofTobacco,String CigrateQuantity,String CigrateNoOfYear,
			String 	Hazardous,String hazarSelectOption1,String 	hazaTimeofYear,String 	hazarSelectOption2,String 	Travell,String 	AbsentFromWork,String 	CurrentSymtoms,String 	DoctorDetails,String 	DateOfLastDay,String 	DateOfLastMonth,String 	DateOfLastYear,String 	DetailsOfHospitalization,
			String 	ClickonHospitalize,String 	ClickOnDisorder,String 	ClickOnSpouseHealth,String 	ClickOnOtherSymptoms,String 	ClickOnForFemaleOnly,String 	NoOfWeek,String 	ClickOnHaveYouSufferFrom,
			String 	ClickOnAilments,String 	DisplayAllAilment,String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

		new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month,
				year, IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName,
				nimiLastName, nomiday, nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType,
				pinCode, addressOne, addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus,
				fatherSpouseName, motherName, maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness,
				TypeOfOrganisation, Designation, AnnualIncome);

		healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
		healthdetail.EnterWeight(weight);
		TestUtil.scrollTillEndOfPage(driver);
		Thread.sleep(2000);
		healthdetail.ClickSaveContinueBtn();
		Thread.sleep(2000);
		WebElement hazardousEle = driver.findElement(By.xpath("//div[text()='Hazardous Activities']"));
		TestUtil.scrollToElement(driver, hazardousEle);
		Thread.sleep(2000);
		healthdetail.selectTobacco(Tobacco);
		WebElement Durationele = driver.findElement(By.xpath("//div[text()='Last 12 M']"));
		Durationele.click();
		CustomListner.test.log(LogStatus.INFO, "Click on Duration of Month Button");
		WebElement tobaccoEle = driver.findElement(By.xpath("//span[text()='Tobacco']"));
		TestUtil.scrollToElement(driver, tobaccoEle);
		Thread.sleep(2000);
		healthdetail.TypeofTobacco(TypeofTobacco, CigrateQuantity, CigrateNoOfYear);
		TestUtil.scrollTillEndOfPage(driver);
		Thread.sleep(2000);
		healthdetail.ClicLifeStyleSaveContinueBtn();

}

@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-86 ||Capture personal Health details "
				+ "TEST-87 ||Validate Are you involved or do you intend to involve in any hazardous occupation or avocation? (for e.g. flying other than a fare paying passenger, diving, mountaineering, working at heights, "
				+ "underground or offshore, using explosives or any other dangerous activity"
				+ "TEST-87 ||Validate that on “Yes” for any of the above parameters, the required mandate is asked from the customer."
				+ "TEST-87 ||Validate that in case of “Yes” for any questions, the mandate is asked from the user"
				+ "TEST-87 ||Validate that the user is NOT allowed to proceed if question is Yes and the mandate is not completed with the required fields"
				+ "TEST-87 ||Validate details in mandate are asked and have the required validations as mentioned in the sheet"
				+ "TEST-87 ||Validate if user without entering  click on proceed ")
public void VerifyHealthDetailsLifeStyleHazardousWeb(String userName, String passWord, String leadID, String mobileNumber,
		String panNumber, String day, String month, String year,  String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds,
		 String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
		String nomiyear, String genderValue, String relationshipValue, String shareValue,  String removeMSG,
		String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo,  String Emaild, String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String 	ClickOnhealthDetailTab,String 	weight,String 	WaightChange,String NoOfChangeWaight,String Narcotics,String ReasonForNarcotic,
		String 	Alcohol,String 	TpeofAlcohol,String Quantity,String Frequency,String Tobacco,String TypeofTobacco,String CigrateQuantity,String CigrateNoOfYear,
		String 	Hazardous,String hazarSelectOption1,String 	hazaTimeofYear,String 	hazarSelectOption2,String 	Travell,String 	AbsentFromWork,String 	CurrentSymtoms,String 	DoctorDetails,String 	DateOfLastDay,String 	DateOfLastMonth,String 	DateOfLastYear,String 	DetailsOfHospitalization,
		String 	ClickonHospitalize,String 	ClickOnDisorder,String 	ClickOnSpouseHealth,String 	ClickOnOtherSymptoms,String 	ClickOnForFemaleOnly,String 	NoOfWeek,String 	ClickOnHaveYouSufferFrom,
		String 	ClickOnAilments,String 	DisplayAllAilment,String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos)
		throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month,
			year, IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName,
			nimiLastName, nomiday, nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType,
			pinCode, addressOne, addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus,
			fatherSpouseName, motherName, maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness,
			TypeOfOrganisation, Designation, AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	healthdetail.EnterWeight(weight);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickSaveContinueBtn();
	Thread.sleep(2000);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.selectHazardous(Hazardous);
	healthdetail.ClicLifeStyleSaveContinueBtn();
	WebElement Error1=driver.findElement(By.xpath("(//p[contains(text(),'Please Select a value')])[1]"));
	TestUtil.verifybgColor(Error1, driver);
	Assert.assertTrue(Error1.isDisplayed(), "Hazardous Select a Value1 Error Msg is not Display");
	CustomListner.test.log(LogStatus.INFO,"Successfully Display Hazardous Select a Value1 Validation Error Message");
	
	WebElement Error2=driver.findElement(By.xpath("//p[contains(text(),'Please Mention')]"));
	TestUtil.verifybgColor(Error2, driver);
	Assert.assertTrue(Error2.isDisplayed(), "Mention How many time a year Error Msg is not Display");
	CustomListner.test.log(LogStatus.INFO,"Successfully Display Mention How many time a year Validation Error Message");
	
	WebElement Error3=driver.findElement(By.xpath("(//p[contains(text(),'Please Select a value')])[2]"));
	TestUtil.verifybgColor(Error3, driver);
	Assert.assertTrue(Error3.isDisplayed(), "Hazardous Select a Value2 Error Msg is not Display");
	CustomListner.test.log(LogStatus.INFO,"Successfully Display Hazardous Select a Value2 Validation Error Message");
	Thread.sleep(2000);
	healthdetail.HazardousSelectOption1(hazarSelectOption1);
	healthdetail.EnterHazardousTimeOfYear(hazaTimeofYear);
	healthdetail.HazardousSelectOption2(hazarSelectOption2);
	healthdetail.ClicLifeStyleSaveContinueBtn();

}

@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-86 ||Capture personal Health details "
				+ "TEST-87 ||Validate that all parameters are by default set to “No”"
				+ "")
public void VerifyLifeStyleAllByDefaultAsNoWeb(String userName, String passWord, String leadID, String mobileNumber,
		String panNumber, String day, String month, String year,  String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds,
		 String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
		String nomiyear, String genderValue, String relationshipValue, String shareValue,  String removeMSG,
		String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo,  String Emaild, String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String 	ClickOnhealthDetailTab,String 	weight,String 	WaightChange,String NoOfChangeWaight,String Narcotics,String ReasonForNarcotic,
		String 	Alcohol,String 	TpeofAlcohol,String Quantity,String Frequency,String Tobacco,String TypeofTobacco,String CigrateQuantity,String CigrateNoOfYear,
		String 	Hazardous,String hazarSelectOption1,String 	hazaTimeofYear,String 	hazarSelectOption2,String 	Travell,String 	AbsentFromWork,String 	CurrentSymtoms,String 	DoctorDetails,String 	DateOfLastDay,String 	DateOfLastMonth,String 	DateOfLastYear,String 	DetailsOfHospitalization,
		String 	ClickonHospitalize,String 	ClickOnDisorder,String 	ClickOnSpouseHealth,String 	ClickOnOtherSymptoms,String 	ClickOnForFemaleOnly,String 	NoOfWeek,String 	ClickOnHaveYouSufferFrom,
		String 	ClickOnAilments,String 	DisplayAllAilment,String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos)
		throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month,
			year, IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName,
			nimiLastName, nomiday, nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType,
			pinCode, addressOne, addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus,
			fatherSpouseName, motherName, maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness,
			TypeOfOrganisation, Designation, AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	healthdetail.EnterWeight(weight);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickSaveContinueBtn();
	Thread.sleep(2000);
	WebElement valueEle1 = driver.findElement(By.xpath("//button[@value='{\"optionId\":\"Q13A2\",\"text\":\"No\"}']"));
	String gettext1=valueEle1.getAttribute("aria-pressed");
	if (gettext1.equalsIgnoreCase("true")) {
		TestUtil.verifybgColor(valueEle1, driver);
		Assert.assertTrue(valueEle1.isDisplayed(),"Narcotics Button  is not present");
		CustomListner.test.log(LogStatus.INFO, "By Default Narcotics  Value Selected As=====>NO");

	} else {
		CustomListner.test.log(LogStatus.INFO, "By Default Narcotics Value  Selected As=====>Yes");
	}
	WebElement valueEle2 = driver.findElement(By.xpath("//button[@value='{\"optionId\":\"Q14A2\",\"text\":\"No\"}']"));
	String gettext2=valueEle2.getAttribute("aria-pressed");
	if (gettext2.equalsIgnoreCase("true")) {
		TestUtil.verifybgColor(valueEle2, driver);
		Assert.assertTrue(valueEle2.isDisplayed(),"Alcohol Button  is not present");
		CustomListner.test.log(LogStatus.INFO, "By Default Alcohol Value Selected As=====>NO");

	} else {
		CustomListner.test.log(LogStatus.INFO, "By Default Alcohol Value  Selected As=====>Yes");
	}
	WebElement valueEle3 = driver.findElement(By.xpath("//button[@value='{\"optionId\":\"Q15A2\",\"text\":\"No\"}']"));
	String gettext3=valueEle3.getAttribute("aria-pressed");
	if (gettext3.equalsIgnoreCase("true")) {
		TestUtil.verifybgColor(valueEle3, driver);
		Assert.assertTrue(valueEle3.isDisplayed(),"Tobacco Button is not present");
		CustomListner.test.log(LogStatus.INFO, "By Default Tobacco Value Selected As=====>NO");

	} else {
		CustomListner.test.log(LogStatus.INFO, "By Default Tobacco Value  Selected As=====>Yes");
	}
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	WebElement valueEle4 = driver.findElement(By.xpath("//button[@value='{\"optionId\":\"Q16A2\",\"text\":\"No\"}']"));
	String gettext4=valueEle4.getAttribute("aria-pressed");
	if (gettext4.equalsIgnoreCase("true")) {
		TestUtil.verifybgColor(valueEle4, driver);
		Assert.assertTrue(valueEle4.isDisplayed(),"Hazardous Button is not present");
		CustomListner.test.log(LogStatus.INFO, "By Default Hazardous Value Selected As=====>NO");

	} else {
		CustomListner.test.log(LogStatus.INFO, "By Default Hazardous Value Selected As=====>Yes");
	}
	WebElement valueEle5 = driver.findElement(By.xpath("//button[@value='{\"optionId\":\"Q17A2\",\"text\":\"No\"}']"));
	String gettext5=valueEle5.getAttribute("aria-pressed");
	if (gettext5.equalsIgnoreCase("true")) {
		TestUtil.verifybgColor(valueEle5, driver);
		Assert.assertTrue(valueEle5.isDisplayed(),"Travel Button is not present");
		CustomListner.test.log(LogStatus.INFO, "By Default Travel Value Selected As=====>NO");

	} else {
		CustomListner.test.log(LogStatus.INFO, "By Default Travel Value  Selected As=====>Yes");
	}

}

@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-86 ||Capture personal Health details "
				+ " ||User should be able to see the questions \r\n"
				+ "1. Narcotics\r\n"
				+ "2. Alcohol consumption\r\n"
				+ "3. Tobacco / Nicotine\r\n"
				+ "4. Hazardous Activities\r\n"
				+ "5. Travel")
public void VerifyLifeStylAllTextPresentWeb(String userName, String passWord, String leadID, String mobileNumber,
		String panNumber, String day, String month, String year,  String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds,
		 String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
		String nomiyear, String genderValue, String relationshipValue, String shareValue,  String removeMSG,
		String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo,  String Emaild, String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String 	ClickOnhealthDetailTab,String 	weight,String 	WaightChange,String NoOfChangeWaight,String Narcotics,String ReasonForNarcotic,
		String 	Alcohol,String 	TpeofAlcohol,String Quantity,String Frequency,String Tobacco,String TypeofTobacco,String CigrateQuantity,String CigrateNoOfYear,
		String 	Hazardous,String hazarSelectOption1,String 	hazaTimeofYear,String 	hazarSelectOption2,String 	Travell,String 	AbsentFromWork,String 	CurrentSymtoms,String 	DoctorDetails,String 	DateOfLastDay,String 	DateOfLastMonth,String 	DateOfLastYear,String 	DetailsOfHospitalization,
		String 	ClickonHospitalize,String 	ClickOnDisorder,String 	ClickOnSpouseHealth,String 	ClickOnOtherSymptoms,String 	ClickOnForFemaleOnly,String 	NoOfWeek,String 	ClickOnHaveYouSufferFrom,
		String 	ClickOnAilments,String 	DisplayAllAilment,String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos)
		throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month,
			year, IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName,
			nimiLastName, nomiday, nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType,
			pinCode, addressOne, addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus,
			fatherSpouseName, motherName, maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness,
			TypeOfOrganisation, Designation, AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	healthdetail.EnterWeight(weight);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickSaveContinueBtn();
	Thread.sleep(2000);

	WebElement textEle1 = driver.findElement(By.xpath("//div[contains(text(),'Narcotics')]"));
	String val1 = textEle1.getText();
	if (val1.equalsIgnoreCase("Narcotics")) {
		TestUtil.verifybgColor(textEle1, driver);
		Assert.assertTrue(textEle1.isDisplayed(), "Narcotics  Text is not present");
		CustomListner.test.log(LogStatus.INFO, "Narcotics  Text is Display");

	} else {
		CustomListner.test.log(LogStatus.INFO, "Narcotics  Text is Not Display");
	}
	WebElement textEle2 = driver.findElement(By.xpath("//div[contains(text(),'Alcohol Consumption')]"));
	String val2 = textEle2.getText();
	if (val2.equalsIgnoreCase("Alcohol Consumption")) {
		TestUtil.verifybgColor(textEle2, driver);
		Assert.assertTrue(textEle2.isDisplayed(), "Alcohol Consumption  Text is not present");
		CustomListner.test.log(LogStatus.INFO, "Alcohol Consumption Text  is Display");

	} else {
		CustomListner.test.log(LogStatus.INFO, "Alcohol Consumption Text is Not Display");
	}
	WebElement textEle3 = driver.findElement(By.xpath("//div[contains(text(),'Tobacco / Nicotine ')]"));
	String val3 = textEle3.getText();
	if (val3.equalsIgnoreCase("Tobacco / Nicotine")) {
		TestUtil.verifybgColor(textEle3, driver);
		Assert.assertTrue(textEle3.isDisplayed(), "Tobacco / Nicotine   Text is not present");
		CustomListner.test.log(LogStatus.INFO, "Tobacco / Nicotine  Text  is Display");

	} else {
		CustomListner.test.log(LogStatus.INFO, "Tobacco / Nicotine Text is Not Display");
	}
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);

	WebElement textEle4 = driver.findElement(By.xpath("//div[contains(text(),'Hazardous Activities')]"));
	String val4 = textEle4.getText();
	if (val4.equalsIgnoreCase("Hazardous Activities")) {
		TestUtil.verifybgColor(textEle4, driver);
		Assert.assertTrue(textEle4.isDisplayed(), "Hazardous Activities  Text is not present");
		CustomListner.test.log(LogStatus.INFO, "Hazardous Activities  Text  is Display");

	} else {
		CustomListner.test.log(LogStatus.INFO, "Hazardous Activities Text is Not Display");
	}
	WebElement textEle5 = driver.findElement(By.xpath("//div[contains(text(),'Travel')]"));
	String val5 = textEle5.getText();
	if (val5.equalsIgnoreCase("Travel")) {
		TestUtil.verifybgColor(textEle5, driver);
		Assert.assertTrue(textEle5.isDisplayed(), "Travel Text is not present");
		CustomListner.test.log(LogStatus.INFO, "Travel Text  is Display");

	} else {
		CustomListner.test.log(LogStatus.INFO, "Travel Text is Not Display");
	}
	

}

@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-86 ||Capture personal Health details "
				+ " ||Verify , User gets  9 followup questions when \r\n"
				+ "Travel is selected as Yes")
public void VerifyLifeStyleTravellAllTextPresentWeb(String userName, String passWord, String leadID, String mobileNumber,
		String panNumber, String day, String month, String year,  String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds,
		 String nomiFirstName, String nimiLastName, String nomiday, String nomimonth,
		String nomiyear, String genderValue, String relationshipValue, String shareValue,  String removeMSG,
		String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo,  String Emaild, String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab,String 	weight,String 	WaightChange,String NoOfChangeWaight,String Narcotics,String ReasonForNarcotic,
		String 	Alcohol,String 	TpeofAlcohol,String Quantity,String Frequency,String Tobacco,String TypeofTobacco,String CigrateQuantity,String CigrateNoOfYear,
		String 	Hazardous,String hazarSelectOption1,String 	hazaTimeofYear,String 	hazarSelectOption2,String 	Travell,String 	AbsentFromWork,String 	CurrentSymtoms,String 	DoctorDetails,String 	DateOfLastDay,String 	DateOfLastMonth,String 	DateOfLastYear,String 	DetailsOfHospitalization,
		String 	ClickonHospitalize,String 	ClickOnDisorder,String 	ClickOnSpouseHealth,String 	ClickOnOtherSymptoms,String 	ClickOnForFemaleOnly,String 	NoOfWeek,String 	ClickOnHaveYouSufferFrom,
		String 	ClickOnAilments,String 	DisplayAllAilment,String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month,
			year, IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName,
			nimiLastName, nomiday, nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType,
			pinCode, addressOne, addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus,
			fatherSpouseName, motherName, maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness,
			TypeOfOrganisation, Designation, AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	healthdetail.EnterWeight(weight);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickSaveContinueBtn();
	Thread.sleep(2000);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.selectTravell(Travell);
	Thread.sleep(2000);
	WebElement textEle1 = driver.findElement(By.xpath("//div[contains(text(),'1. Main Reason for travelling or Residing overseas?')]"));
	String val1 = textEle1.getText();
	if (val1.equalsIgnoreCase("1. Main Reason for travelling or Residing overseas?")) {
		TestUtil.verifybgColor(textEle1, driver);
		Assert.assertTrue(textEle1.isDisplayed(), "1. Main Reason for travelling or Residing overseas?  Text is not present");
		CustomListner.test.log(LogStatus.INFO, "1. Main Reason for travelling or Residing overseas?  Text is Display");

	} else {
		CustomListner.test.log(LogStatus.INFO, "1. Main Reason for travelling or Residing overseas?  Text is Not Display");
	}
	WebElement textEle2 = driver.findElement(By.xpath("//div[contains(text(),'2. Details of travel plan for next 12 months')]"));
	String val2 = textEle2.getText();
	if (val2.equalsIgnoreCase("2. Details of travel plan for next 12 months")) {
		TestUtil.verifybgColor(textEle2, driver);
		Assert.assertTrue(textEle2.isDisplayed(), "2. Details of travel plan for next 12 months Text is not present");
		CustomListner.test.log(LogStatus.INFO, "2. Details of travel plan for next 12 months Text  is Display");

	} else {
		CustomListner.test.log(LogStatus.INFO, "2. Details of travel plan for next 12 months Text is Not Display");
	}
	
	WebElement textEle3 = driver.findElement(By.xpath("//div[contains(text(),'3. Please provide details of travel that you have taken over the last 12 months')]"));
	TestUtil.scrollToElement(driver,textEle3);
	Thread.sleep(2000);
	String val3 = textEle3.getText();
	if (val3.equalsIgnoreCase("3. Please provide details of travel that you have taken over the last 12 months")) {
		TestUtil.verifybgColor(textEle3, driver);
		Assert.assertTrue(textEle3.isDisplayed(), "3. Please provide details of travel that you have taken over the last 12 months Text is not present");
		CustomListner.test.log(LogStatus.INFO, "3. Please provide details of travel that you have taken over the last 12 months Text  is Display");

	} else {
		CustomListner.test.log(LogStatus.INFO, "3. Please provide details of travel that you have taken over the last 12 months Text is Not Display");
	}
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);

	WebElement textEle4 = driver.findElement(By.xpath("//div[contains(text(),'5. Do you have any assets or real property owned or controlled by you in any of the country other than India')]"));
	String val4 = textEle4.getText();
	if (val4.equalsIgnoreCase("5. Do you have any assets or real property owned or controlled by you in any of the country other than India")) {
		TestUtil.verifybgColor(textEle4, driver);
		Assert.assertTrue(textEle4.isDisplayed(), "5. Do you have any assets or real property owned or controlled by you in any of the country other than India Text is not present");
		CustomListner.test.log(LogStatus.INFO, "5. Do you have any assets or real property owned or controlled by you in any of the country other than India  Text  is Display");

	} else {
		CustomListner.test.log(LogStatus.INFO, "5. Do you have any assets or real property owned or controlled by you in any of the country other than India Text is Not Display");
	}
	WebElement textEle5 = driver.findElement(By.xpath("//div[contains(text(),'6. Do you plan to reside in any country for longer than 21 days')]"));
	String val5 = textEle5.getText();
	if (val5.equalsIgnoreCase("6. Do you plan to reside in any country for longer than 21 days")) {
		TestUtil.verifybgColor(textEle5, driver);
		Assert.assertTrue(textEle5.isDisplayed(), "6. Do you plan to reside in any country for longer than 21 days Text is not present");
		CustomListner.test.log(LogStatus.INFO, "6. Do you plan to reside in any country for longer than 21 days Text is Display");

	} else {
		CustomListner.test.log(LogStatus.INFO, "6. Do you plan to reside in any country for longer than 21 days Text is Not Display");
	}
	WebElement textEle6 = driver.findElement(By.xpath("//div[contains(text(),'7. Is your travel for business purposes')]"));
	String val6 = textEle6.getText();
	if (val6.equalsIgnoreCase("7. Is your travel for business purposes")) {
		TestUtil.verifybgColor(textEle6, driver);
		Assert.assertTrue(textEle5.isDisplayed(), "7. Is your travel for business purposes Text is not present");
		CustomListner.test.log(LogStatus.INFO, "7. Is your travel for business purposes Text is Display");

	} else {
		CustomListner.test.log(LogStatus.INFO, "7. Is your travel for business purposes Text is Not Display");
	}
	WebElement textEle7 = driver.findElement(By.xpath("//div[contains(text(),'8. Are you engaged under the terms of a contract or agreement?')]"));
	String val7 = textEle7.getText();
	if (val7.equalsIgnoreCase("8. Are you engaged under the terms of a contract or agreement?")) {
		TestUtil.verifybgColor(textEle7, driver);
		Assert.assertTrue(textEle7.isDisplayed(), "8. Are you engaged under the terms of a contract or agreement? Text is not present");
		CustomListner.test.log(LogStatus.INFO, "8. Are you engaged under the terms of a contract or agreement? Text is Display");

	} else {
		CustomListner.test.log(LogStatus.INFO, "8. Are you engaged under the terms of a contract or agreement? Text is Not Display");
	}
	WebElement textEle8 = driver.findElement(By.xpath("//div[contains(text(),'9. Additional information')]"));
	String val8 = textEle8.getText();
	if (val8.equalsIgnoreCase("9. Additional information")) {
		TestUtil.verifybgColor(textEle8, driver);
		Assert.assertTrue(textEle8.isDisplayed(), "9. Additional information Text is not present");
		CustomListner.test.log(LogStatus.INFO, "9. Additional information Text is Display");

	} else {
		CustomListner.test.log(LogStatus.INFO, "9. Additional information Text is Not Display");
	}

}

@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-86 ||Capture personal Health details "
				+ "TEST-90||User selects Medical history Tab"
				+ "TEST-90||User able to see questionare under \"Absent from Work\" with YES/NO options"
				+ "TEST-90||User able to see default value is selected as NO option."
				+ "TEST-90||User able to see the following fields \r\n"
				+ "1.Current Symptoms \r\n"
				+ "2.Doctor’s Detail \r\n"
				+ "3.Details of Hospitalization \r\n"
				+ "4.Date of Last Consultation \r\n"
				+ "5.Date of Diagnosis"
				+ "TEST-90||User should validate only Numeric allowed\r\n"
				+ "1.Date of Last Consultation\r\n"
				+ "2.Date of Diagnosis\r\n"
				+ "TEST-90||User should Click on 'Save' button")
public void VerifyMedicalHistoryAbsentFromWorkWeb(String userName, String passWord, String leadID, String mobileNumber,
		String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork,String 	CurrentSymtoms,String 	DoctorDetails,String 	DateOfLastDay,String 	DateOfLastMonth,String 	DateOfLastYear,String 	DetailsOfHospitalization,
		String 	ClickonHospitalize,String 	ClickOnDisorder,String 	ClickOnSpouseHealth,String 	ClickOnOtherSymptoms,String 	ClickOnForFemaleOnly,String 	NoOfWeek,String 	ClickOnHaveYouSufferFrom,
		String 	ClickOnAilments,String 	DisplayAllAilment,String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(2000);
	WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@name,'8080')])[2]"));
	String gettext1 = valueEle1.getAttribute("aria-pressed");
	if (gettext1.equalsIgnoreCase("true")) {
		TestUtil.verifybgColor(valueEle1, driver);
		Assert.assertTrue(valueEle1.isDisplayed(), "Absent from work Button is not present");
		CustomListner.test.log(LogStatus.INFO, "By Default Absent from work Value Selected As=====>NO");

	} else {
		CustomListner.test.log(LogStatus.FAIL, "By Default Absent from work Value  Selected As=====>Yes");
	}
	healthdetail.ClickonAbsentfromWork(AbsentFromWork);
	healthdetail.VerifyAbsentfromWork();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClicMedicalHistorySaveContinueBtn();
	TestUtil.scrollToTopOfthePage(driver);
	Thread.sleep(2000);
	healthdetail.VerifyAbsentfromWorkErrorMSG();
    TestUtil.scrollToTopOfthePage(driver);
 	Thread.sleep(2000);
	healthdetail.EnterAbsentfromWorkCurrentSymptoms(CurrentSymtoms);
	healthdetail.EnterAbsentfromWorkDoctorDetails(DoctorDetails);
	healthdetail.EnterAbsentfromWorkDateOfLastConsult(DateOfLastDay,DateOfLastMonth,DateOfLastYear);
	healthdetail.EnterAbsentfromWorkDateOfDiagnosis(DateOfLastDay,DateOfLastMonth,DateOfLastYear);
	healthdetail.EnterAbsentfromWorkDetailsofHospitalization(DetailsOfHospitalization);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClicMedicalHistorySaveContinueBtn();
	

}
//*******************************************done****************************************
@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-90||User able to see questionare under \\\"Hospitalization\\\" with YES/NO options"
				+ "TEST-90||User able to see the following fields \r\n"
				+ "1.Current Symptoms \r\n"
				+ "2.Doctor’s Detail \r\n"
				+ "3.Details of Hospitalization \r\n"
				+ "4.Date of Last Consultation \r\n"
				+ "5.Date of Diagnosis")
public void VerifyMedicalHistoryHospitalizationWeb(String userName, String passWord, String leadID, String mobileNumber,
		String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,String 	ClickonHospitalize,String 	ClickOnDisorder,
		String 	ClickOnSpouseHealth,String 	ClickOnOtherSymptoms,String 	ClickOnForFemaleOnly,String 	NoOfWeek,String 	ClickOnHaveYouSufferFrom,
		String 	ClickOnAilments,String 	DisplayAllAilment,String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,
		String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos)throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(2000);
	healthdetail.VerifyHosptalization();
	healthdetail.ClickonHospitalization(ClickonHospitalize);
	Thread.sleep(2000);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClicMedicalHistorySaveContinueBtn();
	healthdetail.VerifyHospitalizeErrorMSG();
    TestUtil.scrollToTopOfthePage(driver);
 	Thread.sleep(2000);
 	healthdetail.EnterHospitalizationCurrentSymptoms(CurrentSymtoms);
 	healthdetail.EnterHospitalizationDoctorDetail(DoctorDetails);
 	healthdetail.EnterHospitalizationDetailOfHospitalize(DetailsOfHospitalization);
 	healthdetail.EnterHospitalizekDateOfLastConsult(DateOfLastDay,DateOfLastMonth,DateOfLastYear);
 	healthdetail.EnterHospitalizeDateOfDiagnosis(DateOfLastDay,DateOfLastMonth,DateOfLastYear);
 	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClicMedicalHistorySaveContinueBtn();
	
	
	

}

@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-90||User able to see questionare under \"Disorder\" with YES/NO options"
				+ "TEST-90||Verify All Mandatory Field")
public void VerifyMedicalHistoryDisorderWeb(String userName, String passWord, String leadID, String mobileNumber,
		String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize,String ClickOnDisorder,String 	ClickOnSpouseHealth,String 	ClickOnOtherSymptoms,String 	ClickOnForFemaleOnly,String 	NoOfWeek,String 	ClickOnHaveYouSufferFrom,
		String 	ClickOnAilments,String 	DisplayAllAilment,String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(2000);
	WebElement SpouseEle = driver.findElement(By.xpath("//div[contains(text(),'Spouse Health')]"));
	TestUtil.scrollToElement(driver,SpouseEle);
	Thread.sleep(2000);
	healthdetail.VerifyDisorder();
	healthdetail.ClickonDisorder(ClickOnDisorder);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClicMedicalHistorySaveContinueBtn();
	Thread.sleep(2000);
	healthdetail.VerifyDisorderErrorMSG();
	healthdetail.EnterDisorderCurrentSymptoms(CurrentSymtoms);
	healthdetail.EnterDisorderDoctorDetail(DoctorDetails);
	healthdetail.EnterDisorderDateOfLastConsult(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.EnterDisorderDateOfDiagnosis(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.EnterDisorderDetailOfHospitalize(DetailsOfHospitalization);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClicMedicalHistorySaveContinueBtn();

}

@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-90||User able to see questionare under \"Spouse Health\" with YES/NO options"
				+ "TEST-90||Verify All Mandatory Field")
public void VerifyMedicalSpouseHealthWeb(String userName, String passWord, String leadID, String mobileNumber,
		String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder,String 	ClickOnSpouseHealth,String 	ClickOnOtherSymptoms,String 	ClickOnForFemaleOnly,String 	NoOfWeek,String 	ClickOnHaveYouSufferFrom,
		String 	ClickOnAilments,String 	DisplayAllAilment,String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(2000);
	WebElement textEle1 = driver.findElement(By.xpath("//div[contains(text(),'Other symptoms')]"));
	TestUtil.scrollToElement(driver,textEle1);
	Thread.sleep(2000);
	healthdetail.VerifySpouseHealth();
	healthdetail.ClickonSpouseHealth(ClickOnSpouseHealth);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClicMedicalHistorySaveContinueBtn();
	healthdetail.VerifySpouseHealthErrorMSG();
	healthdetail.EnterSpouseHealthCurrentSymptoms(CurrentSymtoms);
	healthdetail.EnterSpouseHealthDoctorDetail(DoctorDetails);
	healthdetail.EnterSpousehealthDateOfLastConsult(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.EnterSpouseHealthDateOfDiagnosis(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.EnterSpousehealthDetailOfHospitalize(DetailsOfHospitalization);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClicMedicalHistorySaveContinueBtn();

}

@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-90||User able to see questionare under \"Other symptoms\" with YES/NO options"
				+ "TEST-90||Verify All Mandatory Field")
public void VerifyMedicalOtherSymptomsWeb(String userName, String passWord, String leadID, String mobileNumber,
		String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder,String 	ClickOnSpouseHealth,String 	ClickOnOtherSymptoms,String 	ClickOnForFemaleOnly,String 	NoOfWeek,String 	ClickOnHaveYouSufferFrom,
		String 	ClickOnAilments,String 	DisplayAllAilment,String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(2000);
	WebElement textEle1 = driver.findElement(By.xpath("//div[contains(text(),'For Females lives only')]"));
	TestUtil.scrollToElement(driver,textEle1);
	Thread.sleep(2000);
	healthdetail.VerifyOtherSymptoms();
	healthdetail.ClickonOthersymptoms(ClickOnOtherSymptoms);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClicMedicalHistorySaveContinueBtn();
	healthdetail.VerifyOtherSymptomsErrorMSG();
	healthdetail.EnterOthersymptomsCurrentSymptoms(CurrentSymtoms);
	healthdetail.EnterOthersymptomsDoctorDetail(DoctorDetails);
	healthdetail.EnterOtherSymptomsDateOfLastConsult(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.EnterSOtherSymptomsDateOfDiagnosis(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.EnterOtherSymptomsDetailOfHospitalize(DetailsOfHospitalization);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClicMedicalHistorySaveContinueBtn();

}

@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-90||User should aable to see the following option >>For Female lives only"
				+ "TEST-90||User able to see default value is selected as NO option."
				+ "TEST-90||User able to see the following fields and enter details\r\n"
				+ "1.No. of weeks\r\n"
				+ "2.Current Symptoms\r\n"
				+ "3.Doctor’s Detail\r\n"
				+ "4.Details of Hospitalization\r\n"
				+ "5.Date of Last Consultation\r\n"
				+ "6.Date of Diagnosis")
public void VerifyMedicalForFemaleLiveOnlyWeb(String userName, String passWord, String leadID, String mobileNumber,
		String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,String 	ClickOnForFemaleOnly,String 	NoOfWeek,String 	ClickOnHaveYouSufferFrom,
		String 	ClickOnAilments,String 	DisplayAllAilment,String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos)
		throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(2000);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.VerifyForFemaleLiveOnly();
	healthdetail.ClickonOFemaleLivesOnly(ClickOnForFemaleOnly);
	Thread.sleep(2000);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClicMedicalHistorySaveContinueBtn();
	healthdetail.VerifyForFemaleLivesonlyErrorMSG();
	healthdetail.EnterforFemaleLivesonlyNoOfWeeks(NoOfWeek);
	healthdetail.EnterFemaleLivesOnlyCurrentSymptoms(CurrentSymtoms);
	healthdetail.EnterForFemaleLivesOnlyDoctorDetails(DoctorDetails);
	healthdetail.EnterForFemaleLivesOnlyDateOfLastConsult(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.EnterForFemaleLivesOnlyDateOfDiagnosis(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.EnterForFemaleLivesOnlyDetailOfHospitalize(DetailsOfHospitalization);
	healthdetail.ClicMedicalHistorySaveContinueBtn();

}

@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-90||7.b.Have you suffered from or do you have any gynaecological problems or illness related to uterus/ovaries or breasts?\r\n"
				+ "Verify that if YES is selected verify the Following fields are displaying\r\n"
				+ "1.Current Symptoms\r\n"
				+ "2.Doctor’s Detail\r\n"
				+ "3.Details of Hospitalization\r\n"
				+ "4.Date of Last Consultation\r\n"
				+ "5.Date of Diagnosis"
				+ "TEST-90||User able to see the Error Message 'Please enter current symptom'"
				+ "TEST-90||User able to see the Error Message 'Please enter doctor details'"
				+ "TEST-90||User able to see the Error Message 'Please enter date of diagnosis'"
				+ "TEST-90||User able to see the Error Message 'Please enter date of last consultation'"
				+ "TEST-90||User able to see the Error Message 'Please enter date of last hospitalization'")
public void VerifyMedicalHaveyousufferedFromWeb(String userName, String passWord, String leadID, String mobileNumber,
		String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,
		String ClickOnForFemaleOnly, String NoOfWeek, String ClickOnHaveYouSufferFrom,String 	ClickOnAilments,String 	DisplayAllAilment,
		String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(2000);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickonHaveYouSufferedFrom(ClickOnHaveYouSufferFrom);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClicMedicalHistorySaveContinueBtn();
	healthdetail.VerifyHaveYouSufferdFromErrorMSG();
	healthdetail.EnterHaveYouSufferedFromCurrentSymptoms(CurrentSymtoms);
	healthdetail.EnterHaveYouSufferedFromDoctorDetails(DoctorDetails);
	healthdetail.EnterHaveYouSufferdFromDateOfLastConsult(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.EnterHaveYouSufferdFromDateOfDiagnosis(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.EnterHaveYouSufferedFromDetailOfHospitalize(DetailsOfHospitalization);
	healthdetail.ClicMedicalHistorySaveContinueBtn();

}

@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-90||Validate the following error message is Displaying if user selected any one of the disease, and 'Date of diagnosis' is given after today \r\n"
				+ "\r\n"
				+ "Error Message 'Date chosen has to be today and earlier. Cannot be tomorrow and later'\r\n"
				+ "\r\n"
				+ "Vallidate this funtionality for all 'Date of diagnosis' field where ever it displays in this page"
				+ "TEST-90||Validate the following error message is Displaying if user selected any one of the disease, and 'date of last consultation' is given after today \r\n"
				+ "\r\n"
				+ "Error Message 'Date chosen has to be today and earlier. Cannot be tomorrow and later'\r\n"
				+ "\r\n"
				+ "Vallidate this funtionality for all 'date of last consultation' field where ever it displays in this page")
public void VerifyMedicalHaveyousufferedFromDateValidationWeb(String userName, String passWord, String leadID, String mobileNumber,
		String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,
		String ClickOnForFemaleOnly, String NoOfWeek, String ClickOnHaveYouSufferFrom,String 	ClickOnAilments,String 	DisplayAllAilment,
		String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(2000);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickonHaveYouSufferedFrom(ClickOnHaveYouSufferFrom);
	healthdetail.EnterHaveYouSufferedFromCurrentSymptoms(CurrentSymtoms);
	healthdetail.EnterHaveYouSufferedFromDoctorDetails(DoctorDetails);
	healthdetail.EnterHaveYouSufferdFromDateOfLastConsult(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.EnterHaveYouSufferdFromDateOfDiagnosis(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.EnterHaveYouSufferedFromDetailOfHospitalize(DetailsOfHospitalization);
	healthdetail.ClicMedicalHistorySaveContinueBtn();
	healthdetail.DateValidationAlertPopUpDateofLastConsult();
	healthdetail.DateValidationAlertPopUpOKBTN();
	healthdetail.EnterHaveYouSufferdFromDateOfLastConsult("14","08","2022");
	healthdetail.DateValidationAlertPopUpDateofDiagnos();
	healthdetail.DateValidationAlertPopUpOKBTN();
	
}

@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-90 ||Verify Ailment 1 i.e. Heart Issues and dependent sub ailment / questionnaire"
		+ "Ailment 1 should be listed as \"Heart Issues\" and when check the Heart  issues,  below follow up questions should be visible. \r\n"
		+ "* Chest Pain \r\n"
		+ "*  Low or High Blood Pressure \r\n"
		+ "*  High Cholesterol \r\n"
		+ "* Heart Attack  \r\n"
		+ "* Heart Murmur  \r\n"
		+ "* Heart Disorders\r\n"
		+ "A Checkbox corresponding to every sub ailment should be visible"
		+ "TEST-90 ||User able to get another tab Chest Pain Mandate"
		+ "TEST-90 ||Verify first question as \"Please state the diagnosis? and its options\""
		+ "TEST-90 ||No chips would be preselected"
		+ "TEST-90 ||Verify Provide Details field when \"Others\" chip is selected"
		+ "TEST-90 ||Verify character limitation of \"Provide Details\" text field when others is selected"
		+ "TEST-90 ||Verify user should not be able to proceed without filling \"Provide details\" text field  when others is selected"
		+ "TEST-90 ||Verify second question as \"When did you first experience symptoms? \" "
		+ "TEST-90 ||Verify third question as \"Have you had any recurrence of symptoms?\" "
		+ "TEST-90 ||Verify error message When third question as \"Have you had any recurrence of symptoms? \" text field left blank and proceed."
		+ "TEST-90 ||Verify fourth question \"Please provide details of any tests or investigations that you have undergone, e.g. blood tests, chest x-rays, coronary angiogram, echocardiograph, electrocardiograph, endoscopy, exercise stress test etc. \" No radio button by default selected ."
		+ "TEST-90 ||\"YES\" button selected by user. When fourth question \"Please provide details of any tests or investigations that you have undergone, e.g. blood tests, chest x-rays, coronary angiogram, echocardiograph, electrocardiograph, endoscopy, exercise stress test etc. \".Below dependant question should be visible.\r\n"
		+ "* Test or Investigation -Text\r\n"
		+ "* Date -date\r\n"
		+ "* Result - Text"
		+ "TEST-90 ||Verify error message question field left and blank proceed. When \"YES\" radio button selected by user. And fourth question \"Please provide details of any tests or investigations that you have undergone, e.g. blood tests, chest x-rays, coronary angiogram, echocardiograph, electrocardiograph, endoscopy, exercise stress etc.\" and its question should be visible."
		+ "TEST-90 ||Verify fifth question \"Please provide details of any medication taken for this condition\" and \"No\" radio button by default selected ."
		+ "TEST-90 ||Verify fifth question and its dependent mandatory questions when \"YES\" radio button selected by user."
		+ "TEST-90 ||Verify error messages when fields for dependant questions of Fifth question left and blank proceed. "
		+ "TEST-90 ||Verify the sixth question \"Have you ever been admitted to hospital or had outpatient treatment for this condition\" "
		+ "TEST-90 ||Verify Sixth question and its dependent mandatory questions when \"YES\" radio button selected by user."
		+ "TEST-90 ||Verify error messages when fields for dependant questions of Sixth question left and blank proceed. "
		+ "TEST-90 ||Verify the seventh question \"Have any further treatment or follow-up been discussed, recommended or otherwise contemplated?\" No radio button by default selected."
		+ "TEST-90 ||Verify error message When seventh question as \"Have any further treatment or follow-up been discussed, recommended or otherwise contemplated?\" text field left blank and proceed."
		+ "TEST-90 ||Verify user able to click on save button"
		+ "TEST-90 ||Verify user navigate to next page and come back to previous page  "
		+ "TEST-90 ||Verify user able to navigate back to Chste pain mandate to previous page, Come back to Chest pain mandate page.")
public void VerifyMedicalAilmentsQuestion1ChestPainWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,
		String ClickOnForFemaleOnly, String NoOfWeek, String ClickOnHaveYouSufferFrom,String 	ClickOnAilments,String 	DisplayAllAilment,
		String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(2000);
	WebElement CurrentsysEle = driver.findElement(By.xpath("//div[contains(text(),'Spouse Health')]"));
	TestUtil.scrollToElement(driver, CurrentsysEle);
	Thread.sleep(2000);
	healthdetail.ClickonAilment(ClickOnAilments);
	Thread.sleep(2000);
	healthdetail.ClickonAilmentHeartIssueCheckbox();
	Thread.sleep(2000);
	String[] ListOfValueTextfieldupdate = DisplayAllAilment.split(",");
	for (int i = 0; i <= ListOfValueTextfieldupdate.length - 1; i++) {
		healthdetail.displayAllAilmentsQuestion1(ListOfValueTextfieldupdate[i]);
	}
	healthdetail.ClickOnChestPain();
	TestUtil.scrollTillTOPOfPage(driver);
	Thread.sleep(2000);
	String[] StateTheDiagnosupdate = StateTheDiagnos.split(",");
	for (int i = 0; i <= StateTheDiagnosupdate.length - 1; i++) {
		healthdetail.displayAllAilmentsQuestion1StateTheDiagnos(StateTheDiagnosupdate[i]);
	}
	healthdetail.ClickOnChestPainOther();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	TestUtil.scrollTillTOPOfPage(driver);
	Thread.sleep(2000);
	healthdetail.VerifyMandatoryFieldMSG();
	healthdetail.EnterChestPainOther("testttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt");
	Thread.sleep(1000);
	//healthdetail.VerifyOtherFieldMSG();
	healthdetail.ClearAndEnterChestPainOther(ChestPainOther);
	WebElement CurrentsysEle1 = driver.findElement(By.xpath("//div[contains(text(),'5. Please provide details of any medication taken for this condition')]"));
	TestUtil.scrollToElement(driver, CurrentsysEle1);
	Thread.sleep(2000);
	healthdetail.EnterWhenDidYouFirstExperianceSymptoms(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.ClickOnHaveYouHadAnyReccurenceSymptoms();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	healthdetail.VerifyHaveYouHadAnyReccurenceFieldMSG();
	healthdetail.EnterHaveYouHadReccuerenceSymptoms(HadReccurence);
	healthdetail.VerifyByDefaultValue1();
	healthdetail.ClickOnPleaseProvideDetailsOfTest();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	healthdetail.VerifyTestOfInvestigationErrorMSG();
	healthdetail.EnterTestOfInvestigation(HadReccurence);
	healthdetail.EnterDateOfInvestigation(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.EnterRersult(HadReccurence);
	healthdetail.VerifyByDefaultValue2();
	healthdetail.ClickOnPleaseProvideDetailOfMedicine();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	healthdetail.VerifyProvideDetailOfMedicineErrorMSG();
	healthdetail.EnterMedication(HadReccurence);
	healthdetail.EnterDose(HadReccurence);
	healthdetail.EnterFrequency(HadReccurence);
	healthdetail.EnterDateOfLstTaken1(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.VerifyByDefaultValue3();
	healthdetail.ClickOnHaveYouEverBeenAdmitted();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	healthdetail.VerifyHaveYouEverBeenAdmittedErrorMSG();
	healthdetail.EnterDetailOfTreatment(HadReccurence);
	healthdetail.EnterMDoctorHospitalClinic(HadReccurence);
	healthdetail.EnterDateOfLstTaken2(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.VerifyByDefaultValue4();
	healthdetail.ClickOnHaveYouFurtherTreatmentFollowUp();
	healthdetail.ClickOnSubmitButton();
	healthdetail.VerifyMandatoryFieldMSG();
	healthdetail.EnterHaveYouFurtherTreatmentFollowUp(HadReccurence);
	healthdetail.ClickOnSubmitButton();
	Thread.sleep(3000);
	WebElement CurrentsysEle5 = driver.findElement(By.xpath("//div[contains(text(),'BREATHING ISSUES')]"));
	TestUtil.scrollToElement(driver, CurrentsysEle5);
	Thread.sleep(2000);
	healthdetail.ClickOnChestPain();
	healthdetail.VerifyAllSaveChestPainField();
}
@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-90 ||Verify dependent questions when one/multiple sub ailments selected by user                                                                               *  Low or High Blood Pressure \r\n"
		+ "*  High Cholesterol \r\n"
		+ "* Heart Attack  \r\n"
		+ "* Heart Murmur  \r\n"
		+ "* Heart Disorders"
		+ "||Verify error message when \"current symptoms\" field left blank and proceed"
		+ "||Verify error message when \"Doctor Details\" field left blank and proceed"
		+ "||Verify error message when \"Date of Diagnosis\" field left blank and proceed"
		+ "||Verify error message when \"Date of Last consultation\" field left blank and proceed."
		+ "||Verify error message when \"Details of hospitalization\" field left blank and proceed"
		+ "||Verify \"Date of last consultation\" field can't be set as future date."
		+ "||Verify \"Date of diagnosis\" field can't be set as future date.")
public void VerifyMedicalAilments1AllTabExceptHeartIssueWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,
		String ClickOnForFemaleOnly, String NoOfWeek, String ClickOnHaveYouSufferFrom,String 	ClickOnAilments,String 	DisplayAllAilment,
		String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(2000);
	WebElement CurrentsysEle = driver.findElement(By.xpath("//div[contains(text(),'Spouse Health')]"));
	TestUtil.scrollToElement(driver, CurrentsysEle);
	Thread.sleep(2000);
	healthdetail.ClickonAilment(ClickOnAilments);
	healthdetail.ClickonAilmentHeartIssueCheckbox();
	Thread.sleep(2000);
	healthdetail.ClickonAilment1AllTab();
	Thread.sleep(2000);
	WebElement firstEle1 = driver.findElement(By.xpath("//input[contains(@id,'8121.0.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle1);
	Thread.sleep(2000);
	healthdetail.BlankValueLowHighBloodPressure();
	
	healthdetail.VerifyLowHighBloodPressureErrorMSG();
	healthdetail.EnterLowHighBloodPresureCurrentSymptoms(HadReccurence);
	healthdetail.EnterLowHighBloodPresureDoctorDetails(HadReccurence);
	healthdetail.EnterLowHighBloodPresureDateOfLastConsult("15092023");
	healthdetail.EnterLowHighBloodPresureDateofDiagnos("15092023");
	healthdetail.VerifyLowHighBloodPresureDateValidationErrorMSG();
	healthdetail.EnterLowHighBloodPresureDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterLowHighBloodPresureDateofDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterLowHighBloodPresureHospitalize(HadReccurence);
	WebElement firstEle2 = driver.findElement(By.xpath("//input[contains(@id,'8121.1.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle2);
	Thread.sleep(2000);
	healthdetail.BlankValueHighCholesterol();
	healthdetail.VerifyHighCholesterolErrorMSG();
	healthdetail.EnterHighCholesterolCurrentSymptoms(HadReccurence);
	healthdetail.EnterHighCholesterolDoctorDetails(HadReccurence);
	healthdetail.EnterHighCholesterolDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterHighCholesterolDateofDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterHighCholesterolHospitalize(HadReccurence);
	WebElement firstEle3 = driver.findElement(By.xpath("//input[contains(@id,'8121.2.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle3);
	Thread.sleep(2000);
	healthdetail.BlankValueHeartAttack();
	healthdetail.VerifyHeartAttackErrorMSG();
	healthdetail.EnterHeartAttackCurrentSymptoms(HadReccurence);
	healthdetail.EnterHeartAttackDoctorDetails(HadReccurence);
	healthdetail.EnterHeartAttackDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterHeartAttackDateofDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterHeartAttackHospitalize(HadReccurence);
	WebElement firstEle4 = driver.findElement(By.xpath("//input[contains(@id,'8121.3.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle4);
	Thread.sleep(2000);
	healthdetail.BlankValueHeartMurmur();
	healthdetail.VerifyHeartMurmurErrorMSG();
	healthdetail.EnterHeartMurmurCurrentSymptoms(HadReccurence);
	healthdetail.EnterHeartMurmurDoctorDetails(HadReccurence);
	healthdetail.EnterHeartMurmurDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterHeartMurmurDateofDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterHeartMurmurHospitalize(HadReccurence);
	WebElement firstEle5 = driver.findElement(By.xpath("//input[contains(@id,'8121.4.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle5);
	Thread.sleep(2000);
	healthdetail.BlankValueHeartDisorders();
	healthdetail.VerifyHeartDisordersErrorMSG();
	healthdetail.EnterHeartDisOrdersCurrentSymptoms(HadReccurence);
	healthdetail.EnterHeartDisOrdersDoctorDetails(HadReccurence);
	healthdetail.EnterHeartDisOrdersDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterHeartDisOrdersDateofDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterHeartDisOrdersHospitalize(HadReccurence);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClicMedicalHistorySaveContinueBtn();

}
@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-90 ||Ailment 2 should be listed as \"Breathing Related issues\" and when expand ailment 2,  below follow up questions should be visible. \r\n"
		+ "* Asthma \r\n"
		+ "*  Chronic cough\r\n"
		+ "*  Pneumoina\r\n"
		+ "* Shortness of breath  \r\n"
		+ "* Tuberculosis(TB)  \r\n"
		+ "* Other Respiratort                                                                      "
		+ " *Lung Disorders\r\n"
		+ "A Checkbox corresponding to every sub ailment should be visible"
		+ "TEST 90||Verify user able to select  Astama or Chronic cough "
		+ "TEST 90||Verify user able to see 11 Queastions under Asthma and Respiratory Disorders Mandate"
		+ "TEST 90||Verify first question as \"Condition of you are suffering from? and its options\""
		+ "TEST 90||Verify selected Condition of you are suffering from?"
		+ "TEST 90||Verify user should not be able to proceed without filling \"Provide details\" text field  when others is selected"
		+ "TEST 90||Verify second question as \"When was the condition diagnosed \" "
		+ "TEST 90||Verify date field can't be set as future date. When second question \"When was the condition diagnosed \" "
		+ "TEST 90||Verify error message When second question as \"\"When was the condition diagnosed \"  \" date field left blank and proceed."
		+ "TEST 90||Verify third question as \"Are you smoker\" "
		+ "TEST 90||Verify third question as \"Are you smoker \" click on YES "
		+ "TEST 90||Verify error message When third question as \"Are you smoker \"  click on yes then field left blank and proceed."
		+ "TEST 90||Verify fourth question as \"Indicate frequency of your symptoms\""
		+ "TEST 90||Verify selected Condition of \"Indicate frequency of your symptoms\""
		+ "TEST 90||Verify user should not be able to proceed without filling \"Provide details\" text field  when others is selected"
		+ "TEST 90||Verify fifth question as \"Are your symptoms precipitated by seasonal changes, exercise, respiratory infections, etc.?\" "
		+ "TEST 90||Verify fifth question as \"Are your symptoms precipitated by seasonal changes, exercise, respiratory infections, etc.? \" click on YES "
		+ "TEST 90||Verify error message When Fifth question as \" \"Are your symptoms precipitated by seasonal changes, exercise, respiratory infections, etc.? \"  click on yes then field left blank and proceed."
		+ "TEST 90||Verify sixth question as \"When did you last experience symptoms\" "
		+ "TEST 90||Verify date field can't be set as future date. When sixth question \"When was the condition diagnosed \" "
		+ "TEST 90||Verify error message When sixth question as \"When did you last experience symptoms\" date field left blank and proceed."
		+ "TEST 90||Verify Seventh question \"Do you take medication or other treatment for this condition\" and \"No\" radio button by default selected ."
		+ "TEST 90||Verify seventh question and its dependent mandatory questions when \"YES\" radio button selected by user."
		+ "TEST 90||Verify error messages when fields for dependant questions of Seventh question left and blank proceed. "
		+ "TEST 90||Verify Ninth question \"Please provide the name and address of the doctors and/or specialists you see in relation to this condition\" and \"No\" radio button by default selected ."
		+ "TEST 90||Verify Ninth question and its dependent mandatory questions when \"YES\" radio button selected by user."
		+ "TEST 90||Verify error messages when fields for dependant questions of Ninth question left and blank proceed. "
		+ "TEST 90||Verify  tenth question as \"Have you taken time off work with this condition?\" "
		+ "TEST 90||Verify error message When tenth question as \"Have you taken time off work with this condition?\"  click on yes then field left blank and proceed."
		+ "TEST 90||User should able to see the saved data in Astma and Repositry disorder mandate.")
public void VerifyMedicalAilmentsQuestion2AsthmaWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,
		String ClickOnForFemaleOnly, String NoOfWeek, String ClickOnHaveYouSufferFrom,String 	ClickOnAilments,String 	DisplayAllAilment,
		String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(2000);
	WebElement CurrentsysEle = driver.findElement(By.xpath("//div[contains(text(),'Spouse Health')]"));
	TestUtil.scrollToElement(driver, CurrentsysEle);
	Thread.sleep(2000);
	healthdetail.ClickonAilment(ClickOnAilments);
	healthdetail.ClickonAilmentBreathingIssueCheckbox();
	Thread.sleep(2000);
	String[] ListOfValueTextfieldupdate = DisplayAllAilment.split(",");
	for (int i = 0; i <= ListOfValueTextfieldupdate.length - 1; i++) {
		healthdetail.displayAllAilmentsQuestion1(ListOfValueTextfieldupdate[i]);
	}
	healthdetail.ClickOnAsthma();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	Thread.sleep(2000);
	TestUtil.scrollTillTOPOfPage(driver);
	Thread.sleep(2000);
	healthdetail.VerifyConditionYouSufferingFromErrorMSG();
	healthdetail.EnterConditionYouSufferingFrom(HadReccurence);
	healthdetail.VerifyWhenWasConditionDiagnosErrorMSG();
	healthdetail.EnterWhenWasConditionDiagnos("20", "09", "2023");
	healthdetail.VerifyDateFutureErrorMSG();
	healthdetail.EnterWhenWasConditionDiagnos(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	Thread.sleep(2000);
	healthdetail.ClickOnAreYouSmoker();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	Thread.sleep(2000);
	WebElement firstEle1 = driver.findElement(By.xpath("//div[contains(text(),'5. Are your symptoms precipitated by seasonal changes, exercise, respiratory infections,etc?')]"));
	TestUtil.scrollToElement(driver, firstEle1);
	Thread.sleep(2000);
	healthdetail.VerifyAreYouSmokerErrorMSG();
	healthdetail.EnterAreYouSmoker(HadReccurence);
	healthdetail.VerifyIndicateFrequencyOfYouSymptomsErrorMSG();
	healthdetail.EnterIndicateFrequencyOfYouSymptoms(HadReccurence);
	healthdetail.ClickOnAreYouSymptomsPrecipitated();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	Thread.sleep(2000);
	WebElement firstEle2 = driver.findElement(By.xpath("//div[contains(text(),'7. Do you take medication or other treatment for this condition?')]"));
	TestUtil.scrollToElement(driver, firstEle2);
	Thread.sleep(2000);
	healthdetail.VerifyAreYourSymptomsPrecipitatedErrorMSG();
	healthdetail.EnterAreYourSymptomsPrecipated(HadReccurence);
	healthdetail.VerifyWhenDidYouLastExperianceSymptomsErrorMSG();
	healthdetail.EnteeWhenDidYouLastExperianceSymptoms("20", "09", "2023");
	healthdetail.VerifyDateFutureErrorMSG2();
	healthdetail.EnteeWhenDidYouLastExperianceSymptoms(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	Thread.sleep(2000);
	healthdetail.VerifyByDefaultValueDoYouTakeMedicine();
	healthdetail.ClickOnDoYouTakeMedicineOrOther();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	Thread.sleep(2000);
	WebElement firstEle3 = driver.findElement(By.xpath("//div[contains(text(),'9. Please provide the name and address of the doctors and/or specialists you see in relation to this condition')]"));
	TestUtil.scrollToElement(driver, firstEle3);
	Thread.sleep(2000);
	healthdetail.VerifyDoYouTakeMedicationOrOtherErrorMSG();
	healthdetail.EnterDoYouTakeMedicationOrOtherMedication(HadReccurence);
	healthdetail.EnterDoYouTakeMedicationOrOtherDose(HadReccurence);
	healthdetail.EnterDoYouTakeMedicationOrOtherFrquency(HadReccurence);
	healthdetail.VerifyPleaseProvideNameAndAddressErrorMSG();
	healthdetail.EnterDoctorHospitalClinic(HadReccurence);
	healthdetail.EnterAddress(HadReccurence);
	healthdetail.EnteeDateOfLastConsultation(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.ClickOnHaveYouTakenTime();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	healthdetail.VerifyHaveYouTakenOffErrorMSG();
	healthdetail.EnterHaveYouTakenOff(HadReccurence);
	healthdetail.ClickOnSubmitButton();
	Thread.sleep(3000);
	WebElement firstEle4 = driver.findElement(By.xpath("//div[contains(text(),'DIABETES')]"));
	TestUtil.scrollToElement(driver, firstEle4);
	Thread.sleep(2000);
	healthdetail.ClickOnAsthma();
	healthdetail.VerifyAllSaveAsthamaField();
	
}
@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-90 ||Ailment 2 should be listed as \"Breathing Related issues\" and when expand ailment 2,  below follow up questions should be visible. \r\n"
		+ "* Asthma \r\n"
		+ "*  Chronic cough\r\n"
		+ "*  Pneumoina\r\n"
		+ "* Shortness of breath  \r\n"
		+ "* Tuberculosis(TB)  \r\n"
		+ "* Other Respiratort                                                                      "
		+ " *Lung Disorders\r\n"
		+ "A Checkbox corresponding to every sub ailment should be visible"
		+ "Test||Verify error message when \"current symptoms\" field left blank and proceed "
		+ "Test||Verify error message when \"Doctor Details\" field left blank and proceed"
		+ "Test||Verify error message when \"Date of Diagnosis\" field left blank and proceed"
		+ "Test||Verify \"Date of diagnosis\" field can't be set as future date."
		+ "Test||Verify error message when \"Date of Last consultation\" field left blank and proceed."
		+ "Test||Verify \"Date of last consultation\" field can't be set as future date."
		+ "Test||Verify error message when \"Details of hospitalization\" field left blank and proceed")
public void VerifyMedicalAilmentsAllTabExceptAsthmaAndChronicCoughWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,
		String ClickOnForFemaleOnly, String NoOfWeek, String ClickOnHaveYouSufferFrom,String 	ClickOnAilments,String 	DisplayAllAilment,
		String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(2000);
	WebElement CurrentsysEle = driver.findElement(By.xpath("//div[contains(text(),'Spouse Health')]"));
	TestUtil.scrollToElement(driver, CurrentsysEle);
	Thread.sleep(2000);
	healthdetail.ClickonAilment(ClickOnAilments);
	healthdetail.ClickonAilmentBreathingIssueCheckbox();
	Thread.sleep(2000);
	String[] ListOfValueTextfieldupdate = DisplayAllAilment.split(",");
	for (int i = 0; i <= ListOfValueTextfieldupdate.length - 1; i++) {
		healthdetail.ClickOnAllTab(ListOfValueTextfieldupdate[i]);
	}
	Thread.sleep(2000);
	WebElement firstEle1 = driver.findElement(By.xpath("//input[contains(@id,'8122.0.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle1);
	Thread.sleep(2000);
	healthdetail.BlankValuePneumonia();
	healthdetail.VerifyPneumoniaErrorMSG();
	healthdetail.EnterPneumoniaCuurentSymptoms(HadReccurence);
	healthdetail.EnterPneumoniaDoctorDetails(HadReccurence);
	healthdetail.EnterPneumoniaDateOfLastConsult("15052023");
	healthdetail.EnterPneumoniaDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterPneumoniaDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterPneumoniaDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterPneumoniaHospitalization(HadReccurence);
	WebElement firstEle2 = driver.findElement(By.xpath("//input[contains(@id,'8122.1.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle2);
	Thread.sleep(2000);
	healthdetail.BlankValueShortnessofbreath();
	healthdetail.VerifyShortnessOfBreathErrorMSG();
	healthdetail.EnterShortnessOfBreathCuurentSymptoms(HadReccurence);
	healthdetail.EnterShortnessOfBreathDoctorDetails(HadReccurence);
	healthdetail.EnterShortnessOfBreathDateOfLastConsult("15052023");
	healthdetail.EnterShortnessOfBreathDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterShortnessOfBreathDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterShortnessOfBreathDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterShortnessOfBreathHospitalization(HadReccurence);
	WebElement firstEle3 = driver.findElement(By.xpath("//input[contains(@id,'8122.2.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle3);
	Thread.sleep(2000);
	healthdetail.BlankValueTuberculosis();
	healthdetail.VerifyTuberculosisErrorMSG();
	healthdetail.EnterTuberculosisCuurentSymptoms(HadReccurence);
	healthdetail.EnterTuberculosisDoctorDetails(HadReccurence);
	healthdetail.EnterTuberculosisDateOfLastConsult("15052023");
	healthdetail.EnterTuberculosisDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterTuberculosisDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterTuberculosisDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterTuberculosisHospitalization(HadReccurence);
	WebElement firstEle4 = driver.findElement(By.xpath("//input[contains(@id,'8122.3.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle4);
	Thread.sleep(2000);
	healthdetail.BlankValueOtherRespiratory();
	healthdetail.VerifyOtherRespiratoryErrorMSG();
	healthdetail.EnterOtherRespiratoryCuurentSymptoms(HadReccurence);
	healthdetail.EnterOtherRespiratoryDoctorDetails(HadReccurence);
	healthdetail.EnterOtherRespiratoryDateOfLastConsult("15052023");
	healthdetail.EnterOtherRespiratoryDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterOtherRespiratoryDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterOtherRespiratoryDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterOtherRespiratoryHospitalization(HadReccurence);
	WebElement firstEle5 = driver.findElement(By.xpath("//input[contains(@id,'8122.4.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle5);
	Thread.sleep(2000);
	healthdetail.BlankValueLungDisorders();
	healthdetail.VerifyLungDisordersErrorMSG();
	healthdetail.EnterLungDisordersCuurentSymptoms(HadReccurence);
	healthdetail.EnterLungDisordersDoctorDetails(HadReccurence);
	healthdetail.EnterLungDisordersDateOfLastConsult("15052023");
	healthdetail.EnterLungDisordersDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterLungDisordersDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterLungDisordersDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterLungDisordersHospitalization(HadReccurence);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClicMedicalHistorySaveContinueBtn();
}
@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-90 ||Verify Ailments should be enabled. When check box for Question 3 is checked."
		+ "TEST-90 ||Verify Ailment 3 i.e.Diabetes and dependent sub ailment / questionnaire"
		+ "TEST-90 ||Verify user should not be able to proceed with selecting \"Diabetes\" and without selecting any sub ailments corresponding to Diabetes"
		+ "TEST-90 ||Verify First  question \"Type of Diabetes you are suffering from\" "
		+ "TEST-90 ||Verify user select on \"Type of Diabetes you are suffering from\"  check boxes must be checked "
		+ "TEST-90 ||Verify error messages when check boxes are unselected   \"Type of Diabetes you are suffering from\" click on proceed. "
		+ "TEST-90 ||Verify second question as \"Date on which your diabetes was diagnosed \" "
		+ "TEST-90 ||Verify date field can't be set as future date. When second question \"Date on which your diabetes was diagnosed \" "
		+ "TEST-90 ||Verify error message When second question as \"Date on which your diabetes was diagnosed\" date field left blank and proceed."
		+ "TEST-90 ||Verify third question as \"Do you smoke\" "
		+ "TEST-90 ||Verify third question as \"Do you smoke \" click on YES "
		+ "TEST-90 ||Verify error message When third question as \"Are you smoker \"  click on yes then field left blank and proceed."
		+ "TEST-90 ||Verify Fifth question Do you do regular blood sugar measurements?\" and \"No\" radio button by default selected . "
		+ "TEST-90 ||Verify fifth question and its dependent mandatory questions when \"YES\" radio button selected by user."
		+ "TEST-90 ||Verify error messages when fields for dependant questions of Fifth question left and blank proceed. "
		+ "TEST-90 ||Verify Sixth question \"Have you ever been told  you have\" "
		+ "TEST-90 ||Verify error message When Sixth question as \"Have you ever been told  you have\" text field left blank and proceed."
		+ "TEST-90 ||Verify Sixth question as \"Have you ever been told  you have\" ")
public void VerifyMedicalAilmentsQuestion3DiabetesWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,
		String ClickOnForFemaleOnly, String NoOfWeek, String ClickOnHaveYouSufferFrom,String 	ClickOnAilments,String 	DisplayAllAilment,
		String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(2000);
	WebElement CurrentsysEle1 = driver.findElement(By.xpath("//div[contains(text(),'Spouse Health')]"));
	TestUtil.scrollToElement(driver, CurrentsysEle1);
	Thread.sleep(2000);
	healthdetail.ClickonAilment(ClickOnAilments);
	healthdetail.ClickonAilmentDiabetesCheckbox();
	Thread.sleep(2000);
	String[] ListOfValueTextfieldupdate = DisplayAllAilment.split(",");
	for (int i = 0; i <= ListOfValueTextfieldupdate.length - 1; i++) {
		healthdetail.displayAllAilmentsQuestion1(ListOfValueTextfieldupdate[i]);
	}
	healthdetail.ClickOnDiabetes();
	Thread.sleep(2000);
	String[] StateTheDiagnosupdate = StateTheDiagnos.split(",");
	for (int i = 0; i <= StateTheDiagnosupdate.length - 1; i++) {
		healthdetail.displayAllAilmentsQuestion1(StateTheDiagnosupdate[i]);
	}
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	Thread.sleep(2000);
	WebElement CurrentsysEle2 = driver.findElement(By.xpath("//div[contains(text(),'3. Do you smoke?')]"));
	TestUtil.scrollToElement(driver, CurrentsysEle2);
	Thread.sleep(2000);
	healthdetail.VerifyDateOnWhichYourDiabeticDiagnosErrorMSG();
	healthdetail.EnterdateOnWhichYourDiabetesdiagnos("15", "09", "2023");
	Thread.sleep(1000);
	healthdetail.VerifyDateFutureErrorMSG5();
	healthdetail.EnterdateOnWhichYourDiabetesdiagnos(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	healthdetail.VerifyTypeofdiabetesYouAreSufferingAlertPopUp();
	healthdetail.ClickOnAlertPopUpOKButton();
	TestUtil.scrollTillTOPOfPage(driver);
	healthdetail.ClickOnTypeOfdiabetesYouAreSufferingCheckBox();
	Thread.sleep(2000);
	WebElement CurrentsysEle3 = driver.findElement(By.xpath("//div[contains(text(),'4. Is your diabetes controlled by diet alone?')]"));
	TestUtil.scrollToElement(driver, CurrentsysEle3);
	Thread.sleep(2000);
	healthdetail.ClickOnDoYouSmokeYesButton();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	TestUtil.scrollToTopOfthePagetill255(driver);
	Thread.sleep(2000);
	healthdetail.VerifyDoYouSmokeErrorMSG();
	healthdetail.ClickOnLessthan10OfCigarettesButton();
	WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@name,'506')])[2]"));
	String gettext1 = valueEle1.getAttribute("aria-pressed");
	if (gettext1.equalsIgnoreCase("true")) {
		TestUtil.verifybgColor(valueEle1, driver);
		CustomListner.test.log(LogStatus.INFO, "By Default 5. Do you do regular blood sugar measurements? Value Selected As=====>NO");

	} else {
		CustomListner.test.log(LogStatus.FAIL, "By Default 5. Do you do regular blood sugar measurements? Value  Selected As=====>Yes");
	}
	healthdetail.ClickOnDoYouDoRegularbloodSugarYesButton();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	TestUtil.scrollToTopOfthePagetill255(driver);
	Thread.sleep(2000);
	healthdetail.VerifyDoYouDoRegularBloodSugarErrorMSG();
	healthdetail.EnterDoYouDoRegularBloodSugar(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.EnterBloodSugarLevel(HadReccurence);
	healthdetail.EnterLastHbA1C(HadReccurence);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnHaveYouEverBeenToldYouHaveYesButton();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	healthdetail.VerifyhaveYouEverBeenToldYouAlertPopUp();
	healthdetail.ClickOnAlertPopUpOKButton();
	TestUtil.scrollToTopOfthePagetill200(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnHaveYouBeenToldChechBox();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.EnterDetailsOfSymptoms(HadReccurence);
	healthdetail.ClickOnSubmitButton();
}
@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-90 ||Verify Ailment 4 i.e. Ulcers and dependent sub ailment / questionnaire"
		+ "TEST-90 ||Verify dependent questions when one/multiple sub ailments selected by user"
		+ "TEST-90 ||Verify error message when \"current symptoms\" field left blank and proceed"
		+ "TEST-90 ||Verify error message when \"Doctor Details\" field left blank and proceed"
		+ "TEST-90 ||Verify error message when \"Date of Diagnosis\" field left blank and proceed"
		+ "TEST-90 ||Verify \"Date of diagnosis\" field can't be set as future date."
		+ "TEST-90 ||Verify error message when \"Date of Last consultation\" field left blank and proceed."
		+ "TEST-90 ||Verify \"Date of last consultation\" field can't be set as future date."
		+ "TEST-90 ||Verify error message when \"Details of hospitalization\" field left blank and proceed"
		+ "TEST-90 ||Verify text limitation of \"Current Symptoms\", \"Doctor's Details\", \"Details of  hospitalisation\""
		+ "TEST-90 ||Verify user able to click on save and continue button navigate to RNA page.")
public void VerifyMedicalAilmentsQuestion4UlcerWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,
		String ClickOnForFemaleOnly, String NoOfWeek, String ClickOnHaveYouSufferFrom,String 	ClickOnAilments,String 	DisplayAllAilment,
		String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(3000);
	WebElement CurrentsysEle1 = driver.findElement(By.xpath("//div[contains(text(),'Spouse Health')]"));
	wait.waitForElementToBeVisibleweb(driver, CurrentsysEle1, 30, "Element is not Display");
	TestUtil.scrollToElement(driver, CurrentsysEle1);
	Thread.sleep(2000);
	healthdetail.ClickonAilment(ClickOnAilments);
	WebElement scrollEle = driver.findElement(By.xpath("//div[contains(text(),'KIDNEY')]"));
	TestUtil.scrollToElement(driver, scrollEle);
	Thread.sleep(2000);
	healthdetail.ClickonAilmentUlcerCheckbox();
	Thread.sleep(2000);
	String[] ListOfValueTextfieldupdate = DisplayAllAilment.split(",");
	for (int i = 0; i <= ListOfValueTextfieldupdate.length - 1; i++) {
		healthdetail.displayAllAilmentsQuestion1(ListOfValueTextfieldupdate[i]);
	}
	String[] ListOfValueTextfieldupdateNew = DisplayAllAilment.split(",");
	for (int i = 0; i <= ListOfValueTextfieldupdateNew.length - 1; i++) {
		healthdetail.ClickOnAllTab(ListOfValueTextfieldupdateNew[i]);
	}
	WebElement firstEle1 = driver.findElement(By.xpath("//input[contains(@id,'8125.0.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle1);
	Thread.sleep(2000);
	healthdetail.BlankValueUlcer();
	healthdetail.VerifyUlcerErrorMSG();
	healthdetail.EnterUlcerCuurentSymptoms(HadReccurence);
	healthdetail.EnterUlcerDoctorDetails(HadReccurence);
	healthdetail.EnterUlcerDateOfLastConsult("15052023");
	healthdetail.EnterUlcerDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterUlcerDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterUlcerDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterUlcerHospitalization(HadReccurence);
	WebElement firstEle2 = driver.findElement(By.xpath("//input[contains(@id,'8125.1.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle2);
	Thread.sleep(2000);
	healthdetail.BlankValueColitis();
	healthdetail.VerifyColitisErrorMSG();
	healthdetail.EnterColitisCuurentSymptoms(HadReccurence);
	healthdetail.EnterColitisDoctorDetails(HadReccurence);
	healthdetail.EnterColitisDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterColitisDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterColitisHospitalization(HadReccurence);
	WebElement firstEle3 = driver.findElement(By.xpath("//input[contains(@id,'8125.2.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle3);
	Thread.sleep(2000);
	healthdetail.BlankValueChronicDiarrhoea();
	healthdetail.VerifyChronicDiarrHoeaErrorMSG();
	healthdetail.EnterChronicDiarrhoeaCuurentSymptoms(HadReccurence);
	healthdetail.EnterChronicDiarrhoeaDoctorDetails(HadReccurence);
	healthdetail.EnterChronicDiarrhoeaDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterChronicDiarrhoeaDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterChronicDiarrhoeaHospitalization(HadReccurence);
	WebElement firstEle4 = driver.findElement(By.xpath("//input[contains(@id,'8125.3.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle4);
	Thread.sleep(2000);
	healthdetail.BlankValueHepatitis();
	healthdetail.VerifyHepatitisErrorMSG();
	healthdetail.EnterHepatitisCuurentSymptoms(HadReccurence);
	healthdetail.EnterHepatitisDoctorDetails(HadReccurence);
	healthdetail.EnterHepatitisDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterHepatitisDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterHepatitisHospitalization(HadReccurence);
	WebElement firstEle5 = driver.findElement(By.xpath("//input[contains(@id,'8125.4.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle5);
	Thread.sleep(2000);
	healthdetail.BlankValueJaundice();
	healthdetail.VerifyJaundiceErrorMSG();
	healthdetail.EnterJaundiceCuurentSymptoms(HadReccurence);
	healthdetail.EnterJaundiceDoctorDetails(HadReccurence);
	healthdetail.EnterJaundiceDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterJaundiceDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterJaundiceHospitalization(HadReccurence);
	WebElement firstEle6 = driver.findElement(By.xpath("//input[contains(@id,'8125.4.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle6);
	Thread.sleep(2000);
	healthdetail.BlankValueOtherliverdisorders();
	healthdetail.VerifyOtherliverdisordersErrorMSG();
	healthdetail.EnterOtherLiverDisorderCuurentSymptoms(HadReccurence);
	healthdetail.EnterOtherLiverDisorderDoctorDetails(HadReccurence);
	healthdetail.EnterOtherLiverDisorderDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterOtherLiverDisorderDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterOtherLiverDisorderHospitalization(HadReccurence);
	WebElement firstEle7 = driver.findElement(By.xpath("//input[contains(@id,'8125.5.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle7);
	Thread.sleep(2000);
	healthdetail.BlankValueDigestivedisorders();
	healthdetail.VerifyDigestivedisordersErrorMSG();
	healthdetail.EnterDigestivedisordersCuurentSymptoms(HadReccurence);
	healthdetail.EnterDigestivedisordersDoctorDetails(HadReccurence);
	healthdetail.EnterDigestivedisordersDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterDigestivedisordersDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterDigestivedisordersHospitalization(HadReccurence);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClicMedicalHistorySaveContinueBtn();
}
@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-90 ||Verify Ailment 6 i.e. Paralysis and Stroke and dependent sub ailment / questionnaire"
		+ "TEST-90 ||Verify user able to select  Dizziness epilepsy "
		+ "TEST-90 ||Verify user able to see 10 Queastions under Epilepsy and Seizure Disorder"
		+ "TEST-90 ||Verify first question as \"State the nature of the condition you are suffering? and its options\""
		+ "TEST-90 ||Verify default selected chip for first question (State the nature of the condition you are suffering)"
		+ "TEST-90 ||Verify Provide Details field when \"Others\" chip is selected"
		+ "TEST-90 ||Verify character limitation of \"Provide Details\" text field when others is selected"
		+ "TEST-90 ||Verify user should not be able to proceed without filling \"Provide details\" text field  when others is selected"
		+ "TEST-90 ||Verify the question  “Do you have medical report related to this?”"
		+ "TEST-90 ||Verify second question as \"When was the condition diagnosed or when did you first experience a seizure?\" "
		+ "TEST-90 ||Verify date field can't be set as future date. When second question \"When was the condition diagnosed or when did you first experience a seizure? \" "
		+ "TEST-90 ||Verify error message When second question as \"When was the condition diagnosed or when did you first experience a seizure?  date field left blank and proceed."
		+ "TEST-90 ||Verify third question as \"How often do you typically experience a seizure?\""
		+ "TEST-90 ||Verify selected Condition of How often do you typically experience a seizure?"
		+ "TEST-90 ||Verify user should not be able to proceed without filling \"Provide details\" text field  when others is selected"
		+ "TEST-90 ||Verify Fourth question as \"Is the frequency of seizure becoming\""
		+ "TEST-90 ||Verify user Error message in case not selected “ Please selected an options”"
		+ "TEST-90 ||Verify fifth question as \"When was your last seizure?\""
		+ "TEST-90 ||Verify date field can't be set as future date. When fifth question \"When was your last seizure? \" "
		+ "TEST-90 ||Verify error message When fifth question as \"When was your last seizure?\"  date field left blank and proceed."
		+ "TEST-90 ||Verify Sixth question \"Provide medication details for this condition\" and its dependent mandatory questions when "
		+ "TEST-90 ||Verify error messages when fields for dependant questions of Sixth question left and blank proceed. "
		+ "TEST-90 ||Verify Seventh question \"Have you ever had any tests or investigations carried out?\" and \"No\" button by default selected ."
		+ "TEST-90 ||Verify Seventh question and its dependent mandatory questions when \"YES\" radio button selected by user."
		+ "TEST-90 ||Verify error messages when fields for dependant questions of Seventh question left and blank proceed. "
		+ "TEST-90 ||Verify Eighth question \"Have you ever been admitted to hospital or had out-patient follow-up for this condition and \"No\" radio button by default selected ."
		+ "TEST-90 ||Verify Eighth question and its dependent mandatory questions when \"YES\" radio button selected by user."
		+ "TEST-90 ||Verify error messages when fields for dependant questions of Seventh question left and blank proceed. "
		+ "TEST-90 ||Verify Nineth question as \"Has any further treatment or investigation been discussed or contemplated?\" "
		+ "TEST-90 ||Verify Nineth question as \"Has any further treatment or investigation been discussed or contemplated? \" click on YES "
		+ "TEST-90 ||Verify error message When Nineth question as \"Has any further treatment or investigation been discussed or contemplated?\"  click on yes then field left blank and proceed."
		+ "TEST-90 ||Verify tenth question as \"Additional Information\" ")
public void VerifyMedicalAilmentsQuestion5ParalysisWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,
		String ClickOnForFemaleOnly, String NoOfWeek, String ClickOnHaveYouSufferFrom,String 	ClickOnAilments,String 	DisplayAllAilment,
		String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(3000);
	WebElement CurrentsysEle1 = driver.findElement(By.xpath("//div[contains(text(),'Spouse Health')]"));
	wait.waitForElementToBeVisibleweb(driver, CurrentsysEle1, 30, "Element is not Display");
	TestUtil.scrollToElement(driver, CurrentsysEle1);
	Thread.sleep(2000);
	healthdetail.ClickonAilment(ClickOnAilments);
	WebElement scrollEle = driver.findElement(By.xpath("//div[contains(text(),'KIDNEY')]"));
	TestUtil.scrollToElement(driver, scrollEle);
	Thread.sleep(2000);
	healthdetail.ClickonAilmentParalysisCheckbox();
	Thread.sleep(2000);
	String[] ListOfValueTextfieldupdate = DisplayAllAilment.split(",");
	for (int i = 0; i <= ListOfValueTextfieldupdate.length - 1; i++) {
		healthdetail.displayAllAilmentsQuestion1(ListOfValueTextfieldupdate[i]);
	}
	healthdetail.ClickonDizzinessEpilepsy();
	Thread.sleep(2000);
	String[] StateTheDiagnosdupdate = StateTheDiagnos.split(",");
	for (int i = 0; i <= StateTheDiagnosdupdate.length - 1; i++) {
		healthdetail.displayAllAilmentsQuestionParalysisDiziness(StateTheDiagnosdupdate[i]);
	}
	healthdetail.ClickonOther();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	Thread.sleep(2000);
	WebElement scrollEle1 = driver.findElement(By.xpath("//div[contains(text(),'3. How often do you typically experience a seizure?')]"));
	TestUtil.scrollToElement(driver, scrollEle1);
	Thread.sleep(2000);
	healthdetail.verifyotherErrorMSG();
	healthdetail.verifyotherYesNoButton();
	healthdetail.EnterOther(HadReccurence);
	healthdetail.verifyWhenWasConditionDiagnosErrorMSG();
	healthdetail.EnterWhenWasConditionDate("20", "05", "2023");
	healthdetail.VerifyDateFutureErrorMSG5();
	healthdetail.EnterWhenWasConditionDate(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.VerifyHowOftenDoYouExperianceErrorMSG();
	healthdetail.EnterHowOftenDoYouExperiance(HadReccurence);
	healthdetail.VerifyIsTheFrequencyOfSuizureBecomingErrorMSG();
	healthdetail.ClickOnFrequencyButton();
	WebElement scrollEle6 = driver.findElement(By.xpath("//input[contains(@id,'currentPast')]"));
	TestUtil.scrollToElement(driver, scrollEle6);
	Thread.sleep(2000);
	healthdetail.verifyWhenWasYourLastSuizureErrorMSG();
	healthdetail.EnterWhenWasYouLastSuizureDate("20", "05", "2023");
	healthdetail.VerifyDateFutureErrorMSG5();
	healthdetail.EnterWhenWasYouLastSuizureDate(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.ClickOnInlineSaveButton();
	Thread.sleep(2000);
	healthdetail.verifyMedicationErrorMSG();
	healthdetail.EnterNameOfMedicine(HadReccurence);
	healthdetail.EnterCurrentPast(HadReccurence);
	healthdetail.EnterMedicationDose(HadReccurence);
	healthdetail.EnterMedicationFrequency(HadReccurence);
	healthdetail.ClickOnInlineSaveButton();
	Thread.sleep(2000);
	healthdetail.VerifyByDefaultValueHaveYouEverHadAnyTest();
	healthdetail.ClickOnhaveYouEverHadAnyTestYesButton();
	healthdetail.ClickOnInlineSaveButton();
	healthdetail.verifyInvestigationErrorMSG();
	healthdetail.EnterInvestigation(HadReccurence);
	healthdetail.EnterHaveYouEverHadAnyTestDate(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.EnterResult(HadReccurence);
	healthdetail.ClickOnInlineSaveButton();
	Thread.sleep(2000);
	healthdetail.VerifyByDefaultValueHaveYouEverBeenAdmitted();
	healthdetail.ClickOnHaveYouEverBeenAdmittedYesButton();
	healthdetail.ClickOnInlineSaveButton();
	healthdetail.verifyAdmittedToHospitalErrorMSG();
	healthdetail.EnterDoctorClinicHospital(HadReccurence);
	healthdetail.EnterAdmittedAddress(HadReccurence);
	healthdetail.EnterAdmittedDate(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.ClickOnInlineSaveButton();
	Thread.sleep(2000);
	healthdetail.VerifyByDefaultValueFurtherTreatmentYesNoButton();
	healthdetail.ClickOnfurtherTreatmentYesButton();
	Thread.sleep(2000);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	Thread.sleep(2000);
	healthdetail.VerifyFurtherTreatmentErrorMsg();
	healthdetail.EnterFurtherTreatment(HadReccurence);
	healthdetail.VerifyTenthQuestion();
	healthdetail.ClickOnSubmitButton();
	
	
}
@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-90 ||Verify dependent questions when one/multiple sub ailments selected by user                                                                *  Fainting Spells\r\n"
		+ "*  Paralysis\r\n"
		+ "* Stroke\r\n"
		+ "* Mental Disorder\r\n"
		+ "* Psychiatric disorder                                                               *Any other neurological disorder"
		+ "TEST-90 || Verify error message when \"current symptoms\" field left blank and proceed"
		+ "TEST-90 ||Verify error message when \"Doctor Details\" field left blank and proceed"
		+ "TEST-90 ||Verify error message when \"Date of Diagnosis\" field left blank and proceed"
		+ "TEST-90 ||Verify \"Date of diagnosis\" field can't be set as future date."
		+ "TEST-90 ||Verify error message when \"Date of Last consultation\" field left blank and proceed."
		+ "TEST-90 ||Verify \"Date of last consultation\" field can't be set as future date."
		+ "TEST-90 ||Verify error message when \"Details of hospitalization\" field left blank and proceed"
		+ "TEST-90 ||Verify text limitation of \"Current Symptoms\", \"Doctor's Details\", \"Details of  hospitalisation\"")
public void VerifyMedicalAilmentsAllTabExceptDizinessEpilepsyWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,
		String ClickOnForFemaleOnly, String NoOfWeek, String ClickOnHaveYouSufferFrom,String 	ClickOnAilments,String 	DisplayAllAilment,
		String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(3000);
	WebElement CurrentsysEle1 = driver.findElement(By.xpath("//div[contains(text(),'Spouse Health')]"));
	wait.waitForElementToBeVisibleweb(driver, CurrentsysEle1, 30, "Element is not Display");
	TestUtil.scrollToElement(driver, CurrentsysEle1);
	Thread.sleep(2000);
	healthdetail.ClickonAilment(ClickOnAilments);
	WebElement scrollEle1 = driver.findElement(By.xpath("//div[contains(text(),'KIDNEY')]"));
	TestUtil.scrollToElement(driver, scrollEle1);
	Thread.sleep(2000);
	healthdetail.ClickonAilmentParalysisCheckbox();
	Thread.sleep(2000);
	String[] ListOfValueTextfieldupdate = DisplayAllAilment.split(",");
	for (int i = 0; i <= ListOfValueTextfieldupdate.length - 1; i++) {
		healthdetail.ClickOnAllTab(ListOfValueTextfieldupdate[i]);
	}
	WebElement scrollEle2 = driver.findElement(By.xpath("//input[contains(@id,'8127.0.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, scrollEle2);
	Thread.sleep(2000);
	healthdetail.BlankValueFaintingSpells();
	healthdetail.VerifyFaintingSpellsErrorMSG();
	healthdetail.EnterFaintingSpellsCuurentSymptoms(HadReccurence);
	healthdetail.EnterFaintingSpellsDoctorDetails(HadReccurence);
	healthdetail.EnterFaintingSpellsDateOfLastConsult("15052023");
	healthdetail.EnterFaintingSpellsDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterFaintingSpellsDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterFaintingSpellsDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterFaintingSpellsHospitalization(HadReccurence);
	WebElement scrollEle3 = driver.findElement(By.xpath("//input[contains(@id,'8127.1.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, scrollEle3);
	Thread.sleep(2000);
	healthdetail.BlankValueParalysis();
	healthdetail.VerifyParalysisErrorMSG();
	healthdetail.EnterParalysisCuurentSymptoms(HadReccurence);
	healthdetail.EnterParalysisDoctorDetails(HadReccurence);
	healthdetail.EnterParalysisDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterParalysisDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterParalysisHospitalization(HadReccurence);
	WebElement scrollEle4 = driver.findElement(By.xpath("//input[contains(@id,'8127.2.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, scrollEle4);
	Thread.sleep(2000);
	healthdetail.BlankValueStroke();
	healthdetail.VerifyStrokeErrorMSG();
	healthdetail.EnterStrokeCuurentSymptoms(HadReccurence);
	healthdetail.EnterStrokeDoctorDetails(HadReccurence);
	healthdetail.EnterStrokeDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterStrokeDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterStrokeHospitalization(HadReccurence);
	WebElement scrollEle5 = driver.findElement(By.xpath("//input[contains(@id,'8127.3.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, scrollEle5);
	Thread.sleep(2000);
	healthdetail.BlankValueMentalDisorder();
	healthdetail.VerifyMentalDisorderErrorMSG();
	healthdetail.EnterMentalDisorderCuurentSymptoms(HadReccurence);
	healthdetail.EnterMentalDisorderDoctorDetails(HadReccurence);
	healthdetail.EnterMentalDisorderDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterMentalDisorderDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterMentalDisorderHospitalization(HadReccurence);
	WebElement scrollEle6 = driver.findElement(By.xpath("//input[contains(@id,'8127.4.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, scrollEle6);
	Thread.sleep(2000);
	healthdetail.BlankValuePsychiatricdisorder();
	healthdetail.VerifyPsychiatricdisorderErrorMSG();
	healthdetail.EnterPsychiatricdisorderCuurentSymptoms(HadReccurence);
	healthdetail.EnterPsychiatricdisorderDoctorDetails(HadReccurence);
	healthdetail.EnterPsychiatricdisorderDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterPsychiatricdisorderDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterPsychiatricdisorderHospitalization(HadReccurence);
	WebElement scrollEle7 = driver.findElement(By.xpath("//input[contains(@id,'8127.4.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, scrollEle7);
	Thread.sleep(2000);
	healthdetail.BlankValueAnyotherneurologicaldisorder();
	healthdetail.VerifyAnyotherneurologicaldisorderErrorMSG();
	healthdetail.EnterAnyotherneurologicaldisorderCuurentSymptoms(HadReccurence);
	healthdetail.EnterAnyotherneurologicaldisorderDoctorDetails(HadReccurence);
	healthdetail.EnterAnyotherneurologicaldisorderDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterAnyotherneurologicaldisorderDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterAnyotherneurologicaldisorderHospitalization(HadReccurence);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClicMedicalHistorySaveContinueBtn();
	Thread.sleep(2000);
}
@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-90 ||Verify Ailment 7 i.e.Kidney and dependent sub ailment / questionnaire"
		+ "TEST-90 ||Verify dependent questions when one/multiple sub ailments selected by user"
		+ "TEST-90 ||Verify error message when \"current symptoms\" field left blank and proceed"
		+ "TEST-90 ||Verify error message when \"Doctor Details\" field left blank and proceed"
		+ "TEST-90 ||Verify error message when \"Date of Diagnosis\" field left blank and proceed"
		+ "TEST-90 ||Verify \"Date of diagnosis\" field can't be set as future date."
		+ "TEST-90 ||Verify error message when \"Date of Last consultation\" field left blank and proceed."
		+ "TEST-90 ||Verify \"Date of last consultation\" field can't be set as future date."
		+ "TEST-90 ||Verify error message when \"Details of hospitalization\" field left blank and proceed"
		+ "TEST-90 ||Verify text limitation of \"Current Symptoms\", \"Doctor's Details\", \"Details of  hospitalisation\"")
public void VerifyMedicalAilmentsQuestion6KidneyWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,
		String ClickOnForFemaleOnly, String NoOfWeek, String ClickOnHaveYouSufferFrom,String 	ClickOnAilments,String 	DisplayAllAilment,
		String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(3000);
	WebElement CurrentsysEle1 = driver.findElement(By.xpath("//div[contains(text(),'Spouse Health')]"));
	wait.waitForElementToBeVisibleweb(driver, CurrentsysEle1, 30, "Element is not Display");
	TestUtil.scrollToElement(driver, CurrentsysEle1);
	Thread.sleep(2000);
	healthdetail.ClickonAilment(ClickOnAilments);
	WebElement scrollEle = driver.findElement(By.xpath("//div[contains(text(),'EYE / EAR')]"));
	TestUtil.scrollToElement(driver, scrollEle);
	Thread.sleep(2000);
	healthdetail.ClickonAilmentKidneyCheckbox();
	Thread.sleep(2000);
	String[] ListOfValueTextfieldupdate = DisplayAllAilment.split(",");
	for (int i = 0; i <= ListOfValueTextfieldupdate.length - 1; i++) {
		healthdetail.displayAllAilmentsQuestion1(ListOfValueTextfieldupdate[i]);
	}
	String[] ListOfValueTextfieldupdateNew = DisplayAllAilment.split(",");
	for (int i = 0; i <= ListOfValueTextfieldupdateNew.length - 1; i++) {
		healthdetail.ClickOnAllTab(ListOfValueTextfieldupdateNew[i]);
	}
	Thread.sleep(2000);
	WebElement firstEle1 = driver.findElement(By.xpath("//input[contains(@id,'8128.0.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle1);
	Thread.sleep(2000);
	healthdetail.BlankValueKidney();
	healthdetail.VerifyKidneyErrorMSG();
	healthdetail.EnterKidneyCuurentSymptoms(HadReccurence);
	healthdetail.EnterKidneyDoctorDetails(HadReccurence);
	healthdetail.EnterKidneyDateOfLastConsult("15052023");
	healthdetail.EnterKidneyDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterKidneyDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterKidneyDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterKidneyHospitalization(HadReccurence);
	WebElement firstEle2 = driver.findElement(By.xpath("//input[contains(@id,'8128.1.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle2);
	Thread.sleep(2000);
	healthdetail.BlankValueUrinary();
	healthdetail.VerifyUrinaryErrorMSG();
	healthdetail.EnterUrinaryCuurentSymptoms(HadReccurence);
	healthdetail.EnterUrinaryDoctorDetails(HadReccurence);
	healthdetail.EnterUrinaryDateOfLastConsult("15052023");
	healthdetail.EnterUrinaryDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterUrinaryDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterUrinaryDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterUrinaryHospitalization(HadReccurence);
	WebElement firstEle3 = driver.findElement(By.xpath("//input[contains(@id,'8128.2.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle3);
	Thread.sleep(2000);
	healthdetail.BlankValueBladder();
	healthdetail.VerifyBladderErrorMSG();
	healthdetail.EnterBladderCuurentSymptoms(HadReccurence);
	healthdetail.EnterBladderDoctorDetails(HadReccurence);
	healthdetail.EnterBladderDateOfLastConsult("15052023");
	healthdetail.EnterBladderDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterBladderDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterBladderDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterBladderHospitalization(HadReccurence);
	WebElement firstEle4 = driver.findElement(By.xpath("//input[contains(@id,'8128.3.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle4);
	Thread.sleep(2000);
	healthdetail.BlankValueReproductiveorgan();
	healthdetail.VerifyReproductiveorganErrorMSG();
	healthdetail.EnterReproductiveorganCuurentSymptoms(HadReccurence);
	healthdetail.EnterReproductiveorganDoctorDetails(HadReccurence);
	healthdetail.EnterReproductiveorganDateOfLastConsult("15052023");
	healthdetail.EnterReproductiveorganDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterReproductiveorganDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterReproductiveorganDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterReproductiveorganHospitalization(HadReccurence);
	WebElement firstEle5 = driver.findElement(By.xpath("//input[contains(@id,'8128.4.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle5);
	Thread.sleep(2000);
	healthdetail.BlankValueProstateDisorder();
	healthdetail.VerifyProstateDisorderErrorMSG();
	healthdetail.EnterProstateDisorderCuurentSymptoms(HadReccurence);
	healthdetail.EnterProstateDisorderDoctorDetails(HadReccurence);
	healthdetail.EnterProstateDisorderDateOfLastConsult("15052023");
	healthdetail.EnterProstateDisorderDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterProstateDisorderDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterProstateDisorderDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterProstateDisorderHospitalization(HadReccurence);
	WebElement firstEle6 = driver.findElement(By.xpath("//input[contains(@id,'8128.5.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle6);
	Thread.sleep(2000);
	healthdetail.BlankValueGenitourinaryDisorder();
	healthdetail.VerifyGenitourinaryDisorderErrorMSG();
	healthdetail.EnterGenitourinaryDisorderCuurentSymptoms(HadReccurence);
	healthdetail.EnterGenitourinaryDisorderDoctorDetails(HadReccurence);
	healthdetail.EnterGenitourinaryDisorderDateOfLastConsult("15052023");
	healthdetail.EnterGenitourinaryDisorderDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterGenitourinaryDisorderDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterGenitourinaryDisorderDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterGenitourinaryDisorderHospitalization(HadReccurence);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClicMedicalHistorySaveContinueBtn();
}
@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-90 ||Verify Ailment  8 i.e. Arthritis and dependent sub ailment / questionnaire"
		+ "TEST-90 ||Verify user able to select any of one                                                          *  Arthritis \r\n"
		+ "*  Gout Pain\r\n"
		+ "*  Joint Pain "
		+ "TEST-90 ||Verify user able to see 8 Queastions under Arthritis Mandate"
		+ "TEST-90 ||Verify first question as \"Condition that you are suffering\""
		+ "TEST-90 ||Verify default selected chip for first question (\"Condition that you are suffering\")"
		+ "TEST-90 ||Verify Provide Details field when \"Others\" chip is selected"
		+ "TEST-90 ||Verify character limitation of \"Provide Details\" text field when others is selected"
		+ "TEST-90 ||Verify user should not be able to proceed without filling \"Provide details\" text field  when others is selected"
		+ "TEST-90 ||Verify second question as \"When did you first experience symptoms?\" "
		+ "TEST-90 ||Verify date field can't be set as future date. When second question \"When did you first experience symptoms? \" "
		+ "TEST-90 ||Verify error message When second question as \"When did you first experience symptoms?\"  date field left blank and proceed."
		+ "TEST-90 ||Verify the third  question 3a i) “Are these symptoms ongoing?\""
		+ "TEST-90 ||Verify the third  question 3a ii) “are they worsening in severity?\""
		+ "TEST-90 ||Verify Third question 3b  as \"When did you last experience symptoms?\" "
		+ "TEST-90 ||Verify date field can't be set as future date. WhenThird question 3b \"When did you last experience symptoms?\" "
		+ "TEST-90 ||Verify error message When Third question 3 b) as \"When did you last experience symptoms? date field left blank and proceed."
		+ "TEST-90 ||Verify third question  3 c) as \"Which joints are or have been affected?\""
		+ "TEST-90 ||Verify user should not be able to proceed without filling \"Provide details\" text field  when others is selected"
		+ "TEST-90 ||Verify the third  question 3d  “Are your daily activities affected or restricted in any way?\""
		+ "TEST-90 ||Verify user Error message in case not selected “ Specify the details”"
		+ "TEST-90 ||Verify third question 3d as \"Are your daily activities affected or restricted in any way?\""
		+ "TEST-90 ||Verify user should not be able to proceed without filling \"Provide details\" text field  when others is selected"
		+ "TEST-90 ||Verify the third  question 3e)  \"Do you use walking stick or other mobility aid?\""
		+ "TEST-90 ||Verify user Error message in case not selected “ Specify the details”"
		+ "TEST-90 ||Verify Fourth question and its dependent mandatory questions when "
		+ "TEST-90 ||Verify error messages when fields for dependant questions of Fourth question left and blank proceed. "
		+ "TEST-90 ||Verify user able to click on  add option "
		+ "TEST-90 ||Verify able to add 5 such details"
		+ "TEST-90 ||Verify Fifth question \"Has any other treatment, test or investigation been carried out or been advised to do in future in connection with this condition e.g. blood test, x-ray, (RF) arthroscopy, surgery, therapy, etc.?' and \"No\" button by default selected ."
		+ "TEST-90 ||Verify Fifth question and its dependent mandatory questions when \"YES\" radio button selected by user."
		+ "TEST-90 ||Verify error messages when fields for dependant questions of Fifth question left and blank proceed. "
		+ "TEST-90 ||Verify the sixth question  \"Have you ever been or have been advised OPD follow up or hospitalization for this condition\""
		+ "TEST-90 ||Verify user should not be able to proceed without filling \"Specify details\" text field  when others is selected"
		+ "TEST-90 ||Verify the Seventh question  \"Any systemic manifestations e.g. CVD, Respiratory, anemia\""
		+ "TEST-90 ||Verify user Error message in case not selected “ Specify the details”"
		+ "TEST-90 ||Verify user should not be able to proceed without filling \"Specify details\" text field  when others is selected"
		+ "TEST-90 ||Verify Eighth question as \"Additional Information\"")
public void VerifyMedicalAilmentsQuestion7ArthritisWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,
		String ClickOnForFemaleOnly, String NoOfWeek, String ClickOnHaveYouSufferFrom,String 	ClickOnAilments,String 	DisplayAllAilment,
		String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(3000);
	WebElement CurrentsysEle1 = driver.findElement(By.xpath("//div[contains(text(),'Spouse Health')]"));
	wait.waitForElementToBeVisibleweb(driver, CurrentsysEle1, 30, "Element is not Display");
	TestUtil.scrollToElement(driver, CurrentsysEle1);
	Thread.sleep(2000);
	healthdetail.ClickonAilment(ClickOnAilments);
	WebElement scrollEle = driver.findElement(By.xpath("//div[contains(text(),'EYE / EAR')]"));
	TestUtil.scrollToElement(driver, scrollEle);
	Thread.sleep(2000);
	healthdetail.ClickonAilmentArthritisCheckbox();
	Thread.sleep(2000);
	String[] ListOfValueTextfieldupdate = DisplayAllAilment.split(",");
	for (int i = 0; i <= ListOfValueTextfieldupdate.length - 1; i++) {
		healthdetail.displayAllAilmentsQuestion1(ListOfValueTextfieldupdate[i]);
	}
	healthdetail.ClickonArthritis();
	healthdetail.ClickonOther();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	Thread.sleep(2000);
	WebElement scrollEle1 = driver.findElement(By.xpath("//div[contains(text(),'3.a.i. Are these symptoms ongoing?')]"));
	TestUtil.scrollToElement(driver, scrollEle1);
	Thread.sleep(2000);
	healthdetail.verifyotherArthritisErrorMSG();
	healthdetail.EnterOtherArthritis(HadReccurence);
	healthdetail.verifyWhenDidYouFirstExperianceSymtomsErrorMSG();
	healthdetail.EnterWhenDidYouFirstExperianceDate("20", "05", "2023");
	healthdetail.VerifyDateFutureErrorMSG5();
	healthdetail.EnterWhenDidYouFirstExperianceDate(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.VerifyByDefaultValueAreTheseSymptomsYesNoButton();
	healthdetail.VerifyByDefaultValueAreTheyWorseningSeverityYesNoButton();
	healthdetail.verifyWhenDidYoulastExperianceSymtomsErrorMSG();
	healthdetail.EnterWhenDidYouLastExperianceDate("20", "05", "2023");
	healthdetail.VerifyDateFutureErrorMSG5();
	healthdetail.EnterWhenDidYouLastExperianceDate(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	
	healthdetail.VerifyWhichJointHaveBeenAffectedErrorMSG();
	healthdetail.EnterWhichJointHaveBeenAffected(HadReccurence);
	healthdetail.VerifyByDefaultValueAreYouDailyActivitiesYesNoButton();
	healthdetail.ClickOnAreYouDailyActivitiesButton();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	Thread.sleep(2000);
	WebElement scrollEle2 = driver.findElement(By.xpath("//div[contains(text(),'4. Have you ever taken or are currently taking medication for this conditions?')]"));
	TestUtil.scrollToElement(driver, scrollEle2);
	Thread.sleep(2000);
	healthdetail.VerifyAreYouDailyActivitiesErrorMSG();
	healthdetail.EnterAreYouDailyActivities(HadReccurence);
	
	
	healthdetail.VerifyByDefaultValueDoYouUseWalkingStickYesNoButton();
	healthdetail.ClickOnDoYouUseWalkingStickButton();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	Thread.sleep(2000);
	WebElement scrollEle3 = driver.findElement(By.xpath("//div[contains(text(),'4. Have you ever taken or are currently taking medication for this conditions?')]"));
	TestUtil.scrollToElement(driver, scrollEle3);
	Thread.sleep(2000);
	healthdetail.VerifyDoYouUseWalkingStickErrorMSG();
	healthdetail.EnterDoYouUseWalkingStick(HadReccurence);
	healthdetail.ClickOnHaveYouEverTakenMedicationYesButton();
	healthdetail.ClickOnInlineSaveButton();
	Thread.sleep(2000);
	healthdetail.VerifyhaveYouEverTakenMedicationErrorMSG();
	healthdetail.EnterNameOfMedication1(HadReccurence);
	healthdetail.EnterArthritisCurrentPast1(HadReccurence);
	healthdetail.EnterArthritisDose1(HadReccurence);
	healthdetail.EnterArthritisFrequency1(HadReccurence);
	healthdetail.ClickOnInlineSaveButton();
	Thread.sleep(2000);
	healthdetail.ClickOnAddButton1();
	healthdetail.EnterNameOfMedication2(HadReccurence);
	healthdetail.EnterArthritisCurrentPast2(HadReccurence);
	healthdetail.EnterArthritisDose2(HadReccurence);
	healthdetail.EnterArthritisFrequency2(HadReccurence);
	healthdetail.ClickOnInlineSaveButton();
	Thread.sleep(2000);
	healthdetail.ClickOnAddButton2();
	healthdetail.EnterNameOfMedication3(HadReccurence);
	healthdetail.EnterArthritisCurrentPast3(HadReccurence);
	healthdetail.EnterArthritisDose3(HadReccurence);
	healthdetail.EnterArthritisFrequency3(HadReccurence);
	healthdetail.ClickOnInlineSaveButton();
	Thread.sleep(2000);
//	healthdetail.ClickOnAddButton3();
//	healthdetail.EnterNameOfMedication4(HadReccurence);
//	healthdetail.EnterArthritisCurrentPast4(HadReccurence);
//	healthdetail.EnterArthritisDose4(HadReccurence);
//	healthdetail.EnterArthritisFrequency4(HadReccurence);
//	healthdetail.ClickOnInlineSaveButton();
//	healthdetail.ClickOnAddButton4();
//	healthdetail.EnterNameOfMedication5(HadReccurence);
//	healthdetail.EnterArthritisCurrentPast5(HadReccurence);
//	healthdetail.EnterArthritisDose5(HadReccurence);
//	healthdetail.EnterArthritisFrequency5(HadReccurence);
//	healthdetail.ClickOnInlineSaveButton();
//	
	WebElement scrollEle4 = driver.findElement(By.xpath("//div[contains(text(),'7. Any systemic manifestations e.g. CVD, Respiratory, anemia')]"));
	TestUtil.scrollToElement(driver, scrollEle4);
	Thread.sleep(2000);
	healthdetail.VerifyByDefaultValue5();
	healthdetail.ClickOnHasAnyOtherTreatmentYesButton();
	Thread.sleep(2000);
	healthdetail.ClickOnInlineSaveButton();
	healthdetail.VerifyhasAnyOtherTreatmentErrorMSG();
	healthdetail.EnterTreatmentTestInvestigation(HadReccurence);
	healthdetail.EnterLocation(HadReccurence);
	healthdetail.EnterArthritisDate(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.EnterArthiritisResult(HadReccurence);
	healthdetail.ClickOnInlineSaveButton();
	Thread.sleep(2000);
	healthdetail.VerifyByDefaultValueHaveYouEverBeenAdviceOPDYesNoButton();
	healthdetail.ClickOnHaveYouAdviceOPDYesButton();
	Thread.sleep(2000);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	healthdetail.VerifyHaveBeenAdviceOPDErrorMSG();
	healthdetail.EnterHaveBeenAdviceOPD(HadReccurence);
	
	healthdetail.VerifyByDefaultValueSystemeticManifestationYesNoButton();
	healthdetail.ClickOnSystemicManifestationYesButton();
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	healthdetail.VerifySystemicManifestationErrorMSG();
	healthdetail.EntersyStemicManifestation(HadReccurence);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.EnterAdditionalInformation(HadReccurence);
	healthdetail.ClickOnSubmitButton();
}

@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-90 ||Verify user when click on Other musculoskeletal disorders"
		+ "TEST-90 ||Verify First question  as \"Please advise which joint/s or areas of the body are/were affected\""
		+ "TEST-90 ||Verify user should not be able to proceed without filling \"Specify the details\" text field  when others is selected"
		+ "TEST-90 ||Verify Second question  as \"What was the underlying cause (e.g. accident, degeneration, recreational or sporting injury etc.)\""
		+ "TEST-90 ||Verify user should not be able to proceed without filling \"Specify the details\" text field  when others is selected"
		+ "TEST-90 ||Verify Third question as \"When did you first experience symptoms\""
		+ "TEST-90 ||Verify date field can't be set as future date. When Third question \"When did you first experience symptoms\" "
		+ "TEST-90 ||Verify error message When Third question as \"When did you first experience symptoms\"  date field left blank and proceed."
		+ "TEST-90 ||Verify the Fourth question 4a \"Are your symptoms ongoing?\""
		+ "TEST-90 ||Verify user Error message in case not selected “ Please selected an option”"
		+ "TEST-90 ||Verify Fourth question as 4b \"If you are no longer experiencing symptoms, when did they last occur?\""
		+ "TEST-90 ||Verify date field can't be set as future date. When Fourth question \"If you are no longer experiencing symptoms, when did they last occur?\""
		+ "TEST-90 ||Verify error message When Fourth question as \"If you are no longer experiencing symptoms, when did they last occur?\"  date field left blank and proceed."
		+ "TEST-90 ||Verify Fifth question \"Please provide details of any medication taken for this condition or any other treatment that you have had for this condition e.g. arthroscopy, other surgery, treatment by a physiotherapist, massage therapist, acupuncturist, naturopath, etc.\""
		+ "TEST-90 ||Verify error messages when fields for dependant questions of Fifth question left and blank proceed. "
		+ "TEST-90 ||Verify able to add 5 such details"
		+ "TEST-90 ||Verify user when click on save option data is saved"
		+ "TEST-90 ||Verify Sixth question \"Have your ever had tests or investigations carried out in connection to this condition or been advised to do so in future e.g. x-ray, MRI, CT scan,etc.?\""
		+ "TEST-90 ||Verify error messages when fields for dependant questions of Fifth question left and blank proceed. "
		+ "TEST-90 ||Verify user able to click on  add option "
		+ "TEST-90 ||Verify able to add 5 such details"
		+ "TEST-90 ||Verify user when click on save option data is saved"
		+ "TEST-90 ||Verify Seventh question \"Have you ever been or have been advised OPD follow up or hospitalization for this condition?\""
		+ "TEST-90 ||Verify error messages when fields for dependant questions of Seventh question left and blank proceed. "
		+ "TEST-90 ||Verify user able to click on  add option "
		+ "TEST-90 ||Verify able to add 5 such details"
		+ "TEST-90 ||Verify user when click on save option data is saved"
		+ "TEST-90 ||Verify tenth question as \"Additional Information\"")
public void VerifyMedicalAilmentsQuestion7OthermusculoskeletaldisordersWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,
		String ClickOnForFemaleOnly, String NoOfWeek, String ClickOnHaveYouSufferFrom,String 	ClickOnAilments,String 	DisplayAllAilment,
		String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(3000);
	WebElement CurrentsysEle1 = driver.findElement(By.xpath("//div[contains(text(),'Spouse Health')]"));
	wait.waitForElementToBeVisibleweb(driver, CurrentsysEle1, 30, "Element is not Display");
	TestUtil.scrollToElement(driver, CurrentsysEle1);
	Thread.sleep(2000);
	healthdetail.ClickonAilment(ClickOnAilments);
	WebElement scrollEle = driver.findElement(By.xpath("//div[contains(text(),'EYE / EAR')]"));
	TestUtil.scrollToElement(driver, scrollEle);
	Thread.sleep(2000);
	healthdetail.ClickonAilmentArthritisCheckbox();
	healthdetail.ClickonOthermusculoskeletaldisorders();
	Thread.sleep(2000);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	Thread.sleep(2000);
	WebElement scrollEle1 = driver.findElement(By.xpath("//div[contains(text(),'4a. Are your symptoms ongoing?')]"));
	TestUtil.scrollToElement(driver, scrollEle1);
	Thread.sleep(2000);
	healthdetail.verifyPleaseAdviceErrorMSG();
	healthdetail.EnterPleaseAdvice(HadReccurence);
	healthdetail.verifyWhatWasUnderlyningCouseErrorMSG();
	healthdetail.EnterWhatWasUnderlyningCouse(HadReccurence);
	healthdetail.verifyWhenDidYouFirstExperianceSymtomsMuskuloskeletalErrorMSG();
	healthdetail.EnterWhenDidYouFirstExperianceMusculossketetalDate("20", "05", "2023");
	healthdetail.VerifyDateFutureErrorMSG5();
	healthdetail.EnterWhenDidYouFirstExperianceMusculossketetalDate(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.VerifyByDefaultValueAreYourSymptomsOngoingYesNoButton();
	healthdetail.ClickOnAreYourSymptomsyesButton();
	Thread.sleep(2000);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickOnSubmitButton();
	Thread.sleep(2000);
	WebElement scrollEle2 = driver.findElement(By.xpath("//input[contains(@id,'name')]"));
	TestUtil.scrollToElement(driver, scrollEle2);
	Thread.sleep(2000);
	healthdetail.VerifyAreYourSymptomsOngoingErrorMSG5();
	healthdetail.ClickOnImprovingButton();
	healthdetail.verifyIfYouAreNoLongerErrorMSG();
	healthdetail.EnterIfYouAreNoLongerDate("20", "08", "2023");
	healthdetail.VerifyDateFutureErrorMSG5();
	healthdetail.EnterIfYouAreNoLongerDate(DateOfLastDay, DateOfLastMonth, DateOfLastYear);

	healthdetail.ClickOnInlineSaveButton();
	Thread.sleep(2000);
	healthdetail.VerifyPleaseProvidedetailsOfMedicationErrorMSG();
	healthdetail.EnterNameOfMedication1(HadReccurence);
	healthdetail.EnterArthritisCurrentPast1(HadReccurence);
	healthdetail.EnterArthritisDose1(HadReccurence);
	healthdetail.EnterArthritisFrequency1(HadReccurence);
	healthdetail.ClickOnInlineSaveButton();
	Thread.sleep(2000);
	healthdetail.ClickOnAddButton1();
	healthdetail.EnterNameOfMedication2Musculosketetal(HadReccurence);
	healthdetail.EnterArthritisCurrentPast2Musculosketetal(HadReccurence);
	healthdetail.EnterArthritisDose2Musculosketetal(HadReccurence);
	healthdetail.EnterArthritisFrequency2Musculosketetal(HadReccurence);
	healthdetail.ClickOnInlineSaveButton();
	Thread.sleep(2000);
	healthdetail.ClickOnAddButton2();
	healthdetail.EnterNameOfMedication3Musculosketetal(HadReccurence);
	healthdetail.EnterArthritisCurrentPast3Musculosketetal(HadReccurence);
	healthdetail.EnterArthritisDose3Musculosketetal(HadReccurence);
	healthdetail.EnterArthritisFrequency3Musculosketetal(HadReccurence);
	healthdetail.ClickOnInlineSaveButton();
	Thread.sleep(2000);
	healthdetail.VerifyByDefaultValueHaveYouEverHad();
	healthdetail.ClickOnhaveYouEverHadYesButton();
	healthdetail.ClickOnInlineSaveButton();
	healthdetail.VerifyHaveYouEverHadErrorMSG();
	healthdetail.EnterTestInvestigationName(HadReccurence);
	healthdetail.EnterResultMusculosketetal(HadReccurence);
	healthdetail.EnterHaveYouEverHadDate(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.ClickOnInlineSaveButton();
	Thread.sleep(2000);
	healthdetail.ClickOnAddButton1haveYouEverHad();
	healthdetail.EnterTestInvestigationName2(HadReccurence);
	healthdetail.EnterResultMusculosketetal2(HadReccurence);
	healthdetail.EnterHaveYouEverHadDate2(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.ClickOnInlineSaveButton();
	Thread.sleep(2000);
	healthdetail.ClickOnAddButton2haveYouEverHad();
	healthdetail.EnterTestInvestigationName3(HadReccurence);
	healthdetail.EnterResultMusculosketetal3(HadReccurence);
	healthdetail.EnterHaveYouEverHadDate3(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.ClickOnInlineSaveButton();
	Thread.sleep(2000);
	healthdetail.VerifyByDefaultValueHaveYouEverBeen();
	healthdetail.ClickOnHaveYouEverBeenyesButton();
	Thread.sleep(2000);
	healthdetail.ClickOnInlineSaveButton();
	Thread.sleep(2000);
	healthdetail.VerifyHaveYouEverbeenErrorMSG();
	healthdetail.EnterHaveYouEverBeenDate1(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.EnterProcedure1(HadReccurence);
	healthdetail.EnterLocation1(HadReccurence);
	healthdetail.EnterResult1(HadReccurence);
	healthdetail.ClickOnInlineSaveButton();
	Thread.sleep(2000);
	healthdetail.ClickOnAddButton1haveYouEverBeen();
	healthdetail.EnterHaveYouEverBeenDate2(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.EnterProcedure2(HadReccurence);
	healthdetail.EnterLocation2(HadReccurence);
	healthdetail.EnterResult2(HadReccurence);
	healthdetail.ClickOnInlineSaveButton();
	Thread.sleep(2000);
	healthdetail.ClickOnAddButton2haveYouEverBeen();
	healthdetail.EnterHaveYouEverBeenDate3(DateOfLastDay, DateOfLastMonth, DateOfLastYear);
	healthdetail.EnterProcedure3(HadReccurence);
	healthdetail.EnterLocation3(HadReccurence);
	healthdetail.EnterResult3(HadReccurence);
	healthdetail.ClickOnInlineSaveButton();
	Thread.sleep(2000);
	healthdetail.VerifyAdditionalInformation();
	healthdetail.ClickOnSubmitButton();
	
}
@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-90 ||Verify dependent questions when one/multiple sub ailments selected by user                                                                * Muscle Disorder\r\n"
		+ "* Bone Fracture"
		+ "TEST-90 ||Verify error message when \"current symptoms\" field left blank and proceed"
		+ "TEST-90 ||Verify error message when \"Doctor Details\" field left blank and proceed"
		+ "TEST-90 ||Verify error message when \"Date of Diagnosis\" field left blank and proceed"
		+ "TEST-90 ||Verify \"Date of diagnosis\" field can't be set as future date."
		+ "TEST-90 ||Verify error message when \"Date of Last consultation\" field left blank and proceed."
		+ "TEST-90 ||Verify \"Date of last consultation\" field can't be set as future date."
		+ "TEST-90 ||Verify error message when \"Details of hospitalization\" field left blank and proceed"
		+ "TEST-90 ||Verify text limitation of \"Current Symptoms\", \"Doctor's Details\", \"Details of  hospitalisation\"")
public void VerifyMedicalAilmentsQuestion7MuscleDisorderAndBoneFractureWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,
		String ClickOnForFemaleOnly, String NoOfWeek, String ClickOnHaveYouSufferFrom,String 	ClickOnAilments,String 	DisplayAllAilment,
		String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(3000);
	WebElement CurrentsysEle1 = driver.findElement(By.xpath("//div[contains(text(),'Spouse Health')]"));
	wait.waitForElementToBeVisibleweb(driver, CurrentsysEle1, 30, "Element is not Display");
	TestUtil.scrollToElement(driver, CurrentsysEle1);
	Thread.sleep(2000);
	healthdetail.ClickonAilment(ClickOnAilments);
	WebElement scrollEle = driver.findElement(By.xpath("//div[contains(text(),'EYE / EAR')]"));
	TestUtil.scrollToElement(driver, scrollEle);
	Thread.sleep(2000);
	healthdetail.ClickonAilmentArthritisCheckbox();
	Thread.sleep(2000);
	String[] ListOfValueTextfieldupdateNew = DisplayAllAilment.split(",");
	for (int i = 0; i <= ListOfValueTextfieldupdateNew.length - 1; i++) {
		healthdetail.ClickOnAllTab(ListOfValueTextfieldupdateNew[i]);
	}
	WebElement firstEle1 = driver.findElement(By.xpath("//input[contains(@id,'8129.0.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle1);
	Thread.sleep(2000);
	healthdetail.BlankValueMuscleDisorder();
	healthdetail.VerifyMuscleDisorderErrorMSG();
	healthdetail.EnterMuscleDisorderCuurentSymptoms(HadReccurence);
	healthdetail.EnterMuscleDisorderDoctorDetails(HadReccurence);
	healthdetail.EnterMuscleDisorderDateOfLastConsult("15052023");
	healthdetail.EnterMuscleDisorderDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterMuscleDisorderDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterMuscleDisorderDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterMuscleDisorderHospitalization(HadReccurence);
	WebElement firstEle2 = driver.findElement(By.xpath("//input[contains(@id,'8129.1.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle2);
	Thread.sleep(2000);
	healthdetail.BlankValueBonefracture();
	healthdetail.VerifyBonefractureErrorMSG();
	healthdetail.EnterBonefractureCuurentSymptoms(HadReccurence);
	healthdetail.EnterBonefractureDoctorDetails(HadReccurence);
	healthdetail.EnterBonefractureDateOfLastConsult("15052023");
	healthdetail.EnterBonefractureDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterBonefractureDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterBonefractureDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterBonefractureHospitalization(HadReccurence);
	Thread.sleep(2000);
	
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClicMedicalHistorySaveContinueBtn();
}
@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-90 ||Verify Ailment 9 i.e. EYE and EAR  and dependent sub ailment / questionnaire"
		+ "TEST-90 ||Verify dependent questions when one/multiple sub ailments selected by user"
		+ "TEST-90 ||Verify error message when \"current symptoms\" field left blank and proceed"
		+ "TEST-90 ||Verify error message when \"Doctor Details\" field left blank and proceed"
		+ "TEST-90 ||Verify error message when \"Date of Diagnosis\" field left blank and proceed"
		+ "TEST-90 ||Verify \"Date of diagnosis\" field can't be set as future date."
		+ "TEST-90 ||Verify error message when \"Date of Last consultation\" field left blank and proceed."
		+ "TEST-90 ||Verify \"Date of last consultation\" field can't be set as future date."
		+ "TEST-90 ||Verify error message when \"Details of hospitalization\" field left blank and proceed"
		+ "TEST-90 ||Verify text limitation of \"Current Symptoms\", \"Doctor's Details\", \"Details of  hospitalisation\"")
public void VerifyMedicalAilmentsQuestion8EyeEarWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,
		String ClickOnForFemaleOnly, String NoOfWeek, String ClickOnHaveYouSufferFrom,String 	ClickOnAilments,String 	DisplayAllAilment,
		String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(3000);
	WebElement CurrentsysEle1 = driver.findElement(By.xpath("//div[contains(text(),'Spouse Health')]"));
	wait.waitForElementToBeVisibleweb(driver, CurrentsysEle1, 30, "Element is not Display");
	TestUtil.scrollToElement(driver, CurrentsysEle1);
	Thread.sleep(2000);
	healthdetail.ClickonAilment(ClickOnAilments);
	Thread.sleep(2000);
	WebElement scrollEle = driver.findElement(By.xpath("//div[contains(text(),'OTHERS')]"));
	TestUtil.scrollToElement(driver, scrollEle);
	Thread.sleep(2000);
	healthdetail.ClickonAilmentEyeEarCheckbox();
	Thread.sleep(2000);
	String[] ListOfValueTextfieldupdateNew = DisplayAllAilment.split(",");
	for (int i = 0; i <= ListOfValueTextfieldupdateNew.length - 1; i++) {
		healthdetail.ClickOnAllTab(ListOfValueTextfieldupdateNew[i]);
	}
	WebElement firstEle1 = driver.findElement(By.xpath("//input[contains(@id,'8130.0.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle1);
	Thread.sleep(2000);
	healthdetail.BlankValueDisorderofeyes();
	healthdetail.VerifyDisorderOfEyesErrorMSG();
	healthdetail.EnterDisorderOfEyesCuurentSymptoms(HadReccurence);
	healthdetail.EnterDisorderOfEyesDoctorDetails(HadReccurence);
	healthdetail.EnterDisorderOfEyesDateOfLastConsult("15052023");
	healthdetail.EnterDisorderOfEyesDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterDisorderOfEyesDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterDisorderOfEyesDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterDisorderOfEyesHospitalization(HadReccurence);
	WebElement firstEle2 = driver.findElement(By.xpath("//input[contains(@id,'8130.1.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle2);
	Thread.sleep(2000);
	healthdetail.BlankValueDisorderofEar();
	healthdetail.VerifyDisorderOfEarErrorMSG();
	healthdetail.EnterDisorderOfEarCuurentSymptoms(HadReccurence);
	healthdetail.EnterDisorderOfEarDoctorDetails(HadReccurence);
	healthdetail.EnterDisorderOfEarDateOfLastConsult("15052023");
	healthdetail.EnterDisorderOfEarDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterDisorderOfEarDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterDisorderOfEarDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterDisorderOfEarHospitalization(HadReccurence);
	Thread.sleep(2000);
	
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClicMedicalHistorySaveContinueBtn();
}

@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-90 ||Verify Ailment 9 i.e. TUMOUR  and dependent sub ailment / questionnaire"
		+ "TEST-90 ||Verify dependent questions when one/multiple sub ailments selected by user"
		+ "TEST-90 ||Verify error message when \"current symptoms\" field left blank and proceed"
		+ "TEST-90 ||Verify error message when \"Doctor Details\" field left blank and proceed"
		+ "TEST-90 ||Verify error message when \"Date of Diagnosis\" field left blank and proceed"
		+ "TEST-90 ||Verify \"Date of diagnosis\" field can't be set as future date."
		+ "TEST-90 ||Verify error message when \"Date of Last consultation\" field left blank and proceed."
		+ "TEST-90 ||Verify \"Date of last consultation\" field can't be set as future date."
		+ "TEST-90 ||Verify error message when \"Details of hospitalization\" field left blank and proceed"
		+ "TEST-90 ||Verify text limitation of \"Current Symptoms\", \"Doctor's Details\", \"Details of  hospitalisation\"")
public void VerifyMedicalAilmentsQuestion9TumorWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,
		String ClickOnForFemaleOnly, String NoOfWeek, String ClickOnHaveYouSufferFrom,String 	ClickOnAilments,String 	DisplayAllAilment,
		String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(3000);
	WebElement CurrentsysEle1 = driver.findElement(By.xpath("//div[contains(text(),'Spouse Health')]"));
	wait.waitForElementToBeVisibleweb(driver, CurrentsysEle1, 30, "Element is not Display");
	TestUtil.scrollToElement(driver, CurrentsysEle1);
	Thread.sleep(2000);
	healthdetail.ClickonAilment(ClickOnAilments);
	Thread.sleep(2000);
	WebElement scrollEle = driver.findElement(By.xpath("//div[contains(text(),'OTHERS')]"));
	TestUtil.scrollToElement(driver, scrollEle);
	Thread.sleep(2000);
	healthdetail.ClickonAilmentTumorCheckbox();
	Thread.sleep(2000);
	String[] ListOfValueTextfieldupdateNew = DisplayAllAilment.split(",");
	for (int i = 0; i <= ListOfValueTextfieldupdateNew.length - 1; i++) {
		healthdetail.ClickOnAllTab(ListOfValueTextfieldupdateNew[i]);
	}
	WebElement firstEle1 = driver.findElement(By.xpath("//input[contains(@id,'8126.0.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle1);
	Thread.sleep(2000);
	healthdetail.BlankValueTumour();
	healthdetail.VerifyTumourErrorMSG();
	healthdetail.EnterTumourCuurentSymptoms(HadReccurence);
	healthdetail.EnterTumourDoctorDetails(HadReccurence);
	healthdetail.EnterTumourDateOfLastConsult("15052023");
	healthdetail.EnterTumourDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterTumourDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterTumourDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterTumourHospitalization(HadReccurence);
	WebElement firstEle2 = driver.findElement(By.xpath("//input[contains(@id,'8126.1.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle2);
	Thread.sleep(2000);
	healthdetail.BlankValueAbnormalGrowth();
	healthdetail.VerifyAbnormalGrowthErrorMSG();
	healthdetail.EnterAbnormalGrowthCuurentSymptoms(HadReccurence);
	healthdetail.EnterAbnormalGrowthDoctorDetails(HadReccurence);
	healthdetail.EnterAbnormalGrowthDateOfLastConsult("15052023");
	healthdetail.EnterAbnormalGrowthDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterAbnormalGrowthDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterAbnormalGrowthDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterAbnormalGrowthHospitalization(HadReccurence);
	Thread.sleep(2000);
	WebElement firstEle3 = driver.findElement(By.xpath("//input[contains(@id,'8126.2.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle3);
	Thread.sleep(2000);
	healthdetail.BlankValueCyst();
	healthdetail.VerifyCystErrorMSG();
	healthdetail.EnterCystCuurentSymptoms(HadReccurence);
	healthdetail.EnterCystDoctorDetails(HadReccurence);
	healthdetail.EnterCystDateOfLastConsult("15052023");
	healthdetail.EnterCystDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterCystDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterCystDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterCystHospitalization(HadReccurence);
	WebElement firstEle4 = driver.findElement(By.xpath("//input[contains(@id,'8126.3.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle4);
	Thread.sleep(2000);
	healthdetail.BlankValueEnlargedglands();
	healthdetail.VerifyEnlargedglandsErrorMSG();
	healthdetail.EnterEnlargedglandsCuurentSymptoms(HadReccurence);
	healthdetail.EnterEnlargedglandsDoctorDetails(HadReccurence);
	healthdetail.EnterEnlargedglandsDateOfLastConsult("15052023");
	healthdetail.EnterEnlargedglandsDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterEnlargedglandsDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterEnlargedglandsDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterEnlargedglandsHospitalization(HadReccurence);
	WebElement firstEle5 = driver.findElement(By.xpath("//input[contains(@id,'8126.4.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle5);
	Thread.sleep(2000);
	healthdetail.BlankValueEnlargedlymphnodes();
	healthdetail.VerifyEnlargedlymphnodesErrorMSG();
	healthdetail.EnterEnlargedlymphnodesCuurentSymptoms(HadReccurence);
	healthdetail.EnterEnlargedlymphnodesDoctorDetails(HadReccurence);
	healthdetail.EnterEnlargedlymphnodesDateOfLastConsult("15052023");
	healthdetail.EnterEnlargedlymphnodesDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterEnlargedlymphnodesDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterEnlargedlymphnodesDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterEnlargedlymphnodesHospitalization(HadReccurence);
	WebElement firstEle6 = driver.findElement(By.xpath("//input[contains(@id,'8126.5.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle6);
	Thread.sleep(2000);
	healthdetail.BlankValueCancerenlargedlymphnodes();
	healthdetail.VerifyCancerenlargedlymphnodesErrorMSG();
	healthdetail.EnterCancerenlargedlymphnodesCuurentSymptoms(HadReccurence);
	healthdetail.EnterCancerenlargedlymphnodesDoctorDetails(HadReccurence);
	healthdetail.EnterCancerenlargedlymphnodesDateOfLastConsult("15052023");
	healthdetail.EnterCancerenlargedlymphnodesDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterCancerenlargedlymphnodesDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterCancerenlargedlymphnodesDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterCancerenlargedlymphnodesHospitalization(HadReccurence);
	
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClicMedicalHistorySaveContinueBtn();
}
@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, description = "TEST-90 ||Verify Ailment 10 i.e. Other Ailments  and dependent sub ailment / questionnaire"
		+ "TEST-90 ||Verify dependent questions when one/multiple sub ailments selected by user"
		+ "TEST-90 ||Verify error message when \"current symptoms\" field left blank and proceed"
		+ "TEST-90 ||Verify error message when \"Doctor Details\" field left blank and proceed"
		+ "TEST-90 ||Verify error message when \"Date of Diagnosis\" field left blank and proceed"
		+ "TEST-90 ||Verify \"Date of diagnosis\" field can't be set as future date."
		+ "TEST-90 ||Verify error message when \"Date of Last consultation\" field left blank and proceed."
		+ "TEST-90 ||Verify \"Date of last consultation\" field can't be set as future date."
		+ "TEST-90 ||Verify error message when \"Details of hospitalization\" field left blank and proceed"
		+ "TEST-90 ||Verify text limitation of \"Current Symptoms\", \"Doctor's Details\", \"Details of  hospitalisation\"")
public void VerifyMedicalAilmentsQuestion10OthersWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,
		String ClickOnForFemaleOnly, String NoOfWeek, String ClickOnHaveYouSufferFrom,String 	ClickOnAilments,String 	DisplayAllAilment,
		String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(3000);
	WebElement CurrentsysEle1 = driver.findElement(By.xpath("//div[contains(text(),'Spouse Health')]"));
	wait.waitForElementToBeVisibleweb(driver, CurrentsysEle1, 30, "Element is not Display");
	TestUtil.scrollToElement(driver, CurrentsysEle1);
	Thread.sleep(2000);
	healthdetail.ClickonAilment(ClickOnAilments);
	Thread.sleep(2000);
	WebElement scrollEle = driver.findElement(By.xpath("//div[contains(text(),'Disorder')]"));
	TestUtil.scrollToElement(driver, scrollEle);
	Thread.sleep(2000);
	healthdetail.ClickonAilmentOtherCheckbox();
	Thread.sleep(2000);
	String[] ListOfValueTextfieldupdateNew = DisplayAllAilment.split(",");
	for (int i = 0; i <= ListOfValueTextfieldupdateNew.length - 1; i++) {
		healthdetail.ClickOnAllTab(ListOfValueTextfieldupdateNew[i]);
	}
	WebElement firstEle1 = driver.findElement(By.xpath("//input[contains(@id,'8131.0.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle1);
	Thread.sleep(2000);
	healthdetail.BlankValueOthersIllness();
	healthdetail.VerifyOthersIllnessErrorMSG();
	healthdetail.EnterOthersIllnessCuurentSymptoms(HadReccurence);
	healthdetail.EnterOthersIllnessDoctorDetails(HadReccurence);
	healthdetail.EnterOthersIllnessDateOfLastConsult("15052023");
	healthdetail.EnterOthersIllnessDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterOthersIllnessDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterOthersIllnessDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterOthersIllnessHospitalization(HadReccurence);
	WebElement firstEle2 = driver.findElement(By.xpath("//input[contains(@id,'8131.1.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle2);
	Thread.sleep(2000);
	healthdetail.BlankValueSurgery();
	healthdetail.VerifySurgeryErrorMSG();
	healthdetail.EnterSurgeryCuurentSymptoms(HadReccurence);
	healthdetail.EnterSurgeryDoctorDetails(HadReccurence);
	healthdetail.EnterSurgeryDateOfLastConsult("15052023");
	healthdetail.EnterSurgeryDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterSurgeryDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterSurgeryDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterSurgeryHospitalization(HadReccurence);
	Thread.sleep(2000);
	WebElement firstEle3 = driver.findElement(By.xpath("//input[contains(@id,'8131.2.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle3);
	Thread.sleep(2000);
	healthdetail.BlankValueAilment();
	healthdetail.VerifyAilmentErrorMSG();
	healthdetail.EnterAilmentCuurentSymptoms(HadReccurence);
	healthdetail.EnterAilmentDoctorDetails(HadReccurence);
	healthdetail.EnterAilmentDateOfLastConsult("15052023");
	healthdetail.EnterAilmentDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterAilmentDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterAilmentDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterAilmentHospitalization(HadReccurence);
	WebElement firstEle4 = driver.findElement(By.xpath("//input[contains(@id,'8131.3.hospitalizationDetails')]"));
	TestUtil.scrollToElement(driver, firstEle4);
	Thread.sleep(2000);
	healthdetail.BlankValueInjury();
	healthdetail.VerifyInjuryErrorMSG();
	healthdetail.EnterInjuryCuurentSymptoms(HadReccurence);
	healthdetail.EnterInjuryDoctorDetails(HadReccurence);
	healthdetail.EnterInjuryDateOfLastConsult("15052023");
	healthdetail.EnterInjuryDateOfDiagnos("16052023");
	healthdetail.VerifyDateFutureErrorMSG3();
	healthdetail.VerifyDateFutureErrorMSG4();
	healthdetail.EnterInjuryDateOfLastConsult(LHBloodDateOfLastConsult);
	healthdetail.EnterInjuryDateOfDiagnos(LHBlooddateOfDiagnos);
	healthdetail.EnterInjuryHospitalization(HadReccurence);
	
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClicMedicalHistorySaveContinueBtn();
}

//===================================bELOW Vijay===================================






@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, 
				description = "User Should be able to login Leap App."
						+ "User should be able to do  Navigate to Family Medicals Under health details page"
						+ "User Should be able to if Father is living, Click on living option then provide the details of 1. Age -Text  2. State of health - Drop down "
						+ "User should be able to as state of health, user is given free text field to enter the same\"\r\n"
						+ "User should get inline error message \\\"xxxx\\"
						+ "Test=88||Validate the user can toggle between Living and Demise"
						+ "Test=88||Validate the  father and mother, the Living/demise question is asked and is mandatory"
						+ "Test=88||Validate if user select no for above members,no need of entyering any details"
						+ "Test=88||Validate that on “Others” chosen as state of health, user is given free text field to enter the same"
						+ "")
public void ValidationHealthOfFamilyFatherLivingWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,
		String ClickOnForFemaleOnly, String NoOfWeek, String ClickOnHaveYouSufferFrom,String 	ClickOnAilments,String 	DisplayAllAilment,
		String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos,String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause,String covidText,String covidDD,String covidMM,String covidYY) throws InterruptedException {
	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
	 		addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	  healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	  Thread.sleep(2000);
	 //driver.findElement(By.xpath("(//div[text()='Demise'])[1]")).click();
	    TestUtil.scrollTillEndOfPage(driver);
		wait.WaitTime2();
	   healthdetail.ClickonSaveAndContinueBTNWeb();
	    healthdetail.ValidationOfFatherLivingInLineErrorMsg();
		wait.WaitTime2();
        healthdetail.ValidationsOfFatherOnFamilyMedicalWeb(FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
    	wait.WaitTime2();
        healthdetail.EnetrFatherStateOfHealthOtherReasonBTNWeb("ABCD");
	 
	 
	 
}


@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, 
				description = "User Should be able to if Father is Demise, Click on Demise option then provide the details of 1. Age at Death-Text 2. Cause of Death - Drop down select any of one as per user *Acidental Death  * Natural Death   * Others)   fields should be reflect in DB."
						+ "User should be able to as state of health, user is given free text field to enter the same\\\"\\r\\n\"\r\n"
						+ "User should get inline error message \\\\\\\"xxxx\\\\"
						+ "Test=88||Validate that on Demise, the age is asked as “Age at death” and reason for death is asked"
						+ "User should be able to Demise, the age is asked as “Age at death” and reason for death is asked.")
public void ValidationHealthOfFamilFatherDemiseWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,
		String ClickOnForFemaleOnly, String NoOfWeek, String ClickOnHaveYouSufferFrom,String 	ClickOnAilments,String 	DisplayAllAilment,
		String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos,String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause,String covidText,
		String covidDD,String covidMM,String covidYY) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
	 		addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);
	

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	wait.WaitTime2();
	driver.findElement(By.xpath("(//div[text()='Demise'])[1]")).click();
	TestUtil.scrollTillEndOfPage(driver);
	wait.WaitTime2();
	healthdetail.ClickonSaveAndContinueBTNWeb();
	wait.WaitTime2();
	healthdetail.ValidationOfFatherDemiseInLineErrorMsg();
	wait.WaitTime2();

	TestUtil.scrollToElement(driver, driver.findElement(By.xpath("//div[text()='Father']")));
	healthdetail.ValidationsOfFatherOnFamilyMedicalWeb(FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
	wait.WaitTime2();
	healthdetail.EnetrFatherCauseOfDeathOtherReasonBTNWeb("Abcdef");
}





@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, 
				description = "User Should be able to if Mother is living, Click on living option then provide the details of 1. Age -Text    2. State of health - Drop down select Drop down select any of one as per user health condition     *Ok/Good  * Cancer  *Diabetes Mellitus *Hyper tension *Neurological  *Heart Problems  * Others-fields should be reflect in DB.\r\n"
						+ "User should be able to as state of health, user is given free text field to enter the same"
						+ "User should get inline error message \"xxxx\""
						+ "Test-88||Validate if user select the Mother---Age,State of Health,Living/Demise should asked this type of question and details should be entered"
						+ "Test-88||Validate the  father and mother, the Living/demise question is asked and is mandatory")
public void ValidationHealthOfFamilyMotherLivingWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,
		String ClickOnForFemaleOnly, String NoOfWeek, String ClickOnHaveYouSufferFrom,String 	ClickOnAilments,String 	DisplayAllAilment,
		String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos,String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause,String covidText,
		String covidDD,String covidMM,String covidYY) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);



	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	wait.WaitTime2();
	 //driver.findElement(By.xpath("(//div[text()='Demise'])[1]")).click();
	 TestUtil.scrollTillEndOfPage(driver);
	 wait.WaitTime2();
	 healthdetail.ClickonSaveAndContinueBTNWeb();
	 wait.WaitTime2();
	 TestUtil.scrollTillEndOfPage(driver);
	 healthdetail.ValidationOfMotherLivingInLineErrorMsg();
	
      healthdetail.ValidationsOfMotherOnFamilyMedicalWeb(FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
     wait.WaitTime2();
	 
}




@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, 
				description = "User Should be able to if Mother is Demise, Click on Demise option then provide the details of  1. Age at Death-Text   2. Cause of Death - Drop down select any of one as per user *Acidental Death  * Natural Death  * Others fields should be reflect in DB."
						+ "User should be able to as state of health, user is given free text field to enter the same"
						+ "User should get inline error message \"xxxx\""
						+ "TEST=88||Validate the  father and mother, the Living/demise question is asked and is mandatory")
public void ValidationHealthOfFamilyMotherDemiseWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,
		String ClickOnForFemaleOnly, String NoOfWeek, String ClickOnHaveYouSufferFrom,String 	ClickOnAilments,String 	DisplayAllAilment,
		String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos,String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause,String covidText,
		String covidDD,String covidMM,String covidYY) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	wait.WaitTime2();
	 //driver.findElement(By.xpath("(//div[text()='Demise'])[1]")).click();
	 TestUtil.scrollTillEndOfPage(driver);
	 wait.WaitTime2();
	 healthdetail.ClickonSaveAndContinueBTNWeb();
	 wait.WaitTime2();
	 TestUtil.scrollTillEndOfPage(driver);
	 healthdetail.ValidationOfMotherDemiseInLineErrorMsg();
	
      healthdetail.ValidationsOfMotherOnFamilyMedicalWeb(FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
     wait.WaitTime2();
	 
	 
}




//============================================================Brother Script By Family Medical=========================



@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, 
				description = "User Should be able to if Brother is living, Click on living option then provide the details of    1. Age -Tex 2. State of health - Drop down select Drop down select any of one as per user health condition  *Ok/Good   * Cancer     *Diabetes Mellitus  *Hyper tension  *Neurological  *Heart Problems  * Others  fields should be reflect in DB."
						+ "User should be  the user can edit the details of an added entry of brother."
						+ "User should be the user can remove an added entry of a brother"
						+ "User should alowe to add upto 5 brothers Max."
						+ "User should not allowes to add the more then 5 brothers "
						+ "User should be able to as state of health, user is given free text field to enter the same"
						+ "User should get inline error message \"xxxx\""
						+ "TEST=88||Validate if user select the Brother==Age,State of Health,Living/Demise should asked this type of question details should be entered"
						+ "TEST=88||Validate if brother/sister is Yes, then below details are captured==this details should be captured \r\n"
						+ "Living/Demise"
						+ "Age"
						+ "State of health"
						+ "TEST=88||Validate  that user can add upto 5 brothers and 5 sisters each at Max"
						+ "TEST=88||Validate that the user can remove an added entry of a brother or sister\"\r\n"
						+ "TEST=88||Validate  that the user can edit the details of an added entry of brother and sister\"\r\n"
						+ "TEST=88||Validate that if brother/sister is added, the age and state of health is captured"
						+ "")
public void ValidationHealthOfFamilyBrotherLivingWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,
		String ClickOnForFemaleOnly, String NoOfWeek, String ClickOnHaveYouSufferFrom,String 	ClickOnAilments,String 	DisplayAllAilment,
		String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos,String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause,String covidText,
		String covidDD,String covidMM,String covidYY) throws InterruptedException {


	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);


	
	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	 wait.WaitTime2();
	 TestUtil.scrollTillEndOfPage(driver);
	 wait.WaitTime2();
	 healthdetail.ClickonAddBrotherBTNWeb();
	 wait.WaitTime2();
	// driver.findElement(By.xpath("(//div[text()='Demise'])[3]")).click();
	 TestUtil.scrollTillEndOfPage(driver);
	 wait.WaitTime2();
	 healthdetail.ClickonSaveBrotherAndSisterBTNWeb();
	 wait.WaitTime2();
	 healthdetail.ValidationOfBrotherLivingInLineErrorMsg();
	 wait.WaitTime2();
   	 TestUtil.scrollTillEndOfPage(driver);
	 healthdetail.ValidationsOfBrotherOnFamilyMedicalWeb(FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
	 wait.WaitTime2();
	 healthdetail.ClickonSaveBrotherAndSisterBTNWeb();
	 wait.WaitTime2();
	 healthdetail.ClickonEditBrotherAndSisterBTNWeb();
	 wait.WaitTime2();
	
	     wait.WaitTime2();
		 healthdetail.ClickonSaveBrotherAndSisterBTNWeb();
		 wait.WaitTime2();
		 healthdetail.ClickonRemoveBrotherAndSisterBTNWeb();
		 TestUtil.scrollTillEndOfPage(driver);
		 healthdetail.ClickonAddBrotherBTNWeb();
		 wait.WaitTime2();
	 for(int i=1;i<=5;i++) {
	 healthdetail.ValidationsOfBrotherOnFamilyMedicalWeb(FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
	 healthdetail.ClickonSaveBrotherAndSisterBTNWeb();
	 if(i==1) {
		 wait.WaitTime2();
		 healthdetail.ClickonMultiAddBrotherBTNWeb();
		 TestUtil.scrollTillEndOfPage(driver);
	 }
	 if(i==2) {
		 wait.WaitTime2();
		 healthdetail.ClickonMultiAddBrotherBTNWeb();
		 TestUtil.scrollTillEndOfPage(driver);
	 }
	 if(i==3) {
		 wait.WaitTime2();
		 healthdetail.ClickonMultiAddBrotherBTNWeb();
		 TestUtil.scrollTillEndOfPage(driver);
	 }
	 if(i==4) {
		 wait.WaitTime2();
		 healthdetail.ClickonMultiAddBrotherBTNWeb();
		 TestUtil.scrollTillEndOfPage(driver);
	 }
	 

	 
	 }
	
}


@Test(groups = {"web" }, dataProvider = "HealthDetailDataProviderNew", dataProviderClass = DataProviders.class, 
				description = "User Should be able to if Brother is Demise, Click on Demise option then provide the details of 1. Age at Death-Text   2. Cause of Death - Drop down select any of one as per user *Acidental Death  * Natural Death  * Others   fields should be reflect in DB."
						+ "User should be able to as state of health, user is given free text field to enter the same"
						+ "")
public void ValidationHealthOfFamilyBrotherDemiseWeb(String userName, String passWord, String leadID,
		String mobileNumber, String panNumber, String day, String month, String year, String IFSCCode, String AccountNo,
		String PaymentMethod, String PreferredDrawDate, String SourceOfFunds, String nomiFirstName, String nimiLastName,
		String nomiday, String nomimonth, String nomiyear, String genderValue, String relationshipValue,
		String shareValue, String removeMSG, String addressType, String pinCode, String addressOne, String addressTwo,
		String addressThree, String pinCode2, String language, String mobile, String telNo, String Emaild,
		String MaritalStatus, String fatherSpouseName, String motherName, String maidenName, String Qualification,
		String Occupation, String NameOfEmployer, String NatureofBusiness, String TypeOfOrganisation,
		String Designation, String AnnualIncome, String ClickOnhealthDetailTab, String weight, String WaightChange,
		String NoOfChangeWaight, String Narcotics, String ReasonForNarcotic, String Alcohol, String TpeofAlcohol,
		String Quantity, String Frequency, String Tobacco, String TypeofTobacco, String CigrateQuantity,
		String CigrateNoOfYear, String Hazardous, String hazarSelectOption1, String hazaTimeofYear,
		String hazarSelectOption2, String Travell, String AbsentFromWork, String CurrentSymtoms, String DoctorDetails,
		String DateOfLastDay, String DateOfLastMonth, String DateOfLastYear, String DetailsOfHospitalization,
		String ClickonHospitalize, String ClickOnDisorder, String ClickOnSpouseHealth, String ClickOnOtherSymptoms,
		String ClickOnForFemaleOnly, String NoOfWeek, String ClickOnHaveYouSufferFrom,String 	ClickOnAilments,String 	DisplayAllAilment,
		String  StateTheDiagnos,String  ChestPainOther,String  HadReccurence,String  LHBloodDateOfLastConsult,String  LHBlooddateOfDiagnos,String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause,String covidText,
		String covidDD,String covidMM,String covidYY) throws InterruptedException {


	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	
	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	 wait.WaitTime2();
	 TestUtil.scrollTillEndOfPage(driver);
	 wait.WaitTime2();
	 healthdetail.ClickonAddBrotherBTNWeb();
	 wait.WaitTime2();
	// driver.findElement(By.xpath("(//div[text()='Demise'])[3]")).click();
	 TestUtil.scrollTillEndOfPage(driver);
	 wait.WaitTime2();
	 healthdetail.ClickonSaveBrotherAndSisterBTNWeb();
	 wait.WaitTime2();
	 healthdetail.ValidationOfBrotherDemiseInLineErrorMsg();
	 wait.WaitTime2();
   	 TestUtil.scrollTillEndOfPage(driver);
	 healthdetail.ValidationsOfBrotherOnFamilyMedicalWeb(FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
	 wait.WaitTime2();
	 healthdetail.ClickonSaveBrotherAndSisterBTNWeb();
	 wait.WaitTime2();
	 healthdetail.ClickonEditBrotherAndSisterBTNWeb();
	 wait.WaitTime2();
	
	     wait.WaitTime2();
		 healthdetail.ClickonSaveBrotherAndSisterBTNWeb();
		 wait.WaitTime2();
		 healthdetail.ClickonRemoveBrotherAndSisterBTNWeb();
		 TestUtil.scrollTillEndOfPage(driver);
		 healthdetail.ClickonAddBrotherBTNWeb();
		 wait.WaitTime2();
	 for(int i=1;i<=5;i++) {
	 healthdetail.ValidationsOfBrotherOnFamilyMedicalWeb(FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
	 healthdetail.ClickonSaveBrotherAndSisterBTNWeb();
	 if(i==1) {
		 wait.WaitTime2();
		 healthdetail.ClickonMultiAddBrotherBTNWeb();
		 TestUtil.scrollTillEndOfPage(driver);
	 }
	 if(i==2) {
		 wait.WaitTime2();
		 healthdetail.ClickonMultiAddBrotherBTNWeb();
		 TestUtil.scrollTillEndOfPage(driver);
	 }
	 if(i==3) {
		 wait.WaitTime2();
		 healthdetail.ClickonMultiAddBrotherBTNWeb();
		 TestUtil.scrollTillEndOfPage(driver);
	 }
	 if(i==4) {
		 wait.WaitTime2();
		 healthdetail.ClickonMultiAddBrotherBTNWeb();
		 TestUtil.scrollTillEndOfPage(driver);
	 }
	 
		
			 
			 }
		 
	
}



//======================================Sister Script On Family Medical===============================================




@Test(groups = {
		"web" }, dataProvider = "HealthDetailDataProvider", dataProviderClass = DataProviders.class, 
				description = "User Should be able to if Sister1 is living, Click on living option then provide the details of 1. Age -Text 2. State of health - Drop down select Drop down select any of one as per user health condition *Ok/Good     * Cancer   *Diabetes Mellitus   *Hyper tension   *Neurological *Heart Problems   * Others   fields should be reflect in DB."
						+ "User should be able to as state of health, user is given free text field to enter the same"
						+ "User should get inline error message \"xxxx\""
						+ "User should be the user can remove an added entry of a sister"
						+ "User should be  the user can edit the details of an added entry of sister."
						+ "User should alowe to add upto 5 Sister Max."
						+ "User should not allowes to add the more then 5 Sister"
						+ "TEST=88||Validate if user select Sister Age,State of Health,Living/Demise should asked this type of question details should be entered"
						+ "TEST=88||Validate  that user can add upto 5 brothers and 5 sisters each at Max"
						+ "TEST=88||Validate that the user can remove an added entry of a brother or sister"
						+ "TEST=88||Validate  that the user can edit the details of an added entry of brother and sister"
						+ "TEST=88||Validate that if brother/sister is added, the age and state of health is captured"
						+ "")
public void ValidationHealthOfFamilySisterLivingWeb(String userName, String passWord, String leadID,
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
		String FMBSStateAndCause) throws InterruptedException {


	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(2000);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickonAddSisterBTNWeb();
	Thread.sleep(1000);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[text()='Demise'])[3]")).click();
	Thread.sleep(1000);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	/*
	healthdetail.ClickonSaveAndContinueBTNWeb();
	Thread.sleep(1000);
	
	WebElement SisterageErrorMSG = driver.findElement(By.xpath("//p[text()='Please Enter Age']"));
	TestUtil.scrollToElement(driver, SisterageErrorMSG);
	String ErrorValue2 = SisterageErrorMSG.getText();
	if (SisterageErrorMSG.isDisplayed()) {
		TestUtil.verifybgColor(SisterageErrorMSG, driver);
		CustomListner.test.log(LogStatus.INFO,"Successfully Verified  Sister Age  Error MSG ");
	} else {
		CustomListner.test.log(LogStatus.INFO, "Failed to Verified  Sister Age Error MSG");
	}

	Thread.sleep(2000);
	Assert.assertEquals(ErrorValue2, "Please Enter Age");
*/
	Thread.sleep(2000);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(1000);
	healthdetail.ValidationsOfSisterOnFamilyMedicalWeb(FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
	Thread.sleep(2000);
	healthdetail.ClickonSaveBrotherAndSisterBTNWeb();
	Thread.sleep(2000);
	healthdetail.ClickonEditBrotherAndSisterBTNWeb();
	WebElement SisterageReEnter = driver.findElement(By.xpath("(//input[@name='age'])[1]"));
	if (SisterageReEnter.isDisplayed()) {
		SisterageReEnter.click();
		Thread.sleep(2000);
		SisterageReEnter.clear();
		Thread.sleep(2000);
		SisterageReEnter.sendKeys("30");
		Thread.sleep(1000);
		CustomListner.test.log(LogStatus.INFO, "Successfully Display  Sister ReEnter Age on Health Deatails family Medical");
	} else {
		CustomListner.test.log(LogStatus.INFO, "Sister ReEnete rAge is Not Display On Family Medical");
	}
	healthdetail.ClickonSaveBrotherAndSisterBTNWeb();
	Thread.sleep(2000);
	healthdetail.ClickonRemoveBrotherAndSisterBTNWeb();
	Thread.sleep(2000);
	TestUtil.scrollTillEndOfPage(driver);
	healthdetail.ClickonAddSisterBTNWeb();
	Thread.sleep(2000);
	for (int i = 1; i <= 5; i++) {
		healthdetail.ValidationsOfSisterOnFamilyMedicalWeb(FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
		healthdetail.ClickonSaveBrotherAndSisterBTNWeb();
		if (i == 1) {
			Thread.sleep(1000);
			healthdetail.ClickonMultiAddSisterBTNWeb();
			TestUtil.scrollTillEndOfPage(driver);
		}
		if (i == 2) {
			Thread.sleep(1000);
			healthdetail.ClickonMultiAddSisterBTNWeb();
			TestUtil.scrollTillEndOfPage(driver);
		}
		if (i == 3) {
			Thread.sleep(1000);
			healthdetail.ClickonMultiAddSisterBTNWeb();
			TestUtil.scrollTillEndOfPage(driver);
		}
		if (i == 4) {
			Thread.sleep(1000);
			healthdetail.ClickonMultiAddSisterBTNWeb();
			TestUtil.scrollTillEndOfPage(driver);
		}

	}

}






@Test(groups = {"web" }, dataProvider = "HealthDetailDataProvider", dataProviderClass = DataProviders.class, 
				description = "User Should be able to if Sister is Demise, Click on Demise option then provide the details of     1. Age at Death-Text     2. Cause of Death - Drop down select any of one as per user *Acidental Death    * Natural Death   * Others      fields should be reflect in DB."
						+ "User should be able to as state of health, user is given free text field to enter the same"
						+ "User should get inline error message \"xxxx\""
						+ "")
public void ValidationHealthOfFamilySisterDemiseWeb(String userName, String passWord, String leadID, String mobileNumber,
		String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
		String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured,
		String Rideramount, String level, String IFSCCode, String IFSCErrorMSG, String BankName,
		String BankNameErrorMSG, String BranchName, String BranchNameErrorMSG, String AccountNo,
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
		String Gstvalue,String ClickOnhealthDetailTab,String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause) throws InterruptedException {


	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);
	
	
	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(2000);
	 TestUtil.scrollTillEndOfPage(driver);
	 Thread.sleep(2000);
	 healthdetail.ClickonAddSisterBTNWeb();
	 TestUtil.scrollTillEndOfPage(driver);
	 Thread.sleep(2000);
	 /*
	 healthdetail.ClickonSaveAndContinueBTNWeb();
	 Thread.sleep(1000);
	 
	 //This time sister Cause Of Death error Msg No dot Display
	 
	 WebElement SisterCauseOfDeathErrorMSG= driver.findElement(By.xpath("//p[text()='Please Enter Age']"));
	 TestUtil.scrollToElement(driver, SisterCauseOfDeathErrorMSG);
        String ErrorValue2=SisterCauseOfDeathErrorMSG.getText();
         if(SisterCauseOfDeathErrorMSG.isDisplayed()) {
      	   TestUtil.verifybgColor(SisterCauseOfDeathErrorMSG, driver);
      	   CustomListner.test.log(LogStatus.INFO, "Successfully Verified Brother Living Option  Brother Age  Error MSG ");
         }
         else {
      	   CustomListner.test.log(LogStatus.INFO, "Failed to Verified Brother Living Option Brother Age Error MSG");
         }
        
    	 Thread.sleep(2000);
         Assert.assertEquals(ErrorValue2, "Please Enter Age");
        Thread.sleep(2000);
*/
		 TestUtil.scrollTillEndOfPage(driver);
	 healthdetail.ValidationsOfSisterOnFamilyMedicalWeb(FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
	 Thread.sleep(2000);
	 healthdetail.ClickonSaveBrotherAndSisterBTNWeb();
	 Thread.sleep(2000);
	 healthdetail.ClickonEditBrotherAndSisterBTNWeb();
	 WebElement sisageOfdeathReEneter = driver.findElement(By.xpath("//input[@id='ageAtDeath']"));
		if (sisageOfdeathReEneter.isDisplayed()) {
			sisageOfdeathReEneter.click();
			 Thread.sleep(2000);
			 sisageOfdeathReEneter.clear();
			 Thread.sleep(2000);
			 sisageOfdeathReEneter.sendKeys("30");
			Thread.sleep(1000);
			CustomListner.test.log(LogStatus.INFO, "Successfully Display  Sister ReEnter Age of Death on family Medical");
		} else {
			CustomListner.test.log(LogStatus.INFO, "Sister ReEnete Age Of Deathis Not Display On Family Medical");
		}
		 healthdetail.ClickonSaveBrotherAndSisterBTNWeb();
		 Thread.sleep(2000);
		 healthdetail.ClickonRemoveBrotherAndSisterBTNWeb();
		 Thread.sleep(2000);
		 TestUtil.scrollTillEndOfPage(driver);
		 healthdetail.ClickonAddSisterBTNWeb();
		 Thread.sleep(2000);
	 for(int i=1;i<=5;i++) {
		 healthdetail.ValidationsOfSisterOnFamilyMedicalWeb(FMBSLivingDemise, FMBSAgeDeath, FMBSStateAndCause);
		 healthdetail.ClickonSaveBrotherAndSisterBTNWeb();
	 if(i==1) {
			Thread.sleep(1000);
		 healthdetail.ClickonMultiAddSisterBTNWeb();
		 TestUtil.scrollTillEndOfPage(driver);
	 }
	 if(i==2) {
			Thread.sleep(1000);
		 healthdetail.ClickonMultiAddSisterBTNWeb();
		 TestUtil.scrollTillEndOfPage(driver);
	 }
	 if(i==3) {
			Thread.sleep(1000);
		 healthdetail.ClickonMultiAddSisterBTNWeb();
		 TestUtil.scrollTillEndOfPage(driver);
	 }
	 if(i==4) {
			Thread.sleep(1000);
		 healthdetail.ClickonMultiAddSisterBTNWeb();
		 TestUtil.scrollTillEndOfPage(driver);
	 }
	 

	 
	 }
	
}


@Test(groups = {"web" }, dataProvider = "HealthDetailDataProvider", dataProviderClass = DataProviders.class,
				description = "Verify able add the data of Father,Moter,Brother,Sister and navigate to next page and come back to previous page then user wants to change the data, once changes done that should be reflect in DB"
				+ "Should be  able to add the all details under Family medical section navigate to next section go back to previous section which data provided that data must be same."
				+ "TEST=88||Validate after entering all the details " + "TEST=88||Validate the Back Button "
				+ "User should be able to if “No”, entry is not saved or stored or is asked."
				+ "TEST=88||Validate that on “No”, entry is not saved or stored or is asked")
public void UserFillAllDetailsOnHealthFamilyMedicalPageWeb(String userName, String passWord, String leadID,
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
		String FMBSStateAndCause) throws InterruptedException {


	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);


	healthdetail.EnterWeight("40");
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
	
	
	Thread.sleep(2000);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickonRemoveBrotherAndSisterBTNWeb();
	Thread.sleep(2000);
	healthdetail.ClickonSaveAndContinueBTNWeb();
	Thread.sleep(2000);
	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	Thread.sleep(2000);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);

	
	/*
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	 driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		Thread.sleep(2000);
	 driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
		Thread.sleep(2000);
	healthdetail.ClicLifeStyleSaveContinueBtn();
	Thread.sleep(2000);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClicLifeStyleSaveContinueBtn();
	

}
*/
}

//==============================Below Test Script Is Covid 19 page By Vijay===========================================================

@Test(groups = {"web"}, dataProvider = "HealthDetailDataProvider", dataProviderClass = DataProviders.class,
description = "Verify user is able to navigate to Health Details page"
	+ "TEST-89 || Verify user is able to view the following titles on card:\r\n"
	+ "1. Symptoms"
	+ "2. Tests"
	+ "3. Diagnosed"
	+ "4. Covid contact"
	+ "5. Quarantine"
	+ "6. Health"
	+ "7. Past Travel"
	+ "8. Future Travel"
	+ "9. Covid Vaccination"
	+ "10. For Healthy worker Only"
	+ "11. Consent")
public void ValidationOfAllTitleCardAndSymptomsOnCovidPageWeb(String userName, String passWord, String leadID,
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
		String FMBSStateAndCause,String covidText,String covidDD,String covidMM,String covidYY) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	
	 String[] Occupationupdate = covidText.split(",");
    	for (int i = 0; i <= Occupationupdate.length - 1; i++) {
    		healthdetail .VerificationOfAllTitleOnCoividPageWeb(Occupationupdate[i]);
    	}
	

		 String[] Occupationupdate1 = covidDD.split(",");
	    	for (int i = 0; i <= Occupationupdate1.length - 1; i++) {
	    	healthdetail .VerificationOfSymptomsWithinLast14dayOnCoividPageWeb(Occupationupdate1[i]);
	    	}
		
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//TestUtil.scrollTillTOPOfPage(driver);
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//healthdetail.ClickSymptomsCheckBoxweb(covidSymptoms);
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//healthdetail.EnterProvideDetailsOfAnySymptomsWeb(SymptomDetails);
	
}


@Test(groups = {"web"}, dataProvider = "HealthDetailDataProvider", dataProviderClass = DataProviders.class,
description = "TEST-89 || To verify text field is to be limited to 100 characters"
	+ "1. Text field should allow to enter 100 characters\r\n"
	+ "2.Text field should not accept more than 100 characters."
	+ "TEST-89 || The text field should appear if yes is selected and the text field should be mandatory.If value is not entered error msg should display as \"Please enter the details\"."
	+ "TEST-89 || The above question should be in  dependent mandatory."
	+ "")
public void validationOfSymptomsOnCovidPageWeb(String userName, String passWord, String leadID,
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
		String FMBSStateAndCause,String covidText,String covidDD,String covidMM,String covidYY) throws InterruptedException {


	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	healthdetail.ClickSymptomsCoughweb();
		//validation Inline Error Msg Is pending
	healthdetail.EnterProvideDetailsOfAnySymptomsWeb(covidText);
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

	
}



@Test(groups = {"web"}, dataProvider = "HealthDetailDataProvider", dataProviderClass = DataProviders.class,
description = "TEST-89 ||To verify the question is available on page "
	+ "The below question should be available on Covid details page:\"2. Have you been advised to be tested to rule in, or rule out, a diagnosis of novel coronavirus (SARSCoV2/COVID-19)? Or, are you awaiting the result of a test which has already been submitted\r\n"
	+ "for the novel coronavirus (SARSCoV2/COVID-19)?\""
	+ "TEST-89 || The above question should be in mandatory."
	+ "Verify user is able to select \"Yes\" button and text field should appear below. User should be able to fill in the details."
	+ "")
public void validationOfTestsOnCovidPageWeb(String userName, String passWord, String leadID,
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
		String FMBSStateAndCause,String covidText,String covidDD,String covidMM,String covidYY) throws InterruptedException {


	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
    Thread.sleep(2000);

	healthdetail.ClickonTestsYesBTNweb();
	Thread.sleep(2000);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickSaveContinueBtn();
	Thread.sleep(2000);
	healthdetail.validationTestsErrorMSgWebWeb();
	Thread.sleep(2000);
	healthdetail.EnterProvideDetailsOfTestWeb(covidText);
	Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

	
}



@Test(groups = {"web"}, dataProvider = "HealthDetailDataProvider", dataProviderClass = DataProviders.class,
description = "TEST-89 ||The above question should be in mandatory."
	+ "TEST-89 || The below question should be available on Covid details page:\"3. Have you ever tested positive for the novel coronavirus (SARSCoV2/COVID-19)?\""
	+ "TEST-89 || The text field should appear if yes is selected and the DOB field should be mandatory.If value is not entered error msg should display as \"Please enter DOB details\"."
	+ "TEST-89 || If user select yes then \"If yes, provide the date of positive diagnosis.\" should be available above the text box/DOB FIELD"
	+ "Verify user is able to select \"Yes\" button and 3 text field should appear below where user can enter date in the format(\"DD-MM-YYYY) and another card will appear named \"Recovered from covid-19\""
	+ "")
public void validationOfDiagnosedOnCovidPageWeb(String userName, String passWord, String leadID,
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
		String FMBSStateAndCause,String covidText,String covidDD,String covidMM,String covidYY) throws InterruptedException {


	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);

	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
    Thread.sleep(2000);

	healthdetail.ClickonDiagnosedYesBTNweb();
	Thread.sleep(2000);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickSaveContinueBtn();
	Thread.sleep(2000);
	healthdetail.validationDiagnosedDOBErrorMSgWebWeb();
	Thread.sleep(2000);
	healthdetail.fillDOBdetailsPositiveDiagnosisWeb(covidDD, covidMM, covidYY);
	
	
	Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

	
}


@Test(groups = {"web"}, dataProvider = "HealthDetailDataProvider", dataProviderClass = DataProviders.class,
description = "TEST-89 || The above question should be in  dependent mandatory."
	+ "TEST-89 || The below question should be available on Covid details page:\"4. Are you, or have you been in close contact with anyone who has been quarantined or who has been diagnosed with novel coronavirus "
	+ "TEST-89 || The text field should appear if yes is selected and the text field should be mandatory.If value is not entered error msg should display as \"Please enter the details\"."
	+ "TEST-89 || If user select yes then \"If yes, please provide details.\" should be available above the text box"
	+ "TEST-89 || 1. Text field should allow to enter 100 characters\r\n"
	+ "2.Text field should not accept more than 100 characters."
	+ "TEST-89 || "
)
public void validationOfOnCovidContactCovidPageWeb(String userName, String passWord, String leadID,
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
		String FMBSStateAndCause,String covidText,String covidDD,String covidMM,String covidYY) throws InterruptedException {

	new TestFactory().gotoHealthDetailweb(driver, userName, passWord, leadID, mobileNumber, panNumber, day, month, year,
			IFSCCode, AccountNo, PaymentMethod, PreferredDrawDate, SourceOfFunds, nomiFirstName, nimiLastName, nomiday,
			nomimonth, nomiyear, genderValue, relationshipValue, shareValue, addressType, pinCode, addressOne,
			addressTwo, addressThree, language, mobile, telNo, Emaild, MaritalStatus, fatherSpouseName, motherName,
			maidenName, Qualification, Occupation, NameOfEmployer, NatureofBusiness, TypeOfOrganisation, Designation,
			AnnualIncome);
	healthdetail.ClickonHealthDetailsTab(ClickOnhealthDetailTab);
	healthdetail.ClickonCovidContactYesBTNweb();
	Thread.sleep(2000);
	TestUtil.scrollTillEndOfPage(driver);
	Thread.sleep(2000);
	healthdetail.ClickSaveContinueBtn();
	Thread.sleep(2000);
	healthdetail.validationCovidContactErrorMSgWebWeb();
	Thread.sleep(2000);
	
	healthdetail.EnterProvideDetailsOfAnyCovidContactWeb(covidText);
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

	
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

	    }
	
	
	*/
	
}