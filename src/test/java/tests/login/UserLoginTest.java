package tests.login;

import config.Config;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Pages;
import tests.BaseTest;

public class UserLoginTest extends BaseTest {




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
//      "Create an account" and "Login" buttons are present
        Pages.setDriver(driver);
        Pages.homePage.waitForAccountBtnVisibleEnabled();
        Pages.homePage.getAccountBtn().click();
        Pages.homePage.waitForHomepageLoginBtnVisibleEnabled();
        Pages.homePage.getHomepageLoginBtn().click();
        Pages.loginAndRegistration.waitDescriptionTitleVisible();
        Pages.loginAndRegistration.waitCreateAccountBtnVisibleEnabled();
//      Step 2 Login with the valid credentials
        Pages.loginAndRegistration.login(users.getUserOne());
//      "My dashboard" page is present
//      The following list items are present: Account Information, Address Book, My Orders,
//      Billing Agreements, My Product Reviews, My Applications
        Pages.accountDashboard.waitAccountDashboardTitleVisible();
        Pages.accountDashboard.waitAccountInformationVisibleEnabled();
        Pages.accountDashboard.waitAddressBookVisibleEnabled();
        Pages.accountDashboard.waitMyOrdersVisibleEnabled();
        Pages.accountDashboard.waitBillingAgreementsVisibleEnabled();
        Pages.accountDashboard.waitMyProductReviewsVisibleEnabled();
        Pages.accountDashboard.waitMyApplicationsVisibleEnabled();
    }
}
