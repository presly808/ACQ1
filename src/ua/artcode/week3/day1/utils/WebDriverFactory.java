package ua.artcode.week3.day1.utils;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

/**
 * Created by ViTaLES on 18.10.2015.
 */
public class WebDriverFactory {

    static WebDriverWrapper driver;

    /*Browsers constants*/
    private static final String FIREFOX = "firefox";
    private static final String INTERNET_EXPLORER = "phantomjs";
    private static final String CHROME = "chrome";
    private static final String HTML_UNIT = "htmlunit";
    private static final String PHANTOMJS = "phantomjs";

    public static final String browserName = PropertyLoader.loadProperty("browser.name");
    public static final String browserVersion = PropertyLoader.loadProperty("browser.version");
    public static final String platform = PropertyLoader.loadProperty("browser.platform");

    public static final String grid = PropertyLoader.loadProperty("grid2.hub");

    public WebDriverFactory() {
    }

    public static WebDriverWrapper initDriver(){
        driver = null;

        if (FIREFOX.equals(browserName)) {
            driver = new WebDriverWrapper( new FirefoxDriver());
        } else if (PHANTOMJS.equals(browserName)) {
/*            File phantomjs = Phanbedder.unpack();
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, phantomjs.getAbsolutePath());
            driverWripper = new WebDriverWrapper( new PhantomJSDriver(caps));*/
        } else if (CHROME.equals(browserName)){
            ChromeOptions options = new ChromeOptions();
            driver = new WebDriverWrapper( new ChromeDriver(options));
        } //TODO add IE

        else{
            Assert.fail("Invalid driver name");
        }

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        return driver;
    }


}
