package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitis.Driver;

import java.util.List;

public class TechGlobalFrontendTestingHomePage extends TechGlobalBasePage {

    public TechGlobalFrontendTestingHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //locate all the unique elements for this page
    @FindBy(css = "div[id^='card']")
    public List<WebElement> cards;




}
