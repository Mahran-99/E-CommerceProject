package StepDefinitions;

import Pages.P01_Register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SD01_Register {
    P01_Register reg = new P01_Register(Hooks.driver);

    @Given("user navigates to registration page")
    public void goToRegistrationPage() {
        reg.clickOnRegister();
    }

    @When("user chooses male")
    public void gender() {
        reg.gender();
    }

    @And("user enters FirstName \"(.*)\"$")
    public void firstName(String firstName) {
        reg.firstName(firstName);
    }

    @And("user enters LastName \"(.*)\"$")
    public void lastName(String lastName) {
        reg.lastName(lastName);
    }

    @And("user enters DOB \"(.*)\" , \"(.*)\" , \"(.*)\"$")
    public void DOB(String day, String month, String year) {
        reg.dob(day, month, year);
    }

    @And("user enters Email \"(.*)\"$")
    public void email(String email) {
        reg.email(email);
    }

    @And("user enters CompanyName \"(.*)\"$")
    public void companyName(String companyName) {
        reg.companyName(companyName);
    }

    @And("user enters Password \"(.*)\"$")
    public void password(String password) {
        reg.password(password);
    }

    @And("user enters Confirm Password \"(.*)\"$")
    public void confirmPassword(String confirmPassword) {
        reg.confirmPassword(confirmPassword);
    }

    @And("user clicks on register button")
    public void clickRegisterBTN() throws InterruptedException {
        reg.clickRegisterBtn();
    }

    @Then("user is registered on system")
    public void registerUser() throws InterruptedException {
        reg.registerMessage();
    }

}
