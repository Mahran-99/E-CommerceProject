package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class P02_Login {
    public WebDriver driver;

    public P02_Login(WebDriver driver) {
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
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/", "Login Successfully");
        Assert.assertTrue(driver.findElement(By.linkText("My account")).isDisplayed());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
