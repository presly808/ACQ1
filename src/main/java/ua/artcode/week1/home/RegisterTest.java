package ua.artcode.week1.home;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ua.artcode.util.WebElementsActions;
import ua.artcode.util.WebElementsActionsI;

public class RegisterTest {

    private WebElementsActionsI web;
    private String rootUrl;
    private WebDriver driver;

    @Before
    public void setUp(){
        rootUrl = "http://ellos.se";
        driver = new FirefoxDriver();
        web = new WebElementsActions(driver);
    }

    @Test
    public void testSimpleRegister(){
        web.openSite(rootUrl);

        web.clickLink(".//a[@id='showlogin']");
        web.input(".//input[@id='ctl00_ctl00_conMain_conMain_LoginControl_LoginUsername']", "serhii");
        web.clickLink(".//input[@id='ctl00_ctl00_conMain_conMain_LoginControl_LoginUsername']");
        driver.findElement(By.cssSelector("#LoginPasswordText")).sendKeys("admin");// TODO: do active element before input data
        //web.input(".//input[@id='ctl00_ctl00_conMain_conMain_LoginControl_LoginPassword']","1234");
        web.clickButton(".//a[@id='ctl00_ctl00_conMain_conMain_LoginControl_LoginButton']");
    }


}
