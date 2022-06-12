package StepDefinitions;

import Pages.P04_Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD04_Search {
    P04_Search search = new P04_Search(Hooks.driver);

    @Given("user enters product name \"(.*)\"$")
    public void searchByProductName(String productName) {
        search.search(productName);
    }

    @Given("user enters product serial number \"(.*)\"$")
    public void searchBySerialNumber(String serialNumber) {
        search.search(serialNumber);
    }

    @When("user clicks on search button")
    public void clickSearch() {
        search.clickSearchBtn();
    }

    @Then("user is shown search results")
    public void navToSearchResult() throws InterruptedException {
        search.navigateToSearchResults();
    }
}
