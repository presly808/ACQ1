package ua.artcode.week2.day2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by ViTaLES on 11.10.2015.
 */
public class LoginTest extends TestBase{


    @Test
    public void test1() {

        driver.get("http://ellos.se");
        driver.findElement(By.cssSelector(".ellos.active")).click();
        driver.findElement(By.cssSelector("#showlogin>span")).click();
        driver.findElement(By.cssSelector("#ctl00_ctl00_conMain_conMain_LoginControl_LoginUsername")).click();
        driver.findElement(By.cssSelector("#ctl00_ctl00_conMain_conMain_LoginControl_LoginUsername")).sendKeys("vitalbka.91@gmail.com");
        driver.findElement(By.cssSelector("#LoginPasswordText")).sendKeys("vfhufhbnf1895");
        driver.findElement(By.cssSelector("#ctl00_ctl00_conMain_conMain_LoginControl_LoginButton")).click();

        Assert.assertTrue("Incorrect work login form", driver.findElement(By.cssSelector(".ellos.active")).isDisplayed());

        System.out.println("FirstTest.test1");
    }

}
