package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;
import utilitis.Driver;

public class TechGlobalBase {

    // initializing the instance variable which we going to use in this class
    WebDriver driver;
    TechGlobalBasePage techGlobalBasePage;

    TechGlobalFrontendTestingHomePage techGlobalFrontendTestingHomePage;

    TechGlobalDynamicElementsPage techGlobalDynamicElementsPage;

    TechGlobalWaitsPage techGlobalWaitsPage;

    TechGlobalRadioButtonPage techGlobalRadioButtonPage;

    TechGlobalCheckBoxPage techGlobalCheckBoxPage;


    // before and after methods which will be executed each time when @Test annotation will use in all child classes
    // Then we do not need to write before end after method in each testing class
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
