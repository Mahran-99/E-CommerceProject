@smoke
Feature: logged user could switch between currencies US-Euro

  Scenario: user selects currency
    Given user selects "Euro" from drop down menu
    Then currency is selected and displayed on the 4 products in Home page