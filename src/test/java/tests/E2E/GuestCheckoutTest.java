package tests.E2E;

import config.Config;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Pages;
import tests.BaseTest;

public class GuestCheckoutTest extends BaseTest {

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
    public void guestCheckout(){
        openAndVerifyPageUrl(driver,Config.BASE_URL);
//      Step 1 Click on the "My account" button and then on the Log in button
//      A "Login or Create an Account" page is present
//      "Create an account" and "Login" buttons are present
        Pages.setDriver(driver);
        Pages.navigationMenu.navigateWomenTopsBlousesSubmenu();


    }


}
