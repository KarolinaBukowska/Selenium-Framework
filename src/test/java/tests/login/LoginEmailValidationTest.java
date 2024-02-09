package tests.login;

import config.Config;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Pages;
import tests.BaseTest;

public class LoginEmailValidationTest extends BaseTest {

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
    public void  loginWithUnregisteredUsername(){
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
//      Step 2 Enter the user's credentials that contain unregistered email and registered password
//      The error message pops up
        Pages.loginAndRegistration.login(users.getUserWithInvalidEmail());
        Pages.loginAndRegistration.waitInvalidLoginMsgVisible();
////      Step 3 Clear the EMAIL field, leaving the password field populated with the registered password
        Pages.loginAndRegistration.getEmailField().clear();
        Pages.loginAndRegistration.isEmailFieldEmpty();
//      Step 4 Click on the Login button
//      Both Email Address and Password fields get cleared out
//      The error message pops up
//      Additionally, the messages pop up under both Email Address and Password fields
        Pages.loginAndRegistration.waitLoginBtnVisibleEnabled();
        Pages.loginAndRegistration.getLoginBtn().click();
        Pages.loginAndRegistration.isEmailFieldEmpty();
        Pages.loginAndRegistration.isPasswordFieldEmpty();
        Pages.loginAndRegistration.waitInvalidLoginMsgVisible();
        Pages.loginAndRegistration.waitMissingLoginEmailVisible();
        Pages.loginAndRegistration.waitMissingLoginPasswordVisible();
    }
}
