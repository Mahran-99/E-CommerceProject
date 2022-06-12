package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class P01_Register {
    public WebDriver driver;

    public P01_Register(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnRegister() {
        driver.findElement(By.linkText("Register")).click();
    }


    public void gender() {
        driver.findElement(By.id("gender-male")).click();
    }

    public void firstName(String firstName) {
        driver.findElement(By.id("FirstName")).clear();
        driver.findElement(By.id("FirstName")).sendKeys(firstName);
    }

    public void lastName(String lastName) {
        driver.findElement(By.id("LastName")).clear();
        driver.findElement(By.id("LastName")).sendKeys(lastName);
    }

    public void dob(String day, String month, String year) {
        Select selectDay = new Select(driver.findElement(By.name("DateOfBirthDay")));
        selectDay.selectByVisibleText(day);
        Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        selectMonth.selectByVisibleText(month);
        Select selectYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
        selectYear.selectByVisibleText(year);
    }

    public void email(String email) {
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys(email);
    }

    public void companyName(String companyName) {
        driver.findElement(By.id("Company")).clear();
        driver.findElement(By.id("Company")).sendKeys(companyName);
    }

    public void password(String pass) {
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys(pass);
    }

    public void confirmPassword(String confirmPass) {
        driver.findElement(By.id("ConfirmPassword")).clear();
        driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPass);
    }

    public void clickRegisterBtn() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("register-button")).click();
    }

    public void registerMessage() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.className("result")).getText().equalsIgnoreCase("Your registration completed"),
                "Registration Complete");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a")).click();
    }


}
