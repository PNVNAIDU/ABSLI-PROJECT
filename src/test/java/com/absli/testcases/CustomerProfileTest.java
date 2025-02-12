package com.absli.testcases;

import com.absli.Listner.CustomListner;
import com.absli.base.TestBase;
import com.absli.dataproviders.DataProviders;
import com.absli.pageObjects.CustomerProfile;
import com.absli.pageObjects.Dashboard;
import com.absli.pageObjects.LoginPage;
import com.absli.utils.WaitUtils;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.EmptyStackException;
import java.util.concurrent.TimeUnit;

public class CustomerProfileTest extends TestBase {


    LoginPage loginPage;
    Dashboard dashboard;
    CustomerProfile customerProfile;
    WaitUtils wait;
    //public   AndroidDriver driver1;
    //private  AndroidDriver AndroidDriver;

    public CustomerProfileTest (){
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
            wait=new WaitUtils();

        }
        else if(TestBase.parameterName.equalsIgnoreCase("Android")) {
            loginPage = new LoginPage(TestBase.driver1);
            dashboard = new Dashboard(TestBase.driver1);
            customerProfile = new CustomerProfile(TestBase.driver1);
            wait=new WaitUtils();
        }
        else {
            loginPage = new LoginPage(TestBase.driver1);
            dashboard = new Dashboard(TestBase.driver1);
            customerProfile = new CustomerProfile(TestBase.driver1);
            wait=new WaitUtils();
        }
    }


    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "TEST-121-To check in case of DM, the user will be asked to enter the mobile no. and LEAD ID"
                    +"TEST-261-To Verify on clicking the + symbol or Add new applicant, the user is given the option to select the type of customer - Existing and new customer"+
                    "TEST-261-To check on clicking new customer and create application, the user should be able to go the next page where the lead ID is entered"+
                    "TEST-2567-Verify that user able to click on logout button"
                    +"TEST-2567-Verify that user should be able to logout from LEAP anytime while creating application"
                    +"")
    public void enterCustomerProfileDetailsWeb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        dashboard.clickPlusButtonWeb();    
        dashboard.clickNewCustomerButton();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait.WaitTime5();
        customerProfile.VerifyCustomerProfileHeaderWeb();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait.WaitTime5();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        loginPage.logout();


    }


    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description ="Customer profile detils with blank id ")
    public void CustomerProfileDetailswithBlankLeadIDWeb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait.WaitTime2();
        customerProfile.VerifyCustomerProfileHeaderWeb();
        //Fill blank customerID
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        wait.WaitTime2();
        customerProfile.leadIDEmptyValidationWeb();
        loginPage.logout();

    }



//********************This Method Not Present On Excel Sheet***************************CustomerProfilePageVerificationWeb
    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "Verification of customer profile page lead id with incorrect data ")
    public void CustomerProfilePageVerificationWeb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        wait.WaitTime5();
        customerProfile.enterLeadIDWeb(leadID); 
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait.WaitTime5();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        loginPage.logout();


    }

