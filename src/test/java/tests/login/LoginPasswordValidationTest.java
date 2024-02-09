package tests.login;

import config.Config;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Pages;
import tests.BaseTest;

public class LoginPasswordValidationTest extends BaseTest {

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
    public void loginWithUnregisteredPassword(){

//      Preconditions:
//      Home page is present
        openAndVerifyPageUrl(driver,Config.BASE_URL);
//      Step 1 Click on the "My account" button and then on the Log in button
//      A "Login or Create an Account" page is present
//      "Create an account" and "Login" buttons are present
        Pages.setDriver(driver);
        Pages.homePage.waitForAccountBtnVisibleEnabled();
        Pages.homePage.getAccountBtn().click();
        Pages.homePage.waitForHomepageLoginBtnVisibleEnabled();
        Pages.homePage.getHomepageLoginBtn().click();
        Pages.loginAndRegistration.waitDescriptionTitleVisible();
        Pages.loginAndRegistration.waitCreateAccountBtnVisibleEnabled();
//      Step 2 Enter the user's credentials that contain registered email and unregistered password
//      The error message pops up
        Pages.loginAndRegistration.login(users.getUserWithInvalidPassword());
        Pages.loginAndRegistration.getInvalidLoginMsg();
//      Step 3 Clear the password field, leaving the email field populated with the registered email
        Pages.loginAndRegistration.getPasswordField().clear();
        Pages.loginAndRegistration.isPasswordFieldEmpty();
//      Step 4 Click on the Login button
//      Password field gets cleared out
//      The error message pops up: "Invalid login or password."
//      The message pops up under Password field:"This is a required field.
        Pages.loginAndRegistration.getLoginBtn().click();
        Pages.loginAndRegistration.isPasswordFieldEmpty();
        Pages.loginAndRegistration.waitInvalidLoginMsgVisible();
        Pages.loginAndRegistration.waitMissingLoginPasswordMsgVisible();
    }


}
