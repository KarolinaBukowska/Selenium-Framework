package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {

    public WebDriver driver;

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    By accountBtn = By.cssSelector(".account-cart-wrapper a");
    By homePageLoginBtn = By.cssSelector("a[title='Log In']");

    public WebElement getAccountBtn(){
        return driver.findElement(accountBtn);
    }
    public WebElement getHomepageLoginBtn(){
        return driver.findElement(homePageLoginBtn);
    }

    public void waitForAccountBtnVisibleEnabled() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(getAccountBtn()),
                ExpectedConditions.elementToBeClickable(getAccountBtn())
        ));
    }

    public void waitForHomepageLoginBtnVisibleEnabled() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(getHomepageLoginBtn()),
                ExpectedConditions.elementToBeClickable(getHomepageLoginBtn())
        ));
    }




}
