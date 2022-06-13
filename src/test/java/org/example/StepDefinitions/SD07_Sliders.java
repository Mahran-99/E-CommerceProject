package org.example.StepDefinitions;

import org.example.Pages.P07_Sliders;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SD07_Sliders {

    P07_Sliders sliders = new P07_Sliders();

    @Given("user clicks on first square to choose nokia slider")
    public void clickOnFirstSquare() throws InterruptedException {
        sliders.clickOnFirstSQ().click();
        Thread.sleep(1000);
    }

    @Given("user clicks on second square to choose iphone slider")
    public void clickOnSecondSquare() throws InterruptedException {
        sliders.clickOnSecondSQ().click();
        Thread.sleep(1000);
    }

    @When("user clicks on slider")
    public void clickOnSlider(){
        sliders.slider().click();
    }

    @Then("user is navigated to nokia mobile web page")
    public void navigateToNokia(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020","Nokia web page");
    }

    @Then("user is navigated to iphone web page")
    public void navigateToIphone(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-8","Iphone web page");
    }

}
