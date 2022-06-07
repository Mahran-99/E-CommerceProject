@regression
Feature: user should be able to reset his/her password

  Background: user is logged in
    Given user navigates to login page
    When user enters valid "yehia@example.com" and "asdasd"
    Then user logins successfully

  Scenario: user resets his/her password
    Given user navigates to account settings
    When user chooses change password tab
    #User enters old password , new password and confirm password
    And user enter "asdasd" , "adadad" and "adadad"
    Then password is changed successfully