package ua.artcode.week3.day1.Tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ua.artcode.week3.day1.Pages.Ellos;
import ua.artcode.week3.day1.logger.Log4Test;
import ua.artcode.week3.day1.utils.PropertyLoader;
import ua.artcode.week3.day1.utils.WebDriverFactory;
import ua.artcode.week3.day1.utils.WebDriverWrapper;

/**
 * Created by ViTaLES on 11.10.2015.
 */
public class Fixture {

    public static WebDriverWrapper driverWrapper;
    static Ellos ellos;

    @BeforeClass
    public static void setUpClass() {
        driverWrapper = new WebDriverWrapper(WebDriverFactory.initDriver());
        ellos = new Ellos(driverWrapper);

        Log4Test.info("Start Test Suite execution");
    }

    @AfterClass
    public static void tearDown() {
        driverWrapper.quit();

        Log4Test.info("Finish Test Suite execution");
    }


}
