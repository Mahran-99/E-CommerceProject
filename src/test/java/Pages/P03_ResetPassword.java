package Pages;


import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class P03_ResetPassword {

    public WebElement clickOnMyAccount() {
        return Hooks.driver.findElement(By.linkText("My account"));
    }

    public WebElement changePasswordTab() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[1]/div/div[2]/ul/li[7]/a"));
    }

    public List<WebElement> changePassword() {
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(Hooks.driver.findElement(By.id("OldPassword")));
        webElements.add(Hooks.driver.findElement(By.id("NewPassword")));
        webElements.add(Hooks.driver.findElement(By.id("ConfirmNewPassword")));
        webElements.add(Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/form/div[2]/button")));
        return webElements;
    }

    public WebElement passwordChangedSuccessfully() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[5]/div/p"));
    }


}
