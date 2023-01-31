package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class TechGlobalStaticTablesPages extends TechGlobalBasePage{

    public TechGlobalStaticTablesPages(){
        super();
    }

    @FindBy(css = ".header")
    public List<WebElement> tableHeaderElement;


    @FindBy(xpath = "(//tbody/tr)[1]/td")
    public List<WebElement> firstRow;

    @FindBy(css = "tbody td:nth-child(1)")
    public List<WebElement> tableColumn;

    public List<List<WebElement>> getTableData(){

        List<List<WebElement>> tableData = new ArrayList<>();

        for (int i = 1; i <= tableColumn.size(); i++) {
            tableData.add(Driver.getDriver().findElements(By.cssSelector("tbody>tr:nth-child(" + i + ")>td")));
        }
        return tableData;
    }


}
