package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.TechGlobalBasePage;
import utilitis.Driver;

public class TechGlobalBase {

    WebDriver driver;

    TechGlobalBasePage techGlobalBasePage;

    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver();
        techGlobalBasePage = new TechGlobalBasePage();
        driver.get("https://techglobal-training.netlify.app/");

    }


    @AfterMethod
    public void teardown(){
     Driver.quitDriver();

    }


}
