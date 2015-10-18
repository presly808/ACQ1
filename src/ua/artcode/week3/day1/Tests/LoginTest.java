package ua.artcode.week3.day1.Tests;

import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ua.artcode.week2.day1.MainPage;
import ua.artcode.week3.day1.Pages.LoginPage;
import ua.artcode.week3.day1.logger.Log4Test;

import java.io.IOException;

/**
 * Created by lavi on 10/16/2015.
 */
public class LoginTest extends Fixture {

    @Test
    public void test1() throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {

        driver.get("https://www.ellos.se");
        MainPage mainPage = new MainPage(driver);

        mainPage.clickLogo();
        mainPage.switchToLoginPage();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillEmailField();

        loginPage.fillPasswordField();
        loginPage.clickloginButton();

        System.out.println("FirstTest.test1");

    }



    //http://www.sazehgostar.com/SitePages/HomePage.aspx

    // ?????????????? ???????
/*        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "eager");
        WebDriver driver = new FirefoxDriver(capabilities);
        WebDriverWait wait = new WebDriverWait(driver, 10);*/

/*    Log4Test.info("SUCCESS");
    Log4Test.end(getClass().getName());*/
}
