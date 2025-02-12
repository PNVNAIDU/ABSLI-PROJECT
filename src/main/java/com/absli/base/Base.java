


package com.absli.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Base extends TestBase{

	public static String failedWeb(String screenshotName) throws IOException {
		//this.driver=driver;
		String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File scrFile=((TakesScreenshot)TestBase.driver).getScreenshotAs(OutputType.FILE);
		String destination= System.getProperty("user.dir")+"/FailedTestsScreenshots/"+ screenshotName +
				dateName+".png";
		FileUtils.copyFile(scrFile, new File(destination));

		return destination;
	}
	public static String failedAndroid(String screenshotName) throws IOException {
		//this.driver=driver;
		String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File scrFile=((TakesScreenshot)TestBase.driver1).getScreenshotAs(OutputType.FILE);
		String destination= System.getProperty("user.dir")+"/FailedTestsScreenshots/"+ screenshotName +
				dateName+".png";
		FileUtils.copyFile(scrFile, new File(destination));

		return destination;
	}


}
