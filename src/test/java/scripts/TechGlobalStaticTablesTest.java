package scripts;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontendTestingHomePage;
import pages.TechGlobalStaticTablesPages;
import utilities.TableData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TechGlobalStaticTablesTest extends TechGlobalBase{

    @BeforeMethod
    public void setPage(){
        techGlobalFrontendTestingHomePage = new TechGlobalFrontendTestingHomePage();
        techGlobalStaticTablesPages = new TechGlobalStaticTablesPages();

        techGlobalFrontendTestingHomePage.getFrontendTestingPage();
        techGlobalFrontendTestingHomePage.clickOnCard("Static Tables");
    }

    /*
    TEST 1
    Verify the headers of the table
    Go to https://techglobal-training.netlify.app/
    Click on “Practices” dropdown in the header
    Select the “Frontend Testing” option
    Click on the “Static Tables” card
    Check that the headers of the table are “Rank”, “Company”, “Employees”, and “Country”
    Verify the rows of the table
     */
    @Test(priority = 1, description = "validate")
    public void validateStaticTabled(){

        String[] headers = {"Rank", "Company", "Employees", "Country"};

//        for (int i = 0; i < headers.length; i++) {
//            Assert.assertEquals(techGlobalStaticTablesPages.tableHeaderElement.get(i).getText(), headers[i]);
//        }

       IntStream.range(0, headers.length).forEach(i -> {
           Assert.assertEquals(techGlobalStaticTablesPages.tableHeaderElement.get(i).getText(), headers[i]);
           System.out.println(techGlobalStaticTablesPages.tableHeaderElement.get(i).getText());
       });

    }


    /*
    TEST 2
    Go to https://techglobal-training.netlify.app/
    Click on “Practices” dropdown in the header
    Select the “Frontend Testing” option
    Click on the “Static Tables” card
    Check that first row of the table has the values “1", “Amazon”, “1,523,000", and “USA”
    Verify the columns of the table
     */
    @Test(priority = 2, description = "validate first row of the table")
    public void validateRow(){

        String[] expectedFirstRow = {"1", "Amazon", "1,523,000", "USA"};
        List<WebElement> tableRow = TableData.getTableRow(driver, 1);

        IntStream.range(0, expectedFirstRow.length).
                forEach(i -> Assert.assertEquals(tableRow.get(i).getText(), expectedFirstRow[i]));

    }

    /*
    TEST 3
    Go to https://techglobal-training.netlify.app/
    Click on “Practices” dropdown in the header
    Select the “Frontend Testing” option
    Click on the “Static Tables” card
    Check that the “Country” column of the table has the values “USA”, “China”, “USA”, “USA”, “S. Korea”
    Verify the entire table
     */

    @Test(priority = 3, description = "validate country column")
    public void validateCountryColumn(){

        String[] countryColumn = {"USA", "China", "USA", "USA", "S. Korea"};
        List<WebElement> tableColumn = TableData.getTableColumn(driver,4);

        IntStream.range(0, countryColumn.length).forEach(i ->
                Assert.assertEquals(tableColumn.get(i).getText(), countryColumn[i]));

    }

    /**
 * TEST 4
 * Go to https://techglobal-training.netlify.app/
 * Click on "Practices" dropdown in the header
 * Select the "Frontend Testing" option
 * Click on the "Static Tables" card
 * Check that the entire table has the correct values for "Rank", "Company", "Employees", and "Country"
 */


    @Test(priority = 4, description = "validate all cells")
    public void validateAllCells(){

        List<List<WebElement>> tableData = techGlobalStaticTablesPages.getTableData();
        List<List<String>> table = new ArrayList<>();
        table.add(Arrays.asList("1", "Amazon", "1,523,000", "USA"));
        table.add(Arrays.asList("2", "Alibaba", "245,700", "China"));
        table.add(Arrays.asList("3", "Microsoft", "221,000", "USA"));
        table.add(Arrays.asList("4", "Apple", "154,000", "USA"));
        table.add(Arrays.asList("5", "Samsung", "116,915", "S. Korea"));


        for (int i = 0; i < tableData.size(); i++) {
            for (int j = 0; j < tableData.get(i).size(); j++) {
                Assert.assertEquals(tableData.get(i).get(j).getText(), table.get(i).get(j));
            }
        }
    }

}
