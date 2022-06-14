package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P08_FollowUs {

    public WebElement clickOnFacebook(){
        return Hooks.driver.findElement(By.linkText("Facebook"));
    }

    public WebElement clickOnTwitter(){
        return Hooks.driver.findElement(By.linkText("Twitter"));
    }

    public WebElement clickOnRSS(){
        return Hooks.driver.findElement(By.linkText("RSS"));
    }

    public WebElement clickOnYoutube(){
        return Hooks.driver.findElement(By.linkText("YouTube"));
    }

}
