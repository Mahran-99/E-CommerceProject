package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {

    LoginPage log = new LoginPage(Hooks.driver);

    @Given("user navigates to login page")
    public void goToLoginPage() {
        log.clickOnLogin();
    }

    @When("user enters valid email amd password")
    public void validData() throws InterruptedException {
        log.fillLoginData();
    }

    @Then("user logins successfully")
    public void loginUser() {
        log.loginMessage();
    }
}
