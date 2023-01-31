package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TechGlobalFileUploadPage extends TechGlobalBasePage{

    public TechGlobalFileUploadPage(){
       super();
    }

    @FindBy(id = "file_upload")
    public WebElement fileUploadInput;

    @FindBy(id = "file_submit")
    public WebElement submitButton;

    @FindBy(id = "result")
    public WebElement result;


}
