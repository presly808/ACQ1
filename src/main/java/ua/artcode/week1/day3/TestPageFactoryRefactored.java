package ua.artcode.week1.day3;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestPageFactoryRefactored {

    private static WebDriver driver;

    private POMainPageRefactored mainPage;

    @BeforeClass
    public static void setUp() {
        driver = new FirefoxDriver();
        driver.get("https://ellos.se");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void goToLoginPage() {
        System.out.println("Test start");
        mainPage = new POMainPageRefactored(driver);
        mainPage.clickLogo();
        mainPage.switchToLoginPageLink();
        System.out.println("Test end");
    }

}
