package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TechGlobalLogoTest extends TechGlobalBase {

    //extended to the TechGlobalBase so we van use its before and after method

    @Test
    public void validateTechGlobalLogo() {
        Assert.assertTrue(techGlobalBasePage.logo.isDisplayed());
        // TechGlobalBasePage class from the pages package from which we are using static instance variable - logo
    }

}
