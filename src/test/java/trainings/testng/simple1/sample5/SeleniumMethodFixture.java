package trainings.testng.simple1.sample5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class SeleniumMethodFixture {

  protected WebDriver driver;

  @BeforeMethod
  public void setUp() {
    System.out.println("Starting a browser");
    driver = new FirefoxDriver();
  }

  @AfterMethod
  public void tearDown() {
    System.out.println("Stopping the browser");
    if (driver != null) {
      driver.quit();
    }
  }

}
