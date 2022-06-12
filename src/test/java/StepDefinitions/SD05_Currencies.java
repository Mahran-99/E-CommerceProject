package StepDefinitions;

import Pages.P05_Currencies;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SD05_Currencies {

    P05_Currencies curr = new P05_Currencies(Hooks.driver);

    @Given("user selects \"(.*)\" from drop down menu$")
    public void selectCurrency(String currency){
        curr.selectCurrency(currency);
    }

    @Then("\"(.*)\" is selected and displayed on page$")
    public void displayCurrency(String currency){
        curr.displayCurrency(currency);
    }

}
