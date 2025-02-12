package com.absli.pageObjects;

import com.absli.Listner.CustomListner;
import com.absli.base.TestBase;
import com.absli.dataproviders.DataProviders;
import com.absli.utils.WaitUtils;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import util.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class ViewQuote extends TestBase {

    public WebDriver driver;
    public AndroidDriver driver1;
    public IOSDriver driver2;
    public WaitUtils waitUtils;
    LoginPage loginPage;
    Dashboard dashboard;
    CustomerProfile customerProfile;

    // Initializing the Page Objects:
    public ViewQuote(AndroidDriver driver1) {
        this.driver1 = driver1;
        waitUtils = new WaitUtils();
    }

    public ViewQuote(WebDriver driver) {
        this.driver = driver;
        waitUtils = new WaitUtils();
    }

    public ViewQuote(IOSDriver driver) {
        this.driver2 = driver;
        waitUtils = new WaitUtils();
    }
    public void clickselectPlanBtnWeb() {
    	

        WebElement saveWeb = driver.findElement(By.xpath("(//span[text()='Save'])[1]"));
        waitUtils.waitForElementToBeVisibleweb(driver, saveWeb, 30, "Element is Not Display");
        if (saveWeb.isDisplayed()) {
        	saveWeb.click();
            CustomListner.test.log(LogStatus.INFO, "Select Save Button ");
        } else {
        	CustomListner.test.log(LogStatus.FAIL, "Select Save Button is not display");

        }
    	/*
        WebElement selectplanWeb = driver.findElement(By.xpath("(//span[text()=\"SELECT PLAN\"])[1]"));
        waitUtils.waitforElementToBeClickable(driver, selectplanWeb, 30);
        if (selectplanWeb.isDisplayed()) {
            selectplanWeb.click();
            CustomListner.test.log(LogStatus.INFO, "Select Plan Button ");
        } else {
        	CustomListner.test.log(LogStatus.FAIL, "Select plan Button is not display");

        }
        */
    }
  public void clickNextBtnWeb() {
    	

        WebElement nextWeb = driver.findElement(By.xpath("(//span[text()='NEXT'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, nextWeb, 40);
        if (nextWeb.isDisplayed()) {
        	nextWeb.click();
            CustomListner.test.log(LogStatus.INFO, "Select Next Button ");
        } else {
        	CustomListner.test.log(LogStatus.FAIL, "Select Save Button is not display");

        }
  }
    
    
    
    public void ClickonCustomerprofileSaveButton() {
        WebElement selectplanWeb = driver.findElement(By.xpath("(//span[contains(text(),'Save')])[1]"));
        waitUtils.waitforElementToBeClickable(driver, selectplanWeb, 30);
        if (selectplanWeb.isDisplayed()) {
            selectplanWeb.click();
            CustomListner.test.log(LogStatus.INFO, "Click on Save Button");
        } else {
        	CustomListner.test.log(LogStatus.FAIL, "Save button is Not Display");

        }
    }


    public void selectPlanJourneyNewWeb(String args) throws InterruptedException{
        WebElement healthAndPureTermWeb = driver.findElement(By.xpath("//span[text()=\"Health & Pure Term Plans\"]"));
        waitUtils.waitforElementToBeClickable(driver, healthAndPureTermWeb, 100);

        healthAndPureTermWeb.click();
        CustomListner.test.log(LogStatus.INFO, "Select Health & Pure Term Plans");
        waitUtils.WaitTime2();
        if(args.equalsIgnoreCase("BSLI CritiShield Plan")){
        WebElement selectPlanCriti = driver.findElement(By.xpath("//div[text()=\"BSLI CritiShield Plan\"]"));
        waitUtils.waitforElementToBeClickable(driver, selectPlanCriti, 100);
        selectPlanCriti.click();
        CustomListner.test.log(LogStatus.INFO, "Select BSLI CritiShield Plan");
        }
        else if(args.equalsIgnoreCase("BSLI Cancer Shield Plan")) {

            WebElement selectPlanCancer = driver.findElement(By.xpath("//div[text()=\"BSLI Cancer Shield Plan\"]"));
            waitUtils.waitforElementToBeClickable(driver, selectPlanCancer, 100);
            selectPlanCancer.click();
            CustomListner.test.log(LogStatus.INFO, "Select BSLI Cancer Shield Plan");
        }
        else if(args.equalsIgnoreCase("ABSLI Digishield Plan")){
            Thread.sleep(2000);
            WebElement selectPlanDigi = driver.findElement(By.xpath("//div[text()='ABSLI Digishield Plan']"));
            waitUtils.waitforElementToBeClickable(driver, selectPlanDigi, 30);
     
            selectPlanDigi.click();
            CustomListner.test.log(LogStatus.INFO, "Select ABSLI Digishield Plan");
        }
        else if(args.equalsIgnoreCase("BSLI Life Shield")){
            WebElement selectPlanLife = driver.findElement(By.xpath("//div[text()=\"BSLI Life Shield\"]"));
            waitUtils.waitforElementToBeClickable(driver, selectPlanLife, 100);
            selectPlanLife.click();
            CustomListner.test.log(LogStatus.INFO, "Select BSLI Life Shield");
        }

    }
   

   /* public void selectPlanJourneyWeb(String args) {
        WebElement healthAndPureTermWeb = driver.findElement(By.xpath("(//label[@class=\"MuiFormControlLabel-root MuiFormControlLabel-labelPlacementStart\"]/span)[1]"));
        waitUtils.waitforElementToBeClickable(driver, healthAndPureTermWeb, 100);

        if (args.equalsIgnoreCase("health and pure term")) {
            healthAndPureTermWeb.isDisplayed();
            healthAndPureTermWeb.click();
        } else {
            WebElement recomendPlan = driver.findElement(By.xpath("(//label[@class=\"MuiFormControlLabel-root MuiFormControlLabel-labelPlacementStart\"]/span)[3]"));
            waitUtils.waitforElementToBeClickable(driver, healthAndPureTermWeb, 100);
            recomendPlan.isDisplayed();
            recomendPlan.click();
        }
        WebElement clickProceedBtn = driver.findElement(By.xpath("//span[text()=\"PROCEED\"]"));
        clickProceedBtn.click();
    }*/

    public void healthPlanSelectionWeb(String args ) {
        WebElement healthAndPureTermDropdown = driver.findElement(By.xpath("//div[@id=\"productNameQst\"]"));
        waitUtils.waitforElementToBeClickable(driver, healthAndPureTermDropdown, 100);
        healthAndPureTermDropdown.click();
        String hp = "//ul[@role=\"listbox\"]//child::li[@data-value=\""+args+"\"]";
        WebElement healthplanChoose = driver.findElement(By.xpath(hp));
        waitUtils.waitforElementToBeClickable(driver, healthplanChoose, 100);
        if(healthplanChoose.isDisplayed()){
            healthplanChoose.click();

        }
    }


    public void ContinueWeb(){

        WebElement ContinueBtnWeb= driver.findElement(By.xpath("//span[text()=\"Continue\"]"));
        waitUtils.waitforElementToBeClickable(driver, ContinueBtnWeb, 100);

        if(ContinueBtnWeb.isDisplayed()){
            ContinueBtnWeb.click();
        }

    }

    public void ContinueCapitalWeb(){
        WebElement ContinueBtnWeb= driver.findElement(By.xpath("//span[text()=\"CONTINUE\"]"));
        waitUtils.waitforElementToBeClickable(driver, ContinueBtnWeb, 100);

        if(ContinueBtnWeb.isDisplayed()){
            ContinueBtnWeb.click();
        }

    }

    public void viewQuotePageVerifyWeb(){
        WebElement ViewQuoteHeader= driver.findElement(By.xpath("//span[text()=\"View Quote\"]"));
        waitUtils.waitforElementToBeClickable(driver, ViewQuoteHeader, 100);

        String viewQuoteHeader = ViewQuoteHeader.getText();

        Assert.assertEquals(viewQuoteHeader,"View Quote");

    }

    public void enterSumAssuredWeb(String args){
        WebElement sumAssuredInput= driver.findElement(By.xpath("//input[@name='sumAssuredQst']"));
        waitUtils.waitforElementToBeClickable(driver, sumAssuredInput, 100);
        if(sumAssuredInput.isDisplayed()){
            sumAssuredInput.click();

            for (int i = 0; i < 9; i++) {
                sumAssuredInput.sendKeys(Keys.BACK_SPACE);
                sumAssuredInput.sendKeys(" ");
                sumAssuredInput.sendKeys(Keys.DELETE);


            }  sumAssuredInput.sendKeys(args);
            CustomListner.test.log(LogStatus.INFO, "Enter Sum Assured As====>"+args);
        }}


    public void isSmoker(String value){


        WebElement NonSmoker= driver.findElement(By.xpath("//div[@class=\"non-smoker-selected\"]"));
        waitUtils.waitforElementToBeClickable(driver, NonSmoker, 30);

        WebElement Smoker= driver.findElement(By.xpath("//div[@class=\"smoker-not-selected\"]"));
        waitUtils.waitforElementToBeClickable(driver, Smoker, 30);

        if(value.equalsIgnoreCase("smoker")){
            Smoker.click();
            CustomListner.test.log(LogStatus.INFO, "Click on Smoker Button");

        }else if(value.equalsIgnoreCase("Non smoker")){

            NonSmoker.click();
            CustomListner.test.log(LogStatus.INFO, "Click on Non-Smoker Button");
        } }



    public void selectPlanOptionsWeb(String planOpt){
        WebElement planCoverDrpdown= driver.findElement(By.xpath("(//div[@aria-haspopup=\"listbox\"])[1]"));
        waitUtils.waitforElementToBeClickable(driver, planCoverDrpdown, 100);
        planCoverDrpdown.click();
        WebElement planOptions= driver.findElement(By.xpath("//li/span[text()=\""+planOpt+"\"]"));
        waitUtils.waitforElementToBeClickable(driver, planOptions, 100);
        planOptions.click();
    }
  


    public void selectIncreasingLevelWeb(String level){
        WebElement increasingLevel= driver.findElement(By.xpath("//div[@id='mui-component-select-productNameOptionQst']"));
        waitUtils.waitforElementToBeClickable(driver, increasingLevel, 100);
        increasingLevel.click();
        WebElement increasePercent= driver.findElement(By.xpath("(//ul/li[@role=\"option\"])["+level+"]"));
        waitUtils.waitforElementToBeClickable(driver, increasePercent, 100);
        increasePercent.click();



    }

    public void clickIllustrationbtnWeb(){
        WebElement illustrationbtn= driver.findElement(By.xpath("(//span[@class=\"MuiButton-label\"])[1]"));
        waitUtils.waitforElementToBeClickable(driver, illustrationbtn, 100);
        if(illustrationbtn.isDisplayed()) {
        	 illustrationbtn.click();
        	  CustomListner.test.log(LogStatus.INFO, "Click on Illustration Button");
        }else {
        	  CustomListner.test.log(LogStatus.FAIL, "Illustration Button is Display");
        }
     

    }

    public void SelectPPTWeb(String pptOption){
        WebElement selectPPTWeb= driver.findElement(By.xpath("//div[@id=\"mui-component-select-premiumPayTermQst\"]"));
        waitUtils.waitforElementToBeClickable(driver, selectPPTWeb, 100);
        selectPPTWeb.click();
        WebElement PPTWebSelection = driver.findElement(By.xpath("//ul/li/span[text()='"+pptOption+"']"));
        waitUtils.waitforElementToBeClickable(driver, PPTWebSelection, 100);
        PPTWebSelection.click();

    }


    public void enterPolicyTermWeb(String term){
        WebElement selectpolicyTermWeb= driver.findElement(By.xpath("//input[@id='term']"));
        waitUtils.waitforElementToBeClickable(driver,selectpolicyTermWeb, 100);
        for (int i = 0; i < 3; i++) {
            selectpolicyTermWeb.sendKeys(Keys.BACK_SPACE);
            selectpolicyTermWeb.sendKeys(" ");
            selectpolicyTermWeb.sendKeys(Keys.DELETE);
        }
        selectpolicyTermWeb.sendKeys(term);

    }

    public void payMode(String paymode){
        WebElement PayModeAnnual= driver.findElement(By.xpath("//div[text()='Annual']"));
        waitUtils.waitforElementToBeClickable(driver, PayModeAnnual, 100);

        WebElement PayModeSemiAnnual= driver.findElement(By.xpath("//div[text()='Semi-Annual']"));
        waitUtils.waitforElementToBeClickable(driver, PayModeSemiAnnual, 100);

        WebElement PayModeQuarterly= driver.findElement(By.xpath("//div[text()='Quarterly']"));
        waitUtils.waitforElementToBeClickable(driver, PayModeSemiAnnual, 100);

        WebElement PayModeMonthly= driver.findElement(By.xpath("//div[text()='Monthly']"));
        waitUtils.waitforElementToBeClickable(driver, PayModeSemiAnnual, 100);

        if(paymode.equalsIgnoreCase("annual")){
            PayModeAnnual.click();
        }else if(paymode.equalsIgnoreCase("Semi-Annual")){
            PayModeAnnual.click();

        }else if(paymode.equalsIgnoreCase("Quarterly")){
            PayModeQuarterly.click();

        }else{
            PayModeMonthly.click();

        }}


    public void enhancedLifeCoverageWeb(){

        WebElement elc= driver.findElement(By.xpath("//input[@id='isEnahanceLifeCoverage']"));
        elc.isDisplayed();
        elc.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }


    public void aciWeb(String aciSumassured) {
    	
        WebElement aci1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
       // waitUtils.waitforElementToBeClickable(driver, aci1, 30);
        
       if( aci1.isSelected()) {
    	 
    	   CustomListner.test.log(LogStatus.INFO, " ACI  Button Is AlReady Selected");
       }
       else {
    	   aci1.click();
    	   CustomListner.test.log(LogStatus.INFO, "ACI  Button Not Display");
       }

        WebElement aciSumAssured = driver.findElement(By.xpath("//input[@name=\"aciSumAssured\"]"));
        waitUtils.waitforElementToBeClickable(driver, aciSumAssured, 100);
        for (int i = 0; i < 9; i++) {
            aciSumAssured.sendKeys(Keys.BACK_SPACE);
            aciSumAssured.sendKeys(" ");
            aciSumAssured.sendKeys(Keys.DELETE);
        }
        aciSumAssured.click();
        aciSumAssured.sendKeys(aciSumassured);

    }

    public void verifyAllRidersWeb() throws InterruptedException{
try {
	 WebElement riderBtn = driver.findElement(By.xpath("//button[@id=\"rider-btn\"]"));
     waitUtils.waitforElementToBeClickable(driver, riderBtn, 100);
     riderBtn.click();
     waitUtils.WaitTime2();

     WebElement accidentalDeath = driver.findElement(By.xpath("//div[text()=\"Accidental Death and Disability\"]"));
     String ad = accidentalDeath.getText();
     Assert.assertEquals(ad , "ACCIDENTAL DEATH AND DISABILITY");
     WebElement criticalIllness = driver.findElement(By.xpath("//div[text()=\"Critical Illness\"]"));
     String cI = criticalIllness.getText();
     Assert.assertEquals(cI , "CRITICAL ILLNESS");
     WebElement surgicalCare = driver.findElement(By.xpath("//div[text()=\"Surgical Care\"]"));
     String sC = surgicalCare.getText();
     Assert.assertEquals(sC, "SURGICAL CARE");
     WebElement hospitalCare = driver.findElement(By.xpath("//div[text()=\"Hospital Care\"]"));
     String hC = hospitalCare.getText();
     Assert.assertEquals(hC , "HOSPITAL CARE");
     WebElement ADB = driver.findElement(By.xpath("//div[text()=\"ADB Plus\"]"));
     String adb = ADB.getText();
     Assert.assertEquals(adb , "ADB PLUS");
     WebElement WOP = driver.findElement(By.xpath("//div[text()=\"Waiver Of Premium\"]"));
     String wop = WOP.getText();
     Assert.assertEquals(wop , "WAIVER OF PREMIUM");
     CustomListner.test.log(LogStatus.INFO, "Successfully Display All Rider");
	
}catch(NoSuchElementException e) {
	 CustomListner.test.log(LogStatus.FAIL, "Unable To Located Element On Page");
}
       

    }


    public void enterRiderQuotePageWeb(String riderAmount){
        WebElement riderBtn = driver.findElement(By.xpath("//button[@id=\"rider-btn\"]"));
        waitUtils.waitforElementToBeClickable(driver, riderBtn, 100);
        riderBtn.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        WebElement addRiderPage = driver.findElement(By.xpath("//div[text()=\"Add Riders\"]"));
        waitUtils.waitforElementToBeClickable(driver, addRiderPage, 100);
        addRiderPage.isDisplayed();

        Assert.assertEquals(addRiderPage.getText(), "Add Riders");
        WebElement selectRiderValue = driver.findElement(By.xpath("(//input[@id=\"accordian-checkbox\"])[1]"));

        selectRiderValue.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement enterRiderAmount = driver.findElement(By.xpath("//input[@name=\"riderDetails[0].sumAssuredQst\"]"));
        enterRiderAmount.click();
            enterRiderAmount.sendKeys(riderAmount);

        WebElement clickAddButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        clickAddButton.click();

        //Verification of the rider selected
        String riderVerify = selectRiderValue.getText();
        WebElement verifyRiderOnQuotePage = driver.findElement(By.xpath("//span[text()=\"Accidental Death and Disability\"]"));
        Assert.assertEquals(verifyRiderOnQuotePage.getText() , riderVerify);

        //Verification of the Amount
        WebElement verifyRiderAmountOnQuotePage = driver.findElement(By.xpath("//*[@id=\"rider-new\"]/div[1]/text()[2]"));
        Assert.assertEquals(verifyRiderAmountOnQuotePage.getText() , riderAmount);


    }

    public void clickNextBtnCapital(){
        WebElement nextBtnCapital = driver.findElement(By.xpath("//span[text()='NEXT']"));
        waitUtils.waitforElementToBeClickable(driver, nextBtnCapital, 100);
        nextBtnCapital.click();
        CustomListner.test.log(LogStatus.INFO, "Click on NEXT Button ");
    }
    public void clickNextBtnCapitalAndroid(){
        WebElement nextBtnCapital = driver1.findElement(By.xpath("//*[@text='NEXT']"));
        waitUtils.waitForElementToBeClickableAndroid(driver1, nextBtnCapital, 100);
        nextBtnCapital.click();
        CustomListner.test.log(LogStatus.INFO, "Click on NEXT Button");
    }
    public void clickContinueBtn(){
        WebElement nextBtnCapital = driver.findElement(By.xpath("//span[text()='CONTINUE']"));
        waitUtils.waitforElementToBeClickable(driver, nextBtnCapital, 100);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        //executor.executeScript("arguments[0].click();", nextBtnCapital);
        nextBtnCapital.click();
        CustomListner.test.log(LogStatus.INFO, "Click on Continue Button");
    }
    public void clickContinueBtnAndroid(){
        WebElement nextBtnCapital = driver1.findElement(By.xpath("//*[@text='CONTINUE']"));
        waitUtils.waitForElementToBeClickableAndroid(driver1, nextBtnCapital, 100);

        nextBtnCapital.click();
        CustomListner.test.log(LogStatus.INFO, "Click on Continue Button");
    }
    public void clickInstaDoItButton(){
        WebElement nextBtnCapital = driver.findElement(By.xpath("//span[text()='DO IT LATER ']"));
        waitUtils.waitforElementToBeClickable(driver, nextBtnCapital, 100);

        nextBtnCapital.click();
        CustomListner.test.log(LogStatus.INFO, "Click on DO IT Button");
    }
   
    public void clickInstaDoItButtonAndroid(){
        WebElement nextBtnCapital = driver1.findElement(By.xpath("//*[@text='DO IT LATER']"));
        waitUtils.waitForElementToBeClickableAndroid(driver1, nextBtnCapital, 100);

        nextBtnCapital.click();
        CustomListner.test.log(LogStatus.INFO, "Click on DO IT Button");
    }


    public void quotePageValidationsWeb(){
        WebElement sumAssuredInput= driver.findElement(By.xpath("//input[@id='sumAssuredQst']"));
        waitUtils.waitforElementToBeClickable(driver, sumAssuredInput, 100);
        if(sumAssuredInput.isDisplayed()) {
            sumAssuredInput.click();
            for (int i = 0; i < 9; i++) {
                sumAssuredInput.sendKeys(Keys.BACK_SPACE);
                sumAssuredInput.sendKeys(" ");
                sumAssuredInput.sendKeys(Keys.DELETE);
            }
            //p[text()="Please enter Sum Assured"]
            WebElement sumAssuredInputEmpty= driver.findElement(By.xpath("//p[text()='Minnimum Rs.50,00,000 is Required']"));
            waitUtils.waitforElementToBeClickable(driver, sumAssuredInputEmpty, 100);

            Assert.assertEquals(sumAssuredInputEmpty.getText(),"Minnimum Rs.50,00,000 is Required");

            sumAssuredInput.sendKeys("400000");

            WebElement sumAssuredValidations= driver.findElement(By.xpath("//p[text()='Minnimum Rs.50,00,000 is Required']"));
            waitUtils.waitforElementToBeClickable(driver, sumAssuredValidations, 100);
            String str = sumAssuredValidations.getText();
            Assert.assertEquals(str , "Minnimum Rs.50,00,000 is Required");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            for (int i = 0; i < 9; i++) {
                sumAssuredInput.sendKeys(Keys.BACK_SPACE);
                sumAssuredInput.sendKeys(" ");
                sumAssuredInput.sendKeys(Keys.DELETE);
            }

            WebElement sumAssuredvalidation = driver.findElement(By.xpath("//p[text()='Minnimum Rs.50,00,000 is Required']"));
            waitUtils.waitforElementToBeClickable(driver, sumAssuredvalidation, 100);
            if (sumAssuredvalidation.isDisplayed()) {
                Assert.assertTrue(true, "Please enter Sum Assured -- validationmessage is displayed");
            } else {
                Assert.assertTrue(false);
            }
        }

        WebElement selectpolicyTermWeb= driver.findElement(By.xpath("//input[@id=\"term\"]"));
        waitUtils.waitforElementToBeClickable(driver,selectpolicyTermWeb, 100);


        for (int i = 0; i < 3; i++) {
            selectpolicyTermWeb.sendKeys(Keys.BACK_SPACE);
            selectpolicyTermWeb.sendKeys(" ");
            selectpolicyTermWeb.sendKeys(Keys.DELETE);
        }
        WebElement policytermvalidation = driver.findElement(By.xpath("//p[text()='Min is 10']"));
        waitUtils.waitforElementToBeClickable(driver, policytermvalidation, 100);
        if (policytermvalidation.isDisplayed()) {
            Assert.assertTrue(true, "Please enter Term Policy -- validationmessage is displayed");
        } else {
            Assert.assertTrue(false);
        }
    }


    public String verifyPremiumWeb(){

        WebElement premium = driver.findElement(By.xpath("//div[@class=\"amount-in-numbers\"]"));
        waitUtils.waitforElementToBeClickable(driver, premium, 100);

        return premium.getText();

    }
    public void checkGenerateIllustration() throws InterruptedException{

        
        for( int i=0; i<=2; i++) {
     	   WebElement illustration = driver.findElement(By.xpath("//span[text()='ILLUSTRATION']"));
     	   if(illustration.isDisplayed()) {
     		  illustration.click();
              Thread.sleep(3000);
              CustomListner.test.log(LogStatus.INFO, "Click on Illustration Button");
            
     	   }else {
     		  CustomListner.test.log(LogStatus.FAIL, "illustration Button is not Display");
     	   }
       
        }
        
         
    }
    //===========================Below Android By Vijay=======================================

    public void selectPlanJourneyNewAndroid(String args) throws InterruptedException{
        WebElement healthAndPureTermandroid = driver1.findElement(By.xpath("//*[@text='Health & Pure Term Plans']"));
        waitUtils.waitForElementToBeClickableAndroid(driver1, healthAndPureTermandroid, 100);
        healthAndPureTermandroid.click();
        CustomListner.test.log(LogStatus.INFO, "Select Health & Pure Term Plans");
        
       // TestUtil.scrollTillEndOfPageAndroid(driver1,driver1.findElement(By.xpath("//*[@text='ABSLI Digishield Plan']")));
       // driver1.findElementByAndroidUIAutomator("new UiScrollable(new    UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"ABSLI Digishield Plan\").instance(0))").click();
        //driver1.findElement(MobileBy.AndroidUIAutomator(
			//	"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"ABSLI Digishield Plan\").instance(0));"));

        if(args.equalsIgnoreCase("BSLI CritiShield Plan")){
        WebElement selectPlanCriti = driver1.findElement(By.xpath("//div[text()=\"BSLI CritiShield Plan\"]"));
        waitUtils.waitForElementToBeClickableAndroid(driver1, selectPlanCriti, 100);
        selectPlanCriti.click();
        CustomListner.test.log(LogStatus.INFO, "Select BSLI CritiShield Plan");
        }
        else if(args.equalsIgnoreCase("BSLI Cancer Shield Plan")) {

            WebElement selectPlanCancer = driver1.findElement(By.xpath("//div[text()=\"BSLI Cancer Shield Plan\"]"));
            waitUtils.waitForElementToBeClickableAndroid(driver1, selectPlanCancer, 100);
            selectPlanCancer.click();
            CustomListner.test.log(LogStatus.INFO, "Select BSLI Cancer Shield Plan");
        }
        else if(args.equalsIgnoreCase("ABSLI Digishield Plan")){

            WebElement selectPlanDigi = driver1.findElement(By.xpath("//*[@text='ABSLI Digishield Plan']"));
            waitUtils.waitForElementToBeClickableAndroid(driver1, selectPlanDigi, 100);
            Thread.sleep(2000);
            selectPlanDigi.click();
            CustomListner.test.log(LogStatus.INFO, "Select ABSLI Digishield Plan");
        }
        else if(args.equalsIgnoreCase("BSLI Life Shield")){
            WebElement selectPlanLife = driver1.findElement(By.xpath("//div[text()=\"BSLI Life Shield\"]"));
            waitUtils.waitForElementToBeClickableAndroid(driver1, selectPlanLife, 100);
            selectPlanLife.click();
            CustomListner.test.log(LogStatus.INFO, "Select BSLI Life Shield");
        }

    }
    public void clickSaveBtnAndroid() {
        WebElement selectplanandroid = driver1.findElement(By.xpath("//*[@text='SAVE']"));
        waitUtils.waitForElementToBeClickableAndroid(driver1, selectplanandroid, 100);
        if (selectplanandroid.isDisplayed()) {
        	selectplanandroid.click();
        	CustomListner.test.log(LogStatus.INFO, "Click on Save Button ");
        } else {
        	CustomListner.test.log(LogStatus.INFO, "Save Button is not display");

        }
    }
    public void clickselectPlanBtnAndroid() {
        WebElement selectplanandroid = driver1.findElement(By.xpath("//*[@text='SELECT PLAN']"));
        waitUtils.waitForElementToBeClickableAndroid(driver1, selectplanandroid, 100);
        if (selectplanandroid.isDisplayed()) {
        	selectplanandroid.click();
        	CustomListner.test.log(LogStatus.INFO, "Select Plan Button ");
        } else {
        	CustomListner.test.log(LogStatus.INFO, "Select plan Button is not display");

        }
    }
   
    public void InputSumAssuredAndroid(String quoteAmount) {
        WebElement selectplanandroid = driver1.findElement(By.xpath("//*[@text='Sum Assured']"));

        waitUtils.waitForElementToBeClickableAndroid(driver1, selectplanandroid, 100);
        if (selectplanandroid.isDisplayed()) {
        	selectplanandroid.sendKeys(quoteAmount);
        	CustomListner.test.log(LogStatus.INFO, "Enter Sum Assured As=====>"+quoteAmount);
        } else {
        	CustomListner.test.log(LogStatus.INFO, "Sume Assured is not display");

        }
    }
    public void InputPolicyTermAndroid(String term) {
        WebElement selectPPTandroid = driver1.findElement(By.xpath("//android.widget.EditText[@content-desc='policyTermYearsQst']"));
        waitUtils.waitForElementToBeClickableAndroid(driver1, selectPPTandroid, 100);
        if (selectPPTandroid.isDisplayed()) {
        	selectPPTandroid.sendKeys(term);
        	CustomListner.test.log(LogStatus.INFO, "Enter Policy Term As=====>"+term);
        } else {
        	CustomListner.test.log(LogStatus.INFO, "Policy Term is not display");

        }
    }
    public void selectPlanOptionsAndroid(String planOpt){
        WebElement planCoverDrpdown= driver1.findElement(By.xpath("//android.widget.TextView[@text='󰅀']"));
        waitUtils.waitForElementToBeClickableAndroid(driver1, planCoverDrpdown, 100);
        planCoverDrpdown.click();
        WebElement planOptions= driver1.findElement(By.xpath("//*[@text='"+planOpt+"']"));

        waitUtils.waitForElementToBeClickableAndroid(driver1, planOptions, 100);
        planOptions.click();
    }
    
    
    

    public void viewQuotePageVerifyAndroid(){
        WebElement ViewQuoteHeader= driver1.findElement(By.xpath("//*[@text='View Quote']"));

        waitUtils.waitforElementToBeClickable(driver1, ViewQuoteHeader, 100);

        String viewQuoteHeader = ViewQuoteHeader.getText();

        Assert.assertEquals(viewQuoteHeader,"View Quote");

    }

    public void isSmokerAndroid(String value){


        WebElement NonSmoker= driver1.findElement(By.xpath("//*[@text='Non Smoker']"));

        waitUtils.waitforElementToBeClickable(driver1, NonSmoker, 100);

        WebElement Smoker= driver1.findElement(By.xpath("//*[@text='Smoker']"));

        waitUtils.waitforElementToBeClickable(driver1, Smoker, 100);

        if(value.equalsIgnoreCase("smoker")){
            Smoker.click();

        }else if(value.equalsIgnoreCase("Non smoker")){

            NonSmoker.click();
        } }
    public void clickIllustrationbtnAndroid(){
        WebElement illustrationbtn= driver1.findElement(By.xpath("//*[@text='ILLUSTRATION']"));

        waitUtils.waitforElementToBeClickable(driver1, illustrationbtn, 100);
        illustrationbtn.click();

    }




    //===================+JOINT LIFE+==================//
    public void clickJointLifeAddbtn(){
        WebElement JointLifeAddbtn= driver.findElement(By.xpath("(//button[@id=\"rider-btn\"])[2]"));

        waitUtils.waitforElementToBeClickable(driver, JointLifeAddbtn, 100);
        JointLifeAddbtn.click();

    }


    public void enterMobileNumber(String JointLifeMobileNumber){
        WebElement enterMobile= driver.findElement(By.xpath("(//input[@class=\"MuiInputBase-input MuiFilledInput-input\"])[2]"));

        waitUtils.waitforElementToBeClickable(driver, enterMobile, 100);
        enterMobile.sendKeys(JointLifeMobileNumber);

    }
    public void enterPan(String JointLifePan){
        WebElement enterMobile= driver.findElement(By.xpath("(//input[@class=\"MuiInputBase-input MuiFilledInput-input\"])[3]"));

        waitUtils.waitforElementToBeClickable(driver, enterMobile, 100);
        enterMobile.sendKeys(JointLifePan);

    }


 public void clickVerify(){
        WebElement verifyBtn= driver.findElement(By.xpath("//div[text()=\"VERIFY\"]"));
        waitUtils.waitforElementToBeClickable(driver, verifyBtn, 100);
     verifyBtn.click();

    }


public void clickSaveJointLife(){
        WebElement saveBtnClick= driver.findElement(By.xpath("//div[text()=\"SAVE\"]"));
        waitUtils.waitforElementToBeClickable(driver,  saveBtnClick, 100);
       saveBtnClick.click();

    }






}




