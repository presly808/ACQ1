package ua.artcode.week3.day1.Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import ua.artcode.week1.day2.WebElementsActions;

import java.io.IOException;

/**
 * Created by lavi on 10/16/2015.
 */
public class MainPage {
    static Logger log = Logger.getLogger(MainPage.class);
    WebDriver driver;
    WebElementsActions web;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        web = new WebElementsActions(driver);
    }

    public void clickLogo() throws IOException {
        web.clckLink("Logo");
    }

    public void switchToLoginPage() throws IOException {
        web.clckLink("LoginPageLink");

        if (web.isElementPresent("EmailField")) {
            log.info("SwitchTo Login Page was correct");
        } else {
            log.error("SwitchTo Login Page was Incorrect");
        }
    }


}
