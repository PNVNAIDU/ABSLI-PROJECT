package com.absli.pageObjects;


//import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.absli.Listner.CustomListner;
import com.absli.utils.WaitUtils;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import util.TestUtil;

public class HealthDetail {
	  public WebDriver driver;
	    public AndroidDriver driver1;
	    public IOSDriver driver2;
	    public WaitUtils waitUtils;
	    LoginPage loginPage;
	    Dashboard dashboard;
	    CustomerProfile customerProfile;

	    // Initializing the Page Objects:
	    public HealthDetail(AndroidDriver driver1) {
	        this.driver1 = driver1;
	        waitUtils = new WaitUtils();
	    }

	    public HealthDetail(WebDriver driver) {
	        this.driver = driver;
	        waitUtils = new WaitUtils();
	    }

	    public HealthDetail(IOSDriver driver) {
	        this.driver2 = driver;
	        waitUtils = new WaitUtils();
	    }
	    
	    public void ClickonHealthDetailsTab(String value) {
			WebElement TabBTN=driver.findElement(By.xpath("//div[text()='"+value+"']"));
			waitUtils.waitForElementToBeVisibleweb(driver, TabBTN, 20, "Element is Not Display");
            if(TabBTN.isDisplayed()) {
            	TabBTN.click();
            	CustomListner.test.log(LogStatus.INFO, "Click on  "+ value +" Tab");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  value+"   Tab not Display");
            }
			
		}
	    public void EnterLowHighBloodPresureCurrentSymptoms(String value) {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.0.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.sendKeys(value);
           
            	CustomListner.test.log(LogStatus.INFO, "Enter Low/High Blood Pressure Current Symptoms As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Low/High Blood Pressure Current Symptoms");
            }
			
		}
	    public void EnterLowHighBloodPresureDoctorDetails(String value) {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.0.doctorDetails')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.sendKeys(value);
           
            	CustomListner.test.log(LogStatus.INFO, "Enter Low/High Blood Pressure Doctor Details As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Low/High Blood Pressure Doctor Details");
            }
			
		}
	    public void EnterLowHighBloodPresureDateOfLastConsult(String value) throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.0.dateOfConsultation')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.clear();
            	Thread.sleep(1000);
            	CurrentBTN.sendKeys(value);
           
            	CustomListner.test.log(LogStatus.INFO, "Enter Low/High Blood Pressure Date Of Last Consultation As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Low/High Blood Pressure Date Of Last Consultation");
            }
			
		}
	    public void EnterLowHighBloodPresureDateofDiagnos(String value) throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.0.dateOfDiagnosis')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.clear();
            	Thread.sleep(1000);
            	CurrentBTN.sendKeys(value);
            	CurrentBTN.sendKeys(Keys.TAB);
            	CustomListner.test.log(LogStatus.INFO, "Enter Low/High Blood Pressure Date Of Diagnos As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Low/High Blood Pressure Date Of Diagnos");
            }
			
		}
	    public void EnterLowHighBloodPresureHospitalize(String value) {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.0.hospitalizationDetails')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.sendKeys(value);
            	CustomListner.test.log(LogStatus.INFO, "Enter Low/High Blood Pressure hospitalization Details As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Low/High Blood Pressure hospitalizationDetails");
            }
			
		}
	    public void EnterHighCholesterolCurrentSymptoms(String value) {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.1.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.sendKeys(value);
           
            	CustomListner.test.log(LogStatus.INFO, "Enter High Cholesterol Current Symptoms As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display High Cholesterol Current Symptoms");
            }
			
		}
	    public void EnterHighCholesterolDoctorDetails(String value) {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.1.doctorDetails')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.sendKeys(value);
           
            	CustomListner.test.log(LogStatus.INFO, "Enter High Cholesterol Doctor Details As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display High Cholesterol Doctor Details");
            }
			
		}
	    public void EnterHighCholesterolDateOfLastConsult(String value) {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.1.dateOfConsultation')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.sendKeys(value);
           
            	CustomListner.test.log(LogStatus.INFO, "Enter High Cholesterol Date Of Last Consultation As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display High Cholesterol Date Of Last Consultation");
            }
			
		}
	    public void EnterHighCholesterolDateofDiagnos(String value) {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.1.dateOfDiagnosis')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.sendKeys(value);        
            	CustomListner.test.log(LogStatus.INFO, "Enter High Cholesterol Date Of Diagnos As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display High Cholesterol Date Of Diagnos");
            }
			
		}
	    public void EnterHighCholesterolHospitalize(String value) {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.1.hospitalizationDetails')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.sendKeys(value);
            	CustomListner.test.log(LogStatus.INFO, "Enter High Cholesterolospitalization Details As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display High Cholesterol hospitalizationDetails");
            }
			
		}
	    public void EnterHeartAttackCurrentSymptoms(String value) {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.2.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.sendKeys(value);
           
            	CustomListner.test.log(LogStatus.INFO, "Enter Heart Attack Current Symptoms As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Attack Current Symptoms");
            }
			
		}
	    public void EnterHeartAttackDoctorDetails(String value) {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.2.doctorDetails')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.sendKeys(value);
           
            	CustomListner.test.log(LogStatus.INFO, "Enter Heart Attack Doctor Details As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Attack Doctor Details");
            }
			
		}
	    public void EnterHeartAttackDateOfLastConsult(String value) {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.2.dateOfConsultation')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.sendKeys(value);
           
            	CustomListner.test.log(LogStatus.INFO, "Enter Heart Attack Date Of Last Consultation As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Attack Date Of Last Consultation");
            }
			
		}
	    public void EnterHeartAttackDateofDiagnos(String value) {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.2.dateOfDiagnosis')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.sendKeys(value);        
            	CustomListner.test.log(LogStatus.INFO, "Enter Heart Attack Date Of Diagnos As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Attack Date Of Diagnos");
            }
			
		}
	    public void EnterHeartAttackHospitalize(String value) {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.2.hospitalizationDetails')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.sendKeys(value);
            	CustomListner.test.log(LogStatus.INFO, "Enter Heart Attack Hospitalization Details As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Attack hospitalizationDetails");
            }
			
		}
	    public void EnterHeartMurmurCurrentSymptoms(String value) {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.3.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.sendKeys(value);
           
            	CustomListner.test.log(LogStatus.INFO, "Enter Heart Murmur Current Symptoms As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Murmur Current Symptoms");
            }
			
		}
	    public void EnterHeartMurmurDoctorDetails(String value) {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.3.doctorDetails')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.sendKeys(value);
           
            	CustomListner.test.log(LogStatus.INFO, "Enter Heart Murmur Doctor Details As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Murmur Doctor Details");
            }
			
		}
	    public void EnterHeartMurmurDateOfLastConsult(String value) {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.3.dateOfConsultation')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.sendKeys(value);
           
            	CustomListner.test.log(LogStatus.INFO, "Enter Heart Murmur Date Of Last Consultation As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Murmur Date Of Last Consultation");
            }
			
		}
	    public void EnterHeartMurmurDateofDiagnos(String value) {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.3.dateOfDiagnosis')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.sendKeys(value);        
            	CustomListner.test.log(LogStatus.INFO, "Enter Heart Murmur Date Of Diagnos As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Murmur Date Of Diagnos");
            }
			
		}
	    public void EnterHeartMurmurHospitalize(String value) {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.3.hospitalizationDetails')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.sendKeys(value);
            	CustomListner.test.log(LogStatus.INFO, "Enter Heart Murmur Hospitalization Details As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Murmur hospitalizationDetails");
            }
			
		}
	    public void EnterHeartDisOrdersCurrentSymptoms(String value) {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.4.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.sendKeys(value);
           
            	CustomListner.test.log(LogStatus.INFO, "Enter Heart Disorders Current Symptoms As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Disorders Current Symptoms");
            }
			
		}
	    public void EnterHeartDisOrdersDoctorDetails(String value) {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.4.doctorDetails')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.sendKeys(value);
           
            	CustomListner.test.log(LogStatus.INFO, "Enter Heart Disorders Doctor Details As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Disorders Doctor Details");
            }
			
		}
	    public void EnterHeartDisOrdersDateOfLastConsult(String value) {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.4.dateOfConsultation')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.sendKeys(value);
           
            	CustomListner.test.log(LogStatus.INFO, "Enter Heart Disorders Date Of Last Consultation As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Disorders Date Of Last Consultation");
            }
			
		}
	    public void EnterHeartDisOrdersDateofDiagnos(String value) {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.4.dateOfDiagnosis')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.sendKeys(value);        
            	CustomListner.test.log(LogStatus.INFO, "Enter Heart Disorders Date Of Diagnos As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Disorders Date Of Diagnos");
            }
			
		}
	    public void EnterHeartDisOrdersHospitalize(String value) {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.4.hospitalizationDetails')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.sendKeys(value);
            	CustomListner.test.log(LogStatus.INFO, "Enter Heart Disorders Hospitalization Details As=====>"+ value );
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Disorders hospitalization Details");
            }
			
		}
	    public void BlankValueLowHighBloodPressure() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.0.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.0.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.0.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.0.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.0.hospitalizationDetails')]"));
           
			if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Low/High Blood Pressure");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Hospitalization");
            }
			
		}
	    public void BlankValuePneumonia() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.0.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.0.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.0.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.0.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.0.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Pneumonia Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Pneumonia Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Pneumonia Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Pneumonia Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Pneumonia Hospitalization");
            }
			
		}
	    public void BlankValueUlcer() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.0.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.0.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.0.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.0.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.0.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Ulcer Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Ulcer Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Ulcer Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Ulcer Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Ulcer Hospitalization");
            }
			
		}
	    public void BlankValueKidney() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.0.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.0.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.0.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.0.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.0.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Kidney Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Kidney Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Kidney Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Kidney Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Kidney Hospitalization");
            }
			
		}
	    public void BlankValueMuscleDisorder() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8129.0.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8129.0.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8129.0.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8129.0.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8129.0.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Muscle Disorder Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Muscle Disorder Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Muscle Disorder Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Muscle Disorder Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Muscle Disorder Hospitalization");
            }
			
		}
	    public void BlankValueDisorderofeyes() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8130.0.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8130.0.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8130.0.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8130.0.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8130.0.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Disorder of eyes Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Disorder of eyes Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Disorder of eyes Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Disorder of eyes Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Disorder of eyes Hospitalization");
            }
			
		}
	    public void BlankValueTumour() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.0.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.0.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.0.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.0.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.0.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Tumour Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Tumour Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Tumour Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Tumour Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Tumour Hospitalization");
            }
			
		}
	    public void BlankValueOthersIllness() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8131.0.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8131.0.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8131.0.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8131.0.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8131.0.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Others Illness Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Others Illness Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Others Illness Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Others Illness Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Others Illness Hospitalization");
            }
			
		}
	    public void BlankValueSurgery() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8131.1.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8131.1.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8131.1.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8131.1.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8131.1.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Surgery Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Surgery Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Surgery Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Surgery Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Surgery Hospitalization");
            }
			
		}
	    public void BlankValueAilment() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8131.2.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8131.2.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8131.2.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8131.2.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8131.2.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Ailment Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Ailment Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Ailment Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Ailment Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Ailment Hospitalization");
            }
			
		}
	    public void BlankValueInjury() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8131.3.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8131.3.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8131.3.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8131.3.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8131.3.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Injury Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Injury Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Injury Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Injury Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Injury Hospitalization");
            }
			
		}
	    public void BlankValueCancerenlargedlymphnodes() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.5.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.5.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.5.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.5.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.5.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Cancer/enlarged lymph nodes Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Cancer/enlarged lymph nodes Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Cancer/enlarged lymph nodes Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Cancer/enlarged lymph nodes Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Cancer/enlarged lymph nodes Hospitalization");
            }
			
		}
	    public void BlankValueEnlargedlymphnodes() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.4.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.4.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.4.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.4.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.4.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Enlarged lymph nodes Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Enlarged lymph nodes Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Enlarged lymph nodes Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Enlarged lymph nodes Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Enlarged lymph nodes Hospitalization");
            }
			
		}
	    public void BlankValueEnlargedglands() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.3.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.3.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.3.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.3.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.3.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Enlarged glands Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Enlarged glands Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Enlarged glands Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Enlarged glands Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Enlarged glands Hospitalization");
            }
			
		}
	    public void BlankValueCyst() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.2.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.2.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.2.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.2.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.2.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Cyst Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Cyst Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Cyst Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Cyst Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Cyst Hospitalization");
            }
			
		}
	    public void BlankValueAbnormalGrowth() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.1.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.1.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.1.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.1.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8126.1.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Abnormal Growth Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Abnormal Growth Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Abnormal Growth Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Abnormal Growth Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Abnormal Growth Hospitalization");
            }
			
		}
	    public void BlankValueDisorderofEar() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8130.1.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8130.1.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8130.1.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8130.1.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8130.1.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Disorder of Ear Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Disorder of Ear Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Disorder of Ear Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Disorder of Ear Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Disorder of Ear Hospitalization");
            }
			
		}
	    public void BlankValueBonefracture() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8129.1.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8129.1.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8129.1.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8129.1.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8129.1.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Bone fracture Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Bone fracture Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Bone fracture Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Bone fracture Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Bone fracture Hospitalization");
            }
			
		}
	    public void BlankValueGenitourinaryDisorder() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.5.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.5.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.5.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.5.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.5.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Genitourinary Disorder Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Genitourinary Disorder Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Genitourinary Disorder Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Genitourinary Disorder Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Genitourinary Disorder Hospitalization");
            }
			
		}
	    public void BlankValueProstateDisorder() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.4.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.4.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.4.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.4.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.4.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Prostate Disorder Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Prostate Disorder Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Prostate Disorder Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Prostate Disorder Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Prostate Disorder Hospitalization");
            }
			
		}
	    public void BlankValueBladder() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.2.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.2.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.2.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.2.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.2.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Bladder Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Bladder Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Bladder Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Bladder Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Bladder Hospitalization");
            }
			
		}
	    public void BlankValueReproductiveorgan() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.3.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.3.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.3.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.3.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.3.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Reproductive organ Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Reproductive organ Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Reproductive organ Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Reproductive organ Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Reproductive organ Hospitalization");
            }
			
		}
	    public void BlankValueUrinary() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.1.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.1.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.1.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.1.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8128.1.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Urinary Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Urinary Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Urinary Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Urinary Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Urinary Hospitalization");
            }
			
		}
	    public void BlankValueFaintingSpells() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.0.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.0.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.0.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.0.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.0.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Fainting Spells Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Fainting Spells Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Fainting Spells Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Fainting Spells Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Fainting Spells Hospitalization");
            }
			
		}
	    public void BlankValueParalysis() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.1.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.1.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.1.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.1.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.1.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Paralysis Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Paralysis Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Paralysis Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Paralysis Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Paralysis Hospitalization");
            }
			
		}
	    public void BlankValueStroke() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.2.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.2.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.2.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.2.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.2.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Stroke Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Stroke Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Stroke Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Stroke Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Stroke Hospitalization");
            }
			
		}
	    public void BlankValueMentalDisorder() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.3.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.3.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.3.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.3.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.3.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Mental Disorder Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Mental Disorder Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Mental Disorder Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Mental Disorder Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Mental Disorder Hospitalization");
            }
			
		}
	    public void BlankValuePsychiatricdisorder() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.4.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.4.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.4.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.4.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.4.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Psychiatric disorder Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Psychiatric disorder Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Psychiatric disorder Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Psychiatric disorder Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Psychiatric disorder Hospitalization");
            }
			
		}
	    public void BlankValueAnyotherneurologicaldisorder() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.5.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.5.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.5.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.5.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8127.5.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Any other neurological disorder Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Any other neurological disorder Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Any other neurological disorder Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Any other neurological disorder Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Any other neurological disorder Hospitalization");
            }
			
		}
	    public void BlankValueColitis() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.1.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.1.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.1.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.1.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.1.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Colitis Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Colitis Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Colitis Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Colitis Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Colitis Hospitalization");
            }
			
		}
	    public void BlankValueChronicDiarrhoea() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.2.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.2.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.2.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.2.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.2.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Chronic Diarrhoea Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Chronic Diarrhoea Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Chronic Diarrhoea Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Chronic Diarrhoea Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Chronic Diarrhoea Hospitalization");
            }
			
		}
	    public void BlankValueHepatitis() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.3.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.3.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.3.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.3.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.3.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Hepatitis Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Hepatitis Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Hepatitis Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Hepatitis Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Hepatitis Hospitalization");
            }
			
		}
	    public void BlankValueJaundice() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.4.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.4.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.4.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.4.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.4.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Jaundice Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Jaundice Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Jaundice Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Jaundice Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Jaundice Hospitalization");
            }
			
		}
	    public void BlankValueOtherliverdisorders() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.5.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.5.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.5.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.5.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.5.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Other liver disorders Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Other liver disorders Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Other liver disorders Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Other liver disorders Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Other liver disorders Hospitalization");
            }
			
		}
	    public void BlankValueDigestivedisorders() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.6.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.6.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.6.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.6.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8125.6.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Digestive disorders Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Digestive disorders Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Digestive disorders Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Digestive disorders Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Digestive disorders Hospitalization");
            }
			
		}
	    public void BlankValueShortnessofbreath() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.1.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.1.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.1.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.1.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.1.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Shortness Of breath Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Shortness Of breath Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Shortness Of breath Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Shortness Of breath Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Shortness Of breath Hospitalization");
            }
			
		}
	    public void BlankValueTuberculosis() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.2.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.2.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.2.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.2.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.2.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Tuberculosis Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Tuberculosis Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Tuberculosis Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Tuberculosis Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Tuberculosis Hospitalization");
            }
			
		}
	    public void BlankValueOtherRespiratory() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.3.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.3.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.3.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.3.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.3.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Other Respiratory Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Other Respiratory Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Other Respiratory Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Other Respiratory Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Other Respiratory Hospitalization");
            }
			
		}
	    public void BlankValueLungDisorders() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.4.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.4.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.4.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.4.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8122.4.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Lung Disorders Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Lung Disorders Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Lung Disorders Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Lung Disorders Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Lung Disorders Hospitalization");
            }
			
		}
	    public void BlankValueHighCholesterol() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.1.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.1.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.1.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.1.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.1.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display High Cholesterol Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display High Cholesterol Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display High Cholesterol Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display High Cholesterol Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display High Cholesterol Hospitalization");
            }
			
		}
	    public void BlankValueHeartAttack() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.2.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.2.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.2.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.2.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.2.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Attack Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Attack Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Attack Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Attack Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Attack Hospitalization");
            }
			
		}
	    public void BlankValueHeartMurmur() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.3.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.3.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.3.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.3.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.3.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Murmur Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Murmur Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Murmur Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Murmur Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Murmur Hospitalization");
            }
			
		}
	    public void BlankValueHeartDisorders() {
			WebElement CurrentBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.4.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.4.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.4.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.4.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//input[contains(@id,'8121.4.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	CurrentBTN.click();
            	CurrentBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Disorders Current Symptoms");
            }
            if(DoctorBTN.isDisplayed()) {
            	DoctorBTN.click();
            	DoctorBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Disorders Doctor details");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	DateofconsultBTN.click();
            	DateofconsultBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Disorders Date Of Last Consultation");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	DateofdiagnosBTN.click();
            	DateofdiagnosBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Disorders Date Of Diagnosis");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	HospitalizationBTN.click();
            	HospitalizationBTN.sendKeys(Keys.TAB);
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Disorders Hospitalization");
            }
			
		}
	   
	    public void VerifyLowHighBloodPressureErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.0.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.0.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.0.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.0.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.0.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Low/High Blood Pressure Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Low/High Blood Pressure Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyPneumoniaErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.0.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.0.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.0.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.0.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.0.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Pneumonia Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Pneumonia Current Symptoms Mandatory  Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Pneumonia Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Pneumonia Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Pneumonia Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Pneumonia Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Pneumonia Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Pneumonia Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Pneumonia Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Pneumonia Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyUlcerErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.0.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.0.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.0.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.0.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.0.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Ulcer Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Ulcer Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Ulcer Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Ulcer Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Ulcer Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Ulcer Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Ulcer Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Ulcer Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Ulcer Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Ulcer Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyKidneyErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.0.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.0.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.0.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.0.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.0.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Kidney Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Kidney Current Symptoms Mandatory  Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Kidney Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Kidney Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Kidney Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Kidney Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Kidney Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Kidney Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Kidney Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Kidney Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyMuscleDisorderErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8129.0.currentSymptoms-helper-text')]"));
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8129.0.doctorDetails-helper-text')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8129.0.dateOfConsultation-helper-text')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8129.0.dateOfDiagnosis-helper-text')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8129.0.hospitalizationDetails-helper-text')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Muscle Disorder Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Muscle Disorder Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Muscle Disorder Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Muscle Disorder Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Muscle Disorder Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Muscle Disorder Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Muscle Disorder Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Muscle Disorder Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Muscle Disorder Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Muscle Disorder Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyDisorderOfEyesErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8130.0.currentSymptoms-helper-text')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8130.0.doctorDetails-helper-text')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8130.0.dateOfConsultation-helper-text')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8130.0.dateOfDiagnosis-helper-text')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8130.0.hospitalizationDetails-helper-text')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Disorder of eyes Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Disorder of eyes Current Symptoms Mandatory  Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Disorder of eyes Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Disorder of eyes Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Disorder of eyes Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Disorder of eyes Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Disorder of eyes Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Disorder of eyes Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Disorder of eyes Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Disorder of eyes Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyTumourErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.0.currentSymptoms-helper-text')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.0.doctorDetails-helper-text')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.0.dateOfConsultation-helper-text')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.0.dateOfDiagnosis-helper-text')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.0.hospitalizationDetails-helper-text')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Tumour Current Symptoms Mandatory  Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Tumour Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Tumour Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Tumour Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Tumour Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Tumour Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Tumour Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Tumour Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Tumour Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Tumour Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyOthersIllnessErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8131.0.currentSymptoms-helper-text')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8131.0.doctorDetails-helper-text')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8131.0.dateOfConsultation-helper-text')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8131.0.dateOfDiagnosis-helper-text')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8131.0.hospitalizationDetails-helper-text')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Others Illness Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Others Illness Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Others Illness Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Others Illness Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Others Illness Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Others Illness Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Others Illness Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Others Illness Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Others Illness Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Others Illness Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifySurgeryErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8131.1.currentSymptoms-helper-text')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8131.1.doctorDetails-helper-text')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8131.1.dateOfConsultation-helper-text')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8131.1.dateOfDiagnosis-helper-text')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8131.1.hospitalizationDetails-helper-text')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Surgery Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Surgery Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Surgery Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Surgery Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Surgery Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Surgery Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Surgery Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Surgery Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Surgery Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Surgery Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyAilmentErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8131.2.currentSymptoms-helper-text')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8131.2.doctorDetails-helper-text')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8131.2.dateOfConsultation-helper-text')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8131.2.dateOfDiagnosis-helper-text')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8131.2.hospitalizationDetails-helper-text')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Ailment Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Ailment Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Ailment Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Ailment Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Ailment Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Ailment Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Ailment Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Ailment Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Ailment Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Ailment Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyInjuryErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8131.3.currentSymptoms-helper-text')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8131.3.doctorDetails-helper-text')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8131.3.dateOfConsultation-helper-text')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8131.3.dateOfDiagnosis-helper-text')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8131.3.hospitalizationDetails-helper-text')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Injury Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Injury Current Symptoms Mandatory  Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Injury Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Injury Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Injury Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Injury Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Injury Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Injury Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Injury Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Injury Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyCancerenlargedlymphnodesErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.5.currentSymptoms-helper-text')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.5.doctorDetails-helper-text')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.5.dateOfConsultation-helper-text')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.5.dateOfDiagnosis-helper-text')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.5.hospitalizationDetails-helper-text')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Cancer/enlarged lymph nodes Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Cancer/enlarged lymph nodes Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Cancer/enlarged lymph nodes Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Cancer/enlarged lymph nodes Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Cancer/enlarged lymph nodes Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Cancer/enlarged lymph nodes Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Cancer/enlarged lymph nodes Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Cancer/enlarged lymph nodes Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Cancer/enlarged lymph nodes Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Cancer/enlarged lymph nodes Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyEnlargedlymphnodesErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.4.currentSymptoms-helper-text')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.4.doctorDetails-helper-text')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.4.dateOfConsultation-helper-text')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.4.dateOfDiagnosis-helper-text')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.4.hospitalizationDetails-helper-text')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Enlarged lymph nodes Current  Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Enlarged lymph nodes Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Enlarged lymph nodes Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Enlarged lymph nodes Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Enlarged lymph nodes Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Enlarged lymph nodes Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Enlarged lymph nodes Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Enlarged lymph nodes Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Enlarged lymph nodes Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Enlarged lymph nodes Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyEnlargedglandsErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.3.currentSymptoms-helper-text')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.3.doctorDetails-helper-text')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.3.dateOfConsultation-helper-text')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.3.dateOfDiagnosis-helper-text')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.3.hospitalizationDetails-helper-text')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Enlarged glands Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Enlarged glands Current Symptoms Mandatory  Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Enlarged glands Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Enlarged glands Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Enlarged glands Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Enlarged glands Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Enlarged glands Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Enlarged glands Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Enlarged glands Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Enlarged glands Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyCystErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.2.currentSymptoms-helper-text')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.2.doctorDetails-helper-text')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.2.dateOfConsultation-helper-text')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.2.dateOfDiagnosis-helper-text')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.2.hospitalizationDetails-helper-text')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Cyst Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Cyst Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Cyst Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Cyst Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Cyst Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Cyst Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Cyst Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Cyst Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Cyst Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Cyst Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyAbnormalGrowthErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.1.currentSymptoms-helper-text')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.1.doctorDetails-helper-text')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.1.dateOfConsultation-helper-text')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.1.dateOfDiagnosis-helper-text')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8126.1.hospitalizationDetails-helper-text')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Abnormal Growth Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Abnormal Growth Current Symptoms Mandatory  Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Abnormal Growth Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Abnormal Growth Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Abnormal Growth Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Abnormal Growth Date Of Last  Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Abnormal Growth Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Abnormal Growth Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Abnormal Growth Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Abnormal Growth Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyDisorderOfEarErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8130.1.currentSymptoms-helper-text')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8130.1.doctorDetails-helper-text')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8130.1.dateOfConsultation-helper-text')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8130.1.dateOfDiagnosis-helper-text')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8130.1.hospitalizationDetails-helper-text')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Disorder of Ear Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Disorder of Ear Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Disorder of Ear Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Disorder of Ear Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Disorder of Ear Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Disorder of Ear Date Of Last Consult Mandatory  Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Disorder of Ear Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Disorder of Ear Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Disorder of Ear Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Disorder of Ear Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyBonefractureErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8129.1.currentSymptoms-helper-text')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8129.1.doctorDetails-helper-text')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8129.1.dateOfConsultation-helper-text')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8129.1.dateOfDiagnosis-helper-text')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8129.1.hospitalizationDetails-helper-text')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Bone fracture Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Bone fracture Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Bone fracture Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Bone fracture Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Bone fracture Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Bone fracture Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Bone fracture Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Bone fracture Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Bone fracture Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Bone fracture Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyGenitourinaryDisorderErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.5.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.5.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.5.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.5.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.5.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Genitourinary Disorder Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Genitourinary Disorder Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Genitourinary Disorder Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Genitourinary Disorder Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Genitourinary Disorder Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Genitourinary Disorder Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Genitourinary Disorder Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Genitourinary Disorder Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Genitourinary Disorder Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Genitourinary Disorder Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyProstateDisorderErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.4.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.4.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.4.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.4.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.4.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Prostate Disorder Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Prostate Disorder Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Prostate Disorder Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Prostate Disorder Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Prostate Disorder Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Prostate Disorder Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Prostate Disorder Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Prostate Disorder Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Prostate Disorder Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Prostate Disorder Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyBladderErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.2.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.2.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.2.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.2.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.2.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Bladder Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Bladder Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Bladder Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Bladder Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Bladder Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Bladder Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Bladder Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Bladder Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Bladder Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Bladder Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyReproductiveorganErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.3.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.3.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.3.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.3.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.3.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Reproductive organ Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Reproductive organ Current Symptoms  Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Reproductive organ Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Reproductive organ Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Reproductive organ Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Reproductive organ Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Reproductive organ Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Reproductive organ Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Reproductive organ Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Reproductive organ Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyUrinaryErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.1.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.1.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.1.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.1.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8128.1.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Urinary Current  Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Urinary Current Symptoms Mandatory  Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Urinary Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Urinary Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Urinary Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Urinary Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Urinary Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Urinary Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Urinary Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Urinary Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyFaintingSpellsErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.0.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.0.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.0.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.0.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.0.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Fainting Spells Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Fainting Spells Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Fainting Spells Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Fainting Spells Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Fainting Spells Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Fainting Spells Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Fainting Spells Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Fainting Spells Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Fainting Spells Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Fainting Spells Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyParalysisErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.1.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.1.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.1.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.1.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.1.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Paralysis Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Paralysis Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Paralysis Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Paralysis Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Paralysis Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Paralysis Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Paralysis Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Paralysis Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Paralysis Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Paralysis Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyStrokeErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.2.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.2.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.2.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.2.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.2.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Stroke Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Stroke Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Stroke Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Stroke Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Stroke Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Stroke Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Stroke Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Stroke Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Stroke Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Stroke Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyMentalDisorderErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.3.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.3.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.3.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.3.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.3.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Mental Disorder Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Mental Disorder Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Mental Disorder Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Mental Disorder Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Mental Disorder Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Mental Disorder Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Mental Disorder Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Mental Disorder Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Mental Disorder Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Mental Disorder Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyPsychiatricdisorderErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.4.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.4.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.4.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.4.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.4.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Psychiatric disorder Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Psychiatric disorder Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Psychiatric disorder Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Psychiatric disorder Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Psychiatric disorder Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Psychiatric disorder Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Psychiatric disorder Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Psychiatric disorder Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Psychiatric disorder Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Psychiatric disorder Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyAnyotherneurologicaldisorderErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.5.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.5.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.5.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.5.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8127.5.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Any other neurological disorder Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Any other neurological disorder Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Any other neurological disorder Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Any other neurological disorder Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Any other neurological disorder Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Any other neurological disorder Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Any other neurological disorder Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Any other neurological disorder Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Any other neurological disorder Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Any other neurological disorder Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyColitisErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.1.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.1.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.1.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.1.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.1.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Colitis Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Colitis Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Colitis Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Colitis Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Colitis Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Colitis Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Colitis Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Colitis Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Colitis Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Colitis Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyChronicDiarrHoeaErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.2.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.2.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.2.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.2.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.2.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Chronic Diarrhoea Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Chronic Diarrhoea Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Chronic Diarrhoea Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Chronic Diarrhoea Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Chronic Diarrhoea Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Chronic Diarrhoea Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Chronic Diarrhoea Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Chronic Diarrhoea Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Chronic Diarrhoea Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Chronic Diarrhoea Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyHepatitisErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.3.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.3.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.3.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.3.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.3.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Hepatitis Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Hepatitis Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Hepatitis Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Hepatitis Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Hepatitis Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Hepatitis Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Hepatitis Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Hepatitis Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Hepatitis Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Hepatitis Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyJaundiceErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.4.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.4.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.4.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.4.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.4.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Jaundice Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Jaundice Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Jaundice Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Jaundice Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Jaundice Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Jaundice Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Jaundice Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Jaundice Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Jaundice Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Jaundice Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyOtherliverdisordersErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.5.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.5.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.5.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.5.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.5.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Other liver disorders Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Other liver disorders Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Other liver disorders Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Other liver disorders Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Other liver disorders Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Other liver disorders Date Of Last Consult Mandatory  Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Other liver disorders Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Other liver disorders Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Other liver disorders Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Other liver disorders Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyDigestivedisordersErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.6.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.6.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.6.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.6.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8125.6.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Digestive disorders Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Digestive disorders Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Digestive disorders Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Digestive disorders Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Digestive disorders Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Digestive disorders Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Digestive disorders Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Digestive disorders Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Digestive disorders Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Digestive disorders Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyShortnessOfBreathErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.1.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.1.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.1.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.1.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.1.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Shrotness Of Breath Current  Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Shrotness Of Breath Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Shrotness Of Breath Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Shrotness Of Breath Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Shrotness Of Breath Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Shrotness Of Breath Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Shrotness Of Breath Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Shrotness Of Breath Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Shrotness Of Breath Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Shrotness Of Breath Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyDateOnWhichYourDiabeticDiagnosErrorMSG() throws InterruptedException {
			WebElement dayBTN=driver.findElement(By.xpath("//p[contains(text(),'Enter Day')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, dayBTN, 20, "Element is Not Display");
			WebElement monthBTN=driver.findElement(By.xpath("//p[contains(text(),'Enter month')]"));
			WebElement yearBTN=driver.findElement(By.xpath("//p[contains(text(),'Enter year')]"));
			
            if(dayBTN.isDisplayed()) {
            	TestUtil.verifybgColor(dayBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified 2. Date on which your diabetes was diagnosed? Day  Mandatory  Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display 2. Date on which your diabetes was diagnosed? Day Mandatory  Error Message");
            }
            if(monthBTN.isDisplayed()) {
            	TestUtil.verifybgColor(monthBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified 2. Date on which your diabetes was diagnosed? Month  Mandatory  Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display 2. Date on which your diabetes was diagnosed? Day Mandatory  Error Message");
            }
            if(yearBTN.isDisplayed()) {
            	TestUtil.verifybgColor(yearBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified 2. Date on which your diabetes was diagnosed? Year  Mandatory  Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display 2. Date on which your diabetes was diagnosed? Day Mandatory  Error Message");
            }
           
			
		}
	    public void VerifyTuberculosisErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.2.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.2.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.2.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.2.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.2.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Tuberculosis Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Tuberculosis Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Tuberculosis Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Tuberculosis Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Tuberculosis Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Tuberculosis Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Tuberculosis Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Tuberculosis Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Tuberculosis Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Tuberculosis Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyOtherRespiratoryErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.3.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.3.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.3.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.3.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.3.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Other Respiratory Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Other Respiratory Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Other Respiratory Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Other Respiratory Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Other Respiratory Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Other Respiratory Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Other Respiratory Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Other Respiratory Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Other Respiratory Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Other Respiratory Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyLungDisordersErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.4.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.4.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.4.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.4.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8122.4.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Lung Disorders Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Lung Disorders Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Lung Disorders Doctor's Detail Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Lung Disorders Doctor's details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Lung Disorders Date Of Last Consult Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Lung Disorders Date Of Last Consult Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Lung Disorders Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Lung Disorders Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Lung Disorders Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Lung Disorders Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyHighCholesterolErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.1.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.1.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.1.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.1.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.1.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified High Cholesterol Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display High Cholesterol Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified High Cholesterol Doctor's details Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display High Cholesterol Doctor's Details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified High Cholesterol Date Of Last Consultation Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display High Cholesterol Date Of Last Consultation Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified High Cholesterol Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display High Cholesterol Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified High Cholesterol Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display High Cholesterol Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyLowHighBloodPresureDateValidationErrorMSG() throws InterruptedException {
			WebElement lastconsultBTN=driver.findElement(By.xpath("//p[contains(text(),'Date of last consultation cannot be a future date')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, lastconsultBTN, 20, "Element is Not Display");
			WebElement DiagnosBTN=driver.findElement(By.xpath("//p[contains(text(),'Date of Diagnosis cannot be a future date')]"));
			
            if(lastconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(lastconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Date of last consultation cannot be a future date Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Verified Date of last consultation cannot be a future date Error Message");
            }
            if(DiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Date of Diagnosis cannot be a future date Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Verified Date of Diagnosis cannot be a future date Error Message");
            }
           
			
		}
	    public void VerifyHeartAttackErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.2.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.2.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.2.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.2.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.2.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Heart Attack Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Attack Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Heart Attack Doctor's details Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Attack Doctor's Details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Heart Attack Date Of Last Consultation Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Attack Date Of Last Consultation Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Heart Attack Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Attack Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Heart Attack Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Attack Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyHeartMurmurErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.3.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.3.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.3.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.3.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.3.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Heart Murmur Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Murmur Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Heart Murmur Doctor's details Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Murmur Doctor's Details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Heart Murmur Date Of Last Consultation Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Murmur Date Of Last Consultation Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Heart Murmur Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Murmur Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Heart Murmur Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Murmur Hospitalization Mandatory Error Message");
            }
			
		}
	    public void VerifyHeartDisordersErrorMSG() throws InterruptedException {
			WebElement CurrentBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.4.currentSymptoms')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, CurrentBTN, 20, "Element is Not Display");
			WebElement DoctorBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.4.doctorDetails')]"));
			WebElement DateofconsultBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.4.dateOfConsultation')]"));
			WebElement DateofdiagnosBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.4.dateOfDiagnosis')]"));
			WebElement HospitalizationBTN=driver.findElement(By.xpath("//p[contains(@id,'8121.4.hospitalizationDetails')]"));
            if(CurrentBTN.isDisplayed()) {
            	TestUtil.verifybgColor(CurrentBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Heart Disorders Current Symptoms Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Disorders Current Symptoms Mandatory Error Message");
            }
            if(DoctorBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Heart Disorders Doctor's details Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Disorders Doctor's Details Mandatory Error Message");
            }
            if(DateofconsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofconsultBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Heart Disorders Date Of Last Consultation Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Disorders Date Of Last Consultation Mandatory Error Message");
            }
            if(DateofdiagnosBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateofdiagnosBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Heart Disorders Date Of Diagnosis Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Disorders Date Of Diagnosis Mandatory Error Message");
            }
            if(HospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(HospitalizationBTN, driver);
            	CustomListner.test.log(LogStatus.INFO,  "Successfully Verified Heart Disorders Hospitalization Mandatory Error Message");
            }else {
            	CustomListner.test.log(LogStatus.FAIL,  "Failed To Display Heart Disorders Hospitalization Mandatory Error Message");
            }
			
		}
	    public void ClickonAbsentfromWork(String value) {
			WebElement AbsentBTN=driver.findElement(By.xpath("(//div[text()='"+value+"'])[2]"));
			waitUtils.waitForElementToBeVisibleweb(driver, AbsentBTN, 20, "Element is Not Display");
            if(AbsentBTN.isDisplayed()) {
            	AbsentBTN.click();
            	CustomListner.test.log(LogStatus.INFO, "Click on Absent From Work As=====> "+ value);
            }else {
            	CustomListner.test.log(LogStatus.FAIL, "Absent From Work is  not Display");
            }
			
		}
	    public void EnterAbsentfromWorkCurrentSymptoms(String value) {
	    	WebElement currentsymtomsBTN=driver.findElement(By.xpath("//input[contains(@name,'8087')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, currentsymtomsBTN, 20, "Element is Not Display");
            if(currentsymtomsBTN.isDisplayed()) {
            	currentsymtomsBTN.sendKeys(value);
            	CustomListner.test.log(LogStatus.INFO, "Enter Current Symptoms As=====>"+value);
            }else {
            	CustomListner.test.log(LogStatus.FAIL, "Current Symptoms TextField is  not Display");
            }
			
		}
	    public void EnterAbsentfromWorkDoctorDetails(String value) {
	    	 WebElement DoctorDetailsBTN=driver.findElement(By.xpath("//input[contains(@name,'8088')]"));
	    	 waitUtils.waitForElementToBeVisibleweb(driver, DoctorDetailsBTN, 20, "Element is Not Display");
	            if(DoctorDetailsBTN.isDisplayed()) {
	            	DoctorDetailsBTN.sendKeys(value);
	            	CustomListner.test.log(LogStatus.INFO, "Enter Doctor Details As=====>"+value);
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Doctor Details TextField is  not Display");
	            }
			
		}
	    public void EnterAbsentfromWorkDetailsofHospitalization(String value) {
	    	 WebElement DatailsOfHospitalizationBTN=driver.findElement(By.xpath("//input[contains(@name,'8091')]"));
	    	 waitUtils.waitForElementToBeVisibleweb(driver, DatailsOfHospitalizationBTN, 20, "Element is Not Display");
	            if(DatailsOfHospitalizationBTN.isDisplayed()) {
	            	DatailsOfHospitalizationBTN.sendKeys(value);
	            	CustomListner.test.log(LogStatus.INFO, "Enter Details Of Hospitalizatipon As=====>"+value);
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Details Of Hospitalizatipon TextField is  not Display");
	            }
			
		}
	    public void VerifyAbsentfromWorkErrorMSG() throws InterruptedException {
	    	 WebElement Error1=driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[1]"));
	    	 waitUtils.waitForElementToBeVisibleweb(driver, Error1, 20, "Element is Not Display");
	            if(Error1.isDisplayed()) {
	            	TestUtil.verifybgColor(Error1, driver);
	        		Assert.assertTrue(Error1.isDisplayed(), "Current Symptoms Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Current Symptoms Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Current Symptoms Error MSG is  not Display");
	            }
	            WebElement Error2=driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[2]"));
	            if(Error2.isDisplayed()) {
	            	TestUtil.verifybgColor(Error2, driver);
	        		Assert.assertTrue(Error2.isDisplayed(), "Doctor Detail Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Doctor Detail Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Doctor Detail Error MSG is  not Display");
	            }
	            WebElement Error3=driver.findElement(By.xpath("(//p[contains(text(),'Enter Day')])[1]"));
	            if(Error3.isDisplayed()) {
	            	TestUtil.verifybgColor(Error3, driver);
	        		Assert.assertTrue(Error3.isDisplayed(), "Date Of Last Consultation Day Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Last Consultation Day Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Date Of Last Consultation Day Error MSG is  not Display");
	            } 
	            WebElement Error4=driver.findElement(By.xpath("(//p[contains(text(),'Enter month')])[1]"));
	            if(Error4.isDisplayed()) {
	            	TestUtil.verifybgColor(Error4, driver);
	        		Assert.assertTrue(Error4.isDisplayed(), "Date Of Last Consultation Month Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Last Consultation Month Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Date Of Last Consultation Month Error MSG is  not Display");
	            }   
	            WebElement Error5=driver.findElement(By.xpath("(//p[contains(text(),'Enter year')])[1]"));
	            if(Error5.isDisplayed()) {
	            	TestUtil.verifybgColor(Error5, driver);
	        		Assert.assertTrue(Error5.isDisplayed(), "Date Of Last Consultation Year Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Last Consultation Year Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Date Of Last Consultation Year Error MSG is  not Display");
	            } 
	            WebElement ScrollEle=driver.findElement(By.xpath("//div[contains(text(),'Hospitalization')]"));
	            TestUtil.scrollToElement(driver,ScrollEle);
	        	Thread.sleep(2000);
	            WebElement Error6=driver.findElement(By.xpath("(//p[contains(text(),'Enter Day')])[2]"));
	            if(Error6.isDisplayed()) {
	            	TestUtil.verifybgColor(Error6, driver);
	        		Assert.assertTrue(Error6.isDisplayed(), "Date Of Diagnosis Day Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Diagnosis Day Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Date Of Diagnosis Day Error MSG is  not Display");
	            } 
	            WebElement Error7=driver.findElement(By.xpath("(//p[contains(text(),'Enter month')])[2]"));
	            if(Error7.isDisplayed()) {
	            	TestUtil.verifybgColor(Error7, driver);
	        		Assert.assertTrue(Error7.isDisplayed(), "Date Of Diagnosis Month Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Diagnosis Month Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Date Of Diagnosis Month Error MSG is  not Display");
	            }   
	            WebElement Error8=driver.findElement(By.xpath("(//p[contains(text(),'Enter year')])[2]"));
	            if(Error8.isDisplayed()) {
	            	TestUtil.verifybgColor(Error8, driver);
	        		Assert.assertTrue(Error8.isDisplayed(), "Date Of Diagnosis Year Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Diagnosis Year Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Date Of Diagnosis Year Error MSG is  not Display");
	            }
	            WebElement Error9=driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[3]"));
	            if(Error9.isDisplayed()) {
	            	TestUtil.verifybgColor(Error9, driver);
	        		Assert.assertTrue(Error9.isDisplayed(), "Details of Hospitalization Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Details of Hospitalization Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Details of Hospitalization Error MSG is  not Display");
	            }   
	            
	            
			
		}
	    public void VerifyHospitalizeErrorMSG() throws InterruptedException {
	    	 WebElement ScrollEle1=driver.findElement(By.xpath("//label[contains(text(),'Date of Last Consultation')]"));
	    	 waitUtils.waitForElementToBeVisibleweb(driver, ScrollEle1, 20, "Element is Not Display"); 
	    	 TestUtil.scrollToElement(driver,ScrollEle1);
	        	Thread.sleep(2000);
	    	 WebElement Error1=driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[1]"));
	            if(Error1.isDisplayed()) {
	            	TestUtil.verifybgColor(Error1, driver);
	        		Assert.assertTrue(Error1.isDisplayed(), "Current Symptoms Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Current Symptoms Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Current Symptoms Error MSG is  not Display");
	            }
	            WebElement Error2=driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[2]"));
	            if(Error2.isDisplayed()) {
	            	TestUtil.verifybgColor(Error2, driver);
	        		Assert.assertTrue(Error2.isDisplayed(), "Doctor Detail Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Doctor Detail Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Doctor Detail Error MSG is  not Display");
	            }
	            WebElement Error9=driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[3]"));
	            if(Error9.isDisplayed()) {
	            	TestUtil.verifybgColor(Error9, driver);
	        		Assert.assertTrue(Error9.isDisplayed(), "Details of Hospitalization Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Details of Hospitalization Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Details of Hospitalization Error MSG is  not Display");
	            } 
	            WebElement ScrollEle=driver.findElement(By.xpath("//div[contains(text(),'Ailments')]"));
	            TestUtil.scrollToElement(driver,ScrollEle);
	        	Thread.sleep(2000);
	            WebElement Error3=driver.findElement(By.xpath("(//p[contains(text(),'Enter Day')])[1]"));
	            if(Error3.isDisplayed()) {
	            	TestUtil.verifybgColor(Error3, driver);
	        		Assert.assertTrue(Error3.isDisplayed(), "Date Of Last Consultation Day Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Last Consultation Day Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Date Of Last Consultation Day Error MSG is  not Display");
	            } 
	            WebElement Error4=driver.findElement(By.xpath("(//p[contains(text(),'Enter month')])[1]"));
	            if(Error4.isDisplayed()) {
	            	TestUtil.verifybgColor(Error4, driver);
	        		Assert.assertTrue(Error4.isDisplayed(), "Date Of Last Consultation Month Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Last Consultation Month Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Date Of Last Consultation Month Error MSG is  not Display");
	            }   
	            WebElement Error5=driver.findElement(By.xpath("(//p[contains(text(),'Enter year')])[1]"));
	            if(Error5.isDisplayed()) {
	            	TestUtil.verifybgColor(Error5, driver);
	        		Assert.assertTrue(Error5.isDisplayed(), "Date Of Last Consultation Year Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Last Consultation Year Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Date Of Last Consultation Year Error MSG is  not Display");
	            } 
	            
	            WebElement Error6=driver.findElement(By.xpath("(//p[contains(text(),'Enter Day')])[2]"));
	            if(Error6.isDisplayed()) {
	            	TestUtil.verifybgColor(Error6, driver);
	        		Assert.assertTrue(Error6.isDisplayed(), "Date Of Diagnosis Day Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Diagnosis Day Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Date Of Diagnosis Day Error MSG is  not Display");
	            } 
	            WebElement Error7=driver.findElement(By.xpath("(//p[contains(text(),'Enter month')])[2]"));
	            if(Error7.isDisplayed()) {
	            	TestUtil.verifybgColor(Error7, driver);
	        		Assert.assertTrue(Error7.isDisplayed(), "Date Of Diagnosis Month Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Diagnosis Month Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Date Of Diagnosis Month Error MSG is  not Display");
	            }   
	            WebElement Error8=driver.findElement(By.xpath("(//p[contains(text(),'Enter year')])[2]"));
	            if(Error8.isDisplayed()) {
	            	TestUtil.verifybgColor(Error8, driver);
	        		Assert.assertTrue(Error8.isDisplayed(), "Date Of Diagnosis Year Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Diagnosis Year Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Date Of Diagnosis Year Error MSG is  not Display");
	            }
	           
	            
	            
			
		}
	    public void VerifyDisorderErrorMSG() throws InterruptedException {
	    	 WebElement ScrollEle1=driver.findElement(By.xpath("//label[contains(text(),'Date of Diagnosis')]"));
	    	 waitUtils.waitForElementToBeVisibleweb(driver, ScrollEle1, 20, "Element is Not Display");    
	    	 TestUtil.scrollToElement(driver,ScrollEle1);
	        	Thread.sleep(2000);
	    	 WebElement Error1=driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[1]"));
	            if(Error1.isDisplayed()) {
	            	TestUtil.verifybgColor(Error1, driver);
	        		Assert.assertTrue(Error1.isDisplayed(), "Current Symptoms Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Current Symptoms Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.INFO, "Current Symptoms Error MSG is  not Display");
	            }
	            WebElement Error2=driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[2]"));
	            if(Error2.isDisplayed()) {
	            	TestUtil.verifybgColor(Error2, driver);
	        		Assert.assertTrue(Error2.isDisplayed(), "Doctor Detail Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Doctor Detail Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.INFO, "Doctor Detail Error MSG is  not Display");
	            }
	           
	        
	            WebElement Error3=driver.findElement(By.xpath("(//p[contains(text(),'Enter Day')])[1]"));
	            if(Error3.isDisplayed()) {
	            	TestUtil.verifybgColor(Error3, driver);
	        		Assert.assertTrue(Error3.isDisplayed(), "Date Of Last Consultation Day Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Last Consultation Day Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.INFO, "Date Of Last Consultation Day Error MSG is  not Display");
	            } 
	            WebElement Error4=driver.findElement(By.xpath("(//p[contains(text(),'Enter month')])[1]"));
	            if(Error4.isDisplayed()) {
	            	TestUtil.verifybgColor(Error4, driver);
	        		Assert.assertTrue(Error4.isDisplayed(), "Date Of Last Consultation Month Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Last Consultation Month Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.INFO, "Date Of Last Consultation Month Error MSG is  not Display");
	            }   
	            WebElement Error5=driver.findElement(By.xpath("(//p[contains(text(),'Enter year')])[1]"));
	            if(Error5.isDisplayed()) {
	            	TestUtil.verifybgColor(Error5, driver);
	        		Assert.assertTrue(Error5.isDisplayed(), "Date Of Last Consultation Year Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Last Consultation Year Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.INFO, "Date Of Last Consultation Year Error MSG is  not Display");
	            } 
	            
	            WebElement ScrollEle=driver.findElement(By.xpath("//div[contains(text(),'Spouse Health')]"));
	            TestUtil.scrollToElement(driver,ScrollEle);
	        	Thread.sleep(2000);
//	            WebElement Error6=driver.findElement(By.xpath("(//p[contains(text(),'Enter Day')])[2]"));
//	            if(Error6.isDisplayed()) {
//	            	TestUtil.verifybgColor(Error6, driver);
//	        		Assert.assertTrue(Error6.isDisplayed(), "Date Of Diagnosis Day Error MSG is not present");
//	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Diagnosis Day Error MSG");
//	            }else {
//	            	CustomListner.test.log(LogStatus.INFO, "Date Of Diagnosis Day Error MSG is  not Display");
//	            } 
	            WebElement Error7=driver.findElement(By.xpath("(//p[contains(text(),'Enter month')])[2]"));
	            if(Error7.isDisplayed()) {
	            	TestUtil.verifybgColor(Error7, driver);
	        		Assert.assertTrue(Error7.isDisplayed(), "Date Of Diagnosis Month Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Diagnosis Month Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.INFO, "Date Of Diagnosis Month Error MSG is  not Display");
	            }   
	            WebElement Error8=driver.findElement(By.xpath("(//p[contains(text(),'Enter year')])[2]"));
	            if(Error8.isDisplayed()) {
	            	TestUtil.verifybgColor(Error8, driver);
	        		Assert.assertTrue(Error8.isDisplayed(), "Date Of Diagnosis Year Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Diagnosis Year Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.INFO, "Date Of Diagnosis Year Error MSG is  not Display");
	            }
	           
	            WebElement Error9=driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[3]"));
	            if(Error9.isDisplayed()) {
	            	TestUtil.verifybgColor(Error9, driver);
	        		Assert.assertTrue(Error9.isDisplayed(), "Details of Hospitalization Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Details of Hospitalization Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.INFO, "Details of Hospitalization Error MSG is  not Display");
	            } 
	            
			
		}
	    public void VerifySpouseHealthErrorMSG() throws InterruptedException {
	    	 WebElement ScrollEle1=driver.findElement(By.xpath("//label[contains(text(),'Date of Diagnosis')]"));
	    	 waitUtils.waitForElementToBeVisibleweb(driver, ScrollEle1, 20, "Element is Not Display");  
	    	 TestUtil.scrollToElement(driver,ScrollEle1);
	        	Thread.sleep(2000);
	    	 WebElement Error1=driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[1]"));
	            if(Error1.isDisplayed()) {
	            	TestUtil.verifybgColor(Error1, driver);
	        		Assert.assertTrue(Error1.isDisplayed(), "Current Symptoms Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Current Symptoms Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Current Symptoms Error MSG is  not Display");
	            }
	            WebElement Error2=driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[2]"));
	            if(Error2.isDisplayed()) {
	            	TestUtil.verifybgColor(Error2, driver);
	        		Assert.assertTrue(Error2.isDisplayed(), "Doctor Detail Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Doctor Detail Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Doctor Detail Error MSG is  not Display");
	            }
	           
	            WebElement ScrollEle=driver.findElement(By.xpath("//div[contains(text(),'Other symptoms')]"));
	            TestUtil.scrollToElement(driver,ScrollEle);
	        	Thread.sleep(2000);
	            WebElement Error3=driver.findElement(By.xpath("(//p[contains(text(),'Enter Day')])[1]"));
	            if(Error3.isDisplayed()) {
	            	TestUtil.verifybgColor(Error3, driver);
	        		Assert.assertTrue(Error3.isDisplayed(), "Date Of Last Consultation Day Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Last Consultation Day Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Date Of Last Consultation Day Error MSG is  not Display");
	            } 
//	            WebElement Error4=driver.findElement(By.xpath("(//p[contains(text(),'Enter month')])[1]"));
//	            if(Error4.isDisplayed()) {
//	            	TestUtil.verifybgColor(Error4, driver);
//	        		Assert.assertTrue(Error4.isDisplayed(), "Date Of Last Consultation Month Error MSG is not present");
//	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Last Consultation Month Error MSG");
//	            }else {
//	            	CustomListner.test.log(LogStatus.INFO, "Date Of Last Consultation Month Error MSG is  not Display");
//	            }   
	            WebElement Error5=driver.findElement(By.xpath("(//p[contains(text(),'Enter year')])[1]"));
	            if(Error5.isDisplayed()) {
	            	TestUtil.verifybgColor(Error5, driver);
	        		Assert.assertTrue(Error5.isDisplayed(), "Date Of Last Consultation Year Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Last Consultation Year Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Date Of Last Consultation Year Error MSG is  not Display");
	            } 
	            
	            WebElement Error6=driver.findElement(By.xpath("(//p[contains(text(),'Enter Day')])[2]"));
	            if(Error6.isDisplayed()) {
	            	TestUtil.verifybgColor(Error6, driver);
	        		Assert.assertTrue(Error6.isDisplayed(), "Date Of Diagnosis Day Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Diagnosis Day Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Date Of Diagnosis Day Error MSG is  not Display");
	            } 
	            WebElement Error7=driver.findElement(By.xpath("//p[contains(text(),'Enter month')]"));
	            if(Error7.isDisplayed()) {
	            	TestUtil.verifybgColor(Error7, driver);
	        		Assert.assertTrue(Error7.isDisplayed(), "Date Of Diagnosis Month Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Diagnosis Month Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Date Of Diagnosis Month Error MSG is  not Display");
	            }   
	            WebElement Error8=driver.findElement(By.xpath("(//p[contains(text(),'Enter year')])[2]"));
	            if(Error8.isDisplayed()) {
	            	TestUtil.verifybgColor(Error8, driver);
	        		Assert.assertTrue(Error8.isDisplayed(), "Date Of Diagnosis Year Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Diagnosis Year Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Date Of Diagnosis Year Error MSG is  not Display");
	            }
	           
	            WebElement Error9=driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[3]"));
	            if(Error9.isDisplayed()) {
	            	TestUtil.verifybgColor(Error9, driver);
	        		Assert.assertTrue(Error9.isDisplayed(), "Details of Hospitalization Error MSG is not present");
	            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Details of Hospitalization Error MSG");
	            }else {
	            	CustomListner.test.log(LogStatus.FAIL, "Details of Hospitalization Error MSG is  not Display");
	            } 
	            
			
		}

		public void VerifyOtherSymptomsErrorMSG() throws InterruptedException {
			WebElement ScrollEle1 = driver.findElement(By.xpath("//input[contains(@name,'8107')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, ScrollEle1, 20, "Element is Not Display");
			TestUtil.scrollToElement(driver, ScrollEle1);
			Thread.sleep(2000);
			WebElement Error1 = driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[1]"));
			if (Error1.isDisplayed()) {
				TestUtil.verifybgColor(Error1, driver);
				Assert.assertTrue(Error1.isDisplayed(), "Current Symptoms Error MSG is not present");
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Current Symptoms Error MSG");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "Current Symptoms Error MSG is  not Display");
			}
			WebElement Error2 = driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[2]"));
			if (Error2.isDisplayed()) {
				TestUtil.verifybgColor(Error2, driver);
				Assert.assertTrue(Error2.isDisplayed(), "Doctor Detail Error MSG is not present");
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Doctor Detail Error MSG");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "Doctor Detail Error MSG is  not Display");
			}

			WebElement textEle1 = driver.findElement(By.xpath("//div[contains(text(),'For Females lives only')]"));
			TestUtil.scrollToElement(driver, textEle1);
			Thread.sleep(2000);
			WebElement Error3 = driver.findElement(By.xpath("(//p[contains(text(),'Enter Day')])[1]"));
			if (Error3.isDisplayed()) {
				TestUtil.verifybgColor(Error3, driver);
				Assert.assertTrue(Error3.isDisplayed(), "Date Of Last Consultation Day Error MSG is not present");
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Last Consultation Day Error MSG");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "Date Of Last Consultation Day Error MSG is  not Display");
			}
			WebElement Error4 = driver.findElement(By.xpath("(//p[contains(text(),'Enter month')])[1]"));
			if (Error4.isDisplayed()) {
				TestUtil.verifybgColor(Error4, driver);
				Assert.assertTrue(Error4.isDisplayed(), "Date Of Last Consultation Month Error MSG is not present");
				CustomListner.test.log(LogStatus.INFO,
						"Successfully Display Date Of Last Consultation Month Error MSG");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "Date Of Last Consultation Month Error MSG is  not Display");
			}
			WebElement Error5 = driver.findElement(By.xpath("(//p[contains(text(),'Enter year')])[1]"));
			if (Error5.isDisplayed()) {
				TestUtil.verifybgColor(Error5, driver);
				Assert.assertTrue(Error5.isDisplayed(), "Date Of Last Consultation Year Error MSG is not present");
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Last Consultation Year Error MSG");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "Date Of Last Consultation Year Error MSG is  not Display");
			}

			WebElement Error6 = driver.findElement(By.xpath("(//p[contains(text(),'Enter Day')])[2]"));
			if (Error6.isDisplayed()) {
				TestUtil.verifybgColor(Error6, driver);
				Assert.assertTrue(Error6.isDisplayed(), "Date Of Diagnosis Day Error MSG is not present");
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Diagnosis Day Error MSG");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "Date Of Diagnosis Day Error MSG is  not Display");
			}
			WebElement Error7 = driver.findElement(By.xpath("(//p[contains(text(),'Enter month')])[2]"));
			if (Error7.isDisplayed()) {
				TestUtil.verifybgColor(Error7, driver);
				Assert.assertTrue(Error7.isDisplayed(), "Date Of Diagnosis Month Error MSG is not present");
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Diagnosis Month Error MSG");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "Date Of Diagnosis Month Error MSG is  not Display");
			}
			WebElement Error8 = driver.findElement(By.xpath("(//p[contains(text(),'Enter year')])[2]"));
			if (Error8.isDisplayed()) {
				TestUtil.verifybgColor(Error8, driver);
				Assert.assertTrue(Error8.isDisplayed(), "Date Of Diagnosis Year Error MSG is not present");
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Diagnosis Year Error MSG");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "Date Of Diagnosis Year Error MSG is  not Display");
			}

			WebElement Error9 = driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[3]"));
			if (Error9.isDisplayed()) {
				TestUtil.verifybgColor(Error9, driver);
				Assert.assertTrue(Error9.isDisplayed(), "Details of Hospitalization Error MSG is not present");
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Details of Hospitalization Error MSG");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "Details of Hospitalization Error MSG is  not Display");
			}

		}
		public void VerifyForFemaleLivesonlyErrorMSG() throws InterruptedException {
			WebElement ScrollEle1 = driver.findElement(By.xpath("//input[contains(@name,'8133')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, ScrollEle1, 20, "Element is Not Display");
			TestUtil.scrollToElement(driver, ScrollEle1);
			Thread.sleep(2000);
			WebElement Error1 = driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[1]"));
			if (Error1.isDisplayed()) {
				TestUtil.verifybgColor(Error1, driver);
				CustomListner.test.log(LogStatus.INFO, "Successfully Display No. of Weeks Error MSG");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "No. of Weeks Error MSG is  not Display");
			}
			WebElement Error2 = driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[2]"));
			if (Error2.isDisplayed()) {
				TestUtil.verifybgColor(Error2, driver);
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Doctor Detail Error MSG");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "Doctor Detail Error MSG is  not Display");
			}
			TestUtil.scrollTillEndOfPage(driver);
			Thread.sleep(2000);
			
			WebElement Error3 = driver.findElement(By.xpath("(//p[contains(text(),'Enter Day')])[1]"));
			if (Error3.isDisplayed()) {
				TestUtil.verifybgColor(Error3, driver);
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Last Consultation Day Error MSG");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "Date Of Last Consultation Day Error MSG is  not Display");
			}
			WebElement Error4 = driver.findElement(By.xpath("(//p[contains(text(),'Enter month')])[1]"));
			if (Error4.isDisplayed()) {
				TestUtil.verifybgColor(Error4, driver);
				CustomListner.test.log(LogStatus.INFO,"Successfully Display Date Of Last Consultation Month Error MSG");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "Date Of Last Consultation Month Error MSG is  not Display");
			}
			WebElement Error5 = driver.findElement(By.xpath("(//p[contains(text(),'Enter year')])[1]"));
			if (Error5.isDisplayed()) {
				TestUtil.verifybgColor(Error5, driver);
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Last Consultation Year Error MSG");
			} else {
				CustomListner.test.log(LogStatus.INFO, "Date Of Last Consultation Year Error MSG is  not Display");
			}

			WebElement Error6 = driver.findElement(By.xpath("(//p[contains(text(),'Enter Day')])[2]"));
			if (Error6.isDisplayed()) {
				TestUtil.verifybgColor(Error6, driver);
				Assert.assertTrue(Error6.isDisplayed(), "Date Of Diagnosis Day Error MSG is not present");
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Diagnosis Day Error MSG");
			} else {
				CustomListner.test.log(LogStatus.INFO, "Date Of Diagnosis Day Error MSG is  not Display");
			}
			WebElement Error7 = driver.findElement(By.xpath("(//p[contains(text(),'Enter month')])[2]"));
			if (Error7.isDisplayed()) {
				TestUtil.verifybgColor(Error7, driver);
				Assert.assertTrue(Error7.isDisplayed(), "Date Of Diagnosis Month Error MSG is not present");
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Diagnosis Month Error MSG");
			} else {
				CustomListner.test.log(LogStatus.INFO, "Date Of Diagnosis Month Error MSG is  not Display");
			}
			WebElement Error8 = driver.findElement(By.xpath("(//p[contains(text(),'Enter year')])[2]"));
			if (Error8.isDisplayed()) {
				TestUtil.verifybgColor(Error8, driver);
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Diagnosis Year Error MSG");
			} else {
				CustomListner.test.log(LogStatus.INFO, "Date Of Diagnosis Year Error MSG is  not Display");
			}

			WebElement Error9 = driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[3]"));
			if (Error9.isDisplayed()) {
				TestUtil.verifybgColor(Error9, driver);
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Details of Hospitalization Error MSG");
			} else {
				CustomListner.test.log(LogStatus.INFO, "Details of Hospitalization Error MSG is  not Display");
			}

		}
		public void VerifyHaveYouSufferdFromErrorMSG() throws InterruptedException {
			WebElement ScrollEle1 = driver.findElement(By.xpath("//input[contains(@name,'8139')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, ScrollEle1, 20, "Element is Not Display");
			TestUtil.scrollToElement(driver, ScrollEle1);
			Thread.sleep(2000);
			WebElement Error1 = driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[1]"));
			if (Error1.isDisplayed()) {
				TestUtil.verifybgColor(Error1, driver);
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Current Sympltoms Error MSG");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "Current Sympltoms Error MSG is  not Display");
			}
			WebElement Error2 = driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[2]"));
			if (Error2.isDisplayed()) {
				TestUtil.verifybgColor(Error2, driver);
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Doctor Detail Error MSG");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "Doctor Detail Error MSG is  not Display");
			}
			TestUtil.scrollTillEndOfPage(driver);
			Thread.sleep(2000);
			
			WebElement Error3 = driver.findElement(By.xpath("(//p[contains(text(),'Enter Day')])[1]"));
			if (Error3.isDisplayed()) {
				TestUtil.verifybgColor(Error3, driver);
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Last Consultation Day Error MSG");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "Date Of Last Consultation Day Error MSG is  not Display");
			}
			WebElement Error4 = driver.findElement(By.xpath("(//p[contains(text(),'Enter month')])[1]"));
			if (Error4.isDisplayed()) {
				TestUtil.verifybgColor(Error4, driver);
				CustomListner.test.log(LogStatus.INFO,"Successfully Display Date Of Last Consultation Month Error MSG");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "Date Of Last Consultation Month Error MSG is  not Display");
			}
			WebElement Error5 = driver.findElement(By.xpath("(//p[contains(text(),'Enter year')])[1]"));
			if (Error5.isDisplayed()) {
				TestUtil.verifybgColor(Error5, driver);
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Last Consultation Year Error MSG");
			} else {
				CustomListner.test.log(LogStatus.INFO, "Date Of Last Consultation Year Error MSG is  not Display");
			}

			WebElement Error6 = driver.findElement(By.xpath("(//p[contains(text(),'Enter Day')])[2]"));
			if (Error6.isDisplayed()) {
				TestUtil.verifybgColor(Error6, driver);
				Assert.assertTrue(Error6.isDisplayed(), "Date Of Diagnosis Day Error MSG is not present");
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Diagnosis Day Error MSG");
			} else {
				CustomListner.test.log(LogStatus.INFO, "Date Of Diagnosis Day Error MSG is  not Display");
			}
			WebElement Error7 = driver.findElement(By.xpath("(//p[contains(text(),'Enter month')])[2]"));
			if (Error7.isDisplayed()) {
				TestUtil.verifybgColor(Error7, driver);
				Assert.assertTrue(Error7.isDisplayed(), "Date Of Diagnosis Month Error MSG is not present");
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Diagnosis Month Error MSG");
			} else {
				CustomListner.test.log(LogStatus.INFO, "Date Of Diagnosis Month Error MSG is  not Display");
			}
			WebElement Error8 = driver.findElement(By.xpath("(//p[contains(text(),'Enter year')])[2]"));
			if (Error8.isDisplayed()) {
				TestUtil.verifybgColor(Error8, driver);
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Date Of Diagnosis Year Error MSG");
			} else {
				CustomListner.test.log(LogStatus.INFO, "Date Of Diagnosis Year Error MSG is  not Display");
			}

			WebElement Error9 = driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[3]"));
			if (Error9.isDisplayed()) {
				TestUtil.verifybgColor(Error9, driver);
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Details of Hospitalization Error MSG");
			} else {
				CustomListner.test.log(LogStatus.INFO, "Details of Hospitalization Error MSG is  not Display");
			}

		}
	    public void EnterAbsentfromWorkDateOfLastConsult(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@name,'day8089')]"));
	    	 waitUtils.waitForElementToBeVisibleweb(driver, eleDOBDayInput, 20, "Element is Not Display");
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Last Consult Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@name,'month8089')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Last Consult month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@name,'year8089')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Last Consult year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.ENTER);
			
		}
	    public void EnterAbsentfromWorkDateOfDiagnosis(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@id,'day8090')]"));
	    	 waitUtils.waitForElementToBeVisibleweb(driver, eleDOBDayInput, 20, "Element is Not Display");
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Diagnosis Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@id,'month8090')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Diagnosis month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@id,'year8090')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Diagnosis year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.ENTER);
			
		}
	    public void VerifyAbsentfromWork() throws InterruptedException {
			WebElement currentsymtomsBTN=driver.findElement(By.xpath("//input[contains(@name,'8087')]"));
			waitUtils.waitForElementToBeVisibleweb(driver, currentsymtomsBTN, 20, "Element is Not Display");
            if(currentsymtomsBTN.isDisplayed()) {
            	TestUtil.verifybgColor(currentsymtomsBTN, driver);
        		Assert.assertTrue(currentsymtomsBTN.isDisplayed(), "Current Symptoms TextField is not present");
            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Current Symptoms TextField");
            }else {
            	CustomListner.test.log(LogStatus.FAIL, "Current Symptoms TextField is  not Display");
            }
            WebElement DoctorDetailsBTN=driver.findElement(By.xpath("//input[contains(@name,'8088')]"));
            if(DoctorDetailsBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DoctorDetailsBTN, driver);
        		Assert.assertTrue(DoctorDetailsBTN.isDisplayed(), "Doctor Details TextField is not present");
            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Doctor Details TextField");
            }else {
            	CustomListner.test.log(LogStatus.FAIL, "Doctor Details TextField is  not Display");
            }
            WebElement DateOfLastConsultBTN=driver.findElement(By.xpath("//label[contains(text(),'Date of Last Consultation')]"));
            if(DateOfLastConsultBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateOfLastConsultBTN, driver);
        		Assert.assertTrue(DateOfLastConsultBTN.isDisplayed(), "Date of Last Consultation Text is not present");
            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date of Last Consultation Text");
            }else {
            	CustomListner.test.log(LogStatus.FAIL, "Date of Last Consultation text is  not Display");
            }
            WebElement ScrollEle=driver.findElement(By.xpath("//div[contains(text(),'Hospitalization')]"));
            TestUtil.scrollToElement(driver,ScrollEle);
        	Thread.sleep(2000);
            WebElement DateOfLastDiagnosisBTN=driver.findElement(By.xpath("//label[contains(text(),'Date of Diagnosis')]"));
            if(DateOfLastDiagnosisBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DateOfLastDiagnosisBTN, driver);
        		Assert.assertTrue(DateOfLastDiagnosisBTN.isDisplayed(), "Date of Diagnosis Text is not present");
            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Date of Diagnosis Text");
            }else {
            	CustomListner.test.log(LogStatus.FAIL, "Date of Diagnosis text is  not Display");
            }
            WebElement DatailsOfHospitalizationBTN=driver.findElement(By.xpath("//input[contains(@name,'8091')]"));
            if(DatailsOfHospitalizationBTN.isDisplayed()) {
            	TestUtil.verifybgColor(DatailsOfHospitalizationBTN, driver);
        		Assert.assertTrue(DatailsOfHospitalizationBTN.isDisplayed(), "Details Of Hospitalization TextField is not present");
            	CustomListner.test.log(LogStatus.INFO, "Successfully Display Details Of Hospitalization TextField");
            }else {
            	CustomListner.test.log(LogStatus.FAIL, "Details Of Hospitalization TextField is  not Display");
            }
			
		}

	    
	    public void ClickonHeightFeetUpArrow() {
			WebElement usearrowBtn=driver.findElement(By.xpath("//img[@src='https://leapdev.adityabirlasunlifeinsurance.com/qa/static/media/up-arrow-grey.ec1ad6a6.svg']"));
			waitUtils.waitForElementToBeVisibleweb(driver, usearrowBtn, 20, "Element is Not Display");
			if(usearrowBtn.isDisplayed()) {
            	usearrowBtn.click();
            	CustomListner.test.log(LogStatus.INFO, "Click on Height Feet Up Arrow Button");
            }else {
            	CustomListner.test.log(LogStatus.INFO, "Height Feet Up Arrow Button is not Display");
            }
			
		}
	    
	    public void GetTextHeightfeetIntergerValue() {
			WebElement gettext=driver.findElement(By.xpath("//div[@id='height-feet']"));
			waitUtils.waitForElementToBeVisibleweb(driver, gettext, 20, "Element is Not Display");
            if(gettext.isDisplayed()) {
            String Value=	gettext.getText();
            if(Value.contains("06")) {
            	CustomListner.test.log(LogStatus.INFO, "Value of Height feet is Whole Number");
            }else {
            	CustomListner.test.log(LogStatus.INFO, "Value of Height feet is Not  Whole Number");
            } 	
            }
            else {
            	CustomListner.test.log(LogStatus.INFO, "Value of Height feet is Not Display");
            }
			
		}
	    public void ClickonHeightInchUpArrow() {
			WebElement usearrowBtn=driver.findElement(By.xpath("//img[@src='https://leapdev.adityabirlasunlifeinsurance.com/qa/static/media/up-arrow-white.05c846ac.svg']"));
			waitUtils.waitForElementToBeVisibleweb(driver, usearrowBtn, 20, "Element is Not Display");
			if(usearrowBtn.isDisplayed()) {
            	usearrowBtn.click();
            	CustomListner.test.log(LogStatus.INFO, "Click on Height Inches UP Arrow Button");
            }else {
            	CustomListner.test.log(LogStatus.INFO, "Height Inches UP Arrow Button is not Display");
            }
			
		}
	    
	    public void GetTextHeightInchIntergerValue() {
			WebElement gettext=driver.findElement(By.xpath("//div[@id='height-inches']"));
			waitUtils.waitForElementToBeVisibleweb(driver, gettext, 20, "Element is Not Display");
            if(gettext.isDisplayed()) {
            String Value=	gettext.getText();
            if(Value.contains("07")) {
            	CustomListner.test.log(LogStatus.INFO, "Value of Height Inches is Whole Number");
            }else {
            	CustomListner.test.log(LogStatus.INFO, "Value of Height Inches is Not  Whole Number");
            } 	
            }
            else {
            	CustomListner.test.log(LogStatus.INFO, "Value of Height feet is Not Display");
            }
			
		}
	    public void EnterWeight(String weight) {
	        WebElement WeightEle=driver.findElement(By.xpath("//input[@placeholder='Enter Weight']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, WeightEle, 20, "Element is Not Display");
	        if(WeightEle.isDisplayed()) {
	        	WeightEle.sendKeys(weight);
	            CustomListner.test.log(LogStatus.INFO, "Enter Weight As=====> "+weight);
	        }else {
	        	CustomListner.test.log(LogStatus.INFO, "Weight is not display ");
	        }
	    }
	    public void selectWaightChange(String val) {
	        WebElement changewaightEle=driver.findElement(By.xpath("//div[text()='"+val+"']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, changewaightEle, 20, "Element is Not Display");
	        if(changewaightEle.isDisplayed()) {
	        	changewaightEle.click();
	            CustomListner.test.log(LogStatus.INFO, "Click Waight change button As=====> "+val);
	        }else {
	        	CustomListner.test.log(LogStatus.INFO, "Weight change button is not display ");
	        }
	    }
	    public void EnterReasonForChangewaight(String changewaight) {
	        WebElement changewaightEle=driver.findElement(By.xpath("//input[@placeholder='Enter No. of Kgs (gained/lost)']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, changewaightEle, 20, "Element is Not Display");
	        if(changewaightEle.isDisplayed()) {
	        	changewaightEle.sendKeys(changewaight);
	            CustomListner.test.log(LogStatus.INFO, "Enter No. of Waight change TextField As=====> "+changewaight);
	        }else {
	        	CustomListner.test.log(LogStatus.INFO, "No. of Weight change TextField is not display ");
	        }
	    }
	    public void ClearWeight() {
	        WebElement WeightEle=driver.findElement(By.xpath("//input[@placeholder='Enter Weight']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, WeightEle, 20, "Element is Not Display");
	        if(WeightEle.isDisplayed()) {
	        	//WeightEle.clear();
	        	WeightEle.click();

	             for (int i = 0; i < 3; i++) {
	            	 WeightEle.sendKeys(Keys.BACK_SPACE);
	            	 WeightEle.sendKeys(" ");
	            	 WeightEle.sendKeys(Keys.DELETE);


	             }
	        }else {
	        	CustomListner.test.log(LogStatus.INFO, "Weight is not display ");
	        }
	    }
	    public void ClickSaveContinueBtn() {
	        WebElement saveContinueEle=driver.findElement(By.xpath("//span[text()='SAVE & CONTINUE']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, saveContinueEle, 20, "Element is Not Display");
	        if(saveContinueEle.isDisplayed()) {
	        	saveContinueEle.click();
	            CustomListner.test.log(LogStatus.INFO, "Click on Save & Continue Button");
	        }else {
	        	CustomListner.test.log(LogStatus.INFO, "Save & Continue Button is not display ");
	        }
	    }
	    public void ClicLifeStyleSaveContinueBtn() {
	        WebElement saveContinueEle=driver.findElement(By.xpath("//span[text()='Save & Continue']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, saveContinueEle, 20, "Element is Not Display");
	        if(saveContinueEle.isDisplayed()) {
	        	saveContinueEle.click();
	            CustomListner.test.log(LogStatus.INFO, "Click on Save & Continue Button");
	        }else {
	        	CustomListner.test.log(LogStatus.INFO, "Save & Continue Button is not display ");
	        }
	    }
	    public void ClicMedicalHistorySaveContinueBtn() {
	        WebElement saveContinueEle=driver.findElement(By.xpath("//span[text()='Save & Continue']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, saveContinueEle, 20, "Element is Not Display");
	        if(saveContinueEle.isDisplayed()) {
	        	saveContinueEle.click();
	            CustomListner.test.log(LogStatus.INFO, "Click on Save & Continue Button");
	        }else {
	        	CustomListner.test.log(LogStatus.FAIL, "Save & Continue Button is not display ");
	        }
	    }
	    public void ClearDateofLastConsult() {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@name,'day8141')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.clear();
	         CustomListner.test.log(LogStatus.INFO, "Clear Date Of Last Consult Day");
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@name,'month8141')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.clear();
	         CustomListner.test.log(LogStatus.INFO, "Clear Date Of Last Consult month");
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@name,'year8141')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.clear();
	         CustomListner.test.log(LogStatus.INFO, "Date Of Last Consult year");
	         eleDOBYearInput.sendKeys(Keys.ENTER);
	    }
	    public void DateValidationAlertPopUpDateofDiagnos() throws InterruptedException {
	        WebElement AlertTextEle=driver.findElement(By.xpath("//p[contains(text(),'Date of Diagnosis cannot be a Future date in the Last Tab')]"));
	        waitUtils.waitForElementToBeVisibleweb(driver, AlertTextEle, 20, "Element is Not Display");
	        if(AlertTextEle.isDisplayed()) {
	        	TestUtil.verifybgColor(AlertTextEle, driver);
	            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Date of Diagnosis cannot be a Future date in the Last Tab Alert MSG");
	        }else {
	        	CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Date of Diagnosis cannot be a Future date in the Last Tab Alert MSG");
	        }
	    }
	    public void DateValidationAlertPopUpDateofLastConsult() throws InterruptedException {
	        WebElement AlertTextEle=driver.findElement(By.xpath("//p[contains(text(),'Date of Last Consultation cannot be a Future date in the Last Tab')]"));
	        waitUtils.waitForElementToBeVisibleweb(driver, AlertTextEle, 20, "Element is Not Display");
	        if(AlertTextEle.isDisplayed()) {
	        	TestUtil.verifybgColor(AlertTextEle, driver);
	            CustomListner.test.log(LogStatus.INFO, "Successfully Verified Date of Last Consultation cannot be a Future date in the Last Tab Alert MSG");
	        }else {
	        	CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Date of Last Consultation cannot be a Future date in the Last Tab Alert MSG");
	        }
	    }
	    public void DateValidationAlertPopUpOKBTN() throws InterruptedException {
	        WebElement AlertTextEle=driver.findElement(By.xpath("//span[contains(text(),'OK')]"));
	        waitUtils.waitForElementToBeVisibleweb(driver, AlertTextEle, 20, "Element is Not Display");
	        if(AlertTextEle.isDisplayed()) {
	        	AlertTextEle.click();
	            CustomListner.test.log(LogStatus.INFO, "Click on Alert OK Button");
	        }else {
	        	CustomListner.test.log(LogStatus.FAIL, "Alert OK Button is Not Display");
	        }
	    }
	    public void selectNarcotics(String val) {
	        WebElement narcoticsEle=driver.findElement(By.xpath("(//div[text()='"+val+"'])[1]"));
	        waitUtils.waitForElementToBeVisibleweb(driver, narcoticsEle, 20, "Element is Not Display");
	        if(narcoticsEle.isDisplayed()) {
	        	narcoticsEle.click();
	            CustomListner.test.log(LogStatus.INFO, "Click on Do you consume or have you ever consumed any narcotic substance? button As=====> "+val);
	        
	        }else {
	        	CustomListner.test.log(LogStatus.FAIL, "Do you consume or have you ever consumed any narcotic substance? button is not display ");
	        }
	    }
	    public void EnterReasonForNarcotics(String val) {
	        WebElement narcoticsReasonEle=driver.findElement(By.xpath("//input[@type='text']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, narcoticsReasonEle, 20, "Element is Not Display");
	        if(narcoticsReasonEle.isDisplayed()) {
	        	narcoticsReasonEle.sendKeys(val);
	            CustomListner.test.log(LogStatus.INFO, "Enter Reason for Narcotics Consume  As=====> "+val);
	        
	        }else {
	        	CustomListner.test.log(LogStatus.INFO, "Reason for Narcotics Consume TextFields is not display ");
	        }
	    }

		public void TypeofAlcohol(String val,String quantity,String frequency) throws InterruptedException {
			if (val.equalsIgnoreCase("Beer")) {
				
				WebElement BeerEle = driver.findElement(By.xpath("//input[@value='{\"optionId\":\"Q19A1\",\"text\":\"Beer\"}']"));
				waitUtils.waitForElementToBeVisibleweb(driver, BeerEle, 20, "Element is Not Display");
					BeerEle.click();
					CustomListner.test.log(LogStatus.INFO, "Click on Type of Alcohol Consumed  As=====> " + val);
					WebElement quantityEle = driver.findElement(By.xpath("//input[@id='quantity']"));
					WebElement frequencyEle = driver.findElement(By.xpath("//div[@id='frequency']"));
					
					if(quantityEle.isDisplayed()) {
						quantityEle.sendKeys(quantity);
						CustomListner.test.log(LogStatus.INFO, "Enter Quantity of Type of Alcohol Consumed  As=====> " + quantity);
					}else {
						CustomListner.test.log(LogStatus.INFO, "Quantity of Type of Alcohol Consumed  is not Display");
					}
					if(frequencyEle.isDisplayed()) {
						frequencyEle.click();
						Thread.sleep(2000);
						WebElement frequencydropdownEle = driver.findElement(By.xpath("//ul//li//span[text()='"+frequency+"']"));
						frequencydropdownEle.click();
						CustomListner.test.log(LogStatus.INFO, "Select Frequency of Type of Alcohol Consumed  As=====> " + frequency);
					}else {
						CustomListner.test.log(LogStatus.INFO, "Frequency of Type of Alcohol Consumed  is not Display");
					}
					
					
					
			
			} else if (val.equalsIgnoreCase("Wine")) {
				WebElement wineEle = driver
						.findElement(By.xpath("//input[@value='{\"optionId\":\"Q19A2\",\"text\":\"Wine\"}']"));
				if (wineEle.isDisplayed()) {
					wineEle.click();
					CustomListner.test.log(LogStatus.INFO, "Click on Type of Alcohol Consumed  As=====> " + val);

				} else {
					CustomListner.test.log(LogStatus.INFO, "Type of Alcohol Consumed is not display ");
				}
			} else if (val.equalsIgnoreCase("Liquor")) {
				WebElement liquorEle = driver
						.findElement(By.xpath("//input[@value='{\"optionId\":\"Q19A2\",\"text\":\"Wine\"}']"));
				if (liquorEle.isDisplayed()) {
					liquorEle.click();
					CustomListner.test.log(LogStatus.INFO, "Click on Type of Alcohol Consumed  As=====> " + val);

				} else {
					CustomListner.test.log(LogStatus.INFO, "Type of Alcohol Consumed is not display ");
				}
			}

		}
		public void TypeofTobacco(String val,String quantity,String noofyear) throws InterruptedException {
			if (val.equalsIgnoreCase("Cigarette")) {
				
				WebElement cigaretteEle = driver.findElement(By.xpath("//input[@value='{\"optionId\":\"Q2027.1A1\",\"text\":\"Cigarette\"}']"));
				waitUtils.waitForElementToBeVisibleweb(driver, cigaretteEle, 20, "Element is Not Display");
				cigaretteEle.click();
					CustomListner.test.log(LogStatus.INFO, "Click on Form of Tobacco Consumed  As=====> " + val);
					WebElement quantityEle = driver.findElement(By.xpath("//input[@placeholder='No. of Units']"));
					WebElement NoOfYearEle = driver.findElement(By.xpath("//input[@placeholder='No. of years']"));
					
					if(quantityEle.isDisplayed()) {
						quantityEle.sendKeys(quantity);
						CustomListner.test.log(LogStatus.INFO, "Enter Quantity of Form of Tobacco Consumed  As=====> " + quantity);
					}else {
						CustomListner.test.log(LogStatus.INFO, "Quantity of Form of Tobacco Consumed  is not Display");
					}
					if(NoOfYearEle.isDisplayed()) {
						NoOfYearEle.sendKeys(noofyear);
						CustomListner.test.log(LogStatus.INFO, "Enter No. of Year  As=====> " + noofyear);
					}else {
						CustomListner.test.log(LogStatus.INFO, "No. of Year  is not Display");
					}
					
					
					
			
			} else if (val.equalsIgnoreCase("Wine")) {
				WebElement wineEle = driver
						.findElement(By.xpath("//input[@value='{\"optionId\":\"Q19A2\",\"text\":\"Wine\"}']"));
				if (wineEle.isDisplayed()) {
					wineEle.click();
					CustomListner.test.log(LogStatus.INFO, "Click on Type of Alcohol Consumed  As=====> " + val);

				} else {
					CustomListner.test.log(LogStatus.INFO, "Type of Alcohol Consumed is not display ");
				}
			} else if (val.equalsIgnoreCase("Liquor")) {
				WebElement liquorEle = driver
						.findElement(By.xpath("//input[@value='{\"optionId\":\"Q19A2\",\"text\":\"Wine\"}']"));
				if (liquorEle.isDisplayed()) {
					liquorEle.click();
					CustomListner.test.log(LogStatus.INFO, "Click on Type of Alcohol Consumed  As=====> " + val);

				} else {
					CustomListner.test.log(LogStatus.INFO, "Type of Alcohol Consumed is not display ");
				}
			}

		}
	    public void selectAlcohol(String val) {
	        WebElement alcoholEle=driver.findElement(By.xpath("(//div[text()='"+val+"'])[2]"));
	        waitUtils.waitForElementToBeVisibleweb(driver, alcoholEle, 20, "Element is Not Display");
	        if(alcoholEle.isDisplayed()) {
	        	alcoholEle.click();
	            CustomListner.test.log(LogStatus.INFO, "Click on Do you consume Alcohol? button As=====> "+val);
	        
	        }else {
	        	CustomListner.test.log(LogStatus.INFO, "Do you consume Alcohol? button is not display ");
	        }
	    }
	    public void selectTobacco(String val) {
	        WebElement tobaccoEle=driver.findElement(By.xpath("(//div[text()='"+val+"'])[3]"));
	        waitUtils.waitForElementToBeVisibleweb(driver, tobaccoEle, 20, "Element is Not Display");
	        if(tobaccoEle.isDisplayed()) {
	        	tobaccoEle.click();
	            CustomListner.test.log(LogStatus.INFO, "Click on Do you consume cigarettes/bidis/cigars or used any other tobacco/nicotine products in any form? button As=====> "+val);
	        
	        }else {
	        	CustomListner.test.log(LogStatus.INFO, "Do you consume cigarettes/bidis/cigars or used any other tobacco/nicotine products in any form? button is not display ");
	        }
	    }
	    public void selectHazardous(String val) {
	        WebElement hazardousEle=driver.findElement(By.xpath("(//div[text()='"+val+"'])[4]"));
	        waitUtils.waitForElementToBeVisibleweb(driver, hazardousEle, 20, "Element is Not Display");
	        if(hazardousEle.isDisplayed()) {
	        	hazardousEle.click();
	            CustomListner.test.log(LogStatus.INFO, "Click on Hazardous button As=====> "+val);
	        
	        }else {
	        	CustomListner.test.log(LogStatus.INFO, "Hazardous button is not display ");
	        }
	    }
	    public void selectTravell(String val) {
	        WebElement TravellEle=driver.findElement(By.xpath("(//div[text()='"+val+"'])[5]"));
	        waitUtils.waitForElementToBeVisibleweb(driver, TravellEle, 20, "Element is Not Display");
	        if(TravellEle.isDisplayed()) {
	        	TravellEle.click();
	            CustomListner.test.log(LogStatus.INFO, "Click on Travell button As=====> "+val);
	        
	        }else {
	        	CustomListner.test.log(LogStatus.INFO, "Travell button is not display ");
	        }
	    }
	    public void HazardousSelectOption1(String val) throws InterruptedException {
	        WebElement Select1Ele=driver.findElement(By.xpath("//div[@id='mui-component-select-2029']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, Select1Ele, 20, "Element is Not Display");
	        if(Select1Ele.isDisplayed()) {
	        	Select1Ele.click();
	        	Thread.sleep(2000);
	            CustomListner.test.log(LogStatus.INFO, "Click on Hazardous Select Option1 button");
	            WebElement Select1Option=driver.findElement(By.xpath("//ul//li//span[text()='"+val+"']"));
	            if(Select1Option.isDisplayed()) {
	            	Select1Option.click();
	            	CustomListner.test.log(LogStatus.INFO, "Click on Hazardous Select Option1 Value As=====>"+val);
	            }else {
	            	CustomListner.test.log(LogStatus.INFO, "Hazardous Select Option1 Value is not Display");
	            }
	        }else {
	        	CustomListner.test.log(LogStatus.INFO, "Hazardous Select Option1 button is not display ");
	        }
	    }
	    public void HazardousSelectOption2(String val) throws InterruptedException {
	        WebElement Select2Ele=driver.findElement(By.xpath("//div[@id='mui-component-select-2031']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, Select2Ele, 20, "Element is Not Display");
	        if(Select2Ele.isDisplayed()) {
	        	Select2Ele.click();
	        	Thread.sleep(2000);
	            CustomListner.test.log(LogStatus.INFO, "Click on Hazardous Select Option2 button");
	            WebElement Select2Option=driver.findElement(By.xpath("//ul//li//span[text()='"+val+"']"));
	            if(Select2Option.isDisplayed()) {
	            	Select2Option.click();
	            	CustomListner.test.log(LogStatus.INFO, "Click on Hazardous Select Option2 Value As=====>"+val);
	            }else {
	            	CustomListner.test.log(LogStatus.INFO, "Hazardous Select Option2 Value is not Display");
	            }
	        }else {
	        	CustomListner.test.log(LogStatus.INFO, "Hazardous Select Option2 button is not display ");
	        }
	    }
	    public void EnterHazardousTimeOfYear(String val) {
	        WebElement timeofyearEle=driver.findElement(By.xpath("//input[@name='2030']"));
	        waitUtils.waitForElementToBeVisibleweb(driver, timeofyearEle, 20, "Element is Not Display");
	        if(timeofyearEle.isDisplayed()) {
	        	timeofyearEle.sendKeys(val);
	            CustomListner.test.log(LogStatus.INFO, "Enter Mention how many times a year Textbox  As=====> "+val);
	        
	        }else {
	        	CustomListner.test.log(LogStatus.INFO, "Mention how many times a year TextFields is not display ");
	        }
	    }
	    public void weightValidation() throws InterruptedException {
	    	WebElement getTextError1=driver.findElement(By.xpath("//p[text()='Please Enter Weight']"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, getTextError1, 20, "Element is Not Display");
			TestUtil.verifybgColor(getTextError1, driver);
			Assert.assertTrue(getTextError1.isDisplayed(),"Weight Error Msg is not Display");
			CustomListner.test.log(LogStatus.INFO, "Successfully Display Weight Validation Mandatory Error Message");
			EnterWeight("300");
			Thread.sleep(2000);
			ClickSaveContinueBtn();
			Thread.sleep(2000);
			WebElement getTextError2=driver.findElement(By.xpath("//p[text()='Please enter between 1 and 199']"));
			TestUtil.verifybgColor(getTextError2, driver);
			Assert.assertTrue(getTextError2.isDisplayed(),"Weight Error Msg is not Display");
			CustomListner.test.log(LogStatus.INFO, "Successfully Display Weight Validation Range(1 and 199) Error Message");
	    }
	    
	    
	    public void VerifyHosptalization() throws InterruptedException {
	    	WebElement textEle1 = driver.findElement(By.xpath("//div[contains(text(),'Hospitalization')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, textEle1, 20, "Element is Not Display");
	    	WebElement yesEle1 = driver.findElement(By.xpath("(//button[contains(@name,'8081')])[1]"));
	    	WebElement noEle1 = driver.findElement(By.xpath("(//button[contains(@name,'8081')])[2]"));
	    	

	    	if (textEle1.isDisplayed()) {
	    		TestUtil.verifybgColor(textEle1, driver);
	    		Assert.assertTrue(textEle1.isDisplayed(), "Hospitalization Text is not present");
	    		CustomListner.test.log(LogStatus.INFO, "Hospitalization Text is Display");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Hospitalization Text is not present");
	    	}
	    	if (yesEle1.isDisplayed()) {
	    		TestUtil.verifybgColor(yesEle1, driver);
	    		Assert.assertTrue(yesEle1.isDisplayed(), "Hospitalization  YES Button is not present");
	    		CustomListner.test.log(LogStatus.INFO, "Hospitalization Yes Button is Display");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Hospitalization YES Button is not present");
	    	}
	    	if (noEle1.isDisplayed()) {
	    		TestUtil.verifybgColor(noEle1, driver);
	    		Assert.assertTrue(noEle1.isDisplayed(), "Hospitalization No Button is not present");
	    		CustomListner.test.log(LogStatus.INFO, "Hospitalization NO Button is Display");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Hospitalization  NO Button is not present");
	    	}
	    }
	    
	    
	    public void ClickonHospitalization(String val) throws InterruptedException {
	    	WebElement yesEle=driver.findElement(By.xpath("(//div[contains(text(),'"+val+"')])[3]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, yesEle, 20, "Element is Not Display");
	    	if (yesEle.isDisplayed()) {
	    		yesEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on Hospitalization Button As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.INFO, "Hospitalization Button is not present");
	    	}
			
	    } 
	    public void EnterHospitalizationCurrentSymptoms(String val) throws InterruptedException {
	    	WebElement CurrentsysEle=driver.findElement(By.xpath("//input[contains(@name,'8092')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, CurrentsysEle, 20, "Element is Not Display");
	    	if (CurrentsysEle.isDisplayed()) {
	    		CurrentsysEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Hospitalization Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Hospitalization Current Symptoms  is not present");
	    	}
			
	    } 
	    public void EnterHospitalizationDoctorDetail(String val) throws InterruptedException {
	    	WebElement CurrentsysEle=driver.findElement(By.xpath("//input[contains(@name,'8093')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, CurrentsysEle, 20, "Element is Not Display");
	    	if (CurrentsysEle.isDisplayed()) {
	    		CurrentsysEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Hospitalization Doctor Detail As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Hospitalization Doctor Detail  is not present");
	    	}
			
	    } 
	    public void EnterHospitalizationDetailOfHospitalize(String val) throws InterruptedException {
	    	WebElement CurrentsysEle=driver.findElement(By.xpath("//input[contains(@name,'8094')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, CurrentsysEle, 20, "Element is Not Display");
	    	if (CurrentsysEle.isDisplayed()) {
	    		CurrentsysEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Hospitalization Detail Of Hospitalize As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.INFO, "Hospitalization  Detail Of Hospitalize  is not present");
	    	}
			
	    } 
	    public void EnterHospitalizekDateOfLastConsult(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@name,'day8095')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Last Consult Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@name,'month8095')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Last Consult month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@name,'year8095')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Last Consult year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.ENTER);
			
		}
	    public void EnterHospitalizeDateOfDiagnosis(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@name,'day8096')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Diagnosis Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@name,'month8096')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Diagnosis month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@name,'year8096')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Diagnosis year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.ENTER);
			
		}
	    
	    public void VerifyDisorder() throws InterruptedException {
	    	WebElement textEle1 = driver.findElement(By.xpath("//div[contains(text(),'Disorder')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, textEle1, 20, "Element is Not Display");
	    	WebElement yesEle1 = driver.findElement(By.xpath("(//button[contains(@name,'8083')])[1]"));
	    	WebElement noEle1 = driver.findElement(By.xpath("(//button[contains(@name,'8083')])[2]"));
	    	

	    	if (textEle1.isDisplayed()) {
	    		TestUtil.verifybgColor(textEle1, driver);
	    		Assert.assertTrue(textEle1.isDisplayed(), "Disorder Text is not present");
	    		CustomListner.test.log(LogStatus.INFO, "Disorder Text is Display");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Disorder Text is not present");
	    	}
	    	if (yesEle1.isDisplayed()) {
	    		TestUtil.verifybgColor(yesEle1, driver);
	    		Assert.assertTrue(yesEle1.isDisplayed(), "Disorder  YES Button is not present");
	    		CustomListner.test.log(LogStatus.INFO, "Disorder Yes Button is Display");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Disorder YES Button is not present");
	    	}
	    	if (noEle1.isDisplayed()) {
	    		TestUtil.verifybgColor(noEle1, driver);
	    		Assert.assertTrue(noEle1.isDisplayed(), "Disorder No Button is not present");
	    		CustomListner.test.log(LogStatus.INFO, "Disorder NO Button is Display");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Disorder  NO Button is not present");
	    	}
	    }
	    public void ClickonDisorder(String val) throws InterruptedException {
	    	WebElement yesEle=driver.findElement(By.xpath("(//div[contains(text(),'"+val+"')])[5]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, yesEle, 20, "Element is Not Display");
	    	if (yesEle.isDisplayed()) {
	    		yesEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on Disorder Button As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Disorder Button is not present");
	    	}
			
	    } 
	    public void EnterDisorderCurrentSymptoms(String val) throws InterruptedException {
	    	WebElement CurrentsysEle=driver.findElement(By.xpath("//input[contains(@name,'8097')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, CurrentsysEle, 20, "Element is Not Display");
	    	if (CurrentsysEle.isDisplayed()) {
	    		CurrentsysEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Disorder Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.INFO, "Disorder Current Symptoms  is not present");
	    	}
			
	    } 
	    public void EnterDisorderDoctorDetail(String val) throws InterruptedException {
	    	WebElement CurrentsysEle=driver.findElement(By.xpath("//input[contains(@name,'8098')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, CurrentsysEle, 20, "Element is Not Display");
	    	if (CurrentsysEle.isDisplayed()) {
	    		CurrentsysEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Disorder Doctor Detail As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.INFO, "Disorder Doctor Detail  is not present");
	    	}
			
	    } 
	    public void EnterDisorderDetailOfHospitalize(String val) throws InterruptedException {
	    	WebElement CurrentsysEle=driver.findElement(By.xpath("//input[contains(@name,'8101')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, CurrentsysEle, 20, "Element is Not Display");
	    	if (CurrentsysEle.isDisplayed()) {
	    		CurrentsysEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Disorder Detail Of Hospitalize As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.INFO, "Disorder  Detail Of Hospitalize  is not present");
	    	}
			
	    } 
	    public void EnterDisorderDateOfLastConsult(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@name,'day8099')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Last Consult Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@name,'month8099')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Last Consult month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@name,'year8099')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Last Consult year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.ENTER);
			
		}
	    public void EnterDisorderDateOfDiagnosis(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@name,'day8100')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Diagnosis Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@name,'month8100')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Diagnosis month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@name,'year8100')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Diagnosis year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.ENTER);
			
		}
	    public void VerifySpouseHealth() throws InterruptedException {
	    	WebElement textEle1 = driver.findElement(By.xpath("//div[contains(text(),'Spouse Health')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, textEle1, 20, "Element is Not Display");
	    	WebElement yesEle1 = driver.findElement(By.xpath("(//button[contains(@name,'8084')])[1]"));
	    	WebElement noEle1 = driver.findElement(By.xpath("(//button[contains(@name,'8084')])[2]"));
	    	

	    	if (textEle1.isDisplayed()) {
	    		TestUtil.verifybgColor(textEle1, driver);
	    		Assert.assertTrue(textEle1.isDisplayed(), "Spouse health Text is not present");
	    		CustomListner.test.log(LogStatus.INFO, "Spouse health Text is Display");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Spouse health Text is not present");
	    	}
	    	if (yesEle1.isDisplayed()) {
	    		TestUtil.verifybgColor(yesEle1, driver);
	    		Assert.assertTrue(yesEle1.isDisplayed(), "Spouse health  YES Button is not present");
	    		CustomListner.test.log(LogStatus.INFO, "Spouse health Yes Button is Display");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Spouse health YES Button is not present");
	    	}
	    	if (noEle1.isDisplayed()) {
	    		TestUtil.verifybgColor(noEle1, driver);
	    		Assert.assertTrue(noEle1.isDisplayed(), "Spouse health No Button is not present");
	    		CustomListner.test.log(LogStatus.INFO, "Spouse health NO Button is Display");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Disorder  NO Button is not present");
	    	}
	    }
	    public void ClickonSpouseHealth(String val) throws InterruptedException {
	    	WebElement yesEle=driver.findElement(By.xpath("(//div[contains(text(),'"+val+"')])[6]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, yesEle, 20, "Element is Not Display");
	    	if (yesEle.isDisplayed()) {
	    		yesEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on Disorder Button As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Disorder Button is not present");
	    	}
			
	    } 
	    public void EnterSpouseHealthCurrentSymptoms(String val) throws InterruptedException {
	    	WebElement CurrentsysEle=driver.findElement(By.xpath("//input[contains(@name,'8102')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, CurrentsysEle, 20, "Element is Not Display");
	    	if (CurrentsysEle.isDisplayed()) {
	    		CurrentsysEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Spouse health Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Spouse health Current Symptoms  is not present");
	    	}
			
	    } 
	    public void EnterSpouseHealthDoctorDetail(String val) throws InterruptedException {
	    	WebElement CurrentsysEle=driver.findElement(By.xpath("//input[contains(@name,'8103')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, CurrentsysEle, 20, "Element is Not Display");
	    	if (CurrentsysEle.isDisplayed()) {
	    		CurrentsysEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Spouse health Doctor Detail As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Spouse health Doctor Detail  is not present");
	    	}
			
	    } 
	    public void EnterSpousehealthDetailOfHospitalize(String val) throws InterruptedException {
	    	WebElement CurrentsysEle=driver.findElement(By.xpath("//input[contains(@name,'8106')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, CurrentsysEle, 20, "Element is Not Display");
	    	if (CurrentsysEle.isDisplayed()) {
	    		CurrentsysEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Spouse health Detail Of Hospitalize As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Spouse health  Detail Of Hospitalize  is not present");
	    	}
			
	    } 
	    public void EnterSpousehealthDateOfLastConsult(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@name,'day8104')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Last Consult Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@name,'month8104')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Last Consult month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@name,'year8104')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Last Consult year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.ENTER);
			
		}
	    public void EnterSpouseHealthDateOfDiagnosis(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@name,'day8105')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Diagnosis Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@name,'month8105')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Diagnosis month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@name,'year8105')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Diagnosis year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.ENTER);
			
		}
	    public void VerifyOtherSymptoms() throws InterruptedException {
	    	WebElement textEle1 = driver.findElement(By.xpath("//div[contains(text(),'Other symptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, textEle1, 20, "Element is Not Display");
	    	WebElement yesEle1 = driver.findElement(By.xpath("(//button[contains(@name,'8085')])[1]"));
	    	WebElement noEle1 = driver.findElement(By.xpath("(//button[contains(@name,'8085')])[2]"));
	    	

	    	if (textEle1.isDisplayed()) {
	    		TestUtil.verifybgColor(textEle1, driver);
	    		Assert.assertTrue(textEle1.isDisplayed(), "Other symptoms Text is not present");
	    		CustomListner.test.log(LogStatus.INFO, "Other symptoms Text is Display");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Other symptoms Text is not present");
	    	}
	    	if (yesEle1.isDisplayed()) {
	    		TestUtil.verifybgColor(yesEle1, driver);
	    		Assert.assertTrue(yesEle1.isDisplayed(), "Other symptoms  YES Button is not present");
	    		CustomListner.test.log(LogStatus.INFO, "Other symptoms Yes Button is Display");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Other symptoms YES Button is not present");
	    	}
	    	if (noEle1.isDisplayed()) {
	    		TestUtil.verifybgColor(noEle1, driver);
	    		Assert.assertTrue(noEle1.isDisplayed(), "Other symptoms No Button is not present");
	    		CustomListner.test.log(LogStatus.INFO, "Other symptoms NO Button is Display");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Other symptoms  NO Button is not present");
	    	}
	    }
	    public void VerifyForFemaleLiveOnly() throws InterruptedException {
	    	WebElement textEle1 = driver.findElement(By.xpath("//div[contains(text(),'For Females lives only')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, textEle1, 20, "Element is Not Display");
	    	WebElement yesEle1 = driver.findElement(By.xpath("(//button[contains(@name,'8086')])[1]"));
	    	WebElement noEle1 = driver.findElement(By.xpath("(//button[contains(@name,'8086')])[2]"));
	    	
	    	

	    	if (textEle1.isDisplayed()) {
	    		TestUtil.verifybgColor(textEle1, driver);
	    		Assert.assertTrue(textEle1.isDisplayed(), "For Females lives only Text is not present");
	    		CustomListner.test.log(LogStatus.INFO, "For Females lives only Text is Display");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "For Females lives only Text is not present");
	    	}
	    	if (yesEle1.isDisplayed()) {
	    		TestUtil.verifybgColor(yesEle1, driver);
	    		Assert.assertTrue(yesEle1.isDisplayed(), "For Females lives only  YES Button is not present");
	    		CustomListner.test.log(LogStatus.INFO, "For Females lives only Yes Button is Display");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "For Females lives only YES Button is not present");
	    	}
	    	if (noEle1.isDisplayed()) {
	    		TestUtil.verifybgColor(noEle1, driver);
	    		Assert.assertTrue(noEle1.isDisplayed(), "For Females lives only No Button is not present");
	    		CustomListner.test.log(LogStatus.INFO, "For Females lives only NO Button is Display");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "For Females lives only NO Button is not present");
	    	}
	    	
	    	String gettext1=noEle1.getAttribute("aria-pressed");
	    	if (gettext1.equalsIgnoreCase("true")) {
	    		TestUtil.verifybgColor(noEle1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified By Default For Females lives only  Value Selected As=====>NO");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed to Verified By Default For Females lives only Value  Selected As=====>Yes");
	    	}
	    }
	    public void ClickonOthersymptoms(String val) throws InterruptedException {
	    	WebElement yesEle=driver.findElement(By.xpath("(//div[contains(text(),'"+val+"')])[7]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, yesEle, 20, "Element is Not Display");
	    	if (yesEle.isDisplayed()) {
	    		yesEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on Other symptoms Button As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Other symptoms Button is not present");
	    	}
			
	    } 
	    public void ClickonOFemaleLivesOnly(String val) throws InterruptedException {
	    	WebElement yesEle=driver.findElement(By.xpath("(//div[contains(text(),'"+val+"')])[8]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, yesEle, 20, "Element is Not Display");
	    	if (yesEle.isDisplayed()) {
	    		yesEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on For Female Lives Only Button As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "For Female Lives Only Button is not present");
	    	}
			
	    } 
	    public void ClickonHaveYouSufferedFrom(String val) throws InterruptedException {
	    	WebElement yesEle=driver.findElement(By.xpath("(//div[contains(text(),'"+val+"')])[9]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, yesEle, 20, "Element is Not Display");
	    	if (yesEle.isDisplayed()) {
	    		yesEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on Have you suffered from or do you have any gynaecological problems or illness related to uterus/ovaries or breasts? Button As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Have you suffered from or do you have any gynaecological problems or illness related to uterus/ovaries or breasts? Yes Button is not present");
	    	}
			
	    } 
	    public void ClickonAilment(String val) throws InterruptedException {
	    	WebElement yesEle=driver.findElement(By.xpath("(//div[contains(text(),'"+val+"')])[4]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, yesEle, 30, "Element is not Display");
	    	if (yesEle.isDisplayed()) {
	    		yesEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on Ailments Button As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Ailments Yes Button is not present");
	    	}
			
	    } 
	    public void ClickonAilmentHeartIssueCheckbox() throws InterruptedException {
	    	WebElement ChechBoxEle=driver.findElement(By.xpath("(//input[@id='accordian-checkbox'])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, ChechBoxEle, 20, "Element is Not Display");
	    	if (ChechBoxEle.isEnabled()) {
	    		ChechBoxEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on Ailments HEART ISSUES CheckBox");

	    	} else {
	    		//ChechBoxEle.click();
	    		CustomListner.test.log(LogStatus.FAIL, "Click on Ailments HEART ISSUES CheckBox");
	    	}
			
	    } 
	    public void ClickonAilmentBreathingIssueCheckbox() throws InterruptedException {
	    	WebElement ChechBoxEle=driver.findElement(By.xpath("(//input[@id='accordian-checkbox'])[2]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, ChechBoxEle, 20, "Element is Not Display");
	    	if (ChechBoxEle.isEnabled()) {
	    		ChechBoxEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on Ailments Breathing ISSUES CheckBox");

	    	} else {
	    		ChechBoxEle.click();
	    		CustomListner.test.log(LogStatus.FAIL, "Click on Ailments Breathing ISSUES CheckBox");
	    	}
			
	    } 
	    public void ClickonAilmentDiabetesCheckbox() throws InterruptedException {
	    	WebElement ChechBoxEle=driver.findElement(By.xpath("(//input[@id='accordian-checkbox'])[3]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, ChechBoxEle, 20, "Element is Not Display");
	    	if (ChechBoxEle.isEnabled()) {
	    		ChechBoxEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on Ailments Diabetes CheckBox");

	    	} else {
	    		ChechBoxEle.click();
	    		CustomListner.test.log(LogStatus.FAIL, "Click on Ailments Diabetes CheckBox");
	    	}
			
	    } 
	    public void ClickonAilmentUlcerCheckbox() throws InterruptedException {
	    	WebElement ChechBoxEle=driver.findElement(By.xpath("(//input[@id='accordian-checkbox'])[4]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, ChechBoxEle, 20, "Element is Not Display");
	    	if (ChechBoxEle.isEnabled()) {
	    		ChechBoxEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on Ailments Ulcer CheckBox");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Click on Ailments Ulcer CheckBox");
	    	}
			
	    } 
	    public void ClickonAilmentKidneyCheckbox() throws InterruptedException {
	    	WebElement ChechBoxEle=driver.findElement(By.xpath("(//input[@id='accordian-checkbox'])[6]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, ChechBoxEle, 20, "Element is Not Display");
	    	if (ChechBoxEle.isEnabled()) {
	    		ChechBoxEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on Ailments Kidney CheckBox");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Click on Ailments Kidney CheckBox");
	    	}
			
	    } 
	    public void ClickonAilmentParalysisCheckbox() throws InterruptedException {
	    	WebElement ChechBoxEle=driver.findElement(By.xpath("(//input[@id='accordian-checkbox'])[5]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, ChechBoxEle, 20, "Element is Not Display");
	    	if (ChechBoxEle.isEnabled()) {
	    		ChechBoxEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on Ailments Paralysis CheckBox");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Click on Ailments Paralysis CheckBox");
	    	}
			
	    } 
	    public void ClickonAilmentArthritisCheckbox() throws InterruptedException {
	    	WebElement ChechBoxEle=driver.findElement(By.xpath("(//input[@id='accordian-checkbox'])[7]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, ChechBoxEle, 20, "Element is Not Display");
	    	if (ChechBoxEle.isEnabled()) {
	    		ChechBoxEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on ARTHRITIS Paralysis CheckBox");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Click on ARTHRITIS Paralysis CheckBox");
	    	}
			
	    } 
	    public void ClickonAilmentEyeEarCheckbox() throws InterruptedException {
	    	WebElement ChechBoxEle=driver.findElement(By.xpath("(//input[@id='accordian-checkbox'])[8]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, ChechBoxEle, 20, "Element is Not Display");
	    	if (ChechBoxEle.isEnabled()) {
	    		ChechBoxEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on Eye/Ear  CheckBox");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Click on Eye/Ear  CheckBox");
	    	}
			
	    } 
	    public void ClickonAilmentTumorCheckbox() throws InterruptedException {
	    	WebElement ChechBoxEle=driver.findElement(By.xpath("(//input[@id='accordian-checkbox'])[9]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, ChechBoxEle, 20, "Element is Not Display");
	    	if (ChechBoxEle.isEnabled()) {
	    		ChechBoxEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on TUMOR  CheckBox");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Click on TUMOR  CheckBox");
	    	}
			
	    } 
	    public void ClickonAilmentOtherCheckbox() throws InterruptedException {
	    	WebElement ChechBoxEle=driver.findElement(By.xpath("(//input[@id='accordian-checkbox'])[10]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, ChechBoxEle, 20, "Element is Not Display");
	    	if (ChechBoxEle.isEnabled()) {
	    		ChechBoxEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on Others  CheckBox");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Click on Others  CheckBox");
	    	}
			
	    } 
	    public void ClickonDizzinessEpilepsy() throws InterruptedException {
	    	WebElement ChechBoxEle=driver.findElement(By.xpath("//span[contains(text(),'Dizziness epilepsy')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, ChechBoxEle, 20, "Element is Not Display");
	    	if (ChechBoxEle.isDisplayed()) {
	    		ChechBoxEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on  Dizziness epilepsy Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display  Dizziness epilepsy Button");
	    	}
			
	    } 
	    public void ClickonArthritis() throws InterruptedException {
	    	WebElement ChechBoxEle=driver.findElement(By.xpath("//span[contains(text(),'Arthritis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, ChechBoxEle, 20, "Element is Not Display");
	    	if (ChechBoxEle.isDisplayed()) {
	    		ChechBoxEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on  Arthritis  Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display  Arthritis  Button");
	    	}
			
	    } 
	    public void ClickonOthermusculoskeletaldisorders() throws InterruptedException {
	    	WebElement ChechBoxEle=driver.findElement(By.xpath("//span[contains(text(),'Other musculoskeletal disorders')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, ChechBoxEle, 20, "Element is Not Display");
	    	if (ChechBoxEle.isDisplayed()) {
	    		ChechBoxEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on  Other musculoskeletal disorders  Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display  Other musculoskeletal disorders  Button");
	    	}
			
	    } 
	    public void verifyotherErrorMSG() throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//p[contains(text(),'Please specify the details')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Not Display");
	    	if (OtherEle.isDisplayed()) {
	    		TestUtil.verifybgColor(OtherEle, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Other Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified Other  Mandatory Error Message");
	    	}
			
	    }
	    public void verifyotherArthritisErrorMSG() throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("(//p[contains(text(),'Please specify the details')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Not Display");
	    	if (OtherEle.isDisplayed()) {
	    		TestUtil.verifybgColor(OtherEle, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Other Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified Other  Mandatory Error Message");
	    	}
			
	    }
	    public void verifyPleaseAdviceErrorMSG() throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("(//p[contains(text(),'Please specify the details')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Not Display");
	    	if (OtherEle.isDisplayed()) {
	    		TestUtil.verifybgColor(OtherEle, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 1. Please advise which joint/s or areas of the  body are/were affected Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 1. Please advise which joint/s or areas of the  body are/were affected  Mandatory Error Message");
	    	}
			
	    }
	    public void verifyWhatWasUnderlyningCouseErrorMSG() throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//p[contains(text(),'Please specify the details')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Not Display");
	    	if (OtherEle.isDisplayed()) {
	    		TestUtil.verifybgColor(OtherEle, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 2. What was the underlying cause (e.g. accident, degeneration, recreational or sporting injury etc.) Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 2. What was the underlying cause (e.g. accident, degeneration, recreational or sporting injury etc.)  Mandatory Error Message");
	    	}
			
	    }
	    public void verifyWhenWasConditionDiagnosErrorMSG() throws InterruptedException {
	    	WebElement dayEle=driver.findElement(By.xpath("//p[contains(@id,'day603-helper-text')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, dayEle, 20, "Element is Not Display");
	    	WebElement monthEle=driver.findElement(By.xpath("//p[contains(@id,'month603-helper-text')]"));
	    	WebElement yearEle=driver.findElement(By.xpath("//p[contains(@id,'year603-helper-text')]"));
	    	
	    	if (dayEle.isDisplayed()) {
	    		TestUtil.verifybgColor(dayEle, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 2. When was the condition diagnosed or when did you first experience a seizure? Enter Day Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 2. When was the condition diagnosed or when did you first experience a seizure? Enter Day  Mandatory Error Message");
	    	}
	    	if (monthEle.isDisplayed()) {
	    		TestUtil.verifybgColor(monthEle, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 2. When was the condition diagnosed or when did you first experience a seizure? Enter Month Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 2. When was the condition diagnosed or when did you first experience a seizure? Enter Month  Mandatory Error Message");
	    	}
	    	if (yearEle.isDisplayed()) {
	    		TestUtil.verifybgColor(yearEle, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 2. When was the condition diagnosed or when did you first experience a seizure? Enter Year Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 2. When was the condition diagnosed or when did you first experience a seizure? Enter Year  Mandatory Error Message");
	    	}
			
	    }
	    public void verifyWhenDidYouFirstExperianceSymtomsErrorMSG() throws InterruptedException {
	    	WebElement dayEle=driver.findElement(By.xpath("//p[contains(@id,'day44-helper-text')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, dayEle, 20, "Element is Not Display");
	    	WebElement monthEle=driver.findElement(By.xpath("//p[contains(@id,'month44-helper-text')]"));
	    	WebElement yearEle=driver.findElement(By.xpath("//p[contains(@id,'year44-helper-text')]"));
	    	
	    	if (dayEle.isDisplayed()) {
	    		TestUtil.verifybgColor(dayEle, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 2. When did you first experience symptoms? Enter Day Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 2. When did you first experience symptoms? Enter Day  Mandatory Error Message");
	    	}
	    	if (monthEle.isDisplayed()) {
	    		TestUtil.verifybgColor(monthEle, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 2. When did you first experience symptoms? Enter Month Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 2. When did you first experience symptoms? Enter Month  Mandatory Error Message");
	    	}
	    	if (yearEle.isDisplayed()) {
	    		TestUtil.verifybgColor(yearEle, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 2. When did you first experience symptoms? Enter Year Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 2. When did you first experience symptoms? Enter Year  Mandatory Error Message");
	    	}
			
	    }
	    public void verifyWhenDidYouFirstExperianceSymtomsMuskuloskeletalErrorMSG() throws InterruptedException {
	    	WebElement dayEle=driver.findElement(By.xpath("//p[contains(@id,'day632-helper-text')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, dayEle, 20, "Element is Not Display");
	    	WebElement monthEle=driver.findElement(By.xpath("//p[contains(@id,'month632-helper-text')]"));
	    	WebElement yearEle=driver.findElement(By.xpath("//p[contains(@id,'year632-helper-text')]"));
	    	
	    	if (dayEle.isDisplayed()) {
	    		TestUtil.verifybgColor(dayEle, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 3. When did you first experience symptoms? Enter Day Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 3. When did you first experience symptoms? Enter Day  Mandatory Error Message");
	    	}
	    	if (monthEle.isDisplayed()) {
	    		TestUtil.verifybgColor(monthEle, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 3. When did you first experience symptoms? Enter Month Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 3. When did you first experience symptoms? Enter Month  Mandatory Error Message");
	    	}
	    	if (yearEle.isDisplayed()) {
	    		TestUtil.verifybgColor(yearEle, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 3. When did you first experience symptoms? Enter Year Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 3. When did you first experience symptoms? Enter Year  Mandatory Error Message");
	    	}
			
	    }
	    
	    public void verifyWhenDidYoulastExperianceSymtomsErrorMSG() throws InterruptedException {
	    	WebElement dayEle=driver.findElement(By.xpath("//p[contains(@id,'day50-helper-text')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, dayEle, 20, "Element is Not Display");
	    	WebElement monthEle=driver.findElement(By.xpath("//p[contains(@id,'month50-helper-text')]"));
	    	WebElement yearEle=driver.findElement(By.xpath("//p[contains(@id,'year50-helper-text')]"));
	    	
	    	if (dayEle.isDisplayed()) {
	    		TestUtil.verifybgColor(dayEle, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 3. b. When did you last experience symptoms? Enter Day Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 3. b. When did you last experience symptoms? Enter Day  Mandatory Error Message");
	    	}
	    	if (monthEle.isDisplayed()) {
	    		TestUtil.verifybgColor(monthEle, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 3. b. When did you last experience symptoms? Enter Month Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 3. b. When did you last experience symptoms? Enter Month  Mandatory Error Message");
	    	}
	    	if (yearEle.isDisplayed()) {
	    		TestUtil.verifybgColor(yearEle, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 3. b. When did you last experience symptoms? Enter Year Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 3. b. When did you last experience symptoms? Enter Year  Mandatory Error Message");
	    	}
			
	    }
	    public void verifyIfYouAreNoLongerErrorMSG() throws InterruptedException {
	    	WebElement dayEle=driver.findElement(By.xpath("//p[contains(@id,'day635-helper-text')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, dayEle, 20, "Element is Not Display");
	    	WebElement monthEle=driver.findElement(By.xpath("//p[contains(@id,'month635-helper-text')]"));
	    	WebElement yearEle=driver.findElement(By.xpath("//p[contains(@id,'year635-helper-text')]"));
	    	
	    	if (dayEle.isDisplayed()) {
	    		TestUtil.verifybgColor(dayEle, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 4b. If you are no longer experiencing symptoms, when did they last occur? Enter Day Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 4b. If you are no longer experiencing symptoms, when did they last occur? Enter Day  Mandatory Error Message");
	    	}
	    	if (monthEle.isDisplayed()) {
	    		TestUtil.verifybgColor(monthEle, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 4b. If you are no longer experiencing symptoms, when did they last occur? Enter Month Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 4b. If you are no longer experiencing symptoms, when did they last occur? Enter Month  Mandatory Error Message");
	    	}
	    	if (yearEle.isDisplayed()) {
	    		TestUtil.verifybgColor(yearEle, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 4b. If you are no longer experiencing symptoms, when did they last occur? Enter Year Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 4b. If you are no longer experiencing symptoms, when did they last occur? Enter Year  Mandatory Error Message");
	    	}
			
	    }
	    public void verifyWhenWasYourLastSuizureErrorMSG() throws InterruptedException {
	    	WebElement dayEle=driver.findElement(By.xpath("//p[contains(@id,'day606-helper-text')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, dayEle, 20, "Element is Not Display");
	    	WebElement monthEle=driver.findElement(By.xpath("//p[contains(@id,'month606-helper-text')]"));
	    	WebElement yearEle=driver.findElement(By.xpath("//p[contains(@id,'year606-helper-text')]"));
	    	
	    	if (dayEle.isDisplayed()) {
	    		TestUtil.verifybgColor(dayEle, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 5. When was your last seizure? Enter Day Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 5. When was your last seizure? Enter Day  Mandatory Error Message");
	    	}
	    	if (monthEle.isDisplayed()) {
	    		TestUtil.verifybgColor(monthEle, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 5. When was your last seizure? Enter Month Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 5. When was your last seizure? Enter Month  Mandatory Error Message");
	    	}
	    	if (yearEle.isDisplayed()) {
	    		TestUtil.verifybgColor(yearEle, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 5. When was your last seizure? Enter Year Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 5. When was your last seizure? Enter Year  Mandatory Error Message");
	    	}
			
	    }
	    public void verifyMedicationErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(@id,'name-helper-text')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	WebElement Ele2=driver.findElement(By.xpath("//p[contains(@id,'currentPast-helper-text')]"));
	    	WebElement Ele3=driver.findElement(By.xpath("//p[contains(@id,'dose-helper-text')]"));
	    	WebElement Ele4=driver.findElement(By.xpath("//p[contains(@id,'frequency-helper-text')]"));
	    	
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 6. Provide medication details for this condition? Name Of Medicine Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 6. Provide medication details for this condition? Name Of Medicine  Mandatory Error Message");
	    	}
	    	if (Ele2.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele2, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 6. Provide medication details for this condition? Current/Past Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 6. Provide medication details for this condition? Current/Past Mandatory Error Message");
	    	}
	    	if (Ele3.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele3, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 6. Provide medication details for this condition? Dose Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 6. Provide medication details for this condition? Dose Mandatory Error Message");
	    	}
	    	if (Ele4.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele4, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 6. Provide medication details for this condition? Frequency Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 6. Provide medication details for this condition? Frequency Mandatory Error Message");
	    	}
			
	    }
	    public void verifyInvestigationErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(@id,'name-helper-text')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	WebElement Ele2=driver.findElement(By.xpath("//p[contains(@id,'dd-helper-text')]"));
	    	WebElement Ele3=driver.findElement(By.xpath("//p[contains(@id,'mm-helper-text')]"));
	    	WebElement Ele4=driver.findElement(By.xpath("//p[contains(@id,'yy-helper-text')]"));
	    	WebElement Ele5=driver.findElement(By.xpath("//p[contains(@id,'result-helper-text')]"));
	    	
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 7. Have you ever had any tests or investigations carried out? Test/Investigation Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified  7. Have you ever had any tests or investigations carried out? Test/Investigation Mandatory Error Message");
	    	}
	    	if (Ele2.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele2, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 7. Have you ever had any tests or investigations carried out?  Enter Day Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 7. Have you ever had any tests or investigations carried out? Enter Day Mandatory Error Message");
	    	}
	    	if (Ele3.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele3, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 7. Have you ever had any tests or investigations carried out? Enter Month Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 7. Have you ever had any tests or investigations carried out? Enter Month Mandatory Error Message");
	    	}
	    	if (Ele4.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele4, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 7. Have you ever had any tests or investigations carried out? Enter Year Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 7. Have you ever had any tests or investigations carried out? Enter Year Mandatory Error Message");
	    	}
	    	if (Ele5.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele5, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 7. Have you ever had any tests or investigations carried out? Result Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 7. Have you ever had any tests or investigations carried out? Result Mandatory Error Message");
	    	}
			
	    }
	    public void verifyAdmittedToHospitalErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(@id,'doctor-helper-text')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	WebElement Ele2=driver.findElement(By.xpath("//p[contains(@id,'address-helper-text')]"));
	    	WebElement Ele3=driver.findElement(By.xpath("//p[contains(@id,'dd-helper-text')]"));
	    	WebElement Ele4=driver.findElement(By.xpath("//p[contains(@id,'mm-helper-text')]"));
	    	WebElement Ele5=driver.findElement(By.xpath("//p[contains(@id,'yy-helper-text')]"));
	    	
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 8. Have you ever been admitted to hospital or had out-patient follow-up for this condition Doctor/Clinic/Hospital Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified  8. Have you ever been admitted to hospital or had out-patient follow-up for this condition Doctor/Clinic/Hospital Mandatory Error Message");
	    	}
	    	if (Ele2.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele2, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 8. Have you ever been admitted to hospital or had out-patient follow-up for this condition Address Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 8. Have you ever been admitted to hospital or had out-patient follow-up for this condition Address Mandatory Error Message");
	    	}
	    	if (Ele3.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele3, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 8. Have you ever been admitted to hospital or had out-patient follow-up for this condition Enter Day Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 8. Have you ever been admitted to hospital or had out-patient follow-up for this condition Enter Day Mandatory Error Message");
	    	}
	    	if (Ele4.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele4, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 8. Have you ever been admitted to hospital or had out-patient follow-up for this condition  Enter Month Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 8. Have you ever been admitted to hospital or had out-patient follow-up for this condition Enter Month Mandatory Error Message");
	    	}
	    	if (Ele5.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele5, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 8. Have you ever been admitted to hospital or had out-patient follow-up for this condition Enter Year Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To verified 8. Have you ever been admitted to hospital or had out-patient follow-up for this condition Enter Year Mandatory Error Message");
	    	}
			
	    }
	    public void verifyotherYesNoButton() throws InterruptedException {
	    	WebElement OtherEle1=driver.findElement(By.xpath("(//button[contains(@name,'paralysisOptionsQstDizzinessMedicalReportQst')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle1, 20, "Element is Not Display");
	    	WebElement OtherEle2=driver.findElement(By.xpath("(//button[contains(@name,'paralysisOptionsQstDizzinessMedicalReportQst')])[2]"));
	    	if (OtherEle1.isDisplayed()) {
	    		TestUtil.verifybgColor(OtherEle1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully display Do you have medical report related to this? YES Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To display Do you have medical report related to this? YES Button");
	    	}
	    	if (OtherEle2.isDisplayed()) {
	    		TestUtil.verifybgColor(OtherEle2, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully display Do you have medical report related to this? NO Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To display Do you have medical report related to this? NO Button");
	    	}
			
	    } 
	    public void ClickonOther() throws InterruptedException {
	    	WebElement ChechBoxEle=driver.findElement(By.xpath("//div[contains(text(),'Others')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, ChechBoxEle, 20, "Element is Not Display");
	    	if (ChechBoxEle.isDisplayed()) {
	    		ChechBoxEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "click on Other Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display other Button");
	    	}
			
	    } 

	    public void ClickonAilment1AllTab() throws InterruptedException {
	    	WebElement ele1=driver.findElement(By.xpath("//span[contains(text(),'Low/High Blood Pressure')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, ele1, 20, "Element is Not Display");
	    	WebElement ele2=driver.findElement(By.xpath("//span[contains(text(),'High Cholesterol')]"));
	    	WebElement ele3=driver.findElement(By.xpath("//span[contains(text(),'Heart Attack')]"));
	    	WebElement ele4=driver.findElement(By.xpath("//span[contains(text(),'Heart Murmur')]"));
	    	WebElement ele5=driver.findElement(By.xpath("//span[contains(text(),'Heart Disorders')]"));
	    
	    	if (ele1.isDisplayed()) {
	    		ele1.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on Ailments Heart Issues Low/High Blood Pressure");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Ailments Heart Issues Low/High Blood Pressure");
	    	}
	    	if (ele2.isDisplayed()) {
	    		ele2.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on Ailments Heart Issues High Cholesterol");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Ailments Heart Issues High Cholesterol");
	    	}
	    	if (ele3.isDisplayed()) {
	    		ele3.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on Ailments Heart Issues Heart Attack");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Ailments Heart Issues Heart Attack");
	    	}
	    	if (ele4.isDisplayed()) {
	    		ele4.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on Ailments Heart Issues Heart Murmur");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Ailments Heart Issues Heart Murmur");
	    	}
	    	if (ele5.isDisplayed()) {
	    		ele5.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on Ailments Heart Issues Heart Disorders");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Ailments Heart Issues Heart Disorders");
	    	}
			
	    } 
	    public void EnterOthersymptomsCurrentSymptoms(String val) throws InterruptedException {
	    	WebElement CurrentsysEle=driver.findElement(By.xpath("//input[contains(@name,'8107')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, CurrentsysEle, 20, "Element is Not Display");
	    	if (CurrentsysEle.isDisplayed()) {
	    		CurrentsysEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Other symptoms Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Other symptoms Current Symptoms  is not present");
	    	}
			
	    } 
	    public void EnterforFemaleLivesonlyNoOfWeeks(String val) throws InterruptedException {
	    	WebElement CurrentsysEle=driver.findElement(By.xpath("//input[contains(@name,'8133')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, CurrentsysEle, 20, "Element is Not Display");
	    	if (CurrentsysEle.isDisplayed()) {
	    		CurrentsysEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter No. of Weeks As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "No. of Weeks TextField is not present");
	    	}
			
	    } 
	    public void EnterOthersymptomsDoctorDetail(String val) throws InterruptedException {
	    	WebElement CurrentsysEle=driver.findElement(By.xpath("//input[contains(@name,'8108')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, CurrentsysEle, 20, "Element is Not Display");
	    	if (CurrentsysEle.isDisplayed()) {
	    		CurrentsysEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Other symptoms Doctor Detail As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Other symptoms Doctor Detail  is not present");
	    	}
			
	    } 
	    public void EnterFemaleLivesOnlyCurrentSymptoms(String val) throws InterruptedException {
	    	WebElement CurrentsysEle=driver.findElement(By.xpath("//input[contains(@name,'8134')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, CurrentsysEle, 20, "Element is Not Display");
	    	if (CurrentsysEle.isDisplayed()) {
	    		CurrentsysEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter For Female Lives only Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Female Lives only Current Symptoms is not present");
	    	}
			
	    } 
	    public void EnterHaveYouSufferedFromCurrentSymptoms(String val) throws InterruptedException {
	    	WebElement CurrentsysEle=driver.findElement(By.xpath("//input[contains(@name,'8139')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, CurrentsysEle, 20, "Element is Not Display");
	    	if (CurrentsysEle.isDisplayed()) {
	    		CurrentsysEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter  Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Current Symptoms is not present");
	    	}
			
	    } 
	    public void displayAllAilmentsQuestion1(String val) throws InterruptedException {
	    	try {
	    		WebElement Question1Ele=driver.findElement(By.xpath("//span[contains(text(),'"+val+"')]"));
		    	waitUtils.waitForElementToBeVisibleweb(driver, Question1Ele, 20, "Element is not Display");
		    	if (Question1Ele.isDisplayed()) {
		    		TestUtil.verifybgColor(Question1Ele, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Display Button As=====>"+val);

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, val+" Button is not Display");
		    	}
	    	}catch(NoSuchElementException e) {
	    		CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element=====>"+val);
	    	}
	    		
	    } 
	    public void displayAllAilmentsQuestionParalysisDiziness(String val) throws InterruptedException {
	    	try {
	    		WebElement Question1Ele=driver.findElement(By.xpath("//div[contains(text(),'"+val+"')]"));
		    	waitUtils.waitForElementToBeVisibleweb(driver, Question1Ele, 20, "Element is not Display");
		    	if (Question1Ele.isDisplayed()) {
		    		TestUtil.verifybgColor(Question1Ele, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Display Button As=====>"+val);

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, val+" Button is not Display");
		    	}
	    	}catch(NoSuchElementException e) {
	    		CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element=====>"+val);
	    	}
	    		
	    } 
	    public void ClickOnAllTab(String val) throws InterruptedException {
	    	try {
	    		WebElement Question1Ele=driver.findElement(By.xpath("//span[contains(text(),'"+val+"')]"));
		    	waitUtils.waitForElementToBeVisibleweb(driver, Question1Ele, 20, "Element is not Display");
		    	if (Question1Ele.isDisplayed()) {
		    		Question1Ele.click();
		    		CustomListner.test.log(LogStatus.INFO, "Click on Button As=====>"+val);

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, val+" Button is not Display");
		    	}
	    	}catch(NoSuchElementException e) {
	    		CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element=====>"+val);
	    	}
	    	
			
	    } 
	    public void displayAllAilmentsQuestion1StateTheDiagnos(String val) throws InterruptedException {
	    	try {
	    		WebElement Question1Ele=driver.findElement(By.xpath("//div[contains(text(),'"+val+"')]"));
		    	waitUtils.waitForElementToBeVisibleweb(driver, Question1Ele, 20, "Element is not Display");
		    	if (Question1Ele.isDisplayed()) {
		    		TestUtil.verifybgColor(Question1Ele, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Display Button As=====>"+val);

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, val+" Button is not Display");
		    	}
	    	}catch(NoSuchElementException e) {
	    		CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element=====>"+val);
	    	}
	    	
			
	    } 

	    public void EnterOtherSymptomsDetailOfHospitalize(String val) throws InterruptedException {
	    	WebElement CurrentsysEle=driver.findElement(By.xpath("//input[contains(@name,'8111')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, CurrentsysEle, 20, "Element is Not Display");
	    	if (CurrentsysEle.isDisplayed()) {
	    		CurrentsysEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Other symptoms Detail Of Hospitalize As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Other symptoms  Detail Of Hospitalize  is not present");
	    	}
			
	    } 
	    public void EnterForFemaleLivesOnlyDetailOfHospitalize(String val) throws InterruptedException {
	    	WebElement CurrentsysEle=driver.findElement(By.xpath("//input[contains(@name,'8138')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, CurrentsysEle, 20, "Element is Not Display");
	    	if (CurrentsysEle.isDisplayed()) {
	    		CurrentsysEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter For Female Lives Only Detail Of Hospitalize As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "For Female Lives Only Detail Of Hospitalize  is not present");
	    	}
			
	    } 
	    public void EnterHaveYouSufferedFromDetailOfHospitalize(String val) throws InterruptedException {
	    	WebElement CurrentsysEle=driver.findElement(By.xpath("//input[contains(@name,'8143')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, CurrentsysEle, 20, "Element is Not Display");
	    	if (CurrentsysEle.isDisplayed()) {
	    		CurrentsysEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Detail Of Hospitalize As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Detail Of Hospitalize  is not present");
	    	}
			
	    } 
	    public void EnterForFemaleLivesOnlyDoctorDetails(String val) throws InterruptedException {
	    	WebElement CurrentsysEle=driver.findElement(By.xpath("//input[contains(@name,'8135')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, CurrentsysEle, 20, "Element is Not Display");
	    	if (CurrentsysEle.isDisplayed()) {
	    		CurrentsysEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter For Female Lives Only Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "For Female Lives Only Doctor Details is not present");
	    	}
			
	    } 
	    public void EnterHaveYouSufferedFromDoctorDetails(String val) throws InterruptedException {
	    	WebElement CurrentsysEle=driver.findElement(By.xpath("//input[contains(@name,'8140')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, CurrentsysEle, 20, "Element is Not Display");
	    	if (CurrentsysEle.isDisplayed()) {
	    		CurrentsysEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Doctor Details is not present");
	    	}
			
	    } 
	    public void ClickOnChestPain() throws InterruptedException {
	    	WebElement ChestPainEle=driver.findElement(By.xpath("//span[contains(text(),'Chest Pain')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, ChestPainEle, 20, "Element is Not Display");
	    	if (ChestPainEle.isDisplayed()) {
	    		ChestPainEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On Chest Pain Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Chest Pain Button is not Display");
	    	}
			
	    } 
	    public void ClickOnAsthma() throws InterruptedException {
	    	WebElement ChestPainEle=driver.findElement(By.xpath("//span[contains(text(),'Asthma')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, ChestPainEle, 20, "Element is Not Display");
	    	if (ChestPainEle.isDisplayed()) {
	    		ChestPainEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On Asthma Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Asthma Button is not Display");
	    	}
			
	    } 
	    public void ClickOnDiabetes() throws InterruptedException {
	    	WebElement ChestPainEle=driver.findElement(By.xpath("//span[contains(text(),'Diabetes')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, ChestPainEle, 20, "Element is Not Display");
	    	if (ChestPainEle.isDisplayed()) {
	    		ChestPainEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On Diabetes Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Diabetes Button is not Display");
	    	}
			
	    } 
	    public void VerifyConditionYouSufferingFromErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("(//p[contains(text(),'Kindly mention the details')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 1. Condition of you are suffering from Provide detail Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 1. Condition of you are suffering from Provide detail Mandatory Error Message");
	    	}
			
	    }
	    public void VerifyAreYouSmokerErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(text(),'Please specify the details')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 3. Are you smoker? Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 3. Are you smoker? Mandatory Error Message");
	    	}
			
	    }
	    public void VerifyIndicateFrequencyOfYouSymptomsErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(text(),'Kindly mention the details')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 4. Indicate frequency of your symptoms Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 4. Indicate frequency of your symptoms Mandatory Error Message");
	    	}
			
	    }
	    public void VerifyAreYourSymptomsPrecipitatedErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(text(),'Please specify the details')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 5. Are your symptoms precipitated by seasonal changes, exercise, respiratory infections,etc? Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 5. Are your symptoms precipitated by seasonal changes, exercise, respiratory infections,etc? Mandatory Error Message");
	    	}
			
	    }
	    public void VerifyWhenWasConditionDiagnosErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(@id,'day1001-helper-text')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	WebElement Ele2=driver.findElement(By.xpath("//p[contains(@id,'month1001-helper-text')]"));
	    	WebElement Ele3=driver.findElement(By.xpath("//p[contains(@id,'year1001-helper-text')]"));
	    	
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 2. When was the condition diagnosed Day Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 2. When was the condition diagnosed Day Mandatory Error Message");
	    	}
	    	if (Ele2.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele2, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 2. When was the condition diagnosed Month Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 2. When was the condition diagnosed Month Mandatory Error Message");
	    	}
	    	if (Ele3.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele3, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 2. When was the condition diagnosed Year Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 2. When was the condition diagnosed Year Mandatory Error Message");
	    	}
			
	    }
	    public void VerifyDoYouTakeMedicationOrOtherErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("(//p[contains(text(),'Enter the medication details')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	WebElement Ele2=driver.findElement(By.xpath("(//p[contains(text(),'Enter the medication details')])[2]"));
	    	WebElement Ele3=driver.findElement(By.xpath("(//p[contains(text(),'Enter the medication details')])[3]"));
	    	
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Display Do you take medication or other treatment for this condition? Medication  Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 7. Do you take medication or other treatment for this condition? Medication  Mandatory Error Message");
	    	}
	    	if (Ele2.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele2, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 7. Do you take medication or other treatment for this condition? Dose Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 7. Do you take medication or other treatment for this condition? Dose Mandatory Error Message");
	    	}
	    	if (Ele3.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele3, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 7. Do you take medication or other treatment for this condition? Frequency Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 7. Do you take medication or other treatment for this condition? Frequency Mandatory Error Message");
	    	}
			
	    }
	    public void VerifyHaveYouTakenOffErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(text(),'Please specify the details')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 10. Have you taken time off work with this condition?  Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 10. Have you taken time off work with this condition? Medication  Mandatory Error Message");
	    	}
	    }
	    public void VerifyWhenDidYouLastExperianceSymptomsErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(@id,'day1007-helper-text')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	WebElement Ele2=driver.findElement(By.xpath("//p[contains(@id,'month1007-helper-text')]"));
	    	WebElement Ele3=driver.findElement(By.xpath("//p[contains(@id,'year1007-helper-text')]"));
	    	
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 6. When did you last experience symptoms? Day Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 6. When did you last experience symptoms? Day Mandatory Error Message");
	    	}
	    	if (Ele2.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele2, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 6. When did you last experience symptoms? Month Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 6. When did you last experience symptoms? Month Mandatory Error Message");
	    	}
	    	if (Ele3.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele3, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 6. When did you last experience symptoms? Year Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 6. When did you last experience symptoms? Year Mandatory Error Message");
	    	}
			
	    }
	    public void VerifyDateFutureErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(@id,'year1001-helper-text')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Error Message..You Can Not Select Future Date ");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display  Future Date Error Message");
	    	}
			
	    }
	    public void VerifyDateFutureErrorMSG2() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(@id,'year1007-helper-text')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Error Message..You Can Not Select Future Date ");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display  Future Date Error Message");
	    	}
			
	    }
	    public void VerifyDateFutureErrorMSG3() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(text(),'Date of last consultation cannot be a future date')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Error Message..You Can Not Select Future Date ");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display  Future Date Error Message");
	    	}
			
	    }
	    public void VerifyDateFutureErrorMSG5() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(text(),'Max 2022')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Error Message..You Can Not Select Future Date ");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display  Future Date Error Message");
	    	}
			
	    }
	    public void VerifyAreYourSymptomsOngoingErrorMSG5() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//div[contains(text(),'Please Select a Value')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 4a. Are your symptoms ongoing? mandatory Error Message ");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 4a. Are your symptoms ongoing? mandatory Error Message ");
	    	}
			
	    }
	    public void VerifyHowOftenDoYouExperianceErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(text(),'Kindly mention the details')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 3. How often do you typically experience a seizure? mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified 3. How often do you typically experience a seizure? Mandatory Error Message");
	    	}
			
	    }
	    public void VerifyAdditionalInformation() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@name,'650')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Display Additinal Information");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Additinal Information");
	    	}
			
	    }
	    public void VerifyhaveYouEverTakenMedicationErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(@id,'name-helper-text')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	WebElement Ele2=driver.findElement(By.xpath("//p[contains(@id,'currentPast-helper-text')]"));
	    	WebElement Ele3=driver.findElement(By.xpath("//p[contains(@id,'dose-helper-text')]"));
	    	WebElement Ele4=driver.findElement(By.xpath("//p[contains(@id,'frequency-helper-text')]"));
	    	
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 4. Have you ever taken or are currently taking medication for this conditions? Name Of Medication mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified 4. Have you ever taken or are currently taking medication for this conditions? Name Of Medication Mandatory Error Message");
	    	}
	    	if (Ele2.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele2, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 4. Have you ever taken or are currently taking medication for this conditions? Current/Past mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified 4. Have you ever taken or are currently taking medication for this conditions? Current/Past Mandatory Error Message");
	    	}
	    	if (Ele3.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele3, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 4. Have you ever taken or are currently taking medication for this conditions? Dose mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified 4. Have you ever taken or are currently taking medication for this conditions? Dose Mandatory Error Message");
	    	}
	    	if (Ele4.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele4, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 4. Have you ever taken or are currently taking medication for this conditions? Frequency mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified 4. Have you ever taken or are currently taking medication for this conditions? Frequency Mandatory Error Message");
	    	}
			
	    }
	    public void VerifyPleaseProvidedetailsOfMedicationErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(@id,'name-helper-text')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	WebElement Ele2=driver.findElement(By.xpath("//p[contains(@id,'currentPast-helper-text')]"));
	    	WebElement Ele3=driver.findElement(By.xpath("//p[contains(@id,'dose-helper-text')]"));
	    	WebElement Ele4=driver.findElement(By.xpath("//p[contains(@id,'frequency-helper-text')]"));
	    	
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified  Name Of Medication mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified  Name Of Medication Mandatory Error Message");
	    	}
	    	if (Ele2.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele2, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified  Current/Past mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Current/Past Mandatory Error Message");
	    	}
	    	if (Ele3.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele3, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Dose mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Dose Mandatory Error Message");
	    	}
	    	if (Ele4.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele4, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Frequency mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified  Frequency Mandatory Error Message");
	    	}
			
	    }
	    public void VerifyHaveYouEverHadErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[1]"));
	    	WebElement Ele2=driver.findElement(By.xpath("(//p[contains(text(),'Please enter this field')])[2]"));
	    	WebElement Ele3=driver.findElement(By.xpath("//p[contains(@id,'dd-helper-text')]"));
	    	WebElement Ele4=driver.findElement(By.xpath("//p[contains(@id,'mm-helper-text')]"));
	    	WebElement Ele5=driver.findElement(By.xpath("//p[contains(@id,'yy-helper-text')]"));
	    	
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified  Test/Investigation name mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified  Test/Investigation Name Mandatory Error Message");
	    	}
	    	if (Ele2.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele2, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified  Result mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Result Mandatory Error Message");
	    	}
	    	if (Ele3.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele3, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Enter Day mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Enter Day Mandatory Error Message");
	    	}
	    	if (Ele4.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele4, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Enter Month mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified  Enter Month Mandatory Error Message");
	    	}
	    	if (Ele5.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele5, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Enter Year mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified  Enter Year Mandatory Error Message");
	    	}
			
	    }
	    public void VerifyHaveYouEverbeenErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(@id,'dd-helper-text')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	WebElement Ele2=driver.findElement(By.xpath("//p[contains(@id,'mm-helper-text')]"));
	    	WebElement Ele3=driver.findElement(By.xpath("//p[contains(@id,'yy-helper-text')]"));
	    	WebElement Ele4=driver.findElement(By.xpath("//p[contains(@id,'name-helper-text')]"));
	    	WebElement Ele5=driver.findElement(By.xpath("(//p[contains(@id,'dose-helper-text')])[1]"));
	    	WebElement Ele6=driver.findElement(By.xpath("(//p[contains(@id,'dose-helper-text')])[2]"));
	    	
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified  Enter Day mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified  Enter Day Mandatory Error Message");
	    	}
	    	if (Ele2.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele2, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified  Enter Month mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Enter Month Mandatory Error Message");
	    	}
	    	if (Ele3.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele3, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Enter Year mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Enter Year Mandatory Error Message");
	    	}
	    	if (Ele4.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele4, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Procedure mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified  Procedure Mandatory Error Message");
	    	}
	    	if (Ele5.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele5, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Location mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Location Mandatory Error Message");
	    	}
	    	if (Ele6.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele6, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Result mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Result Mandatory Error Message");
	    	}
			
	    }
	    public void VerifyAreYouDailyActivitiesErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(text(),'Please specify the details')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 3. d. Are your daily activities affected or restricted in any way? mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified 3. d. Are your daily activities affected or restricted in any way? Mandatory Error Message");
	    	}
			
	    }
	    public void VerifyDoYouUseWalkingStickErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(text(),'Please specify the details')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 3. e. Do you use walking stick or other mobility aid? mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified 3. e. Do you use walking stick or other mobility aid? Mandatory Error Message");
	    	}
			
	    }
	    public void VerifyhasAnyOtherTreatmentErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(@id,'treatment-helper-text')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	WebElement Ele2=driver.findElement(By.xpath("//p[contains(@id,'location-helper-text')]"));
	    	WebElement Ele3=driver.findElement(By.xpath("//p[contains(@id,'dd-helper-text')]"));
	    	WebElement Ele4=driver.findElement(By.xpath("//p[contains(@id,'mm-helper-text')]"));
	    	WebElement Ele5=driver.findElement(By.xpath("//p[contains(@id,'yy-helper-text')]"));
	    	WebElement Ele6=driver.findElement(By.xpath("//p[contains(@id,'result-helper-text')]"));
	    	
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Treatment/Test/Investigation mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Treatment/Test/Investigation Mandatory Error Message");
	    	}
	    	if (Ele2.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele2, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Location mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Location Mandatory Error Message");
	    	}
	    	if (Ele3.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele3, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Enter Day Mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Enter Day Mandatory Error Message");
	    	}
	    	if (Ele4.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele4, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Enter Month mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Enter Month Mandatory Error Message");
	    	}
	    	if (Ele5.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele5, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Enter Year mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Enter Year Mandatory Error Message");
	    	}
	    	if (Ele6.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele6, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Result mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Result Mandatory Error Message");
	    	}
			
	    }
	    public void VerifyWhichJointHaveBeenAffectedErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(text(),'Please specify the details')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 3. c. Which joints are or have been affected? mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified 3. c. Which joints are or have been affected? Mandatory Error Message");
	    	}
			
	    }
	    public void VerifyIsTheFrequencyOfSuizureBecomingErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//div[contains(text(),'Please Select a value')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 4. Is the frequency of seizure becoming : mandatory  Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified 4. Is the frequency of seizure becoming : Mandatory Error Message");
	    	}
			
	    }
	    public void VerifyTypeofdiabetesYouAreSufferingAlertPopUp() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(text(),'Select type of diabetes you are suffering from')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Select type of diabetes you are suffering from Mandatory Alert PopUp ");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Select type of diabetes you are suffering from Mandatory Alert PopUp");
	    	}
			
	    }
	    public void VerifyhaveYouEverBeenToldYouAlertPopUp() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(text(),'Please select the condition you have been told you have')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified select the condition you have been told you have Mandatory Alert PopUp ");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display select the condition you have been told you have Mandatory Alert PopUp");
	    	}
			
	    }
	    public void VerifyDoYouSmokeErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//div[contains(text(),'Please Select a Value')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Do You Smoke Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Do You Smoke  Mandatory Error Message");
	    	}
			
	    }
	    public void VerifyDoYouDoRegularBloodSugarErrorMSG() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(text(),'Enter Day')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	WebElement Ele2=driver.findElement(By.xpath("//p[contains(text(),'Enter month')]"));
	    	WebElement Ele3=driver.findElement(By.xpath("//p[contains(text(),'Enter year')]"));
	    	WebElement Ele4=driver.findElement(By.xpath("(//p[contains(text(),'Enter the treatment details')])[1]"));
	    	WebElement Ele5=driver.findElement(By.xpath("(//p[contains(text(),'Enter the treatment details')])[2]"));

	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Enter Day Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Enter Day Mandatory Error Message");
	    	}
	    	if (Ele2.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele2, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Enter Month Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Enter Month Mandatory Error Message");
	    	}
	    	if (Ele3.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele3, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Enter Year Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Enter Year Mandatory Error Message");
	    	}
	    	if (Ele4.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele4, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Blood Sugar Level Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Blood Sugar Level  Mandatory Error Message");
	    	}
	    	if (Ele5.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele5, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Last HbA1C Measure Mandatory Error Message");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Last HbA1C Measure Mandatory Error Message");
	    	}
			
	    }
	    public void VerifyDateFutureErrorMSG4() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//p[contains(text(),'Date of Diagnosis cannot be a future date')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		TestUtil.verifybgColor(Ele1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Error Message..You Can Not Select Future Date ");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display  Future Date Error Message");
	    	}
			
	    }
	    public void EnterConditionYouSufferingFrom(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@name,'1000')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Provide details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Provide Details");
	    	}
			
	    }
	    public void EnterAreYouSmoker(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@name,'asthmaSmokerDetailsQst')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Are You Smoker Provide details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Are You Smoker Provide Details");
	    	}
			
	    }
	    public void EnterIndicateFrequencyOfYouSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@name,'1004')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Indicate Frequency Of Your Symptoms Provide details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Indicate Frequency Of Your Symptoms Provide Details");
	    	}
			
	    }
	    public void EnterAreYourSymptomsPrecipated(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@name,'asthmaInfectionDetailsQst')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Are Your Symptoms Precipitated Provide details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Are Your Symptoms Precipitated Provide Details");
	    	}
			
	    }
	    public void EnterDoYouTakeMedicationOrOtherMedication(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@name,'asthmaMedicationDetailsQst')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Medication As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Medication TextBox");
	    	}
			
	    }
	    public void EnterHaveYouTakenOff(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@name,'asthmaOffWorkDetailsQst')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Have you taken time off work with this condition? As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Have you taken time off work with this condition? TextBox");
	    	}
			
	    }
	    public void EnterDoYouTakeMedicationOrOtherDose(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@name,'asthmaDoseDetailsQst')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Dose As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Dose textBox");
	    	}
			
	    }
	    public void EnterDoYouTakeMedicationOrOtherFrquency(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@name,'asthmaFrequencyDetailsQst')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Frequency As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Frequency TextBox");
	    	}
			
	    }
	    public void EnterDoctorHospitalClinic(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@name,'1014')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Doctor/Hospital/Clinic As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Doctor/Hospital/Clinic TextBox");
	    	}
			
	    }
	    public void EnterAddress(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@name,'1015')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Address As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Address TextBox");
	    	}
			
	    }
	    public void EnterPneumoniaCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.0.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Pneumonia Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Pneumonia Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterPneumoniaDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.0.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Pneumonia Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Pneumonia Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterPneumoniaDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.0.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Pneumonia Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Pneumonia Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterPneumoniaDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.0.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Pneumonia Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Pneumonia Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterPneumoniaHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.0.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Pneumonia Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Pneumonia Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterUlcerCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.0.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Ulcer Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Ulcer Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterUlcerDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.0.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Ulcer Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Ulcer Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterUlcerDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.0.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Ulcer Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Ulcer Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterUlcerDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.0.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Ulcer Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Ulcer Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterUlcerHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.0.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Ulcer Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Ulcer Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterKidneyCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.0.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Kidney Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Kidney Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterKidneyDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.0.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Kidney Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Kidney Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterKidneyDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.0.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Kidney Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Kidney Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterKidneyDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.0.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Kidney Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Kidney Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterKidneyHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.0.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Kidney Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Kidney Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterMuscleDisorderCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8129.0.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Muscle Disorder Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Muscle Disorder Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterMuscleDisorderDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8129.0.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Muscle Disorder Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Muscle Disorder Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterMuscleDisorderDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8129.0.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Muscle Disorder Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Muscle Disorder Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterMuscleDisorderDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8129.0.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Muscle Disorder Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Muscle Disorder Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterMuscleDisorderHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8129.0.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Muscle Disorder Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Muscle Disorder Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterDisorderOfEyesCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8130.0.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Disorder of eyes Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Disorder of eyes Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterDisorderOfEyesDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8130.0.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Disorder of eyes Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Disorder of eyes Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterDisorderOfEyesDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8130.0.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Disorder of eyes Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Disorder of eyes Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterDisorderOfEyesDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8130.0.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Disorder of eyes Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Disorder of eyes Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterDisorderOfEyesHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8130.0.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Disorder of eyes Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Disorder of eyes Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterTumourCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.0.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Tumour Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Tumour Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterTumourDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.0.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Tumour Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Tumour of eyes Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterTumourDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.0.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Tumour Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Tumour Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterTumourDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.0.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Tumour Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Tumour Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterTumourHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.0.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Tumour Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Tumour Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterOthersIllnessCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8131.0.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Others Illness Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Others Illness Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterOthersIllnessDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8131.0.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Others Illness Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display  Others Illness Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterOthersIllnessDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8131.0.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Others Illness Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Others Illness Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterOthersIllnessDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8131.0.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Others Illness Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Others Illness Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterOthersIllnessHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8131.0.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Others Illness Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Others Illness Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterSurgeryCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8131.1.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Surgery Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Surgery Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterSurgeryDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8131.1.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Surgery Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display  Surgery Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterSurgeryDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8131.1.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Surgery Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Surgery Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterSurgeryDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8131.1.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Surgery Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Surgery Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterSurgeryHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8131.1.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Surgery Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display  Surgery Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterAilmentCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8131.2.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Ailment Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Ailment Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterAilmentDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8131.2.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Ailment Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display  Ailment Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterAilmentDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8131.2.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Ailment Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Ailment Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterAilmentDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8131.2.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Ailment Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Ailment Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterAilmentHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8131.2.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Ailment Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display  Ailment Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterInjuryCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8131.3.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Injury Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Injury Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterInjuryDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8131.3.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Injury Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display  Injury Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterInjuryDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8131.3.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Injury Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Injury Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterInjuryDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8131.3.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Injury Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Injury Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterInjuryHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8131.3.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Injury Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display  Injury Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterCancerenlargedlymphnodesCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.5.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Cancer/enlarged lymph nodes Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Cancer/enlarged lymph nodes Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterCancerenlargedlymphnodesDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.5.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Cancer/enlarged lymph nodes Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Cancer/enlarged lymph nodes Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterCancerenlargedlymphnodesDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.5.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Cancer/enlarged lymph nodes Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Cancer/enlarged lymph nodes Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterCancerenlargedlymphnodesDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.5.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Cancer/enlarged lymph nodes Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Cancer/enlarged lymph nodes Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterCancerenlargedlymphnodesHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.5.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Cancer/enlarged lymph nodes Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Cancer/enlarged lymph nodes Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterEnlargedlymphnodesCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.4.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Enlarged lymph nodes Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Enlarged lymph nodes Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterEnlargedlymphnodesDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.4.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Enlarged lymph nodes Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Enlarged lymph nodes Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterEnlargedlymphnodesDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.4.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Enlarged lymph nodes Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Enlarged lymph nodes Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterEnlargedlymphnodesDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.4.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Enlarged lymph nodes Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Enlarged lymph nodes Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterEnlargedlymphnodesHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.4.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Enlarged lymph nodes Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Enlarged lymph nodes Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterEnlargedglandsCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.3.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Enlarged glands Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Enlarged glands Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterEnlargedglandsDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.3.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Enlarged glands Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Enlarged glands of eyes Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterEnlargedglandsDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.3.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Enlarged glands Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Enlarged glands Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterEnlargedglandsDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.3.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Enlarged glands Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Enlarged glands Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterEnlargedglandsHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.3.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Enlarged glands Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Enlarged glands Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterCystCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.2.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Cyst Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Cyst Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterCystDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.2.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Cyst Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Cyst Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterCystDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.2.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Cyst Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Cyst Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterCystDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.2.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Cyst Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Cyst Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterCystHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.2.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Cyst Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Cyst Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterAbnormalGrowthCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.1.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Abnormal Growth Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Abnormal Growth Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterAbnormalGrowthDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.1.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Abnormal Growth Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Abnormal Growth Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterAbnormalGrowthDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.1.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Abnormal Growth Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Abnormal Growth Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterAbnormalGrowthDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.1.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Abnormal Growth Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Abnormal Growth Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterAbnormalGrowthHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8126.1.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Abnormal Growth Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Abnormal Growth Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterDisorderOfEarCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8130.1.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Disorder of Ear Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Disorder of Ear Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterDisorderOfEarDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8130.1.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Disorder of Ear Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Disorder of Ear Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterDisorderOfEarDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8130.1.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Disorder of Ear Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Disorder of Ear Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterDisorderOfEarDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8130.1.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Disorder of Ear Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Disorder of Ear Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterDisorderOfEarHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8130.1.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Disorder of Ear Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Disorder of Ear Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterBonefractureCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8129.1.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Bone fracture Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Bone fracture Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterBonefractureDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8129.1.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Bone fracture Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Bone fracture Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterBonefractureDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8129.1.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Bone fracture Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Bone fracture Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterBonefractureDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8129.1.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Bone fracture Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Bone fracture Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterBonefractureHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8129.1.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Bone fracture Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Bone fracture Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterGenitourinaryDisorderCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.5.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Genitourinary Disorder Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Genitourinary Disorder Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterGenitourinaryDisorderDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.5.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Genitourinary Disorder Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Genitourinary Disorder Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterGenitourinaryDisorderDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.5.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Genitourinary Disorder Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Genitourinary Disorder Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterGenitourinaryDisorderDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.5.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Genitourinary Disorder Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Genitourinary Disorder Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterGenitourinaryDisorderHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.5.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Genitourinary Disorder Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Genitourinary Disorder Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterProstateDisorderCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.4.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Prostate Disorder Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Prostate Disorder Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterProstateDisorderDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.4.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Prostate Disorder Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Prostate Disorder Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterProstateDisorderDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.4.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Prostate Disorder Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Prostate Disorder Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterProstateDisorderDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.4.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Prostate Disorder Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Prostate Disorder Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterProstateDisorderHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.4.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Prostate Disorder Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Prostate Disorder Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterBladderCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.2.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Bladder Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Bladder Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterBladderDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.2.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Bladder Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Bladder Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterBladderDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.2.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Bladder Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Bladder Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterBladderDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.2.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Bladder Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Bladder Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterBladderHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.2.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Bladder Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Bladder Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterReproductiveorganCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.3.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Reproductive organ Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Reproductive organ Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterReproductiveorganDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.3.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Reproductive organ Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Reproductive organ Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterReproductiveorganDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.3.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Reproductive organ Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Reproductive organ Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterReproductiveorganDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.3.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Reproductive organ Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Reproductive organ Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterReproductiveorganHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.3.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Reproductive organ Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Reproductive organ Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterUrinaryCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.1.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Urinary Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Urinary Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterUrinaryDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.1.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Urinary Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Urinary Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterUrinaryDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.1.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Urinary Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Urinary Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterUrinaryDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.1.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Urinary Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Urinary Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterUrinaryHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8128.1.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Urinary Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Urinary Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterFaintingSpellsCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.0.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Fainting Spells Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Fainting Spells Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterFaintingSpellsDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.0.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Fainting Spells Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Fainting Spells Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterFaintingSpellsDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.0.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Fainting Spells Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Fainting Spells Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterFaintingSpellsDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.0.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Fainting Spells Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Fainting Spells Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterFaintingSpellsHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.0.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Fainting Spells Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Fainting Spells Hospitalization Details TextBox");
	    	}	
	    }
	    public void EnterParalysisCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.1.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Paralysis Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Paralysis Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterParalysisDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.1.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Paralysis Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Paralysis Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterParalysisDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.1.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Paralysis Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Paralysis Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterParalysisDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.1.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Paralysis Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Paralysis Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterParalysisHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.1.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Paralysis Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Paralysis Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterStrokeCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.2.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Stroke Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Stroke Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterStrokeDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.2.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Stroke Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Stroke Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterStrokeDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.2.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Stroke Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Stroke Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterStrokeDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.2.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Stroke Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Stroke Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterStrokeHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.2.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Stroke Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Stroke Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterMentalDisorderCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.3.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Mental Disorder Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Mental Disorder Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterMentalDisorderDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.3.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Mental Disorder Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Mental Disorder Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterMentalDisorderDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.3.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Mental Disorder Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Mental Disorder Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterMentalDisorderDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.3.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Mental Disorder Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Mental Disorder Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterMentalDisorderHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.3.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Mental Disorder Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Mental Disorder Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterPsychiatricdisorderCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.4.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Psychiatric disorder Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Psychiatric disorder Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterPsychiatricdisorderDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.4.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Psychiatric disorder Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Psychiatric disorder Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterPsychiatricdisorderDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.4.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Psychiatric disorder Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Psychiatric disorder Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterPsychiatricdisorderDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.4.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Psychiatric disorder Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Psychiatric disorder Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterPsychiatricdisorderHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.4.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Psychiatric disorder Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Psychiatric disorder Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterAnyotherneurologicaldisorderCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.5.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Any other neurological disorder Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Any other neurological disorder Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterAnyotherneurologicaldisorderDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.5.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Any other neurological disorder Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Any other neurological disorder Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterAnyotherneurologicaldisorderDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.5.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Any other neurological disorder Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Any other neurological disorder Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterAnyotherneurologicaldisorderDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.5.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Any other neurological disorder Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Any other neurological disorder Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterAnyotherneurologicaldisorderHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8127.5.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Any other neurological disorder Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Any other neurological disorder Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterColitisCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.1.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Colitis Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Colitis Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterColitisDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.1.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Colitis Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Colitis Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterColitisDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.1.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Colitis Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Colitis Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterColitisDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.1.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Colitis Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Colitis Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterColitisHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.1.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Colitis Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Colitis Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterChronicDiarrhoeaCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.2.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Chronic Diarrhoea Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Chronic Diarrhoea Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterChronicDiarrhoeaDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.2.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Chronic Diarrhoea Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Chronic Diarrhoea Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterChronicDiarrhoeaDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.2.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Chronic Diarrhoea Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Chronic Diarrhoea Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterChronicDiarrhoeaDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.2.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Chronic Diarrhoea Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Chronic Diarrhoea Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterChronicDiarrhoeaHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.2.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Chronic Diarrhoea Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Chronic Diarrhoea Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterHepatitisCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.3.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Hepatitis Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Hepatitis Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterHepatitisDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.3.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Hepatitis Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Hepatitis Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterHepatitisDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.3.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Hepatitis Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Hepatitis Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterHepatitisDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.3.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Hepatitis Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Hepatitis Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterHepatitisHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.3.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Hepatitis Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Hepatitis Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterJaundiceCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.4.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Jaundice Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Jaundice Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterJaundiceDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.4.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Jaundice Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Jaundice Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterJaundiceDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.4.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Jaundice Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Jaundice Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterJaundiceDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.4.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Jaundice Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Jaundice Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterJaundiceHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.4.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Jaundice Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Jaundice Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterOtherLiverDisorderCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.5.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Other liver disorders Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Other liver disorders Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterOtherLiverDisorderDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.5.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Other liver disorders Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Other liver disorders Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterOtherLiverDisorderDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.5.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Other liver disorders Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Other liver disorders Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterOtherLiverDisorderDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.5.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Other liver disorders Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Other liver disorders Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterOtherLiverDisorderHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.5.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Other liver disorders Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Other liver disorders Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterDigestivedisordersCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.6.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Digestive disorders Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Digestive disorders Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterDigestivedisordersDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.6.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Digestive disorders Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Digestive disorders Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterDigestivedisordersDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.6.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Digestive disorders Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Digestive disorders Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterDigestivedisordersDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.6.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Digestive disorders Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Digestive disorders Date Of Diagnos TextBox");
	    	}
			
	    }
	    
	    public void EnterDigestivedisordersHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8125.6.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Digestive disorders Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Digestive disorders Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterShortnessOfBreathCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.1.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Shrotness Of Breath Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Shrotness Of Breath Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterShortnessOfBreathDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.1.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Shrotness Of Breath Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Shrotness Of Breath Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterShortnessOfBreathDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.1.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Shrotness Of Breath Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Shrotness Of Breath Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterShortnessOfBreathDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.1.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Shrotness Of Breath Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Shrotness Of Breath Date Of Diagnos TextBox");
	    	}
			
	    }
	    public void EnterShortnessOfBreathHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.1.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Shrotness Of Breath Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Shrotness Of Breath Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterTuberculosisCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.2.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Tuberculosis Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Tuberculosis Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterTuberculosisDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.2.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Tuberculosis Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Tuberculosis Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterTuberculosisDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.2.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Tuberculosis Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Tuberculosis Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterTuberculosisDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.2.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Tuberculosis Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Tuberculosis Date Of Diagnos TextBox");
	    	}
			
	    }
	    public void EnterTuberculosisHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.2.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Tuberculosis Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Tuberculosis Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterOtherRespiratoryCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.3.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Other Respratory Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Other Respratory Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterOtherRespiratoryDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.3.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Other Respratory Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Other Respratory Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterOtherRespiratoryDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.3.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Other Respratory Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Other Respratory Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterOtherRespiratoryDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.3.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Other Respratory Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Other Respratory Date Of Diagnos TextBox");
	    	}
			
	    }
	    public void EnterOtherRespiratoryHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.3.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Other Respratory Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Other Respratory Hospitalization Details TextBox");
	    	}
			
	    }
	    public void EnterLungDisordersCuurentSymptoms(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.4.currentSymptoms')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Lung Disorders Current Symptoms As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Lung Disorders Current Symptoms TextBox");
	    	}
			
	    }
	    public void EnterLungDisordersDoctorDetails(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.4.doctorDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Lung Disorders Doctor Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Lung Disorders Doctor Details TextBox");
	    	}
			
	    }
	    public void EnterLungDisordersDateOfLastConsult(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.4.dateOfConsultation')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Lung Disorders Date Of Last Consultation As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Lung Disorders Date Of Last Consultation TextBox");
	    	}
			
	    }
	    public void EnterLungDisordersDateOfDiagnos(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.4.dateOfDiagnosis')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.clear();
	    		Ele1.sendKeys(val);
	    		Ele1.sendKeys(Keys.TAB);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Lung Disorders Date Of Diagnos As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Lung Disorders Date Of Diagnos TextBox");
	    	}
			
	    }
	    public void EnterLungDisordersHospitalization(String val) throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("//input[contains(@id,'8122.4.hospitalizationDetails')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Lung Disorders Hospitalization Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Lung Disorders Hospitalization Details TextBox");
	    	}
			
	    }
	    public void ClickOnChestPainOther() throws InterruptedException {
	    	WebElement ChestPainEle=driver.findElement(By.xpath("//div[contains(text(),'Others')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, ChestPainEle, 20, "Element is Not Display");
	    	if (ChestPainEle.isDisplayed()) {
	    		ChestPainEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On Chest Pain Others  Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Chest Pain Others Button is not Display");
	    	}
			
	    } 
	    public void ClickOnSubmitButton() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("//span[contains(text(),'Submit')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On Submit Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Submit Button is not Display");
	    	}
			
	    } 
	    public void ClickOnImprovingButton() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("//div[contains(text(),'Improving')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On Improving Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Improving Button is not Display");
	    	}
			
	    } 
	    public void ClickOnInlineSaveButton() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("//span[contains(text(),'SAVE')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On Medication Save Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Medication Save Button is not Display");
	    	}
			
	    } 
	    public void ClickOnhaveYouEverHadYesButton() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//button[contains(@name,'641')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On 6. Have your ever had tests or investigations carried out in connection to this condition or been advised to do so in future e.g. x-ray, MRI, CT scan,etc.? Yes Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "6. Have your ever had tests or investigations carried out in connection to this condition or been advised to do so in future e.g. x-ray, MRI, CT scan,etc.? Yes Button is not Display");
	    	}
			
	    } 
	    public void ClickOnHasAnyOtherTreatmentYesButton() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//button[contains(@name,'6058')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On 5. Has any other treatment, test or investigation been carried out or been advised to do in future in connection with this condition e.g. blood test, x-ray, (RF) arthroscopy, surgery, therapy,etc.? Yes Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "5. Has any other treatment, test or investigation been carried out or been advised to do in future in connection with this condition e.g. blood test, x-ray, (RF) arthroscopy, surgery, therapy,etc.? Yes Button is not Display");
	    	}
			
	    } 
	    public void ClickOnHaveYouAdviceOPDYesButton() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//button[contains(@name,'6066')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On 6. Have you ever been or have been advised OPD follow up or hospitalization for this condition Yes Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "6. Have you ever been or have been advised OPD follow up or hospitalization for this condition Yes Button is not Display");
	    	}
			
	    } 
	    public void ClickOnSystemicManifestationYesButton() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//button[contains(@name,'68')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On 7. Any systemic manifestations e.g. CVD, Respiratory, anemia Yes Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "7. Any systemic manifestations e.g. CVD, Respiratory, anemia Yes Button is not Display");
	    	}
			
	    } 
	    public void ClickOnAddButton1() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//span[contains(text(),'Add')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On +Add Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "+Add Button is not Display");
	    	}
			
	    } 
	    public void ClickOnAddButton1haveYouEverHad() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//span[contains(text(),'Add')])[4]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On +Add Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "+Add Button is not Display");
	    	}
			
	    } 
	    public void ClickOnAddButton1haveYouEverBeen() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//span[contains(text(),'Add')])[7]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On +Add Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "+Add Button is not Display");
	    	}
			
	    } 
	    public void ClickOnAddButton2haveYouEverBeen() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//span[contains(text(),'Add')])[8]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On +Add Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "+Add Button is not Display");
	    	}
			
	    } 
	    public void ClickOnAddButton2haveYouEverHad() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//span[contains(text(),'Add')])[5]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On +Add Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "+Add Button is not Display");
	    	}
			
	    } 
	    public void ClickOnAddButton2() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//span[contains(text(),'Add')])[2]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On +Add Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "+Add Button is not Display");
	    	}
			
	    } 
	    public void ClickOnAddButton3() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//span[contains(text(),'Add')])[3]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On +Add Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "+Add Button is not Display");
	    	}
			
	    } 
	    public void ClickOnAddButton4() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//span[contains(text(),'Add')])[4]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On +Add Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "+Add Button is not Display");
	    	}
			
	    } 
	    public void ClickOnhaveYouEverHadAnyTestYesButton() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//button[contains(@name,'608')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On 7. Have you ever had any tests or investigations carried out? Yes  Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "7. Have you ever had any tests or investigations carried out? Yes Button is not Display");
	    	}
			
	    } 
	    public void ClickOnHaveYouEverBeenAdmittedYesButton() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//button[contains(@name,'610')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On 8. Have you ever been admitted to hospital or had out-patient follow-up for this condition Yes  Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "8. Have you ever been admitted to hospital or had out-patient follow-up for this condition Yes Button is not Display");
	    	}
			
	    } 
	    public void ClickOnfurtherTreatmentYesButton() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//button[contains(@name,'611')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On 9. Has any further treatment or investigation been discussed or contemplated? Yes  Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "9. Has any further treatment or investigation been discussed or contemplated? Yes Button is not Display");
	    	}
			
	    } 
	    public void ClickOnFrequencyButton() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("//div[contains(text(),'More Frequent')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On More Frequency  Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "More Frequency Button is not Display");
	    	}
			
	    } 
	    public void ClickOnAreYouDailyActivitiesButton() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//button[contains(@name,'6052')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On 3. d. Are your daily activities affected or restricted in any way? Yes Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "3. d. Are your daily activities affected or restricted in any way? Yes Button is not Display");
	    	}
			
	    } 
	    public void ClickOnAreYourSymptomsyesButton() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//button[contains(@name,'633')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On 4a. Are your symptoms ongoing? Yes Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "4a. Are your symptoms ongoing? Yes Button is not Display");
	    	}
			
	    } 
	    public void ClickOnHaveYouEverBeenyesButton() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//button[contains(@name,'645')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On 7. Have you ever been or have been advised OPD follow up or hospitalization for this condition? Yes Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "7. Have you ever been or have been advised OPD follow up or hospitalization for this condition? Yes Button is not Display");
	    	}
			
	    } 
	    public void ClickOnDoYouUseWalkingStickButton() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//button[contains(@name,'6054')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On 3. e. Do you use walking stick or other mobility aid? Yes Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "3. e. Do you use walking stick or other mobility aid? Yes Button is not Display");
	    	}
			
	    } 
	    public void ClickOnHaveYouEverTakenMedicationYesButton() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//button[contains(@name,'6056')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On 4. Have you ever taken or are currently taking medication for this conditions? Yes Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "4. Have you ever taken or are currently taking medication for this conditions? Yes Button is not Display");
	    	}
			
	    } 
	    public void EnterOther(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'paralysisOptionsQstDizzinessOtherDetailQst')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Other Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Other TextField Is Not Display ");
	    	}
			
	    } 
	    public void EnterOtherArthritis(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'6022')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Other Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Other TextField Is Not Display ");
	    	}
			
	    } 
	    public void EnterPleaseAdvice(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'630')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter 1. Please advise which joint/s or areas of the  body are/were affected Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "1. Please advise which joint/s or areas of the  body are/were affected TextField Is Not Display ");
	    	}
			
	    } 
	    public void EnterWhatWasUnderlyningCouse(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'631')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter 2. What was the underlying cause (e.g. accident, degeneration, recreational or sporting injury etc.) Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "2. What was the underlying cause (e.g. accident, degeneration, recreational or sporting injury etc.) TextField Is Not Display ");
	    	}
			
	    } 
	    public void EnterNameOfMedicine(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'name')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Name Of Medication Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Name Of Medication TextField Is Not Display ");
	    	}
			
	    } 
	    public void EnterInvestigation(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("(//input[contains(@id,'name')])[2]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Test/Investigation Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Test/Investigation TextField Is Not Display ");
	    	}
			
	    } 
	    public void EnterDoctorClinicHospital(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@id,'doctor')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Doctor/Clinic/Hospital Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Doctor/Clinic/Hospital TextField Is Not Display ");
	    	}
			
	    } 
	    public void EnterFurtherTreatment(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'612')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Specify Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL,"Specify TextField Is Not Display ");
	    	}
			
	    } 
	    public void EnterAdmittedAddress(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@id,'address')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Address Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Address TextField Is Not Display ");
	    	}
			
	    } 
	    public void EnterResult(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@id,'result')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Result Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Resulty TextField Is Not Display ");
	    	}
			
	    } 
	    public void EnterCurrentPast(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'currentPast')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter currentPast Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "currentPast TextField Is Not Display ");
	    	}
			
	    } 
	    public void EnterMedicationDose(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'dose')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter dose Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "dose TextField Is Not Display ");
	    	}
			
	    } 
	    public void EnterMedicationFrequency(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'frequency')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter frequency Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "frequency TextField Is Not Display ");
	    	}
			
	    } 
	    public void EnterHowOftenDoYouExperiance(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'604')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter How Ofter Dou You Experiance Suizure Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "How Ofter Dou You Experiance Suizure TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterWhichJointHaveBeenAffected(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'5001')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Which Joints Have Been Affected? Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Which Joints Have Been Affected? TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterAreYouDailyActivities(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'6053')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Are your daily activities affected or restricted in any way? Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Are your daily activities affected or restricted in any way? TextField Is Not Display ");
	    	}	
	    } 

	    public void EnterDoYouUseWalkingStick(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'6055')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Do you use walking stick or other mobility aid?  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Do you use walking stick or other mobility aid? TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterNameOfMedication1(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@id,'name')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "1. Enter name Of Medication  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "1. Name Of Medication TextField Is Not Display ");
	    	}	
	    } 
	   
	    public void EnterArthritisCurrentPast1(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@id,'currentPast')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "1. Enter Current/Past  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "1. Current/Past TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterArthritisDose1(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@id,'dose')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "1. Enter Dose  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "1. Dose TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterArthritisFrequency1(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@id,'frequency')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "1. Enter Frequency  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "1. Frequency TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterNameOfMedication2(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'6057[1].name')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "2. Enter name Of Medication  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "2. Name Of Medication TextField Is Not Display ");
	    	}	
	    } 
	   
	    public void EnterArthritisCurrentPast2(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'6057[1].currentPast')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "2. Enter Current/Past  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "2. Current/Past TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterArthritisDose2(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'6057[1].dose')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "2. Enter Dose  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "2. Dose TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterArthritisFrequency2(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'6057[1].frequency')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "2. Enter Frequency  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "2. Frequency TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterNameOfMedication2Musculosketetal(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'651[1].name')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "2. Enter name Of Medication  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "2. Name Of Medication TextField Is Not Display ");
	    	}	
	    } 
	   
	    public void EnterArthritisCurrentPast2Musculosketetal(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'651[1].currentPast')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "2. Enter Current/Past  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "2. Current/Past TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterArthritisDose2Musculosketetal(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'651[1].dose')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "2. Enter Dose  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "2. Dose TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterArthritisFrequency2Musculosketetal(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'651[1].frequency')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "2. Enter Frequency  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "2. Frequency TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterNameOfMedication3Musculosketetal(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'651[2].name')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "3. Enter name Of Medication  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "3. Name Of Medication TextField Is Not Display ");
	    	}	
	    } 
	   
	    public void EnterArthritisCurrentPast3Musculosketetal(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'651[2].currentPast')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "3. Enter Current/Past  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "3. Current/Past TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterTestInvestigationName(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'652[0].name')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Test/Investigation Name  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Enter Test/Investigation Name TextField Is Not Display ");
	    	}	
	    } 
	   
	    public void EnterResultMusculosketetal(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'652[0].result')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Result  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Enter Result TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterTestInvestigationName2(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'652[1].name')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "2. Enter Test/Investigation Name  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "2. Enter Test/Investigation Name TextField Is Not Display ");
	    	}	
	    } 
	   
	    public void EnterResultMusculosketetal2(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'652[1].result')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "2. Enter Result  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "2. Enter Result TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterProcedure1(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'653[0].name')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "1. Enter Procedure  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "1.  Procedure TextField Is Not Display ");
	    	}	
	    } 
	   
	    public void EnterLocation1(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'653[0].location')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "1. Enter Location  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "1. Location TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterResult1(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'653[0].result')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "1. Enter Result  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "1. Result TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterProcedure2(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'653[1].name')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "2. Enter Procedure  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "2.  Procedure TextField Is Not Display ");
	    	}	
	    } 
	   
	    public void EnterLocation2(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'653[1].location')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "2. Enter Location  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "2. Location TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterResult2(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'653[1].result')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "2. Enter Result  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "2. Result TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterProcedure3(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'653[2].name')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "3. Enter Procedure  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "3.  Procedure TextField Is Not Display ");
	    	}	
	    } 
	   
	    public void EnterLocation3(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'653[2].location')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "3. Enter Location  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "3. Location TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterResult3(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'653[2].result')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "3. Enter Result  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "3. Result TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterTestInvestigationName3(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'652[2].name')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "3. Enter Test/Investigation Name  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "3. Enter Test/Investigation Name TextField Is Not Display ");
	    	}	
	    } 
	   
	    public void EnterResultMusculosketetal3(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'652[2].result')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "3. Enter Result  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "3. Enter Result TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterArthritisDose3Musculosketetal(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'651[2].dose')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "3. Enter Dose  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "3. Dose TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterArthritisFrequency3Musculosketetal(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'651[2].frequency')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "3. Enter Frequency  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "3. Frequency TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterNameOfMedication3(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'6057[2].name')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "3. Enter name Of Medication  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "3. Name Of Medication TextField Is Not Display ");
	    	}	
	    } 
	   
	    public void EnterArthritisCurrentPast3(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'6057[2].currentPast')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "3. Enter Current/Past  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "3. Current/Past TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterArthritisDose3(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'6057[2].dose')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "3. Enter Dose  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "3. Dose TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterArthritisFrequency3(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'6057[2].frequency')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "3. Enter Frequency  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "3. Frequency TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterNameOfMedication4(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'6057[3].name')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "4. Enter name Of Medication  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "4. Name Of Medication TextField Is Not Display ");
	    	}	
	    } 
	   
	    public void EnterArthritisCurrentPast4(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'6057[3].currentPast')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "4. Enter Current/Past  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "4. Current/Past TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterArthritisDose4(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'6057[3].dose')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "4. Enter Dose  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "4. Dose TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterArthritisFrequency4(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'6057[3].frequency')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "4. Enter Frequency  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "4. Frequency TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterNameOfMedication5(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'6057[4].name')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "5. Enter name Of Medication  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "5. Name Of Medication TextField Is Not Display ");
	    	}	
	    } 
	   
	    public void EnterArthritisCurrentPast5(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'6057[4].currentPast')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "5. Enter Current/Past  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "5. Current/Past TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterArthritisDose5(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'6057[4].dose')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "5. Enter Dose  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "5. Dose TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterArthritisFrequency5(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'6057[4].frequency')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "5. Enter Frequency  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "5. Frequency TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterTreatmentTestInvestigation(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'6059[0].treatment')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Treatment/Test/Investigation  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Treatment/Test/Investigation TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterArthiritisResult(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'6059[0].result')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Result  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Result TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterHaveBeenAdviceOPD(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'6067')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Specify  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Specify TextField Is Not Display ");
	    	}	
	    } 
	    public void EntersyStemicManifestation(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'69')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Specify  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Specify TextField Is Not Display ");
	    	}	
	    } 
	    public void EnterAdditionalInformation(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'70')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Additional Information  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Additional Information  TextField Is Not Display ");
	    	}	
	    } 

	    public void EnterLocation(String val) throws InterruptedException {
	    	WebElement OtherEle=driver.findElement(By.xpath("//input[contains(@name,'6059[0].location')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, OtherEle, 20, "Element is Nor Display");
	    	if (OtherEle.isDisplayed()) {
	    		OtherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Location  Values As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Location TextField Is Not Display ");
	    	}	
	    } 

	    public void ClickOnHaveYouEverBeenToldYouHaveYesButton() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//button[contains(@name,'513')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On have You Ever Been told You Have Yes Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "have You Ever Been told You Have yes Button is not Display");
	    	}
			
	    } 
	    public void ClickOnDoYouDoRegularbloodSugarYesButton() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//button[contains(@name,'506')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On Do you Do regular Blood Sugar Yes Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Do you Do regular Blood Sugar yes Button is not Display");
	    	}
			
	    } 
	    public void ClickOnLessthan10OfCigarettesButton() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("//div[contains(text(),'Less than 10 of cigarettes')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On Less Than 10 Of Cigarettes Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Less Than 10 Of Cigarettes Button is not Display");
	    	}
			
	    } 
	    public void ClickOnAlertPopUpOKButton() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("//span[contains(text(),'OK')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On Alert PopUp OK Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Alert PopUp OK Button is not Display");
	    	}
			
	    } 
	    public void ClickOnHaveYouBeenToldChechBox() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//input[contains(@name,'514')])[2]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isEnabled()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On Heart Disease or condition CheckBox");

	    	} else {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Heart Disease or condition CheckBox");
	    	}
			
	    } 
	    public void EnterDetailsOfSymptoms(String val) throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("//input[contains(@id,'details')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Symtoms Details As=====>"+val);

	    	} else {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Symtoms Details");
	    	}
			
	    } 

	    public void ClickOnDoYouSmokeYesButton() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("(//button[contains(@name,'502')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On Do You Smoke Yes Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Do You Smoke Yes Button is not Display");
	    	}
			
	    } 

	    public void ClickOnTypeOfdiabetesYouAreSufferingCheckBox() throws InterruptedException {
	    	WebElement submitEle=driver.findElement(By.xpath("//input[contains(@value,'{\"optionId\":\"Q500A0\",\"text\":\"IDDM\"}')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, submitEle, 20, "Element is Not Display");
	    	if (submitEle.isDisplayed()) {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On IDDM CheckBox");

	    	} else {
	    		submitEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On IDDM CheckBox");
	 
	    	}
			
	    } 
	    public void ClickOnAreYouSmoker() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("(//button[contains(@name,'1002')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On 3. Are you smoker? Yes Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "3. Are you smoker? Yes Button is not Display");
	    	}
			
	    } 
	    public void ClickOnAreYouSymptomsPrecipitated() throws InterruptedException {
	    	WebElement Ele1=driver.findElement(By.xpath("(//button[contains(@name,'1005')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, Ele1, 20, "Element is Not Display");
	    	if (Ele1.isDisplayed()) {
	    		Ele1.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On 5. Are your symptoms precipitated by seasonal changes, exercise, respiratory infections,etc? Yes Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "5. Are your symptoms precipitated by seasonal changes, exercise, respiratory infections,etc? Yes Button is not Display");
	    	}
			
	    } 
	    public void EnterChestPainOther(String val) throws InterruptedException {
	    	WebElement otherEle=driver.findElement(By.xpath("//input[contains(@name,'151')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, otherEle, 20, "Element is Not Display");
	    	if (otherEle.isDisplayed()) {
	    		otherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Chest Pain Other Values As======>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Chest pain Other is not Display");
	    	}
			
	    }
	    public void ClearAndEnterChestPainOther(String val) throws InterruptedException {
	    	WebElement otherEle=driver.findElement(By.xpath("//input[contains(@name,'151')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, otherEle, 20, "Element is Not Display");
	    	if (otherEle.isDisplayed()) {
	    		
	    		otherEle.click();

	             for (int i = 0; i < 100; i++) {
	            	 otherEle.sendKeys(Keys.BACK_SPACE);
	            	 otherEle.sendKeys(" ");
	            	 otherEle.sendKeys(Keys.DELETE);


	             }  
	     
	    		otherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Chest Pain Other Values As======>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Chest pain Other is not Display");
	    	}
			
	    }
	    public void EnterHaveYouHadReccuerenceSymptoms(String val) throws InterruptedException {
	    	WebElement otherEle=driver.findElement(By.xpath("//input[contains(@name,'154')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, otherEle, 20, "Element is Not Display");
	    	if (otherEle.isDisplayed()) {
	    		otherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Have you had any recurrence of symptoms? Values As======>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Have you had any recurrence of symptoms? TextField is not Display");
	    	}
			
	    }
	    public void EnterTestOfInvestigation(String val) throws InterruptedException {
	    	WebElement otherEle=driver.findElement(By.xpath("//input[contains(@name,'156')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, otherEle, 20, "Element is Not Display");
	    	if (otherEle.isDisplayed()) {
	    		otherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Test Of Investigation Values As======>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Test Of Investigation  TextField is not Display");
	    	}
			
	    }
	    public void EnterMedication(String val) throws InterruptedException {
	    	WebElement medicationEle=driver.findElement(By.xpath("//input[contains(@name,'160')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, medicationEle, 20, "Element is Not Display");
	    	if (medicationEle.isDisplayed()) {
	    		medicationEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Medication Values As======>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Medication TextField is not Display");
	    	}
			
	    }
	    public void EnterDetailOfTreatment(String val) throws InterruptedException {
	    	WebElement medicationEle=driver.findElement(By.xpath("//input[contains(@name,'165')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, medicationEle, 20, "Element is Not Display");
	    	if (medicationEle.isDisplayed()) {
	    		medicationEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Detail Of Treatment Values As======>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Detail Of Treatment TextField is not Display");
	    	}
			
	    }
	    public void EnterMDoctorHospitalClinic(String val) throws InterruptedException {
	    	WebElement medicationEle=driver.findElement(By.xpath("//input[contains(@name,'166')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, medicationEle, 20, "Element is Not Display");
	    	if (medicationEle.isDisplayed()) {
	    		medicationEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Doctor/Hospital/Clinic Values As======>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Doctor/Hospital/Clinic TextField is not Display");
	    	}
			
	    }
	    public void EnterDose(String val) throws InterruptedException {
	    	WebElement otherEle=driver.findElement(By.xpath("//input[contains(@name,'161')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, otherEle, 20, "Element is Not Display");
	    	if (otherEle.isDisplayed()) {
	    		otherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Dose Values As======>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Dose TextField is not Display");
	    	}
			
	    }
	    public void EnterFrequency(String val) throws InterruptedException {
	    	WebElement otherEle=driver.findElement(By.xpath("//input[contains(@name,'162')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, otherEle, 20, "Element is Not Display");
	    	if (otherEle.isDisplayed()) {
	    		otherEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Frequency Values As======>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "frequency TextField is not Display");
	    	}
			
	    }
	    public void EnterRersult(String val) throws InterruptedException {
	    	WebElement resultEle=driver.findElement(By.xpath("//input[contains(@name,'158')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, resultEle, 20, "Element is Not Display");
	    	if (resultEle.isDisplayed()) {
	    		resultEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Result Values As======>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Result TextField is not Display");
	    	}
			
	    }
	    public void ClickOnHaveYouHadAnyReccurenceSymptoms() throws InterruptedException {
	    	WebElement yesEle=driver.findElement(By.xpath("(//button[contains(@name,'153')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, yesEle, 20, "Element is Not Display");
	    	if (yesEle.isDisplayed()) {
	    		yesEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On 3. Have you had any recurrence of symptoms?  Yes Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "3. Have you had any recurrence of symptoms? Yes Button is not Display");
	    	}
			
	    } 
	    public void VerifyByDefaultValue1() throws InterruptedException {
	    	WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@name,'155')])[2]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
	    	String gettext1 = valueEle1.getAttribute("aria-pressed");
	    	if (gettext1.equalsIgnoreCase("true")) {
	    		TestUtil.verifybgColor(valueEle1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "By Default 4. Please provide details of any tests or investigations that you have undergone, e.g. blood tests, chest x-rays, coronary angiogram, echocardiograph, electrocardiograph, endoscopy, exercise stress test etc. Value Selected As=====>NO");
	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "By Default 4. Please provide details of any tests or investigations that you have undergone, e.g. blood tests, chest x-rays, coronary angiogram, echocardiograph, electrocardiograph, endoscopy, exercise stress test etc. Value  Selected As=====>Yes");
	    	}
			
	    }
	    public void VerifyByDefaultValue5() throws InterruptedException {
	    	WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@name,'6058')])[2]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
	    	String gettext1 = valueEle1.getAttribute("aria-pressed");
	    	if (gettext1.equalsIgnoreCase("true")) {
	    		TestUtil.verifybgColor(valueEle1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "By Default 5. Has any other treatment, test or investigation been carried out or been advised to do in future in connection with this condition e.g. blood test, x-ray, (RF) arthroscopy, surgery, therapy,etc.? Value Selected As=====>NO");
	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "By Default 5. Has any other treatment, test or investigation been carried out or been advised to do in future in connection with this condition e.g. blood test, x-ray, (RF) arthroscopy, surgery, therapy,etc.? Value  Selected As=====>Yes");
	    	}
			
	    }
	    public void VerifyByDefaultValueHaveYouEverHad() throws InterruptedException {
	    	WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@name,'641')])[2]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
	    	String gettext1 = valueEle1.getAttribute("aria-pressed");
	    	if (gettext1.equalsIgnoreCase("true")) {
	    		TestUtil.verifybgColor(valueEle1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "By Default 6. Have your ever had tests or investigations carried out in connection to this condition or been advised to do so in future e.g. x-ray, MRI, CT scan,etc.? Value Selected As=====>NO");
	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "By Default 6. Have your ever had tests or investigations carried out in connection to this condition or been advised to do so in future e.g. x-ray, MRI, CT scan,etc.? Value  Selected As=====>Yes");
	    	}
			
	    }
	    public void VerifyByDefaultValueHaveYouEverBeen() throws InterruptedException {
	    	WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@name,'645')])[2]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
	    	String gettext1 = valueEle1.getAttribute("aria-pressed");
	    	if (gettext1.equalsIgnoreCase("true")) {
	    		TestUtil.verifybgColor(valueEle1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "By Default 7. Have you ever been or have been advised OPD follow up or hospitalization for this condition? Value Selected As=====>NO");
	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "By Default 7. Have you ever been or have been advised OPD follow up or hospitalization for this condition? Value  Selected As=====>Yes");
	    	}
			
	    }
	    public void VerifyHaveBeenAdviceOPDErrorMSG() throws InterruptedException {
	    	WebElement valueEle1 = driver.findElement(By.xpath("//p[contains(text(),'Please specify the details')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
	    	if (valueEle1.isDisplayed()) {
	    		TestUtil.verifybgColor(valueEle1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 6. Have you ever been or have been advised OPD follow up or hospitalization for this condition Mandatory Error Message");
	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified 6. Have you ever been or have been advised OPD follow up or hospitalization for this condition Mandatory Error Message");
	    	}
			
	    }
	    public void VerifySystemicManifestationErrorMSG() throws InterruptedException {
	    	WebElement valueEle1 = driver.findElement(By.xpath("//p[contains(text(),'Please specify the details')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
	    	if (valueEle1.isDisplayed()) {
	    		TestUtil.verifybgColor(valueEle1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 7. Any systemic manifestations e.g. CVD, Respiratory, anemia  Mandatory Error Message");
	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified 7. Any systemic manifestations e.g. CVD, Respiratory, anemia Mandatory Error Message");
	    	}
			
	    }
	    
	    public void VerifyByDefaultValue2() throws InterruptedException {
	    	WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@name,'159')])[2]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
	    	String gettext1 = valueEle1.getAttribute("aria-pressed");
	    	if (gettext1.equalsIgnoreCase("true")) {
	    		TestUtil.verifybgColor(valueEle1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "By Default 5. Please provide details of any medication taken for this condition Value Selected As=====>NO");
	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "By Default 5. Please provide details of any medication taken for this condition Value  Selected As=====>Yes");
	    	}
			
	    }
	    public void VerifyByDefaultValue3() throws InterruptedException {
	    	WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@name,'164')])[2]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
	    	String gettext1 = valueEle1.getAttribute("aria-pressed");
	    	if (gettext1.equalsIgnoreCase("true")) {
	    		TestUtil.verifybgColor(valueEle1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "By Default 6. Have you ever been admitted to hospital or had out-patient treatment for this condition Value Selected As=====>NO");
	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "By Default 6. Have you ever been admitted to hospital or had out-patient treatment for this condition Value  Selected As=====>Yes");
	    	}
			
	    }
	    public void VerifyByDefaultValueDoYouTakeMedicine() throws InterruptedException {
	    	WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@name,'1008')])[2]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
	    	String gettext1 = valueEle1.getAttribute("aria-pressed");
	    	if (gettext1.equalsIgnoreCase("true")) {
	    		TestUtil.verifybgColor(valueEle1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "By Default 7. Do you take medication or other treatment for this condition? Value Selected As=====>NO");
	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "By Default 7. Do you take medication or other treatment for this condition? Value  Selected As=====>Yes");
	    	}
			
	    }
	    public void VerifyByDefaultValueHaveYouEverHadAnyTest() throws InterruptedException {
	    	WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@name,'608')])[2]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
	    	String gettext1 = valueEle1.getAttribute("aria-pressed");
	    	if (gettext1.equalsIgnoreCase("true")) {
	    		TestUtil.verifybgColor(valueEle1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "By Default 7. Have you ever had any tests or investigations carried out? Value Selected As=====>NO");
	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "By Default 7. Have you ever had any tests or investigations carried out? Value  Selected As=====>Yes");
	    	}
			
	    }
	    public void VerifyByDefaultValueHaveYouEverBeenAdmitted() throws InterruptedException {
	    	WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@name,'610')])[2]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
	    	String gettext1 = valueEle1.getAttribute("aria-pressed");
	    	if (gettext1.equalsIgnoreCase("true")) {
	    		TestUtil.verifybgColor(valueEle1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "By Default 8. Have you ever been admitted to hospital or had out-patient follow-up for this condition Value Selected As=====>NO");
	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "By Default 8. Have you ever been admitted to hospital or had out-patient follow-up for this condition Value  Selected As=====>Yes");
	    	}
			
	    }
	    public void VerifyByDefaultValueFurtherTreatmentYesNoButton() throws InterruptedException {
	    	try {
	    		WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@name,'611')])[1]"));
	    		waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
		    	WebElement valueEle2 = driver.findElement(By.xpath("(//button[contains(@name,'611')])[2]"));
		   
		    	if (valueEle1.isDisplayed()) {
		    		TestUtil.verifybgColor(valueEle1, driver);
		    		CustomListner.test.log(LogStatus.INFO, "9. Has any further treatment or investigation been discussed or contemplated? Yes Button is Display ");
		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "9. Has any further treatment or investigation been discussed or contemplated? Yes Button is Not Display ");
		    	}
		    	if (valueEle2.isDisplayed()) {
		    		TestUtil.verifybgColor(valueEle2, driver);
		    		CustomListner.test.log(LogStatus.INFO, "9. Has any further treatment or investigation been discussed or contemplated? No Button is Display ");
		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "9. Has any further treatment or investigation been discussed or contemplated? No Button is Not Display ");
		    	}
	    	}catch(NoSuchElementException e) {
	    		CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element..");
	    	}
	    	
			
	    }
	    public void VerifyByDefaultValueAreTheseSymptomsYesNoButton() throws InterruptedException {
	    	try {
	    		WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@name,'6048')])[1]"));
	    		waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
		    	WebElement valueEle2 = driver.findElement(By.xpath("(//button[contains(@name,'6048')])[2]"));
		   
		    	if (valueEle1.isDisplayed()) {
		    		TestUtil.verifybgColor(valueEle1, driver);
		    		CustomListner.test.log(LogStatus.INFO, "3.a.i. Are these symptoms ongoing? Yes Button is Display ");
		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "3.a.i. Are these symptoms ongoing? Yes Button is Not Display ");
		    	}
		    	if (valueEle2.isDisplayed()) {
		    		TestUtil.verifybgColor(valueEle2, driver);
		    		CustomListner.test.log(LogStatus.INFO, "3.a.i. Are these symptoms ongoing? No Button is Display ");
		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "3.a.i. Are these symptoms ongoing? No Button is Not Display ");
		    	}
	    	}catch(NoSuchElementException e) {
	    		CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element..");
	    	}
	    	
			
	    }
	    public void VerifyByDefaultValueAreYourSymptomsOngoingYesNoButton() throws InterruptedException {
	    	try {
	    		WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@name,'633')])[1]"));
	    		waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
		    	WebElement valueEle2 = driver.findElement(By.xpath("(//button[contains(@name,'633')])[2]"));
		   
		    	if (valueEle1.isDisplayed()) {
		    		TestUtil.verifybgColor(valueEle1, driver);
		    		CustomListner.test.log(LogStatus.INFO, "4a. Are your symptoms ongoing? Yes Button is Display ");
		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "4a. Are your symptoms ongoing? Yes Button is Not Display ");
		    	}
		    	if (valueEle2.isDisplayed()) {
		    		TestUtil.verifybgColor(valueEle2, driver);
		    		CustomListner.test.log(LogStatus.INFO, "4a. Are your symptoms ongoing? No Button is Display ");
		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "4a. Are your symptoms ongoing? No Button is Not Display ");
		    	}
	    	}catch(NoSuchElementException e) {
	    		CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element..");
	    	}
	    	
			
	    }
	    public void VerifyByDefaultValueAreTheyWorseningSeverityYesNoButton() throws InterruptedException {
	    	try {
	    		WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@name,'6049')])[1]"));
	    		waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
		    	WebElement valueEle2 = driver.findElement(By.xpath("(//button[contains(@name,'6049')])[2]"));
		   
		    	if (valueEle1.isDisplayed()) {
		    		TestUtil.verifybgColor(valueEle1, driver);
		    		CustomListner.test.log(LogStatus.INFO, "3.a.ii. Are they worsening in severity? Yes Button is Display ");
		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "3.a.ii. Are they worsening in severity? Yes Button is Not Display ");
		    	}
		    	if (valueEle2.isDisplayed()) {
		    		TestUtil.verifybgColor(valueEle2, driver);
		    		CustomListner.test.log(LogStatus.INFO, "3.a.ii. Are they worsening in severity? No Button is Display ");
		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "3.a.ii. Are they worsening in severity?? No Button is Not Display ");
		    	}
	    	}catch(NoSuchElementException e) {
	    		CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element..");
	    	}
	    	
			
	    }
	    public void VerifyByDefaultValueAreYouDailyActivitiesYesNoButton() throws InterruptedException {
	    	try {
	    		WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@name,'6052')])[1]"));
	    		waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
		    	WebElement valueEle2 = driver.findElement(By.xpath("(//button[contains(@name,'6052')])[2]"));
		   
		    	if (valueEle1.isDisplayed()) {
		    		TestUtil.verifybgColor(valueEle1, driver);
		    		CustomListner.test.log(LogStatus.INFO, "3. d. Are your daily activities affected or restricted in any way? Yes Button is Display ");
		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "3. d. Are your daily activities affected or restricted in any way? Yes Button is Not Display ");
		    	}
		    	if (valueEle2.isDisplayed()) {
		    		TestUtil.verifybgColor(valueEle2, driver);
		    		CustomListner.test.log(LogStatus.INFO, "3. d. Are your daily activities affected or restricted in any way? No Button is Display ");
		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "3. d. Are your daily activities affected or restricted in any way? No Button is Not Display ");
		    	}
	    	}catch(NoSuchElementException e) {
	    		CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element..");
	    	}
	    	
			
	    }
	    public void VerifyByDefaultValueDoYouUseWalkingStickYesNoButton() throws InterruptedException {
	    	try {
	    		WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@name,'6054')])[1]"));
	    		waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
		    	WebElement valueEle2 = driver.findElement(By.xpath("(//button[contains(@name,'6054')])[2]"));
		   
		    	if (valueEle1.isDisplayed()) {
		    		TestUtil.verifybgColor(valueEle1, driver);
		    		CustomListner.test.log(LogStatus.INFO, "3. e. Do you use walking stick or other mobility aid? Yes Button is Display ");
		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "3. e. Do you use walking stick or other mobility aid? Yes Button is Not Display ");
		    	}
		    	if (valueEle2.isDisplayed()) {
		    		TestUtil.verifybgColor(valueEle2, driver);
		    		CustomListner.test.log(LogStatus.INFO, "3. e. Do you use walking stick or other mobility aid? No Button is Display ");
		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "3. e. Do you use walking stick or other mobility aid? No Button is Not Display ");
		    	}
	    	}catch(NoSuchElementException e) {
	    		CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element..");
	    	}
	    	
			
	    }
	    public void VerifyByDefaultValueHaveYouEverBeenAdviceOPDYesNoButton() throws InterruptedException {
	    	try {
	    		WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@name,'6066')])[1]"));
	    		waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
		    	WebElement valueEle2 = driver.findElement(By.xpath("(//button[contains(@name,'6066')])[2]"));
		   
		    	if (valueEle1.isDisplayed()) {
		    		TestUtil.verifybgColor(valueEle1, driver);
		    		CustomListner.test.log(LogStatus.INFO, "6. Have you ever been or have been advised OPD follow up or hospitalization for this condition Yes Button is Display ");
		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "6. Have you ever been or have been advised OPD follow up or hospitalization for this condition Yes Button is Not Display ");
		    	}
		    	if (valueEle2.isDisplayed()) {
		    		TestUtil.verifybgColor(valueEle2, driver);
		    		CustomListner.test.log(LogStatus.INFO, "6. Have you ever been or have been advised OPD follow up or hospitalization for this condition No Button is Display ");
		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "6. Have you ever been or have been advised OPD follow up or hospitalization for this condition No Button is Not Display ");
		    	}
	    	}catch(NoSuchElementException e) {
	    		CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element..");
	    	}
	    	
			
	    }
	    public void VerifyByDefaultValueSystemeticManifestationYesNoButton() throws InterruptedException {
	    	try {
	    		WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@name,'68')])[1]"));
	    		waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
		    	WebElement valueEle2 = driver.findElement(By.xpath("(//button[contains(@name,'68')])[2]"));
		   
		    	if (valueEle1.isDisplayed()) {
		    		TestUtil.verifybgColor(valueEle1, driver);
		    		CustomListner.test.log(LogStatus.INFO, "7. Any systemic manifestations e.g. CVD, Respiratory, anemia Yes Button is Display ");
		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "7. Any systemic manifestations e.g. CVD, Respiratory, anemia Yes Button is Not Display ");
		    	}
		    	if (valueEle2.isDisplayed()) {
		    		TestUtil.verifybgColor(valueEle2, driver);
		    		CustomListner.test.log(LogStatus.INFO, "7. Any systemic manifestations e.g. CVD, Respiratory, anemia No Button is Display ");
		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "7. Any systemic manifestations e.g. CVD, Respiratory, anemia No Button is Not Display ");
		    	}
	    	}catch(NoSuchElementException e) {
	    		CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element..");
	    	}
	    	
			
	    }
	    public void VerifyFurtherTreatmentErrorMsg() throws InterruptedException {
	    	try {
	    		WebElement valueEle1 = driver.findElement(By.xpath("//p[contains(text(),'Please specify the details')]"));
	    		waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
		    	if (valueEle1.isDisplayed()) {
		    		TestUtil.verifybgColor(valueEle1, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified 9. Has any further treatment or investigation been discussed or contemplated? Mandatory Error Message");
		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "9. Has any further treatment or investigation been discussed or contemplated? Mandatory Error Message");
		    	}
		    	
	    	}catch(NoSuchElementException e) {
	    		CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element..");
	    	}
	    	
			
	    }
	    public void VerifyTenthQuestion() throws InterruptedException {
	    	try {
	    		WebElement valueEle1 = driver.findElement(By.xpath("//input[contains(@name,'613')]"));
	    		waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
		    	if (valueEle1.isDisplayed()) {
		    		TestUtil.verifybgColor(valueEle1, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 10. Additional Information");
		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 10. Additional Information");
		    	}
		    	
	    	}catch(NoSuchElementException e) {
	    		CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element..");
	    	}
	    	
			
	    }
//	    public void VerifyByDefaultValuePleaseProvideNameAndAddress() throws InterruptedException {
//	    	WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@name,'1012')])[2]"));
//	    	String gettext1 = valueEle1.getAttribute("aria-pressed");
//	    	if (gettext1.equalsIgnoreCase("true")) {
//	    		TestUtil.verifybgColor(valueEle1, driver);
//	    		CustomListner.test.log(LogStatus.INFO, "By Default 8. Have you undergone any investigation or have been advised any treatment or investigation? Value Selected As=====>NO");
//	    	} else {
//	    		CustomListner.test.log(LogStatus.FAIL, "By Default 8. Have you undergone any investigation or have been advised any treatment or investigation? Value  Selected As=====>Yes");
//	    	}
//			
//	    }
	    public void VerifyPleaseProvideNameAndAddressErrorMSG() throws InterruptedException {
	    	WebElement valueEle1 = driver.findElement(By.xpath("(//p[contains(text(),'Enter the treatment details”')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
	    	WebElement valueEle2 = driver.findElement(By.xpath("(//p[contains(text(),'Enter the treatment details”')])[2]"));
	    	WebElement valueEle3 = driver.findElement(By.xpath("//p[contains(@id,'day1016-helper-text')]"));
	    	WebElement valueEle4 = driver.findElement(By.xpath("//p[contains(@id,'month1016-helper-text')]"));
	    	WebElement valueEle5 = driver.findElement(By.xpath("//p[contains(@id,'year1016-helper-text')]"));
	    	
	    	if (valueEle1.isDisplayed()) {
	    		TestUtil.verifybgColor(valueEle1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Doctor/Hospital/Clinic  Mandatory Error Message");
	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Doctor/Hospital/Clinic  Mandatory Error Message");
	    	}
	    	if (valueEle2.isDisplayed()) {
	    		TestUtil.verifybgColor(valueEle2, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Address  Mandatory Error Message");
	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Address  Mandatory Error Message");
	    	}
	    	if (valueEle3.isDisplayed()) {
	    		TestUtil.verifybgColor(valueEle3, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Date Of Last Consultation Day Mandatory Error Message");
	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Date Of Last Consultation Day Mandatory Error Message");
	    	}
	    	if (valueEle4.isDisplayed()) {
	    		TestUtil.verifybgColor(valueEle4, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Date Of Last Consultation Month Mandatory Error Message");
	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Date Of Last Consultation Month Mandatory Error Message");
	    	}
	    	if (valueEle5.isDisplayed()) {
	    		TestUtil.verifybgColor(valueEle5, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Date Of Last Consultation Year Mandatory Error Message");
	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Date Of Last Consultation Year Mandatory Error Message");
	    	}
			
	    }
	    public void ClickOnDoYouTakeMedicineOrOther() throws InterruptedException {
	    	WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@name,'1008')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
	    	if (valueEle1.isDisplayed()) {
	    		valueEle1.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on Do you take medication or other treatment for this condition? Yes Button");
	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Do you take medication or other treatment for this condition? Yes Button");
	    	}
			
	    }
	    public void ClickOnHaveYouTakenTime() throws InterruptedException {
	    	WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@name,'1017')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
	    	if (valueEle1.isDisplayed()) {
	    		valueEle1.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click on 10. Have you taken time off work with this condition? Yes Button");
	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 10. Have you taken time off work with this condition? Yes Button");
	    	}
			
	    }
	    public void VerifyByDefaultValue4() throws InterruptedException {
	    	WebElement valueEle1 = driver.findElement(By.xpath("(//button[contains(@name,'168')])[2]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, valueEle1, 20, "Element is Not Display");
	    	String gettext1 = valueEle1.getAttribute("aria-pressed");
	    	if (gettext1.equalsIgnoreCase("true")) {
	    		TestUtil.verifybgColor(valueEle1, driver);
	    		CustomListner.test.log(LogStatus.INFO, "By Default 7. Have any further treatement or follow-up been discussed, recommended or otherwise contemplated? Value Selected As=====>NO");
	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "By Default 7. Have any further treatement or follow-up been discussed, recommended or otherwise contemplated? Value  Selected As=====>Yes");
	    	}
			
	    }
	   
	    public void ClickOnPleaseProvideDetailsOfTest() throws InterruptedException {
	    	WebElement yesEle=driver.findElement(By.xpath("(//button[contains(@name,'155')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, yesEle, 20, "Element is Not Display");
	    	if (yesEle.isDisplayed()) {
	    		yesEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On 4. Please provide details of any tests or investigations that you have undergone, e.g. blood tests, chest x-rays, coronary angiogram, echocardiograph, electrocardiograph, endoscopy, exercise stress test etc.  Yes Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "4. Please provide details of any tests or investigations that you have undergone, e.g. blood tests, chest x-rays, coronary angiogram, echocardiograph, electrocardiograph, endoscopy, exercise stress test etc. Yes Button is not Display");
	    	}
			
	    } 
	    public void ClickOnPleaseProvideDetailOfMedicine() throws InterruptedException {
	    	WebElement yesEle=driver.findElement(By.xpath("(//button[contains(@name,'159')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, yesEle, 20, "Element is Not Display");
	    	if (yesEle.isDisplayed()) {
	    		yesEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On 5. Please provide details of any medication taken for this condition  Yes Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "5. Please provide details of any medication taken for this condition Yes Button is not Display");
	    	}
			
	    }
	    public void ClickOnHaveYouEverBeenAdmitted() throws InterruptedException {
	    	WebElement yesEle=driver.findElement(By.xpath("(//button[contains(@name,'164')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, yesEle, 20, "Element is Not Display");
	    	if (yesEle.isDisplayed()) {
	    		yesEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On 6. Have you ever been admitted to hospital or had out-patient treatment for this condition  Yes Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "6. Have you ever been admitted to hospital or had out-patient treatment for this condition Yes Button is not Display");
	    	}
			
	    } 
	    public void ClickOnHaveYouFurtherTreatmentFollowUp() throws InterruptedException {
	    	WebElement yesEle=driver.findElement(By.xpath("(//button[contains(@name,'168')])[1]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, yesEle, 20, "Element is Not Display");
	    	if (yesEle.isDisplayed()) {
	    		yesEle.click();
	    		CustomListner.test.log(LogStatus.INFO, "Click On 7. Have any further treatement or follow-up been discussed, recommended or otherwise contemplated?  Yes Button");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "7. Have any further treatement or follow-up been discussed, recommended or otherwise contemplated? Yes Button is not Display");
	    	}
			
	    } 
	    public void EnterHaveYouFurtherTreatmentFollowUp(String val) throws InterruptedException {
	    	WebElement yesEle=driver.findElement(By.xpath("//input[contains(@name,'169')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, yesEle, 20, "Element is Not Display");
	    	if (yesEle.isDisplayed()) {
	    		yesEle.sendKeys(val);
	    		CustomListner.test.log(LogStatus.INFO, "Enter Provide Details As=====>"+val);

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Provide Details");
	    	}
			
	    } 
	    public void VerifyMandatoryFieldMSG() throws InterruptedException {
	    	WebElement mandatoryEle=driver.findElement(By.xpath("//p[contains(text(),'Please specify the details')]"));
	    	waitUtils.waitForElementToBeVisibleweb(driver, mandatoryEle, 20, "Element is Not Display");
	    	if (mandatoryEle.isDisplayed()) {
	    		TestUtil.verifybgColor(mandatoryEle, driver);
	    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Mandatory Error MSG");

	    	} else {
	    		CustomListner.test.log(LogStatus.FAIL, "Mandatory Error MSG is Not Display");
	    	}
			
	    } 
	    public void VerifyAllSaveChestPainField() throws InterruptedException {
	  
	    		
	    		try {
	    			WebElement ele1=driver.findElement(By.xpath("//input[contains(@name,'151')]"));
	    			waitUtils.waitForElementToBeVisibleweb(driver, ele1, 20, "Element is Not Display");
	    			WebElement ele2=driver.findElement(By.xpath("//input[contains(@name,'154')]"));
	    			WebElement ele3=driver.findElement(By.xpath("//input[contains(@name,'156')]"));
	    			WebElement ele4=driver.findElement(By.xpath("//input[contains(@name,'158')]"));
	    			WebElement ele5=driver.findElement(By.xpath("//input[contains(@name,'160')]"));
	    			WebElement ele6=driver.findElement(By.xpath("//input[contains(@name,'161')]"));
	    			WebElement ele7=driver.findElement(By.xpath("//input[contains(@name,'162')]"));
	    			WebElement ele8=driver.findElement(By.xpath("//input[contains(@name,'165')]"));
	    			WebElement ele9=driver.findElement(By.xpath("//input[contains(@name,'166')]"));
	    		
		    		if (ele1.isDisplayed()) {
		    			String val=ele1.getAttribute("value");
			    		TestUtil.verifybgColor(ele1, driver);
			    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 1. Please state the diagnosis Other TextFields As=====>"+val);

			    	} else {
			    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 1. Please state the diagnosis Other TextFields");
			    	}
		    		TestUtil.scrollToElement(driver, ele4);
		    		Thread.sleep(2000);
		    		if (ele2.isDisplayed()) {
		    			String val=ele2.getAttribute("value");
			    		TestUtil.verifybgColor(ele2, driver);
			    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 3. Have you had any recurrence of symptoms? TextFields As=====>"+val);

			    	} else {
			    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 3. Have you had any recurrence of symptoms? TextFields");
			    	}
		    		WebElement CurrentsysEle1 = driver.findElement(By.xpath("//div[contains(text(),'3. Have you had any recurrence of symptoms?')]"));
		    		TestUtil.scrollToElement(driver, CurrentsysEle1);
		    		Thread.sleep(2000);
		    		if (ele3.isDisplayed()) {
		    			String val=ele3.getAttribute("value");
			    		TestUtil.verifybgColor(ele3, driver);
			    		CustomListner.test.log(LogStatus.INFO, "Successfully Display Test Or Investigation  TextFields As=====>"+val);

			    	} else {
			    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Test Or Investigation  TextFields TextFields");
			    	}
		    		if (ele4.isDisplayed()) {
		    			String val=ele4.getAttribute("value");
			    		TestUtil.verifybgColor(ele4, driver);
			    		CustomListner.test.log(LogStatus.INFO, "Successfully Display Result TextFields As=====>"+val);

			    	} else {
			    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display result TextFields");
			    	}
		    		WebElement CurrentsysEle2 = driver.findElement(By.xpath("//div[contains(text(),'6. Have you ever been admitted to hospital or had out-patient treatment for this condition')]"));
		    		TestUtil.scrollToElement(driver, CurrentsysEle2);
		    		Thread.sleep(2000);
		    		if (ele5.isDisplayed()) {
		    			String val=ele5.getAttribute("value");
			    		TestUtil.verifybgColor(ele5, driver);
			    		CustomListner.test.log(LogStatus.INFO, "Successfully Display Medication TextFields As=====>"+val);

			    	} else {
			    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Medication TextFields");
			    	}
		    		if (ele6.isDisplayed()) {
		    			String val=ele6.getAttribute("value");
			    		TestUtil.verifybgColor(ele6, driver);
			    		CustomListner.test.log(LogStatus.INFO, "Successfully Display Dose TextFields As=====>"+val);

			    	} else {
			    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Dose TextFields");
			    	}
		    		if (ele7.isDisplayed()) {
		    			String val=ele7.getAttribute("value");
			    		TestUtil.verifybgColor(ele7, driver);
			    		CustomListner.test.log(LogStatus.INFO, "Successfully Display Frequency TextFields As=====>"+val);

			    	} else {
			    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Frequency TextFields");
			    	}
		    		WebElement CurrentsysEle3 = driver.findElement(By.xpath("//div[contains(text(),'7. Have any further treatement or follow-up been discussed, recommended or otherwise contemplated?')]"));
		    		TestUtil.scrollToElement(driver, CurrentsysEle3);
		    		Thread.sleep(2000);
		    		if (ele8.isDisplayed()) {
		    			String val=ele8.getAttribute("value");
			    		TestUtil.verifybgColor(ele8, driver);
			    		CustomListner.test.log(LogStatus.INFO, "Successfully Display Detail Of Treatment TextFields As=====>"+val);

			    	} else {
			    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Detail Of Treatment TextFields");
			    	}
		    		if (ele9.isDisplayed()) {
		    			String val=ele9.getAttribute("value");
			    		TestUtil.verifybgColor(ele9, driver);
			    		CustomListner.test.log(LogStatus.INFO, "Successfully Display Doctor/Hospital/Clinic TextFields As=====>"+val);

			    	} else {
			    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display Doctor/Hospital/Clinic TextFields");
			    	}
		    		
	    			
	    		}catch(NoSuchElementException e) {
	    			CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element");
	    		}
	    		
	   
			
	    } 
	    public void VerifyAllSaveAsthamaField() throws InterruptedException {
	  	  
    		
    		try {
    			WebElement ele1=driver.findElement(By.xpath("//input[contains(@name,'1000')]"));
    			waitUtils.waitForElementToBeVisibleweb(driver, ele1, 20, "Element is Not Display");
    			WebElement ele2=driver.findElement(By.xpath("//input[contains(@name,'asthmaSmokerDetailsQst')]"));
    			WebElement ele3=driver.findElement(By.xpath("//input[contains(@name,'1004')]"));
    			WebElement ele4=driver.findElement(By.xpath("//input[contains(@name,'asthmaInfectionDetailsQst')]"));
    			WebElement ele5=driver.findElement(By.xpath("//input[contains(@name,'asthmaMedicationDetailsQst')]"));
    			WebElement ele6=driver.findElement(By.xpath("//input[contains(@name,'asthmaDoseDetailsQst')]"));
    			WebElement ele7=driver.findElement(By.xpath("//input[contains(@name,'asthmaFrequencyDetailsQst')]"));
    			WebElement ele8=driver.findElement(By.xpath("//input[contains(@name,'1014')]"));
    			WebElement ele9=driver.findElement(By.xpath("//input[contains(@name,'1015')]"));
    			WebElement ele10=driver.findElement(By.xpath("//input[contains(@name,'asthmaOffWorkDetailsQst')]"));
	    		if (ele1.isDisplayed()) {
	    			String val=ele1.getAttribute("value");
		    		TestUtil.verifybgColor(ele1, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 1. Condition of you are suffering from TextFields As=====>"+val);

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 1. Condition of you are suffering from TextFields");
		    	}
	    		WebElement CurrentsysEle1 = driver.findElement(By.xpath("//div[contains(text(),'5. Are your symptoms precipitated by seasonal changes, exercise, respiratory infections,etc?')]"));
	    		TestUtil.scrollToElement(driver, CurrentsysEle1);
	    		Thread.sleep(2000);
	   
	    		if (ele2.isDisplayed()) {
	    			String val=ele2.getAttribute("value");
		    		TestUtil.verifybgColor(ele2, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 3. Are you smoker? TextFields As=====>"+val);

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 3. Are you smoker? TextFields");
		    	}
	    		
	    		if (ele3.isDisplayed()) {
	    			String val=ele3.getAttribute("value");
		    		TestUtil.verifybgColor(ele3, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 4. Indicate frequency of your symptoms  TextFields As=====>"+val);

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 4. Indicate frequency of your symptoms TextFields");
		    	}
	    		if (ele4.isDisplayed()) {
	    			String val=ele4.getAttribute("value");
		    		TestUtil.verifybgColor(ele4, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 5. Are your symptoms precipitated by seasonal changes, exercise, respiratory infections,etc? TextFields As=====>"+val);

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 5. Are your symptoms precipitated by seasonal changes, exercise, respiratory infections,etc? TextFields");
		    	}
	    		WebElement CurrentsysEle2 = driver.findElement(By.xpath("//div[contains(text(),'8. Have you undergone any investigation or have been advised any treatment or investigation?')]"));
	    		TestUtil.scrollToElement(driver, CurrentsysEle2);
	    		Thread.sleep(2000);
	    		if (ele5.isDisplayed()) {
	    			String val=ele5.getAttribute("value");
		    		TestUtil.verifybgColor(ele5, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 7. Do you take medication or other treatment for this condition? Medication TextFields As=====>"+val);

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 7. Do you take medication or other treatment for this condition? Medication TextFields");
		    	}
	    		if (ele6.isDisplayed()) {
	    			String val=ele6.getAttribute("value");
		    		TestUtil.verifybgColor(ele6, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 7. Do you take medication or other treatment for this condition? Dose TextFields As=====>"+val);

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 7. Do you take medication or other treatment for this condition? Dose TextFields");
		    	}
	    		if (ele7.isDisplayed()) {
	    			String val=ele7.getAttribute("value");
		    		TestUtil.verifybgColor(ele7, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 7. Do you take medication or other treatment for this condition? Frequency TextFields As=====>"+val);

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 7. Do you take medication or other treatment for this condition? Frequency TextFields");
		    	}
	    		WebElement CurrentsysEle3 = driver.findElement(By.xpath("//label[contains(text(),'Date of Last consultation')]"));
	    		TestUtil.scrollToElement(driver, CurrentsysEle3);
	    		Thread.sleep(2000);
	    		if (ele8.isDisplayed()) {
	    			String val=ele8.getAttribute("value");
		    		TestUtil.verifybgColor(ele8, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 9. Please provide the name and address of the doctors and/or specialists you see in relation to this condition Doctor/Hospital/Clinic TextFields As=====>"+val);

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 9. Please provide the name and address of the doctors and/or specialists you see in relation to this condition Doctor/Hospital/Clinic TextFields");
		    	}
	    		if (ele9.isDisplayed()) {
	    			String val=ele9.getAttribute("value");
		    		TestUtil.verifybgColor(ele9, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 9. Please provide the name and address of the doctors and/or specialists you see in relation to this condition Address TextFields As=====>"+val);

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 9. Please provide the name and address of the doctors and/or specialists you see in relation to this condition Address TextFields");
		    	}
	    		if (ele10.isDisplayed()) {
	    			String val=ele10.getAttribute("value");
		    		TestUtil.verifybgColor(ele10, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Display 10. Have you taken time off work with this condition? TextFields As=====>"+val);

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Failed To Display 10. Have you taken time off work with this condition? TextFields");
		    	}
    			
    		}catch(NoSuchElementException e) {
    			CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element");
    		}
    		
   
		
    } 
	    public void VerifyOtherFieldMSG() throws InterruptedException {
	    	try {
	    		WebElement mandatoryEle=driver.findElement(By.xpath("//p[contains(text(),'Maximum 100 characters')]"));
	    		waitUtils.waitForElementToBeVisibleweb(driver, mandatoryEle, 20, "Element is Not Display");
	    		if (mandatoryEle.isDisplayed()) {
		    		TestUtil.verifybgColor(mandatoryEle, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified state the diagnosis Madatory Field Error MSG");

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "state the diagnosis Madatory Field Error MSG is Not Display");
		    	}
	    	}catch(NoSuchElementException e) {
	    		CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element Maximum 100 characters");
	    	}
	    	
			
	    } 
	    public void VerifyHaveYouHadAnyReccurenceFieldMSG() throws InterruptedException {
	    	try {
	    		WebElement mandatoryEle=driver.findElement(By.xpath("//p[contains(text(),'Please specify the details')]"));
	    		waitUtils.waitForElementToBeVisibleweb(driver, mandatoryEle, 20, "Element is Not Display");
	    		if (mandatoryEle.isDisplayed()) {
		    		TestUtil.verifybgColor(mandatoryEle, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Have you had any recurrence of symptoms? Madatory Field Error MSG");

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Have you had any recurrence of symptoms? Madatory Field Error MSG is Not Display");
		    	}
	    	}catch(NoSuchElementException e) {
	    		CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element");
	    	}
	    	
			
	    } 
	    public void VerifyTestOfInvestigationErrorMSG() throws InterruptedException {
	    	try {
	    		WebElement mandatoryEle1=driver.findElement(By.xpath("(//p[contains(text(),'Please specify the details')])[1]"));
	    		waitUtils.waitForElementToBeVisibleweb(driver, mandatoryEle1, 20, "Element is Not Display");
	    		WebElement mandatoryEle2=driver.findElement(By.xpath("(//p[contains(text(),'Enter Day')])[1]"));
	    		WebElement mandatoryEle3=driver.findElement(By.xpath("(//p[contains(text(),'Enter month')])[1]"));
	    		WebElement mandatoryEle4=driver.findElement(By.xpath("(//p[contains(text(),'Enter year')])[1]"));
	    		WebElement mandatoryEle5=driver.findElement(By.xpath("(//p[contains(text(),'Please specify the details')])[2]"));
		    	if (mandatoryEle1.isDisplayed()) {
		    		TestUtil.verifybgColor(mandatoryEle1, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Test Of Investigation Madatory Field Error MSG");

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Test Of Investigation Madatory Field Error MSG is Not Display");
		    	}
		    	if (mandatoryEle2.isDisplayed()) {
		    		TestUtil.verifybgColor(mandatoryEle2, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Enter Day Madatory Field Error MSG");

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Enter Day Madatory Field Error MSG is Not Display");
		    	}
		    	if (mandatoryEle3.isDisplayed()) {
		    		TestUtil.verifybgColor(mandatoryEle3, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Enter Month Madatory Field Error MSG");

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Enter Month Madatory Field Error MSG is Not Display");
		    	}
		    	if (mandatoryEle4.isDisplayed()) {
		    		TestUtil.verifybgColor(mandatoryEle4, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Enter Year Madatory Field Error MSG");

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Enter Year Madatory Field Error MSG is Not Display");
		    	}
		    	if (mandatoryEle5.isDisplayed()) {
		    		TestUtil.verifybgColor(mandatoryEle5, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Result Madatory Field Error MSG");

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Result Madatory Field Error MSG is Not Display");
		    	}
	    	}catch(NoSuchElementException e) {
	    		CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element");
	    	}
	    	
			
	    } 
	    public void VerifyProvideDetailOfMedicineErrorMSG() throws InterruptedException {
	    	try {
	    		WebElement mandatoryEle1=driver.findElement(By.xpath("(//p[contains(text(),'Please specify the details')])[1]"));
	    		waitUtils.waitForElementToBeVisibleweb(driver, mandatoryEle1, 20, "Element is Not Display");
	    		WebElement mandatoryEle2=driver.findElement(By.xpath("(//p[contains(text(),'Please specify the details')])[2]"));
	    		WebElement mandatoryEle3=driver.findElement(By.xpath("(//p[contains(text(),'Please specify the details')])[3]"));
	    		WebElement mandatoryEle4=driver.findElement(By.xpath("(//p[contains(text(),'Enter Day')])[1]"));
	    		WebElement mandatoryEle5=driver.findElement(By.xpath("(//p[contains(text(),'Enter month')])[1]"));
	    		WebElement mandatoryEle6=driver.findElement(By.xpath("(//p[contains(text(),'Enter year')])[1]"));
	    		
		    	if (mandatoryEle1.isDisplayed()) {
		    		TestUtil.verifybgColor(mandatoryEle1, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Medicine Madatory Field Error MSG");

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Medicine Madatory Field Error MSG is Not Display");
		    	}
		    	if (mandatoryEle2.isDisplayed()) {
		    		TestUtil.verifybgColor(mandatoryEle2, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Dose Madatory Field Error MSG");

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Dose Madatory Field Error MSG is Not Display");
		    	}
		    	if (mandatoryEle3.isDisplayed()) {
		    		TestUtil.verifybgColor(mandatoryEle3, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Frequency Madatory Field Error MSG");

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Frequency Madatory Field Error MSG is Not Display");
		    	}
		    	if (mandatoryEle4.isDisplayed()) {
		    		TestUtil.verifybgColor(mandatoryEle4, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Date Of Last Taken Day Madatory Field Error MSG");

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Date Of Last Taken Day Madatory Field Error MSG is Not Display");
		    	}
		    	if (mandatoryEle5.isDisplayed()) {
		    		TestUtil.verifybgColor(mandatoryEle5, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Date Of Last Taken Month Madatory Field Error MSG");

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Date Of Last Taken Month Madatory Field Error MSG is Not Display");
		    	}
		    	if (mandatoryEle6.isDisplayed()) {
		    		TestUtil.verifybgColor(mandatoryEle6, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Date Of Last Taken Year Madatory Field Error MSG");

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Date Of Last Taken Year Madatory Field Error MSG is Not Display");
		    	}
	    	}catch(NoSuchElementException e) {
	    		CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element");
	    	}
	    	
			
	    } 
	    public void VerifyHaveYouEverBeenAdmittedErrorMSG() throws InterruptedException {
	    	try {
	    		WebElement mandatoryEle1=driver.findElement(By.xpath("(//p[contains(text(),'Please specify the details')])[1]"));
	    		waitUtils.waitForElementToBeVisibleweb(driver, mandatoryEle1, 20, "Element is Not Display");
	    		WebElement mandatoryEle2=driver.findElement(By.xpath("(//p[contains(text(),'Please specify the details')])[2]"));
	    		WebElement mandatoryEle3=driver.findElement(By.xpath("(//p[contains(text(),'Enter Day')])[1]"));
	    		WebElement mandatoryEle4=driver.findElement(By.xpath("(//p[contains(text(),'Enter month')])[1]"));
	    		WebElement mandatoryEle5=driver.findElement(By.xpath("(//p[contains(text(),'Enter year')])[1]"));
	    		
		    	if (mandatoryEle1.isDisplayed()) {
		    		TestUtil.verifybgColor(mandatoryEle1, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Detail of Treatment Madatory Field Error MSG");

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Detail of Treatment Madatory Field Error MSG is Not Display");
		    	}
		    	if (mandatoryEle2.isDisplayed()) {
		    		TestUtil.verifybgColor(mandatoryEle2, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Doctor/Hospital/Clinic Madatory Field Error MSG");

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Doctor/Hospital/Clinic Madatory Field Error MSG is Not Display");
		    	}
		    	if (mandatoryEle3.isDisplayed()) {
		    		TestUtil.verifybgColor(mandatoryEle3, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Date Of Last Taken Day Madatory Field Error MSG");

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Date Of Last Taken Day Madatory Field Error MSG is Not Display");
		    	}
		    	if (mandatoryEle4.isDisplayed()) {
		    		TestUtil.verifybgColor(mandatoryEle4, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Date Of Last Taken Month Madatory Field Error MSG");

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Date Of Last Taken Month Madatory Field Error MSG is Not Display");
		    	}
		    	if (mandatoryEle5.isDisplayed()) {
		    		TestUtil.verifybgColor(mandatoryEle5, driver);
		    		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Date Of Last Taken Year Madatory Field Error MSG");

		    	} else {
		    		CustomListner.test.log(LogStatus.FAIL, "Date Of Last Taken Year Madatory Field Error MSG is Not Display");
		    	}
		    	
	    	}catch(NoSuchElementException e) {
	    		CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element");
	    	}
	    	
			
	    } 
	    public void EnterOtherSymptomsDateOfLastConsult(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@name,'day8109')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Last Consult Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@name,'month8109')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Last Consult month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@name,'year8109')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Last Consult year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.ENTER);
			
		}
	    public void EnterSOtherSymptomsDateOfDiagnosis(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@name,'day8110')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Diagnosis Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@name,'month8110')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Diagnosis month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@name,'year8110')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Diagnosis year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.ENTER);
			
		}
	    public void EnterForFemaleLivesOnlyDateOfLastConsult(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@name,'day8136')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Last Consult Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@name,'month8136')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Last Consult month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@name,'year8136')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Last Consult year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.ENTER);
			
		}
	    public void EnterdateOnWhichYourDiabetesdiagnos(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@id,'day501')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.clear();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter Date on which your diabetes was diagnosed Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@id,'month501')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter Date on which your diabetes was diagnosed month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@id,'year501')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter Date on which your diabetes was diagnosed year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.TAB);
			
		}
	    public void EnterDoYouDoRegularBloodSugar(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@id,'day507')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.clear();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter Do You Do Regular Blood Sugar Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@id,'month507')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter Do You Do Regular Blood Sugarmonth  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@id,'year507')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter Do You Do Regular Blood Sugar year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.TAB);
			
		}
	    public void EnterWhenWasConditionDate(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@id,'day603')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.clear();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter When Was Condition Diagnos Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@id,'month603')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter When Was Condition Diagnos month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@id,'year603')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter When Was Condition Diagnos year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.TAB);
			
		}
	    public void EnterWhenDidYouFirstExperianceDate(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@id,'day44')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.clear();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter When did you first experience symptoms? Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@id,'month44')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter When did you first experience symptoms? month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@id,'year44')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter When did you first experience symptoms? year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.TAB);
			
		}
	    public void EnterWhenDidYouFirstExperianceMusculossketetalDate(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@id,'day632')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.clear();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter When did you first experience symptoms? Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@id,'month632')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter When did you first experience symptoms? month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@id,'year632')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter When did you first experience symptoms? year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.TAB);
			
		}
	    public void EnterWhenDidYouLastExperianceDate(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@id,'day50')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.clear();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter When did you Last experience symptoms? Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@id,'month50')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter When did you Last experience symptoms? month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@id,'year50')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter When did you Last experience symptoms? year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.TAB);
			
		}
	    public void EnterIfYouAreNoLongerDate(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@id,'day635')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.clear();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter If you are no longer experiencing symptoms, when did they last occur? Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@id,'month635')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter If you are no longer experiencing symptoms, when did they last occur? month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@id,'year635')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter If you are no longer experiencing symptoms, when did they last occur? year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.TAB);
			
		}
	    public void EnterHaveYouEverHadDate(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@name,'652[0].dateOfVisit.day')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.clear();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter  Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@name,'652[0].dateOfVisit.month')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter  month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@name,'652[0].dateOfVisit.year')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.TAB);
			
		}
	    public void EnterHaveYouEverHadDate2(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@name,'652[1].dateOfVisit.day')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.clear();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "2. Enter  Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@name,'652[1].dateOfVisit.month')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "2. Enter  month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@name,'652[1].dateOfVisit.year')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "2. Enter year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.TAB);
			
		}
	    public void EnterHaveYouEverHadDate3(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@name,'652[2].dateOfVisit.day')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.clear();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "3. Enter  Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@name,'652[2].dateOfVisit.month')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "3. Enter  month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@name,'652[2].dateOfVisit.year')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "3. Enter year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.TAB);
			
		}
	    public void EnterHaveYouEverBeenDate1(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@name,'653[0].dateOfVisit.day')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.clear();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "1. Enter  Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@name,'653[0].dateOfVisit.month')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "1. Enter  month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@name,'653[0].dateOfVisit.year')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "1. Enter year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.TAB);
			
		}
	    public void EnterHaveYouEverBeenDate2(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@name,'653[1].dateOfVisit.day')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.clear();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "2. Enter  Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@name,'653[1].dateOfVisit.month')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "2. Enter  month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@name,'653[1].dateOfVisit.year')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "2. Enter year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.TAB);
			
		}
	    public void EnterHaveYouEverBeenDate3(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@name,'653[2].dateOfVisit.day')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.clear();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "3. Enter  Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@name,'653[2].dateOfVisit.month')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "3. Enter  month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@name,'653[2].dateOfVisit.year')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "3. Enter year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.TAB);
			
		}
	    public void EnterArthritisDate(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@name,'6059[0].dob.day')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.clear();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter  Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@name,'6059[0].dob.month')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter  month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@name,'6059[0].dob.year')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.TAB);
			
		}
	    public void EnterWhenWasYouLastSuizureDate(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@id,'day606')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.clear();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter When Was Your Last Suizure Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@id,'month606')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter When Was Your Last Suizure month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@id,'year606')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter When Was Your Last Suizure year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.TAB);
			
		}
	    public void EnterHaveYouEverHadAnyTestDate(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@id,'dd')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.clear();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@id,'mm')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter  month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@id,'yy')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.TAB);
			
		}
	    public void EnterAdmittedDate(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("(//input[contains(@id,'dd')])[3]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.clear();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("(//input[contains(@id,'mm')])[2]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter  month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("(//input[contains(@id,'yy')])[2]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.TAB);
			
		}
	    public void EnterBloodSugarLevel(String val) {
	    	 WebElement InputbloodSugar = driver.findElement(By.xpath("//input[contains(@name,'1070')]"));
	         waitUtils.waitforElementToBeClickable(driver, InputbloodSugar, 20);
	         if(InputbloodSugar.isDisplayed()) {
	        	 InputbloodSugar.sendKeys(val);
	        	 CustomListner.test.log(LogStatus.INFO, "Enter Blood Sugar Level As =====>"+val);

	         }else {
	        	 CustomListner.test.log(LogStatus.FAIL, "Failed To Display Blood Sugar Level ");

	         }  
			
		}
	    public void EnterLastHbA1C(String val) {
	    	 WebElement InputbloodSugar = driver.findElement(By.xpath("//input[contains(@name,'1071')]"));
	         waitUtils.waitforElementToBeClickable(driver, InputbloodSugar, 20);
	         if(InputbloodSugar.isDisplayed()) {
	        	 InputbloodSugar.sendKeys(val);
	        	 CustomListner.test.log(LogStatus.INFO, "Enter Last HbA1C As =====>"+val);

	         }else {
	        	 CustomListner.test.log(LogStatus.FAIL, "Failed To Display Last HbA1C ");

	         }	
		}
	    public void EnterForFemaleLivesOnlyDateOfDiagnosis(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@name,'day8137')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Diagnosis Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@name,'month8137')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Diagnosis month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@name,'year8137')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Diagnosis year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.ENTER);
			
		}
	    public void EnterHaveYouSufferdFromDateOfLastConsult(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@name,'day8141')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Last Consult Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@name,'month8141')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Last Consult month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@name,'year8141')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Last Consult year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.ENTER);
			
		}
	    public void EnterWhenDidYouFirstExperianceSymptoms(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@name,'day152')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter When Did You First Experiance Symptoms Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@name,'month152')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter When Did You First Experiance Symptoms month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@name,'year152')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter When Did You First Experiance Symptoms year  Value As =====>"+year);
	         //eleDOBYearInput.sendKeys(Keys.ENTER);
			
		}
	    public void EnterDateOfInvestigation(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@id,'day157')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter Date Of Investigation  Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@id,'month157')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter Date Of Investigation month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@id,'year157')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter Date Of Investigation year  Value As =====>"+year);
	        // eleDOBYearInput.sendKeys(Keys.ENTER);
			
		}
	    public void EnterDateOfLstTaken1(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@id,'day163')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter Date Of Last Taken Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@id,'month163')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter Date Of Last Taken month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@id,'year163')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter Date Of Last Taken year  Value As =====>"+year);
	       //  eleDOBYearInput.sendKeys(Keys.ENTER);
			
		}
	    public void EnterDateOfLstTaken2(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@id,'day167')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter Date Of Last Taken Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@id,'month167')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter Date Of Last Taken month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@id,'year167')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter Date Of Last Taken year  Value As =====>"+year);
	        // eleDOBYearInput.sendKeys(Keys.ENTER);
			
		}
	    public void EnterWhenWasConditionDiagnos(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@id,'day1001')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter When Was Condition Diagnos Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@id,'month1001')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter When Was Condition Diagnos month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@id,'year1001')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter yWhen Was Condition Diagnos Year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.TAB);
			
		}
	  
	    public void EnteeWhenDidYouLastExperianceSymptoms(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@id,'day1007')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter When Did You Last Experiance Symptoms Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@id,'month1007')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter When Did You Last Experiance Symptoms month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@id,'year1007')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter When Did You Last Experiance Symptoms Year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.TAB);
			
		}
	    public void EnteeDateOfLastConsultation(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@id,'day1016')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter Date Of Last Consultation Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@id,'month1016')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter Date Of Last Consultation month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@id,'year1016')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter Date Of Last Consultation Year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.TAB);
			
		}
	    public void EnterHaveYouSufferdFromDateOfDiagnosis(String day,String month,String year) {
	    	 WebElement eleDOBDayInput = driver.findElement(By.xpath("//input[contains(@name,'day8142')]"));
	         waitUtils.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	         eleDOBDayInput.click();
	         eleDOBDayInput.sendKeys(day);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Diagnosis Day  Value As =====>"+day);
	         WebElement eleDOBMonthInput=driver.findElement(By.xpath("//input[contains(@name,'month8142')]"));
	         waitUtils.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	         eleDOBMonthInput.clear();
	         eleDOBMonthInput.sendKeys(month);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Diagnosis month  Value As =====>"+month);
	         eleDOBMonthInput.sendKeys(Keys.TAB);
	         WebElement eleDOBYearInput=driver.findElement(By.xpath("//input[contains(@name,'year8142')]"));
	         eleDOBYearInput.clear();
	         eleDOBYearInput.sendKeys(year);
	         CustomListner.test.log(LogStatus.INFO, "Enter date Of Diagnosis year  Value As =====>"+year);
	         eleDOBYearInput.sendKeys(Keys.ENTER);
			
		}
/*
	    
//**************************************vijay***********************************
	    
	    public void ValidationsOfBrotherOnFamilyMedicalWeb(String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause) throws InterruptedException {

			WebElement Brotherlivinganddemise = driver.findElement(By.xpath("(//div[text()='"+FMBSLivingDemise+"'])[3]"));
			waitUtils.waitforElementToBeClickable(driver, Brotherlivinganddemise, 100);
			if (Brotherlivinganddemise.isDisplayed()) {
				Brotherlivinganddemise.click();
				// Thread.sleep(4000);
				// TestUtil.verifybgColor(fatherlivinganddemise, driver);
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Brother Option Is>>>>>>" + FMBSLivingDemise);
			}

			if (FMBSLivingDemise.equalsIgnoreCase("Living")) {
				WebElement Brotherage = driver.findElement(By.xpath("(//input[@name='age'])[1]"));
				waitUtils.waitforElementToBeClickable(driver, Brotherage, 100);
				if (Brotherage.isDisplayed()) {
					Brotherage.click();
					Brotherage.sendKeys(FMBSAgeDeath);
					Thread.sleep(1000);

					CustomListner.test.log(LogStatus.INFO, "Successfully Display  Brother Age on Health Details family Medical>>>>>>>>>>>="+FMBSAgeDeath);
				} else {
					CustomListner.test.log(LogStatus.INFO, "Brother Age is Not Display On Health Details Family Medical");
				}

				WebElement Brothersateofhealth = driver.findElement(By.xpath("(//div[@role='button'])[3]"));
				waitUtils.waitforElementToBeClickable(driver, Brothersateofhealth, 100);
				if (Brothersateofhealth.isDisplayed()) {
					Brothersateofhealth.click();
					Thread.sleep(2000);
					CustomListner.test.log(LogStatus.INFO, "Successfully Display  Brother  State Of Health on Health Details family Medical");
					WebElement selectdropdwon = driver.findElement(By.xpath("//ul//li/span[text()='"+FMBSStateAndCause+"']"));
					waitUtils.waitforElementToBeClickable(driver, selectdropdwon, 100);
					selectdropdwon.click();
					CustomListner.test.log(LogStatus.INFO, "Successfully Select Brother State Of Health Value As=====>"+FMBSStateAndCause);
				} else {
					CustomListner.test.log(LogStatus.INFO, "Brother State Of Health is Not Display On Family Medical");
				}

			} else if (FMBSLivingDemise.equalsIgnoreCase("Demise")) {
				WebElement BroageOfdeath = driver.findElement(By.xpath("//input[@id='ageAtDeath']"));
				waitUtils.waitforElementToBeClickable(driver, BroageOfdeath, 100);
				if (BroageOfdeath.isDisplayed()) {
					BroageOfdeath.click();
					BroageOfdeath.sendKeys(FMBSAgeDeath);
					CustomListner.test.log(LogStatus.INFO, "Successfully Display  Brother Age Of Death on Health Details family Medical>>>>>>"+FMBSAgeDeath);


					WebElement BrotherCauseODeath = driver.findElement(By.xpath("(//div[@role='button'])[3]"));
					waitUtils.waitforElementToBeClickable(driver, BrotherCauseODeath, 100);
					if (BrotherCauseODeath.isDisplayed()) {
						BrotherCauseODeath.click();
						Thread.sleep(2000);
						CustomListner.test.log(LogStatus.INFO, "Successfully Display  Brother  Cause Of Death on Health Details family Medical");
						WebElement selectdropdwon = driver.findElement(By.xpath("//ul//li/span[text()='"+FMBSStateAndCause+"']"));
						waitUtils.waitforElementToBeClickable(driver, selectdropdwon, 100);
						selectdropdwon.click();
						CustomListner.test.log(LogStatus.INFO, "Successfully Select Brother Cause Of Death Of Health Details Health Value As=====>"+FMBSStateAndCause);

					} else {
						CustomListner.test.log(LogStatus.INFO, "Brother Age Of Death is Not Display On Family Medical");
					}


				} else {
					CustomListner.test.log(LogStatus.INFO, "Failed to Option Living And Demise");
				}
			}
		}




		public void ValidationsOfSisterOnFamilyMedicalWeb(String BrotherLivingDemise,String BrotherAgeDeath,String BrotherStateAndCause) throws InterruptedException {

			WebElement sisterlivinganddemise = driver.findElement(By.xpath("(//div[text()='"+BrotherLivingDemise+"'])[3]"));
			waitUtils.waitforElementToBeClickable(driver, sisterlivinganddemise, 100);
			if (sisterlivinganddemise.isDisplayed()) {
				sisterlivinganddemise.click();
				// Thread.sleep(4000);
				// TestUtil.verifybgColor(fatherlivinganddemise, driver);
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Sister Option Is>>>>>>" + BrotherLivingDemise);
			}

			if (BrotherLivingDemise.equalsIgnoreCase("Living")) {
				WebElement Sisterage = driver.findElement(By.xpath("(//input[@name='age'])[1]"));
				waitUtils.waitforElementToBeClickable(driver, Sisterage, 100);
				if (Sisterage.isDisplayed()) {
					Sisterage.click();
					Thread.sleep(1000);
					Sisterage.sendKeys(BrotherAgeDeath);


					CustomListner.test.log(LogStatus.INFO, "Successfully Display  Sister Age Health Deatails on family Medical>>>>>>>>>>>="+BrotherAgeDeath);
				} else {
					CustomListner.test.log(LogStatus.INFO, "Sister Age is Not Display On Health Details Family Medical");
				}

				WebElement Sistersateofhealth = driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[3]"));
				waitUtils.waitforElementToBeClickable(driver, Sistersateofhealth, 100);
				if (Sistersateofhealth.isDisplayed()) {
					Sistersateofhealth.click();
					Thread.sleep(1000);
					CustomListner.test.log(LogStatus.INFO, "Successfully Display  Sister  State Of Health on Health Details  family Medical");
					WebElement selectdropdwon = driver.findElement(By.xpath("//ul//li/span[text()='"+BrotherStateAndCause+"']"));
					waitUtils.waitforElementToBeClickable(driver, selectdropdwon, 100);
					selectdropdwon.click();
					CustomListner.test.log(LogStatus.INFO, "Successfully Select Sister State Of Health Value As=====>"+BrotherStateAndCause);
				} else {
					CustomListner.test.log(LogStatus.INFO, "Sister State Of Health is Not Display On Family Medical");
				}

			} else if (BrotherLivingDemise.equalsIgnoreCase("Demise")) {
				WebElement sisageOfdeath = driver.findElement(By.xpath("//input[@id='ageAtDeath']"));
				waitUtils.waitforElementToBeClickable(driver, sisageOfdeath, 100);
				if (sisageOfdeath.isDisplayed()) {
					sisageOfdeath.click();
					Thread.sleep(1000);
					sisageOfdeath.sendKeys(BrotherAgeDeath);
					CustomListner.test.log(LogStatus.INFO, "Successfully Display  Sister Age Of Death on Health Details  family Medical>>>>>>"+BrotherAgeDeath);


					WebElement sisterCauseODeath = driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[3]"));
					waitUtils.waitforElementToBeClickable(driver, sisterCauseODeath, 100);
					if (sisterCauseODeath.isDisplayed()) {
						sisterCauseODeath.click();
						Thread.sleep(1000);
						CustomListner.test.log(LogStatus.INFO, "Successfully Display  Sister  Cause Of Death on Health Details  family Medical");
						WebElement selectdropdwon = driver.findElement(By.xpath("//ul//li/span[text()='"+BrotherStateAndCause+"']"));
						waitUtils.waitforElementToBeClickable(driver, selectdropdwon, 100);
						selectdropdwon.click();
						CustomListner.test.log(LogStatus.INFO, "Successfully Select Sister Cause Of Death Of Health Value As=====>"+BrotherStateAndCause);

					} else {
						CustomListner.test.log(LogStatus.INFO, "Sister Age Of Death is Not Display On Family Medical");
					}


				} else {
					CustomListner.test.log(LogStatus.INFO, "Failed to Option Living And Demise");
				}
			}
		}


		public void ClickonAddBrotherBTNWeb() {
			WebElement TabBTN = driver.findElement(By.xpath("(//span[text()='+ ADD'])[1]"));
			waitUtils.waitForElementToBeVisibleweb(driver, TabBTN, 20, "Element is Not Display");
			if (TabBTN.isDisplayed()) {
				TabBTN.click();
				CustomListner.test.log(LogStatus.INFO, "Successfully  Click  Brother Add BTN  on Health Details family Medical");
			} else {
				CustomListner.test.log(LogStatus.INFO, "Failed Click BTN ON Add Brother on Health Details family Medical");
			}

		}

		public void ClickonMultiAddBrotherBTNWeb() {
			WebElement multiTabBTN = driver.findElement(By.xpath("//span[text()='+ADD']"));
			waitUtils.waitForElementToBeVisibleweb(driver, multiTabBTN, 20, "Element is Not Display");
			if (multiTabBTN.isDisplayed()) {
				multiTabBTN.click();
				CustomListner.test.log(LogStatus.INFO, "Successfully  Click  Brother Multiple Add BTN  on Health Details family Medical");
			} else {
				CustomListner.test.log(LogStatus.INFO, "Failed Click BTN ON Multiple Add Brother  on Health Details family Medical");
			}

		}


		public void ClickonAddSisterBTNWeb() {
			WebElement AddbTN = driver.findElement(By.xpath("(//span[text()='+ ADD'])[2]"));
			waitUtils.waitForElementToBeVisibleweb(driver, AddbTN, 20, "Element is Not Display");
			if (AddbTN.isDisplayed()) {
				AddbTN.click();
				CustomListner.test.log(LogStatus.INFO, "Successfully  Click  Sister Add BTN on Health Details  family Medical");
			} else {
				CustomListner.test.log(LogStatus.INFO, "Failed Click Add BTN ON  Sister option on Health Details  family Medical");
			}

		}

		public void ClickonMultiAddSisterBTNWeb() {
			WebElement MultiAddbTN = driver.findElement(By.xpath("(//span[text()='+ADD'])[1]"));
			waitUtils.waitForElementToBeVisibleweb(driver, MultiAddbTN, 20, "Element is Not Display");
			if (MultiAddbTN.isDisplayed()) {
				MultiAddbTN.click();
				CustomListner.test.log(LogStatus.INFO, "Successfully  Click  Sister Multiple Add BTN  on family Medical");
			} else {
				CustomListner.test.log(LogStatus.INFO, "Failed Click Multiple Add BTN ON  Sister option on family Medical");
			}

		}


		public void ClickonEditBrotherAndSisterBTNWeb() throws InterruptedException {
			WebElement editBTN = driver.findElement(By.xpath("(//span[text()='EDIT'])[1]"));
			waitUtils.waitForElementToBeVisibleweb(driver, editBTN, 20, "Element is Not Display");
			TestUtil.verifybgColor(editBTN, driver);
			if (editBTN.isDisplayed()) {
				editBTN.click();
				CustomListner.test.log(LogStatus.INFO, "Successfully  Click  Brother And Sister Edit BTN  on Health Details  family Medical");
			} else {
				CustomListner.test.log(LogStatus.INFO, "Failed Edit BTN Brother And Sister Option  on Health Details  family Medical");
			}

		}

		public void ClickonAddSisterBTNAfterAddingBrotherBTNWeb() {
			WebElement editBTN = driver.findElement(By.xpath("//span[text()='+ ADD']"));
			waitUtils.waitForElementToBeVisibleweb(driver, editBTN, 20, "Element is Not Display");
			if (editBTN.isDisplayed()) {
				editBTN.click();
				CustomListner.test.log(LogStatus.INFO, "Successfully  Click  Sister Adding  BTN  on family Medical");
			} else {
				CustomListner.test.log(LogStatus.INFO, "Failed Adding BTN ON  Sister Option  on family Medical");
			}

		}


		public void ClickonRemoveBrotherAndSisterBTNWeb() throws InterruptedException {
			WebElement RemoveBTN = driver.findElement(By.xpath("(//span[text()='REMOVE'])[1]"));
			waitUtils.waitForElementToBeVisibleweb(driver, RemoveBTN, 20, "Element is Not Display");
			TestUtil.verifybgColor(RemoveBTN, driver);
			if (RemoveBTN.isDisplayed()) {
				RemoveBTN.click();
				CustomListner.test.log(LogStatus.INFO, "Successfully  Click  Brother Reomve BTN  on family Medical");
			} else {
				CustomListner.test.log(LogStatus.INFO, "Failed Click  Remove BTN  Brother  Option Of family Medical");
			}
		}

		public void ClickonSaveBrotherAndSisterBTNWeb() {
			WebElement SaveBTN = driver.findElement(By.xpath("(//span[text()='SAVE'])[1]"));
			waitUtils.waitForElementToBeVisibleweb(driver, SaveBTN, 20, "Element is Not Display");
			if (SaveBTN.isDisplayed()) {
				SaveBTN.click();
				CustomListner.test.log(LogStatus.INFO, "Successfully  Click  Brother And Sister Save BTN  on Health Deatails  family Medical");
			} else {
				CustomListner.test.log(LogStatus.INFO, "Failed Click  Save BTN  Brother And Sister  Option Of Health Deatails family Medical");
			}
		}





		public void ClickonSaveAndContinueBTNWeb() {
			WebElement ContinueSaveBTN = driver.findElement(By.xpath("//span[text()='SAVE & CONTINUE']"));
			waitUtils.waitForElementToBeVisibleweb(driver, ContinueSaveBTN, 20, "Element is Not Display");
			if (ContinueSaveBTN.isDisplayed()) {
				ContinueSaveBTN.click();
				CustomListner.test.log(LogStatus.INFO, "Successfully  Click   Save And Continue BTN  on Health Deatails  family Medical");
			} else {
				CustomListner.test.log(LogStatus.INFO, "Failed Click Save And Continue BTN ON Add on Health Deatails  family Medical");
			}

		}


		public void EnetrFatherStateOfHealthOtherReasonBTNWeb(String agrs) {
			WebElement otherReason = driver.findElement(By.xpath("(//input[@placeholder='Please Specify Other Reasons'])"));
			waitUtils.waitForElementToBeVisibleweb(driver, otherReason, 20, "Element is Not Display");
			if (otherReason.isDisplayed()) {
				otherReason.sendKeys(agrs);
				CustomListner.test.log(LogStatus.INFO, "Successfully  Select Father  Other Option on State Of Health  And Enter Other Reasons Filed  on Health Deatails family Medical Modual");
			} else {
				CustomListner.test.log(LogStatus.INFO, "Failed Select Father Option Other State Of Health And Enter Other Reasons  on Health Deatails  family Medical");
			}

		}

		public void EnetrFatherCauseOfDeathOtherReasonBTNWeb(String agrs) {
			WebElement otherReason = driver.findElement(By.xpath("(//input[@placeholder='Please Specify Death Reasons'])"));
			waitUtils.waitForElementToBeVisibleweb(driver, otherReason, 20, "Element is Not Display");
			if (otherReason.isDisplayed()) {
				otherReason.sendKeys(agrs);
				CustomListner.test.log(LogStatus.INFO, "Successfully  Select Father  Other Option On  Cause Of Death And Enter Other cause Of Reasons Filed  on Health Deatails family Medical Modual");
			} else {
				CustomListner.test.log(LogStatus.INFO, "Failed Select Father  Other Option Cause Death And Enter Other cause Of Reasons Filed on Health Deatails  family Medical");
			}

		}
		public void ValidationsOfFatherOnFamilyMedicalWeb(String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause) throws InterruptedException {


			WebElement fatherlivinganddemise = driver.findElement(By.xpath("(//div[text()='" +FMBSLivingDemise+ "'])[1]"));

			waitUtils.waitforElementToBeClickable(driver, fatherlivinganddemise, 100);
			if (fatherlivinganddemise.isDisplayed()) {
				fatherlivinganddemise.click();
				//Thread.sleep(4000);
				//TestUtil.verifybgColor(fatherlivinganddemise, driver);
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Father Option Is>>>>>" + FMBSLivingDemise);
			}

			if (FMBSLivingDemise.equalsIgnoreCase("Living")) {
				WebElement Fatherage = driver.findElement(By.xpath("(//input[@placeholder='Age'])[1]"));
				waitUtils.waitforElementToBeClickable(driver, Fatherage, 100);
				if (Fatherage.isDisplayed()) {
					Fatherage.click();
					Fatherage.sendKeys(FMBSAgeDeath);

					CustomListner.test.log(LogStatus.INFO, "Successfully Display  Father Age on family Medical>>>>>>"+FMBSAgeDeath);
				} else {
					CustomListner.test.log(LogStatus.INFO, "Father Age is Not Display On Family Medical");
				}

				WebElement Fathesateofhealth = driver.findElement(By.xpath("//div[@id='mui-component-select-60']"));
				waitUtils.waitforElementToBeClickable(driver, Fathesateofhealth, 100);
				if (Fathesateofhealth.isDisplayed()) {
					Fathesateofhealth.click();
					Thread.sleep(1000);
					CustomListner.test.log(LogStatus.INFO, "Successfully Display  Father  State Of Health on family Medical");
					WebElement selectdropdwon = driver.findElement(By.xpath("//ul//li/span[text()='"+FMBSStateAndCause+"']"));
					waitUtils.waitforElementToBeClickable(driver, selectdropdwon, 100);
					selectdropdwon.click();
					CustomListner.test.log(LogStatus.INFO, "Successfully Select Father State Of Health Value As=====>"+FMBSStateAndCause);
				} else {
					CustomListner.test.log(LogStatus.INFO, "Father State Of Health is Not Display On Family Medical");
				}

			}
			else if (FMBSLivingDemise.equalsIgnoreCase("Demise")) {

				WebElement ageOfdeath = driver.findElement(By.xpath("//input[@name='69']"));
				waitUtils.waitforElementToBeClickable(driver, ageOfdeath, 100);
				if (ageOfdeath.isDisplayed()) {
					ageOfdeath.click();
					ageOfdeath.sendKeys(FMBSAgeDeath);

					CustomListner.test.log(LogStatus.INFO,"Successfully Display  Father Age Of Death on family Medical>>>>>>"+FMBSAgeDeath);
				} else {
					CustomListner.test.log(LogStatus.INFO,"Father Age Of Death is Not Display On Family Medical");
				}

				WebElement causeOfDeath = driver.findElement(By.xpath("//div[@id='mui-component-select-71']"));
				waitUtils.waitforElementToBeClickable(driver, causeOfDeath, 100);
				if (causeOfDeath.isDisplayed()) {
					causeOfDeath.click();
					Thread.sleep(1000);
					CustomListner.test.log(LogStatus.INFO, "Successfully Display  Father  Cause Of Death on family Medical");
					WebElement selectdropdwon = driver.findElement(By.xpath("//ul//li/span[text()='"+FMBSStateAndCause+"']"));
					waitUtils.waitforElementToBeClickable(driver, selectdropdwon, 100);
					selectdropdwon.click();
					CustomListner.test.log(LogStatus.INFO, "Successfully Select Father Cause Of Death Value As=====>"+FMBSStateAndCause);
				} else {
					CustomListner.test.log(LogStatus.INFO, "Father Cause is Not Display On Family Medical");
				}

			} else {
				CustomListner.test.log(LogStatus.INFO, "Failed to Option Living And Demise");
			}

		}
		//=============================================================================================================




		public void ValidationsOfMotherOnFamilyMedicalWeb(String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause) throws InterruptedException {
			//WebElement SelectMother = driver.findElement(By.xpath("//div[text()='Mother']"));


			WebElement motherlivinganddemise = driver.findElement(By.xpath("(//div[text()='"+FMBSLivingDemise+"'])[2]"));
			waitUtils.waitforElementToBeClickable(driver, motherlivinganddemise, 100);
			if (motherlivinganddemise.isDisplayed()) {
				motherlivinganddemise.click();
				//Thread.sleep(4000);
				//TestUtil.verifybgColor(fatherlivinganddemise, driver);
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Select Mother Option Is>>>>>>" + FMBSLivingDemise);
			}

			if (FMBSLivingDemise.equalsIgnoreCase("Living")) {
				WebElement Motherage = driver.findElement(By.xpath("//input[@name='62']"));
				waitUtils.waitforElementToBeClickable(driver, Motherage, 100);
				if (Motherage.isDisplayed()) {
					Motherage.click();
					Motherage.sendKeys(FMBSAgeDeath);

					CustomListner.test.log(LogStatus.INFO, "Successfully Display  Mother Age on family Medical>>>>>>>"+FMBSAgeDeath);
				} else {
					CustomListner.test.log(LogStatus.INFO, "Mother Age is Not Display On Family Medical");
				}

				WebElement Mothersateofhealth = driver.findElement(By.xpath("//div[@id='mui-component-select-63']"));
				waitUtils.waitforElementToBeClickable(driver, Mothersateofhealth, 100);
				if (Mothersateofhealth.isDisplayed()) {
					Mothersateofhealth.click();
					Thread.sleep(1000);
					CustomListner.test.log(LogStatus.INFO, "Successfully Display  Mother  State Of Health on family Medical");
					WebElement selectdropdwon = driver.findElement(By.xpath("//ul//li/span[text()='"+FMBSStateAndCause+"']"));
					waitUtils.waitforElementToBeClickable(driver, selectdropdwon, 100);
					selectdropdwon.click();
					CustomListner.test.log(LogStatus.INFO, "Successfully Select Mother State Of Health Value As=====>"+FMBSStateAndCause);
				} else {
					CustomListner.test.log(LogStatus.INFO, "Mother State Of Health is Not Display On Family Medical");
				}
			}

			else if (FMBSLivingDemise.equalsIgnoreCase("Demise")) {
				WebElement ageOfdeath = driver.findElement(By.xpath("(//input[@placeholder='Age'])[2]"));
				waitUtils.waitforElementToBeClickable(driver, ageOfdeath, 100);
				if (ageOfdeath.isDisplayed()) {
					ageOfdeath.click();
					ageOfdeath.sendKeys(FMBSAgeDeath);

					CustomListner.test.log(LogStatus.INFO,"Successfully Display  Mother Age Of Death on family Medical>>>>>"+FMBSAgeDeath);
				} else {
					CustomListner.test.log(LogStatus.INFO,"Mother Age Of Death is Not Display On Family Medical");
				}

				WebElement causeOfDeath = driver.findElement(By.xpath("//div[@id='mui-component-select-72']"));
				waitUtils.waitforElementToBeClickable(driver, causeOfDeath, 100);
				if (causeOfDeath.isDisplayed()) {
					causeOfDeath.click();
					Thread.sleep(1000);
					CustomListner.test.log(LogStatus.INFO, "Successfully Display  Mother  Cause Of Death on family Medical");
					WebElement selectdropdwon = driver.findElement(By.xpath("//ul//li/span[text()='"+FMBSStateAndCause+"']"));
					waitUtils.waitforElementToBeClickable(driver, selectdropdwon, 100);
					selectdropdwon.click();
					CustomListner.test.log(LogStatus.INFO, "Successfully Select Mother Cause Of Death Value As=====>"+FMBSStateAndCause);
				} else {
					CustomListner.test.log(LogStatus.INFO, "Mother Cause of death is Not Display On Family Medical");
				}

			}
		}
*/

//==================below vijay=========

	    
	    


		public void ValidationsOfFatherOnFamilyMedicalWeb(String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause) throws InterruptedException {
			

			WebElement fatherlivinganddemise = driver.findElement(By.xpath("(//div[text()='" +FMBSLivingDemise+ "'])[1]"));
			
			waitUtils.waitforElementToBeClickable(driver, fatherlivinganddemise, 100);
			if (fatherlivinganddemise.isDisplayed()) {
				fatherlivinganddemise.click();
				//Thread.sleep(4000);
				//TestUtil.verifybgColor(fatherlivinganddemise, driver);
				CustomListner.test.log(LogStatus.INFO, "Click on Father Living And Demise  button As >>>>>" + FMBSLivingDemise);
			}
		
			if (FMBSLivingDemise.equalsIgnoreCase("Living")) {
				WebElement Fatherage = driver.findElement(By.xpath("(//input[@placeholder='Age'])[1]"));
				waitUtils.waitforElementToBeClickable(driver, Fatherage, 100);
				if (Fatherage.isDisplayed()) {
					Fatherage.click();
					Fatherage.sendKeys(FMBSAgeDeath);
					
					CustomListner.test.log(LogStatus.INFO, "Enter Father Age  As=====>"+FMBSAgeDeath);
				} else {
					CustomListner.test.log(LogStatus.INFO, "Father Age is Not Display On Family Medical");
				}
               
				WebElement Fathesateofhealth = driver.findElement(By.xpath("//div[@id='mui-component-select-60']"));
				waitUtils.waitforElementToBeClickable(driver, Fathesateofhealth, 100);
				if (Fathesateofhealth.isDisplayed()) {
					Fathesateofhealth.click();
					Thread.sleep(1000);
					CustomListner.test.log(LogStatus.INFO, "Successfully Display  Father  State Of Health on family Medical");
					WebElement selectdropdwon = driver.findElement(By.xpath("//ul//li/span[text()='"+FMBSStateAndCause+"']"));
				      waitUtils.waitforElementToBeClickable(driver, selectdropdwon, 100);
				      selectdropdwon.click();
				      CustomListner.test.log(LogStatus.INFO, " Select Father State Of Health  As=====>"+FMBSStateAndCause);	
				} else {
					CustomListner.test.log(LogStatus.INFO, "Father State Of Health is Not Display On Family Medical");
				}
			
			}
				else if (FMBSLivingDemise.equalsIgnoreCase("Demise")) {
					
					WebElement ageOfdeath = driver.findElement(By.xpath("//input[@name='69']"));
					waitUtils.waitforElementToBeClickable(driver, ageOfdeath, 100);
					if (ageOfdeath.isDisplayed()) {
						ageOfdeath.click();
						ageOfdeath.sendKeys(FMBSAgeDeath);
						
						CustomListner.test.log(LogStatus.INFO,"Enter Father Age Of Death  As=====>"+FMBSAgeDeath);
					} else {
						CustomListner.test.log(LogStatus.INFO,"Father Age Of Death is Not Display On Family Medical");
					}

					WebElement causeOfDeath = driver.findElement(By.xpath("//div[@id='mui-component-select-71']"));
					waitUtils.waitforElementToBeClickable(driver, causeOfDeath, 100);
					if (causeOfDeath.isDisplayed()) {
						causeOfDeath.click();
						Thread.sleep(1000);
						CustomListner.test.log(LogStatus.INFO, "Successfully Display  Father  Cause Of Death on family Medical");
						WebElement selectdropdwon = driver.findElement(By.xpath("//ul//li/span[text()='"+FMBSStateAndCause+"']"));
					      waitUtils.waitforElementToBeClickable(driver, selectdropdwon, 100);
					      selectdropdwon.click();
					      CustomListner.test.log(LogStatus.INFO, "Select Father Cause Of Death  As=====>"+FMBSStateAndCause);	
					} else {
						CustomListner.test.log(LogStatus.INFO, "Father Cause is Not Display On Family Medical");
					}

				} else {
					CustomListner.test.log(LogStatus.INFO, "Failed to Option Living And Demise");
				}

		}
		//=============================================================================================================

		public void ValidationOfFatherLivingInLineErrorMsg() throws InterruptedException {
			 

			 WebElement FatherageErrorMSG= driver.findElement(By.xpath("(//p[text()='Please enter a value between 19 and 99'])[1]"));
			 WebElement FatherStateOfHealthErrorMSG= driver.findElement(By.xpath("(//p[text()='Please select state of health'])[1]"));
			 TestUtil.scrollToElement(driver, FatherageErrorMSG);
		        String ErrorValue1=FatherageErrorMSG.getText();
		        String ErrorValue2=FatherStateOfHealthErrorMSG.getText();
		        
		         if(FatherageErrorMSG.isDisplayed()) {
		      	   TestUtil.verifybgColor(FatherageErrorMSG, driver);
		      	   CustomListner.test.log(LogStatus.INFO, "Successfully Display  Father Age  Error MSG ");
		         }
		         else {
		      	   CustomListner.test.log(LogStatus.INFO, "Failed  Father Age Error MSG");
		         }
		         if(FatherStateOfHealthErrorMSG.isDisplayed()) {
			      	   TestUtil.verifybgColor(FatherStateOfHealthErrorMSG, driver);
			      	   CustomListner.test.log(LogStatus.INFO, "Successfully Display Father State Of Health Inline  Error MSG ");
			         }
			         else {
			      	   CustomListner.test.log(LogStatus.INFO, "Failed to  Father State Of Health Inline  Error MSG");
			         }
		         Assert.assertEquals(ErrorValue1, "Please enter a value between 19 and 99");
		         Assert.assertEquals(ErrorValue2, "Please select state of health");
		}
		

		public void ValidationOfFatherDemiseInLineErrorMsg() throws InterruptedException {
			 

			 WebElement FatherDeathErrorMSG= driver.findElement(By.xpath("(//p[text()='Please enter a value between 19 and 99'])[1]"));
			 WebElement FathercauseOfDeathErrorMSG= driver.findElement(By.xpath("(//p[text()='Please select state of health'])[1]"));
			 TestUtil.scrollToElement(driver, FatherDeathErrorMSG);
		        String ErrorValue1=FatherDeathErrorMSG.getText();
		        String ErrorValue2=FathercauseOfDeathErrorMSG.getText();
		        
		         if(FatherDeathErrorMSG.isDisplayed()) {
		      	   TestUtil.verifybgColor(FatherDeathErrorMSG, driver);
		      	   CustomListner.test.log(LogStatus.INFO, "Successfully Display  Father Age Of Death Error MSG ");
		         }
		         else {
		      	   CustomListner.test.log(LogStatus.INFO, "Failed Father Age Of Death Error MSG");
		         }
		         if(FathercauseOfDeathErrorMSG.isDisplayed()) {
			      	   TestUtil.verifybgColor(FathercauseOfDeathErrorMSG, driver);
			      	   CustomListner.test.log(LogStatus.INFO, "Successfully Display Father Cause Of Death  Inline  Error MSG ");
			         }
			         else {
			      	   CustomListner.test.log(LogStatus.INFO, "Failed Father Cause Of Death Inline  Error MSG");
			         }
		         Assert.assertEquals(ErrorValue1, "Please enter a value between 19 and 99");
		         Assert.assertEquals(ErrorValue2, "Please select state of health");
		}
		public void ValidationsOfMotherOnFamilyMedicalWeb(String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause) throws InterruptedException {
			//WebElement SelectMother = driver.findElement(By.xpath("//div[text()='Mother']"));
			

			WebElement motherlivinganddemise = driver.findElement(By.xpath("(//div[text()='"+FMBSLivingDemise+"'])[2]"));
			waitUtils.waitforElementToBeClickable(driver, motherlivinganddemise, 100);
			if (motherlivinganddemise.isDisplayed()) {
				motherlivinganddemise.click();
				//Thread.sleep(4000);
				//TestUtil.verifybgColor(fatherlivinganddemise, driver);
				CustomListner.test.log(LogStatus.INFO, "Successfully Display Select Mother Option Is>>>>>>" + FMBSLivingDemise);
			}
		
			if (FMBSLivingDemise.equalsIgnoreCase("Living")) {
				WebElement Motherage = driver.findElement(By.xpath("//input[@name='62']"));
				waitUtils.waitforElementToBeClickable(driver, Motherage, 100);
				if (Motherage.isDisplayed()) {
					Motherage.click();
					Motherage.sendKeys(FMBSAgeDeath);
					
					CustomListner.test.log(LogStatus.INFO, "Enter Mother Age As=====>"+FMBSAgeDeath);
				} else {
					CustomListner.test.log(LogStatus.INFO, "Mother Age is Not Display On Family Medical");
				}
				 
				WebElement Mothersateofhealth = driver.findElement(By.xpath("//div[@id='mui-component-select-63']"));
				waitUtils.waitforElementToBeClickable(driver, Mothersateofhealth, 100);
				if (Mothersateofhealth.isDisplayed()) {
					Mothersateofhealth.click();
					Thread.sleep(1000);
					CustomListner.test.log(LogStatus.INFO, "Successfully Display  Mother  State Of Health on family Medical");
					WebElement selectdropdwon = driver.findElement(By.xpath("//ul//li/span[text()='"+FMBSStateAndCause+"']"));
				      waitUtils.waitforElementToBeClickable(driver, selectdropdwon, 100);
				      selectdropdwon.click();
				      CustomListner.test.log(LogStatus.INFO, "Select  Mother State of Health  As=====>"+FMBSStateAndCause);	
				} else {
					CustomListner.test.log(LogStatus.INFO, "Mother State Of Health is Not Display On Family Medical");
				}
				}
					
				else if (FMBSLivingDemise.equalsIgnoreCase("Demise")) {
					WebElement ageOfdeath = driver.findElement(By.xpath("(//input[@placeholder='Age'])[2]"));
					waitUtils.waitforElementToBeClickable(driver, ageOfdeath, 100);
					if (ageOfdeath.isDisplayed()) {
						ageOfdeath.click();
						ageOfdeath.sendKeys(FMBSAgeDeath);
						
						CustomListner.test.log(LogStatus.INFO,"Enter Mother Age Of Death  As=====>"+FMBSAgeDeath);
					} else {
						CustomListner.test.log(LogStatus.INFO,"Mother Age Of Death is Not Display On Family Medical");
					}

					WebElement causeOfDeath = driver.findElement(By.xpath("//div[@id='mui-component-select-72']"));
					waitUtils.waitforElementToBeClickable(driver, causeOfDeath, 100);
					if (causeOfDeath.isDisplayed()) {
						causeOfDeath.click();
						Thread.sleep(1000);
						//CustomListner.test.log(LogStatus.INFO, "Successfully Display  Mother  Cause Of Death on family Medical");
						WebElement selectdropdwon = driver.findElement(By.xpath("//ul//li/span[text()='"+FMBSStateAndCause+"']"));
					      waitUtils.waitforElementToBeClickable(driver, selectdropdwon, 100);
					      selectdropdwon.click();
					      CustomListner.test.log(LogStatus.INFO, "Select Mother Cause Of Death  As=====>"+FMBSStateAndCause);	
					} else {
						CustomListner.test.log(LogStatus.INFO, "Mother Cause of death is Not Display On Family Medical");
					}

				}
			}
		
		
		

		public void ValidationOfMotherLivingInLineErrorMsg() throws InterruptedException {
			 

			 WebElement MotherageErrorMSG= driver.findElement(By.xpath("(//p[text()='Please enter a value between 19 and 99'])[2]"));
			 WebElement MothersateofhealthErrorMSG= driver.findElement(By.xpath("(//p[text()='Please select state of health'])[2]"));
			 TestUtil.scrollToElement(driver, MotherageErrorMSG);
		        String ErrorValue1=MotherageErrorMSG.getText();
		        String ErrorValue2=MothersateofhealthErrorMSG.getText();
		        
		         if(MotherageErrorMSG.isDisplayed()) {
		      	   TestUtil.verifybgColor(MotherageErrorMSG, driver);
		      	   CustomListner.test.log(LogStatus.INFO, "Successfully Display  Mother Age  Error MSG ");
		         }
		         else {
		      	   CustomListner.test.log(LogStatus.INFO, "Failed to  Mother Age Error MSG");
		         }
		         if(MothersateofhealthErrorMSG.isDisplayed()) {
			      	   TestUtil.verifybgColor(MothersateofhealthErrorMSG, driver);
			      	   CustomListner.test.log(LogStatus.INFO, "Successfully Display Mother State Of Health Inline  Error MSG ");
			         }
			         else {
			      	   CustomListner.test.log(LogStatus.INFO, "Failed Mother State Of Health Inline  Error MSG");
			         }
		         Assert.assertEquals(ErrorValue1, "Please enter a value between 19 and 99");
		         Assert.assertEquals(ErrorValue2, "Please select state of health");
		}


		public void ValidationOfMotherDemiseInLineErrorMsg() throws InterruptedException {
			 

			 WebElement MotherDeathErrorMSG= driver.findElement(By.xpath("(//p[text()='Please enter a value between 19 and 99'])[2]"));
			 WebElement MothercauseOfDeathErrorMSG= driver.findElement(By.xpath("(//p[text()='Please select state of health'])[2]"));
			 TestUtil.scrollToElement(driver, MotherDeathErrorMSG);
		        String ErrorValue1=MotherDeathErrorMSG.getText();
		        String ErrorValue2=MothercauseOfDeathErrorMSG.getText();
		        
		         if(MotherDeathErrorMSG.isDisplayed()) {
		      	   TestUtil.verifybgColor(MotherDeathErrorMSG, driver);
		      	   CustomListner.test.log(LogStatus.INFO, "Successfully Display  Mother Age  Error MSG ");
		         }
		         else {
		      	   CustomListner.test.log(LogStatus.INFO, "Failed to  Mother Age Error MSG");
		         }
		         if(MothercauseOfDeathErrorMSG.isDisplayed()) {
			      	   TestUtil.verifybgColor(MothercauseOfDeathErrorMSG, driver);
			      	   CustomListner.test.log(LogStatus.INFO, "Successfully Display Mother Cause of Death Inline  Error MSG ");
			         }
			         else {
			      	   CustomListner.test.log(LogStatus.INFO, "Failed Mother SCause Of Death Inline  Error MSG");
			         }
		         Assert.assertEquals(ErrorValue1, "Please enter a value between 19 and 99");
		         Assert.assertEquals(ErrorValue2, "Please select state of health");
		}
//========================================Below Details For Brother And Sister On Family Medical===========================

public void ValidationsOfBrotherOnFamilyMedicalWeb(String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause) throws InterruptedException {

WebElement Brotherlivinganddemise = driver.findElement(By.xpath("(//div[text()='"+FMBSLivingDemise+"'])[3]"));
waitUtils.waitforElementToBeClickable(driver, Brotherlivinganddemise, 100);
if (Brotherlivinganddemise.isDisplayed()) {
	Brotherlivinganddemise.click();
	// Thread.sleep(4000);
	// TestUtil.verifybgColor(fatherlivinganddemise, driver);
	CustomListner.test.log(LogStatus.INFO, "Successfully Display Brother Option Is>>>>>>" + FMBSLivingDemise);
}

if (FMBSLivingDemise.equalsIgnoreCase("Living")) {
	WebElement Brotherage = driver.findElement(By.xpath("(//input[@name='age'])[1]"));
	waitUtils.waitforElementToBeClickable(driver, Brotherage, 100);
	if (Brotherage.isDisplayed()) {
		Brotherage.click();
		Brotherage.sendKeys(FMBSAgeDeath);
		Thread.sleep(1000);

		CustomListner.test.log(LogStatus.INFO, "Successfully Display  Brother Age on Health Details family Medical>>>>>>>>>>>="+FMBSAgeDeath);
	} else {
		CustomListner.test.log(LogStatus.INFO, "Brother Age is Not Display On Health Details Family Medical");
	}

	WebElement Brothersateofhealth = driver.findElement(By.xpath("(//div[@role='button'])[3]"));
	waitUtils.waitforElementToBeClickable(driver, Brothersateofhealth, 100);
	if (Brothersateofhealth.isDisplayed()) {
		Brothersateofhealth.click();
		Thread.sleep(2000);
		CustomListner.test.log(LogStatus.INFO, "Successfully Display  Brother  State Of Health on Health Details family Medical");
		WebElement selectdropdwon = driver.findElement(By.xpath("//ul//li/span[text()='"+FMBSStateAndCause+"']"));
	      waitUtils.waitforElementToBeClickable(driver, selectdropdwon, 100);
	      selectdropdwon.click();
	      CustomListner.test.log(LogStatus.INFO, "Successfully Select Brother State Of Health Value As=====>"+FMBSStateAndCause);	
	} else {
		CustomListner.test.log(LogStatus.INFO, "Brother State Of Health is Not Display On Family Medical");
	}

} else if (FMBSLivingDemise.equalsIgnoreCase("Demise")) {
	WebElement BroageOfdeath = driver.findElement(By.xpath("//input[@id='ageAtDeath']"));
	waitUtils.waitforElementToBeClickable(driver, BroageOfdeath, 100);
	if (BroageOfdeath.isDisplayed()) {
		BroageOfdeath.click();
		BroageOfdeath.sendKeys(FMBSAgeDeath);
		CustomListner.test.log(LogStatus.INFO, "Successfully Display  Brother Age Of Death on Health Details family Medical>>>>>>"+FMBSAgeDeath);
		

		WebElement BrotherCauseODeath = driver.findElement(By.xpath("(//div[@role='button'])[3]"));
		waitUtils.waitforElementToBeClickable(driver, BrotherCauseODeath, 100);
		if (BrotherCauseODeath.isDisplayed()) {
			BrotherCauseODeath.click();
			Thread.sleep(2000);
			CustomListner.test.log(LogStatus.INFO, "Successfully Display  Brother  Cause Of Death on Health Details family Medical");
			WebElement selectdropdwon = driver.findElement(By.xpath("//ul//li/span[text()='"+FMBSStateAndCause+"']"));
		      waitUtils.waitforElementToBeClickable(driver, selectdropdwon, 100);
		      selectdropdwon.click();
		      CustomListner.test.log(LogStatus.INFO, "Successfully Select Brother Cause Of Death Of Health Details Health Value As=====>"+FMBSStateAndCause);
		
	} else {
		CustomListner.test.log(LogStatus.INFO, "Brother Age Of Death is Not Display On Family Medical");
	}


} else {
	CustomListner.test.log(LogStatus.INFO, "Failed to Option Living And Demise");
}
}
}
public void ValidationOfBrotherLivingInLineErrorMsg() throws InterruptedException {
	

	 WebElement BrotherageErrorMSG= driver.findElement(By.xpath("//span[text()='Please enter age']"));
	 waitUtils.waitforElementToBeClickable(driver, BrotherageErrorMSG, 100);
	 WebElement BrotherstateOfHealthErrorMSG= driver.findElement(By.xpath("//span[text()='Please select state of health']"));
	 waitUtils.waitforElementToBeClickable(driver, BrotherstateOfHealthErrorMSG, 100);
	 TestUtil.scrollToElement(driver, BrotherageErrorMSG);
       String ErrorValue1=BrotherageErrorMSG.getText();
       String ErrorValue2= BrotherstateOfHealthErrorMSG.getText();
        if(BrotherageErrorMSG.isDisplayed()) {
     	   TestUtil.verifybgColor(BrotherageErrorMSG, driver);
     	   CustomListner.test.log(LogStatus.INFO, "Successfully Verified  Brother Age  Inline Error MSG ");
        }
        else {
     	   CustomListner.test.log(LogStatus.INFO, "Failed to Brother Age Error MSG");
        }
        if(BrotherstateOfHealthErrorMSG.isDisplayed()) {
       	   TestUtil.verifybgColor(BrotherstateOfHealthErrorMSG, driver);
       	   CustomListner.test.log(LogStatus.INFO, "Successfully Verify  Brother State Of Health  Inline Error MSG ");
          }
          else {
       	   CustomListner.test.log(LogStatus.INFO, "Failed to Brother State Of Health  Error MSG");
          }
   	
        Assert.assertEquals(ErrorValue1, "Please enter age");
        Assert.assertEquals(ErrorValue2, "Please select state of health");
        
	
	
}


public void ValidationOfBrotherDemiseInLineErrorMsg() throws InterruptedException {
	

	 WebElement BrotherageOfDeathErrorMSG= driver.findElement(By.xpath("//span[text()='Please enter age at Death']"));
	 waitUtils.waitforElementToBeClickable(driver, BrotherageOfDeathErrorMSG, 100);
	 WebElement BrothercauseOfDeathErrorMSG= driver.findElement(By.xpath("//span[text()='Please select cause of death']"));
	 waitUtils.waitforElementToBeClickable(driver, BrothercauseOfDeathErrorMSG, 100);
	 TestUtil.scrollToElement(driver, BrotherageOfDeathErrorMSG);
       String ErrorValue1=BrotherageOfDeathErrorMSG.getText();
       String ErrorValue2= BrothercauseOfDeathErrorMSG.getText();
        if(BrotherageOfDeathErrorMSG.isDisplayed()) {
     	   TestUtil.verifybgColor(BrotherageOfDeathErrorMSG, driver);
     	   CustomListner.test.log(LogStatus.INFO, "Successfully Verified  Brother Age Of Death  Inline Error MSG ");
        }
        else {
     	   CustomListner.test.log(LogStatus.FAIL, "Failed to Brother Age Of Death Inline Error MSG");
        }
        if(BrothercauseOfDeathErrorMSG.isDisplayed()) {
       	   TestUtil.verifybgColor(BrothercauseOfDeathErrorMSG, driver);
       	   CustomListner.test.log(LogStatus.INFO, "Successfully Verify  Brother Cause Of Death  Inline Error MSG ");
          }
          else {
       	   CustomListner.test.log(LogStatus.FAIL, "Failed to Brother Cause Of Death  Error MSG");
          }
   	
        Assert.assertEquals(ErrorValue1, "Please enter age at Death");
        Assert.assertEquals(ErrorValue2, "Please select cause of death");
        
	
	
}
public void ReEnterNameOfBrother() {

WebElement BrotherageReEnter = driver.findElement(By.xpath("//input[@name='age']"));
waitUtils.waitforElementToBeClickable(driver, BrotherageReEnter, 100);
if (BrotherageReEnter.isDisplayed()) {
	BrotherageReEnter.click();


    for (int i = 0; i < 9; i++) {
    	BrotherageReEnter.sendKeys(Keys.BACK_SPACE);
    	BrotherageReEnter.sendKeys(" ");
    	BrotherageReEnter.sendKeys(Keys.DELETE);


    } 

	BrotherageReEnter.sendKeys("30");

	CustomListner.test.log(LogStatus.INFO, "Successfully Display  Brother ReEnter Age is 30 ");
} else {
	CustomListner.test.log(LogStatus.INFO, "Brother ReEnete rAge is Not Display On Health Details Family Medical");
}
}

public void ValidationsOfSisterOnFamilyMedicalWeb(String BrotherLivingDemise,String BrotherAgeDeath,String BrotherStateAndCause) throws InterruptedException {

WebElement sisterlivinganddemise = driver.findElement(By.xpath("(//div[text()='"+BrotherLivingDemise+"'])[3]"));
waitUtils.waitforElementToBeClickable(driver, sisterlivinganddemise, 100);
if (sisterlivinganddemise.isDisplayed()) {
	sisterlivinganddemise.click();
	// Thread.sleep(4000);
	// TestUtil.verifybgColor(fatherlivinganddemise, driver);
	CustomListner.test.log(LogStatus.INFO, "Successfully Display Sister Option Is>>>>>>" + BrotherLivingDemise);
}

if (BrotherLivingDemise.equalsIgnoreCase("Living")) {
	WebElement Sisterage = driver.findElement(By.xpath("(//input[@name='age'])[1]"));
	waitUtils.waitforElementToBeClickable(driver, Sisterage, 100);
	if (Sisterage.isDisplayed()) {
		Sisterage.click();
		Thread.sleep(1000);
		Sisterage.sendKeys(BrotherAgeDeath);
	

		CustomListner.test.log(LogStatus.INFO, "Successfully Display  Sister Age Health Deatails on family Medical>>>>>>>>>>>="+BrotherAgeDeath);
	} else {
		CustomListner.test.log(LogStatus.INFO, "Sister Age is Not Display On Health Details Family Medical");
	}

	WebElement Sistersateofhealth = driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[3]"));
	waitUtils.waitforElementToBeClickable(driver, Sistersateofhealth, 100);
	if (Sistersateofhealth.isDisplayed()) {
		Sistersateofhealth.click();
		Thread.sleep(1000);
		CustomListner.test.log(LogStatus.INFO, "Successfully Display  Sister  State Of Health on Health Details  family Medical");
		WebElement selectdropdwon = driver.findElement(By.xpath("//ul//li/span[text()='"+BrotherStateAndCause+"']"));
	      waitUtils.waitforElementToBeClickable(driver, selectdropdwon, 100);
	      selectdropdwon.click();
	      CustomListner.test.log(LogStatus.INFO, "Successfully Select Sister State Of Health Value As=====>"+BrotherStateAndCause);	
	} else {
		CustomListner.test.log(LogStatus.INFO, "Sister State Of Health is Not Display On Family Medical");
	}

} else if (BrotherLivingDemise.equalsIgnoreCase("Demise")) {
	WebElement sisageOfdeath = driver.findElement(By.xpath("//input[@id='ageAtDeath']"));
	waitUtils.waitforElementToBeClickable(driver, sisageOfdeath, 100);
	if (sisageOfdeath.isDisplayed()) {
		sisageOfdeath.click();
		Thread.sleep(1000);
		sisageOfdeath.sendKeys(BrotherAgeDeath);
		CustomListner.test.log(LogStatus.INFO, "Successfully Display  Sister Age Of Death on Health Details  family Medical>>>>>>"+BrotherAgeDeath);
		

		WebElement sisterCauseODeath = driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[3]"));
		waitUtils.waitforElementToBeClickable(driver, sisterCauseODeath, 100);
		if (sisterCauseODeath.isDisplayed()) {
			sisterCauseODeath.click();
			Thread.sleep(1000);
			CustomListner.test.log(LogStatus.INFO, "Successfully Display  Sister  Cause Of Death on Health Details  family Medical");
			WebElement selectdropdwon = driver.findElement(By.xpath("//ul//li/span[text()='"+BrotherStateAndCause+"']"));
		      waitUtils.waitforElementToBeClickable(driver, selectdropdwon, 100);
		      selectdropdwon.click();
		      CustomListner.test.log(LogStatus.INFO, "Successfully Select Sister Cause Of Death Of Health Value As=====>"+BrotherStateAndCause);
		
	} else {
		CustomListner.test.log(LogStatus.INFO, "Sister Age Of Death is Not Display On Family Medical");
	}


} else {
	CustomListner.test.log(LogStatus.INFO, "Failed to Option Living And Demise");
}
}
}


public void ClickonAddBrotherBTNWeb() {
WebElement TabBTN = driver.findElement(By.xpath("(//span[text()='+ ADD'])[1]"));
if (TabBTN.isDisplayed()) {
	TabBTN.click();
	CustomListner.test.log(LogStatus.INFO, "Successfully  Click  Brother Add BTN  on Health Details family Medical");
} else {
	CustomListner.test.log(LogStatus.INFO, "Failed Click BTN ON Add Brother on Health Details family Medical");
}

}

public void ClickonMultiAddBrotherBTNWeb() {
WebElement multiTabBTN = driver.findElement(By.xpath("//span[text()='+ADD']"));
if (multiTabBTN.isDisplayed()) {
	multiTabBTN.click();
	CustomListner.test.log(LogStatus.INFO, "Successfully  Click  Brother Multiple Add BTN  on Health Details family Medical");
} else {
	CustomListner.test.log(LogStatus.INFO, "Failed Click BTN ON Multiple Add Brother  on Health Details family Medical");
}

}


public void ClickonAddSisterBTNWeb() {
WebElement AddbTN = driver.findElement(By.xpath("(//span[text()='+ ADD'])[2]"));
if (AddbTN.isDisplayed()) {
	AddbTN.click();
	CustomListner.test.log(LogStatus.INFO, "Successfully  Click  Sister Add BTN on Health Details  family Medical");
} else {
	CustomListner.test.log(LogStatus.INFO, "Failed Click Add BTN ON  Sister option on Health Details  family Medical");
}

}

public void ClickonMultiAddSisterBTNWeb() {
WebElement MultiAddbTN = driver.findElement(By.xpath("(//span[text()='+ADD'])[1]"));
if (MultiAddbTN.isDisplayed()) {
	MultiAddbTN.click();
	CustomListner.test.log(LogStatus.INFO, "Successfully  Click  Sister Multiple Add BTN  on family Medical");
} else {
	CustomListner.test.log(LogStatus.INFO, "Failed Click Multiple Add BTN ON  Sister option on family Medical");
}

}


public void ClickonEditBrotherAndSisterBTNWeb() throws InterruptedException {
WebElement editBTN = driver.findElement(By.xpath("(//span[text()='EDIT'])[1]"));
 TestUtil.verifybgColor(editBTN, driver);
if (editBTN.isDisplayed()) {
	editBTN.click();
	CustomListner.test.log(LogStatus.INFO, "Successfully  Click  Brother And Sister Edit BTN  on Health Details  family Medical");
} else {
	CustomListner.test.log(LogStatus.INFO, "Failed Edit BTN Brother And Sister Option  on Health Details  family Medical");
}

}

public void ClickonAddSisterBTNAfterAddingBrotherBTNWeb() {
WebElement editBTN = driver.findElement(By.xpath("//span[text()='+ ADD']"));
if (editBTN.isDisplayed()) {
	editBTN.click();
	CustomListner.test.log(LogStatus.INFO, "Successfully  Click  Sister Adding  BTN  on family Medical");
} else {
	CustomListner.test.log(LogStatus.INFO, "Failed Adding BTN ON  Sister Option  on family Medical");
}

}


public void ClickonRemoveBrotherAndSisterBTNWeb() throws InterruptedException {
WebElement RemoveBTN = driver.findElement(By.xpath("(//span[text()='REMOVE'])[1]"));
 TestUtil.verifybgColor(RemoveBTN, driver);
if (RemoveBTN.isDisplayed()) {
	RemoveBTN.click();
	CustomListner.test.log(LogStatus.INFO, "Successfully  Click  Brother Reomve BTN  on family Medical");
} else {
	CustomListner.test.log(LogStatus.INFO, "Failed Click  Remove BTN  Brother  Option Of family Medical");
}
}

public void ClickonSaveBrotherAndSisterBTNWeb() {
WebElement SaveBTN = driver.findElement(By.xpath("(//span[text()='SAVE'])[1]"));
if (SaveBTN.isDisplayed()) {
	SaveBTN.click();
	CustomListner.test.log(LogStatus.INFO, "Successfully  Click  Brother And Sister Save BTN  on Health Deatails  family Medical");
} else {
	CustomListner.test.log(LogStatus.INFO, "Failed Click  Save BTN  Brother And Sister  Option Of Health Deatails family Medical");
}
}





public void ClickonSaveAndContinueBTNWeb() {
WebElement ContinueSaveBTN = driver.findElement(By.xpath("//span[text()='SAVE & CONTINUE']"));
if (ContinueSaveBTN.isDisplayed()) {
	ContinueSaveBTN.click();
	CustomListner.test.log(LogStatus.INFO, "Successfully  Click   Save And Continue BTN  on Health Deatails  family Medical");
} else {
	CustomListner.test.log(LogStatus.INFO, "Failed Click Save And Continue BTN ON Add on Health Deatails  family Medical");
}

}


public void EnetrFatherStateOfHealthOtherReasonBTNWeb(String agrs) {
WebElement otherReason = driver.findElement(By.xpath("(//input[@placeholder='Please Specify Other Reasons'])"));
if (otherReason.isDisplayed()) {
	otherReason.sendKeys(agrs);
	CustomListner.test.log(LogStatus.INFO, "Successfully  Select Father  Other Option on State Of Health  And Enter Other Reasons Filed  on Health Deatails family Medical Modual");
} else {
	CustomListner.test.log(LogStatus.INFO, "Failed Select Father Option Other State Of Health And Enter Other Reasons  on Health Deatails  family Medical");
}

}

public void EnetrFatherCauseOfDeathOtherReasonBTNWeb(String agrs) {
WebElement otherReason = driver.findElement(By.xpath("(//input[@placeholder='Please Specify Death Reasons'])"));
if (otherReason.isDisplayed()) {
	otherReason.sendKeys(agrs);
	CustomListner.test.log(LogStatus.INFO, "Successfully  Select Father  Other Option On  Cause Of Death And Enter Other cause Of Reasons Filed  on Health Deatails family Medical Modual");
} else {
	CustomListner.test.log(LogStatus.INFO, "Failed Select Father  Other Option Cause Death And Enter Other cause Of Reasons Filed on Health Deatails  family Medical");
}

}



public void ClickSymptomsCoughweb() {
    	WebElement symptoms= driver.findElement(By.xpath("//span[contains(text(),'Cough')]"));
        waitUtils.waitforElementToBeClickable(driver, symptoms, 100);
         if(symptoms.isDisplayed()) {
        	 symptoms.click();
        	 CustomListner.test.log(LogStatus.INFO, "Click Symptoms Cough On Covid 19 Page");
         }else {
         	CustomListner.test.log(LogStatus.INFO, " Symptoms  CheckBox  is not display ");
         }
         TestUtil.scrollToElement(driver, driver.findElement(By.xpath("//div[text()='Tests']")));
    }


public void EnterProvideDetailsOfAnySymptomsWeb(String args) {
        WebElement provideDetailsEle=driver.findElement(By.xpath("//input[@id='details']"));
        waitUtils.waitForElementToBeVisibleweb(driver, provideDetailsEle, 20, "Element is Not Display");
        if(provideDetailsEle.isDisplayed()) {
        	provideDetailsEle.sendKeys(args);
            CustomListner.test.log(LogStatus.INFO, "Enter Provide Details On Seclect Any Symptoms On Covide-19 Page>>>>>"+args);
        }else {
        	CustomListner.test.log(LogStatus.INFO, "Provide Details Filed is not display ");
        }
        
    }


public void EnterProvideDetailsOfAnyCovidContactWeb(String args) {
        WebElement CCprovideDetailsEle=driver.findElement(By.xpath("//input[@name='406']"));
        waitUtils.waitForElementToBeVisibleweb(driver, CCprovideDetailsEle, 20, "Element is Not Display");
        if(CCprovideDetailsEle.isDisplayed()) {
        	CCprovideDetailsEle.sendKeys(args);
            CustomListner.test.log(LogStatus.INFO, "Enter Provide Details On Covid Contact  Covide-19 Page>>>>>"+args);
        }else {
        	CustomListner.test.log(LogStatus.INFO, "Provide Details Filed is not display ");
        }
        
    }


/*

public void VerificationOfAllTitleOnCoividPageWeb() throws InterruptedException {

        WebElement symptomsEle=driver.findElement(By.xpath("//div[text()='Symptoms']"));
        waitUtils.waitForElementToBeVisibleweb(driver, symptomsEle, 20, "Element is Not Display");
        if(symptomsEle.isDisplayed()) {
		TestUtil.verifybgColor(symptomsEle, driver);
        CustomListner.test.log(LogStatus.INFO, "Successfully Display  Symptoms Title Card  On Covide-19 Page");
        }else {
        	CustomListner.test.log(LogStatus.INFO, " Symptoms Title Card  On Covide-19 Page is Not Display");
        }
        TestUtil.scrollToElement(driver, driver.findElement(By.xpath("//div[text()='Tests']")));
        WebElement testEle=driver.findElement(By.xpath("//div[text()='Tests']"));
        waitUtils.waitForElementToBeVisibleweb(driver, testEle, 20, "Element is Not Display");
        if(testEle.isDisplayed()) {
		TestUtil.verifybgColor(testEle, driver);
        CustomListner.test.log(LogStatus.INFO, "Successfully Display  test Title Card  On Covide-19 Page");
        }else {
        	CustomListner.test.log(LogStatus.INFO, "test Title Card  On Covide-19 Page Is Not Display");
        }
        TestUtil.scrollToElement(driver, driver.findElement(By.xpath("//div[text()='Diagnosed']")));
        WebElement diagnosedEle=driver.findElement(By.xpath("//div[text()='Diagnosed']"));
        if(diagnosedEle.isDisplayed()) {
        waitUtils.waitForElementToBeVisibleweb(driver, diagnosedEle, 20, "Element is Not Display");
		TestUtil.verifybgColor(diagnosedEle, driver);
        CustomListner.test.log(LogStatus.INFO, "Successfully Display  diagnosed Title Card  On Covide-19 Page");
        }else {
        	  CustomListner.test.log(LogStatus.INFO, "diagnosed Title Card  On Covide-19 Page Is Not Dispaly");
        }
        TestUtil.scrollToElement(driver,driver.findElement(By.xpath("//div[text()='Covid Contact']") ));
        WebElement covidContactEle=driver.findElement(By.xpath("//div[text()='Covid Contact']"));
        waitUtils.waitForElementToBeVisibleweb(driver, covidContactEle, 20, "Element is Not Display");
        if(covidContactEle.isDisplayed()) {
		TestUtil.verifybgColor(covidContactEle, driver);
        CustomListner.test.log(LogStatus.INFO, "Successfully Display  covid Contact Title Card  On Covide-19 Page");
        }else {
        	 CustomListner.test.log(LogStatus.INFO, " covid Contact Title Card  On Covide-19 Page Is Not Display");
        }
        TestUtil.scrollToElement(driver, driver.findElement(By.xpath("//div[text()='Quarantine']")));
        WebElement QuarantineEle=driver.findElement(By.xpath("//div[text()='Quarantine']"));
        waitUtils.waitForElementToBeVisibleweb(driver, QuarantineEle, 20, "Element is Not Display");
        if(QuarantineEle.isDisplayed()){
		TestUtil.verifybgColor(QuarantineEle, driver);
        CustomListner.test.log(LogStatus.INFO, "Successfully Display  Quarantine Title Card  On Covide-19 Page");
        }else {
        	 CustomListner.test.log(LogStatus.INFO, " Quarantine Title Card  On Covide-19 Page Is Not Displaty");
        }
        TestUtil.scrollToElement(driver,driver.findElement(By.xpath("//div[text()='Health']")));
        WebElement HealthEle=driver.findElement(By.xpath("//div[text()='Health']"));
        waitUtils.waitForElementToBeVisibleweb(driver, HealthEle, 20, "Element is Not Display");
        if(HealthEle.isDisplayed()) {
		TestUtil.verifybgColor(HealthEle, driver);
        CustomListner.test.log(LogStatus.INFO, "Successfully Display  Health Title Card  On Covide-19 Page");
        }else {
        	 CustomListner.test.log(LogStatus.INFO, "Health Title Card  On Covide-19 Page Is Not Display");
        }
        TestUtil.scrollToElement(driver,driver.findElement(By.xpath("//div[text()='Past Travel']") ));
        WebElement PastTravelEle=driver.findElement(By.xpath("//div[text()='Past Travel']"));
        waitUtils.waitForElementToBeVisibleweb(driver, PastTravelEle, 20, "Element is Not Display");
        if(PastTravelEle.isDisplayed()) {
		TestUtil.verifybgColor(PastTravelEle, driver);
        CustomListner.test.log(LogStatus.INFO, "Successfully Display  Past Travel Title Card  On Covide-19 Page");
		TestUtil.scrollTillEndOfPage(driver);
        }else {
        	  CustomListner.test.log(LogStatus.INFO, "Past Travel Title Card  On Covide-19 Page Is Not Display");
        }
       // TestUtil.scrollToElement(driver, driver.findElement(By.xpath("//div[text()='Future travel']")));
        WebElement FuturetravelEle=driver.findElement(By.xpath("//div[text()='Future travel']"));
        waitUtils.waitForElementToBeVisibleweb(driver, FuturetravelEle, 20, "Element is Not Display");
        if(FuturetravelEle.isDisplayed()) {
		TestUtil.verifybgColor(FuturetravelEle, driver);
        CustomListner.test.log(LogStatus.INFO, "Successfully Display  Future travel Title Card  On Covide-19 Page");
        }else {
        	  CustomListner.test.log(LogStatus.INFO, "Future travel Title Card  On Covide-19 Page Is Not DisPlay");
        }
       // TestUtil.scrollToElement(driver,driver.findElement(By.xpath("//div[text()='Covid Vaccination']") ));
        WebElement CovidVaccinationEle=driver.findElement(By.xpath("//div[text()='Covid Vaccination']"));
        waitUtils.waitForElementToBeVisibleweb(driver, CovidVaccinationEle, 20, "Element is Not Display");
        if(CovidVaccinationEle.isDisplayed()) {
		TestUtil.verifybgColor(CovidVaccinationEle, driver);
        CustomListner.test.log(LogStatus.INFO, "Successfully Display  Covid Vaccination Title Card  On Covide-19 Page");
        }else {
        	 CustomListner.test.log(LogStatus.INFO, "Covid Vaccination Title Card  On Covide-19 Page Is Not Display");
        }
      //  TestUtil.scrollToElement(driver,driver.findElement(By.xpath("//div[text()='For Health Worker Only']")));
        WebElement HealthWorkerOnlyEle=driver.findElement(By.xpath("//div[text()='For Health Worker Only']"));
        waitUtils.waitForElementToBeVisibleweb(driver, HealthWorkerOnlyEle, 20, "Element is Not Display");
        if(HealthWorkerOnlyEle.isDisplayed()) {
		TestUtil.verifybgColor(HealthWorkerOnlyEle, driver);
        CustomListner.test.log(LogStatus.INFO, "Successfully Display  Health Worker Only Title Card  On Covide-19 Page");
        }else {
        	  CustomListner.test.log(LogStatus.INFO, " Health Worker Only Title Card  On Covide-19 Page Is Not Display");
        }
        //TestUtil.scrollToElement(driver, driver.findElement(By.xpath("//div[text()='Consent']")));
        WebElement ConsentEle=driver.findElement(By.xpath("//div[text()='Consent']"));
        waitUtils.waitForElementToBeVisibleweb(driver, ConsentEle, 20, "Element is Not Display");
        if(ConsentEle.isDisplayed()) {
		TestUtil.verifybgColor(ConsentEle, driver);
        CustomListner.test.log(LogStatus.INFO, "Successfully Display  Consent Title Card  On Covide-19 Page");
        }else {
        	 CustomListner.test.log(LogStatus.INFO, " Consent Title Card  On Covide-19 Page Is Not Display");
        }
        
    }

*/

public void VerificationOfAllTitleOnCoividPageWeb(String  titles) throws InterruptedException {

TestUtil.scrollToElement(driver, driver.findElement(By.xpath("//div[text()='"+titles+"']")));
WebElement Title=driver.findElement(By.xpath("//div[text()='"+titles+"']"));

if(Title.isDisplayed()) {
	TestUtil.verifybgColor(Title, driver);
	
    CustomListner.test.log(LogStatus.INFO, "Successfully Verify titles  As=====>"+ titles);
}else {
	CustomListner.test.log(LogStatus.FAIL, "Titles On Covid -19 Page   is not display ");
}



}

public void VerificationOfSymptomsWithinLast14dayOnCoividPageWeb(String  titles) throws InterruptedException {

TestUtil.scrollToElement(driver, driver.findElement(By.xpath("//span[text()='"+titles+"']")));
WebElement Title=driver.findElement(By.xpath("//span[text()='"+titles+"']"));

if(Title.isDisplayed()) {
	TestUtil.verifybgColor(Title, driver);
	
    CustomListner.test.log(LogStatus.INFO, "Successfully Verify symptoms within last 14 days  As=====>"+ titles);
}else {
	CustomListner.test.log(LogStatus.FAIL, "symptoms within last 14 days Card  is not display ");
}



}






/*
public void VerificationOfSymptomsOnCoividPageWeb() throws InterruptedException {

        WebElement symptomsEle=driver.findElement(By.xpath("//div[text()='Symptoms']"));
        waitUtils.waitForElementToBeVisibleweb(driver, symptomsEle, 20, "Element is Not Display");
        if(symptomsEle.isDisplayed()) {
		TestUtil.verifybgColor(symptomsEle, driver);
        CustomListner.test.log(LogStatus.INFO, "Successfully Display  Symptoms Title Card  On Covide-19 Page");
        }else {
        	CustomListner.test.log(LogStatus.INFO, " Symptoms Title Card  On Covide-19 Page is Not Display");
        }
        
        WebElement noneEle=driver.findElement(By.xpath("//input[@value='{\"optionId\":\"Q401A0\",\"text\":\"None\"}']"));
        waitUtils.waitForElementToBeVisibleweb(driver, noneEle, 20, "Element is Not Display");
        if(noneEle.isDisplayed()) {
		TestUtil.verifybgColor(noneEle, driver);
        CustomListner.test.log(LogStatus.INFO, "Successfully Verify NO button selected by default  On Symptoms Title Card");
        }else {
        	CustomListner.test.log(LogStatus.INFO, "Failed To No button Selected By default on Symptoms Title Card");
        }
      
        WebElement feverEle=driver.findElement(By.xpath("//span[text()='Fever (Greater than 38C or 100.4 F)']"));
        if(feverEle.isDisplayed()) {
        waitUtils.waitForElementToBeVisibleweb(driver, feverEle, 20, "Element is Not Display");
		TestUtil.verifybgColor(feverEle, driver);
        CustomListner.test.log(LogStatus.INFO, "Successfully Display Fever Symptoms  On Covide-19 Page");
        }else {
        	  CustomListner.test.log(LogStatus.INFO, "Fever Symptoms  On Covide-19 Page Is Not Dispaly");
        }
        
        WebElement shortnessEle=driver.findElement(By.xpath("//span[text()='Shortness of breath']"));
        waitUtils.waitForElementToBeVisibleweb(driver, shortnessEle, 20, "Element is Not Display");
        if(shortnessEle.isDisplayed()) {
		TestUtil.verifybgColor(shortnessEle, driver);
        CustomListner.test.log(LogStatus.INFO, "Successfully Display  Shortness of breath Symptoms On Covide-19 Page");
        }else {
        	 CustomListner.test.log(LogStatus.INFO, " Shortness of breath symptoms On Covide-19 Page Is Not Display");
        }
     
        WebElement CoughEle=driver.findElement(By.xpath("//span[text()='Cough']"));
        waitUtils.waitForElementToBeVisibleweb(driver, CoughEle, 20, "Element is Not Display");
        if(CoughEle.isDisplayed()){
		TestUtil.verifybgColor(CoughEle, driver);
        CustomListner.test.log(LogStatus.INFO, "Successfully Display Cough symptoms On Covide-19 Page");
        }else {
        	 CustomListner.test.log(LogStatus.INFO, " Cough symptoms On Covide-19 Page Is Not Displaty");
        }
       
        WebElement malaiseEle=driver.findElement(By.xpath("//span[text()='Malaise (flu-like tiredness)']"));
        waitUtils.waitForElementToBeVisibleweb(driver, malaiseEle, 20, "Element is Not Display");
        if(malaiseEle.isDisplayed()) {
		TestUtil.verifybgColor(malaiseEle, driver);
        CustomListner.test.log(LogStatus.INFO, "Successfully Display  Malaise (flu-like tiredness) Symptoms On Covide-19 Page");
        }else {
        	 CustomListner.test.log(LogStatus.INFO, "Malaise (flu-like tiredness) Symptoms On Covide-19 Page Is Not Display");
        }
       
        WebElement rahinorrheaEle=driver.findElement(By.xpath("//span[text()='Rhinorrhea (mucus discharge from the nose)']"));
        waitUtils.waitForElementToBeVisibleweb(driver, rahinorrheaEle, 20, "Element is Not Display");
        if(rahinorrheaEle.isDisplayed()) {
		TestUtil.verifybgColor(rahinorrheaEle, driver);
        CustomListner.test.log(LogStatus.INFO, "Successfully Display  Rhinorrhea (mucus discharge from the nose) Symptoms On Covide-19 Page");
		TestUtil.scrollTillEndOfPage(driver);
        }else {
        	  CustomListner.test.log(LogStatus.INFO, "Rhinorrhea (mucus discharge from the nose) Symptoms  On Covide-19 Page Is Not Display");
        }
        TestUtil.scrollToElement(driver, driver.findElement(By.xpath("//span[text()='Sore Throat']")));
        WebElement SoreThroatEle=driver.findElement(By.xpath("//span[text()='Sore Throat']"));
        waitUtils.waitForElementToBeVisibleweb(driver, SoreThroatEle, 20, "Element is Not Display");
        if(SoreThroatEle.isDisplayed()) {
		TestUtil.verifybgColor(SoreThroatEle, driver);
        CustomListner.test.log(LogStatus.INFO, "Successfully Display Sore Throat Symptoms On Covide-19 Page");
        }else {
        	  CustomListner.test.log(LogStatus.INFO, "Sore Throat Symptoms On Covide-19 Page Is Not DisPlay");
        }
        TestUtil.scrollToElement(driver,driver.findElement(By.xpath("//span[text()='Gastro-intestinal symptoms such as nausea/vomiting and/or diarrhea']")));
        WebElement gastroEle=driver.findElement(By.xpath("//span[text()='Gastro-intestinal symptoms such as nausea/vomiting and/or diarrhea']"));
        waitUtils.waitForElementToBeVisibleweb(driver, gastroEle, 20, "Element is Not Display");
        if(gastroEle.isDisplayed()) {
		TestUtil.verifybgColor(gastroEle, driver);
        CustomListner.test.log(LogStatus.INFO, "Successfully Display Gastro-intestinal symptoms such as nausea/vomiting and/or diarrhea Symptoms   On Covide-19 Page");
        }else {
        	 CustomListner.test.log(LogStatus.INFO, "Gastro-intestinal symptoms such as nausea/vomiting and/or diarrhea Symptoms  On Covide-19 Page Is Not Display");
        }
        
    }
*/




public void ClickonTestsYesBTNweb() {
 TestUtil.scrollToElement(driver, driver.findElement(By.xpath("//div[text()='Quarantine']")));
  WebElement testBTN=driver.findElement(By.xpath("//div[text()='Yes']"));
        waitUtils.waitforElementToBeClickable(driver, testBTN, 100);
         if(testBTN.isDisplayed()) {
        	 testBTN.click();
        	 CustomListner.test.log(LogStatus.INFO, "Click Tests BTN On Covid 19 Page");
         }else {
         	CustomListner.test.log(LogStatus.INFO, " Tests BTN  is not display ");
         }
        
    }




public void ClickonDiagnosedYesBTNweb() {
 TestUtil.scrollToElement(driver, driver.findElement(By.xpath("//div[text()='Quarantine']")));
  WebElement DiagnosedBTN=driver.findElement(By.xpath("(//div[contains(text(),'Yes')])[2]"));
        waitUtils.waitforElementToBeClickable(driver, DiagnosedBTN, 100);
         if(DiagnosedBTN.isDisplayed()) {
        	 DiagnosedBTN.click();
        	 CustomListner.test.log(LogStatus.INFO, "Click Diagnosed BTN On Covid 19 Page");
         }else {
         	CustomListner.test.log(LogStatus.INFO, " Diagnosed BTN  is not display ");
         }
        
    }




public void ClickonCovidContactYesBTNweb() {
 TestUtil.scrollToElement(driver, driver.findElement(By.xpath("//div[text()='Quarantine']")));
  WebElement CovidContactBTN=driver.findElement(By.xpath("(//div[contains(text(),'Yes')])[3]"));
        waitUtils.waitforElementToBeClickable(driver, CovidContactBTN, 100);
         if(CovidContactBTN.isDisplayed()) {
        	 CovidContactBTN.click();
        	 CustomListner.test.log(LogStatus.INFO, "Click Covid Contact BTN On Covid 19 Page");
         }else {
         	CustomListner.test.log(LogStatus.INFO, " Covid Contact BTN  is not display ");
         }
        
    }


public void validationTestsErrorMSgWebWeb() throws InterruptedException {
try {
WebElement testsErrorMSg=driver.findElement(By.xpath("//p[text()='Please enter this field']"));
String Testvalue=testsErrorMSg.getText();
if(testsErrorMSg.isDisplayed()) {
 TestUtil.verifybgColor(testsErrorMSg, driver);
CustomListner.test.log(LogStatus.INFO, "Successfully Verify Please enter this field Error MSG On Tests   ");
}else {
 CustomListner.test.log(LogStatus.INFO, " Please enter this field on Tests is not display ");
}

Assert.assertEquals(Testvalue, "Please enter this field");
}catch(NoSuchElementException e) {
    
	 CustomListner.test.log(LogStatus.FAIL, "Please enter this field on Tests is not display  ");
	
}

}


public void validationCovidContactErrorMSgWebWeb() throws InterruptedException {
try {
	WebElement CovidContactErrorMSg = driver.findElement(By.xpath("//p[text()='Please enter this field']"));
	String CovidContactvalue = CovidContactErrorMSg.getText();
	if (CovidContactErrorMSg.isDisplayed()) {
		TestUtil.verifybgColor(CovidContactErrorMSg, driver);
		CustomListner.test.log(LogStatus.INFO, "Successfully Verify Please enter this field Error MSG On  Covid Contact  ");
	} else {
		CustomListner.test.log(LogStatus.INFO, " Please enter this field on Tests is not display ");
	}

	Assert.assertEquals(CovidContactvalue, "Please enter this field");
} catch (NoSuchElementException e) {

	CustomListner.test.log(LogStatus.FAIL, "Please enter this field on Tests is not display  ");

}

}

public void fillDOBdetailsPositiveDiagnosisWeb(String day, String month, String year) {
WebElement DiagnosisDOBDay = driver.findElement(By.xpath("//input[contains(@id,'day451')]"));
waitUtils.waitforElementToBeClickable(driver, DiagnosisDOBDay, 100);
DiagnosisDOBDay.click();
DiagnosisDOBDay.sendKeys(day);
CustomListner.test.log(LogStatus.INFO, "Enter Provide the Date of Positive Diagnosis DOB(day) As=====> "+day);
WebElement DiagnosisDOBMonth=driver.findElement(By.xpath("//input[contains(@id,'month451')]"));
waitUtils.waitforElementToBeClickable(driver,DiagnosisDOBMonth,100);
DiagnosisDOBMonth.clear();
DiagnosisDOBMonth.sendKeys(month);
CustomListner.test.log(LogStatus.INFO, "EnterProvide the Date of Positive Diagnosis DOB(month) As=====> "+month);

WebElement DiagnosisDOBYear=driver.findElement(By.xpath("//input[contains(@id,'year451')]"));
DiagnosisDOBYear.clear();
DiagnosisDOBYear.sendKeys(year);
CustomListner.test.log(LogStatus.INFO, "Enter Provide the Date of Positive Diagnosis DOB(year) As=====> "+year);

}
public void validationDiagnosedDOBErrorMSgWebWeb() throws InterruptedException {
try {
WebElement DayErrorMSg=driver.findElement(By.xpath("//p[text()='Enter Day']"));
WebElement MonthErrorMSg=driver.findElement(By.xpath("//p[text()='Enter month']"));
WebElement YearErrorMSg=driver.findElement(By.xpath("//p[text()='Enter year']"));

String Diagnosedvalue1=DayErrorMSg.getText();
String Diagnosedvalue2=MonthErrorMSg.getText();
String Diagnosedvalue3=YearErrorMSg.getText();

if(DayErrorMSg.isDisplayed()) {
 TestUtil.verifybgColor(DayErrorMSg, driver);
CustomListner.test.log(LogStatus.INFO, "Successfully Display Provide the Date of Positive Diagnosis Day Error MSG  ");
}else {
 CustomListner.test.log(LogStatus.INFO, "  Day on Diagnosed Error MSg is not display ");
}

if(MonthErrorMSg.isDisplayed()) {
 TestUtil.verifybgColor(MonthErrorMSg, driver);
CustomListner.test.log(LogStatus.INFO, "SSuccessfully Display Provide the Date of Positive Diagnosis Month Error MSG   ");
}else {
 CustomListner.test.log(LogStatus.INFO, "  Month on Diagnosed Error MSG  is not display ");
}

if(YearErrorMSg.isDisplayed()) {
 TestUtil.verifybgColor(YearErrorMSg, driver);
CustomListner.test.log(LogStatus.INFO, "Successfully Display Provide the Date of Positive Diagnosis Year Error MSG  ");
}else {
 CustomListner.test.log(LogStatus.INFO, "  Year on Diagnosed Error MSG is not display ");
}

Assert.assertEquals(Diagnosedvalue1, "Enter Day");
Assert.assertEquals(Diagnosedvalue2, "Enter month");
Assert.assertEquals(Diagnosedvalue3, "Enter year");

}catch(NoSuchElementException e) {
    
	 CustomListner.test.log(LogStatus.FAIL, "Diagnosed DOB Filed  is not display  ");
	
}

}

public void EnterProvideDetailsOfTestWeb(String args) {
        WebElement provideDetailsTestEle=driver.findElement(By.xpath("//input[contains(@name,'404')]"));
        waitUtils.waitForElementToBeVisibleweb(driver, provideDetailsTestEle, 20, "Element is Not Display");
        if(provideDetailsTestEle.isDisplayed()) {
        	provideDetailsTestEle.sendKeys(args);
            CustomListner.test.log(LogStatus.INFO, "Enter Provide Details On Tests>>>>>"+args);
        }else {
        	CustomListner.test.log(LogStatus.INFO, "Provide Details Filed is not display ");
        }
        
    }





















//=================================Below Nikhil======================
/*
public void EnterWeight(String weight) {
        WebElement WeightEle=driver.findElement(By.xpath("//input[@placeholder='Enter Weight']"));
        waitUtils.waitForElementToBeVisibleweb(driver, WeightEle, 20, "Element is Not Display");
        if(WeightEle.isDisplayed()) {
        	WeightEle.sendKeys(weight);
            CustomListner.test.log(LogStatus.INFO, "Enter Weight As=====> "+weight);
        }else {
        	CustomListner.test.log(LogStatus.INFO, "Weight is not display ");
        }
    }


public void ClicLifeStyleSaveContinueBtn() {
        WebElement saveContinueEle=driver.findElement(By.xpath("//span[text()='Save & Continue']"));
        if(saveContinueEle.isDisplayed()) {
        	saveContinueEle.click();
            CustomListner.test.log(LogStatus.INFO, "Click on Save & Continue Button");
        }else {
        	CustomListner.test.log(LogStatus.INFO, "Save & Continue Button is not display ");
        }
    }
public void ClickSaveContinueBtn() {
 WebElement saveContinueEle=driver.findElement(By.xpath("//span[text()='Save & Continue']"));
 if(saveContinueEle.isDisplayed()) {
  saveContinueEle.click();
     CustomListner.test.log(LogStatus.INFO, "Click on Save & Continue Button");
 }else {
  CustomListner.test.log(LogStatus.INFO, "Save & Continue Button is not display ");
 }
}
*/
	    
	    
}
