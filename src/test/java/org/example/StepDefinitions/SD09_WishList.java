package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P09_WishList;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SD09_WishList {

    P09_WishList wishList = new P09_WishList();
    SoftAssert softAssert = new SoftAssert();

    @When("user clicks on heart icon of product HTC One M8 Android L 5.0 Lollipop")
    public void clickOnHeartIcon() throws InterruptedException {
        wishList.HeartIcon().click();
        Thread.sleep(3000);
    }

    @Then("product is added to wishlist")
    public void addProductToWishlist() {
        softAssert.assertEquals(wishList.addedToWishlistMsg().getText(), "The product has been added to your wishlist",
                "Product added to your wishlist");
        System.out.println("Color: " + wishList.addedToWishlistMsg().getCssValue("background-color"));
        softAssert.assertEquals(wishList.addedToWishlistMsg().getCssValue("background-color"), "rgba(75, 176, 122, 1)",
                "Background color is green");
        softAssert.assertAll();
    }

    @When("user click close on message box that says product is added to your wishlist")
    public void closeMsgBox() throws InterruptedException {
        wishList.closeMsgBox().click();
        Thread.sleep(2000);
    }

    @And("user clicks on wishlist tab")
    public void clickOnWishlistTab() throws InterruptedException {
        wishList.wishlistTab().click();
        Thread.sleep(2000);
    }

    @Then("user checks if item is in wishlist")
    public void checkQuantity() {
        int quantity = Integer.parseInt(wishList.wishlistQuantity().getAttribute("value"));
        System.out.println("Quantity: " + quantity);
        Assert.assertTrue(quantity > 0,"Item added to wishlist");
    }

}
