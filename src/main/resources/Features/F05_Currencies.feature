Feature: logged user could switch between currencies US-Euro

  Background: user is logged in
    Given user navigates to login page
    When user enters valid "omar@example.com" and "P@ssw0rd"
    Then user logins successfully

  Scenario: user selects currency
    Given user selects "Euro" from drop down menu
    Then "Euro" is selected and displayed on page