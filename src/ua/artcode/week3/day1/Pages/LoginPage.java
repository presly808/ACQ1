package ua.artcode.week3.day1.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import ua.artcode.week1.day2.WebElementsActions;

import java.io.IOException;

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
        web.clckLink("PassField");
        //web.waitForElementPresent("PassField");

        //System.out.println(web.isElementPresent("PassField"));
        //System.out.println(driver.findElement(ui("PassField")).isEnabled());

        web.inputWithoutCleaning("PassFieldInput", "admin");
    }

    public void clickloginButton() throws IOException {
        web.clckLink("LoginButton");

        if (web.isElementPresent("Logo")) {
            //log.info
        } else {

            //log.ree
        }
        Assert.assertTrue("Incorrect work login form", web.isElementPresent("Logo"));
    }


}
