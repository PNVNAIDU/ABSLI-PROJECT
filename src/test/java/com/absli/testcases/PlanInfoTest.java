package com.absli.testcases;

import com.absli.base.TestBase;
import com.absli.dataproviders.DataProviders;
import com.absli.pageObjects.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.TestUtil;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class PlanInfoTest extends TestBase {

    LoginPage loginPage;
    Dashboard dashboard;
    CustomerProfile customerProfile;
    ViewQuote viewQuote;
    PlanInfo planInfo;

    public PlanInfoTest() {
        super();

    }

    @BeforeClass
    public void preSetup() throws IOException {
        initialization();
    }


    @BeforeMethod
    public void setUp() throws MalformedURLException {

        if (TestBase.parameterName.equalsIgnoreCase("web")) {
            loginPage = new LoginPage(TestBase.driver);
            dashboard = new Dashboard(TestBase.driver);
            customerProfile = new CustomerProfile(TestBase.driver);
            viewQuote = new ViewQuote(TestBase.driver);
            planInfo = new PlanInfo(TestBase.driver);

        } else if (TestBase.parameterName.equalsIgnoreCase("Android")) {
            loginPage = new LoginPage(TestBase.driver1);
            dashboard = new Dashboard(TestBase.driver1);
            customerProfile = new CustomerProfile(TestBase.driver1);
            planInfo = new PlanInfo(TestBase.driver1);
        } else {
            loginPage = new LoginPage(TestBase.driver2);
            dashboard = new Dashboard(TestBase.driver2);
            customerProfile = new CustomerProfile(TestBase.driver2);
            planInfo = new PlanInfo(TestBase.driver2);
        }
    }


    @Test(groups = {"web"}, dataProvider = "planInfoDataProvider", dataProviderClass = DataProviders.class,
            description = "TEST-582 -Navigate to Plan Info Page and In Riders Tab Should display Plan with Entered Amount"+
                    "TEST-582- Redirect to Previous Page"
    )
    public void planInfoPagenavigationWeb(String userName, String passWord, String leadID, String mobileNumber,
                                         String panNumber, String day, String month, String year, String quoteAmount, String planOptions,
                                         String smokerNonSmoker, String pptOption, String term, String paymode, String AciSumAssured, String Rideramount) throws InterruptedException {
        loginPage.enterUserNameweb(userName);

        loginPage.enterUserNameweb(userName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterpasswordweb(passWord);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.submitButtonweb();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        dashboard.clickHamburgerandSelectNewApplicationWeb();
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        customerProfile.enterLeadIDWeb(leadID);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        dashboard.checkLoaderWeb();
        customerProfile.enterMobileNumberWeb(mobileNumber);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.enterpanNumberWeb(panNumber);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.customerProfileNextButtonClick();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        customerProfile.fillDOBdetailsWeb(day, month, year);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        viewQuote.clickselectPlanBtnWeb();
        viewQuote.selectPlanJourneyNewWeb("BSLI CritiShield Plan");
        viewQuote.viewQuotePageVerifyWeb();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String str = viewQuote.verifyPremiumWeb().trim();
        viewQuote.clickNextBtnCapital();
        TestUtil.scrollTillEndOfPage(driver);
        planInfo.planInfoPageHeaderVerifyWeb();
        String str2 = planInfo.verifyPremiumPlanInfoWeb().trim();
        Assert.assertEquals(str, str2);
        planInfo.clickPlanInfoBackBtnWeb();
    }
}