package StepDefinitions;

import Pages.P04_Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class SD04_Search {
    P04_Search search = new P04_Search();
    JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
    SoftAssert softAssert = new SoftAssert();

    @Given("user enters product name as \"(.*)\"$")
    public void searchByProductName(String productName) {
        search.search().sendKeys(productName);
    }

    @Given("user enters product serial number as \"(.*)\"$")
    public void searchBySerialNumber(String serialNumber) {
        search.search().sendKeys(serialNumber);
    }

    @When("user clicks on search button")
    public void clickSearch() {
        search.clickSearchBtn().click();
    }

    @Then("user is shown search results")
    public void navToSearchResult() throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> webElements = search.navigateToSearchResults();
        int numberOfFoundItems = search.navigateToSearchResults().size();
        System.out.println("Number Of Items Found: " + numberOfFoundItems);

        // To Scroll to element until it's viewed in page
        js.executeScript("arguments[0].scrollIntoView();", webElements.get(0));

        Thread.sleep(2000);

        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("search"));
        softAssert.assertTrue(numberOfFoundItems > 0, "Items have been found");
        softAssert.assertAll();


    }
}
