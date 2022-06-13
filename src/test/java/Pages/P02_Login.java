package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class P02_Login {

    public WebElement clickOnLogin() {
        return Hooks.driver.findElement(By.linkText("Log in"));
    }

    public List<WebElement> fillLoginData() {
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(Hooks.driver.findElement(By.name("Email")));
        webElements.add(Hooks.driver.findElement(By.name("Password")));
        return webElements;
    }

    public WebElement loginBtn() {
        return Hooks.driver.findElement(By.className("login-button"));
    }

    public WebElement loginMessage() {
        return Hooks.driver.findElement(By.linkText("My account"));
    }

    public WebElement failedLoginMessage() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]"));
    }


}
