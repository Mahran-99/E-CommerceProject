package StepDefinitions;

import Pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SD01_Register {
    RegisterPage reg = new RegisterPage(Hooks.driver);
    @Given("user navigates to registration page")
    public void goToRegisterationPage() {
        reg.clickOnRegister();
    }

    @When("user enters valid mandatory data \"(.*)\" , \"(.*)\" , \"(.*)\" , \"(.*)\" and \"(.*)\"$")
    public void validData(String firstName, String lastName, String email, String password, String confirmPassword) throws InterruptedException {
        reg.fillRegisterData(firstName, lastName, email, password, confirmPassword);
    }

    @Then("user is registered on system")
    public void registerUser() throws InterruptedException {
       reg.registerMessage();
    }

}
