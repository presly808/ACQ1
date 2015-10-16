package ua.artcode.week1.day2;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static ua.artcode.utils.ConfigData.ui;

/**
 * Created by ViTaLES on 04.10.2015.
 */
public class WebElementsActions {

    public static WebDriverWait waitForElement;
    private WebDriver driver;

    public WebElementsActions(WebDriver driver) {
        this.driver = driver;
        waitForElement = new WebDriverWait(driver, 30);
    }

    public void openSite(String url) {
        driver.get(url);
    }

    public void clickButton(String buttonLacotor) throws IOException {
        driver.findElement(ui(buttonLacotor)).click();
    }

    public void clckLink(String linkLocator) throws IOException {
        driver.findElement(ui(linkLocator)).click();
    }

    public void input(String inputLocator, String inputData) throws IOException {
        driver.findElement(ui(inputLocator)).clear();
        driver.findElement(ui(inputLocator)).sendKeys(inputData);
    }

    public void inputWithoutCleaning(String inputLocator, String inputData) throws IOException {
        driver.findElement(ui(inputLocator)).sendKeys(inputData);
    }

    /*
     * Insert value into text input HTML field and Click ENTER for Field which used "Value" in the xpath expression
     */
    public void inputAndClickEnter(String inputLocator, String inputData) throws IOException {
        driver.findElement(ui(inputLocator)).clear();
        driver.findElement(ui(inputLocator)).sendKeys(inputData);
        driver.findElement(ui(inputLocator)).sendKeys(Keys.ENTER);
    }

    public boolean isElementPresent(String elementLocator) {
        try {
            driver.findElement(ui(elementLocator)).isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean isAlertPresent() {
        boolean alertPresent = false;
        try {
            Alert alert = driver.switchTo().alert();
            alertPresent = true;
            alert.accept();
        } catch (NoAlertPresentException ex) {
            ex.printStackTrace();
        }
        return alertPresent;
    }

    public String getAlertText() {
        String alertText;
        try {
            Alert alert = driver.switchTo().alert();
            alertText = alert.getText();
            alert.accept();
        } catch (NoAlertPresentException ex) {
            alertText = "Alert is not found";
            ex.printStackTrace();
        }
        return alertText;
    }


    public void refreshPage() {
        driver.navigate().refresh();
    }

    public boolean waitForElementPresent(String elementLocator) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        try {
            waitForElement.until(ExpectedConditions.visibilityOfElementLocated(ui(elementLocator)));
            System.out.println(1);
        } catch (NoSuchElementException Ex) {
            return false;
        }
        return true;
    }

    //Home work; created method swithToWindow()


}
