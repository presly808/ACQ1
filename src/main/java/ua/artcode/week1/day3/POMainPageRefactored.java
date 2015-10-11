package ua.artcode.week1.day3;

import org.openqa.selenium.WebDriver;
import ua.artcode.util.WebElementActionsWithConfigData;

public class POMainPageRefactored {

    private WebDriver driver;
    private WebElementActionsWithConfigData web;

    public POMainPageRefactored(WebDriver driver) {
        this.driver = driver;
        web = new WebElementActionsWithConfigData(driver);
    }

    public void clickLogo(){
        web.clickLink("Logo");
    }

    public void switchToLoginPageLink(){
        web.clickLink("LoginRegisterLink");
    }
}
