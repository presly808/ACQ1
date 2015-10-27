package pages;


import utils.WebDriverWrapper;
import utils.WebElementsActions;

/**
 * Created by ViTaLES on 18.10.2015.
 */
public class Ellos {

    public WebElementsActions web;
    public MainPage mainPage;
    public LoginPage loginPage;

    public Ellos(WebDriverWrapper driver) throws Exception {
        web = new WebElementsActions(driver);

        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
    }


}
