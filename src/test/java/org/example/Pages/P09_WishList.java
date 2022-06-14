package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P09_WishList {

    public WebElement HeartIcon(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
    }

    public WebElement addedToWishlistMsg(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }

    public WebElement closeMsgBox(){
        return Hooks.driver.findElement(By.className("close"));
    }

    public WebElement wishlistTab(){
        return Hooks.driver.findElement(By.linkText("Wishlist"));
    }

    public WebElement wishlistQuantity(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[6]/input"));
    }

}
