package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class P04_Search {

    public WebDriver driver;
    public JavascriptExecutor js;
    public SoftAssert softAssert = new SoftAssert();

    public P04_Search(WebDriver driver) {
        this.driver = driver;
        js = (JavascriptExecutor) driver;
    }

    public void search(String searchValue) {
        driver.findElement(By.id("small-searchterms")).sendKeys(searchValue);
    }

    public void clickSearchBtn() {
        driver.findElement(By.className("search-box-button")).click();
    }

    public void navigateToSearchResults() throws InterruptedException {
        Thread.sleep(3000);
        softAssert.assertTrue(driver.getCurrentUrl().contains("search"));
        int numberOfFoundItems = driver.findElements(By.cssSelector("div[class=\"item-grid\"] div[class=\"item-box\"]")).size();
        System.out.println(numberOfFoundItems);
        
        // To Scroll to element until it's viewed in page
        WebElement element = driver.findElement(By.cssSelector("div[class=\"item-grid\"] div[class=\"item-box\"]"));
        js.executeScript("arguments[0].scrollIntoView();", element);


        Thread.sleep(2000);
        softAssert.assertTrue(numberOfFoundItems > 0, "Items have been found");
        softAssert.assertAll();
    }

}
