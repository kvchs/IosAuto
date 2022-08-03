package ios.pages;

import ios.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseTest {

    WebElement username;
    WebElement password;
    WebElement loginButton;

    public HomePage(){
        username = appiumDriver.findElement(By.xpath(""));
        password = appiumDriver.findElement(By.xpath(""));
        loginButton = appiumDriver.findElement(By.xpath(""));
    }

    public void login(){
        username.sendKeys();
        password.sendKeys();
        loginButton.click();
    }

}
