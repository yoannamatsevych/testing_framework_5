package scripts;

import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import pages.TechGlobalFrontendTestingHomePage;
import pages.TechGlobalMultipleWindowsPage;
import utilities.Waiter;
import utilities.WindowHandler;

public class TechGlobalMultipleWindowsTest extends TechGlobalBase{

    @BeforeMethod
    public void setPage(){
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalMultipleWindowsPage = new TechGlobalMultipleWindowsPage();

        techGlobalFrontendTestingHomePage.getFrontendTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard("Multiple Windows");
    }


    @Test(priority = 1, description = "Validate the apple link")
    public void validateTheAppleLink(){

        techGlobalMultipleWindowsPage.links.get(0).click();
        WindowHandler.switchToChildWindow();

       Assert.assertEquals(driver.getTitle(), "Apple");
        driver.close();

        //Go back to tech global page and validate URL contains TechGlobal
       WindowHandler.switchBackToParentWindow();
        Waiter.pause(2);
        Assert.assertTrue(driver.getCurrentUrl().contains("techglobal"));

    }

    @Test(priority = 2, description = "validate Link urls")
    public void validateLinkURLs(){

        String[] urls = {"https://www.apple.com/", "https://www.microsoft.com/en-us/", "https://www.tesla.com/"};
        for (int i = 0; i < techGlobalMultipleWindowsPage.links.size(); i++) {
            techGlobalMultipleWindowsPage.links.get(i).click();

            WindowHandler.switchToChildWindow();
            Assert.assertEquals(driver.getCurrentUrl(), urls[i]);
            driver.close();

            WindowHandler.switchBackToParentWindow();
        }
    }
}
