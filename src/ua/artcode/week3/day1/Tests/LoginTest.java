package ua.artcode.week3.day1.Tests;

import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ua.artcode.week2.day1.MainPage;
import ua.artcode.week3.day1.Pages.LoginPage;

import java.io.IOException;

/**
 * Created by lavi on 10/16/2015.
 */
public class LoginTest extends Fixture {

    @BeforeMethod
    public void beforeTest() {
        System.out.println("Start test");

    }

    @AfterMethod
    public void afterTest() {
        System.out.println("Finish test");

    }

    @Test
    public void test1() throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {

        driver.get("http://ellos.se");
        MainPage mainPage = new MainPage(driver);

        mainPage.clickLogo();
        mainPage.switchToLoginPage();

        LoginPage loginPage = new LoginPage(driver);

        loginPage.fillEmailField();
        loginPage.fillPasswordField();
        loginPage.clickloginButton();

        System.out.println("FirstTest.test1");
    }

}
