package ua.artcode.week3.day1.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ua.artcode.week1.day2.WebElementsActions;

import java.io.IOException;

import static ua.artcode.utils.ConfigData.ui;

/**
 * Created by lavi on 10/16/2015.
 */
public class LoginPage {

    WebDriver driver;
    WebElementsActions web;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        web = new WebElementsActions(driver);
    }

    public void fillEmailField() throws IOException {
        web.input("EmailField","admin");
    }

    public void fillPasswordField() throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        web.clickButton("LoginText");
        web.clckLink("PassField");
        web.waitForElementPresent("PassField");
        web.input("PassField", "admin");
    }


    public void clickloginButton() throws IOException {
        web.clckLink("LoginButton");

        Assert.assertTrue("Incorrect work login form", web.isElementPresent("Logo"));
    }


}
