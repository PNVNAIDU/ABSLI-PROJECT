package com.absli.pageObjects;

import com.absli.Listner.CustomListner;
import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Dashboard extends TestBase{

    public WebDriver driver;
    public AndroidDriver driver1;
    public WaitUtils waitUtils;
    
    


    // Initializing the Page Objects:
    public Dashboard(AndroidDriver driver1) {
        this.driver1 = driver1;
        waitUtils=new WaitUtils();

    }
    public Dashboard(WebDriver driver) {
        this.driver = driver;
        waitUtils=new WaitUtils();
    }



    public void VerifyleapLogoDashboardWeb() {
        WebElement dashboardlogo=driver.findElement(By.xpath("//img[@alt=\"Leap Logo\"]"));
        boolean islogoPresent = dashboardlogo.isDisplayed();
        if(dashboardlogo.isDisplayed()) {
            System.out.println("Leap logo is present ");
        }else {
            System.out.println("Leap logo is not present");
        }
        Assert.assertTrue(islogoPresent, "Logo displayed");
    }




    public void VerifyleapPlusButtonWeb() {
        WebElement plusButton=driver.findElement(By.xpath("//span[@class=\"MuiSpeedDialIcon-root\"]"));
        boolean isbuttonPresent = plusButton.isDisplayed();
        if(plusButton.isDisplayed()) {
            System.out.println("Leap logo is present ");
        }else {
            System.out.println("Leap logo is not present");
        }
        Assert.assertTrue(isbuttonPresent, "plus Button displayed");
    }

    public void VerifyleapPlusButtonAndroid() {
        WebElement plusButton=driver.findElement(By.xpath("//android.view.ViewGroup"));
        boolean isbuttonPresent = plusButton.isDisplayed();
        if(plusButton.isDisplayed()) {
            System.out.println("Leap plus button is present ");
        }else {
            System.out.println("Leap plus button is not present");
        }
        Assert.assertTrue(isbuttonPresent, "plus Button displayed");
    }



    public void clickPlusButtonWeb() {
        WebElement plusBtnWeb=driver.findElement(By.xpath("//button[@class=\"MuiButtonBase-root MuiFab-root MuiSpeedDial-fab MuiFab-primary\"]"));
        waitUtils.waitForElementToBeVisibleweb(driver, plusBtnWeb, 30, "Element is Not Visible");
      if(plusBtnWeb.isDisplayed()){
          plusBtnWeb.click();
          CustomListner.test.log(LogStatus.INFO, "Click On Plus Button");
      }else {
    	  CustomListner.test.log(LogStatus.FAIL, "Plus Button is Not Visible");
      }
    }

    public void clickNewCustomerButton(){
        WebElement newCustomerBtn=driver.findElement(By.xpath("//button[@title='New Customer']"));
        waitUtils.waitForElementToBeVisibleweb(driver, newCustomerBtn, 30, "Element is Not Visible");
        if(newCustomerBtn.isDisplayed()){
            newCustomerBtn.click();
            CustomListner.test.log(LogStatus.INFO, "Click On New Customer Button");
        }else {
        	 CustomListner.test.log(LogStatus.FAIL, "New Customer Button is Not Display");
        }
    }

    public void clickNewCustomerAndroid() {
        WebElement newCustomerBtnAndroid = driver1.findElement(By.xpath("//*[@text='New Customer']"));

        if (newCustomerBtnAndroid.isDisplayed()) {
            newCustomerBtnAndroid.click();
        }

    }



        //=================shubham 3 August changes=======================//



        public void clickHamburgerandSelectNewApplicationWeb() throws InterruptedException {
            WebElement hamburger = driver.findElement(By.xpath("//img[@alt='hamburger menu']"));
            waitUtils.waitForElementToBeVisibleweb(driver , hamburger,100, "element not visible");
            if (hamburger.isDisplayed()) {
                hamburger.click();
            }
            WebElement addNewApplicant = driver.findElement(By.xpath("//button[text() = \"Add New Applicant\"]"));
            waitUtils.waitForElementToBeVisibleweb(driver ,addNewApplicant ,100, "element not visible");
            if (addNewApplicant.isDisplayed()) {
                addNewApplicant.click();
            }
            WebElement createApplication = driver.findElement(By.xpath("//span[text() = \"CREATE APPLICATION\"]"));
            waitUtils.waitForElementToBeVisibleweb(driver ,createApplication ,100, "element not visible");
            if (createApplication.isDisplayed()) {
                createApplication.click();
                waitUtils.sleep(3000);
            }
        }


    public void checkLoaderWeb() throws InterruptedException {
    	try {
    		 WebElement loader = driver.findElement(By.xpath("//span[text()=\"Loading\"]"));
    	        waitUtils.loadingWait(driver,loader);
    	}catch(NoSuchElementException e) {
    		System.out.println("Loading Is Not Display");
    	}
       
    }
    public void checkLoaderHeathAndUreTermWeb() throws InterruptedException {
    	try {
    		 WebElement loader = driver.findElement(By.xpath("(//span[text()='Loading'])[2]"));
    	        waitUtils.loadingWait(driver,loader);
    	}catch(NoSuchElementException e) {
    		System.out.println("Loading Is Not Display");
    	}
       
    }


    public void clickbackWeb() {
        WebElement backButtonWeb = driver.findElement(By.xpath("//*[@id=\"page-container\"]/div[1]/img"));
        waitUtils.waitForElementToBeVisibleweb(driver , backButtonWeb,100, "element not visible");
        if(backButtonWeb.isDisplayed()){
            backButtonWeb.click();
        }else{
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }

    public void clickbackAndroid() {
        WebElement backButtonAndroid = driver1.findElement(By.xpath("//android.widget.TextView[@text='']"));
        waitUtils.waitForElementToBeVisibleweb(driver1 , backButtonAndroid,100, "element not visible");
        if(backButtonAndroid.isDisplayed()){
            backButtonAndroid.click();
        }else{
            driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }


    public void verifyNameWeb(String args ){
        WebElement nameVerification = driver.findElement(By.xpath("(//div[@class=\"uname-val\"])[1]"));
        waitUtils.waitForElementToBeVisibleweb(driver , nameVerification,100, "element not visible");

        if(nameVerification.isDisplayed()){
          String name =   nameVerification.getText();
            System.out.println(name);
         Assert.assertEquals(name, args);
        }
        else{

            System.out.println("application is not created");
        }
    }



    public void verifyNameAndroid(String args ){
        String XPATH = "//android.widget.TextView[@text='"+args+"']";
        WebElement nameVerificationAndroid = driver1.findElement(By.xpath(XPATH ));
        waitUtils.waitForElementToBeVisibleweb(driver1 , nameVerificationAndroid ,100, "element not visible");

        if(nameVerificationAndroid .isDisplayed()){
            String name =   nameVerificationAndroid.getText();
            System.out.println(name);
            Assert.assertEquals(name, args);
        }
        else{

            System.out.println("application is not created");
        }
    }


    public void clickhamburgerAndroid(){
        WebElement hamburgerAndroid = driver1.findElement(By.xpath("//android.widget.ImageView[@content-desc='burgerIcon']"));
        waitUtils.waitForElementToBeVisibleweb(driver1 ,hamburgerAndroid,100, "element not visible");

        if(hamburgerAndroid.isDisplayed()){
            hamburgerAndroid.click();

        }}

        public void logoutBtnAndroid(String args ){
        WebElement logoutAndroid = driver1.findElement(By.xpath("//android.widget.TextView[@text='Logout']"));
        waitUtils.waitForElementToBeVisibleweb(driver1 ,logoutAndroid,100, "element not visible");

        if(logoutAndroid.isDisplayed()){
            logoutAndroid.click();
        }
            WebElement comebackSoon = driver1.findElement(By.xpath("//android.widget.TextView[@text='Come back soon!']"));
            WebElement YesBtn = driver1.findElement(By.xpath("//android.widget.TextView[@text='YES']"));
            WebElement cancelBtn = driver1.findElement(By.xpath("//android.widget.TextView[@text='CANCEL']"));
        if(comebackSoon.isDisplayed()){
            if(args.equalsIgnoreCase("Yes"))
          YesBtn.click();

        }else{
            cancelBtn.click();

        }

    }
        
        
        public void clickPlusButtonweb() {
        	waitUtils.waitForElementToBeVisibleweb(driver, driver.findElement(By.xpath("//span[@class='MuiSpeedDialIcon-root']")), 80,"time out to find element on page");
            WebElement plusBtnWeb=driver.findElement(By.xpath("//span[@class='MuiSpeedDialIcon-root']"));
          if(plusBtnWeb.isDisplayed()){
              plusBtnWeb.click();
              CustomListner.test.log(LogStatus.INFO, "Click on Plus Button");
          }
        }
        public void clickNewCustomerButtonweb(){
        	waitUtils.waitForElementToBeVisibleweb(driver, driver.findElement(By.xpath("//button[@title='New Customer']")), 80,"time out to find element on page");
            WebElement newCustomerBtn=driver.findElement(By.xpath("//button[@title='New Customer']"));
            if(newCustomerBtn.isDisplayed()){
                newCustomerBtn.click();
                CustomListner.test.log(LogStatus.INFO, "Click on New Customer");
            }
        }
        public void clicBackButtonweb(){
        	//waitUtils.waitForElementToBeVisibleweb(driver, driver.findElement(By.xpath("//img[@alt='hamburger menu']")), 80,"time out to find element on page");
            WebElement backBtn=driver.findElement(By.xpath("//img[@alt='hamburger menu']"));
            if(backBtn.isDisplayed()){
            	backBtn.click();
                CustomListner.test.log(LogStatus.INFO, "Click Back BTN ");
            }
        }
        public void clicBackButtonAndroid(){
        	//waitUtils.waitForElementToBeVisibleweb(driver, driver.findElement(By.xpath("//img[@alt='hamburger menu']")), 80,"time out to find element on page");
            WebElement bBtn=driver.findElement(By.xpath("//*[@text='']"));
            if(bBtn.isDisplayed()){
            	bBtn.click();
                CustomListner.test.log(LogStatus.INFO, "Click  Back BTN");
            }
        }
        
        
        public void clickTopHamburgerMenuButtonAndroid() {
        	waitUtils.waitForElementToBeVisibleAndroid(driver1, driver1.findElement(By.xpath("//android.widget.ImageView[@content-desc='burgerIcon']")), 20,"time out to find element on page");
            WebElement plusBtnWeb=driver1.findElement(By.xpath("//android.widget.ImageView[@content-desc='burgerIcon']"));
          if(plusBtnWeb.isDisplayed()){
        	  //JavascriptExecutor executor = (JavascriptExecutor)driver1;
        	 // executor.executeScript("arguments[0].click();", plusBtnWeb);
              plusBtnWeb.click();
              CustomListner.test.log(LogStatus.INFO, "Click on Plus Button");
          }

        }
        
        
        
        
        public void clickTopHamburgerMenuButtonIOS() {
        	waitUtils.waitForElementToBeVisibleIos(driver2, driver2.findElement(By.xpath("//android.widget.ImageView[@content-desc='burgerIcon']")), 20,"time out to find element on page");
            WebElement plusBtnWeb=driver2.findElement(By.xpath("//android.widget.ImageView[@content-desc='burgerIcon']"));
          if(plusBtnWeb.isDisplayed()){
        	  //JavascriptExecutor executor = (JavascriptExecutor)driver1;
        	 // executor.executeScript("arguments[0].click();", plusBtnWeb);
              plusBtnWeb.click();
              CustomListner.test.log(LogStatus.INFO, "Click on Plus Button");
          }

        }
        public void clickNewCustomerIOS() {
            WebElement newCustomerBtnAndroid = driver2.findElement(By.xpath("//*[@text='New Customer']"));

            if (newCustomerBtnAndroid.isDisplayed()) {
                newCustomerBtnAndroid.click();
            }

        }
        
        
        
        
        }

