package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TechGlobalFrontendTestingHomePage extends TechGlobalBasePage {


    // This is the constructor of this page
    public TechGlobalFrontendTestingHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //locate all the unique elements for this page
    @FindBy(css = "div[id^='card']")
    public List<WebElement> cards;


    //method for going to the Frontend Testing Page
    public void getFrontendTestingPage(){
        headerDropdown.click();
        headerDropdownOptions.get(0).click();
    }

    // method clicking to the card by text
    public void clickOnCard(String cardText){
        for (WebElement card : cards) {
            if(card.getText().equals(cardText)){
                card.click();
                break;
            }
        }
    }

    //clicking to the card by index
    public void clickOnCard(int index){
       cards.get(index).click();
    }



}
