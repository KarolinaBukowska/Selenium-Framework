package tests;

import config.Config;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Pages;

public class UserLogin extends BaseTest {




    @BeforeClass
    public void setUp(){
        setUpDriver();
        setUpUsersData(Config.USERS_DATA);
    }

    @AfterTest
    public void tearDown(){
        driver.close();
        driver = null;
    }

    @Test
    public void  login(){
        openAndVerifyPageUrl(driver,Config.BASE_URL);
//      Step 1 Click on the "My account" button and then on the Log in button
//      A "Login or Create an Account" page is present
//      "Create an account" and "Login" buttons present
        Pages.setDriver(driver);
        Pages.homePage.waitForAccountBtnVisibleEnabled();
        Pages.homePage.getAccountBtn().click();
        Pages.homePage.waitForHomepageLoginBtnVisibleEnabled();
        Pages.homePage.getHomepageLoginBtn().click();
        Pages.loginAndRegistration.waitDescriptionTitleVisible();
        Pages.loginAndRegistration.waitCreateAccountBtnVisibleEnabled();
        Pages.loginAndRegistration.login(users.getUserOne());





















    }





}
