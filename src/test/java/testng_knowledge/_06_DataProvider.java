package testng_knowledge;

public class _06_DataProvider {

//    @Test(dataProvider = "searchData")
//    public void validateSearchResult(String data) {
//        WebDriver driver = Driver.getDriver();
//        driver.get("https://www.google.com/");
//
//        driver.findElement(By.name("q")).sendKeys(data + Keys.ENTER);
//
//        //Assertion
//
//        WebElement resultStatistics = driver.findElement(By.id("result-stats"));
//        String result = resultStatistics.getText();
//        System.out.println(result);
//        Assert.assertTrue(Long.parseLong(result.substring(result.indexOf(" ") + 1, result.indexOf("result") - 1).
//                replace(",", "")) > 0);
//
//        Driver.quitDriver();
//    }
//
//    @Test(dataProvider =  "credentials")
//    public void validateInvalidUsernameMessage(String username, String password, String message){
//        System.out.println("\n-----------------\n");
//        System.out.println("Username = " + username);
//        System.out.println("Password = " + password);
//        System.out.println("Message = " + message);
//    }
//
//    @DataProvider
//    public Object[] searchData() {
//        return new Object[]{"Phone", "Spoon", "Airpods", "Mouse", "Pen"};
//    }
//
//    @DataProvider
//    public Object[][] credentials() {
//
//    return new Object[][]{
//            {"", "", "Invalid Username entered!"},
//            {"John", "Test1234", "Invalid Username entered!"},
//            {"John", "abcd", "Invalid Username entered!"},
//            {"TechGlobal", "abcd", "Invalid Password entered!"}
//    };
//
//}

}
