package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnLogin() {
        driver.findElement(By.linkText("Log in")).click();
    }

    public void fillLoginData(String email, String password) throws InterruptedException {
        driver.findElement(By.name("Email")).sendKeys(email);
        driver.findElement(By.name("Password")).sendKeys(password);
        driver.findElement(By.className("login-button")).click();
    }

    public void loginMessage() {
        Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://demo.nopcommerce.com/"), "Login Successfully");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
