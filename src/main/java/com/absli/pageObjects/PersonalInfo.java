package com.absli.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.absli.Listner.CustomListner;
import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import util.TestUtil;
//import java.util.regex.Pattern;

public class PersonalInfo extends TestBase{

    public WebDriver driver;
    public AndroidDriver driver1;
    public IOSDriver driver2;
    public WaitUtils waitUtils;
    LoginPage loginPage;
    Dashboard dashboard;
    CustomerProfile customerProfile;

    // Initializing the Page Objects:
    public PersonalInfo(AndroidDriver driver1) {
        this.driver1 = driver1;
        waitUtils = new WaitUtils();
    }

    public PersonalInfo(WebDriver driver) {
        this.driver = driver;
        waitUtils = new WaitUtils();
    }

    public PersonalInfo(IOSDriver driver) {
        this.driver2 = driver;
        waitUtils = new WaitUtils();
    }


    
    
    public void clickpersonalinfoDOITLETTERBtnWeb() {
  	  WebElement doitletterBtn = driver.findElement(By.xpath("(//span[text()='DO IT LATER '])[2]"));
  	  waitUtils.waitforElementToBeClickable(driver, doitletterBtn, 100);
      if(doitletterBtn.isDisplayed()) {
    	  doitletterBtn.click();
      	 CustomListner.test.log(LogStatus.INFO, "Click on DO IT LATER Button On  Personal Info Page ");
      }else {
          
          CustomListner.test.log(LogStatus.FAIL, "DO IT LATER Button is Not Display");
      }
  }
    public void clickpersonalinfoExstingPageDOITLETTERBtnWeb() {
    	  WebElement doitletterBtn = driver.findElement(By.xpath("//span[text()='DO IT LATER ']"));
    	  waitUtils.waitforElementToBeClickable(driver, doitletterBtn, 100);
        if(doitletterBtn.isDisplayed()) {
      	  doitletterBtn.click();
        	 CustomListner.test.log(LogStatus.INFO, "Click on PersonalInfo Exsting Policy DO IT LATER Button");
        }else {
  
            CustomListner.test.log(LogStatus.FAIL, "Failed To lick  PersonalInfo Exsting Policy DO IT LATER  ");
        }
        
        
    }
    
    
    public void VerifyExstingPolicyPageWeb() {
        WebElement EleExstingpage=driver.findElement(By.xpath("(//h2[text()='Existing Policy'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, EleExstingpage, 100);
        boolean EleExstingpagePresent = EleExstingpage.isDisplayed();
        if(EleExstingpage.isDisplayed()) {

            CustomListner.test.log(LogStatus.INFO, " Successfully Nevigate To Exsting Policy Page ");
        }else {
        	CustomListner.test.log(LogStatus.FAIL, "Exsting Policy Page is not display ");
        }
        Assert.assertTrue(EleExstingpagePresent, "Exsting Page Not Display");
    }
    
    
    
    public void clickAddExstingPolicyBtnWeb() {
  	  WebElement addexstingpolicyBtn = driver.findElement(By.xpath("(//img[@alt='add icon'])[1]"));
  	  waitUtils.waitforElementToBeClickable(driver, addexstingpolicyBtn, 30);
      if(addexstingpolicyBtn.isDisplayed()) {
    	  addexstingpolicyBtn.click();
      	 CustomListner.test.log(LogStatus.INFO, " click on Add Exsting Policy  Button ");
      }else {
          System.out.println("Add BTN is not visible");
          CustomListner.test.log(LogStatus.FAIL, "Add Exsting Policy BTN Is Not Display");
      }
  }
    
    
    public void verifyAllExstingPolicyWeb() throws InterruptedException {
    	
    	WebElement insurename =driver.findElement(By.xpath("(//input[@id='insurerName'])[1]"));
    	 waitUtils.waitforElementToBeClickable(driver, insurename, 100);
      
        TestUtil.verifybgColor(insurename, driver);
        Assert.assertTrue(insurename.isDisplayed());
        CustomListner.test.log(LogStatus.INFO, "Successfully Display Name of insurer");	
    	

    	WebElement sumassured =driver.findElement(By.xpath("(//input[@id='sumAssured'])[1]"));
    	 waitUtils.waitforElementToBeClickable(driver, sumassured, 100);
        TestUtil.verifybgColor(sumassured, driver);
        Assert.assertTrue(sumassured.isDisplayed());
        CustomListner.test.log(LogStatus.INFO, "Successfully Display Sum assured ");	
    	

    	WebElement policynumber=driver.findElement(By.xpath("(//input[@id='policyNumber'])[1]"));
    	 waitUtils.waitforElementToBeClickable(driver, policynumber, 100);
        TestUtil.verifybgColor(policynumber, driver);
        Assert.assertTrue(policynumber.isDisplayed());
        CustomListner.test.log(LogStatus.INFO, "Successfully Display policy Number ");	
        
        
        WebElement yearapplication=driver.findElement(By.xpath("(//input[@id='applicationYear'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, yearapplication, 100);
        TestUtil.verifybgColor(yearapplication, driver);
        Assert.assertTrue(yearapplication.isDisplayed());
        CustomListner.test.log(LogStatus.INFO, "Successfully Display year Of Application ");
        
        
        WebElement baseplan=driver.findElement(By.xpath("(//input[@id='basePlan'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, baseplan, 100);
        TestUtil.verifybgColor(baseplan, driver);
        Assert.assertTrue(baseplan.isDisplayed());
        CustomListner.test.log(LogStatus.INFO, "Successfully Display Base Plan ");
        
        WebElement annualpre=driver.findElement(By.xpath("(//input[@id='annualPremium'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, annualpre, 100);
        TestUtil.verifybgColor(annualpre, driver);
        Assert.assertTrue(annualpre.isDisplayed());
        CustomListner.test.log(LogStatus.INFO, "Successfully Display Annual Premium ");
        TestUtil.scrollTillEndOfPage(driver);
        
        WebElement policystatus=driver.findElement(By.xpath("(//input[@id='policyStatus'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, policystatus, 100);
        TestUtil.verifybgColor(policystatus, driver);
        Assert.assertTrue(policystatus.isDisplayed());
        CustomListner.test.log(LogStatus.INFO, "Successfully Display policy Status");
    	
    }
    
    public void EnterInsurerNameONExstingPolicyWeb(String args) {
        WebElement insurename=driver.findElement(By.xpath("(//input[@id='insurerName'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, insurename, 30);
        if(insurename.isDisplayed()) {
        	insurename.sendKeys(args);
            CustomListner.test.log(LogStatus.INFO, "Enter Insure Name on Adding Exsting Policy   As=====>"+args);
        }else {
        	CustomListner.test.log(LogStatus.INFO, " Insure Name on Adding Exsting Policy is not display ");
        }
    }
    
    
    public void EnterSumAssuredONExstingPolicyWeb(String args) {
        WebElement Elesumassure=driver.findElement(By.xpath("(//input[@id='sumAssured'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, Elesumassure, 30);
        if(Elesumassure.isDisplayed()) {
        	Elesumassure.sendKeys(args);
            CustomListner.test.log(LogStatus.INFO, "Enter Sum Assured on Adding Exsting Policy   As=====>"+args);
        }else {
        	CustomListner.test.log(LogStatus.FAIL, " Enter Sum Assured on Adding Exsting Policy is not display ");
        }
    }
    
    public void EnterPolicyNumberONExstingPolicyWeb(String args) {
        WebElement Elepolicyno=driver.findElement(By.xpath("(//input[@id='policyNumber'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, Elepolicyno, 30);
        if(Elepolicyno.isDisplayed()) {
        	Elepolicyno.sendKeys(args);
            CustomListner.test.log(LogStatus.INFO, "Enter Policy Number on Adding Exsting Policy   As=====>"+args);
        }else {
        	CustomListner.test.log(LogStatus.FAIL, " Policy Number on Adding Exsting Policy is not display ");
        }
    }
    
    
    
    public void EnterYearOfApplicationONExstingPolicyWeb(String args) {
        WebElement Eleyear=driver.findElement(By.xpath("(//input[@id='applicationYear'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, Eleyear, 30);
        if(Eleyear.isDisplayed()) {
        	Eleyear.sendKeys(args);
            CustomListner.test.log(LogStatus.INFO, "Enter Year Of Application on Adding Exsting Policy   As=====>"+args);
        }else {
        	CustomListner.test.log(LogStatus.FAIL, " Year Of Application on Adding Exsting Policy is not display ");
        }
    }
    
    
    
    
    
    public void EnterBasePlanONExstingPolicyWeb(String args) {
        WebElement Eleplan=driver.findElement(By.xpath("(//input[@id='basePlan'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, Eleplan, 30);
        if(Eleplan.isDisplayed()) {
        	Eleplan.sendKeys(args);
            CustomListner.test.log(LogStatus.INFO, "Enter Base Plan on Adding Exsting Policy   As=====>"+args);
        }else {
        	CustomListner.test.log(LogStatus.FAIL, " Base Plan on Adding Exsting Policy is not display ");
        }
    }
    
    
    public void EnterAnnualpremiumONExstingPolicyWeb(String args) {
        WebElement Eleannualpremi=driver.findElement(By.xpath("(//input[@id='annualPremium'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, Eleannualpremi, 30);
        if(Eleannualpremi.isDisplayed()) {
        	Eleannualpremi.sendKeys(args);
            CustomListner.test.log(LogStatus.INFO, "Enter Annual Premium on Adding Exsting Policy   As=====>"+args);
        }else {
        	CustomListner.test.log(LogStatus.FAIL, " Annual Premium on Adding Exsting Policy is not display ");
        }
    }
    
    public void EnterPolicyStatusONExstingPolicyWeb(String args) {
        WebElement Elestatus=driver.findElement(By.xpath("(//input[@id='policyStatus'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, Elestatus, 30);
        if(Elestatus.isDisplayed()) {
        	Elestatus.sendKeys(args);
            CustomListner.test.log(LogStatus.INFO, "Enter Policy Status on Adding Exsting Policy   As=====>"+args);
        }else {
        	CustomListner.test.log(LogStatus.FAIL, " Policy Status on Adding Exsting Policy is not display ");
        }
    }
    
    public void clickMedicalPolicyBtnWeb(String args) {
  	  WebElement medicalpolicyBtn = driver.findElement(By.xpath("//span/div[text()='"+args+"']"));
  	  waitUtils.waitforElementToBeClickable(driver, medicalpolicyBtn, 100);
      if(medicalpolicyBtn.isDisplayed()) {
    	  medicalpolicyBtn.click();
    	  CustomListner.test.log(LogStatus.INFO, "Select Medical Policy On Exsting Policy Page  As=====>"+args);
      }else {
          CustomListner.test.log(LogStatus.FAIL, "Failed Select Medical Policy BTN ");
      }
  }
    
    
    public void clickSaveExstingPolicyBtnWeb() {
    	  WebElement policysaveBtn = driver.findElement(By.xpath("(//span[text()='SAVE'])[1]"));
    	  waitUtils.waitforElementToBeClickable(driver, policysaveBtn, 100);
        if(policysaveBtn.isDisplayed()) {
        	policysaveBtn.click();
      	  CustomListner.test.log(LogStatus.INFO, "click Save BTN ON Exsting Policy");
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Failed click Save BTN ");
        }
    }
    
	public void EnterAddedTwoExstingPolicyWeb(String insurerName, String sumAssured, String policyNumber,
			String yearOfApplication, String basePlan, String annualPremium, String policyStatus, String medicalPolicy)
			throws InterruptedException {

		WebElement insurename2 = driver.findElement(By.xpath("(//input[@id='insurerName'])[2]"));
		waitUtils.waitforElementToBeClickable(driver, insurename2, 30);
		if (insurename2.isDisplayed()) {
			insurename2.sendKeys(insurerName);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Insure Name on Adding Second  Exsting Policy   As=====>" + insurerName);
		} else {
			CustomListner.test.log(LogStatus.FAIL, "  Insure Name on Adding Second  Exsting Policy is not display ");
		}

		WebElement Elesumassure2 = driver.findElement(By.xpath("(//input[@id='sumAssured'])[2]"));
		if (Elesumassure2.isDisplayed()) {
			Elesumassure2.sendKeys(sumAssured);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Sum Assured on Adding Second Exsting Policy   As=====>" + sumAssured);
		} else {
			CustomListner.test.log(LogStatus.FAIL,
					" Enter Sum Assured on Adding Second  Exsting Policy is not display ");
		}
		WebElement Elepolicyno2 = driver.findElement(By.xpath("(//input[@id='policyNumber'])[2]"));
		if (Elepolicyno2.isDisplayed()) {
			Elepolicyno2.sendKeys(policyNumber);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Policy Number on Adding Second  Exsting Policy   As=====>" + policyNumber);
		} else {
			CustomListner.test.log(LogStatus.FAIL, "  Policy Number on Adding Second  Exsting Policy is not display ");
		}

		WebElement Eleyear2 = driver.findElement(By.xpath("(//input[@id='applicationYear'])[2]"));
		if (Eleyear2.isDisplayed()) {
			Eleyear2.sendKeys(yearOfApplication);
			CustomListner.test.log(LogStatus.INFO,
					"Enter   Year Of Application on Adding Second  Exsting Policy   As=====>" + yearOfApplication);
		} else {
			CustomListner.test.log(LogStatus.FAIL,
					"  Year Of Application on Adding Second  Exsting Policy is not display ");
		}

		WebElement Eleplan2 = driver.findElement(By.xpath("(//input[@id='basePlan'])[2]"));
		if (Eleplan2.isDisplayed()) {
			Eleplan2.sendKeys(basePlan);
			CustomListner.test.log(LogStatus.INFO,
					"Enter  Base Plan on Adding Second  Exsting Policy   As=====>" + basePlan);
		} else {
			CustomListner.test.log(LogStatus.FAIL, " Base Plan on Adding Exsting Second  Policy is not display ");
		}

		WebElement Eleannualpremi2 = driver.findElement(By.xpath("(//input[@id='annualPremium'])[2]"));
		if (Eleannualpremi2.isDisplayed()) {
			Eleannualpremi2.sendKeys(annualPremium);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Annual Premium on Adding Second  Exsting Policy   As=====>" + annualPremium);
		} else {
			CustomListner.test.log(LogStatus.FAIL, " Annual Premium on Adding Second  Exsting Policy is not display ");
		}
		WebElement Elestatus2 = driver.findElement(By.xpath("(//input[@id='policyStatus'])[2]"));
		if (Elestatus2.isDisplayed()) {
			Elestatus2.sendKeys(policyStatus);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Policy Status on Adding Second  Exsting Policy   As=====>" + policyStatus);
		} else {
			CustomListner.test.log(LogStatus.FAIL, " Policy Status on Adding Second  Exsting Policy is not display ");
		}

		WebElement policysaveBtn2 = driver.findElement(By.xpath("(//span[text()='SAVE'])[2]"));
		waitUtils.waitforElementToBeClickable(driver, policysaveBtn2, 100);
		if (policysaveBtn2.isDisplayed()) {
			policysaveBtn2.click();
			CustomListner.test.log(LogStatus.INFO, "click Save BTN ON Exsting Policy");
			dashboard.checkLoaderWeb();
			waitUtils.WaitTime2();
		}

	}

	public void EnterAddedThirdExstingPolicyWeb(String insurerName, String sumAssured, String policyNumber,
			String yearOfApplication, String basePlan, String annualPremium, String policyStatus, String medicalPolicy)
			throws InterruptedException {

		WebElement insurename2 = driver.findElement(By.xpath("(//input[@id='insurerName'])[3]"));
		waitUtils.waitforElementToBeClickable(driver, insurename2, 30);
		if (insurename2.isDisplayed()) {
			insurename2.sendKeys(insurerName);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Insure Name on Adding Third Exsting Policy   As=====>" + insurerName);
		} else {
			CustomListner.test.log(LogStatus.FAIL, " Insure Name on Adding Third Exsting Policy is not display ");
		}

		WebElement Elesumassure2 = driver.findElement(By.xpath("(//input[@id='sumAssured'])[3]"));
		if (Elesumassure2.isDisplayed()) {
			Elesumassure2.sendKeys(sumAssured);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Sum Assured on Adding Third Exsting Policy   As=====>" + sumAssured);
		} else {
			CustomListner.test.log(LogStatus.FAIL, " Enter Sum Assured on Adding Third Exsting Policy is not display ");
		}
		WebElement Elepolicyno2 = driver.findElement(By.xpath("(//input[@id='policyNumber'])[3]"));
		if (Elepolicyno2.isDisplayed()) {
			Elepolicyno2.sendKeys(policyNumber);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Policy Number on Adding Third Exsting Policy   As=====>" + policyNumber);
		} else {
			CustomListner.test.log(LogStatus.FAIL, " Policy Number on Adding Third Exsting Policy is not display ");
		}

		WebElement Eleyear2 = driver.findElement(By.xpath("(//input[@id='applicationYear'])[3]"));
		if (Eleyear2.isDisplayed()) {
			Eleyear2.sendKeys(yearOfApplication);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Year Of Application on Adding Third Exsting Policy   As=====>" + yearOfApplication);
		} else {
			CustomListner.test.log(LogStatus.FAIL,
					" Year Of Application on Adding Third Exsting  Policy is not display ");
		}

		WebElement Eleplan2 = driver.findElement(By.xpath("(//input[@id='basePlan'])[3]"));
		if (Eleplan2.isDisplayed()) {
			Eleplan2.sendKeys(basePlan);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Base Plan on Adding Third Exsting Policy   As=====>" + basePlan);
		} else {
			CustomListner.test.log(LogStatus.FAIL, " Base Plan on Adding Third Exsting Policy is not display ");
		}

		WebElement Eleannualpremi2 = driver.findElement(By.xpath("(//input[@id='annualPremium'])[3]"));
		if (Eleannualpremi2.isDisplayed()) {
			Eleannualpremi2.sendKeys(annualPremium);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Annual Premium on Adding Third Exsting Policy   As=====>" + annualPremium);
		} else {
			CustomListner.test.log(LogStatus.FAIL, " Annual Premium on Adding Third Exsting Policy is not display ");
		}
		WebElement Elestatus2 = driver.findElement(By.xpath("(//input[@id='policyStatus'])[3]"));
		if (Elestatus2.isDisplayed()) {
			Elestatus2.sendKeys(policyStatus);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Policy Status on Adding Third Exsting Policy   As=====>" + policyStatus);
		} else {
			CustomListner.test.log(LogStatus.FAIL, " Policy Status on Adding  Third Exsting Policy is not display ");
		}

		WebElement policysaveBtn2 = driver.findElement(By.xpath("(//span[text()='SAVE'])[3]"));
		waitUtils.waitforElementToBeClickable(driver, policysaveBtn2, 100);
		if (policysaveBtn2.isDisplayed()) {
			policysaveBtn2.click();
			CustomListner.test.log(LogStatus.INFO, "click Save BTN ON Exsting Policy");
			dashboard.checkLoaderWeb();
			waitUtils.WaitTime2();
		}

	}

	public void EnterAddedFoureExstingPolicyWeb(String insurerName, String sumAssured, String policyNumber,
			String yearOfApplication, String basePlan, String annualPremium, String policyStatus, String medicalPolicy)
			throws InterruptedException {

		WebElement insurename2 = driver.findElement(By.xpath("(//input[@id='insurerName'])[4]"));
		waitUtils.waitforElementToBeClickable(driver, insurename2, 30);
		if (insurename2.isDisplayed()) {
			insurename2.sendKeys(insurerName);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Insure Name on Adding Fourth  Exsting Policy   As=====>" + insurerName);
		} else {
			CustomListner.test.log(LogStatus.FAIL, " Insure Name on Adding Fourth Exsting Policy is not display ");
		}

		WebElement Elesumassure2 = driver.findElement(By.xpath("(//input[@id='sumAssured'])[4]"));
		if (Elesumassure2.isDisplayed()) {
			Elesumassure2.sendKeys(sumAssured);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Sum Assured on Adding Fourth Exsting Policy   As=====>" + sumAssured);
		} else {
			CustomListner.test.log(LogStatus.FAIL,
					" Enter Sum Assured on Adding Fourth Exsting Policy is not display ");
		}
		WebElement Elepolicyno2 = driver.findElement(By.xpath("(//input[@id='policyNumber'])[4]"));
		if (Elepolicyno2.isDisplayed()) {
			Elepolicyno2.sendKeys(policyNumber);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Policy Number on Adding Fourth Exsting Policy   As=====>" + policyNumber);
		} else {
			CustomListner.test.log(LogStatus.FAIL, " Policy Number on Adding Fourth Exsting Policy is not display ");
		}

		WebElement Eleyear2 = driver.findElement(By.xpath("(//input[@id='applicationYear'])[4]"));
		if (Eleyear2.isDisplayed()) {
			Eleyear2.sendKeys(yearOfApplication);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Year Of Application on Adding Fourth Exsting Policy   As=====>" + yearOfApplication);
		} else {
			CustomListner.test.log(LogStatus.FAIL,
					" Year Of Application on Adding  Fourth Exsting Policy is not display ");
		}

		WebElement Eleplan2 = driver.findElement(By.xpath("(//input[@id='basePlan'])[4]"));
		if (Eleplan2.isDisplayed()) {
			Eleplan2.sendKeys(basePlan);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Base Plan on Adding Fourth Exsting Policy   As=====>" + basePlan);
		} else {
			CustomListner.test.log(LogStatus.FAIL, " Base Plan on Adding Fourth Exsting Policy is not display ");
		}

		WebElement Eleannualpremi2 = driver.findElement(By.xpath("(//input[@id='annualPremium'])[4]"));
		if (Eleannualpremi2.isDisplayed()) {
			Eleannualpremi2.sendKeys(annualPremium);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Annual Premium on Adding Fourth Exsting Policy   As=====>" + annualPremium);
		} else {
			CustomListner.test.log(LogStatus.FAIL, " Annual Premium on Adding Fourth Exsting Policy is not display ");
		}
		WebElement Elestatus2 = driver.findElement(By.xpath("(//input[@id='policyStatus'])[4]"));
		if (Elestatus2.isDisplayed()) {
			Elestatus2.sendKeys(policyStatus);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Policy Status on Adding  Fourth Exsting Policy   As=====>" + policyStatus);
		} else {
			CustomListner.test.log(LogStatus.FAIL, " Policy Status on Adding Fourth Exsting Policy is not display ");
		}

		WebElement policysaveBtn2 = driver.findElement(By.xpath("(//span[text()='SAVE'])[4]"));
		waitUtils.waitforElementToBeClickable(driver, policysaveBtn2, 100);
		if (policysaveBtn2.isDisplayed()) {
			policysaveBtn2.click();
			CustomListner.test.log(LogStatus.INFO, "click Save BTN ON Exsting Policy");
			dashboard.checkLoaderWeb();
			waitUtils.WaitTime2();
		}

	}

	public void EnterAddedFiveExstingPolicyWeb(String insurerName, String sumAssured, String policyNumber,
			String yearOfApplication, String basePlan, String annualPremium, String policyStatus, String medicalPolicy)
			throws InterruptedException {

		WebElement insurename2 = driver.findElement(By.xpath("(//input[@id='insurerName'])[5]"));
		waitUtils.waitforElementToBeClickable(driver, insurename2, 30);
		if (insurename2.isDisplayed()) {
			insurename2.sendKeys(insurerName);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Insure Name on Adding Fifth Exsting Policy   As=====>" + insurerName);
		} else {
			CustomListner.test.log(LogStatus.FAIL, " Insure Name on Adding Fifth Exsting Policy is not display ");
		}

		WebElement Elesumassure2 = driver.findElement(By.xpath("(//input[@id='sumAssured'])[5]"));
		if (Elesumassure2.isDisplayed()) {
			Elesumassure2.sendKeys(sumAssured);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Sum Assured on Adding Fifth Exsting Policy   As=====>" + sumAssured);
		} else {
			CustomListner.test.log(LogStatus.FAIL, " Enter Sum Assured on Adding Fifth Exsting Policy is not display ");
		}
		WebElement Elepolicyno2 = driver.findElement(By.xpath("(//input[@id='policyNumber'])[5]"));
		if (Elepolicyno2.isDisplayed()) {
			Elepolicyno2.sendKeys(policyNumber);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Policy Number on Adding Fifth Exsting Policy   As=====>" + policyNumber);
		} else {
			CustomListner.test.log(LogStatus.FAIL, " Policy Number on Adding Exsting Fifth Policy is not display ");
		}

		WebElement Eleyear2 = driver.findElement(By.xpath("(//input[@id='applicationYear'])[5]"));
		if (Eleyear2.isDisplayed()) {
			Eleyear2.sendKeys(yearOfApplication);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Year Of Application on Adding Fifth Exsting Policy   As=====>" + yearOfApplication);
		} else {
			CustomListner.test.log(LogStatus.FAIL,
					" Year Of Application on Adding Fifth Exsting Policy is not display ");
		}

		WebElement Eleplan2 = driver.findElement(By.xpath("(//input[@id='basePlan'])[5]"));
		if (Eleplan2.isDisplayed()) {
			Eleplan2.sendKeys(basePlan);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Base Plan on Adding Fifth Exsting Policy   As=====>" + basePlan);
		} else {
			CustomListner.test.log(LogStatus.FAIL, " Base Plan on Adding Exsting Fifth Policy is not display ");
		}

		WebElement Eleannualpremi2 = driver.findElement(By.xpath("(//input[@id='annualPremium'])[5]"));
		if (Eleannualpremi2.isDisplayed()) {
			Eleannualpremi2.sendKeys(annualPremium);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Annual Premium on Adding Fifth Exsting Policy   As=====>" + annualPremium);
		} else {
			CustomListner.test.log(LogStatus.FAIL, " Annual Premium on Adding Fifth Exsting Policy is not display ");
		}
		WebElement Elestatus2 = driver.findElement(By.xpath("(//input[@id='policyStatus'])[5]"));
		if (Elestatus2.isDisplayed()) {
			Elestatus2.sendKeys(policyStatus);
			CustomListner.test.log(LogStatus.INFO,
					"Enter Policy Status on Adding Fifth Exsting Policy   As=====>" + policyStatus);
		} else {
			CustomListner.test.log(LogStatus.FAIL, " Policy Status on Adding  Fifth Exsting Policy is not display ");
		}

		WebElement policysaveBtn2 = driver.findElement(By.xpath("(//span[text()='SAVE'])[5]"));
		waitUtils.waitforElementToBeClickable(driver, policysaveBtn2, 100);
		if (policysaveBtn2.isDisplayed()) {
			policysaveBtn2.click();
			CustomListner.test.log(LogStatus.INFO, "click Save BTN ON Exsting Policy");
			dashboard.checkLoaderWeb();
			waitUtils.WaitTime2();

		}
        
        
      
      }
    
    
    
    
    
    public void clickAddRefusedPolicyBtnWeb() {
    	  WebElement addrefusedpolicyBtn = driver.findElement(By.xpath("(//img[@alt='add icon'])[2]"));
    	  waitUtils.waitforElementToBeClickable(driver, addrefusedpolicyBtn, 30);
        if(addrefusedpolicyBtn.isDisplayed()) {
        	addrefusedpolicyBtn.click();
        	 CustomListner.test.log(LogStatus.INFO, " click on Add Refused Policy   BTN  Successfully ");
        }else {
            CustomListner.test.log(LogStatus.FAIL, "Failed  click Add Refused Policy BTN   ");
        }
    }
    
    
    public void clickSaveOnRefusedPolicyBtnWeb() {
    	  WebElement policysaveBtn = driver.findElement(By.xpath("(//span[text()='SAVE'])[1]"));
    	  waitUtils.waitforElementToBeClickable(driver, policysaveBtn, 30);
        if(policysaveBtn.isDisplayed()) {
        	policysaveBtn.click();
      	  CustomListner.test.log(LogStatus.INFO, "click On Refused Policy 1  Save Button");
        }else {
      
            CustomListner.test.log(LogStatus.FAIL, "Failed click 1 Save BTN ");
        }
    }
    
    
    public void clickSaveOntwoRefusedPolicyBtnWeb() {
  	  WebElement policysaveBtn = driver.findElement(By.xpath("(//span[text()='SAVE'])[2]"));
  	  waitUtils.waitforElementToBeClickable(driver, policysaveBtn, 100);
      if(policysaveBtn.isDisplayed()) {
      	policysaveBtn.click();
    	  CustomListner.test.log(LogStatus.INFO, "click On Refused Policy 2  Save Button");
      }else {
     
          CustomListner.test.log(LogStatus.FAIL, "Failed click 2 Save BTN ");
      }
  }
    public void clickSaveThirdONRefusedPolicyBtnWeb() {
    	  WebElement policysaveBtn = driver.findElement(By.xpath("(//span[text()='SAVE'])[3]"));
    	  waitUtils.waitforElementToBeClickable(driver, policysaveBtn, 100);
        if(policysaveBtn.isDisplayed()) {
        	policysaveBtn.click();
      	  CustomListner.test.log(LogStatus.INFO, "click On Refused Policy 3  Save Button");
        }else {
    
            CustomListner.test.log(LogStatus.FAIL, "Failed click 3 Save BTN ");
        }
    }
    public void clickSavefourthONRefusedPolicyBtnWeb() {
  	  WebElement policysaveBtn = driver.findElement(By.xpath("(//span[text()='SAVE'])[4]"));
  	  waitUtils.waitforElementToBeClickable(driver, policysaveBtn, 100);
      if(policysaveBtn.isDisplayed()) {
      	policysaveBtn.click();
    	  CustomListner.test.log(LogStatus.INFO, "click On Refused Policy 4  Save Button");
      }else {
      
          CustomListner.test.log(LogStatus.FAIL, "Failed click 4 Save BTN ");
      }
  }
    public void clickSaveFifthONRefusedPolicyBtnWeb() {
    	  WebElement policysaveBtn = driver.findElement(By.xpath("(//span[text()='SAVE'])[5]"));
    	  waitUtils.waitforElementToBeClickable(driver, policysaveBtn, 100);
        if(policysaveBtn.isDisplayed()) {
        	policysaveBtn.click();
      	  CustomListner.test.log(LogStatus.INFO, "click On Refused Policy 5  Save Button");
        }else {
        
            CustomListner.test.log(LogStatus.FAIL, "Failed click 5 Save BTN ");
        }
    }
    public void EnterInsurerNameONRefusedPolicyWeb(String args) {
        WebElement insurename1=driver.findElement(By.xpath("(//input[@id='insurerName'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, insurename1, 30);
        if(insurename1.isDisplayed()) {
        	insurename1.sendKeys(args);
            CustomListner.test.log(LogStatus.INFO, "Enter Insure Name on Adding Refused Policy   As=====>"+args);
        }else {
        	CustomListner.test.log(LogStatus.FAIL, " Insure Name on Adding Refused Policy is not display ");
        }
    }
    
    
    public void EnterSumAssuredONRefusedPolicyWeb(String args) {
        WebElement Elesumassure1=driver.findElement(By.xpath("(//input[@id='sumAssured'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, Elesumassure1, 30);
        if(Elesumassure1.isDisplayed()) {
        	Elesumassure1.sendKeys(args);
            CustomListner.test.log(LogStatus.INFO, "Enter Sum Assured on Adding Refused Policy   As=====>"+args);
        }else {
        	CustomListner.test.log(LogStatus.FAIL, " Enter Sum Assured on Adding Refused Policy is not display ");
        }
    }
    
    public void EnterReasonONRefusedPolicyWeb(String args) {
        WebElement Elereason1=driver.findElement(By.xpath("(//input[@id='reason'])[1]"));
        waitUtils.waitforElementToBeClickable(driver, Elereason1, 30);
        if(Elereason1.isDisplayed()) {
        	Elereason1.sendKeys(args);
            CustomListner.test.log(LogStatus.INFO, "Reason Assured on Adding Refused Policy   As=====>"+args);
        }else {
        	CustomListner.test.log(LogStatus.FAIL, " Enter Reason on Adding Refused Policy is not display ");
        }
    }
    
    
    
    public void EnterAddedTwoRefusedPolicyWeb( String insurerName,String sumAssured ,String reason) throws InterruptedException {
    	
    	 WebElement insurename2=driver.findElement(By.xpath("(//input[@id='insurerName'])[2]"));
    	 waitUtils.waitforElementToBeClickable(driver, insurename2, 30);
         if(insurename2.isDisplayed()) {
         	insurename2.sendKeys(insurerName);
             CustomListner.test.log(LogStatus.INFO, "Enter Insure Name on Adding Second Refused Policy   As=====>"+insurerName);
         }else {
         	CustomListner.test.log(LogStatus.FAIL, "  Insure Name on Adding  Second Refused Policy is not display ");
         }
    	
         WebElement Elesumassure2=driver.findElement(By.xpath("(//input[@id='sumAssured'])[2]"));
         if(Elesumassure2.isDisplayed()) {
         	Elesumassure2.sendKeys(sumAssured);
             CustomListner.test.log(LogStatus.INFO, "Enter Sum Assured on Adding Second Refused Policy   As=====>"+sumAssured);
         }else {
         	CustomListner.test.log(LogStatus.FAIL, " Enter Sum Assured on Adding Second Refused Policy is not display ");
         }
        
    
         WebElement Elereason1=driver.findElement(By.xpath("(//input[@id='reason'])[2]"));
         if(Elereason1.isDisplayed()) {
         	Elereason1.sendKeys(reason);
             CustomListner.test.log(LogStatus.INFO, "Enter Reason on Adding  Second Refused Policy   As=====>"+reason);
         }else {
         	CustomListner.test.log(LogStatus.FAIL, " Enter Reason  on Adding  Second Refused Policy is not display ");
         }
    }
    
    public void EnterAddedThirdRefusedPolicyWeb( String insurerName,String sumAssured ,String reason) throws InterruptedException {
    	
   	 WebElement insurename2=driver.findElement(By.xpath("(//input[@id='insurerName'])[3]"));
   	 waitUtils.waitforElementToBeClickable(driver, insurename2, 30);
        if(insurename2.isDisplayed()) {
        	insurename2.sendKeys(insurerName);
            CustomListner.test.log(LogStatus.INFO, "Enter Insure Name on Adding Third Refused Policy   As=====>"+insurerName);
        }else {
        	CustomListner.test.log(LogStatus.FAIL, "  Insure Name on Adding Third Refused Policy is not display ");
        }
   	
        WebElement Elesumassure2=driver.findElement(By.xpath("(//input[@id='sumAssured'])[3]"));
        if(Elesumassure2.isDisplayed()) {
        	Elesumassure2.sendKeys(sumAssured);
            CustomListner.test.log(LogStatus.INFO, "Enter Sum Assured on Adding Third Refused Policy   As=====>"+sumAssured);
        }else {
        	CustomListner.test.log(LogStatus.INFO, " Enter  Sum Assured on Adding Third Refused Policy is not display ");
        }
       
   
        WebElement Elereason1=driver.findElement(By.xpath("(//input[@id='reason'])[3]"));
        if(Elereason1.isDisplayed()) {
        	Elereason1.sendKeys(reason);
            CustomListner.test.log(LogStatus.INFO, "Enter Reason on Adding  Third Refused Policy   As=====>"+reason);
        }else {
        	CustomListner.test.log(LogStatus.INFO, " Enter  Reason on Adding  Third Refused Policy is not display ");
        }
   }
    
    public void EnterAddedFourRefusedPolicyWeb( String insurerName,String sumAssured ,String reason) throws InterruptedException {
    	
      	 WebElement insurename2=driver.findElement(By.xpath("(//input[@id='insurerName'])[4]"));
      	 waitUtils.waitforElementToBeClickable(driver, insurename2, 30);
           if(insurename2.isDisplayed()) {
           	insurename2.sendKeys(insurerName);
               CustomListner.test.log(LogStatus.INFO, "Enter Insure Name on Adding Fourth Refused Policy   As=====>"+insurerName);
           }else {
           	CustomListner.test.log(LogStatus.FAIL, "  Insure Name on Adding Fourth Refused Policy is not display ");
           }
      	
           WebElement Elesumassure2=driver.findElement(By.xpath("(//input[@id='sumAssured'])[4]"));
           if(Elesumassure2.isDisplayed()) {
           	Elesumassure2.sendKeys(sumAssured);
               CustomListner.test.log(LogStatus.INFO, "Enter Sum Assured on Adding Fourth Refused Policy   As=====>"+sumAssured);
           }else {
           	CustomListner.test.log(LogStatus.FAIL, " Enter  Sum Assured on Adding  Fourth Refused Policy is not display ");
           }
          
      
           WebElement Elereason1=driver.findElement(By.xpath("(//input[@id='reason'])[4]"));
           if(Elereason1.isDisplayed()) {
           	Elereason1.sendKeys(reason);
               CustomListner.test.log(LogStatus.INFO, "Enter Reason on Adding Fourth Refused Policy   As=====>"+reason);
           }else {
           	CustomListner.test.log(LogStatus.FAIL, " Enter  Reason on Adding Fourth Refused Policy is not display ");
           }
      }
    
    public void EnterAddedFiveRefusedPolicyWeb( String insurerName,String sumAssured ,String reason) throws InterruptedException {
    	
     	 WebElement insurename2=driver.findElement(By.xpath("(//input[@id='insurerName'])[5]"));
     	 waitUtils.waitforElementToBeClickable(driver, insurename2, 30);
          if(insurename2.isDisplayed()) {
          	insurename2.sendKeys(insurerName);
              CustomListner.test.log(LogStatus.INFO, "Enter Insure Name on Adding Fifth Refused Policy   As=====>"+insurerName);
          }else {
          	CustomListner.test.log(LogStatus.FAIL, "  Insure Name on Adding  Fifth Refused Policy is not display ");
          }
     	
          WebElement Elesumassure2=driver.findElement(By.xpath("(//input[@id='sumAssured'])[5]"));
          if(Elesumassure2.isDisplayed()) {
          	Elesumassure2.sendKeys(sumAssured);
              CustomListner.test.log(LogStatus.INFO, "Enter Sum Assured on Adding Fifth Refused Policy   As=====>"+sumAssured);
          }else {
          	CustomListner.test.log(LogStatus.FAIL, " Enter Sum Assured on Adding Fifth Refused Policy is not display ");
          }
         
     
          WebElement Elereason1=driver.findElement(By.xpath("(//input[@id='reason'])[5]"));
          if(Elereason1.isDisplayed()) {
          	Elereason1.sendKeys(reason);
              CustomListner.test.log(LogStatus.INFO, "Enter Reason on Adding Fifth Refused Policy   As=====>"+reason);
          }else {
          	CustomListner.test.log(LogStatus.FAIL, " Enter Reason on Adding  Fifth Refused Policy is not display ");
          }
     }
    
    
    
    
    public void ClickSelectProposeOfInsuranceWeb(String proposervalue1,String proposervalue2,String proposervalue3) throws InterruptedException {
  	  WebElement proposerofinsurance1 = driver.findElement(By.xpath("//label/span[text()=\""+proposervalue1+"\"]"));
  	  waitUtils.waitforElementToBeClickable(driver, proposerofinsurance1, 100);
      if(proposerofinsurance1.isDisplayed()) {
    	  proposerofinsurance1.click();
    	  CustomListner.test.log(LogStatus.INFO, "Enter Reason on Adding  Second Refused Policy   As=====>"+proposervalue1);
      }else {
          
          CustomListner.test.log(LogStatus.INFO, "FailedPersonalInfo Proposer Of Insurence one Selected   ");
      }
      Thread.sleep(3000);
      WebElement proposerofinsurance2 = driver.findElement(By.xpath("//label/span[text()=\""+proposervalue2+"\"]"));
  	  waitUtils.waitforElementToBeClickable(driver, proposerofinsurance2, 100);
      if(proposerofinsurance2.isDisplayed()) {
    	  proposerofinsurance2.click();
    	  CustomListner.test.log(LogStatus.INFO, "Enter Reason on Adding  Second Refused Policy   As=====>"+proposervalue2);
      }else {
          
          CustomListner.test.log(LogStatus.INFO, "FailedPersonalInfo Proposer Of Insurence two Selected   ");
      }
  
    Thread.sleep(3000);
    WebElement proposerofinsurance3 = driver.findElement(By.xpath("//label/span[text()=\""+proposervalue3+"\"]"));
	  waitUtils.waitforElementToBeClickable(driver, proposerofinsurance3, 100);
    if(proposerofinsurance3.isDisplayed()) {
    	proposerofinsurance3.click();
    	CustomListner.test.log(LogStatus.INFO, "Enter Reason on Adding  Second Refused Policy   As=====>"+proposervalue3);
    }else {
        
        CustomListner.test.log(LogStatus.INFO, "FailedPersonalInfo Proposer Of Insurence Third Selected   ");
    }
}
    public void  ClickExstingPolicyNextBTNweb() throws InterruptedException {
        WebElement SaveBTN=  driver.findElement(By.xpath("//span[text()='NEXT']"));
        waitUtils.waitforElementToBeClickable(driver, SaveBTN, 30);
         if(SaveBTN.isDisplayed()) {
         SaveBTN.click();
         CustomListner.test.log(LogStatus.INFO, "Click Exsting Policy Next Button");
         }else {
         CustomListner.test.log(LogStatus.FAIL, "Exsting Policy Next Button is Not Display");
         }
             
    }
    public void  ClickpurposeOfInsurancekNextBTNweb() throws InterruptedException {
        WebElement SaveBTN=  driver.findElement(By.xpath("//span[text()='Next']"));
        waitUtils.waitforElementToBeClickable(driver, SaveBTN, 30);
         if(SaveBTN.isDisplayed()) {
         SaveBTN.click();
         CustomListner.test.log(LogStatus.INFO, "Click Purpose Of Insurance Next Button");
         }else {
         CustomListner.test.log(LogStatus.FAIL, "Purpose Of Insurance Next Button is Not Display");
         }
             
    }
  
    
  // ======================================================================================================
public void  ClickSaveAndContinueweb() throws InterruptedException {
    WebElement SaveBTN=  driver.findElement(By.xpath("//span[text()='Save & Continue']"));
    waitUtils.waitforElementToBeClickable(driver, SaveBTN, 30);
     if(SaveBTN.isDisplayed()) {
     SaveBTN.click();
     CustomListner.test.log(LogStatus.INFO, "Click on Save And Continue Button");
     }else {
     CustomListner.test.log(LogStatus.FAIL, "Save And Continue Button is Not Display");
     }
         
}

public void  ClickYesBTNOnStateProposerweb() throws InterruptedException {
	
    WebElement yesBTN=  driver.findElement(By.xpath("(//div[text()='Yes'])[7]"));
    waitUtils.waitforElementToBeClickable(driver, yesBTN, 30);
    TestUtil.scrollToElement(driver, yesBTN);
     if(yesBTN.isDisplayed()) {
    	 yesBTN.click();
     CustomListner.test.log(LogStatus.INFO, "Click on Yes BTN On State Whether the Proposer ");
     }else {
     CustomListner.test.log(LogStatus.FAIL, "Yes BTN On State Whether the Proposer Button is Not Display");
     }
         
}



public void  ClickYesBTNOnHoldingCitizenshipweb() throws InterruptedException {
	
    WebElement yesBTN=  driver.findElement(By.xpath("(//div[text()='Yes'])[8]"));
    waitUtils.waitforElementToBeClickable(driver, yesBTN, 30);
    TestUtil.scrollToElement(driver, yesBTN);
     if(yesBTN.isDisplayed()) {
    	 yesBTN.click();
     CustomListner.test.log(LogStatus.INFO, "Click on Yes BTN On Holding  Citizenship Of other Country ");
     }else {
     CustomListner.test.log(LogStatus.FAIL, "Yes BTN On Holding  Citizenship of Other Country Button is Not Display");
     }
         
}




public void  ClickYesBTNOnTaxResidentweb() throws InterruptedException {
	
    WebElement yesBTN=  driver.findElement(By.xpath("(//div[text()='Yes'])[9]"));
    waitUtils.waitforElementToBeClickable(driver, yesBTN, 30);
    TestUtil.scrollToElement(driver, yesBTN);
     if(yesBTN.isDisplayed()) {
    	 yesBTN.click();
     CustomListner.test.log(LogStatus.INFO, "Click on Yes BTN On Tax Resident Of other Country ");
     }else {
     CustomListner.test.log(LogStatus.FAIL, "Yes BTN On Holding  Tax Resident of Other Country Button is Not Display");
     }
         
}
//===========================Below Method is Nikhil======================================

public void  EnterEmailIdweb(String emailid) {
  WebElement email=  driver.findElement(By.xpath("(//input[@id='emailId'])[2]"));
  waitUtils.waitForElementToBeVisibleweb(driver, email, 30, "Element is Not Display");
  if(email.isDisplayed()) {
	  email.sendKeys(emailid);
	  email.sendKeys(Keys.TAB);
	  CustomListner.test.log(LogStatus.INFO, "Enter Email ID As=====>"+emailid);
  }else {
	  CustomListner.test.log(LogStatus.INFO, "Enter Email ID is Not Display");
  }
}
public void  EnterMaritalStatusweb(String marital) {
      WebElement maritalstatus=  driver.findElement(By.xpath("(//div[contains(text(),'"+marital+"')])[2]"));
      waitUtils.waitForElementToBeVisibleweb(driver, maritalstatus, 30, "Element is Not Display");
      if(maritalstatus.isDisplayed()) {
    	  maritalstatus.click();
    	  CustomListner.test.log(LogStatus.INFO, "Enter marital status As=====>"+marital);
      }else {
    	  CustomListner.test.log(LogStatus.INFO, "marital Status is Not Display");
      }
}
public void  EnterFatherSpaouseNameweb(String fatherSpouse) {
      WebElement fatherspouse=  driver.findElement(By.xpath("(//input[@id='fatherSpouseName'])[2]"));
      waitUtils.waitforElementToBeClickable(driver, fatherspouse, 30);
      if(fatherspouse.isDisplayed()) {
    	  fatherspouse.sendKeys(fatherSpouse);
    	  CustomListner.test.log(LogStatus.INFO, "Enter Father/Spaouse Name As=====>"+fatherSpouse);
      }else {
    	  CustomListner.test.log(LogStatus.FAIL, "Father/Spaouse Name is Not Display");
      }
}
public void  EnterMotherNameweb(String mothername) {
      WebElement motherele=  driver.findElement(By.xpath("(//input[@id='motherName'])[2]"));
      waitUtils.waitforElementToBeClickable(driver, motherele, 30);
      if(motherele.isDisplayed()) {
    	  motherele.sendKeys(mothername);
    	  CustomListner.test.log(LogStatus.INFO, "Enter Mother Name As=====>"+mothername);
      }else {
    	  CustomListner.test.log(LogStatus.FAIL, "Mother Name is Not Display");
      }
}
public void  EnterMaidenNameweb(String maidenname) {
      WebElement maidenele=  driver.findElement(By.xpath("(//input[@name='maidenName'])[2]"));
      waitUtils.waitforElementToBeClickable(driver, maidenele, 30);
      if(maidenele.isDisplayed()) {
    	  maidenele.sendKeys(maidenname);
    	  CustomListner.test.log(LogStatus.INFO, "Enter Maiden Name As=====>"+maidenname);
      }else {
    	  CustomListner.test.log(LogStatus.FAIL, "Maiden Name is Not Display");
      }
}
public void  SelectQualificationweb(String qualification) throws InterruptedException {
      WebElement qualificationele=  driver.findElement(By.xpath("(//div[contains(@id,'mui-component-select-23')])[2]"));
      waitUtils.waitforElementToBeClickable(driver, qualificationele, 100);
      qualificationele.click();
      CustomListner.test.log(LogStatus.INFO, "click on Qualification dropDown");
      Thread.sleep(3000);
      WebElement selecttext = driver.findElement(By.xpath("//ul//li/span[text()='"+qualification+"']"));
      waitUtils.waitforElementToBeClickable(driver, selecttext, 100);
      selecttext.click();
      CustomListner.test.log(LogStatus.INFO, "Select Values As=====>"+qualification);	
    	      
}
public void  SelectOccupationweb(String occupation) throws InterruptedException {
      WebElement occupationele=  driver.findElement(By.xpath("(//div[contains(@id,'mui-component-select-24')])[2]"));
      waitUtils.waitforElementToBeClickable(driver, occupationele, 100);
      occupationele.click();
      CustomListner.test.log(LogStatus.INFO, "click on Occupation dropDown");
      Thread.sleep(3000);
      WebElement selecttext = driver.findElement(By.xpath("//ul//li/span[text()='"+occupation+"']"));
      waitUtils.waitforElementToBeClickable(driver, selecttext, 100);
      selecttext.click();
      CustomListner.test.log(LogStatus.INFO, "Select Values As=====>"+occupation);	
    	      
}
public void  EnterOccupationNameofEmployeeweb(String nameofemployee) throws InterruptedException {
	 WebElement nameofemployeeele=  driver.findElement(By.xpath("//input[@placeholder='Name of Employer']"));
	 waitUtils.waitforElementToBeClickable(driver, nameofemployeeele, 30);
      if(nameofemployeeele.isDisplayed()) {
    	  nameofemployeeele.sendKeys(nameofemployee);
    	  CustomListner.test.log(LogStatus.INFO, "Enter Name Of Employee As=====>"+nameofemployee);
      }else {
    	  CustomListner.test.log(LogStatus.FAIL, "Name Of Employee is Not Display");
      }	
    	      
}
public void  SelectOccupationValidationweb(String occupation) throws InterruptedException {
	
	try {
		TestUtil.scrollToElement(driver,driver.findElement(By.xpath("//ul//li/span[text()='"+occupation+"']"))); 
	      WebElement selecttext = driver.findElement(By.xpath("//ul//li/span[text()='"+occupation+"']"));
	      waitUtils.waitforElementToBeClickable(driver, selecttext, 100);
	      String getValue=  selecttext.getText();
	      if(getValue.contains(occupation)) {
	    	  TestUtil.verifybgColor(selecttext, driver);
	    	  CustomListner.test.log(LogStatus.INFO, "Successfully verified=====>"+occupation);
	      }else {
	    	  CustomListner.test.log(LogStatus.FAIL, "Failed to Verified Occupation Values ");
	      }
	}catch(NoSuchElementException e) {
		 CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element On page");
	}
	
	
           
}
public void  EnterOtherQualificationweb(String other) throws InterruptedException {
	 WebElement otherEle=  driver.findElement(By.xpath("//input[@placeholder='Other Qualification']"));
	 waitUtils.waitforElementToBeClickable(driver, otherEle, 30);
      if(otherEle.isDisplayed()) {
    	  otherEle.sendKeys(other);
    	  CustomListner.test.log(LogStatus.INFO, "Enter Other Qualification As=====>"+other);
      }else {
    	  CustomListner.test.log(LogStatus.FAIL, "Other Qualification is Not Display");
      }	
    	      
}
public void  ClickAlertOkPopUpQualificationweb() throws InterruptedException {
	 WebElement Okclick=  driver.findElement(By.xpath("//span[text()='OK']"));
	 waitUtils.waitforElementToBeClickable(driver, Okclick, 30);
      if(Okclick.isDisplayed()) {
    	  Okclick.click();
    	  CustomListner.test.log(LogStatus.INFO, "Successfully Display Term plan is not eligible as per plan guidelines");
    	  CustomListner.test.log(LogStatus.INFO, "Click on Alert OK Pop Up");
    	 
      }else {
    	  CustomListner.test.log(LogStatus.FAIL, "Alert OK Pop Up is Not Display");
      }	
    	      
}
public void  EnterOccupationNatureofbusinessweb(String natureofbusiness) throws InterruptedException {
	 WebElement natureofbusinessele=  driver.findElement(By.xpath("//input[@placeholder='Nature of Business/Duties']"));
	 waitUtils.waitforElementToBeClickable(driver, natureofbusinessele, 30);
      if(natureofbusinessele.isDisplayed()) {
    	  natureofbusinessele.sendKeys(natureofbusiness);
    	  CustomListner.test.log(LogStatus.INFO, "Enter Nature of business/Duties As=====>"+natureofbusiness);
      }else {
    	  CustomListner.test.log(LogStatus.FAIL, "Nature of business/Duties is Not Display");
      }	
    	      
}
public void  EnterParentAnnualIncomeweb(String annualincome) throws InterruptedException {
	 WebElement annualIncomeEle=  driver.findElement(By.xpath("//input[contains(@name,'33')]"));
	 waitUtils.waitforElementToBeClickable(driver, annualIncomeEle, 30);
      if(annualIncomeEle.isDisplayed()) {
    	  annualIncomeEle.sendKeys(annualincome);
    	  CustomListner.test.log(LogStatus.INFO, "Enter parent's Annual Income As=====>"+annualincome);
      }else {
    	  CustomListner.test.log(LogStatus.FAIL, "Parent's Annual Income is Not Display");
      }	
    	      
}
public void  EnterParentInsuranceCoverweb(String insurancecover) throws InterruptedException {
	 WebElement insuranceEle=  driver.findElement(By.xpath("//input[contains(@name,'34')]"));
	 waitUtils.waitforElementToBeClickable(driver, insuranceEle, 30);
      if(insuranceEle.isDisplayed()) {
    	  insuranceEle.sendKeys(insurancecover);
    	  CustomListner.test.log(LogStatus.INFO, "Enter parent's Insurance Cover As=====>"+insurancecover);
      }else {
    	  CustomListner.test.log(LogStatus.FAIL, "Parent's Insurance Cover is Not Display");
      }	
    	      
}
public void  selectOccupationTypeofOrganisationweb(String typeoforganisation) throws InterruptedException {
	 WebElement typeoforganisationsele=  driver.findElement(By.xpath("//div[contains(@id,'mui-component-select-29')]"));
	 waitUtils.waitforElementToBeClickable(driver, typeoforganisationsele, 100);
	 typeoforganisationsele.click();
	 CustomListner.test.log(LogStatus.INFO, "click on Type of Organisation DropDown");
	 Thread.sleep(3000);
	 WebElement selecttext=  driver.findElement(By.xpath("//ul//li/span[text()='"+typeoforganisation+"']"));
	 waitUtils.waitforElementToBeClickable(driver, selecttext, 100);
	 selecttext.click();
	 CustomListner.test.log(LogStatus.INFO, "Select Value As=====>"+typeoforganisation);
	 
			    	      
}
public void  EnterOccupationDesignationweb(String Designation) throws InterruptedException {
	 WebElement Designationsele=  driver.findElement(By.xpath("//input[@placeholder='Designation']"));
	 waitUtils.waitforElementToBeClickable(driver, Designationsele, 30);
      if(Designationsele.isDisplayed()) {
    	  Designationsele.sendKeys(Designation);
    	  CustomListner.test.log(LogStatus.INFO, "Enter Designation As=====>"+Designation);
      }else {
    	  CustomListner.test.log(LogStatus.FAIL, "Designation is Not Display");
      }	
    	      
}
public void  EnterOccupationAnnualIncomeweb(String annualincome) throws InterruptedException {
	 WebElement AnnualIncomeele=  driver.findElement(By.xpath("//input[@placeholder='Annual Income']"));
	 waitUtils.waitforElementToBeClickable(driver, AnnualIncomeele, 30);
      if(AnnualIncomeele.isDisplayed()) {
    	  AnnualIncomeele.sendKeys(annualincome);
    	  CustomListner.test.log(LogStatus.INFO, "Enter Annual Income As=====>"+annualincome);
      }else {
    	  CustomListner.test.log(LogStatus.FAIL, "Annual Income is Not Display");
      }	
    	      
}
public void  ClickGSTYesBtnweb() throws InterruptedException {
	 WebElement GstBtn=  driver.findElement(By.xpath("(//div[contains(text(),'Yes')])[10]"));
	 waitUtils.waitforElementToBeClickable(driver, GstBtn, 30);
      if(GstBtn.isDisplayed()) {
    	  GstBtn.click();
    	  CustomListner.test.log(LogStatus.INFO, "Click on GST Yes Button ");
      }else {
    	  CustomListner.test.log(LogStatus.FAIL, "Gst Button is Not Display");
      }	
    	      
}
public void  ClickDoItBtnweb() throws InterruptedException {
	 WebElement DoitBtn = driver.findElement(By.xpath("//span[text()='DO IT LATER']"));
	 waitUtils.waitforElementToBeClickable(driver, DoitBtn, 30);
     waitUtils.waitforElementToBeClickable(driver, DoitBtn, 100);
     if(DoitBtn.isDisplayed()) {
    	 DoitBtn.click();
         CustomListner.test.log(LogStatus.INFO, "Click on DO IT Button");
     }else {
    	 CustomListner.test.log(LogStatus.FAIL, "Failed to Display DO IT Button");
     }
    
    	      
}
public void  EnterGSTTextFieldweb(String gst) throws InterruptedException {
	 WebElement GstTextFiled=  driver.findElement(By.xpath("//input[@placeholder='Provide your GST registration number']"));
	 waitUtils.waitforElementToBeClickable(driver, GstTextFiled, 30);
      if(GstTextFiled.isDisplayed()) {
    	  GstTextFiled.sendKeys(gst);
    	  CustomListner.test.log(LogStatus.INFO, "Enter GST Values As=====> "+gst);
      }else {
    	  CustomListner.test.log(LogStatus.FAIL, "Gst values  is Not Display");
      }	
    	      
}

public void VerifyFathernameweb(String fatherSpouseNameErrorMsg) throws InterruptedException {
	WebElement fathertextError = driver.findElement(By.xpath("//p[@id='fatherSpouseName-helper-text']"));
	waitUtils.waitforElementToBeClickable(driver, fathertextError, 30);
	if (fathertextError.isDisplayed()) {
		String fathervalue = fathertextError.getText();
		TestUtil.verifybgColor(fathertextError, driver);
		Assert.assertEquals(fathervalue, fatherSpouseNameErrorMsg);
		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Father Name And Spouse Name Error Msg");
	} else {
		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Father Name And Spouse Name Error Msg");
	}

}

public void VerifyMothernameweb(String motherErrorMsg) throws InterruptedException {
	WebElement mothertextError = driver.findElement(By.xpath("//p[@id='motherName-helper-text']"));
	waitUtils.waitforElementToBeClickable(driver, mothertextError, 30);
	if (mothertextError.isDisplayed()) {
		String mothervalue = mothertextError.getText();
		TestUtil.verifybgColor(mothertextError, driver);
		Assert.assertEquals(mothervalue, motherErrorMsg);
		CustomListner.test.log(LogStatus.INFO, "Successfully Verified Mother Name Error Msg");
	} else {
		CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Mother Name Error Msg");
	}

}
public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
	   Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		

public static boolean validate(String emailStr) {
	        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
	        return matcher.find();
	}
//
//
//public static boolean patternMatches(String emailAddress) {
//	String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
//	//String regex1 = "[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$";
//    Pattern pattern = Pattern.compile(regex);
//    Matcher matcher = pattern.matcher(emailAddress);
//    return matcher.matches();
//}


}
