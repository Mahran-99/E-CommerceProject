@smoke
Feature: user should be able to login in system

  Scenario: user should login with valid email and password
    Given user navigates to login page
    # user enter valid email and password
    When user enters valid "omar@example.com" and "P@ssw0rd"
    And user press on login button
    Then user logins successfully


  Scenario: user could login with invalid email and password
    Given user navigates to login page
    # user enter invalid email and password
    When user enters invalid "newTester@example.com" and "P@ssw0rd"
    And user press on login button
    Then user could not login to system