package ua.artcode.week3.day1.Pages;

import org.openqa.selenium.WebDriver;
import ua.artcode.week3.day1.utils.WebDriverWrapper;
import ua.artcode.week3.day1.utils.WebElementsActions;

/**
 * Created by ViTaLES on 18.10.2015.
 */
public class Ellos {

    public WebElementsActions web;
    public MainPage mainPage;
    public LoginPage loginPage;

    public Ellos(WebDriverWrapper driver) {
        web = new WebElementsActions(driver);
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
    }


}
