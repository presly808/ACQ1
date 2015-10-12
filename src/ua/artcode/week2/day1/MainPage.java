package ua.artcode.week2.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ua.artcode.week1.day2.WebElementsActions;

import java.io.IOException;

/**
 * Created by ViTaLES on 10.10.2015.
 */
public class MainPage {
    WebDriver driver;
    WebElementsActions web;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        web = new WebElementsActions(driver);
        //PageFactory.initElements(driver, this);
        //PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void clickLogo() throws IOException {
        web.clckLink("Logo");
    }

    public void switchToLoginPage() throws IOException {
        web.clckLink("LoginPageLink");

        if (web.isElementPresent("LoginField")) {
            System.out.println("SwitchTo Login Page was correct");
        } else {
            System.out.println("SwitchTo Login Page was Incorrect");
        }
    }

}
