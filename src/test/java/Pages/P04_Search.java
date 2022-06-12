package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class P04_Search {

    public WebDriver driver;
    public SoftAssert softAssert = new SoftAssert();

    public P04_Search(WebDriver driver) {
        this.driver = driver;
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
        int numberOfFoundItems = driver.findElements(By.className("item-grid")).size();
        softAssert.assertTrue(numberOfFoundItems > 0, "Items have been found");
        softAssert.assertAll();
    }

}
