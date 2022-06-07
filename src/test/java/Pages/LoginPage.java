package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnLogin(){
        driver.findElement(By.linkText("Login")).click();
    }

    public void fillLoginData() throws InterruptedException {
        driver.findElement(By.name("")).sendKeys("Yehia");
        driver.findElement(By.name("")).sendKeys("hopaaaa");
        Thread.sleep(3000);
        driver.findElement(By.id("")).sendKeys(Keys.ENTER);
    }

    public void loginMessage() {
        Assert.assertTrue(driver.findElement(By.className("")).getText().equalsIgnoreCase(""),
                "Login Successfully");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}
