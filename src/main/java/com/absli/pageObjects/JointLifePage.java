package com.absli.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.absli.Listner.CustomListner;
import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import util.TestUtil;

public class JointLifePage extends TestBase {

    public WebDriver driver;
    public AndroidDriver driver1;
    public WaitUtils waitUtils;
    LoginPage loginPage;
    Dashboard dashboard;
    CustomerProfile customerProfile;
    ViewQuote viewQuote;
    PlanInfo planInfo;
    JointLifePage jointLifePage;
    AddressPage addressPage;
    //PersonalInfo personalInfo;


    // Initializing the Page Objects:
    public JointLifePage(AndroidDriver driver1) {
        this.driver1 = driver1;
        waitUtils = new WaitUtils();

    }

    public JointLifePage(WebDriver driver) {
        this.driver = driver;
        waitUtils = new WaitUtils();
    }

    public JointLifePage(IOSDriver driver) {
        this.driver2 = driver;
        waitUtils = new WaitUtils();
    }


    /**
     * Methods and locators start here
     */

    public void clickNextBtn(){
        WebElement nextBtn= driver.findElement(By.xpath("//button[@name='NEXT']"));
        waitUtils.waitforElementToBeClickable(driver, nextBtn, 100);
        nextBtn.click();

    }

    public void clickContinueBtn(){
        WebElement continueBtn= driver.findElement(By.xpath("//button[@name='CONTINUE']"));
        waitUtils.waitforElementToBeClickable(driver, continueBtn, 100);
        continueBtn.click();

    }


    public void clickDoItLater(){
        WebElement doItLaterBtn= driver.findElement(By.xpath("//button[@name='DO IT LATER']"));
        waitUtils.waitforElementToBeClickable(driver, doItLaterBtn, 100);
        doItLaterBtn.click();

    }

    public void clickDoItLaterBtn(){
        WebElement doItLaterBtn= driver.findElement(By.xpath("//button[@name='DO IT LATER ']"));
        waitUtils.waitforElementToBeClickable(driver, doItLaterBtn, 100);
        doItLaterBtn.click();

    }

    public void clickDoItLaterBTN(){
        WebElement doItLaterBtn= driver.findElement(By.xpath("//button[@name='DO IT LATER']"));
        waitUtils.waitforElementToBeClickable(driver, doItLaterBtn, 100);
        doItLaterBtn.click();

    }

//    public static void scrollToWebElement(WebDriver driver, WebElement element) {
//		WebElement ele =driver.findElement(By.xpath("//div[text()='VERIFY']"));
//		Actions a = new Actions(driver);
//		a.moveToElement(ele).build().perform();
//	}

    public void fillDOBdetailsWeb(String DAY, String MONTH, String YEAR) {
        WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[@name='day']"));
        waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
        eleDOBDayInput.click();
        eleDOBDayInput.sendKeys(DAY);
        CustomListner.test.log(LogStatus.INFO, "Enter Day  Value As =====>"+DAY);
        WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[@name='month']"));
        waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
        eleDOBMonthInput.clear();
        eleDOBMonthInput.sendKeys(MONTH);
        CustomListner.test.log(LogStatus.INFO, "Enter month  Value As =====>"+MONTH);
        eleDOBMonthInput.sendKeys(Keys.TAB);
        WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[@name='year']"));
        waitUtils.waitforElementToBeClickable(driver,eleDOBYearInput,100);
        eleDOBYearInput.clear();
        eleDOBYearInput.sendKeys(YEAR);
        CustomListner.test.log(LogStatus.INFO, "Enter year  Value As =====>"+YEAR);
        // eleDOBYearInput.sendKeys(Keys.ENTER);
    }

    public void clickSaveBTN(){
        WebElement saveBtn= driver.findElement(By.xpath("//div[text()='SAVE']"));
        waitUtils.waitforElementToBeClickable(driver, saveBtn, 100);
        saveBtn.click();
    }


