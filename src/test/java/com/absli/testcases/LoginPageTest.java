package com.absli.testcases;

import com.absli.Listner.CustomListner;
import com.absli.base.*;

import com.absli.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.absli.dataproviders.DataProviders;
import com.absli.pageObjects.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	WaitUtils wait;
	public LoginPageTest(){
		super();

	}

	@BeforeClass
	public void preSetup() throws IOException{
		initialization();

	}

	@BeforeMethod
	public void setUp() throws MalformedURLException {

		if (TestBase.parameterName.equalsIgnoreCase("web")) {
			loginPage = new LoginPage(TestBase.driver);
		}
		else if(TestBase.parameterName.equalsIgnoreCase("Android")) {
			loginPage = new LoginPage(TestBase.driver1);
		}
		else {
			loginPage = new LoginPage(TestBase.driver1);
		}
	}


	@Test(groups= {"web"},dataProvider = "dataSignInProvider", dataProviderClass = DataProviders.class,
			description="SC-02:TC-09 ||To check user allow to login LEAP only if user enters the valid user id and pwd")
	public void signInWithvalidCredentialsWeb(String userName, String passWord,String ErrorMSG,String ErrorMSGPassword) throws InterruptedException{
		System.out.println("login case starting ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterUserNameweb(userName);
		loginPage.enterpasswordweb(passWord);
		loginPage.submitButtonweb();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		loginPage.VerifyPageTitleweb();
	}

	@Test(groups= {"web"},dataProvider = "dataSignInProvider", dataProviderClass = DataProviders.class,
			description="SC-02:TC-10 ||To check If the User ID or password entered in incorrect, following message to be shown - “Invalid User ID or password")
	public void signInWithInvalidCredentialsWeb(String userName, String passWord,String ErrorMSG,String ErrorMSGPassword) throws InterruptedException{
		System.out.println("login case starting ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterUserNameweb(userName);
		loginPage.enterpasswordweb(passWord);
		loginPage.submitButtonweb();
		Thread.sleep(2000);
		String ErrorValue=driver.findElement(By.xpath("//div[text()='Check Login ID/Password']")).getText();
		Assert.assertEquals(ErrorValue, ErrorMSG);
		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Invalid Error MSG On Login Page.You Enter Wrong UserName And Password");

	}

	@Test(groups= {"web"},dataProvider = "dataSignInProvider", dataProviderClass = DataProviders.class,
			description="SC-02:TC-15 ||To check If the password Length Should Be Max 50 Characters, following message to be shown - “Invalid User ID or password")
	public void signInWithPasswordLenthShould50Digitweb(String userName, String passWord,String ErrorMSG,String ErrorMSGPassword) throws InterruptedException{
		System.out.println("login case starting ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterUserNameweb(userName);
		loginPage.enterpasswordweb(passWord);
		loginPage.submitButtonweb();
		Thread.sleep(3000);
		String ErrorValue=driver.findElement(By.xpath("//div[text()='Check Login ID/Password']")).getText();
		Assert.assertEquals(ErrorValue, ErrorMSG);
		CustomListner.test.log(LogStatus.INFO, "Successfully Verified..... password Length Should Be Max 50 Characters On Login Page");

	}

	@Test(groups= {"web"},dataProvider = "dataSignInProvider", dataProviderClass = DataProviders.class,
			description="SC-02:TC-14 ||To check no special symbols are accepted in user id field, following message to be shown - “Invalid User ID or password")
	public void signInWithspecialCharactersWeb(String userName, String passWord,String ErrorMSG,String ErrorMSGPassword) throws InterruptedException{
		System.out.println("login case starting ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterUserNameweb(userName);
		loginPage.enterpasswordweb(passWord);
		loginPage.submitButtonweb();
		Thread.sleep(3000);
		String ErrorValue=driver.findElement(By.id("loginId-helper-text")).getText();
		Assert.assertEquals(ErrorValue, ErrorMSG);
		CustomListner.test.log(LogStatus.INFO, "Successfully Verified valid special Characters Error MSG On Login Page");

	}

	@Test(groups= {"web"},dataProvider = "dataSignInProvider", dataProviderClass = DataProviders.class,
			description="SC-02:TC-11 ||To Check If The User ID or Password Not Entered And The User Click On Login Button")
	public void signInWithWithoutEnterUserNameAndPasswordWeb(String userName, String passWord,String ErrorMSG,String ErrorMSGPassword) throws InterruptedException{
		System.out.println("login case starting ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterUserNameweb(userName);
		loginPage.enterpasswordweb(passWord);
		loginPage.submitButtonweb();
		Thread.sleep(3000);
		String ErrorValue=driver.findElement(By.id("loginId-helper-text")).getText();
		Assert.assertEquals(ErrorValue, ErrorMSG);
		String ErrorValue1=driver.findElement(By.id("password-helper-text")).getText();
		Assert.assertEquals(ErrorValue1, ErrorMSGPassword);
		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Error MSG.... The User ID or Password Not Entered And The User Click On Login Button");


	}

	@Test(groups= {"web"},dataProvider = "dataSignInProvider", dataProviderClass = DataProviders.class,
			description="SC-02:TC-13 ||To check If the UserName Length Should Be Max 10 Characters, following message to be shown - “Invalid User ID or password")
	public void signInWithUserNameAcceptmax10DigitsWeb(String userName, String passWord,String ErrorMSG,String ErrorMSGPassword) throws InterruptedException{
		System.out.println("login case starting ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterUserNameweb(userName);
		loginPage.enterpasswordweb(passWord);
		loginPage.submitButtonweb();
		Thread.sleep(3000);
		WebElement checkErrorMSG=driver.findElement(By.xpath("//div[text()='Check Login ID/Password']"));
		String	ErrorValue=checkErrorMSG.getText();
		Assert.assertEquals(ErrorValue, ErrorMSG);
		CustomListner.test.log(LogStatus.INFO, "Successfully Verified..... UserName Length Should Be Max 10 Characters On Login Page");


	}


	@Test(groups= {"Android"},dataProvider = "dataSignInProvider", dataProviderClass = DataProviders.class,
			description="SC-02:TC-09 ||To check user allow to login LEAP only if user enters the valid user id and pwd")
	public void signInWithvalidCredentialsAndroid(String userName, String passWord,String ErrorMSG,String ErrorMSGPassword) throws InterruptedException{
		System.out.println("login case starting ");
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterUserNameAndroid(userName);
		Thread.sleep(3000);
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterpasswordAndroid(passWord);
		Thread.sleep(3000);
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.submitButtonAndroid();
		Thread.sleep(3000);
		loginPage.VerifyPageTitleAndroid();
	}

	@Test(groups= {"Android"},dataProvider = "dataSignInProvider", dataProviderClass = DataProviders.class,
			description="SC-02:TC-10 ||To check If the User ID or password entered in incorrect, following message to be shown - “Invalid User ID or password")
	public void signInWithInvalidCredentialsAndroid(String userName, String passWord,String ErrorMSG,String ErrorMSGPassword) throws InterruptedException{
		System.out.println("login case starting ");
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterUserNameAndroid(userName);
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterpasswordAndroid(passWord);
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.submitButtonAndroid();
		Thread.sleep(2000);
		//String ErrorValue=driver1.findElement(By.xpath("//div[text()='Check Login ID/Password']")).getText();
		String ErrorValue=driver1.findElement(By.xpath("//*[@text='Login ID or Password is incorrect']")).getText();
		Assert.assertEquals(ErrorValue, ErrorMSG);
		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Invalid Error MSG On Login Page");

	}

	@Test(groups= {"Android"},dataProvider = "dataSignInProvider", dataProviderClass = DataProviders.class,
			description="SC-02:TC-11 ||To Check If The User ID or Password Not Entered And The User Click On Login Button")
	public void signInWithWithoutEnterUserNameAndPasswordAndroid(String userName, String passWord,String ErrorMSG,String ErrorMSGPassword) throws InterruptedException{
		System.out.println("login case starting ");
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterUserNameAndroid(userName);
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterpasswordAndroid(passWord);
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.submitButtonAndroid();
		Thread.sleep(3000);
		String ErrorValue=driver1.findElement(By.xpath("//*[@text='Please enter User ID']")).getText();
		Assert.assertEquals(ErrorValue, ErrorMSG);
		Thread.sleep(2000);
		String ErrorValue1=driver1.findElement(By.xpath("//*[@text='Please enter Password']")).getText();
		Assert.assertEquals(ErrorValue1, ErrorMSGPassword);
		Thread.sleep(3000);
		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Error MSG.... The User ID or Password Not Entered And The User Click On Login Button");


	}


	@Test(groups = {"Android" }, dataProvider = "dataSignInProvider", dataProviderClass = DataProviders.class,
			description = "SC-02:TC-13 ||To check User ID should accept max 10 characters, Alphanumeric field")
	public void signInWithUsernameAccept10digitAndroid(String userName, String passWord, String ErrorMSG,String ErrorMSGPassword)
			throws InterruptedException {
		System.out.println("login case starting ");
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterUserNameAndroid(userName);
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterpasswordAndroid(passWord);
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.submitButtonAndroid();
		Thread.sleep(3000);
		String ErrorValue = driver1.findElement(By.xpath("//*[@text='Login ID or Password is incorrect.']")).getText();
		Assert.assertEquals(ErrorValue, ErrorMSG);
		CustomListner.test.log(LogStatus.INFO, "Successfully Verified.. Invalid Error MSG On Login Page");

	}

	@Test(groups = {"Android" }, dataProvider = "dataSignInProvider", dataProviderClass = DataProviders.class,
			description = "SC-02:TC-14 ||To check no special symbols are accepted in user id field")
	public void signInWithSpecialCharacterAndroid(String userName, String passWord, String ErrorMSG,String ErrorMSGPassword)
			throws InterruptedException {
		System.out.println("login case starting ");
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterUserNameAndroid(userName);
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterpasswordAndroid(passWord);
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.submitButtonAndroid();
		Thread.sleep(3000);
		String ErrorValue = driver1.findElement(By.xpath("//*[@text='User ID should be Alphanumeric']")).getText();
		Assert.assertEquals(ErrorValue, ErrorMSG);
		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Error MSG when user enter special character On Login Page");

	}
	@Test(groups = {"Android" }, dataProvider = "dataSignInProvider", dataProviderClass = DataProviders.class,
			description = "SC-02:TC-15 ||To check Password length should be max 50 characters (More than 50 digits should not accepted)")
	public void VerifyPasswordNotAcceptmoreThan50characterAndroid(String userName, String passWord, String ErrorMSG,String ErrorMSGPassword)
			throws InterruptedException {
		System.out.println("login case starting ");
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterUserNameAndroid(userName);
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterpasswordAndroid(passWord);
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.submitButtonAndroid();
		Thread.sleep(3000);
		String ErrorValue = driver1.findElement(By.xpath("//*[@text='Login ID or Password is incorrect.']")).getText();
		Assert.assertEquals(ErrorValue, ErrorMSG);
		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Error MSG when use enter max 50 character On Login Page");

	}


	@Test(groups= {"IOS"},dataProvider = "dataSignInProvider", dataProviderClass = DataProviders.class,
			description="SC-02:TC-09 ||To check user allow to login LEAP only if user enters the valid user id and pwd"
					+ "SC-02:TC-19 ||To check If the user is only sales, then will land on the dashboard where all cases are listed"
					+ "SC-02:TC-08 ||user able to login to LEAP with  Employee ID/Agent Login ID ")
	public void signInWithvalidCredentialsIOS(String userName, String passWord,String ErrorMSG,String ErrorMSGPassword){
		System.out.println("login case starting ");
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterUserNameIOS(userName);
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterpasswordIOS(passWord);
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.submitButtonIOS();
		loginPage.VerifyPageTitleIOS();
	}

	@Test(groups= {"IOS"},dataProvider = "dataSignInProvider", dataProviderClass = DataProviders.class,
			description="SC-02:TC-10 ||To check If the User ID or password entered in incorrect, following message to be shown - “Invalid User ID or password")
	public void signInWithInvalidCredentialsIOS(String userName, String passWord,String ErrorMSG,String ErrorMSGPassword) throws InterruptedException{
		System.out.println("login case starting ");
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterUserNameIOS(userName);
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterpasswordIOS(passWord);
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.submitButtonIOS();
		Thread.sleep(2000);
		String ErrorValue=driver2.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Login ID or Password is incorrect.']]")).getText();
		Assert.assertEquals(ErrorValue, ErrorMSG);
		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Invalid Error MSG On Login Page");

	}

	@Test(groups= {"IOS"},dataProvider = "dataSignInProvider", dataProviderClass = DataProviders.class,
			description="SC-02:TC-11 ||To Check If The User ID or Password Not Entered And The User Click On Login Button")
	public void signInWithWithoutEnterUserNameAndPasswordIOS(String userName, String passWord,String ErrorMSG,String ErrorMSGPassword) throws InterruptedException{
		System.out.println("login case starting ");
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterUserNameIOS(userName);
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterpasswordIOS(passWord);
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.submitButtonIOS();
		Thread.sleep(3000);
		String ErrorValue=driver2.findElement(By.xpath("//XCUIElementTypeStaticText[@name='inputHelperText']")).getText();
		Assert.assertEquals(ErrorValue, ErrorMSG);
		String ErrorValue1=driver2.findElement(By.xpath("//XCUIElementTypeStaticText[@name='inputHelperText']")).getText();

		Assert.assertEquals(ErrorValue1, ErrorMSGPassword);
		Thread.sleep(3000);
		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Error MSG.... The User ID or Password Not Entered And The User Click On Login Button");


	}



	@Test(groups = {"IOS" }, dataProvider = "dataSignInProvider", dataProviderClass = DataProviders.class, description = "SC-02:TC-13 ||To check User ID should accept max 10 characters, Alphanumeric field")
	public void signInWithUsernameAccept10digitIOS(String userName, String passWord, String ErrorMSG,
												   String ErrorMSGPassword) throws InterruptedException {
		System.out.println("login case starting ");
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterUserNameIOS(userName);
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterpasswordIOS(passWord);
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.submitButtonIOS();
		Thread.sleep(3000);
		String ErrorValue = driver2.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Login ID or Password is incorrect.']")).getText();
		Assert.assertEquals(ErrorValue, ErrorMSG);
		CustomListner.test.log(LogStatus.INFO, "Successfully Verified.. Invalid Error MSG On Login Page");

	}


	@Test(groups = {"IOS" }, dataProvider = "dataSignInProvider", dataProviderClass = DataProviders.class,
			description = "SC-02:TC-14 ||To check no special symbols are accepted in user id field")
	public void signInWithSpecialCharacterIOS(String userName, String passWord, String ErrorMSG,String ErrorMSGPassword)
			throws InterruptedException {
		System.out.println("login case starting ");
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterUserNameIOS(userName);
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterpasswordIOS(passWord);
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.submitButtonIOS();
		Thread.sleep(3000);
		String ErrorValue = driver2.findElement(By.xpath("//XCUIElementTypeStaticText[@name='inputHelperText']")).getText();
		Assert.assertEquals(ErrorValue, ErrorMSG);
		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Error MSG when user enter special character On Login Page");

	}
	@Test(groups = {"IOS" }, dataProvider = "dataSignInProvider", dataProviderClass = DataProviders.class,
			description = "SC-02:TC-15 ||To check Password length should be max 50 characters (More than 50 digits should not accepted)")
	public void VerifyPasswordNotAcceptmoreThan50characterIOS(String userName, String passWord, String ErrorMSG,String ErrorMSGPassword)
			throws InterruptedException {
		System.out.println("login case starting ");
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterUserNameIOS(userName);
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.enterpasswordIOS(passWord);
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.submitButtonIOS();
		Thread.sleep(3000);
		String ErrorValue = driver2.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Login ID or Password is incorrect.']")).getText();
		Assert.assertEquals(ErrorValue, ErrorMSG);
		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Error MSG when use enter max 50 character On Login Page");

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
