package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Project Name    : selenium-cucumber-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 10/16/2021
 * Time            : 6:41 PM
 * Description     :
 **/

public class HomePage extends BasePage {

    private final By usernameLabel = By.xpath("//div[@class='header_user_info']//span");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getLoggedInUsername() {
        return getElement(usernameLabel).getText();
    }
}
