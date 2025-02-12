package com.absli.testcases;

import Utils.TestFactory;
import com.absli.APIData.ApiData;
import com.absli.base.TestBase;
import com.absli.dataproviders.DataProviders;
import com.absli.pageObjects.*;
import com.absli.utils.WaitUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.TestUtil;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class JointLifeTest extends TestBase {

    LoginPage loginPage;
    Dashboard dashboard;
    CustomerProfile customerProfile;
    ViewQuote viewQuote;
    PlanInfo planInfo;
    WaitUtils wait;
    BankDetails bankDetails;
    AddNomineePage addnomineepage;
    JointLifePage jointLifePage;

    public JointLifeTest() {
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
            planInfo = new PlanInfo(TestBase.driver);
            bankDetails = new BankDetails(TestBase.driver);
            addnomineepage = new AddNomineePage(TestBase.driver);
            jointLifePage = new JointLifePage(TestBase.driver);

            wait=new WaitUtils();

        } else if (TestBase.parameterName.equalsIgnoreCase("Android")) {
            loginPage = new LoginPage(TestBase.driver1);
            dashboard = new Dashboard(TestBase.driver1);
            customerProfile = new CustomerProfile(TestBase.driver1);
            viewQuote = new ViewQuote(TestBase.driver1);
            planInfo = new PlanInfo(TestBase.driver1);
            wait=new WaitUtils();
        } else {
            loginPage = new LoginPage(TestBase.driver2);
            dashboard = new Dashboard(TestBase.driver2);
            customerProfile = new CustomerProfile(TestBase.driver2);
            viewQuote = new ViewQuote(TestBase.driver2);
            planInfo = new PlanInfo(TestBase.driver2);
            wait=new WaitUtils();
        }
    }



    @Test(groups = {"web"}, dataProvider ="JointLifeDataProvider", dataProviderClass = DataProviders.class,
            description = "Verify user able to log in leap app.\n" +
                    "Verify able to fill the Complete the Customer Profile milestone by filling the mandatory details.\n" +
                    "Verify user able to fill the lead id field.\n" +
                    "Verify user able to fill the mobile Number\n" +
                    "Verify user able to fill enter pan Number.\n" +
                    "Verify user able to fill DOB.\n" +
                    "opt for the Proper = Insured Journey.\n" +
                    "opt for the Proper != Insured Journey.\n" +
                    "verify user able to selecting the Plan.\n" +
                    "Verify user able to navigate to Quote page.\n" +
                    "Verify user able to see Joint life option in view quote page.\n" +
                    "Verify user able to click on +ADD button on joint life\n" +
                    "Verify Once click on add button then spouse info filed is visible\n" +
                    "Verify user able to add Valid Mobile Number and Valid Pan card Number\n" +
                    "Verify user able to once Mobile number and pan number entered then click on Verify option then trigger out Spouse Details. as per Pan card Number.\n" +
                    "Verify spouse details reflected based on Pan number 1. First Name 2. Last Name. . 3. GENDER\n"+
                    "Verify user able to add the proper date of birth" +
                    "User shoud be  if incorect data of birth then pop up is visible plese provide date of birth document.\n" +
                    "User should be able to click on next button navigate to next page.\n" +
                    "User should be able to wants to change the spouse details then click on remove option and click on add enter spouse details.\n" +
                    "User should be able to click on remove option then filling data should not save."

    )
    public void jointLifeScenario(String userName, String passWord, String leadID, String mobileNumber,
                                     String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
                                     String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured, String Rideramount,
                                     String level , String JointLifeMobileNumber, String JointLifePan, String IFSCCode, String AccountNo, String PaymentMethod,
                                 String nomiFirstName,String nimiLastName, String nomiday, String nomimonth,String nomiyear, String genderValue, String relationshipValue,
                                  String shareValue) throws InterruptedException {
        new TestFactory().jointLife(driver,userName, passWord,leadID, mobileNumber,
                panNumber,  day, month, year, quoteAmount, planOptions,
                smokerNonSmoker,pptOption, term, paymode, AciSumAssured, Rideramount,
                level ,JointLifeMobileNumber,JointLifePan);
   //     wait.WaitTime5();
        //viewQuote.clickselectPlanBtnWeb();
        viewQuote.selectPlanJourneyNewWeb("BSLI Life Shield");
      //  Thread.sleep(2000);
        planInfo.clickPlanInfoBackBtnWeb();
        viewQuote.selectPlanJourneyNewWeb("BSLI Life Shield");
        Thread.sleep(2000);
        viewQuote.viewQuotePageVerifyWeb();
        wait.sleep(2);
        viewQuote.isSmoker(smokerNonSmoker);
        viewQuote.enterSumAssuredWeb(quoteAmount);
        viewQuote.clickJointLifeAddbtn();
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        viewQuote.enterMobileNumber(JointLifeMobileNumber);
        viewQuote.enterPan(JointLifePan);
        viewQuote.clickVerify();
        wait.sleep(4);
        viewQuote.enterSumAssuredWeb("6000000");
        customerProfile.fillDOBdetailsWeb(day, month, year);
        viewQuote.clickSaveJointLife();
        viewQuote.ContinueCapitalWeb();
        bankDetails.InputIFSCCode(IFSCCode);
        bankDetails.EnterAccountNumberField(AccountNo);
        bankDetails.ClickPaymentMethodweb(PaymentMethod);
        bankDetails.ClickSaveButtonweb();
        customerProfile.customerProfileNEXTButtonClick();
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


    }


    @Test(groups = {"web"}, dataProvider ="JointLifeDataProvider2", dataProviderClass = DataProviders.class,
            description = "Verify user able to see permanent address then same as Communication Adress field check box default checked."
                    + "Verify user if not same Communication Adress field then uncheck the check box."
                    + "Verify user able to select on Residential address then enter Pin code/Zip code, provide address details."
                    + "Verify user able to select the Preferred language English/Hindi"
                    + "Verify user able to add the Alternate Mobile Number "
                    + "Verify user able to add the Residence Tel  Number "
                    + "Verify user able to select click on save option provided date should be saved and navigate to next page."
    )
    public void jointLifeScenarioAddressWeb(String userName, String passWord, String leadID, String mobileNumber,
                                            String panNumber, String day, String month, String year, String quoteAmount,
                                            String planOptions,String smokerNonSmoker, String pptOption, String term,
                                            String paymode, String AciSumAssured, String Rideramount, String level,
                                            String JointLifeMobileNumber, String JointLifePan, String DAY, String MONTH,
                                            String YEAR, String pinCode, String pinCode2, String address1, String address2,
                                            String address3, String language, String mobile, String telNo, String emailid,
                                            String marital, String fatherSpouse, String mothername, String maidenname,
                                            String eiaVal, String eiaErrorMsg, String val, String num, String qualification,
                                            String occupation, String nameofemployee, String natureofbusiness, String typeoforganisation,
                                            String Designation, String annualincome, String emailtextError, String fatherSpouseNameErrorMsg,
                                            String motherErrorMsg, String maidenErrorMsg, String errorMsg2, String errorMsg3, String errorMsg4,
                                            String errorMsg5, String errorMsg6, String errorMsg7, String errorMsg8, String errorMsg9,
                                            String spouseEmailid, String spouseFatherName, String spouseMotherName, String spouseEiaVal, String val2,
                                            String num2, String spouseQualification, String spouseOccupation, String spousenameofemployee,
                                            String spousenatureofbusiness, String spousetypeoforganisation, String spouseDesignation, String spouseAnnualincome,
                                            String spouseEmailtextError, String spouseFatherNameErrorMsg, String spouseMotherErrorMsg, String spouseEiaErrorMsg,
                                            String spouseerrorMsg2, String spouseerrorMsg3, String spouseErrorMsg4, String spouseErrorMsg5, String spouseErrorMsg6,
                                            String spouseErrorMsg7, String spouseErrorMsg8, String spouseErrorMsg9)
            throws InterruptedException {
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.fillDOBdetailsWeb(day, month, year);
        customerProfile.customerProfileSaveButtonClick();
        wait.WaitTime2();
        customerProfile.customerProfileNEXTButtonClick();
        wait.WaitTime5();

        viewQuote.selectPlanJourneyNewWeb("BSLI Life Shield");
        Thread.sleep(2000);
        planInfo.clickPlanInfoBackBtnWeb();
        viewQuote.selectPlanJourneyNewWeb("BSLI Life Shield");
        Thread.sleep(2000);
        viewQuote.viewQuotePageVerifyWeb();
        wait.sleep(2);
        viewQuote.isSmoker(smokerNonSmoker);
        viewQuote.enterSumAssuredWeb(quoteAmount);
        Thread.sleep(2000);
        viewQuote.clickJointLifeAddbtn();
        //TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        viewQuote.enterMobileNumber(JointLifeMobileNumber);
        viewQuote.enterPan(JointLifePan);
        Thread.sleep(5000);

        viewQuote.clickVerify();
        Thread.sleep(2000);
        jointLifePage.fillDOBdetailsWeb(DAY, MONTH, YEAR);
        jointLifePage.clickSaveBTN();
        Thread.sleep(2000);
        jointLifePage.clickNextBtn();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        jointLifePage.clickContinueBtn();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        jointLifePage.clickDoItLater();
        Thread.sleep(2000);
        TestUtil.scrollTillEndOfPage(driver);
        jointLifePage.clickDoItLaterBtn();
        Thread.sleep(2000);

        jointLifePage.clickDoItLaterBTN();
        Thread.sleep(2000);
        jointLifePage.enterPinWeb(pinCode);
        Thread.sleep(2000);
        jointLifePage.isSelectedCheckboxWeb();
        jointLifePage.unselectCheckboxWeb();
        jointLifePage.enterPerAddPinCodeWeb(pinCode2);
        jointLifePage.validationAddressOneWeb(address1);
        jointLifePage.validationAddressTwoWeb(address2);
        jointLifePage.validationAddressThreeWeb(address3);
        jointLifePage.selectPreferredLangWeb(language);
        jointLifePage.selectAlternateMobileNoWeb(mobile);
        jointLifePage.selectTelPhoneNoWeb(telNo);
        jointLifePage.ClickAddressNEXTBTNWeb();

    }


    @Test(groups = {"web"}, dataProvider ="JointLifeDataProvider2", dataProviderClass = DataProviders.class,
            description = "Verify user able to add  valid Email id in email id field  under personal info page then it will show green mark"
                    + "Verify user able to add any one of marital status  Single/Married/Divorced/Widowed"
                    + "Verify user able to add Father's Name/Spouse Name."
                    + "Verify user able to add Mother's Name."
                    + "Verify user able to add Madian Name."
                    + "Verify user able to see Qualification  fill the data."
    )
    public void jointLifeScenarioPrimaryPersonalInfoWeb(String userName, String passWord, String leadID, String mobileNumber,
                                                        String panNumber, String day, String month, String year, String quoteAmount,
                                                        String planOptions,String smokerNonSmoker, String pptOption, String term,
                                                        String paymode, String AciSumAssured, String Rideramount, String level,
                                                        String JointLifeMobileNumber, String JointLifePan, String DAY, String MONTH,
                                                        String YEAR, String pinCode, String pinCode2, String address1, String address2,
                                                        String address3, String language, String mobile, String telNo, String emailid,
                                                        String marital, String fatherSpouse, String mothername, String maidenname,
                                                        String eiaVal, String eiaErrorMsg, String val, String num, String qualification,
                                                        String occupation, String nameofemployee, String natureofbusiness, String typeoforganisation,
                                                        String Designation, String annualincome, String emailtextError, String fatherSpouseNameErrorMsg,
                                                        String motherErrorMsg, String maidenErrorMsg, String errorMsg2, String errorMsg3, String errorMsg4,
                                                        String errorMsg5, String errorMsg6, String errorMsg7, String errorMsg8, String errorMsg9,
                                                        String spouseEmailid, String spouseFatherName, String spouseMotherName, String spouseEiaVal, String val2,
                                                        String num2, String spouseQualification, String spouseOccupation, String spousenameofemployee,
                                                        String spousenatureofbusiness, String spousetypeoforganisation, String spouseDesignation, String spouseAnnualincome,
                                                        String spouseEmailtextError, String spouseFatherNameErrorMsg, String spouseMotherErrorMsg, String spouseEiaErrorMsg,
                                                        String spouseerrorMsg2, String spouseerrorMsg3, String spouseErrorMsg4, String spouseErrorMsg5, String spouseErrorMsg6,
                                                        String spouseErrorMsg7, String spouseErrorMsg8, String spouseErrorMsg9)
            throws InterruptedException {
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.fillDOBdetailsWeb(day, month, year);
        customerProfile.customerProfileSaveButtonClick();
        wait.WaitTime2();
        customerProfile.customerProfileNEXTButtonClick();
        wait.WaitTime5();

        viewQuote.selectPlanJourneyNewWeb("BSLI Life Shield");
        Thread.sleep(2000);
        planInfo.clickPlanInfoBackBtnWeb();
        viewQuote.selectPlanJourneyNewWeb("BSLI Life Shield");
        Thread.sleep(2000);
        viewQuote.viewQuotePageVerifyWeb();
        wait.sleep(2);
        viewQuote.isSmoker(smokerNonSmoker);
        viewQuote.enterSumAssuredWeb(quoteAmount);
        Thread.sleep(2000);
        viewQuote.clickJointLifeAddbtn();
        Thread.sleep(2000);
        viewQuote.enterMobileNumber(JointLifeMobileNumber);
        viewQuote.enterPan(JointLifePan);
        Thread.sleep(2000);

        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //((JavascriptExecutor) driver).executeScript("window.scrollTo(0, -document.body.scrollHeight)");

        viewQuote.clickVerify();
        jointLifePage.fillDOBdetailsWeb(DAY, MONTH, YEAR);
        jointLifePage.clickSaveBTN();
        jointLifePage.clickNextBtn();
        jointLifePage.clickContinueBtn();
        jointLifePage.clickDoItLater();
        jointLifePage.clickDoItLaterBtn();
        jointLifePage.clickDoItLaterBTN();
        //jointLifePage.enterPinWeb(pinCode);
        //jointLifePage.isSelectedCheckboxWeb();
        //jointLifePage.unselectCheckboxWeb();
        //jointLifePage.enterPerAddPinCodeWeb(pinCode2);
        //jointLifePage.validationAddressOneWeb(address1);
        //jointLifePage.validationAddressTwoWeb(address2);
        //jointLifePage.validationAddressThreeWeb(address3);
        //jointLifePage.selectPreferredLangWeb(language);
        //jointLifePage.selectAlternateMobileNoWeb(mobile);
        //jointLifePage.selectTelPhoneNoWeb(telNo);
        //jointLifePage.ClickAddressNEXTBTNWeb();
        jointLifePage.clickLaterBTN();
        jointLifePage.EnterPrimaryEmailIdweb(emailid);
        jointLifePage.clickVerifiedGreenTick();
        jointLifePage.EnterPrimaryMaritalStatusweb(marital);
        jointLifePage.EnterPrimaryFatherSpaouseNameweb(fatherSpouse);
        jointLifePage.EnterPrimaryMotherNameweb(mothername);
        jointLifePage.EnterPrimaryMaidenNameweb(maidenname);
        jointLifePage.SelectPrimaryQualificationweb(qualification);
    }

    @Test(groups = {"web"}, dataProvider ="JointLifeDataProvider2", dataProviderClass = DataProviders.class,
            description = "Verify user able to add  valid Email id in email id field  under personal info page then it will show green mark"
                    + "Verify user able to skip the Father's Name/ Spouse Name field, click on save & Continue button and not allow to next page. inline error message shown below the Father's/Spouse Name field. "
                    + "Verify user able to skip the  Mother's Name, Click on Save &Continue button Shouldn't allow the next page. inline error message shown below the Mother's Name/Spouse Name field. "

    )
    public void jointLifeScenarioPrimaryErrorMsgPersonalInfoWeb(String userName, String passWord, String leadID, String mobileNumber,
                                                                String panNumber, String day, String month, String year, String quoteAmount,
                                                                String planOptions,String smokerNonSmoker, String pptOption, String term,
                                                                String paymode, String AciSumAssured, String Rideramount, String level,
                                                                String JointLifeMobileNumber, String JointLifePan, String DAY, String MONTH,
                                                                String YEAR, String pinCode, String pinCode2, String address1, String address2,
                                                                String address3, String language, String mobile, String telNo, String emailid,
                                                                String marital, String fatherSpouse, String mothername, String maidenname,
                                                                String eiaVal, String eiaErrorMsg, String val, String num, String qualification,
                                                                String occupation, String nameofemployee, String natureofbusiness, String typeoforganisation,
                                                                String Designation, String annualincome, String emailtextError, String fatherSpouseNameErrorMsg,
                                                                String motherErrorMsg, String maidenErrorMsg, String errorMsg2, String errorMsg3, String errorMsg4,
                                                                String errorMsg5, String errorMsg6, String errorMsg7, String errorMsg8, String errorMsg9,
                                                                String spouseEmailid, String spouseFatherName, String spouseMotherName, String spouseEiaVal, String val2,
                                                                String num2, String spouseQualification, String spouseOccupation, String spousenameofemployee,
                                                                String spousenatureofbusiness, String spousetypeoforganisation, String spouseDesignation, String spouseAnnualincome,
                                                                String spouseEmailtextError, String spouseFatherNameErrorMsg, String spouseMotherErrorMsg, String spouseEiaErrorMsg,
                                                                String spouseerrorMsg2, String spouseerrorMsg3, String spouseErrorMsg4, String spouseErrorMsg5, String spouseErrorMsg6,
                                                                String spouseErrorMsg7, String spouseErrorMsg8, String spouseErrorMsg9)
            throws InterruptedException {
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.fillDOBdetailsWeb(day, month, year);
        customerProfile.customerProfileSaveButtonClick();
        wait.WaitTime2();
        customerProfile.customerProfileNEXTButtonClick();
        wait.WaitTime5();

        viewQuote.selectPlanJourneyNewWeb("BSLI Life Shield");
        Thread.sleep(2000);
        planInfo.clickPlanInfoBackBtnWeb();
        viewQuote.selectPlanJourneyNewWeb("BSLI Life Shield");
        Thread.sleep(2000);
        viewQuote.viewQuotePageVerifyWeb();
        wait.sleep(5);
        viewQuote.isSmoker(smokerNonSmoker);
        viewQuote.enterSumAssuredWeb(quoteAmount);
        Thread.sleep(2000);
        viewQuote.clickJointLifeAddbtn();
        Thread.sleep(2000);
        viewQuote.enterMobileNumber(JointLifeMobileNumber);
        viewQuote.enterPan(JointLifePan);
        Thread.sleep(2000);
        viewQuote.clickVerify();
        jointLifePage.fillDOBdetailsWeb(DAY, MONTH, YEAR);
        jointLifePage.clickSaveBTN();
        Thread.sleep(2000);
        jointLifePage.clickNextBtn();
        Thread.sleep(2000);
        jointLifePage.clickContinueBtn();
        Thread.sleep(2000);
        jointLifePage.clickDoItLater();
        jointLifePage.clickDoItLaterBtn();
        jointLifePage.clickDoItLaterBTN();
        //jointLifePage.enterPinWeb(pinCode);
        //jointLifePage.isSelectedCheckboxWeb();
        //jointLifePage.unselectCheckboxWeb();
        //jointLifePage.enterPerAddPinCodeWeb(pinCode2);
        //jointLifePage.validationAddressOneWeb(address1);
        //jointLifePage.validationAddressTwoWeb(address2);
        //jointLifePage.validationAddressThreeWeb(address3);
        //jointLifePage.selectPreferredLangWeb(language);
        //jointLifePage.selectAlternateMobileNoWeb(mobile);
        //jointLifePage.selectTelPhoneNoWeb(telNo);
        //jointLifePage.ClickAddressNEXTBTNWeb();
        jointLifePage.clickLaterBTN();
        jointLifePage.EnterPrimaryEmailIdweb(emailid);
        jointLifePage.EnterPrimaryMaritalStatusweb(marital);
        jointLifePage.EnterPrimaryFatherSpaouseNameweb(fatherSpouse);
        jointLifePage.EnterPrimaryMotherNameweb(mothername);
        jointLifePage.EnterPrimaryMaidenNameweb(maidenname);
        jointLifePage.ClickEiaWantToApplyBtn();
        //jointLifePage.EnterEiaAccWantToApplyBtn(eiaVal);
        jointLifePage.ClickOnYesBtnPoliticallyExposedPerson();
        //jointLifePage.ClickOnYesBtnStateProposerToBeInsuredOrNomineeArePoliticallyExposedPerson(val);
        jointLifePage.ClickOnYesBtnForQueGstLaw();
        //jointLifePage.ClickOnYesBtnForQueAreYouRegisteredPersonUnderGstLaw(num);
        //jointLifePage.SelectPrimaryQualificationweb(qualification);
        jointLifePage.SelectOccupationweb(occupation);
        jointLifePage.EnterOccupationNameofEmployeeweb(nameofemployee);
        jointLifePage.EnterOccupationNatureofbusinessweb(natureofbusiness);
        //jointLifePage.selectOccupationTypeofOrganisationweb(typeoforganisation);
        jointLifePage.EnterOccupationDesignationweb(Designation);
        jointLifePage.EnterOccupationAnnualIncomeweb(annualincome);
        jointLifePage.clickAddSpouseDetailBTN();
        //jointLifePage.EnterPrimaryInvalidEmailIdweb(emailtextError);
        jointLifePage.VerifyPrimaryFathernameweb(fatherSpouseNameErrorMsg);
        jointLifePage.VerifyPrimaryMothernameweb(motherErrorMsg);
//        jointLifePage.VerifyPrimaryMaidennameweb(maidenErrorMsg);
//        jointLifePage.VerifyPrimaryEiaAccWantToApplyweb(eiaErrorMsg);
//        jointLifePage.VerifyPoliticallyExposedPersonErrorMsgweb(errorMsg2);
//        jointLifePage.VerifyGstRegistrationNoErrorMsgweb(errorMsg3);
//        TestUtil.scrollTillEndOfPage(driver);
//        Thread.sleep(2000);
//        jointLifePage.VerifyQualificationErrorMsgweb(errorMsg4);
//        Thread.sleep(2000);
//        jointLifePage.VerifyNameOfEmployerErrorMsgweb(errorMsg5);
//        Thread.sleep(2000);
//        jointLifePage.VerifyNatureOfBusinessErrorMsgweb(errorMsg6);
//        Thread.sleep(2000);
//        jointLifePage.VerifyTypeOfOrganizationErrorMsgweb(errorMsg7);
//        Thread.sleep(2000);
//        jointLifePage.VerifyDesignationErrorMsgweb(errorMsg8);
//        Thread.sleep(2000);
//        jointLifePage.VerifyAnnualIncomeErrorMsgweb(errorMsg9);


    }

    @Test(groups = {"web"}, dataProvider ="JointLifeDataProvider2", dataProviderClass = DataProviders.class,
            description = "Verify user able to see EIA account question  Under personal info page, click on want to apply add the data."
                    + "Verify user able to see State whether the Proposer/ To be insured/ Nominee Are Political exposed question click on YES, Provide the proper details."
                    + "Verify user able to see Are you Holding  Citizenship of Any Other Country question Click on YES, provide the data."
                    + "Verify user able to see Are You A Tax Resident of any other country question Click on YES, provide the data."
                    + "Verify user able to see are you registerd person under GST law quetion ? ,when click on yes ,  Provide GST Register number  should be save."
                    + "Verify user able to see Occupation field Add the data it should be save "
                    + "Verify user able to see Name of Employer field under Personal info page add the data it should be save."
                    + "Verify user able to see Nature of Business/Duties field under Personal info page add the date it should be save."
                    + "Verify user able to see Type of organization field under Personal info page add the data it should be save."
                    + "Verify user able to see Designation field under Personal info page add the date it should be save."
                    + "Verify user able to see Annual income field under Personal info page add the date it should be save."



    )
    public void jointLifeScenarioPersonalInfoPageWeb(String userName, String passWord, String leadID, String mobileNumber,
                                                     String panNumber, String day, String month, String year, String quoteAmount,
                                                     String planOptions,String smokerNonSmoker, String pptOption, String term,
                                                     String paymode, String AciSumAssured, String Rideramount, String level,
                                                     String JointLifeMobileNumber, String JointLifePan, String DAY, String MONTH,
                                                     String YEAR, String pinCode, String pinCode2, String address1, String address2,
                                                     String address3, String language, String mobile, String telNo, String emailid,
                                                     String marital, String fatherSpouse, String mothername, String maidenname,
                                                     String eiaVal, String eiaErrorMsg, String val, String num, String qualification,
                                                     String occupation, String nameofemployee, String natureofbusiness, String typeoforganisation,
                                                     String Designation, String annualincome, String emailtextError, String fatherSpouseNameErrorMsg,
                                                     String motherErrorMsg, String maidenErrorMsg, String errorMsg2, String errorMsg3, String errorMsg4,
                                                     String errorMsg5, String errorMsg6, String errorMsg7, String errorMsg8, String errorMsg9,
                                                     String spouseEmailid, String spouseFatherName, String spouseMotherName, String spouseEiaVal, String val2,
                                                     String num2, String spouseQualification, String spouseOccupation, String spousenameofemployee,
                                                     String spousenatureofbusiness, String spousetypeoforganisation, String spouseDesignation, String spouseAnnualincome,
                                                     String spouseEmailtextError, String spouseFatherNameErrorMsg, String spouseMotherErrorMsg, String spouseEiaErrorMsg,
                                                     String spouseerrorMsg2, String spouseerrorMsg3, String spouseErrorMsg4, String spouseErrorMsg5, String spouseErrorMsg6,
                                                     String spouseErrorMsg7, String spouseErrorMsg8, String spouseErrorMsg9)
            throws InterruptedException {
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.fillDOBdetailsWeb(day, month, year);
        customerProfile.customerProfileSaveButtonClick();
        wait.WaitTime2();
        customerProfile.customerProfileNEXTButtonClick();
        wait.WaitTime5();

        viewQuote.selectPlanJourneyNewWeb("BSLI Life Shield");
        Thread.sleep(2000);
        planInfo.clickPlanInfoBackBtnWeb();
        viewQuote.selectPlanJourneyNewWeb("BSLI Life Shield");
        Thread.sleep(2000);
        viewQuote.viewQuotePageVerifyWeb();
        wait.sleep(5);
        viewQuote.isSmoker(smokerNonSmoker);
        viewQuote.enterSumAssuredWeb(quoteAmount);
        Thread.sleep(2000);
        viewQuote.clickJointLifeAddbtn();
        Thread.sleep(2000);
        viewQuote.enterMobileNumber(JointLifeMobileNumber);
        viewQuote.enterPan(JointLifePan);
        Thread.sleep(2000);

        viewQuote.clickVerify();
        jointLifePage.fillDOBdetailsWeb(DAY, MONTH, YEAR);
        jointLifePage.clickSaveBTN();
        jointLifePage.clickNextBtn();
        jointLifePage.clickContinueBtn();
        jointLifePage.clickDoItLater();
        jointLifePage.clickDoItLaterBtn();
        jointLifePage.clickDoItLaterBTN();
//        jointLifePage.enterPinWeb(pinCode);
//        jointLifePage.isSelectedCheckboxWeb();
//        jointLifePage.unselectCheckboxWeb();
//        jointLifePage.enterPerAddPinCodeWeb(pinCode2);
//        jointLifePage.validationAddressOneWeb(address1);
//        jointLifePage.validationAddressTwoWeb(address2);
//        jointLifePage.validationAddressThreeWeb(address3);
//        jointLifePage.selectPreferredLangWeb(language);
//        jointLifePage.selectAlternateMobileNoWeb(mobile);
//        jointLifePage.selectTelPhoneNoWeb(telNo);
//        jointLifePage.ClickAddressNEXTBTNWeb();
        jointLifePage.clickLaterBTN();
        jointLifePage.EnterPrimaryEmailIdweb(emailid);
        jointLifePage.EnterPrimaryMaritalStatusweb(marital);
        jointLifePage.EnterPrimaryFatherSpaouseNameweb(fatherSpouse);
        jointLifePage.EnterPrimaryMotherNameweb(mothername);
        jointLifePage.EnterPrimaryMaidenNameweb(maidenname);
        jointLifePage.EnterEiaAccWantToApplyBtn(eiaVal);
        jointLifePage.ClickOnYesBtnStateProposerToBeInsuredOrNomineeArePoliticallyExposedPerson(val);
        jointLifePage.ClickOnYesBtnForQueAreYouRegisteredPersonUnderGstLaw(num);
        jointLifePage.SelectPrimaryQualificationweb(qualification);
        jointLifePage.SelectOccupationweb(occupation);
        jointLifePage.EnterOccupationNameofEmployeeweb(nameofemployee);
        jointLifePage.EnterOccupationNatureofbusinessweb(natureofbusiness);
        jointLifePage.selectOccupationTypeofOrganisationweb(typeoforganisation);
        jointLifePage.EnterOccupationDesignationweb(Designation);
        jointLifePage.EnterOccupationAnnualIncomeweb(annualincome);
        jointLifePage.clickAddSpouseDetailBTN();

        jointLifePage.EnterSpouseEmailIdweb(spouseEmailid);
        jointLifePage.EnterSpouseFatherSpaouseNameweb(spouseFatherName);
        jointLifePage.EnterSpouseMotherNameweb(spouseMotherName);
        jointLifePage.EnterSpouseEiaAccWantToApplyBtn(spouseEiaVal);
        jointLifePage.ClickOnSpouseYesBtnStateProposerToBeInsuredOrNomineeArePoliticallyExposedPerson(val2);
        jointLifePage.ClickOnSpouseYesBtnForQueAreYouRegisteredPersonUnderGstLaw(num2);
        Thread.sleep(2000);
        jointLifePage.SelectSpouseQualificationweb(spouseQualification);
        Thread.sleep(2000);
        jointLifePage.SelectSpouseOccupationweb(spouseOccupation);
        jointLifePage.EnterSpouseOccupationNameofEmployeeweb(spousenameofemployee);
        jointLifePage.EnterSpouseOccupationNatureofbusinessweb(spousenatureofbusiness);
        jointLifePage.selectSpouseOccupationTypeofOrganisationweb(spousetypeoforganisation);
        jointLifePage.EnterSpouseOccupationDesignationweb(spouseDesignation);
        jointLifePage.EnterSpouseOccupationAnnualIncomeweb(spouseAnnualincome);
        jointLifePage.ClickOnSpouseSaveAndContinueBtnweb();
        jointLifePage.VerifyPrimaryExstingPolicyPageWeb();



    }

    @Test(groups = {"web"}, dataProvider ="JointLifeDataProvider2", dataProviderClass = DataProviders.class,
            description = ""
    )
    public void jointLifeScenarioErrorMsgSpousePersonalInfoPageWeb(String userName, String passWord, String leadID, String mobileNumber,
                                                                   String panNumber, String day, String month, String year, String quoteAmount,
                                                                   String planOptions,String smokerNonSmoker, String pptOption, String term,
                                                                   String paymode, String AciSumAssured, String Rideramount, String level,
                                                                   String JointLifeMobileNumber, String JointLifePan, String DAY, String MONTH,
                                                                   String YEAR, String pinCode, String pinCode2, String address1, String address2,
                                                                   String address3, String language, String mobile, String telNo, String emailid,
                                                                   String marital, String fatherSpouse, String mothername, String maidenname,
                                                                   String eiaVal, String eiaErrorMsg, String val, String num, String qualification,
                                                                   String occupation, String nameofemployee, String natureofbusiness, String typeoforganisation,
                                                                   String Designation, String annualincome, String emailtextError, String fatherSpouseNameErrorMsg,
                                                                   String motherErrorMsg, String maidenErrorMsg, String errorMsg2, String errorMsg3, String errorMsg4,
                                                                   String errorMsg5, String errorMsg6, String errorMsg7, String errorMsg8, String errorMsg9,
                                                                   String spouseEmailid, String spouseFatherName, String spouseMotherName, String spouseEiaVal, String val2,
                                                                   String num2, String spouseQualification, String spouseOccupation, String spousenameofemployee,
                                                                   String spousenatureofbusiness, String spousetypeoforganisation, String spouseDesignation, String spouseAnnualincome,
                                                                   String spouseEmailtextError, String spouseFatherNameErrorMsg, String spouseMotherErrorMsg, String spouseEiaErrorMsg,
                                                                   String spouseerrorMsg2, String spouseerrorMsg3, String spouseErrorMsg4, String spouseErrorMsg5, String spouseErrorMsg6,
                                                                   String spouseErrorMsg7, String spouseErrorMsg8, String spouseErrorMsg9)
            throws InterruptedException {

        new TestFactory().jointLife(driver,userName, passWord,leadID, mobileNumber,
                panNumber,  day, month, year, quoteAmount, planOptions,
              smokerNonSmoker,pptOption, term, paymode, AciSumAssured, Rideramount,
                level ,JointLifeMobileNumber,JointLifePan);
/*
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.fillDOBdetailsWeb(day, month, year);
        customerProfile.customerProfileSaveButtonClick();
        wait.WaitTime2();
        customerProfile.customerProfileNEXTButtonClick();
        wait.WaitTime5();

        viewQuote.selectPlanJourneyNewWeb("BSLI Life Shield");
        Thread.sleep(2000);
        planInfo.clickPlanInfoBackBtnWeb();
        viewQuote.selectPlanJourneyNewWeb("BSLI Life Shield");
        Thread.sleep(2000);
        viewQuote.viewQuotePageVerifyWeb();
        wait.sleep(5);
        viewQuote.isSmoker(smokerNonSmoker);
        viewQuote.enterSumAssuredWeb(quoteAmount);
        Thread.sleep(2000);
        viewQuote.clickJointLifeAddbtn();
        Thread.sleep(2000);
        viewQuote.enterMobileNumber(JointLifeMobileNumber);
        viewQuote.enterPan(JointLifePan);
        Thread.sleep(2000);

        viewQuote.clickVerify();
        jointLifePage.fillDOBdetailsWeb(DAY, MONTH, YEAR);
        jointLifePage.clickSaveBTN();
        jointLifePage.clickNextBtn();
        jointLifePage.clickContinueBtn();*/
        jointLifePage.clickDoItLater();
        jointLifePage.clickDoItLaterBtn();
        jointLifePage.clickDoItLaterBTN();
//        jointLifePage.enterPinWeb(pinCode);
//        jointLifePage.isSelectedCheckboxWeb();
//        jointLifePage.unselectCheckboxWeb();
//        jointLifePage.enterPerAddPinCodeWeb(pinCode2);
//        jointLifePage.validationAddressOneWeb(address1);
//        jointLifePage.validationAddressTwoWeb(address2);
//        jointLifePage.validationAddressThreeWeb(address3);
//        jointLifePage.selectPreferredLangWeb(language);
//        jointLifePage.selectAlternateMobileNoWeb(mobile);
//        jointLifePage.selectTelPhoneNoWeb(telNo);
//        jointLifePage.ClickAddressNEXTBTNWeb();
        jointLifePage.clickLaterBTN();
        jointLifePage.EnterPrimaryEmailIdweb(emailid);
        jointLifePage.EnterPrimaryMaritalStatusweb(marital);
        jointLifePage.EnterPrimaryFatherSpaouseNameweb(fatherSpouse);
        jointLifePage.EnterPrimaryMotherNameweb(mothername);
        jointLifePage.EnterPrimaryMaidenNameweb(maidenname);
        jointLifePage.SelectPrimaryQualificationweb(qualification);
        jointLifePage.SelectOccupationweb(occupation);
        jointLifePage.EnterOccupationNameofEmployeeweb(nameofemployee);
        jointLifePage.EnterOccupationNatureofbusinessweb(natureofbusiness);
        jointLifePage.selectOccupationTypeofOrganisationweb(typeoforganisation);
        jointLifePage.EnterOccupationDesignationweb(Designation);
        jointLifePage.EnterOccupationAnnualIncomeweb(annualincome);
        jointLifePage.clickAddSpouseDetailBTN();

        jointLifePage.EnterSpouseEmailIdweb(spouseEmailid);
        jointLifePage.EnterSpouseFatherSpaouseNameweb(spouseFatherName);
        jointLifePage.EnterSpouseMotherNameweb(spouseMotherName);
        jointLifePage.ClickSpouseEiaWantToApplyBtn();
        jointLifePage.ClickOnSpouseYesBtnPoliticallyExposedPerson();
        jointLifePage.ClickOnSpouseYesBtnForQueGstLaw();
        jointLifePage.SelectSpouseOccupationweb(spouseOccupation);

        jointLifePage.ClickOnSpouseSaveAndContinueBtnweb();
        Thread.sleep(3000);
        jointLifePage.VerifySpouseEmailIdValidationweb(spouseEmailtextError);
        Thread.sleep(2000);
        jointLifePage.VerifySpouseFathernameErrorweb(spouseFatherNameErrorMsg);
        Thread.sleep(2000);
        jointLifePage.VerifySpouseMotherNameErrorWeb(spouseMotherErrorMsg);
        Thread.sleep(2000);
        jointLifePage.VerifySpouseEiaAccWantToApplyweb(spouseEiaErrorMsg);
        Thread.sleep(2000);
        jointLifePage.VerifySpousePoliticallyExposedPersonErrorMsgweb(spouseerrorMsg2);
        Thread.sleep(2000);
        jointLifePage.VerifySpouseGstRegistrationNoErrorMsgweb(spouseerrorMsg3);
        Thread.sleep(2000);
        jointLifePage.VerifySpouseQualificationErrorMsgweb(spouseErrorMsg4);
        Thread.sleep(2000);
        jointLifePage.VerifySpouseNameOfEmployerErrorMsgweb(spouseErrorMsg5);
        Thread.sleep(2000);
        jointLifePage.VerifySpouseNatureOfBusinessErrorMsgweb(spouseErrorMsg6);
        Thread.sleep(2000);
        jointLifePage.VerifySpouseTypeOfOrganizationErrorMsgweb(spouseErrorMsg7);
        Thread.sleep(2000);
        jointLifePage.VerifySpouseDesignationErrorMsgweb(spouseErrorMsg8);
        Thread.sleep(2000);
        jointLifePage.VerifySpouseAnnualIncomeErrorMsgweb(spouseErrorMsg9);

    }

    @Test(groups = {"web"}, dataProvider ="JointLifeDataProvider", dataProviderClass = DataProviders.class,
            description = ""


    )
    public void jointLifeScenarioExistingPolicyPageWeb(String userName, String passWord, String leadID, String mobileNumber,
                                                       String panNumber, String day, String month, String year, String quoteAmount,
                                                       String planOptions,String smokerNonSmoker, String pptOption, String term,
                                                       String paymode, String AciSumAssured, String Rideramount, String level,
                                                       String JointLifeMobileNumber, String JointLifePan, String DAY, String MONTH,
                                                       String YEAR, String pinCode, String pinCode2, String address1, String address2,
                                                       String address3, String language, String mobile, String telNo, String emailid,
                                                       String marital, String fatherSpouse, String mothername, String maidenname,
                                                       String eiaVal, String eiaErrorMsg, String val, String num, String qualification,
                                                       String occupation, String nameofemployee, String natureofbusiness, String typeoforganisation,
                                                       String Designation, String annualincome, String emailtextError, String fatherSpouseNameErrorMsg,
                                                       String motherErrorMsg, String maidenErrorMsg, String errorMsg2, String errorMsg3, String errorMsg4,
                                                       String errorMsg5, String errorMsg6, String errorMsg7, String errorMsg8, String errorMsg9,
                                                       String spouseEmailid, String spouseFatherName, String spouseMotherName, String spouseEiaVal, String val2,
                                                       String num2, String spouseQualification, String spouseOccupation, String spousenameofemployee,
                                                       String spousenatureofbusiness, String spousetypeoforganisation, String spouseDesignation, String spouseAnnualincome,
                                                       String spouseEmailtextError, String spouseFatherNameErrorMsg, String spouseMotherErrorMsg, String spouseEiaErrorMsg,
                                                       String spouseerrorMsg2, String spouseerrorMsg3, String spouseErrorMsg4, String spouseErrorMsg5, String spouseErrorMsg6,
                                                       String spouseErrorMsg7, String spouseErrorMsg8, String spouseErrorMsg9)
            throws InterruptedException {
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.fillDOBdetailsWeb(day, month, year);
        customerProfile.customerProfileSaveButtonClick();
        wait.WaitTime2();
        customerProfile.customerProfileNEXTButtonClick();
        wait.WaitTime5();

        viewQuote.selectPlanJourneyNewWeb("BSLI Life Shield");
        Thread.sleep(2000);
        planInfo.clickPlanInfoBackBtnWeb();
        viewQuote.selectPlanJourneyNewWeb("BSLI Life Shield");
        Thread.sleep(2000);
        viewQuote.viewQuotePageVerifyWeb();
        wait.sleep(5);
        viewQuote.isSmoker(smokerNonSmoker);
        viewQuote.enterSumAssuredWeb(quoteAmount);
        Thread.sleep(2000);
        viewQuote.clickJointLifeAddbtn();
        Thread.sleep(2000);
        viewQuote.enterMobileNumber(JointLifeMobileNumber);
        viewQuote.enterPan(JointLifePan);
        Thread.sleep(2000);

        viewQuote.clickVerify();
        jointLifePage.fillDOBdetailsWeb(DAY, MONTH, YEAR);
        jointLifePage.clickSaveBTN();
        jointLifePage.clickNextBtn();
        jointLifePage.clickContinueBtn();
        jointLifePage.clickDoItLater();
        jointLifePage.clickDoItLaterBtn();
        jointLifePage.clickDoItLaterBTN();
//        jointLifePage.enterPinWeb(pinCode);
//        jointLifePage.isSelectedCheckboxWeb();
//        jointLifePage.unselectCheckboxWeb();
//        jointLifePage.enterPerAddPinCodeWeb(pinCode2);
//        jointLifePage.validationAddressOneWeb(address1);
//        jointLifePage.validationAddressTwoWeb(address2);
//        jointLifePage.validationAddressThreeWeb(address3);
//        jointLifePage.selectPreferredLangWeb(language);
//        jointLifePage.selectAlternateMobileNoWeb(mobile);
//        jointLifePage.selectTelPhoneNoWeb(telNo);
//        jointLifePage.ClickAddressNEXTBTNWeb();
        jointLifePage.clickLaterBTN();
        jointLifePage.EnterPrimaryEmailIdweb(emailid);
        jointLifePage.EnterPrimaryFatherSpaouseNameweb(fatherSpouse);
        jointLifePage.EnterPrimaryMotherNameweb(mothername);
        jointLifePage.EnterPrimaryMaidenNameweb(maidenname);
        jointLifePage.SelectPrimaryQualificationweb(qualification);
        jointLifePage.SelectOccupationweb(occupation);
        jointLifePage.EnterOccupationNameofEmployeeweb(nameofemployee);
        jointLifePage.EnterOccupationNatureofbusinessweb(natureofbusiness);
        jointLifePage.selectOccupationTypeofOrganisationweb(typeoforganisation);
        jointLifePage.EnterOccupationDesignationweb(Designation);
        jointLifePage.EnterOccupationAnnualIncomeweb(annualincome);
        jointLifePage.clickAddSpouseDetailBTN();
        jointLifePage.EnterSpouseEmailIdweb(spouseEmailid);
        jointLifePage.EnterSpouseFatherSpaouseNameweb(spouseFatherName);
        jointLifePage.EnterSpouseMotherNameweb(spouseMotherName);
        jointLifePage.SelectSpouseQualificationweb(spouseQualification);
        jointLifePage.SelectSpouseOccupationweb(spouseOccupation);
        jointLifePage.EnterSpouseOccupationNameofEmployeeweb(spousenameofemployee);
        jointLifePage.EnterSpouseOccupationNatureofbusinessweb(spousenatureofbusiness);
        jointLifePage.selectSpouseOccupationTypeofOrganisationweb(spousetypeoforganisation);
        jointLifePage.EnterSpouseOccupationDesignationweb(spouseDesignation);
        jointLifePage.EnterSpouseOccupationAnnualIncomeweb(spouseAnnualincome);
        jointLifePage.ClickOnSpouseSaveAndContinueBtnweb();
        jointLifePage.VerifyPrimaryExstingPolicyPageWeb();

    }

}

