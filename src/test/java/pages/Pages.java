package pages;

import org.openqa.selenium.WebDriver;
import tests.BaseTest;

public class Pages extends BaseTest {

    public static Homepage homePage;
    public static LoginAndRegistration loginAndRegistration;

    public static void setDriver(WebDriver driver) {
        Pages.driver = driver;
        homePage = new Homepage(driver);
        loginAndRegistration = new LoginAndRegistration(driver);
    }

}
