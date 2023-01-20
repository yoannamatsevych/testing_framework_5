package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitis.Driver;

import java.util.List;

public class TechGlobalRadioButtonPage extends TechGlobalBasePage{

    public TechGlobalRadioButtonPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (css = "#radio-button-group_1 label")
    public List<WebElement> listOfRadioButtonLabel;

    @FindBy (css = "#radio-button-group_1 input")
    public List<WebElement> listOfRadioButton;

    @FindBy (css = "#radio-button-group_2 input")
    public  List<WebElement> listOfMorePracticeRadioButton;

    @FindBy (css = "#radio-button-group_2 label")
    public  List<WebElement> listOfMorePracticeRadioButtonLabel;


}
