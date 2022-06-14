@smoke
Feature: user could follow nopCommerce on different platforms

  Scenario: user can follow nopCommerce on Facebook
    When user clicks on facebook icon
    Then user is navigated to nopCommerce facebook page

  Scenario: user can follow nopCommerce on Twitter
    When user clicks on twitter icon
    Then user is navigated to nopCommerce twitter page

  Scenario: user can follow nopCommerce on RSS
    When user clicks on rss icon
    Then user is navigated to nopCommerce rss page

  Scenario: user can follow nopCommerce on Youtube
    When user clicks on youtube icon
    Then user is navigated to nopCommerce youtube page