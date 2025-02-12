package com.absli.testcases;

import com.absli.base.TestBase;
import com.absli.dataproviders.DataProviders;
import com.absli.pageObjects.*;
import com.absli.utils.WaitUtils;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.TestUtil;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class ViewQuoteTest extends TestBase {


    LoginPage loginPage;
    Dashboard dashboard;
    CustomerProfile customerProfile;
    ViewQuote viewQuote;
    PlanInfo planInfo;
    WaitUtils wait;

    public ViewQuoteTest() {
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

    @Test(groups = {"web"}, dataProvider = "viewQuoteDataProvider", dataProviderClass = DataProviders.class,
            description = "TEST-581- To check on clicking the select plan option, I choose between Health and term Recommended plan "+
    "TEST-581-To verify that once user selects health and term, there is NO PSM flow--- user navigates to HEALTH & PURE TERM PLAN page"+
    "TEST-5TEST-581To verify that user can select only from Health and recommend Plan"
    )
    public void selectPlanJourneyWeb(String userName, String passWord, String leadID, String mobileNumber,
                                     String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
                                     String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured, String Rideramount,
                                     String level) throws InterruptedException {
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
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
		wait.WaitTime5();
        customerProfile.fillDOBdetailsWeb(day, month, year);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        customerProfile.customerProfileSaveButtonClick();
        wait.WaitTime2();
        customerProfile.customerProfileNEXTButtonClick();
      //  viewQuote.clickselectPlanBtnWeb();
        wait.WaitTime5();
        viewQuote.selectPlanJourneyNewWeb("BSLI Life Shield");
        planInfo.clickPlanInfoBackBtnWeb();
        Thread.sleep(2000);
        viewQuote.selectPlanJourneyNewWeb("BSLI Life Shield");
        wait.WaitTime5();
        viewQuote.viewQuotePageVerifyWeb();

    }



    @Test(groups = {"web"}, dataProvider = "viewQuoteDataProvider", dataProviderClass = DataProviders.class,
            description = "TEST-258- To verify that the PDF file is downloaded and saved on the device of the user"
    )
    public void generateIllustration(String userName, String passWord, String leadID, String mobileNumber,
                                     String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
                                     String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured, String Rideramount,
                                     String level) throws InterruptedException {
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
        //viewQuote.clickselectPlanBtnWeb();
        viewQuote.selectPlanJourneyNewWeb("BSLI Life Shield");
        Thread.sleep(2000);
        planInfo.clickPlanInfoBackBtnWeb();
        viewQuote.selectPlanJourneyNewWeb("BSLI Life Shield");
        Thread.sleep(2000);
        viewQuote.viewQuotePageVerifyWeb();
        viewQuote.isSmoker(smokerNonSmoker);
        viewQuote.enterSumAssuredWeb(quoteAmount);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        viewQuote.clickIllustrationbtnWeb();
    }

    @Test(groups = {"web"}, dataProvider = "viewQuoteDataProvider", dataProviderClass = DataProviders.class,
            description = "TEST-257-To Verify if the user is able to view the fields below: Sum Assured - Min Rs 50,00,000 Smoker Non-Smoker Plan option Increasing level Riders" +
                    " TEST-257-5 Rider options with value of Rider(in Rs) PPT PT Premium - Annual | Q | S An | M ECS Profiler (Non term) Benefit illustration and Riders" +
                    "To verify that the fields are prefilled as per the plan"+
                    "TEST-582- Verify In View Page Click on (+)ADD RIDERS"+
                    "TEST-582-Validate the riders are NOT mandatory"+
                    "TEST-582 -Riders Plan Should select and Navigate to Plan info Page and display Selected Plan with entered Amount"
                        )
    public void generateQuoteWithRider(String userName, String passWord, String leadID, String mobileNumber,
                                         String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
                                         String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured, String Rideramount,
                                         String level) throws InterruptedException {
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
       // viewQuote.clickselectPlanBtnWeb();
        viewQuote.selectPlanJourneyNewWeb("ABSLI Digishield Plan");
        wait.WaitTime5();
        viewQuote.viewQuotePageVerifyWeb();
        viewQuote.isSmoker(smokerNonSmoker);
        viewQuote.enterSumAssuredWeb(quoteAmount);
      //  viewQuote.selectPlanOptionsWeb(planOptions);
     //   viewQuote.SelectPPTWeb(pptOption);
        Thread.sleep(2000);
        viewQuote.enterPolicyTermWeb(term);
    //    viewQuote.payMode(paymode);
        TestUtil.scrollToElement(driver, driver.findElement(By.xpath("//div[text()='JOINT LIFE']")));
    //    viewQuote.enhancedLifeCoverageWeb();
        viewQuote.aciWeb(AciSumAssured);
        Thread.sleep(2000);
      //  viewQuote.enterRiderQuotePageWeb(Rideramount);
        viewQuote.clickNextBtnCapital();
        

    }


    @Test(groups = {"web"}, dataProvider = "viewQuoteDataProvider", dataProviderClass = DataProviders.class,
            description = "TEST-257-To verify the fields captured have the required validations" +
                    "TEST-257-To verify sum assured has min of Rs 50,00,000. If the user enters values below that, show message - “Min - Rs 50 lacs"+
                    "TEST-257 - Validate Without Entering Sum Assured generate click on Save Please Enter Sum Assured Amout"+
                    "TEST_257Validate Non Smoker By Default Should Select"

    )
    public void verifyQuotePageValidationsWeb(String userName, String passWord, String leadID, String mobileNumber,
                                              String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
                                              String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured, String Rideramount,
                                              String level) throws InterruptedException {
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
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
		wait.WaitTime5();
        customerProfile.fillDOBdetailsWeb(day, month, year);
        customerProfile.customerProfileSaveButtonClick();
        wait.WaitTime2();
        customerProfile.customerProfileNEXTButtonClick();
        wait.WaitTime5();
       // viewQuote.clickselectPlanBtnWeb();
        //viewQuote.selectPlanJourneyNewWeb("BSLI CritiShield Plan");
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //enter the health plan value as Digishield Plan as this is the only plan active
        viewQuote.selectPlanJourneyNewWeb("ABSLI Digishield Plan");
        driver.navigate().refresh();
        wait.WaitTime5();
        //viewQuote.ContinueCapitalWeb();
        viewQuote.viewQuotePageVerifyWeb();
        viewQuote.quotePageValidationsWeb();

    }


    @Test(groups = {"web"}, dataProvider = "viewQuoteDataProvider", dataProviderClass = DataProviders.class,
            description = "To verify that on modifying any of the fields, the quote is calculated again - This should happen on tap out" +
                    "TEST -257- To verify the premium value is changed on tap out of entering any field"
    )
    public void verifyQuoteValueChangeWeb(String userName, String passWord, String leadID, String mobileNumber,
                                          String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
                                          String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured, String Rideramount,
                                          String level) throws InterruptedException {
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
       // viewQuote.clickselectPlanBtnWeb();
        viewQuote.selectPlanJourneyNewWeb("ABSLI Digishield Plan");
        wait.WaitTime5();
        viewQuote.viewQuotePageVerifyWeb();
        viewQuote.quotePageValidationsWeb();
        viewQuote.isSmoker(smokerNonSmoker);
        String str = viewQuote.verifyPremiumWeb();
        viewQuote.enterSumAssuredWeb(quoteAmount);
        viewQuote.enterPolicyTermWeb(term);
        viewQuote.selectPlanOptionsWeb(planOptions);
        String str2 = viewQuote.verifyPremiumWeb();
        Assert.assertNotEquals(str, str2, "Values are not equal");
    }


    @Test(groups = {"web"}, dataProvider = "viewQuoteDataProvider", dataProviderClass = DataProviders.class,
            description = "TEST-257-To verify that the increasing level is only applicable for “Increasing level plan option"
    )
    public void verifyIncreasingLevelPlanWeb(String userName, String passWord, String leadID, String mobileNumber,
                                             String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
                                             String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured, String Rideramount,
                                             String level) throws InterruptedException {

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
        //viewQuote.clickselectPlanBtnWeb();
        viewQuote.selectPlanJourneyNewWeb("ABSLI Digishield Plan");
        wait.WaitTime5();
        viewQuote.viewQuotePageVerifyWeb();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        viewQuote.isSmoker(smokerNonSmoker);
        viewQuote.enterSumAssuredWeb(quoteAmount);
        //Increasing Cover Option
        viewQuote.selectPlanOptionsWeb(planOptions);
        viewQuote.selectIncreasingLevelWeb(level);

    }


    @Test(groups = {"web"}, dataProvider = "viewQuoteDataProvider", dataProviderClass = DataProviders.class,
            description = "TEST-582 Validate Plans Available in Add Riders Page"
    )
    public void verifyriderPageDetailsWeb(String userName, String passWord, String leadID, String mobileNumber,
                                          String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
                                          String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured, String Rideramount,
                                          String level) throws InterruptedException {
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
           // viewQuote.clickselectPlanBtnWeb();
            viewQuote.selectPlanJourneyNewWeb("ABSLI Digishield Plan");
            wait.WaitTime5();
            viewQuote.viewQuotePageVerifyWeb();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            viewQuote.isSmoker(smokerNonSmoker);
            viewQuote.enterSumAssuredWeb(quoteAmount);
            viewQuote.selectPlanOptionsWeb(planOptions);
            viewQuote.SelectPPTWeb(pptOption);
            viewQuote.enterPolicyTermWeb(term);
            TestUtil.scrollToElement(driver, driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")));
            viewQuote.payMode(paymode);
          
            viewQuote.enhancedLifeCoverageWeb();
            viewQuote.aciWeb(AciSumAssured);
            viewQuote.verifyAllRidersWeb();
    }



    @Test(groups = {"web"}, dataProvider = "viewQuoteDataProvider", dataProviderClass = DataProviders.class,
            description = "\n"
            		+ "To check the user can click on the “Download PDF” multiple times before confirm plan and the revised BI will be generated."
    )
    public void verifyIllustrationDownloadWeb(String userName, String passWord, String leadID, String mobileNumber,
                                          String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
                                          String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured, String Rideramount,
                                          String level) throws InterruptedException {
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
           // viewQuote.clickselectPlanBtnWeb();
            viewQuote.selectPlanJourneyNewWeb("ABSLI Digishield Plan");
            driver.navigate().refresh();
            Thread.sleep(5000);
            TestUtil.scrollTillEndOfPage(driver);
            viewQuote.checkGenerateIllustration();
            
    }
    

//========================Below Android Methods By Vijay===================

    @Test(groups = {"Android"}, dataProvider = "viewQuoteDataProvider", dataProviderClass = DataProviders.class,
            description = "TEST-581- To check on clicking the select plan option, I choose between Health and term Recommended plan "+
                    "TEST-581-To verify that once user selects health and term, there is NO PSM flow--- user navigates to HEALTH & PURE TERM PLAN page"+
                    "TEST-5TEST-581To verify that user can select only from Health and recommend Plan"
    )
    public void selectPlanJourneyAndroid(String userName, String passWord, String leadID, String mobileNumber,
                                     String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
                                     String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured, String Rideramount,
                                     String level) throws InterruptedException {
    	 Thread.sleep(3000);
    	 loginPage.enterUserNameAndroid(userName);
         Thread.sleep(2000);
         loginPage.enterpasswordAndroid(passWord);
         Thread.sleep(2000);
         loginPage.submitButtonAndroid();
         Thread.sleep(3000);
         dashboard.clickhamburgerAndroid();
         Thread.sleep(3000);
         dashboard.clickNewCustomerAndroid();
         Thread.sleep(3000);
         customerProfile.enterLeadIDAndroid(leadID);
         ((AndroidDriver)driver1).hideKeyboard();
         Thread.sleep(2000);
         customerProfile.customerProfileNextButtonClickAndroid();
         driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         customerProfile.enterMobileNumberAndroid(mobileNumber);
         driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         customerProfile.enterpanNumberAndroid(panNumber);
         driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         customerProfile.customerProfileNextButtonClickAndroid();
         driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         customerProfile.fillDOBdetailsAndroid(day, month,year);
         Thread.sleep(2000);
         Thread.sleep(2000);
	        viewQuote.clickSaveBtnAndroid();
	        Thread.sleep(3000);
	        viewQuote.clickselectPlanBtnAndroid();
	        Thread.sleep(2000);
	        viewQuote.selectPlanJourneyNewAndroid("ABSLI Digishield Plan");
	        Thread.sleep(5000);
	        driver1.findElement(By.xpath("//*[@text='OK']")).click();
	        Thread.sleep(2000);
	        viewQuote.viewQuotePageVerifyAndroid();
       

    } 

    @Test(groups = {"Android"}, dataProvider = "viewQuoteDataProvider", dataProviderClass = DataProviders.class,
            description = "TEST-258- To verify that the PDF file is downloaded and saved on the device of the user"
    )
    public void generateIllustrationAndroid(String userName, String passWord, String leadID, String mobileNumber,
                                     String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
                                     String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured, String Rideramount,
                                     String level) throws InterruptedException {
    	Thread.sleep(3000);
   	 loginPage.enterUserNameAndroid(userName);
        Thread.sleep(2000);
        loginPage.enterpasswordAndroid(passWord);
        Thread.sleep(2000);
        loginPage.submitButtonAndroid();
        Thread.sleep(3000);
        dashboard.clickhamburgerAndroid();
        Thread.sleep(3000);
        dashboard.clickNewCustomerAndroid();
        Thread.sleep(3000);
        customerProfile.enterLeadIDAndroid(leadID);
        ((AndroidDriver)driver1).hideKeyboard();
        Thread.sleep(2000);
        customerProfile.customerProfileNextButtonClickAndroid();
        driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        customerProfile.enterMobileNumberAndroid(mobileNumber);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.enterpanNumberAndroid(panNumber);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.customerProfileNextButtonClickAndroid();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.fillDOBdetailsAndroid(day, month,year);
        Thread.sleep(2000);
        Thread.sleep(2000);
	        viewQuote.clickSaveBtnAndroid();
	        Thread.sleep(3000);
	        viewQuote.clickselectPlanBtnAndroid();
	        Thread.sleep(2000);
	        viewQuote.selectPlanJourneyNewAndroid("ABSLI Digishield Plan");
	        Thread.sleep(5000);
	        driver1.findElement(By.xpath("//*[@text='OK']")).click();
	        Thread.sleep(2000);
	        viewQuote.viewQuotePageVerifyAndroid();
	        Thread.sleep(2000);
	        
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        viewQuote.isSmokerAndroid(smokerNonSmoker);
        driver1.findElement(By.xpath("//*[@text='OK']")).click();
        Thread.sleep(2000);
        viewQuote.InputSumAssuredAndroid(quoteAmount);
        Thread.sleep(2000);
  
        viewQuote.clickIllustrationbtnAndroid();
    }

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
}

