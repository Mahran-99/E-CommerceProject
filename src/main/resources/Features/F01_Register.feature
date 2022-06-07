@regression
Feature: user should be able to register on the system

  Scenario: user register with valid data
    Given user navigates to registration page
    # user enters valid mandatory data firstname , lastname , email , password , confirm password
    When user enters valid mandatory data "Yehia" , "Ramadan" , "yehia@example.com" , "asdasd" and "asdasd"
    Then user is registered on system
