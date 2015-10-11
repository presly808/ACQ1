package ua.artcode.util;

import org.openqa.selenium.By;

public interface WebElementsActionsI {
    void openSite(String url);

    void clickButton(String buttonLocator);

    void clickLink(String linkLocator);

    void input(String inputLocator, String inputData);

    /*
         * Insert value into text input HTML field and Click ENTER for Field which used "Value" in the xpath expression
         */
    void inputAndClickEnter(String inputLocator, String inputData);

    boolean isElementPresent(By by);

    boolean isAlertPresent();

    String getAlertText();

    void refreshPage();

    void swithToWindow(String windowName);
}
