package ua.artcode.week3.day1.Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import ua.artcode.week3.day1.utils.PropertyLoader;
import ua.artcode.week3.day1.utils.WebDriverWrapper;
import ua.artcode.week3.day1.utils.WebElementsActions;

import java.io.IOException;

/**
 * Created by lavi on 10/16/2015.
 */
public class MainPage extends Page{

    private static final String MAIN_PAGE = PropertyLoader.loadProperty("site.url");

    public MainPage(WebDriverWrapper driver) {
        super(driver, MAIN_PAGE);
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
