@smoke
Feature: user should be able to register on the system

  Scenario: user register with valid data
    Given user navigates to registration page
    # user chooses gender
    When user chooses male
    # user enters firstname
    And user enters FirstName "Automation"
    # user enters lastname
    And user enters LastName "Tester"
    # user enters date of birth
    And user enters DOB "10" , "March" , "1999"
    # user enters email
    And user enters Email "omar@example.com"
    # user enters company name
    And user enters CompanyName "Automation Company"
    # user enters password
    And user enters Password "P@ssw0rd"
    # user enters confirm password
    And user enters Confirm Password "P@ssw0rd"
    # user clicks on register button
    And user clicks on register button
    Then user is registered on system
