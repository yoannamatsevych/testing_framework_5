package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.PublicKey;
import java.util.List;

public class TechGlobalDynamicTablesPage extends TechGlobalBasePage {
    public TechGlobalDynamicTablesPage() {
        super();
    }

    @FindBy(id = "add_product_btn")
    public WebElement addProductButton;

    @FindBy(id = "modal_title")
    public WebElement modelCard;

    @FindBy(css =".input")
    public List<WebElement> productDetails;

    @FindBy(id = "submit")
    public WebElement submitButton;

    @FindBy(id = "total_amount")
    public WebElement totalAmount;

    @FindBy(css = "tbody td:nth-child(1)")
    public List<WebElement> tableRow;


}