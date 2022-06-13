@smoke
Feature: logged user could select different categories

  Scenario: user could hover on Computers category and select Desktops from its sub-categories
    Given user hovers on Computers category
    When user selects a sub-category Desktops
    Then user navigates to Desktops sub-category page