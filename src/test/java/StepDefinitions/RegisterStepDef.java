package StepDefinitions;

import Pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RegisterStepDef {
    RegisterPage reg = new RegisterPage(Hooks.driver);
    @Given("user navigates to registration page")
    public void goToRegisterationPage() {
        reg.clickOnRegister();
    }

    @When("user enters valid mandatory data")
    public void validData() throws InterruptedException {
        reg.fillRegisterData();
    }

    @Then("user is registered on system")
    public void registerUser() throws InterruptedException {
       reg.registerMessage();
    }

}
