package ua.artcode.week3.day1.Tests;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ua.artcode.week3.day1.Pages.Ellos;
import ua.artcode.week3.day1.logger.Log4Test;
import ua.artcode.week3.day1.utils.WebDriverFactory;
import ua.artcode.week3.day1.utils.WebDriverWrapper;

import java.util.concurrent.TimeUnit;

/**
 * Created by ViTaLES on 11.10.2015.
 */
public class Fixture {

    public static WebDriverWrapper driverWrapper;
    public static Ellos ellos;

    @BeforeClass
    public static void setUpClass() throws Exception {
        driverWrapper = new WebDriverWrapper(WebDriverFactory.initDriver());
        driverWrapper.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        try {
            ellos = new Ellos(driverWrapper);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Log4Test.info("Start Test Suite execution");
    }

    @AfterClass
    public static void tearDown() {
        driverWrapper.quit();

        Log4Test.info("Finish Test Suite execution");
    }


}
