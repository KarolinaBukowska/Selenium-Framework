package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import config.Config;
import data.Users;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import utils.PageUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected Users users;
    public static WebDriver driver;

    public void setUpDriver(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + Config.CHROMEDRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void openAndVerifyPageUrl(WebDriver driver, String expectedUrl) {
        PageUtils.openPage(driver, expectedUrl);
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, expectedUrl);
    }
    public void setUpUsersData(String relativePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String filePath = getPathToResource(relativePath);
            users = objectMapper.readValue(new File(filePath), Users.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected String getPathToResource(String relativePath) {
        return Paths.get("src", "test", "resources", relativePath)
                .toString();
    }

    public void takeScreenshot(WebDriver webdriver) throws IOException {
        File srcFile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
        File destFile = new File(System.getProperty("user.dir") + "target/screenshots" + timestamp() + ".png");
        FileUtils.copyFile(srcFile, destFile);
    }
    public String timestamp(){
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }

}
