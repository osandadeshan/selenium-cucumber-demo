package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.HomePage;
import page.LoginPage;

import static org.junit.Assert.assertEquals;
import static util.driver.DriverHolder.getDriver;

/**
 * Project Name    : selenium-cucumber-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 10/16/2021
 * Time            : 6:46 PM
 * Description     :
 **/

public class LoginStepDefinition {

    private LoginPage loginPage;

    @Given("^Navigate to the application$")
    public void setup() {
        loginPage = new LoginPage(getDriver());
    }

    @When("^Login using the Username \"(.*)\" and Password \"(.*)\"$")
    public void login(String email, String password) {
        loginPage.login(email, password);
    }

    @Then("^Logged in username is \"(.*)\"$")
    public void checkLoggedInUsername(String expectedUsername) {
        assertEquals(expectedUsername, new HomePage(getDriver()).getLoggedInUsername());
    }

    @Then("^Page title is \"(.*)\"$")
    public void checkPageTitle(String pageTitle) {
        assertEquals(pageTitle, getDriver().getTitle());
    }
}
