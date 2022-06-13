package StepDefinitions;

import Pages.P05_Currencies;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SD05_Currencies {

    P05_Currencies curr = new P05_Currencies();

    @Given("user selects \"(.*)\" from drop down menu$")
    public void selectCurrency(String currency) {
        curr.selectCurrency().selectByVisibleText(currency);
    }

    @Then("currency is selected and displayed on the 4 products in Home page")
    public void displayCurrency() {
        List<WebElement> webElements = curr.displayCurrency();
        System.out.println("Number of Products on homepage: " + webElements.size());
        for (WebElement webElement : webElements) {
            Assert.assertTrue(webElement.getText().contains("€"));
        }
    }

}
