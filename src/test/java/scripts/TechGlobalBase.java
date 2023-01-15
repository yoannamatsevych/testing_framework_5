package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.TechGlobalBasePage;
import pages.TechGlobalFrontendTestingHomePage;
import utilitis.Driver;

public class TechGlobalBase {
    WebDriver driver;
    TechGlobalBasePage techGlobalBasePage;

    TechGlobalFrontendTestingHomePage techGlobalFrontendTestingHomePage;

    @BeforeMethod
    public void setup() {
        driver = Driver.getDriver();
        driver.get("https://techglobal-training.netlify.app/");

        techGlobalBasePage = new TechGlobalBasePage();
    }

    @AfterMethod
    public void teardown() {
        //We will quit driver and do other proper clean ups
        Driver.quitDriver();
    }
}
