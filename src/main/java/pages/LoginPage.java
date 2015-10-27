package pages;


import org.testng.Assert;
import utils.WebDriverWrapper;

import java.io.IOException;

/**
 * Created by lavi on 10/16/2015.
 */
public class LoginPage extends Page {


    public LoginPage(WebDriverWrapper driver) throws Exception {
        super(driver);
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
        Assert.assertTrue(web.isElementPresent("Logo"), "Incorrect work login form");
    }


}
