package ua.artcode.week1.day2;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;

/**
 * Created by ViTaLES on 04.10.2015.
 */
public class WebElementsAction {


    private WebDriver driver;

    public WebElementsAction(WebDriver webDriver) {
        this.driver = driver;
    }

    public void openSite(String url) {
        driver.get(url);
    }

    public void clickButton(String buttonLacotor) {
        driver.findElement(By.xpath(buttonLacotor)).click();
    }

    public void clckLink(String linkLocator) {
        driver.findElement(By.xpath(linkLocator)).click();
    }

    public void input(String inputLocator, String inputData) {
        driver.findElement(By.xpath(inputLocator)).clear();
        driver.findElement(By.xpath(inputLocator)).sendKeys(inputData);
    }

    /*
     * Insert value into text input HTML field and Click ENTER for Field which used "Value" in the xpath expression
     */
    public void inputAndClickEnter(String inputLocator, String inputData) {
        driver.findElement(By.xpath(inputLocator)).clear();
        driver.findElement(By.xpath(inputLocator)).sendKeys(inputData);
        driver.findElement(By.xpath(inputLocator)).sendKeys(Keys.ENTER);
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
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


    //Home work; created method swithToWindow()


}
