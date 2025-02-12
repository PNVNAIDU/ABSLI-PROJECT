package com.absli.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.absli.APIData.ApiData;
import com.absli.Listner.CustomListner;
import com.absli.utils.WaitUtils;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import util.TestUtil;

public class ProposerNotInsured {
	
	
	
	public WebDriver driver;
    public AndroidDriver driver1;
    public WaitUtils wait;
    public TestUtil testUtil;
   

    // Initializing the Page Objects:
    public ProposerNotInsured(AndroidDriver driver1) {
        this.driver1 = driver1;
        wait=new WaitUtils();
        testUtil = new TestUtil();
    }
    public ProposerNotInsured(WebDriver driver) {
        this.driver = driver;
        wait=new WaitUtils();
        testUtil = new TestUtil();
    }
    
    
    public void ClickOnIsproposerInsuredSameRadioButton(String val) throws InterruptedException {
		Thread.sleep(2000);
    	WebElement IsInsuredproposer=driver.findElement(By.xpath("//input[contains(@value,'"+val+"')]"));
		wait.waitForElementToBeVisibleweb(driver, IsInsuredproposer, 20,"time out to find element on page");
		if(IsInsuredproposer.isEnabled()) {
			IsInsuredproposer.click();
			CustomListner.test.log(LogStatus.INFO, "Click On Is proposer And Insured Are Same As=====>"+val);
		}else {
			CustomListner.test.log(LogStatus.FAIL, "Is Proposer And Insured Are Same Element Is Not Display");
		}
		
	}
    public void SelectRelationWithInsured(String val) throws InterruptedException {
		WebElement RelationEle1=driver.findElement(By.xpath("//div[contains(@aria-haspopup,'listbox')]"));
		wait.waitForElementToBeVisibleweb(driver, RelationEle1, 20,"time out to find element on page");
		RelationEle1.click();
		CustomListner.test.log(LogStatus.INFO, "Click on  Relation With Insured DropDown");
		Thread.sleep(3000);
		WebElement RelationEle2=driver.findElement(By.xpath("//ul//li//span[contains(text(),'"+val+"')]"));
		wait.waitForElementToBeVisibleweb(driver, RelationEle2, 20,"time out to find element on page");
		String text=RelationEle2.getText();
		if(text.equalsIgnoreCase(val)) {
			RelationEle2.click();
			CustomListner.test.log(LogStatus.INFO, "Select relation With The To Be Insured Values As=====>"+val);
		}else {
			CustomListner.test.log(LogStatus.FAIL, "Relation With The To Be Insured DropDown Value Is Not Display");
		}
	
	}
    public void ClickOnAddInfoButton() {
   	 WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("//span[contains(text(),'Add Insured Info')]"));
   	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
       if(customerProfileNextBtnWeb.isDisplayed()) {
           customerProfileNextBtnWeb.click();
           CustomListner.test.log(LogStatus.INFO, "Click on Add Insured Info Button");
       }else {
    	   CustomListner.test.log(LogStatus.FAIL, " Add Insured Info Button Is Not Display");
       }
   }
    public void ClickOnAddInfoProposerButton() {
      	 WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("(//span[contains(text(),'Add Insured Info')])[1]"));
      	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
          if(customerProfileNextBtnWeb.isDisplayed()) {
              customerProfileNextBtnWeb.click();
              CustomListner.test.log(LogStatus.INFO, "Click on Proposer  Add Insured Info Button");
          }else {
       	   CustomListner.test.log(LogStatus.FAIL, "Proposer Add Insured Info Button Is Not Display");
          }
      }
    public void ClickonCancelButton() {
     	 WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("//span[contains(text(),'CANCEL')]"));
     	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
         if(customerProfileNextBtnWeb.isDisplayed()) {
             customerProfileNextBtnWeb.click();
             CustomListner.test.log(LogStatus.INFO, "Click on Alert Cancel Button");
         }else {
      	   CustomListner.test.log(LogStatus.FAIL, "Alert Cancel Button Is Not Display");
         }
     }
    public void VerifyProposerEditAlerrtPopup() throws InterruptedException {
     	 try {
     		WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("//div[contains(text(),'You are editing the proposer name.')]"));
         	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
             if(customerProfileNextBtnWeb.isDisplayed()) {
                 testUtil.verifybgColor(customerProfileNextBtnWeb, driver);
                 CustomListner.test.log(LogStatus.INFO, "Successfully Verified FirstName Edit Alert PopUp.You are editing the proposer name.");
             }else {
          	   CustomListner.test.log(LogStatus.FAIL, "Failed To Verified FirstName Edit Alert PopUp");
             }
     	 }catch(NoSuchElementException e) {
     		 CustomListner.test.log(LogStatus.FAIL, "Unable To Locate FirstName Edit Alert Popup");
     	 }
    	
     }
    public void VerifyInsuredEditAlerrtPopup() throws InterruptedException {
    	 try {
    		WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("//div[contains(text(),'You are editing the insured name.')]"));
        	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
            if(customerProfileNextBtnWeb.isDisplayed()) {
                testUtil.verifybgColor(customerProfileNextBtnWeb, driver);
                CustomListner.test.log(LogStatus.INFO, "Successfully Verified FirstName Edit Alert PopUp.You are editing the insured name.");
            }else {
         	   CustomListner.test.log(LogStatus.FAIL, "Failed To Verified FirstName Edit Alert PopUp");
            }
    	 }catch(NoSuchElementException e) {
    		 CustomListner.test.log(LogStatus.FAIL, "Unable To Locate FirstName Edit Alert Popup");
    	 }
   	
    }
    public void ClickOnTransgenderButton() {
      	 WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("(//button[contains(@value,'transgender')])[1]"));
      	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
          if(customerProfileNextBtnWeb.isDisplayed()) {
              customerProfileNextBtnWeb.click();
              CustomListner.test.log(LogStatus.INFO, "Successfully Click on Proposer Transgender Button");
          }else {
       	   CustomListner.test.log(LogStatus.FAIL, "Proposer Transgender Button Is Not Display");
          }
      }
    public void ClickOnMaleButton() {
     	 WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("(//span[text()='Male'])[1]"));
     	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
         if(customerProfileNextBtnWeb.isDisplayed()) {
             customerProfileNextBtnWeb.click();
             CustomListner.test.log(LogStatus.INFO, "Click on Proposer Male Button");
         }else {
      	   CustomListner.test.log(LogStatus.FAIL, "Proposer Male Button Is Not Display");
         }
     }
    public void ClickOnFemaleButton() {
    	 WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("(//span[text()='Female'])[2]"));
    	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
        if(customerProfileNextBtnWeb.isDisplayed()) {
            customerProfileNextBtnWeb.click();
            CustomListner.test.log(LogStatus.INFO, "Click on Insured Female Button");
        }else {
     	   CustomListner.test.log(LogStatus.FAIL, "Insured Female Button Is Not Display");
        }
    }
    public void ClickOnInsuredTransgenderButton() {
     	 WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("(//button[contains(@value,'transgender')])[2]"));
     	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
         if(customerProfileNextBtnWeb.isDisplayed()) {
             customerProfileNextBtnWeb.click();
             CustomListner.test.log(LogStatus.INFO, "Successfully Click on Insured Transgender Button");
         }else {
      	   CustomListner.test.log(LogStatus.FAIL, "Insured Transgender Button Is Not Display");
         }
     }
    public void ClickOnInsuredSaveButton() {
    	 WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("(//span[text()='Save'])[2]"));
    	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
        if(customerProfileNextBtnWeb.isDisplayed()) {
            customerProfileNextBtnWeb.click();
            CustomListner.test.log(LogStatus.INFO, "Click on Save Button");
        }else {
     	   CustomListner.test.log(LogStatus.FAIL, "Save Button Is Not Display");
        }
    }
    public void VerifyFirstNameProposerweb() throws InterruptedException {
      	try {
      		WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("(//input[contains(@id,'firstname')])[1]"));
          	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
              if(customerProfileNextBtnWeb.isDisplayed()) {
                  testUtil.verifybgColor(customerProfileNextBtnWeb, driver);
                  CustomListner.test.log(LogStatus.INFO, "First Name TextField Is Display Successfully");
              }else {
           	   CustomListner.test.log(LogStatus.FAIL, "First Name TextFields Is Not Display");
              }
      	}catch(NoSuchElementException e) {
      		 CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element Proposer FirstName TextField");
      	}
    	
      }
    public void VerifyProposerSalutationweb(String val) throws InterruptedException {
      	try {
      		WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("//span[contains(text(),'Ms.')]"));
          	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
              String ValText=customerProfileNextBtnWeb.getText();
          	if(val.equalsIgnoreCase(ValText)) {
                  testUtil.verifybgColor(customerProfileNextBtnWeb, driver);
                  CustomListner.test.log(LogStatus.INFO, "Successfully verified Proposer Female Salutation As=====>"+val);
              }else {
           	   CustomListner.test.log(LogStatus.FAIL, "Failed To verified Proposer Female Salutation");
              }
      	}catch(NoSuchElementException e) {
      		 CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element  Proposer Salutation");
      	}
    	
      }
    public void VerifyInsuredSalutationweb(String val) throws InterruptedException {
      	try {
      		WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("//span[contains(text(),'Mr.')]"));
          	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
              String ValText=customerProfileNextBtnWeb.getText();
          	if(val.equalsIgnoreCase(ValText)) {
                  testUtil.verifybgColor(customerProfileNextBtnWeb, driver);
                  CustomListner.test.log(LogStatus.INFO, "Successfully verified Insured Male Salutation As=====>"+val);
              }else {
           	   CustomListner.test.log(LogStatus.FAIL, "Failed To verified Insured Male Salutation");
              }
      	}catch(NoSuchElementException e) {
      		 CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element  Insured Salutation");
      	}
    	
      }
    public void VerifyLastNameProposerweb() throws InterruptedException {
     	try {
     		WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("(//input[contains(@id,'lastname')])[1]"));
         	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
             if(customerProfileNextBtnWeb.isDisplayed()) {
                 testUtil.verifybgColor(customerProfileNextBtnWeb, driver);
                 CustomListner.test.log(LogStatus.INFO, "Last Name TextField Is Display Successfully");
             }else {
          	   CustomListner.test.log(LogStatus.FAIL, "Last Name TextFields Is Not Display");
             }
     		
     	}catch(NoSuchElementException e) {
     		 CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element Proposer LastName TextField");
     	}
    	
     }
    public void VerifyFirstNameInsuredweb() throws InterruptedException {
     	try {
     		WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("(//input[contains(@id,'firstname')])[2]"));
         	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
             if(customerProfileNextBtnWeb.isDisplayed()) {
                 testUtil.verifybgColor(customerProfileNextBtnWeb, driver);
                 CustomListner.test.log(LogStatus.INFO, "First Name TextField Is Display Successfully");
             }else {
          	   CustomListner.test.log(LogStatus.FAIL, "First Name TextFields Is Not Display");
             }
     	}catch(NoSuchElementException e) {
    		 CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element Insured  FirstName TextField");
    	}
    	
     }
   public void VerifyLastNameInsuredweb() throws InterruptedException {
    	
	   try {
		   WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("(//input[contains(@id,'lastname')])[2]"));
	    	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
	        if(customerProfileNextBtnWeb.isDisplayed()) {
	            testUtil.verifybgColor(customerProfileNextBtnWeb, driver);
	            CustomListner.test.log(LogStatus.INFO, "Last Name TextField Is Display Successfully");
	        }else {
	     	   CustomListner.test.log(LogStatus.FAIL, "Last Name TextFields Is Not Display");
	        }
		   
	   }catch(NoSuchElementException e) {
   		 CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element Insured LastName TextField");
   	}
	   
	  
    }
    public void EnterFirstNameProposerweb(String val) throws InterruptedException {
     	 WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("(//input[contains(@id,'firstname')])[1]"));
     	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
         if(customerProfileNextBtnWeb.isDisplayed()) {
        	 customerProfileNextBtnWeb.clear();
        	 customerProfileNextBtnWeb.sendKeys(val);
             CustomListner.test.log(LogStatus.INFO, "Enter First Name As=====>"+val);
         }else {
      	   CustomListner.test.log(LogStatus.FAIL, "First Name TextFields Is Not Display");
         }
     }
  
    public void VerifyFirstNameTickProposerweb() throws InterruptedException {
     	try {
     		WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("(//img[contains(@alt,'tick')])[3]"));
         	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
             if(customerProfileNextBtnWeb.isDisplayed()) {
                 testUtil.verifybgColor(customerProfileNextBtnWeb, driver);
                 CustomListner.test.log(LogStatus.INFO, "Successfully Display First Name Verified Tick");
             }else {
          	   CustomListner.test.log(LogStatus.FAIL, "First Name Verified Tick Is Not Display");
             }
     		
     	}catch(NoSuchElementException e) {
    		 CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element Proposer FirstName Verified Tick");
    	}
    	
     }
    public void VerifyGenderProposerweb() throws InterruptedException {
     	
    	try {
    		WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("(//button[contains(@value,'female')])[1]"));
         	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
             if(customerProfileNextBtnWeb.isDisplayed()) {
                 testUtil.verifybgColor(customerProfileNextBtnWeb, driver);
                 CustomListner.test.log(LogStatus.INFO, "Gender Button is Display Successfully");
             }else {
          	   CustomListner.test.log(LogStatus.FAIL, "Gender Button is Not  Display");
             }
    		
    	}catch(NoSuchElementException e) {
    		 CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element Proposer Gender Button");
    	}
    	
    	
     }
    public void VerifyFirstNameTickInsuredweb() throws InterruptedException {
    	
    	try {
    		WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("(//img[contains(@alt,'tick')])[7]"));
        	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
            if(customerProfileNextBtnWeb.isDisplayed()) {
                testUtil.verifybgColor(customerProfileNextBtnWeb, driver);
                CustomListner.test.log(LogStatus.INFO, "Successfully Display First Name Verified Tick");
            }else {
         	   CustomListner.test.log(LogStatus.FAIL, "First Name Verified Tick Is Not Display");
            }
    	}catch(NoSuchElementException e) {
   		 CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element Insured FirstName Verified Tick");
   	}
    	
    }
  
    public void VerifyGenderInsuredweb() throws InterruptedException {
    	
    	try {
    		WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("(//span[contains(text(),'Male')])[2]"));
        	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
            if(customerProfileNextBtnWeb.isDisplayed()) {
                testUtil.verifybgColor(customerProfileNextBtnWeb, driver);
                CustomListner.test.log(LogStatus.INFO, "Gender Button is Display Successfully");
            }else {
         	   CustomListner.test.log(LogStatus.FAIL, "Gender Button is Not  Display");
            }
    	}catch(NoSuchElementException e) {
    		 CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element Insured Gender Button");
    	}
    	
    }
    public void VerifyGenderTickProposerweb() throws InterruptedException {
    	try {
    		WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("(//img[contains(@alt,'tick')])[4]"));
        	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
            if(customerProfileNextBtnWeb.isDisplayed()) {
                testUtil.verifybgColor(customerProfileNextBtnWeb, driver);
                CustomListner.test.log(LogStatus.INFO, "Successfully Display Gender Verified Tick");
            }else {
         	   CustomListner.test.log(LogStatus.FAIL, "Gender Verified Tick Is Not Display");
            }
    		
    	}catch(NoSuchElementException e) {
   		 CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element Proposer Gender Verified Tick");
   	}
    	
    }
    public void VerifyGenderTickInsuredweb() throws InterruptedException {
   	try {
   		WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("(//img[contains(@alt,'tick')])[8]"));
   	   	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
   	       if(customerProfileNextBtnWeb.isDisplayed()) {
   	           testUtil.verifybgColor(customerProfileNextBtnWeb, driver);
   	           CustomListner.test.log(LogStatus.INFO, "Successfully Display Gender Verified Tick");
   	       }else {
   	    	   CustomListner.test.log(LogStatus.FAIL, "Gender Verified Tick Is Not Display");
   	       }
   	}catch(NoSuchElementException e) {
		 CustomListner.test.log(LogStatus.FAIL, "Unable To Locate Element Insured Gender Verified Tick");
	}
    	
    	
   }
    
   
    
    
    public void ClickOnProposerTabButton() {
      	 WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("//span[contains(text(),'PROPOSER')]"));
      	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
          if(customerProfileNextBtnWeb.isDisplayed()) {
              customerProfileNextBtnWeb.click();
              CustomListner.test.log(LogStatus.INFO, "Click on Proposer Tab Button");
          }else {
       	   CustomListner.test.log(LogStatus.FAIL, "Proposer Tab Button Is Not Display");
          }
      }
    public void ClickOnTobeInsuredTabButton() {
     	 WebElement customerProfileNextBtnWeb=driver.findElement(By.xpath("//span[contains(text(),'TO BE INSURED')]"));
     	wait.waitForElementToBeVisibleweb(driver, customerProfileNextBtnWeb, 20,"time out to find element on page");
         if(customerProfileNextBtnWeb.isDisplayed()) {
             customerProfileNextBtnWeb.click();
             CustomListner.test.log(LogStatus.INFO, "Click on To be Insured Tab Button");
         }else {
      	   CustomListner.test.log(LogStatus.FAIL, "To be Insured Tab Button Is Not Display");
         }
     }

    public void VerifyInsuredMandatoryErrorMSG() throws InterruptedException {
		try {
			WebElement ErrorVal1 = driver.findElement(By.xpath("//p[contains(@id,'captureMobile-helper-text')]"));
			//WebElement ErrorVal2 = driver.findElement(By.xpath("//p[contains(text(),'Please enter Pan Number')]"));

			if (ErrorVal1.isDisplayed()) {
				TestUtil.verifybgColor(ErrorVal1, driver);
				CustomListner.test.log(LogStatus.INFO, "Successfully Verified Insured Mobile Number Mandatory Error Message");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Insured Mobile Number Mandatory Error Message");
			}
//			if (ErrorVal2.isDisplayed()) {
//				TestUtil.verifybgColor(ErrorVal2, driver);
//				CustomListner.test.log(LogStatus.INFO, "Successfully Verified Insured Pan Number Mandatory Error Message");
//			} else {
//				CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Insured Pan Number Mandatory Error Message");
//			}
		} catch (NoSuchElementException e) {
			CustomListner.test.log(LogStatus.FAIL, "Unable to Located Element");
		}

	}
    public void VerifyProposerMandatoryErrorMSG() throws InterruptedException {
		try {
			WebElement ErrorVal1 = driver.findElement(By.xpath("(//p[contains(@id,'captureMobile-helper-text')])[1]"));
			WebElement ErrorVal2 = driver.findElement(By.xpath("(//p[contains(text(),'Please enter Pan Number')])[1]"));

			if (ErrorVal1.isDisplayed()) {
				TestUtil.verifybgColor(ErrorVal1, driver);
				CustomListner.test.log(LogStatus.INFO, "Successfully Verified Proposer Mobile Number Mandatory Error Message");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Proposer Mobile Number Mandatory Error Message");
			}
			if (ErrorVal2.isDisplayed()) {
				TestUtil.verifybgColor(ErrorVal2, driver);
				CustomListner.test.log(LogStatus.INFO, "Successfully Verified Proposer Pan Number Mandatory Error Message");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Proposer Pan Number Mandatory Error Message");
			}
		} catch (NoSuchElementException e) {
			CustomListner.test.log(LogStatus.FAIL, "Unable to Located Element");
		}

	}
    public void VerifyProposerMinMaxErrorMSG() throws InterruptedException {
		try {
			WebElement ErrorVal1 = driver.findElement(By.xpath("//p[contains(text(),'Mobile Number should be min 10 digits')]"));
			wait.waitForElementToBeVisibleweb(driver, ErrorVal1, 20,"Element is Not Display");
			if (ErrorVal1.isDisplayed()) {
				TestUtil.verifybgColor(ErrorVal1, driver);
				CustomListner.test.log(LogStatus.INFO, "Successfully Verified Proposer Mobile Number Minimum Error Message.You Can Not Enter Less Than 10 Digits");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Proposer Mobile Number Minimum Error Message");
			}
			
		} catch (NoSuchElementException e) {
			CustomListner.test.log(LogStatus.FAIL, "Unable to Located Element");
		}

	}
    public void VerifyInsuredMinMaxErrorMSG() throws InterruptedException {
		try {
			WebElement ErrorVal1 = driver.findElement(By.xpath("//p[contains(text(),'Mobile Number should be min 10 digits')]"));
			wait.waitForElementToBeVisibleweb(driver, ErrorVal1, 20,"Element is Not Display");
			if (ErrorVal1.isDisplayed()) {
				TestUtil.verifybgColor(ErrorVal1, driver);
				CustomListner.test.log(LogStatus.INFO, "Successfully Verified Insured Mobile Number Minimum Error Message.You Can Not Enter Less Than 10 Digits");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Insured Mobile Number Minimum Error Message");
			}
			
		} catch (NoSuchElementException e) {
			CustomListner.test.log(LogStatus.FAIL, "Unable to Located Element");
		}

	}
    public void VerifyProposerInvalidaPanErrorMSG() throws InterruptedException {
		try {
			WebElement ErrorVal1 = driver.findElement(By.xpath("//p[contains(text(),'Invalid PAN')]"));
			wait.waitForElementToBeVisibleweb(driver, ErrorVal1, 20,"Element is Not Display");
			if (ErrorVal1.isDisplayed()) {
				TestUtil.verifybgColor(ErrorVal1, driver);
				CustomListner.test.log(LogStatus.INFO, "Successfully Verified Proposer Invalid Pan Number  Error Message");
			} else {
				CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Proposer Invalid Pan Number  Error Message");
			}
			
		} catch (NoSuchElementException e) {
			CustomListner.test.log(LogStatus.FAIL, "Unable to Located Element");
		}

	}
    public void VerifyInsuredInvalidaPanErrorMSG() throws InterruptedException {
  		try {
  			WebElement ErrorVal1 = driver.findElement(By.xpath("//p[contains(text(),'Invalid PAN')]"));
  			wait.waitForElementToBeVisibleweb(driver, ErrorVal1, 20,"Element is Not Display");
  			if (ErrorVal1.isDisplayed()) {
  				TestUtil.verifybgColor(ErrorVal1, driver);
  				CustomListner.test.log(LogStatus.INFO, "Successfully Verified Insured Invalid Pan Number  Error Message.You Can Not Enter Less Than 10 Digits");
  			} else {
  				CustomListner.test.log(LogStatus.FAIL, "Failed To Verified Insured Invalid Pan Number  Error Message");
  			}
  			
  		} catch (NoSuchElementException e) {
  			CustomListner.test.log(LogStatus.FAIL, "Unable to Located Element");
  		}

  	}

	public void enterInsuredMobileNumberWeb(String mobileNumber) {
		WebElement mobileInputWeb = driver.findElement(By.xpath("(//input[@id='captureMobile'])[2]"));
		wait.waitforElementToBeClickable(driver, mobileInputWeb, 100);
		if (mobileInputWeb.isDisplayed()) {
			mobileInputWeb.clear();
			mobileInputWeb.sendKeys(mobileNumber);
			mobileInputWeb.sendKeys(Keys.TAB);
			CustomListner.test.log(LogStatus.INFO, "Enter Insured  Mobile  Value As =====>" + mobileNumber);
		} else {
			CustomListner.test.log(LogStatus.FAIL, "Insured Mobile Number Is Not Display");
		}
	}

	public void enterInsuredpanNumberWeb(String panNumber) {
		WebElement panNumberWeb = driver.findElement(By.xpath("//input[@name='insured.panNumber']"));
		wait.waitforElementToBeClickable(driver, panNumberWeb, 100);
		if (panNumberWeb.isDisplayed()) {
			panNumberWeb.clear();
			panNumberWeb.sendKeys(panNumber);
			panNumberWeb.sendKeys(panNumber);
			panNumberWeb.sendKeys(Keys.TAB);
			CustomListner.test.log(LogStatus.INFO, "Enter Insured PAN  Value As =====>" + panNumber);
		} else {
			CustomListner.test.log(LogStatus.FAIL, "Insured PAN Number TextBox Is Not Display");
		}
	}
	public void EnterProposerFirstNameWeb(String panNumber) {
		WebElement panNumberWeb = driver.findElement(By.xpath("(//input[contains(@id,'firstname')])[1]"));
		wait.waitForElementToBeVisibleweb(driver, panNumberWeb, 30,"Proposer FirstName Element is Not Display");
		if (panNumberWeb.isDisplayed()) {
			panNumberWeb.clear();
			panNumberWeb.sendKeys(panNumber);
			CustomListner.test.log(LogStatus.INFO, "Enter Proposer FirstName  Value As =====>" + panNumber);
		} else {
			CustomListner.test.log(LogStatus.FAIL, "Proposer FirstName  TextBox Is Not Display");
		}
	}
	
	public void EnterInsuredFirstNameWeb(String panNumber) {
		WebElement panNumberWeb = driver.findElement(By.xpath("(//input[contains(@id,'firstname')])[2]"));
		wait.waitForElementToBeVisibleweb(driver, panNumberWeb, 30,"Insured FirstName Element is Not Display");
		if (panNumberWeb.isDisplayed()) {
			panNumberWeb.clear();
			panNumberWeb.sendKeys(panNumber);
			CustomListner.test.log(LogStatus.INFO, "Enter Proposer FirstName  Value As =====>" + panNumber);
		} else {
			CustomListner.test.log(LogStatus.FAIL, "Proposer FirstName  TextBox Is Not Display");
		}
	}
	public void ClickOnAlertPopUpOKButtonWeb() {
		WebElement panNumberWeb = driver.findElement(By.xpath("//span[contains(text(),'OK')]"));
		wait.waitforElementToBeClickable(driver, panNumberWeb, 100);
		if (panNumberWeb.isDisplayed()) {
			panNumberWeb.click();
			CustomListner.test.log(LogStatus.INFO, "Click On Ok Button");
		} else {
			CustomListner.test.log(LogStatus.FAIL, "OK Button Is Not Display");
		}
	}
	 public void fillInsuredDOBdetailsWeb(String day, String month, String year) {
	        WebElement eleDOBDayInput = driver.findElement(By.xpath("(//input[@name='day'])[2]"));
	        wait.waitforElementToBeClickable(driver, eleDOBDayInput, 100);
	        eleDOBDayInput.click();
	        eleDOBDayInput.sendKeys(day);
	        CustomListner.test.log(LogStatus.INFO, "Enter Insured Day  Value As =====>"+day);
	        WebElement eleDOBMonthInput=driver.findElement(By.xpath("(//input[@name='month'])[2]"));
	        wait.waitforElementToBeClickable(driver,eleDOBMonthInput,100);
	        eleDOBMonthInput.clear();
	        eleDOBMonthInput.sendKeys(month);
	        CustomListner.test.log(LogStatus.INFO, "Enter Insured  month  Value As =====>"+month);
	        eleDOBMonthInput.sendKeys(Keys.TAB);
	        WebElement eleDOBYearInput=driver.findElement(By.xpath("(//input[@name='year'])[2]"));
	        eleDOBYearInput.clear();
	        eleDOBYearInput.sendKeys(year);
	        CustomListner.test.log(LogStatus.INFO, "Enter Insured year  Value As =====>"+year);
	       // eleDOBYearInput.sendKeys(Keys.ENTER);
	    }
	 public void clickInsuredselectPlanBtnWeb() {
	        WebElement selectplanWeb = driver.findElement(By.xpath("(//span[text()=\"SELECT PLAN\"])[2]"));
	        wait.waitforElementToBeClickable(driver, selectplanWeb, 100);
	        if (selectplanWeb.isDisplayed()) {
	            selectplanWeb.click();
	            CustomListner.test.log(LogStatus.INFO, "Click on Select Plan Button");
	        } else {
	        	CustomListner.test.log(LogStatus.FAIL, "Select Plan Button is not display");

	        }
	    }
	 public void ClickonRecomendedPlanWeb() {
	        WebElement selectplanWeb = driver.findElement(By.xpath("//span[contains(text(),'Recommended Plans')]"));
	        wait.waitforElementToBeClickable(driver, selectplanWeb, 100);
	        if (selectplanWeb.isDisplayed()) {
	            selectplanWeb.click();
	            CustomListner.test.log(LogStatus.INFO, "Click on Select Plan Button");
	        } else {
	        	CustomListner.test.log(LogStatus.FAIL, "Select Plan Button is not display");

	        }
	    }
 
	 public void clickonViewPlansBtnWeb() {
	        WebElement selectplanWeb = driver.findElement(By.xpath("//span[contains(text(),'View Plans')]"));
	        wait.waitforElementToBeClickable(driver, selectplanWeb, 100);
	        if (selectplanWeb.isDisplayed()) {
	            selectplanWeb.click();
	            CustomListner.test.log(LogStatus.INFO, "Click on View Plans Button");
	        } else {
	        	CustomListner.test.log(LogStatus.FAIL, "View Plans Button is not display");

	        }
	    }
	 public void clickonSaveBtnWeb() {
	        WebElement selectplanWeb = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
	        wait.waitforElementToBeClickable(driver, selectplanWeb, 100);
	        if (selectplanWeb.isDisplayed()) {
	            selectplanWeb.click();
	            CustomListner.test.log(LogStatus.INFO, "Click on Save Button");
	        } else {
	        	CustomListner.test.log(LogStatus.FAIL, "Save Button is not display");

	        }
	    }
	
	
	
	
	
	
	
	
	
	
	

}
