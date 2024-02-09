package pages;

import data.UserLoginData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginAndRegistration {

    public WebDriver driver;


    public LoginAndRegistration(WebDriver driver) {
        this.driver = driver;
    }

    By descriptionTitle = By.cssSelector("div.page-title > h1");
    By createAccountBtn = By.xpath("//a[contains(@class, 'button')]//span[contains(text(), 'Create an Account')]");
    By loginBtn = By.xpath("//button[contains(@class, 'button') and @title='Login']//span//span[contains(text(), 'Login')]");
    By emailField = By.cssSelector("#email");
    By passwordField = By.cssSelector("#pass");
    By invalidLoginMsg = By.cssSelector(".error-msg span");
    By missingLoginEmail = By.cssSelector("#advice-required-entry-email");
    By missingLoginPassword = By.cssSelector("#advice-required-entry-pass");

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
    public WebElement getInvalidLoginMsg(){
        return driver.findElement(invalidLoginMsg);
    }
    public WebElement getMissingLoginEmail(){
        return driver.findElement(missingLoginEmail);
    }
    public WebElement getMissingLoginPassword(){
        return driver.findElement(missingLoginPassword);
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
    public void waitInvalidLoginMsgVisible(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(getInvalidLoginMsg()));
    }
    public void waitMissingLoginEmailMsgVisible(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(getMissingLoginEmail()));
    }
    public void waitMissingLoginPasswordMsgVisible(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(getMissingLoginPassword()));
    }
    public boolean isEmailFieldEmpty(){
        WebElement emailField = getEmailField();
        return emailField.getText().isEmpty();
    }
    public boolean isPasswordFieldEmpty(){
        WebElement passwordField = getPasswordField();
        return passwordField.getText().isEmpty();
    }

    public void login(UserLoginData userData) {
        getEmailField().sendKeys(userData.getEmailAddress());
        getPasswordField().sendKeys(userData.getPassword());
        waitLoginBtnVisibleEnabled();
        getLoginBtn().click();
    }



}
