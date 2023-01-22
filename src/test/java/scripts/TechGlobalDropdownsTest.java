package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalDropdownPage;
import pages.TechGlobalFrontendTestingHomePage;
import utilities.DropdownHandler;
import utilities.Waiter;

public class TechGlobalDropdownsTest  extends TechGlobalBase{

    @BeforeMethod
    public void setPage(){
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalDropdownPage = new TechGlobalDropdownPage();

        techGlobalFrontendTestingHomePage.getFrontendTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard(4);
    }


    /*
    Go to TechGlobal Training app
    Select Frontend Testing from Practices Dropdown
    Select Dropdowns card
    Select "Delivery" option from Delivery dropdown
     */
    @Test(priority = 1, description = "Select Delivery option")
    public void selectDeliveryOption(){

        DropdownHandler.clickOnDropdownOptions(techGlobalDropdownPage.deliveryDropdown,
                techGlobalDropdownPage.deliveryDropdownOptions, "Delivery");
        Waiter.pause(5);

    }

    @Test(priority = 2, description = " select iPhone 14 Pro option")
    public void selectProductOption(){
        DropdownHandler.selectByVisibleText(techGlobalDropdownPage.productDropdown, "iPhone 14 Pro Max");
       // select.selectByVisibleText("iPhone 14 Pro Max");
//        for (WebElement element : select.getOptions()) {
//            System.out.println(element.getText());
//        }
    }

    @Test(priority = 3, description = "select Yellow option")
    public void selectColorOption(){
        DropdownHandler.selectByIndex(techGlobalDropdownPage.colorDropdown, 1);
    }

   /* Go to TechGlobal Training app
    Select Frontend Testing from Practices Dropdown
    Select Dropdowns card
    Select "MacBook Pro 13" option from product dropdown
    Select "Silver" option from the color dropdown
    Select "Delivery" option from devivery dropdown
    Click on SUBMIT button
    Validate "Your Silver MacBook Pro 13 will be delivered to you." message

    */
    @Test(priority = 4, description = "validate selected item method")
    public void validateTheItemSelected(){
        DropdownHandler.selectByVisibleText(techGlobalDropdownPage.productDropdown, "MacBook Pro 13");
        DropdownHandler.selectByVisibleText(techGlobalDropdownPage.colorDropdown, "Silver");
        DropdownHandler.clickOnDropdownOptions(techGlobalDropdownPage.deliveryDropdown,
                techGlobalDropdownPage.deliveryDropdownOptions, "Delivery");
        techGlobalDropdownPage.submitButton.click();
        Waiter.pause(5);
      Assert.assertEquals(techGlobalDropdownPage.resultMessage.getText(), "Your Silver MacBook Pro 13 will be delivered to you.");
    }




}
