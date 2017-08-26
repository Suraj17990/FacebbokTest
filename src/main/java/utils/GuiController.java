package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Suraj-PC on 21-06-2017.
 */
public class GuiController {
    public static WebDriver driver;

    public WebDriver initializeBowser(String browserName) {
        switch (browserName) {
            case "Firefox":
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\Suraj-PC\\IdeaProjects\\Practice\\src\\main\\resources\\drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
        }
        return driver;
    }

    public boolean waitOnElement(WebElement element){
        for(int i=0; i<30; i++){
            if(element.isDisplayed())
                return true;
        }
        return false;
    }
}
