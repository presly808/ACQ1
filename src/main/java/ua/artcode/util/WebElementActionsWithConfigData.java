package ua.artcode.util;

import org.openqa.selenium.*;

import static ua.artcode.util.ConfigData.getSelectorBy;

public class WebElementActionsWithConfigData implements WebElementsActionsI {

    private WebDriver driver;

    public WebElementActionsWithConfigData(WebDriver webDriver) {
        this.driver = webDriver;
    }

    @Override
    public void openSite(String url) {
        driver.get(url);
    }

    @Override
    public void clickButton(String buttonLocator) {
        driver.findElement(getSelectorBy(buttonLocator)).click();
    }

    @Override
    public void clickLink(String linkLocator) {
        driver.findElement(getSelectorBy(linkLocator)).click();
    }

    @Override
    public void input(String inputLocator, String inputData) {
        driver.findElement(getSelectorBy(inputLocator)).clear();
        driver.findElement(getSelectorBy(inputLocator)).sendKeys(inputData);
    }

    /*
     * Insert value into text input HTML field and Click ENTER for Field which used "Value" in the xpath expression
     */
    @Override
    public void inputAndClickEnter(String inputLocator, String inputData) {
        driver.findElement(getSelectorBy(inputLocator)).clear();
        driver.findElement(getSelectorBy(inputLocator)).sendKeys(inputData);
        driver.findElement(getSelectorBy(inputLocator)).sendKeys(Keys.ENTER);
    }

    @Override
    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    @Override
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

    @Override
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


    @Override
    public void refreshPage() {
        driver.navigate().refresh();
    }


    //Home work; created method swithToWindow()

    @Override
    public void swithToWindow(String windowName) {
        driver.switchTo().window(windowName);
    }
}
