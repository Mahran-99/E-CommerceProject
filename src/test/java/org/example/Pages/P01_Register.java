package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class P01_Register {

    Select select;

    public WebElement clickOnRegister() {
        return Hooks.driver.findElement(By.linkText("Register"));
    }


    public WebElement gender() {
        return Hooks.driver.findElement(By.id("gender-male"));
    }

    public WebElement firstName() {
        return Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement lastName() {
        return Hooks.driver.findElement(By.id("LastName"));
    }

    public Select selectDay() {
        select = new Select(Hooks.driver.findElement(By.name("DateOfBirthDay")));
        return select;
    }

    public Select selectMonth() {
        select = new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
        return select;
    }

    public Select selectYear() {
        select = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        return select;
    }

    public WebElement email() {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement companyName() {
        return Hooks.driver.findElement(By.id("Company"));
    }

    public WebElement password() {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirmPassword() {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement clickRegisterBtn() {
        return Hooks.driver.findElement(By.id("register-button"));
    }

    public List<WebElement> registerMessage() {
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(Hooks.driver.findElement(By.className("result")));
        webElements.add(Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a")));
        return webElements;
    }


}