    public void clickLaterBTN(){
        WebElement doItaterBtn= driver.findElement(By.xpath("(//button[@name='DO IT LATER'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, doItaterBtn, 100);
        doItaterBtn.click();
    }
    //***************************************Address*******************************************//

    public void enterPinWeb(String pinCode){
        WebElement  pinCodeInputWeb =driver.findElement(By.xpath("(//input[@id='pinCodeId'])[1]"));
        waitUtils.waitforElementToBeClickable(driver,pinCodeInputWeb,100);
        if(pinCodeInputWeb.isDisplayed()){
            pinCodeInputWeb.sendKeys(pinCode);
            CustomListner.test.log(LogStatus.INFO, "Enter Pincode  Value As =====>"+pinCode);
        }
        else {
            CustomListner.test.log(LogStatus.FAIL, "pincide is not displayed");
        }
    }

//    public void varifyPrimaryddressOneWeb(String addressOne){
//        WebElement  validAddressOne =driver.findElement(By.xpath("(//input[@id='add1Id'])[1]"));
//        waitUtils.waitforElementToBeClickable(driver,validAddressOne,100);
//        if(validAddressOne.isDisplayed()){
//        	validAddressOne.sendKeys(addressOne);
//            CustomListner.test.log(LogStatus.INFO, "Enter Addeass1  Value As =====>"+addressOne);
//           }
//        else {
//        	CustomListner.test.log(LogStatus.FAIL, "Address1 is not displayed");
//        }
//    }
//

    public void isSelectedCheckboxWeb() {
        WebElement Checkbox = driver.findElement(By.xpath("//input[@name=\"isSameAsComAdd\"]"));
        if(Checkbox.isSelected()) {
            CustomListner.test.log(LogStatus.INFO, "Checkbox is selected");
        }
        else {
            CustomListner.test.log(LogStatus.FAIL, "Checkbox is Not selected");
        }
    }

    public void unselectCheckboxWeb() {
        WebElement Checkbox = driver.findElement(By.xpath("//input[@name=\"isSameAsComAdd\"]"));
        if(Checkbox.isSelected()) {
            Checkbox.click();
            CustomListner.test.log(LogStatus.INFO, "click on checkbox ");
        }
        else {
            CustomListner.test.log(LogStatus.FAIL, "not click on checkbox");
        }
    }

    public void enterPerAddPinCodeWeb(String pinCode2){
        WebElement  pinCodeInputWeb =driver.findElement(By.xpath("//input[@id=\"perAddPinId\"]"));
        waitUtils.waitforElementToBeClickable(driver,pinCodeInputWeb,100);
        if(pinCodeInputWeb.isDisplayed()){
            pinCodeInputWeb.click();
            pinCodeInputWeb.clear();
            pinCodeInputWeb.sendKeys(pinCode2);
            CustomListner.test.log(LogStatus.INFO, "Enter Pincode  Value As =====>"+pinCode2);
        }
        else {
            CustomListner.test.log(LogStatus.FAIL, "pincide is not displayed");
        }
    }

    public void validationAddressOneWeb(String addressOne){
        WebElement  validAddressOne =driver.findElement(By.xpath("//input[@name='perAdd1Id']"));
        waitUtils.waitforElementToBeClickable(driver,validAddressOne,100);
        if(validAddressOne.isDisplayed()){
            validAddressOne.sendKeys(addressOne);
            CustomListner.test.log(LogStatus.INFO, "Enter Addeass1  Value As =====>"+addressOne);
        }
        else {
            CustomListner.test.log(LogStatus.FAIL, "Address1 is not displayed");
        }
    }

    public void validationAddressTwoWeb(String addressTwo){
        WebElement  validAddressTwo =driver.findElement(By.xpath("//input[@name='perAdd2Id']"));
        waitUtils.waitforElementToBeClickable(driver,validAddressTwo,100);
        if(validAddressTwo.isDisplayed()){
            validAddressTwo.sendKeys(addressTwo);
            CustomListner.test.log(LogStatus.INFO, "Enter Addeass2  Value As =====>"+addressTwo);
        }
        else {
            CustomListner.test.log(LogStatus.FAIL, "Address2 is not displayed");
        }
    }

    public void validationAddressThreeWeb(String addressThree){
        WebElement  validAddressThree =driver.findElement(By.xpath("//input[@name='perAdd3Id']"));
        waitUtils.waitforElementToBeClickable(driver,validAddressThree,100);
        if(validAddressThree.isDisplayed()){
            validAddressThree.sendKeys(addressThree);
            CustomListner.test.log(LogStatus.INFO, "Enter Addeass3  Value As =====>"+addressThree);
        }
        else {
            CustomListner.test.log(LogStatus.FAIL, "Address3 is not displayed");
        }
    }

    public void selectPreferredLangWeb(String args) throws InterruptedException{
        WebElement language = driver.findElement(By.xpath("//div[@aria-labelledby=\"languageId\"]"));
        waitUtils.waitforElementToBeClickable(driver, language, 100);
        language.click();

        if(args.equalsIgnoreCase("English")){
            Thread.sleep(2000);
            WebElement eng = driver.findElement(By.xpath("//li[@data-value=\"English\"]"));
            waitUtils.waitforElementToBeClickable(driver, eng, 100);
            eng.click();
            CustomListner.test.log(LogStatus.INFO, "click on English option");
        }
        else if(args.equalsIgnoreCase("Hindi")) {

            WebElement hindi = driver.findElement(By.xpath("//li[@data-value=\"Hindi\"]"));
            waitUtils.waitforElementToBeClickable(driver, hindi, 100);
            hindi.click();
            CustomListner.test.log(LogStatus.INFO, "click on Hindi option");
        }
    }

    public void selectAlternateMobileNoWeb(String mobile){
        WebElement  mobileNo =driver.findElement(By.xpath("//input[@id=\"mobNumId\"]"));
        waitUtils.waitforElementToBeClickable(driver,mobileNo,100);
        if(mobileNo.isDisplayed()){
            mobileNo.sendKeys(mobile);
            CustomListner.test.log(LogStatus.INFO, "Enter mobile No. As =====>"+mobile);
        }
        else {
            CustomListner.test.log(LogStatus.FAIL, "Mobile No. is not displayed");
        }
    }

    public void selectTelPhoneNoWeb(String telNo){
        WebElement  TelNo =driver.findElement(By.xpath("//input[@id=\"resTelNO\"]"));
        waitUtils.waitforElementToBeClickable(driver,TelNo,100);
        if(TelNo.isDisplayed()){
            TelNo.sendKeys(telNo);
            CustomListner.test.log(LogStatus.INFO, "Enter TelNo. Value As =====>"+telNo);
        }
        else {
            CustomListner.test.log(LogStatus.FAIL, "TelNo. is not displayed");
        }
    }

    public void ClickAddressNEXTBTNWeb() {
        WebElement next = driver.findElement(By.xpath("//span[text()='NEXT']"));
        if(next.isDisplayed()) {
            next.click();

            CustomListner.test.log(LogStatus.INFO, "Click on Address NEXT BTN ");
        }
        else {
            CustomListner.test.log(LogStatus.FAIL, "Address NEXT BTN is Not Display");
        }
    }

    //*************************************Personal Info****************************************//

    public void  EnterPrimaryEmailIdweb(String emailid) {
        WebElement email=  driver.findElement(By.xpath("(//input[@id=\"emailId\"])[1]"));
        waitUtils.waitForElementToBeVisibleweb(driver, email, 30, "Element is Not Display");
        if(email.isDisplayed()) {
            email.sendKeys(emailid);
            email.sendKeys(Keys.TAB);
            CustomListner.test.log(LogStatus.INFO, "Enter Email ID As=====>"+emailid);
        }else {
            CustomListner.test.log(LogStatus.INFO, "Enter Email ID is Not Display");
        }
    }

    public void  EnterPrimaryInvalidEmailIdweb(String emailtextError) {
        WebElement emailTextError=  driver.findElement(By.xpath("//p[@id='emailId-helper-text']"));
        waitUtils.waitforElementToBeClickable(driver, emailTextError, 30);
        if (emailTextError.isDisplayed()) {
            String emailvalue = emailTextError.getText();
            //TestUtil.verifybgrolor(emailTextError, driver);
            Assert.assertEquals(emailvalue, emailTextError);
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Email id Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Email id Error Msg");
        }

    }

    public void clickVerifiedGreenTick(){
        WebElement greenTick= driver.findElement(By.xpath("(//img[@class='verified-tick'])[1]"));
        //waitUtils.waitforElementToBeClickable(driver, greenTick, 100);
        greenTick.isSelected();
    }

    public void  EnterPrimaryMaritalStatusweb(String marital) {
        WebElement maritalstatus=  driver.findElement(By.xpath("(//Button[@value='married'])[1]"));
        waitUtils.waitForElementToBeVisibleweb(driver, maritalstatus, 30, "Element is Not Display");
        if(maritalstatus.isDisplayed()) {
            maritalstatus.click();
            CustomListner.test.log(LogStatus.INFO, "Enter marital status As=====>"+marital);
        }else {
            CustomListner.test.log(LogStatus.INFO, "marital Status is Not Display");
        }
    }

    public void  EnterPrimaryFatherSpaouseNameweb(String fatherSpouse) {
        WebElement fatherspouse=  driver.findElement(By.xpath("(//input[@name='fatherSpouseName'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, fatherspouse, 30);
        if(fatherspouse.isDisplayed()) {
            fatherspouse.sendKeys(fatherSpouse);
            CustomListner.test.log(LogStatus.INFO, "Enter Father/Spaouse Name As=====>"+fatherSpouse);
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Father/Spaouse Name is Not Display");
        }
    }

    public void  EnterPrimaryMotherNameweb(String mothername) {
        WebElement motherele=  driver.findElement(By.xpath("(//input[@name='motherName'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, motherele, 30);
        if(motherele.isDisplayed()) {
            motherele.sendKeys(mothername);
            CustomListner.test.log(LogStatus.INFO, "Enter Mother Name As=====>"+mothername);
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Mother Name is Not Display");
        }
    }

    public void  EnterPrimaryMaidenNameweb(String maidenname) {
        WebElement maidenele=  driver.findElement(By.xpath("(//input[@name='maidenName'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, maidenele, 30);
        if(maidenele.isDisplayed()) {
            maidenele.sendKeys(maidenname);
            CustomListner.test.log(LogStatus.INFO, "Enter Maiden Name As=====>"+maidenname);
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Maiden Name is Not Display");
        }
    }

    public void VerifyPrimaryFathernameweb(String fatherSpouseNameErrorMsg) throws InterruptedException {
        WebElement fathertextError = driver.findElement(By.xpath("//p[@id='fatherSpouseName-helper-text']"));
        waitUtils.waitforElementToBeClickable(driver, fathertextError, 30);
        if (fathertextError.isDisplayed()) {
            String fathervalue = fathertextError.getText();
            TestUtil.verifybgColor(fathertextError, driver);
            Assert.assertEquals(fathervalue, fatherSpouseNameErrorMsg);
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Father Name And Spouse Name Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Father Name And Spouse Name Error Msg");
        }

    }

    public void VerifyPrimaryMothernameweb(String motherErrorMsg) throws InterruptedException {
        WebElement mothertextError = driver.findElement(By.xpath("//p[@id='motherName-helper-text']"));
        waitUtils.waitforElementToBeClickable(driver, mothertextError, 30);
        if (mothertextError.isDisplayed()) {
            String mothervalue = mothertextError.getText();
            TestUtil.verifybgColor(mothertextError, driver);
            Assert.assertEquals(mothervalue, motherErrorMsg);
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Mother Name Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Mother Name Error Msg");
        }

    }

    public void VerifyPrimaryMaidennameweb(String maidenErrorMsg) throws InterruptedException {
        WebElement maidentextError = driver.findElement(By.xpath("//p[text()='Please enter Maiden name']"));
        waitUtils.waitforElementToBeClickable(driver, maidentextError, 30);
        if (maidentextError.isDisplayed()) {
            String maidenvalue = maidentextError.getText();
            TestUtil.verifybgColor(maidentextError, driver);
            Assert.assertEquals(maidenvalue, maidentextError);
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Maiden Name Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Maiden Name Error Msg");
        }

    }

    public void ClickEiaWantToApplyBtn() throws InterruptedException {
        WebElement Ele1=driver.findElement(By.xpath("(//button[@name='1'])[1]"));
        waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
        Ele1.isDisplayed();
        Ele1.click();
    }

    public void EnterEiaAccWantToApplyBtn(String eiaVal) throws InterruptedException {
        WebElement Ele1=driver.findElement(By.xpath("(//button[@name='1'])[1]"));
        waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
        if (Ele1.isDisplayed()) {
            Ele1.click();

            WebElement Ele2 = driver.findElement(By.xpath("//div[@id='mui-component-select-5']"));
            waitUtils.waitforElementToBeClickable(driver, Ele2, 100);

            if (Ele2.isDisplayed()) {
                Ele2.click();

                if(eiaVal.equalsIgnoreCase("Karvy Insurance Repository")){
                    Thread.sleep(2000);
                    WebElement ele = driver.findElement(By.xpath("//span[text()='Karvy Insurance Repository']"));
                    waitUtils.waitforElementToBeClickable(driver, ele, 100);
                    ele.click();
                    CustomListner.test.log(LogStatus.INFO, "click on Karvy Insurance Repository option");
                }
                else if(eiaVal.equalsIgnoreCase("National Insurance Policy Repository")) {

                    WebElement ele = driver.findElement(By.xpath("//span[text()='National Insurance Policy Repository']"));
                    waitUtils.waitforElementToBeClickable(driver, ele, 100);
                    ele.click();
                    CustomListner.test.log(LogStatus.INFO, "click on National Insurance Policy Repository option");
                }
                else if(eiaVal.equalsIgnoreCase("Central Insurance Repository Limited")) {

                    WebElement ele = driver.findElement(By.xpath("//span[text()='Central Insurance Repository Limited']"));
                    waitUtils.waitforElementToBeClickable(driver, ele, 100);
                    ele.click();
                    CustomListner.test.log(LogStatus.INFO, "click on Central Insurance Repository Limited option");
                }
                else if(eiaVal.equalsIgnoreCase("CAMS Insurance Repository Limited ")) {

                    WebElement ele = driver.findElement(By.xpath("//span[text()='CAMS Insurance Repository Limited ']"));
                    waitUtils.waitforElementToBeClickable(driver, ele, 100);
                    ele.click();
                    CustomListner.test.log(LogStatus.INFO, "click on CAMS Insurance Repository Limited  option");
                }
            }
        }

    }

    public void ClickOnYesBtnPoliticallyExposedPerson() throws InterruptedException {
        WebElement Ele1=driver.findElement(By.xpath("(//button[@name='2'])[1]"));
        waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
        Ele1.isDisplayed();
        Ele1.click();
    }

    public void ClickOnYesBtnStateProposerToBeInsuredOrNomineeArePoliticallyExposedPerson(String val) throws InterruptedException {
        WebElement Ele1=driver.findElement(By.xpath("(//button[@name='2'])[1]"));
        waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
        if (Ele1.isDisplayed()) {
            Ele1.click();
            WebElement Ele2=driver.findElement(By.xpath("//input[@name='6']"));
            waitUtils.waitForElementToBeVisibleweb(driver, Ele2, 20, "Element is Not Display");
            if (Ele2.isDisplayed()) {
                Ele2.click();
                Ele2.sendKeys(val);
                CustomListner.test.log(LogStatus.INFO, "Enter Tumour Doctor Details As=====>"+val);
            }

        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Tumour of eyes Doctor Details TextBox");
        }

    }

    public void ClickOnYesBtnForQueGstLaw() throws InterruptedException {
        WebElement Ele1=driver.findElement(By.xpath("(//button[@name='36'])[1]"));
        waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
        Ele1.isDisplayed();
        Ele1.click();
    }

    public void ClickOnYesBtnForQueAreYouRegisteredPersonUnderGstLaw(String num) throws InterruptedException {
        WebElement Ele1=driver.findElement(By.xpath("(//button[@name='36'])[1]"));
        waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
        if (Ele1.isDisplayed()) {
            Ele1.click();
            WebElement Ele2=driver.findElement(By.xpath("//input[@name='37']"));
            waitUtils.waitForElementToBeVisibleweb(driver, Ele2, 20, "Element is Not Display");
            if (Ele2.isDisplayed()) {
                Ele2.click();
                Ele2.sendKeys(num);

                CustomListner.test.log(LogStatus.INFO, "Enter Tumour Doctor Details As=====>"+num);
            }

        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Tumour of eyes Doctor Details TextBox");
        }

    }

    public void VerifyPrimaryEiaAccWantToApplyweb(String eiaErrorMsg) throws InterruptedException {
        WebElement eiatextError = driver.findElement(By.xpath("(//p[text()='Please enter this field'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, eiatextError, 30);
        if (eiatextError.isDisplayed()) {
            String eiavalue = eiatextError.getText();
            TestUtil.verifybgColor(eiatextError, driver);
            Assert.assertEquals(eiavalue, eiatextError);
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified EIA Question Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Verified EIA Question Error Msg");
        }

    }

    public void VerifyPoliticallyExposedPersonErrorMsgweb(String errorMsg2) throws InterruptedException {
        WebElement error = driver.findElement(By.xpath("(//p[text()='Please enter this field'])[2]"));
        waitUtils.waitforElementToBeClickable(driver, error, 30);
        if (error.isDisplayed()) {
            String S = error.getText();
            TestUtil.verifybgColor(error, driver);
            Assert.assertEquals(S, error);
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Error Msg");
        }

    }

    public void VerifyGstRegistrationNoErrorMsgweb(String errorMsg3) throws InterruptedException {
        WebElement error = driver.findElement(By.xpath("(//p[text()='Please enter this field'])[8]"));
        waitUtils.waitforElementToBeClickable(driver, error, 30);
        if (error.isDisplayed()) {
            String S = error.getText();
            TestUtil.verifybgColor(error, driver);
            Assert.assertEquals(S, error);
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified GST Registration no.Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Verified GST Registration no.Error Msg");
        }

    }

    public void VerifyQualificationErrorMsgweb(String errorMsg4) throws InterruptedException {
        WebElement error = driver.findElement(By.xpath("//p[text()='Please enter Qualification']"));
        waitUtils.waitforElementToBeClickable(driver, error, 30);
        if (error.isDisplayed()) {
            String S = error.getText();
            TestUtil.verifybgColor(error, driver);
            Assert.assertEquals(S, error);
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Qualification Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Qualification Error Msg");
        }

    }


    public void  SelectPrimaryQualificationweb(String qualification) throws InterruptedException {
        WebElement qualificationele=  driver.findElement(By.xpath("//div[@id='mui-component-select-23']"));
        waitUtils.waitforElementToBeClickable(driver, qualificationele, 100);
        qualificationele.click();
        CustomListner.test.log(LogStatus.INFO, "click on Qualification dropDown");
        Thread.sleep(3000);
        WebElement selecttext = driver.findElement(By.xpath("//ul//li/span[text()='"+qualification+"']"));
        waitUtils.waitforElementToBeClickable(driver, selecttext, 100);
        selecttext.click();
        CustomListner.test.log(LogStatus.INFO, "Select Values As=====>"+qualification);

    }

    public void  SelectOccupationweb(String occupation) throws InterruptedException {
        WebElement occupationele=  driver.findElement(By.xpath("//div[@id='mui-component-select-24']"));
        waitUtils.waitforElementToBeClickable(driver, occupationele, 100);
        occupationele.click();
        CustomListner.test.log(LogStatus.INFO, "click on Occupation dropDown");
        Thread.sleep(3000);
        WebElement selecttext = driver.findElement(By.xpath("//ul//li/span[text()='"+occupation+"']"));
        waitUtils.waitforElementToBeClickable(driver, selecttext, 100);
        selecttext.click();
        CustomListner.test.log(LogStatus.INFO, "Select Values As=====>"+occupation);

    }

    public void  EnterOccupationNameofEmployeeweb(String nameofemployee) throws InterruptedException {
        WebElement nameofemployeeele=  driver.findElement(By.xpath("//input[@placeholder='Name of Employer']"));
        waitUtils.waitforElementToBeClickable(driver, nameofemployeeele, 30);
        if(nameofemployeeele.isDisplayed()) {
            nameofemployeeele.sendKeys(nameofemployee);
            CustomListner.test.log(LogStatus.INFO, "Enter Name Of Employee As=====>"+nameofemployee);
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Name Of Employee is Not Display");
        }

    }

    public void  EnterOccupationNatureofbusinessweb(String natureofbusiness) throws InterruptedException {
        WebElement natureofbusinessele=  driver.findElement(By.xpath("//input[@placeholder='Nature of Business/Duties']"));
        waitUtils.waitforElementToBeClickable(driver, natureofbusinessele, 30);
        if(natureofbusinessele.isDisplayed()) {
            natureofbusinessele.sendKeys(natureofbusiness);
            CustomListner.test.log(LogStatus.INFO, "Enter Nature of business/Duties As=====>"+natureofbusiness);
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Nature of business/Duties is Not Display");
        }

    }

    public void  selectOccupationTypeofOrganisationweb(String typeoforganisation) throws InterruptedException {
        WebElement typeoforganisationsele=  driver.findElement(By.xpath("(//div[@id='mui-component-select-29'])"));
        waitUtils.waitforElementToBeClickable(driver, typeoforganisationsele, 100);
        typeoforganisationsele.click();
        CustomListner.test.log(LogStatus.INFO, "click on Type of Organisation DropDown");
        Thread.sleep(3000);
        WebElement selecttext=  driver.findElement(By.xpath("//ul//li/span[text()='"+typeoforganisation+"']"));
        waitUtils.waitforElementToBeClickable(driver, selecttext, 100);
        selecttext.click();
        CustomListner.test.log(LogStatus.INFO, "Select Value As=====>"+typeoforganisation);


    }

    public void  EnterOccupationDesignationweb(String Designation) throws InterruptedException {
        WebElement Designationsele=  driver.findElement(By.xpath("(//input[@name='30'])"));
        waitUtils.waitforElementToBeClickable(driver, Designationsele, 30);
        if(Designationsele.isDisplayed()) {
            Designationsele.sendKeys(Designation);
            CustomListner.test.log(LogStatus.INFO, "Enter Designation As=====>"+Designation);
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Designation is Not Display");
        }

    }

    public void  EnterOccupationAnnualIncomeweb(String annualincome) throws InterruptedException {
        WebElement AnnualIncomeele=  driver.findElement(By.xpath("(//input[@placeholder='Annual Income'])"));
        waitUtils.waitforElementToBeClickable(driver, AnnualIncomeele, 30);
        if(AnnualIncomeele.isDisplayed()) {
            AnnualIncomeele.sendKeys(annualincome);
            CustomListner.test.log(LogStatus.INFO, "Enter Annual Income As=====>"+annualincome);
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Annual Income is Not Display");
        }

    }

    public void VerifyNameOfEmployerErrorMsgweb(String errorMsg5) throws InterruptedException {
        WebElement error = driver.findElement(By.xpath("(//p[text()='Please enter this field'])[3]"));
        waitUtils.waitforElementToBeClickable(driver, error, 30);
        if (error.isDisplayed()) {
            String S = error.getText();
            TestUtil.verifybgColor(error, driver);
            Assert.assertEquals(S, error);
            CustomListner.test.log(LogStatus.INFO, "Successfully Name of Employer Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Name of Employer Error Msg");
        }

    }

    public void VerifyNatureOfBusinessErrorMsgweb(String errorMsg6) throws InterruptedException {
        WebElement error = driver.findElement(By.xpath("(//p[text()='Please enter this field'])[4]"));
        waitUtils.waitforElementToBeClickable(driver, error, 30);
        if (error.isDisplayed()) {
            String S = error.getText();
            TestUtil.verifybgColor(error, driver);
            Assert.assertEquals(S, error);
            CustomListner.test.log(LogStatus.INFO, "Successfully Nature of Business/Duties Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Nature of Business/Duties Error Msg");
        }

    }

    public void VerifyTypeOfOrganizationErrorMsgweb(String errorMsg7) throws InterruptedException {
        WebElement error = driver.findElement(By.xpath("(//p[text()='Please enter this field'])[5]"));
        waitUtils.waitforElementToBeClickable(driver, error, 30);
        if (error.isDisplayed()) {
            String S = error.getText();
            TestUtil.verifybgColor(error, driver);
            Assert.assertEquals(S, error);
            CustomListner.test.log(LogStatus.INFO, "Successfully Nature of Business/Duties Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Nature of Business/Duties Error Msg");
        }

    }

    public void VerifyDesignationErrorMsgweb(String errorMsg8) throws InterruptedException {
        WebElement error = driver.findElement(By.xpath("(//p[text()='Please enter this field'])[6]"));
        waitUtils.waitforElementToBeClickable(driver, error, 30);
        if (error.isDisplayed()) {
            String S = error.getText();
            TestUtil.verifybgColor(error, driver);
            Assert.assertEquals(S, error);
            CustomListner.test.log(LogStatus.INFO, "Successfully Nature of Business/Duties Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Nature of Business/Duties Error Msg");
        }

    }

    public void VerifyAnnualIncomeErrorMsgweb(String errorMsg9) throws InterruptedException {
        WebElement error = driver.findElement(By.xpath("(//p[text()='Please enter this field'])[7]"));
        waitUtils.waitforElementToBeClickable(driver, error, 30);
        if (error.isDisplayed()) {
            String S = error.getText();
            TestUtil.verifybgColor(error, driver);
            Assert.assertEquals(S, error);
            CustomListner.test.log(LogStatus.INFO, "Successfully Nature of Business/Duties Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Nature of Business/Duties Error Msg");
        }

    }



    public void clickAddSpouseDetailBTN(){
        WebElement addSpouseBtn= driver.findElement(By.xpath("//button[@name='Add Spouse Details']"));
        waitUtils.waitforElementToBeClickable(driver, addSpouseBtn, 100);
        addSpouseBtn.click();

    }

    //****************************************Spouse Personal Info******************************************//

    public void  EnterSpouseEmailIdweb(String spouseEmailid) {
        WebElement email=  driver.findElement(By.xpath("(//input[@id='emailId'])[2]"));
        waitUtils.waitForElementToBeVisibleweb(driver, email, 30, "Element is Not Display");
        if(email.isDisplayed()) {
            email.sendKeys(spouseEmailid);
            email.sendKeys(Keys.TAB);
            CustomListner.test.log(LogStatus.INFO, "Enter Email ID As=====>"+spouseEmailid);
        }else {
            CustomListner.test.log(LogStatus.INFO, "Enter Email ID is Not Display");
        }
    }

    public void  EnterSpouseFatherSpaouseNameweb(String spouseFatherName) {
        WebElement fatherspouse=  driver.findElement(By.xpath("(//input[@id='fatherSpouseName'])[2]"));
        waitUtils.waitforElementToBeClickable(driver, fatherspouse, 30);
        if(fatherspouse.isDisplayed()) {
            fatherspouse.sendKeys(spouseFatherName);
            CustomListner.test.log(LogStatus.INFO, "Enter Father/Spaouse Name As=====>"+spouseFatherName);
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Father/Spaouse Name is Not Display");
        }
    }

    public void  EnterSpouseMotherNameweb(String spouseMotherName) {
        WebElement motherele=  driver.findElement(By.xpath("(//input[@id='motherName'])[2]"));
        waitUtils.waitforElementToBeClickable(driver, motherele, 30);
        if(motherele.isDisplayed()) {
            motherele.sendKeys(spouseMotherName);
            CustomListner.test.log(LogStatus.INFO, "Enter Mother Name As=====>"+spouseMotherName);
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Mother Name is Not Display");
        }
    }

    public void EnterSpouseEiaAccWantToApplyBtn(String spouseEiaVal) throws InterruptedException {
        WebElement Ele1=driver.findElement(By.xpath("(//button[@name='1'])[3]"));
        waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
        if (Ele1.isDisplayed()) {
            Ele1.click();

            WebElement Ele2 = driver.findElement(By.xpath("(//div[@id='mui-component-select-5'])[2]"));
            waitUtils.waitforElementToBeClickable(driver, Ele2, 100);

            if (Ele2.isDisplayed()) {
                Ele2.click();

                if(spouseEiaVal.equalsIgnoreCase("Karvy Insurance Repository")){
                    Thread.sleep(2000);
                    WebElement ele = driver.findElement(By.xpath("//span[text()='Karvy Insurance Repository']']"));
                    waitUtils.waitforElementToBeClickable(driver, ele, 100);
                    ele.click();
                    CustomListner.test.log(LogStatus.INFO, "click on Karvy Insurance Repository option");
                }
                else if(spouseEiaVal.equalsIgnoreCase("National Insurance Policy Repository")) {

                    WebElement ele = driver.findElement(By.xpath("(//span[text()='National Insurance Policy Repository'])[2]"));
                    waitUtils.waitforElementToBeClickable(driver, ele, 100);
                    ele.click();
                    CustomListner.test.log(LogStatus.INFO, "click on National Insurance Policy Repository option");
                }
                else if(spouseEiaVal.equalsIgnoreCase("Central Insurance Repository Limited")) {

                    WebElement ele = driver.findElement(By.xpath("//span[text()='Central Insurance Repository Limited']"));
                    waitUtils.waitforElementToBeClickable(driver, ele, 100);
                    ele.click();
                    CustomListner.test.log(LogStatus.INFO, "click on Central Insurance Repository Limited option");
                }
                else if(spouseEiaVal.equalsIgnoreCase("CAMS Insurance Repository Limited ")) {

                    WebElement ele = driver.findElement(By.xpath("//span[text()='CAMS Insurance Repository Limited ']"));
                    waitUtils.waitforElementToBeClickable(driver, ele, 100);
                    ele.click();
                    CustomListner.test.log(LogStatus.INFO, "click on CAMS Insurance Repository Limited  option");
                }
            }
        }

    }

    public void ClickOnSpouseYesBtnStateProposerToBeInsuredOrNomineeArePoliticallyExposedPerson(String val2) throws InterruptedException {
        WebElement Ele1=driver.findElement(By.xpath("(//button[@name='2'])[3]"));
        waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
        if (Ele1.isDisplayed()) {
            Ele1.click();
            WebElement Ele2=driver.findElement(By.xpath("(//input[@name='6'])[2]"));
            waitUtils.waitForElementToBeVisibleweb(driver, Ele2, 20, "Element is Not Display");
            if (Ele2.isDisplayed()) {
                Ele2.click();
                Ele2.sendKeys(val2);
                CustomListner.test.log(LogStatus.INFO, "Enter Tumour Doctor Details As=====>"+val2);
            }

        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Tumour of eyes Doctor Details TextBox");
        }

    }

    public void ClickOnSpouseYesBtnForQueAreYouRegisteredPersonUnderGstLaw(String num1) throws InterruptedException {
        WebElement Ele1=driver.findElement(By.xpath("(//button[@name='36'])[3]"));
        waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
        if (Ele1.isDisplayed()) {
            Ele1.click();
            WebElement Ele2=driver.findElement(By.xpath("(//input[@name='37'])[2]"));
            waitUtils.waitForElementToBeVisibleweb(driver, Ele2, 20, "Element is Not Display");
            if (Ele2.isDisplayed()) {
                Ele2.click();
                Ele2.sendKeys(num1);

                CustomListner.test.log(LogStatus.INFO, "Enter Tumour Doctor Details As=====>"+num1);
            }

        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Tumour of eyes Doctor Details TextBox");
        }

    }

    public void  SelectSpouseQualificationweb(String spouseQualification) throws InterruptedException {
        WebElement qualificationele=  driver.findElement(By.xpath("(//div[@id='mui-component-select-23'])[2]"));
        waitUtils.waitforElementToBeClickable(driver, qualificationele, 100);
        qualificationele.click();
        CustomListner.test.log(LogStatus.INFO, "click on Qualification dropDown");
        Thread.sleep(3000);
        WebElement selecttext = driver.findElement(By.xpath("//ul//li/span[text()='"+spouseQualification+"']"));
        waitUtils.waitforElementToBeClickable(driver, selecttext, 100);
        selecttext.click();
        CustomListner.test.log(LogStatus.INFO, "Select Values As=====>"+spouseQualification);

    }

    public void  SelectSpouseOccupationweb(String spouseOccupation) throws InterruptedException {
        WebElement occupationele=  driver.findElement(By.xpath("(//div[@id='mui-component-select-24'])[2]"));
        waitUtils.waitforElementToBeClickable(driver, occupationele, 100);
        occupationele.click();
        CustomListner.test.log(LogStatus.INFO, "click on Occupation dropDown");
        Thread.sleep(3000);
        WebElement selecttext = driver.findElement(By.xpath("//ul//li/span[text()='"+spouseOccupation+"']"));
        waitUtils.waitforElementToBeClickable(driver, selecttext, 100);
        selecttext.click();
        CustomListner.test.log(LogStatus.INFO, "Select Values As=====>"+spouseOccupation);

    }

    public void  EnterSpouseOccupationNameofEmployeeweb(String spousenameofemployee) throws InterruptedException {
        WebElement nameofemployeeele=  driver.findElement(By.xpath("(//input[@placeholder='Name of Employer'])[2]"));
        waitUtils.waitforElementToBeClickable(driver, nameofemployeeele, 30);
        if(nameofemployeeele.isDisplayed()) {
            nameofemployeeele.sendKeys(spousenameofemployee);
            CustomListner.test.log(LogStatus.INFO, "Enter Name Of Employee As=====>"+spousenameofemployee);
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Name Of Employee is Not Display");
        }

    }

    public void  EnterSpouseOccupationNatureofbusinessweb(String spousenatureofbusiness) throws InterruptedException {
        WebElement natureofbusinessele=  driver.findElement(By.xpath("(//input[@placeholder='Nature of Business/Duties'])[2]"));
        waitUtils.waitforElementToBeClickable(driver, natureofbusinessele, 30);
        if(natureofbusinessele.isDisplayed()) {
            natureofbusinessele.sendKeys(spousenatureofbusiness);
            CustomListner.test.log(LogStatus.INFO, "Enter Nature of business/Duties As=====>"+spousenatureofbusiness);
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Nature of business/Duties is Not Display");
        }

    }
    public void  selectSpouseOccupationTypeofOrganisationweb(String spousetypeoforganisation) throws InterruptedException {
        WebElement typeoforganisationsele=  driver.findElement(By.xpath("(//div[@id='mui-component-select-29'])[2]"));
        waitUtils.waitforElementToBeClickable(driver, typeoforganisationsele, 100);
        typeoforganisationsele.click();
        CustomListner.test.log(LogStatus.INFO, "click on Type of Organisation DropDown");
        Thread.sleep(3000);
        WebElement selecttext=  driver.findElement(By.xpath("//ul//li/span[text()='"+spousetypeoforganisation+"']"));
        waitUtils.waitforElementToBeClickable(driver, selecttext, 100);
        selecttext.click();
        CustomListner.test.log(LogStatus.INFO, "Select Value As=====>"+spousetypeoforganisation);


    }

    public void  EnterSpouseOccupationDesignationweb(String spouseDesignation) throws InterruptedException {
        WebElement Designationsele=  driver.findElement(By.xpath("(//input[@name='30'])[2]"));
        waitUtils.waitforElementToBeClickable(driver, Designationsele, 30);
        if(Designationsele.isDisplayed()) {
            Designationsele.sendKeys(spouseDesignation);
            CustomListner.test.log(LogStatus.INFO, "Enter Designation As=====>"+spouseDesignation);
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Designation is Not Display");
        }

    }

    public void  EnterSpouseOccupationAnnualIncomeweb(String spouseAnnualincome) throws InterruptedException {
        WebElement AnnualIncomeele=  driver.findElement(By.xpath("(//input[@name='31'])[2]"));
        waitUtils.waitforElementToBeClickable(driver, AnnualIncomeele, 30);
        if(AnnualIncomeele.isDisplayed()) {
            AnnualIncomeele.sendKeys(spouseAnnualincome);
            CustomListner.test.log(LogStatus.INFO, "Enter Annual Income As=====>"+spouseAnnualincome);
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Annual Income is Not Display");
        }

    }

    public void  ClickOnSpouseSaveAndContinueBtnweb() throws InterruptedException {
        WebElement saveBtn=  driver.findElement(By.xpath("//button[@name='Save & Continue']"));
        waitUtils.waitforElementToBeClickable(driver, saveBtn, 30);
        if(saveBtn.isDisplayed()) {
            saveBtn.click();
            CustomListner.test.log(LogStatus.INFO, "Click on Save & Continue Button ");
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Save & Continue Button is Not Display");
        }

    }

    public void  VerifySpouseEmailIdValidationweb(String spouseEmailtextError) {
        WebElement emailTextError=  driver.findElement(By.xpath("(//p[text()='Unable to verify EMAIL. Please continue with rest of the form'])[2]"));
        waitUtils.waitforElementToBeClickable(driver, emailTextError, 30);
        if (emailTextError.isDisplayed()) {
            String emailvalue = emailTextError.getText();
            //TestUtil.verifybgrolor(emailTextError, driver);
            Assert.assertEquals(emailvalue, emailTextError);
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Email id Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Email id Error Msg");
        }

    }

    public void VerifySpouseFathernameErrorweb(String spouseFatherNameErrorMsg) throws InterruptedException {
        WebElement spousefathertextError = driver.findElement(By.xpath("(//p[@id='fatherSpouseName-helper-text'])"));
        waitUtils.waitforElementToBeClickable(driver, spousefathertextError, 30);
        if (spousefathertextError.isDisplayed()) {
            String fathervalue = spousefathertextError.getText();
            TestUtil.verifybgColor(spousefathertextError, driver);
            Assert.assertEquals(fathervalue, spousefathertextError);
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Father Name And Spouse Name Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Father Name And Spouse Name Error Msg");
        }

    }

    public void VerifySpouseMotherNameErrorWeb(String spouseMotherErrorMsg) throws InterruptedException {
        WebElement spousemothertextError = driver.findElement(By.xpath("(//p[@id='motherName-helper-text'])"));
        waitUtils.waitforElementToBeClickable(driver, spousemothertextError, 30);
        if (spousemothertextError.isDisplayed()) {
            String mothervalue = spousemothertextError.getText();
            TestUtil.verifybgColor(spousemothertextError, driver);
            Assert.assertEquals(mothervalue, spousemothertextError);
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Mother Name Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Mother Name Error Msg");
        }

    }

    public void ClickSpouseEiaWantToApplyBtn() throws InterruptedException {
        WebElement Ele1=driver.findElement(By.xpath("(//button[@name='1'])[3]"));
        waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
        Ele1.isDisplayed();
        Ele1.click();
    }

    public void ClickOnSpouseYesBtnPoliticallyExposedPerson() throws InterruptedException {
        WebElement Ele1=driver.findElement(By.xpath("(//button[@name='2'])[3]"));
        waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
        Ele1.isDisplayed();
        Ele1.click();
    }

    public void ClickOnSpouseYesBtnForQueGstLaw() throws InterruptedException {
        WebElement Ele1=driver.findElement(By.xpath("(//button[@name='36'])[3]"));
        waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
        Ele1.isDisplayed();
        Ele1.click();
    }

    public void VerifySpouseEiaAccWantToApplyweb(String spouseEiaErrorMsg) throws InterruptedException {
        WebElement eiatextError = driver.findElement(By.xpath("(//p[text()='Please enter this field'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, eiatextError, 30);
        if (eiatextError.isDisplayed()) {
            String eiavalue = eiatextError.getText();
            TestUtil.verifybgColor(eiatextError, driver);
            Assert.assertEquals(eiavalue, eiatextError);
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified EIA Question Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Verified EIA Question Error Msg");
        }

    }

    public void VerifySpousePoliticallyExposedPersonErrorMsgweb(String spouseerrorMsg2) throws InterruptedException {
        WebElement error = driver.findElement(By.xpath("(//p[text()='Please enter this field'])[2]"));
        waitUtils.waitforElementToBeClickable(driver, error, 30);
        if (error.isDisplayed()) {
            String S = error.getText();
            TestUtil.verifybgColor(error, driver);
            Assert.assertEquals(S, error);
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Error Msg");
        }

    }

    public void VerifySpouseGstRegistrationNoErrorMsgweb(String spouseerrorMsg3) throws InterruptedException {
        WebElement error = driver.findElement(By.xpath("(//p[text()='Please enter this field'])[3]"));
        waitUtils.waitforElementToBeClickable(driver, error, 30);
        if (error.isDisplayed()) {
            String S = error.getText();
            TestUtil.verifybgColor(error, driver);
            Assert.assertEquals(S, error);
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified GST Registration no.Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Verified GST Registration no.Error Msg");
        }

    }
    //****************************************************************************************//
    public void VerifySpouseQualificationErrorMsgweb(String spouseErrorMsg4) throws InterruptedException {
        WebElement error = driver.findElement(By.xpath("//p[text()='Please enter Qualification']"));
        waitUtils.waitforElementToBeClickable(driver, error, 30);
        if (error.isDisplayed()) {
            String S = error.getText();
            TestUtil.verifybgColor(error, driver);
            Assert.assertEquals(S, error);
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Qualification Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Qualification Error Msg");
        }

    }

    public void VerifySpouseNameOfEmployerErrorMsgweb(String spouseErrorMsg5) throws InterruptedException {
        WebElement error = driver.findElement(By.xpath("//p[text()='Please enter this field'][1]"));
        waitUtils.waitforElementToBeClickable(driver, error, 30);
        if (error.isDisplayed()) {
            String S = error.getText();
            TestUtil.verifybgColor(error, driver);
            Assert.assertEquals(S, error);
            CustomListner.test.log(LogStatus.INFO, "Successfully Name of Employer Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Name of Employer Error Msg");
        }

    }


    public void VerifySpouseNatureOfBusinessErrorMsgweb(String spouseErrorMsg6) throws InterruptedException {
        WebElement error = driver.findElement(By.xpath("(//p[text()='Please enter this field'])[2]"));
        waitUtils.waitforElementToBeClickable(driver, error, 30);
        if (error.isDisplayed()) {
            String S = error.getText();
            TestUtil.verifybgColor(error, driver);
            Assert.assertEquals(S, error);
            CustomListner.test.log(LogStatus.INFO, "Successfully Nature of Business/Duties Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Nature of Business/Duties Error Msg");
        }

    }

    public void VerifySpouseTypeOfOrganizationErrorMsgweb(String spouseErrorMsg7) throws InterruptedException {
        WebElement error = driver.findElement(By.xpath("(//p[text()='Please enter this field'])[3]"));
        waitUtils.waitforElementToBeClickable(driver, error, 30);
        if (error.isDisplayed()) {
            String S = error.getText();
            TestUtil.verifybgColor(error, driver);
            Assert.assertEquals(S, error);
            CustomListner.test.log(LogStatus.INFO, "Successfully Nature of Business/Duties Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Nature of Business/Duties Error Msg");
        }

    }

    public void VerifySpouseDesignationErrorMsgweb(String spouseErrorMsg8) throws InterruptedException {
        WebElement error = driver.findElement(By.xpath("(//p[text()='Please enter this field'])[4]"));
        waitUtils.waitforElementToBeClickable(driver, error, 30);
        if (error.isDisplayed()) {
            String S = error.getText();
            TestUtil.verifybgColor(error, driver);
            Assert.assertEquals(S, error);
            CustomListner.test.log(LogStatus.INFO, "Successfully Nature of Business/Duties Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Nature of Business/Duties Error Msg");
        }

    }

    public void VerifySpouseAnnualIncomeErrorMsgweb(String spouseErrorMsg9) throws InterruptedException {
        WebElement error = driver.findElement(By.xpath("(//p[text()='Please enter this field'])[5]"));
        waitUtils.waitforElementToBeClickable(driver, error, 30);
        if (error.isDisplayed()) {
            String S = error.getText();
            TestUtil.verifybgColor(error, driver);
            Assert.assertEquals(S, error);
            CustomListner.test.log(LogStatus.INFO, "Successfully Nature of Business/Duties Error Msg");
        } else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To Nature of Business/Duties Error Msg");
        }

    }

//**************************************Existing Policy Page********************************************//

    public void VerifyPrimaryExstingPolicyPageWeb() {
        WebElement EleExstingpage=driver.findElement(By.xpath("(//h2[text()='Existing Policy'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, EleExstingpage, 100);
        boolean EleExstingpagePresent = EleExstingpage.isDisplayed();
        if(EleExstingpage.isDisplayed()) {

            CustomListner.test.log(LogStatus.INFO, " Successfully Nevigate To Exsting Policy Page ");
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Exsting Policy Page is not display ");
        }
        Assert.assertTrue(EleExstingpagePresent, "Exsting Page Not Display");
    }


}
