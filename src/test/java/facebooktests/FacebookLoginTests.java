package facebooktests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BaseTest;

/**
 * Created by Suraj-PC on 26-08-2017.
 */
public class FacebookLoginTests extends BaseTest {
    @Test
    public void facebookLogin(){
        System.out.println("inside login");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }
}
