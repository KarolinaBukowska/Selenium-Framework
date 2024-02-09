package pages;

import data.UserLoginData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginAndRegistration {

    private WebDriver driver;


    public LoginAndRegistration(WebDriver driver) {
        this.driver = driver;
    }

    By descriptionTitle = By.cssSelector("div.page-title > h1");
    By createAccountBtn = By.xpath("//a[contains(@class, 'button')]//span[contains(text(), 'Create an Account')]");
    By loginBtn = By.xpath("//button[contains(@class, 'button') and @title='Login']//span//span[contains(text(), 'Login')]");
    By emailField = By.cssSelector("#email");
    By passwordField = By.cssSelector("#pass");

    public WebElement getDescriptionTitle(){
        return driver.findElement(descriptionTitle);
    }
    public WebElement getCreateAccountBtn(){
        return driver.findElement(createAccountBtn);
    }
    public WebElement getLoginBtn(){
        return driver.findElement(loginBtn);
    }
    public WebElement getEmailField(){
        return driver.findElement(emailField);
    }
    public WebElement getPasswordField(){
        return driver.findElement(passwordField);
    }
    public void waitDescriptionTitleVisible(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(getDescriptionTitle()));
    }
    public void waitCreateAccountBtnVisibleEnabled(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(getCreateAccountBtn()),
                ExpectedConditions.elementToBeClickable(getCreateAccountBtn())
        ));
    }
    public void waitLoginBtnVisibleEnabled(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(getLoginBtn()),
                ExpectedConditions.elementToBeClickable(getLoginBtn())
        ));
    }
    public void login(UserLoginData userData) {
        getEmailField().sendKeys(userData.getEmailAddress());
        getPasswordField().sendKeys(userData.getPassword());
        waitLoginBtnVisibleEnabled();
        getLoginBtn().click();
    }



}
