Feature: user should be able to register on the system

  Scenario: user register with valid data
    Given user navigates to registration page
    When user enters valid mandatory data
    Then user is registered on system
