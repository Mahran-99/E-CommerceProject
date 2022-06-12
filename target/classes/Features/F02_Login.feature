Feature: user should be able to login in system

  Scenario: user should login with valid email and password
    Given user navigates to login page
    # user enter valid email and password
    When user enters valid "omar@example.com" and "P@ssw0rd"
    Then user logins successfully