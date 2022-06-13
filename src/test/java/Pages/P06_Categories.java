package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class P06_Categories {

    WebDriver driver;
    Actions actions;
    String subCategoryName;

    public P06_Categories(WebDriver driver){
        this.driver = driver;
        actions = new Actions(driver);
    }


    public void hoverOnCategory() throws InterruptedException {
        WebElement computers = driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));
        actions.moveToElement(computers).perform();
        Thread.sleep(3000);
    }

    public void selectSubCategory(){
        WebElement desktops = driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/desktops\"]"));
        subCategoryName = desktops.getText().toLowerCase().trim();
        desktops.click();
    }

    public void goToSubCategoryPage(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/desktops","Desktop Category is selected");
    }

}
