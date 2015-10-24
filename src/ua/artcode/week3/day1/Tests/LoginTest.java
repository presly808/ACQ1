package ua.artcode.week3.day1.Tests;



import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by lavi on 10/16/2015.
 */
public class LoginTest extends Fixture {

    @Test
    public void test1() throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {

        ellos.mainPage.openPage();

        ellos.mainPage.clickLogo();
        ellos.mainPage.switchToLoginPage();

        ellos.loginPage.fillEmailField();

        ellos.loginPage.fillPasswordField();
        ellos.loginPage.clickloginButton();// cant find element

    }


}
