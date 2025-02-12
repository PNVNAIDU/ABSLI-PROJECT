package com.absli.testcases;

import com.absli.Listner.CustomListner;
import com.absli.base.TestBase;
import com.absli.dataproviders.DataProviders;
import com.absli.pageObjects.CustomerProfile;
import com.absli.pageObjects.Dashboard;
import com.absli.pageObjects.LoginPage;
import com.absli.pageObjects.PlanInfo;
import com.absli.pageObjects.ViewQuote;
import com.absli.utils.WaitUtils;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import util.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class DashboardPageTest extends TestBase {

    LoginPage loginPage;
    Dashboard dashboard;
    CustomerProfile customerProfile;
    WaitUtils wait;
    ViewQuote viewQuote;
 
    public DashboardPageTest(){
        super();

    }

    @BeforeClass
    public void preSetup() throws IOException {initialization();}


    @BeforeMethod
    public void setUp() throws MalformedURLException {

        if (TestBase.parameterName.equalsIgnoreCase("web")) {
            loginPage = new LoginPage(TestBase.driver);
            dashboard = new Dashboard(TestBase.driver);
            customerProfile = new CustomerProfile(TestBase.driver);
            viewQuote=new ViewQuote(driver);
           
        }
        else if(TestBase.parameterName.equalsIgnoreCase("Android")) {
            loginPage = new LoginPage(TestBase.driver1);
            dashboard = new Dashboard(TestBase.driver1);
            customerProfile = new CustomerProfile(TestBase.driver1);
            viewQuote=new ViewQuote(driver1);
            
        }
        else {
            loginPage = new LoginPage(TestBase.driver2);
            dashboard = new Dashboard(TestBase.driver2);
            customerProfile = new CustomerProfile(TestBase.driver2);
            viewQuote=new ViewQuote(driver2);
            
        }
    }


    /**
     * Testcase for logo verification in the leap app dashboard
     */
    @Test(groups= {"Web"},dataProvider = "dashboardDataProvider", dataProviderClass = DataProviders.class,
    description = "User verifies the leap logo on the dashboard screen")
    public void VerifyLeapLogoWeb(String userName, String passWord, String leadID,String mobileNumber,
            String panNumber, String day, String month, String year){
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonweb();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.VerifyPageTitleweb();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboard.VerifyleapLogoDashboardWeb();
    }

    @Test(groups = {"Android" }, dataProvider = "datadashboardProvider", dataProviderClass = DataProviders.class,
            description = " ||To check LOGO of comapny is Display")
    public void VerifyLeapLogoAndroid(String userName, String passWord, String leadID,String mobileNumber,
            String panNumber, String day, String month, String year) {
        System.out.println("login case starting ");
        driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginPage.enterUserNameAndroid(userName);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordAndroid(passWord);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonAndroid();
        loginPage.VerifyPageTitleAndroid();


    }

    /**
     * Testcase for header components verification in the leap app dashboard
     */
    @Test(groups= {"Web"},dataProvider = "dashboardDataProvider", dataProviderClass = DataProviders.class,
            description = "User verifies if the dashboard page is opening"+
    "TEST-121-To check on clicking new application, the user should land on the create application page")
    public void VerifyDashboardHeaderWeb(String userName, String passWord, String leadID,String mobileNumber,
            String panNumber, String day, String month, String year){
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonweb();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Verifying the title of the dashboard page
        loginPage.VerifyPageTitleweb();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Verifying the plus button on the dashboard screen
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboard.VerifyleapPlusButtonWeb();
    }


    @Test(groups= {"Android"},dataProvider = "dashboardDataProvider", dataProviderClass = DataProviders.class,
            description = "User verifies if the dashboard page is opening")
    public void VerifyDashboardHeadersAndroid(String userName, String passWord, String leadID,String mobileNumber,
            String panNumber, String day, String month, String year){
        loginPage.enterUserNameAndroid(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordAndroid(passWord);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonAndroid();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Verifying the title of the dashboard page
        loginPage.VerifyPageTitleAndroid();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Verifying the plus button on the dashboard screen
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboard.VerifyleapPlusButtonAndroid();
    }



    @Test(groups= {"IOS"},dataProvider = "dashboardDataProvider", dataProviderClass = DataProviders.class,
            description = "User verifies if the dashboard page is opening")
    public void VerifyDashboardHeadersIOS(String userName, String passWord, String leadID,String mobileNumber,
            String panNumber, String day, String month, String year){

    }


    /**
     * Testcase to check plus button functionality
     * 1. Checking the New application button
     */
    @Test(groups= {"Web"},dataProvider = "dashboardDataProvider", dataProviderClass = DataProviders.class,
    description="TEST-121-To check if user wants to create new application")
    public void VerifyNewApplicationWeb(String userName, String passWord, String leadID,String mobileNumber,
            String panNumber, String day, String month, String year) {
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonweb();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboard.clickPlusButtonWeb();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboard.clickNewCustomerButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.VerifyCustomerProfileHeaderWeb();


    }

    @Test(groups= {"Android"},dataProvider = "dashboardDataProvider", dataProviderClass = DataProviders.class,
            description="TEST-121-To check if user wants to create new application")
    public void VerifyNewApplicationAndroid(String userName, String passWord, String leadID,String mobileNumber,
            String panNumber, String day, String month, String year) {
        loginPage.enterUserNameAndroid(userName);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordAndroid(passWord);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonAndroid();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboard.clickNewCustomerAndroid();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.VerifyCustomerProfileHeaderAndroid();
    }

    @Test(groups= {"IOS"},dataProvider = "dataSignInProvider", dataProviderClass = DataProviders.class,
            description="TEST-121-To check if user wants to create new application")
    public void VerifyNewApplicationIOS(String userName, String passWord, String leadID,String mobileNumber,
            String panNumber, String day, String month, String year) {

        System.out.println("login case starting ");
        driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterUserNameIOS(userName);
        driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordIOS(passWord);
        driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonIOS();

        // this is incomplete

    }

//==========================shubham 3 august =================================/

    @Test(groups= {"web"},dataProvider = "dashboardDataProvider", dataProviderClass = DataProviders.class,
            description = "TEST-1153- validate that user should able gets the option to check the status update of Application on the dashboard screen "+
    "TEST-2567-validate that user should able gets the option to check the status update of Application on the dashboard screen"+
    "TEST-2567- User able to click on logout button"+
    "TEST-2567- User should be able to logout from LEAP anytime while creating application"+
    "TEST-2567- User should displays logout option on right hand top corner"+
    "TEST-2567- When user clicks on yes user should navigate to login page")
    public void dashboardloginLogoutWeb(String userName, String passWord, String leadID,String mobileNumber,
                                        String panNumber, String day, String month, String year) throws InterruptedException {
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonweb();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       // dashboard.checkLoaderWeb();
        Thread.sleep(2000);
        dashboard.clickHamburgerandSelectNewApplicationWeb();
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        customerProfile.enterLeadIDWeb(leadID);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //dashboard.checkLoaderWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.enterpanNumberWeb(panNumber);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.fillDOBdetailsWeb(day, month,year);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     //   customerProfile.iAmSureBtnWeb();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboard.clickbackWeb();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboard.clickbackWeb();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboard.clickbackWeb();
       // dashboard.checkLoaderWeb();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboard.verifyNameWeb("Ms. SRIDEVI HARSHAVARDHAN PARVATIKAR");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.logout();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.loginHeaderVerify();

    }



    @Test(groups= {"Android"},dataProvider = "dashboardDataProvider", dataProviderClass = DataProviders.class,
            description = "TEST-1153- validate that user should able gets the option to check the status update of Application on the dashboard screen "+
                    "TEST-2567-validate that user should able gets the option to check the status update of Application on the dashboard screen"+
                    "TEST-2567- User able to click on logout button"+
                    "TEST-2567- User should be able to logout from LEAP anytime while creating application"+
                    "TEST-2567- User should displays logout option on right hand top corner"+
                    "TEST-2567-User clicks on the logout option user gets the Popup \"Come back soon! Are you sure you want to logout\" with Yes and Cancel option"+
                    "TEST-2567- When user clicks on yes user should navigate to login page"+
                    "TEST-2567-When user clicks on yes user should navigate to login page"+
                    "TEST-2567-when user click “cancel” button he will remain on the same"
    )
    public void dashboardloginLogoutAndroid(String userName, String passWord, String leadID,String mobileNumber,
                                        String panNumber, String day, String month, String year) throws InterruptedException {
        System.out.println("Android case starting ");
        driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginPage.enterUserNameAndroid(userName);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordAndroid(passWord);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonAndroid();
        driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginPage.clickHamburgerIconAndroid();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.clickNewCustomerIconAndroid();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.enterLeadIDAndroid(leadID);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ((AndroidDriver) driver1).hideKeyboard();
        customerProfile.clickNextBtnCustomerProfileAndroid();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.enterMobileNumberAndroid(mobileNumber);
        ((AndroidDriver) driver1).hideKeyboard();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.enterpanNumberAndroid(panNumber);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.clickNextBtnCustomerProfileAndroid();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.fillDOBdetailsAndroid(day,month,year);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.clickSaveBtnCustomerProfileAndroid();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboard.clickbackAndroid();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboard.clickbackAndroid();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboard.clickbackAndroid();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboard.verifyNameAndroid("Ms. SRIDEVI PARVATIKAR");
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboard.clickhamburgerAndroid();
        dashboard.logoutBtnAndroid("Yes");
        System.out.println("Test ends here ");

    }



    @Test(groups= {"ios"},dataProvider = "dashboardDataProvider", dataProviderClass = DataProviders.class,
            description = "TEST-1153- validate that user should able gets the option to check the status update of Application on the dashboard screen "+
                    "TEST-2567-validate that user should able gets the option to check the status update of Application on the dashboard screen"+
                    "TEST-2567- User able to click on logout button"+
                    "TEST-2567- User should be able to logout from LEAP anytime while creating application"+
                    "TEST-2567- User should displays logout option on right hand top corner"+
                    "TEST-2567-User clicks on the logout option user gets the Popup \"Come back soon! Are you sure you want to logout\" with Yes and Cancel option"+
                    "TEST-2567- When user clicks on yes user should navigate to login page"+
                    "TEST-2567-When user clicks on yes user should navigate to login page"+
                    "TEST-2567-when user click “cancel” button he will remain on the same"
    )
    public void dashboardloginLogoutIOS(String userName, String passWord, String leadID,String mobileNumber,
                                            String panNumber, String day, String month, String year) throws InterruptedException {

        System.out.println("IOS case starting ");
        driver2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginPage.enterUserNameIOS(userName);
        driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordAndroid(passWord);
        driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonIOS();

        System.out.println("Test ends here ");


    }
  
    
    
    
    
  //==========================shubham 3 august =================================/
    
    
    

    @Test(groups= {"web"},dataProvider = "dashboardDataProvider", dataProviderClass = DataProviders.class,
            description = "User should be able  to  see Application number of Customer below the full name.")
    public void UserSeeApplicationNumberOfCustomerFullNameWeb(String userName, String passWord, String leadID,String mobileNumber,
                                        String panNumber, String day, String month, String year) throws InterruptedException {
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonweb();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       // dashboard.checkLoaderWeb();
        Thread.sleep(2000);
        dashboard.clickHamburgerandSelectNewApplicationWeb();
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        customerProfile.enterLeadIDWeb(leadID);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //dashboard.checkLoaderWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.enterpanNumberWeb(panNumber);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.fillDOBdetailsWeb(day, month,year);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        viewQuote.clickselectPlanBtnWeb();
        
        
        dashboard.clicBackButtonweb();
        Thread.sleep(4000);
        dashboard.clicBackButtonweb();
        Thread.sleep(4000);
        dashboard.clicBackButtonweb();
        Thread.sleep(4000);
        dashboard.clicBackButtonweb();
        Thread.sleep(4000);
      
       WebElement panverifyname=driver.findElement(By.xpath("//div[text()='Ms. SRIDEVI HARSHAVARDHAN PARVATIKAR']"));
       Assert.assertTrue(panverifyname.isDisplayed());
        
     
    }

    
    

    @Test(groups= {"Android"},dataProvider = "dashboardDataProvider", dataProviderClass = DataProviders.class,
            description = "User should be able  to  see Application number of Customer below the full name.")
    public void UserSeeApplicationNumberOfCustomerFullNameAndroid(String userName, String passWord, String leadID,String mobileNumber,
                                        String panNumber, String day, String month, String year) throws InterruptedException {
    	loginPage.enterUserNameAndroid(userName);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordAndroid(passWord);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonAndroid();    
        dashboard.clickTopHamburgerMenuButtonAndroid();
        dashboard.clickNewCustomerAndroid();
        customerProfile.enterLeadIDAndroid(leadID);
        ((AndroidDriver)driver1).hideKeyboard();
       driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.customerProfileNextButtonClickAndroid();
       // new WebDriverWait(driver, 50).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.enterMobileNumberAndroid(mobileNumber);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.enterpanNumberAndroid(panNumber);
      
 
      WebElement nextBTN=driver1.findElement(By.xpath("//android.widget.TextView[@text='NEXT']"));
      driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      boolean flag=nextBTN.isDisplayed();
      if(nextBTN.isDisplayed()) {
      	nextBTN.click();
      	CustomListner.test.log(LogStatus.INFO, "Successfully Verified NEXTBTN ");
      }
      driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      customerProfile.fillDOBdetailsAndroid(day, month, year);
      driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
     WebElement SaveBTN= driver1.findElement(By.xpath("//*[@text='SAVE']"));
     if(SaveBTN.isDisplayed()) {
    	 SaveBTN.click();
     }
     dashboard.clicBackButtonAndroid();
     
     Thread.sleep(3000);
     dashboard.clicBackButtonAndroid();
     Thread.sleep(3000);
     dashboard.clicBackButtonAndroid();
     Thread.sleep(3000);
     dashboard.clicBackButtonAndroid();
     Thread.sleep(3000);
       WebElement panverifyname=driver1.findElement(By.xpath("//*[@text='Ms. SRIDEVI PARVATIKAR']"));
       Assert.assertTrue(panverifyname.isDisplayed());
        
     
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
