package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class  TechGlobalHeaderTest extends TechGlobalBase {

    @Test(priority = 1)
    public void validateTechGlobalHeaderDropdown() {
        Assert.assertTrue(techGlobalBasePage.headerDropdown.isDisplayed());
        Assert.assertEquals(techGlobalBasePage.headerDropdown.getText(), "Practices");
    }

    @Test(priority = 2)
    public void validateTechGlobalHeaderDropdownOptions(){
        techGlobalBasePage.headerDropdown.click();
        // we are using headerDropdown instance variable which we were defining in the techGlobalBasePage

        String[] optionTexts = {"Frontend Testing", "Backend Testing", "Java Exercises"};

        for (int i = 0; i < techGlobalBasePage.headerDropdownOptions.size(); i++) {
            // headerDropdownOptions list which we defined in the TechGlobalBasePage.. and we are going through it
            Assert.assertTrue(techGlobalBasePage.headerDropdownOptions.get(i).isDisplayed());
            Assert.assertTrue(techGlobalBasePage.headerDropdownOptions.get(i).isEnabled());
            Assert.assertEquals(techGlobalBasePage.headerDropdownOptions.get(i).getText(), optionTexts[i]);
            //getting element from this list and validating it
        }
    }
}