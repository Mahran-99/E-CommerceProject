Feature: logged user could select different categories

  Background: user is logged in
    Given user navigates to login page
    When user enters valid "omar@example.com" and "P@ssw0rd"
    Then user logins successfully

  Scenario: user could hover on Computers category and select Desktops from its sub-categories
    Given user hovers on Computers category
    When user selects a sub-category Desktops
    Then user navigates to Desktops sub-category page