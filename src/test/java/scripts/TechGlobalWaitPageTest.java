package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontendTestingHomePage;
import pages.TechGlobalWaitsPage;
import utilities.Waiter;

public class TechGlobalWaitPageTest extends TechGlobalBase{

    @BeforeMethod
    public void setPage(){
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalWaitsPage = new TechGlobalWaitsPage();
    }

    @Test(priority = 1, description = "Validate red box is visible")
    public void validateRedBox(){
        /*
        Go to https://techglobal-training.netlify.app/
        Click on "Practices" dropdown in the header
        Select the "Frontend Testing" option
        Click on the "Waits" card
        Click on "Click on me to see a red box" button
        Validate a red box is displayed
         */
        techGlobalFrontendTestingHomePage.getFrontendTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard(3);
        techGlobalWaitsPage.redBoxButton.click();
        techGlobalWaitsPage.blueBoxButton.click();
//        Assert.assertTrue(techGlobalWaitsPage.redBoxButton.isDisplayed());
//        Assert.assertTrue(techGlobalWaitsPage.redBox.isDisplayed());

        Assert.assertTrue(techGlobalWaitsPage.blueBoxButton.isDisplayed());

        Waiter.waitForVisibilityOfElement(techGlobalWaitsPage.blueBox, 60);
        Assert.assertTrue(techGlobalWaitsPage.blueBox.isDisplayed());




    }


}