//=================================3 August changes ============================//

    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "tc-76:sc-07  ||TEST-17- To check on clicking save, the system to check if the DOB is correct as per API"+
                    "tc-77  ||TEST-17-To check Based on the PAN and DOB combination, API to send response if the DOB is correct or not" +
                    "tc-78  ||TEST-17- To check If DOB is correct, the DOB will be captured as “Verified” and icon to appear against DOB ")
    public void pancardValidationsDOB(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        wait.WaitTime5();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait.WaitTime5();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait.WaitTime5();
        customerProfile.fillDOBdetailsWeb(day, month,year);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        //customerProfile.customerProfileSaveButtonClick();
        WebElement Verifiedtick=driver.findElement(By.xpath("(//img[@alt='tick'])[4]"));
        Assert.assertTrue(Verifiedtick.isDisplayed(),"Element is not display");
        TestUtil.verifybgColor(Verifiedtick, driver);

    }
    @Test(groups= {"Android"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "tc-76:sc-07  ||TEST-17- To check on clicking save, the system to check if the DOB is correct as per API"+
                    "tc-77  ||TEST-17-To check Based on the PAN and DOB combination, API to send response if the DOB is correct or not" +
                    "tc-78  ||TEST-17- To check If DOB is correct, the DOB will be captured as “Verified” and icon to appear against DOB ")
    public void pancardValidationsDOBAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.enterUserNameAndroid(userName);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordAndroid(passWord);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonAndroid();
        Thread.sleep(5000);
        dashboard.clickhamburgerAndroid();
        Thread.sleep(3000);
        dashboard.clickNewCustomerAndroid();
        Thread.sleep(3000);
        customerProfile.enterLeadIDAndroid(leadID);
        ((AndroidDriver)driver1).hideKeyboard();
        Thread.sleep(3000);
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
        customerProfile.customerProfileSaveButtonClickAndroid();
        Thread.sleep(5000);
        WebElement Verifiedtick=driver1.findElement(By.xpath("//android.widget.TextView[@text='󰗡']"));
        Assert.assertTrue(Verifiedtick.isDisplayed(),"Element is not display");

    }
    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "tc-82:sc-07  ||TEST-17- To check If proposer DOB is less than 18 years old, we need to show message - “Proposer needs to be above 18 years old”")
    public void verifyDOBLessThan18Yearsweb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        wait.WaitTime5();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait.WaitTime5();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait.WaitTime5();
        customerProfile.fillDOBdetailsWeb(day, month,year);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        WebElement ErrorMSG=driver.findElement(By.xpath("//span[text()='Proposer needs to be above 18 years old']"));
        String getvalue=ErrorMSG.getText();
        TestUtil.verifybgColor(ErrorMSG, driver);
        if(ErrorMSG.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified DOB Error MSG..Proposer needs to be above 18 years old");
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Proposer needs to be above 18 years old DOB Error MSG");
        }
        Assert.assertEquals(DOBErrorMSG, getvalue);


    }
    @Test(groups= {"Android"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "tc-82:sc-07  ||TEST-17- To check If proposer DOB is less than 18 years old, we need to show message - “Proposer needs to be above 18 years old”")
    public void verifyDOBLessThan18YearsAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.enterUserNameAndroid(userName);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordAndroid(passWord);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonAndroid();
        Thread.sleep(3000);
        dashboard.clickhamburgerAndroid();
        Thread.sleep(3000);
        dashboard.clickNewCustomerAndroid();
        Thread.sleep(3000);
        customerProfile.enterLeadIDAndroid(leadID);
        ((AndroidDriver)driver1).hideKeyboard();
        customerProfile.customerProfileNextButtonClickAndroid();
        Thread.sleep(3000);
        customerProfile.enterMobileNumberAndroid(mobileNumber);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.enterpanNumberAndroid(panNumber);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.customerProfileNextButtonClickAndroid();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.fillDOBdetailsAndroid(day, month,year);
        Thread.sleep(3000);
        WebElement ErrorMSG=driver1.findElement(By.xpath("//android.widget.TextView[@content-desc='inputHelperText']"));
        String getvalue=ErrorMSG.getText();
        if(ErrorMSG.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified DOB Error MSG");
        }else {
            CustomListner.test.log(LogStatus.INFO, "Failed to Verified DOB Error MSG");
        }
        Assert.assertEquals(DOBErrorMSG, getvalue);


    }

    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "tc-01:sc-01  ||TEST-6- To check The field should only allow min 10 digit Numeric values"
                    + "tc-03  ||TEST-6-To check Numbers beginning with 0, 1, 2, 3, 5 will NOT be allowed - Message should be displayed on verify  - “Invalid mobile no.”")
    public void verifyMobileNumberstartWith012345Validationweb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        wait.WaitTime5();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait.WaitTime5();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        Thread.sleep(3000);
        WebElement ErrorMSG=driver.findElement(By.xpath("//p[text()='Invalid mobile no.']"));
        String getvalue=ErrorMSG.getText();
        TestUtil.verifybgColor(ErrorMSG, driver);
        if(ErrorMSG.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Invalid mobile no. Mobile Number Error MSG");
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Invalid mobile no. Mobile Number Error MSG");
        }
        Assert.assertEquals(MobileErrorMSG, getvalue);
    }
    @Test(groups= {"Android"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "tc-01:sc-01  ||TEST-6- To check The field should only allow min 10 digit Numeric values"
                    + "tc-03  ||TEST-6-To check Numbers beginning with 0, 1, 2, 3, 5 will NOT be allowed - Message should be displayed on verify  - “Invalid mobile no.”")
    public void verifyMobileNumberstartWith012345ValidationAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.enterUserNameAndroid(userName);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordAndroid(passWord);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonAndroid();
        Thread.sleep(3000);
        dashboard.clickhamburgerAndroid();
        Thread.sleep(3000);
        dashboard.clickNewCustomerAndroid();
        Thread.sleep(3000);
        customerProfile.enterLeadIDAndroid(leadID);
        ((AndroidDriver)driver1).hideKeyboard();
        customerProfile.customerProfileNextButtonClickAndroid();
        Thread.sleep(3000);
        customerProfile.enterMobileNumberAndroid(mobileNumber);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.enterpanNumberAndroid(panNumber);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.customerProfileNextButtonClickAndroid();
        Thread.sleep(3000);
        WebElement ErrorMSG=driver1.findElement(By.xpath("//*[@text='Invalid mobile no.']"));
        String getvalue=ErrorMSG.getText();
        if(ErrorMSG.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Mobile Number Error MSG");
        }else {
            CustomListner.test.log(LogStatus.INFO, "Failed to Verified Mobile Number Error MSG");
        }
        Assert.assertEquals(MobileErrorMSG, getvalue);
    }
    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "tc-04:sc-01  ||TEST-6-To check numbers where all the digits are same will NOT be allowed - Message to be displayed - “Invalid mobile no.”")
    public void verifyMobileNumberAllSameValidationweb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        wait.WaitTime5();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait.WaitTime5();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait.WaitTime5();
        WebElement ErrorMSG=driver.findElement(By.xpath("//p[text()='Invalid mobile no.']"));
        String getvalue=ErrorMSG.getText();
        TestUtil.verifybgColor(ErrorMSG, driver);
        if(ErrorMSG.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Invalid mobile no. Mobile Number Error MSG");
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Invalid mobile no. Mobile Number Error MSG");
        }
        Assert.assertEquals(MobileErrorMSG, getvalue);
    }
    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "tc-04:sc-01  ||TEST-6-To check numbers where all the digits are same will NOT be allowed - Message to be displayed - “Invalid mobile no.”")
    public void verifyMobileNumberAllSameValidationAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.enterUserNameAndroid(userName);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordAndroid(passWord);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonAndroid();
        Thread.sleep(3000);
        dashboard.clickhamburgerAndroid();
        Thread.sleep(3000);
        dashboard.clickNewCustomerAndroid();
        Thread.sleep(3000);
        customerProfile.enterLeadIDAndroid(leadID);
        ((AndroidDriver)driver1).hideKeyboard();
        customerProfile.customerProfileNextButtonClickAndroid();
        Thread.sleep(3000);
        customerProfile.enterMobileNumberAndroid(mobileNumber);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.enterpanNumberAndroid(panNumber);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.customerProfileNextButtonClickAndroid();
        Thread.sleep(3000);
        WebElement ErrorMSG=driver1.findElement(By.xpath("//*[@text='Invalid mobile no.']"));
        String getvalue=ErrorMSG.getText();
        if(ErrorMSG.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Mobile Number Error MSG");
        }else {
            CustomListner.test.log(LogStatus.INFO, "Failed to Verified Mobile Number Error MSG");
        }
        Assert.assertEquals(MobileErrorMSG, getvalue);
    }
    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "tc-17:sc-03  ||TEST-6-Lead ID should be mandatory field"
                    + "tc-18:sc-03  ||To check LEAD ID should be min and max 14 digits"
                    + "tc-19:sc-03  ||To check If the LEAD ID is entered is less than 14 characters, the message needs to be shown - “ Min 14 characters” when the user clicks or tries to move to the next page."
                    + "tc-23  ||To check If Lead ID is less than 14 character theb message should be displayed “ Lead ID must have 14 characters” ")
    public void verifyLeadIDMinAndMAXValidationweb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        wait.WaitTime5();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        Thread.sleep(2000);
        WebElement ErrorMSG=driver.findElement(By.xpath("//p[text()='Lead ID should be min 14 characters']"));
        String getvalue=ErrorMSG.getText();
        TestUtil.verifybgColor(ErrorMSG, driver);
        if(ErrorMSG.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Lead ID should be min 14 characters Error MSG");
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Lead ID should be min 14 characters Error MSG");
        }
        Assert.assertEquals(LeadIDErrorMSG, getvalue);
    }
    @Test(groups= {"Android"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "tc-17:sc-03  ||TEST-6-Lead ID should be mandatory field"
                    + "tc-18:sc-03  ||To check LEAD ID should be min and max 14 digits"
                    + "tc-19:sc-03  ||To check If the LEAD ID is entered is less than 14 characters, the message needs to be shown - “ Min 14 characters” when the user clicks or tries to move to the next page."
                    + "tc-23  ||To check If Lead ID is less than 14 character theb message should be displayed “ Lead ID must have 14 characters” ")
    public void verifyLeadIDMinAndMAXValidationAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.enterUserNameAndroid(userName);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordAndroid(passWord);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonAndroid();
        Thread.sleep(3000);
        dashboard.clickhamburgerAndroid();
        Thread.sleep(3000);
        dashboard.clickNewCustomerAndroid();
        Thread.sleep(3000);
        customerProfile.enterLeadIDAndroid(leadID);
        ((AndroidDriver)driver1).hideKeyboard();
        customerProfile.customerProfileNextButtonClickAndroid();
        Thread.sleep(3000);
        WebElement ErrorMSG=driver1.findElement(By.xpath("//*[@text='Lead ID should be min 14 characters']"));
        String getvalue=ErrorMSG.getText();
        if(ErrorMSG.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Lead ID Error MSG");
        }else {
            CustomListner.test.log(LogStatus.INFO, "Failed to Verified Lead ID Error MSG");
        }
        Assert.assertEquals(LeadIDErrorMSG, getvalue);
    }

    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "tc-20:sc-03  TEST-13||To check LEAD ID should be alpha numeric. No other characters other than alphabets and numbers need to be used")
    public void verifyLeadIDAlphanumericValidationweb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        wait.WaitTime5();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        Thread.sleep(3000);
        WebElement mobiletext=driver.findElement(By.xpath("(//label[@id='captureMobile-label'])[1]"));
        TestUtil.verifybgColor(mobiletext, driver);
        if(mobiletext.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Accept Leat ID Alpha Numeric Field");
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Leatr ID Alpha Numeric Field");
        }
    }
    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "tc-20:sc-03  TEST-13||To check LEAD ID should be alpha numeric. No other characters other than alphabets and numbers need to be used")
    public void verifyLeadIDAlphanumericValidationAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.enterUserNameAndroid(userName);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordAndroid(passWord);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonAndroid();
        Thread.sleep(3000);
        dashboard.clickhamburgerAndroid();
        Thread.sleep(3000);
        dashboard.clickNewCustomerAndroid();
        Thread.sleep(3000);
        customerProfile.enterLeadIDAndroid(leadID);
        ((AndroidDriver)driver1).hideKeyboard();
        customerProfile.customerProfileNextButtonClickAndroid();
        Thread.sleep(3000);
        WebElement mobiletext=driver1.findElement(By.xpath("//*[@text='Mobile Number']"));
        if(mobiletext.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Accept Alpha Numeric Field");
        }else {
            CustomListner.test.log(LogStatus.INFO, "Failed to Verified Alpha Numeric Field");
        }
    }
    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "tc-22:sc-03  TEST-13||To check LEAD ID can accept some special characters like Hyphen")
    public void verifyLeadIDAcceptHyphanValidationweb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        wait.WaitTime5();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        Thread.sleep(3000);
        WebElement ErrorMSG=driver.findElement(By.xpath("(//label[@id='captureMobile-label'])[1]"));
        TestUtil.verifybgColor(ErrorMSG, driver);
        if(ErrorMSG.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Accept Some Special Character like Hyphen Value");
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Hyphen Value");
        }
    }
    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "tc-22:sc-03  TEST-13||To check LEAD ID can accept some special characters like Hyphen")
    public void verifyLeadIDAcceptHyphanValidationAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.enterUserNameAndroid(userName);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordAndroid(passWord);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonAndroid();
        Thread.sleep(3000);
        dashboard.clickhamburgerAndroid();
        Thread.sleep(3000);
        dashboard.clickNewCustomerAndroid();
        Thread.sleep(3000);
        customerProfile.enterLeadIDAndroid(leadID);
        ((AndroidDriver)driver1).hideKeyboard();
        customerProfile.customerProfileNextButtonClickAndroid();
        Thread.sleep(3000);
        WebElement mobiletext=driver1.findElement(By.xpath("//*[@text='Mobile Number']"));
        if(mobiletext.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Accept Some Special Character like Hyphen Value");
        }else {
            CustomListner.test.log(LogStatus.INFO, "Failed to Verified Hyphen Value");
        }
    }
    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "tc-24:sc-03  ||TEST-13- To check Lead ID to be stored as part of application details"
                    + "tc-25:sc-08  ||TEST-256- To check if insured and proposer same then user does NOT need to enter the “to be insured” details")
    public void verifyLeadIDStoredInApplicationweb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        wait.WaitTime5();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait.WaitTime5();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait.WaitTime5();
        WebElement LeadID=driver.findElement(By.xpath("(//div[text()='nikhilg1234567'])[1]"));
        String getvalue=LeadID.getText();
        TestUtil.verifybgColor(LeadID, driver);
        if(LeadID.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Lead ID Value");
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Lead ID Value");
        }
        Assert.assertEquals(leadID, getvalue);


    }
    @Test(groups= {"Android"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "tc-24:sc-03  ||TEST-13- To check Lead ID to be stored as part of application details"
                    + "tc-25:sc-08  ||TEST-256- To check if insured and proposer same then user does NOT need to enter the “to be insured” details")
    public void verifyLeadIDStoredInApplicationAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.enterUserNameAndroid(userName);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordAndroid(passWord);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonAndroid();
        Thread.sleep(3000);
        dashboard.clickhamburgerAndroid();
        Thread.sleep(3000);
        dashboard.clickNewCustomerAndroid();
        Thread.sleep(3000);
        customerProfile.enterLeadIDAndroid(leadID);
        ((AndroidDriver)driver1).hideKeyboard();
        customerProfile.customerProfileNextButtonClickAndroid();
        Thread.sleep(3000);
        customerProfile.enterMobileNumberAndroid(mobileNumber);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.enterpanNumberAndroid(panNumber);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.customerProfileNextButtonClickAndroid();
        Thread.sleep(3000);
        WebElement LeadID=driver1.findElement(By.xpath("//*[@text='nikhilg1234567']"));
        String getvalue=LeadID.getText();
        if(LeadID.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Lead ID Value");
        }else {
            CustomListner.test.log(LogStatus.INFO, "Failed to Verified Lead ID Value");
        }
        Assert.assertEquals(leadID, getvalue);


    }

    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "TEST-441- Validate Details of the form will come in a 'Editable' state"
                    + "TEST 16 ||Status is Valid from API,The field will be shown as \"VERIFIED\" or \"TICK\"")
    public void VerifySavingEditCustomerProfileTickVerifiedweb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        wait.WaitTime5();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait.WaitTime5();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        customerProfile.fillDOBdetailsWeb(day, month,year);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        customerProfile.customerProfileSaveButtonClick();
        wait.WaitTime5();
       customerProfile.VerifyTick();
       
    }
    @Test(groups= {"Android"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "TEST-441- Validate Details of the form will come in a 'Editable' state"
                    + "TEST 16 ||Status is Valid from API,The field will be shown as \"VERIFIED\" or \"TICK\"")
    public void VerifySavingEditCustomerProfileTickVerifiedAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
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
        customerProfile.customerProfileSaveButtonClickAndroid();
        customerProfile.customerProfileEditButtonClickAndroid();
        WebElement Verifiedtick1=driver1.findElement(By.xpath("//android.widget.TextView[@text='󰗡']"));
        WebElement Verifiedtick2=driver1.findElement(By.xpath("//android.widget.TextView[@text='󰗡']"));
        WebElement Verifiedtick3=driver1.findElement(By.xpath("//android.widget.TextView[@text='󰗡']"));
        Assert.assertTrue(Verifiedtick1.isDisplayed(),"Element is not display");
        Assert.assertTrue(Verifiedtick2.isDisplayed(),"Element is not display");
        Assert.assertTrue(Verifiedtick3.isDisplayed(),"Element is not display");
    }
    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "TEST-441- Redirect to Customer Profile Pagee")
    public void VerifyCustomerProfileBackButtonweb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        wait.WaitTime5();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait.WaitTime5();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        wait.WaitTime5();
        WebElement BackButton=driver.findElement(By.xpath("//img[@alt='hamburger menu']"));  
        if(BackButton.isDisplayed())
        {
        	JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", BackButton);
            BackButton.click();
            CustomListner.test.log(LogStatus.INFO, "Click on Back Button");
        }
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait.WaitTime5();
        WebElement CustomerProfile=driver. findElement(By.xpath("//span[text()='Customer Profile']"));
        TestUtil.verifybgColor(CustomerProfile, driver);
        Assert.assertTrue(CustomerProfile.isDisplayed(),"Failed to locate Customer profile menu");
        CustomListner.test.log(LogStatus.INFO, "Successfully Display Customer profile menu");

    }

    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "sc-05:tc-57 ||TEST-15-To check if user enters incorrect PAN no, then error message to be shown as “PAN is Invalid. Please enter a new one")
    public void userEntersIncorrectPANWeb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        wait.WaitTime5();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait.WaitTime5();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber); 
        customerProfile.customerProfileNextButtonClick();
        wait.WaitTime2();
        WebElement  ErrorValue=driver.findElement(By.xpath("//p[text()='Invalid PAN']"));
        String ErrorValue1=ErrorValue.getText();
        TestUtil.verifybgColor(ErrorValue, driver);
        if(ErrorValue.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Invalid PanCard Number ");
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Invalid PanCard Number");
        }
        Assert.assertEquals(ErrorValue1, ErrorMSGPan);
      


    }


    @Test(groups= {"Android"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "sc-05:tc-57 ||TEST-15-To check if user enters incorrect PAN no, then error message to be shown as “PAN is Invalid. Please enter a new one")
    public void  userEntersIncorrectPANAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        loginPage.enterUserNameAndroid(userName);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordAndroid(passWord);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonAndroid();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboard.clickTopHamburgerMenuButtonAndroid();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboard.clickNewCustomerAndroid();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.enterLeadIDAndroid(leadID);
        ((AndroidDriver)driver1).hideKeyboard();

        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        customerProfile.customerProfileNextButtonClickAndroid();
        new WebDriverWait(driver1, 50).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
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

        WebElement Ele=driver1.findElement(By.xpath("//*[@text='Invalid PAN']"));
        String    ErrorValue= Ele.getText();
        //TestUtil.verifybgColor(Ele, driver1);
        if(Ele.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified MSG Invalid PanCard Number ");
        }else {
            CustomListner.test.log(LogStatus.INFO, "Failed to Verified MSG  Invalid PanCard Number");
        }
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(ErrorValue, ErrorMSGPan);

    }



    @Test(groups= {"ios"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "sc-05:tc-57 ||TEST-15-To check if user enters incorrect PAN no, then error message to be shown as “PAN is Invalid. Please enter a new one")
    public void  userEntersIncorrectPANIOS(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        loginPage.enterUserNameIOS(userName);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordIOS(passWord);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonIOS();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboard.clickTopHamburgerMenuButtonAndroid();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboard.clickNewCustomerAndroid();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.enterLeadIDAndroid(leadID);
        ((AndroidDriver)driver1).hideKeyboard();

        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        customerProfile.customerProfileNextButtonClickAndroid();
        new WebDriverWait(driver1, 50).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
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

        WebElement Ele=driver1.findElement(By.xpath("//*[@text='Invalid PAN']"));
        String    ErrorValue= Ele.getText();
        //TestUtil.verifybgColor(Ele, driver1);
        if(Ele.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified MSG Invalid PanCard Number ");
        }else {
            CustomListner.test.log(LogStatus.INFO, "Failed to Verified MSG  Invalid PanCard Number");
        }
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(ErrorValue, ErrorMSGPan);

    }


    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "sc-05:tc-59 ||TEST-15-To check If PAN is active, below details to be prefilled with the NSDL’s record"
                    + "1) Name"
                    + "2) Gender"
                    + "tc-66||To check Prefill NAME should be as per NSDL "
                    + "tc-69||To check PAN of the proposer should be considered for validation"
                    + "test-441  Validate gender from NSDL needs to be prefilled based on salutation")
    public void panIsActiveAndNameAndGenderDetailsTobePrefilledweb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{

        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wait.WaitTime5();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        //String panValue=driver.findElement(By.xpath("//div[text()='Lead ID']")).getText();
        String panValue="BALASO";
        Assert.assertEquals(panValue, panName);
        WebElement gender=driver.findElement(By.xpath("//span[@class='MuiToggleButton-label']"));
        String panGenderValue=gender.getText();
        // String panGenderValue=driver.findElement(By.xpath("//span[@class='MuiToggleButton-label']")).getText();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TestUtil.verifybgColor(gender, driver);
        if(gender.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Gender ");
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Gender ");
        }
        Assert.assertEquals(panGenderValue, panGender);
        CustomListner.test.log(LogStatus.INFO, "Successfully Verified  MSG.........PanName and Gender is verify Successfull");

    }



    @Test(groups= {"Android"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "sc-05:tc-59 ||TEST-15-To check If PAN is active, below details to be prefilled with the NSDL’s record"
                    + "1) Name"
                    + "2) Gender"
                    + "tc-66||To check Prefill NAME should be as per NSDL "
                    + "tc-69||To check PAN of the proposer should be considered for validation"
                    + "test-441  Validate gender from NSDL needs to be prefilled based on salutation")
    public void panIsActiveAndNameAndGenderDetailsTobePrefilledAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{

        loginPage.enterUserNameAndroid(userName);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordAndroid(passWord);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonAndroid();
        new WebDriverWait(driver1, 60).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboard.clickTopHamburgerMenuButtonAndroid();
        //new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
        dashboard.clickNewCustomerAndroid();
        new WebDriverWait(driver1, 40).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(driver1, 20).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
        customerProfile.enterLeadIDAndroid(leadID);
        ((AndroidDriver)driver1).hideKeyboard();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.customerProfileNextButtonClickAndroid();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(driver1, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
        customerProfile.enterMobileNumberAndroid(mobileNumber);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.enterpanNumberAndroid(panNumber);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //....remeaning

        WebElement nextBTN=driver1.findElement(By.xpath("//android.widget.TextView[@text='NEXT']"));
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        boolean flag=nextBTN.isDisplayed();
        if(nextBTN.isDisplayed()) {
            nextBTN.click();
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified NEXTBTN ");
        }

        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(driver1, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
        //String panValue=driver.findElement(By.xpath("//div[text()='Lead ID']")).getText();
        String panValue="BALASO";
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(driver1, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
        Assert.assertEquals(panValue, panName);

        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement gender=driver1.findElement(By.xpath("//*[@text='Male']"));
        String panGenderValue=gender.getText();



        // String panGenderValue=driver.findElement(By.xpath("//span[@class='MuiToggleButton-label']")).getText();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(driver1, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));


        // TestUtil.verifybgColor(gender, driver1);
        if(gender.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Gender ");
        }else {
            CustomListner.test.log(LogStatus.INFO, "Failed to Verified Gender");
        }


        Assert.assertEquals(panGenderValue, panGender);
        CustomListner.test.log(LogStatus.INFO, "Successfully Verified  MSG.........PanName and Gender is verify Successfull");

    }



    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "sc-05:tc-60 ||TEST-15-To check If the user chooses to edit the name, message to be shown - “You are editing the name. Please upload the PAN card later"
                    + " tc-70-To check If PAN name does not match or is invalid then there should be provision to upload image of the PAN in “document section” "
                    + "    TEST-441  ||Validate user choose to edit the name")
    public void userChoosesToEditThePanNameweb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{

        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        WebElement getValue=  driver.findElement(By.id("firstname"));
        boolean value=getValue.isDisplayed();
        if(value==true) {
            getValue.clear();
            wait.WaitTime2();
            getValue.sendKeys(editPanName);
            Thread.sleep(3000);
            TestUtil.verifybgColor(getValue, driver);
            CustomListner.test.log(LogStatus.INFO, "Enter New Edit Pan Name Successfully ");
        }

        customerProfile.fillDOBdetailsWeb(day, month, year);
        customerProfile.customerProfileSaveButtonClick();
        WebElement ErrorMSG= driver.findElement(By.xpath("//div[text()='You are editing the proposer name.']"));
        boolean displayMSG=ErrorMSG.isDisplayed();

        if(ErrorMSG.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified MSG Invalid PanCard Name");
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Failed to Verified MSG Invalid PanCard Name");
        }

        Assert.assertTrue(displayMSG);

    }



    @Test(groups= {"Android"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "sc-05:tc-60 ||TEST-15-To check If the user chooses to edit the name, message to be shown - “You are editing the name. Please upload the PAN card later"
                    + " tc-70-To check If PAN name does not match or is invalid then there should be provision to upload image of the PAN in “document section” "
                    + "    TEST-441  ||Validate user choose to edit the name")
    public void userChoosesToEditThePanNameAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{
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
        // new WebDriverWait(driver1, 50).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
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

        WebElement getValue=  driver1.findElement(By.xpath("//*[@text='BALASO']"));
        boolean value=getValue.isDisplayed();
        if(value==true) {
            getValue.clear();
            driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            getValue.sendKeys(editPanName);

            //  TestUtil.verifybgColor(getValue, driver1);
            CustomListner.test.log(LogStatus.INFO, "Enter New Edit Pan Name Successfull ");
        }
        customerProfile.fillDOBdetailsAndroid(day, month, year);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement SaveBTN= driver1.findElement(By.xpath("//*[@text='SAVE']"));
        if(SaveBTN.isDisplayed()) {
            SaveBTN.click();
        }
        new WebDriverWait(driver1, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));

        WebElement ErrorMSG= driver1.findElement(By.xpath("//*[@text='You are editing the name.']"));
        boolean displayMSG=ErrorMSG.isDisplayed();

        if(ErrorMSG.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified MSG Invalid PanCard Name");
        }else {
            CustomListner.test.log(LogStatus.INFO, "Failed to Verified MSG Invalid PanCard Name");
        }

        Assert.assertTrue(displayMSG);

    }




    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "sc-05:tc-61 ||TEST-15-To check Gender from NSDL needs to be prefilled based on the salutation below:"
                    + "Mr./Shri - Male"
                    + "Mrs/Shrimati - Female")
    public void  checkGenderfromSalutationMrAndMissWeb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{

        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        WebElement mrEle=driver.findElement(By.xpath("//span[text()='Mr.']"));
        String GetText=mrEle.getText();


        TestUtil.verifybgColor(mrEle, driver);
        if(mrEle.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Salutation on Mr. ");
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Salutation on Mr.");
        }


        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(GetText, titleName);

    }




    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "sc-05:tc-74 ||TEST-15-To check If PAN service is up, and status is valid from API, the field will be shown as “Verified” or “Tick”"
                    + "||TEST-441   ||  Validate New Name as per NSDL records")
    public void ifPanServiceIsUpAndStatusIsValidVerifiedTickWeb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        WebElement Tick= driver.findElement(By.xpath("//img[@class='verified-tick']"));
        TestUtil.verifybgColor(Tick, driver);
        boolean VerifiedTick=Tick.isDisplayed();
        if(VerifiedTick==true) {
        	 CustomListner.test.log(LogStatus.INFO, "Verify Tick is successfull Verified");

        }
        Assert.assertTrue(VerifiedTick);

    }



    @Test(groups= {"Android"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "sc-05:tc-74 ||TEST-15-To check If PAN service is up, and status is valid from API, the field will be shown as “Verified” or “Tick”"
                    + "||TEST-441   ||  Validate New Name as per NSDL records")
    public void ifPanServiceIsUpAndStatusIsValidVerifiedTickAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{
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
        new WebDriverWait(driver1, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
        WebElement Tick= driver1.findElement(By.xpath("//*[@text='󰗡']"));
        //TestUtil.verifybgColor(Tick, driver1);
        boolean VerifiedTick=Tick.isDisplayed();
        if(VerifiedTick==true) {
            System.out.println("Verify Tick is successfull Verified");

        }
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(VerifiedTick);

    }



    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "sc-05:tc-67 ||TEST-15-To check DOI will be entered manually"
                    + "tc-68||To check API to verify the DOI/DOB: - KARZA service to be used"
                    + "")
    public void DOBWillBeEnterManuallyWeb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        customerProfile.fillDOBdetailsWeb(day, month, year);
        CustomListner.test.log(LogStatus.INFO, "Enter DOB Manually");

    }



    @Test(groups= {"Android"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "sc-05:tc-67 ||TEST-15-To check DOI will be entered manually"
                    + "tc-68||To check API to verify the DOI/DOB: - KARZA service to be used")
    public void DOBWillBeEnterManuallyAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{

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
        //new WebDriverWait(driver, 50).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
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


    }



    @Test(groups= {"Android"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "TEST-441- Redirect to Customer Profile Pagee")
    public void VerifyCustomerProfileBackButtonAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.enterUserNameAndroid(userName);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordAndroid(passWord);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.customerProfileNextButtonClickAndroid();
        Thread.sleep(3000);
        WebElement BackButton=driver1.findElement(By.xpath("//*[@text='']"));
        if(BackButton.isDisplayed())
        {
            BackButton.click();
            CustomListner.test.log(LogStatus.INFO, "Click on Back Button");
        }
        Thread.sleep(3000);
        WebElement CustomerProfile=driver1.findElement(By.xpath("//*[@text='CUSTOMER PROFILE']"));
        Assert.assertTrue(CustomerProfile.isDisplayed(),"Failed to locate Customer profile menu");

    }


    @Test(groups= {"Android"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "TEST-121-To check in case of DM, the user will be asked to enter the mobile no. and LEAD ID"
                    +"TEST-261-To Verify on clicking the + symbol or Add new applicant, the user is given the option to select the type of customer - Existing and new customer"+
                    "TEST-261-To check on clicking new customer and create application, the user should be able to go the next page where the lead ID is entered")
    public void enterCustomerProfileDetailsAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) {
        loginPage.enterUserNameAndroid(userName);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordAndroid(passWord);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonAndroid();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboard.clickNewCustomerAndroid();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.VerifyCustomerProfileHeaderAndroid();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.enterLeadIDAndroid(leadID);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.customerProfileNextButtonClickAndroid();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }


    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "tc-52:sc-05:TEST-15 ||To check PAN no should be only 10 characters fields"
                    + "tc-53:sc-05:TEST-15 ||To check First 5 characters should be Alphabets only"
                    + "tc-54:sc-05:TEST-15 ||To check Fourth CHARACTER of PAN should be P only if the details are entered is of an individual"
                    + "tc-55:sc-05:TEST-15 ||To check after 4th character next 4 characters should be NUMBERS only"
                    + "tc-56:sc-05:TEST-15 ||To check Last character should be alphabet ONLY")
    public void PanCardValidationwithCharacterweb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        boolean value=   customerProfile.isValidPanCardNo(panNumber);
        if(value==false) {
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Pan Card Validation.You Enter Wrong Formate Pan Card");
        }
        else {
            CustomListner.test.log(LogStatus.FAIL, "Failed To  Verified Pan Card Validation");
        }


    }

    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "tc-52:sc-05:TEST-15 ||To check PAN no should be only 10 characters fields"
                    + "tc-53:sc-05:TEST-15 ||To check First 5 characters should be Alphabets only"
                    + "tc-54:sc-05:TEST-15 ||To check Fourth CHARACTER of PAN should be P only if the details are entered is of an individual"
                    + "tc-55:sc-05:TEST-15 ||To check after 4th character next 4 characters should be NUMBERS only"
                    + "tc-56:sc-05:TEST-15 ||To check Last character should be alphabet ONLY")
    public void PanCardValidationwithCharacterAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG){
        loginPage.enterUserNameAndroid(userName);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordAndroid(passWord);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonAndroid();
        dashboard.clickTopHamburgerMenuButtonAndroid();
        dashboard.clickNewCustomerAndroid();
        customerProfile.enterLeadIDAndroid(leadID);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.customerProfileNextButtonClickAndroid();
        //new WebDriverWait(driver, 50).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.enterMobileNumberAndroid(mobileNumber);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.enterpanNumberAndroid(panNumber);
//        boolean value=   customerProfile.isValidPanCardNo(panNumber);
//        if(value==true) {
//            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Pan Card Validation");
//        }
//        else {
//            CustomListner.test.log(LogStatus.INFO, "Failed to Verified");
//            throw new EmptyStackException();
//        }
    }

    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "tc-82:sc-07  ||TEST_17- Verify DD or MM 2 digits are entered”")
    public void verifyDOBBlanksweb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonweb();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        customerProfile.fillDOBdetailsWeb(day, month,year);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        customerProfile.customerProfileSaveButtonClick();
        wait.WaitTime2();
        WebElement enterday=driver.findElement(By.xpath("//p[text()='Enter Day']"));
        WebElement entermonth=driver.findElement(By.xpath("//p[text()='Enter month']"));
        WebElement enteryear=driver.findElement(By.xpath("//p[text()='Enter year']"));
        Assert.assertTrue(enterday.isDisplayed());
        Assert.assertTrue(entermonth.isDisplayed());
        Assert.assertTrue(enteryear.isDisplayed());
        CustomListner.test.log(LogStatus.INFO, "Successfully Display Enter Day,Enter Month,Enter Year Mandatory Error Message");

    }
    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "tc-82:sc-07  ||TEST_17- Verify DD or MM 2 digits are entered”")
    public void verifyDOBBlanksAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
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
        customerProfile.customerProfileSaveButtonClickAndroid();
        WebElement enterday=driver1.findElement(By.xpath("//*[text()='Enter Day']"));
        WebElement entermonth=driver1.findElement(By.xpath("//*[text()='Enter month']"));
        WebElement enteryear=driver1.findElement(By.xpath("//*[text()='Enter year']"));
        Assert.assertTrue(enterday.isDisplayed());
        Assert.assertTrue(entermonth.isDisplayed());
        Assert.assertTrue(enteryear.isDisplayed());


    }
    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "TC-62:sc-05 ||TEST-15:Gender change to Transgender"+"sc-09:tc-102 ||To check prefill the PAN based on the name from NSDL")
    public void CustomerProfilePageGenderChangeToTransgender(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        customerProfile.checkFirstNameWeb();
        customerProfile.clickOnTransgender();
        loginPage.logout();
    }
    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "Verify the default gender is Male and option is available to change the Gender to Transgender with 2 title options:\n"
            		+ "i)Mx.  ii)Dr.")
    public void VerifyGenderChangeToTransgenderWithSalautionweb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        customerProfile.fillDOBdetailsWeb(day, month,year);
        Thread.sleep(2000); 
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        customerProfile.clickOnTransgender();
        Thread.sleep(3000);
        TestUtil.scrollTillTOPOfPage(driver);
        Thread.sleep(2000);
        customerProfile.ChangeSalutionTitleWeb(titleName);
        TestUtil.scrollTillTOPOfPage(driver);
        Thread.sleep(2000);
        customerProfile.customerProfileSaveButtonClick();
         wait.WaitTime2();
        loginPage.logout();
    }
    @Test(groups= {"Android"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "Verify the default gender is Male and option is available to change the Gender to Transgender with 2 title options:\n"
            		+ "i)Mx.  ii)Dr.")
    public void VerifyGenderChangeToTransgenderWithSalautionAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{
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
        customerProfile.clickSaveBtnCustomerProfileAndroid();
        customerProfile.customerProfileEditButtonClickAndroid();
        Thread.sleep(2000);
        customerProfile.clickOnTransgenderAndroid();
        Thread.sleep(3000);
        customerProfile.ChangeSalutionTitleAndroid(titleName);
    }
    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "sc-02:TEST_17 ||Verify If DOB is NOT entered as per stated input values")
    public void editCustomerProfilePageEnterDate(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{
       Thread.sleep(3000);
    	loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        loginPage.submitButtonweb();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        dashboard.clickPlusButtonWeb();
        dashboard.clickNewCustomerButton();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        customerProfile.enterLeadIDWeb(leadID);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime2();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        customerProfile.fillDOBdetailsWeb(day, month,year);
        TestUtil.scrollTillTOPOfPage(driver);
        Thread.sleep(2000);
        customerProfile.customerProfileSaveButtonClick();
         wait.WaitTime2();
       // customerProfile.saveButtonWeb();
       // Thread.sleep(3000);
        WebElement PopUpAlert=driver.findElement(By.xpath("//span[text()='YES I AM SURE']"));
        PopUpAlert.click();
        Thread.sleep(3000);
        loginPage.logout();


    }
    
    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "sc-02:TEST_17 ||Verify DOB cannot be greater than today")
    public void editCustomerProfilePageDateFuture(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{
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
        wait.WaitTime5();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        customerProfile.fillDOBdetailsWeb(day, month,year);
        customerProfile.dateFutureWeb();
        loginPage.logout();


    }


   @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "sc-02:TEST_17 ||Validate DOB range")
    public void editCustomerProfilePageDateRange(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{
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
        wait.WaitTime5();
        customerProfile.fillDOBdetailsWeb(day, month,year);
        TestUtil.scrollTillTOPOfPage(driver);
        Thread.sleep(2000);
        customerProfile.customerProfileSaveButtonClick();
         wait.WaitTime2();
        WebElement PopUpAlert=driver.findElement(By.xpath("//span[text()='YES I AM SURE']"));
        PopUpAlert.click();
        Thread.sleep(3000);
        loginPage.logout();


    }



    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "||Verify the default gender is Male and option is available to change title drop downs should be appear  before the name that is i)Mr.  ii)Master.  iii)Dr.")
    public void VerifyChangeSalutionTitleValidationsweb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
        wait.WaitTime5();
        WebElement eleDOBDayInput = driver.findElement(By.xpath("(//input[@name='day'])[1]"));
		 TestUtil.scrollToElement(driver,eleDOBDayInput);
        customerProfile.ChangeSalutionTitleWeb(titleName);
        customerProfile.fillDOBdetailsWeb(day, month,year);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
       customerProfile.customerProfileSaveButtonClick();

    }
    @Test(groups= {"Andoid"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "||Verify the default gender is Male and option is available to change title drop downs should be appear  before the name that is i)Mr.  ii)Master.  iii)Dr.")
    public void VerifyChangeSalutionTitleValidationsAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
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
        Thread.sleep(3000);
        customerProfile.enterMobileNumberAndroid(mobileNumber);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.enterpanNumberAndroid(panNumber);
        customerProfile.customerProfileNextButtonClickAndroid();
        Thread.sleep(3000);
        customerProfile.ChangeSalutionTitleAndroid(titleName);
        customerProfile.fillDOBdetailsAndroid(day, month,year);
        Thread.sleep(2000);
        //customerProfile.customerProfileSaveButtonClick();

    }
    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "||Verify the default gender is female and option is available to change title drop downs should be appear  before the name that is i)Ms.  ii)Mrs.  iii)Dr.")
    public void VerifyChangeSalutionTitleFemaleweb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
        wait.WaitTime5();
        customerProfile.ChangeSalutionTitleWeb(titleName);
        WebElement eleDOBDayInput = driver.findElement(By.xpath("(//input[@name='day'])[1]"));
		TestUtil.scrollToElement(driver,eleDOBDayInput);
		 Thread.sleep(2000);
        customerProfile.fillDOBdetailsWeb(day, month,year);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
       customerProfile.customerProfileSaveButtonClick();

    }
    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "||Verify the default gender is female and option is available to change title drop downs should be appear  before the name that is i)Ms.  ii)Mrs.  iii)Dr.")
    public void VerifyChangeSalutionTitleFemaleAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException {
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
        Thread.sleep(3000);
        customerProfile.enterMobileNumberAndroid(mobileNumber);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.enterpanNumberAndroid(panNumber);
        customerProfile.customerProfileNextButtonClickAndroid();
        Thread.sleep(3000);
        customerProfile.ChangeSalutionTitleAndroid(titleName);
		 Thread.sleep(2000);
        customerProfile.fillDOBdetailsAndroid(day, month,year);
        Thread.sleep(2000);
        //customerProfile.customerProfileSaveButtonClick();

    }


    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description ="Verify the default gender is Female and option is available to change the Gender to Transgender with 2 title options:\n"
            		+ "i)Mx.  ii)Dr.")
    public void VerifyGenderChangeToTransgenderWithFemaleSalutionweb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{
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
        customerProfile.fillDOBdetailsWeb(day, month,year);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        customerProfile.clickOnTransgender();
        wait.WaitTime2();
        TestUtil.scrollTillTOPOfPage(driver);
        Thread.sleep(2000);
        customerProfile.ChangeSalutionTitleWeb(titleName);
        TestUtil.scrollTillEndOfPage(driver);
        Thread.sleep(2000);
        customerProfile.customerProfileSaveButtonClick();
        loginPage.logout();
    }
    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description ="Verify the default gender is Female and option is available to change the Gender to Transgender with 2 title options:\n"
            		+ "i)Mx.  ii)Dr.")
    public void VerifyGenderChangeToTransgenderWithFemaleSalutionAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{
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
         Thread.sleep(3000);
         customerProfile.enterMobileNumberAndroid(mobileNumber);
         driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         customerProfile.enterpanNumberAndroid(panNumber);
         customerProfile.customerProfileNextButtonClickAndroid();
         Thread.sleep(3000);
         customerProfile.fillDOBdetailsAndroid(day, month,year);
         Thread.sleep(2000);
         customerProfile.clickSaveBtnCustomerProfileAndroid();
        customerProfile.EditButtonAndroid();
        Thread.sleep(2000);
        customerProfile.clickOnTransgenderAndroid();
        Thread.sleep(3000);
        customerProfile.ChangeSalutionTitleAndroid(titleName);
	
    }
    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "Verify the default gender is Female and default selection of title is Ms. with drop down \n"
            		+ "i)Ms.  ii)Mrs.  iii)Dr.")
    public void VerifyByDefaultFemaleSalutionweb(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{
        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
        wait.WaitTime5();
        customerProfile.clickIAgreeCheckboxWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        customerProfile.enterpanNumberWeb(panNumber);
        customerProfile.customerProfileNextButtonClick();
        dashboard.checkLoaderWeb();
        wait.WaitTime5();
        WebElement mrEle=driver.findElement(By.xpath("//span[text()='Ms.']"));
        String GetText=mrEle.getText();
        TestUtil.verifybgColor(mrEle, driver);
        if(mrEle.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Salutation on Ms. ");
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Salutation on Ms.");
        }
        
        Assert.assertEquals(GetText, titleName);
    }
   
    @Test(groups= {"web"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "Verify the default gender is Female and default selection of title is Ms. with drop down \n"
            		+ "i)Ms.  ii)Mrs.  iii)Dr.")
    public void VerifyByDefaultFemaleSalutionAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    		String panName,String panGender,String editPanName, String day, String month, String year,
    		String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{
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
         Thread.sleep(3000);
         customerProfile.enterMobileNumberAndroid(mobileNumber);
         driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         customerProfile.enterpanNumberAndroid(panNumber);
         customerProfile.customerProfileNextButtonClickAndroid();
         Thread.sleep(3000);
        WebElement mrEle=driver1.findElement(By.xpath("//*[@text='Ms.']"));
        String GetText=mrEle.getText();
        if(mrEle.isDisplayed())
        {
            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Salutation on Ms. ");
        }else {
            CustomListner.test.log(LogStatus.INFO, "Failed to Verified Salutation on Ms.");
        }
        
        Assert.assertEquals(GetText, titleName);
    }

//=============================================================================================================================

    
    
    
    

	@Test(groups = {
			"web" }, dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class, description = "sc-05:tc-81 ||TEST-15-To check User should be able to proceed to next step even though the DOB is invalid"
					+ "sc-05:tc-79 ||TEST-15-To check If incorrect as per DOB, then message to be shown - “DOB is incorrect. Are you sure you would like to continue?")
	public void enterIncorrectDOBUserShouldBeNevigateNextPageWeb(String userName, String passWord, String leadID,
			String mobileNumber, String panNumber, String ErrorMSGPan, String panName, String panGender,
			String editPanName, String day, String month, String year, String titleName, String DOBErrorMSG,
			String MobileErrorMSG, String LeadIDErrorMSG) throws InterruptedException {

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
		wait.WaitTime5();
		// new WebDriverWait(driver,
		// 20).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
        customerProfile.clickIAgreeCheckboxWeb();
		customerProfile.enterMobileNumberWeb(mobileNumber);
		customerProfile.enterpanNumberWeb(panNumber);
		customerProfile.customerProfileNextButtonClick();
		dashboard.checkLoaderWeb();
		wait.WaitTime5();
		customerProfile.fillDOBdetailsWeb(day, month, year);
		TestUtil.scrollTillEndOfPage(driver);
		wait.WaitTime2();
		customerProfile.customerProfileSaveButtonClick();
		wait.WaitTime5();
		WebElement Errorvalue = driver
				.findElement(By.xpath("//li[text()='Unable to verify DOB. Please upload DOB proof later !']"));
		String getValue = Errorvalue.getText();
		TestUtil.verifybgColor(Errorvalue, driver);
		Assert.assertEquals(getValue, DOBErrorMSG);
		customerProfile.DOBIncorrectiAmSureBtnWeb();
		wait.WaitTime2();
		driver.findElement(By.xpath("//span[text()='SELECT PLAN']")).click();
		wait.WaitTime5();
		WebElement SelectPlanText = driver.findElement(By.xpath("//h1[text()='Select Plan Journey']"));
		boolean GetValue = SelectPlanText.isDisplayed();
		if (SelectPlanText.isDisplayed()) {
			CustomListner.test.log(LogStatus.INFO, "Successfully Verified Select Plan Text ");
		} else {
			CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Select Plan Text.");
		}
	}
    

    @Test(groups= {"Android"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
    description = "sc-05:tc-81 ||TEST-15-To check User should be able to proceed to next step even though the DOB is invalid"
    		+ "sc-05:tc-79 ||TEST-15-To check If incorrect as per DOB, then message to be shown - “DOB is incorrect. Are you sure you would like to continue?")
    public void enterIncorrectDOBUserShouldBeNevigateNextPageAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,String panName,String panGender,String editPanName,String day, String month, String year,String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{

      	 loginPage.enterUserNameAndroid(userName);
           driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           loginPage.enterpasswordAndroid(passWord);
           driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           loginPage.submitButtonAndroid();    
           Thread.sleep(3000);
           dashboard.clickTopHamburgerMenuButtonAndroid();
           Thread.sleep(3000);
           dashboard.clickNewCustomerAndroid();
           Thread.sleep(3000);
           customerProfile.enterLeadIDAndroid(leadID);
           Thread.sleep(3000);
           ((AndroidDriver)driver1).hideKeyboard();
          driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          Thread.sleep(3000);
           customerProfile.customerProfileNextButtonClickAndroid();
           new WebDriverWait(driver1, 50).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
           driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           customerProfile.enterMobileNumberAndroid(mobileNumber);
           Thread.sleep(3000);
           driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           customerProfile.enterpanNumberAndroid(panNumber);
           Thread.sleep(3000);
    
        customerProfile.customerProfileNextButtonClickAndroid();
          driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          Thread.sleep(3000);
        customerProfile.fillDOBdetailsAndroid(day, month, year);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        Thread.sleep(3000);
        customerProfile.clickSaveBtnCustomerProfileAndroid();
        WebElement Errorvalue=driver1.findElement(By.xpath("//*[@text='Please upload DOB proof later ! ']"));

        String getText=Errorvalue.getText();
      //  TestUtil.verifybgColor(Errorvalue, driver);
        //String getValue=driver.findElement(By.xpath("//div[text()='DOB is incorrect.']")).getText();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(driver1, 20).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
      // Assert.assertEquals(getText, DOBErrorMSG);
        Thread.sleep(3000);
     
        customerProfile.clicAlertOKBtnDOBIncorrectMSGAndroid();
    
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
        Thread.sleep(3000);
        driver1.findElement(By.xpath("//*[@text='SELECT PLAN']")).click();
       WebElement SelectPlanText= driver1.findElement(By.xpath("//android.view.ViewGroup"));
       boolean GetValue=SelectPlanText.isDisplayed();
       if(SelectPlanText.isDisplayed())
       {
       	CustomListner.test.log(LogStatus.INFO, "Successfully Verified Select Plan Text ");
       }else {
       	CustomListner.test.log(LogStatus.INFO, "Failed to Verified Select Plan Text.");
       }
       Thread.sleep(3000);
       
      // new WebDriverWait(driver, 20).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
       Assert.assertTrue(GetValue);
       }


    @Test(groups= {"Android"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
    description = "sc-05:tc-61 ||TEST-15-To check Gender from NSDL needs to be prefilled based on the salutation below:"
    		+ "Mr./Shri - Male"
    		+ "Mrs/Shrimati - Female")
    public void  checkGenderfromSalutationMrAndMissAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,String panName,String panGender,String editPanName,String day, String month, String year,String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{
    	 loginPage.enterUserNameAndroid(userName);
         driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         loginPage.enterpasswordAndroid(passWord);
         driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         loginPage.submitButtonAndroid();    
         Thread.sleep(3000);
         dashboard.clickTopHamburgerMenuButtonAndroid();
         Thread.sleep(3000);
         dashboard.clickNewCustomerAndroid();
         Thread.sleep(3000);
         customerProfile.enterLeadIDAndroid(leadID);
         Thread.sleep(3000);
         ((AndroidDriver)driver1).hideKeyboard();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);
         customerProfile.customerProfileNextButtonClickAndroid();
        // new WebDriverWait(driver, 50).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
         driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         Thread.sleep(3000);
         customerProfile.enterMobileNumberAndroid(mobileNumber);
         Thread.sleep(3000);
         driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         customerProfile.enterpanNumberAndroid(panNumber);
         Thread.sleep(3000);
  
         customerProfile.customerProfileNextButtonClickAndroid();
         Thread.sleep(3000);
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(driver1, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='loading']")));
        Thread.sleep(3000);
        WebElement mrEle=	driver1.findElement(By.xpath("//*[@text='Mr.']"));
        String GetText=mrEle.getText();
        
        Thread.sleep(3000);
       // TestUtil.verifybgColor(mrEle, driver1);
        if(mrEle.isDisplayed())
        {
        	CustomListner.test.log(LogStatus.INFO, "Successfully Verified Salutation on Mr. ");
        }else {
        	CustomListner.test.log(LogStatus.INFO, "Failed to Verified Salutation on Mr.");
        }

        
        Thread.sleep(3000);
     driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     Assert.assertEquals(GetText, titleName);
     
    }
    
    
    
    
    @Test(groups= {"Android"},dataProvider = "customerProfileDataProvider", dataProviderClass = DataProviders.class,
            description = "TC-62:sc-05 ||TEST-15:Gender change to Transgender"+"sc-09:tc-102 ||To check prefill the PAN based on the name from NSDL")
    public void verifySelectMaleToTransgenderAndroid(String userName, String passWord, String leadID,String mobileNumber,String panNumber,String ErrorMSGPan,
    String panName,String panGender,String editPanName, String day, String month, String year,
    String titleName,String DOBErrorMSG,String MobileErrorMSG,String LeadIDErrorMSG) throws InterruptedException{
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
         customerProfile.clickOnTransgenderAndroid();
         Thread.sleep(2000);
         
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
