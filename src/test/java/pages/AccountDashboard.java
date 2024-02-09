package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountDashboard {

    private WebDriver driver;

    public AccountDashboard(WebDriver driver){
        this.driver = driver;
    }

    By accountDashboardTitle = By.cssSelector("div.page-title > h1");
    By accountInformation = By.xpath("//li/a[text()='Account Information']");
    By addressBook = By.xpath("//li/a[text()='Address Book']");
    By myOrders = By.xpath("//li/a[text()='My Orders']");
    By billingAgreements = By.xpath("//li/a[text()='Billing Agreements']");
    By myProductReviews = By.xpath("//li/a[text()='My Product Reviews']");
    By myApplications = By.xpath("//li/a[text()='My Applications']");

    public WebElement getAccountDashboardTitle(){
        return driver.findElement(accountDashboardTitle);
    }
    public WebElement getAccountInformation(){
        return driver.findElement(accountInformation);
    }
    public WebElement getAddressBook(){
        return driver.findElement(addressBook);
    }
    public WebElement getMyOrders(){
        return driver.findElement(myOrders);
    }
    public WebElement getBillingAgreements(){
        return driver.findElement(billingAgreements);
    }
    public WebElement getMyProductReviews(){
        return driver.findElement(myProductReviews);
    }
    public WebElement getMyApplications(){
        return driver.findElement(myApplications);
    }
    public void waitAccountDashboardTitleVisible(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(getAccountDashboardTitle()));
    }
    public void waitAccountInformationVisibleEnabled(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(getAccountInformation()),
                ExpectedConditions.elementToBeClickable(getAccountInformation())
        ));
    }
    public void waitAddressBookVisibleEnabled(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(getAddressBook()),
                ExpectedConditions.elementToBeClickable(getAddressBook())
        ));
    }
    public void waitMyOrdersVisibleEnabled(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(getMyOrders()),
                ExpectedConditions.elementToBeClickable(getMyOrders())
        ));
    }
    public void waitBillingAgreementsVisibleEnabled(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(getBillingAgreements()),
                ExpectedConditions.elementToBeClickable(getBillingAgreements())
        ));
    }
    public void waitMyProductReviewsVisibleEnabled(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(getMyProductReviews()),
                ExpectedConditions.elementToBeClickable(getMyProductReviews())
        ));
    }
    public void waitMyApplicationsVisibleEnabled(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(getMyApplications()),
                ExpectedConditions.elementToBeClickable(getMyApplications())
        ));
    }
}
