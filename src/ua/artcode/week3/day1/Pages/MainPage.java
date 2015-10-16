package ua.artcode.week3.day1.Pages;

import org.openqa.selenium.WebDriver;
import ua.artcode.week1.day2.WebElementsActions;

import java.io.IOException;

/**
 * Created by lavi on 10/16/2015.
 */
public class MainPage {

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
            System.out.println("SwitchTo Login Page was correct");
        } else {
            System.out.println("SwitchTo Login Page was Incorrect");
        }
    }


}
