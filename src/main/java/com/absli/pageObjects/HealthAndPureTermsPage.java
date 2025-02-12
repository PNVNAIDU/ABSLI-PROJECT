package com.absli.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.absli.Listner.CustomListner;
import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class HealthAndPureTermsPage extends TestBase {

    public WebDriver driver;
    public AndroidDriver driver1;
    public IOSDriver driver2;
    public WaitUtils waitUtils;
    LoginPage loginPage;
    Dashboard dashboard;
    CustomerProfile customerProfile;

    // Initializing the Page Objects:
    public HealthAndPureTermsPage(AndroidDriver driver1) {
        this.driver1 = driver1;
        waitUtils = new WaitUtils();
    }

    public HealthAndPureTermsPage(WebDriver driver) {
        this.driver = driver;
        waitUtils = new WaitUtils();
    }

    public HealthAndPureTermsPage(IOSDriver driver) {
        this.driver2 = driver;
        waitUtils = new WaitUtils();
    }

	
	

    public void selectPlanJourneyRecommendPlansWeb(String args) {
    	WebElement recomendPlan = driver.findElement(By.xpath("//span[text()='Recommend Plans']"));
        waitUtils.waitforElementToBeClickable(driver, recomendPlan, 100);
        
        if (args.equalsIgnoreCase("Recommend Plans")) {
        	recomendPlan.isDisplayed();
        	recomendPlan.click();
        	CustomListner.test.log(LogStatus.INFO, "Select Plan As=====> "+args);
        }
    }
	
	
	public void enterPremiumValueRecommendPlanWeb(String args) {
	
	        WebElement premiumvalueRecommendPlan= driver.findElement(By.name("annualIncome"));
	        waitUtils.waitforElementToBeClickable(driver, premiumvalueRecommendPlan, 100);
	        if(premiumvalueRecommendPlan.isDisplayed()){
	        	premiumvalueRecommendPlan.click();

	            premiumvalueRecommendPlan.sendKeys(args);
	            CustomListner.test.log(LogStatus.INFO, "Enter Premium Value As=====> "+args);
	        }
	        }


    public void OccupationdropdownSelectionONRecommendPlanWeb(String args ) {
        WebElement Occupationdropdown  = driver.findElement(By.xpath("//div[@id='mui-component-select-occupation']"));
        waitUtils.waitforElementToBeClickable(driver, Occupationdropdown, 100);
        Occupationdropdown.click();
        CustomListner.test.log(LogStatus.INFO, "Click on Occupation DropDown");
        WebElement OccupationdropdownChoose = driver.findElement(By.xpath("//ul//li//span[text()='"+args+"']"));
        waitUtils.waitforElementToBeClickable(driver, OccupationdropdownChoose, 100);
        if(OccupationdropdownChoose.isDisplayed()){
        	OccupationdropdownChoose.click();
        	
        	CustomListner.test.log(LogStatus.INFO, "Select Occupation Values  As=====> "+args);
        }else {
        	CustomListner.test.log(LogStatus.FAIL, "Failed To Display Occupation Values As=====>"+args);
        }
    }	
		
    public void lifeStageSelectionONRecommendPlanWeb(String args){

        WebElement lifeStageBtnWeb= driver.findElement(By.xpath("//span[text()='"+args+"']"));
        waitUtils.waitforElementToBeClickable(driver, lifeStageBtnWeb, 100);

        if(lifeStageBtnWeb.isDisplayed()){
        	lifeStageBtnWeb.click();
        	CustomListner.test.log(LogStatus.INFO, "Select Life Stage As=====> "+args);
        }else {
        	CustomListner.test.log(LogStatus.FAIL, "Life Stage Element is not Display");
        }

    }
    public void addExisitingPolicieSelectionONRecommendPlanWeb(){

    	 WebElement AddExisitingPoliciesBTN=    driver.findElement(By.xpath("//*[@id=\"page-container\"]/div[2]/form/div[5]/div/div[1]/div[2]/span[1]/img"));
        waitUtils.waitforElementToBeClickable(driver, AddExisitingPoliciesBTN, 100);

        if(AddExisitingPoliciesBTN.isDisplayed()){
        	AddExisitingPoliciesBTN.click();
        	
        }else {
        	System.out.println("AddExisitingPolicies Element no Display");
        }

    }
	
    public void RiskprofileSelectionONRecommendPlanWeb(String args){

        WebElement  RiskprofileBtnWeb= driver.findElement(By.xpath("//div[text()=\""+args+"\"]"));
        waitUtils.waitforElementToBeClickable(driver, RiskprofileBtnWeb, 100);

        if(RiskprofileBtnWeb.isDisplayed()){
        	RiskprofileBtnWeb.click();
        	CustomListner.test.log(LogStatus.INFO, "Select Risk Profile As=====> "+args);
        }else {
        	CustomListner.test.log(LogStatus.FAIL, "Risk Profile Element is not Display");
        }

    }
    public void clickViewPlanBTNONRecommendPlanWeb(){

    	  WebElement viewplanBTN=driver.findElement(By.xpath("//span[text()='View Plans']"));
        waitUtils.waitforElementToBeClickable(driver, viewplanBTN, 100);

        if(viewplanBTN.isDisplayed()){
        	viewplanBTN.click();
        }else {
        	System.out.println("View Plan BTN Element no Display");
        }

    }
    public void clickViewOtherProductBTNONRecommendPlanWeb(){

    	  WebElement viewOtherProductEle=driver.findElement(By.xpath("//span[text()='View other products']"));
      waitUtils.waitforElementToBeClickable(driver, viewOtherProductEle, 100);

      if(viewOtherProductEle.isDisplayed()){
    	  viewOtherProductEle.click();
      }else {
      	System.out.println("View Other Product BTN Element no Display");
      }

  }
	
    public void investmentGoalSelectionONRecommendPlanWeb(String args){

    	WebElement investmentGoalBtnWeb= driver.findElement(By.xpath("//button[contains(@value,'"+args+"')]"));
        waitUtils.waitforElementToBeClickable(driver, investmentGoalBtnWeb, 100);

        if(investmentGoalBtnWeb.isDisplayed()){
        	investmentGoalBtnWeb.click();
        	CustomListner.test.log(LogStatus.INFO, "Select  Invesment Goal As=====> "+args);
        }else {
        	CustomListner.test.log(LogStatus.FAIL, "Investment Goal Element is not Display");
        }

    }
    public void SelectACategorydropdownONRecommendPlanWeb(String args ) {
        WebElement SelectAcategory  = driver.findElement(By.xpath("(//div[@role='button'])[3]"));
        waitUtils.waitforElementToBeClickable(driver, SelectAcategory, 100);
        if(SelectAcategory.isDisplayed()) {
        SelectAcategory.click();
        CustomListner.test.log(LogStatus.INFO, "Select A Category Plan As=====> "+args);
        }
    	
        waitUtils.waitforElementToBeClickable(driver, SelectAcategory, 100);
        
       
        WebElement SelectAcategoryChoose = driver.findElement(By.xpath("//span[text()=\""+args+"\"]"));
        waitUtils.waitforElementToBeClickable(driver, SelectAcategoryChoose, 100);
        if(SelectAcategoryChoose.isDisplayed()){
        	SelectAcategoryChoose.click();

        }
    }	
    
    public void SelectAPlanydropdownONRecommendPlanWeb(String args ) {
        WebElement SelectApaln = driver.findElement(By.xpath("(//div[@role='button'])[4]"));
        waitUtils.waitforElementToBeClickable(driver, SelectApaln, 100);
        if(SelectApaln.isDisplayed()) {
        	SelectApaln.click();
        	CustomListner.test.log(LogStatus.INFO, "Select A Plan As=====> "+args);
        }
    	
        waitUtils.waitforElementToBeClickable(driver, SelectApaln, 100);
        
       
        WebElement SelectAplanChoose = driver.findElement(By.xpath("//span[text()=\""+args+"\"]"));
        waitUtils.waitforElementToBeClickable(driver, SelectAplanChoose, 100);
        if(SelectAplanChoose.isDisplayed()){
        	SelectAplanChoose.click();

        }
    }	
    
    //-----------------------------Android by vijay---------------------------------//

public void clickselectPlanBtnAndroid() {
    WebElement selectplanAndroid = driver1.findElement(By.xpath("//*[@text='SELECT PLAN']"));
    waitUtils.waitforElementToBeClickable(driver1, selectplanAndroid, 100);
    if (selectplanAndroid.isDisplayed()) {
    	selectplanAndroid.click();
    } else {
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}


public void clickselectNextBtnAndroid() {
	WebElement nextBTNAndroid=driver1.findElement(By.xpath("//android.widget.TextView[@text='NEXT']"));
    waitUtils.waitforElementToBeClickable(driver1, nextBTNAndroid, 100);
    if (nextBTNAndroid.isDisplayed()) {
    	nextBTNAndroid.click();
    } else {
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}

public void clickSaveBtnAndroid() {
	 WebElement saveBTNAndroid= driver1.findElement(By.xpath("//*[@text='SAVE']"));
    waitUtils.waitforElementToBeClickable(driver1, saveBTNAndroid, 100);
    if (saveBTNAndroid.isDisplayed()) {
    	saveBTNAndroid.click();
    } else {
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
    public void selectPlanJourneyRecommendPlansAndroid(String args) {
    	WebElement recomendPlanAndroid =driver1.findElement(By.xpath("//*[@text='Recommend Plans']"));
        waitUtils.waitforElementToBeClickable(driver1, recomendPlanAndroid, 100);
        
        if (args.equalsIgnoreCase("Recommend Plans")) {
        	recomendPlanAndroid.isDisplayed();
        	recomendPlanAndroid.click();
        }
    }
    
    public void enterPremiumValueRecommendPlanAndroid(String args) {
    	 WebElement premiumvalueRecommendPlanAndroid=driver1.findElement(By.xpath("//android.widget.EditText[@content-desc='annualincome']"));
        if(premiumvalueRecommendPlanAndroid.isDisplayed()) {
        	premiumvalueRecommendPlanAndroid.sendKeys(args);
            CustomListner.test.log(LogStatus.INFO, "Enter Premium Value   As=====>"+args);
        }else {
        	CustomListner.test.log(LogStatus.INFO, "Premium Value is not display ");
        }
    }
    
    
    
 
    
	public void OccupationdropdownSelectionONRecommendPlanAndroid(String args ) {
        WebElement Occupationdropdown  =driver1.findElement(By.xpath("//*[@text='Select Occupation']"));
        waitUtils.waitforElementToBeClickable(driver1, Occupationdropdown, 100);
        Occupationdropdown.click();
        String d="//*[@text=\""+args+"\"]";
       
        WebElement OccupationdropdownChoose = driver1.findElement(By.xpath(d));
        waitUtils.waitforElementToBeClickable(driver1, OccupationdropdownChoose, 100);
        if(OccupationdropdownChoose.isDisplayed()){
        	OccupationdropdownChoose.click();

        }
    }	
    
	
    public void lifeStageSelectionONRecommendPlanAndroid(String lifeStageValue){

        WebElement lifeStageBtnWeb=driver1.findElement(By.xpath("//*[@text='"+lifeStageValue+"']"));
        waitUtils.waitforElementToBeClickable(driver1, lifeStageBtnWeb, 100);

        if(lifeStageBtnWeb.isDisplayed()){
        	lifeStageBtnWeb.click();
        }else {
        	System.out.println("Life Stage Element no Display");
        }

    }
	
	
    public void RiskprofileSelectionONRecommendPlanAndroid(String  riskProfileFieldValue){

        WebElement  RiskprofileBtnWeb=driver1.findElement(By.xpath("//*[@text='"+riskProfileFieldValue+"']"));
        waitUtils.waitforElementToBeClickable(driver1, RiskprofileBtnWeb, 100);

        if(RiskprofileBtnWeb.isDisplayed()){
        	RiskprofileBtnWeb.click();
        }else {
        	System.out.println("Risk Profile Element no Display");
        }

    }
	
	
    public void investmentGoalSelectionONRecommendPlanAndroid(String investmentGoalValue){

        WebElement  investmentGoalBtnWeb=  driver1.findElement(By.xpath("//*[@text='"+investmentGoalValue+"']"));
    	//String a="//button//span[text()=\""+args+"\"";
    	 //WebElement  investmentGoalBtnWeb= driver.findElement(By.xpath(a));
        waitUtils.waitforElementToBeClickable(driver1, investmentGoalBtnWeb, 100);

        if(investmentGoalBtnWeb.isDisplayed()){
        	investmentGoalBtnWeb.click();
        }else {
        	System.out.println(" Investment Goal Element no Display");
        }

    }
	
}
