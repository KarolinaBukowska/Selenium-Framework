package utils;

import org.openqa.selenium.WebDriver;

public class PageUtils {

    public static void openPage(WebDriver driver, String url) {
        driver.get(url);
    }

}
