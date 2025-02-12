package com.absli.pageObjects;
import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class PlanInfo extends TestBase {


    public WebDriver driver;
    public AndroidDriver driver1;
    public WaitUtils waitUtils;


    // Initializing the Page Objects:
    public PlanInfo(AndroidDriver driver1) {
        this.driver1 = driver1;
        waitUtils = new WaitUtils();

    }

    public PlanInfo(WebDriver driver) {
        this.driver = driver;
        waitUtils = new WaitUtils();
    }

    public PlanInfo(IOSDriver driver) {
        this.driver2 = driver;
        waitUtils = new WaitUtils();
    }

/**
 * Methods and locators start here
 */



   public void planInfoPageHeaderVerifyWeb(){

    WebElement header = driver.findElement(By.xpath("//div[text()=\"Plan Info\"]"));
    if(header.isDisplayed()){
       Assert.assertTrue(true, "header is "+header.getText());
    }
  else {
      Assert.assertTrue(false);
    }
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}




    public String verifyPremiumPlanInfoWeb(){

        WebElement premium = driver.findElement(By.xpath("//div[@class=\"amount-in-numbers\"]"));
        waitUtils.waitforElementToBeClickable(driver, premium, 100);

        return premium.getText();

    }

    public void clickPlanInfoBackBtnWeb(){
        WebElement BackBtn = driver.findElement(By.xpath("//img[@class=\"hamburger-icon\"]"));
        waitUtils.waitforElementToBeClickable(driver, BackBtn, 100);
        BackBtn.click();
    }


}