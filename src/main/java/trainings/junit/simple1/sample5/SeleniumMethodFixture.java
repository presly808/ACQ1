package trainings.junit.simple1.sample5;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMethodFixture {

    protected WebDriver driver;

    @Before
    public void setUp() {
        System.out.println("Starting a browser");
        driver = new FirefoxDriver();
    }

    @After
    public void tearDown() {
        System.out.println("Stopping the browser");
        if (driver != null) {
            driver.quit();
        }
    }

}
