package ua.artcode.week2.day2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ua.artcode.week1.day2.WebElementsActions;
import ua.artcode.week2.day1.MainPage;

/**
 * Created by ViTaLES on 11.10.2015.
 */
public class TestBase {

    public static WebDriver driver;

    @BeforeClass
    public static void login() {
        System.out.println("Start test");
        driver = new FirefoxDriver();

    }

    @AfterClass
    public static void logout() {
        System.out.println("Finish test");

        driver.quit();
    }
}
