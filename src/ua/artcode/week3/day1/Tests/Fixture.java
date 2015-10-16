package ua.artcode.week3.day1.Tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by ViTaLES on 11.10.2015.
 */
public class Fixture {

    public static WebDriver driver;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Start suite");
        driver = new FirefoxDriver();
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Finish suite");
        //driver.quit();

    }


}
