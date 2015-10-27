package pages;


import utils.PropertyLoader;
import utils.WebDriverWrapper;

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
