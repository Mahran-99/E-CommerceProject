package org.example.StepDefinitions;

import org.example.Pages.P01_Register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import org.testng.asserts.SoftAssert;

import java.util.List;



public class SD01_Register {
    P01_Register reg = new P01_Register();
    SoftAssert softAssert = new SoftAssert();

    @Given("user navigates to registration page")
    public void goToRegistrationPage() {
        reg.clickOnRegister().click();
    }

    @When("user chooses male")
    public void gender() {
        reg.gender().click();
    }

    @And("user enters FirstName \"(.*)\"$")
    public void firstName(String firstName) {
        reg.firstName().clear();
        reg.firstName().sendKeys(firstName);
    }

    @And("user enters LastName \"(.*)\"$")
    public void lastName(String lastName) {
        reg.lastName().clear();
        reg.lastName().sendKeys(lastName);
    }

    @And("user enters DOB \"(.*)\" , \"(.*)\" , \"(.*)\"$")
    public void DOB(String day, String month, String year) {
        reg.selectDay().selectByVisibleText(day);
        reg.selectMonth().selectByVisibleText(month);
        reg.selectYear().selectByVisibleText(year);
    }

    @And("user enters Email \"(.*)\"$")
    public void email(String email) {
        reg.email().clear();
        reg.email().sendKeys(email);
    }

    @And("user enters CompanyName \"(.*)\"$")
    public void companyName(String companyName) {
        reg.companyName().clear();
        reg.companyName().sendKeys(companyName);
    }

    @And("user enters Password \"(.*)\"$")
    public void password(String password) {
        reg.password().clear();
        reg.password().sendKeys(password);
    }

    @And("user enters Confirm Password \"(.*)\"$")
    public void confirmPassword(String confirmPassword) {
        reg.confirmPassword().clear();
        reg.confirmPassword().sendKeys(confirmPassword);
    }

    @And("user clicks on register button")
    public void clickRegisterBtn() throws InterruptedException {
        Thread.sleep(3000);
        reg.clickRegisterBtn().click();
    }

    @Then("user is registered on system")
    public void registerUser() throws InterruptedException {
        List<WebElement> webElements = reg.registerMessage();
        softAssert.assertTrue(webElements.get(0).getText().equalsIgnoreCase("Your registration completed"),
                "Registration Complete");
        System.out.println(webElements.get(0).getCssValue("color"));
        softAssert.assertTrue(webElements.get(0).getCssValue("color").equals(("rgba(76, 177, 124, 1)")),"Color is green");
        softAssert.assertAll();
        Thread.sleep(3000);
        webElements.get(1).click();
    }

}
