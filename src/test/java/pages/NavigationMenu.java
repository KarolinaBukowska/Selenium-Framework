package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationMenu {

    public WebDriver driver;

    public NavigationMenu(WebDriver driver){
        this.driver = driver;
    }

    By womenMenu = By.xpath("//nav[@id='nav']//li[@class='level0 nav-1 first parent']");
    By viewAllWomenSubmenu = By.xpath("//li[@class='level0 nav-1 first active parent']//a[text()='View All Women']");
    By womenNewArrivalsSubmenu = By.xpath("//li[@class='level0 nav-1 first active parent']//li[@class='level1 nav-1-1 first']/a[text()='New Arrivals']");
    By womenTopsBlousesSubmenu = By.xpath(".//li[@class='level1 nav-1-2']/a[text()='Tops & Blouses']");
    By womenPantsDenimSubmenu = By.xpath("//li[@class='level0 nav-1 first active parent']//li[@class='level1 nav-1-3']/a[text()='Pants & Denim']");
    By womenDressesSkirtsSubmenu = By.xpath("//li[@class='level0 nav-1 first active parent']//li[@class='level1 nav-1-4 last']/a[text()='Dresses & Skirts']");

    public WebElement getWomenMenu(){
        return driver.findElement(womenMenu);
    }
    public WebElement getViewAllSubmenu(){
        return driver.findElement(viewAllWomenSubmenu);
    }
    public WebElement getWomenNewArrivalsSubmenu(){
        return driver.findElement(womenNewArrivalsSubmenu);
    }
    public WebElement getWomenTopsBlousesSubmenu(){
        return driver.findElement(womenTopsBlousesSubmenu);
    }
    public WebElement getWomenPantsDenimSubmenu(){
        return driver.findElement(womenPantsDenimSubmenu);
    }
    public WebElement getWomenDressesSkirtsSubmenu(){
        return driver.findElement(womenDressesSkirtsSubmenu);
    }
    public void waitWomenMenuVisibleEnabled(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(getWomenMenu()),
                ExpectedConditions.elementToBeClickable(getWomenMenu())
        ));
    }
    public void waitViewAllSubmenuVisibleEnabled(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(getViewAllSubmenu()),
                ExpectedConditions.elementToBeClickable(getViewAllSubmenu())
        ));
    }
    public void waitWomenNewArrivalsSubmenuVisibleEnabled(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(getWomenNewArrivalsSubmenu()),
                ExpectedConditions.elementToBeClickable(getWomenNewArrivalsSubmenu())
        ));
    }
    public void waitWomenTopsBlousesSubmenuVisibleEnabled(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(getWomenTopsBlousesSubmenu()),
                ExpectedConditions.elementToBeClickable(getWomenTopsBlousesSubmenu())
        ));
    }
    public void waitWomenPantsDenimSubmenuVisibleEnabled(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(getWomenPantsDenimSubmenu()),
                ExpectedConditions.elementToBeClickable(getWomenPantsDenimSubmenu())
        ));
    }
    public void waitWomenDressesSkirtsSubmenuVisibleEnabled(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(getWomenDressesSkirtsSubmenu()),
                ExpectedConditions.elementToBeClickable(getWomenDressesSkirtsSubmenu())
        ));
    }

    public void navigateWomenTopsBlousesSubmenu(){
        Actions actions = new Actions(driver);
        waitWomenMenuVisibleEnabled();
        actions.moveToElement(getWomenMenu()).perform();
        waitWomenTopsBlousesSubmenuVisibleEnabled();
        getWomenTopsBlousesSubmenu().click();
    }
}
