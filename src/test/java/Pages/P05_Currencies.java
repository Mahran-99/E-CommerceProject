package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class P05_Currencies {


    public Select selectCurrency(){
        return new Select(Hooks.driver.findElement(By.id("customerCurrency")));
    }

    public List<WebElement> displayCurrency(){
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }

}
