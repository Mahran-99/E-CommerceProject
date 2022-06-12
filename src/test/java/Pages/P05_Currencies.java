package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class P05_Currencies {

    public WebDriver driver;

    public P05_Currencies(WebDriver driver){
        this.driver = driver;
    }

    public void selectCurrency(String currency){
        Select selectCurrency = new Select(driver.findElement(By.id("customerCurrency")));
        selectCurrency.selectByVisibleText(currency);
    }

    public void displayCurrency(String currency){
        Assert.assertTrue(driver.findElement(By.id("customerCurrency")).isDisplayed(),"Currency is displayed");
    }

}
