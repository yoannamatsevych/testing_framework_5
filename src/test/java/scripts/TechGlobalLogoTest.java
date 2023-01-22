package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class TechGlobalLogoTest extends TechGlobalBase {

    //extended to the TechGlobalBase so we van use its before and after method

    @Test
    public void validateTechGlobalLogo() {
        Waiter.waitForVisibilityOfElement(techGlobalBasePage.logo, 30);
        Assert.assertTrue(techGlobalBasePage.logo.isDisplayed());
        // TechGlobalBasePage class from the pages package from which we are using static instance variable - logo
    }

}
