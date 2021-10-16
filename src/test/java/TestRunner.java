import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

/**
 * Project Name    : selenium-cucumber-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 10/16/2021
 * Time            : 6:46 PM
 * Description     :
 **/

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature",
        glue = "stepdefinition",
        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
        },
        monochrome = true
)

public class TestRunner {

    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("./src/test/resources/extentreport/report.xml"));
    }
}
