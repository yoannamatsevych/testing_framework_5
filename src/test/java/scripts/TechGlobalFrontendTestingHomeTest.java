package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.TechGlobalFrontendTestingHomePage;

public class TechGlobalFrontendTestingHomeTest  extends TechGlobalBase{

    /*
    TEST TASK
Go to https://techglobal-training.netlify.app/
Click on "Practices" dropdown
Click on "Frontend Testing" option
Validate below cards are dsiplayed and their text is as below
Locators
Xpath-CSS Locators
Dynamic Elements
Waits
Dropdowns
Radio Buttons
Checkboxes
Alerts
IFrames
Multiple Windows
Static Tables
Dynamic Tables
File Upload
File Download
Actions
Login Form
Forgot Password
Sortable Tables
Pagination
Calendar
     */


    @BeforeMethod
    public void setPage(){
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
    }
    // method which going to be executed after @Before Method on the Base page
    // but before every @Test method in this Page...
    // So we create the object in this method, to have the access to every instance variable, which we initialized in this class
    // and then use it in the test method

    @Test(priority = 1, description = "Validates frontend testing cards")
    public void validateFrontendTestingCards(){
        techGlobalFrontendTestingHomePage.getFrontendTestingPage(); // method for getting to the given page
        String[] cardTexts = {"Locators",
                "Xpath-CSS Locators",
                "Dynamic Elements",
                "Waits",
                "Dropdowns",
                "Radio Buttons",
                "Checkboxes",
                "Alerts",
                "IFrames",
                "Multiple Windows",
                "Static Tables",
                "Dynamic Tables",
                "File Upload",
                "File Download",
                "Actions",
                "Login Form",
                "Forgot Password",
                "Sortable Tables",
                "Pagination",
                "Calendar"};

        for (int i = 0; i < 20; i++) {
            Assert.assertTrue(techGlobalFrontendTestingHomePage.cards.get(i).isDisplayed());// method of this classls
            Assert.assertEquals(techGlobalFrontendTestingHomePage.cards.get(i).getText(), cardTexts[i]);
        }
    }

    @Test(priority = 2, description = "Validate URL")
    public void validateFrontendTestingURL(){
    /*
    Go to https://techglobal-training.netlify.app/
    Click on "Practices" dropdown
    Click on "Frontend Testing" option
    Validate the url contains "frontend"
     */
       techGlobalFrontendTestingHomePage.getFrontendTestingPage();
        Assert.assertTrue(driver.getCurrentUrl().contains("frontend"));

        techGlobalFrontendTestingHomePage.clickOnCard(7);

    }
}
