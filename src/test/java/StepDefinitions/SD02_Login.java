package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD02_Login {

    LoginPage log = new LoginPage(Hooks.driver);

    @Given("user navigates to login page")
    public void goToLoginPage() {
        log.clickOnLogin();
    }

    @When("user enters valid \"(.*)\" and \"(.*)\"$")
    public void validData(String email, String password) throws InterruptedException {
        log.fillLoginData(email, password);
    }

    @Then("user logins successfully")
    public void loginUser() {
        log.loginMessage();
    }
}
