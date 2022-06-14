package org.example.StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P08_FollowUs;
import org.testng.Assert;

import java.util.ArrayList;

public class SD08_FollowUs {

    P08_FollowUs followUs = new P08_FollowUs();
    ArrayList<String> tabs = null;

    @When("user clicks on facebook icon")
    public void clickOnFacebookIcon() throws InterruptedException {
        Thread.sleep(2000);
        followUs.clickOnFacebook().click();
        Thread.sleep(2000);
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    }

    @Then("user is navigated to nopCommerce facebook page")
    public void goToFacebookPage() throws InterruptedException {
        System.out.println("Number of tabs opened: " + tabs.size());
        Hooks.driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce","Navigated to facebook");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
    }

    @When("user clicks on twitter icon")
    public void clickOnTwitterIcon() throws InterruptedException {
        Thread.sleep(2000);
        followUs.clickOnTwitter().click();
        Thread.sleep(2000);
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    }

    @Then("user is navigated to nopCommerce twitter page")
    public void goToTwitterPage() throws InterruptedException {
        System.out.println("Number of tabs opened: " + tabs.size());
        Hooks.driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://twitter.com/nopCommerce","Navigated to twitter");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
    }

    @When("user clicks on rss icon")
    public void clickOnRssIcon() throws InterruptedException {
        Thread.sleep(2000);
        followUs.clickOnRSS().click();
        Thread.sleep(2000);
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    }

    @Then("user is navigated to nopCommerce rss page")
    public void goToRssPage() throws InterruptedException {
        System.out.println("Number of tabs opened: " + tabs.size());
        Hooks.driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open","Navigated to rss");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
    }

    @When("user clicks on youtube icon")
    public void clickOnYoutubeIcon() throws InterruptedException {
        Thread.sleep(2000);
        followUs.clickOnYoutube().click();
        Thread.sleep(2000);
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    }

    @Then("user is navigated to nopCommerce youtube page")
    public void goToYoutubePage() throws InterruptedException {
        System.out.println("Number of tabs opened: " + tabs.size());
        Hooks.driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce","Navigated to youtube");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
    }

}
