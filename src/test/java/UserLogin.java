import config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.PageUtils;
import org.testng.Assert;

public class UserLogin {


    private WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void  login(){
        PageUtils.openPage(driver, Config.BASE_URL);
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, Config.BASE_URL);

        driver.quit();
    }





}
