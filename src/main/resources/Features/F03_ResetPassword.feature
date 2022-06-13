@smoke
Feature: user should be able to reset his/her password

  Background: user is logged in
    Given user navigates to login page
    When user enters valid "automation@example.com" and "P@ssw0rd"
    And user press on login button
    Then user logins successfully

  Scenario: user resets his/her password
    Given user navigates to account settings
    When user chooses change password tab
    #User enters old password , new password and confirm password
    And user enter "P@ssw0rd" , "P@$$w0rd" and "P@$$w0rd"
    Then password is changed successfully