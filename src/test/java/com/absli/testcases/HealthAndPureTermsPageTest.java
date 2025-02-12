package com.absli.testcases;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.absli.Listner.CustomListner;
import com.absli.base.TestBase;
import com.absli.dataproviders.DataProviders;
import com.absli.pageObjects.CustomerProfile;
import com.absli.pageObjects.Dashboard;
import com.absli.pageObjects.HealthAndPureTermsPage;
import com.absli.pageObjects.LoginPage;
import com.absli.pageObjects.ViewQuote;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import util.TestUtil;

public class HealthAndPureTermsPageTest extends TestBase{
	

    LoginPage loginPage;
    Dashboard dashboard;
    CustomerProfile customerProfile;
    ViewQuote viewQuote;
    HealthAndPureTermsPage healthandpuretermspage;

    public HealthAndPureTermsPageTest() {
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
            healthandpuretermspage=new   HealthAndPureTermsPage(TestBase.driver);
        } else if (TestBase.parameterName.equalsIgnoreCase("Android")) {
            loginPage = new LoginPage(TestBase.driver1);
            dashboard = new Dashboard(TestBase.driver1);
            customerProfile = new CustomerProfile(TestBase.driver1);
            viewQuote = new ViewQuote(TestBase.driver1);
            healthandpuretermspage =new   HealthAndPureTermsPage(TestBase.driver1);
        } else {
            loginPage = new LoginPage(TestBase.driver2);
            dashboard = new Dashboard(TestBase.driver2);
            customerProfile = new CustomerProfile(TestBase.driver2);
            viewQuote = new ViewQuote(TestBase.driver2);
            healthandpuretermspage =new   HealthAndPureTermsPage(TestBase.driver2);
        }
    }
	
	
	
	

    @Test(groups = {"web"}, dataProvider = "HealthAndPureTermsDataProvider", dataProviderClass = DataProviders.class,
            description = "Verify user able to add the Premium value Min-0 to Maximum 100,00,00,000.00"
            		+ "Verify user able to select Occupation dropdown "
            		+ "Verify user able see  to select Life stage field "
            		+ "Verify user able to see Risk profile field."
            		+ "Verify user able to select the option under Investment Goal "
            		+ "Verify able to the PSM is done only when the user is taking a non-term and non-health plan - “Recommended other plans”"
    )
    public void UserAbleToPSMNeedAnalysisWeb(String userName, String passWord, String leadID, String mobileNumber,
            String panNumber, String day, String month, String year,String  premiumValue,String  occupationOption,String lifeStageValue,String  riskProfileFieldValue,String investmentGoalValue ,String errorMSG,String selectACategory,String selectAPlan) throws InterruptedException {
            loginPage.enterUserNameweb(userName);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            loginPage.enterpasswordweb(passWord);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            loginPage.submitButtonweb();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            Thread.sleep(3000);
            dashboard.clickHamburgerandSelectNewApplicationWeb();
            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.enterLeadIDWeb(leadID);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.customerProfileNextButtonClick();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            Thread.sleep(3000);
            customerProfile.enterMobileNumberWeb(mobileNumber);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.enterpanNumberWeb(panNumber);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.customerProfileNextButtonClick();
            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.fillDOBdetailsWeb(day, month, year);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            viewQuote.clickselectPlanBtnWeb();
            Thread.sleep(3000);
            healthandpuretermspage.selectPlanJourneyRecommendPlansWeb("Recommend Plans");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            healthandpuretermspage.enterPremiumValueRecommendPlanWeb(premiumValue);
	        WebElement annualIncomvalue= driver.findElement(By.name("annualIncome"));
	    // String annualIncomeValue=annualIncome.getText();
	        Assert.assertTrue(annualIncomvalue.isDisplayed(),"Element is not display");
	        healthandpuretermspage.OccupationdropdownSelectionONRecommendPlanWeb(occupationOption);
	         Thread.sleep(3000);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        healthandpuretermspage.lifeStageSelectionONRecommendPlanWeb(lifeStageValue);
	        Thread.sleep(3000);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        healthandpuretermspage.RiskprofileSelectionONRecommendPlanWeb(riskProfileFieldValue);
	        Thread.sleep(3000);
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       healthandpuretermspage.investmentGoalSelectionONRecommendPlanWeb(investmentGoalValue );
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
	
    }
    

    @Test(groups = {"Android"}, dataProvider = "HealthAndPureTermsDataProvider", dataProviderClass = DataProviders.class,
    		 description = "Verify user able to add the Premium value Min-0 to Maximum 100,00,00,000.00"
             		+ "Verify user able to select Occupation dropdown "
             		+ "Verify user able see  to select Life stage field "
             		+ "Verify user able to see Risk profile field."
             		+ "Verify user able to select the option under Investment Goal "
    )
    public void UserAbleToPSMNeedAnalysisAndroid(String userName, String passWord, String leadID, String mobileNumber,
            String panNumber, String day, String month, String year,String  premiumValue,String  occupationOption,String lifeStageValue,String  riskProfileFieldValue,String investmentGoalValue,String errorMSG,String selectACategory,String selectAPlan) throws InterruptedException {
    	
    	  
    	  
    	
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
         Thread.sleep(3000);
         customerProfile.enterMobileNumberAndroid(mobileNumber);
         driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         customerProfile.enterpanNumberAndroid(panNumber);
         customerProfile.customerProfileNextButtonClickAndroid();
         Thread.sleep(3000);
        customerProfile.fillDOBdetailsAndroid(day, month,year);
        Thread.sleep(2000);
            Thread.sleep(2000); 
             healthandpuretermspage.clickSaveBtnAndroid();
    
    	
    	
     healthandpuretermspage.clickselectPlanBtnAndroid();
     driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     healthandpuretermspage.selectPlanJourneyRecommendPlansAndroid("Recommend Plans");
     driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     healthandpuretermspage.enterPremiumValueRecommendPlanAndroid(premiumValue);
    // WebElement annualIncomvalueAndroid= driver1.findElement(By.xpath("//*[@text='Enter Annual Income']"));
    // String annualIncomeValue=annualIncome.getText();
     //Assert.assertTrue(annualIncomvalueAndroid.isDisplayed(),"Element is not display");
     healthandpuretermspage.OccupationdropdownSelectionONRecommendPlanAndroid(occupationOption);
     driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     healthandpuretermspage.lifeStageSelectionONRecommendPlanAndroid(lifeStageValue);
     driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     healthandpuretermspage.investmentGoalSelectionONRecommendPlanAndroid(investmentGoalValue);
     driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     healthandpuretermspage.RiskprofileSelectionONRecommendPlanAndroid(riskProfileFieldValue);
     driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
	
    }
    
 

    @Test(groups = {"web"}, dataProvider = "HealthAndPureTermsDataProvider", dataProviderClass = DataProviders.class,
            description = "Verify user able to select Existing insurance policy   "
    )
    public void userSelectExistingInsurancepolicyWeb(String userName, String passWord, String leadID, String mobileNumber,
            String panNumber, String day, String month, String year,String  premiumValue,String  occupationOption,String lifeStageValue,String  riskProfileFieldValue,String investmentGoalValue,String errorMSG,String selectACategory,String selectAPlan ) throws InterruptedException {
            loginPage.enterUserNameweb(userName);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            loginPage.enterpasswordweb(passWord);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            loginPage.submitButtonweb();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
            dashboard.clickHamburgerandSelectNewApplicationWeb();
            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.enterLeadIDWeb(leadID);
            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.customerProfileNextButtonClick();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            Thread.sleep(3000);
            customerProfile.enterMobileNumberWeb(mobileNumber);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.enterpanNumberWeb(panNumber);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.customerProfileNextButtonClick();
            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.fillDOBdetailsWeb(day, month, year);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            viewQuote.clickselectPlanBtnWeb();
            Thread.sleep(3000);
            healthandpuretermspage.selectPlanJourneyRecommendPlansWeb("Recommend Plans");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            TestUtil.scrollTillEndOfPage(driver);
    
            Thread.sleep(3000);
            WebElement ulipElement=  driver.findElement(By.xpath("//div[text()='ULIP']"));
            WebElement traditionalElement=  driver.findElement(By.xpath("//div[text()='Traditional']"));
            WebElement protectionElement=  driver.findElement(By.xpath("//div[text()='Protection']"));
            WebElement healthElement=  driver.findElement(By.xpath("//div[text()='Health']"));
    
    	    boolean ulipValue=ulipElement.isDisplayed();
    	    boolean traditionalValuet=traditionalElement.isDisplayed();
    	    boolean protectionValue=protectionElement.isDisplayed();
    	    boolean healthValue=healthElement.isDisplayed();
             
           Assert.assertTrue(ulipValue);
           Assert.assertTrue(traditionalValuet);
           Assert.assertTrue(protectionValue);
           Assert.assertTrue(healthValue);
       
    }
    

    
    @Test(groups = {"web"}, dataProvider = "HealthAndPureTermsDataProvider", dataProviderClass = DataProviders.class,
            description = "Verify user able to Select View other products drop down "
            		+ "Verify user able to click on dropdown of Select plan   "
    )
    public void UserAbleAnyFieldsAreNOTEnteredWeb(String userName, String passWord, String leadID, String mobileNumber,
            String panNumber, String day, String month, String year,String  premiumValue,String  occupationOption,String lifeStageValue,String  riskProfileFieldValue,String investmentGoalValue,String errorMSG,String selectACategory,String selectAPlan ) throws InterruptedException {
            loginPage.enterUserNameweb(userName);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            loginPage.enterpasswordweb(passWord);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            loginPage.submitButtonweb();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            Thread.sleep(3000);
            dashboard.clickHamburgerandSelectNewApplicationWeb();
            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.enterLeadIDWeb(leadID);
            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.customerProfileNextButtonClick();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            Thread.sleep(3000);
            customerProfile.enterMobileNumberWeb(mobileNumber);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.enterpanNumberWeb(panNumber);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.customerProfileNextButtonClick();
            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.fillDOBdetailsWeb(day, month, year);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            viewQuote.clickselectPlanBtnWeb();
            Thread.sleep(3000);
            healthandpuretermspage.selectPlanJourneyRecommendPlansWeb("Recommend Plans");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            healthandpuretermspage.enterPremiumValueRecommendPlanWeb(premiumValue);
            Thread.sleep(3000);
            healthandpuretermspage.OccupationdropdownSelectionONRecommendPlanWeb(occupationOption);
            Thread.sleep(3000);
            healthandpuretermspage.lifeStageSelectionONRecommendPlanWeb(lifeStageValue);
            Thread.sleep(3000);
            healthandpuretermspage.RiskprofileSelectionONRecommendPlanWeb(riskProfileFieldValue);
            healthandpuretermspage.investmentGoalSelectionONRecommendPlanWeb(investmentGoalValue);
            TestUtil.scrollTillEndOfPage(driver);
            Thread.sleep(3000);
            healthandpuretermspage.clickViewPlanBTNONRecommendPlanWeb();
           
            Thread.sleep(3000);
	        WebElement errorMSGElement= driver.findElement(By.xpath("//p[text()='Please enter Annual Income']"));
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        TestUtil.verifybgColor(errorMSGElement, driver);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        String errorValue=errorMSGElement.getText();
	        Assert.assertEquals(errorValue, errorMSG);
    }
    
    
    
    
    
    
    
    
    @Test(groups = {"web"}, dataProvider = "HealthAndPureTermsDataProvider", dataProviderClass = DataProviders.class,
            description = "Verify user able to Select View other products drop down "
            		+ "Verify user able to click on dropdown of Select plan   "
    )
    public void userSelectViewOtherProductWeb(String userName, String passWord, String leadID, String mobileNumber,
            String panNumber, String day, String month, String year,String  premiumValue,String  occupationOption,String lifeStageValue,String  riskProfileFieldValue,String investmentGoalValue,String errorMSG,String selectACategory,String selectAPlan ) throws InterruptedException {
            loginPage.enterUserNameweb(userName);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            loginPage.enterpasswordweb(passWord);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            loginPage.submitButtonweb();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            Thread.sleep(3000);
            dashboard.clickHamburgerandSelectNewApplicationWeb();
            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.enterLeadIDWeb(leadID);
            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.customerProfileNextButtonClick();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            Thread.sleep(3000);
            customerProfile.enterMobileNumberWeb(mobileNumber);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.enterpanNumberWeb(panNumber);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.customerProfileNextButtonClick();
            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.fillDOBdetailsWeb(day, month, year);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            viewQuote.clickselectPlanBtnWeb();
            Thread.sleep(3000);
            healthandpuretermspage.selectPlanJourneyRecommendPlansWeb("Recommend Plans");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            healthandpuretermspage.enterPremiumValueRecommendPlanWeb(premiumValue);
            Thread.sleep(3000);
            healthandpuretermspage.OccupationdropdownSelectionONRecommendPlanWeb(occupationOption);
            Thread.sleep(3000);
            healthandpuretermspage.lifeStageSelectionONRecommendPlanWeb(lifeStageValue);
            Thread.sleep(3000);
            healthandpuretermspage.RiskprofileSelectionONRecommendPlanWeb(riskProfileFieldValue);
            healthandpuretermspage.investmentGoalSelectionONRecommendPlanWeb(investmentGoalValue );
            TestUtil.scrollTillEndOfPage(driver);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            healthandpuretermspage.clickViewPlanBTNONRecommendPlanWeb();
          
            Thread.sleep(3000);
            healthandpuretermspage.clickViewOtherProductBTNONRecommendPlanWeb();
            
            new WebDriverWait(driver, 40).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            healthandpuretermspage.SelectACategorydropdownONRecommendPlanWeb(selectACategory);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            healthandpuretermspage.SelectAPlanydropdownONRecommendPlanWeb(selectAPlan);
            
    } 
    
    
    
    
    @Test(groups = {"web"}, dataProvider = "HealthAndPureTermsDataProvider", dataProviderClass = DataProviders.class,
            description = "Verify user able to see  list of products recommended by PX based on the input of the user. "
    )
    public void userViewTheListofProductsRecommendedWeb(String userName, String passWord, String leadID, String mobileNumber,
            String panNumber, String day, String month, String year,String  premiumValue,String  occupationOption,String lifeStageValue,String  riskProfileFieldValue,String investmentGoalValue,String errorMSG,String selectACategory,String selectAPlan ) throws InterruptedException {
            loginPage.enterUserNameweb(userName);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            loginPage.enterpasswordweb(passWord);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            loginPage.submitButtonweb();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
            dashboard.clickHamburgerandSelectNewApplicationWeb();
            
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            customerProfile.enterLeadIDWeb(leadID);
            new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.customerProfileNextButtonClick();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            Thread.sleep(3000);
            customerProfile.enterMobileNumberWeb(mobileNumber);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.enterpanNumberWeb(panNumber);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.customerProfileNextButtonClick();
            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            customerProfile.fillDOBdetailsWeb(day, month, year);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            viewQuote.clickselectPlanBtnWeb();
            Thread.sleep(3000);
            healthandpuretermspage.selectPlanJourneyRecommendPlansWeb("Recommend Plans");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            healthandpuretermspage.enterPremiumValueRecommendPlanWeb(premiumValue);
            Thread.sleep(3000);
            healthandpuretermspage.OccupationdropdownSelectionONRecommendPlanWeb(occupationOption);
            Thread.sleep(3000);
            healthandpuretermspage.lifeStageSelectionONRecommendPlanWeb(lifeStageValue);
            Thread.sleep(3000);
            healthandpuretermspage.RiskprofileSelectionONRecommendPlanWeb(riskProfileFieldValue);
            healthandpuretermspage.investmentGoalSelectionONRecommendPlanWeb(investmentGoalValue );
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            TestUtil.scrollTillEndOfPage(driver);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            healthandpuretermspage.clickViewPlanBTNONRecommendPlanWeb();
            //WebElement viewplanBTN=driver.findElement(By.xpath("//span[text()='View Plans']"));
           // if(viewplanBTN.isDisplayed()) {
            	//viewplanBTN.click();
          //  }
            
            new WebDriverWait(driver, 20).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
        WebElement listOfTheProduct=   driver.findElement(By.xpath("//div[text()='BSLI Guaranteed Milestone Plan']"));
        boolean listValue=listOfTheProduct.isDisplayed();
        Assert.assertTrue(listValue);
            
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
