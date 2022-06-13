package StepDefinitions;

import Pages.P02_Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class SD02_Login {

    P02_Login log = new P02_Login();
    SoftAssert softAssert = new SoftAssert();

    @Given("user navigates to login page")
    public void goToLoginPage() {
        log.clickOnLogin().click();
    }

    @When("user enters valid \"(.*)\" and \"(.*)\"$")
    public void validData(String email, String password) {
        List<WebElement> webElements = log.fillLoginData();
        webElements.get(0).sendKeys(email);
        webElements.get(1).sendKeys(password);
    }

    @And("user press on login button")
    public void pressLoginBtn() {
        log.loginBtn().click();
    }

    @Then("user logins successfully")
    public void loginUser() {
        softAssert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/", "Login Successfully");
        softAssert.assertTrue(log.loginMessage().isDisplayed());
        softAssert.assertAll();
    }

    @When("user enters invalid \"(.*)\" and \"(.*)\"$")
    public void invalidData(String email, String password) {
        List<WebElement> webElements = log.fillLoginData();
        webElements.get(0).sendKeys(email);
        webElements.get(1).sendKeys(password);
    }

    @Then("user could not login to system")
    public void loginUserFailed() {
        System.out.println(log.failedLoginMessage().getText());
        softAssert.assertEquals(log.failedLoginMessage().getText(), "Login was unsuccessful. Please correct the errors and try again.\n" +
                        "No customer account found",
                "Login Failed");
        softAssert.assertTrue(log.failedLoginMessage().getCssValue("color").equals("rgba(228, 67, 75, 1)"),
                "Color is red");
        softAssert.assertAll();
    }
}
