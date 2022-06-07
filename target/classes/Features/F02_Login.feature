@regression
Feature: user should be able to login in system

  Scenario: user should login with valid email and password
    Given user navigates to login page
    # user enter valid email and password
    When user enters valid "yehia@example.com" and "asdasd"
    Then user logins successfully