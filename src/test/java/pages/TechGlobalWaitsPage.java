package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import scripts.TechGlobalBase;
import utilities.Driver;

public class TechGlobalWaitsPage extends TechGlobalBase {

    public TechGlobalWaitsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "#red")
    public WebElement redBoxButton;

    @FindBy(css = "button[class*='red_box']")
    public WebElement redBox;

    @FindBy(css = "#blue")
    public WebElement blueBoxButton;

    @FindBy(css = "button[class*='blue_box']")
    public WebElement blueBox;





}
