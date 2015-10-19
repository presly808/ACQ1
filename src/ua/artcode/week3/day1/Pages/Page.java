package ua.artcode.week3.day1.Pages;

import org.apache.log4j.Logger;
import org.testng.Assert;
import ua.artcode.week3.day1.utils.ClassNameUtil;
import ua.artcode.week3.day1.utils.WebDriverWrapper;
import ua.artcode.week3.day1.utils.WebElementsActions;

import static ua.artcode.week3.day1.utils.ConfigData.ui;

/**
 * Created by ViTaLES on 18.10.2015.
 */
public abstract class Page {

    private String PAGE;
    public WebElementsActions web;
    public WebDriverWrapper driverWrapper;

    static final Logger log = Logger.getLogger(ClassNameUtil.getCurrentClassName());

    public Page(WebDriverWrapper driver, String PAGE) {
        this.driverWrapper = driver;
        this.PAGE = PAGE;
        web = new WebElementsActions(driver);
    }

    public Page(WebDriverWrapper driver) {
        this.driverWrapper = driver;
    }

    public boolean openPage(){
        try{
            log.info("Start open page");
            driverWrapper.get(PAGE);
        } catch (Exception e) {
            log.error("Error in open page");
            return false;
        }
        log.info("Page open successful");
        return true;
    }

    public boolean isOpenPage(String checkLocator){
        try{
            log.info("Page: check is page open. " + checkLocator + " is present!");
            web.isElementPresent(checkLocator);
        } catch (Exception e) {
            log.error("Page: Error with check page.");
            Assert.fail("Incorrect swatch");
            return false;
        }
        log.info("Page is open");
        return true;
    }

    public String getTitle() {
        return driverWrapper.getTitle();
    }

}
