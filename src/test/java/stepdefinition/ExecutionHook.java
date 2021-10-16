package stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import util.driver.DriverFactory;

import static common.Constants.*;
import static java.util.concurrent.TimeUnit.SECONDS;
import static util.driver.DriverHolder.getDriver;
import static util.driver.DriverHolder.setDriver;

/**
 * Project Name    : selenium-cucumber-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 10/16/2021
 * Time            : 8:18 PM
 * Description     :
 **/

public class ExecutionHook {

    @Before
    public void setup() {
        setDriver(DriverFactory.getNewDriverInstance(CHROME));
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIME_IN_SECONDS, SECONDS);
        getDriver().navigate().to(APP_URL);
    }

    @After
    public void tearDown() {
        getDriver().quit();
    }
}
