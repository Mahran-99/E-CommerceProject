Feature: user should be able to login in system

  Scenario: user should login with valid email and password
    Given user navigates to login page
    When user enters valid email amd password
    Then user logins successfully