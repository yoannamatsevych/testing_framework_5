package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalCheckBoxPage;
import pages.TechGlobalFrontendTestingHomePage;
import utilities.Waiter;

public class TechGlobalCheckBoxPageTest extends TechGlobalBase{

    @BeforeMethod
    public void setUp(){
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalCheckBoxPage = new TechGlobalCheckBoxPage();
    }

    /**
    Go to https://techglobal-training.netlify.app/
    Click on "Practices" dropdown in the header
    Select the "Frontend Testing" option
    Click on the "Checkboxes" card
    Validate "Apple" and "Microsoft" checkboxes are displayed, enabled and not selected
    Select both and validate they are both selected
    Deselect bpth and validate they are deselected
     */
    @Test (priority = 1, description = "validate checkbox")
    public void validatingCheckBox(){
        techGlobalFrontendTestingHomePage.getFrontendTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard(6);


        for (int i = 0; i < 2; i++) {
            Assert.assertTrue(techGlobalCheckBoxPage.checkBoxLabel.get(i).isDisplayed());
            Assert.assertTrue(techGlobalCheckBoxPage.checkBoxLabel.get(i).isEnabled());
            Assert.assertFalse(techGlobalCheckBoxPage.checkBoxInput.get(i).isSelected());
        }

        for (int i = 0; i < 2; i++) {
            techGlobalCheckBoxPage.checkBoxLabel.get(i).click();
            Waiter.pause(1);
            Assert.assertTrue(techGlobalCheckBoxPage.checkBoxInput.get(i).isSelected());
        }

        for (int i = 0; i < 2; i++) {
            techGlobalCheckBoxPage.checkBoxLabel.get(i).click();
            Assert.assertFalse(techGlobalCheckBoxPage.checkBoxInput.get(i).isSelected());
        }



    }

    /**
     * Go to https://techglobal-training.netlify.app/
     * Click on "Practices" dropdown in the header
     * Select the "Frontend Testing" option
     * Click on the "Checkboxes" card
     * Validate "Tesla" and "SpaceX" checkboxes are displayed, enabled and not selected
     * Select both and validate they are both selected
     * Deselect bpth and validate they are deselected (edited)
     */
    @Test(priority = 2, description = "validate more practice check boxes")
    public void morePracticeCheckBoxes(){
            techGlobalFrontendTestingHomePage.getFrontendTestingPage();
            techGlobalFrontendTestingHomePage.clickOnCard(6);

        for (int i = 0; i < 2; i++) {
            Assert.assertTrue(techGlobalCheckBoxPage.checkBoxMorePracticeLabel.get(i).isDisplayed());
            Assert.assertTrue(techGlobalCheckBoxPage.checkBoxMorePracticeLabel.get(i).isEnabled());
            Assert.assertFalse(techGlobalCheckBoxPage.checkBoxMorePracticeInput.get(i).isSelected());
        }

        for (int i = 0; i < 2; i++) {
            techGlobalCheckBoxPage.checkBoxMorePracticeLabel.get(i).click();
            Assert.assertTrue(techGlobalCheckBoxPage.checkBoxMorePracticeInput.get(i).isSelected());
        }

        for (int i = 0; i < 2; i++) {
            techGlobalCheckBoxPage.checkBoxMorePracticeLabel.get(i).click();
            Assert.assertFalse(techGlobalCheckBoxPage.checkBoxMorePracticeInput.get(i).isSelected());
        }

    }


}
