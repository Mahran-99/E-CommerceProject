package StepDefinitions;

import Pages.P03_ResetPassword;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SD03_ResetPassword {

    P03_ResetPassword resetPassword = new P03_ResetPassword();

    @Given("user navigates to account settings")
    public void accessMyAccount(){
        resetPassword.clickOnMyAccount().click();
    }

    @When("user chooses change password tab")
    public void changePasswordTab(){
        resetPassword.changePasswordTab().click();
    }

    @And("user enter \"(.*)\" , \"(.*)\" and \"(.*)\"$")
    public void newPassword(String oldPassword, String newPassword, String confirmPassword){
        List<WebElement> webElements = resetPassword.changePassword();
        webElements.get(0).sendKeys(oldPassword);
        webElements.get(1).sendKeys(newPassword);
        webElements.get(2).sendKeys(confirmPassword);
        webElements.get(3).click();
    }

    @Then("password is changed successfully")
    public void changePasswordMessage(){
        Assert.assertEquals(resetPassword.passwordChangedSuccessfully().getText(),
                "Password was changed",
                "Email with instructions has been sent to you");
    }

}
