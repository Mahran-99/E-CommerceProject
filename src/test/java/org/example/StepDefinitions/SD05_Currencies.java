package org.example.StepDefinitions;

import org.example.Pages.P05_Currencies;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SD05_Currencies {

    P05_Currencies curr = new P05_Currencies();
    JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;

    @Given("user selects \"(.*)\" from drop down menu$")
    public void selectCurrency(String currency) {
        curr.selectCurrency().selectByVisibleText(currency);
    }

    @Then("currency is selected and displayed on the 4 products in Home page")
    public void displayCurrency() throws InterruptedException {
        List<WebElement> webElements = curr.displayCurrency();
        System.out.println("Number of Products on homepage: " + webElements.size());
        js.executeScript("arguments[0].scrollIntoView();", webElements.get(0));
        Thread.sleep(2000);
        for (WebElement webElement : webElements) {
            Assert.assertTrue(webElement.getText().contains("€"));
        }
    }

}
