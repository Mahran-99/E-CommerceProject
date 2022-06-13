package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P04_Search {


    public WebElement search() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement clickSearchBtn() {
        return Hooks.driver.findElement(By.className("search-box-button"));
    }

    public List<WebElement> navigateToSearchResults() {
        return Hooks.driver.findElements(By.cssSelector("div[class=\"item-grid\"] div[class=\"item-box\"]"));
    }

}
