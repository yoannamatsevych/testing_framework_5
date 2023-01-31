package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontendTestingHomePage;
import pages.TechGlobalIFramesPage;

import java.util.stream.IntStream;

public class TechGlobalIFramesTest extends TechGlobalBase{

    @BeforeMethod
    public void setPage(){
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalIFramesPage = new TechGlobalIFramesPage();

        techGlobalFrontendTestingHomePage.getFrontendTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard("IFrames");
    }

    /*
    TEST 1
    Go to https://techglobal-training.netlify.app/
    Click on “Practices” dropdown in the header
    Select the “Frontend Testing” option
    Click on the “IFrames” card
    Validate the “Please fill out your information below” text
     */
    @Test(priority = 1, description = "validate input header text")
    public void validateInputText(){

        driver.switchTo().frame(techGlobalIFramesPage.iFrameId);

        Assert.assertTrue(techGlobalIFramesPage.inputHeader.isDisplayed());
        Assert.assertEquals(techGlobalIFramesPage.inputHeader.getText(), "Please fill out your information below");

    }

    /*
    TEST 2
    Go to https://techglobal-training.netlify.app/
    Click on “Practices” dropdown in the header
    Select the “Frontend Testing” option
    Click on the “IFrames” card
    Enter “John” to first name input box
    Enter “Doe” to last name input box
    Click on “SUBMIT” button
    Validate the result equals “You entered: John Doe”
     */


    @Test(priority = 2, description = "validate iFrame form")
    public void validatingIFrameForm(){

        driver.switchTo().frame(techGlobalIFramesPage.iFrameId);

        //Another way of looping
      //  IntStream.range(0, credentials.length).forEach(index -> techGlobalIFramesPage.inputFields.get(index).sendKeys(credentials[index]));

        techGlobalIFramesPage.firstNameInput.sendKeys("John");
        techGlobalIFramesPage.lastNameInput.sendKeys("Doe");
        techGlobalIFramesPage.submitButton.click();

        driver.switchTo().parentFrame();// defaultContent();
        Assert.assertEquals(techGlobalIFramesPage.result.getText(), "You entered: John Doe");
    }



}
