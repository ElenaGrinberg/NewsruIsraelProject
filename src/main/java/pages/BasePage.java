package pages;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class BasePage {
    protected static WebDriver webDriver;
    protected static WebDriverWait wait;
    private static final Logger logger = LogManager.getLogger(BasePage.class);

    //Служебные функции
    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, 5);
    }
    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void takeScreenshot(String name) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) webDriver;
        File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("Screenshots/" + name + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void explicitWaitPresenceOfElement(String xpath) {
        WebElement expWait = (new WebDriverWait(webDriver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    public static void waitPresenceOfVisibility(String xpath) {
        WebElement wait = (new WebDriverWait(webDriver, 70)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }


    //Страницы

    public void navigateToPageByURL(String pageURL) {
        webDriver.get(pageURL);
    }

    protected static String getCurrentPageURL() {
        return webDriver.getCurrentUrl();
    }

    public String pageIsOpen() {
        String linkSite = BasePage.getCurrentPageURL();
        return linkSite;
    }

    //Элементы страниц

    protected static boolean elementExists(String xpath) {
        try {
            logger.info("Check element with xpath exists: " + xpath);
            webDriver.findElement(By.xpath(xpath));
            return true;
        } catch (Exception err) {
            return false;
        }
    }

    protected static WebElement findElementByXpath(String xpath) {
        WebElement element;
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        element = webDriver.findElement(By.xpath(xpath));
        return element;
    }

    public boolean elementsAreVisible(String xpath) {
        Boolean areVisible = elementExists(xpath);
        return areVisible;
    }

    protected static WebElement clickElementByXpath(String xpath) {
        logger.info("Clicking element with xpath :" + xpath);

        webDriver.findElement(By.xpath(xpath)).click();
        return null;
    }

    protected static void clickElementByTextLink(String linkText) {
        webDriver.findElement(By.linkText(linkText)).click();
    }

    protected static String getValueByXpath(String xpath) {
        String value = webDriver.findElement(By.xpath(xpath)).getText();
        return value;
    }

    //Отправить

    protected void sendTextToElementByXpath(String xpath, String text) {
        findElementByXpath(xpath).sendKeys(text);
    }

    //Работа с курсором
    protected void goBackPage() {
        webDriver.navigate().back();
    }
    public static void moveCursorToElement(String link, String xpath) {
        webDriver.get(link);
        WebElement element = findElementByXpath(xpath);
        Actions builder = new Actions(webDriver);
        builder.moveToElement(element).build().perform();
    }









}
