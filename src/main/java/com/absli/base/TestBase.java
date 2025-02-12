package com.absli.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.absli.utils.PropertiesUtils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Utils.ExcelUtils;
import util.TestUtil;
import util.WebEventListener;

public class TestBase  {
	static AppiumDriverLocalService service;
	public static  AndroidDriver driver1;
	public static  IOSDriver driver2;
	public static WebDriver driver;
	//public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	
	
	
	
	public static String parameterName;
	static PropertiesUtils prop;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public TestBase(){
		try {
			prop = new PropertiesUtils();
			prop.getProperties("testExcelSheet");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@BeforeTest
	public void setExtent() {
		extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/Extent.html",true);
		extent.addSystemInfo("Host Name", "XE-GGN-IT-04731");
		extent.addSystemInfo("User Name", "NIKHIL.GUPTA");
		extent.addSystemInfo("Environment", "QA");
		test = extent.startTest("ExtentDemo");
		
	}
	@AfterTest
	public void endReport() {
		extent.flush();
		extent.close();
		
	}
	
	public static void initialization() throws IOException {
		
		try {
		
			  parameterName = ExcelUtils.getPlatformNameFromExcel(prop.getProperties("testExcelSheet"), "controller");
			if(parameterName.equalsIgnoreCase("web")){
				String CurrentDir= System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", "/Users/smishra226/Downloads/ABSLI-leap-Framework/src/main/java/com/absli/drivers/chromedriver");
			//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\ABSLI-Leap\\ABSLI-Leap\\src\\main\\java\\com\\absli\\drivers\\chromedriver.exe");
			//	System.setProperty("webdriver.chrome.driver", CurrentDir+"\\src\\main\\java\\com\\absli\\drivers\\chromedriver.exe");
				ChromeOptions chromeOptions = new ChromeOptions();
				WebDriverManager.chromedriver().setup();
			//	driver = new ChromeDriver(chromeOptions);
				driver = new ChromeDriver();
				//e_driver = new EventFiringWebDriver(driver);
				// Now create object of EventListerHandler to register it with EventFiringWebDriver
				eventListener = new WebEventListener();
				//e_driver.register(eventListener);
		//driver = e_driver;

				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
                
				driver.get(prop.getProperties("url"));
				driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

			}
			else if(parameterName.equalsIgnoreCase("Firefox")){
		
			 	System.setProperty("webdriver.gecko.driver", "/Users/smishra226/Downloads/ABSLI-leap-Framework/src/main/java/com/absli/drivers/geckodriver");
				driver = new FirefoxDriver();
				//e_driver = new EventFiringWebDriver(driver);
				// Now create object of EventListerHandler to register it with EventFiringWebDriver
			//	eventListener = new WebEventListener();
			//	e_driver.register(eventListener);
			//	driver = e_driver;

				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

				driver.get(prop.getProperties("url"));

			}
			else if(parameterName.equalsIgnoreCase("Android")){
				
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability("pCloudy_Username", "nikhil.gupta8-v@adityabirlacapital.com");
				capabilities.setCapability("pCloudy_ApiKey", "gck2sf4brkd47rjrhtvpv6yk");
		capabilities.setCapability("pCloudy_ApplicationName", "20220609_2325.apk");
				capabilities.setCapability("pCloudy_ApplicationName", "app-release.apk");
				//capabilities.setCapability("pCloudy_ApplicationName", "apprelease.apk");
				
				capabilities.setCapability("pCloudy_ApplicationName", "20220816_1302.apk");
				capabilities.setCapability("pCloudy_DurationInMinutes", 20);
				capabilities.setCapability("pCloudy_DeviceManafacturer", "Samsung");
				capabilities.setCapability("pCloudy_DeviceVersion", "10.0.0");
				//capabilities.setCapability("pCloudy_DeviceFullName", "Samsung_GalaxyTabA_Android_7.1.1");
				capabilities.setCapability("automationName", "uiautomator2");
				capabilities.setCapability("platformVersion", "10.0.0");
				capabilities.setCapability("platformName", "Android");
				capabilities.setCapability("newCommandTimeout", 600);
				capabilities.setCapability("launchTimeout", 90000);
				capabilities.setCapability("automationName", "uiautomator2");
				capabilities.setCapability("appPackage", "com.absli.leap");
				capabilities.setCapability("appActivity", "com.absli.leap.MainActivity");
				driver1 = new AndroidDriver(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);
			}
			else if(parameterName.equalsIgnoreCase("ios")){

				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability("pCloudy_Username", "shubham.mishra@xebia.com");
				capabilities.setCapability("pCloudy_ApiKey", "fjvrbgctjwzvqjt67fcgcgh9");
				capabilities.setCapability("pCloudy_DurationInMinutes", 15);
				capabilities.setCapability("newCommandTimeout", 600);
				capabilities.setCapability("launchTimeout", 90000);
				//capabilities.setCapability("pCloudy_DeviceFullName", "Apple_iPhone6S_Ios_11.2.0");
				capabilities.setCapability("pCloudy_DeviceFullName", "APPLE_iPhoneXR_iOS_15.2.1_b3558");
				capabilities.setCapability("platformVersion", "15.2.1");
				capabilities.setCapability("platformName", "ios");
				capabilities.setCapability("acceptAlerts", true);
				capabilities.setCapability("automationName", "XCUITest");
				//capabilities.setCapability("pCloudy_ApplicationName", "Leap-1659523230.ipa");
				capabilities.setCapability("pCloudy_ApplicationName", "Leap-1659523230_Resigned1659523251.ipa");

				capabilities.setCapability("bundleId", "com.absli.leap");
				capabilities.setCapability("pCloudy_WildNet", "true");
				capabilities.setCapability("pCloudy_EnableVideo", "false");
				capabilities.setCapability("pCloudy_EnablePerformanceData", "false");
				capabilities.setCapability("pCloudy_EnableDeviceLogs", "true");
				driver2 = new IOSDriver(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);

			}
			/*
			 * extent=new
			 * ExtentReports(System.getProperty("user.dir")+"/test-output/Extent.html",true)
			 * ; extent.addSystemInfo("Host Name", "XE-GGN-IT-04731");
			 * extent.addSystemInfo("User Name", "NIKHIL.GUPTA");
			 * extent.addSystemInfo("Environment", "QA");
			 */
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
		System.out.println("time out exception"+e);
		}
	
		

	}












}
