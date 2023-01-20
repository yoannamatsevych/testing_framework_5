package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontendTestingHomePage;
import pages.TechGlobalRadioButtonPage;

public class TechGlobalRadioButtonPageTest extends TechGlobalBase{

    @BeforeMethod
    public void setPage(){
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalRadioButtonPage = new TechGlobalRadioButtonPage();
    }


    /*
    Go to https://techglobal-training.netlify.app/
    Click on "Practices" dropdown in the header
    Select the "Frontend Testing" option
    Click on the "Radio Buttons" card
    Validate "Java", "JavaScript" and "C#" radio buttons are displayed, enabled and not selected
    Select "Java" and validate it is selected but the other 2 are deselected
    Select "JavaScript" validate it is selected but the other 2 are deselected
     */
    @Test(priority = 1, description = "Validating TechGlobal languages radio button")
    public void radioButtonsValidation(){
        techGlobalFrontendTestingHomePage.getFrontendTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard(5);


        for (int i = 0; i < 3; i++) {
            Assert.assertTrue(techGlobalRadioButtonPage.listOfRadioButtonLabel.get(i).isDisplayed());
            Assert.assertTrue(techGlobalRadioButtonPage.listOfRadioButtonLabel.get(i).isEnabled());
            Assert.assertFalse(techGlobalRadioButtonPage.listOfRadioButton.get(i).isSelected());
        }

        techGlobalRadioButtonPage.listOfRadioButtonLabel.get(0).click();
        for (int i = 0; i < 3; i++) {
           if(i == 0) Assert.assertTrue(techGlobalRadioButtonPage.listOfRadioButton.get(i).isSelected());
           else Assert.assertFalse(techGlobalRadioButtonPage.listOfRadioButton.get(i).isSelected());
        }

        techGlobalRadioButtonPage.listOfRadioButton.get(1).click();

        for (int i = 0; i < 3; i++) {
            if(i == 1) Assert.assertTrue(techGlobalRadioButtonPage.listOfRadioButton.get(i).isSelected());
            else Assert.assertFalse(techGlobalRadioButtonPage.listOfRadioButton.get(i).isSelected());
        }


    }


    /*
    Go to https://techglobal-training.netlify.app/
    Click on "Practices" dropdown in the header
    Select the "Frontend Testing" option
    Click on the "Radio Buttons" card
    Validate "Selenium", "Cypress" and "Playwright" radio buttons are displayed, enabled and not selected
    Select "Cypress" and validate it is selected but the other 2 are deselected
    Select "Playwright" validate it is selected but the other 2 are deselected
     */

    @Test(priority = 2, description = "Validation more practice radio button")
    public void validationOfMorePracticeRadioButton(){
        techGlobalFrontendTestingHomePage.getFrontendTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard(5);

        for (int i = 0; i < 3; i++) {
            Assert.assertTrue(techGlobalRadioButtonPage.listOfMorePracticeRadioButtonLabel.get(i).isDisplayed());
            Assert.assertTrue(techGlobalRadioButtonPage.listOfMorePracticeRadioButtonLabel.get(i).isEnabled());
            Assert.assertFalse(techGlobalRadioButtonPage.listOfMorePracticeRadioButton.get(i).isSelected());
        }

        techGlobalRadioButtonPage.listOfMorePracticeRadioButtonLabel.get(1).click();

        for (int i = 0; i < 3; i++) {
            if(i == 1) Assert.assertTrue(techGlobalRadioButtonPage.listOfMorePracticeRadioButton.get(i).isSelected());
            else Assert.assertFalse(techGlobalRadioButtonPage.listOfMorePracticeRadioButton.get(i).isSelected());
        }

        techGlobalRadioButtonPage.listOfMorePracticeRadioButtonLabel.get(2).click();

        for (int i = 0; i < 3; i++) {
            if(i == 2) Assert.assertTrue(techGlobalRadioButtonPage.listOfMorePracticeRadioButton.get(i).isSelected());
            else Assert.assertFalse(techGlobalRadioButtonPage.listOfMorePracticeRadioButton.get(i).isSelected());
        }


    }

}
