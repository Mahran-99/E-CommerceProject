package StepDefinitions;

import Pages.P06_Categories;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class SD06_Categories {

    P06_Categories categories = new P06_Categories();
    Actions actions = new Actions(Hooks.driver);
    String subCategoryName;

    @Given("user hovers on Computers category")
    public void hoverOnCategory() throws InterruptedException {
        actions.moveToElement(categories.hoverOnCategory()).perform();
        Thread.sleep(3000);
    }

    @When("user selects a sub-category Desktops")
    public void selectSubCategory(){
        subCategoryName = categories.selectSubCategory().getText();
        categories.selectSubCategory().click();
    }

    @Then("user navigates to Desktops sub-category page")
    public void goToSubCategoryPage(){
        System.out.println("Title: " + categories.goToSubCategoryPage().getText());
        System.out.println("subCategoryName : " + subCategoryName);
        Assert.assertEquals(categories.goToSubCategoryPage().getText(),subCategoryName,"Desktop title displayed");
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains(subCategoryName.toLowerCase().trim()),"URL contains desktops");
    }

}
