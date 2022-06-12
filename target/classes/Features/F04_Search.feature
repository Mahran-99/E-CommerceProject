Feature: logged users could search for any product

  Background: user is logged in
    Given user navigates to login page
    When user enters valid "omar@example.com" and "P@ssw0rd"
    Then user logins successfully

  Scenario: user could search using product name
    Given user enters product name "Apple"
    When user clicks on search button
    Then user is shown search results


    # user can search for product using serial number
  Scenario: user could search using sku
    Given user enters product serial number "AP_MBP_13"
    When user clicks on search button
    Then user is shown search results