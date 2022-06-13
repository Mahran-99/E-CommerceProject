package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P07_Sliders {

    public WebElement clickOnFirstSQ(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[1]"));
    }

    public WebElement clickOnSecondSQ(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[2]"));
    }

    public WebElement slider(){
        return Hooks.driver.findElement(By.id("nivo-slider"));
    }

}
