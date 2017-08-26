package utils;

import org.testng.annotations.*;

/**
 * Created by Suraj-PC on 26-08-2017.
 */
public class BaseTest extends GuiController {
    @Parameters("browserName")
    @BeforeClass
    public void launchBrowser(String browserName){
        driver = initializeBowser(browserName);
    }
    @AfterClass
    public void closeBrowser(){
        driver.close();
    }
}
