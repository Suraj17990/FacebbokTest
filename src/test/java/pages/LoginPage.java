package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.GuiController;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by Suraj-PC on 26-08-2017.
 */
public class LoginPage extends GuiController {
    Properties properties = new Properties();
    FileInputStream inputStream;

    public void login() {
        try {
            System.out.println("Inside login method");
            //navigate to facebook page
            driver.get("https://www.facebook.com/");
            //locate email field
            WebElement emailField = driver.findElement(By.cssSelector("#email"));
            //load username from properties file
            inputStream = new FileInputStream("C:\\Users\\Suraj-PC\\IdeaProjects\\Practice\\src\\main\\resources\\properties\\credentials.properties");
            properties.load(inputStream);
            String userName = properties.getProperty("userName");
            if (waitOnElement(emailField)) {
                emailField.sendKeys(userName);
            }
            //locate password field
            WebElement passwordField = driver.findElement(By.cssSelector("#pass"));
            //load password from properties file
            String password = properties.getProperty("password");
            if (waitOnElement(passwordField)) {
                passwordField.sendKeys("Akshay123");
            }
            //locate Log In button
            WebElement logInButton = driver.findElement(By.cssSelector("#loginbutton"));
            if (waitOnElement(logInButton)) {
                logInButton.click();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
