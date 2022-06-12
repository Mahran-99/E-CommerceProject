package StepDefinitions;

import Pages.P03_ResetPassword;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD03_ResetPassword {

    P03_ResetPassword resetPassword = new P03_ResetPassword(Hooks.driver);

    @Given("user navigates to account settings")
    public void accessMyAccount(){
        resetPassword.clickOnMyAccount();
    }

    @When("user chooses change password tab")
    public void changePasswordTab(){
        resetPassword.changePasswordTab();
    }

    @And("user enter \"(.*)\" , \"(.*)\" and \"(.*)\"$")
    public void newPassword(String oldPassword, String newPassword, String confirmPassword){
        resetPassword.changePassword(oldPassword,newPassword,confirmPassword);
    }

    @Then("password is changed successfully")
    public void changePasswordMessage(){
        resetPassword.passwordChangedSuccessfully();
    }

}
