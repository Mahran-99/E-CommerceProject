package StepDefinitions;

import Pages.P06_Categories;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD06_Categories {

    P06_Categories categories = new P06_Categories(Hooks.driver);

    @Given("user hovers on Computers category")
    public void hoverOnCategory() throws InterruptedException {
        categories.hoverOnCategory();
    }

    @When("user selects a sub-category Desktops")
    public void selectSubCategory(){
        categories.selectSubCategory();
    }

    @Then("user navigates to Desktops sub-category page")
    public void goToSubCategoryPage(){
        categories.goToSubCategoryPage();
    }

}
