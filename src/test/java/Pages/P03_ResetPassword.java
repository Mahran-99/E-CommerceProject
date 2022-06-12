package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class P03_ResetPassword {
    WebDriver driver;

    public P03_ResetPassword(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnMyAccount(){
        driver.findElement(By.linkText("My account")).click();
    }

    public void changePasswordTab(){
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[1]/div/div[2]/ul/li[7]/a")).click();
    }

    public void changePassword(String oldPassword, String newPassword, String confirmPassword){
        driver.findElement(By.id("OldPassword")).sendKeys(oldPassword);
        driver.findElement(By.id("NewPassword")).sendKeys(newPassword);
        driver.findElement(By.id("ConfirmNewPassword")).sendKeys(confirmPassword);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/form/div[2]/button")).click();
    }

    public void passwordChangedSuccessfully(){
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[5]/div/p")).getText(),
                "Email with instructions has been sent to you",
                "Password Changed Successfully");
    }


}
