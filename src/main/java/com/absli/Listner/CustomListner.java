package com.absli.Listner;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.absli.base.Base;
import com.absli.base.TestBase;
import com.absli.pageObjects.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CustomListner extends Base implements ITestListener{
	public static ExtentReports extent;
	public static ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/Extent.html",false);
		extent.addSystemInfo("Host Name", "XE-GGN-IT-04731");
		extent.addSystemInfo("User Name", "NIKHIL.GUPTA");
		extent.addSystemInfo("Environment", "QA");
		test = extent.startTest(result.getMethod().getMethodName(), result.getMethod().getDescription());


	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("FAILED test");
		System.out.println("**************************************");
		System.out.println("******* TEST FAIL: "+result.getMethod().getMethodName()+" - "+result.getMethod().getDescription());
		System.out.println("**************************************");
		try {
			if (TestBase.parameterName.equalsIgnoreCase("web")) {
				String screenshotPath = failedWeb(result.getMethod().getMethodName());
				result.getMethod().getDescription();
				test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
			}
			else if(TestBase.parameterName.equalsIgnoreCase("Android")) {
				String screenshotPath = failedAndroid(result.getMethod().getMethodName());
				test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));

			}


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("FAILED test");
		System.out.println("**************************************");
		System.out.println("******* TEST FAIL: "+result.getMethod().getMethodName()+" - "+result.getMethod().getDescription());
		System.out.println("**************************************");


	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub


	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.endTest(test);
		extent.flush();
		extent.close();


	}



}
