@smoke
Feature: user can add products to wishlist

  Background: user should login with valid email and password
    Given user navigates to login page
    # user enter valid email and password
    When user enters valid "omar@example.com" and "P@$$w0rd"
    And user press on login button
    Then user logins successfully

  Scenario: user adds product to wishlist
    When user clicks on heart icon of product HTC One M8 Android L 5.0 Lollipop
    Then product is added to wishlist

  Scenario: check on product in wishlist tab
    When user clicks on heart icon of product HTC One M8 Android L 5.0 Lollipop
    Then product is added to wishlist
    When user click close on message box that says product is added to your wishlist
    And user clicks on wishlist tab
    Then user checks if item is in wishlist
