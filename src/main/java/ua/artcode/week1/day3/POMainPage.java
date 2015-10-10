package ua.artcode.week1.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by serhii on 10.10.15.
 */
public class POMainPage {

    private WebDriver driver;

    @FindBy(css = ".ellos.active")
    private WebElement logo;

    @FindBy(css = "#showlogin>span")
    private WebElement loginPageLink;

    public POMainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        //PageFactory.initElements(new AjaxElementLocatorFactory(driver,30),this);
    }

    public void clickLogo(){
        logo.click();
    }

    public void switchToLoginPageLink(){
        loginPageLink.click();
    }
}
