package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegisterPage {
    public WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnRegister() {
        driver.findElement(By.linkText("Register")).click();
    }

    public void fillRegisterData() throws InterruptedException {
        driver.findElement(By.id("FirstName")).clear();
        driver.findElement(By.id("FirstName")).sendKeys("Omar");
        System.out.println(driver.findElement(By.id("FirstName")));

        driver.findElement(By.id("LastName")).clear();
        driver.findElement(By.id("LastName")).sendKeys("Aly");

        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys("Aly@example.com");

        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("hopaaaa");

        driver.findElement(By.id("ConfirmPassword")).clear();
        driver.findElement(By.id("ConfirmPassword")).sendKeys("hopaaaa");
        Thread.sleep(3000);
        driver.findElement(By.id("register-button")).click();

    }

    public void registerMessage() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.className("result")).getText().equalsIgnoreCase("Your registration completed"),
                "Registration Complete");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Continue")).click();
    }


}
